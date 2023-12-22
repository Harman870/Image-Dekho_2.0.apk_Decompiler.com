package p2;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

public final class a implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public TimeInterpolator f10655a;

    /* renamed from: b  reason: collision with root package name */
    public float[] f10656b;

    public a(PathInterpolator pathInterpolator, float... fArr) {
        this.f10655a = pathInterpolator;
        this.f10656b = fArr;
    }

    public final float getInterpolation(float f10) {
        if (this.f10656b.length > 1) {
            int i10 = 0;
            while (true) {
                float[] fArr = this.f10656b;
                if (i10 >= fArr.length - 1) {
                    break;
                }
                float f11 = fArr[i10];
                i10++;
                float f12 = fArr[i10];
                float f13 = f12 - f11;
                if (f10 >= f11 && f10 <= f12) {
                    return (this.f10655a.getInterpolation((f10 - f11) / f13) * f13) + f11;
                }
            }
        }
        return this.f10655a.getInterpolation(f10);
    }
}
