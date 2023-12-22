package m3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class a extends s3.a {
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    public final int f9353a;

    /* renamed from: b  reason: collision with root package name */
    public int f9354b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f9355c;

    public a(int i10, int i11, Bundle bundle) {
        this.f9353a = i10;
        this.f9354b = i11;
        this.f9355c = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.x(parcel, 1, this.f9353a);
        y3.a.x(parcel, 2, this.f9354b);
        y3.a.v(parcel, 3, this.f9355c);
        y3.a.S(G, parcel);
    }
}
