package r3;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import s3.b;

public final class f0 implements Parcelable.Creator<e0> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        Account account = null;
        int i10 = 0;
        int i11 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.j(readInt, parcel);
            } else if (c10 == 2) {
                account = (Account) b.b(parcel, readInt, Account.CREATOR);
            } else if (c10 == 3) {
                i11 = b.j(readInt, parcel);
            } else if (c10 != 4) {
                b.n(readInt, parcel);
            } else {
                googleSignInAccount = (GoogleSignInAccount) b.b(parcel, readInt, GoogleSignInAccount.CREATOR);
            }
        }
        b.g(o10, parcel);
        return new e0(i10, account, i11, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new e0[i10];
    }
}
