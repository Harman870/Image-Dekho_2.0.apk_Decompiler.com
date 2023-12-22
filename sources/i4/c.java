package i4;

import android.os.Parcel;
import android.os.Parcelable;
import s3.a;

public final class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new d();

    /* renamed from: a  reason: collision with root package name */
    public String f7215a;

    /* renamed from: b  reason: collision with root package name */
    public String f7216b;

    /* renamed from: c  reason: collision with root package name */
    public String f7217c;

    /* renamed from: d  reason: collision with root package name */
    public String f7218d;

    /* renamed from: e  reason: collision with root package name */
    public String f7219e;

    /* renamed from: f  reason: collision with root package name */
    public String f7220f;

    /* renamed from: g  reason: collision with root package name */
    public String f7221g;

    public c() {
    }

    public c(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f7215a = str;
        this.f7216b = str2;
        this.f7217c = str3;
        this.f7218d = str4;
        this.f7219e = str5;
        this.f7220f = str6;
        this.f7221g = str7;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.B(parcel, 2, this.f7215a);
        y3.a.B(parcel, 3, this.f7216b);
        y3.a.B(parcel, 4, this.f7217c);
        y3.a.B(parcel, 5, this.f7218d);
        y3.a.B(parcel, 6, this.f7219e);
        y3.a.B(parcel, 7, this.f7220f);
        y3.a.B(parcel, 8, this.f7221g);
        y3.a.S(G, parcel);
    }
}
