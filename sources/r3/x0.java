package r3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import o3.d;
import s3.a;

public final class x0 extends a {
    public static final Parcelable.Creator<x0> CREATOR = new y0();

    /* renamed from: a  reason: collision with root package name */
    public Bundle f11650a;

    /* renamed from: b  reason: collision with root package name */
    public d[] f11651b;

    /* renamed from: c  reason: collision with root package name */
    public int f11652c;

    /* renamed from: d  reason: collision with root package name */
    public d f11653d;

    public x0() {
    }

    public x0(Bundle bundle, d[] dVarArr, int i10, d dVar) {
        this.f11650a = bundle;
        this.f11651b = dVarArr;
        this.f11652c = i10;
        this.f11653d = dVar;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.v(parcel, 1, this.f11650a);
        y3.a.D(parcel, 2, this.f11651b, i10);
        y3.a.x(parcel, 3, this.f11652c);
        y3.a.A(parcel, 4, this.f11653d, i10);
        y3.a.S(G, parcel);
    }
}
