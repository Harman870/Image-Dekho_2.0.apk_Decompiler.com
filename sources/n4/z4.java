package n4;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import o3.i;
import q3.a1;
import q3.y0;
import r3.o;
import w3.j;
import y3.a;

public final class z4 extends y2 {

    /* renamed from: a  reason: collision with root package name */
    public final w7 f10346a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f10347b;

    /* renamed from: c  reason: collision with root package name */
    public String f10348c = null;

    public z4(w7 w7Var) {
        o.h(w7Var);
        this.f10346a = w7Var;
    }

    public final List A(String str, String str2, g8 g8Var) {
        d(g8Var);
        String str3 = g8Var.f9768a;
        o.h(str3);
        try {
            return (List) this.f10346a.d().m(new r4(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f10346a.a().f9828f.b("Failed to get conditional user properties", e10);
            return Collections.emptyList();
        }
    }

    public final void B(g8 g8Var) {
        d(g8Var);
        c(new i3.o(this, 2, g8Var));
    }

    public final void D(z7 z7Var, g8 g8Var) {
        o.h(z7Var);
        d(g8Var);
        c(new x4(this, z7Var, g8Var));
    }

    public final void E(String str, boolean z9) {
        boolean z10;
        if (!TextUtils.isEmpty(str)) {
            if (z9) {
                try {
                    if (this.f10347b == null) {
                        if (!"com.google.android.gms".equals(this.f10348c) && !j.a(this.f10346a.f10292l.f9986a, Binder.getCallingUid())) {
                            if (!o3.j.a(this.f10346a.f10292l.f9986a).b(Binder.getCallingUid())) {
                                z10 = false;
                                this.f10347b = Boolean.valueOf(z10);
                            }
                        }
                        z10 = true;
                        this.f10347b = Boolean.valueOf(z10);
                    }
                    if (this.f10347b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e10) {
                    this.f10346a.a().f9828f.b("Measurement Service called with invalid calling package. appId", i3.p(str));
                    throw e10;
                }
            }
            if (this.f10348c == null) {
                Context context = this.f10346a.f10292l.f9986a;
                int callingUid = Binder.getCallingUid();
                AtomicBoolean atomicBoolean = i.f10562a;
                if (j.b(context, str, callingUid)) {
                    this.f10348c = str;
                }
            }
            if (!str.equals(this.f10348c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f10346a.a().f9828f.a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    public final void c(Runnable runnable) {
        if (this.f10346a.d().q()) {
            runnable.run();
        } else {
            this.f10346a.d().o(runnable);
        }
    }

    public final void d(g8 g8Var) {
        o.h(g8Var);
        o.e(g8Var.f9768a);
        E(g8Var.f9768a, false);
        this.f10346a.P().H(g8Var.f9769b, g8Var.f9783q);
    }

    public final void f(long j10, String str, String str2, String str3) {
        c(new y4(this, str2, str3, str, j10));
    }

    public final void i(Bundle bundle, g8 g8Var) {
        d(g8Var);
        String str = g8Var.f9768a;
        o.h(str);
        c(new o4(this, str, bundle, 0));
    }

    public final void k(c cVar, g8 g8Var) {
        o.h(cVar);
        o.h(cVar.f9642c);
        d(g8Var);
        c cVar2 = new c(cVar);
        cVar2.f9640a = g8Var.f9768a;
        c(new y0(this, cVar2, g8Var, 1));
    }

    public final List n(String str, String str2, String str3, boolean z9) {
        E(str, true);
        try {
            List<b8> list = (List) this.f10346a.d().m(new q4(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (b8 b8Var : list) {
                if (z9 || !d8.T(b8Var.f9637c)) {
                    arrayList.add(new z7(b8Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f10346a.a().f9828f.c("Failed to get user properties as. appId", i3.p(str), e10);
            return Collections.emptyList();
        }
    }

    public final ArrayList p(g8 g8Var, boolean z9) {
        d(g8Var);
        String str = g8Var.f9768a;
        o.h(str);
        try {
            List<b8> list = (List) this.f10346a.d().m(new c4(1, this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (b8 b8Var : list) {
                if (z9 || !d8.T(b8Var.f9637c)) {
                    arrayList.add(new z7(b8Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f10346a.a().f9828f.c("Failed to get user properties. appId", i3.p(g8Var.f9768a), e10);
            return null;
        }
    }

    public final void q(r rVar, g8 g8Var) {
        o.h(rVar);
        d(g8Var);
        c(new a1(this, rVar, g8Var, 1));
    }

    public final void r(g8 g8Var) {
        o.e(g8Var.f9768a);
        o.h(g8Var.f9787v);
        u4 u4Var = new u4(this, 0, g8Var);
        if (this.f10346a.d().q()) {
            u4Var.run();
        } else {
            this.f10346a.d().p(u4Var);
        }
    }

    public final List s(String str, String str2, boolean z9, g8 g8Var) {
        d(g8Var);
        String str3 = g8Var.f9768a;
        o.h(str3);
        try {
            List<b8> list = (List) this.f10346a.d().m(new p4(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (b8 b8Var : list) {
                if (z9 || !d8.T(b8Var.f9637c)) {
                    arrayList.add(new z7(b8Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f10346a.a().f9828f.c("Failed to query user properties. appId", i3.p(g8Var.f9768a), e10);
            return Collections.emptyList();
        }
    }

    public final String t(g8 g8Var) {
        d(g8Var);
        w7 w7Var = this.f10346a;
        try {
            return (String) w7Var.d().m(new s7(w7Var, g8Var)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            w7Var.a().f9828f.c("Failed to get app instance id. appId", i3.p(g8Var.f9768a), e10);
            return null;
        }
    }

    public final byte[] u(r rVar, String str) {
        o.e(str);
        o.h(rVar);
        E(str, true);
        this.f10346a.a().f9834m.b("Log and bundle. event", this.f10346a.f10292l.f9997m.d(rVar.f10085a));
        ((a) this.f10346a.c()).getClass();
        long nanoTime = System.nanoTime() / 1000000;
        m4 d10 = this.f10346a.d();
        w4 w4Var = new w4(this, rVar, str);
        d10.i();
        k4 k4Var = new k4(d10, w4Var, true);
        if (Thread.currentThread() == d10.f9950c) {
            k4Var.run();
        } else {
            d10.r(k4Var);
        }
        try {
            byte[] bArr = (byte[]) k4Var.get();
            if (bArr == null) {
                this.f10346a.a().f9828f.b("Log and bundle returned null. appId", i3.p(str));
                bArr = new byte[0];
            }
            ((a) this.f10346a.c()).getClass();
            this.f10346a.a().f9834m.d("Log and bundle processed. event, size, time_ms", this.f10346a.f10292l.f9997m.d(rVar.f10085a), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e10) {
            this.f10346a.a().f9828f.d("Failed to log and bundle. appId, event, error", i3.p(str), this.f10346a.f10292l.f9997m.d(rVar.f10085a), e10);
            return null;
        }
    }

    public final void v(g8 g8Var) {
        o.e(g8Var.f9768a);
        E(g8Var.f9768a, false);
        c(new t4(this, g8Var, 0));
    }

    public final void y(g8 g8Var) {
        d(g8Var);
        c(new t4(this, g8Var, 1));
    }

    public final List zzg(String str, String str2, String str3) {
        E(str, true);
        try {
            return (List) this.f10346a.d().m(new s4(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f10346a.a().f9828f.b("Failed to get conditional user properties as", e10);
            return Collections.emptyList();
        }
    }
}
