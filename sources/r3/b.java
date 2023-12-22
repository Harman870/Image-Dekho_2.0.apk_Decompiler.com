package r3;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import o3.f;
import q3.u;
import q3.v;

public abstract class b<T extends IInterface> {

    /* renamed from: x  reason: collision with root package name */
    public static final o3.d[] f11499x = new o3.d[0];

    /* renamed from: a  reason: collision with root package name */
    public volatile String f11500a = null;

    /* renamed from: b  reason: collision with root package name */
    public g1 f11501b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f11502c;

    /* renamed from: d  reason: collision with root package name */
    public final g f11503d;

    /* renamed from: e  reason: collision with root package name */
    public final f f11504e;

    /* renamed from: f  reason: collision with root package name */
    public final r0 f11505f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f11506g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public final Object f11507h = new Object();
    @GuardedBy("serviceBrokerLock")

    /* renamed from: i  reason: collision with root package name */
    public j f11508i;

    /* renamed from: j  reason: collision with root package name */
    public c f11509j;
    @GuardedBy("lock")
    public IInterface k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f11510l = new ArrayList();
    @GuardedBy("lock")

    /* renamed from: m  reason: collision with root package name */
    public u0 f11511m;
    @GuardedBy("lock")

    /* renamed from: n  reason: collision with root package name */
    public int f11512n = 1;

    /* renamed from: o  reason: collision with root package name */
    public final a f11513o;

    /* renamed from: p  reason: collision with root package name */
    public final C0136b f11514p;

    /* renamed from: q  reason: collision with root package name */
    public final int f11515q;

    /* renamed from: r  reason: collision with root package name */
    public final String f11516r;

    /* renamed from: s  reason: collision with root package name */
    public volatile String f11517s;

    /* renamed from: t  reason: collision with root package name */
    public o3.b f11518t = null;
    public boolean u = false;

    /* renamed from: v  reason: collision with root package name */
    public volatile x0 f11519v = null;
    public AtomicInteger w = new AtomicInteger(0);

    public interface a {
        void c(int i10);

        void d();
    }

    /* renamed from: r3.b$b  reason: collision with other inner class name */
    public interface C0136b {
        void b(o3.b bVar);
    }

    public interface c {
        void a(o3.b bVar);
    }

    public class d implements c {
        public d() {
        }

        public final void a(o3.b bVar) {
            boolean z9;
            if (bVar.f10539b == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                b bVar2 = b.this;
                bVar2.d((i) null, bVar2.u());
                return;
            }
            C0136b bVar3 = b.this.f11514p;
            if (bVar3 != null) {
                bVar3.b(bVar);
            }
        }
    }

    public b(Context context, Looper looper, e1 e1Var, f fVar, int i10, a aVar, C0136b bVar, String str) {
        if (context != null) {
            this.f11502c = context;
            if (looper == null) {
                throw new NullPointerException("Looper must not be null");
            } else if (e1Var != null) {
                this.f11503d = e1Var;
                o.i(fVar, "API availability must not be null");
                this.f11504e = fVar;
                this.f11505f = new r0(this, looper);
                this.f11515q = i10;
                this.f11513o = aVar;
                this.f11514p = bVar;
                this.f11516r = str;
            } else {
                throw new NullPointerException("Supervisor must not be null");
            }
        } else {
            throw new NullPointerException("Context must not be null");
        }
    }

    public static /* bridge */ /* synthetic */ boolean A(b bVar, int i10, int i11, IInterface iInterface) {
        synchronized (bVar.f11506g) {
            if (bVar.f11512n != i10) {
                return false;
            }
            bVar.B(i11, iInterface);
            return true;
        }
    }

    public final void B(int i10, IInterface iInterface) {
        boolean z9;
        boolean z10;
        g1 g1Var;
        boolean z11 = false;
        if (i10 != 4) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (iInterface == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z9 == z10) {
            z11 = true;
        }
        o.b(z11);
        synchronized (this.f11506g) {
            try {
                this.f11512n = i10;
                this.k = iInterface;
                if (i10 == 1) {
                    u0 u0Var = this.f11511m;
                    if (u0Var != null) {
                        g gVar = this.f11503d;
                        String str = this.f11501b.f11592a;
                        o.h(str);
                        this.f11501b.getClass();
                        if (this.f11516r == null) {
                            this.f11502c.getClass();
                        }
                        gVar.b(str, "com.google.android.gms", u0Var, this.f11501b.f11593b);
                        this.f11511m = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    u0 u0Var2 = this.f11511m;
                    if (!(u0Var2 == null || (g1Var = this.f11501b) == null)) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + g1Var.f11592a + " on " + "com.google.android.gms");
                        g gVar2 = this.f11503d;
                        String str2 = this.f11501b.f11592a;
                        o.h(str2);
                        this.f11501b.getClass();
                        if (this.f11516r == null) {
                            this.f11502c.getClass();
                        }
                        gVar2.b(str2, "com.google.android.gms", u0Var2, this.f11501b.f11593b);
                        this.w.incrementAndGet();
                    }
                    u0 u0Var3 = new u0(this, this.w.get());
                    this.f11511m = u0Var3;
                    String x9 = x();
                    boolean y9 = y();
                    this.f11501b = new g1(x9, y9);
                    if (y9) {
                        if (g() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f11501b.f11592a)));
                        }
                    }
                    g gVar3 = this.f11503d;
                    String str3 = this.f11501b.f11592a;
                    o.h(str3);
                    this.f11501b.getClass();
                    String str4 = this.f11516r;
                    if (str4 == null) {
                        str4 = this.f11502c.getClass().getName();
                    }
                    boolean z12 = this.f11501b.f11593b;
                    s();
                    if (!gVar3.c(new b1(str3, "com.google.android.gms", z12), u0Var3, str4, (Executor) null)) {
                        Log.w("GmsClient", "unable to connect to service: " + this.f11501b.f11592a + " on " + "com.google.android.gms");
                        int i11 = this.w.get();
                        r0 r0Var = this.f11505f;
                        r0Var.sendMessage(r0Var.obtainMessage(7, i11, -1, new w0(this, 16)));
                    }
                } else if (i10 == 4) {
                    o.h(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean a() {
        boolean z9;
        synchronized (this.f11506g) {
            z9 = this.f11512n == 4;
        }
        return z9;
    }

    public final void c(c cVar) {
        this.f11509j = cVar;
        B(2, (IInterface) null);
    }

    public final void d(i iVar, Set<Scope> set) {
        Set<Scope> set2 = set;
        Bundle t10 = t();
        int i10 = this.f11515q;
        String str = this.f11517s;
        int i11 = f.f10555a;
        Scope[] scopeArr = e.f11556o;
        Bundle bundle = new Bundle();
        o3.d[] dVarArr = e.f11557p;
        e eVar = r3;
        e eVar2 = new e(6, i10, i11, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, dVarArr, dVarArr, true, 0, false, str);
        e eVar3 = eVar;
        eVar3.f11561d = this.f11502c.getPackageName();
        eVar3.f11564g = t10;
        if (set2 != null) {
            eVar3.f11563f = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (l()) {
            Account q10 = q();
            if (q10 == null) {
                q10 = new Account("<<default account>>", "com.google");
            }
            eVar3.f11565h = q10;
            if (iVar != null) {
                eVar3.f11562e = iVar.asBinder();
            }
        }
        eVar3.f11566i = f11499x;
        eVar3.f11567j = r();
        if (z()) {
            eVar3.f11569m = true;
        }
        try {
            synchronized (this.f11507h) {
                j jVar = this.f11508i;
                if (jVar != null) {
                    jVar.g(new t0(this, this.w.get()), eVar3);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            r0 r0Var = this.f11505f;
            r0Var.sendMessage(r0Var.obtainMessage(6, this.w.get(), 3));
        } catch (SecurityException e11) {
            throw e11;
        } catch (RemoteException | RuntimeException e12) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e12);
            int i12 = this.w.get();
            r0 r0Var2 = this.f11505f;
            r0Var2.sendMessage(r0Var2.obtainMessage(1, i12, -1, new v0(this, 8, (IBinder) null, (Bundle) null)));
        }
    }

    public final void e(String str) {
        this.f11500a = str;
        p();
    }

    public final boolean f() {
        return true;
    }

    public int g() {
        return f.f10555a;
    }

    public final boolean h() {
        boolean z9;
        synchronized (this.f11506g) {
            int i10 = this.f11512n;
            z9 = true;
            if (i10 != 2) {
                if (i10 != 3) {
                    z9 = false;
                }
            }
        }
        return z9;
    }

    public final o3.d[] i() {
        x0 x0Var = this.f11519v;
        if (x0Var == null) {
            return null;
        }
        return x0Var.f11651b;
    }

    public final String j() {
        if (a() && this.f11501b != null) {
            return "com.google.android.gms";
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public final String k() {
        return this.f11500a;
    }

    public boolean l() {
        return false;
    }

    public final void m(v vVar) {
        vVar.f11281a.f11297m.f11224n.post(new u(vVar));
    }

    public final void n() {
        int b10 = this.f11504e.b(this.f11502c, g());
        if (b10 != 0) {
            B(1, (IInterface) null);
            this.f11509j = new d();
            r0 r0Var = this.f11505f;
            r0Var.sendMessage(r0Var.obtainMessage(3, this.w.get(), b10, (Object) null));
            return;
        }
        c(new d());
    }

    public abstract T o(IBinder iBinder);

    public final void p() {
        this.w.incrementAndGet();
        synchronized (this.f11510l) {
            try {
                int size = this.f11510l.size();
                for (int i10 = 0; i10 < size; i10++) {
                    s0 s0Var = (s0) this.f11510l.get(i10);
                    synchronized (s0Var) {
                        s0Var.f11633a = null;
                    }
                }
                this.f11510l.clear();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        synchronized (this.f11507h) {
            this.f11508i = null;
        }
        B(1, (IInterface) null);
    }

    public Account q() {
        return null;
    }

    public o3.d[] r() {
        return f11499x;
    }

    public void s() {
    }

    public Bundle t() {
        return new Bundle();
    }

    public Set<Scope> u() {
        return Collections.emptySet();
    }

    public final T v() {
        T t10;
        synchronized (this.f11506g) {
            try {
                if (this.f11512n == 5) {
                    throw new DeadObjectException();
                } else if (a()) {
                    t10 = this.k;
                    o.i(t10, "Client is connected but service is null");
                } else {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t10;
    }

    public abstract String w();

    public abstract String x();

    public boolean y() {
        return g() >= 211700000;
    }

    public boolean z() {
        return this instanceof c4.c;
    }
}
