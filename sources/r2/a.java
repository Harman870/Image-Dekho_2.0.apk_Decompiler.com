package r2;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.animation.LinearInterpolator;
import q2.b;
import q2.f;
import q2.g;

public final class a extends g {

    /* renamed from: r2.a$a  reason: collision with other inner class name */
    public class C0135a extends b {
        public C0135a() {
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

    public final ValueAnimator d() {
        o2.b bVar = new o2.b(this);
        bVar.e(new float[]{0.0f, 1.0f}, f.u, new Integer[]{0, 360});
        bVar.f10525c = 2000;
        bVar.f10524b = new LinearInterpolator();
        return bVar.a();
    }

    public final void k(f... fVarArr) {
        fVarArr[1].f11180f = 1000;
    }

    public final f[] l() {
        return new f[]{new C0135a(), new C0135a()};
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect a10 = f.a(rect);
        int width = (int) (((float) a10.width()) * 0.6f);
        f i10 = i(0);
        int i11 = a10.right;
        int i12 = a10.top;
        i10.f(i11 - width, i12, i11, i12 + width);
        f i13 = i(1);
        int i14 = a10.right;
        int i15 = a10.bottom;
        i13.f(i14 - width, i15 - width, i14, i15);
    }
}
