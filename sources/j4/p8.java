package j4;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import y3.a;

public final class p8 {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f8388a;

    static {
        char[] cArr = new char[80];
        f8388a = cArr;
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
                sb.append(a.N(new o6(((String) obj).getBytes(s7.f8462a))));
                sb.append('\"');
            } else if (obj instanceof q6) {
                sb.append(": \"");
                sb.append(a.N((q6) obj));
                sb.append('\"');
            } else if (obj instanceof m7) {
                sb.append(" {");
                c((m7) obj, sb, i10 + 2);
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
            sb.append(f8388a, 0, i11);
            i10 -= i11;
        }
    }

    public static void c(n8 n8Var, StringBuilder sb, int i10) {
        int i11;
        Object obj;
        String str;
        Object obj2;
        Method method;
        Method method2;
        n8 n8Var2 = n8Var;
        StringBuilder sb2 = sb;
        int i12 = i10;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = n8Var.getClass().getDeclaredMethods();
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
                obj = m7.n(n8Var2, method2, new Object[0]);
            } else if (!substring.endsWith("Map") || substring.equals("Map") || (method = (Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) hashMap.get("has".concat(substring));
                    if (method4 != null) {
                        Object n2 = m7.n(n8Var2, method4, new Object[0]);
                        if (method5 == null) {
                            if (n2 instanceof Boolean) {
                                if (!((Boolean) n2).booleanValue()) {
                                }
                            } else if (n2 instanceof Integer) {
                                if (((Integer) n2).intValue() == 0) {
                                }
                            } else if (n2 instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) n2).floatValue()) == 0) {
                                }
                            } else if (!(n2 instanceof Double)) {
                                if (n2 instanceof String) {
                                    obj2 = "";
                                } else if (n2 instanceof q6) {
                                    obj2 = q6.f8402b;
                                } else if (n2 instanceof n8) {
                                    if (n2 == ((n8) n2).b()) {
                                    }
                                } else if ((n2 instanceof Enum) && ((Enum) n2).ordinal() == 0) {
                                }
                                if (n2.equals(obj2)) {
                                }
                            } else if (Double.doubleToRawLongBits(((Double) n2).doubleValue()) == 0) {
                            }
                        } else if (!((Boolean) m7.n(n8Var2, method5, new Object[0])).booleanValue()) {
                        }
                        a(sb2, i12, substring, n2);
                    }
                }
                i11 = 3;
            } else {
                str = substring.substring(0, substring.length() - 3);
                obj = m7.n(n8Var2, method, new Object[0]);
            }
            a(sb2, i12, str, obj);
            i11 = 3;
        }
        if (!(n8Var2 instanceof j7)) {
            k9 k9Var = ((m7) n8Var2).zzc;
            if (k9Var != null) {
                for (int i14 = 0; i14 < k9Var.f8299a; i14++) {
                    a(sb2, i12, String.valueOf(k9Var.f8300b[i14] >>> 3), k9Var.f8301c[i14]);
                }
                return;
            }
            return;
        }
        j7 j7Var = (j7) n8Var2;
        throw null;
    }
}
