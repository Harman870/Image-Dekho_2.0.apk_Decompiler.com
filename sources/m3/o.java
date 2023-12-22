package m3;

import android.content.Context;
import android.os.Parcel;
import c4.a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p3.k;
import q3.a0;
import r3.d0;

public abstract class o extends a {
    public o() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 1);
    }

    public final boolean b(int i10, Parcel parcel, Parcel parcel2, int i11) {
        boolean z9;
        k kVar;
        if (i10 == 1) {
            s sVar = (s) this;
            sVar.E();
            b a10 = b.a(sVar.f9370b);
            GoogleSignInAccount b10 = a10.b();
            GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.k;
            if (b10 != null) {
                googleSignInOptions = a10.c();
            }
            Context context = sVar.f9370b;
            r3.o.h(googleSignInOptions);
            l3.a aVar = new l3.a(context, googleSignInOptions);
            if (b10 != null) {
                a0 a0Var = aVar.f10668h;
                Context context2 = aVar.f10661a;
                if (aVar.d() == 3) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                m.f9366a.a("Revoking access", new Object[0]);
                String e10 = b.a(context2).e("refreshToken");
                m.b(context2);
                if (!z9) {
                    k kVar2 = new k(a0Var);
                    a0Var.b(kVar2);
                    kVar = kVar2;
                } else if (e10 == null) {
                    u3.a aVar2 = e.f9360c;
                    Status status = new Status(4, (String) null);
                    r3.o.a("Status code must not be SUCCESS", !status.x());
                    k kVar3 = new k(status);
                    kVar3.setResult(status);
                    kVar = kVar3;
                } else {
                    e eVar = new e(e10);
                    new Thread(eVar).start();
                    kVar = eVar.f9362b;
                }
                c.a aVar3 = new c.a();
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                kVar.addStatusListener(new d0(kVar, taskCompletionSource, aVar3));
                taskCompletionSource.getTask();
            } else {
                aVar.c();
            }
        } else if (i10 != 2) {
            return false;
        } else {
            s sVar2 = (s) this;
            sVar2.E();
            n.a(sVar2.f9370b).b();
        }
        return true;
    }
}
