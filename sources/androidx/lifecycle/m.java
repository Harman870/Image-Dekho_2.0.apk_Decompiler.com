package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.os.Looper;
import androidx.activity.f;
import androidx.fragment.app.w0;
import androidx.lifecycle.g;
import j.b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class m extends g {

    /* renamed from: a  reason: collision with root package name */
    public j.a<k, a> f1743a = new j.a<>();

    /* renamed from: b  reason: collision with root package name */
    public g.c f1744b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<l> f1745c;

    /* renamed from: d  reason: collision with root package name */
    public int f1746d = 0;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1747e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1748f = false;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<g.c> f1749g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public final boolean f1750h;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public g.c f1751a;

        /* renamed from: b  reason: collision with root package name */
        public j f1752b;

        public a(k kVar, g.c cVar) {
            j jVar;
            HashMap hashMap = o.f1753a;
            boolean z9 = kVar instanceof j;
            boolean z10 = kVar instanceof d;
            if (z9 && z10) {
                jVar = new FullLifecycleObserverAdapter((d) kVar, (j) kVar);
            } else if (z10) {
                jVar = new FullLifecycleObserverAdapter((d) kVar, (j) null);
            } else if (z9) {
                jVar = (j) kVar;
            } else {
                Class<?> cls = kVar.getClass();
                if (o.c(cls) == 2) {
                    List list = (List) o.f1754b.get(cls);
                    if (list.size() == 1) {
                        jVar = new SingleGeneratedAdapterObserver(o.a((Constructor) list.get(0), kVar));
                    } else {
                        e[] eVarArr = new e[list.size()];
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            eVarArr[i10] = o.a((Constructor) list.get(i10), kVar);
                        }
                        jVar = new CompositeGeneratedAdaptersObserver(eVarArr);
                    }
                } else {
                    jVar = new ReflectiveGenericLifecycleObserver(kVar);
                }
            }
            this.f1752b = jVar;
            this.f1751a = cVar;
        }

        public final void a(l lVar, g.b bVar) {
            g.c a10 = bVar.a();
            g.c cVar = this.f1751a;
            if (a10.compareTo(cVar) < 0) {
                cVar = a10;
            }
            this.f1751a = cVar;
            this.f1752b.b(lVar, bVar);
            this.f1751a = a10;
        }
    }

    public m(l lVar) {
        this.f1745c = new WeakReference<>(lVar);
        this.f1744b = g.c.INITIALIZED;
        this.f1750h = true;
    }

    public final void a(k kVar) {
        l lVar;
        boolean z9;
        g.b bVar;
        e("addObserver");
        g.c cVar = this.f1744b;
        g.c cVar2 = g.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = g.c.INITIALIZED;
        }
        a aVar = new a(kVar, cVar2);
        if (this.f1743a.g(kVar, aVar) == null && (lVar = this.f1745c.get()) != null) {
            if (this.f1746d != 0 || this.f1747e) {
                z9 = true;
            } else {
                z9 = false;
            }
            g.c d10 = d(kVar);
            this.f1746d++;
            while (aVar.f1751a.compareTo(d10) < 0 && this.f1743a.f7986e.containsKey(kVar)) {
                this.f1749g.add(aVar.f1751a);
                int ordinal = aVar.f1751a.ordinal();
                if (ordinal == 1) {
                    bVar = g.b.ON_CREATE;
                } else if (ordinal == 2) {
                    bVar = g.b.ON_START;
                } else if (ordinal != 3) {
                    bVar = null;
                } else {
                    bVar = g.b.ON_RESUME;
                }
                if (bVar != null) {
                    aVar.a(lVar, bVar);
                    ArrayList<g.c> arrayList = this.f1749g;
                    arrayList.remove(arrayList.size() - 1);
                    d10 = d(kVar);
                } else {
                    StringBuilder g10 = f.g("no event up from ");
                    g10.append(aVar.f1751a);
                    throw new IllegalStateException(g10.toString());
                }
            }
            if (!z9) {
                h();
            }
            this.f1746d--;
        }
    }

    public final g.c b() {
        return this.f1744b;
    }

    public final void c(k kVar) {
        e("removeObserver");
        this.f1743a.d(kVar);
    }

    public final g.c d(k kVar) {
        b.c<K, V> cVar;
        g.c cVar2;
        j.a<k, a> aVar = this.f1743a;
        g.c cVar3 = null;
        if (aVar.f7986e.containsKey(kVar)) {
            cVar = aVar.f7986e.get(kVar).f7994d;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            cVar2 = ((a) cVar.f7992b).f1751a;
        } else {
            cVar2 = null;
        }
        if (!this.f1749g.isEmpty()) {
            ArrayList<g.c> arrayList = this.f1749g;
            cVar3 = arrayList.get(arrayList.size() - 1);
        }
        g.c cVar4 = this.f1744b;
        if (cVar2 == null || cVar2.compareTo(cVar4) >= 0) {
            cVar2 = cVar4;
        }
        if (cVar3 == null || cVar3.compareTo(cVar2) >= 0) {
            return cVar2;
        }
        return cVar3;
    }

    @SuppressLint({"RestrictedApi"})
    public final void e(String str) {
        boolean z9;
        if (this.f1750h) {
            i.a.A().f7082b.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                throw new IllegalStateException(w0.d("Method ", str, " must be called on the main thread"));
            }
        }
    }

    public final void f(g.b bVar) {
        e("handleLifecycleEvent");
        g(bVar.a());
    }

    public final void g(g.c cVar) {
        g.c cVar2 = g.c.DESTROYED;
        g.c cVar3 = this.f1744b;
        if (cVar3 != cVar) {
            if (cVar3 == g.c.INITIALIZED && cVar == cVar2) {
                StringBuilder g10 = f.g("no event down from ");
                g10.append(this.f1744b);
                throw new IllegalStateException(g10.toString());
            }
            this.f1744b = cVar;
            if (this.f1747e || this.f1746d != 0) {
                this.f1748f = true;
                return;
            }
            this.f1747e = true;
            h();
            this.f1747e = false;
            if (this.f1744b == cVar2) {
                this.f1743a = new j.a<>();
            }
        }
    }

    public final void h() {
        boolean z9;
        g.b bVar;
        g.b bVar2;
        g.c cVar;
        l lVar = this.f1745c.get();
        if (lVar != null) {
            while (true) {
                j.a<k, a> aVar = this.f1743a;
                if (aVar.f7990d == 0 || (((a) aVar.f7987a.f7992b).f1751a == (cVar = ((a) aVar.f7988b.f7992b).f1751a) && this.f1744b == cVar)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f1748f = false;
                if (!z9) {
                    if (this.f1744b.compareTo(((a) aVar.f7987a.f7992b).f1751a) < 0) {
                        j.a<k, a> aVar2 = this.f1743a;
                        b.C0102b bVar3 = new b.C0102b(aVar2.f7988b, aVar2.f7987a);
                        aVar2.f7989c.put(bVar3, Boolean.FALSE);
                        while (bVar3.hasNext() && !this.f1748f) {
                            Map.Entry entry = (Map.Entry) bVar3.next();
                            a aVar3 = (a) entry.getValue();
                            while (aVar3.f1751a.compareTo(this.f1744b) > 0 && !this.f1748f) {
                                if (!this.f1743a.f7986e.containsKey((k) entry.getKey())) {
                                    continue;
                                    break;
                                }
                                int ordinal = aVar3.f1751a.ordinal();
                                if (ordinal == 2) {
                                    bVar2 = g.b.ON_DESTROY;
                                } else if (ordinal == 3) {
                                    bVar2 = g.b.ON_STOP;
                                } else if (ordinal != 4) {
                                    bVar2 = null;
                                } else {
                                    bVar2 = g.b.ON_PAUSE;
                                }
                                if (bVar2 != null) {
                                    this.f1749g.add(bVar2.a());
                                    aVar3.a(lVar, bVar2);
                                    ArrayList<g.c> arrayList = this.f1749g;
                                    arrayList.remove(arrayList.size() - 1);
                                } else {
                                    StringBuilder g10 = f.g("no event down from ");
                                    g10.append(aVar3.f1751a);
                                    throw new IllegalStateException(g10.toString());
                                }
                            }
                        }
                    }
                    b.c<K, V> cVar2 = this.f1743a.f7988b;
                    if (!this.f1748f && cVar2 != null && this.f1744b.compareTo(((a) cVar2.f7992b).f1751a) > 0) {
                        j.a<k, a> aVar4 = this.f1743a;
                        aVar4.getClass();
                        b.d dVar = new b.d();
                        aVar4.f7989c.put(dVar, Boolean.FALSE);
                        while (dVar.hasNext() && !this.f1748f) {
                            Map.Entry entry2 = (Map.Entry) dVar.next();
                            a aVar5 = (a) entry2.getValue();
                            while (aVar5.f1751a.compareTo(this.f1744b) < 0 && !this.f1748f) {
                                if (!this.f1743a.f7986e.containsKey((k) entry2.getKey())) {
                                    continue;
                                    break;
                                }
                                this.f1749g.add(aVar5.f1751a);
                                int ordinal2 = aVar5.f1751a.ordinal();
                                if (ordinal2 == 1) {
                                    bVar = g.b.ON_CREATE;
                                } else if (ordinal2 == 2) {
                                    bVar = g.b.ON_START;
                                } else if (ordinal2 != 3) {
                                    bVar = null;
                                } else {
                                    bVar = g.b.ON_RESUME;
                                }
                                if (bVar != null) {
                                    aVar5.a(lVar, bVar);
                                    ArrayList<g.c> arrayList2 = this.f1749g;
                                    arrayList2.remove(arrayList2.size() - 1);
                                } else {
                                    StringBuilder g11 = f.g("no event up from ");
                                    g11.append(aVar5.f1751a);
                                    throw new IllegalStateException(g11.toString());
                                }
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }
}
