package i4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s3.a;

public final class i extends a {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* renamed from: a  reason: collision with root package name */
    public final int f7373a;

    /* renamed from: b  reason: collision with root package name */
    public List f7374b;

    public i() {
        this.f7373a = 1;
        this.f7374b = new ArrayList();
    }

    public i(ArrayList arrayList, int i10) {
        List list;
        this.f7373a = i10;
        if (arrayList == null || arrayList.isEmpty()) {
            list = Collections.emptyList();
        } else {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList.set(i11, w3.i.a((String) arrayList.get(i11)));
            }
            list = Collections.unmodifiableList(arrayList);
        }
        this.f7374b = list;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.x(parcel, 1, this.f7373a);
        y3.a.C(parcel, 2, this.f7374b);
        y3.a.S(G, parcel);
    }
}
