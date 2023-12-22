package e7;

import g7.k;
import java.math.BigInteger;

public final class p extends l {

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?>[] f6211b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: a  reason: collision with root package name */
    public Object f6212a;

    public p(Boolean bool) {
        j(bool);
    }

    public p(Number number) {
        j(number);
    }

    public p(String str) {
        j(str);
    }

    public static boolean i(p pVar) {
        Object obj = pVar.f6212a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final boolean d() {
        Object obj = this.f6212a;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(h());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f6212a == null) {
            return pVar.f6212a == null;
        }
        if (i(this) && i(pVar)) {
            return g().longValue() == pVar.g().longValue();
        }
        Object obj2 = this.f6212a;
        if (!(obj2 instanceof Number) || !(pVar.f6212a instanceof Number)) {
            return obj2.equals(pVar.f6212a);
        }
        double doubleValue = g().doubleValue();
        double doubleValue2 = pVar.g().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public final Number g() {
        Object obj = this.f6212a;
        return obj instanceof String ? new k((String) obj) : (Number) obj;
    }

    public final String h() {
        Object obj = this.f6212a;
        if (obj instanceof Number) {
            return g().toString();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        }
        return (String) obj;
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (this.f6212a == null) {
            return 31;
        }
        if (i(this)) {
            doubleToLongBits = g().longValue();
        } else {
            Object obj = this.f6212a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(g().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r0 != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof java.lang.Character
            if (r0 == 0) goto L_0x0011
            java.lang.Character r8 = (java.lang.Character) r8
            char r8 = r8.charValue()
            java.lang.String r8 = java.lang.String.valueOf(r8)
        L_0x000e:
            r7.f6212a = r8
            goto L_0x003c
        L_0x0011:
            boolean r0 = r8 instanceof java.lang.Number
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0037
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto L_0x001d
        L_0x001b:
            r0 = r2
            goto L_0x0035
        L_0x001d:
            java.lang.Class r0 = r8.getClass()
            java.lang.Class<?>[] r3 = f6211b
            r4 = 16
            r5 = r1
        L_0x0026:
            if (r5 >= r4) goto L_0x0034
            r6 = r3[r5]
            boolean r6 = r6.isAssignableFrom(r0)
            if (r6 == 0) goto L_0x0031
            goto L_0x001b
        L_0x0031:
            int r5 = r5 + 1
            goto L_0x0026
        L_0x0034:
            r0 = r1
        L_0x0035:
            if (r0 == 0) goto L_0x0038
        L_0x0037:
            r1 = r2
        L_0x0038:
            c6.b.m(r1)
            goto L_0x000e
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.p.j(java.lang.Object):void");
    }
}
