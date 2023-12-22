package j4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import o.c;

public final class i implements p {

    /* renamed from: a  reason: collision with root package name */
    public final Double f8228a;

    public i(Double d10) {
        if (d10 == null) {
            this.f8228a = Double.valueOf(Double.NaN);
        } else {
            this.f8228a = d10;
        }
    }

    public final p a() {
        return new i(this.f8228a);
    }

    public final Double b() {
        return this.f8228a;
    }

    public final Iterator d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        return this.f8228a.equals(((i) obj).f8228a);
    }

    public final int hashCode() {
        return this.f8228a.hashCode();
    }

    public final Boolean k() {
        boolean z9 = false;
        if (!Double.isNaN(this.f8228a.doubleValue()) && this.f8228a.doubleValue() != 0.0d) {
            z9 = true;
        }
        return Boolean.valueOf(z9);
    }

    public final p l(String str, c cVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new t(zzi());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{zzi(), str}));
    }

    public final String toString() {
        return zzi();
    }

    public final String zzi() {
        if (Double.isNaN(this.f8228a.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f8228a.doubleValue())) {
            return this.f8228a.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.f8228a.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((stripTrailingZeros.scale() > 0 ? stripTrailingZeros.precision() : stripTrailingZeros.scale()) - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace("E", "e+") : stripTrailingZeros.toPlainString();
    }
}
