package org.dhallj.prelude;

import java.math.BigInteger;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import org.dhallj.core.Expr;
import org.dhallj.core.Operator;

public final class Prelude {
  private static final Expr f000000 = Expr.makeBuiltIn("List/fold");
  private static final Expr f000001 = Expr.makeBuiltIn("Bool");
  private static final Expr f000002 = Expr.makeIdentifier("_", 0);
  private static final Expr f000003 = Expr.makeIdentifier("_", 1);
  private static final Expr f000004 = Expr.makeOperatorApplication(Operator.AND, f000003, f000002);
  private static final Expr f000005 = Expr.makeLambda("_", f000001, f000004);
  private static final Expr f000006 = Expr.makeLambda("_", f000001, f000005);
  private static final Expr f000007 = Expr.Constants.TRUE;
  private static final Expr f000008 =
      Expr.makeApplication(f000000, new Expr[] {f000001, f000002, f000001, f000006, f000007});
  private static final Expr f000009 = Expr.Constants.LIST;
  private static final Expr f000010 = Expr.makeApplication(f000009, new Expr[] {f000001});
  private static final Expr f000011 = Expr.makeLambda("_", f000010, f000008);
  private static final Expr f000012 = Expr.Constants.FALSE;
  private static final Expr f000013 =
      Expr.makeApplication(f000002, new Expr[] {f000001, f000007, f000012});
  private static final Expr f000014 = Expr.makeIdentifier("_", 2);
  private static final Expr f000015 = Expr.makePi("_", f000003, f000014);
  private static final Expr f000016 = Expr.makePi("_", f000002, f000015);
  private static final Expr f000017 = Expr.Constants.TYPE;
  private static final Expr f000018 = Expr.makePi("_", f000017, f000016);
  private static final Expr f000019 = Expr.makeLambda("_", f000018, f000013);
  private static final Expr f000020 =
      Expr.makeOperatorApplication(Operator.EQUALS, f000003, f000002);
  private static final Expr f000021 = Expr.makeLambda("_", f000001, f000020);
  private static final Expr f000022 = Expr.makeLambda("_", f000001, f000021);
  private static final Expr f000023 =
      Expr.makeApplication(f000000, new Expr[] {f000001, f000002, f000001, f000022, f000007});
  private static final Expr f000024 = Expr.makeLambda("_", f000010, f000023);
  private static final Expr f000025 = Expr.makeIdentifier("_", 3);
  private static final Expr f000026 = Expr.makeIf(f000025, f000003, f000002);
  private static final Expr f000027 = Expr.makeLambda("_", f000003, f000026);
  private static final Expr f000028 = Expr.makeLambda("_", f000002, f000027);
  private static final Expr f000029 = Expr.makeLambda("_", f000017, f000028);
  private static final Expr f000030 = Expr.makeLambda("_", f000001, f000029);
  private static final Expr f000031 =
      Expr.makeOperatorApplication(Operator.EQUALS, f000002, f000012);
  private static final Expr f000032 = Expr.makeLambda("_", f000001, f000031);
  private static final Expr f000033 =
      Expr.makeOperatorApplication(Operator.NOT_EQUALS, f000003, f000002);
  private static final Expr f000034 = Expr.makeLambda("_", f000001, f000033);
  private static final Expr f000035 = Expr.makeLambda("_", f000001, f000034);
  private static final Expr f000036 =
      Expr.makeApplication(f000000, new Expr[] {f000001, f000002, f000001, f000035, f000012});
  private static final Expr f000037 = Expr.makeLambda("_", f000010, f000036);
  private static final Expr f000038 = Expr.makeOperatorApplication(Operator.OR, f000003, f000002);
  private static final Expr f000039 = Expr.makeLambda("_", f000001, f000038);
  private static final Expr f000040 = Expr.makeLambda("_", f000001, f000039);
  private static final Expr f000041 =
      Expr.makeApplication(f000000, new Expr[] {f000001, f000002, f000001, f000040, f000012});
  private static final Expr f000042 = Expr.makeLambda("_", f000010, f000041);
  private static final Expr f000043 = Expr.makeTextLiteral("True");
  private static final Expr f000044 = Expr.makeTextLiteral("False");
  private static final Expr f000045 = Expr.makeIf(f000002, f000043, f000044);
  private static final Expr f000046 = Expr.makeLambda("_", f000001, f000045);
  private static final Expr f000047 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("and", f000011),
            new SimpleImmutableEntry<String, Expr>("build", f000019),
            new SimpleImmutableEntry<String, Expr>("even", f000024),
            new SimpleImmutableEntry<String, Expr>("fold", f000030),
            new SimpleImmutableEntry<String, Expr>("not", f000032),
            new SimpleImmutableEntry<String, Expr>("odd", f000037),
            new SimpleImmutableEntry<String, Expr>("or", f000042),
            new SimpleImmutableEntry<String, Expr>("show", f000046)
          });
  private static final Expr f000048 = Expr.makeBuiltIn("Double/show");
  private static final Expr f000049 =
      Expr.makeRecordLiteral(new Entry[] {new SimpleImmutableEntry<String, Expr>("show", f000048)});
  private static final Expr f000050 = Expr.makeApplication(f000014, new Expr[] {f000002});
  private static final Expr f000051 = Expr.makeApplication(f000003, new Expr[] {f000050});
  private static final Expr f000052 = Expr.makeIdentifier("_", 4);
  private static final Expr f000053 = Expr.makeLambda("_", f000052, f000051);
  private static final Expr f000054 = Expr.makePi("_", f000014, f000014);
  private static final Expr f000055 = Expr.makeLambda("_", f000054, f000053);
  private static final Expr f000056 = Expr.makeLambda("_", f000054, f000055);
  private static final Expr f000057 = Expr.makeLambda("_", f000017, f000056);
  private static final Expr f000058 = Expr.makeLambda("_", f000017, f000057);
  private static final Expr f000059 = Expr.makeLambda("_", f000017, f000058);
  private static final Expr f000060 = Expr.makeLambda("_", f000002, f000002);
  private static final Expr f000061 = Expr.makeLambda("_", f000017, f000060);
  private static final Expr f000062 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("compose", f000059),
            new SimpleImmutableEntry<String, Expr>("identity", f000061)
          });
  private static final Expr f000063 = Expr.makeBuiltIn("Natural/isZero");
  private static final Expr f000064 = Expr.makeBuiltIn("Integer/clamp");
  private static final Expr f000065 = Expr.makeApplication(f000064, new Expr[] {f000002});
  private static final Expr f000066 = Expr.makeApplication(f000063, new Expr[] {f000065});
  private static final Expr f000067 = Expr.makeBuiltIn("Integer/negate");
  private static final Expr f000068 = Expr.makeApplication(f000067, new Expr[] {f000002});
  private static final Expr f000069 = Expr.makeApplication(f000064, new Expr[] {f000068});
  private static final Expr f000070 = Expr.makeIf(f000066, f000069, f000065);
  private static final Expr f000071 = Expr.Constants.INTEGER;
  private static final Expr f000072 = Expr.makeLambda("_", f000071, f000070);
  private static final Expr f000073 = Expr.makeApplication(f000067, new Expr[] {f000003});
  private static final Expr f000074 = Expr.makeApplication(f000064, new Expr[] {f000073});
  private static final Expr f000075 = Expr.makeApplication(f000063, new Expr[] {f000074});
  private static final Expr f000076 = Expr.makeBuiltIn("Natural/subtract");
  private static final Expr f000077 = Expr.makeApplication(f000067, new Expr[] {f000073});
  private static final Expr f000078 = Expr.makeApplication(f000064, new Expr[] {f000077});
  private static final Expr f000079 = Expr.makeApplication(f000076, new Expr[] {f000069, f000078});
  private static final Expr f000080 = Expr.makeApplication(f000063, new Expr[] {f000079});
  private static final Expr f000081 = Expr.makeBuiltIn("Natural/toInteger");
  private static final Expr f000082 = Expr.makeApplication(f000076, new Expr[] {f000078, f000069});
  private static final Expr f000083 = Expr.makeApplication(f000081, new Expr[] {f000082});
  private static final Expr f000084 = Expr.makeApplication(f000067, new Expr[] {f000083});
  private static final Expr f000085 = Expr.makeApplication(f000081, new Expr[] {f000079});
  private static final Expr f000086 = Expr.makeIf(f000080, f000084, f000085);
  private static final Expr f000087 = Expr.makeOperatorApplication(Operator.PLUS, f000078, f000065);
  private static final Expr f000088 = Expr.makeApplication(f000081, new Expr[] {f000087});
  private static final Expr f000089 = Expr.makeIf(f000066, f000086, f000088);
  private static final Expr f000090 = Expr.makeOperatorApplication(Operator.PLUS, f000074, f000069);
  private static final Expr f000091 = Expr.makeApplication(f000081, new Expr[] {f000090});
  private static final Expr f000092 = Expr.makeApplication(f000067, new Expr[] {f000091});
  private static final Expr f000093 = Expr.makeApplication(f000076, new Expr[] {f000074, f000065});
  private static final Expr f000094 = Expr.makeApplication(f000063, new Expr[] {f000093});
  private static final Expr f000095 = Expr.makeApplication(f000076, new Expr[] {f000065, f000074});
  private static final Expr f000096 = Expr.makeApplication(f000081, new Expr[] {f000095});
  private static final Expr f000097 = Expr.makeApplication(f000067, new Expr[] {f000096});
  private static final Expr f000098 = Expr.makeApplication(f000081, new Expr[] {f000093});
  private static final Expr f000099 = Expr.makeIf(f000094, f000097, f000098);
  private static final Expr f000100 = Expr.makeIf(f000066, f000092, f000099);
  private static final Expr f000101 = Expr.makeIf(f000075, f000089, f000100);
  private static final Expr f000102 = Expr.makeLambda("_", f000071, f000101);
  private static final Expr f000103 = Expr.makeLambda("_", f000071, f000102);
  private static final Expr f000104 = Expr.makeApplication(f000064, new Expr[] {f000003});
  private static final Expr f000105 = Expr.makeApplication(f000076, new Expr[] {f000065, f000104});
  private static final Expr f000106 = Expr.makeApplication(f000063, new Expr[] {f000105});
  private static final Expr f000107 = Expr.makeApplication(f000076, new Expr[] {f000104, f000065});
  private static final Expr f000108 = Expr.makeApplication(f000063, new Expr[] {f000107});
  private static final Expr f000109 = Expr.makeOperatorApplication(Operator.AND, f000106, f000108);
  private static final Expr f000110 = Expr.makeApplication(f000076, new Expr[] {f000069, f000074});
  private static final Expr f000111 = Expr.makeApplication(f000063, new Expr[] {f000110});
  private static final Expr f000112 = Expr.makeApplication(f000076, new Expr[] {f000074, f000069});
  private static final Expr f000113 = Expr.makeApplication(f000063, new Expr[] {f000112});
  private static final Expr f000114 = Expr.makeOperatorApplication(Operator.AND, f000111, f000113);
  private static final Expr f000115 = Expr.makeOperatorApplication(Operator.AND, f000109, f000114);
  private static final Expr f000116 = Expr.makeLambda("_", f000071, f000115);
  private static final Expr f000117 = Expr.makeLambda("_", f000071, f000116);
  private static final Expr f000118 = Expr.makeApplication(f000063, new Expr[] {f000104});
  private static final Expr f000119 = Expr.makeApplication(f000063, new Expr[] {f000069});
  private static final Expr f000120 = Expr.makeOperatorApplication(Operator.OR, f000119, f000113);
  private static final Expr f000121 = Expr.makeIf(f000118, f000120, f000106);
  private static final Expr f000122 =
      Expr.makeOperatorApplication(Operator.EQUALS, f000121, f000012);
  private static final Expr f000123 = Expr.makeLambda("_", f000071, f000122);
  private static final Expr f000124 = Expr.makeLambda("_", f000071, f000123);
  private static final Expr f000125 = Expr.makeOperatorApplication(Operator.OR, f000075, f000111);
  private static final Expr f000126 = Expr.makeIf(f000066, f000125, f000108);
  private static final Expr f000127 = Expr.makeLambda("_", f000071, f000126);
  private static final Expr f000128 = Expr.makeLambda("_", f000071, f000127);
  private static final Expr f000129 =
      Expr.makeOperatorApplication(Operator.EQUALS, f000126, f000012);
  private static final Expr f000130 = Expr.makeLambda("_", f000071, f000129);
  private static final Expr f000131 = Expr.makeLambda("_", f000071, f000130);
  private static final Expr f000132 = Expr.makeLambda("_", f000071, f000121);
  private static final Expr f000133 = Expr.makeLambda("_", f000071, f000132);
  private static final Expr f000134 =
      Expr.makeOperatorApplication(Operator.TIMES, f000074, f000069);
  private static final Expr f000135 = Expr.makeApplication(f000081, new Expr[] {f000134});
  private static final Expr f000136 =
      Expr.makeOperatorApplication(Operator.TIMES, f000074, f000065);
  private static final Expr f000137 = Expr.makeApplication(f000081, new Expr[] {f000136});
  private static final Expr f000138 = Expr.makeApplication(f000067, new Expr[] {f000137});
  private static final Expr f000139 = Expr.makeIf(f000066, f000135, f000138);
  private static final Expr f000140 =
      Expr.makeOperatorApplication(Operator.TIMES, f000104, f000069);
  private static final Expr f000141 = Expr.makeApplication(f000081, new Expr[] {f000140});
  private static final Expr f000142 = Expr.makeApplication(f000067, new Expr[] {f000141});
  private static final Expr f000143 =
      Expr.makeOperatorApplication(Operator.TIMES, f000104, f000065);
  private static final Expr f000144 = Expr.makeApplication(f000081, new Expr[] {f000143});
  private static final Expr f000145 = Expr.makeIf(f000066, f000142, f000144);
  private static final Expr f000146 = Expr.makeIf(f000118, f000139, f000145);
  private static final Expr f000147 = Expr.makeLambda("_", f000071, f000146);
  private static final Expr f000148 = Expr.makeLambda("_", f000071, f000147);
  private static final Expr f000149 =
      Expr.makeOperatorApplication(Operator.EQUALS, f000119, f000012);
  private static final Expr f000150 = Expr.makeLambda("_", f000071, f000149);
  private static final Expr f000151 = Expr.makeLambda("_", f000071, f000119);
  private static final Expr f000152 = Expr.makeLambda("_", f000071, f000066);
  private static final Expr f000153 =
      Expr.makeOperatorApplication(Operator.EQUALS, f000066, f000012);
  private static final Expr f000154 = Expr.makeLambda("_", f000071, f000153);
  private static final Expr f000155 = Expr.makeBuiltIn("Integer/show");
  private static final Expr f000156 = Expr.makeApplication(f000081, new Expr[] {f000112});
  private static final Expr f000157 = Expr.makeApplication(f000067, new Expr[] {f000156});
  private static final Expr f000158 = Expr.makeApplication(f000081, new Expr[] {f000110});
  private static final Expr f000159 = Expr.makeIf(f000111, f000157, f000158);
  private static final Expr f000160 = Expr.makeOperatorApplication(Operator.PLUS, f000074, f000065);
  private static final Expr f000161 = Expr.makeApplication(f000081, new Expr[] {f000160});
  private static final Expr f000162 = Expr.makeIf(f000066, f000159, f000161);
  private static final Expr f000163 = Expr.makeOperatorApplication(Operator.PLUS, f000104, f000069);
  private static final Expr f000164 = Expr.makeApplication(f000081, new Expr[] {f000163});
  private static final Expr f000165 = Expr.makeApplication(f000067, new Expr[] {f000164});
  private static final Expr f000166 = Expr.makeApplication(f000081, new Expr[] {f000105});
  private static final Expr f000167 = Expr.makeApplication(f000067, new Expr[] {f000166});
  private static final Expr f000168 = Expr.makeApplication(f000081, new Expr[] {f000107});
  private static final Expr f000169 = Expr.makeIf(f000108, f000167, f000168);
  private static final Expr f000170 = Expr.makeIf(f000066, f000165, f000169);
  private static final Expr f000171 = Expr.makeIf(f000118, f000162, f000170);
  private static final Expr f000172 = Expr.makeLambda("_", f000071, f000171);
  private static final Expr f000173 = Expr.makeLambda("_", f000071, f000172);
  private static final Expr f000174 = Expr.makeBuiltIn("Integer/toDouble");
  private static final Expr f000175 = Expr.makeBuiltIn("Some");
  private static final Expr f000176 = Expr.makeApplication(f000175, new Expr[] {f000065});
  private static final Expr f000177 = Expr.makeBuiltIn("None");
  private static final Expr f000178 = Expr.Constants.NATURAL;
  private static final Expr f000179 = Expr.makeApplication(f000177, new Expr[] {f000178});
  private static final Expr f000180 = Expr.makeIf(f000119, f000176, f000179);
  private static final Expr f000181 = Expr.makeLambda("_", f000071, f000180);
  private static final Expr f000182 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("abs", f000072),
            new SimpleImmutableEntry<String, Expr>("add", f000103),
            new SimpleImmutableEntry<String, Expr>("clamp", f000064),
            new SimpleImmutableEntry<String, Expr>("equal", f000117),
            new SimpleImmutableEntry<String, Expr>("greaterThan", f000124),
            new SimpleImmutableEntry<String, Expr>("greaterThanEqual", f000128),
            new SimpleImmutableEntry<String, Expr>("lessThan", f000131),
            new SimpleImmutableEntry<String, Expr>("lessThanEqual", f000133),
            new SimpleImmutableEntry<String, Expr>("multiply", f000148),
            new SimpleImmutableEntry<String, Expr>("negate", f000067),
            new SimpleImmutableEntry<String, Expr>("negative", f000150),
            new SimpleImmutableEntry<String, Expr>("nonNegative", f000151),
            new SimpleImmutableEntry<String, Expr>("nonPositive", f000152),
            new SimpleImmutableEntry<String, Expr>("positive", f000154),
            new SimpleImmutableEntry<String, Expr>("show", f000155),
            new SimpleImmutableEntry<String, Expr>("subtract", f000173),
            new SimpleImmutableEntry<String, Expr>("toDouble", f000174),
            new SimpleImmutableEntry<String, Expr>("toNatural", f000181)
          });
  private static final Expr f000183 = Expr.Constants.TEXT;
  private static final Expr f000184 =
      Expr.makeUnionType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("Inline", null),
            new SimpleImmutableEntry<String, Expr>("Nested", f000183)
          });
  private static final Expr f000185 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("contents", f000002),
            new SimpleImmutableEntry<String, Expr>("field", f000183),
            new SimpleImmutableEntry<String, Expr>("nesting", f000184)
          });
  private static final Expr f000186 = Expr.makeLambda("_", f000017, f000185);
  private static final Expr f000187 = Expr.makeApplication(f000009, new Expr[] {f000002});
  private static final Expr f000188 = Expr.makePi("_", f000187, f000003);
  private static final Expr f000189 = Expr.makePi("_", f000001, f000003);
  private static final Expr f000190 = Expr.Constants.DOUBLE;
  private static final Expr f000191 = Expr.makePi("_", f000190, f000003);
  private static final Expr f000192 = Expr.makePi("_", f000071, f000003);
  private static final Expr f000193 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("mapKey", f000183),
            new SimpleImmutableEntry<String, Expr>("mapValue", f000002)
          });
  private static final Expr f000194 = Expr.makeApplication(f000009, new Expr[] {f000193});
  private static final Expr f000195 = Expr.makePi("_", f000194, f000003);
  private static final Expr f000196 = Expr.makePi("_", f000183, f000003);
  private static final Expr f000197 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("array", f000188),
            new SimpleImmutableEntry<String, Expr>("bool", f000189),
            new SimpleImmutableEntry<String, Expr>("double", f000191),
            new SimpleImmutableEntry<String, Expr>("integer", f000192),
            new SimpleImmutableEntry<String, Expr>("null", f000002),
            new SimpleImmutableEntry<String, Expr>("object", f000195),
            new SimpleImmutableEntry<String, Expr>("string", f000196)
          });
  private static final Expr f000198 = Expr.makePi("_", f000197, f000003);
  private static final Expr f000199 = Expr.makePi("_", f000017, f000198);
  private static final Expr f000200 = Expr.makeFieldAccess(f000002, "array");
  private static final Expr f000201 = Expr.makeApplication(f000009, new Expr[] {f000003});
  private static final Expr f000202 = Expr.makeApplication(f000003, new Expr[] {f000025, f000014});
  private static final Expr f000203 = Expr.makeNonEmptyListLiteral(new Expr[] {f000202});
  private static final Expr f000204 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000203, f000002);
  private static final Expr f000205 = Expr.makeApplication(f000009, new Expr[] {f000014});
  private static final Expr f000206 = Expr.makeLambda("_", f000205, f000204);
  private static final Expr f000207 = Expr.makeLambda("_", f000199, f000206);
  private static final Expr f000208 = Expr.makeEmptyListLiteral(f000201);
  private static final Expr f000209 =
      Expr.makeApplication(f000000, new Expr[] {f000199, f000014, f000201, f000207, f000208});
  private static final Expr f000210 = Expr.makeApplication(f000200, new Expr[] {f000209});
  private static final Expr f000211 = Expr.makeLambda("_", f000197, f000210);
  private static final Expr f000212 = Expr.makeLambda("_", f000017, f000211);
  private static final Expr f000213 = Expr.makeApplication(f000009, new Expr[] {f000199});
  private static final Expr f000214 = Expr.makeLambda("_", f000213, f000212);
  private static final Expr f000215 = Expr.makeFieldAccess(f000002, "bool");
  private static final Expr f000216 = Expr.makeApplication(f000215, new Expr[] {f000014});
  private static final Expr f000217 = Expr.makeLambda("_", f000197, f000216);
  private static final Expr f000218 = Expr.makeLambda("_", f000017, f000217);
  private static final Expr f000219 = Expr.makeLambda("_", f000001, f000218);
  private static final Expr f000220 = Expr.makeFieldAccess(f000002, "double");
  private static final Expr f000221 = Expr.makeApplication(f000220, new Expr[] {f000014});
  private static final Expr f000222 = Expr.makeLambda("_", f000197, f000221);
  private static final Expr f000223 = Expr.makeLambda("_", f000017, f000222);
  private static final Expr f000224 = Expr.makeLambda("_", f000190, f000223);
  private static final Expr f000225 = Expr.makeFieldAccess(f000002, "integer");
  private static final Expr f000226 = Expr.makeApplication(f000225, new Expr[] {f000014});
  private static final Expr f000227 = Expr.makeLambda("_", f000197, f000226);
  private static final Expr f000228 = Expr.makeLambda("_", f000017, f000227);
  private static final Expr f000229 = Expr.makeLambda("_", f000071, f000228);
  private static final Expr f000230 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("mapKey", f000003),
            new SimpleImmutableEntry<String, Expr>("mapValue", f000002)
          });
  private static final Expr f000231 = Expr.makeLambda("_", f000183, f000230);
  private static final Expr f000232 = Expr.makeLambda("_", f000183, f000231);
  private static final Expr f000233 = Expr.makeLambda("_", f000003, f000230);
  private static final Expr f000234 = Expr.makeLambda("_", f000183, f000233);
  private static final Expr f000235 = Expr.makeLambda("_", f000017, f000234);
  private static final Expr f000236 = Expr.makeApplication(f000081, new Expr[] {f000014});
  private static final Expr f000237 = Expr.makeApplication(f000225, new Expr[] {f000236});
  private static final Expr f000238 = Expr.makeLambda("_", f000197, f000237);
  private static final Expr f000239 = Expr.makeLambda("_", f000017, f000238);
  private static final Expr f000240 = Expr.makeLambda("_", f000178, f000239);
  private static final Expr f000241 = Expr.makeFieldAccess(f000002, "null");
  private static final Expr f000242 = Expr.makeLambda("_", f000197, f000241);
  private static final Expr f000243 = Expr.makeLambda("_", f000017, f000242);
  private static final Expr f000244 = Expr.makeFieldAccess(f000002, "object");
  private static final Expr f000245 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("mapKey", f000183),
            new SimpleImmutableEntry<String, Expr>("mapValue", f000199)
          });
  private static final Expr f000246 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("mapKey", f000183),
            new SimpleImmutableEntry<String, Expr>("mapValue", f000003)
          });
  private static final Expr f000247 = Expr.makeApplication(f000009, new Expr[] {f000246});
  private static final Expr f000248 = Expr.makeFieldAccess(f000003, "mapKey");
  private static final Expr f000249 = Expr.makeFieldAccess(f000003, "mapValue");
  private static final Expr f000250 = Expr.makeApplication(f000249, new Expr[] {f000025, f000014});
  private static final Expr f000251 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("mapKey", f000248),
            new SimpleImmutableEntry<String, Expr>("mapValue", f000250)
          });
  private static final Expr f000252 = Expr.makeNonEmptyListLiteral(new Expr[] {f000251});
  private static final Expr f000253 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000252, f000002);
  private static final Expr f000254 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("mapKey", f000183),
            new SimpleImmutableEntry<String, Expr>("mapValue", f000014)
          });
  private static final Expr f000255 = Expr.makeApplication(f000009, new Expr[] {f000254});
  private static final Expr f000256 = Expr.makeLambda("_", f000255, f000253);
  private static final Expr f000257 = Expr.makeLambda("_", f000245, f000256);
  private static final Expr f000258 = Expr.makeEmptyListLiteral(f000247);
  private static final Expr f000259 =
      Expr.makeApplication(f000000, new Expr[] {f000245, f000014, f000247, f000257, f000258});
  private static final Expr f000260 = Expr.makeApplication(f000244, new Expr[] {f000259});
  private static final Expr f000261 = Expr.makeLambda("_", f000197, f000260);
  private static final Expr f000262 = Expr.makeLambda("_", f000017, f000261);
  private static final Expr f000263 = Expr.makeApplication(f000009, new Expr[] {f000245});
  private static final Expr f000264 = Expr.makeLambda("_", f000263, f000262);
  private static final Expr f000265 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("isNull", f000001),
            new SimpleImmutableEntry<String, Expr>("value", f000003)
          });
  private static final Expr f000266 = Expr.makeFieldAccess(f000003, "array");
  private static final Expr f000267 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("isNull", f000001),
            new SimpleImmutableEntry<String, Expr>("value", f000014)
          });
  private static final Expr f000268 = Expr.makeFieldAccess(f000003, "value");
  private static final Expr f000269 = Expr.makeNonEmptyListLiteral(new Expr[] {f000268});
  private static final Expr f000270 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000269, f000002);
  private static final Expr f000271 = Expr.makeApplication(f000009, new Expr[] {f000025});
  private static final Expr f000272 = Expr.makeLambda("_", f000271, f000270);
  private static final Expr f000273 = Expr.makeLambda("_", f000267, f000272);
  private static final Expr f000274 = Expr.makeEmptyListLiteral(f000205);
  private static final Expr f000275 =
      Expr.makeApplication(f000000, new Expr[] {f000267, f000002, f000205, f000273, f000274});
  private static final Expr f000276 = Expr.makeApplication(f000266, new Expr[] {f000275});
  private static final Expr f000277 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("isNull", f000012),
            new SimpleImmutableEntry<String, Expr>("value", f000276)
          });
  private static final Expr f000278 = Expr.makeApplication(f000009, new Expr[] {f000265});
  private static final Expr f000279 = Expr.makeLambda("_", f000278, f000277);
  private static final Expr f000280 = Expr.makeFieldAccess(f000003, "bool");
  private static final Expr f000281 = Expr.makeApplication(f000280, new Expr[] {f000002});
  private static final Expr f000282 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("isNull", f000012),
            new SimpleImmutableEntry<String, Expr>("value", f000281)
          });
  private static final Expr f000283 = Expr.makeLambda("_", f000001, f000282);
  private static final Expr f000284 = Expr.makeFieldAccess(f000003, "double");
  private static final Expr f000285 = Expr.makeApplication(f000284, new Expr[] {f000002});
  private static final Expr f000286 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("isNull", f000012),
            new SimpleImmutableEntry<String, Expr>("value", f000285)
          });
  private static final Expr f000287 = Expr.makeLambda("_", f000190, f000286);
  private static final Expr f000288 = Expr.makeFieldAccess(f000003, "integer");
  private static final Expr f000289 = Expr.makeApplication(f000288, new Expr[] {f000002});
  private static final Expr f000290 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("isNull", f000012),
            new SimpleImmutableEntry<String, Expr>("value", f000289)
          });
  private static final Expr f000291 = Expr.makeLambda("_", f000071, f000290);
  private static final Expr f000292 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("isNull", f000007),
            new SimpleImmutableEntry<String, Expr>("value", f000241)
          });
  private static final Expr f000293 = Expr.makeFieldAccess(f000003, "object");
  private static final Expr f000294 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("mapKey", f000183),
            new SimpleImmutableEntry<String, Expr>("mapValue", f000267)
          });
  private static final Expr f000295 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("mapKey", f000183),
            new SimpleImmutableEntry<String, Expr>("mapValue", f000025)
          });
  private static final Expr f000296 = Expr.makeFieldAccess(f000002, "mapValue");
  private static final Expr f000297 = Expr.makeFieldAccess(f000296, "isNull");
  private static final Expr f000298 = Expr.makeApplication(f000009, new Expr[] {f000295});
  private static final Expr f000299 = Expr.makeEmptyListLiteral(f000298);
  private static final Expr f000300 = Expr.makeProjection(f000002, new String[] {"mapKey"});
  private static final Expr f000301 = Expr.makeFieldAccess(f000296, "value");
  private static final Expr f000302 =
      Expr.makeRecordLiteral(
          new Entry[] {new SimpleImmutableEntry<String, Expr>("mapValue", f000301)});
  private static final Expr f000303 =
      Expr.makeOperatorApplication(Operator.COMBINE, f000300, f000302);
  private static final Expr f000304 = Expr.makeNonEmptyListLiteral(new Expr[] {f000303});
  private static final Expr f000305 = Expr.makeIf(f000297, f000299, f000304);
  private static final Expr f000306 = Expr.makeNonEmptyListLiteral(new Expr[] {f000003});
  private static final Expr f000307 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000306, f000002);
  private static final Expr f000308 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("mapKey", f000183),
            new SimpleImmutableEntry<String, Expr>("mapValue", f000052)
          });
  private static final Expr f000309 = Expr.makeApplication(f000009, new Expr[] {f000308});
  private static final Expr f000310 = Expr.makeLambda("_", f000309, f000307);
  private static final Expr f000311 = Expr.makeLambda("_", f000295, f000310);
  private static final Expr f000312 =
      Expr.makeApplication(f000000, new Expr[] {f000295, f000305, f000298, f000311});
  private static final Expr f000313 = Expr.makeLambda("_", f000294, f000312);
  private static final Expr f000314 = Expr.makeEmptyListLiteral(f000255);
  private static final Expr f000315 =
      Expr.makeApplication(f000000, new Expr[] {f000294, f000002, f000255, f000313, f000314});
  private static final Expr f000316 = Expr.makeApplication(f000293, new Expr[] {f000315});
  private static final Expr f000317 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("isNull", f000012),
            new SimpleImmutableEntry<String, Expr>("value", f000316)
          });
  private static final Expr f000318 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("mapKey", f000183),
            new SimpleImmutableEntry<String, Expr>("mapValue", f000265)
          });
  private static final Expr f000319 = Expr.makeApplication(f000009, new Expr[] {f000318});
  private static final Expr f000320 = Expr.makeLambda("_", f000319, f000317);
  private static final Expr f000321 = Expr.makeFieldAccess(f000003, "string");
  private static final Expr f000322 = Expr.makeApplication(f000321, new Expr[] {f000002});
  private static final Expr f000323 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("isNull", f000012),
            new SimpleImmutableEntry<String, Expr>("value", f000322)
          });
  private static final Expr f000324 = Expr.makeLambda("_", f000183, f000323);
  private static final Expr f000325 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("array", f000279),
            new SimpleImmutableEntry<String, Expr>("bool", f000283),
            new SimpleImmutableEntry<String, Expr>("double", f000287),
            new SimpleImmutableEntry<String, Expr>("integer", f000291),
            new SimpleImmutableEntry<String, Expr>("null", f000292),
            new SimpleImmutableEntry<String, Expr>("object", f000320),
            new SimpleImmutableEntry<String, Expr>("string", f000324)
          });
  private static final Expr f000326 = Expr.makeApplication(f000014, new Expr[] {f000265, f000325});
  private static final Expr f000327 = Expr.makeFieldAccess(f000326, "value");
  private static final Expr f000328 = Expr.makeLambda("_", f000197, f000327);
  private static final Expr f000329 = Expr.makeLambda("_", f000017, f000328);
  private static final Expr f000330 = Expr.makeLambda("_", f000199, f000329);
  private static final Expr f000331 = Expr.makeApplication(f000009, new Expr[] {f000183});
  private static final Expr f000332 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("head", f000183),
            new SimpleImmutableEntry<String, Expr>("tail", f000331)
          });
  private static final Expr f000333 = Expr.makeLambda("_", f000332, f000002);
  private static final Expr f000334 = Expr.makeEmptyListLiteral(f000331);
  private static final Expr f000335 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("head", f000002),
            new SimpleImmutableEntry<String, Expr>("tail", f000334)
          });
  private static final Expr f000336 = Expr.makeLambda("_", f000183, f000335);
  private static final Expr f000337 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("Complex", f000333),
            new SimpleImmutableEntry<String, Expr>("Simple", f000336)
          });
  private static final Expr f000338 =
      Expr.makeUnionType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("Complex", f000332),
            new SimpleImmutableEntry<String, Expr>("Simple", f000183)
          });
  private static final Expr f000339 = Expr.makeFieldAccess(f000338, "Simple");
  private static final Expr f000340 = Expr.makeTextLiteral("[]");
  private static final Expr f000341 = Expr.makeApplication(f000339, new Expr[] {f000340});
  private static final Expr f000342 = Expr.makeFieldAccess(f000338, "Complex");
  private static final Expr f000343 = Expr.makeBuiltIn("List/length");
  private static final Expr f000344 = Expr.makeFieldAccess(f000002, "tail");
  private static final Expr f000345 = Expr.makeApplication(f000009, new Expr[] {f000332});
  private static final Expr f000346 = Expr.makeMerge(f000337, f000003, null);
  private static final Expr f000347 = Expr.makeNonEmptyListLiteral(new Expr[] {f000346});
  private static final Expr f000348 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000347, f000002);
  private static final Expr f000349 = Expr.makeLambda("_", f000345, f000348);
  private static final Expr f000350 = Expr.makeLambda("_", f000338, f000349);
  private static final Expr f000351 = Expr.makeEmptyListLiteral(f000345);
  private static final Expr f000352 =
      Expr.makeApplication(f000000, new Expr[] {f000338, f000344, f000345, f000350, f000351});
  private static final Expr f000353 = Expr.makeApplication(f000343, new Expr[] {f000332, f000352});
  private static final Expr f000354 = Expr.makeApplication(f000063, new Expr[] {f000353});
  private static final Expr f000355 = Expr.makeFieldAccess(f000002, "head");
  private static final Expr f000356 = Expr.makeMerge(f000337, f000355, null);
  private static final Expr f000357 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("head", f000356),
            new SimpleImmutableEntry<String, Expr>("tail", f000352)
          });
  private static final Expr f000358 = Expr.makeFieldAccess(f000356, "tail");
  private static final Expr f000359 = Expr.makeApplication(f000343, new Expr[] {f000183, f000358});
  private static final Expr f000360 = Expr.makeApplication(f000063, new Expr[] {f000359});
  private static final Expr f000361 = Expr.makeFieldAccess(f000356, "head");
  private static final Expr f000362 =
      Expr.makeTextLiteral(new String[] {"", ","}, new Expr[] {f000361});
  private static final Expr f000363 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("head", f000362),
            new SimpleImmutableEntry<String, Expr>("tail", f000334)
          });
  private static final Expr f000364 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("index", f000178),
            new SimpleImmutableEntry<String, Expr>("value", f000183)
          });
  private static final Expr f000365 = Expr.makeBuiltIn("List/indexed");
  private static final Expr f000366 = Expr.makeApplication(f000365, new Expr[] {f000183, f000358});
  private static final Expr f000367 = Expr.makeFieldAccess(f000003, "index");
  private static final Expr f000368 = Expr.makeNaturalLiteral(new BigInteger("1"));
  private static final Expr f000369 = Expr.makeFieldAccess(f000014, "head");
  private static final Expr f000370 = Expr.makeMerge(f000337, f000369, null);
  private static final Expr f000371 = Expr.makeFieldAccess(f000370, "tail");
  private static final Expr f000372 = Expr.makeApplication(f000343, new Expr[] {f000183, f000371});
  private static final Expr f000373 = Expr.makeApplication(f000076, new Expr[] {f000368, f000372});
  private static final Expr f000374 = Expr.makeApplication(f000076, new Expr[] {f000367, f000373});
  private static final Expr f000375 = Expr.makeApplication(f000063, new Expr[] {f000374});
  private static final Expr f000376 =
      Expr.makeOperatorApplication(Operator.EQUALS, f000375, f000012);
  private static final Expr f000377 = Expr.makeIf(f000376, f000270, f000002);
  private static final Expr f000378 = Expr.makeLambda("_", f000331, f000377);
  private static final Expr f000379 = Expr.makeLambda("_", f000364, f000378);
  private static final Expr f000380 =
      Expr.makeApplication(f000000, new Expr[] {f000364, f000366, f000331, f000379, f000334});
  private static final Expr f000381 = Expr.makeIf(f000375, f000270, f000002);
  private static final Expr f000382 = Expr.makeLambda("_", f000331, f000381);
  private static final Expr f000383 = Expr.makeLambda("_", f000364, f000382);
  private static final Expr f000384 =
      Expr.makeApplication(f000000, new Expr[] {f000364, f000366, f000331, f000383, f000334});
  private static final Expr f000385 =
      Expr.makeTextLiteral(new String[] {"", ","}, new Expr[] {f000003});
  private static final Expr f000386 = Expr.makeNonEmptyListLiteral(new Expr[] {f000385});
  private static final Expr f000387 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000386, f000002);
  private static final Expr f000388 = Expr.makeLambda("_", f000331, f000387);
  private static final Expr f000389 = Expr.makeLambda("_", f000183, f000388);
  private static final Expr f000390 =
      Expr.makeApplication(f000000, new Expr[] {f000183, f000384, f000331, f000389, f000334});
  private static final Expr f000391 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000380, f000390);
  private static final Expr f000392 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("head", f000361),
            new SimpleImmutableEntry<String, Expr>("tail", f000391)
          });
  private static final Expr f000393 = Expr.makeIf(f000360, f000363, f000392);
  private static final Expr f000394 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("index", f000178),
            new SimpleImmutableEntry<String, Expr>("value", f000332)
          });
  private static final Expr f000395 = Expr.makeApplication(f000365, new Expr[] {f000332, f000352});
  private static final Expr f000396 = Expr.makeFieldAccess(f000014, "tail");
  private static final Expr f000397 =
      Expr.makeApplication(f000000, new Expr[] {f000338, f000396, f000345, f000350, f000351});
  private static final Expr f000398 = Expr.makeApplication(f000343, new Expr[] {f000332, f000397});
  private static final Expr f000399 = Expr.makeApplication(f000076, new Expr[] {f000368, f000398});
  private static final Expr f000400 = Expr.makeApplication(f000076, new Expr[] {f000367, f000399});
  private static final Expr f000401 = Expr.makeApplication(f000063, new Expr[] {f000400});
  private static final Expr f000402 =
      Expr.makeOperatorApplication(Operator.EQUALS, f000401, f000012);
  private static final Expr f000403 = Expr.makeIf(f000402, f000270, f000002);
  private static final Expr f000404 = Expr.makeLambda("_", f000345, f000403);
  private static final Expr f000405 = Expr.makeLambda("_", f000394, f000404);
  private static final Expr f000406 =
      Expr.makeApplication(f000000, new Expr[] {f000394, f000395, f000345, f000405, f000351});
  private static final Expr f000407 = Expr.makeFieldAccess(f000003, "tail");
  private static final Expr f000408 = Expr.makeApplication(f000343, new Expr[] {f000183, f000407});
  private static final Expr f000409 = Expr.makeApplication(f000063, new Expr[] {f000408});
  private static final Expr f000410 = Expr.makeFieldAccess(f000003, "head");
  private static final Expr f000411 =
      Expr.makeTextLiteral(new String[] {"", ","}, new Expr[] {f000410});
  private static final Expr f000412 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("head", f000411),
            new SimpleImmutableEntry<String, Expr>("tail", f000334)
          });
  private static final Expr f000413 = Expr.makeApplication(f000365, new Expr[] {f000183, f000407});
  private static final Expr f000414 = Expr.makeFieldAccess(f000025, "tail");
  private static final Expr f000415 = Expr.makeApplication(f000343, new Expr[] {f000183, f000414});
  private static final Expr f000416 = Expr.makeApplication(f000076, new Expr[] {f000368, f000415});
  private static final Expr f000417 = Expr.makeApplication(f000076, new Expr[] {f000367, f000416});
  private static final Expr f000418 = Expr.makeApplication(f000063, new Expr[] {f000417});
  private static final Expr f000419 =
      Expr.makeOperatorApplication(Operator.EQUALS, f000418, f000012);
  private static final Expr f000420 = Expr.makeIf(f000419, f000270, f000002);
  private static final Expr f000421 = Expr.makeLambda("_", f000331, f000420);
  private static final Expr f000422 = Expr.makeLambda("_", f000364, f000421);
  private static final Expr f000423 =
      Expr.makeApplication(f000000, new Expr[] {f000364, f000413, f000331, f000422, f000334});
  private static final Expr f000424 = Expr.makeIf(f000418, f000270, f000002);
  private static final Expr f000425 = Expr.makeLambda("_", f000331, f000424);
  private static final Expr f000426 = Expr.makeLambda("_", f000364, f000425);
  private static final Expr f000427 =
      Expr.makeApplication(f000000, new Expr[] {f000364, f000413, f000331, f000426, f000334});
  private static final Expr f000428 =
      Expr.makeApplication(f000000, new Expr[] {f000183, f000427, f000331, f000389, f000334});
  private static final Expr f000429 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000423, f000428);
  private static final Expr f000430 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("head", f000410),
            new SimpleImmutableEntry<String, Expr>("tail", f000429)
          });
  private static final Expr f000431 = Expr.makeIf(f000409, f000412, f000430);
  private static final Expr f000432 = Expr.makeNonEmptyListLiteral(new Expr[] {f000431});
  private static final Expr f000433 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000432, f000002);
  private static final Expr f000434 = Expr.makeLambda("_", f000345, f000433);
  private static final Expr f000435 = Expr.makeLambda("_", f000332, f000434);
  private static final Expr f000436 =
      Expr.makeApplication(f000000, new Expr[] {f000332, f000406, f000345, f000435, f000351});
  private static final Expr f000437 = Expr.makeIf(f000401, f000270, f000002);
  private static final Expr f000438 = Expr.makeLambda("_", f000345, f000437);
  private static final Expr f000439 = Expr.makeLambda("_", f000394, f000438);
  private static final Expr f000440 =
      Expr.makeApplication(f000000, new Expr[] {f000394, f000395, f000345, f000439, f000351});
  private static final Expr f000441 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000436, f000440);
  private static final Expr f000442 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("head", f000393),
            new SimpleImmutableEntry<String, Expr>("tail", f000441)
          });
  private static final Expr f000443 = Expr.makeIf(f000354, f000357, f000442);
  private static final Expr f000444 = Expr.makeFieldAccess(f000443, "head");
  private static final Expr f000445 = Expr.makeFieldAccess(f000444, "tail");
  private static final Expr f000446 = Expr.makeFieldAccess(f000443, "tail");
  private static final Expr f000447 = Expr.makeNonEmptyListLiteral(new Expr[] {f000355});
  private static final Expr f000448 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000447, f000344);
  private static final Expr f000449 = Expr.makeLambda("_", f000331, f000307);
  private static final Expr f000450 = Expr.makeLambda("_", f000183, f000449);
  private static final Expr f000451 =
      Expr.makeApplication(f000000, new Expr[] {f000183, f000448, f000331, f000450});
  private static final Expr f000452 = Expr.makeLambda("_", f000332, f000451);
  private static final Expr f000453 =
      Expr.makeApplication(f000000, new Expr[] {f000332, f000446, f000331, f000452, f000334});
  private static final Expr f000454 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000445, f000453);
  private static final Expr f000455 = Expr.makeApplication(f000343, new Expr[] {f000183, f000454});
  private static final Expr f000456 = Expr.makeApplication(f000063, new Expr[] {f000455});
  private static final Expr f000457 = Expr.makeFieldAccess(f000444, "head");
  private static final Expr f000458 =
      Expr.makeTextLiteral(new String[] {"[ ", " ]"}, new Expr[] {f000457});
  private static final Expr f000459 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("head", f000458),
            new SimpleImmutableEntry<String, Expr>("tail", f000334)
          });
  private static final Expr f000460 = Expr.makeTextLiteral("[");
  private static final Expr f000461 =
      Expr.makeTextLiteral(new String[] {"  ", ""}, new Expr[] {f000457});
  private static final Expr f000462 = Expr.makeNonEmptyListLiteral(new Expr[] {f000461});
  private static final Expr f000463 =
      Expr.makeTextLiteral(new String[] {"  ", ""}, new Expr[] {f000003});
  private static final Expr f000464 = Expr.makeNonEmptyListLiteral(new Expr[] {f000463});
  private static final Expr f000465 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000464, f000002);
  private static final Expr f000466 = Expr.makeLambda("_", f000331, f000465);
  private static final Expr f000467 = Expr.makeLambda("_", f000183, f000466);
  private static final Expr f000468 =
      Expr.makeApplication(f000000, new Expr[] {f000183, f000454, f000331, f000467, f000334});
  private static final Expr f000469 = Expr.makeTextLiteral("]");
  private static final Expr f000470 = Expr.makeNonEmptyListLiteral(new Expr[] {f000469});
  private static final Expr f000471 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000468, f000470);
  private static final Expr f000472 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000462, f000471);
  private static final Expr f000473 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("head", f000460),
            new SimpleImmutableEntry<String, Expr>("tail", f000472)
          });
  private static final Expr f000474 = Expr.makeIf(f000456, f000459, f000473);
  private static final Expr f000475 = Expr.makeApplication(f000342, new Expr[] {f000474});
  private static final Expr f000476 = Expr.makeApplication(f000009, new Expr[] {f000338});
  private static final Expr f000477 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("head", f000338),
            new SimpleImmutableEntry<String, Expr>("tail", f000476)
          });
  private static final Expr f000478 = Expr.makeLambda("_", f000477, f000475);
  private static final Expr f000479 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("None", f000341),
            new SimpleImmutableEntry<String, Expr>("Some", f000478)
          });
  private static final Expr f000480 = Expr.makeApplication(f000177, new Expr[] {f000477});
  private static final Expr f000481 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("index", f000178),
            new SimpleImmutableEntry<String, Expr>("value", f000338)
          });
  private static final Expr f000482 = Expr.makeApplication(f000365, new Expr[] {f000338, f000003});
  private static final Expr f000483 = Expr.makeApplication(f000076, new Expr[] {f000367, f000368});
  private static final Expr f000484 = Expr.makeApplication(f000063, new Expr[] {f000483});
  private static final Expr f000485 = Expr.makeIf(f000484, f000270, f000002);
  private static final Expr f000486 = Expr.makeLambda("_", f000476, f000485);
  private static final Expr f000487 = Expr.makeLambda("_", f000481, f000486);
  private static final Expr f000488 = Expr.makeEmptyListLiteral(f000476);
  private static final Expr f000489 =
      Expr.makeApplication(f000000, new Expr[] {f000481, f000482, f000476, f000487, f000488});
  private static final Expr f000490 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("head", f000002),
            new SimpleImmutableEntry<String, Expr>("tail", f000489)
          });
  private static final Expr f000491 = Expr.makeApplication(f000175, new Expr[] {f000490});
  private static final Expr f000492 = Expr.makeLambda("_", f000338, f000491);
  private static final Expr f000493 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("None", f000480),
            new SimpleImmutableEntry<String, Expr>("Some", f000492)
          });
  private static final Expr f000494 = Expr.makeBuiltIn("List/head");
  private static final Expr f000495 = Expr.makeApplication(f000494, new Expr[] {f000338, f000002});
  private static final Expr f000496 = Expr.makeMerge(f000493, f000495, null);
  private static final Expr f000497 = Expr.makeMerge(f000479, f000496, null);
  private static final Expr f000498 = Expr.makeLambda("_", f000476, f000497);
  private static final Expr f000499 = Expr.makeTextLiteral("true");
  private static final Expr f000500 = Expr.makeTextLiteral("false");
  private static final Expr f000501 = Expr.makeIf(f000002, f000499, f000500);
  private static final Expr f000502 = Expr.makeApplication(f000339, new Expr[] {f000501});
  private static final Expr f000503 = Expr.makeLambda("_", f000001, f000502);
  private static final Expr f000504 = Expr.makeApplication(f000048, new Expr[] {f000002});
  private static final Expr f000505 = Expr.makeApplication(f000339, new Expr[] {f000504});
  private static final Expr f000506 = Expr.makeLambda("_", f000190, f000505);
  private static final Expr f000507 = Expr.makeBuiltIn("Natural/show");
  private static final Expr f000508 = Expr.makeApplication(f000507, new Expr[] {f000065});
  private static final Expr f000509 = Expr.makeApplication(f000155, new Expr[] {f000002});
  private static final Expr f000510 = Expr.makeIf(f000119, f000508, f000509);
  private static final Expr f000511 = Expr.makeApplication(f000339, new Expr[] {f000510});
  private static final Expr f000512 = Expr.makeLambda("_", f000071, f000511);
  private static final Expr f000513 = Expr.makeTextLiteral("null");
  private static final Expr f000514 = Expr.makeApplication(f000339, new Expr[] {f000513});
  private static final Expr f000515 = Expr.makeTextLiteral("{}");
  private static final Expr f000516 = Expr.makeApplication(f000339, new Expr[] {f000515});
  private static final Expr f000517 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("mapKey", f000183),
            new SimpleImmutableEntry<String, Expr>("mapValue", f000338)
          });
  private static final Expr f000518 = Expr.makeMerge(f000337, f000249, null);
  private static final Expr f000519 = Expr.makeBuiltIn("Text/show");
  private static final Expr f000520 = Expr.makeApplication(f000519, new Expr[] {f000248});
  private static final Expr f000521 = Expr.makeFieldAccess(f000518, "head");
  private static final Expr f000522 =
      Expr.makeTextLiteral(new String[] {"", ": ", ""}, new Expr[] {f000520, f000521});
  private static final Expr f000523 =
      Expr.makeRecordLiteral(new Entry[] {new SimpleImmutableEntry<String, Expr>("head", f000522)});
  private static final Expr f000524 =
      Expr.makeOperatorApplication(Operator.PREFER, f000518, f000523);
  private static final Expr f000525 = Expr.makeNonEmptyListLiteral(new Expr[] {f000524});
  private static final Expr f000526 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000525, f000002);
  private static final Expr f000527 = Expr.makeLambda("_", f000345, f000526);
  private static final Expr f000528 = Expr.makeLambda("_", f000517, f000527);
  private static final Expr f000529 =
      Expr.makeApplication(f000000, new Expr[] {f000517, f000344, f000345, f000528, f000351});
  private static final Expr f000530 = Expr.makeApplication(f000343, new Expr[] {f000332, f000529});
  private static final Expr f000531 = Expr.makeApplication(f000063, new Expr[] {f000530});
  private static final Expr f000532 = Expr.makeFieldAccess(f000355, "mapValue");
  private static final Expr f000533 = Expr.makeMerge(f000337, f000532, null);
  private static final Expr f000534 = Expr.makeFieldAccess(f000355, "mapKey");
  private static final Expr f000535 = Expr.makeApplication(f000519, new Expr[] {f000534});
  private static final Expr f000536 = Expr.makeFieldAccess(f000533, "head");
  private static final Expr f000537 =
      Expr.makeTextLiteral(new String[] {"", ": ", ""}, new Expr[] {f000535, f000536});
  private static final Expr f000538 =
      Expr.makeRecordLiteral(new Entry[] {new SimpleImmutableEntry<String, Expr>("head", f000537)});
  private static final Expr f000539 =
      Expr.makeOperatorApplication(Operator.PREFER, f000533, f000538);
  private static final Expr f000540 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("head", f000539),
            new SimpleImmutableEntry<String, Expr>("tail", f000529)
          });
  private static final Expr f000541 = Expr.makeFieldAccess(f000533, "tail");
  private static final Expr f000542 = Expr.makeApplication(f000343, new Expr[] {f000183, f000541});
  private static final Expr f000543 = Expr.makeApplication(f000063, new Expr[] {f000542});
  private static final Expr f000544 =
      Expr.makeTextLiteral(new String[] {"", ": ", ","}, new Expr[] {f000535, f000536});
  private static final Expr f000545 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("head", f000544),
            new SimpleImmutableEntry<String, Expr>("tail", f000334)
          });
  private static final Expr f000546 = Expr.makeApplication(f000365, new Expr[] {f000183, f000541});
  private static final Expr f000547 = Expr.makeFieldAccess(f000369, "mapValue");
  private static final Expr f000548 = Expr.makeMerge(f000337, f000547, null);
  private static final Expr f000549 = Expr.makeFieldAccess(f000548, "tail");
  private static final Expr f000550 = Expr.makeApplication(f000343, new Expr[] {f000183, f000549});
  private static final Expr f000551 = Expr.makeApplication(f000076, new Expr[] {f000368, f000550});
  private static final Expr f000552 = Expr.makeApplication(f000076, new Expr[] {f000367, f000551});
  private static final Expr f000553 = Expr.makeApplication(f000063, new Expr[] {f000552});
  private static final Expr f000554 =
      Expr.makeOperatorApplication(Operator.EQUALS, f000553, f000012);
  private static final Expr f000555 = Expr.makeIf(f000554, f000270, f000002);
  private static final Expr f000556 = Expr.makeLambda("_", f000331, f000555);
  private static final Expr f000557 = Expr.makeLambda("_", f000364, f000556);
  private static final Expr f000558 =
      Expr.makeApplication(f000000, new Expr[] {f000364, f000546, f000331, f000557, f000334});
  private static final Expr f000559 = Expr.makeIf(f000553, f000270, f000002);
  private static final Expr f000560 = Expr.makeLambda("_", f000331, f000559);
  private static final Expr f000561 = Expr.makeLambda("_", f000364, f000560);
  private static final Expr f000562 =
      Expr.makeApplication(f000000, new Expr[] {f000364, f000546, f000331, f000561, f000334});
  private static final Expr f000563 =
      Expr.makeApplication(f000000, new Expr[] {f000183, f000562, f000331, f000389, f000334});
  private static final Expr f000564 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000558, f000563);
  private static final Expr f000565 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("head", f000537),
            new SimpleImmutableEntry<String, Expr>("tail", f000564)
          });
  private static final Expr f000566 = Expr.makeIf(f000543, f000545, f000565);
  private static final Expr f000567 = Expr.makeApplication(f000365, new Expr[] {f000332, f000529});
  private static final Expr f000568 =
      Expr.makeApplication(f000000, new Expr[] {f000517, f000396, f000345, f000528, f000351});
  private static final Expr f000569 = Expr.makeApplication(f000343, new Expr[] {f000332, f000568});
  private static final Expr f000570 = Expr.makeApplication(f000076, new Expr[] {f000368, f000569});
  private static final Expr f000571 = Expr.makeApplication(f000076, new Expr[] {f000367, f000570});
  private static final Expr f000572 = Expr.makeApplication(f000063, new Expr[] {f000571});
  private static final Expr f000573 =
      Expr.makeOperatorApplication(Operator.EQUALS, f000572, f000012);
  private static final Expr f000574 = Expr.makeIf(f000573, f000270, f000002);
  private static final Expr f000575 = Expr.makeLambda("_", f000345, f000574);
  private static final Expr f000576 = Expr.makeLambda("_", f000394, f000575);
  private static final Expr f000577 =
      Expr.makeApplication(f000000, new Expr[] {f000394, f000567, f000345, f000576, f000351});
  private static final Expr f000578 =
      Expr.makeApplication(f000000, new Expr[] {f000332, f000577, f000345, f000435, f000351});
  private static final Expr f000579 = Expr.makeIf(f000572, f000270, f000002);
  private static final Expr f000580 = Expr.makeLambda("_", f000345, f000579);
  private static final Expr f000581 = Expr.makeLambda("_", f000394, f000580);
  private static final Expr f000582 =
      Expr.makeApplication(f000000, new Expr[] {f000394, f000567, f000345, f000581, f000351});
  private static final Expr f000583 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000578, f000582);
  private static final Expr f000584 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("head", f000566),
            new SimpleImmutableEntry<String, Expr>("tail", f000583)
          });
  private static final Expr f000585 = Expr.makeIf(f000531, f000540, f000584);
  private static final Expr f000586 = Expr.makeFieldAccess(f000585, "head");
  private static final Expr f000587 = Expr.makeFieldAccess(f000586, "tail");
  private static final Expr f000588 = Expr.makeFieldAccess(f000585, "tail");
  private static final Expr f000589 =
      Expr.makeApplication(f000000, new Expr[] {f000332, f000588, f000331, f000452, f000334});
  private static final Expr f000590 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000587, f000589);
  private static final Expr f000591 = Expr.makeApplication(f000343, new Expr[] {f000183, f000590});
  private static final Expr f000592 = Expr.makeApplication(f000063, new Expr[] {f000591});
  private static final Expr f000593 = Expr.makeFieldAccess(f000586, "head");
  private static final Expr f000594 =
      Expr.makeTextLiteral(new String[] {"{ ", " }"}, new Expr[] {f000593});
  private static final Expr f000595 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("head", f000594),
            new SimpleImmutableEntry<String, Expr>("tail", f000334)
          });
  private static final Expr f000596 = Expr.makeTextLiteral("{");
  private static final Expr f000597 =
      Expr.makeTextLiteral(new String[] {"  ", ""}, new Expr[] {f000593});
  private static final Expr f000598 = Expr.makeNonEmptyListLiteral(new Expr[] {f000597});
  private static final Expr f000599 =
      Expr.makeApplication(f000000, new Expr[] {f000183, f000590, f000331, f000467, f000334});
  private static final Expr f000600 = Expr.makeTextLiteral("}");
  private static final Expr f000601 = Expr.makeNonEmptyListLiteral(new Expr[] {f000600});
  private static final Expr f000602 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000599, f000601);
  private static final Expr f000603 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000598, f000602);
  private static final Expr f000604 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("head", f000596),
            new SimpleImmutableEntry<String, Expr>("tail", f000603)
          });
  private static final Expr f000605 = Expr.makeIf(f000592, f000595, f000604);
  private static final Expr f000606 = Expr.makeApplication(f000342, new Expr[] {f000605});
  private static final Expr f000607 = Expr.makeApplication(f000009, new Expr[] {f000517});
  private static final Expr f000608 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("head", f000517),
            new SimpleImmutableEntry<String, Expr>("tail", f000607)
          });
  private static final Expr f000609 = Expr.makeLambda("_", f000608, f000606);
  private static final Expr f000610 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("None", f000516),
            new SimpleImmutableEntry<String, Expr>("Some", f000609)
          });
  private static final Expr f000611 = Expr.makeApplication(f000177, new Expr[] {f000608});
  private static final Expr f000612 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("index", f000178),
            new SimpleImmutableEntry<String, Expr>("value", f000517)
          });
  private static final Expr f000613 = Expr.makeApplication(f000365, new Expr[] {f000517, f000003});
  private static final Expr f000614 = Expr.makeLambda("_", f000607, f000485);
  private static final Expr f000615 = Expr.makeLambda("_", f000612, f000614);
  private static final Expr f000616 = Expr.makeEmptyListLiteral(f000607);
  private static final Expr f000617 =
      Expr.makeApplication(f000000, new Expr[] {f000612, f000613, f000607, f000615, f000616});
  private static final Expr f000618 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("head", f000002),
            new SimpleImmutableEntry<String, Expr>("tail", f000617)
          });
  private static final Expr f000619 = Expr.makeApplication(f000175, new Expr[] {f000618});
  private static final Expr f000620 = Expr.makeLambda("_", f000517, f000619);
  private static final Expr f000621 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("None", f000611),
            new SimpleImmutableEntry<String, Expr>("Some", f000620)
          });
  private static final Expr f000622 = Expr.makeApplication(f000494, new Expr[] {f000517, f000002});
  private static final Expr f000623 = Expr.makeMerge(f000621, f000622, null);
  private static final Expr f000624 = Expr.makeMerge(f000610, f000623, null);
  private static final Expr f000625 = Expr.makeLambda("_", f000607, f000624);
  private static final Expr f000626 = Expr.makeApplication(f000519, new Expr[] {f000002});
  private static final Expr f000627 = Expr.makeApplication(f000339, new Expr[] {f000626});
  private static final Expr f000628 = Expr.makeLambda("_", f000183, f000627);
  private static final Expr f000629 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("array", f000498),
            new SimpleImmutableEntry<String, Expr>("bool", f000503),
            new SimpleImmutableEntry<String, Expr>("double", f000506),
            new SimpleImmutableEntry<String, Expr>("integer", f000512),
            new SimpleImmutableEntry<String, Expr>("null", f000514),
            new SimpleImmutableEntry<String, Expr>("object", f000625),
            new SimpleImmutableEntry<String, Expr>("string", f000628)
          });
  private static final Expr f000630 = Expr.makeApplication(f000002, new Expr[] {f000338, f000629});
  private static final Expr f000631 = Expr.makeMerge(f000337, f000630, null);
  private static final Expr f000632 = Expr.makeFieldAccess(f000631, "head");
  private static final Expr f000633 = Expr.makeNonEmptyListLiteral(new Expr[] {f000632});
  private static final Expr f000634 = Expr.makeFieldAccess(f000631, "tail");
  private static final Expr f000635 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000633, f000634);
  private static final Expr f000636 =
      Expr.makeTextLiteral(new String[] {"", "\n", ""}, new Expr[] {f000003, f000002});
  private static final Expr f000637 = Expr.makeLambda("_", f000183, f000636);
  private static final Expr f000638 = Expr.makeLambda("_", f000183, f000637);
  private static final Expr f000639 = Expr.makeTextLiteral("");
  private static final Expr f000640 =
      Expr.makeApplication(f000000, new Expr[] {f000183, f000635, f000183, f000638, f000639});
  private static final Expr f000641 = Expr.makeLambda("_", f000199, f000640);
  private static final Expr f000642 = Expr.makeLambda("_", f000071, f000510);
  private static final Expr f000643 =
      Expr.makeTextLiteral(new String[] {"- ", ""}, new Expr[] {f000361});
  private static final Expr f000644 =
      Expr.makeApplication(f000000, new Expr[] {f000183, f000358, f000331, f000467, f000334});
  private static final Expr f000645 = Expr.makeFieldAccess(f000346, "tail");
  private static final Expr f000646 =
      Expr.makeApplication(f000000, new Expr[] {f000183, f000645, f000331, f000467, f000334});
  private static final Expr f000647 =
      Expr.makeRecordLiteral(new Entry[] {new SimpleImmutableEntry<String, Expr>("tail", f000646)});
  private static final Expr f000648 =
      Expr.makeOperatorApplication(Operator.PREFER, f000346, f000647);
  private static final Expr f000649 = Expr.makeFieldAccess(f000346, "head");
  private static final Expr f000650 =
      Expr.makeTextLiteral(new String[] {"- ", ""}, new Expr[] {f000649});
  private static final Expr f000651 =
      Expr.makeRecordLiteral(new Entry[] {new SimpleImmutableEntry<String, Expr>("head", f000650)});
  private static final Expr f000652 =
      Expr.makeOperatorApplication(Operator.PREFER, f000648, f000651);
  private static final Expr f000653 = Expr.makeNonEmptyListLiteral(new Expr[] {f000652});
  private static final Expr f000654 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000653, f000002);
  private static final Expr f000655 = Expr.makeLambda("_", f000345, f000654);
  private static final Expr f000656 = Expr.makeLambda("_", f000338, f000655);
  private static final Expr f000657 =
      Expr.makeApplication(f000000, new Expr[] {f000338, f000344, f000345, f000656, f000351});
  private static final Expr f000658 =
      Expr.makeApplication(f000000, new Expr[] {f000332, f000657, f000331, f000452, f000334});
  private static final Expr f000659 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000644, f000658);
  private static final Expr f000660 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("head", f000643),
            new SimpleImmutableEntry<String, Expr>("tail", f000659)
          });
  private static final Expr f000661 = Expr.makeApplication(f000342, new Expr[] {f000660});
  private static final Expr f000662 = Expr.makeLambda("_", f000477, f000661);
  private static final Expr f000663 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("None", f000341),
            new SimpleImmutableEntry<String, Expr>("Some", f000662)
          });
  private static final Expr f000664 = Expr.makeMerge(f000663, f000496, null);
  private static final Expr f000665 = Expr.makeLambda("_", f000476, f000664);
  private static final Expr f000666 = Expr.makeFieldAccess(f000410, "mapKey");
  private static final Expr f000667 = Expr.makeApplication(f000519, new Expr[] {f000666});
  private static final Expr f000668 =
      Expr.makeTextLiteral(new String[] {"", ":"}, new Expr[] {f000667});
  private static final Expr f000669 = Expr.makeFieldAccess(f000410, "mapValue");
  private static final Expr f000670 = Expr.makeMerge(f000337, f000669, null);
  private static final Expr f000671 = Expr.makeFieldAccess(f000670, "head");
  private static final Expr f000672 = Expr.makeNonEmptyListLiteral(new Expr[] {f000671});
  private static final Expr f000673 = Expr.makeFieldAccess(f000670, "tail");
  private static final Expr f000674 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000672, f000673);
  private static final Expr f000675 =
      Expr.makeApplication(f000000, new Expr[] {f000183, f000674, f000331, f000467, f000334});
  private static final Expr f000676 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("head", f000668),
            new SimpleImmutableEntry<String, Expr>("tail", f000675)
          });
  private static final Expr f000677 = Expr.makeLambda("_", f000332, f000676);
  private static final Expr f000678 =
      Expr.makeTextLiteral(new String[] {"", ": ", ""}, new Expr[] {f000667, f000002});
  private static final Expr f000679 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("head", f000678),
            new SimpleImmutableEntry<String, Expr>("tail", f000334)
          });
  private static final Expr f000680 = Expr.makeLambda("_", f000183, f000679);
  private static final Expr f000681 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("Complex", f000677),
            new SimpleImmutableEntry<String, Expr>("Simple", f000680)
          });
  private static final Expr f000682 = Expr.makeMerge(f000681, f000532, null);
  private static final Expr f000683 = Expr.makeFieldAccess(f000682, "head");
  private static final Expr f000684 = Expr.makeFieldAccess(f000682, "tail");
  private static final Expr f000685 = Expr.makeFieldAccess(f000014, "mapKey");
  private static final Expr f000686 = Expr.makeApplication(f000519, new Expr[] {f000685});
  private static final Expr f000687 =
      Expr.makeTextLiteral(new String[] {"", ":"}, new Expr[] {f000686});
  private static final Expr f000688 = Expr.makeFieldAccess(f000014, "mapValue");
  private static final Expr f000689 = Expr.makeMerge(f000337, f000688, null);
  private static final Expr f000690 = Expr.makeFieldAccess(f000689, "head");
  private static final Expr f000691 = Expr.makeNonEmptyListLiteral(new Expr[] {f000690});
  private static final Expr f000692 = Expr.makeFieldAccess(f000689, "tail");
  private static final Expr f000693 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000691, f000692);
  private static final Expr f000694 =
      Expr.makeApplication(f000000, new Expr[] {f000183, f000693, f000331, f000467, f000334});
  private static final Expr f000695 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("head", f000687),
            new SimpleImmutableEntry<String, Expr>("tail", f000694)
          });
  private static final Expr f000696 = Expr.makeLambda("_", f000332, f000695);
  private static final Expr f000697 =
      Expr.makeTextLiteral(new String[] {"", ": ", ""}, new Expr[] {f000686, f000002});
  private static final Expr f000698 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("head", f000697),
            new SimpleImmutableEntry<String, Expr>("tail", f000334)
          });
  private static final Expr f000699 = Expr.makeLambda("_", f000183, f000698);
  private static final Expr f000700 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("Complex", f000696),
            new SimpleImmutableEntry<String, Expr>("Simple", f000699)
          });
  private static final Expr f000701 = Expr.makeMerge(f000700, f000249, null);
  private static final Expr f000702 = Expr.makeNonEmptyListLiteral(new Expr[] {f000701});
  private static final Expr f000703 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000702, f000002);
  private static final Expr f000704 = Expr.makeLambda("_", f000345, f000703);
  private static final Expr f000705 = Expr.makeLambda("_", f000517, f000704);
  private static final Expr f000706 =
      Expr.makeApplication(f000000, new Expr[] {f000517, f000344, f000345, f000705, f000351});
  private static final Expr f000707 =
      Expr.makeApplication(f000000, new Expr[] {f000332, f000706, f000331, f000452, f000334});
  private static final Expr f000708 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000684, f000707);
  private static final Expr f000709 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("head", f000683),
            new SimpleImmutableEntry<String, Expr>("tail", f000708)
          });
  private static final Expr f000710 = Expr.makeApplication(f000342, new Expr[] {f000709});
  private static final Expr f000711 = Expr.makeLambda("_", f000608, f000710);
  private static final Expr f000712 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("None", f000516),
            new SimpleImmutableEntry<String, Expr>("Some", f000711)
          });
  private static final Expr f000713 = Expr.makeMerge(f000712, f000623, null);
  private static final Expr f000714 = Expr.makeLambda("_", f000607, f000713);
  private static final Expr f000715 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("array", f000665),
            new SimpleImmutableEntry<String, Expr>("bool", f000503),
            new SimpleImmutableEntry<String, Expr>("double", f000506),
            new SimpleImmutableEntry<String, Expr>("integer", f000512),
            new SimpleImmutableEntry<String, Expr>("null", f000514),
            new SimpleImmutableEntry<String, Expr>("object", f000714),
            new SimpleImmutableEntry<String, Expr>("string", f000628)
          });
  private static final Expr f000716 = Expr.makeApplication(f000002, new Expr[] {f000338, f000715});
  private static final Expr f000717 = Expr.makeMerge(f000337, f000716, null);
  private static final Expr f000718 = Expr.makeFieldAccess(f000717, "head");
  private static final Expr f000719 = Expr.makeNonEmptyListLiteral(new Expr[] {f000718});
  private static final Expr f000720 = Expr.makeFieldAccess(f000717, "tail");
  private static final Expr f000721 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000719, f000720);
  private static final Expr f000722 =
      Expr.makeApplication(f000000, new Expr[] {f000183, f000721, f000183, f000638, f000639});
  private static final Expr f000723 = Expr.makeLambda("_", f000199, f000722);
  private static final Expr f000724 = Expr.makeFieldAccess(f000002, "string");
  private static final Expr f000725 = Expr.makeApplication(f000724, new Expr[] {f000014});
  private static final Expr f000726 = Expr.makeLambda("_", f000197, f000725);
  private static final Expr f000727 = Expr.makeLambda("_", f000017, f000726);
  private static final Expr f000728 = Expr.makeLambda("_", f000183, f000727);
  private static final Expr f000729 = Expr.makeFieldAccess(f000184, "Inline");
  private static final Expr f000730 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("contents", f000002),
            new SimpleImmutableEntry<String, Expr>("field", f000014),
            new SimpleImmutableEntry<String, Expr>("nesting", f000729)
          });
  private static final Expr f000731 = Expr.makeLambda("_", f000002, f000730);
  private static final Expr f000732 = Expr.makeLambda("_", f000017, f000731);
  private static final Expr f000733 = Expr.makeLambda("_", f000183, f000732);
  private static final Expr f000734 = Expr.makeFieldAccess(f000184, "Nested");
  private static final Expr f000735 = Expr.makeApplication(f000734, new Expr[] {f000025});
  private static final Expr f000736 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("contents", f000002),
            new SimpleImmutableEntry<String, Expr>("field", f000014),
            new SimpleImmutableEntry<String, Expr>("nesting", f000735)
          });
  private static final Expr f000737 = Expr.makeLambda("_", f000002, f000736);
  private static final Expr f000738 = Expr.makeLambda("_", f000017, f000737);
  private static final Expr f000739 = Expr.makeLambda("_", f000183, f000738);
  private static final Expr f000740 = Expr.makeLambda("_", f000183, f000739);
  private static final Expr f000741 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("Nesting", f000184),
            new SimpleImmutableEntry<String, Expr>("Tagged", f000186),
            new SimpleImmutableEntry<String, Expr>("Type", f000199),
            new SimpleImmutableEntry<String, Expr>("array", f000214),
            new SimpleImmutableEntry<String, Expr>("bool", f000219),
            new SimpleImmutableEntry<String, Expr>("double", f000224),
            new SimpleImmutableEntry<String, Expr>("integer", f000229),
            new SimpleImmutableEntry<String, Expr>("keyText", f000232),
            new SimpleImmutableEntry<String, Expr>("keyValue", f000235),
            new SimpleImmutableEntry<String, Expr>("natural", f000240),
            new SimpleImmutableEntry<String, Expr>("null", f000243),
            new SimpleImmutableEntry<String, Expr>("number", f000224),
            new SimpleImmutableEntry<String, Expr>("object", f000264),
            new SimpleImmutableEntry<String, Expr>("omitNullFields", f000330),
            new SimpleImmutableEntry<String, Expr>("render", f000641),
            new SimpleImmutableEntry<String, Expr>("renderInteger", f000642),
            new SimpleImmutableEntry<String, Expr>("renderYAML", f000723),
            new SimpleImmutableEntry<String, Expr>("string", f000728),
            new SimpleImmutableEntry<String, Expr>("tagInline", f000733),
            new SimpleImmutableEntry<String, Expr>("tagNested", f000740)
          });
  private static final Expr f000742 = Expr.makeApplication(f000025, new Expr[] {f000003});
  private static final Expr f000743 = Expr.makeOperatorApplication(Operator.AND, f000742, f000002);
  private static final Expr f000744 = Expr.makeLambda("_", f000001, f000743);
  private static final Expr f000745 = Expr.makeLambda("_", f000014, f000744);
  private static final Expr f000746 =
      Expr.makeApplication(f000000, new Expr[] {f000014, f000002, f000001, f000745, f000007});
  private static final Expr f000747 = Expr.makeLambda("_", f000201, f000746);
  private static final Expr f000748 = Expr.makePi("_", f000002, f000001);
  private static final Expr f000749 = Expr.makeLambda("_", f000748, f000747);
  private static final Expr f000750 = Expr.makeLambda("_", f000017, f000749);
  private static final Expr f000751 = Expr.makeOperatorApplication(Operator.OR, f000742, f000002);
  private static final Expr f000752 = Expr.makeLambda("_", f000001, f000751);
  private static final Expr f000753 = Expr.makeLambda("_", f000014, f000752);
  private static final Expr f000754 =
      Expr.makeApplication(f000000, new Expr[] {f000014, f000002, f000001, f000753, f000012});
  private static final Expr f000755 = Expr.makeLambda("_", f000201, f000754);
  private static final Expr f000756 = Expr.makeLambda("_", f000748, f000755);
  private static final Expr f000757 = Expr.makeLambda("_", f000017, f000756);
  private static final Expr f000758 = Expr.makeBuiltIn("List/build");
  private static final Expr f000759 = Expr.makeApplication(f000009, new Expr[] {f000052});
  private static final Expr f000760 = Expr.makeLambda("_", f000759, f000307);
  private static final Expr f000761 = Expr.makeLambda("_", f000025, f000760);
  private static final Expr f000762 =
      Expr.makeApplication(f000000, new Expr[] {f000025, f000003, f000271, f000761, f000002});
  private static final Expr f000763 = Expr.makeLambda("_", f000205, f000762);
  private static final Expr f000764 = Expr.makeLambda("_", f000201, f000763);
  private static final Expr f000765 =
      Expr.makeApplication(f000000, new Expr[] {f000201, f000002, f000201, f000764, f000208});
  private static final Expr f000766 = Expr.makeApplication(f000009, new Expr[] {f000187});
  private static final Expr f000767 = Expr.makeLambda("_", f000766, f000765);
  private static final Expr f000768 = Expr.makeLambda("_", f000017, f000767);
  private static final Expr f000769 =
      Expr.makeApplication(f000000, new Expr[] {f000025, f000050, f000271, f000761});
  private static final Expr f000770 = Expr.makeLambda("_", f000025, f000769);
  private static final Expr f000771 =
      Expr.makeApplication(f000000, new Expr[] {f000025, f000002, f000205, f000770, f000274});
  private static final Expr f000772 = Expr.makeLambda("_", f000205, f000771);
  private static final Expr f000773 = Expr.makePi("_", f000003, f000201);
  private static final Expr f000774 = Expr.makeLambda("_", f000773, f000772);
  private static final Expr f000775 = Expr.makeLambda("_", f000017, f000774);
  private static final Expr f000776 = Expr.makeLambda("_", f000017, f000775);
  private static final Expr f000777 = Expr.makeLambda("_", f000201, f000002);
  private static final Expr f000778 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("None", f000208),
            new SimpleImmutableEntry<String, Expr>("Some", f000777)
          });
  private static final Expr f000779 = Expr.makeMerge(f000778, f000002, null);
  private static final Expr f000780 = Expr.makeBuiltIn("Optional");
  private static final Expr f000781 = Expr.makeApplication(f000780, new Expr[] {f000187});
  private static final Expr f000782 = Expr.makeLambda("_", f000781, f000779);
  private static final Expr f000783 = Expr.makeLambda("_", f000017, f000782);
  private static final Expr f000784 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("index", f000178),
            new SimpleImmutableEntry<String, Expr>("value", f000003)
          });
  private static final Expr f000785 = Expr.makeApplication(f000365, new Expr[] {f000003, f000002});
  private static final Expr f000786 = Expr.makeApplication(f000076, new Expr[] {f000367, f000052});
  private static final Expr f000787 = Expr.makeApplication(f000063, new Expr[] {f000786});
  private static final Expr f000788 = Expr.makeIf(f000787, f000270, f000002);
  private static final Expr f000789 = Expr.makeLambda("_", f000205, f000788);
  private static final Expr f000790 = Expr.makeLambda("_", f000784, f000789);
  private static final Expr f000791 =
      Expr.makeApplication(f000000, new Expr[] {f000784, f000785, f000201, f000790, f000208});
  private static final Expr f000792 = Expr.makeLambda("_", f000187, f000791);
  private static final Expr f000793 = Expr.makeLambda("_", f000017, f000792);
  private static final Expr f000794 = Expr.makeLambda("_", f000178, f000793);
  private static final Expr f000795 = Expr.makeEmptyListLiteral(f000187);
  private static final Expr f000796 = Expr.makeLambda("_", f000017, f000795);
  private static final Expr f000797 = Expr.makeIf(f000742, f000307, f000002);
  private static final Expr f000798 = Expr.makeLambda("_", f000271, f000797);
  private static final Expr f000799 = Expr.makeLambda("_", f000014, f000798);
  private static final Expr f000800 =
      Expr.makeApplication(f000000, new Expr[] {f000014, f000002, f000205, f000799, f000274});
  private static final Expr f000801 = Expr.makeLambda("_", f000201, f000800);
  private static final Expr f000802 = Expr.makeLambda("_", f000748, f000801);
  private static final Expr f000803 = Expr.makeLambda("_", f000017, f000802);
  private static final Expr f000804 = Expr.Constants.EMPTY_RECORD_TYPE;
  private static final Expr f000805 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("index", f000178),
            new SimpleImmutableEntry<String, Expr>("value", f000804)
          });
  private static final Expr f000806 = Expr.makeBuiltIn("Natural/fold");
  private static final Expr f000807 = Expr.makeApplication(f000009, new Expr[] {f000804});
  private static final Expr f000808 = Expr.Constants.EMPTY_RECORD_LITERAL;
  private static final Expr f000809 = Expr.makeNonEmptyListLiteral(new Expr[] {f000808});
  private static final Expr f000810 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000809, f000002);
  private static final Expr f000811 = Expr.makeLambda("_", f000807, f000810);
  private static final Expr f000812 = Expr.makeEmptyListLiteral(f000807);
  private static final Expr f000813 =
      Expr.makeApplication(f000806, new Expr[] {f000014, f000807, f000811, f000812});
  private static final Expr f000814 = Expr.makeApplication(f000365, new Expr[] {f000804, f000813});
  private static final Expr f000815 = Expr.makeApplication(f000014, new Expr[] {f000367});
  private static final Expr f000816 = Expr.makeNonEmptyListLiteral(new Expr[] {f000815});
  private static final Expr f000817 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000816, f000002);
  private static final Expr f000818 = Expr.makeLambda("_", f000205, f000817);
  private static final Expr f000819 = Expr.makeLambda("_", f000805, f000818);
  private static final Expr f000820 =
      Expr.makeApplication(f000000, new Expr[] {f000805, f000814, f000201, f000819, f000208});
  private static final Expr f000821 = Expr.makePi("_", f000178, f000003);
  private static final Expr f000822 = Expr.makeLambda("_", f000821, f000820);
  private static final Expr f000823 = Expr.makeLambda("_", f000017, f000822);
  private static final Expr f000824 = Expr.makeLambda("_", f000178, f000823);
  private static final Expr f000825 =
      Expr.makeApplication(f000806, new Expr[] {f000025, f000807, f000811, f000812});
  private static final Expr f000826 = Expr.makeApplication(f000365, new Expr[] {f000804, f000825});
  private static final Expr f000827 =
      Expr.makeApplication(f000806, new Expr[] {f000367, f000052, f000025, f000014});
  private static final Expr f000828 = Expr.makeNonEmptyListLiteral(new Expr[] {f000827});
  private static final Expr f000829 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000828, f000002);
  private static final Expr f000830 = Expr.makeLambda("_", f000271, f000829);
  private static final Expr f000831 = Expr.makeLambda("_", f000805, f000830);
  private static final Expr f000832 =
      Expr.makeApplication(f000000, new Expr[] {f000805, f000826, f000205, f000831, f000274});
  private static final Expr f000833 = Expr.makeLambda("_", f000003, f000832);
  private static final Expr f000834 = Expr.makePi("_", f000002, f000003);
  private static final Expr f000835 = Expr.makeLambda("_", f000834, f000833);
  private static final Expr f000836 = Expr.makeLambda("_", f000017, f000835);
  private static final Expr f000837 = Expr.makeLambda("_", f000178, f000836);
  private static final Expr f000838 = Expr.makeBuiltIn("List/last");
  private static final Expr f000839 = Expr.makeNonEmptyListLiteral(new Expr[] {f000742});
  private static final Expr f000840 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000839, f000002);
  private static final Expr f000841 = Expr.makeLambda("_", f000271, f000840);
  private static final Expr f000842 = Expr.makeLambda("_", f000025, f000841);
  private static final Expr f000843 =
      Expr.makeApplication(f000000, new Expr[] {f000025, f000002, f000205, f000842, f000274});
  private static final Expr f000844 = Expr.makeLambda("_", f000205, f000843);
  private static final Expr f000845 = Expr.makePi("_", f000003, f000003);
  private static final Expr f000846 = Expr.makeLambda("_", f000845, f000844);
  private static final Expr f000847 = Expr.makeLambda("_", f000017, f000846);
  private static final Expr f000848 = Expr.makeLambda("_", f000017, f000847);
  private static final Expr f000849 = Expr.makeApplication(f000343, new Expr[] {f000003, f000002});
  private static final Expr f000850 = Expr.makeApplication(f000063, new Expr[] {f000849});
  private static final Expr f000851 = Expr.makeLambda("_", f000187, f000850);
  private static final Expr f000852 = Expr.makeLambda("_", f000017, f000851);
  private static final Expr f000853 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("false", f000205),
            new SimpleImmutableEntry<String, Expr>("true", f000205)
          });
  private static final Expr f000854 = Expr.makeFieldAccess(f000002, "false");
  private static final Expr f000855 = Expr.makeFieldAccess(f000002, "true");
  private static final Expr f000856 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000306, f000855);
  private static final Expr f000857 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("false", f000854),
            new SimpleImmutableEntry<String, Expr>("true", f000856)
          });
  private static final Expr f000858 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000306, f000854);
  private static final Expr f000859 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("false", f000858),
            new SimpleImmutableEntry<String, Expr>("true", f000855)
          });
  private static final Expr f000860 = Expr.makeIf(f000742, f000857, f000859);
  private static final Expr f000861 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("false", f000271),
            new SimpleImmutableEntry<String, Expr>("true", f000271)
          });
  private static final Expr f000862 = Expr.makeLambda("_", f000861, f000860);
  private static final Expr f000863 = Expr.makeLambda("_", f000014, f000862);
  private static final Expr f000864 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("false", f000274),
            new SimpleImmutableEntry<String, Expr>("true", f000274)
          });
  private static final Expr f000865 =
      Expr.makeApplication(f000000, new Expr[] {f000014, f000002, f000853, f000863, f000864});
  private static final Expr f000866 = Expr.makeLambda("_", f000201, f000865);
  private static final Expr f000867 = Expr.makeLambda("_", f000748, f000866);
  private static final Expr f000868 = Expr.makeLambda("_", f000017, f000867);
  private static final Expr f000869 = Expr.makeLambda("_", f000201, f000307);
  private static final Expr f000870 =
      Expr.makeApplication(f000806, new Expr[] {f000014, f000201, f000869, f000208});
  private static final Expr f000871 = Expr.makeLambda("_", f000002, f000870);
  private static final Expr f000872 = Expr.makeLambda("_", f000017, f000871);
  private static final Expr f000873 = Expr.makeLambda("_", f000178, f000872);
  private static final Expr f000874 = Expr.makeBuiltIn("List/reverse");
  private static final Expr f000875 = Expr.makeApplication(f000009, new Expr[] {f000784});
  private static final Expr f000876 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("index", f000178),
            new SimpleImmutableEntry<String, Expr>("value", f000014)
          });
  private static final Expr f000877 = Expr.makeApplication(f000009, new Expr[] {f000876});
  private static final Expr f000878 = Expr.makePi("_", f000178, f000877);
  private static final Expr f000879 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("count", f000178),
            new SimpleImmutableEntry<String, Expr>("diff", f000878)
          });
  private static final Expr f000880 = Expr.makeFieldAccess(f000002, "count");
  private static final Expr f000881 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("index", f000178),
            new SimpleImmutableEntry<String, Expr>("value", f000025)
          });
  private static final Expr f000882 = Expr.makeApplication(f000343, new Expr[] {f000881, f000003});
  private static final Expr f000883 = Expr.makeOperatorApplication(Operator.PLUS, f000880, f000882);
  private static final Expr f000884 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("index", f000178),
            new SimpleImmutableEntry<String, Expr>("value", f000052)
          });
  private static final Expr f000885 = Expr.makeApplication(f000009, new Expr[] {f000884});
  private static final Expr f000886 = Expr.makeOperatorApplication(Operator.PLUS, f000367, f000014);
  private static final Expr f000887 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("index", f000886),
            new SimpleImmutableEntry<String, Expr>("value", f000268)
          });
  private static final Expr f000888 = Expr.makeNonEmptyListLiteral(new Expr[] {f000887});
  private static final Expr f000889 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000888, f000002);
  private static final Expr f000890 = Expr.makeIdentifier("_", 5);
  private static final Expr f000891 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("index", f000178),
            new SimpleImmutableEntry<String, Expr>("value", f000890)
          });
  private static final Expr f000892 = Expr.makeApplication(f000009, new Expr[] {f000891});
  private static final Expr f000893 = Expr.makeLambda("_", f000892, f000889);
  private static final Expr f000894 = Expr.makeLambda("_", f000884, f000893);
  private static final Expr f000895 = Expr.makeFieldAccess(f000003, "diff");
  private static final Expr f000896 = Expr.makeApplication(f000343, new Expr[] {f000884, f000014});
  private static final Expr f000897 = Expr.makeOperatorApplication(Operator.PLUS, f000002, f000896);
  private static final Expr f000898 = Expr.makeApplication(f000895, new Expr[] {f000897});
  private static final Expr f000899 =
      Expr.makeApplication(f000000, new Expr[] {f000884, f000014, f000885, f000894, f000898});
  private static final Expr f000900 = Expr.makeLambda("_", f000178, f000899);
  private static final Expr f000901 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("count", f000883),
            new SimpleImmutableEntry<String, Expr>("diff", f000900)
          });
  private static final Expr f000902 = Expr.makeApplication(f000009, new Expr[] {f000881});
  private static final Expr f000903 = Expr.makePi("_", f000178, f000902);
  private static final Expr f000904 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("count", f000178),
            new SimpleImmutableEntry<String, Expr>("diff", f000903)
          });
  private static final Expr f000905 = Expr.makeLambda("_", f000904, f000901);
  private static final Expr f000906 = Expr.makeLambda("_", f000875, f000905);
  private static final Expr f000907 = Expr.makeNaturalLiteral(new BigInteger("0"));
  private static final Expr f000908 = Expr.makeEmptyListLiteral(f000877);
  private static final Expr f000909 = Expr.makeLambda("_", f000178, f000908);
  private static final Expr f000910 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("count", f000907),
            new SimpleImmutableEntry<String, Expr>("diff", f000909)
          });
  private static final Expr f000911 =
      Expr.makeApplication(f000000, new Expr[] {f000875, f000002, f000879, f000906, f000910});
  private static final Expr f000912 = Expr.makeFieldAccess(f000911, "diff");
  private static final Expr f000913 = Expr.makeApplication(f000912, new Expr[] {f000907});
  private static final Expr f000914 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("index", f000178),
            new SimpleImmutableEntry<String, Expr>("value", f000002)
          });
  private static final Expr f000915 = Expr.makeApplication(f000009, new Expr[] {f000914});
  private static final Expr f000916 = Expr.makeApplication(f000009, new Expr[] {f000915});
  private static final Expr f000917 = Expr.makeLambda("_", f000916, f000913);
  private static final Expr f000918 = Expr.makeLambda("_", f000017, f000917);
  private static final Expr f000919 =
      Expr.makeOperatorApplication(Operator.EQUALS, f000787, f000012);
  private static final Expr f000920 = Expr.makeIf(f000919, f000270, f000002);
  private static final Expr f000921 = Expr.makeLambda("_", f000205, f000920);
  private static final Expr f000922 = Expr.makeLambda("_", f000784, f000921);
  private static final Expr f000923 =
      Expr.makeApplication(f000000, new Expr[] {f000784, f000785, f000201, f000922, f000208});
  private static final Expr f000924 = Expr.makeLambda("_", f000187, f000923);
  private static final Expr f000925 = Expr.makeLambda("_", f000017, f000924);
  private static final Expr f000926 = Expr.makeLambda("_", f000178, f000925);
  private static final Expr f000927 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("_1", f000014),
            new SimpleImmutableEntry<String, Expr>("_2", f000003)
          });
  private static final Expr f000928 = Expr.makeFieldAccess(f000003, "_1");
  private static final Expr f000929 = Expr.makeNonEmptyListLiteral(new Expr[] {f000928});
  private static final Expr f000930 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000929, f000002);
  private static final Expr f000931 = Expr.makeLambda("_", f000271, f000930);
  private static final Expr f000932 = Expr.makeLambda("_", f000927, f000931);
  private static final Expr f000933 =
      Expr.makeApplication(f000000, new Expr[] {f000927, f000002, f000205, f000932, f000274});
  private static final Expr f000934 = Expr.makeFieldAccess(f000003, "_2");
  private static final Expr f000935 = Expr.makeNonEmptyListLiteral(new Expr[] {f000934});
  private static final Expr f000936 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000935, f000002);
  private static final Expr f000937 = Expr.makeLambda("_", f000205, f000936);
  private static final Expr f000938 = Expr.makeLambda("_", f000927, f000937);
  private static final Expr f000939 =
      Expr.makeApplication(f000000, new Expr[] {f000927, f000002, f000201, f000938, f000208});
  private static final Expr f000940 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("_1", f000933),
            new SimpleImmutableEntry<String, Expr>("_2", f000939)
          });
  private static final Expr f000941 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("_1", f000003),
            new SimpleImmutableEntry<String, Expr>("_2", f000002)
          });
  private static final Expr f000942 = Expr.makeApplication(f000009, new Expr[] {f000941});
  private static final Expr f000943 = Expr.makeLambda("_", f000942, f000940);
  private static final Expr f000944 = Expr.makeLambda("_", f000017, f000943);
  private static final Expr f000945 = Expr.makeLambda("_", f000017, f000944);
  private static final Expr f000946 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("all", f000750),
            new SimpleImmutableEntry<String, Expr>("any", f000757),
            new SimpleImmutableEntry<String, Expr>("build", f000758),
            new SimpleImmutableEntry<String, Expr>("concat", f000768),
            new SimpleImmutableEntry<String, Expr>("concatMap", f000776),
            new SimpleImmutableEntry<String, Expr>("default", f000783),
            new SimpleImmutableEntry<String, Expr>("drop", f000794),
            new SimpleImmutableEntry<String, Expr>("empty", f000796),
            new SimpleImmutableEntry<String, Expr>("filter", f000803),
            new SimpleImmutableEntry<String, Expr>("fold", f000000),
            new SimpleImmutableEntry<String, Expr>("generate", f000824),
            new SimpleImmutableEntry<String, Expr>("head", f000494),
            new SimpleImmutableEntry<String, Expr>("indexed", f000365),
            new SimpleImmutableEntry<String, Expr>("iterate", f000837),
            new SimpleImmutableEntry<String, Expr>("last", f000838),
            new SimpleImmutableEntry<String, Expr>("length", f000343),
            new SimpleImmutableEntry<String, Expr>("map", f000848),
            new SimpleImmutableEntry<String, Expr>("null", f000852),
            new SimpleImmutableEntry<String, Expr>("partition", f000868),
            new SimpleImmutableEntry<String, Expr>("replicate", f000873),
            new SimpleImmutableEntry<String, Expr>("reverse", f000874),
            new SimpleImmutableEntry<String, Expr>("shifted", f000918),
            new SimpleImmutableEntry<String, Expr>("take", f000926),
            new SimpleImmutableEntry<String, Expr>("unzip", f000945)
          });
  private static final Expr f000947 =
      Expr.makeUnionType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("Environment", f000183),
            new SimpleImmutableEntry<String, Expr>("Local", f000183),
            new SimpleImmutableEntry<String, Expr>("Missing", null),
            new SimpleImmutableEntry<String, Expr>("Remote", f000183)
          });
  private static final Expr f000948 =
      Expr.makeRecordLiteral(new Entry[] {new SimpleImmutableEntry<String, Expr>("Type", f000947)});
  private static final Expr f000949 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("mapKey", f000003),
            new SimpleImmutableEntry<String, Expr>("mapValue", f000002)
          });
  private static final Expr f000950 = Expr.makeLambda("_", f000017, f000949);
  private static final Expr f000951 = Expr.makeLambda("_", f000017, f000950);
  private static final Expr f000952 = Expr.makeApplication(f000009, new Expr[] {f000949});
  private static final Expr f000953 = Expr.makeLambda("_", f000017, f000952);
  private static final Expr f000954 = Expr.makeLambda("_", f000017, f000953);
  private static final Expr f000955 = Expr.makeEmptyListLiteral(f000952);
  private static final Expr f000956 = Expr.makeLambda("_", f000017, f000955);
  private static final Expr f000957 = Expr.makeLambda("_", f000017, f000956);
  private static final Expr f000958 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("mapKey", f000014),
            new SimpleImmutableEntry<String, Expr>("mapValue", f000003)
          });
  private static final Expr f000959 = Expr.makeNonEmptyListLiteral(new Expr[] {f000248});
  private static final Expr f000960 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000959, f000002);
  private static final Expr f000961 = Expr.makeLambda("_", f000271, f000960);
  private static final Expr f000962 = Expr.makeLambda("_", f000958, f000961);
  private static final Expr f000963 =
      Expr.makeApplication(f000000, new Expr[] {f000958, f000002, f000205, f000962, f000274});
  private static final Expr f000964 = Expr.makeLambda("_", f000952, f000963);
  private static final Expr f000965 = Expr.makeLambda("_", f000017, f000964);
  private static final Expr f000966 = Expr.makeLambda("_", f000017, f000965);
  private static final Expr f000967 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("mapKey", f000052),
            new SimpleImmutableEntry<String, Expr>("mapValue", f000025)
          });
  private static final Expr f000968 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("mapKey", f000052),
            new SimpleImmutableEntry<String, Expr>("mapValue", f000014)
          });
  private static final Expr f000969 = Expr.makeApplication(f000009, new Expr[] {f000968});
  private static final Expr f000970 = Expr.makeApplication(f000025, new Expr[] {f000249});
  private static final Expr f000971 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("mapKey", f000248),
            new SimpleImmutableEntry<String, Expr>("mapValue", f000970)
          });
  private static final Expr f000972 = Expr.makeNonEmptyListLiteral(new Expr[] {f000971});
  private static final Expr f000973 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000972, f000002);
  private static final Expr f000974 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("mapKey", f000890),
            new SimpleImmutableEntry<String, Expr>("mapValue", f000025)
          });
  private static final Expr f000975 = Expr.makeApplication(f000009, new Expr[] {f000974});
  private static final Expr f000976 = Expr.makeLambda("_", f000975, f000973);
  private static final Expr f000977 = Expr.makeLambda("_", f000967, f000976);
  private static final Expr f000978 = Expr.makeEmptyListLiteral(f000969);
  private static final Expr f000979 =
      Expr.makeApplication(f000000, new Expr[] {f000967, f000002, f000969, f000977, f000978});
  private static final Expr f000980 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("mapKey", f000025),
            new SimpleImmutableEntry<String, Expr>("mapValue", f000014)
          });
  private static final Expr f000981 = Expr.makeApplication(f000009, new Expr[] {f000980});
  private static final Expr f000982 = Expr.makeLambda("_", f000981, f000979);
  private static final Expr f000983 = Expr.makeLambda("_", f000845, f000982);
  private static final Expr f000984 = Expr.makeLambda("_", f000017, f000983);
  private static final Expr f000985 = Expr.makeLambda("_", f000017, f000984);
  private static final Expr f000986 = Expr.makeLambda("_", f000017, f000985);
  private static final Expr f000987 = Expr.makeNonEmptyListLiteral(new Expr[] {f000249});
  private static final Expr f000988 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f000987, f000002);
  private static final Expr f000989 = Expr.makeLambda("_", f000205, f000988);
  private static final Expr f000990 = Expr.makeLambda("_", f000958, f000989);
  private static final Expr f000991 =
      Expr.makeApplication(f000000, new Expr[] {f000958, f000002, f000201, f000990, f000208});
  private static final Expr f000992 = Expr.makeLambda("_", f000952, f000991);
  private static final Expr f000993 = Expr.makeLambda("_", f000017, f000992);
  private static final Expr f000994 = Expr.makeLambda("_", f000017, f000993);
  private static final Expr f000995 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("Entry", f000951),
            new SimpleImmutableEntry<String, Expr>("Type", f000954),
            new SimpleImmutableEntry<String, Expr>("empty", f000957),
            new SimpleImmutableEntry<String, Expr>("keyText", f000232),
            new SimpleImmutableEntry<String, Expr>("keyValue", f000235),
            new SimpleImmutableEntry<String, Expr>("keys", f000966),
            new SimpleImmutableEntry<String, Expr>("map", f000986),
            new SimpleImmutableEntry<String, Expr>("values", f000994)
          });
  private static final Expr f000996 = Expr.makeLambda("_", f000017, f000188);
  private static final Expr f000997 = Expr.makeBuiltIn("Natural/build");
  private static final Expr f000998 =
      Expr.makeApplication(f000806, new Expr[] {f000002, f000807, f000811, f000812});
  private static final Expr f000999 = Expr.makeApplication(f000365, new Expr[] {f000804, f000998});
  private static final Expr f001000 = Expr.makeApplication(f000009, new Expr[] {f000178});
  private static final Expr f001001 = Expr.makeNonEmptyListLiteral(new Expr[] {f000367});
  private static final Expr f001002 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f001001, f000002);
  private static final Expr f001003 = Expr.makeLambda("_", f001000, f001002);
  private static final Expr f001004 = Expr.makeLambda("_", f000805, f001003);
  private static final Expr f001005 = Expr.makeEmptyListLiteral(f001000);
  private static final Expr f001006 =
      Expr.makeApplication(f000000, new Expr[] {f000805, f000999, f001000, f001004, f001005});
  private static final Expr f001007 = Expr.makeLambda("_", f000178, f001006);
  private static final Expr f001008 = Expr.makeApplication(f000076, new Expr[] {f000002, f000003});
  private static final Expr f001009 = Expr.makeApplication(f000063, new Expr[] {f001008});
  private static final Expr f001010 = Expr.makeApplication(f000076, new Expr[] {f000003, f000002});
  private static final Expr f001011 = Expr.makeApplication(f000063, new Expr[] {f001010});
  private static final Expr f001012 = Expr.makeOperatorApplication(Operator.AND, f001009, f001011);
  private static final Expr f001013 = Expr.makeLambda("_", f000178, f001012);
  private static final Expr f001014 = Expr.makeLambda("_", f000178, f001013);
  private static final Expr f001015 = Expr.makeBuiltIn("Natural/even");
  private static final Expr f001016 =
      Expr.makeOperatorApplication(Operator.EQUALS, f001009, f000012);
  private static final Expr f001017 = Expr.makeLambda("_", f000178, f001016);
  private static final Expr f001018 = Expr.makeLambda("_", f000178, f001017);
  private static final Expr f001019 = Expr.makeLambda("_", f000178, f001011);
  private static final Expr f001020 = Expr.makeLambda("_", f000178, f001019);
  private static final Expr f001021 =
      Expr.makeOperatorApplication(Operator.EQUALS, f001011, f000012);
  private static final Expr f001022 = Expr.makeLambda("_", f000178, f001021);
  private static final Expr f001023 = Expr.makeLambda("_", f000178, f001022);
  private static final Expr f001024 = Expr.makeLambda("_", f000178, f001009);
  private static final Expr f001025 = Expr.makeLambda("_", f000178, f001024);
  private static final Expr f001026 = Expr.makeIf(f001009, f000002, f000003);
  private static final Expr f001027 = Expr.makeLambda("_", f000178, f001026);
  private static final Expr f001028 = Expr.makeLambda("_", f000178, f001027);
  private static final Expr f001029 =
      Expr.makeApplication(f000000, new Expr[] {f000178, f000003, f000178, f001028, f000002});
  private static final Expr f001030 = Expr.makeApplication(f000175, new Expr[] {f001029});
  private static final Expr f001031 = Expr.makeLambda("_", f000178, f001030);
  private static final Expr f001032 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("None", f000179),
            new SimpleImmutableEntry<String, Expr>("Some", f001031)
          });
  private static final Expr f001033 = Expr.makeApplication(f000494, new Expr[] {f000178, f000002});
  private static final Expr f001034 = Expr.makeMerge(f001032, f001033, null);
  private static final Expr f001035 = Expr.makeLambda("_", f001000, f001034);
  private static final Expr f001036 = Expr.makeApplication(f000063, new Expr[] {f000002});
  private static final Expr f001037 = Expr.makeIf(f001009, f000003, f000002);
  private static final Expr f001038 = Expr.makeLambda("_", f000178, f001037);
  private static final Expr f001039 = Expr.makeLambda("_", f000178, f001038);
  private static final Expr f001040 =
      Expr.makeApplication(f000000, new Expr[] {f000178, f000003, f000178, f001039, f000002});
  private static final Expr f001041 = Expr.makeIf(f001036, f000002, f001040);
  private static final Expr f001042 = Expr.makeApplication(f000175, new Expr[] {f001041});
  private static final Expr f001043 = Expr.makeLambda("_", f000178, f001042);
  private static final Expr f001044 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("None", f000179),
            new SimpleImmutableEntry<String, Expr>("Some", f001043)
          });
  private static final Expr f001045 = Expr.makeMerge(f001044, f001033, null);
  private static final Expr f001046 = Expr.makeLambda("_", f001000, f001045);
  private static final Expr f001047 = Expr.makeBuiltIn("Natural/odd");
  private static final Expr f001048 =
      Expr.makeOperatorApplication(Operator.TIMES, f000003, f000002);
  private static final Expr f001049 = Expr.makeLambda("_", f000178, f001048);
  private static final Expr f001050 = Expr.makeLambda("_", f000178, f001049);
  private static final Expr f001051 =
      Expr.makeApplication(f000000, new Expr[] {f000178, f000002, f000178, f001050, f000368});
  private static final Expr f001052 = Expr.makeLambda("_", f001000, f001051);
  private static final Expr f001053 = Expr.makeApplication(f000343, new Expr[] {f000178, f000002});
  private static final Expr f001054 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("rest", f001000),
            new SimpleImmutableEntry<String, Expr>("sorted", f001000)
          });
  private static final Expr f001055 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("false", f001005),
            new SimpleImmutableEntry<String, Expr>("true", f001005)
          });
  private static final Expr f001056 = Expr.makeFieldAccess(f000003, "rest");
  private static final Expr f001057 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("false", f001000),
            new SimpleImmutableEntry<String, Expr>("true", f001000)
          });
  private static final Expr f001058 = Expr.makeApplication(f000076, new Expr[] {f000014, f000003});
  private static final Expr f001059 = Expr.makeApplication(f000063, new Expr[] {f001058});
  private static final Expr f001060 = Expr.makeIf(f001059, f000857, f000859);
  private static final Expr f001061 = Expr.makeLambda("_", f001057, f001060);
  private static final Expr f001062 = Expr.makeLambda("_", f000178, f001061);
  private static final Expr f001063 =
      Expr.makeApplication(f000000, new Expr[] {f000178, f001056, f001057, f001062, f001055});
  private static final Expr f001064 = Expr.makeLambda("_", f000178, f001063);
  private static final Expr f001065 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("None", f001055),
            new SimpleImmutableEntry<String, Expr>("Some", f001064)
          });
  private static final Expr f001066 =
      Expr.makeApplication(f000000, new Expr[] {f000178, f001056, f000178, f001039, f000002});
  private static final Expr f001067 = Expr.makeIf(f001036, f000002, f001066);
  private static final Expr f001068 = Expr.makeApplication(f000175, new Expr[] {f001067});
  private static final Expr f001069 = Expr.makeLambda("_", f000178, f001068);
  private static final Expr f001070 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("None", f000179),
            new SimpleImmutableEntry<String, Expr>("Some", f001069)
          });
  private static final Expr f001071 = Expr.makeFieldAccess(f000002, "rest");
  private static final Expr f001072 = Expr.makeApplication(f000494, new Expr[] {f000178, f001071});
  private static final Expr f001073 = Expr.makeMerge(f001070, f001072, null);
  private static final Expr f001074 = Expr.makeMerge(f001065, f001073, null);
  private static final Expr f001075 = Expr.makeFieldAccess(f001074, "false");
  private static final Expr f001076 = Expr.makeFieldAccess(f000002, "sorted");
  private static final Expr f001077 = Expr.makeFieldAccess(f001074, "true");
  private static final Expr f001078 =
      Expr.makeOperatorApplication(Operator.LIST_APPEND, f001076, f001077);
  private static final Expr f001079 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("rest", f001075),
            new SimpleImmutableEntry<String, Expr>("sorted", f001078)
          });
  private static final Expr f001080 = Expr.makeLambda("_", f001054, f001079);
  private static final Expr f001081 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("rest", f000002),
            new SimpleImmutableEntry<String, Expr>("sorted", f001005)
          });
  private static final Expr f001082 =
      Expr.makeApplication(f000806, new Expr[] {f001053, f001054, f001080, f001081});
  private static final Expr f001083 = Expr.makeFieldAccess(f001082, "sorted");
  private static final Expr f001084 = Expr.makeLambda("_", f001000, f001083);
  private static final Expr f001085 = Expr.makeOperatorApplication(Operator.PLUS, f000003, f000002);
  private static final Expr f001086 = Expr.makeLambda("_", f000178, f001085);
  private static final Expr f001087 = Expr.makeLambda("_", f000178, f001086);
  private static final Expr f001088 =
      Expr.makeApplication(f000000, new Expr[] {f000178, f000002, f000178, f001087, f000907});
  private static final Expr f001089 = Expr.makeLambda("_", f001000, f001088);
  private static final Expr f001090 = Expr.makeApplication(f000081, new Expr[] {f000002});
  private static final Expr f001091 = Expr.makeApplication(f000174, new Expr[] {f001090});
  private static final Expr f001092 = Expr.makeLambda("_", f000178, f001091);
  private static final Expr f001093 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("build", f000997),
            new SimpleImmutableEntry<String, Expr>("enumerate", f001007),
            new SimpleImmutableEntry<String, Expr>("equal", f001014),
            new SimpleImmutableEntry<String, Expr>("even", f001015),
            new SimpleImmutableEntry<String, Expr>("fold", f000806),
            new SimpleImmutableEntry<String, Expr>("greaterThan", f001018),
            new SimpleImmutableEntry<String, Expr>("greaterThanEqual", f001020),
            new SimpleImmutableEntry<String, Expr>("isZero", f000063),
            new SimpleImmutableEntry<String, Expr>("lessThan", f001023),
            new SimpleImmutableEntry<String, Expr>("lessThanEqual", f001025),
            new SimpleImmutableEntry<String, Expr>("listMax", f001035),
            new SimpleImmutableEntry<String, Expr>("listMin", f001046),
            new SimpleImmutableEntry<String, Expr>("max", f001028),
            new SimpleImmutableEntry<String, Expr>("min", f001039),
            new SimpleImmutableEntry<String, Expr>("odd", f001047),
            new SimpleImmutableEntry<String, Expr>("product", f001052),
            new SimpleImmutableEntry<String, Expr>("show", f000507),
            new SimpleImmutableEntry<String, Expr>("sort", f001084),
            new SimpleImmutableEntry<String, Expr>("subtract", f000076),
            new SimpleImmutableEntry<String, Expr>("sum", f001089),
            new SimpleImmutableEntry<String, Expr>("toDouble", f001092),
            new SimpleImmutableEntry<String, Expr>("toInteger", f000081)
          });
  private static final Expr f001094 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("None", f000007),
            new SimpleImmutableEntry<String, Expr>("Some", f000003)
          });
  private static final Expr f001095 = Expr.makeMerge(f001094, f000002, null);
  private static final Expr f001096 = Expr.makeApplication(f000780, new Expr[] {f000003});
  private static final Expr f001097 = Expr.makeLambda("_", f001096, f001095);
  private static final Expr f001098 = Expr.makeLambda("_", f000748, f001097);
  private static final Expr f001099 = Expr.makeLambda("_", f000017, f001098);
  private static final Expr f001100 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("None", f000012),
            new SimpleImmutableEntry<String, Expr>("Some", f000003)
          });
  private static final Expr f001101 = Expr.makeMerge(f001100, f000002, null);
  private static final Expr f001102 = Expr.makeLambda("_", f001096, f001101);
  private static final Expr f001103 = Expr.makeLambda("_", f000748, f001102);
  private static final Expr f001104 = Expr.makeLambda("_", f000017, f001103);
  private static final Expr f001105 = Expr.makeApplication(f000175, new Expr[] {f000002});
  private static final Expr f001106 = Expr.makeLambda("_", f000003, f001105);
  private static final Expr f001107 = Expr.makeApplication(f000177, new Expr[] {f000003});
  private static final Expr f001108 =
      Expr.makeApplication(f000002, new Expr[] {f001096, f001106, f001107});
  private static final Expr f001109 = Expr.makePi("_", f000845, f000015);
  private static final Expr f001110 = Expr.makePi("_", f000017, f001109);
  private static final Expr f001111 = Expr.makeLambda("_", f001110, f001108);
  private static final Expr f001112 = Expr.makeLambda("_", f000017, f001111);
  private static final Expr f001113 = Expr.makeLambda("_", f001096, f000002);
  private static final Expr f001114 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("None", f001107),
            new SimpleImmutableEntry<String, Expr>("Some", f001113)
          });
  private static final Expr f001115 = Expr.makeMerge(f001114, f000002, null);
  private static final Expr f001116 = Expr.makeApplication(f000780, new Expr[] {f000002});
  private static final Expr f001117 = Expr.makeApplication(f000780, new Expr[] {f001116});
  private static final Expr f001118 = Expr.makeLambda("_", f001117, f001115);
  private static final Expr f001119 = Expr.makeLambda("_", f000017, f001118);
  private static final Expr f001120 = Expr.makeLambda("_", f000014, f000002);
  private static final Expr f001121 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("None", f000003),
            new SimpleImmutableEntry<String, Expr>("Some", f001120)
          });
  private static final Expr f001122 = Expr.makeMerge(f001121, f000002, null);
  private static final Expr f001123 = Expr.makeLambda("_", f001096, f001122);
  private static final Expr f001124 = Expr.makeLambda("_", f000002, f001123);
  private static final Expr f001125 = Expr.makeLambda("_", f000017, f001124);
  private static final Expr f001126 = Expr.makeApplication(f000177, new Expr[] {f000014});
  private static final Expr f001127 = Expr.makeApplication(f000177, new Expr[] {f000025});
  private static final Expr f001128 = Expr.makeIf(f000050, f001105, f001127);
  private static final Expr f001129 = Expr.makeLambda("_", f000014, f001128);
  private static final Expr f001130 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("None", f001126),
            new SimpleImmutableEntry<String, Expr>("Some", f001129)
          });
  private static final Expr f001131 = Expr.makeMerge(f001130, f000002, null);
  private static final Expr f001132 = Expr.makeLambda("_", f001096, f001131);
  private static final Expr f001133 = Expr.makeLambda("_", f000748, f001132);
  private static final Expr f001134 = Expr.makeLambda("_", f000017, f001133);
  private static final Expr f001135 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("None", f000002),
            new SimpleImmutableEntry<String, Expr>("Some", f000003)
          });
  private static final Expr f001136 = Expr.makeMerge(f001135, f000025, null);
  private static final Expr f001137 = Expr.makeLambda("_", f000003, f001136);
  private static final Expr f001138 = Expr.makePi("_", f000014, f000003);
  private static final Expr f001139 = Expr.makeLambda("_", f001138, f001137);
  private static final Expr f001140 = Expr.makeLambda("_", f000017, f001139);
  private static final Expr f001141 = Expr.makeLambda("_", f001116, f001140);
  private static final Expr f001142 = Expr.makeLambda("_", f000017, f001141);
  private static final Expr f001143 = Expr.makeLambda("_", f000025, f001105);
  private static final Expr f001144 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("None", f000002),
            new SimpleImmutableEntry<String, Expr>("Some", f001143)
          });
  private static final Expr f001145 = Expr.makeMerge(f001144, f000003, null);
  private static final Expr f001146 = Expr.makeApplication(f000780, new Expr[] {f000014});
  private static final Expr f001147 = Expr.makeLambda("_", f001146, f001145);
  private static final Expr f001148 = Expr.makeLambda("_", f001096, f001147);
  private static final Expr f001149 =
      Expr.makeApplication(f000000, new Expr[] {f001096, f000002, f001096, f001148, f001107});
  private static final Expr f001150 = Expr.makeApplication(f000009, new Expr[] {f001116});
  private static final Expr f001151 = Expr.makeLambda("_", f001150, f001149);
  private static final Expr f001152 = Expr.makeLambda("_", f000017, f001151);
  private static final Expr f001153 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("None", f000003),
            new SimpleImmutableEntry<String, Expr>("Some", f001143)
          });
  private static final Expr f001154 = Expr.makeMerge(f001153, f000002, null);
  private static final Expr f001155 = Expr.makeLambda("_", f001146, f001154);
  private static final Expr f001156 = Expr.makeLambda("_", f001096, f001155);
  private static final Expr f001157 =
      Expr.makeApplication(f000000, new Expr[] {f001096, f000002, f001096, f001156, f001107});
  private static final Expr f001158 = Expr.makeLambda("_", f001150, f001157);
  private static final Expr f001159 = Expr.makeLambda("_", f000017, f001158);
  private static final Expr f001160 = Expr.makeLambda("_", f000003, f000368);
  private static final Expr f001161 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("None", f000907),
            new SimpleImmutableEntry<String, Expr>("Some", f001160)
          });
  private static final Expr f001162 = Expr.makeMerge(f001161, f000002, null);
  private static final Expr f001163 = Expr.makeLambda("_", f001116, f001162);
  private static final Expr f001164 = Expr.makeLambda("_", f000017, f001163);
  private static final Expr f001165 = Expr.makeApplication(f000175, new Expr[] {f000050});
  private static final Expr f001166 = Expr.makeLambda("_", f000025, f001165);
  private static final Expr f001167 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("None", f001126),
            new SimpleImmutableEntry<String, Expr>("Some", f001166)
          });
  private static final Expr f001168 = Expr.makeMerge(f001167, f000002, null);
  private static final Expr f001169 = Expr.makeLambda("_", f001146, f001168);
  private static final Expr f001170 = Expr.makeLambda("_", f000845, f001169);
  private static final Expr f001171 = Expr.makeLambda("_", f000017, f001170);
  private static final Expr f001172 = Expr.makeLambda("_", f000017, f001171);
  private static final Expr f001173 = Expr.makeLambda("_", f000003, f000012);
  private static final Expr f001174 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("None", f000007),
            new SimpleImmutableEntry<String, Expr>("Some", f001173)
          });
  private static final Expr f001175 = Expr.makeMerge(f001174, f000002, null);
  private static final Expr f001176 = Expr.makeLambda("_", f001116, f001175);
  private static final Expr f001177 = Expr.makeLambda("_", f000017, f001176);
  private static final Expr f001178 = Expr.makeNonEmptyListLiteral(new Expr[] {f000002});
  private static final Expr f001179 = Expr.makeLambda("_", f000003, f001178);
  private static final Expr f001180 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("None", f000208),
            new SimpleImmutableEntry<String, Expr>("Some", f001179)
          });
  private static final Expr f001181 = Expr.makeMerge(f001180, f000002, null);
  private static final Expr f001182 = Expr.makeLambda("_", f001116, f001181);
  private static final Expr f001183 = Expr.makeLambda("_", f000017, f001182);
  private static final Expr f001184 = Expr.makeFieldAccess(f000002, "_1");
  private static final Expr f001185 = Expr.makeApplication(f000175, new Expr[] {f001184});
  private static final Expr f001186 = Expr.makeLambda("_", f000927, f001185);
  private static final Expr f001187 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("None", f001126),
            new SimpleImmutableEntry<String, Expr>("Some", f001186)
          });
  private static final Expr f001188 = Expr.makeMerge(f001187, f000002, null);
  private static final Expr f001189 = Expr.makeFieldAccess(f000002, "_2");
  private static final Expr f001190 = Expr.makeApplication(f000175, new Expr[] {f001189});
  private static final Expr f001191 = Expr.makeLambda("_", f000927, f001190);
  private static final Expr f001192 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("None", f001107),
            new SimpleImmutableEntry<String, Expr>("Some", f001191)
          });
  private static final Expr f001193 = Expr.makeMerge(f001192, f000002, null);
  private static final Expr f001194 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("_1", f001188),
            new SimpleImmutableEntry<String, Expr>("_2", f001193)
          });
  private static final Expr f001195 = Expr.makeApplication(f000780, new Expr[] {f000941});
  private static final Expr f001196 = Expr.makeLambda("_", f001195, f001194);
  private static final Expr f001197 = Expr.makeLambda("_", f000017, f001196);
  private static final Expr f001198 = Expr.makeLambda("_", f000017, f001197);
  private static final Expr f001199 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("all", f001099),
            new SimpleImmutableEntry<String, Expr>("any", f001104),
            new SimpleImmutableEntry<String, Expr>("build", f001112),
            new SimpleImmutableEntry<String, Expr>("concat", f001119),
            new SimpleImmutableEntry<String, Expr>("default", f001125),
            new SimpleImmutableEntry<String, Expr>("filter", f001134),
            new SimpleImmutableEntry<String, Expr>("fold", f001142),
            new SimpleImmutableEntry<String, Expr>("head", f001152),
            new SimpleImmutableEntry<String, Expr>("last", f001159),
            new SimpleImmutableEntry<String, Expr>("length", f001164),
            new SimpleImmutableEntry<String, Expr>("map", f001172),
            new SimpleImmutableEntry<String, Expr>("null", f001177),
            new SimpleImmutableEntry<String, Expr>("toList", f001183),
            new SimpleImmutableEntry<String, Expr>("unzip", f001198)
          });
  private static final Expr f001200 =
      Expr.makeTextLiteral(new String[] {"", "", ""}, new Expr[] {f000003, f000002});
  private static final Expr f001201 = Expr.makeLambda("_", f000183, f001200);
  private static final Expr f001202 = Expr.makeLambda("_", f000183, f001201);
  private static final Expr f001203 =
      Expr.makeApplication(f000000, new Expr[] {f000183, f000002, f000183, f001202, f000639});
  private static final Expr f001204 = Expr.makeLambda("_", f000331, f001203);
  private static final Expr f001205 =
      Expr.makeTextLiteral(new String[] {"", "", ""}, new Expr[] {f000742, f000002});
  private static final Expr f001206 = Expr.makeLambda("_", f000183, f001205);
  private static final Expr f001207 = Expr.makeLambda("_", f000014, f001206);
  private static final Expr f001208 =
      Expr.makeApplication(f000000, new Expr[] {f000014, f000002, f000183, f001207, f000639});
  private static final Expr f001209 = Expr.makeLambda("_", f000201, f001208);
  private static final Expr f001210 = Expr.makePi("_", f000002, f000183);
  private static final Expr f001211 = Expr.makeLambda("_", f001210, f001209);
  private static final Expr f001212 = Expr.makeLambda("_", f000017, f001211);
  private static final Expr f001213 = Expr.makeLambda("_", f000183, f000002);
  private static final Expr f001214 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("Empty", f000639),
            new SimpleImmutableEntry<String, Expr>("NonEmpty", f001213)
          });
  private static final Expr f001215 =
      Expr.makeUnionType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("Empty", null),
            new SimpleImmutableEntry<String, Expr>("NonEmpty", f000183)
          });
  private static final Expr f001216 = Expr.makeFieldAccess(f001215, "NonEmpty");
  private static final Expr f001217 = Expr.makeApplication(f001216, new Expr[] {f000742});
  private static final Expr f001218 = Expr.makeApplication(f000052, new Expr[] {f000014});
  private static final Expr f001219 = Expr.makeIdentifier("_", 6);
  private static final Expr f001220 =
      Expr.makeTextLiteral(new String[] {"", "", "", ""}, new Expr[] {f001218, f001219, f000002});
  private static final Expr f001221 = Expr.makeApplication(f001216, new Expr[] {f001220});
  private static final Expr f001222 = Expr.makeLambda("_", f000183, f001221);
  private static final Expr f001223 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("Empty", f001217),
            new SimpleImmutableEntry<String, Expr>("NonEmpty", f001222)
          });
  private static final Expr f001224 = Expr.makeMerge(f001223, f000002, null);
  private static final Expr f001225 = Expr.makeLambda("_", f001215, f001224);
  private static final Expr f001226 = Expr.makeLambda("_", f000014, f001225);
  private static final Expr f001227 = Expr.makeFieldAccess(f001215, "Empty");
  private static final Expr f001228 =
      Expr.makeApplication(f000000, new Expr[] {f000014, f000002, f001215, f001226, f001227});
  private static final Expr f001229 = Expr.makeMerge(f001214, f001228, null);
  private static final Expr f001230 = Expr.makeLambda("_", f000201, f001229);
  private static final Expr f001231 = Expr.makeLambda("_", f001210, f001230);
  private static final Expr f001232 = Expr.makeLambda("_", f000017, f001231);
  private static final Expr f001233 = Expr.makeLambda("_", f000183, f001232);
  private static final Expr f001234 = Expr.makeApplication(f001216, new Expr[] {f000003});
  private static final Expr f001235 =
      Expr.makeTextLiteral(new String[] {"", "", "", ""}, new Expr[] {f000014, f000052, f000002});
  private static final Expr f001236 = Expr.makeApplication(f001216, new Expr[] {f001235});
  private static final Expr f001237 = Expr.makeLambda("_", f000183, f001236);
  private static final Expr f001238 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("Empty", f001234),
            new SimpleImmutableEntry<String, Expr>("NonEmpty", f001237)
          });
  private static final Expr f001239 = Expr.makeMerge(f001238, f000002, null);
  private static final Expr f001240 = Expr.makeLambda("_", f001215, f001239);
  private static final Expr f001241 = Expr.makeLambda("_", f000183, f001240);
  private static final Expr f001242 =
      Expr.makeApplication(f000000, new Expr[] {f000183, f000002, f001215, f001241, f001227});
  private static final Expr f001243 = Expr.makeMerge(f001214, f001242, null);
  private static final Expr f001244 = Expr.makeLambda("_", f000331, f001243);
  private static final Expr f001245 = Expr.makeLambda("_", f000183, f001244);
  private static final Expr f001246 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("None", f000639),
            new SimpleImmutableEntry<String, Expr>("Some", f001213)
          });
  private static final Expr f001247 = Expr.makeMerge(f001246, f000002, null);
  private static final Expr f001248 = Expr.makeApplication(f000780, new Expr[] {f000183});
  private static final Expr f001249 = Expr.makeLambda("_", f001248, f001247);
  private static final Expr f001250 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("None", f000639),
            new SimpleImmutableEntry<String, Expr>("Some", f000003)
          });
  private static final Expr f001251 = Expr.makeMerge(f001250, f000002, null);
  private static final Expr f001252 = Expr.makeLambda("_", f001096, f001251);
  private static final Expr f001253 = Expr.makeLambda("_", f001210, f001252);
  private static final Expr f001254 = Expr.makeLambda("_", f000017, f001253);
  private static final Expr f001255 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("concat", f001204),
            new SimpleImmutableEntry<String, Expr>("concatMap", f001212),
            new SimpleImmutableEntry<String, Expr>("concatMapSep", f001233),
            new SimpleImmutableEntry<String, Expr>("concatSep", f001245),
            new SimpleImmutableEntry<String, Expr>("default", f001249),
            new SimpleImmutableEntry<String, Expr>("defaultMap", f001254),
            new SimpleImmutableEntry<String, Expr>("show", f000519)
          });
  private static final Expr f001256 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("mapKey", f000183),
            new SimpleImmutableEntry<String, Expr>("mapValue", f000183)
          });
  private static final Expr f001257 = Expr.makeApplication(f000009, new Expr[] {f001256});
  private static final Expr f001258 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("attributes", f001257),
            new SimpleImmutableEntry<String, Expr>("content", f000187),
            new SimpleImmutableEntry<String, Expr>("name", f000183)
          });
  private static final Expr f001259 = Expr.makePi("_", f001258, f000003);
  private static final Expr f001260 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("element", f001259),
            new SimpleImmutableEntry<String, Expr>("text", f000196)
          });
  private static final Expr f001261 = Expr.makePi("_", f001260, f000003);
  private static final Expr f001262 = Expr.makePi("_", f000017, f001261);
  private static final Expr f001263 = Expr.makeFieldAccess(f000002, "element");
  private static final Expr f001264 = Expr.makeFieldAccess(f000014, "attributes");
  private static final Expr f001265 = Expr.makeFieldAccess(f000014, "content");
  private static final Expr f001266 = Expr.makeLambda("_", f001262, f000206);
  private static final Expr f001267 =
      Expr.makeApplication(f000000, new Expr[] {f001262, f001265, f000201, f001266, f000208});
  private static final Expr f001268 = Expr.makeFieldAccess(f000014, "name");
  private static final Expr f001269 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("attributes", f001264),
            new SimpleImmutableEntry<String, Expr>("content", f001267),
            new SimpleImmutableEntry<String, Expr>("name", f001268)
          });
  private static final Expr f001270 = Expr.makeApplication(f001263, new Expr[] {f001269});
  private static final Expr f001271 = Expr.makeLambda("_", f001260, f001270);
  private static final Expr f001272 = Expr.makeLambda("_", f000017, f001271);
  private static final Expr f001273 = Expr.makeApplication(f000009, new Expr[] {f001262});
  private static final Expr f001274 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("attributes", f001257),
            new SimpleImmutableEntry<String, Expr>("content", f001273),
            new SimpleImmutableEntry<String, Expr>("name", f000183)
          });
  private static final Expr f001275 = Expr.makeLambda("_", f001274, f001272);
  private static final Expr f001276 = Expr.makeEmptyListLiteral(f001257);
  private static final Expr f001277 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("attributes", f001264),
            new SimpleImmutableEntry<String, Expr>("content", f000208),
            new SimpleImmutableEntry<String, Expr>("name", f001268)
          });
  private static final Expr f001278 = Expr.makeApplication(f001263, new Expr[] {f001277});
  private static final Expr f001279 = Expr.makeLambda("_", f001260, f001278);
  private static final Expr f001280 = Expr.makeLambda("_", f000017, f001279);
  private static final Expr f001281 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("attributes", f001257),
            new SimpleImmutableEntry<String, Expr>("name", f000183)
          });
  private static final Expr f001282 = Expr.makeLambda("_", f001281, f001280);
  private static final Expr f001283 = Expr.makeFieldAccess(f000002, "name");
  private static final Expr f001284 = Expr.makeFieldAccess(f000002, "attributes");
  private static final Expr f001285 =
      Expr.makeTextLiteral(
          new String[] {" ", "=\"", "\"", ""}, new Expr[] {f000248, f000249, f000002});
  private static final Expr f001286 = Expr.makeLambda("_", f000183, f001285);
  private static final Expr f001287 = Expr.makeLambda("_", f001256, f001286);
  private static final Expr f001288 =
      Expr.makeApplication(f000000, new Expr[] {f001256, f001284, f000183, f001287, f000639});
  private static final Expr f001289 = Expr.makeFieldAccess(f000002, "content");
  private static final Expr f001290 = Expr.makeApplication(f000343, new Expr[] {f000183, f001289});
  private static final Expr f001291 = Expr.makeApplication(f000063, new Expr[] {f001290});
  private static final Expr f001292 = Expr.makeTextLiteral("/>");
  private static final Expr f001293 =
      Expr.makeApplication(f000000, new Expr[] {f000183, f001289, f000183, f001202, f000639});
  private static final Expr f001294 =
      Expr.makeTextLiteral(new String[] {">", "</", ">"}, new Expr[] {f001293, f001283});
  private static final Expr f001295 = Expr.makeIf(f001291, f001292, f001294);
  private static final Expr f001296 =
      Expr.makeTextLiteral(new String[] {"<", "", "", ""}, new Expr[] {f001283, f001288, f001295});
  private static final Expr f001297 =
      Expr.makeRecordType(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("attributes", f001257),
            new SimpleImmutableEntry<String, Expr>("content", f000331),
            new SimpleImmutableEntry<String, Expr>("name", f000183)
          });
  private static final Expr f001298 = Expr.makeLambda("_", f001297, f001296);
  private static final Expr f001299 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("element", f001298),
            new SimpleImmutableEntry<String, Expr>("text", f001213)
          });
  private static final Expr f001300 = Expr.makeApplication(f000002, new Expr[] {f000183, f001299});
  private static final Expr f001301 = Expr.makeLambda("_", f001262, f001300);
  private static final Expr f001302 = Expr.makeFieldAccess(f000002, "text");
  private static final Expr f001303 = Expr.makeApplication(f001302, new Expr[] {f000014});
  private static final Expr f001304 = Expr.makeLambda("_", f001260, f001303);
  private static final Expr f001305 = Expr.makeLambda("_", f000017, f001304);
  private static final Expr f001306 = Expr.makeLambda("_", f000183, f001305);
  private static final Expr f001307 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("Type", f001262),
            new SimpleImmutableEntry<String, Expr>("attribute", f000232),
            new SimpleImmutableEntry<String, Expr>("element", f001275),
            new SimpleImmutableEntry<String, Expr>("emptyAttributes", f001276),
            new SimpleImmutableEntry<String, Expr>("leaf", f001282),
            new SimpleImmutableEntry<String, Expr>("render", f001301),
            new SimpleImmutableEntry<String, Expr>("text", f001306)
          });
  private static final Expr f001308 =
      Expr.makeRecordLiteral(
          new Entry[] {
            new SimpleImmutableEntry<String, Expr>("Bool", f000047),
            new SimpleImmutableEntry<String, Expr>("Double", f000049),
            new SimpleImmutableEntry<String, Expr>("Function", f000062),
            new SimpleImmutableEntry<String, Expr>("Integer", f000182),
            new SimpleImmutableEntry<String, Expr>("JSON", f000741),
            new SimpleImmutableEntry<String, Expr>("List", f000946),
            new SimpleImmutableEntry<String, Expr>("Location", f000948),
            new SimpleImmutableEntry<String, Expr>("Map", f000995),
            new SimpleImmutableEntry<String, Expr>("Monoid", f000996),
            new SimpleImmutableEntry<String, Expr>("Natural", f001093),
            new SimpleImmutableEntry<String, Expr>("Optional", f001199),
            new SimpleImmutableEntry<String, Expr>("Text", f001255),
            new SimpleImmutableEntry<String, Expr>("XML", f001307)
          });

  public static final Expr instance = f001308;
}
