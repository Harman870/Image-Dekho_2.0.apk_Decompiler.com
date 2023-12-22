package androidx.lifecycle;

import android.os.Looper;
import androidx.fragment.app.n;
import androidx.fragment.app.w0;
import androidx.lifecycle.g;
import j.b;
import java.util.Map;
import z0.b;

public abstract class LiveData<T> {
    public static final Object k = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f1686a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public j.b<r<? super T>, LiveData<T>.c> f1687b = new j.b<>();

    /* renamed from: c  reason: collision with root package name */
    public int f1688c = 0;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1689d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f1690e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f1691f;

    /* renamed from: g  reason: collision with root package name */
    public int f1692g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1693h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1694i;

    /* renamed from: j  reason: collision with root package name */
    public final a f1695j;

    public class LifecycleBoundObserver extends LiveData<T>.c implements j {

        /* renamed from: e  reason: collision with root package name */
        public final l f1696e;

        public LifecycleBoundObserver(l lVar, b.C0174b bVar) {
            super(bVar);
            this.f1696e = lVar;
        }

        public final void b(l lVar, g.b bVar) {
            g.c cVar = this.f1696e.r().f1744b;
            if (cVar == g.c.DESTROYED) {
                LiveData.this.h(this.f1699a);
                return;
            }
            g.c cVar2 = null;
            while (cVar2 != cVar) {
                c(f());
                cVar2 = cVar;
                cVar = this.f1696e.r().f1744b;
            }
        }

        public final void d() {
            this.f1696e.r().c(this);
        }

        public final boolean e(l lVar) {
            return this.f1696e == lVar;
        }

        public final boolean f() {
            return this.f1696e.r().f1744b.a(g.c.STARTED);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            Object obj;
            synchronized (LiveData.this.f1686a) {
                obj = LiveData.this.f1691f;
                LiveData.this.f1691f = LiveData.k;
            }
            LiveData.this.i(obj);
        }
    }

    public class b extends LiveData<T>.c {
        public b(LiveData liveData, n.d dVar) {
            super(dVar);
        }

        public final boolean f() {
            return true;
        }
    }

    public abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final r<? super T> f1699a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1700b;

        /* renamed from: c  reason: collision with root package name */
        public int f1701c = -1;

        public c(r<? super T> rVar) {
            this.f1699a = rVar;
        }

        public final void c(boolean z9) {
            int i10;
            boolean z10;
            boolean z11;
            if (z9 != this.f1700b) {
                this.f1700b = z9;
                LiveData liveData = LiveData.this;
                if (z9) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                int i11 = liveData.f1688c;
                liveData.f1688c = i10 + i11;
                if (!liveData.f1689d) {
                    liveData.f1689d = true;
                    while (true) {
                        try {
                            int i12 = liveData.f1688c;
                            if (i11 == i12) {
                                break;
                            }
                            if (i11 != 0 || i12 <= 0) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (i11 <= 0 || i12 != 0) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (z10) {
                                liveData.f();
                            } else if (z11) {
                                liveData.g();
                            }
                            i11 = i12;
                        } finally {
                            liveData.f1689d = false;
                        }
                    }
                }
                if (this.f1700b) {
                    LiveData.this.c(this);
                }
            }
        }

        public void d() {
        }

        public boolean e(l lVar) {
            return false;
        }

        public abstract boolean f();
    }

    public LiveData() {
        Object obj = k;
        this.f1691f = obj;
        this.f1695j = new a();
        this.f1690e = obj;
        this.f1692g = -1;
    }

    public static void a(String str) {
        boolean z9;
        i.a.A().f7082b.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            throw new IllegalStateException(w0.d("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(LiveData<T>.c cVar) {
        if (cVar.f1700b) {
            if (!cVar.f()) {
                cVar.c(false);
                return;
            }
            int i10 = cVar.f1701c;
            int i11 = this.f1692g;
            if (i10 < i11) {
                cVar.f1701c = i11;
                cVar.f1699a.a(this.f1690e);
            }
        }
    }

    public final void c(LiveData<T>.c cVar) {
        if (this.f1693h) {
            this.f1694i = true;
            return;
        }
        this.f1693h = true;
        do {
            this.f1694i = false;
            if (cVar == null) {
                j.b<r<? super T>, LiveData<T>.c> bVar = this.f1687b;
                bVar.getClass();
                b.d dVar = new b.d();
                bVar.f7989c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((c) ((Map.Entry) dVar.next()).getValue());
                    if (this.f1694i) {
                        break;
                    }
                }
            } else {
                b(cVar);
                cVar = null;
            }
        } while (this.f1694i);
        this.f1693h = false;
    }

    public final void d(l lVar, b.C0174b bVar) {
        V v10;
        a("observe");
        if (lVar.r().f1744b != g.c.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lVar, bVar);
            j.b<r<? super T>, LiveData<T>.c> bVar2 = this.f1687b;
            b.c<r<? super T>, LiveData<T>.c> a10 = bVar2.a(bVar);
            if (a10 != null) {
                v10 = a10.f7992b;
            } else {
                b.c<K, V> cVar = new b.c<>(bVar, lifecycleBoundObserver);
                bVar2.f7990d++;
                b.c<K, V> cVar2 = bVar2.f7988b;
                if (cVar2 == null) {
                    bVar2.f7987a = cVar;
                } else {
                    cVar2.f7993c = cVar;
                    cVar.f7994d = cVar2;
                }
                bVar2.f7988b = cVar;
                v10 = null;
            }
            c cVar3 = (c) v10;
            if (cVar3 != null && !cVar3.e(lVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (cVar3 == null) {
                lVar.r().a(lifecycleBoundObserver);
            }
        }
    }

    public final void e(n.d dVar) {
        V v10;
        a("observeForever");
        b bVar = new b(this, dVar);
        j.b<r<? super T>, LiveData<T>.c> bVar2 = this.f1687b;
        b.c<r<? super T>, LiveData<T>.c> a10 = bVar2.a(dVar);
        if (a10 != null) {
            v10 = a10.f7992b;
        } else {
            b.c<K, V> cVar = new b.c<>(dVar, bVar);
            bVar2.f7990d++;
            b.c<K, V> cVar2 = bVar2.f7988b;
            if (cVar2 == null) {
                bVar2.f7987a = cVar;
            } else {
                cVar2.f7993c = cVar;
                cVar.f7994d = cVar2;
            }
            bVar2.f7988b = cVar;
            v10 = null;
        }
        c cVar3 = (c) v10;
        if (cVar3 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (cVar3 == null) {
            bVar.c(true);
        }
    }

    public void f() {
    }

    public void g() {
    }

    public void h(r<? super T> rVar) {
        a("removeObserver");
        c d10 = this.f1687b.d(rVar);
        if (d10 != null) {
            d10.d();
            d10.c(false);
        }
    }

    public abstract void i(T t10);
}
