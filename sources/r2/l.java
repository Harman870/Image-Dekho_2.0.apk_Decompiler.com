package r2;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import o2.b;
import q2.c;
import q2.f;

public final class l extends c {
    public final ValueAnimator d() {
        float[] fArr = {0.0f, 0.5f, 1.0f};
        b bVar = new b(this);
        bVar.e(fArr, f.f11170t, new Integer[]{0, -180, -180});
        bVar.e(fArr, f.f11171v, new Integer[]{0, 0, -180});
        bVar.f10525c = 1200;
        bVar.b(fArr);
        return bVar.a();
    }

    public final void onBoundsChange(Rect rect) {
        Rect a10 = f.a(rect);
        f(a10.left, a10.top, a10.right, a10.bottom);
    }
}
