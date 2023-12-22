package i4;

import android.os.Parcel;
import android.os.Parcelable;
import s3.a;

public final class be extends a {
    public static final Parcelable.Creator<be> CREATOR = new ce();

    /* renamed from: a  reason: collision with root package name */
    public final String f7211a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7212b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7213c;

    public be(String str, String str2, String str3) {
        this.f7211a = str;
        this.f7212b = str2;
        this.f7213c = str3;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.B(parcel, 1, this.f7211a);
        y3.a.B(parcel, 2, this.f7212b);
        y3.a.B(parcel, 3, this.f7213c);
        y3.a.S(G, parcel);
    }
}
