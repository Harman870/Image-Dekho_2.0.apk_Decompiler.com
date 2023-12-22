package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import m3.t;
import r3.o;
import s3.a;

public final class SignInConfiguration extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new t();

    /* renamed from: a  reason: collision with root package name */
    public final String f2796a;

    /* renamed from: b  reason: collision with root package name */
    public final GoogleSignInOptions f2797b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        o.e(str);
        this.f2796a = str;
        this.f2797b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f2796a.equals(signInConfiguration.f2796a)) {
            GoogleSignInOptions googleSignInOptions = this.f2797b;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f2797b;
            if (googleSignInOptions != null) {
                return googleSignInOptions.equals(googleSignInOptions2);
            }
            if (googleSignInOptions2 == null) {
                return true;
            }
        }
    }

    public final int hashCode() {
        int i10;
        String str = this.f2796a;
        int i11 = 1 * 31;
        int i12 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i11 + i10;
        GoogleSignInOptions googleSignInOptions = this.f2797b;
        int i14 = i13 * 31;
        if (googleSignInOptions != null) {
            i12 = googleSignInOptions.hashCode();
        }
        return i14 + i12;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.B(parcel, 2, this.f2796a);
        y3.a.A(parcel, 5, this.f2797b, i10);
        y3.a.S(G, parcel);
    }
}
