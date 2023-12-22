package r2;

import android.animation.ValueAnimator;
import q2.f;

public final class b extends q2.a {

    public class a extends q2.b {
        public a() {
            g(0.0f);
        }

        public final ValueAnimator d() {
            float[] fArr = {0.0f, 0.5f, 1.0f};
            o2.b bVar = new o2.b(this);
            Float valueOf = Float.valueOf(0.0f);
            bVar.d(fArr, f.f11174z, new Float[]{valueOf, Float.valueOf(1.0f), valueOf});
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
