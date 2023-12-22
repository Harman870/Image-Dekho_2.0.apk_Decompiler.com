package q2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

public abstract class e extends f {
    public Paint B;
    public int C;
    public int D;

    public e() {
        e(-1);
        Paint paint = new Paint();
        this.B = paint;
        paint.setAntiAlias(true);
        this.B.setColor(this.C);
    }

    public final void b(Canvas canvas) {
        this.B.setColor(this.C);
        h(canvas, this.B);
    }

    public final int c() {
        return this.D;
    }

    public final void e(int i10) {
        this.D = i10;
        int i11 = this.f11188o;
        this.C = ((i10 << 8) >>> 8) | ((((i10 >>> 24) * (i11 + (i11 >> 7))) >> 8) << 24);
    }

    public abstract void h(Canvas canvas, Paint paint);

    public final void setAlpha(int i10) {
        this.f11188o = i10;
        int i11 = this.D;
        this.C = ((((i11 >>> 24) * (i10 + (i10 >> 7))) >> 8) << 24) | ((i11 << 8) >>> 8);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.B.setColorFilter(colorFilter);
    }
}
