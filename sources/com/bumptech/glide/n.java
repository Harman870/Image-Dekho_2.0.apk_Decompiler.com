package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import com.bumptech.glide.manager.p;
import f2.b;
import f2.d;
import f2.e;
import f2.f;
import f2.g;
import f2.i;
import f2.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import q1.l;

public final class n<TranscodeType> extends f2.a<n<TranscodeType>> {
    public final Context A;
    public final o B;
    public final Class<TranscodeType> C;
    public final h D;
    public p<?, ? super TranscodeType> E;
    public Object F;
    public ArrayList G;
    public n<TranscodeType> H;
    public n<TranscodeType> I;
    public boolean J = true;
    public boolean K;
    public boolean L;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2659a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f2660b;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|(2:1|2)|3|5|6|7|8|9|(2:11|12)|13|15|16|17|18|19|20|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|8|9|(2:11|12)|13|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|5|6|7|8|9|11|12|13|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0037 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0041 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0061 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
        static {
            /*
                com.bumptech.glide.j[] r0 = com.bumptech.glide.j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2660b = r0
                r1 = 1
                r2 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 2
                int[] r3 = f2660b     // Catch:{ NoSuchFieldError -> 0x0012 }
                r3[r0] = r0     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r3 = f2660b     // Catch:{ NoSuchFieldError -> 0x0016 }
                r3[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                r3 = 4
                int[] r4 = f2660b     // Catch:{ NoSuchFieldError -> 0x001c }
                r5 = 0
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f2659a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x002d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r1 = f2659a     // Catch:{ NoSuchFieldError -> 0x0037 }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0037 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0037 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0037 }
            L_0x0037:
                int[] r0 = f2659a     // Catch:{ NoSuchFieldError -> 0x0041 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0041 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0041 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0041 }
            L_0x0041:
                int[] r0 = f2659a     // Catch:{ NoSuchFieldError -> 0x004b }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f2659a     // Catch:{ NoSuchFieldError -> 0x0056 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f2659a     // Catch:{ NoSuchFieldError -> 0x0061 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0061 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0061 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0061 }
            L_0x0061:
                int[] r0 = f2659a     // Catch:{ NoSuchFieldError -> 0x006c }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f2659a     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.n.a.<clinit>():void");
        }
    }

    static {
        g gVar = (g) ((g) ((g) new g().e(l.f11057b)).j()).n();
    }

    @SuppressLint({"CheckResult"})
    public n(b bVar, o oVar, Class<TranscodeType> cls, Context context) {
        g gVar;
        this.B = oVar;
        this.C = cls;
        this.A = context;
        h hVar = oVar.f2661a.f2548c;
        p<?, ? super TranscodeType> pVar = hVar.f2558f.get(cls);
        if (pVar == null) {
            for (Map.Entry next : hVar.f2558f.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    pVar = (p) next.getValue();
                }
            }
        }
        this.E = pVar == null ? h.k : pVar;
        this.D = bVar.f2548c;
        Iterator<f<Object>> it = oVar.f2669i.iterator();
        while (it.hasNext()) {
            v(it.next());
        }
        synchronized (oVar) {
            gVar = oVar.f2670j;
        }
        w(gVar);
    }

    public final n<TranscodeType> A(f<TranscodeType> fVar) {
        if (this.f6337v) {
            return clone().A(fVar);
        }
        this.G = null;
        return v(fVar);
    }

    public final n<TranscodeType> B(Object obj) {
        if (this.f6337v) {
            return clone().B(obj);
        }
        this.F = obj;
        this.K = true;
        k();
        return this;
    }

    public final i C(int i10, int i11, j jVar, p pVar, f2.a aVar, e eVar, g2.g gVar, Object obj) {
        Context context = this.A;
        h hVar = this.D;
        return new i(context, hVar, obj, this.F, this.C, aVar, i10, i11, jVar, gVar, this.G, eVar, hVar.f2559g, pVar.f2674a);
    }

    public final f2.a b(f2.a aVar) {
        y3.a.h(aVar);
        return (n) super.b(aVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            return super.equals(nVar) && Objects.equals(this.C, nVar.C) && this.E.equals(nVar.E) && Objects.equals(this.F, nVar.F) && Objects.equals(this.G, nVar.G) && Objects.equals(this.H, nVar.H) && Objects.equals(this.I, nVar.I) && this.J == nVar.J && this.K == nVar.K;
        }
    }

    public final int hashCode() {
        return j2.l.h(j2.l.h(j2.l.g(j2.l.g(j2.l.g(j2.l.g(j2.l.g(j2.l.g(j2.l.g(super.hashCode(), this.C), this.E), this.F), this.G), this.H), this.I), (Object) null), this.J), this.K);
    }

    public final n<TranscodeType> v(f<TranscodeType> fVar) {
        if (this.f6337v) {
            return clone().v(fVar);
        }
        if (fVar != null) {
            if (this.G == null) {
                this.G = new ArrayList();
            }
            this.G.add(fVar);
        }
        k();
        return this;
    }

    public final n<TranscodeType> w(f2.a<?> aVar) {
        y3.a.h(aVar);
        return (n) super.b(aVar);
    }

    public final d x(int i10, int i11, j jVar, p pVar, f2.a aVar, e eVar, g2.g gVar, Object obj) {
        b bVar;
        b bVar2;
        j jVar2;
        int i12;
        j jVar3;
        int i13;
        int i14;
        f2.a aVar2 = aVar;
        Object obj2 = obj;
        if (this.I != null) {
            bVar2 = new b(obj2, eVar);
            bVar = bVar2;
        } else {
            bVar = null;
            bVar2 = eVar;
        }
        n<TranscodeType> nVar = this.H;
        if (nVar == null) {
            jVar2 = C(i10, i11, jVar, pVar, aVar, bVar2, gVar, obj);
        } else if (!this.L) {
            p<?, ? super TranscodeType> pVar2 = nVar.J ? pVar : nVar.E;
            if (f2.a.f(nVar.f6318a, 8)) {
                jVar3 = this.H.f6321d;
            } else {
                int ordinal = jVar.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    jVar3 = j.IMMEDIATE;
                } else if (ordinal == 2) {
                    jVar3 = j.HIGH;
                } else if (ordinal == 3) {
                    jVar3 = j.NORMAL;
                } else {
                    StringBuilder g10 = androidx.activity.f.g("unknown priority: ");
                    g10.append(this.f6321d);
                    throw new IllegalArgumentException(g10.toString());
                }
            }
            j jVar4 = jVar3;
            n<TranscodeType> nVar2 = this.H;
            int i15 = nVar2.k;
            int i16 = nVar2.f6327j;
            if (j2.l.j(i10, i11)) {
                n<TranscodeType> nVar3 = this.H;
                if (!j2.l.j(nVar3.k, nVar3.f6327j)) {
                    i14 = aVar2.k;
                    i13 = aVar2.f6327j;
                    j jVar5 = new j(obj2, bVar2);
                    g2.g gVar2 = gVar;
                    j jVar6 = jVar5;
                    i C2 = C(i10, i11, jVar, pVar, aVar, jVar5, gVar2, obj);
                    this.L = true;
                    n<TranscodeType> nVar4 = this.H;
                    d x9 = nVar4.x(i14, i13, jVar4, pVar2, nVar4, jVar6, gVar2, obj);
                    this.L = false;
                    j jVar7 = jVar6;
                    jVar7.f6372c = C2;
                    jVar7.f6373d = x9;
                    jVar2 = jVar7;
                }
            }
            i13 = i16;
            i14 = i15;
            j jVar52 = new j(obj2, bVar2);
            g2.g gVar22 = gVar;
            j jVar62 = jVar52;
            i C22 = C(i10, i11, jVar, pVar, aVar, jVar52, gVar22, obj);
            this.L = true;
            n<TranscodeType> nVar42 = this.H;
            d x92 = nVar42.x(i14, i13, jVar4, pVar2, nVar42, jVar62, gVar22, obj);
            this.L = false;
            j jVar72 = jVar62;
            jVar72.f6372c = C22;
            jVar72.f6373d = x92;
            jVar2 = jVar72;
        } else {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        if (bVar == null) {
            return jVar2;
        }
        n<TranscodeType> nVar5 = this.I;
        int i17 = nVar5.k;
        int i18 = nVar5.f6327j;
        if (j2.l.j(i10, i11)) {
            n<TranscodeType> nVar6 = this.I;
            if (!j2.l.j(nVar6.k, nVar6.f6327j)) {
                int i19 = aVar2.k;
                i12 = aVar2.f6327j;
                i17 = i19;
                n<TranscodeType> nVar7 = this.I;
                d x10 = nVar7.x(i17, i12, nVar7.f6321d, nVar7.E, nVar7, bVar, gVar, obj);
                bVar.f6343c = jVar2;
                bVar.f6344d = x10;
                return bVar;
            }
        }
        i12 = i18;
        n<TranscodeType> nVar72 = this.I;
        d x102 = nVar72.x(i17, i12, nVar72.f6321d, nVar72.E, nVar72, bVar, gVar, obj);
        bVar.f6343c = jVar2;
        bVar.f6344d = x102;
        return bVar;
    }

    /* renamed from: y */
    public final n<TranscodeType> clone() {
        n<TranscodeType> nVar = (n) super.clone();
        nVar.E = nVar.E.clone();
        if (nVar.G != null) {
            nVar.G = new ArrayList(nVar.G);
        }
        n<TranscodeType> nVar2 = nVar.H;
        if (nVar2 != null) {
            nVar.H = nVar2.clone();
        }
        n<TranscodeType> nVar3 = nVar.I;
        if (nVar3 != null) {
            nVar.I = nVar3.clone();
        }
        return nVar;
    }

    public final void z(g2.g gVar, f2.a aVar) {
        boolean z9;
        y3.a.h(gVar);
        if (this.K) {
            Object obj = new Object();
            p<?, ? super TranscodeType> pVar = this.E;
            d x9 = x(aVar.k, aVar.f6327j, aVar.f6321d, pVar, aVar, (e) null, gVar, obj);
            d g10 = gVar.g();
            if (x9.e(g10)) {
                if (aVar.f6326i || !g10.i()) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (!z9) {
                    y3.a.h(g10);
                    if (!g10.isRunning()) {
                        g10.h();
                        return;
                    }
                    return;
                }
            }
            this.B.i(gVar);
            gVar.b(x9);
            o oVar = this.B;
            synchronized (oVar) {
                oVar.f2666f.f2658a.add(gVar);
                p pVar2 = oVar.f2664d;
                pVar2.f2641a.add(x9);
                if (!pVar2.f2643c) {
                    x9.h();
                } else {
                    x9.clear();
                    if (Log.isLoggable("RequestTracker", 2)) {
                        Log.v("RequestTracker", "Paused, delaying request");
                    }
                    pVar2.f2642b.add(x9);
                }
            }
            return;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }
}
