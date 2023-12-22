package q3;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import o4.b;
import o4.e;
import o4.f;
import p3.d;
import p4.a;
import p4.d;
import p4.i;
import p4.k;
import r3.c;
import r3.e0;
import r3.g0;
import r3.o;

public final class k0 extends d implements d.a, d.b {

    /* renamed from: h  reason: collision with root package name */
    public static final b f11243h = e.f10594a;

    /* renamed from: a  reason: collision with root package name */
    public final Context f11244a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f11245b;

    /* renamed from: c  reason: collision with root package name */
    public final b f11246c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<Scope> f11247d;

    /* renamed from: e  reason: collision with root package name */
    public final c f11248e;

    /* renamed from: f  reason: collision with root package name */
    public f f11249f;

    /* renamed from: g  reason: collision with root package name */
    public j0 f11250g;

    public k0(Context context, f4.f fVar, c cVar) {
        b bVar = f11243h;
        this.f11244a = context;
        this.f11245b = fVar;
        this.f11248e = cVar;
        this.f11247d = cVar.f11528b;
        this.f11246c = bVar;
    }

    public final void b(o3.b bVar) {
        ((z) this.f11250g).b(bVar);
    }

    public final void c(int i10) {
        ((r3.b) this.f11249f).p();
    }

    public final void d() {
        GoogleSignInAccount googleSignInAccount;
        Parcel obtain;
        Parcel obtain2;
        a aVar = (a) this.f11249f;
        aVar.getClass();
        try {
            Account account = aVar.C.f11527a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = m3.b.a(aVar.f11502c).b();
            } else {
                googleSignInAccount = null;
            }
            Integer num = aVar.E;
            o.h(num);
            e0 e0Var = new e0(2, account, num.intValue(), googleSignInAccount);
            p4.f fVar = (p4.f) aVar.v();
            i iVar = new i(1, e0Var);
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken(fVar.f6380b);
            int i10 = f4.c.f6381a;
            obtain.writeInt(1);
            iVar.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(this);
            obtain2 = Parcel.obtain();
            fVar.f6379a.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            obtain.recycle();
            obtain2.recycle();
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f11245b.post(new i0(this, 0, new k(1, new o3.b(8, (PendingIntent) null), (g0) null)));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        } catch (Throwable th) {
            obtain.recycle();
            obtain2.recycle();
            throw th;
        }
    }
}
