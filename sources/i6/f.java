package i6;

import android.os.Parcel;
import android.os.Parcelable;
import h6.b;
import java.util.ArrayList;
import java.util.List;
import y3.a;

public final class f extends b {
    public static final Parcelable.Creator<f> CREATOR = new g();

    /* renamed from: a  reason: collision with root package name */
    public String f7893a;

    /* renamed from: b  reason: collision with root package name */
    public String f7894b;

    /* renamed from: c  reason: collision with root package name */
    public List f7895c;

    public f() {
    }

    public f(String str, String str2, ArrayList arrayList) {
        this.f7893a = str;
        this.f7894b = str2;
        this.f7895c = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = a.G(20293, parcel);
        a.B(parcel, 1, this.f7893a);
        a.B(parcel, 2, this.f7894b);
        a.E(parcel, 3, this.f7895c);
        a.S(G, parcel);
    }
}
