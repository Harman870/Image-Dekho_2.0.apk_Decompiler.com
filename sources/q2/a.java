package q2;

import android.graphics.Canvas;
import android.graphics.Rect;

public abstract class a extends g {
    public final void h(Canvas canvas) {
        for (int i10 = 0; i10 < j(); i10++) {
            f i11 = i(i10);
            int save = canvas.save();
            canvas.rotate((float) ((i10 * 360) / j()), (float) getBounds().centerX(), (float) getBounds().centerY());
            i11.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect a10 = f.a(rect);
        int width = (int) (((((double) a10.width()) * 3.141592653589793d) / 3.5999999046325684d) / ((double) j()));
        int centerX = a10.centerX() - width;
        int centerX2 = a10.centerX() + width;
        for (int i10 = 0; i10 < j(); i10++) {
            f i11 = i(i10);
            int i12 = a10.top;
            i11.f(centerX, i12, centerX2, (width * 2) + i12);
        }
    }
}
