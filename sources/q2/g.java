package q2;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import c.a;

public abstract class g extends f {
    public f[] B;
    public int C;

    public g() {
        f[] l6 = l();
        this.B = l6;
        if (l6 != null) {
            for (f callback : l6) {
                callback.setCallback(this);
            }
        }
        k(this.B);
    }

    public final void b(Canvas canvas) {
    }

    public final int c() {
        return this.C;
    }

    public ValueAnimator d() {
        return null;
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        h(canvas);
    }

    public final void e(int i10) {
        this.C = i10;
        for (int i11 = 0; i11 < j(); i11++) {
            i(i11).e(i10);
        }
    }

    public void h(Canvas canvas) {
        f[] fVarArr = this.B;
        if (fVarArr != null) {
            for (f draw : fVarArr) {
                int save = canvas.save();
                draw.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
    }

    public final f i(int i10) {
        f[] fVarArr = this.B;
        if (fVarArr == null) {
            return null;
        }
        return fVarArr[i10];
    }

    public final boolean isRunning() {
        return a.e(this.B) || super.isRunning();
    }

    public final int j() {
        f[] fVarArr = this.B;
        if (fVarArr == null) {
            return 0;
        }
        return fVarArr.length;
    }

    public void k(f... fVarArr) {
    }

    public abstract f[] l();

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        for (f bounds : this.B) {
            bounds.setBounds(rect);
        }
    }

    public final void start() {
        super.start();
        a.h(this.B);
    }

    public final void stop() {
        super.stop();
        a.i(this.B);
    }
}
