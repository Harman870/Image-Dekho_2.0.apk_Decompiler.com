package i4;

import android.os.Parcel;
import android.os.Parcelable;
import h6.c;
import s3.a;

public final class me extends a {
    public static final Parcelable.Creator<me> CREATOR = new ne();

    /* renamed from: a  reason: collision with root package name */
    public final c f7494a;

    public me(c cVar) {
        this.f7494a = cVar;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.A(parcel, 1, this.f7494a, i10);
        y3.a.S(G, parcel);
    }
}
