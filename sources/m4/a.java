package m4;

import android.os.Bundle;
import android.os.SystemClock;
import i4.z7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import m.b;
import n4.a6;
import n4.d8;
import n4.g3;
import n4.g5;
import n4.g6;
import n4.h5;
import n4.n4;
import n4.q1;
import n4.r5;
import n4.t5;
import r3.o;

public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final n4 f9372a;

    /* renamed from: b  reason: collision with root package name */
    public final a6 f9373b;

    public a(n4 n4Var) {
        o.h(n4Var);
        this.f9372a = n4Var;
        this.f9373b = n4Var.t();
    }

    public final void a(String str) {
        q1 l6 = this.f9372a.l();
        this.f9372a.f9998n.getClass();
        l6.h(SystemClock.elapsedRealtime(), str);
    }

    public final String b() {
        return this.f9373b.B();
    }

    public final void c(String str, String str2, Bundle bundle) {
        this.f9372a.t().k(str, str2, bundle);
    }

    public final List d(String str, String str2) {
        a6 a6Var = this.f9373b;
        if (a6Var.f9600a.d().q()) {
            a6Var.f9600a.a().f9828f.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        a6Var.f9600a.getClass();
        if (z7.a()) {
            a6Var.f9600a.a().f9828f.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        a6Var.f9600a.d().l(atomicReference, 5000, "get conditional user properties", new r5(a6Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return d8.q(list);
        }
        a6Var.f9600a.a().f9828f.b("Timed out waiting for get conditional user properties", (Object) null);
        return new ArrayList();
    }

    public final Map e(String str, String str2, boolean z9) {
        String str3;
        g3 g3Var;
        a6 a6Var = this.f9373b;
        if (a6Var.f9600a.d().q()) {
            g3Var = a6Var.f9600a.a().f9828f;
            str3 = "Cannot get user properties from analytics worker thread";
        } else {
            a6Var.f9600a.getClass();
            if (z7.a()) {
                g3Var = a6Var.f9600a.a().f9828f;
                str3 = "Cannot get user properties from main thread";
            } else {
                AtomicReference atomicReference = new AtomicReference();
                a6Var.f9600a.d().l(atomicReference, 5000, "get user properties", new t5(a6Var, atomicReference, str, str2, z9));
                List<n4.z7> list = (List) atomicReference.get();
                if (list == null) {
                    a6Var.f9600a.a().f9828f.b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z9));
                    return Collections.emptyMap();
                }
                b bVar = new b(list.size());
                for (n4.z7 z7Var : list) {
                    Object x9 = z7Var.x();
                    if (x9 != null) {
                        bVar.put(z7Var.f10354b, x9);
                    }
                }
                return bVar;
            }
        }
        g3Var.a(str3);
        return Collections.emptyMap();
    }

    public final String f() {
        g6 g6Var = this.f9373b.f9600a.u().f9919c;
        if (g6Var != null) {
            return g6Var.f9761a;
        }
        return null;
    }

    public final void g(g5 g5Var) {
        this.f9373b.v(g5Var);
    }

    public final void h(String str) {
        q1 l6 = this.f9372a.l();
        this.f9372a.f9998n.getClass();
        l6.i(SystemClock.elapsedRealtime(), str);
    }

    public final void i(String str, String str2, Bundle bundle, long j10) {
        this.f9373b.m(str, str2, bundle, true, false, j10);
    }

    public final String j() {
        return this.f9373b.B();
    }

    public final void k(Bundle bundle) {
        a6 a6Var = this.f9373b;
        a6Var.f9600a.f9998n.getClass();
        a6Var.s(bundle, System.currentTimeMillis());
    }

    public final void l(String str, String str2, Bundle bundle) {
        a6 a6Var = this.f9373b;
        a6Var.f9600a.f9998n.getClass();
        a6Var.m(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    public final void m(h5 h5Var) {
        this.f9373b.q(h5Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map n() {
        /*
            r8 = this;
            n4.a6 r0 = r8.f9373b
            r0.h()
            n4.n4 r1 = r0.f9600a
            n4.i3 r1 = r1.a()
            n4.g3 r1 = r1.f9835n
            java.lang.String r2 = "Getting user properties (FE)"
            r1.a(r2)
            n4.n4 r1 = r0.f9600a
            n4.m4 r1 = r1.d()
            boolean r1 = r1.q()
            if (r1 != 0) goto L_0x0064
            n4.n4 r1 = r0.f9600a
            r1.getClass()
            boolean r1 = i4.z7.a()
            if (r1 == 0) goto L_0x0034
            n4.n4 r0 = r0.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.f9828f
            java.lang.String r1 = "Cannot get all user properties from main thread"
            goto L_0x006e
        L_0x0034:
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            n4.n4 r2 = r0.f9600a
            n4.m4 r2 = r2.d()
            n4.p5 r7 = new n4.p5
            r7.<init>(r0, r1)
            r4 = 5000(0x1388, double:2.4703E-320)
            java.lang.String r6 = "get user properties"
            r3 = r1
            r2.l(r3, r4, r6, r7)
            java.lang.Object r1 = r1.get()
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L_0x0075
            n4.n4 r0 = r0.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.f9828f
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r2 = "Timed out waiting for get user properties, includeInternal"
            r0.b(r2, r1)
            goto L_0x0071
        L_0x0064:
            n4.n4 r0 = r0.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.f9828f
            java.lang.String r1 = "Cannot get all user properties from analytics worker thread"
        L_0x006e:
            r0.a(r1)
        L_0x0071:
            java.util.List r1 = java.util.Collections.emptyList()
        L_0x0075:
            m.b r0 = new m.b
            int r2 = r1.size()
            r0.<init>((int) r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x0082:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x009a
            java.lang.Object r2 = r1.next()
            n4.z7 r2 = (n4.z7) r2
            java.lang.Object r3 = r2.x()
            if (r3 == 0) goto L_0x0082
            java.lang.String r2 = r2.f10354b
            r0.put(r2, r3)
            goto L_0x0082
        L_0x009a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.a.n():java.util.Map");
    }

    public final int zza(String str) {
        a6 a6Var = this.f9373b;
        a6Var.getClass();
        o.e(str);
        a6Var.f9600a.getClass();
        return 25;
    }

    public final long zzb() {
        return this.f9372a.x().j0();
    }

    public final String zzi() {
        g6 g6Var = this.f9373b.f9600a.u().f9919c;
        if (g6Var != null) {
            return g6Var.f9762b;
        }
        return null;
    }
}
