package i4;

import android.os.Parcel;
import android.os.Parcelable;
import h6.b0;
import java.util.ArrayList;
import java.util.List;
import s3.a;

public final class te extends a {
    public static final Parcelable.Creator<te> CREATOR = new ue();

    /* renamed from: a  reason: collision with root package name */
    public final String f7690a;

    /* renamed from: b  reason: collision with root package name */
    public final List f7691b;

    /* renamed from: c  reason: collision with root package name */
    public final b0 f7692c;

    public te(String str, ArrayList arrayList, b0 b0Var) {
        this.f7690a = str;
        this.f7691b = arrayList;
        this.f7692c = b0Var;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.B(parcel, 1, this.f7690a);
        y3.a.E(parcel, 2, this.f7691b);
        y3.a.A(parcel, 3, this.f7692c, i10);
        y3.a.S(G, parcel);
    }
}
