package r3;

import android.os.Parcel;
import android.os.Parcelable;
import s3.a;

public final class l extends a {
    public static final Parcelable.Creator<l> CREATOR = new c0();

    /* renamed from: a  reason: collision with root package name */
    public final int f11604a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11605b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11606c;

    /* renamed from: d  reason: collision with root package name */
    public final long f11607d;

    /* renamed from: e  reason: collision with root package name */
    public final long f11608e;

    /* renamed from: f  reason: collision with root package name */
    public final String f11609f;

    /* renamed from: g  reason: collision with root package name */
    public final String f11610g;

    /* renamed from: h  reason: collision with root package name */
    public final int f11611h;

    /* renamed from: i  reason: collision with root package name */
    public final int f11612i;

    public l(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f11604a = i10;
        this.f11605b = i11;
        this.f11606c = i12;
        this.f11607d = j10;
        this.f11608e = j11;
        this.f11609f = str;
        this.f11610g = str2;
        this.f11611h = i13;
        this.f11612i = i14;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.x(parcel, 1, this.f11604a);
        y3.a.x(parcel, 2, this.f11605b);
        y3.a.x(parcel, 3, this.f11606c);
        y3.a.y(parcel, 4, this.f11607d);
        y3.a.y(parcel, 5, this.f11608e);
        y3.a.B(parcel, 6, this.f11609f);
        y3.a.B(parcel, 7, this.f11610g);
        y3.a.x(parcel, 8, this.f11611h);
        y3.a.x(parcel, 9, this.f11612i);
        y3.a.S(G, parcel);
    }
}
