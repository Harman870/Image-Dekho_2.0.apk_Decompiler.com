package p4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p3.h;
import s3.a;

public final class b extends a implements h {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    public final int f10677a;

    /* renamed from: b  reason: collision with root package name */
    public int f10678b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f10679c;

    public b() {
        this(2, 0, (Intent) null);
    }

    public b(int i10, int i11, Intent intent) {
        this.f10677a = i10;
        this.f10678b = i11;
        this.f10679c = intent;
    }

    public final Status getStatus() {
        return this.f10678b == 0 ? Status.f2805f : Status.f2809j;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.x(parcel, 1, this.f10677a);
        y3.a.x(parcel, 2, this.f10678b);
        y3.a.A(parcel, 3, this.f10679c, i10);
        y3.a.S(G, parcel);
    }
}
