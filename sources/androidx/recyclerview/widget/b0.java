package androidx.recyclerview.widget;

import android.view.View;

public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final b f2017a;

    /* renamed from: b  reason: collision with root package name */
    public a f2018b = new a();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2019a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f2020b;

        /* renamed from: c  reason: collision with root package name */
        public int f2021c;

        /* renamed from: d  reason: collision with root package name */
        public int f2022d;

        /* renamed from: e  reason: collision with root package name */
        public int f2023e;

        public final boolean a() {
            int i10 = this.f2019a;
            int i11 = 2;
            if ((i10 & 7) != 0) {
                int i12 = this.f2022d;
                int i13 = this.f2020b;
                if ((((i12 > i13 ? 1 : i12 == i13 ? 2 : 4) << 0) & i10) == 0) {
                    return false;
                }
            }
            if ((i10 & 112) != 0) {
                int i14 = this.f2022d;
                int i15 = this.f2021c;
                if ((((i14 > i15 ? 1 : i14 == i15 ? 2 : 4) << 4) & i10) == 0) {
                    return false;
                }
            }
            if ((i10 & 1792) != 0) {
                int i16 = this.f2023e;
                int i17 = this.f2020b;
                if ((((i16 > i17 ? 1 : i16 == i17 ? 2 : 4) << 8) & i10) == 0) {
                    return false;
                }
            }
            if ((i10 & 28672) != 0) {
                int i18 = this.f2023e;
                int i19 = this.f2021c;
                if (i18 > i19) {
                    i11 = 1;
                } else if (i18 != i19) {
                    i11 = 4;
                }
                if ((i10 & (i11 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public interface b {
        int a();

        int b(View view);

        View c(int i10);

        int d();

        int e(View view);
    }

    public b0(b bVar) {
        this.f2017a = bVar;
    }

    public final View a(int i10, int i11, int i12, int i13) {
        int i14;
        int d10 = this.f2017a.d();
        int a10 = this.f2017a.a();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View c10 = this.f2017a.c(i10);
            int b10 = this.f2017a.b(c10);
            int e10 = this.f2017a.e(c10);
            a aVar = this.f2018b;
            aVar.f2020b = d10;
            aVar.f2021c = a10;
            aVar.f2022d = b10;
            aVar.f2023e = e10;
            if (i12 != 0) {
                aVar.f2019a = i12 | 0;
                if (aVar.a()) {
                    return c10;
                }
            }
            if (i13 != 0) {
                a aVar2 = this.f2018b;
                aVar2.f2019a = i13 | 0;
                if (aVar2.a()) {
                    view = c10;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public final boolean b(View view) {
        a aVar = this.f2018b;
        int d10 = this.f2017a.d();
        int a10 = this.f2017a.a();
        int b10 = this.f2017a.b(view);
        int e10 = this.f2017a.e(view);
        aVar.f2020b = d10;
        aVar.f2021c = a10;
        aVar.f2022d = b10;
        aVar.f2023e = e10;
        a aVar2 = this.f2018b;
        aVar2.f2019a = 24579 | 0;
        return aVar2.a();
    }
}
