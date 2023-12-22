package l0;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import h0.l0;
import h0.y;
import java.util.WeakHashMap;

public abstract class a implements View.OnTouchListener {

    /* renamed from: q  reason: collision with root package name */
    public static final int f9174q = ViewConfiguration.getTapTimeout();

    /* renamed from: a  reason: collision with root package name */
    public final C0111a f9175a;

    /* renamed from: b  reason: collision with root package name */
    public final AccelerateInterpolator f9176b = new AccelerateInterpolator();

    /* renamed from: c  reason: collision with root package name */
    public final View f9177c;

    /* renamed from: d  reason: collision with root package name */
    public b f9178d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f9179e = {0.0f, 0.0f};

    /* renamed from: f  reason: collision with root package name */
    public float[] f9180f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: g  reason: collision with root package name */
    public int f9181g;

    /* renamed from: h  reason: collision with root package name */
    public int f9182h;

    /* renamed from: i  reason: collision with root package name */
    public float[] f9183i = {0.0f, 0.0f};

    /* renamed from: j  reason: collision with root package name */
    public float[] f9184j = {0.0f, 0.0f};
    public float[] k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: l  reason: collision with root package name */
    public boolean f9185l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f9186m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f9187n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f9188o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f9189p;

    /* renamed from: l0.a$a  reason: collision with other inner class name */
    public static class C0111a {

        /* renamed from: a  reason: collision with root package name */
        public int f9190a;

        /* renamed from: b  reason: collision with root package name */
        public int f9191b;

        /* renamed from: c  reason: collision with root package name */
        public float f9192c;

        /* renamed from: d  reason: collision with root package name */
        public float f9193d;

        /* renamed from: e  reason: collision with root package name */
        public long f9194e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        public long f9195f = 0;

        /* renamed from: g  reason: collision with root package name */
        public long f9196g = -1;

        /* renamed from: h  reason: collision with root package name */
        public float f9197h;

        /* renamed from: i  reason: collision with root package name */
        public int f9198i;

        public final float a(long j10) {
            long j11 = this.f9194e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f9196g;
            if (j12 < 0 || j10 < j12) {
                return a.b(((float) (j10 - j11)) / ((float) this.f9190a), 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f9197h;
            return (a.b(((float) (j10 - j12)) / ((float) this.f9198i), 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            boolean z9;
            a aVar = a.this;
            if (aVar.f9188o) {
                if (aVar.f9186m) {
                    aVar.f9186m = false;
                    C0111a aVar2 = aVar.f9175a;
                    aVar2.getClass();
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    aVar2.f9194e = currentAnimationTimeMillis;
                    aVar2.f9196g = -1;
                    aVar2.f9195f = currentAnimationTimeMillis;
                    aVar2.f9197h = 0.5f;
                }
                C0111a aVar3 = a.this.f9175a;
                if (aVar3.f9196g <= 0 || AnimationUtils.currentAnimationTimeMillis() <= aVar3.f9196g + ((long) aVar3.f9198i)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z9 || !a.this.e()) {
                    a.this.f9188o = false;
                    return;
                }
                a aVar4 = a.this;
                if (aVar4.f9187n) {
                    aVar4.f9187n = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    aVar4.f9177c.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (aVar3.f9195f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a10 = aVar3.a(currentAnimationTimeMillis2);
                    aVar3.f9195f = currentAnimationTimeMillis2;
                    h.b(((g) a.this).f9200r, (int) (((float) (currentAnimationTimeMillis2 - aVar3.f9195f)) * ((a10 * 4.0f) + (-4.0f * a10 * a10)) * aVar3.f9193d));
                    View view = a.this.f9177c;
                    WeakHashMap<View, l0> weakHashMap = y.f6776a;
                    y.d.m(view, this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
        }
    }

    public a(View view) {
        C0111a aVar = new C0111a();
        this.f9175a = aVar;
        this.f9177c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.k;
        float f11 = ((float) ((int) ((1575.0f * f10) + 0.5f))) / 1000.0f;
        fArr[0] = f11;
        fArr[1] = f11;
        float[] fArr2 = this.f9184j;
        float f12 = ((float) ((int) ((f10 * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f12;
        fArr2[1] = f12;
        this.f9181g = 1;
        float[] fArr3 = this.f9180f;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f9179e;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f9183i;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f9182h = f9174q;
        aVar.f9190a = 500;
        aVar.f9191b = 500;
    }

    public static float b(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f9179e
            r0 = r0[r7]
            float[] r1 = r3.f9180f
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x0025
            android.view.animation.AccelerateInterpolator r5 = r3.f9176b
            float r4 = -r4
            float r4 = r5.getInterpolation(r4)
            float r4 = -r4
            goto L_0x002f
        L_0x0025:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x0038
            android.view.animation.AccelerateInterpolator r5 = r3.f9176b
            float r4 = r5.getInterpolation(r4)
        L_0x002f:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L_0x0039
        L_0x0038:
            r4 = r2
        L_0x0039:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x003e
            return r2
        L_0x003e:
            float[] r0 = r3.f9183i
            r0 = r0[r7]
            float[] r1 = r3.f9184j
            r1 = r1[r7]
            float[] r2 = r3.k
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L_0x0053
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            return r4
        L_0x0053:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.a.a(float, float, float, int):float");
    }

    public final float c(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f9181g;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                return f10 >= 0.0f ? 1.0f - (f10 / f11) : (!this.f9188o || i10 != 1) ? 0.0f : 1.0f;
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
    }

    public final void d() {
        int i10 = 0;
        if (this.f9186m) {
            this.f9188o = false;
            return;
        }
        C0111a aVar = this.f9175a;
        aVar.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i11 = (int) (currentAnimationTimeMillis - aVar.f9194e);
        int i12 = aVar.f9191b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        aVar.f9198i = i10;
        aVar.f9197h = aVar.a(currentAnimationTimeMillis);
        aVar.f9196g = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r9 = this;
            l0.a$a r0 = r9.f9175a
            float r1 = r0.f9193d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f9192c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0053
            r4 = r9
            l0.g r4 = (l0.g) r4
            android.widget.ListView r4 = r4.f9200r
            int r5 = r4.getCount()
            if (r5 != 0) goto L_0x0023
        L_0x0021:
            r1 = r3
            goto L_0x0051
        L_0x0023:
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L_0x0041
            if (r8 < r5) goto L_0x0050
            int r6 = r6 - r2
            android.view.View r1 = r4.getChildAt(r6)
            int r1 = r1.getBottom()
            int r4 = r4.getHeight()
            if (r1 > r4) goto L_0x0050
            goto L_0x0021
        L_0x0041:
            if (r1 >= 0) goto L_0x0021
            if (r7 > 0) goto L_0x0050
            android.view.View r1 = r4.getChildAt(r3)
            int r1 = r1.getTop()
            if (r1 < 0) goto L_0x0050
            goto L_0x0021
        L_0x0050:
            r1 = r2
        L_0x0051:
            if (r1 != 0) goto L_0x0054
        L_0x0053:
            r2 = r3
        L_0x0054:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.a.e():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f9189p
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x007f
        L_0x0016:
            r5.d()
            goto L_0x007f
        L_0x001a:
            r5.f9187n = r2
            r5.f9185l = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f9177c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.a(r0, r3, r4, r1)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f9177c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.a(r7, r6, r3, r2)
            l0.a$a r7 = r5.f9175a
            r7.f9192c = r0
            r7.f9193d = r6
            boolean r6 = r5.f9188o
            if (r6 != 0) goto L_0x007f
            boolean r6 = r5.e()
            if (r6 == 0) goto L_0x007f
            l0.a$b r6 = r5.f9178d
            if (r6 != 0) goto L_0x0061
            l0.a$b r6 = new l0.a$b
            r6.<init>()
            r5.f9178d = r6
        L_0x0061:
            r5.f9188o = r2
            r5.f9186m = r2
            boolean r6 = r5.f9185l
            if (r6 != 0) goto L_0x0078
            int r6 = r5.f9182h
            if (r6 <= 0) goto L_0x0078
            android.view.View r7 = r5.f9177c
            l0.a$b r0 = r5.f9178d
            long r3 = (long) r6
            java.util.WeakHashMap<android.view.View, h0.l0> r6 = h0.y.f6776a
            h0.y.d.n(r7, r0, r3)
            goto L_0x007d
        L_0x0078:
            l0.a$b r6 = r5.f9178d
            r6.run()
        L_0x007d:
            r5.f9185l = r2
        L_0x007f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
