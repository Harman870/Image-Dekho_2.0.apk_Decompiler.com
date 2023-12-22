package h6;

import android.os.Parcel;
import android.os.Parcelable;
import r3.o;
import y3.a;

public final class t extends b {
    public static final Parcelable.Creator<t> CREATOR = new a0();

    /* renamed from: a  reason: collision with root package name */
    public String f6926a;

    /* renamed from: b  reason: collision with root package name */
    public String f6927b;

    public t(String str, String str2) {
        o.e(str);
        this.f6926a = str;
        o.e(str2);
        this.f6927b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = a.G(20293, parcel);
        a.B(parcel, 1, this.f6926a);
        a.B(parcel, 2, this.f6927b);
        a.S(G, parcel);
    }
}
