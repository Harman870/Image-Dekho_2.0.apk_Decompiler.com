package h6;

import android.os.Parcel;
import android.os.Parcelable;
import r3.o;
import y3.a;

public final class m extends b {
    public static final Parcelable.Creator<m> CREATOR = new v();

    /* renamed from: a  reason: collision with root package name */
    public String f6911a;

    public m(String str) {
        o.e(str);
        this.f6911a = str;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = a.G(20293, parcel);
        a.B(parcel, 1, this.f6911a);
        a.S(G, parcel);
    }
}
