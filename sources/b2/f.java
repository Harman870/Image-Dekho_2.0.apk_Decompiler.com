package b2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.n;
import com.bumptech.glide.o;
import f2.g;
import java.util.ArrayList;
import n1.e;
import o1.l;
import r1.d;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final n1.a f2222a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f2223b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f2224c;

    /* renamed from: d  reason: collision with root package name */
    public final o f2225d;

    /* renamed from: e  reason: collision with root package name */
    public final d f2226e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2227f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2228g;

    /* renamed from: h  reason: collision with root package name */
    public n<Bitmap> f2229h;

    /* renamed from: i  reason: collision with root package name */
    public a f2230i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2231j;
    public a k;

    /* renamed from: l  reason: collision with root package name */
    public Bitmap f2232l;

    /* renamed from: m  reason: collision with root package name */
    public l<Bitmap> f2233m;

    /* renamed from: n  reason: collision with root package name */
    public a f2234n;

    /* renamed from: o  reason: collision with root package name */
    public int f2235o;

    /* renamed from: p  reason: collision with root package name */
    public int f2236p;

    /* renamed from: q  reason: collision with root package name */
    public int f2237q;

    public static class a extends g2.c<Bitmap> {

        /* renamed from: d  reason: collision with root package name */
        public final Handler f2238d;

        /* renamed from: e  reason: collision with root package name */
        public final int f2239e;

        /* renamed from: f  reason: collision with root package name */
        public final long f2240f;

        /* renamed from: g  reason: collision with root package name */
        public Bitmap f2241g;

        public a(Handler handler, int i10, long j10) {
            this.f2238d = handler;
            this.f2239e = i10;
            this.f2240f = j10;
        }

        public final void a(Object obj) {
            this.f2241g = (Bitmap) obj;
            this.f2238d.sendMessageAtTime(this.f2238d.obtainMessage(1, this), this.f2240f);
        }

        public final void h(Drawable drawable) {
            this.f2241g = null;
        }
    }

    public interface b {
        void a();
    }

    public class c implements Handler.Callback {
        public c() {
        }

        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                f.this.b((a) message.obj);
                return true;
            } else if (i10 != 2) {
                return false;
            } else {
                f.this.f2225d.i((a) message.obj);
                return false;
            }
        }
    }

    public f(com.bumptech.glide.b bVar, e eVar, int i10, int i11, w1.b bVar2, Bitmap bitmap) {
        d dVar = bVar.f2546a;
        Context baseContext = bVar.f2548c.getBaseContext();
        if (baseContext != null) {
            o f10 = com.bumptech.glide.b.b(baseContext).f2550e.f(baseContext);
            Context baseContext2 = bVar.f2548c.getBaseContext();
            if (baseContext2 != null) {
                o f11 = com.bumptech.glide.b.b(baseContext2).f2550e.f(baseContext2);
                f11.getClass();
                n<Bitmap> w = new n(f11.f2661a, f11, Bitmap.class, f11.f2662b).w(o.k).w(((g) ((g) ((g) new g().e(q1.l.f11056a)).r()).n()).i(i10, i11));
                this.f2224c = new ArrayList();
                this.f2225d = f10;
                Handler handler = new Handler(Looper.getMainLooper(), new c());
                this.f2226e = dVar;
                this.f2223b = handler;
                this.f2229h = w;
                this.f2222a = eVar;
                c(bVar2, bitmap);
                return;
            }
            throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    public final void a() {
        if (this.f2227f && !this.f2228g) {
            a aVar = this.f2234n;
            if (aVar != null) {
                this.f2234n = null;
                b(aVar);
                return;
            }
            this.f2228g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f2222a.e());
            this.f2222a.c();
            this.k = new a(this.f2223b, this.f2222a.a(), uptimeMillis);
            n<Bitmap> B = this.f2229h.w((g) new g().m(new i2.b(Double.valueOf(Math.random())))).B(this.f2222a);
            B.z(this.k, B);
        }
    }

    public final void b(a aVar) {
        this.f2228g = false;
        if (this.f2231j) {
            this.f2223b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f2227f) {
            this.f2234n = aVar;
        } else {
            if (aVar.f2241g != null) {
                Bitmap bitmap = this.f2232l;
                if (bitmap != null) {
                    this.f2226e.e(bitmap);
                    this.f2232l = null;
                }
                a aVar2 = this.f2230i;
                this.f2230i = aVar;
                int size = this.f2224c.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((b) this.f2224c.get(size)).a();
                }
                if (aVar2 != null) {
                    this.f2223b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            a();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [o1.l, o1.l<android.graphics.Bitmap>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(o1.l<android.graphics.Bitmap> r4, android.graphics.Bitmap r5) {
        /*
            r3 = this;
            y3.a.h(r4)
            r3.f2233m = r4
            y3.a.h(r5)
            r3.f2232l = r5
            com.bumptech.glide.n<android.graphics.Bitmap> r0 = r3.f2229h
            f2.g r1 = new f2.g
            r1.<init>()
            r2 = 1
            f2.a r4 = r1.p(r4, r2)
            com.bumptech.glide.n r4 = r0.w(r4)
            r3.f2229h = r4
            int r4 = j2.l.c(r5)
            r3.f2235o = r4
            int r4 = r5.getWidth()
            r3.f2236p = r4
            int r4 = r5.getHeight()
            r3.f2237q = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.f.c(o1.l, android.graphics.Bitmap):void");
    }
}
