package q2;

import android.graphics.Canvas;
import android.graphics.Paint;

public class d extends e {
    public final void h(Canvas canvas, Paint paint) {
        if (this.f11189p != null) {
            paint.setStyle(Paint.Style.STROKE);
            int min = Math.min(this.f11189p.width(), this.f11189p.height()) / 2;
            paint.setStrokeWidth((float) (min / 12));
            canvas.drawCircle((float) this.f11189p.centerX(), (float) this.f11189p.centerY(), (float) min, paint);
        }
    }
}
