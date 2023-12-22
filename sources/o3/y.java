package o3;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import s3.a;
import z3.a;
import z3.b;

public final class y extends a {
    public static final Parcelable.Creator<y> CREATOR = new z();

    /* renamed from: a  reason: collision with root package name */
    public final String f10587a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10588b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10589c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f10590d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f10591e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f10592f;

    public y(String str, boolean z9, boolean z10, IBinder iBinder, boolean z11, boolean z12) {
        this.f10587a = str;
        this.f10588b = z9;
        this.f10589c = z10;
        this.f10590d = (Context) b.F(a.C0177a.E(iBinder));
        this.f10591e = z11;
        this.f10592f = z12;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.B(parcel, 1, this.f10587a);
        y3.a.u(parcel, 2, this.f10588b);
        y3.a.u(parcel, 3, this.f10589c);
        y3.a.w(parcel, 4, new b(this.f10590d));
        y3.a.u(parcel, 5, this.f10591e);
        y3.a.u(parcel, 6, this.f10592f);
        y3.a.S(G, parcel);
    }
}
