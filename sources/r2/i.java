package r2;

import android.animation.ValueAnimator;
import q2.b;
import q2.f;

public final class i extends b {
    public i() {
        g(0.0f);
    }

    public final ValueAnimator d() {
        float[] fArr = {0.0f, 1.0f};
        o2.b bVar = new o2.b(this);
        bVar.d(fArr, f.f11174z, new Float[]{Float.valueOf(0.0f), Float.valueOf(1.0f)});
        bVar.e(fArr, f.A, new Integer[]{255, 0});
        bVar.f10525c = 1000;
        bVar.b(fArr);
        return bVar.a();
    }
}
