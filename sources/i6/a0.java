package i6;

import android.os.Parcel;
import android.os.Parcelable;
import r3.o;
import s3.c;
import y3.a;

public final class a0 implements c {
    public static final Parcelable.Creator<a0> CREATOR = new b0();

    /* renamed from: a  reason: collision with root package name */
    public final String f7874a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7875b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f7876c;

    public a0(String str, String str2, boolean z9) {
        o.e(str);
        o.e(str2);
        this.f7874a = str;
        this.f7875b = str2;
        m.c(str2);
        this.f7876c = z9;
    }

    public a0(boolean z9) {
        this.f7876c = z9;
        this.f7875b = null;
        this.f7874a = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = a.G(20293, parcel);
        a.B(parcel, 1, this.f7874a);
        a.B(parcel, 2, this.f7875b);
        a.u(parcel, 3, this.f7876c);
        a.S(G, parcel);
    }
}
