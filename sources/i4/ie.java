package i4;

import android.os.Parcel;
import android.os.Parcelable;
import s3.a;

public final class ie extends a {
    public static final Parcelable.Creator<ie> CREATOR = new je();

    /* renamed from: a  reason: collision with root package name */
    public final k f7386a;

    public ie(k kVar) {
        this.f7386a = kVar;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.A(parcel, 1, this.f7386a, i10);
        y3.a.S(G, parcel);
    }
}
