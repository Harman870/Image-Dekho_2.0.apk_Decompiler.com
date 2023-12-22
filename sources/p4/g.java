package p4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import p3.h;
import s3.a;

public final class g extends a implements h {
    public static final Parcelable.Creator<g> CREATOR = new h();

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f10680a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10681b;

    public g(String str, ArrayList arrayList) {
        this.f10680a = arrayList;
        this.f10681b = str;
    }

    public final Status getStatus() {
        return this.f10681b != null ? Status.f2805f : Status.f2809j;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.C(parcel, 1, this.f10680a);
        y3.a.B(parcel, 2, this.f10681b);
        y3.a.S(G, parcel);
    }
}
