package p4;

import android.os.Parcel;
import android.os.Parcelable;
import r3.e0;
import s3.a;

public final class i extends a {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* renamed from: a  reason: collision with root package name */
    public final int f10682a;

    /* renamed from: b  reason: collision with root package name */
    public final e0 f10683b;

    public i(int i10, e0 e0Var) {
        this.f10682a = i10;
        this.f10683b = e0Var;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.x(parcel, 1, this.f10682a);
        y3.a.A(parcel, 2, this.f10683b, i10);
        y3.a.S(G, parcel);
    }
}
