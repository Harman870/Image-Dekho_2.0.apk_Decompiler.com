package m3;

import android.os.Parcel;
import c4.a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import e4.c;

public abstract class p extends a implements q {
    public p() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 1);
    }

    public final boolean b(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) c.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) c.a(parcel, Status.CREATOR);
                c.b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                c.b(parcel);
                j((Status) c.a(parcel, Status.CREATOR));
                break;
            case 103:
                c.b(parcel);
                C((Status) c.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
