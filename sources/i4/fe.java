package i4;

import android.os.Parcel;
import android.os.Parcelable;
import h6.q;
import s3.a;

public final class fe extends a {
    public static final Parcelable.Creator<fe> CREATOR = new ge();

    /* renamed from: a  reason: collision with root package name */
    public final String f7313a;

    /* renamed from: b  reason: collision with root package name */
    public final q f7314b;

    public fe(q qVar, String str) {
        this.f7313a = str;
        this.f7314b = qVar;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.B(parcel, 1, this.f7313a);
        y3.a.A(parcel, 2, this.f7314b, i10);
        y3.a.S(G, parcel);
    }
}
