package r3;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import s3.a;

public final class e0 extends a {
    public static final Parcelable.Creator<e0> CREATOR = new f0();

    /* renamed from: a  reason: collision with root package name */
    public final int f11571a;

    /* renamed from: b  reason: collision with root package name */
    public final Account f11572b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11573c;

    /* renamed from: d  reason: collision with root package name */
    public final GoogleSignInAccount f11574d;

    public e0(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f11571a = i10;
        this.f11572b = account;
        this.f11573c = i11;
        this.f11574d = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.x(parcel, 1, this.f11571a);
        y3.a.A(parcel, 2, this.f11572b, i10);
        y3.a.x(parcel, 3, this.f11573c);
        y3.a.A(parcel, 4, this.f11574d, i10);
        y3.a.S(G, parcel);
    }
}
