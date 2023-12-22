package r3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import javax.annotation.Nullable;
import s3.a;

public final class r extends a {
    public static final Parcelable.Creator<r> CREATOR = new t();

    /* renamed from: a  reason: collision with root package name */
    public final int f11628a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public List<l> f11629b;

    public r(@Nullable List list, int i10) {
        this.f11628a = i10;
        this.f11629b = list;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.x(parcel, 1, this.f11628a);
        y3.a.E(parcel, 2, this.f11629b);
        y3.a.S(G, parcel);
    }
}
