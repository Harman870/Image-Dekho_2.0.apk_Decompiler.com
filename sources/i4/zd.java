package i4;

import android.os.Parcel;
import android.os.Parcelable;
import s3.a;

public final class zd extends a {
    public static final Parcelable.Creator<zd> CREATOR = new ae();

    /* renamed from: a  reason: collision with root package name */
    public final String f7845a;

    public zd(String str) {
        this.f7845a = str;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.B(parcel, 1, this.f7845a);
        y3.a.S(G, parcel);
    }
}
