package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.appcompat.widget.n1;
import androidx.emoji2.text.f;
import e0.e;
import e0.m;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class l extends f.c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f1382d = new a();

    public static class a {
    }

    public static class b implements f.g {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1383a;

        /* renamed from: b  reason: collision with root package name */
        public final e0.f f1384b;

        /* renamed from: c  reason: collision with root package name */
        public final a f1385c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f1386d = new Object();

        /* renamed from: e  reason: collision with root package name */
        public Handler f1387e;

        /* renamed from: f  reason: collision with root package name */
        public Executor f1388f;

        /* renamed from: g  reason: collision with root package name */
        public ThreadPoolExecutor f1389g;

        /* renamed from: h  reason: collision with root package name */
        public f.h f1390h;

        public b(Context context, e0.f fVar) {
            a aVar = l.f1382d;
            if (context != null) {
                this.f1383a = context.getApplicationContext();
                this.f1384b = fVar;
                this.f1385c = aVar;
                return;
            }
            throw new NullPointerException("Context cannot be null");
        }

        public final void a(f.h hVar) {
            synchronized (this.f1386d) {
                this.f1390h = hVar;
            }
            c();
        }

        public final void b() {
            synchronized (this.f1386d) {
                this.f1390h = null;
                Handler handler = this.f1387e;
                if (handler != null) {
                    handler.removeCallbacks((Runnable) null);
                }
                this.f1387e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1389g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f1388f = null;
                this.f1389g = null;
            }
        }

        public final void c() {
            synchronized (this.f1386d) {
                if (this.f1390h != null) {
                    if (this.f1388f == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.f1389g = threadPoolExecutor;
                        this.f1388f = threadPoolExecutor;
                    }
                    this.f1388f.execute(new n1(1, this));
                }
            }
        }

        public final m d() {
            try {
                a aVar = this.f1385c;
                Context context = this.f1383a;
                e0.f fVar = this.f1384b;
                aVar.getClass();
                e0.l a10 = e.a(context, fVar);
                if (a10.f6149a == 0) {
                    m[] mVarArr = a10.f6150b;
                    if (mVarArr != null && mVarArr.length != 0) {
                        return mVarArr[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                StringBuilder g10 = androidx.activity.f.g("fetchFonts failed (");
                g10.append(a10.f6149a);
                g10.append(")");
                throw new RuntimeException(g10.toString());
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }
    }

    public l(Context context, e0.f fVar) {
        super(new b(context, fVar));
    }
}
