package v5;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import r5.f;

public class i extends f {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f12539z = 0;

    /* renamed from: y  reason: collision with root package name */
    public a f12540y;

    public static final class a extends f.b {

        /* renamed from: v  reason: collision with root package name */
        public final RectF f12541v;

        public a(r5.i iVar, RectF rectF) {
            super(iVar);
            this.f12541v = rectF;
        }

        public final Drawable newDrawable() {
            b bVar = new b(this);
            bVar.invalidateSelf();
            return bVar;
        }

        public a(a aVar) {
            super((f.b) aVar);
            this.f12541v = aVar.f12541v;
        }
    }

    @TargetApi(18)
    public static class b extends i {
        public b(a aVar) {
            super(aVar);
        }

        public final void g(Canvas canvas) {
            if (this.f12540y.f12541v.isEmpty()) {
                super.g(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.f12540y.f12541v);
            } else {
                canvas.clipRect(this.f12540y.f12541v, Region.Op.DIFFERENCE);
            }
            super.g(canvas);
            canvas.restore();
        }
    }

    public i(a aVar) {
        super((f.b) aVar);
        this.f12540y = aVar;
    }

    public final Drawable mutate() {
        this.f12540y = new a(this.f12540y);
        return this;
    }

    public final void o(float f10, float f11, float f12, float f13) {
        RectF rectF = this.f12540y.f12541v;
        if (f10 != rectF.left || f11 != rectF.top || f12 != rectF.right || f13 != rectF.bottom) {
            rectF.set(f10, f11, f12, f13);
            invalidateSelf();
        }
    }
}
