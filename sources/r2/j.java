package r2;

import android.animation.ValueAnimator;
import android.view.animation.PathInterpolator;
import o2.b;
import p2.a;
import q2.d;
import q2.f;

public final class j extends d {
    public j() {
        g(0.0f);
    }

    public final ValueAnimator d() {
        float[] fArr = {0.0f, 0.7f, 1.0f};
        b bVar = new b(this);
        Float valueOf = Float.valueOf(1.0f);
        bVar.d(fArr, f.f11174z, new Float[]{Float.valueOf(0.0f), valueOf, valueOf});
        bVar.e(fArr, f.A, new Integer[]{255, 178, 0});
        bVar.f10525c = 1000;
        a aVar = new a(new PathInterpolator(0.21f, 0.53f, 0.56f, 0.8f), new float[0]);
        aVar.f10656b = fArr;
        bVar.f10524b = aVar;
        return bVar.a();
    }
}
