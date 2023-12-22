package m3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import s3.b;

public final class t implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                str = b.c(readInt, parcel);
            } else if (c10 != 5) {
                b.n(readInt, parcel);
            } else {
                googleSignInOptions = (GoogleSignInOptions) b.b(parcel, readInt, GoogleSignInOptions.CREATOR);
            }
        }
        b.g(o10, parcel);
        return new SignInConfiguration(str, googleSignInOptions);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInConfiguration[i10];
    }
}
