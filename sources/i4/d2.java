package i4;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class d2 {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f7249a;

    static {
        char[] cArr = new char[80];
        f7249a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object a10 : (List) obj) {
                a(sb, i10, str, a10);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry a11 : ((Map) obj).entrySet()) {
                a(sb, i10, str, a11);
            }
        } else {
            sb.append(10);
            b(i10, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i11 = 1; i11 < str.length(); i11++) {
                    char charAt = str.charAt(i11);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                d0 d0Var = e0.f7269b;
                sb.append(j3.a(new d0(((String) obj).getBytes(g1.f7324a))));
                sb.append('\"');
            } else if (obj instanceof e0) {
                sb.append(": \"");
                sb.append(j3.a((e0) obj));
                sb.append('\"');
            } else if (obj instanceof c1) {
                sb.append(" {");
                c((c1) obj, sb, i10 + 2);
                sb.append("\n");
                b(i10, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i12 = i10 + 2;
                a(sb, i12, "key", entry.getKey());
                a(sb, i12, "value", entry.getValue());
                sb.append("\n");
                b(i10, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    public static void b(int i10, StringBuilder sb) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb.append(f7249a, 0, i11);
            i10 -= i11;
        }
    }

    public static void c(b2 b2Var, StringBuilder sb, int i10) {
        int i11;
        Object obj;
        String str;
        Object obj2;
        Method method;
        Method method2;
        b2 b2Var2 = b2Var;
        StringBuilder sb2 = sb;
        int i12 = i10;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = b2Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i13 = 0;
        while (true) {
            i11 = 3;
            if (i13 >= length) {
                break;
            }
            Method method3 = declaredMethods[i13];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i13++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i11);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                str = substring.substring(0, substring.length() - 4);
                obj = c1.b(b2Var2, method2, new Object[0]);
            } else if (!substring.endsWith("Map") || substring.equals("Map") || (method = (Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) hashMap.get("has".concat(substring));
                    if (method4 != null) {
                        Object b10 = c1.b(b2Var2, method4, new Object[0]);
                        if (method5 == null) {
                            if (b10 instanceof Boolean) {
                                if (!((Boolean) b10).booleanValue()) {
                                }
                            } else if (b10 instanceof Integer) {
                                if (((Integer) b10).intValue() == 0) {
                                }
                            } else if (b10 instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) b10).floatValue()) == 0) {
                                }
                            } else if (!(b10 instanceof Double)) {
                                if (b10 instanceof String) {
                                    obj2 = "";
                                } else if (b10 instanceof e0) {
                                    obj2 = e0.f7269b;
                                } else if (b10 instanceof b2) {
                                    if (b10 == ((b2) b10).g()) {
                                    }
                                } else if ((b10 instanceof Enum) && ((Enum) b10).ordinal() == 0) {
                                }
                                if (b10.equals(obj2)) {
                                }
                            } else if (Double.doubleToRawLongBits(((Double) b10).doubleValue()) == 0) {
                            }
                        } else if (!((Boolean) c1.b(b2Var2, method5, new Object[0])).booleanValue()) {
                        }
                        a(sb2, i12, substring, b10);
                    }
                }
                i11 = 3;
            } else {
                str = substring.substring(0, substring.length() - 3);
                obj = c1.b(b2Var2, method, new Object[0]);
            }
            a(sb2, i12, str, obj);
            i11 = 3;
        }
        if (!(b2Var2 instanceof a1)) {
            y2 y2Var = ((c1) b2Var2).zzc;
            if (y2Var != null) {
                for (int i14 = 0; i14 < y2Var.f7805a; i14++) {
                    a(sb2, i12, String.valueOf(y2Var.f7806b[i14] >>> 3), y2Var.f7807c[i14]);
                }
                return;
            }
            return;
        }
        a1 a1Var = (a1) b2Var2;
        throw null;
    }
}
