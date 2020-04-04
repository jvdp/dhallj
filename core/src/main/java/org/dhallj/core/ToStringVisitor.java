package org.dhallj.core;

import java.math.BigInteger;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import org.dhallj.core.Expr;
import org.dhallj.core.Import;
import org.dhallj.core.Operator;
import org.dhallj.core.Source;
import org.dhallj.core.Vis;
import org.dhallj.core.visitor.PureVis;

final class ToStringState {
  static final int BASE = 0;
  static final int APPLICATION = 1;
  static final int ANNOTATED = 2;
  static final int ASSERT = 2;
  static final int MERGE = 3;
  static final int TO_MAP = 3;
  static final int LAMBDA = 4;
  static final int PI = 4;
  static final int LET = 4;
  static final int IF = 5;
  static final int FIELD_ACCESS = 7;
  static final int NONE = Integer.MAX_VALUE;

  private final String text;
  private final int looseness;

  ToStringState(String text, int looseness) {
    this.text = text;
    this.looseness = looseness;
  }

  ToStringState(String text) {
    this(text, BASE);
  }

  ToStringState withText(String text) {
    return new ToStringState(text, this.looseness);
  }

  String toString(int contextLooseness) {
    if (contextLooseness >= this.looseness) {
      return this.text;
    } else {
      return String.format("(%s)", this.text);
    }
  }

  public String toString() {
    return this.toString(NONE);
  }

  private static final int baseOperatorLooseness = 4;

  static final int getOperatorLooseness(Operator operator) {
    int level = baseOperatorLooseness;

    switch (operator) {
      case COMPLETE:
        level += 1;
        ;
      case IMPORT_ALT:
        level += 1;
      case OR:
        level += 1;
      case PLUS:
        level += 1;
      case TEXT_APPEND:
        level += 1;
      case LIST_APPEND:
        level += 1;
      case AND:
        level += 1;
      case COMBINE:
        level += 1;
      case PREFER:
        level += 1;
      case COMBINE_TYPES:
        level += 1;
      case TIMES:
        level += 1;
      case EQUALS:
        level += 1;
      case NOT_EQUALS:
        level += 1;
      case EQUIVALENT:
        level += 1;
      default:
    }

    return level;
  }
}

final class ToStringVisitor extends PureVis<ToStringState> {
  public static Vis<ToStringState> instance = new ToStringVisitor();

  public ToStringState onNote(ToStringState base, Source source) {
    return base;
  }

  public ToStringState onNatural(BigInteger value) {
    return new ToStringState(value.toString());
  }

  public ToStringState onInteger(BigInteger value) {
    return new ToStringState(value.toString());
  }

  public ToStringState onDouble(double value) {
    return new ToStringState(Double.toString(value));
  }

  public ToStringState onIdentifier(String value, long index) {
    return new ToStringState((index == 0) ? value : String.format("%s@%d", value, index));
  }

  public ToStringState onLambda(String name, ToStringState type, ToStringState result) {
    return new ToStringState(
        String.format(
            "λ(%s : %s) → %s",
            name, type.toString(ToStringState.LAMBDA), result.toString(ToStringState.LAMBDA)),
        ToStringState.LAMBDA);
  }

  public ToStringState onPi(String name, ToStringState type, ToStringState result) {
    String typeString = type.toString(ToStringState.PI);
    String resultString = result.toString(ToStringState.PI);

    return new ToStringState(
        name.equals("_")
            ? String.format("%s → %s", typeString, resultString)
            : String.format("∀(%s : %s) → %s", name, typeString, resultString),
        ToStringState.PI);
  }

  public ToStringState onLet(
      String name, ToStringState type, ToStringState value, ToStringState body) {
    String typeString =
        (type == null) ? "" : String.format(": %s", type.toString(ToStringState.LET));
    return new ToStringState(
        String.format(
            "let %s%s = %s in %s",
            name, typeString, value.toString(ToStringState.LET), body.toString(ToStringState.LET)),
        ToStringState.LET);
  }

  public ToStringState onText(String[] parts, List<ToStringState> interpolated) {

    StringBuilder builder = new StringBuilder("\"");
    builder.append(parts[0]);
    int i = 1;
    Iterator<ToStringState> it = interpolated.iterator();

    while (it.hasNext()) {
      builder.append("${");
      builder.append(it.next().toString(ToStringState.NONE));
      builder.append("}");
      builder.append(parts[i++]);
    }
    if (i < parts.length) {
      builder.append(parts[i]);
    }
    builder.append("\"");
    return new ToStringState(builder.toString());
  }

  public ToStringState onNonEmptyList(List<ToStringState> values) {
    StringBuilder builder = new StringBuilder("[");
    Iterator<ToStringState> it = values.iterator();
    while (it.hasNext()) {
      builder.append(it.next().toString(ToStringState.NONE));
      if (it.hasNext()) {
        builder.append(", ");
      }
    }
    builder.append("]");

    return new ToStringState(builder.toString());
  }

  public ToStringState onEmptyList(Expr typeExpr, ToStringState type) {
    return new ToStringState(String.format("[] : %s", type), ToStringState.ANNOTATED);
  }

  public ToStringState onRecord(List<Entry<String, ToStringState>> fields) {
    if (fields.isEmpty()) {
      return new ToStringState("{=}");
    } else {
      StringBuilder builder = new StringBuilder("{");
      Iterator<Entry<String, ToStringState>> it = fields.iterator();
      while (it.hasNext()) {
        Entry<String, ToStringState> entry = it.next();
        builder.append(entry.getKey());
        builder.append(" = ");
        builder.append(entry.getValue().toString(ToStringState.NONE));
        if (it.hasNext()) {
          builder.append(", ");
        }
      }
      builder.append("}");

      return new ToStringState(builder.toString());
    }
  }

  public ToStringState onRecordType(List<Entry<String, ToStringState>> fields) {
    StringBuilder builder = new StringBuilder("{");
    Iterator<Entry<String, ToStringState>> it = fields.iterator();
    while (it.hasNext()) {
      Entry<String, ToStringState> entry = it.next();
      builder.append(entry.getKey());
      builder.append(" : ");
      builder.append(entry.getValue().toString(ToStringState.NONE));
      if (it.hasNext()) {
        builder.append(", ");
      }
    }
    builder.append("}");

    return new ToStringState(builder.toString());
  }

  public ToStringState onUnionType(List<Entry<String, ToStringState>> fields) {
    StringBuilder builder = new StringBuilder("<");
    Iterator<Entry<String, ToStringState>> it = fields.iterator();
    while (it.hasNext()) {
      Entry<String, ToStringState> entry = it.next();
      builder.append(entry.getKey());
      ToStringState type = entry.getValue();
      if (type != null) {
        builder.append(" : ");
        builder.append(type.toString());
      }
      if (it.hasNext()) {
        builder.append(" | ");
      }
    }
    builder.append(">");

    return new ToStringState(builder.toString());
  }

  public ToStringState onFieldAccess(ToStringState base, String fieldName) {
    return new ToStringState(
        String.format("%s.%s", base.toString(ToStringState.FIELD_ACCESS), fieldName),
        ToStringState.FIELD_ACCESS);
  }

  public ToStringState onProjection(ToStringState base, String[] fieldNames) {
    StringBuilder builder = new StringBuilder(base.toString(ToStringState.FIELD_ACCESS));
    builder.append(".{");
    for (int i = 0; i < fieldNames.length; i += 1) {
      builder.append(fieldNames[i]);
      if (i < fieldNames.length - 1) {
        builder.append(", ");
      }
    }
    builder.append("}");

    return new ToStringState(builder.toString(), ToStringState.FIELD_ACCESS);
  }

  public ToStringState onProjectionByType(ToStringState base, ToStringState type) {
    return new ToStringState(
        String.format(
            "%s.(%s)",
            base.toString(ToStringState.FIELD_ACCESS), type.toString(ToStringState.NONE)),
        ToStringState.FIELD_ACCESS);
  }

  public ToStringState onApplication(Expr baseExpr, ToStringState base, List<ToStringState> args) {
    StringBuilder builder = new StringBuilder(base.toString(ToStringState.APPLICATION));
    builder.append(" ");

    for (int i = 0; i < args.size(); i += 1) {
      builder.append(args.get(i).toString(ToStringState.APPLICATION));
      if (i < args.size() - 1) {
        builder.append(" ");
      }
    }

    return new ToStringState(builder.toString(), ToStringState.APPLICATION);
  }

  public ToStringState onOperatorApplication(
      Operator operator, ToStringState lhs, ToStringState rhs) {
    int operatorLooseness = ToStringState.getOperatorLooseness(operator);

    return new ToStringState(
        String.format(
            "%s %s %s", lhs.toString(operatorLooseness), operator, rhs.toString(operatorLooseness)),
        operatorLooseness);
  }

  public ToStringState onIf(
      ToStringState predicate, ToStringState thenValue, ToStringState elseValue) {
    return new ToStringState(
        String.format(
            "if %s then %s else %s",
            predicate.toString(ToStringState.IF),
            thenValue.toString(ToStringState.IF),
            elseValue.toString(ToStringState.IF)),
        ToStringState.IF);
  }

  public ToStringState onAnnotated(ToStringState base, ToStringState type) {
    return new ToStringState(
        String.format(
            "%s: %s",
            base.toString(ToStringState.ANNOTATED), type.toString(ToStringState.ANNOTATED)),
        ToStringState.ANNOTATED);
  }

  public ToStringState onAssert(ToStringState base) {
    return new ToStringState(
        String.format("assert: %s", base.toString(ToStringState.ASSERT)), ToStringState.ASSERT);
  }

  public ToStringState onMerge(ToStringState handlers, ToStringState union, ToStringState type) {
    StringBuilder builder = new StringBuilder("merge ");

    builder.append(handlers.toString(ToStringState.MERGE));
    builder.append(" ");
    builder.append(union.toString(ToStringState.MERGE));
    if (type != null) {
      builder.append(": ");
      builder.append(type.toString(ToStringState.MERGE));
    }

    return new ToStringState(builder.toString(), ToStringState.MERGE);
  }

  public ToStringState onToMap(ToStringState base, ToStringState type) {
    StringBuilder builder = new StringBuilder("toMap ");

    builder.append(base.toString(ToStringState.TO_MAP));
    if (type != null) {
      builder.append(": ");
      builder.append(type.toString(ToStringState.TO_MAP));
    }

    return new ToStringState(builder.toString(), ToStringState.TO_MAP);
  }

  public ToStringState onMissingImport(Import.Mode mode, byte[] hash) {
    StringBuilder builder = new StringBuilder("missing");

    if (hash != null) {
      builder.append(" ");
      builder.append(Expr.Util.encodeBytes(hash));
    }

    if (mode != Import.Mode.CODE) {
      builder.append(" as ");
      builder.append(mode);
    }

    return new ToStringState(builder.toString(), ToStringState.BASE);
  }

  public ToStringState onEnvImport(String value, Import.Mode mode, byte[] hash) {
    StringBuilder builder = new StringBuilder("env:");
    builder.append(value);

    if (hash != null) {
      builder.append(" ");
      builder.append(Expr.Util.encodeBytes(hash));
    }

    if (mode != Import.Mode.CODE) {
      builder.append(" as ");
      builder.append(mode);
    }

    return new ToStringState(builder.toString(), ToStringState.BASE);
  }

  public ToStringState onLocalImport(Path path, Import.Mode mode, byte[] hash) {
    StringBuilder builder = new StringBuilder(path.toString());

    if (hash != null) {
      builder.append(" ");
      builder.append(Expr.Util.encodeBytes(hash));
    }

    if (mode != Import.Mode.CODE) {
      builder.append(" as ");
      builder.append(mode);
    }

    return new ToStringState(builder.toString(), ToStringState.BASE);
  }

  public ToStringState onRemoteImport(URI url, ToStringState using, Import.Mode mode, byte[] hash) {
    StringBuilder builder = new StringBuilder(url.toString());

    if (using != null) {
      builder.append(" using ");
      builder.append(using.toString(ToStringState.BASE));
    }

    if (hash != null) {
      builder.append(" ");
      builder.append(Expr.Util.encodeBytes(hash));
    }

    if (mode != Import.Mode.CODE) {
      builder.append(" as ");
      builder.append(mode);
    }

    return new ToStringState(builder.toString(), ToStringState.BASE);
  }
}