package r2;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import o2.b;
import q2.f;
import q2.g;

public final class c extends g {

    public class a extends q2.c {
        public final ValueAnimator d() {
            float[] fArr = {0.0f, 0.35f, 0.7f, 1.0f};
            b bVar = new b(this);
            Float valueOf = Float.valueOf(1.0f);
            bVar.d(fArr, f.f11174z, new Float[]{valueOf, Float.valueOf(0.0f), valueOf, valueOf});
            bVar.f10525c = 1300;
            bVar.b(fArr);
            return bVar.a();
        }
    }

    public final f[] l() {
        int[] iArr = {200, 300, 400, 100, 200, 300, 0, 100, 200};
        a[] aVarArr = new a[9];
        for (int i10 = 0; i10 < 9; i10++) {
            a aVar = new a();
            aVarArr[i10] = aVar;
            aVar.f11180f = iArr[i10];
        }
        return aVarArr;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect a10 = f.a(rect);
        int width = (int) (((float) a10.width()) * 0.33f);
        int height = (int) (((float) a10.height()) * 0.33f);
        for (int i10 = 0; i10 < j(); i10++) {
            int i11 = ((i10 % 3) * width) + a10.left;
            int i12 = ((i10 / 3) * height) + a10.top;
            i(i10).f(i11, i12, i11 + width, i12 + height);
        }
    }
}
