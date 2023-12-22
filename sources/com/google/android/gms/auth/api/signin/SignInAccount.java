package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import l3.f;
import r3.o;
import s3.a;

public class SignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new f();
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public final String f2793a;

    /* renamed from: b  reason: collision with root package name */
    public final GoogleSignInAccount f2794b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public final String f2795c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f2794b = googleSignInAccount;
        o.f("8.3 and 8.4 SDKs require non-null email", str);
        this.f2793a = str;
        o.f("8.3 and 8.4 SDKs require non-null userId", str2);
        this.f2795c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.B(parcel, 4, this.f2793a);
        y3.a.A(parcel, 7, this.f2794b, i10);
        y3.a.B(parcel, 8, this.f2795c);
        y3.a.S(G, parcel);
    }
}
