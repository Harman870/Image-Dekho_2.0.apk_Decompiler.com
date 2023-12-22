package t4;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import h0.l0;
import h0.y;
import java.util.WeakHashMap;
import z5.c;

public abstract class e<V extends View> extends g<V> {

    /* renamed from: c  reason: collision with root package name */
    public a f12002c;

    /* renamed from: d  reason: collision with root package name */
    public OverScroller f12003d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12004e;

    /* renamed from: f  reason: collision with root package name */
    public int f12005f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f12006g;

    /* renamed from: h  reason: collision with root package name */
    public int f12007h = -1;

    /* renamed from: i  reason: collision with root package name */
    public VelocityTracker f12008i;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final CoordinatorLayout f12009a;

        /* renamed from: b  reason: collision with root package name */
        public final V f12010b;

        public a(CoordinatorLayout coordinatorLayout, V v10) {
            this.f12009a = coordinatorLayout;
            this.f12010b = v10;
        }

        public final void run() {
            OverScroller overScroller;
            if (this.f12010b != null && (overScroller = e.this.f12003d) != null) {
                if (overScroller.computeScrollOffset()) {
                    e eVar = e.this;
                    eVar.A(this.f12009a, this.f12010b, eVar.f12003d.getCurrY());
                    V v10 = this.f12010b;
                    WeakHashMap<View, l0> weakHashMap = y.f6776a;
                    y.d.m(v10, this);
                    return;
                }
                e.this.y(this.f12010b, this.f12009a);
            }
        }
    }

    public e() {
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void A(CoordinatorLayout coordinatorLayout, View view, int i10) {
        z(coordinatorLayout, view, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z9;
        int findPointerIndex;
        if (this.f12007h < 0) {
            this.f12007h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f12004e) {
            int i10 = this.f12005f;
            if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y9 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y9 - this.f12006g) > this.f12007h) {
                this.f12006g = y9;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f12005f = -1;
            int x9 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (!u(v10) || !coordinatorLayout.p(v10, x9, y10)) {
                z9 = false;
            } else {
                z9 = true;
            }
            this.f12004e = z9;
            if (z9) {
                this.f12006g = y10;
                this.f12005f = motionEvent.getPointerId(0);
                if (this.f12008i == null) {
                    this.f12008i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f12003d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f12003d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f12008i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r(androidx.coordinatorlayout.widget.CoordinatorLayout r20, V r21, android.view.MotionEvent r22) {
        /*
            r19 = this;
            r6 = r19
            r1 = r20
            r2 = r21
            r7 = r22
            int r0 = r22.getActionMasked()
            r3 = 0
            r4 = -1
            r8 = 1
            r9 = 0
            if (r0 == r8) goto L_0x0060
            r5 = 2
            if (r0 == r5) goto L_0x0036
            r1 = 3
            if (r0 == r1) goto L_0x00c3
            r1 = 6
            if (r0 == r1) goto L_0x001c
            goto L_0x005d
        L_0x001c:
            int r0 = r22.getActionIndex()
            if (r0 != 0) goto L_0x0024
            r0 = r8
            goto L_0x0025
        L_0x0024:
            r0 = r9
        L_0x0025:
            int r1 = r7.getPointerId(r0)
            r6.f12005f = r1
            float r0 = r7.getY(r0)
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r6.f12006g = r0
            goto L_0x005d
        L_0x0036:
            int r0 = r6.f12005f
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r4) goto L_0x003f
            return r9
        L_0x003f:
            float r0 = r7.getY(r0)
            int r0 = (int) r0
            int r3 = r6.f12006g
            int r3 = r3 - r0
            r6.f12006g = r0
            int r4 = r6.v(r2)
            r5 = 0
            int r0 = r19.x()
            int r3 = r0 - r3
            r0 = r19
            r1 = r20
            r2 = r21
            r0.z(r1, r2, r3, r4, r5)
        L_0x005d:
            r0 = r9
            goto L_0x00d1
        L_0x0060:
            android.view.VelocityTracker r0 = r6.f12008i
            if (r0 == 0) goto L_0x00c3
            r0.addMovement(r7)
            android.view.VelocityTracker r0 = r6.f12008i
            r5 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r5)
            android.view.VelocityTracker r0 = r6.f12008i
            int r5 = r6.f12005f
            float r0 = r0.getYVelocity(r5)
            int r5 = r6.w(r2)
            int r5 = -r5
            r18 = 0
            t4.e$a r10 = r6.f12002c
            if (r10 == 0) goto L_0x0086
            r2.removeCallbacks(r10)
            r6.f12002c = r3
        L_0x0086:
            android.widget.OverScroller r10 = r6.f12003d
            if (r10 != 0) goto L_0x0095
            android.widget.OverScroller r10 = new android.widget.OverScroller
            android.content.Context r11 = r21.getContext()
            r10.<init>(r11)
            r6.f12003d = r10
        L_0x0095:
            android.widget.OverScroller r10 = r6.f12003d
            r11 = 0
            int r12 = r19.s()
            r13 = 0
            int r14 = java.lang.Math.round(r0)
            r15 = 0
            r16 = 0
            r17 = r5
            r10.fling(r11, r12, r13, r14, r15, r16, r17, r18)
            android.widget.OverScroller r0 = r6.f12003d
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x00be
            t4.e$a r0 = new t4.e$a
            r0.<init>(r1, r2)
            r6.f12002c = r0
            java.util.WeakHashMap<android.view.View, h0.l0> r1 = h0.y.f6776a
            h0.y.d.m(r2, r0)
            goto L_0x00c1
        L_0x00be:
            r6.y(r2, r1)
        L_0x00c1:
            r0 = r8
            goto L_0x00c4
        L_0x00c3:
            r0 = r9
        L_0x00c4:
            r6.f12004e = r9
            r6.f12005f = r4
            android.view.VelocityTracker r1 = r6.f12008i
            if (r1 == 0) goto L_0x00d1
            r1.recycle()
            r6.f12008i = r3
        L_0x00d1:
            android.view.VelocityTracker r1 = r6.f12008i
            if (r1 == 0) goto L_0x00d8
            r1.addMovement(r7)
        L_0x00d8:
            boolean r1 = r6.f12004e
            if (r1 != 0) goto L_0x00e0
            if (r0 == 0) goto L_0x00df
            goto L_0x00e0
        L_0x00df:
            r8 = r9
        L_0x00e0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.e.r(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean u(V v10) {
        return false;
    }

    public int v(V v10) {
        return -v10.getHeight();
    }

    public int w(V v10) {
        return v10.getHeight();
    }

    public int x() {
        return s();
    }

    public void y(View view, CoordinatorLayout coordinatorLayout) {
    }

    public int z(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        int e10;
        int s10 = s();
        if (i11 == 0 || s10 < i11 || s10 > i12 || s10 == (e10 = c.e(i10, i11, i12))) {
            return 0;
        }
        h hVar = this.f12016a;
        if (hVar == null) {
            this.f12017b = e10;
        } else if (hVar.f12021d != e10) {
            hVar.f12021d = e10;
            hVar.a();
        }
        return s10 - e10;
    }
}
