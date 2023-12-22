package r2;

import android.animation.ValueAnimator;
import q2.b;
import q2.f;
import q2.g;

public final class d extends g {

    public class a extends b {
        public a() {
            setAlpha(153);
            g(0.0f);
        }

        public final ValueAnimator d() {
            float[] fArr = {0.0f, 0.5f, 1.0f};
            o2.b bVar = new o2.b(this);
            Float valueOf = Float.valueOf(0.0f);
            bVar.d(fArr, f.f11174z, new Float[]{valueOf, Float.valueOf(1.0f), valueOf});
            bVar.f10525c = 2000;
            bVar.b(fArr);
            return bVar.a();
        }
    }

    public final void k(f... fVarArr) {
        fVarArr[1].f11180f = 1000;
    }

    public final f[] l() {
        return new f[]{new a(), new a()};
    }
}
