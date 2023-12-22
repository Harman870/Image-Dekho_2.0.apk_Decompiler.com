package r2;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.animation.LinearInterpolator;
import o2.b;
import q2.c;
import q2.g;

public final class f extends g {

    public class a extends c {
        public a() {
            setAlpha(0);
            this.f11181g = -180;
        }

        public final ValueAnimator d() {
            float[] fArr = {0.0f, 0.1f, 0.25f, 0.75f, 0.9f, 1.0f};
            b bVar = new b(this);
            bVar.e(fArr, q2.f.A, new Integer[]{0, 0, 255, 255, 0, 0});
            bVar.e(fArr, q2.f.f11170t, new Integer[]{-180, -180, 0, 0, 0, 0});
            bVar.e(fArr, q2.f.f11171v, new Integer[]{0, 0, 0, 0, 180, 180});
            bVar.f10525c = 2400;
            bVar.f10524b = new LinearInterpolator();
            return bVar.a();
        }
    }

    public final void h(Canvas canvas) {
        Rect a10 = q2.f.a(getBounds());
        for (int i10 = 0; i10 < j(); i10++) {
            int save = canvas.save();
            canvas.rotate((float) ((i10 * 90) + 45), (float) a10.centerX(), (float) a10.centerY());
            i(i10).draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public final q2.f[] l() {
        a[] aVarArr = new a[4];
        for (int i10 = 0; i10 < 4; i10++) {
            a aVar = new a();
            aVarArr[i10] = aVar;
            aVar.f11180f = i10 * 300;
        }
        return aVarArr;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect a10 = q2.f.a(rect);
        int min = Math.min(a10.width(), a10.height()) / 2;
        int i10 = a10.left + min + 1;
        int i11 = a10.top + min + 1;
        for (int i12 = 0; i12 < j(); i12++) {
            q2.f i13 = i(i12);
            i13.f(a10.left, a10.top, i10, i11);
            Rect rect2 = i13.f11189p;
            i13.f11178d = (float) rect2.right;
            i13.f11179e = (float) rect2.bottom;
        }
    }
}
