package r3;

import android.os.Parcel;
import android.os.Parcelable;
import s3.a;

public final class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new z0();

    /* renamed from: a  reason: collision with root package name */
    public final q f11546a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11547b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f11548c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f11549d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11550e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f11551f;

    public d(q qVar, boolean z9, boolean z10, int[] iArr, int i10, int[] iArr2) {
        this.f11546a = qVar;
        this.f11547b = z9;
        this.f11548c = z10;
        this.f11549d = iArr;
        this.f11550e = i10;
        this.f11551f = iArr2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.A(parcel, 1, this.f11546a, i10);
        y3.a.u(parcel, 2, this.f11547b);
        y3.a.u(parcel, 3, this.f11548c);
        int[] iArr = this.f11549d;
        if (iArr != null) {
            int G2 = y3.a.G(4, parcel);
            parcel.writeIntArray(iArr);
            y3.a.S(G2, parcel);
        }
        y3.a.x(parcel, 5, this.f11550e);
        int[] iArr2 = this.f11551f;
        if (iArr2 != null) {
            int G3 = y3.a.G(6, parcel);
            parcel.writeIntArray(iArr2);
            y3.a.S(G3, parcel);
        }
        y3.a.S(G, parcel);
    }
}
