package a1;

import a1.b;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.lifecycle.LiveData;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m3.f;
import o.g;
import p3.d;
import z0.b;

public abstract class a<D> extends b<D> {

    /* renamed from: g  reason: collision with root package name */
    public final Executor f29g;

    /* renamed from: h  reason: collision with root package name */
    public volatile a<D>.a f30h;

    /* renamed from: i  reason: collision with root package name */
    public volatile a<D>.a f31i;

    /* renamed from: a1.a$a  reason: collision with other inner class name */
    public final class C0000a extends c<Void, Void, D> implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final CountDownLatch f32h = new CountDownLatch(1);

        public C0000a() {
        }

        public final void a(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            a.this.d();
        }

        public final void b(D d10) {
            try {
                a aVar = a.this;
                if (aVar.f31i == this) {
                    SystemClock.uptimeMillis();
                    aVar.f31i = null;
                    aVar.c();
                }
            } finally {
                this.f32h.countDown();
            }
        }

        public final void c(D d10) {
            try {
                a.this.b(this, d10);
            } finally {
                this.f32h.countDown();
            }
        }

        public final void run() {
            a.this.c();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        ThreadPoolExecutor threadPoolExecutor = c.f40f;
        this.f29g = threadPoolExecutor;
    }

    public final void b(a<D>.a aVar, D d10) {
        if (this.f30h != aVar) {
            if (this.f31i == aVar) {
                SystemClock.uptimeMillis();
                this.f31i = null;
                c();
            }
        } else if (!this.f37d) {
            boolean z9 = false;
            SystemClock.uptimeMillis();
            this.f30h = null;
            b.a<D> aVar2 = this.f35b;
            if (aVar2 != null) {
                b.a aVar3 = (b.a) aVar2;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    aVar3.i(d10);
                    return;
                }
                synchronized (aVar3.f1686a) {
                    if (aVar3.f1691f == LiveData.k) {
                        z9 = true;
                    }
                    aVar3.f1691f = d10;
                }
                if (z9) {
                    i.a.A().B(aVar3.f1695j);
                }
            }
        }
    }

    public final void c() {
        if (this.f31i == null && this.f30h != null) {
            this.f30h.getClass();
            a<D>.a aVar = this.f30h;
            Executor executor = this.f29g;
            if (aVar.f44c != 1) {
                int b10 = g.b(aVar.f44c);
                if (b10 == 1) {
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                } else if (b10 != 2) {
                    throw new IllegalStateException("We should never reach this state");
                } else {
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
            } else {
                aVar.f44c = 2;
                aVar.f42a.f52a = null;
                executor.execute(aVar.f43b);
            }
        }
    }

    public final void d() {
        f fVar = (f) this;
        Iterator it = fVar.k.iterator();
        if (!it.hasNext()) {
            try {
                fVar.f9363j.tryAcquire(0, 5, TimeUnit.SECONDS);
            } catch (InterruptedException e10) {
                Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
                Thread.currentThread().interrupt();
            }
        } else {
            ((d) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
    }
}
