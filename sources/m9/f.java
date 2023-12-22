package m9;

import androidx.activity.b;
import j9.a;
import j9.e0;
import j9.u;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import k9.e;
import m9.i;
import y0.c;

public final class f {

    /* renamed from: g  reason: collision with root package name */
    public static final ThreadPoolExecutor f9421g;

    /* renamed from: a  reason: collision with root package name */
    public final int f9422a = 5;

    /* renamed from: b  reason: collision with root package name */
    public final long f9423b;

    /* renamed from: c  reason: collision with root package name */
    public final b f9424c = new b(4, this);

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f9425d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public final c f9426e = new c(6);

    /* renamed from: f  reason: collision with root package name */
    public boolean f9427f;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = e.f9152a;
        f9421g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, timeUnit, synchronousQueue, new k9.c("OkHttp ConnectionPool", true));
    }

    public f(TimeUnit timeUnit) {
        this.f9423b = timeUnit.toNanos(5);
    }

    public final void a(e0 e0Var, IOException iOException) {
        if (e0Var.f8869b.type() != Proxy.Type.DIRECT) {
            a aVar = e0Var.f8868a;
            aVar.f8816g.connectFailed(aVar.f8810a.p(), e0Var.f8869b.address(), iOException);
        }
        c cVar = this.f9426e;
        synchronized (cVar) {
            ((Set) cVar.f13011a).add(e0Var);
        }
    }

    public final int b(e eVar, long j10) {
        ArrayList arrayList = eVar.f9419p;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                StringBuilder g10 = androidx.activity.f.g("A connection to ");
                g10.append(eVar.f9407c.f8868a.f8810a);
                g10.append(" was leaked. Did you forget to close a response body?");
                q9.f.f11399a.n(((i.b) reference).f9453a, g10.toString());
                arrayList.remove(i10);
                eVar.k = true;
                if (arrayList.isEmpty()) {
                    eVar.f9420q = j10 - this.f9423b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public final boolean c(a aVar, i iVar, @Nullable ArrayList arrayList, boolean z9) {
        boolean z10;
        boolean z11;
        Iterator it = this.f9425d.iterator();
        while (true) {
            boolean z12 = false;
            if (!it.hasNext()) {
                return false;
            }
            e eVar = (e) it.next();
            if (z9) {
                if (eVar.f9412h != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    continue;
                }
            }
            if (eVar.f9419p.size() < eVar.f9418o && !eVar.k) {
                u.a aVar2 = k9.a.f9148a;
                a aVar3 = eVar.f9407c.f8868a;
                aVar2.getClass();
                if (aVar3.a(aVar)) {
                    if (!aVar.f8810a.f8945d.equals(eVar.f9407c.f8868a.f8810a.f8945d)) {
                        if (!(eVar.f9412h == null || arrayList == null)) {
                            int size = arrayList.size();
                            int i10 = 0;
                            while (true) {
                                if (i10 >= size) {
                                    z10 = false;
                                    break;
                                }
                                e0 e0Var = (e0) arrayList.get(i10);
                                if (e0Var.f8869b.type() == Proxy.Type.DIRECT && eVar.f9407c.f8869b.type() == Proxy.Type.DIRECT && eVar.f9407c.f8870c.equals(e0Var.f8870c)) {
                                    z10 = true;
                                    break;
                                }
                                i10++;
                            }
                            if (z10 && aVar.f8819j == s9.c.f11907a && eVar.j(aVar.f8810a)) {
                                try {
                                    aVar.k.a(aVar.f8810a.f8945d, eVar.f9410f.f8937c);
                                } catch (SSLPeerUnverifiedException unused) {
                                }
                            }
                        }
                    }
                    z12 = true;
                }
            }
            if (z12) {
                if (iVar.f9447i == null) {
                    iVar.f9447i = eVar;
                    eVar.f9419p.add(new i.b(iVar, iVar.f9444f));
                    return true;
                }
                throw new IllegalStateException();
            }
        }
    }
}
