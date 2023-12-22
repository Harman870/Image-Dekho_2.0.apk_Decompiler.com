package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import h0.l0;
import h0.y;
import i0.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;

public class StaggeredGridLayoutManager extends RecyclerView.l implements RecyclerView.v.b {
    public int A;
    public d B;
    public int C;
    public boolean D;
    public boolean E;
    public e F;
    public final Rect G;
    public final b H;
    public boolean I;
    public int[] J;
    public final a K;

    /* renamed from: p  reason: collision with root package name */
    public int f1959p = -1;

    /* renamed from: q  reason: collision with root package name */
    public f[] f1960q;

    /* renamed from: r  reason: collision with root package name */
    public s f1961r;

    /* renamed from: s  reason: collision with root package name */
    public s f1962s;

    /* renamed from: t  reason: collision with root package name */
    public int f1963t;
    public int u;

    /* renamed from: v  reason: collision with root package name */
    public final n f1964v;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1965x;

    /* renamed from: y  reason: collision with root package name */
    public BitSet f1966y;

    /* renamed from: z  reason: collision with root package name */
    public int f1967z;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            StaggeredGridLayoutManager.this.z0();
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1969a;

        /* renamed from: b  reason: collision with root package name */
        public int f1970b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1971c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1972d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1973e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f1974f;

        public b() {
            a();
        }

        public final void a() {
            this.f1969a = -1;
            this.f1970b = Integer.MIN_VALUE;
            this.f1971c = false;
            this.f1972d = false;
            this.f1973e = false;
            int[] iArr = this.f1974f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class c extends RecyclerView.m {

        /* renamed from: e  reason: collision with root package name */
        public f f1976e;

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int[] f1977a;

        /* renamed from: b  reason: collision with root package name */
        public List<a> f1978b;

        @SuppressLint({"BanParcelableUsage"})
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0013a();

            /* renamed from: a  reason: collision with root package name */
            public int f1979a;

            /* renamed from: b  reason: collision with root package name */
            public int f1980b;

            /* renamed from: c  reason: collision with root package name */
            public int[] f1981c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f1982d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            public static class C0013a implements Parcelable.Creator<a> {
                public final Object createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                public final Object[] newArray(int i10) {
                    return new a[i10];
                }
            }

            public a() {
            }

            public a(Parcel parcel) {
                this.f1979a = parcel.readInt();
                this.f1980b = parcel.readInt();
                this.f1982d = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f1981c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                StringBuilder g10 = androidx.activity.f.g("FullSpanItem{mPosition=");
                g10.append(this.f1979a);
                g10.append(", mGapDir=");
                g10.append(this.f1980b);
                g10.append(", mHasUnwantedGapAfter=");
                g10.append(this.f1982d);
                g10.append(", mGapPerSpan=");
                g10.append(Arrays.toString(this.f1981c));
                g10.append('}');
                return g10.toString();
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f1979a);
                parcel.writeInt(this.f1980b);
                parcel.writeInt(this.f1982d ? 1 : 0);
                int[] iArr = this.f1981c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f1981c);
            }
        }

        public final void a(int i10) {
            int[] iArr = this.f1977a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i10, 10) + 1)];
                this.f1977a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int length = iArr.length;
                while (length <= i10) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f1977a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f1977a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int b(int r6) {
            /*
                r5 = this;
                int[] r0 = r5.f1977a
                r1 = -1
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                int r0 = r0.length
                if (r6 < r0) goto L_0x000a
                return r1
            L_0x000a:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f1978b
                if (r0 != 0) goto L_0x000f
                goto L_0x005e
            L_0x000f:
                r2 = 0
                if (r0 != 0) goto L_0x0013
                goto L_0x002b
            L_0x0013:
                int r0 = r0.size()
                int r0 = r0 + r1
            L_0x0018:
                if (r0 < 0) goto L_0x002b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r5.f1978b
                java.lang.Object r3 = r3.get(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r3
                int r4 = r3.f1979a
                if (r4 != r6) goto L_0x0028
                r2 = r3
                goto L_0x002b
            L_0x0028:
                int r0 = r0 + -1
                goto L_0x0018
            L_0x002b:
                if (r2 == 0) goto L_0x0032
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f1978b
                r0.remove(r2)
            L_0x0032:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f1978b
                int r0 = r0.size()
                r2 = 0
            L_0x0039:
                if (r2 >= r0) goto L_0x004b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r5.f1978b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r3
                int r3 = r3.f1979a
                if (r3 < r6) goto L_0x0048
                goto L_0x004c
            L_0x0048:
                int r2 = r2 + 1
                goto L_0x0039
            L_0x004b:
                r2 = r1
            L_0x004c:
                if (r2 == r1) goto L_0x005e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f1978b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r5.f1978b
                r3.remove(r2)
                int r0 = r0.f1979a
                goto L_0x005f
            L_0x005e:
                r0 = r1
            L_0x005f:
                if (r0 != r1) goto L_0x006b
                int[] r0 = r5.f1977a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r6, r2, r1)
                int[] r6 = r5.f1977a
                int r6 = r6.length
                return r6
            L_0x006b:
                int[] r2 = r5.f1977a
                int r0 = r0 + 1
                java.util.Arrays.fill(r2, r6, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.d.b(int):int");
        }

        public final void c(int i10, int i11) {
            int[] iArr = this.f1977a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                a(i12);
                int[] iArr2 = this.f1977a;
                System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
                Arrays.fill(this.f1977a, i10, i12, -1);
                List<a> list = this.f1978b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.f1978b.get(size);
                        int i13 = aVar.f1979a;
                        if (i13 >= i10) {
                            aVar.f1979a = i13 + i11;
                        }
                    }
                }
            }
        }

        public final void d(int i10, int i11) {
            int[] iArr = this.f1977a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                a(i12);
                int[] iArr2 = this.f1977a;
                System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
                int[] iArr3 = this.f1977a;
                Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
                List<a> list = this.f1978b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.f1978b.get(size);
                        int i13 = aVar.f1979a;
                        if (i13 >= i10) {
                            if (i13 < i12) {
                                this.f1978b.remove(size);
                            } else {
                                aVar.f1979a = i13 - i11;
                            }
                        }
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f1983a;

        /* renamed from: b  reason: collision with root package name */
        public int f1984b;

        /* renamed from: c  reason: collision with root package name */
        public int f1985c;

        /* renamed from: d  reason: collision with root package name */
        public int[] f1986d;

        /* renamed from: e  reason: collision with root package name */
        public int f1987e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f1988f;

        /* renamed from: g  reason: collision with root package name */
        public List<d.a> f1989g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1990h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f1991i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f1992j;

        public static class a implements Parcelable.Creator<e> {
            public final Object createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            public final Object[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e() {
        }

        public e(Parcel parcel) {
            this.f1983a = parcel.readInt();
            this.f1984b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f1985c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f1986d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f1987e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f1988f = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z9 = false;
            this.f1990h = parcel.readInt() == 1;
            this.f1991i = parcel.readInt() == 1;
            this.f1992j = parcel.readInt() == 1 ? true : z9;
            this.f1989g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f1985c = eVar.f1985c;
            this.f1983a = eVar.f1983a;
            this.f1984b = eVar.f1984b;
            this.f1986d = eVar.f1986d;
            this.f1987e = eVar.f1987e;
            this.f1988f = eVar.f1988f;
            this.f1990h = eVar.f1990h;
            this.f1991i = eVar.f1991i;
            this.f1992j = eVar.f1992j;
            this.f1989g = eVar.f1989g;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f1983a);
            parcel.writeInt(this.f1984b);
            parcel.writeInt(this.f1985c);
            if (this.f1985c > 0) {
                parcel.writeIntArray(this.f1986d);
            }
            parcel.writeInt(this.f1987e);
            if (this.f1987e > 0) {
                parcel.writeIntArray(this.f1988f);
            }
            parcel.writeInt(this.f1990h ? 1 : 0);
            parcel.writeInt(this.f1991i ? 1 : 0);
            parcel.writeInt(this.f1992j ? 1 : 0);
            parcel.writeList(this.f1989g);
        }
    }

    public class f {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<View> f1993a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        public int f1994b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        public int f1995c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        public int f1996d = 0;

        /* renamed from: e  reason: collision with root package name */
        public final int f1997e;

        public f(int i10) {
            this.f1997e = i10;
        }

        public static c h(View view) {
            return (c) view.getLayoutParams();
        }

        public final void a() {
            ArrayList<View> arrayList = this.f1993a;
            View view = arrayList.get(arrayList.size() - 1);
            c h10 = h(view);
            this.f1995c = StaggeredGridLayoutManager.this.f1961r.b(view);
            h10.getClass();
        }

        public final void b() {
            this.f1993a.clear();
            this.f1994b = Integer.MIN_VALUE;
            this.f1995c = Integer.MIN_VALUE;
            this.f1996d = 0;
        }

        public final int c() {
            int i10;
            int i11;
            if (StaggeredGridLayoutManager.this.w) {
                i11 = this.f1993a.size() - 1;
                i10 = -1;
            } else {
                i11 = 0;
                i10 = this.f1993a.size();
            }
            return e(i11, i10);
        }

        public final int d() {
            int i10;
            int i11;
            if (StaggeredGridLayoutManager.this.w) {
                i11 = 0;
                i10 = this.f1993a.size();
            } else {
                i11 = this.f1993a.size() - 1;
                i10 = -1;
            }
            return e(i11, i10);
        }

        public final int e(int i10, int i11) {
            int k = StaggeredGridLayoutManager.this.f1961r.k();
            int g10 = StaggeredGridLayoutManager.this.f1961r.g();
            int i12 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = this.f1993a.get(i10);
                int e10 = StaggeredGridLayoutManager.this.f1961r.e(view);
                int b10 = StaggeredGridLayoutManager.this.f1961r.b(view);
                boolean z9 = false;
                boolean z10 = e10 <= g10;
                if (b10 >= k) {
                    z9 = true;
                }
                if (!z10 || !z9 || (e10 >= k && b10 <= g10)) {
                    i10 += i12;
                } else {
                    StaggeredGridLayoutManager.this.getClass();
                    return RecyclerView.l.G(view);
                }
            }
            return -1;
        }

        public final int f(int i10) {
            int i11 = this.f1995c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f1993a.size() == 0) {
                return i10;
            }
            a();
            return this.f1995c;
        }

        public final View g(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f1993a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f1993a.get(size);
                    if ((StaggeredGridLayoutManager.this.w && RecyclerView.l.G(view2) >= i10) || ((!StaggeredGridLayoutManager.this.w && RecyclerView.l.G(view2) <= i10) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f1993a.size();
                int i12 = 0;
                while (i12 < size2) {
                    View view3 = this.f1993a.get(i12);
                    if ((StaggeredGridLayoutManager.this.w && RecyclerView.l.G(view3) <= i10) || ((!StaggeredGridLayoutManager.this.w && RecyclerView.l.G(view3) >= i10) || !view3.hasFocusable())) {
                        break;
                    }
                    i12++;
                    view = view3;
                }
            }
            return view;
        }

        public final int i(int i10) {
            int i11 = this.f1994b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f1993a.size() == 0) {
                return i10;
            }
            View view = this.f1993a.get(0);
            c h10 = h(view);
            this.f1994b = StaggeredGridLayoutManager.this.f1961r.e(view);
            h10.getClass();
            return this.f1994b;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.w = false;
        this.f1965x = false;
        this.f1967z = -1;
        this.A = Integer.MIN_VALUE;
        this.B = new d();
        this.C = 2;
        this.G = new Rect();
        this.H = new b();
        this.I = true;
        this.K = new a();
        RecyclerView.l.d H2 = RecyclerView.l.H(context, attributeSet, i10, i11);
        int i12 = H2.f1882a;
        if (i12 == 0 || i12 == 1) {
            c((String) null);
            if (i12 != this.f1963t) {
                this.f1963t = i12;
                s sVar = this.f1961r;
                this.f1961r = this.f1962s;
                this.f1962s = sVar;
                j0();
            }
            int i13 = H2.f1883b;
            c((String) null);
            if (i13 != this.f1959p) {
                d dVar = this.B;
                int[] iArr = dVar.f1977a;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                dVar.f1978b = null;
                j0();
                this.f1959p = i13;
                this.f1966y = new BitSet(this.f1959p);
                this.f1960q = new f[this.f1959p];
                for (int i14 = 0; i14 < this.f1959p; i14++) {
                    this.f1960q[i14] = new f(i14);
                }
                j0();
            }
            boolean z9 = H2.f1884c;
            c((String) null);
            e eVar = this.F;
            if (!(eVar == null || eVar.f1990h == z9)) {
                eVar.f1990h = z9;
            }
            this.w = z9;
            j0();
            this.f1964v = new n();
            this.f1961r = s.a(this, this.f1963t);
            this.f1962s = s.a(this, 1 - this.f1963t);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public static int a1(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    public final int A0(RecyclerView.w wVar) {
        if (w() == 0) {
            return 0;
        }
        return y.a(wVar, this.f1961r, F0(!this.I), E0(!this.I), this, this.I);
    }

    public final int B0(RecyclerView.w wVar) {
        if (w() == 0) {
            return 0;
        }
        return y.b(wVar, this.f1961r, F0(!this.I), E0(!this.I), this, this.I, this.f1965x);
    }

    public final int C0(RecyclerView.w wVar) {
        if (w() == 0) {
            return 0;
        }
        return y.c(wVar, this.f1961r, F0(!this.I), E0(!this.I), this, this.I);
    }

    public final int D0(RecyclerView.r rVar, n nVar, RecyclerView.w wVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        f fVar;
        boolean z9;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        RecyclerView.r rVar2 = rVar;
        n nVar2 = nVar;
        int i26 = 0;
        this.f1966y.set(0, this.f1959p, true);
        if (this.f1964v.f2131i) {
            if (nVar2.f2127e == 1) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = Integer.MIN_VALUE;
            }
        } else if (nVar2.f2127e == 1) {
            i10 = nVar2.f2129g + nVar2.f2124b;
        } else {
            i10 = nVar2.f2128f - nVar2.f2124b;
        }
        int i27 = nVar2.f2127e;
        for (int i28 = 0; i28 < this.f1959p; i28++) {
            if (!this.f1960q[i28].f1993a.isEmpty()) {
                Z0(this.f1960q[i28], i27, i10);
            }
        }
        if (this.f1965x) {
            i11 = this.f1961r.g();
        } else {
            i11 = this.f1961r.k();
        }
        boolean z10 = false;
        while (true) {
            int i29 = nVar2.f2125c;
            if (i29 < 0 || i29 >= wVar.b()) {
                i12 = i26;
            } else {
                i12 = 1;
            }
            if (i12 == 0 || (!this.f1964v.f2131i && this.f1966y.isEmpty())) {
                int i30 = i26;
            } else {
                View d10 = rVar2.d(nVar2.f2125c);
                nVar2.f2125c += nVar2.f2126d;
                c cVar = (c) d10.getLayoutParams();
                int a10 = cVar.a();
                int[] iArr = this.B.f1977a;
                if (iArr == null || a10 >= iArr.length) {
                    i14 = -1;
                } else {
                    i14 = iArr[a10];
                }
                if (i14 == -1) {
                    i15 = 1;
                } else {
                    i15 = i26;
                }
                if (i15 != 0) {
                    if (Q0(nVar2.f2127e)) {
                        i23 = -1;
                        i24 = this.f1959p - 1;
                        i25 = -1;
                    } else {
                        i25 = this.f1959p;
                        i24 = i26;
                        i23 = 1;
                    }
                    f fVar2 = null;
                    if (nVar2.f2127e == 1) {
                        int k = this.f1961r.k();
                        int i31 = Integer.MAX_VALUE;
                        while (i24 != i25) {
                            f fVar3 = this.f1960q[i24];
                            int f10 = fVar3.f(k);
                            if (f10 < i31) {
                                fVar2 = fVar3;
                                i31 = f10;
                            }
                            i24 += i23;
                        }
                    } else {
                        int g10 = this.f1961r.g();
                        int i32 = Integer.MIN_VALUE;
                        while (i24 != i25) {
                            f fVar4 = this.f1960q[i24];
                            int i33 = fVar4.i(g10);
                            if (i33 > i32) {
                                fVar2 = fVar4;
                                i32 = i33;
                            }
                            i24 += i23;
                        }
                    }
                    fVar = fVar2;
                    d dVar = this.B;
                    dVar.a(a10);
                    dVar.f1977a[a10] = fVar.f1997e;
                } else {
                    fVar = this.f1960q[i14];
                }
                cVar.f1976e = fVar;
                if (nVar2.f2127e == 1) {
                    z9 = false;
                    b(d10, -1, false);
                } else {
                    z9 = false;
                    b(d10, 0, false);
                }
                if (this.f1963t == 1) {
                    i17 = RecyclerView.l.x(z9, this.u, this.f1876l, z9 ? 1 : 0, cVar.width);
                    i16 = RecyclerView.l.x(true, this.f1879o, this.f1877m, C() + F(), cVar.height);
                } else {
                    i17 = RecyclerView.l.x(true, this.f1878n, this.f1876l, E() + D(), cVar.width);
                    i16 = RecyclerView.l.x(false, this.u, this.f1877m, 0, cVar.height);
                }
                d(d10, this.G);
                c cVar2 = (c) d10.getLayoutParams();
                int i34 = cVar2.leftMargin;
                Rect rect = this.G;
                int a12 = a1(i17, i34 + rect.left, cVar2.rightMargin + rect.right);
                int i35 = cVar2.topMargin;
                Rect rect2 = this.G;
                int a13 = a1(i16, i35 + rect2.top, cVar2.bottomMargin + rect2.bottom);
                if (s0(d10, a12, a13, cVar2)) {
                    d10.measure(a12, a13);
                }
                if (nVar2.f2127e == 1) {
                    i19 = fVar.f(i11);
                    i18 = this.f1961r.c(d10) + i19;
                } else {
                    i18 = fVar.i(i11);
                    i19 = i18 - this.f1961r.c(d10);
                }
                int i36 = nVar2.f2127e;
                f fVar5 = cVar.f1976e;
                fVar5.getClass();
                if (i36 == 1) {
                    c cVar3 = (c) d10.getLayoutParams();
                    cVar3.f1976e = fVar5;
                    fVar5.f1993a.add(d10);
                    fVar5.f1995c = Integer.MIN_VALUE;
                    if (fVar5.f1993a.size() == 1) {
                        fVar5.f1994b = Integer.MIN_VALUE;
                    }
                    if (cVar3.c() || cVar3.b()) {
                        fVar5.f1996d = StaggeredGridLayoutManager.this.f1961r.c(d10) + fVar5.f1996d;
                    }
                } else {
                    c cVar4 = (c) d10.getLayoutParams();
                    cVar4.f1976e = fVar5;
                    fVar5.f1993a.add(0, d10);
                    fVar5.f1994b = Integer.MIN_VALUE;
                    if (fVar5.f1993a.size() == 1) {
                        fVar5.f1995c = Integer.MIN_VALUE;
                    }
                    if (cVar4.c() || cVar4.b()) {
                        fVar5.f1996d = StaggeredGridLayoutManager.this.f1961r.c(d10) + fVar5.f1996d;
                    }
                }
                if (!O0() || this.f1963t != 1) {
                    i20 = this.f1962s.k() + (fVar.f1997e * this.u);
                    i21 = this.f1962s.c(d10) + i20;
                } else {
                    i21 = this.f1962s.g() - (((this.f1959p - 1) - fVar.f1997e) * this.u);
                    i20 = i21 - this.f1962s.c(d10);
                }
                if (this.f1963t == 1) {
                    int i37 = i20;
                    i20 = i19;
                    i19 = i37;
                    int i38 = i21;
                    i21 = i18;
                    i18 = i38;
                }
                RecyclerView.l.M(d10, i19, i20, i18, i21);
                Z0(fVar, this.f1964v.f2127e, i10);
                S0(rVar2, this.f1964v);
                if (!this.f1964v.f2130h || !d10.hasFocusable()) {
                    i22 = 0;
                } else {
                    i22 = 0;
                    this.f1966y.set(fVar.f1997e, false);
                }
                z10 = true;
                i26 = i22;
            }
        }
        int i302 = i26;
        if (!z10) {
            S0(rVar2, this.f1964v);
        }
        if (this.f1964v.f2127e == -1) {
            i13 = this.f1961r.k() - L0(this.f1961r.k());
        } else {
            i13 = K0(this.f1961r.g()) - this.f1961r.g();
        }
        if (i13 > 0) {
            return Math.min(nVar2.f2124b, i13);
        }
        return i302;
    }

    public final View E0(boolean z9) {
        int k = this.f1961r.k();
        int g10 = this.f1961r.g();
        View view = null;
        for (int w10 = w() - 1; w10 >= 0; w10--) {
            View v10 = v(w10);
            int e10 = this.f1961r.e(v10);
            int b10 = this.f1961r.b(v10);
            if (b10 > k && e10 < g10) {
                if (b10 <= g10 || !z9) {
                    return v10;
                }
                if (view == null) {
                    view = v10;
                }
            }
        }
        return view;
    }

    public final View F0(boolean z9) {
        int k = this.f1961r.k();
        int g10 = this.f1961r.g();
        int w10 = w();
        View view = null;
        for (int i10 = 0; i10 < w10; i10++) {
            View v10 = v(i10);
            int e10 = this.f1961r.e(v10);
            if (this.f1961r.b(v10) > k && e10 < g10) {
                if (e10 >= k || !z9) {
                    return v10;
                }
                if (view == null) {
                    view = v10;
                }
            }
        }
        return view;
    }

    public final void G0(RecyclerView.r rVar, RecyclerView.w wVar, boolean z9) {
        int g10;
        int K0 = K0(Integer.MIN_VALUE);
        if (K0 != Integer.MIN_VALUE && (g10 = this.f1961r.g() - K0) > 0) {
            int i10 = g10 - (-W0(-g10, rVar, wVar));
            if (z9 && i10 > 0) {
                this.f1961r.o(i10);
            }
        }
    }

    public final void H0(RecyclerView.r rVar, RecyclerView.w wVar, boolean z9) {
        int k;
        int L0 = L0(Integer.MAX_VALUE);
        if (L0 != Integer.MAX_VALUE && (k = L0 - this.f1961r.k()) > 0) {
            int W0 = k - W0(k, rVar, wVar);
            if (z9 && W0 > 0) {
                this.f1961r.o(-W0);
            }
        }
    }

    public final int I(RecyclerView.r rVar, RecyclerView.w wVar) {
        return this.f1963t == 0 ? this.f1959p : super.I(rVar, wVar);
    }

    public final int I0() {
        if (w() == 0) {
            return 0;
        }
        return RecyclerView.l.G(v(0));
    }

    public final int J0() {
        int w10 = w();
        if (w10 == 0) {
            return 0;
        }
        return RecyclerView.l.G(v(w10 - 1));
    }

    public final boolean K() {
        return this.C != 0;
    }

    public final int K0(int i10) {
        int f10 = this.f1960q[0].f(i10);
        for (int i11 = 1; i11 < this.f1959p; i11++) {
            int f11 = this.f1960q[i11].f(i10);
            if (f11 > f10) {
                f10 = f11;
            }
        }
        return f10;
    }

    public final int L0(int i10) {
        int i11 = this.f1960q[0].i(i10);
        for (int i12 = 1; i12 < this.f1959p; i12++) {
            int i13 = this.f1960q[i12].i(i10);
            if (i13 < i11) {
                i11 = i13;
            }
        }
        return i11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void M0(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f1965x
            if (r0 == 0) goto L_0x0009
            int r0 = r6.J0()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.I0()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.B
            r4.b(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.B
            r9.d(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.B
            r7.c(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.B
            r9.d(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.B
            r9.c(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f1965x
            if (r7 == 0) goto L_0x004d
            int r7 = r6.I0()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.J0()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.j0()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.M0(int, int, int):void");
    }

    public final void N(int i10) {
        super.N(i10);
        for (int i11 = 0; i11 < this.f1959p; i11++) {
            f fVar = this.f1960q[i11];
            int i12 = fVar.f1994b;
            if (i12 != Integer.MIN_VALUE) {
                fVar.f1994b = i12 + i10;
            }
            int i13 = fVar.f1995c;
            if (i13 != Integer.MIN_VALUE) {
                fVar.f1995c = i13 + i10;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cb, code lost:
        if (r10 == r11) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r10 == r11) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e1, code lost:
        r10 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00a9 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View N0() {
        /*
            r13 = this;
            int r0 = r13.w()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r13.f1959p
            r2.<init>(r3)
            int r3 = r13.f1959p
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r13.f1963t
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r13.O0()
            if (r3 == 0) goto L_0x0020
            r3 = r1
            goto L_0x0021
        L_0x0020:
            r3 = r5
        L_0x0021:
            boolean r6 = r13.f1965x
            if (r6 == 0) goto L_0x0027
            r6 = r5
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = r1
        L_0x002e:
            if (r0 == r6) goto L_0x0100
            android.view.View r7 = r13.v(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f1976e
            int r9 = r9.f1997e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x00b1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f1976e
            boolean r10 = r13.f1965x
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == 0) goto L_0x006a
            int r10 = r9.f1995c
            if (r10 == r11) goto L_0x0051
            goto L_0x0056
        L_0x0051:
            r9.a()
            int r10 = r9.f1995c
        L_0x0056:
            androidx.recyclerview.widget.s r11 = r13.f1961r
            int r11 = r11.g()
            if (r10 >= r11) goto L_0x00a6
            java.util.ArrayList<android.view.View> r10 = r9.f1993a
            int r11 = r10.size()
            int r11 = r11 - r1
            java.lang.Object r10 = r10.get(r11)
            goto L_0x0098
        L_0x006a:
            int r10 = r9.f1994b
            if (r10 == r11) goto L_0x006f
            goto L_0x008a
        L_0x006f:
            java.util.ArrayList<android.view.View> r10 = r9.f1993a
            java.lang.Object r10 = r10.get(r4)
            android.view.View r10 = (android.view.View) r10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r11 = androidx.recyclerview.widget.StaggeredGridLayoutManager.f.h(r10)
            androidx.recyclerview.widget.StaggeredGridLayoutManager r12 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.s r12 = r12.f1961r
            int r10 = r12.e(r10)
            r9.f1994b = r10
            r11.getClass()
            int r10 = r9.f1994b
        L_0x008a:
            androidx.recyclerview.widget.s r11 = r13.f1961r
            int r11 = r11.k()
            if (r10 <= r11) goto L_0x00a6
            java.util.ArrayList<android.view.View> r10 = r9.f1993a
            java.lang.Object r10 = r10.get(r4)
        L_0x0098:
            android.view.View r10 = (android.view.View) r10
            r9.getClass()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = androidx.recyclerview.widget.StaggeredGridLayoutManager.f.h(r10)
            r9.getClass()
            r9 = r1
            goto L_0x00a7
        L_0x00a6:
            r9 = r4
        L_0x00a7:
            if (r9 == 0) goto L_0x00aa
            return r7
        L_0x00aa:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f1976e
            int r9 = r9.f1997e
            r2.clear(r9)
        L_0x00b1:
            int r0 = r0 + r5
            if (r0 == r6) goto L_0x002e
            android.view.View r9 = r13.v(r0)
            boolean r10 = r13.f1965x
            if (r10 == 0) goto L_0x00ce
            androidx.recyclerview.widget.s r10 = r13.f1961r
            int r10 = r10.b(r7)
            androidx.recyclerview.widget.s r11 = r13.f1961r
            int r11 = r11.b(r9)
            if (r10 >= r11) goto L_0x00cb
            return r7
        L_0x00cb:
            if (r10 != r11) goto L_0x00e1
            goto L_0x00df
        L_0x00ce:
            androidx.recyclerview.widget.s r10 = r13.f1961r
            int r10 = r10.e(r7)
            androidx.recyclerview.widget.s r11 = r13.f1961r
            int r11 = r11.e(r9)
            if (r10 <= r11) goto L_0x00dd
            return r7
        L_0x00dd:
            if (r10 != r11) goto L_0x00e1
        L_0x00df:
            r10 = r1
            goto L_0x00e2
        L_0x00e1:
            r10 = r4
        L_0x00e2:
            if (r10 == 0) goto L_0x002e
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f1976e
            int r8 = r8.f1997e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f1976e
            int r9 = r9.f1997e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00f7
            r8 = r1
            goto L_0x00f8
        L_0x00f7:
            r8 = r4
        L_0x00f8:
            if (r3 >= 0) goto L_0x00fc
            r9 = r1
            goto L_0x00fd
        L_0x00fc:
            r9 = r4
        L_0x00fd:
            if (r8 == r9) goto L_0x002e
            return r7
        L_0x0100:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.N0():android.view.View");
    }

    public final void O(int i10) {
        super.O(i10);
        for (int i11 = 0; i11 < this.f1959p; i11++) {
            f fVar = this.f1960q[i11];
            int i12 = fVar.f1994b;
            if (i12 != Integer.MIN_VALUE) {
                fVar.f1994b = i12 + i10;
            }
            int i13 = fVar.f1995c;
            if (i13 != Integer.MIN_VALUE) {
                fVar.f1995c = i13 + i10;
            }
        }
    }

    public final boolean O0() {
        return B() == 1;
    }

    public final void P(RecyclerView recyclerView) {
        a aVar = this.K;
        RecyclerView recyclerView2 = this.f1867b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(aVar);
        }
        for (int i10 = 0; i10 < this.f1959p; i10++) {
            this.f1960q[i10].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0406, code lost:
        if (z0() != false) goto L_0x040a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void P0(androidx.recyclerview.widget.RecyclerView.r r12, androidx.recyclerview.widget.RecyclerView.w r13, boolean r14) {
        /*
            r11 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r11.H
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r11.F
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r11.f1967z
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r13.b()
            if (r1 != 0) goto L_0x0018
            r11.e0(r12)
            r0.a()
            return
        L_0x0018:
            boolean r1 = r0.f1973e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r11.f1967z
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r11.F
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = r3
            goto L_0x002a
        L_0x0029:
            r1 = r4
        L_0x002a:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r1 == 0) goto L_0x01f9
            r0.a()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r11.F
            if (r7 == 0) goto L_0x00b8
            int r8 = r7.f1985c
            if (r8 <= 0) goto L_0x007d
            int r9 = r11.f1959p
            if (r8 != r9) goto L_0x006f
            r7 = r3
        L_0x003f:
            int r8 = r11.f1959p
            if (r7 >= r8) goto L_0x007d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r11.f1960q
            r8 = r8[r7]
            r8.b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r8 = r11.F
            int[] r9 = r8.f1986d
            r9 = r9[r7]
            if (r9 == r5) goto L_0x0064
            boolean r8 = r8.f1991i
            if (r8 == 0) goto L_0x005d
            androidx.recyclerview.widget.s r8 = r11.f1961r
            int r8 = r8.g()
            goto L_0x0063
        L_0x005d:
            androidx.recyclerview.widget.s r8 = r11.f1961r
            int r8 = r8.k()
        L_0x0063:
            int r9 = r9 + r8
        L_0x0064:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r11.f1960q
            r8 = r8[r7]
            r8.f1994b = r9
            r8.f1995c = r9
            int r7 = r7 + 1
            goto L_0x003f
        L_0x006f:
            r7.f1986d = r6
            r7.f1985c = r3
            r7.f1987e = r3
            r7.f1988f = r6
            r7.f1989g = r6
            int r8 = r7.f1984b
            r7.f1983a = r8
        L_0x007d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r11.F
            boolean r8 = r7.f1992j
            r11.E = r8
            boolean r7 = r7.f1990h
            r11.c(r6)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r8 = r11.F
            if (r8 == 0) goto L_0x0092
            boolean r9 = r8.f1990h
            if (r9 == r7) goto L_0x0092
            r8.f1990h = r7
        L_0x0092:
            r11.w = r7
            r11.j0()
            r11.V0()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r11.F
            int r8 = r7.f1983a
            if (r8 == r2) goto L_0x00a5
            r11.f1967z = r8
            boolean r8 = r7.f1991i
            goto L_0x00a7
        L_0x00a5:
            boolean r8 = r11.f1965x
        L_0x00a7:
            r0.f1971c = r8
            int r8 = r7.f1987e
            if (r8 <= r4) goto L_0x00bf
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r11.B
            int[] r9 = r7.f1988f
            r8.f1977a = r9
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r7 = r7.f1989g
            r8.f1978b = r7
            goto L_0x00bf
        L_0x00b8:
            r11.V0()
            boolean r7 = r11.f1965x
            r0.f1971c = r7
        L_0x00bf:
            boolean r7 = r13.f1927g
            if (r7 != 0) goto L_0x01ba
            int r7 = r11.f1967z
            if (r7 != r2) goto L_0x00c9
            goto L_0x01ba
        L_0x00c9:
            if (r7 < 0) goto L_0x01b6
            int r8 = r13.b()
            if (r7 < r8) goto L_0x00d3
            goto L_0x01b6
        L_0x00d3:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r11.F
            if (r7 == 0) goto L_0x00e8
            int r8 = r7.f1983a
            if (r8 == r2) goto L_0x00e8
            int r7 = r7.f1985c
            if (r7 >= r4) goto L_0x00e0
            goto L_0x00e8
        L_0x00e0:
            r0.f1970b = r5
            int r7 = r11.f1967z
            r0.f1969a = r7
            goto L_0x01b4
        L_0x00e8:
            int r7 = r11.f1967z
            android.view.View r7 = r11.r(r7)
            if (r7 == 0) goto L_0x0170
            boolean r8 = r11.f1965x
            if (r8 == 0) goto L_0x00f9
            int r8 = r11.J0()
            goto L_0x00fd
        L_0x00f9:
            int r8 = r11.I0()
        L_0x00fd:
            r0.f1969a = r8
            int r8 = r11.A
            if (r8 == r5) goto L_0x0128
            boolean r8 = r0.f1971c
            if (r8 == 0) goto L_0x0117
            androidx.recyclerview.widget.s r8 = r11.f1961r
            int r8 = r8.g()
            int r9 = r11.A
            int r8 = r8 - r9
            androidx.recyclerview.widget.s r9 = r11.f1961r
            int r7 = r9.b(r7)
            goto L_0x0126
        L_0x0117:
            androidx.recyclerview.widget.s r8 = r11.f1961r
            int r8 = r8.k()
            int r9 = r11.A
            int r8 = r8 + r9
            androidx.recyclerview.widget.s r9 = r11.f1961r
            int r7 = r9.e(r7)
        L_0x0126:
            int r8 = r8 - r7
            goto L_0x016a
        L_0x0128:
            androidx.recyclerview.widget.s r8 = r11.f1961r
            int r8 = r8.c(r7)
            androidx.recyclerview.widget.s r9 = r11.f1961r
            int r9 = r9.l()
            if (r8 <= r9) goto L_0x0148
            boolean r7 = r0.f1971c
            if (r7 == 0) goto L_0x0141
            androidx.recyclerview.widget.s r7 = r11.f1961r
            int r7 = r7.g()
            goto L_0x0158
        L_0x0141:
            androidx.recyclerview.widget.s r7 = r11.f1961r
            int r7 = r7.k()
            goto L_0x0158
        L_0x0148:
            androidx.recyclerview.widget.s r8 = r11.f1961r
            int r8 = r8.e(r7)
            androidx.recyclerview.widget.s r9 = r11.f1961r
            int r9 = r9.k()
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x015b
            int r7 = -r8
        L_0x0158:
            r0.f1970b = r7
            goto L_0x01b4
        L_0x015b:
            androidx.recyclerview.widget.s r8 = r11.f1961r
            int r8 = r8.g()
            androidx.recyclerview.widget.s r9 = r11.f1961r
            int r7 = r9.b(r7)
            int r8 = r8 - r7
            if (r8 >= 0) goto L_0x016d
        L_0x016a:
            r0.f1970b = r8
            goto L_0x01b4
        L_0x016d:
            r0.f1970b = r5
            goto L_0x01b4
        L_0x0170:
            int r7 = r11.f1967z
            r0.f1969a = r7
            int r8 = r11.A
            if (r8 != r5) goto L_0x0199
            int r7 = r11.y0(r7)
            if (r7 != r4) goto L_0x0180
            r7 = r4
            goto L_0x0181
        L_0x0180:
            r7 = r3
        L_0x0181:
            r0.f1971c = r7
            if (r7 == 0) goto L_0x018e
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.s r7 = r7.f1961r
            int r7 = r7.g()
            goto L_0x0196
        L_0x018e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.s r7 = r7.f1961r
            int r7 = r7.k()
        L_0x0196:
            r0.f1970b = r7
            goto L_0x01b2
        L_0x0199:
            boolean r7 = r0.f1971c
            if (r7 == 0) goto L_0x01a7
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.s r7 = r7.f1961r
            int r7 = r7.g()
            int r7 = r7 - r8
            goto L_0x01b0
        L_0x01a7:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.s r7 = r7.f1961r
            int r7 = r7.k()
            int r7 = r7 + r8
        L_0x01b0:
            r0.f1970b = r7
        L_0x01b2:
            r0.f1972d = r4
        L_0x01b4:
            r7 = r4
            goto L_0x01bb
        L_0x01b6:
            r11.f1967z = r2
            r11.A = r5
        L_0x01ba:
            r7 = r3
        L_0x01bb:
            if (r7 == 0) goto L_0x01be
            goto L_0x01f7
        L_0x01be:
            boolean r7 = r11.D
            int r8 = r13.b()
            if (r7 == 0) goto L_0x01da
            int r7 = r11.w()
        L_0x01ca:
            int r7 = r7 + r2
            if (r7 < 0) goto L_0x01f2
            android.view.View r9 = r11.v(r7)
            int r9 = androidx.recyclerview.widget.RecyclerView.l.G(r9)
            if (r9 < 0) goto L_0x01ca
            if (r9 >= r8) goto L_0x01ca
            goto L_0x01f3
        L_0x01da:
            int r7 = r11.w()
            r9 = r3
        L_0x01df:
            if (r9 >= r7) goto L_0x01f2
            android.view.View r10 = r11.v(r9)
            int r10 = androidx.recyclerview.widget.RecyclerView.l.G(r10)
            if (r10 < 0) goto L_0x01ef
            if (r10 >= r8) goto L_0x01ef
            r9 = r10
            goto L_0x01f3
        L_0x01ef:
            int r9 = r9 + 1
            goto L_0x01df
        L_0x01f2:
            r9 = r3
        L_0x01f3:
            r0.f1969a = r9
            r0.f1970b = r5
        L_0x01f7:
            r0.f1973e = r4
        L_0x01f9:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r11.F
            if (r7 != 0) goto L_0x021c
            int r7 = r11.f1967z
            if (r7 != r2) goto L_0x021c
            boolean r7 = r0.f1971c
            boolean r8 = r11.D
            if (r7 != r8) goto L_0x020f
            boolean r7 = r11.O0()
            boolean r8 = r11.E
            if (r7 == r8) goto L_0x021c
        L_0x020f:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r11.B
            int[] r8 = r7.f1977a
            if (r8 == 0) goto L_0x0218
            java.util.Arrays.fill(r8, r2)
        L_0x0218:
            r7.f1978b = r6
            r0.f1972d = r4
        L_0x021c:
            int r6 = r11.w()
            if (r6 <= 0) goto L_0x02d4
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.F
            if (r6 == 0) goto L_0x022a
            int r6 = r6.f1985c
            if (r6 >= r4) goto L_0x02d4
        L_0x022a:
            boolean r6 = r0.f1972d
            if (r6 == 0) goto L_0x0249
            r1 = r3
        L_0x022f:
            int r6 = r11.f1959p
            if (r1 >= r6) goto L_0x02d4
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f1960q
            r6 = r6[r1]
            r6.b()
            int r6 = r0.f1970b
            if (r6 == r5) goto L_0x0246
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r11.f1960q
            r7 = r7[r1]
            r7.f1994b = r6
            r7.f1995c = r6
        L_0x0246:
            int r1 = r1 + 1
            goto L_0x022f
        L_0x0249:
            if (r1 != 0) goto L_0x026b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r11.H
            int[] r1 = r1.f1974f
            if (r1 != 0) goto L_0x0252
            goto L_0x026b
        L_0x0252:
            r1 = r3
        L_0x0253:
            int r6 = r11.f1959p
            if (r1 >= r6) goto L_0x02d4
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f1960q
            r6 = r6[r1]
            r6.b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r7 = r11.H
            int[] r7 = r7.f1974f
            r7 = r7[r1]
            r6.f1994b = r7
            r6.f1995c = r7
            int r1 = r1 + 1
            goto L_0x0253
        L_0x026b:
            r1 = r3
        L_0x026c:
            int r6 = r11.f1959p
            if (r1 >= r6) goto L_0x02ac
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f1960q
            r6 = r6[r1]
            boolean r7 = r11.f1965x
            int r8 = r0.f1970b
            if (r7 == 0) goto L_0x027f
            int r9 = r6.f(r5)
            goto L_0x0283
        L_0x027f:
            int r9 = r6.i(r5)
        L_0x0283:
            r6.b()
            if (r9 != r5) goto L_0x0289
            goto L_0x02a9
        L_0x0289:
            if (r7 == 0) goto L_0x0295
            androidx.recyclerview.widget.StaggeredGridLayoutManager r10 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.s r10 = r10.f1961r
            int r10 = r10.g()
            if (r9 < r10) goto L_0x02a9
        L_0x0295:
            if (r7 != 0) goto L_0x02a2
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.s r7 = r7.f1961r
            int r7 = r7.k()
            if (r9 <= r7) goto L_0x02a2
            goto L_0x02a9
        L_0x02a2:
            if (r8 == r5) goto L_0x02a5
            int r9 = r9 + r8
        L_0x02a5:
            r6.f1995c = r9
            r6.f1994b = r9
        L_0x02a9:
            int r1 = r1 + 1
            goto L_0x026c
        L_0x02ac:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r11.H
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f1960q
            r1.getClass()
            int r7 = r6.length
            int[] r8 = r1.f1974f
            if (r8 == 0) goto L_0x02bb
            int r8 = r8.length
            if (r8 >= r7) goto L_0x02c4
        L_0x02bb:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r8.f1960q
            int r8 = r8.length
            int[] r8 = new int[r8]
            r1.f1974f = r8
        L_0x02c4:
            r8 = r3
        L_0x02c5:
            if (r8 >= r7) goto L_0x02d4
            int[] r9 = r1.f1974f
            r10 = r6[r8]
            int r10 = r10.i(r5)
            r9[r8] = r10
            int r8 = r8 + 1
            goto L_0x02c5
        L_0x02d4:
            r11.q(r12)
            androidx.recyclerview.widget.n r1 = r11.f1964v
            r1.f2123a = r3
            androidx.recyclerview.widget.s r1 = r11.f1962s
            int r1 = r1.l()
            int r6 = r11.f1959p
            int r6 = r1 / r6
            r11.u = r6
            androidx.recyclerview.widget.s r6 = r11.f1962s
            int r6 = r6.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            int r1 = r0.f1969a
            r11.Y0(r1, r13)
            boolean r1 = r0.f1971c
            if (r1 == 0) goto L_0x0305
            r11.X0(r2)
            androidx.recyclerview.widget.n r1 = r11.f1964v
            r11.D0(r12, r1, r13)
            r11.X0(r4)
            goto L_0x0310
        L_0x0305:
            r11.X0(r4)
            androidx.recyclerview.widget.n r1 = r11.f1964v
            r11.D0(r12, r1, r13)
            r11.X0(r2)
        L_0x0310:
            androidx.recyclerview.widget.n r1 = r11.f1964v
            int r2 = r0.f1969a
            int r6 = r1.f2126d
            int r2 = r2 + r6
            r1.f2125c = r2
            r11.D0(r12, r1, r13)
            androidx.recyclerview.widget.s r1 = r11.f1962s
            int r1 = r1.i()
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r2) goto L_0x0328
            goto L_0x03c7
        L_0x0328:
            r1 = 0
            int r2 = r11.w()
            r6 = r3
        L_0x032e:
            if (r6 >= r2) goto L_0x0350
            android.view.View r7 = r11.v(r6)
            androidx.recyclerview.widget.s r8 = r11.f1962s
            int r8 = r8.c(r7)
            float r8 = (float) r8
            int r9 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r9 >= 0) goto L_0x0340
            goto L_0x034d
        L_0x0340:
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r7
            r7.getClass()
            float r1 = java.lang.Math.max(r1, r8)
        L_0x034d:
            int r6 = r6 + 1
            goto L_0x032e
        L_0x0350:
            int r6 = r11.u
            int r7 = r11.f1959p
            float r7 = (float) r7
            float r1 = r1 * r7
            int r1 = java.lang.Math.round(r1)
            androidx.recyclerview.widget.s r7 = r11.f1962s
            int r7 = r7.i()
            if (r7 != r5) goto L_0x036c
            androidx.recyclerview.widget.s r5 = r11.f1962s
            int r5 = r5.l()
            int r1 = java.lang.Math.min(r1, r5)
        L_0x036c:
            int r5 = r11.f1959p
            int r5 = r1 / r5
            r11.u = r5
            androidx.recyclerview.widget.s r5 = r11.f1962s
            int r5 = r5.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r1, r5)
            int r1 = r11.u
            if (r1 != r6) goto L_0x0380
            goto L_0x03c7
        L_0x0380:
            r1 = r3
        L_0x0381:
            if (r1 >= r2) goto L_0x03c7
            android.view.View r5 = r11.v(r1)
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r7
            r7.getClass()
            boolean r8 = r11.O0()
            if (r8 == 0) goto L_0x03b0
            int r8 = r11.f1963t
            if (r8 != r4) goto L_0x03b0
            int r8 = r11.f1959p
            int r9 = r8 + -1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r7 = r7.f1976e
            int r7 = r7.f1997e
            int r9 = r9 - r7
            int r9 = -r9
            int r10 = r11.u
            int r9 = r9 * r10
            int r8 = r8 - r4
            int r8 = r8 - r7
            int r7 = -r8
            int r7 = r7 * r6
            int r9 = r9 - r7
            r5.offsetLeftAndRight(r9)
            goto L_0x03c4
        L_0x03b0:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r7 = r7.f1976e
            int r7 = r7.f1997e
            int r8 = r11.u
            int r8 = r8 * r7
            int r7 = r7 * r6
            int r9 = r11.f1963t
            int r8 = r8 - r7
            if (r9 != r4) goto L_0x03c1
            r5.offsetLeftAndRight(r8)
            goto L_0x03c4
        L_0x03c1:
            r5.offsetTopAndBottom(r8)
        L_0x03c4:
            int r1 = r1 + 1
            goto L_0x0381
        L_0x03c7:
            int r1 = r11.w()
            if (r1 <= 0) goto L_0x03de
            boolean r1 = r11.f1965x
            if (r1 == 0) goto L_0x03d8
            r11.G0(r12, r13, r4)
            r11.H0(r12, r13, r3)
            goto L_0x03de
        L_0x03d8:
            r11.H0(r12, r13, r4)
            r11.G0(r12, r13, r3)
        L_0x03de:
            if (r14 == 0) goto L_0x0409
            boolean r14 = r13.f1927g
            if (r14 != 0) goto L_0x0409
            int r14 = r11.C
            if (r14 == 0) goto L_0x03f6
            int r14 = r11.w()
            if (r14 <= 0) goto L_0x03f6
            android.view.View r14 = r11.N0()
            if (r14 == 0) goto L_0x03f6
            r14 = r4
            goto L_0x03f7
        L_0x03f6:
            r14 = r3
        L_0x03f7:
            if (r14 == 0) goto L_0x0409
            androidx.recyclerview.widget.StaggeredGridLayoutManager$a r14 = r11.K
            androidx.recyclerview.widget.RecyclerView r1 = r11.f1867b
            if (r1 == 0) goto L_0x0402
            r1.removeCallbacks(r14)
        L_0x0402:
            boolean r14 = r11.z0()
            if (r14 == 0) goto L_0x0409
            goto L_0x040a
        L_0x0409:
            r4 = r3
        L_0x040a:
            boolean r14 = r13.f1927g
            if (r14 == 0) goto L_0x0413
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r14 = r11.H
            r14.a()
        L_0x0413:
            boolean r14 = r0.f1971c
            r11.D = r14
            boolean r14 = r11.O0()
            r11.E = r14
            if (r4 == 0) goto L_0x0427
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r14 = r11.H
            r14.a()
            r11.P0(r12, r13, r3)
        L_0x0427:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.P0(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004a, code lost:
        if (r8.f1963t == 1) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004f, code lost:
        if (r8.f1963t == 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005d, code lost:
        if (O0() == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0069, code lost:
        if (O0() == false) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View Q(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.r r11, androidx.recyclerview.widget.RecyclerView.w r12) {
        /*
            r8 = this;
            int r0 = r8.w()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            androidx.recyclerview.widget.RecyclerView r0 = r8.f1867b
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            r9 = r1
            goto L_0x001e
        L_0x000e:
            android.view.View r9 = r0.A(r9)
            if (r9 != 0) goto L_0x0015
            goto L_0x000c
        L_0x0015:
            androidx.recyclerview.widget.b r0 = r8.f1866a
            boolean r0 = r0.k(r9)
            if (r0 == 0) goto L_0x001e
            goto L_0x000c
        L_0x001e:
            if (r9 != 0) goto L_0x0021
            return r1
        L_0x0021:
            r8.V0()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1
            r3 = -1
            if (r10 == r2) goto L_0x0060
            r4 = 2
            if (r10 == r4) goto L_0x0054
            r4 = 17
            if (r10 == r4) goto L_0x004d
            r4 = 33
            if (r10 == r4) goto L_0x0048
            r4 = 66
            if (r10 == r4) goto L_0x0043
            r4 = 130(0x82, float:1.82E-43)
            if (r10 == r4) goto L_0x003e
            goto L_0x0052
        L_0x003e:
            int r10 = r8.f1963t
            if (r10 != r2) goto L_0x0052
            goto L_0x006b
        L_0x0043:
            int r10 = r8.f1963t
            if (r10 != 0) goto L_0x0052
            goto L_0x006b
        L_0x0048:
            int r10 = r8.f1963t
            if (r10 != r2) goto L_0x0052
            goto L_0x006d
        L_0x004d:
            int r10 = r8.f1963t
            if (r10 != 0) goto L_0x0052
            goto L_0x006d
        L_0x0052:
            r10 = r0
            goto L_0x006e
        L_0x0054:
            int r10 = r8.f1963t
            if (r10 != r2) goto L_0x0059
            goto L_0x006b
        L_0x0059:
            boolean r10 = r8.O0()
            if (r10 == 0) goto L_0x006b
            goto L_0x006d
        L_0x0060:
            int r10 = r8.f1963t
            if (r10 != r2) goto L_0x0065
            goto L_0x006d
        L_0x0065:
            boolean r10 = r8.O0()
            if (r10 == 0) goto L_0x006d
        L_0x006b:
            r10 = r2
            goto L_0x006e
        L_0x006d:
            r10 = r3
        L_0x006e:
            if (r10 != r0) goto L_0x0071
            return r1
        L_0x0071:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r0
            r0.getClass()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r0 = r0.f1976e
            if (r10 != r2) goto L_0x0083
            int r4 = r8.J0()
            goto L_0x0087
        L_0x0083:
            int r4 = r8.I0()
        L_0x0087:
            r8.Y0(r4, r12)
            r8.X0(r10)
            androidx.recyclerview.widget.n r5 = r8.f1964v
            int r6 = r5.f2126d
            int r6 = r6 + r4
            r5.f2125c = r6
            r6 = 1051372203(0x3eaaaaab, float:0.33333334)
            androidx.recyclerview.widget.s r7 = r8.f1961r
            int r7 = r7.l()
            float r7 = (float) r7
            float r7 = r7 * r6
            int r6 = (int) r7
            r5.f2124b = r6
            androidx.recyclerview.widget.n r5 = r8.f1964v
            r5.f2130h = r2
            r6 = 0
            r5.f2123a = r6
            r8.D0(r11, r5, r12)
            boolean r11 = r8.f1965x
            r8.D = r11
            android.view.View r11 = r0.g(r4, r10)
            if (r11 == 0) goto L_0x00b9
            if (r11 == r9) goto L_0x00b9
            return r11
        L_0x00b9:
            boolean r11 = r8.Q0(r10)
            if (r11 == 0) goto L_0x00d4
            int r11 = r8.f1959p
            int r11 = r11 - r2
        L_0x00c2:
            if (r11 < 0) goto L_0x00e9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f1960q
            r12 = r12[r11]
            android.view.View r12 = r12.g(r4, r10)
            if (r12 == 0) goto L_0x00d1
            if (r12 == r9) goto L_0x00d1
            return r12
        L_0x00d1:
            int r11 = r11 + -1
            goto L_0x00c2
        L_0x00d4:
            r11 = r6
        L_0x00d5:
            int r12 = r8.f1959p
            if (r11 >= r12) goto L_0x00e9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f1960q
            r12 = r12[r11]
            android.view.View r12 = r12.g(r4, r10)
            if (r12 == 0) goto L_0x00e6
            if (r12 == r9) goto L_0x00e6
            return r12
        L_0x00e6:
            int r11 = r11 + 1
            goto L_0x00d5
        L_0x00e9:
            boolean r11 = r8.w
            r11 = r11 ^ r2
            if (r10 != r3) goto L_0x00f0
            r12 = r2
            goto L_0x00f1
        L_0x00f0:
            r12 = r6
        L_0x00f1:
            if (r11 != r12) goto L_0x00f5
            r11 = r2
            goto L_0x00f6
        L_0x00f5:
            r11 = r6
        L_0x00f6:
            if (r11 == 0) goto L_0x00fd
            int r12 = r0.c()
            goto L_0x0101
        L_0x00fd:
            int r12 = r0.d()
        L_0x0101:
            android.view.View r12 = r8.r(r12)
            if (r12 == 0) goto L_0x010a
            if (r12 == r9) goto L_0x010a
            return r12
        L_0x010a:
            boolean r10 = r8.Q0(r10)
            if (r10 == 0) goto L_0x0137
            int r10 = r8.f1959p
            int r10 = r10 - r2
        L_0x0113:
            if (r10 < 0) goto L_0x0158
            int r12 = r0.f1997e
            if (r10 != r12) goto L_0x011a
            goto L_0x0134
        L_0x011a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f1960q
            if (r11 == 0) goto L_0x0125
            r12 = r12[r10]
            int r12 = r12.c()
            goto L_0x012b
        L_0x0125:
            r12 = r12[r10]
            int r12 = r12.d()
        L_0x012b:
            android.view.View r12 = r8.r(r12)
            if (r12 == 0) goto L_0x0134
            if (r12 == r9) goto L_0x0134
            return r12
        L_0x0134:
            int r10 = r10 + -1
            goto L_0x0113
        L_0x0137:
            int r10 = r8.f1959p
            if (r6 >= r10) goto L_0x0158
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r10 = r8.f1960q
            if (r11 == 0) goto L_0x0146
            r10 = r10[r6]
            int r10 = r10.c()
            goto L_0x014c
        L_0x0146:
            r10 = r10[r6]
            int r10 = r10.d()
        L_0x014c:
            android.view.View r10 = r8.r(r10)
            if (r10 == 0) goto L_0x0155
            if (r10 == r9) goto L_0x0155
            return r10
        L_0x0155:
            int r6 = r6 + 1
            goto L_0x0137
        L_0x0158:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Q(android.view.View, int, androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w):android.view.View");
    }

    public final boolean Q0(int i10) {
        if (this.f1963t == 0) {
            return (i10 == -1) != this.f1965x;
        }
        return ((i10 == -1) == this.f1965x) == O0();
    }

    public final void R(AccessibilityEvent accessibilityEvent) {
        super.R(accessibilityEvent);
        if (w() > 0) {
            View F0 = F0(false);
            View E0 = E0(false);
            if (F0 != null && E0 != null) {
                int G2 = RecyclerView.l.G(F0);
                int G3 = RecyclerView.l.G(E0);
                if (G2 < G3) {
                    accessibilityEvent.setFromIndex(G2);
                    accessibilityEvent.setToIndex(G3);
                    return;
                }
                accessibilityEvent.setFromIndex(G3);
                accessibilityEvent.setToIndex(G2);
            }
        }
    }

    public final void R0(int i10, RecyclerView.w wVar) {
        int i11;
        int i12;
        if (i10 > 0) {
            i12 = J0();
            i11 = 1;
        } else {
            i11 = -1;
            i12 = I0();
        }
        this.f1964v.f2123a = true;
        Y0(i12, wVar);
        X0(i11);
        n nVar = this.f1964v;
        nVar.f2125c = i12 + nVar.f2126d;
        nVar.f2124b = Math.abs(i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r6.f2127e == -1) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void S0(androidx.recyclerview.widget.RecyclerView.r r5, androidx.recyclerview.widget.n r6) {
        /*
            r4 = this;
            boolean r0 = r6.f2123a
            if (r0 == 0) goto L_0x007c
            boolean r0 = r6.f2131i
            if (r0 == 0) goto L_0x000a
            goto L_0x007c
        L_0x000a:
            int r0 = r6.f2124b
            r1 = -1
            if (r0 != 0) goto L_0x001f
            int r0 = r6.f2127e
            if (r0 != r1) goto L_0x0019
        L_0x0013:
            int r6 = r6.f2129g
        L_0x0015:
            r4.T0(r6, r5)
            goto L_0x007c
        L_0x0019:
            int r6 = r6.f2128f
        L_0x001b:
            r4.U0(r6, r5)
            goto L_0x007c
        L_0x001f:
            int r0 = r6.f2127e
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x0050
            int r0 = r6.f2128f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f1960q
            r1 = r1[r2]
            int r1 = r1.i(r0)
        L_0x002f:
            int r2 = r4.f1959p
            if (r3 >= r2) goto L_0x0041
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f1960q
            r2 = r2[r3]
            int r2 = r2.i(r0)
            if (r2 <= r1) goto L_0x003e
            r1 = r2
        L_0x003e:
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0041:
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0045
            goto L_0x0013
        L_0x0045:
            int r1 = r6.f2129g
            int r6 = r6.f2124b
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r1 - r6
            goto L_0x0015
        L_0x0050:
            int r0 = r6.f2129g
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f1960q
            r1 = r1[r2]
            int r1 = r1.f(r0)
        L_0x005a:
            int r2 = r4.f1959p
            if (r3 >= r2) goto L_0x006c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f1960q
            r2 = r2[r3]
            int r2 = r2.f(r0)
            if (r2 >= r1) goto L_0x0069
            r1 = r2
        L_0x0069:
            int r3 = r3 + 1
            goto L_0x005a
        L_0x006c:
            int r0 = r6.f2129g
            int r1 = r1 - r0
            if (r1 >= 0) goto L_0x0072
            goto L_0x0019
        L_0x0072:
            int r0 = r6.f2128f
            int r6 = r6.f2124b
            int r6 = java.lang.Math.min(r1, r6)
            int r6 = r6 + r0
            goto L_0x001b
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.S0(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.n):void");
    }

    public final void T(RecyclerView.r rVar, RecyclerView.w wVar, View view, i0.f fVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            S(view, fVar);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.f1963t == 0) {
            f fVar2 = cVar.f1976e;
            if (fVar2 == null) {
                i15 = -1;
            } else {
                i15 = fVar2.f1997e;
            }
            i13 = i15;
            i12 = 1;
            i11 = -1;
            i10 = -1;
        } else {
            f fVar3 = cVar.f1976e;
            if (fVar3 == null) {
                i14 = -1;
            } else {
                i14 = fVar3.f1997e;
            }
            i11 = i14;
            i10 = 1;
            i13 = -1;
            i12 = -1;
        }
        fVar.h(f.b.a(i13, i12, i11, i10, false, false));
    }

    public final void T0(int i10, RecyclerView.r rVar) {
        int w10 = w() - 1;
        while (w10 >= 0) {
            View v10 = v(w10);
            if (this.f1961r.e(v10) >= i10 && this.f1961r.n(v10) >= i10) {
                c cVar = (c) v10.getLayoutParams();
                cVar.getClass();
                if (cVar.f1976e.f1993a.size() != 1) {
                    f fVar = cVar.f1976e;
                    int size = fVar.f1993a.size();
                    View remove = fVar.f1993a.remove(size - 1);
                    c h10 = f.h(remove);
                    h10.f1976e = null;
                    if (h10.c() || h10.b()) {
                        fVar.f1996d -= StaggeredGridLayoutManager.this.f1961r.c(remove);
                    }
                    if (size == 1) {
                        fVar.f1994b = Integer.MIN_VALUE;
                    }
                    fVar.f1995c = Integer.MIN_VALUE;
                    g0(v10, rVar);
                    w10--;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void U(int i10, int i11) {
        M0(i10, i11, 1);
    }

    public final void U0(int i10, RecyclerView.r rVar) {
        while (w() > 0) {
            View v10 = v(0);
            if (this.f1961r.b(v10) <= i10 && this.f1961r.m(v10) <= i10) {
                c cVar = (c) v10.getLayoutParams();
                cVar.getClass();
                if (cVar.f1976e.f1993a.size() != 1) {
                    f fVar = cVar.f1976e;
                    View remove = fVar.f1993a.remove(0);
                    c h10 = f.h(remove);
                    h10.f1976e = null;
                    if (fVar.f1993a.size() == 0) {
                        fVar.f1995c = Integer.MIN_VALUE;
                    }
                    if (h10.c() || h10.b()) {
                        fVar.f1996d -= StaggeredGridLayoutManager.this.f1961r.c(remove);
                    }
                    fVar.f1994b = Integer.MIN_VALUE;
                    g0(v10, rVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void V() {
        d dVar = this.B;
        int[] iArr = dVar.f1977a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        dVar.f1978b = null;
        j0();
    }

    public final void V0() {
        this.f1965x = (this.f1963t == 1 || !O0()) ? this.w : !this.w;
    }

    public final void W(int i10, int i11) {
        M0(i10, i11, 8);
    }

    public final int W0(int i10, RecyclerView.r rVar, RecyclerView.w wVar) {
        if (w() == 0 || i10 == 0) {
            return 0;
        }
        R0(i10, wVar);
        int D0 = D0(rVar, this.f1964v, wVar);
        if (this.f1964v.f2124b >= D0) {
            i10 = i10 < 0 ? -D0 : D0;
        }
        this.f1961r.o(-i10);
        this.D = this.f1965x;
        n nVar = this.f1964v;
        nVar.f2124b = 0;
        S0(rVar, nVar);
        return i10;
    }

    public final void X(int i10, int i11) {
        M0(i10, i11, 2);
    }

    public final void X0(int i10) {
        n nVar = this.f1964v;
        nVar.f2127e = i10;
        int i11 = 1;
        if (this.f1965x != (i10 == -1)) {
            i11 = -1;
        }
        nVar.f2126d = i11;
    }

    public final void Y(int i10, int i11) {
        M0(i10, i11, 4);
    }

    public final void Y0(int i10, RecyclerView.w wVar) {
        boolean z9;
        int i11;
        int i12;
        boolean z10;
        int i13;
        boolean z11;
        n nVar = this.f1964v;
        boolean z12 = false;
        nVar.f2124b = 0;
        nVar.f2125c = i10;
        RecyclerView.v vVar = this.f1870e;
        if (vVar == null || !vVar.f1910e) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9 || (i13 = wVar.f1921a) == -1) {
            i12 = 0;
            i11 = 0;
        } else {
            boolean z13 = this.f1965x;
            if (i13 < i10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z13 == z11) {
                i12 = this.f1961r.l();
                i11 = 0;
            } else {
                i11 = this.f1961r.l();
                i12 = 0;
            }
        }
        RecyclerView recyclerView = this.f1867b;
        if (recyclerView == null || !recyclerView.f1826g) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.f1964v.f2128f = this.f1961r.k() - i11;
            this.f1964v.f2129g = this.f1961r.g() + i12;
        } else {
            this.f1964v.f2129g = this.f1961r.f() + i12;
            this.f1964v.f2128f = -i11;
        }
        n nVar2 = this.f1964v;
        nVar2.f2130h = false;
        nVar2.f2123a = true;
        if (this.f1961r.i() == 0 && this.f1961r.f() == 0) {
            z12 = true;
        }
        nVar2.f2131i = z12;
    }

    public final void Z(RecyclerView.r rVar, RecyclerView.w wVar) {
        P0(rVar, wVar, true);
    }

    public final void Z0(f fVar, int i10, int i11) {
        int i12 = fVar.f1996d;
        if (i10 == -1) {
            int i13 = fVar.f1994b;
            if (i13 == Integer.MIN_VALUE) {
                View view = fVar.f1993a.get(0);
                c h10 = f.h(view);
                fVar.f1994b = StaggeredGridLayoutManager.this.f1961r.e(view);
                h10.getClass();
                i13 = fVar.f1994b;
            }
            if (i13 + i12 > i11) {
                return;
            }
        } else {
            int i14 = fVar.f1995c;
            if (i14 == Integer.MIN_VALUE) {
                fVar.a();
                i14 = fVar.f1995c;
            }
            if (i14 - i12 < i11) {
                return;
            }
        }
        this.f1966y.set(fVar.f1997e, false);
    }

    public final PointF a(int i10) {
        int y02 = y0(i10);
        PointF pointF = new PointF();
        if (y02 == 0) {
            return null;
        }
        if (this.f1963t == 0) {
            pointF.x = (float) y02;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) y02;
        }
        return pointF;
    }

    public final void a0(RecyclerView.w wVar) {
        this.f1967z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    public final void b0(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.F = (e) parcelable;
            j0();
        }
    }

    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    public final Parcelable c0() {
        int i10;
        View view;
        int i11;
        int i12;
        int[] iArr;
        e eVar = this.F;
        if (eVar != null) {
            return new e(eVar);
        }
        e eVar2 = new e();
        eVar2.f1990h = this.w;
        eVar2.f1991i = this.D;
        eVar2.f1992j = this.E;
        d dVar = this.B;
        if (dVar == null || (iArr = dVar.f1977a) == null) {
            eVar2.f1987e = 0;
        } else {
            eVar2.f1988f = iArr;
            eVar2.f1987e = iArr.length;
            eVar2.f1989g = dVar.f1978b;
        }
        int i13 = -1;
        if (w() > 0) {
            if (this.D) {
                i10 = J0();
            } else {
                i10 = I0();
            }
            eVar2.f1983a = i10;
            if (this.f1965x) {
                view = E0(true);
            } else {
                view = F0(true);
            }
            if (view != null) {
                i13 = RecyclerView.l.G(view);
            }
            eVar2.f1984b = i13;
            int i14 = this.f1959p;
            eVar2.f1985c = i14;
            eVar2.f1986d = new int[i14];
            for (int i15 = 0; i15 < this.f1959p; i15++) {
                if (this.D) {
                    i11 = this.f1960q[i15].f(Integer.MIN_VALUE);
                    if (i11 != Integer.MIN_VALUE) {
                        i12 = this.f1961r.g();
                    } else {
                        eVar2.f1986d[i15] = i11;
                    }
                } else {
                    i11 = this.f1960q[i15].i(Integer.MIN_VALUE);
                    if (i11 != Integer.MIN_VALUE) {
                        i12 = this.f1961r.k();
                    } else {
                        eVar2.f1986d[i15] = i11;
                    }
                }
                i11 -= i12;
                eVar2.f1986d[i15] = i11;
            }
        } else {
            eVar2.f1983a = -1;
            eVar2.f1984b = -1;
            eVar2.f1985c = 0;
        }
        return eVar2;
    }

    public final void d0(int i10) {
        if (i10 == 0) {
            z0();
        }
    }

    public final boolean e() {
        return this.f1963t == 0;
    }

    public final boolean f() {
        return this.f1963t == 1;
    }

    public final boolean g(RecyclerView.m mVar) {
        return mVar instanceof c;
    }

    public final void i(int i10, int i11, RecyclerView.w wVar, RecyclerView.l.c cVar) {
        boolean z9;
        int i12;
        int i13;
        if (this.f1963t != 0) {
            i10 = i11;
        }
        if (w() != 0 && i10 != 0) {
            R0(i10, wVar);
            int[] iArr = this.J;
            if (iArr == null || iArr.length < this.f1959p) {
                this.J = new int[this.f1959p];
            }
            int i14 = 0;
            for (int i15 = 0; i15 < this.f1959p; i15++) {
                n nVar = this.f1964v;
                if (nVar.f2126d == -1) {
                    i13 = nVar.f2128f;
                    i12 = this.f1960q[i15].i(i13);
                } else {
                    i13 = this.f1960q[i15].f(nVar.f2129g);
                    i12 = this.f1964v.f2129g;
                }
                int i16 = i13 - i12;
                if (i16 >= 0) {
                    this.J[i14] = i16;
                    i14++;
                }
            }
            Arrays.sort(this.J, 0, i14);
            int i17 = 0;
            while (i17 < i14) {
                int i18 = this.f1964v.f2125c;
                if (i18 < 0 || i18 >= wVar.b()) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z9) {
                    ((m.b) cVar).a(this.f1964v.f2125c, this.J[i17]);
                    n nVar2 = this.f1964v;
                    nVar2.f2125c += nVar2.f2126d;
                    i17++;
                } else {
                    return;
                }
            }
        }
    }

    public final int k(RecyclerView.w wVar) {
        return A0(wVar);
    }

    public final int k0(int i10, RecyclerView.r rVar, RecyclerView.w wVar) {
        return W0(i10, rVar, wVar);
    }

    public final int l(RecyclerView.w wVar) {
        return B0(wVar);
    }

    public final void l0(int i10) {
        e eVar = this.F;
        if (!(eVar == null || eVar.f1983a == i10)) {
            eVar.f1986d = null;
            eVar.f1985c = 0;
            eVar.f1983a = -1;
            eVar.f1984b = -1;
        }
        this.f1967z = i10;
        this.A = Integer.MIN_VALUE;
        j0();
    }

    public final int m(RecyclerView.w wVar) {
        return C0(wVar);
    }

    public final int m0(int i10, RecyclerView.r rVar, RecyclerView.w wVar) {
        return W0(i10, rVar, wVar);
    }

    public final int n(RecyclerView.w wVar) {
        return A0(wVar);
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
        int E2 = E() + D();
        int C2 = C() + F();
        if (this.f1963t == 1) {
            int height = rect.height() + C2;
            RecyclerView recyclerView = this.f1867b;
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            i13 = RecyclerView.l.h(i11, height, y.d.d(recyclerView));
            i12 = RecyclerView.l.h(i10, (this.u * this.f1959p) + E2, y.d.e(this.f1867b));
        } else {
            int width = rect.width() + E2;
            RecyclerView recyclerView2 = this.f1867b;
            WeakHashMap<View, l0> weakHashMap2 = y.f6776a;
            i12 = RecyclerView.l.h(i10, width, y.d.e(recyclerView2));
            i13 = RecyclerView.l.h(i11, (this.u * this.f1959p) + C2, y.d.d(this.f1867b));
        }
        this.f1867b.setMeasuredDimension(i12, i13);
    }

    public final RecyclerView.m s() {
        return this.f1963t == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    public final RecyclerView.m t(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public final RecyclerView.m u(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public final void v0(RecyclerView recyclerView, int i10) {
        o oVar = new o(recyclerView.getContext());
        oVar.f1906a = i10;
        w0(oVar);
    }

    public final boolean x0() {
        return this.F == null;
    }

    public final int y(RecyclerView.r rVar, RecyclerView.w wVar) {
        return this.f1963t == 1 ? this.f1959p : super.y(rVar, wVar);
    }

    public final int y0(int i10) {
        if (w() == 0) {
            return this.f1965x ? 1 : -1;
        }
        return (i10 < I0()) != this.f1965x ? -1 : 1;
    }

    public final boolean z0() {
        int i10;
        if (!(w() == 0 || this.C == 0 || !this.f1872g)) {
            if (this.f1965x) {
                i10 = J0();
                I0();
            } else {
                i10 = I0();
                J0();
            }
            if (i10 == 0 && N0() != null) {
                d dVar = this.B;
                int[] iArr = dVar.f1977a;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                dVar.f1978b = null;
                this.f1871f = true;
                j0();
                return true;
            }
        }
        return false;
    }
}
