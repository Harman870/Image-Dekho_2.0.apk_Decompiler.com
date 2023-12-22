package s4;

import android.animation.TypeEvaluator;
import com.ironsource.adapters.ironsource.a;

public final class b implements TypeEvaluator<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f11860a = new b();

    public final Object evaluate(float f10, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f11 = ((float) ((intValue >> 24) & 255)) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow((double) (((float) ((intValue >> 16) & 255)) / 255.0f), 2.2d);
        float pow2 = (float) Math.pow((double) (((float) ((intValue >> 8) & 255)) / 255.0f), 2.2d);
        float pow3 = (float) Math.pow((double) (((float) (intValue & 255)) / 255.0f), 2.2d);
        float pow4 = (float) Math.pow((double) (((float) ((intValue2 >> 16) & 255)) / 255.0f), 2.2d);
        float e10 = a.e(((float) ((intValue2 >> 24) & 255)) / 255.0f, f11, f10, f11);
        float e11 = a.e(pow4, pow, f10, pow);
        float e12 = a.e((float) Math.pow((double) (((float) ((intValue2 >> 8) & 255)) / 255.0f), 2.2d), pow2, f10, pow2);
        float e13 = a.e((float) Math.pow((double) (((float) (intValue2 & 255)) / 255.0f), 2.2d), pow3, f10, pow3);
        int round = Math.round(((float) Math.pow((double) e11, 0.45454545454545453d)) * 255.0f) << 16;
        return Integer.valueOf(Math.round(((float) Math.pow((double) e13, 0.45454545454545453d)) * 255.0f) | round | (Math.round(e10 * 255.0f) << 24) | (Math.round(((float) Math.pow((double) e12, 0.45454545454545453d)) * 255.0f) << 8));
    }
}
