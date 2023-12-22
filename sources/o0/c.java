package o0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.activity.f;
import h0.l0;
import h0.y;
import java.util.Arrays;
import java.util.WeakHashMap;

public final class c {

    /* renamed from: x  reason: collision with root package name */
    public static final a f10478x = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f10479a;

    /* renamed from: b  reason: collision with root package name */
    public int f10480b;

    /* renamed from: c  reason: collision with root package name */
    public int f10481c = -1;

    /* renamed from: d  reason: collision with root package name */
    public float[] f10482d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f10483e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f10484f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f10485g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f10486h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f10487i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f10488j;
    public int k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f10489l;

    /* renamed from: m  reason: collision with root package name */
    public float f10490m;

    /* renamed from: n  reason: collision with root package name */
    public float f10491n;

    /* renamed from: o  reason: collision with root package name */
    public int f10492o;

    /* renamed from: p  reason: collision with root package name */
    public final int f10493p;

    /* renamed from: q  reason: collision with root package name */
    public int f10494q;

    /* renamed from: r  reason: collision with root package name */
    public OverScroller f10495r;

    /* renamed from: s  reason: collision with root package name */
    public final C0121c f10496s;

    /* renamed from: t  reason: collision with root package name */
    public View f10497t;
    public boolean u;

    /* renamed from: v  reason: collision with root package name */
    public final ViewGroup f10498v;
    public final b w = new b();

    public class a implements Interpolator {
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            c.this.p(0);
        }
    }

    /* renamed from: o0.c$c  reason: collision with other inner class name */
    public static abstract class C0121c {
        public abstract int a(View view, int i10);

        public abstract int b(View view, int i10);

        public int c(View view) {
            return 0;
        }

        public int d() {
            return 0;
        }

        public void e(int i10, int i11) {
        }

        public void f() {
        }

        public void g(View view, int i10) {
        }

        public abstract void h(int i10);

        public abstract void i(View view, int i10, int i11);

        public abstract void j(View view, float f10, float f11);

        public abstract boolean k(View view, int i10);
    }

    public c(Context context, ViewGroup viewGroup, C0121c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f10498v = viewGroup;
            this.f10496s = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f10493p = i10;
            this.f10492o = i10;
            this.f10480b = viewConfiguration.getScaledTouchSlop();
            this.f10490m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f10491n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f10495r = new OverScroller(context, f10478x);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    public final void a() {
        this.f10481c = -1;
        float[] fArr = this.f10482d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f10483e, 0.0f);
            Arrays.fill(this.f10484f, 0.0f);
            Arrays.fill(this.f10485g, 0.0f);
            Arrays.fill(this.f10486h, 0);
            Arrays.fill(this.f10487i, 0);
            Arrays.fill(this.f10488j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker = this.f10489l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10489l = null;
        }
    }

    public final void b(View view, int i10) {
        if (view.getParent() == this.f10498v) {
            this.f10497t = view;
            this.f10481c = i10;
            this.f10496s.g(view, i10);
            p(1);
            return;
        }
        StringBuilder g10 = f.g("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        g10.append(this.f10498v);
        g10.append(")");
        throw new IllegalArgumentException(g10.toString());
    }

    public final boolean c(float f10, float f11, int i10, int i11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.f10486h[i10] & i11) != i11 || (this.f10494q & i11) == 0 || (this.f10488j[i10] & i11) == i11 || (this.f10487i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f10480b;
        if (abs <= ((float) i12) && abs2 <= ((float) i12)) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f10496s.getClass();
        }
        return (this.f10487i[i10] & i11) == 0 && abs > ((float) this.f10480b);
    }

    public final boolean d(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z9 = this.f10496s.c(view) > 0;
        boolean z10 = this.f10496s.d() > 0;
        if (!z9 || !z10) {
            return z9 ? Math.abs(f10) > ((float) this.f10480b) : z10 && Math.abs(f11) > ((float) this.f10480b);
        }
        float f12 = f11 * f11;
        int i10 = this.f10480b;
        return f12 + (f10 * f10) > ((float) (i10 * i10));
    }

    public final void e(int i10) {
        float[] fArr = this.f10482d;
        if (fArr != null) {
            int i11 = this.k;
            boolean z9 = true;
            int i12 = 1 << i10;
            if ((i12 & i11) == 0) {
                z9 = false;
            }
            if (z9) {
                fArr[i10] = 0.0f;
                this.f10483e[i10] = 0.0f;
                this.f10484f[i10] = 0.0f;
                this.f10485g[i10] = 0.0f;
                this.f10486h[i10] = 0;
                this.f10487i[i10] = 0;
                this.f10488j[i10] = 0;
                this.k = (~i12) & i11;
            }
        }
    }

    public final int f(int i10, int i11, int i12) {
        int i13;
        if (i10 == 0) {
            return 0;
        }
        int width = this.f10498v.getWidth();
        float f10 = (float) (width / 2);
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i10)) / ((float) width)) - 0.5f) * 0.47123894f))) * f10) + f10;
        int abs = Math.abs(i11);
        if (abs > 0) {
            i13 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
        } else {
            i13 = (int) (((((float) Math.abs(i10)) / ((float) i12)) + 1.0f) * 256.0f);
        }
        return Math.min(i13, 600);
    }

    public final boolean g() {
        if (this.f10479a == 2) {
            boolean computeScrollOffset = this.f10495r.computeScrollOffset();
            int currX = this.f10495r.getCurrX();
            int currY = this.f10495r.getCurrY();
            int left = currX - this.f10497t.getLeft();
            int top = currY - this.f10497t.getTop();
            if (left != 0) {
                View view = this.f10497t;
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f10497t;
                WeakHashMap<View, l0> weakHashMap2 = y.f6776a;
                view2.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                this.f10496s.i(this.f10497t, currX, currY);
            }
            if (computeScrollOffset && currX == this.f10495r.getFinalX() && currY == this.f10495r.getFinalY()) {
                this.f10495r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f10498v.post(this.w);
            }
        }
        if (this.f10479a == 2) {
            return true;
        }
        return false;
    }

    public final View h(int i10, int i11) {
        for (int childCount = this.f10498v.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f10498v;
            this.f10496s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            android.view.View r0 = r9.f10497t
            int r2 = r0.getLeft()
            android.view.View r0 = r9.f10497t
            int r3 = r0.getTop()
            int r4 = r10 - r2
            int r5 = r11 - r3
            r10 = 0
            if (r4 != 0) goto L_0x001e
            if (r5 != 0) goto L_0x001e
            android.widget.OverScroller r11 = r9.f10495r
            r11.abortAnimation()
            r9.p(r10)
            return r10
        L_0x001e:
            android.view.View r11 = r9.f10497t
            float r0 = r9.f10491n
            int r0 = (int) r0
            float r1 = r9.f10490m
            int r1 = (int) r1
            int r6 = java.lang.Math.abs(r12)
            if (r6 >= r0) goto L_0x002e
            r12 = r10
            goto L_0x0035
        L_0x002e:
            if (r6 <= r1) goto L_0x0035
            if (r12 <= 0) goto L_0x0034
            r12 = r1
            goto L_0x0035
        L_0x0034:
            int r12 = -r1
        L_0x0035:
            float r0 = r9.f10491n
            int r0 = (int) r0
            float r1 = r9.f10490m
            int r1 = (int) r1
            int r6 = java.lang.Math.abs(r13)
            if (r6 >= r0) goto L_0x0042
            goto L_0x0049
        L_0x0042:
            if (r6 <= r1) goto L_0x004a
            if (r13 <= 0) goto L_0x0048
            r13 = r1
            goto L_0x004a
        L_0x0048:
            int r10 = -r1
        L_0x0049:
            r13 = r10
        L_0x004a:
            int r10 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r1 = java.lang.Math.abs(r12)
            int r6 = java.lang.Math.abs(r13)
            int r7 = r1 + r6
            int r8 = r10 + r0
            if (r12 == 0) goto L_0x0063
            float r10 = (float) r1
            float r1 = (float) r7
            goto L_0x0065
        L_0x0063:
            float r10 = (float) r10
            float r1 = (float) r8
        L_0x0065:
            float r10 = r10 / r1
            if (r13 == 0) goto L_0x006b
            float r0 = (float) r6
            float r1 = (float) r7
            goto L_0x006d
        L_0x006b:
            float r0 = (float) r0
            float r1 = (float) r8
        L_0x006d:
            float r0 = r0 / r1
            o0.c$c r1 = r9.f10496s
            int r11 = r1.c(r11)
            int r11 = r9.f(r4, r12, r11)
            o0.c$c r12 = r9.f10496s
            int r12 = r12.d()
            int r12 = r9.f(r5, r13, r12)
            float r11 = (float) r11
            float r11 = r11 * r10
            float r10 = (float) r12
            float r10 = r10 * r0
            float r10 = r10 + r11
            int r6 = (int) r10
            android.widget.OverScroller r1 = r9.f10495r
            r1.startScroll(r2, r3, r4, r5, r6)
            r10 = 2
            r9.p(r10)
            r10 = 1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.c.i(int, int, int, int):boolean");
    }

    public final boolean j(int i10) {
        boolean z9;
        if ((this.k & (1 << i10)) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void k(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f10489l == null) {
            this.f10489l = VelocityTracker.obtain();
        }
        this.f10489l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f10479a != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i11 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i11);
                            if (j(pointerId)) {
                                float x9 = motionEvent.getX(i11);
                                float y9 = motionEvent.getY(i11);
                                float f10 = x9 - this.f10482d[pointerId];
                                float f11 = y9 - this.f10483e[pointerId];
                                m(pointerId, f10, f11);
                                if (this.f10479a != 1) {
                                    View h10 = h((int) x9, (int) y9);
                                    if (d(h10, f10, f11) && t(h10, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i11++;
                        }
                    } else if (j(this.f10481c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f10481c);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float y10 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f10484f;
                        int i12 = this.f10481c;
                        int i13 = (int) (x10 - fArr[i12]);
                        int i14 = (int) (y10 - this.f10485g[i12]);
                        int left = this.f10497t.getLeft() + i13;
                        int top = this.f10497t.getTop() + i14;
                        int left2 = this.f10497t.getLeft();
                        int top2 = this.f10497t.getTop();
                        if (i13 != 0) {
                            left = this.f10496s.a(this.f10497t, left);
                            WeakHashMap<View, l0> weakHashMap = y.f6776a;
                            this.f10497t.offsetLeftAndRight(left - left2);
                        }
                        if (i14 != 0) {
                            top = this.f10496s.b(this.f10497t, top);
                            WeakHashMap<View, l0> weakHashMap2 = y.f6776a;
                            this.f10497t.offsetTopAndBottom(top - top2);
                        }
                        if (!(i13 == 0 && i14 == 0)) {
                            this.f10496s.i(this.f10497t, left, top);
                        }
                    } else {
                        return;
                    }
                    o(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x11 = motionEvent.getX(actionIndex);
                        float y11 = motionEvent.getY(actionIndex);
                        n(pointerId2, x11, y11);
                        if (this.f10479a == 0) {
                            t(h((int) x11, (int) y11), pointerId2);
                            if ((this.f10486h[pointerId2] & this.f10494q) != 0) {
                                this.f10496s.f();
                                return;
                            }
                            return;
                        }
                        int i15 = (int) x11;
                        int i16 = (int) y11;
                        View view = this.f10497t;
                        if (view != null && i15 >= view.getLeft() && i15 < view.getRight() && i16 >= view.getTop() && i16 < view.getBottom()) {
                            i11 = 1;
                        }
                        if (i11 != 0) {
                            t(this.f10497t, pointerId2);
                            return;
                        }
                        return;
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        if (this.f10479a == 1 && pointerId3 == this.f10481c) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i11 >= pointerCount2) {
                                    i10 = -1;
                                    break;
                                }
                                int pointerId4 = motionEvent.getPointerId(i11);
                                if (pointerId4 != this.f10481c) {
                                    View h11 = h((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                                    View view2 = this.f10497t;
                                    if (h11 == view2 && t(view2, pointerId4)) {
                                        i10 = this.f10481c;
                                        break;
                                    }
                                }
                                i11++;
                            }
                            if (i10 == -1) {
                                l();
                            }
                        }
                        e(pointerId3);
                        return;
                    } else {
                        return;
                    }
                } else if (this.f10479a == 1) {
                    this.u = true;
                    this.f10496s.j(this.f10497t, 0.0f, 0.0f);
                    this.u = false;
                    if (this.f10479a == 1) {
                        p(0);
                    }
                }
            } else if (this.f10479a == 1) {
                l();
            }
            a();
            return;
        }
        float x12 = motionEvent.getX();
        float y12 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View h12 = h((int) x12, (int) y12);
        n(pointerId5, x12, y12);
        t(h12, pointerId5);
        if ((this.f10486h[pointerId5] & this.f10494q) != 0) {
            this.f10496s.f();
        }
    }

    public final void l() {
        this.f10489l.computeCurrentVelocity(1000, this.f10490m);
        float xVelocity = this.f10489l.getXVelocity(this.f10481c);
        float f10 = this.f10491n;
        float f11 = this.f10490m;
        float abs = Math.abs(xVelocity);
        float f12 = 0.0f;
        if (abs < f10) {
            xVelocity = 0.0f;
        } else if (abs > f11) {
            if (xVelocity > 0.0f) {
                xVelocity = f11;
            } else {
                xVelocity = -f11;
            }
        }
        float yVelocity = this.f10489l.getYVelocity(this.f10481c);
        float f13 = this.f10491n;
        float f14 = this.f10490m;
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f13) {
            if (abs2 > f14) {
                if (yVelocity > 0.0f) {
                    f12 = f14;
                } else {
                    yVelocity = -f14;
                }
            }
            f12 = yVelocity;
        }
        this.u = true;
        this.f10496s.j(this.f10497t, xVelocity, f12);
        this.u = false;
        if (this.f10479a == 1) {
            p(0);
        }
    }

    public final void m(int i10, float f10, float f11) {
        boolean c10 = c(f10, f11, i10, 1);
        if (c(f11, f10, i10, 4)) {
            c10 |= true;
        }
        if (c(f10, f11, i10, 2)) {
            c10 |= true;
        }
        if (c(f11, f10, i10, 8)) {
            c10 |= true;
        }
        if (c10) {
            int[] iArr = this.f10487i;
            iArr[i10] = iArr[i10] | c10;
            this.f10496s.e(c10 ? 1 : 0, i10);
        }
    }

    public final void n(int i10, float f10, float f11) {
        float[] fArr = this.f10482d;
        int i11 = 0;
        if (fArr == null || fArr.length <= i10) {
            int i12 = i10 + 1;
            float[] fArr2 = new float[i12];
            float[] fArr3 = new float[i12];
            float[] fArr4 = new float[i12];
            float[] fArr5 = new float[i12];
            int[] iArr = new int[i12];
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f10483e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f10484f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f10485g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f10486h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f10487i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f10488j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f10482d = fArr2;
            this.f10483e = fArr3;
            this.f10484f = fArr4;
            this.f10485g = fArr5;
            this.f10486h = iArr;
            this.f10487i = iArr2;
            this.f10488j = iArr3;
        }
        float[] fArr9 = this.f10482d;
        this.f10484f[i10] = f10;
        fArr9[i10] = f10;
        float[] fArr10 = this.f10483e;
        this.f10485g[i10] = f11;
        fArr10[i10] = f11;
        int[] iArr7 = this.f10486h;
        int i13 = (int) f10;
        int i14 = (int) f11;
        if (i13 < this.f10498v.getLeft() + this.f10492o) {
            i11 = 1;
        }
        if (i14 < this.f10498v.getTop() + this.f10492o) {
            i11 |= 4;
        }
        if (i13 > this.f10498v.getRight() - this.f10492o) {
            i11 |= 2;
        }
        if (i14 > this.f10498v.getBottom() - this.f10492o) {
            i11 |= 8;
        }
        iArr7[i10] = i11;
        this.k = (1 << i10) | this.k;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (j(pointerId)) {
                float x9 = motionEvent.getX(i10);
                float y9 = motionEvent.getY(i10);
                this.f10484f[pointerId] = x9;
                this.f10485g[pointerId] = y9;
            }
        }
    }

    public final void p(int i10) {
        this.f10498v.removeCallbacks(this.w);
        if (this.f10479a != i10) {
            this.f10479a = i10;
            this.f10496s.h(i10);
            if (this.f10479a == 0) {
                this.f10497t = null;
            }
        }
    }

    public final boolean q(int i10, int i11) {
        if (this.u) {
            return i(i10, i11, (int) this.f10489l.getXVelocity(this.f10481c), (int) this.f10489l.getYVelocity(this.f10481c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00dc, code lost:
        if (r12 != r11) goto L_0x00e5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f10489l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f10489l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f10489l
            r4.addMovement(r1)
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0102
            if (r2 == r5) goto L_0x00fd
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00fd
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0033
            goto L_0x0100
        L_0x0033:
            int r1 = r1.getPointerId(r3)
            r0.e(r1)
            goto L_0x0100
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.n(r2, r7, r1)
            int r3 = r0.f10479a
            if (r3 != 0) goto L_0x005f
            int[] r1 = r0.f10486h
            r1 = r1[r2]
            int r2 = r0.f10494q
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0100
            o0.c$c r1 = r0.f10496s
            r1.f()
            goto L_0x0100
        L_0x005f:
            if (r3 != r4) goto L_0x0100
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.h(r3, r1)
            android.view.View r3 = r0.f10497t
            if (r1 != r3) goto L_0x0100
            r0.t(r1, r2)
            goto L_0x0100
        L_0x0070:
            float[] r2 = r0.f10482d
            if (r2 == 0) goto L_0x0100
            float[] r2 = r0.f10483e
            if (r2 != 0) goto L_0x007a
            goto L_0x0100
        L_0x007a:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007f:
            if (r3 >= r2) goto L_0x00f9
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.j(r4)
            if (r7 != 0) goto L_0x008d
            goto L_0x00f6
        L_0x008d:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f10482d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f10483e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.h(r7, r8)
            if (r7 == 0) goto L_0x00b1
            boolean r8 = r0.d(r7, r9, r10)
            if (r8 == 0) goto L_0x00b1
            r8 = r5
            goto L_0x00b2
        L_0x00b1:
            r8 = 0
        L_0x00b2:
            if (r8 == 0) goto L_0x00e5
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r12 = r12 + r11
            o0.c$c r13 = r0.f10496s
            int r12 = r13.a(r7, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r14 = r14 + r13
            o0.c$c r15 = r0.f10496s
            int r14 = r15.b(r7, r14)
            o0.c$c r15 = r0.f10496s
            int r15 = r15.c(r7)
            o0.c$c r6 = r0.f10496s
            int r6 = r6.d()
            if (r15 == 0) goto L_0x00de
            if (r15 <= 0) goto L_0x00e5
            if (r12 != r11) goto L_0x00e5
        L_0x00de:
            if (r6 == 0) goto L_0x00f9
            if (r6 <= 0) goto L_0x00e5
            if (r14 != r13) goto L_0x00e5
            goto L_0x00f9
        L_0x00e5:
            r0.m(r4, r9, r10)
            int r6 = r0.f10479a
            if (r6 != r5) goto L_0x00ed
            goto L_0x00f9
        L_0x00ed:
            if (r8 == 0) goto L_0x00f6
            boolean r4 = r0.t(r7, r4)
            if (r4 == 0) goto L_0x00f6
            goto L_0x00f9
        L_0x00f6:
            int r3 = r3 + 1
            goto L_0x007f
        L_0x00f9:
            r16.o(r17)
            goto L_0x0100
        L_0x00fd:
            r16.a()
        L_0x0100:
            r6 = 0
            goto L_0x0131
        L_0x0102:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r6 = 0
            int r1 = r1.getPointerId(r6)
            r0.n(r1, r2, r3)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.h(r2, r3)
            android.view.View r3 = r0.f10497t
            if (r2 != r3) goto L_0x0123
            int r3 = r0.f10479a
            if (r3 != r4) goto L_0x0123
            r0.t(r2, r1)
        L_0x0123:
            int[] r2 = r0.f10486h
            r1 = r2[r1]
            int r2 = r0.f10494q
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0131
            o0.c$c r1 = r0.f10496s
            r1.f()
        L_0x0131:
            int r1 = r0.f10479a
            if (r1 != r5) goto L_0x0136
            goto L_0x0137
        L_0x0136:
            r5 = r6
        L_0x0137:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.c.r(android.view.MotionEvent):boolean");
    }

    public final boolean s(View view, int i10, int i11) {
        this.f10497t = view;
        this.f10481c = -1;
        boolean i12 = i(i10, i11, 0, 0);
        if (!i12 && this.f10479a == 0 && this.f10497t != null) {
            this.f10497t = null;
        }
        return i12;
    }

    public final boolean t(View view, int i10) {
        if (view == this.f10497t && this.f10481c == i10) {
            return true;
        }
        if (view == null || !this.f10496s.k(view, i10)) {
            return false;
        }
        this.f10481c = i10;
        b(view, i10);
        return true;
    }
}
