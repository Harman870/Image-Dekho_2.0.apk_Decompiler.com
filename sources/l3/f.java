package l3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import s3.b;

public final class f implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = str;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 4) {
                str = b.c(readInt, parcel);
            } else if (c10 == 7) {
                googleSignInAccount = (GoogleSignInAccount) b.b(parcel, readInt, GoogleSignInAccount.CREATOR);
            } else if (c10 != 8) {
                b.n(readInt, parcel);
            } else {
                str2 = b.c(readInt, parcel);
            }
        }
        b.g(o10, parcel);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInAccount[i10];
    }
}
