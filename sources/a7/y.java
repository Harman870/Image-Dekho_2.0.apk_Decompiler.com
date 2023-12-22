package a7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import s3.a;

public final class y extends a {
    public static final Parcelable.Creator<y> CREATOR = new z();

    /* renamed from: a  reason: collision with root package name */
    public Bundle f209a;

    public y(Bundle bundle) {
        this.f209a = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.v(parcel, 2, this.f209a);
        y3.a.S(G, parcel);
    }
}
