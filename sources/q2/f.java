package q2;

import android.animation.ValueAnimator;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

public abstract class f extends Drawable implements ValueAnimator.AnimatorUpdateListener, Animatable, Drawable.Callback {
    public static final b A = new b();

    /* renamed from: s  reason: collision with root package name */
    public static final Rect f11169s = new Rect();

    /* renamed from: t  reason: collision with root package name */
    public static final c f11170t = new c();
    public static final d u = new d();

    /* renamed from: v  reason: collision with root package name */
    public static final e f11171v = new e();
    public static final h w = new h();

    /* renamed from: x  reason: collision with root package name */
    public static final i f11172x = new i();

    /* renamed from: y  reason: collision with root package name */
    public static final k f11173y = new k();

    /* renamed from: z  reason: collision with root package name */
    public static final a f11174z = new a();

    /* renamed from: a  reason: collision with root package name */
    public float f11175a = 1.0f;

    /* renamed from: b  reason: collision with root package name */
    public float f11176b = 1.0f;

    /* renamed from: c  reason: collision with root package name */
    public float f11177c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f11178d;

    /* renamed from: e  reason: collision with root package name */
    public float f11179e;

    /* renamed from: f  reason: collision with root package name */
    public int f11180f;

    /* renamed from: g  reason: collision with root package name */
    public int f11181g;

    /* renamed from: h  reason: collision with root package name */
    public int f11182h;

    /* renamed from: i  reason: collision with root package name */
    public int f11183i;

    /* renamed from: j  reason: collision with root package name */
    public int f11184j;
    public int k;

    /* renamed from: l  reason: collision with root package name */
    public float f11185l;

    /* renamed from: m  reason: collision with root package name */
    public float f11186m;

    /* renamed from: n  reason: collision with root package name */
    public ValueAnimator f11187n;

    /* renamed from: o  reason: collision with root package name */
    public int f11188o = 255;

    /* renamed from: p  reason: collision with root package name */
    public Rect f11189p = f11169s;

    /* renamed from: q  reason: collision with root package name */
    public Camera f11190q = new Camera();

    /* renamed from: r  reason: collision with root package name */
    public Matrix f11191r = new Matrix();

    public static class a extends o2.a {
        public a() {
            super("scale", 0);
        }

        public final void b(Object obj, float f10) {
            ((f) obj).g(f10);
        }

        public final Object get(Object obj) {
            return Float.valueOf(((f) obj).f11175a);
        }
    }

    public static class b extends o2.a {
        public b() {
            super("alpha", 1);
        }

        public final void a(int i10, Object obj) {
            ((f) obj).setAlpha(i10);
        }

        public final Object get(Object obj) {
            return Integer.valueOf(((f) obj).f11188o);
        }
    }

    public static class c extends o2.a {
        public c() {
            super("rotateX", 1);
        }

        public final void a(int i10, Object obj) {
            ((f) obj).f11181g = i10;
        }

        public final Object get(Object obj) {
            return Integer.valueOf(((f) obj).f11181g);
        }
    }

    public static class d extends o2.a {
        public d() {
            super("rotate", 1);
        }

        public final void a(int i10, Object obj) {
            ((f) obj).k = i10;
        }

        public final Object get(Object obj) {
            return Integer.valueOf(((f) obj).k);
        }
    }

    public static class e extends o2.a {
        public e() {
            super("rotateY", 1);
        }

        public final void a(int i10, Object obj) {
            ((f) obj).f11182h = i10;
        }

        public final Object get(Object obj) {
            return Integer.valueOf(((f) obj).f11182h);
        }
    }

    /* renamed from: q2.f$f  reason: collision with other inner class name */
    public static class C0131f extends o2.a {
        public C0131f() {
            super("translateX", 1);
        }

        public final void a(int i10, Object obj) {
            ((f) obj).f11183i = i10;
        }

        public final Object get(Object obj) {
            return Integer.valueOf(((f) obj).f11183i);
        }
    }

    public static class g extends o2.a {
        public g() {
            super("translateY", 1);
        }

        public final void a(int i10, Object obj) {
            ((f) obj).f11184j = i10;
        }

        public final Object get(Object obj) {
            return Integer.valueOf(((f) obj).f11184j);
        }
    }

    public static class h extends o2.a {
        public h() {
            super("translateXPercentage", 0);
        }

        public final void b(Object obj, float f10) {
            ((f) obj).f11185l = f10;
        }

        public final Object get(Object obj) {
            return Float.valueOf(((f) obj).f11185l);
        }
    }

    public static class i extends o2.a {
        public i() {
            super("translateYPercentage", 0);
        }

        public final void b(Object obj, float f10) {
            ((f) obj).f11186m = f10;
        }

        public final Object get(Object obj) {
            return Float.valueOf(((f) obj).f11186m);
        }
    }

    public static class j extends o2.a {
        public j() {
            super("scaleX", 0);
        }

        public final void b(Object obj, float f10) {
            ((f) obj).f11176b = f10;
        }

        public final Object get(Object obj) {
            return Float.valueOf(((f) obj).f11176b);
        }
    }

    public static class k extends o2.a {
        public k() {
            super("scaleY", 0);
        }

        public final void b(Object obj, float f10) {
            ((f) obj).f11177c = f10;
        }

        public final Object get(Object obj) {
            return Float.valueOf(((f) obj).f11177c);
        }
    }

    static {
        new C0131f();
        new g();
        new j();
    }

    public static Rect a(Rect rect) {
        int min = Math.min(rect.width(), rect.height());
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        int i10 = min / 2;
        return new Rect(centerX - i10, centerY - i10, centerX + i10, centerY + i10);
    }

    public abstract void b(Canvas canvas);

    public abstract int c();

    public abstract ValueAnimator d();

    public void draw(Canvas canvas) {
        int i10 = this.f11183i;
        if (i10 == 0) {
            i10 = (int) (((float) getBounds().width()) * this.f11185l);
        }
        int i11 = this.f11184j;
        if (i11 == 0) {
            i11 = (int) (((float) getBounds().height()) * this.f11186m);
        }
        canvas.translate((float) i10, (float) i11);
        canvas.scale(this.f11176b, this.f11177c, this.f11178d, this.f11179e);
        canvas.rotate((float) this.k, this.f11178d, this.f11179e);
        if (!(this.f11181g == 0 && this.f11182h == 0)) {
            this.f11190q.save();
            this.f11190q.rotateX((float) this.f11181g);
            this.f11190q.rotateY((float) this.f11182h);
            this.f11190q.getMatrix(this.f11191r);
            this.f11191r.preTranslate(-this.f11178d, -this.f11179e);
            this.f11191r.postTranslate(this.f11178d, this.f11179e);
            this.f11190q.restore();
            canvas.concat(this.f11191r);
        }
        b(canvas);
    }

    public abstract void e(int i10);

    public final void f(int i10, int i11, int i12, int i13) {
        Rect rect = new Rect(i10, i11, i12, i13);
        this.f11189p = rect;
        this.f11178d = (float) rect.centerX();
        this.f11179e = (float) this.f11189p.centerY();
    }

    public final void g(float f10) {
        this.f11175a = f10;
        this.f11176b = f10;
        this.f11177c = f10;
    }

    public final int getAlpha() {
        return this.f11188o;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isRunning() {
        ValueAnimator valueAnimator = this.f11187n;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        f(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
    }

    public void setAlpha(int i10) {
        this.f11188o = i10;
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void start() {
        boolean z9;
        ValueAnimator valueAnimator = this.f11187n;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            if (this.f11187n == null) {
                this.f11187n = d();
            }
            ValueAnimator valueAnimator2 = this.f11187n;
            if (valueAnimator2 != null) {
                valueAnimator2.addUpdateListener(this);
                this.f11187n.setStartDelay((long) this.f11180f);
            }
            ValueAnimator valueAnimator3 = this.f11187n;
            this.f11187n = valueAnimator3;
            if (valueAnimator3 != null) {
                if (!valueAnimator3.isStarted()) {
                    valueAnimator3.start();
                }
                invalidateSelf();
            }
        }
    }

    public void stop() {
        boolean z9;
        ValueAnimator valueAnimator = this.f11187n;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            this.f11187n.removeAllUpdateListeners();
            this.f11187n.end();
            this.f11175a = 1.0f;
            this.f11181g = 0;
            this.f11182h = 0;
            this.f11183i = 0;
            this.f11184j = 0;
            this.k = 0;
            this.f11185l = 0.0f;
            this.f11186m = 0.0f;
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }
}
