package r2;

import android.animation.ValueAnimator;
import q2.b;
import q2.f;

public final class e extends q2.a {

    public class a extends b {
        public a() {
            setAlpha(0);
        }

        public final ValueAnimator d() {
            float[] fArr = {0.0f, 0.39f, 0.4f, 1.0f};
            o2.b bVar = new o2.b(this);
            bVar.e(fArr, f.A, new Integer[]{0, 0, 255, 0});
            bVar.f10525c = 1200;
            bVar.b(fArr);
            return bVar.a();
        }
    }

    public final f[] l() {
        a[] aVarArr = new a[12];
        for (int i10 = 0; i10 < 12; i10++) {
            a aVar = new a();
            aVarArr[i10] = aVar;
            aVar.f11180f = i10 * 100;
        }
        return aVarArr;
    }
}
