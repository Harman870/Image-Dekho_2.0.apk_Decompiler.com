package j4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import s3.a;

public final class d1 extends a {
    public static final Parcelable.Creator<d1> CREATOR = new e1();

    /* renamed from: a  reason: collision with root package name */
    public final long f8095a;

    /* renamed from: b  reason: collision with root package name */
    public final long f8096b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8097c;

    /* renamed from: d  reason: collision with root package name */
    public final String f8098d;

    /* renamed from: e  reason: collision with root package name */
    public final String f8099e;

    /* renamed from: f  reason: collision with root package name */
    public final String f8100f;

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f8101g;

    /* renamed from: h  reason: collision with root package name */
    public final String f8102h;

    public d1(long j10, long j11, boolean z9, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f8095a = j10;
        this.f8096b = j11;
        this.f8097c = z9;
        this.f8098d = str;
        this.f8099e = str2;
        this.f8100f = str3;
        this.f8101g = bundle;
        this.f8102h = str4;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.y(parcel, 1, this.f8095a);
        y3.a.y(parcel, 2, this.f8096b);
        y3.a.u(parcel, 3, this.f8097c);
        y3.a.B(parcel, 4, this.f8098d);
        y3.a.B(parcel, 5, this.f8099e);
        y3.a.B(parcel, 6, this.f8100f);
        y3.a.v(parcel, 7, this.f8101g);
        y3.a.B(parcel, 8, this.f8102h);
        y3.a.S(G, parcel);
    }
}
