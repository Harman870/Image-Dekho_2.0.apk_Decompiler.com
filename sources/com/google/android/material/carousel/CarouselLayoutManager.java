package com.google.android.material.carousel;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.a;
import com.imgdkh.app.R;
import h0.l0;
import h0.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

public class CarouselLayoutManager extends RecyclerView.l implements z4.a {

    /* renamed from: p  reason: collision with root package name */
    public int f3009p;

    /* renamed from: q  reason: collision with root package name */
    public int f3010q;

    /* renamed from: r  reason: collision with root package name */
    public int f3011r;

    /* renamed from: s  reason: collision with root package name */
    public final b f3012s = new b();

    /* renamed from: t  reason: collision with root package name */
    public androidx.activity.result.c f3013t = new c();
    public b u = null;

    /* renamed from: v  reason: collision with root package name */
    public a f3014v;
    public int w = 0;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public View f3015a;

        /* renamed from: b  reason: collision with root package name */
        public float f3016b;

        /* renamed from: c  reason: collision with root package name */
        public c f3017c;

        public a(View view, float f10, c cVar) {
            this.f3015a = view;
            this.f3016b = f10;
            this.f3017c = cVar;
        }
    }

    public static class b extends RecyclerView.k {

        /* renamed from: a  reason: collision with root package name */
        public final Paint f3018a;

        /* renamed from: b  reason: collision with root package name */
        public List<a.b> f3019b = Collections.unmodifiableList(new ArrayList());

        public b() {
            Paint paint = new Paint();
            this.f3018a = paint;
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        public final void d(Canvas canvas, RecyclerView recyclerView) {
            this.f3018a.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
            for (a.b next : this.f3019b) {
                Paint paint = this.f3018a;
                float f10 = next.f3035c;
                ThreadLocal<double[]> threadLocal = a0.a.f2a;
                float f11 = 1.0f - f10;
                paint.setColor(Color.argb((int) ((((float) Color.alpha(-16776961)) * f10) + (((float) Color.alpha(-65281)) * f11)), (int) ((((float) Color.red(-16776961)) * f10) + (((float) Color.red(-65281)) * f11)), (int) ((((float) Color.green(-16776961)) * f10) + (((float) Color.green(-65281)) * f11)), (int) ((((float) Color.blue(-16776961)) * f10) + (((float) Color.blue(-65281)) * f11))));
                float f12 = next.f3034b;
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) recyclerView.getLayoutManager();
                canvas.drawLine(next.f3034b, (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).F(), f12, (float) (carouselLayoutManager.f1879o - carouselLayoutManager.C()), this.f3018a);
            }
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final a.b f3020a;

        /* renamed from: b  reason: collision with root package name */
        public final a.b f3021b;

        public c(a.b bVar, a.b bVar2) {
            if (bVar.f3033a <= bVar2.f3033a) {
                this.f3020a = bVar;
                this.f3021b = bVar2;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    public CarouselLayoutManager() {
        j0();
    }

    public static float F0(float f10, c cVar) {
        a.b bVar = cVar.f3020a;
        float f11 = bVar.f3036d;
        a.b bVar2 = cVar.f3021b;
        return s4.a.a(f11, bVar2.f3036d, bVar.f3034b, bVar2.f3034b, f10);
    }

    public static c H0(float f10, List list, boolean z9) {
        float f11 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            a.b bVar = (a.b) list.get(i14);
            float f15 = z9 ? bVar.f3034b : bVar.f3033a;
            float abs = Math.abs(f15 - f10);
            if (f15 <= f10 && abs <= f11) {
                i10 = i14;
                f11 = abs;
            }
            if (f15 > f10 && abs <= f13) {
                i12 = i14;
                f13 = abs;
            }
            if (f15 <= f14) {
                i11 = i14;
                f14 = f15;
            }
            if (f15 > f12) {
                i13 = i14;
                f12 = f15;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new c((a.b) list.get(i10), (a.b) list.get(i12));
    }

    public final void A0(int i10, RecyclerView.r rVar, RecyclerView.w wVar) {
        int D0 = D0(i10);
        while (i10 < wVar.b()) {
            a L0 = L0(rVar, (float) D0, i10);
            if (!J0(L0.f3016b, L0.f3017c)) {
                D0 = z0(D0, (int) this.f3014v.f3022a);
                if (!K0(L0.f3016b, L0.f3017c)) {
                    y0(L0.f3015a, -1, L0.f3016b);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void B0(int i10, RecyclerView.r rVar) {
        int D0 = D0(i10);
        while (i10 >= 0) {
            a L0 = L0(rVar, (float) D0, i10);
            if (!K0(L0.f3016b, L0.f3017c)) {
                int i11 = (int) this.f3014v.f3022a;
                if (I0()) {
                    D0 += i11;
                } else {
                    D0 -= i11;
                }
                if (!J0(L0.f3016b, L0.f3017c)) {
                    y0(L0.f3015a, 0, L0.f3016b);
                }
                i10--;
            } else {
                return;
            }
        }
    }

    public final float C0(View view, float f10, c cVar) {
        a.b bVar = cVar.f3020a;
        float f11 = bVar.f3034b;
        a.b bVar2 = cVar.f3021b;
        float a10 = s4.a.a(f11, bVar2.f3034b, bVar.f3033a, bVar2.f3033a, f10);
        if (cVar.f3021b != this.f3014v.b() && cVar.f3020a != this.f3014v.d()) {
            return a10;
        }
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        float f12 = ((float) (mVar.rightMargin + mVar.leftMargin)) / this.f3014v.f3022a;
        a.b bVar3 = cVar.f3021b;
        return a10 + (((1.0f - bVar3.f3035c) + f12) * (f10 - bVar3.f3033a));
    }

    public final int D0(int i10) {
        int i11;
        if (I0()) {
            i11 = this.f1878n;
        } else {
            i11 = 0;
        }
        return z0((int) ((float) (i11 - this.f3009p)), (int) (this.f3014v.f3022a * ((float) i10)));
    }

    public final void E0(RecyclerView.r rVar, RecyclerView.w wVar) {
        while (w() > 0) {
            View v10 = v(0);
            Rect rect = new Rect();
            super.z(v10, rect);
            float centerX = (float) rect.centerX();
            if (!K0(centerX, H0(centerX, this.f3014v.f3023b, true))) {
                break;
            }
            g0(v10, rVar);
        }
        while (w() - 1 >= 0) {
            View v11 = v(w() - 1);
            Rect rect2 = new Rect();
            super.z(v11, rect2);
            float centerX2 = (float) rect2.centerX();
            if (!J0(centerX2, H0(centerX2, this.f3014v.f3023b, true))) {
                break;
            }
            g0(v11, rVar);
        }
        if (w() == 0) {
            B0(this.w - 1, rVar);
            A0(this.w, rVar, wVar);
            return;
        }
        int G = RecyclerView.l.G(v(0));
        int G2 = RecyclerView.l.G(v(w() - 1));
        B0(G - 1, rVar);
        A0(G2 + 1, rVar, wVar);
    }

    public final int G0(a aVar, int i10) {
        if (I0()) {
            float f10 = aVar.f3022a;
            return (int) (((((float) this.f1878n) - aVar.c().f3033a) - (((float) i10) * f10)) - (f10 / 2.0f));
        }
        return (int) ((aVar.f3022a / 2.0f) + ((((float) i10) * aVar.f3022a) - aVar.a().f3033a));
    }

    public final boolean I0() {
        return B() == 1;
    }

    public final boolean J0(float f10, c cVar) {
        int i10;
        float F0 = F0(f10, cVar);
        int i11 = (int) f10;
        int i12 = (int) (F0 / 2.0f);
        if (I0()) {
            i10 = i11 + i12;
        } else {
            i10 = i11 - i12;
        }
        if (I0()) {
            if (i10 < 0) {
                return true;
            }
        } else if (i10 > this.f1878n) {
            return true;
        }
        return false;
    }

    public final boolean K0(float f10, c cVar) {
        int z02 = z0((int) f10, (int) (F0(f10, cVar) / 2.0f));
        return !I0() ? z02 < 0 : z02 > this.f1878n;
    }

    public final a L0(RecyclerView.r rVar, float f10, int i10) {
        View d10 = rVar.d(i10);
        M0(d10);
        float z02 = (float) z0((int) f10, (int) (this.f3014v.f3022a / 2.0f));
        c H0 = H0(z02, this.f3014v.f3023b, false);
        float C0 = C0(d10, z02, H0);
        if (d10 instanceof z4.c) {
            float f11 = H0.f3020a.f3035c;
            float f12 = H0.f3021b.f3035c;
            LinearInterpolator linearInterpolator = s4.a.f11855a;
            ((z4.c) d10).a();
        }
        return new a(d10, C0, H0);
    }

    public final void M0(View view) {
        float f10;
        if (view instanceof z4.c) {
            RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
            Rect rect = new Rect();
            d(view, rect);
            int i10 = rect.left + rect.right + 0;
            int i11 = rect.top + rect.bottom + 0;
            b bVar = this.u;
            if (bVar != null) {
                f10 = bVar.f3037a.f3022a;
            } else {
                f10 = (float) mVar.width;
            }
            view.measure(RecyclerView.l.x(true, this.f1878n, this.f1876l, E() + D() + mVar.leftMargin + mVar.rightMargin + i10, (int) f10), RecyclerView.l.x(false, this.f1879o, this.f1877m, C() + F() + mVar.topMargin + mVar.bottomMargin + i11, mVar.height));
            return;
        }
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public final void N0() {
        a aVar;
        int i10 = this.f3011r;
        int i11 = this.f3010q;
        if (i10 > i11) {
            b bVar = this.u;
            float f10 = (float) this.f3009p;
            float f11 = (float) i11;
            float f12 = (float) i10;
            float f13 = bVar.f3042f + f11;
            float f14 = f12 - bVar.f3043g;
            if (f10 < f13) {
                aVar = b.b(bVar.f3038b, s4.a.a(1.0f, 0.0f, f11, f13, f10), bVar.f3040d);
            } else if (f10 > f14) {
                aVar = b.b(bVar.f3039c, s4.a.a(0.0f, 1.0f, f14, f12, f10), bVar.f3041e);
            } else {
                aVar = bVar.f3037a;
            }
        } else if (I0()) {
            List<a> list = this.u.f3039c;
            aVar = list.get(list.size() - 1);
        } else {
            List<a> list2 = this.u.f3038b;
            aVar = list2.get(list2.size() - 1);
        }
        this.f3014v = aVar;
        b bVar2 = this.f3012s;
        List<a.b> list3 = aVar.f3023b;
        bVar2.getClass();
        bVar2.f3019b = Collections.unmodifiableList(list3);
    }

    public final void R(AccessibilityEvent accessibilityEvent) {
        super.R(accessibilityEvent);
        if (w() > 0) {
            accessibilityEvent.setFromIndex(RecyclerView.l.G(v(0)));
            accessibilityEvent.setToIndex(RecyclerView.l.G(v(w() - 1)));
        }
    }

    public final void Z(RecyclerView.r rVar, RecyclerView.w wVar) {
        boolean z9;
        int i10;
        a aVar;
        a.b bVar;
        int i11;
        int i12;
        int i13;
        int i14;
        a aVar2;
        a.b bVar2;
        int i15;
        float f10;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z10;
        boolean z11;
        int i21;
        int i22;
        boolean z12;
        boolean z13 = false;
        if (wVar.b() <= 0) {
            e0(rVar);
            this.w = 0;
            return;
        }
        boolean I0 = I0();
        int i23 = 1;
        if (this.u == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            View d10 = rVar.d(0);
            M0(d10);
            a j10 = this.f3013t.j(this, d10);
            if (I0) {
                a.C0025a aVar3 = new a.C0025a(j10.f3022a);
                float f11 = j10.b().f3034b - (j10.b().f3036d / 2.0f);
                int size = j10.f3023b.size() - 1;
                while (size >= 0) {
                    a.b bVar3 = j10.f3023b.get(size);
                    float f12 = bVar3.f3036d;
                    float f13 = (f12 / 2.0f) + f11;
                    if (size < j10.f3024c || size > j10.f3025d) {
                        z12 = z13;
                    } else {
                        z12 = true;
                    }
                    aVar3.a(f13, bVar3.f3035c, f12, z12);
                    f11 += bVar3.f3036d;
                    size--;
                    z13 = false;
                }
                j10 = aVar3.b();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(j10);
            int i24 = 0;
            while (true) {
                if (i24 >= j10.f3023b.size()) {
                    i24 = -1;
                    break;
                } else if (j10.f3023b.get(i24).f3034b >= 0.0f) {
                    break;
                } else {
                    i24++;
                }
            }
            if (j10.a().f3034b - (j10.a().f3036d / 2.0f) <= 0.0f || j10.a() == j10.b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && i24 != -1) {
                int i25 = (j10.f3024c - 1) - i24;
                float f14 = j10.b().f3034b - (j10.b().f3036d / 2.0f);
                int i26 = 0;
                while (i26 <= i25) {
                    a aVar4 = (a) arrayList.get(arrayList.size() - i23);
                    int size2 = j10.f3023b.size() - i23;
                    int i27 = (i24 + i26) - i23;
                    if (i27 >= 0) {
                        float f15 = j10.f3023b.get(i27).f3035c;
                        int i28 = aVar4.f3025d;
                        while (true) {
                            if (i28 >= aVar4.f3023b.size()) {
                                i28 = aVar4.f3023b.size() - 1;
                                break;
                            } else if (f15 == aVar4.f3023b.get(i28).f3035c) {
                                break;
                            } else {
                                i28++;
                            }
                        }
                        i22 = i28 - 1;
                    } else {
                        i22 = size2;
                    }
                    arrayList.add(b.c(aVar4, i24, i22, f14, (j10.f3024c - i26) - 1, (j10.f3025d - i26) - 1));
                    i26++;
                    i23 = 1;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(j10);
            int size3 = j10.f3023b.size() - 1;
            while (true) {
                if (size3 < 0) {
                    size3 = -1;
                    break;
                } else if (j10.f3023b.get(size3).f3034b <= ((float) this.f1878n)) {
                    break;
                } else {
                    size3--;
                }
            }
            if ((j10.c().f3036d / 2.0f) + j10.c().f3034b >= ((float) this.f1878n) || j10.c() == j10.d()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 && size3 != -1) {
                float f16 = j10.b().f3034b - (j10.b().f3036d / 2.0f);
                int i29 = 0;
                for (int i30 = size3 - j10.f3025d; i29 < i30; i30 = i30) {
                    a aVar5 = (a) arrayList2.get(arrayList2.size() - 1);
                    int i31 = (size3 - i29) + 1;
                    if (i31 < j10.f3023b.size()) {
                        float f17 = j10.f3023b.get(i31).f3035c;
                        int i32 = aVar5.f3024c - 1;
                        while (true) {
                            if (i32 < 0) {
                                i32 = 0;
                                break;
                            } else if (f17 == aVar5.f3023b.get(i32).f3035c) {
                                break;
                            } else {
                                i32--;
                            }
                        }
                        i21 = i32 + 1;
                    } else {
                        i21 = 0;
                    }
                    int i33 = j10.f3024c + i29 + 1;
                    int i34 = j10.f3025d + i29 + 1;
                    int i35 = i29;
                    arrayList2.add(b.c(aVar5, size3, i21, f16, i33, i34));
                    i29 = i35 + 1;
                }
            }
            i10 = 1;
            this.u = new b(j10, arrayList, arrayList2);
        } else {
            RecyclerView.r rVar2 = rVar;
            i10 = 1;
        }
        b bVar4 = this.u;
        boolean I02 = I0();
        if (I02) {
            List<a> list = bVar4.f3039c;
            aVar = list.get(list.size() - 1);
        } else {
            List<a> list2 = bVar4.f3038b;
            aVar = list2.get(list2.size() - 1);
        }
        if (I02) {
            bVar = aVar.c();
        } else {
            bVar = aVar.a();
        }
        RecyclerView recyclerView = this.f1867b;
        if (recyclerView != null) {
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            i11 = y.e.f(recyclerView);
        } else {
            i11 = 0;
        }
        if (I02) {
            i12 = i10;
        } else {
            i12 = -1;
        }
        float f18 = (float) (i11 * i12);
        int i36 = (int) bVar.f3033a;
        int i37 = (int) (aVar.f3022a / 2.0f);
        if (I0()) {
            i13 = i36 + i37;
        } else {
            i13 = i36 - i37;
        }
        if (I0()) {
            i14 = this.f1878n;
        } else {
            i14 = 0;
        }
        int i38 = (int) ((f18 + ((float) i14)) - ((float) i13));
        b bVar5 = this.u;
        boolean I03 = I0();
        if (I03) {
            List<a> list3 = bVar5.f3038b;
            aVar2 = list3.get(list3.size() - 1);
        } else {
            List<a> list4 = bVar5.f3039c;
            aVar2 = list4.get(list4.size() - 1);
        }
        if (I03) {
            bVar2 = aVar2.a();
        } else {
            bVar2 = aVar2.c();
        }
        float b10 = ((float) (wVar.b() - 1)) * aVar2.f3022a;
        RecyclerView recyclerView2 = this.f1867b;
        if (recyclerView2 != null) {
            WeakHashMap<View, l0> weakHashMap2 = y.f6776a;
            i15 = y.e.e(recyclerView2);
        } else {
            i15 = 0;
        }
        float f19 = b10 + ((float) i15);
        if (I03) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        float f20 = f19 * f10;
        float f21 = bVar2.f3033a;
        if (I0()) {
            i16 = this.f1878n;
        } else {
            i16 = 0;
        }
        float f22 = f21 - ((float) i16);
        if (I0()) {
            i17 = 0;
        } else {
            i17 = this.f1878n;
        }
        float f23 = ((float) i17) - bVar2.f3033a;
        if (Math.abs(f22) > Math.abs(f20)) {
            i18 = 0;
        } else {
            i18 = (int) ((f20 - f22) + f23);
        }
        if (I0) {
            i19 = i18;
        } else {
            i19 = i38;
        }
        this.f3010q = i19;
        if (I0) {
            i18 = i38;
        }
        this.f3011r = i18;
        if (z9) {
            this.f3009p = i38;
        } else {
            int i39 = this.f3009p;
            int i40 = i39 + 0;
            if (i40 < i19) {
                i20 = i19 - i39;
            } else if (i40 > i18) {
                i20 = i18 - i39;
            } else {
                i20 = 0;
            }
            this.f3009p = i20 + i39;
        }
        this.w = z5.c.e(this.w, 0, wVar.b());
        N0();
        q(rVar);
        E0(rVar, wVar);
    }

    public final void a0(RecyclerView.w wVar) {
        if (w() == 0) {
            this.w = 0;
        } else {
            this.w = RecyclerView.l.G(v(0));
        }
    }

    public final boolean i0(RecyclerView recyclerView, View view, Rect rect, boolean z9, boolean z10) {
        b bVar = this.u;
        if (bVar == null) {
            return false;
        }
        int G0 = G0(bVar.f3037a, RecyclerView.l.G(view)) - this.f3009p;
        if (z10 || G0 == 0) {
            return false;
        }
        recyclerView.scrollBy(G0, 0);
        return true;
    }

    public final int k(RecyclerView.w wVar) {
        return (int) this.u.f3037a.f3022a;
    }

    public final int k0(int i10, RecyclerView.r rVar, RecyclerView.w wVar) {
        if (w() == 0 || i10 == 0) {
            return 0;
        }
        int i11 = this.f3009p;
        int i12 = this.f3010q;
        int i13 = this.f3011r;
        int i14 = i11 + i10;
        if (i14 < i12) {
            i10 = i12 - i11;
        } else if (i14 > i13) {
            i10 = i13 - i11;
        }
        this.f3009p = i11 + i10;
        N0();
        float f10 = this.f3014v.f3022a / 2.0f;
        int D0 = D0(RecyclerView.l.G(v(0)));
        Rect rect = new Rect();
        for (int i15 = 0; i15 < w(); i15++) {
            View v10 = v(i15);
            float z02 = (float) z0((int) ((float) D0), (int) f10);
            c H0 = H0(z02, this.f3014v.f3023b, false);
            float C0 = C0(v10, z02, H0);
            if (v10 instanceof z4.c) {
                float f11 = H0.f3020a.f3035c;
                float f12 = H0.f3021b.f3035c;
                LinearInterpolator linearInterpolator = s4.a.f11855a;
                ((z4.c) v10).a();
            }
            super.z(v10, rect);
            v10.offsetLeftAndRight((int) (C0 - (((float) rect.left) + f10)));
            D0 = z0(D0, (int) this.f3014v.f3022a);
        }
        E0(rVar, wVar);
        return i10;
    }

    public final int l(RecyclerView.w wVar) {
        return this.f3009p;
    }

    public final void l0(int i10) {
        b bVar = this.u;
        if (bVar != null) {
            this.f3009p = G0(bVar.f3037a, i10);
            this.w = z5.c.e(i10, 0, Math.max(0, A() - 1));
            N0();
            j0();
        }
    }

    public final int m(RecyclerView.w wVar) {
        return this.f3011r - this.f3010q;
    }

    public final RecyclerView.m s() {
        return new RecyclerView.m(-2, -2);
    }

    public final void v0(RecyclerView recyclerView, int i10) {
        z4.b bVar = new z4.b(this, recyclerView.getContext());
        bVar.f1906a = i10;
        w0(bVar);
    }

    public final void y0(View view, int i10, float f10) {
        float f11 = this.f3014v.f3022a / 2.0f;
        b(view, i10, false);
        RecyclerView.l.M(view, (int) (f10 - f11), F(), (int) (f10 + f11), this.f1879o - C());
    }

    public final void z(View view, Rect rect) {
        super.z(view, rect);
        float centerX = (float) rect.centerX();
        float width = (((float) rect.width()) - F0(centerX, H0(centerX, this.f3014v.f3023b, true))) / 2.0f;
        rect.set((int) (((float) rect.left) + width), rect.top, (int) (((float) rect.right) - width), rect.bottom);
    }

    public final int z0(int i10, int i11) {
        return I0() ? i10 - i11 : i10 + i11;
    }
}
