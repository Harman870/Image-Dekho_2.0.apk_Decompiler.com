package n4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import s3.a;

public final class p extends a implements Iterable<String> {
    public static final Parcelable.Creator<p> CREATOR = new q();

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f10048a;

    public p(Bundle bundle) {
        this.f10048a = bundle;
    }

    public final Iterator iterator() {
        return new o(this);
    }

    public final String toString() {
        return this.f10048a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.v(parcel, 2, x());
        y3.a.S(G, parcel);
    }

    public final Bundle x() {
        return new Bundle(this.f10048a);
    }

    public final Double y() {
        return Double.valueOf(this.f10048a.getDouble("value"));
    }
}
