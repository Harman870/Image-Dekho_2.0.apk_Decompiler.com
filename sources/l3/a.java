package l3;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.TaskCompletionSource;
import e9.t;
import m3.i;
import m3.m;
import o3.e;
import p3.c;
import q3.a0;
import q3.k;
import r3.d0;
import r3.o;

public final class a extends c<GoogleSignInOptions> {
    public static int k = 1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.app.Activity r7, com.google.android.gms.auth.api.signin.GoogleSignInOptions r8) {
        /*
            r6 = this;
            p3.a<com.google.android.gms.auth.api.signin.GoogleSignInOptions> r3 = k3.a.f9053a
            e9.t r0 = new e9.t
            r0.<init>()
            android.os.Looper r1 = r7.getMainLooper()
            java.lang.String r2 = "Looper must not be null."
            r3.o.i(r1, r2)
            p3.c$a r5 = new p3.c$a
            r5.<init>(r0, r1)
            r0 = r6
            r1 = r7
            r2 = r7
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.a.<init>(android.app.Activity, com.google.android.gms.auth.api.signin.GoogleSignInOptions):void");
    }

    public final void c() {
        boolean z9;
        k kVar;
        a0 a0Var = this.f10668h;
        Context context = this.f10661a;
        if (d() == 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        m.f9366a.a("Signing out", new Object[0]);
        m.b(context);
        if (z9) {
            Status status = Status.f2805f;
            o.i(status, "Result must not be null");
            k kVar2 = new k(a0Var);
            kVar2.setResult(status);
            kVar = kVar2;
        } else {
            i iVar = new i(a0Var);
            a0Var.b(iVar);
            kVar = iVar;
        }
        c.a aVar = new c.a();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        kVar.addStatusListener(new d0(kVar, taskCompletionSource, aVar));
        taskCompletionSource.getTask();
    }

    public final synchronized int d() {
        int i10;
        i10 = k;
        if (i10 == 1) {
            Context context = this.f10661a;
            e eVar = e.f10553d;
            int b10 = eVar.b(context, 12451000);
            if (b10 == 0) {
                k = 4;
                i10 = 4;
            } else if (eVar.a(context, (String) null, b10) != null || DynamiteModule.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                k = 2;
                i10 = 2;
            } else {
                k = 3;
                i10 = 3;
            }
        }
        return i10;
    }

    public a(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, k3.a.f9053a, googleSignInOptions, new c.a(new t(), Looper.getMainLooper()));
    }
}
