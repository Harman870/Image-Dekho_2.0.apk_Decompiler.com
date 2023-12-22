package n4;

import android.os.Parcel;
import android.os.Parcelable;
import r3.o;
import s3.a;

public final class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new d();

    /* renamed from: a  reason: collision with root package name */
    public String f9640a;

    /* renamed from: b  reason: collision with root package name */
    public String f9641b;

    /* renamed from: c  reason: collision with root package name */
    public z7 f9642c;

    /* renamed from: d  reason: collision with root package name */
    public long f9643d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9644e;

    /* renamed from: f  reason: collision with root package name */
    public String f9645f;

    /* renamed from: g  reason: collision with root package name */
    public final r f9646g;

    /* renamed from: h  reason: collision with root package name */
    public long f9647h;

    /* renamed from: i  reason: collision with root package name */
    public r f9648i;

    /* renamed from: j  reason: collision with root package name */
    public final long f9649j;
    public final r k;

    public c(String str, String str2, z7 z7Var, long j10, boolean z9, String str3, r rVar, long j11, r rVar2, long j12, r rVar3) {
        this.f9640a = str;
        this.f9641b = str2;
        this.f9642c = z7Var;
        this.f9643d = j10;
        this.f9644e = z9;
        this.f9645f = str3;
        this.f9646g = rVar;
        this.f9647h = j11;
        this.f9648i = rVar2;
        this.f9649j = j12;
        this.k = rVar3;
    }

    public c(c cVar) {
        o.h(cVar);
        this.f9640a = cVar.f9640a;
        this.f9641b = cVar.f9641b;
        this.f9642c = cVar.f9642c;
        this.f9643d = cVar.f9643d;
        this.f9644e = cVar.f9644e;
        this.f9645f = cVar.f9645f;
        this.f9646g = cVar.f9646g;
        this.f9647h = cVar.f9647h;
        this.f9648i = cVar.f9648i;
        this.f9649j = cVar.f9649j;
        this.k = cVar.k;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.B(parcel, 2, this.f9640a);
        y3.a.B(parcel, 3, this.f9641b);
        y3.a.A(parcel, 4, this.f9642c, i10);
        y3.a.y(parcel, 5, this.f9643d);
        y3.a.u(parcel, 6, this.f9644e);
        y3.a.B(parcel, 7, this.f9645f);
        y3.a.A(parcel, 8, this.f9646g, i10);
        y3.a.y(parcel, 9, this.f9647h);
        y3.a.A(parcel, 10, this.f9648i, i10);
        y3.a.y(parcel, 11, this.f9649j);
        y3.a.A(parcel, 12, this.k, i10);
        y3.a.S(G, parcel);
    }
}
