package f4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p4.e;
import p4.g;
import p4.k;
import q3.i0;
import q3.k0;

public class b extends Binder implements IInterface {
    public b() {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        e eVar = (e) this;
        switch (i10) {
            case 3:
                o3.b bVar = (o3.b) c.a(parcel, o3.b.CREATOR);
                p4.b bVar2 = (p4.b) c.a(parcel, p4.b.CREATOR);
                break;
            case 4:
            case 6:
                Status status = (Status) c.a(parcel, Status.CREATOR);
                break;
            case 7:
                Status status2 = (Status) c.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) c.a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                k0 k0Var = (k0) eVar;
                k0Var.f11245b.post(new i0(k0Var, 0, (k) c.a(parcel, k.CREATOR)));
                break;
            case 9:
                g gVar = (g) c.a(parcel, g.CREATOR);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
