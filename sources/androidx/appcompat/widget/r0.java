package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import h.f;

public abstract class r0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final float f922a;

    /* renamed from: b  reason: collision with root package name */
    public final int f923b;

    /* renamed from: c  reason: collision with root package name */
    public final int f924c;

    /* renamed from: d  reason: collision with root package name */
    public final View f925d;

    /* renamed from: e  reason: collision with root package name */
    public a f926e;

    /* renamed from: f  reason: collision with root package name */
    public b f927f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f928g;

    /* renamed from: h  reason: collision with root package name */
    public int f929h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f930i = new int[2];

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            ViewParent parent = r0.this.f925d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            r0 r0Var = r0.this;
            r0Var.a();
            View view = r0Var.f925d;
            if (view.isEnabled() && !view.isLongClickable() && r0Var.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                r0Var.f928g = true;
            }
        }
    }

    public r0(View view) {
        this.f925d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f922a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f923b = tapTimeout;
        this.f924c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        b bVar = this.f927f;
        if (bVar != null) {
            this.f925d.removeCallbacks(bVar);
        }
        a aVar = this.f926e;
        if (aVar != null) {
            this.f925d.removeCallbacks(aVar);
        }
    }

    public abstract f b();

    public abstract boolean c();

    public boolean d() {
        f b10 = b();
        if (b10 == null || !b10.b()) {
            return true;
        }
        b10.dismiss();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
        if (r4 != 3) goto L_0x0102;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            boolean r12 = r11.f928g
            r0 = 3
            r1 = 1
            r2 = 0
            if (r12 == 0) goto L_0x006f
            android.view.View r3 = r11.f925d
            h.f r4 = r11.b()
            if (r4 == 0) goto L_0x005f
            boolean r5 = r4.b()
            if (r5 != 0) goto L_0x0016
            goto L_0x005f
        L_0x0016:
            androidx.appcompat.widget.p0 r4 = r4.g()
            if (r4 == 0) goto L_0x005f
            boolean r5 = r4.isShown()
            if (r5 != 0) goto L_0x0023
            goto L_0x005f
        L_0x0023:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtainNoHistory(r13)
            int[] r6 = r11.f930i
            r3.getLocationOnScreen(r6)
            r3 = r6[r2]
            float r3 = (float) r3
            r6 = r6[r1]
            float r6 = (float) r6
            r5.offsetLocation(r3, r6)
            int[] r3 = r11.f930i
            r4.getLocationOnScreen(r3)
            r6 = r3[r2]
            int r6 = -r6
            float r6 = (float) r6
            r3 = r3[r1]
            int r3 = -r3
            float r3 = (float) r3
            r5.offsetLocation(r6, r3)
            int r3 = r11.f929h
            boolean r3 = r4.b(r5, r3)
            r5.recycle()
            int r13 = r13.getActionMasked()
            if (r13 == r1) goto L_0x0058
            if (r13 == r0) goto L_0x0058
            r13 = r1
            goto L_0x0059
        L_0x0058:
            r13 = r2
        L_0x0059:
            if (r3 == 0) goto L_0x005f
            if (r13 == 0) goto L_0x005f
            r13 = r1
            goto L_0x0060
        L_0x005f:
            r13 = r2
        L_0x0060:
            if (r13 != 0) goto L_0x006c
            boolean r13 = r11.d()
            if (r13 != 0) goto L_0x0069
            goto L_0x006c
        L_0x0069:
            r13 = r2
            goto L_0x0125
        L_0x006c:
            r13 = r1
            goto L_0x0125
        L_0x006f:
            android.view.View r3 = r11.f925d
            boolean r4 = r3.isEnabled()
            if (r4 != 0) goto L_0x0079
            goto L_0x0102
        L_0x0079:
            int r4 = r13.getActionMasked()
            if (r4 == 0) goto L_0x00d6
            if (r4 == r1) goto L_0x00d2
            r5 = 2
            if (r4 == r5) goto L_0x0088
            if (r4 == r0) goto L_0x00d2
            goto L_0x0102
        L_0x0088:
            int r0 = r11.f929h
            int r0 = r13.findPointerIndex(r0)
            if (r0 < 0) goto L_0x0102
            float r4 = r13.getX(r0)
            float r13 = r13.getY(r0)
            float r0 = r11.f922a
            float r5 = -r0
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x00c3
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00c3
            int r5 = r3.getRight()
            int r6 = r3.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            float r5 = r5 + r0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00c3
            int r4 = r3.getBottom()
            int r5 = r3.getTop()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 + r0
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 >= 0) goto L_0x00c3
            r13 = r1
            goto L_0x00c4
        L_0x00c3:
            r13 = r2
        L_0x00c4:
            if (r13 != 0) goto L_0x0102
            r11.a()
            android.view.ViewParent r13 = r3.getParent()
            r13.requestDisallowInterceptTouchEvent(r1)
            r13 = r1
            goto L_0x0103
        L_0x00d2:
            r11.a()
            goto L_0x0102
        L_0x00d6:
            int r13 = r13.getPointerId(r2)
            r11.f929h = r13
            androidx.appcompat.widget.r0$a r13 = r11.f926e
            if (r13 != 0) goto L_0x00e7
            androidx.appcompat.widget.r0$a r13 = new androidx.appcompat.widget.r0$a
            r13.<init>()
            r11.f926e = r13
        L_0x00e7:
            androidx.appcompat.widget.r0$a r13 = r11.f926e
            int r0 = r11.f923b
            long r4 = (long) r0
            r3.postDelayed(r13, r4)
            androidx.appcompat.widget.r0$b r13 = r11.f927f
            if (r13 != 0) goto L_0x00fa
            androidx.appcompat.widget.r0$b r13 = new androidx.appcompat.widget.r0$b
            r13.<init>()
            r11.f927f = r13
        L_0x00fa:
            androidx.appcompat.widget.r0$b r13 = r11.f927f
            int r0 = r11.f924c
            long r4 = (long) r0
            r3.postDelayed(r13, r4)
        L_0x0102:
            r13 = r2
        L_0x0103:
            if (r13 == 0) goto L_0x010d
            boolean r13 = r11.c()
            if (r13 == 0) goto L_0x010d
            r13 = r1
            goto L_0x010e
        L_0x010d:
            r13 = r2
        L_0x010e:
            if (r13 == 0) goto L_0x0125
            long r5 = android.os.SystemClock.uptimeMillis()
            r7 = 3
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r5
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            android.view.View r3 = r11.f925d
            r3.onTouchEvent(r0)
            r0.recycle()
        L_0x0125:
            r11.f928g = r13
            if (r13 != 0) goto L_0x012d
            if (r12 == 0) goto L_0x012c
            goto L_0x012d
        L_0x012c:
            r1 = r2
        L_0x012d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.r0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f928g = false;
        this.f929h = -1;
        a aVar = this.f926e;
        if (aVar != null) {
            this.f925d.removeCallbacks(aVar);
        }
    }
}
