package i4;

import android.os.Parcel;
import android.os.Parcelable;
import s3.a;

public final class ke extends a {
    public static final Parcelable.Creator<ke> CREATOR = new le();

    /* renamed from: a  reason: collision with root package name */
    public final String f7456a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7457b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7458c;

    public ke(String str, String str2, String str3) {
        this.f7456a = str;
        this.f7457b = str2;
        this.f7458c = str3;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.B(parcel, 1, this.f7456a);
        y3.a.B(parcel, 2, this.f7457b);
        y3.a.B(parcel, 3, this.f7458c);
        y3.a.S(G, parcel);
    }
}
