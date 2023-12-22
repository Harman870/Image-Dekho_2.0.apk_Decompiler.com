package i4;

import android.os.Parcel;
import android.os.Parcelable;
import s3.a;

public final class de extends a {
    public static final Parcelable.Creator<de> CREATOR = new ee();

    /* renamed from: a  reason: collision with root package name */
    public final String f7261a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7262b;

    public de(String str, k kVar) {
        this.f7261a = str;
        this.f7262b = kVar;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.B(parcel, 1, this.f7261a);
        y3.a.A(parcel, 2, this.f7262b, i10);
        y3.a.S(G, parcel);
    }
}
