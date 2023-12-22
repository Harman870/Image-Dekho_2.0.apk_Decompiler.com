package r5;

import android.graphics.RectF;
import java.util.Arrays;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f11655a;

    public a(float f10) {
        this.f11655a = f10;
    }

    public final float a(RectF rectF) {
        return this.f11655a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f11655a == ((a) obj).f11655a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f11655a)});
    }
}
