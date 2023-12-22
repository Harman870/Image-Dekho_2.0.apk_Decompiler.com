package r5;

import android.graphics.RectF;
import java.util.Arrays;

public final class g implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f11700a;

    public g(float f10) {
        this.f11700a = f10;
    }

    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f11700a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f11700a == ((g) obj).f11700a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f11700a)});
    }
}
