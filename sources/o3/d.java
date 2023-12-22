package o3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import r3.m;
import s3.a;

public final class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new n();

    /* renamed from: a  reason: collision with root package name */
    public final String f10549a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public final int f10550b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10551c;

    public d(long j10, int i10, String str) {
        this.f10549a = str;
        this.f10550b = i10;
        this.f10551c = j10;
    }

    public d(String str) {
        this.f10549a = str;
        this.f10551c = 1;
        this.f10550b = -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f10549a;
            if (((str == null || !str.equals(dVar.f10549a)) && (this.f10549a != null || dVar.f10549a != null)) || x() != dVar.x()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10549a, Long.valueOf(x())});
    }

    public final String toString() {
        m.a aVar = new m.a(this);
        aVar.a(this.f10549a, "name");
        aVar.a(Long.valueOf(x()), "version");
        return aVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.B(parcel, 1, this.f10549a);
        y3.a.x(parcel, 2, this.f10550b);
        y3.a.y(parcel, 3, x());
        y3.a.S(G, parcel);
    }

    public final long x() {
        long j10 = this.f10551c;
        return j10 == -1 ? (long) this.f10550b : j10;
    }
}
