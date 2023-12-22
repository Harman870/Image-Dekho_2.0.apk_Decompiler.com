package r3;

import android.os.Parcel;
import android.os.Parcelable;
import s3.a;

public final class q extends a {
    public static final Parcelable.Creator<q> CREATOR = new q0();

    /* renamed from: a  reason: collision with root package name */
    public final int f11623a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11624b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f11625c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11626d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11627e;

    public q(int i10, boolean z9, boolean z10, int i11, int i12) {
        this.f11623a = i10;
        this.f11624b = z9;
        this.f11625c = z10;
        this.f11626d = i11;
        this.f11627e = i12;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.x(parcel, 1, this.f11623a);
        y3.a.u(parcel, 2, this.f11624b);
        y3.a.u(parcel, 3, this.f11625c);
        y3.a.x(parcel, 4, this.f11626d);
        y3.a.x(parcel, 5, this.f11627e);
        y3.a.S(G, parcel);
    }
}
