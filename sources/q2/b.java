package q2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

public class b extends e {
    public final void h(Canvas canvas, Paint paint) {
        Rect rect = this.f11189p;
        if (rect != null) {
            canvas.drawCircle((float) this.f11189p.centerX(), (float) this.f11189p.centerY(), (float) (Math.min(rect.width(), this.f11189p.height()) / 2), paint);
        }
    }
}
