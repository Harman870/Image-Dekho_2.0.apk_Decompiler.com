package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import h0.l0;
import h0.y;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class l extends RecyclerView.k implements RecyclerView.o {
    public static final int[] C = {16842919};
    public static final int[] D = new int[0];
    public int A;
    public final a B;

    /* renamed from: a  reason: collision with root package name */
    public final int f2080a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2081b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f2082c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f2083d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2084e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2085f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f2086g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f2087h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2088i;

    /* renamed from: j  reason: collision with root package name */
    public final int f2089j;
    public int k;

    /* renamed from: l  reason: collision with root package name */
    public int f2090l;

    /* renamed from: m  reason: collision with root package name */
    public float f2091m;

    /* renamed from: n  reason: collision with root package name */
    public int f2092n;

    /* renamed from: o  reason: collision with root package name */
    public int f2093o;

    /* renamed from: p  reason: collision with root package name */
    public float f2094p;

    /* renamed from: q  reason: collision with root package name */
    public int f2095q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f2096r = 0;

    /* renamed from: s  reason: collision with root package name */
    public RecyclerView f2097s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2098t = false;
    public boolean u = false;

    /* renamed from: v  reason: collision with root package name */
    public int f2099v = 0;
    public int w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f2100x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public final int[] f2101y = new int[2];

    /* renamed from: z  reason: collision with root package name */
    public final ValueAnimator f2102z;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            l lVar = l.this;
            int i10 = lVar.A;
            if (i10 == 1) {
                lVar.f2102z.cancel();
            } else if (i10 != 2) {
                return;
            }
            lVar.A = 3;
            ValueAnimator valueAnimator = lVar.f2102z;
            valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
            lVar.f2102z.setDuration((long) 500);
            lVar.f2102z.start();
        }
    }

    public class b extends RecyclerView.p {
        public b() {
        }

        public final void b(RecyclerView recyclerView, int i10, int i11) {
            boolean z9;
            boolean z10;
            l lVar = l.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = lVar.f2097s.computeVerticalScrollRange();
            int i12 = lVar.f2096r;
            if (computeVerticalScrollRange - i12 <= 0 || i12 < lVar.f2080a) {
                z9 = false;
            } else {
                z9 = true;
            }
            lVar.f2098t = z9;
            int computeHorizontalScrollRange = lVar.f2097s.computeHorizontalScrollRange();
            int i13 = lVar.f2095q;
            if (computeHorizontalScrollRange - i13 <= 0 || i13 < lVar.f2080a) {
                z10 = false;
            } else {
                z10 = true;
            }
            lVar.u = z10;
            boolean z11 = lVar.f2098t;
            if (z11 || z10) {
                if (z11) {
                    float f10 = (float) i12;
                    lVar.f2090l = (int) ((((f10 / 2.0f) + ((float) computeVerticalScrollOffset)) * f10) / ((float) computeVerticalScrollRange));
                    lVar.k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
                }
                if (lVar.u) {
                    float f11 = (float) computeHorizontalScrollOffset;
                    float f12 = (float) i13;
                    lVar.f2093o = (int) ((((f12 / 2.0f) + f11) * f12) / ((float) computeHorizontalScrollRange));
                    lVar.f2092n = Math.min(i13, (i13 * i13) / computeHorizontalScrollRange);
                }
                int i14 = lVar.f2099v;
                if (i14 == 0 || i14 == 1) {
                    lVar.h(1);
                }
            } else if (lVar.f2099v != 0) {
                lVar.h(0);
            }
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2105a = false;

        public c() {
        }

        public final void onAnimationCancel(Animator animator) {
            this.f2105a = true;
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f2105a) {
                this.f2105a = false;
            } else if (((Float) l.this.f2102z.getAnimatedValue()).floatValue() == 0.0f) {
                l lVar = l.this;
                lVar.A = 0;
                lVar.h(0);
            } else {
                l lVar2 = l.this;
                lVar2.A = 2;
                lVar2.f2097s.invalidate();
            }
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            l.this.f2082c.setAlpha(floatValue);
            l.this.f2083d.setAlpha(floatValue);
            l.this.f2097s.invalidate();
        }
    }

    public l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        boolean z9 = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f2102z = ofFloat;
        this.A = 0;
        a aVar = new a();
        this.B = aVar;
        b bVar = new b();
        this.f2082c = stateListDrawable;
        this.f2083d = drawable;
        this.f2086g = stateListDrawable2;
        this.f2087h = drawable2;
        this.f2084e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f2085f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f2088i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f2089j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f2080a = i11;
        this.f2081b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f2097s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                RecyclerView.l lVar = recyclerView2.f1830l;
                if (lVar != null) {
                    lVar.c("Cannot remove item decoration during a scroll  or layout");
                }
                recyclerView2.f1831m.remove(this);
                if (recyclerView2.f1831m.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2 ? true : z9);
                }
                recyclerView2.M();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.f2097s;
                recyclerView3.f1832n.remove(this);
                if (recyclerView3.f1833o == this) {
                    recyclerView3.f1833o = null;
                }
                ArrayList arrayList = this.f2097s.f1841s0;
                if (arrayList != null) {
                    arrayList.remove(bVar);
                }
                this.f2097s.removeCallbacks(aVar);
            }
            this.f2097s = recyclerView;
            if (recyclerView != null) {
                recyclerView.g(this);
                this.f2097s.f1832n.add(this);
                this.f2097s.h(bVar);
            }
        }
    }

    public final boolean a(MotionEvent motionEvent) {
        int i10 = this.f2099v;
        if (i10 == 1) {
            boolean f10 = f(motionEvent.getX(), motionEvent.getY());
            boolean e10 = e(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (f10 || e10)) {
                if (e10) {
                    this.w = 1;
                    this.f2094p = (float) ((int) motionEvent.getX());
                } else if (f10) {
                    this.w = 2;
                    this.f2091m = (float) ((int) motionEvent.getY());
                }
                h(2);
                return true;
            }
        } else if (i10 == 2) {
            return true;
        }
        return false;
    }

    public final void b() {
    }

    public final void d(Canvas canvas, RecyclerView recyclerView) {
        if (this.f2095q != this.f2097s.getWidth() || this.f2096r != this.f2097s.getHeight()) {
            this.f2095q = this.f2097s.getWidth();
            this.f2096r = this.f2097s.getHeight();
            h(0);
        } else if (this.A != 0) {
            if (this.f2098t) {
                int i10 = this.f2095q;
                int i11 = this.f2084e;
                int i12 = i10 - i11;
                int i13 = this.f2090l;
                int i14 = this.k;
                int i15 = i13 - (i14 / 2);
                this.f2082c.setBounds(0, 0, i11, i14);
                this.f2083d.setBounds(0, 0, this.f2085f, this.f2096r);
                RecyclerView recyclerView2 = this.f2097s;
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                boolean z9 = true;
                if (y.e.d(recyclerView2) != 1) {
                    z9 = false;
                }
                if (z9) {
                    this.f2083d.draw(canvas);
                    canvas.translate((float) this.f2084e, (float) i15);
                    canvas.scale(-1.0f, 1.0f);
                    this.f2082c.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    i12 = this.f2084e;
                } else {
                    canvas.translate((float) i12, 0.0f);
                    this.f2083d.draw(canvas);
                    canvas.translate(0.0f, (float) i15);
                    this.f2082c.draw(canvas);
                }
                canvas.translate((float) (-i12), (float) (-i15));
            }
            if (this.u) {
                int i16 = this.f2096r;
                int i17 = this.f2088i;
                int i18 = i16 - i17;
                int i19 = this.f2093o;
                int i20 = this.f2092n;
                int i21 = i19 - (i20 / 2);
                this.f2086g.setBounds(0, 0, i20, i17);
                this.f2087h.setBounds(0, 0, this.f2095q, this.f2089j);
                canvas.translate(0.0f, (float) i18);
                this.f2087h.draw(canvas);
                canvas.translate((float) i21, 0.0f);
                this.f2086g.draw(canvas);
                canvas.translate((float) (-i21), (float) (-i18));
            }
        }
    }

    public final boolean e(float f10, float f11) {
        if (f11 >= ((float) (this.f2096r - this.f2088i))) {
            int i10 = this.f2093o;
            int i11 = this.f2092n;
            return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) ((i11 / 2) + i10));
        }
    }

    public final boolean f(float f10, float f11) {
        boolean z9;
        RecyclerView recyclerView = this.f2097s;
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        if (y.e.d(recyclerView) == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (f10 > ((float) (this.f2084e / 2))) {
                return false;
            }
        } else if (f10 < ((float) (this.f2095q - this.f2084e))) {
            return false;
        }
        int i10 = this.f2090l;
        int i11 = this.k / 2;
        if (f11 < ((float) (i10 - i11)) || f11 > ((float) (i11 + i10))) {
            return false;
        }
        return true;
    }

    public final void g(int i10) {
        this.f2097s.removeCallbacks(this.B);
        this.f2097s.postDelayed(this.B, (long) i10);
    }

    public final void h(int i10) {
        int i11;
        if (i10 == 2 && this.f2099v != 2) {
            this.f2082c.setState(C);
            this.f2097s.removeCallbacks(this.B);
        }
        if (i10 == 0) {
            this.f2097s.invalidate();
        } else {
            i();
        }
        if (this.f2099v != 2 || i10 == 2) {
            if (i10 == 1) {
                i11 = IronSourceConstants.RV_INSTANCE_NOT_FOUND;
            }
            this.f2099v = i10;
        }
        this.f2082c.setState(D);
        i11 = IronSourceConstants.RV_INSTANCE_LOAD_FAILED;
        g(i11);
        this.f2099v = i10;
    }

    public final void i() {
        int i10 = this.A;
        if (i10 != 0) {
            if (i10 == 3) {
                this.f2102z.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f2102z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f2102z.setDuration(500);
        this.f2102z.setStartDelay(0);
        this.f2102z.start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bb, code lost:
        if (r8 >= 0) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0114, code lost:
        if (r5 >= 0) goto L_0x0116;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r11.f2099v
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r12.getAction()
            r1 = 2
            r2 = 1
            if (r0 != 0) goto L_0x0047
            float r0 = r12.getX()
            float r3 = r12.getY()
            boolean r0 = r11.f(r0, r3)
            float r3 = r12.getX()
            float r4 = r12.getY()
            boolean r3 = r11.e(r3, r4)
            if (r0 != 0) goto L_0x0029
            if (r3 == 0) goto L_0x011f
        L_0x0029:
            if (r3 == 0) goto L_0x0036
            r11.w = r2
            float r12 = r12.getX()
            int r12 = (int) r12
            float r12 = (float) r12
            r11.f2094p = r12
            goto L_0x0042
        L_0x0036:
            if (r0 == 0) goto L_0x0042
            r11.w = r1
            float r12 = r12.getY()
            int r12 = (int) r12
            float r12 = (float) r12
            r11.f2091m = r12
        L_0x0042:
            r11.h(r1)
            goto L_0x011f
        L_0x0047:
            int r0 = r12.getAction()
            r3 = 0
            if (r0 != r2) goto L_0x005e
            int r0 = r11.f2099v
            if (r0 != r1) goto L_0x005e
            r12 = 0
            r11.f2091m = r12
            r11.f2094p = r12
            r11.h(r2)
            r11.w = r3
            goto L_0x011f
        L_0x005e:
            int r0 = r12.getAction()
            if (r0 != r1) goto L_0x011f
            int r0 = r11.f2099v
            if (r0 != r1) goto L_0x011f
            r11.i()
            int r0 = r11.w
            r4 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x00c6
            float r0 = r12.getX()
            int[] r5 = r11.f2101y
            int r6 = r11.f2081b
            r5[r3] = r6
            int r7 = r11.f2095q
            int r7 = r7 - r6
            r5[r2] = r7
            float r6 = (float) r6
            float r7 = (float) r7
            float r0 = java.lang.Math.min(r7, r0)
            float r0 = java.lang.Math.max(r6, r0)
            int r6 = r11.f2093o
            float r6 = (float) r6
            float r6 = r6 - r0
            float r6 = java.lang.Math.abs(r6)
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0097
            goto L_0x00c6
        L_0x0097:
            float r6 = r11.f2094p
            androidx.recyclerview.widget.RecyclerView r7 = r11.f2097s
            int r7 = r7.computeHorizontalScrollRange()
            androidx.recyclerview.widget.RecyclerView r8 = r11.f2097s
            int r8 = r8.computeHorizontalScrollOffset()
            int r9 = r11.f2095q
            r10 = r5[r2]
            r5 = r5[r3]
            int r10 = r10 - r5
            if (r10 != 0) goto L_0x00b0
        L_0x00ae:
            r5 = r3
            goto L_0x00bd
        L_0x00b0:
            float r5 = r0 - r6
            float r6 = (float) r10
            float r5 = r5 / r6
            int r7 = r7 - r9
            float r6 = (float) r7
            float r5 = r5 * r6
            int r5 = (int) r5
            int r8 = r8 + r5
            if (r8 >= r7) goto L_0x00ae
            if (r8 < 0) goto L_0x00ae
        L_0x00bd:
            if (r5 == 0) goto L_0x00c4
            androidx.recyclerview.widget.RecyclerView r6 = r11.f2097s
            r6.scrollBy(r5, r3)
        L_0x00c4:
            r11.f2094p = r0
        L_0x00c6:
            int r0 = r11.w
            if (r0 != r1) goto L_0x011f
            float r12 = r12.getY()
            int[] r0 = r11.f2100x
            int r1 = r11.f2081b
            r0[r3] = r1
            int r5 = r11.f2096r
            int r5 = r5 - r1
            r0[r2] = r5
            float r1 = (float) r1
            float r5 = (float) r5
            float r12 = java.lang.Math.min(r5, r12)
            float r12 = java.lang.Math.max(r1, r12)
            int r1 = r11.f2090l
            float r1 = (float) r1
            float r1 = r1 - r12
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00f0
            goto L_0x011f
        L_0x00f0:
            float r1 = r11.f2091m
            androidx.recyclerview.widget.RecyclerView r4 = r11.f2097s
            int r4 = r4.computeVerticalScrollRange()
            androidx.recyclerview.widget.RecyclerView r5 = r11.f2097s
            int r5 = r5.computeVerticalScrollOffset()
            int r6 = r11.f2096r
            r2 = r0[r2]
            r0 = r0[r3]
            int r2 = r2 - r0
            if (r2 != 0) goto L_0x0109
        L_0x0107:
            r0 = r3
            goto L_0x0116
        L_0x0109:
            float r0 = r12 - r1
            float r1 = (float) r2
            float r0 = r0 / r1
            int r4 = r4 - r6
            float r1 = (float) r4
            float r0 = r0 * r1
            int r0 = (int) r0
            int r5 = r5 + r0
            if (r5 >= r4) goto L_0x0107
            if (r5 < 0) goto L_0x0107
        L_0x0116:
            if (r0 == 0) goto L_0x011d
            androidx.recyclerview.widget.RecyclerView r1 = r11.f2097s
            r1.scrollBy(r3, r0)
        L_0x011d:
            r11.f2091m = r12
        L_0x011f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.l.onTouchEvent(android.view.MotionEvent):void");
    }
}
