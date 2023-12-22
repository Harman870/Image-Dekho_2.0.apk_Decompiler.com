package q3;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import f4.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import n3.k;
import o3.b;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p3.a;
import p3.a.c;
import p3.d;
import r3.b;
import r3.c;
import r3.m;
import r3.o;

public final class w<O extends a.c> implements d.a, d.b {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList f11286a = new LinkedList();
    @NotOnlyInitialized

    /* renamed from: b  reason: collision with root package name */
    public final a.e f11287b;

    /* renamed from: c  reason: collision with root package name */
    public final a<O> f11288c;

    /* renamed from: d  reason: collision with root package name */
    public final n f11289d;

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f11290e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f11291f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final int f11292g;

    /* renamed from: h  reason: collision with root package name */
    public final k0 f11293h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f11294i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f11295j = new ArrayList();
    public b k = null;

    /* renamed from: l  reason: collision with root package name */
    public int f11296l = 0;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ d f11297m;

    public w(d dVar, p3.c<O> cVar) {
        this.f11297m = dVar;
        Looper looper = dVar.f11224n.getLooper();
        c.a a10 = cVar.a();
        r3.c cVar2 = new r3.c(a10.f11535a, a10.f11536b, a10.f11537c, a10.f11538d);
        a.C0125a<?, O> aVar = cVar.f10663c.f10657a;
        o.h(aVar);
        a.e a11 = aVar.a(cVar.f10661a, looper, cVar2, cVar.f10664d, this, this);
        String str = cVar.f10662b;
        if (str != null && (a11 instanceof r3.b)) {
            ((r3.b) a11).f11517s = str;
        }
        if (str != null && (a11 instanceof h)) {
            ((h) a11).getClass();
        }
        this.f11287b = a11;
        this.f11288c = cVar.f10665e;
        this.f11289d = new n();
        this.f11292g = cVar.f10667g;
        if (a11.l()) {
            Context context = dVar.f11216e;
            f fVar = dVar.f11224n;
            c.a a12 = cVar.a();
            this.f11293h = new k0(context, fVar, new r3.c(a12.f11535a, a12.f11536b, a12.f11537c, a12.f11538d));
            return;
        }
        this.f11293h = null;
    }

    public final void a(b bVar) {
        Iterator it = this.f11290e.iterator();
        if (it.hasNext()) {
            s0 s0Var = (s0) it.next();
            if (m.a(bVar, b.f10537e)) {
                this.f11287b.j();
            }
            s0Var.getClass();
            throw null;
        }
        this.f11290e.clear();
    }

    public final void b(b bVar) {
        q(bVar, (RuntimeException) null);
    }

    public final void c(int i10) {
        if (Looper.myLooper() == this.f11297m.f11224n.getLooper()) {
            i(i10);
        } else {
            this.f11297m.f11224n.post(new t(this, i10));
        }
    }

    public final void d() {
        if (Looper.myLooper() == this.f11297m.f11224n.getLooper()) {
            h();
        } else {
            this.f11297m.f11224n.post(new k(1, this));
        }
    }

    public final void e(Status status) {
        o.c(this.f11297m.f11224n);
        f(status, (RuntimeException) null, false);
    }

    public final void f(Status status, RuntimeException runtimeException, boolean z9) {
        boolean z10;
        o.c(this.f11297m.f11224n);
        boolean z11 = false;
        if (status != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (runtimeException == null) {
            z11 = true;
        }
        if (z10 != z11) {
            Iterator it = this.f11286a.iterator();
            while (it.hasNext()) {
                r0 r0Var = (r0) it.next();
                if (!z9 || r0Var.f11272a == 2) {
                    if (status != null) {
                        r0Var.a(status);
                    } else {
                        r0Var.b(runtimeException);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    public final void g() {
        ArrayList arrayList = new ArrayList(this.f11286a);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            r0 r0Var = (r0) arrayList.get(i10);
            if (this.f11287b.a()) {
                if (l(r0Var)) {
                    this.f11286a.remove(r0Var);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void h() {
        o.c(this.f11297m.f11224n);
        this.k = null;
        a(b.f10537e);
        k();
        Iterator it = this.f11291f.values().iterator();
        if (!it.hasNext()) {
            g();
            j();
            return;
        }
        ((g0) it.next()).getClass();
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x008a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(int r7) {
        /*
            r6 = this;
            q3.d r0 = r6.f11297m
            f4.f r0 = r0.f11224n
            r3.o.c(r0)
            r0 = 0
            r6.k = r0
            r1 = 1
            r6.f11294i = r1
            q3.n r2 = r6.f11289d
            p3.a$e r3 = r6.f11287b
            java.lang.String r3 = r3.k()
            r2.getClass()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "The connection to Google Play services was lost"
            r4.<init>(r5)
            if (r7 != r1) goto L_0x0024
            java.lang.String r7 = " due to service disconnection."
            goto L_0x0029
        L_0x0024:
            r5 = 3
            if (r7 != r5) goto L_0x002c
            java.lang.String r7 = " due to dead object exception."
        L_0x0029:
            r4.append(r7)
        L_0x002c:
            if (r3 == 0) goto L_0x0036
            java.lang.String r7 = " Last reason for disconnect: "
            r4.append(r7)
            r4.append(r3)
        L_0x0036:
            com.google.android.gms.common.api.Status r7 = new com.google.android.gms.common.api.Status
            r3 = 20
            java.lang.String r4 = r4.toString()
            r7.<init>(r3, r4)
            r2.a(r1, r7)
            q3.d r7 = r6.f11297m
            f4.f r7 = r7.f11224n
            r1 = 9
            q3.a<O> r2 = r6.f11288c
            android.os.Message r1 = android.os.Message.obtain(r7, r1, r2)
            q3.d r2 = r6.f11297m
            r2.getClass()
            r2 = 5000(0x1388, double:2.4703E-320)
            r7.sendMessageDelayed(r1, r2)
            q3.d r7 = r6.f11297m
            f4.f r7 = r7.f11224n
            r1 = 11
            q3.a<O> r2 = r6.f11288c
            android.os.Message r1 = android.os.Message.obtain(r7, r1, r2)
            q3.d r2 = r6.f11297m
            r2.getClass()
            r2 = 120000(0x1d4c0, double:5.9288E-319)
            r7.sendMessageDelayed(r1, r2)
            q3.d r7 = r6.f11297m
            r3.b0 r7 = r7.f11218g
            android.util.SparseIntArray r7 = r7.f11521a
            r7.clear()
            java.util.HashMap r7 = r6.f11291f
            java.util.Collection r7 = r7.values()
            java.util.Iterator r7 = r7.iterator()
            boolean r1 = r7.hasNext()
            if (r1 != 0) goto L_0x008b
            return
        L_0x008b:
            java.lang.Object r7 = r7.next()
            q3.g0 r7 = (q3.g0) r7
            r7.getClass()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.w.i(int):void");
    }

    public final void j() {
        this.f11297m.f11224n.removeMessages(12, this.f11288c);
        f fVar = this.f11297m.f11224n;
        fVar.sendMessageDelayed(fVar.obtainMessage(12, this.f11288c), this.f11297m.f11212a);
    }

    public final void k() {
        if (this.f11294i) {
            this.f11297m.f11224n.removeMessages(11, this.f11288c);
            this.f11297m.f11224n.removeMessages(9, this.f11288c);
            this.f11294i = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l(q3.r0 r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof q3.c0
            java.lang.String r1 = "DeadObjectException thrown while running ApiCallRunner."
            r2 = 1
            if (r0 != 0) goto L_0x001f
            q3.n r0 = r14.f11289d
            p3.a$e r3 = r14.f11287b
            boolean r3 = r3.l()
            r15.d(r0, r3)
            r15.c(r14)     // Catch:{ DeadObjectException -> 0x0016 }
            goto L_0x001e
        L_0x0016:
            r14.c(r2)
            p3.a$e r15 = r14.f11287b
            r15.e(r1)
        L_0x001e:
            return r2
        L_0x001f:
            r0 = r15
            q3.c0 r0 = (q3.c0) r0
            o3.d[] r3 = r0.g(r14)
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x0073
            int r6 = r3.length
            if (r6 != 0) goto L_0x002e
            goto L_0x0073
        L_0x002e:
            p3.a$e r6 = r14.f11287b
            o3.d[] r6 = r6.i()
            if (r6 != 0) goto L_0x0038
            o3.d[] r6 = new o3.d[r4]
        L_0x0038:
            int r7 = r6.length
            m.b r8 = new m.b
            r8.<init>((int) r7)
            r9 = r4
        L_0x003f:
            if (r9 >= r7) goto L_0x0053
            r10 = r6[r9]
            java.lang.String r11 = r10.f10549a
            long r12 = r10.x()
            java.lang.Long r10 = java.lang.Long.valueOf(r12)
            r8.put(r11, r10)
            int r9 = r9 + 1
            goto L_0x003f
        L_0x0053:
            int r6 = r3.length
            r7 = r4
        L_0x0055:
            if (r7 >= r6) goto L_0x0073
            r9 = r3[r7]
            java.lang.String r10 = r9.f10549a
            java.lang.Object r10 = r8.getOrDefault(r10, r5)
            java.lang.Long r10 = (java.lang.Long) r10
            if (r10 == 0) goto L_0x0074
            long r10 = r10.longValue()
            long r12 = r9.x()
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L_0x0070
            goto L_0x0074
        L_0x0070:
            int r7 = r7 + 1
            goto L_0x0055
        L_0x0073:
            r9 = r5
        L_0x0074:
            if (r9 != 0) goto L_0x008e
            q3.n r0 = r14.f11289d
            p3.a$e r3 = r14.f11287b
            boolean r3 = r3.l()
            r15.d(r0, r3)
            r15.c(r14)     // Catch:{ DeadObjectException -> 0x0085 }
            goto L_0x008d
        L_0x0085:
            r14.c(r2)
            p3.a$e r15 = r14.f11287b
            r15.e(r1)
        L_0x008d:
            return r2
        L_0x008e:
            p3.a$e r15 = r14.f11287b
            java.lang.Class r15 = r15.getClass()
            java.lang.String r15 = r15.getName()
            java.lang.String r1 = r9.f10549a
            long r6 = r9.x()
            int r3 = r15.length()
            java.lang.String r8 = java.lang.String.valueOf(r1)
            int r8 = r8.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r3 = r3 + 77
            int r3 = r3 + r8
            r10.<init>(r3)
            r10.append(r15)
            java.lang.String r15 = " could not execute call because it requires feature ("
            r10.append(r15)
            r10.append(r1)
            java.lang.String r15 = ", "
            r10.append(r15)
            r10.append(r6)
            java.lang.String r15 = ")."
            r10.append(r15)
            java.lang.String r15 = r10.toString()
            java.lang.String r1 = "GoogleApiManager"
            android.util.Log.w(r1, r15)
            q3.d r15 = r14.f11297m
            boolean r15 = r15.f11225o
            if (r15 == 0) goto L_0x0150
            boolean r15 = r0.f(r14)
            if (r15 == 0) goto L_0x0150
            q3.x r15 = new q3.x
            q3.a<O> r0 = r14.f11288c
            r15.<init>(r0, r9)
            java.util.ArrayList r0 = r14.f11295j
            int r0 = r0.indexOf(r15)
            r1 = 5000(0x1388, double:2.4703E-320)
            r3 = 15
            if (r0 < 0) goto L_0x0112
            java.util.ArrayList r15 = r14.f11295j
            java.lang.Object r15 = r15.get(r0)
            q3.x r15 = (q3.x) r15
            q3.d r0 = r14.f11297m
            f4.f r0 = r0.f11224n
            r0.removeMessages(r3, r15)
            q3.d r0 = r14.f11297m
            f4.f r0 = r0.f11224n
            android.os.Message r15 = android.os.Message.obtain(r0, r3, r15)
            q3.d r3 = r14.f11297m
            r3.getClass()
            r0.sendMessageDelayed(r15, r1)
            goto L_0x014f
        L_0x0112:
            java.util.ArrayList r0 = r14.f11295j
            r0.add(r15)
            q3.d r0 = r14.f11297m
            f4.f r0 = r0.f11224n
            android.os.Message r3 = android.os.Message.obtain(r0, r3, r15)
            q3.d r6 = r14.f11297m
            r6.getClass()
            r0.sendMessageDelayed(r3, r1)
            q3.d r0 = r14.f11297m
            f4.f r0 = r0.f11224n
            r1 = 16
            android.os.Message r15 = android.os.Message.obtain(r0, r1, r15)
            q3.d r1 = r14.f11297m
            r1.getClass()
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            r0.sendMessageDelayed(r15, r1)
            o3.b r15 = new o3.b
            r0 = 2
            r15.<init>(r0, r5)
            boolean r0 = r14.m(r15)
            if (r0 != 0) goto L_0x014f
            q3.d r0 = r14.f11297m
            int r1 = r14.f11292g
            r0.c(r15, r1)
        L_0x014f:
            return r4
        L_0x0150:
            p3.j r15 = new p3.j
            r15.<init>(r9)
            r0.b(r15)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.w.l(q3.r0):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(o3.b r7) {
        /*
            r6 = this;
            java.lang.Object r0 = q3.d.f11210r
            monitor-enter(r0)
            q3.d r1 = r6.f11297m     // Catch:{ all -> 0x0041 }
            q3.o r2 = r1.k     // Catch:{ all -> 0x0041 }
            r3 = 0
            if (r2 == 0) goto L_0x0045
            m.d r1 = r1.f11222l     // Catch:{ all -> 0x0041 }
            q3.a<O> r2 = r6.f11288c     // Catch:{ all -> 0x0041 }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x0045
            q3.d r1 = r6.f11297m     // Catch:{ all -> 0x0041 }
            q3.o r1 = r1.k     // Catch:{ all -> 0x0041 }
            int r2 = r6.f11292g     // Catch:{ all -> 0x0041 }
            r1.getClass()     // Catch:{ all -> 0x0041 }
            q3.t0 r4 = new q3.t0     // Catch:{ all -> 0x0041 }
            r4.<init>(r7, r2)     // Catch:{ all -> 0x0041 }
            java.util.concurrent.atomic.AtomicReference<q3.t0> r7 = r1.f11283b     // Catch:{ all -> 0x0041 }
        L_0x0024:
            r2 = 0
            boolean r2 = r7.compareAndSet(r2, r4)     // Catch:{ all -> 0x0041 }
            r5 = 1
            if (r2 == 0) goto L_0x002e
            r3 = r5
            goto L_0x0034
        L_0x002e:
            java.lang.Object r2 = r7.get()     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0024
        L_0x0034:
            if (r3 == 0) goto L_0x0043
            f4.f r7 = r1.f11284c     // Catch:{ all -> 0x0041 }
            q3.u0 r2 = new q3.u0     // Catch:{ all -> 0x0041 }
            r2.<init>(r1, r4)     // Catch:{ all -> 0x0041 }
            r7.post(r2)     // Catch:{ all -> 0x0041 }
            goto L_0x0043
        L_0x0041:
            r7 = move-exception
            goto L_0x0047
        L_0x0043:
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            return r5
        L_0x0045:
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            return r3
        L_0x0047:
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.w.m(o3.b):boolean");
    }

    public final boolean n(boolean z9) {
        boolean z10;
        o.c(this.f11297m.f11224n);
        if (!this.f11287b.a() || this.f11291f.size() != 0) {
            return false;
        }
        n nVar = this.f11289d;
        if (!nVar.f11262a.isEmpty() || !nVar.f11263b.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (z9) {
                j();
            }
            return false;
        }
        this.f11287b.e("Timing out service connection.");
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [p3.a$e, o4.f] */
    public final void o() {
        b bVar;
        o.c(this.f11297m.f11224n);
        if (!this.f11287b.a() && !this.f11287b.h()) {
            try {
                d dVar = this.f11297m;
                int a10 = dVar.f11218g.a(dVar.f11216e, this.f11287b);
                if (a10 != 0) {
                    b bVar2 = new b(a10, (PendingIntent) null);
                    String name = this.f11287b.getClass().getName();
                    String bVar3 = bVar2.toString();
                    StringBuilder sb = new StringBuilder(name.length() + 35 + bVar3.length());
                    sb.append("The service for ");
                    sb.append(name);
                    sb.append(" is not available: ");
                    sb.append(bVar3);
                    Log.w("GoogleApiManager", sb.toString());
                    q(bVar2, (RuntimeException) null);
                    return;
                }
                d dVar2 = this.f11297m;
                a.e eVar = this.f11287b;
                z zVar = new z(dVar2, eVar, this.f11288c);
                if (eVar.l()) {
                    k0 k0Var = this.f11293h;
                    o.h(k0Var);
                    o4.f fVar = k0Var.f11249f;
                    if (fVar != null) {
                        ((r3.b) fVar).p();
                    }
                    k0Var.f11248e.f11534h = Integer.valueOf(System.identityHashCode(k0Var));
                    o4.b bVar4 = k0Var.f11246c;
                    Context context = k0Var.f11244a;
                    Looper looper = k0Var.f11245b.getLooper();
                    r3.c cVar = k0Var.f11248e;
                    k0Var.f11249f = bVar4.a(context, looper, cVar, cVar.f11533g, k0Var, k0Var);
                    k0Var.f11250g = zVar;
                    Set<Scope> set = k0Var.f11247d;
                    if (set == null || set.isEmpty()) {
                        k0Var.f11245b.post(new h0(k0Var));
                    } else {
                        p4.a aVar = (p4.a) k0Var.f11249f;
                        aVar.getClass();
                        aVar.c(new b.d());
                    }
                }
                try {
                    this.f11287b.c(zVar);
                } catch (SecurityException e10) {
                    e = e10;
                    bVar = new o3.b(10);
                    q(bVar, e);
                }
            } catch (IllegalStateException e11) {
                e = e11;
                bVar = new o3.b(10);
                q(bVar, e);
            }
        }
    }

    public final void p(r0 r0Var) {
        boolean z9;
        o.c(this.f11297m.f11224n);
        if (!this.f11287b.a()) {
            this.f11286a.add(r0Var);
            o3.b bVar = this.k;
            if (bVar != null) {
                if (bVar.f10539b == 0 || bVar.f10540c == null) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z9) {
                    q(bVar, (RuntimeException) null);
                    return;
                }
            }
            o();
        } else if (l(r0Var)) {
            j();
        } else {
            this.f11286a.add(r0Var);
        }
    }

    public final void q(o3.b bVar, RuntimeException runtimeException) {
        o4.f fVar;
        o.c(this.f11297m.f11224n);
        k0 k0Var = this.f11293h;
        if (!(k0Var == null || (fVar = k0Var.f11249f) == null)) {
            ((r3.b) fVar).p();
        }
        o.c(this.f11297m.f11224n);
        this.k = null;
        this.f11297m.f11218g.f11521a.clear();
        a(bVar);
        if ((this.f11287b instanceof t3.d) && bVar.f10539b != 24) {
            d dVar = this.f11297m;
            dVar.f11213b = true;
            f fVar2 = dVar.f11224n;
            fVar2.sendMessageDelayed(fVar2.obtainMessage(19), 300000);
        }
        if (bVar.f10539b == 4) {
            e(d.f11209q);
        } else if (this.f11286a.isEmpty()) {
            this.k = bVar;
        } else if (runtimeException != null) {
            o.c(this.f11297m.f11224n);
            f((Status) null, runtimeException, false);
        } else if (this.f11297m.f11225o) {
            f(d.d(this.f11288c, bVar), (RuntimeException) null, true);
            if (!this.f11286a.isEmpty() && !m(bVar) && !this.f11297m.c(bVar, this.f11292g)) {
                if (bVar.f10539b == 18) {
                    this.f11294i = true;
                }
                if (this.f11294i) {
                    f fVar3 = this.f11297m.f11224n;
                    Message obtain = Message.obtain(fVar3, 9, this.f11288c);
                    this.f11297m.getClass();
                    fVar3.sendMessageDelayed(obtain, 5000);
                    return;
                }
                e(d.d(this.f11288c, bVar));
            }
        } else {
            e(d.d(this.f11288c, bVar));
        }
    }

    public final void r() {
        o.c(this.f11297m.f11224n);
        Status status = d.f11208p;
        e(status);
        n nVar = this.f11289d;
        nVar.getClass();
        nVar.a(false, status);
        for (g q0Var : (g[]) this.f11291f.keySet().toArray(new g[0])) {
            p(new q0(q0Var, new TaskCompletionSource()));
        }
        a(new o3.b(4));
        if (this.f11287b.a()) {
            this.f11287b.m(new v(this));
        }
    }
}
