package androidx.fragment.app;

import androidx.lifecycle.g;
import java.util.ArrayList;

public abstract class h0 {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<a> f1490a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public int f1491b;

    /* renamed from: c  reason: collision with root package name */
    public int f1492c;

    /* renamed from: d  reason: collision with root package name */
    public int f1493d;

    /* renamed from: e  reason: collision with root package name */
    public int f1494e;

    /* renamed from: f  reason: collision with root package name */
    public int f1495f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1496g;

    /* renamed from: h  reason: collision with root package name */
    public String f1497h;

    /* renamed from: i  reason: collision with root package name */
    public int f1498i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f1499j;
    public int k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f1500l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<String> f1501m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<String> f1502n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1503o = false;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f1504a;

        /* renamed from: b  reason: collision with root package name */
        public o f1505b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1506c;

        /* renamed from: d  reason: collision with root package name */
        public int f1507d;

        /* renamed from: e  reason: collision with root package name */
        public int f1508e;

        /* renamed from: f  reason: collision with root package name */
        public int f1509f;

        /* renamed from: g  reason: collision with root package name */
        public int f1510g;

        /* renamed from: h  reason: collision with root package name */
        public g.c f1511h;

        /* renamed from: i  reason: collision with root package name */
        public g.c f1512i;

        public a() {
        }

        public a(int i10, o oVar) {
            this.f1504a = i10;
            this.f1505b = oVar;
            this.f1506c = false;
            g.c cVar = g.c.RESUMED;
            this.f1511h = cVar;
            this.f1512i = cVar;
        }

        public a(int i10, o oVar, int i11) {
            this.f1504a = i10;
            this.f1505b = oVar;
            this.f1506c = true;
            g.c cVar = g.c.RESUMED;
            this.f1511h = cVar;
            this.f1512i = cVar;
        }

        public a(o oVar, g.c cVar) {
            this.f1504a = 10;
            this.f1505b = oVar;
            this.f1506c = false;
            this.f1511h = oVar.M;
            this.f1512i = cVar;
        }
    }

    public final void b(a aVar) {
        this.f1490a.add(aVar);
        aVar.f1507d = this.f1491b;
        aVar.f1508e = this.f1492c;
        aVar.f1509f = this.f1493d;
        aVar.f1510g = this.f1494e;
    }

    public abstract void c(int i10, o oVar, String str, int i11);

    public final void d(int i10, o oVar) {
        if (i10 != 0) {
            c(i10, oVar, (String) null, 2);
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }
}
