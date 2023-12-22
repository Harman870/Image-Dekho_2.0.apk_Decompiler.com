package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import d0.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

public final class m implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public static final ThreadLocal<m> f2108e = new ThreadLocal<>();

    /* renamed from: f  reason: collision with root package name */
    public static a f2109f = new a();

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<RecyclerView> f2110a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public long f2111b;

    /* renamed from: c  reason: collision with root package name */
    public long f2112c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<c> f2113d = new ArrayList<>();

    public static class a implements Comparator<c> {
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
            if (r0 == null) goto L_0x0019;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
            if (r0 != false) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            return -1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int compare(java.lang.Object r7, java.lang.Object r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.m$c r7 = (androidx.recyclerview.widget.m.c) r7
                androidx.recyclerview.widget.m$c r8 = (androidx.recyclerview.widget.m.c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f2121d
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x000c
                r3 = r2
                goto L_0x000d
            L_0x000c:
                r3 = r1
            L_0x000d:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f2121d
                if (r4 != 0) goto L_0x0013
                r4 = r2
                goto L_0x0014
            L_0x0013:
                r4 = r1
            L_0x0014:
                r5 = -1
                if (r3 == r4) goto L_0x001d
                if (r0 != 0) goto L_0x001b
            L_0x0019:
                r1 = r2
                goto L_0x0037
            L_0x001b:
                r1 = r5
                goto L_0x0037
            L_0x001d:
                boolean r0 = r7.f2118a
                boolean r3 = r8.f2118a
                if (r0 == r3) goto L_0x0026
                if (r0 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0026:
                int r0 = r8.f2119b
                int r2 = r7.f2119b
                int r0 = r0 - r2
                if (r0 == 0) goto L_0x002f
                r1 = r0
                goto L_0x0037
            L_0x002f:
                int r7 = r7.f2120c
                int r8 = r8.f2120c
                int r7 = r7 - r8
                if (r7 == 0) goto L_0x0037
                r1 = r7
            L_0x0037:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.m.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    @SuppressLint({"VisibleForTests"})
    public static class b implements RecyclerView.l.c {

        /* renamed from: a  reason: collision with root package name */
        public int f2114a;

        /* renamed from: b  reason: collision with root package name */
        public int f2115b;

        /* renamed from: c  reason: collision with root package name */
        public int[] f2116c;

        /* renamed from: d  reason: collision with root package name */
        public int f2117d;

        public final void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i11 >= 0) {
                int i12 = this.f2117d * 2;
                int[] iArr = this.f2116c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f2116c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i12 >= iArr.length) {
                    int[] iArr3 = new int[(i12 * 2)];
                    this.f2116c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f2116c;
                iArr4[i12] = i10;
                iArr4[i12 + 1] = i11;
                this.f2117d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        public final void b(RecyclerView recyclerView, boolean z9) {
            boolean z10 = false;
            this.f2117d = 0;
            int[] iArr = this.f2116c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.l lVar = recyclerView.f1830l;
            if (recyclerView.k != null && lVar != null && lVar.f1874i) {
                if (!z9) {
                    if (!recyclerView.f1838r || recyclerView.f1849y || recyclerView.f1823d.g()) {
                        z10 = true;
                    }
                    if (!z10) {
                        lVar.i(this.f2114a, this.f2115b, recyclerView.f1837q0, this);
                    }
                } else if (!recyclerView.f1823d.g()) {
                    lVar.j(recyclerView.k.a(), this);
                }
                int i10 = this.f2117d;
                if (i10 > lVar.f1875j) {
                    lVar.f1875j = i10;
                    lVar.k = z9;
                    recyclerView.f1821b.l();
                }
            }
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2118a;

        /* renamed from: b  reason: collision with root package name */
        public int f2119b;

        /* renamed from: c  reason: collision with root package name */
        public int f2120c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f2121d;

        /* renamed from: e  reason: collision with root package name */
        public int f2122e;
    }

    public static RecyclerView.z c(RecyclerView recyclerView, int i10, long j10) {
        boolean z9;
        int h10 = recyclerView.f1824e.h();
        int i11 = 0;
        while (true) {
            if (i11 >= h10) {
                z9 = false;
                break;
            }
            RecyclerView.z I = RecyclerView.I(recyclerView.f1824e.g(i11));
            if (I.f1944c == i10 && !I.g()) {
                z9 = true;
                break;
            }
            i11++;
        }
        if (z9) {
            return null;
        }
        RecyclerView.r rVar = recyclerView.f1821b;
        try {
            recyclerView.O();
            RecyclerView.z j11 = rVar.j(i10, j10);
            if (j11 != null) {
                if (!j11.f() || j11.g()) {
                    rVar.a(j11, false);
                } else {
                    rVar.g(j11.f1942a);
                }
            }
            return j11;
        } finally {
            recyclerView.P(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f2111b == 0) {
            this.f2111b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.p0;
        bVar.f2114a = i10;
        bVar.f2115b = i11;
    }

    public final void b(long j10) {
        c cVar;
        RecyclerView recyclerView;
        long j11;
        RecyclerView recyclerView2;
        c cVar2;
        boolean z9;
        int size = this.f2110a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = this.f2110a.get(i11);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.p0.b(recyclerView3, false);
                i10 += recyclerView3.p0.f2117d;
            }
        }
        this.f2113d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = this.f2110a.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar = recyclerView4.p0;
                int abs = Math.abs(bVar.f2115b) + Math.abs(bVar.f2114a);
                for (int i14 = 0; i14 < bVar.f2117d * 2; i14 += 2) {
                    if (i12 >= this.f2113d.size()) {
                        cVar2 = new c();
                        this.f2113d.add(cVar2);
                    } else {
                        cVar2 = this.f2113d.get(i12);
                    }
                    int[] iArr = bVar.f2116c;
                    int i15 = iArr[i14 + 1];
                    if (i15 <= abs) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    cVar2.f2118a = z9;
                    cVar2.f2119b = abs;
                    cVar2.f2120c = i15;
                    cVar2.f2121d = recyclerView4;
                    cVar2.f2122e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f2113d, f2109f);
        for (int i16 = 0; i16 < this.f2113d.size() && (recyclerView = cVar.f2121d) != null; i16++) {
            if ((cVar = this.f2113d.get(i16)).f2118a) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = j10;
            }
            RecyclerView.z c10 = c(recyclerView, cVar.f2122e, j11);
            if (!(c10 == null || c10.f1943b == null || !c10.f() || c10.g() || (recyclerView2 = c10.f1943b.get()) == null)) {
                if (recyclerView2.f1849y && recyclerView2.f1824e.h() != 0) {
                    recyclerView2.V();
                }
                b bVar2 = recyclerView2.p0;
                bVar2.b(recyclerView2, true);
                if (bVar2.f2117d != 0) {
                    try {
                        int i17 = i.f6035a;
                        i.a.a("RV Nested Prefetch");
                        RecyclerView.w wVar = recyclerView2.f1837q0;
                        RecyclerView.d dVar = recyclerView2.k;
                        wVar.f1924d = 1;
                        wVar.f1925e = dVar.a();
                        wVar.f1927g = false;
                        wVar.f1928h = false;
                        wVar.f1929i = false;
                        for (int i18 = 0; i18 < bVar2.f2117d * 2; i18 += 2) {
                            c(recyclerView2, bVar2.f2116c[i18], j10);
                        }
                        i.a.b();
                    } catch (Throwable th) {
                        int i19 = i.f6035a;
                        i.a.b();
                        throw th;
                    }
                }
            }
            cVar.f2118a = false;
            cVar.f2119b = 0;
            cVar.f2120c = 0;
            cVar.f2121d = null;
            cVar.f2122e = 0;
        }
    }

    public final void run() {
        try {
            int i10 = i.f6035a;
            i.a.a("RV Prefetch");
            if (this.f2110a.isEmpty()) {
                this.f2111b = 0;
                i.a.b();
                return;
            }
            int size = this.f2110a.size();
            long j10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                RecyclerView recyclerView = this.f2110a.get(i11);
                if (recyclerView.getWindowVisibility() == 0) {
                    j10 = Math.max(recyclerView.getDrawingTime(), j10);
                }
            }
            if (j10 == 0) {
                this.f2111b = 0;
                i.a.b();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j10) + this.f2112c);
            this.f2111b = 0;
            i.a.b();
        } catch (Throwable th) {
            this.f2111b = 0;
            int i12 = i.f6035a;
            i.a.b();
            throw th;
        }
    }
}
