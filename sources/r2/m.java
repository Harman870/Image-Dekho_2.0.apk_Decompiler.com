package r2;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import q2.b;
import q2.f;
import q2.g;

public final class m extends g {

    public class a extends b {
        public a() {
            g(0.0f);
        }

        public final ValueAnimator d() {
            float[] fArr = {0.0f, 0.4f, 0.8f, 1.0f};
            o2.b bVar = new o2.b(this);
            Float valueOf = Float.valueOf(0.0f);
            bVar.d(fArr, f.f11174z, new Float[]{valueOf, Float.valueOf(1.0f), valueOf, valueOf});
            bVar.f10525c = 1400;
            bVar.b(fArr);
            return bVar.a();
        }
    }

    public final void k(f... fVarArr) {
        fVarArr[1].f11180f = 160;
        fVarArr[2].f11180f = 320;
    }

    public final f[] l() {
        return new f[]{new a(), new a(), new a()};
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect a10 = f.a(rect);
        int width = a10.width() / 8;
        int centerY = a10.centerY() - width;
        int centerY2 = a10.centerY() + width;
        for (int i10 = 0; i10 < j(); i10++) {
            int width2 = ((a10.width() * i10) / 3) + a10.left;
            i(i10).f(width2, centerY, (width * 2) + width2, centerY2);
        }
    }
}
