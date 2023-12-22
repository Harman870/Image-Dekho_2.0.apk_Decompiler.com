package r3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import o3.b;
import r3.i;
import s3.a;

public final class g0 extends a {
    public static final Parcelable.Creator<g0> CREATOR = new h0();

    /* renamed from: a  reason: collision with root package name */
    public final int f11587a;

    /* renamed from: b  reason: collision with root package name */
    public final IBinder f11588b;

    /* renamed from: c  reason: collision with root package name */
    public final b f11589c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f11590d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11591e;

    public g0(int i10, IBinder iBinder, b bVar, boolean z9, boolean z10) {
        this.f11587a = i10;
        this.f11588b = iBinder;
        this.f11589c = bVar;
        this.f11590d = z9;
        this.f11591e = z10;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (this.f11589c.equals(g0Var.f11589c)) {
            IBinder iBinder = this.f11588b;
            Object obj4 = null;
            if (iBinder == null) {
                obj2 = null;
            } else {
                int i10 = i.a.f11596b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof i) {
                    obj2 = (i) queryLocalInterface;
                } else {
                    obj2 = new h1(iBinder);
                }
            }
            IBinder iBinder2 = g0Var.f11588b;
            if (iBinder2 != null) {
                int i11 = i.a.f11596b;
                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface2 instanceof i) {
                    obj3 = (i) queryLocalInterface2;
                } else {
                    obj3 = new h1(iBinder2);
                }
                obj4 = obj3;
            }
            if (m.a(obj2, obj4)) {
                return true;
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.x(parcel, 1, this.f11587a);
        y3.a.w(parcel, 2, this.f11588b);
        y3.a.A(parcel, 3, this.f11589c, i10);
        y3.a.u(parcel, 4, this.f11590d);
        y3.a.u(parcel, 5, this.f11591e);
        y3.a.S(G, parcel);
    }
}
