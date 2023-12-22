package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import h0.l0;
import h0.y;
import i0.f;
import java.util.Arrays;
import java.util.WeakHashMap;

public class GridLayoutManager extends LinearLayoutManager {
    public boolean E = false;
    public int F = -1;
    public int[] G;
    public View[] H;
    public final SparseIntArray I = new SparseIntArray();
    public final SparseIntArray J = new SparseIntArray();
    public a K = new a();
    public final Rect L = new Rect();

    public static final class a extends c {
    }

    public static class b extends RecyclerView.m {

        /* renamed from: e  reason: collision with root package name */
        public int f1784e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f1785f = 0;

        public b(int i10, int i11) {
            super(i10, i11);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final SparseIntArray f1786a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        public final SparseIntArray f1787b = new SparseIntArray();

        public static int a(int i10, int i11) {
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                i12++;
                if (i12 == i11) {
                    i13++;
                    i12 = 0;
                } else if (i12 > i11) {
                    i13++;
                    i12 = 1;
                }
            }
            return i12 + 1 > i11 ? i13 + 1 : i13;
        }

        public final void b() {
            this.f1786a.clear();
        }
    }

    public GridLayoutManager() {
        super(1);
        j1(2);
    }

    public GridLayoutManager(int i10) {
        super(1);
        j1(i10);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        j1(RecyclerView.l.H(context, attributeSet, i10, i11).f1883b);
    }

    public final int I(RecyclerView.r rVar, RecyclerView.w wVar) {
        if (this.f1788p == 0) {
            return this.F;
        }
        if (wVar.b() < 1) {
            return 0;
        }
        return f1(wVar.b() - 1, rVar, wVar) + 1;
    }

    public final View M0(RecyclerView.r rVar, RecyclerView.w wVar, int i10, int i11, int i12) {
        E0();
        int k = this.f1790r.k();
        int g10 = this.f1790r.g();
        int i13 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View v10 = v(i10);
            int G2 = RecyclerView.l.G(v10);
            if (G2 >= 0 && G2 < i12 && g1(G2, rVar, wVar) == 0) {
                if (((RecyclerView.m) v10.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = v10;
                    }
                } else if (this.f1790r.e(v10) < g10 && this.f1790r.b(v10) >= k) {
                    return v10;
                } else {
                    if (view == null) {
                        view = v10;
                    }
                }
            }
            i10 += i13;
        }
        return view != null ? view : view2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00df, code lost:
        if (r13 == r5) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x010f, code lost:
        if (r13 == r5) goto L_0x0111;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View Q(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.r r25, androidx.recyclerview.widget.RecyclerView.w r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            androidx.recyclerview.widget.RecyclerView r3 = r0.f1867b
            r4 = 0
            r5 = r23
            if (r3 != 0) goto L_0x000f
        L_0x000d:
            r3 = r4
            goto L_0x001f
        L_0x000f:
            android.view.View r3 = r3.A(r5)
            if (r3 != 0) goto L_0x0016
        L_0x0015:
            goto L_0x000d
        L_0x0016:
            androidx.recyclerview.widget.b r6 = r0.f1866a
            boolean r6 = r6.k(r3)
            if (r6 == 0) goto L_0x001f
            goto L_0x0015
        L_0x001f:
            if (r3 != 0) goto L_0x0022
            return r4
        L_0x0022:
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r6 = (androidx.recyclerview.widget.GridLayoutManager.b) r6
            int r7 = r6.f1784e
            int r6 = r6.f1785f
            int r6 = r6 + r7
            android.view.View r5 = super.Q(r23, r24, r25, r26)
            if (r5 != 0) goto L_0x0034
            return r4
        L_0x0034:
            r5 = r24
            int r5 = r0.D0(r5)
            r8 = 1
            if (r5 != r8) goto L_0x003f
            r5 = r8
            goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            boolean r10 = r0.u
            if (r5 == r10) goto L_0x0046
            r5 = r8
            goto L_0x0047
        L_0x0046:
            r5 = 0
        L_0x0047:
            r10 = -1
            if (r5 == 0) goto L_0x0052
            int r5 = r22.w()
            int r5 = r5 - r8
            r11 = r10
            r12 = r11
            goto L_0x0059
        L_0x0052:
            int r5 = r22.w()
            r11 = r5
            r12 = r8
            r5 = 0
        L_0x0059:
            int r13 = r0.f1788p
            if (r13 != r8) goto L_0x0065
            boolean r13 = r22.R0()
            if (r13 == 0) goto L_0x0065
            r13 = r8
            goto L_0x0066
        L_0x0065:
            r13 = 0
        L_0x0066:
            int r14 = r0.f1(r5, r1, r2)
            r9 = r10
            r15 = r9
            r16 = r12
            r8 = 0
            r12 = 0
            r10 = r5
            r5 = r4
        L_0x0072:
            if (r10 == r11) goto L_0x0153
            r17 = r11
            int r11 = r0.f1(r10, r1, r2)
            android.view.View r1 = r0.v(r10)
            if (r1 != r3) goto L_0x0082
            goto L_0x0153
        L_0x0082:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0098
            if (r11 == r14) goto L_0x0098
            if (r4 == 0) goto L_0x008e
            goto L_0x0153
        L_0x008e:
            r18 = r3
            r21 = r5
            r19 = r8
            r20 = 1
            goto L_0x0143
        L_0x0098:
            android.view.ViewGroup$LayoutParams r11 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r11 = (androidx.recyclerview.widget.GridLayoutManager.b) r11
            int r2 = r11.f1784e
            r18 = r3
            int r3 = r11.f1785f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00b0
            if (r2 != r7) goto L_0x00b0
            if (r3 != r6) goto L_0x00b0
            return r1
        L_0x00b0:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00b8
            if (r4 == 0) goto L_0x00c0
        L_0x00b8:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00c3
            if (r5 != 0) goto L_0x00c3
        L_0x00c0:
            r21 = r5
            goto L_0x00e1
        L_0x00c3:
            int r19 = java.lang.Math.max(r2, r7)
            int r20 = java.lang.Math.min(r3, r6)
            r21 = r5
            int r5 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00e7
            if (r5 <= r8) goto L_0x00d8
            goto L_0x00e1
        L_0x00d8:
            if (r5 != r8) goto L_0x0114
            if (r2 <= r15) goto L_0x00de
            r5 = 1
            goto L_0x00df
        L_0x00de:
            r5 = 0
        L_0x00df:
            if (r13 != r5) goto L_0x0114
        L_0x00e1:
            r19 = r8
            r5 = 1
            r20 = 1
            goto L_0x0119
        L_0x00e7:
            if (r4 != 0) goto L_0x0114
            r19 = r8
            androidx.recyclerview.widget.b0 r8 = r0.f1868c
            boolean r8 = r8.b(r1)
            if (r8 == 0) goto L_0x00fd
            androidx.recyclerview.widget.b0 r8 = r0.f1869d
            boolean r8 = r8.b(r1)
            if (r8 == 0) goto L_0x00fd
            r8 = 1
            goto L_0x00fe
        L_0x00fd:
            r8 = 0
        L_0x00fe:
            r20 = 1
            r8 = r8 ^ 1
            if (r8 == 0) goto L_0x0118
            if (r5 <= r12) goto L_0x0107
            goto L_0x0111
        L_0x0107:
            if (r5 != r12) goto L_0x0118
            if (r2 <= r9) goto L_0x010e
            r5 = r20
            goto L_0x010f
        L_0x010e:
            r5 = 0
        L_0x010f:
            if (r13 != r5) goto L_0x0118
        L_0x0111:
            r5 = r20
            goto L_0x0119
        L_0x0114:
            r19 = r8
            r20 = 1
        L_0x0118:
            r5 = 0
        L_0x0119:
            if (r5 == 0) goto L_0x0143
            boolean r5 = r1.hasFocusable()
            if (r5 == 0) goto L_0x0132
            int r4 = r11.f1784e
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r8 = r3 - r2
            r15 = r4
            r5 = r21
            r4 = r1
            goto L_0x0147
        L_0x0132:
            int r5 = r11.f1784e
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r12 = r3 - r2
            r9 = r5
            r8 = r19
            r5 = r1
            goto L_0x0147
        L_0x0143:
            r8 = r19
            r5 = r21
        L_0x0147:
            int r10 = r10 + r16
            r1 = r25
            r2 = r26
            r11 = r17
            r3 = r18
            goto L_0x0072
        L_0x0153:
            r21 = r5
            if (r4 == 0) goto L_0x0158
            goto L_0x015a
        L_0x0158:
            r4 = r21
        L_0x015a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.Q(android.view.View, int, androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w):android.view.View");
    }

    public final void S0(RecyclerView.r rVar, RecyclerView.w wVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        boolean z9;
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z11;
        boolean z12;
        View b10;
        RecyclerView.r rVar2 = rVar;
        RecyclerView.w wVar2 = wVar;
        LinearLayoutManager.c cVar2 = cVar;
        LinearLayoutManager.b bVar2 = bVar;
        int j10 = this.f1790r.j();
        if (j10 != 1073741824) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (w() > 0) {
            i10 = this.G[this.F];
        } else {
            i10 = 0;
        }
        if (z9) {
            k1();
        }
        if (cVar2.f1810e == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i21 = this.F;
        if (!z10) {
            i21 = g1(cVar2.f1809d, rVar2, wVar2) + h1(cVar2.f1809d, rVar2, wVar2);
        }
        int i22 = 0;
        while (i22 < this.F) {
            int i23 = cVar2.f1809d;
            if (i23 < 0 || i23 >= wVar.b()) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!z12 || i21 <= 0) {
                break;
            }
            int i24 = cVar2.f1809d;
            int h12 = h1(i24, rVar2, wVar2);
            if (h12 <= this.F) {
                i21 -= h12;
                if (i21 < 0 || (b10 = cVar2.b(rVar2)) == null) {
                    break;
                }
                this.H[i22] = b10;
                i22++;
            } else {
                throw new IllegalArgumentException("Item at position " + i24 + " requires " + h12 + " spans but GridLayoutManager has only " + this.F + " spans.");
            }
        }
        if (i22 == 0) {
            bVar2.f1803b = true;
            return;
        }
        if (z10) {
            i11 = 1;
            i12 = i22;
            i13 = 0;
        } else {
            i13 = i22 - 1;
            i12 = -1;
            i11 = -1;
        }
        int i25 = 0;
        while (i13 != i12) {
            View view = this.H[i13];
            b bVar3 = (b) view.getLayoutParams();
            int h13 = h1(RecyclerView.l.G(view), rVar2, wVar2);
            bVar3.f1785f = h13;
            bVar3.f1784e = i25;
            i25 += h13;
            i13 += i11;
        }
        float f10 = 0.0f;
        int i26 = 0;
        for (int i27 = 0; i27 < i22; i27++) {
            View view2 = this.H[i27];
            if (cVar2.k != null) {
                z11 = false;
                if (z10) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z10) {
                z11 = false;
                b(view2, -1, false);
            } else {
                z11 = false;
                b(view2, 0, false);
            }
            d(view2, this.L);
            i1(view2, j10, z11);
            int c10 = this.f1790r.c(view2);
            if (c10 > i26) {
                i26 = c10;
            }
            float d10 = (((float) this.f1790r.d(view2)) * 1.0f) / ((float) ((b) view2.getLayoutParams()).f1785f);
            if (d10 > f10) {
                f10 = d10;
            }
        }
        if (z9) {
            d1(Math.max(Math.round(f10 * ((float) this.F)), i10));
            i26 = 0;
            for (int i28 = 0; i28 < i22; i28++) {
                View view3 = this.H[i28];
                i1(view3, 1073741824, true);
                int c11 = this.f1790r.c(view3);
                if (c11 > i26) {
                    i26 = c11;
                }
            }
        }
        for (int i29 = 0; i29 < i22; i29++) {
            View view4 = this.H[i29];
            if (this.f1790r.c(view4) != i26) {
                b bVar4 = (b) view4.getLayoutParams();
                Rect rect = bVar4.f1887b;
                int i30 = rect.top + rect.bottom + bVar4.topMargin + bVar4.bottomMargin;
                int i31 = rect.left + rect.right + bVar4.leftMargin + bVar4.rightMargin;
                int e12 = e1(bVar4.f1784e, bVar4.f1785f);
                if (this.f1788p == 1) {
                    i20 = RecyclerView.l.x(false, e12, 1073741824, i31, bVar4.width);
                    i19 = View.MeasureSpec.makeMeasureSpec(i26 - i30, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i26 - i31, 1073741824);
                    i19 = RecyclerView.l.x(false, e12, 1073741824, i30, bVar4.height);
                    i20 = makeMeasureSpec;
                }
                if (u0(view4, i20, i19, (RecyclerView.m) view4.getLayoutParams())) {
                    view4.measure(i20, i19);
                }
            }
        }
        bVar2.f1802a = i26;
        if (this.f1788p == 1) {
            if (cVar2.f1811f == -1) {
                int i32 = cVar2.f1807b;
                i14 = i32;
                i18 = i32 - i26;
            } else {
                i18 = cVar2.f1807b;
                i14 = i26 + i18;
            }
            i16 = i18;
            i17 = 0;
            i15 = 0;
        } else {
            int i33 = cVar2.f1811f;
            int i34 = cVar2.f1807b;
            if (i33 == -1) {
                i15 = i34 - i26;
                i16 = 0;
                i17 = i34;
            } else {
                i17 = i26 + i34;
                i16 = 0;
                i15 = i34;
            }
            i14 = i16;
        }
        for (int i35 = 0; i35 < i22; i35++) {
            View view5 = this.H[i35];
            b bVar5 = (b) view5.getLayoutParams();
            if (this.f1788p != 1) {
                i16 = F() + this.G[bVar5.f1784e];
                i14 = this.f1790r.d(view5) + i16;
            } else if (R0()) {
                i17 = D() + this.G[this.F - bVar5.f1784e];
                i15 = i17 - this.f1790r.d(view5);
            } else {
                int D = D() + this.G[bVar5.f1784e];
                i15 = D;
                i17 = this.f1790r.d(view5) + D;
            }
            RecyclerView.l.M(view5, i15, i16, i17, i14);
            if (bVar5.c() || bVar5.b()) {
                bVar2.f1804c = true;
            }
            bVar2.f1805d = view5.hasFocusable() | bVar2.f1805d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    public final void T(RecyclerView.r rVar, RecyclerView.w wVar, View view, f fVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            S(view, fVar);
            return;
        }
        b bVar = (b) layoutParams;
        int f12 = f1(bVar.a(), rVar, wVar);
        if (this.f1788p == 0) {
            i11 = f12;
            i13 = bVar.f1784e;
            i10 = 1;
            i12 = bVar.f1785f;
        } else {
            i13 = f12;
            i11 = bVar.f1784e;
            i12 = 1;
            i10 = bVar.f1785f;
        }
        fVar.h(f.b.a(i13, i12, i11, i10, false, false));
    }

    public final void T0(RecyclerView.r rVar, RecyclerView.w wVar, LinearLayoutManager.a aVar, int i10) {
        boolean z9;
        k1();
        if (wVar.b() > 0 && !wVar.f1927g) {
            if (i10 == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            int g12 = g1(aVar.f1798b, rVar, wVar);
            if (z9) {
                while (g12 > 0) {
                    int i11 = aVar.f1798b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    aVar.f1798b = i12;
                    g12 = g1(i12, rVar, wVar);
                }
            } else {
                int b10 = wVar.b() - 1;
                int i13 = aVar.f1798b;
                while (i13 < b10) {
                    int i14 = i13 + 1;
                    int g13 = g1(i14, rVar, wVar);
                    if (g13 <= g12) {
                        break;
                    }
                    i13 = i14;
                    g12 = g13;
                }
                aVar.f1798b = i13;
            }
        }
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final void U(int i10, int i11) {
        this.K.b();
        this.K.f1787b.clear();
    }

    public final void V() {
        this.K.b();
        this.K.f1787b.clear();
    }

    public final void W(int i10, int i11) {
        this.K.b();
        this.K.f1787b.clear();
    }

    public final void X(int i10, int i11) {
        this.K.b();
        this.K.f1787b.clear();
    }

    public final void Y(int i10, int i11) {
        this.K.b();
        this.K.f1787b.clear();
    }

    public final void Z(RecyclerView.r rVar, RecyclerView.w wVar) {
        if (wVar.f1927g) {
            int w = w();
            for (int i10 = 0; i10 < w; i10++) {
                b bVar = (b) v(i10).getLayoutParams();
                int a10 = bVar.a();
                this.I.put(a10, bVar.f1785f);
                this.J.put(a10, bVar.f1784e);
            }
        }
        super.Z(rVar, wVar);
        this.I.clear();
        this.J.clear();
    }

    public final void Z0(boolean z9) {
        if (!z9) {
            super.Z0(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public final void a0(RecyclerView.w wVar) {
        super.a0(wVar);
        this.E = false;
    }

    public final void d1(int i10) {
        int i11;
        int[] iArr = this.G;
        int i12 = this.F;
        if (!(iArr != null && iArr.length == i12 + 1 && iArr[iArr.length - 1] == i10)) {
            iArr = new int[(i12 + 1)];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i10 / i12;
        int i15 = i10 % i12;
        int i16 = 0;
        for (int i17 = 1; i17 <= i12; i17++) {
            i13 += i15;
            if (i13 <= 0 || i12 - i13 >= i15) {
                i11 = i14;
            } else {
                i11 = i14 + 1;
                i13 -= i12;
            }
            i16 += i11;
            iArr[i17] = i16;
        }
        this.G = iArr;
    }

    public final int e1(int i10, int i11) {
        if (this.f1788p != 1 || !R0()) {
            int[] iArr = this.G;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.G;
        int i12 = this.F;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    public final int f1(int i10, RecyclerView.r rVar, RecyclerView.w wVar) {
        if (!wVar.f1927g) {
            a aVar = this.K;
            int i11 = this.F;
            aVar.getClass();
            return c.a(i10, i11);
        }
        int b10 = rVar.b(i10);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
            return 0;
        }
        a aVar2 = this.K;
        int i12 = this.F;
        aVar2.getClass();
        return c.a(b10, i12);
    }

    public final boolean g(RecyclerView.m mVar) {
        return mVar instanceof b;
    }

    public final int g1(int i10, RecyclerView.r rVar, RecyclerView.w wVar) {
        if (!wVar.f1927g) {
            a aVar = this.K;
            int i11 = this.F;
            aVar.getClass();
            return i10 % i11;
        }
        int i12 = this.J.get(i10, -1);
        if (i12 != -1) {
            return i12;
        }
        int b10 = rVar.b(i10);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 0;
        }
        a aVar2 = this.K;
        int i13 = this.F;
        aVar2.getClass();
        return b10 % i13;
    }

    public final int h1(int i10, RecyclerView.r rVar, RecyclerView.w wVar) {
        if (!wVar.f1927g) {
            this.K.getClass();
            return 1;
        }
        int i11 = this.I.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        if (rVar.b(i10) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 1;
        }
        this.K.getClass();
        return 1;
    }

    public final void i1(View view, int i10, boolean z9) {
        int i11;
        int i12;
        boolean z10;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f1887b;
        int i13 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i14 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int e12 = e1(bVar.f1784e, bVar.f1785f);
        if (this.f1788p == 1) {
            i11 = RecyclerView.l.x(false, e12, i10, i14, bVar.width);
            i12 = RecyclerView.l.x(true, this.f1790r.l(), this.f1877m, i13, bVar.height);
        } else {
            int x9 = RecyclerView.l.x(false, e12, i10, i13, bVar.height);
            int x10 = RecyclerView.l.x(true, this.f1790r.l(), this.f1876l, i14, bVar.width);
            i12 = x9;
            i11 = x10;
        }
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        if (z9) {
            z10 = u0(view, i11, i12, mVar);
        } else {
            z10 = s0(view, i11, i12, mVar);
        }
        if (z10) {
            view.measure(i11, i12);
        }
    }

    public final void j1(int i10) {
        if (i10 != this.F) {
            this.E = true;
            if (i10 >= 1) {
                this.F = i10;
                this.K.b();
                j0();
                return;
            }
            throw new IllegalArgumentException(e.a("Span count should be at least 1. Provided ", i10));
        }
    }

    public final int k0(int i10, RecyclerView.r rVar, RecyclerView.w wVar) {
        k1();
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
        return super.k0(i10, rVar, wVar);
    }

    public final void k1() {
        int i10;
        int i11;
        if (this.f1788p == 1) {
            i11 = this.f1878n - E();
            i10 = D();
        } else {
            i11 = this.f1879o - C();
            i10 = F();
        }
        d1(i11 - i10);
    }

    public final int l(RecyclerView.w wVar) {
        return B0(wVar);
    }

    public final int m(RecyclerView.w wVar) {
        return C0(wVar);
    }

    public final int m0(int i10, RecyclerView.r rVar, RecyclerView.w wVar) {
        k1();
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
        return super.m0(i10, rVar, wVar);
    }

    public final int o(RecyclerView.w wVar) {
        return B0(wVar);
    }

    public final int p(RecyclerView.w wVar) {
        return C0(wVar);
    }

    public final void p0(Rect rect, int i10, int i11) {
        int i12;
        int i13;
        if (this.G == null) {
            super.p0(rect, i10, i11);
        }
        int E2 = E() + D();
        int C = C() + F();
        if (this.f1788p == 1) {
            int height = rect.height() + C;
            RecyclerView recyclerView = this.f1867b;
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            i13 = RecyclerView.l.h(i11, height, y.d.d(recyclerView));
            int[] iArr = this.G;
            i12 = RecyclerView.l.h(i10, iArr[iArr.length - 1] + E2, y.d.e(this.f1867b));
        } else {
            int width = rect.width() + E2;
            RecyclerView recyclerView2 = this.f1867b;
            WeakHashMap<View, l0> weakHashMap2 = y.f6776a;
            i12 = RecyclerView.l.h(i10, width, y.d.e(recyclerView2));
            int[] iArr2 = this.G;
            i13 = RecyclerView.l.h(i11, iArr2[iArr2.length - 1] + C, y.d.d(this.f1867b));
        }
        this.f1867b.setMeasuredDimension(i12, i13);
    }

    public final RecyclerView.m s() {
        return this.f1788p == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    public final RecyclerView.m t(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public final RecyclerView.m u(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    public final boolean x0() {
        return this.f1796z == null && !this.E;
    }

    public final int y(RecyclerView.r rVar, RecyclerView.w wVar) {
        if (this.f1788p == 1) {
            return this.F;
        }
        if (wVar.b() < 1) {
            return 0;
        }
        return f1(wVar.b() - 1, rVar, wVar) + 1;
    }

    public final void z0(RecyclerView.w wVar, LinearLayoutManager.c cVar, RecyclerView.l.c cVar2) {
        boolean z9;
        int i10 = this.F;
        int i11 = 0;
        while (i11 < this.F) {
            int i12 = cVar.f1809d;
            if (i12 < 0 || i12 >= wVar.b()) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9 && i10 > 0) {
                ((m.b) cVar2).a(cVar.f1809d, Math.max(0, cVar.f1812g));
                this.K.getClass();
                i10--;
                cVar.f1809d += cVar.f1810e;
                i11++;
            } else {
                return;
            }
        }
    }
}
