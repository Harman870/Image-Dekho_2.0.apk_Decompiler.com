package i6;

import android.os.Parcel;
import android.os.Parcelable;
import s3.c;
import y3.a;

public final class j0 implements c {
    public static final Parcelable.Creator<j0> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    public final long f7912a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7913b;

    public j0(long j10, long j11) {
        this.f7912a = j10;
        this.f7913b = j11;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = a.G(20293, parcel);
        a.y(parcel, 1, this.f7912a);
        a.y(parcel, 2, this.f7913b);
        a.S(G, parcel);
    }
}
