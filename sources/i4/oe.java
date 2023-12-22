package i4;

import android.os.Parcel;
import android.os.Parcelable;
import h6.q;
import s3.a;

public final class oe extends a {
    public static final Parcelable.Creator<oe> CREATOR = new pe();

    /* renamed from: a  reason: collision with root package name */
    public final q f7567a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7568b;

    public oe(q qVar, String str) {
        this.f7567a = qVar;
        this.f7568b = str;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.A(parcel, 1, this.f7567a, i10);
        y3.a.B(parcel, 2, this.f7568b);
        y3.a.S(G, parcel);
    }
}
