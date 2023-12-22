package n4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import r3.o;
import s3.a;

public final class g8 extends a {
    public static final Parcelable.Creator<g8> CREATOR = new h8();

    /* renamed from: a  reason: collision with root package name */
    public final String f9768a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9769b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9770c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9771d;

    /* renamed from: e  reason: collision with root package name */
    public final long f9772e;

    /* renamed from: f  reason: collision with root package name */
    public final long f9773f;

    /* renamed from: g  reason: collision with root package name */
    public final String f9774g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f9775h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f9776i;

    /* renamed from: j  reason: collision with root package name */
    public final long f9777j;
    public final String k;
    @Deprecated

    /* renamed from: l  reason: collision with root package name */
    public final long f9778l;

    /* renamed from: m  reason: collision with root package name */
    public final long f9779m;

    /* renamed from: n  reason: collision with root package name */
    public final int f9780n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f9781o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f9782p;

    /* renamed from: q  reason: collision with root package name */
    public final String f9783q;

    /* renamed from: r  reason: collision with root package name */
    public final Boolean f9784r;

    /* renamed from: s  reason: collision with root package name */
    public final long f9785s;

    /* renamed from: t  reason: collision with root package name */
    public final List f9786t;
    public final String u;

    /* renamed from: v  reason: collision with root package name */
    public final String f9787v;
    public final String w;

    /* renamed from: x  reason: collision with root package name */
    public final String f9788x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f9789y;

    /* renamed from: z  reason: collision with root package name */
    public final long f9790z;

    public g8(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z9, boolean z10, String str6, long j13, int i10, boolean z11, boolean z12, String str7, Boolean bool, long j14, List list, String str8, String str9, String str10, boolean z13, long j15) {
        o.e(str);
        this.f9768a = str;
        this.f9769b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f9770c = str3;
        this.f9777j = j10;
        this.f9771d = str4;
        this.f9772e = j11;
        this.f9773f = j12;
        this.f9774g = str5;
        this.f9775h = z9;
        this.f9776i = z10;
        this.k = str6;
        this.f9778l = 0;
        this.f9779m = j13;
        this.f9780n = i10;
        this.f9781o = z11;
        this.f9782p = z12;
        this.f9783q = str7;
        this.f9784r = bool;
        this.f9785s = j14;
        this.f9786t = list;
        this.u = null;
        this.f9787v = str8;
        this.w = str9;
        this.f9788x = str10;
        this.f9789y = z13;
        this.f9790z = j15;
    }

    public g8(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z9, boolean z10, long j12, String str6, long j13, long j14, int i10, boolean z11, boolean z12, String str7, Boolean bool, long j15, ArrayList arrayList, String str8, String str9, String str10, String str11, boolean z13, long j16) {
        this.f9768a = str;
        this.f9769b = str2;
        this.f9770c = str3;
        this.f9777j = j12;
        this.f9771d = str4;
        this.f9772e = j10;
        this.f9773f = j11;
        this.f9774g = str5;
        this.f9775h = z9;
        this.f9776i = z10;
        this.k = str6;
        this.f9778l = j13;
        this.f9779m = j14;
        this.f9780n = i10;
        this.f9781o = z11;
        this.f9782p = z12;
        this.f9783q = str7;
        this.f9784r = bool;
        this.f9785s = j15;
        this.f9786t = arrayList;
        this.u = str8;
        this.f9787v = str9;
        this.w = str10;
        this.f9788x = str11;
        this.f9789y = z13;
        this.f9790z = j16;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.B(parcel, 2, this.f9768a);
        y3.a.B(parcel, 3, this.f9769b);
        y3.a.B(parcel, 4, this.f9770c);
        y3.a.B(parcel, 5, this.f9771d);
        y3.a.y(parcel, 6, this.f9772e);
        y3.a.y(parcel, 7, this.f9773f);
        y3.a.B(parcel, 8, this.f9774g);
        y3.a.u(parcel, 9, this.f9775h);
        y3.a.u(parcel, 10, this.f9776i);
        y3.a.y(parcel, 11, this.f9777j);
        y3.a.B(parcel, 12, this.k);
        y3.a.y(parcel, 13, this.f9778l);
        y3.a.y(parcel, 14, this.f9779m);
        y3.a.x(parcel, 15, this.f9780n);
        y3.a.u(parcel, 16, this.f9781o);
        y3.a.u(parcel, 18, this.f9782p);
        y3.a.B(parcel, 19, this.f9783q);
        Boolean bool = this.f9784r;
        if (bool != null) {
            parcel.writeInt(262165);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        y3.a.y(parcel, 22, this.f9785s);
        y3.a.C(parcel, 23, this.f9786t);
        y3.a.B(parcel, 24, this.u);
        y3.a.B(parcel, 25, this.f9787v);
        y3.a.B(parcel, 26, this.w);
        y3.a.B(parcel, 27, this.f9788x);
        y3.a.u(parcel, 28, this.f9789y);
        y3.a.y(parcel, 29, this.f9790z);
        y3.a.S(G, parcel);
    }
}
