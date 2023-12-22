package g7;

import java.math.BigDecimal;

public final class k extends Number {

    /* renamed from: a  reason: collision with root package name */
    public final String f6611a;

    public k(String str) {
        this.f6611a = str;
    }

    public final double doubleValue() {
        return Double.parseDouble(this.f6611a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        String str = this.f6611a;
        String str2 = ((k) obj).f6611a;
        return str == str2 || str.equals(str2);
    }

    public final float floatValue() {
        return Float.parseFloat(this.f6611a);
    }

    public final int hashCode() {
        return this.f6611a.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r2.f6611a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return new java.math.BigDecimal(r2.f6611a).intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int intValue() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f6611a     // Catch:{ NumberFormatException -> 0x0007 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.String r0 = r2.f6611a     // Catch:{ NumberFormatException -> 0x000f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r0 = (int) r0
            return r0
        L_0x000f:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.f6611a
            r0.<init>(r1)
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.k.intValue():int");
    }

    public final long longValue() {
        try {
            return Long.parseLong(this.f6611a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f6611a).longValue();
        }
    }

    public final String toString() {
        return this.f6611a;
    }
}
