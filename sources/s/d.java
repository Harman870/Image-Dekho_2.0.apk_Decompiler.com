package s;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import h0.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import s.e;
import t.b;

public final class d extends ConstraintLayout implements o {
    public static final /* synthetic */ int K = 0;
    public boolean A;
    public ArrayList<c> B;
    public ArrayList<c> C;
    public CopyOnWriteArrayList<c> D;
    public int E;
    public float F;
    public boolean G;
    public b H;
    public boolean I;
    public C0137d J;

    /* renamed from: q  reason: collision with root package name */
    public float f11782q;

    /* renamed from: r  reason: collision with root package name */
    public int f11783r;

    /* renamed from: s  reason: collision with root package name */
    public int f11784s;

    /* renamed from: t  reason: collision with root package name */
    public int f11785t;
    public float u;

    /* renamed from: v  reason: collision with root package name */
    public float f11786v;
    public long w;

    /* renamed from: x  reason: collision with root package name */
    public float f11787x;

    /* renamed from: y  reason: collision with root package name */
    public c f11788y;

    /* renamed from: z  reason: collision with root package name */
    public b f11789z;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            d.this.H.a();
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public float f11791a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        public float f11792b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        public int f11793c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f11794d = -1;

        public b() {
        }

        public final void a() {
            androidx.constraintlayout.widget.b bVar;
            ConstraintLayout constraintLayout;
            Object obj;
            int a10;
            androidx.constraintlayout.widget.b bVar2;
            C0137d dVar = C0137d.SETUP;
            int i10 = this.f11793c;
            if (!(i10 == -1 && this.f11794d == -1)) {
                if (i10 == -1) {
                    d.this.r(this.f11794d);
                } else {
                    int i11 = this.f11794d;
                    if (i11 == -1) {
                        d dVar2 = d.this;
                        dVar2.setState(dVar);
                        dVar2.f11784s = i10;
                        dVar2.f11783r = -1;
                        dVar2.f11785t = -1;
                        t.b bVar3 = dVar2.k;
                        if (bVar3 != null) {
                            float f10 = (float) -1;
                            int i12 = bVar3.f11917b;
                            if (i12 == i10) {
                                if (i10 == -1) {
                                    obj = bVar3.f11919d.valueAt(0);
                                } else {
                                    obj = bVar3.f11919d.get(i12);
                                }
                                b.a aVar = (b.a) obj;
                                int i13 = bVar3.f11918c;
                                if ((i13 == -1 || !aVar.f11922b.get(i13).a(f10, f10)) && bVar3.f11918c != (a10 = aVar.a(f10, f10))) {
                                    if (a10 == -1) {
                                        bVar2 = null;
                                    } else {
                                        bVar2 = aVar.f11922b.get(a10).f11930f;
                                    }
                                    if (a10 != -1) {
                                        int i14 = aVar.f11922b.get(a10).f11929e;
                                    }
                                    if (bVar2 != null) {
                                        bVar3.f11918c = a10;
                                        constraintLayout = bVar3.f11916a;
                                        bVar2.a(constraintLayout);
                                    }
                                }
                            } else {
                                bVar3.f11917b = i10;
                                b.a aVar2 = bVar3.f11919d.get(i10);
                                int a11 = aVar2.a(f10, f10);
                                if (a11 == -1) {
                                    bVar = aVar2.f11924d;
                                } else {
                                    bVar = aVar2.f11922b.get(a11).f11930f;
                                }
                                if (a11 != -1) {
                                    int i15 = aVar2.f11922b.get(a11).f11929e;
                                }
                                if (bVar == null) {
                                    Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =" + f10 + ", " + f10);
                                } else {
                                    bVar3.f11918c = a11;
                                    constraintLayout = bVar3.f11916a;
                                    bVar.a(constraintLayout);
                                }
                            }
                            constraintLayout.setConstraintSet((androidx.constraintlayout.widget.b) null);
                            constraintLayout.requestLayout();
                        }
                    } else {
                        d.this.q(i10, i11);
                    }
                }
                d.this.setState(dVar);
            }
            if (!Float.isNaN(this.f11792b)) {
                d.this.p(this.f11791a, this.f11792b);
                this.f11791a = Float.NaN;
                this.f11792b = Float.NaN;
                this.f11793c = -1;
                this.f11794d = -1;
            } else if (!Float.isNaN(this.f11791a)) {
                d.this.setProgress(this.f11791a);
            }
        }
    }

    public interface c {
        void a();

        void b();
    }

    /* renamed from: s.d$d  reason: collision with other inner class name */
    public enum C0137d {
        SETUP,
        MOVING,
        FINISHED
    }

    public final void b(View view, View view2, int i10, int i11) {
        getNanoTime();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0100, code lost:
        if (r1 != r2) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x010b, code lost:
        if (r1 != r2) goto L_0x010f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispatchDraw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            s.d$d r1 = s.d.C0137d.FINISHED
            long r2 = r0.w
            r4 = -1
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0012
            long r2 = r17.getNanoTime()
            r0.w = r2
        L_0x0012:
            float r2 = r0.f11786v
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r5 = -1
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r4 <= 0) goto L_0x0022
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x0022
            r0.f11784s = r5
        L_0x0022:
            boolean r4 = r0.A
            r7 = 1
            r8 = 0
            if (r4 != 0) goto L_0x002a
            goto L_0x00f6
        L_0x002a:
            float r4 = r0.f11787x
            float r4 = r4 - r2
            float r2 = java.lang.Math.signum(r4)
            long r9 = r17.getNanoTime()
            long r11 = r0.w
            long r11 = r9 - r11
            float r4 = (float) r11
            float r4 = r4 * r2
            r11 = 814313567(0x3089705f, float:1.0E-9)
            float r4 = r4 * r11
            float r4 = r4 / r3
            float r11 = r0.f11786v
            float r11 = r11 + r4
            int r12 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r12 <= 0) goto L_0x004d
            float r13 = r0.f11787x
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 >= 0) goto L_0x0057
        L_0x004d:
            int r13 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r13 > 0) goto L_0x0059
            float r13 = r0.f11787x
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 > 0) goto L_0x0059
        L_0x0057:
            float r11 = r0.f11787x
        L_0x0059:
            r0.f11786v = r11
            r0.u = r11
            r0.w = r9
            r0.f11782q = r4
            float r4 = java.lang.Math.abs(r4)
            r9 = 925353388(0x3727c5ac, float:1.0E-5)
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x0071
            s.d$d r4 = s.d.C0137d.MOVING
            r0.setState(r4)
        L_0x0071:
            if (r12 <= 0) goto L_0x0079
            float r4 = r0.f11787x
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x0083
        L_0x0079:
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 > 0) goto L_0x0085
            float r4 = r0.f11787x
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0085
        L_0x0083:
            float r11 = r0.f11787x
        L_0x0085:
            int r4 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x008d
            int r9 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x0090
        L_0x008d:
            r0.setState(r1)
        L_0x0090:
            int r9 = r17.getChildCount()
            r0.A = r8
            r17.getNanoTime()
            r10 = 0
            if (r9 > 0) goto L_0x0123
            if (r12 <= 0) goto L_0x00a4
            float r9 = r0.f11787x
            int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x00ae
        L_0x00a4:
            int r9 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x00b0
            float r9 = r0.f11787x
            int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r9 > 0) goto L_0x00b0
        L_0x00ae:
            r9 = r7
            goto L_0x00b1
        L_0x00b0:
            r9 = r8
        L_0x00b1:
            boolean r13 = r0.A
            if (r13 != 0) goto L_0x00ba
            if (r9 == 0) goto L_0x00ba
            r0.setState(r1)
        L_0x00ba:
            boolean r13 = r0.A
            r9 = r9 ^ r7
            r9 = r9 | r13
            r0.A = r9
            int r13 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r13 > 0) goto L_0x00d0
            int r13 = r0.f11783r
            if (r13 == r5) goto L_0x00d0
            int r5 = r0.f11784s
            if (r5 != r13) goto L_0x00cd
            goto L_0x00d0
        L_0x00cd:
            r0.f11784s = r13
            throw r10
        L_0x00d0:
            double r13 = (double) r11
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 < 0) goto L_0x00e1
            int r5 = r0.f11784s
            int r13 = r0.f11785t
            if (r5 != r13) goto L_0x00de
            goto L_0x00e1
        L_0x00de:
            r0.f11784s = r13
            throw r10
        L_0x00e1:
            if (r9 != 0) goto L_0x00f3
            if (r12 <= 0) goto L_0x00e7
            if (r4 == 0) goto L_0x00ef
        L_0x00e7:
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x00f6
            int r2 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x00f6
        L_0x00ef:
            r0.setState(r1)
            goto L_0x00f6
        L_0x00f3:
            r17.invalidate()
        L_0x00f6:
            float r1 = r0.f11786v
            int r2 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0103
            int r1 = r0.f11784s
            int r2 = r0.f11785t
            if (r1 == r2) goto L_0x010e
            goto L_0x010f
        L_0x0103:
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0112
            int r1 = r0.f11784s
            int r2 = r0.f11783r
            if (r1 == r2) goto L_0x010e
            goto L_0x010f
        L_0x010e:
            r7 = r8
        L_0x010f:
            r0.f11784s = r2
            r8 = r7
        L_0x0112:
            if (r8 == 0) goto L_0x011b
            boolean r1 = r0.G
            if (r1 != 0) goto L_0x011b
            r17.requestLayout()
        L_0x011b:
            float r1 = r0.f11786v
            r0.u = r1
            super.dispatchDraw(r18)
            return
        L_0x0123:
            r0.getChildAt(r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: s.d.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void f(int i10) {
        this.k = null;
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.f11784s;
    }

    public ArrayList<e.a> getDefinedTransitions() {
        return null;
    }

    public b getDesignTool() {
        if (this.f11789z == null) {
            this.f11789z = new b();
        }
        return this.f11789z;
    }

    public int getEndState() {
        return this.f11785t;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f11786v;
    }

    public e getScene() {
        return null;
    }

    public int getStartState() {
        return this.f11783r;
    }

    public float getTargetPosition() {
        return this.f11787x;
    }

    public Bundle getTransitionState() {
        if (this.H == null) {
            this.H = new b();
        }
        b bVar = this.H;
        d dVar = d.this;
        bVar.f11794d = dVar.f11785t;
        bVar.f11793c = dVar.f11783r;
        bVar.f11792b = dVar.getVelocity();
        bVar.f11791a = d.this.getProgress();
        b bVar2 = this.H;
        bVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", bVar2.f11791a);
        bundle.putFloat("motion.velocity", bVar2.f11792b);
        bundle.putInt("motion.StartState", bVar2.f11793c);
        bundle.putInt("motion.EndState", bVar2.f11794d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        return (long) 0.0f;
    }

    public float getVelocity() {
        return this.f11782q;
    }

    public final void i(View view, int i10) {
    }

    public final boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public final void j(View view, int i10, int i11, int[] iArr, int i12) {
    }

    public final void k() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        if ((this.f11788y != null || ((copyOnWriteArrayList = this.D) != null && !copyOnWriteArrayList.isEmpty())) && this.F != this.u) {
            if (this.E != -1) {
                c cVar = this.f11788y;
                if (cVar != null) {
                    cVar.b();
                }
                CopyOnWriteArrayList<c> copyOnWriteArrayList2 = this.D;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<c> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().b();
                    }
                }
            }
            this.E = -1;
            this.F = this.u;
            c cVar2 = this.f11788y;
            if (cVar2 != null) {
                cVar2.a();
            }
            CopyOnWriteArrayList<c> copyOnWriteArrayList3 = this.D;
            if (copyOnWriteArrayList3 != null) {
                Iterator<c> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().a();
                }
            }
        }
    }

    public final void l() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        CopyOnWriteArrayList<c> copyOnWriteArrayList2;
        if ((this.f11788y != null || ((copyOnWriteArrayList2 = this.D) != null && !copyOnWriteArrayList2.isEmpty())) && this.E == -1) {
            this.E = this.f11784s;
            throw null;
        } else if (this.f11788y != null || ((copyOnWriteArrayList = this.D) != null && !copyOnWriteArrayList.isEmpty())) {
            throw null;
        }
    }

    public final void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i10 != 0 || i11 != 0) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
    }

    public final void n(View view, int i10, int i11, int i12, int i13, int i14) {
    }

    public final boolean o(View view, View view2, int i10, int i11) {
        return false;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        b bVar = this.H;
        if (bVar == null) {
            return;
        }
        if (this.I) {
            post(new a());
        } else {
            bVar.a();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        this.G = true;
        try {
            super.onLayout(z9, i10, i11, i12, i13);
        } finally {
            this.G = false;
        }
    }

    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public final boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        return false;
    }

    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    public final void onRtlPropertiesChanged(int i10) {
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof c) {
            c cVar = (c) view;
            if (this.D == null) {
                this.D = new CopyOnWriteArrayList<>();
            }
            this.D.add(cVar);
            if (cVar.f11779i) {
                if (this.B == null) {
                    this.B = new ArrayList<>();
                }
                this.B.add(cVar);
            }
            if (cVar.f11780j) {
                if (this.C == null) {
                    this.C = new ArrayList<>();
                }
                this.C.add(cVar);
            }
        }
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<c> arrayList = this.B;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<c> arrayList2 = this.C;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public final void p(float f10, float f11) {
        if (!super.isAttachedToWindow()) {
            if (this.H == null) {
                this.H = new b();
            }
            b bVar = this.H;
            bVar.f11791a = f10;
            bVar.f11792b = f11;
            return;
        }
        setProgress(f10);
        setState(C0137d.MOVING);
        this.f11782q = f11;
    }

    public final void q(int i10, int i11) {
        if (!super.isAttachedToWindow()) {
            if (this.H == null) {
                this.H = new b();
            }
            b bVar = this.H;
            bVar.f11793c = i10;
            bVar.f11794d = i11;
        }
    }

    public final void r(int i10) {
        if (!super.isAttachedToWindow()) {
            if (this.H == null) {
                this.H = new b();
            }
            this.H.f11794d = i10;
            return;
        }
        int i11 = this.f11784s;
        if (i11 != i10 && this.f11783r != i10 && this.f11785t != i10) {
            this.f11785t = i10;
            if (i11 != -1) {
                q(i11, i10);
                this.f11786v = 0.0f;
                return;
            }
            this.f11787x = 1.0f;
            this.u = 0.0f;
            this.f11786v = 0.0f;
            this.w = getNanoTime();
            getNanoTime();
            throw null;
        }
    }

    public final void requestLayout() {
        int i10 = this.f11784s;
        super.requestLayout();
    }

    public void setDebugMode(int i10) {
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z9) {
        this.I = z9;
    }

    public void setInteractionEnabled(boolean z9) {
    }

    public void setInterpolatedProgress(float f10) {
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList<c> arrayList = this.C;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.C.get(i10).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList<c> arrayList = this.B;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.B.get(i10).setProgress(f10);
            }
        }
    }

    public void setProgress(float f10) {
        C0137d dVar = C0137d.FINISHED;
        C0137d dVar2 = C0137d.MOVING;
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i10 < 0 || f10 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!super.isAttachedToWindow()) {
            if (this.H == null) {
                this.H = new b();
            }
            this.H.f11791a = f10;
            return;
        }
        if (i10 <= 0) {
            if (this.f11786v == 1.0f && this.f11784s == this.f11785t) {
                setState(dVar2);
            }
            this.f11784s = this.f11783r;
            if (this.f11786v != 0.0f) {
                return;
            }
        } else if (f10 >= 1.0f) {
            if (this.f11786v == 0.0f && this.f11784s == this.f11783r) {
                setState(dVar2);
            }
            this.f11784s = this.f11785t;
            if (this.f11786v != 1.0f) {
                return;
            }
        } else {
            this.f11784s = -1;
            setState(dVar2);
            return;
        }
        setState(dVar);
    }

    public void setScene(e eVar) {
        e();
        throw null;
    }

    public void setStartState(int i10) {
        if (!super.isAttachedToWindow()) {
            if (this.H == null) {
                this.H = new b();
            }
            b bVar = this.H;
            bVar.f11793c = i10;
            bVar.f11794d = i10;
            return;
        }
        this.f11784s = i10;
    }

    public void setState(C0137d dVar) {
        C0137d dVar2 = C0137d.FINISHED;
        if (dVar != dVar2 || this.f11784s != -1) {
            C0137d dVar3 = this.J;
            this.J = dVar;
            C0137d dVar4 = C0137d.MOVING;
            if (dVar3 == dVar4 && dVar == dVar4) {
                k();
            }
            int ordinal = dVar3.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                if (dVar == dVar4) {
                    k();
                }
                if (dVar != dVar2) {
                    return;
                }
            } else if (!(ordinal == 2 && dVar == dVar2)) {
                return;
            }
            l();
        }
    }

    public void setTransition(int i10) {
    }

    public void setTransition(e.a aVar) {
        throw null;
    }

    public void setTransitionDuration(int i10) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(c cVar) {
        this.f11788y = cVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.H == null) {
            this.H = new b();
        }
        b bVar = this.H;
        bVar.getClass();
        bVar.f11791a = bundle.getFloat("motion.progress");
        bVar.f11792b = bundle.getFloat("motion.velocity");
        bVar.f11793c = bundle.getInt("motion.StartState");
        bVar.f11794d = bundle.getInt("motion.EndState");
        if (super.isAttachedToWindow()) {
            this.H.a();
        }
    }

    public final String toString() {
        Context context = getContext();
        return a.a(context, this.f11783r) + "->" + a.a(context, this.f11785t) + " (pos:" + this.f11786v + " Dpos/Dt:" + this.f11782q;
    }
}
