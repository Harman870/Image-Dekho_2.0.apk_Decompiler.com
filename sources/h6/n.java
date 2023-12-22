package h6;

import android.os.Parcel;
import android.os.Parcelable;
import y3.a;

public final class n extends b {
    public static final Parcelable.Creator<n> CREATOR = new w();

    /* renamed from: a  reason: collision with root package name */
    public final String f6912a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6913b;

    public n(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        } else if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        } else if (str2 == null || str2.length() != 0) {
            this.f6912a = str;
            this.f6913b = str2;
        } else {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = a.G(20293, parcel);
        a.B(parcel, 1, this.f6912a);
        a.B(parcel, 2, this.f6913b);
        a.S(G, parcel);
    }
}
