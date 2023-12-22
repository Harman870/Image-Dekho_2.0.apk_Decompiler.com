package w0;

import android.view.animation.Interpolator;
import com.ironsource.adapters.ironsource.a;

public abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f12656a;

    /* renamed from: b  reason: collision with root package name */
    public final float f12657b;

    public d(float[] fArr) {
        this.f12656a = fArr;
        this.f12657b = 1.0f / ((float) (fArr.length - 1));
    }

    public final float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f12656a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f10), fArr.length - 2);
        float f11 = this.f12657b;
        float f12 = (f10 - (((float) min) * f11)) / f11;
        float[] fArr2 = this.f12656a;
        float f13 = fArr2[min];
        return a.e(fArr2[min + 1], f13, f12, f13);
    }
}
