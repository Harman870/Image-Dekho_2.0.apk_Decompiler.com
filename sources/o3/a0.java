package o3;

import android.os.Parcel;
import android.os.Parcelable;
import javax.annotation.Nullable;
import s3.a;
import z5.c;

public final class a0 extends a {
    public static final Parcelable.Creator<a0> CREATOR = new b0();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10533a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final String f10534b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10535c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10536d;

    public a0(int i10, int i11, String str, boolean z9) {
        this.f10533a = z9;
        this.f10534b = str;
        this.f10535c = y3.a.F(i10) - 1;
        this.f10536d = c.t(i11) - 1;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.u(parcel, 1, this.f10533a);
        y3.a.B(parcel, 2, this.f10534b);
        y3.a.x(parcel, 3, this.f10535c);
        y3.a.x(parcel, 4, this.f10536d);
        y3.a.S(G, parcel);
    }
}
