package i5;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

public final class b implements TypeEvaluator<Float> {

    /* renamed from: a  reason: collision with root package name */
    public FloatEvaluator f7872a = new FloatEvaluator();

    public final Object evaluate(float f10, Object obj, Object obj2) {
        float floatValue = this.f7872a.evaluate(f10, (Float) obj, (Float) obj2).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
