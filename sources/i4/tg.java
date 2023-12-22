package i4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s3.a;

public final class tg extends a {
    public static final Parcelable.Creator<tg> CREATOR = new ug();

    /* renamed from: a  reason: collision with root package name */
    public final List f7693a;

    public tg() {
        this.f7693a = new ArrayList();
    }

    public tg(ArrayList arrayList) {
        this.f7693a = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.E(parcel, 2, this.f7693a);
        y3.a.S(G, parcel);
    }
}
