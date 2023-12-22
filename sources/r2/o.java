package r2;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import o2.b;
import q2.c;
import q2.f;
import q2.g;

public final class o extends g {

    public class a extends c {
        public a() {
            this.f11177c = 0.4f;
        }

        public final ValueAnimator d() {
            float[] fArr = {0.0f, 0.2f, 0.4f, 1.0f};
            b bVar = new b(this);
            Float valueOf = Float.valueOf(0.4f);
            bVar.d(fArr, f.f11173y, new Float[]{valueOf, Float.valueOf(1.0f), valueOf, valueOf});
            bVar.f10525c = 1200;
            bVar.b(fArr);
            return bVar.a();
        }
    }

    public final f[] l() {
        a[] aVarArr = new a[5];
        for (int i10 = 0; i10 < 5; i10++) {
            a aVar = new a();
            aVarArr[i10] = aVar;
            aVar.f11180f = (i10 * 100) + 600;
        }
        return aVarArr;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect a10 = f.a(rect);
        int width = a10.width() / j();
        int width2 = ((a10.width() / 5) * 3) / 5;
        for (int i10 = 0; i10 < j(); i10++) {
            f i11 = i(i10);
            int i12 = (width / 5) + (i10 * width) + a10.left;
            i11.f(i12, a10.top, i12 + width2, a10.bottom);
        }
    }
}
