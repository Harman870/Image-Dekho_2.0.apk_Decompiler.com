package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.g;
import androidx.lifecycle.v;

public final class t implements l {

    /* renamed from: i  reason: collision with root package name */
    public static final t f1756i = new t();

    /* renamed from: a  reason: collision with root package name */
    public int f1757a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f1758b = 0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1759c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1760d = true;

    /* renamed from: e  reason: collision with root package name */
    public Handler f1761e;

    /* renamed from: f  reason: collision with root package name */
    public final m f1762f = new m(this);

    /* renamed from: g  reason: collision with root package name */
    public a f1763g = new a();

    /* renamed from: h  reason: collision with root package name */
    public b f1764h = new b();

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            t tVar = t.this;
            if (tVar.f1758b == 0) {
                tVar.f1759c = true;
                tVar.f1762f.f(g.b.ON_PAUSE);
            }
            t tVar2 = t.this;
            if (tVar2.f1757a == 0 && tVar2.f1759c) {
                tVar2.f1762f.f(g.b.ON_STOP);
                tVar2.f1760d = true;
            }
        }
    }

    public class b implements v.a {
        public b() {
        }
    }

    public final void a() {
        int i10 = this.f1758b + 1;
        this.f1758b = i10;
        if (i10 != 1) {
            return;
        }
        if (this.f1759c) {
            this.f1762f.f(g.b.ON_RESUME);
            this.f1759c = false;
            return;
        }
        this.f1761e.removeCallbacks(this.f1763g);
    }

    public final m r() {
        return this.f1762f;
    }
}
