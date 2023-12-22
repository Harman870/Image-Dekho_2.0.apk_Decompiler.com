package i6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import s3.a;

public final class n extends a {
    public static final Parcelable.Creator<n> CREATOR = new o();

    /* renamed from: a  reason: collision with root package name */
    public final List f7917a;

    public n(ArrayList arrayList) {
        this.f7917a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.E(parcel, 1, this.f7917a);
        y3.a.S(G, parcel);
    }
}
