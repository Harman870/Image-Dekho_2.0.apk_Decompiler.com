package h6;

import android.os.Parcel;
import android.os.Parcelable;
import r3.o;
import y3.a;

public final class s extends b {
    public static final Parcelable.Creator<s> CREATOR = new z();

    /* renamed from: a  reason: collision with root package name */
    public final String f6925a;

    public s(String str) {
        o.e(str);
        this.f6925a = str;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = a.G(20293, parcel);
        a.B(parcel, 1, this.f6925a);
        a.S(G, parcel);
    }
}
