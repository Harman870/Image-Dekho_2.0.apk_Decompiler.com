package p4;

import android.os.Parcel;
import android.os.Parcelable;
import o3.b;
import r3.g0;
import s3.a;

public final class k extends a {
    public static final Parcelable.Creator<k> CREATOR = new l();

    /* renamed from: a  reason: collision with root package name */
    public final int f10684a;

    /* renamed from: b  reason: collision with root package name */
    public final b f10685b;

    /* renamed from: c  reason: collision with root package name */
    public final g0 f10686c;

    public k(int i10, b bVar, g0 g0Var) {
        this.f10684a = i10;
        this.f10685b = bVar;
        this.f10686c = g0Var;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.x(parcel, 1, this.f10684a);
        y3.a.A(parcel, 2, this.f10685b, i10);
        y3.a.A(parcel, 3, this.f10686c, i10);
        y3.a.S(G, parcel);
    }
}
