package i4;

import android.os.Parcel;
import android.os.Parcelable;
import h6.b0;
import java.util.ArrayList;
import java.util.List;
import s3.a;

public final class rg extends a {
    public static final Parcelable.Creator<rg> CREATOR = new sg();

    /* renamed from: a  reason: collision with root package name */
    public String f7651a;

    /* renamed from: b  reason: collision with root package name */
    public String f7652b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7653c;

    /* renamed from: d  reason: collision with root package name */
    public String f7654d;

    /* renamed from: e  reason: collision with root package name */
    public String f7655e;

    /* renamed from: f  reason: collision with root package name */
    public e f7656f;

    /* renamed from: g  reason: collision with root package name */
    public String f7657g;

    /* renamed from: h  reason: collision with root package name */
    public String f7658h;

    /* renamed from: i  reason: collision with root package name */
    public long f7659i;

    /* renamed from: j  reason: collision with root package name */
    public long f7660j;
    public boolean k;

    /* renamed from: l  reason: collision with root package name */
    public b0 f7661l;

    /* renamed from: m  reason: collision with root package name */
    public List f7662m;

    public rg() {
        this.f7656f = new e();
    }

    public rg(String str, String str2, boolean z9, String str3, String str4, e eVar, String str5, String str6, long j10, long j11, boolean z10, b0 b0Var, ArrayList arrayList) {
        e eVar2;
        this.f7651a = str;
        this.f7652b = str2;
        this.f7653c = z9;
        this.f7654d = str3;
        this.f7655e = str4;
        if (eVar == null) {
            eVar2 = new e();
        } else {
            List list = eVar.f7268a;
            e eVar3 = new e();
            if (list != null) {
                eVar3.f7268a.addAll(list);
            }
            eVar2 = eVar3;
        }
        this.f7656f = eVar2;
        this.f7657g = str5;
        this.f7658h = str6;
        this.f7659i = j10;
        this.f7660j = j11;
        this.k = z10;
        this.f7661l = b0Var;
        this.f7662m = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.B(parcel, 2, this.f7651a);
        y3.a.B(parcel, 3, this.f7652b);
        y3.a.u(parcel, 4, this.f7653c);
        y3.a.B(parcel, 5, this.f7654d);
        y3.a.B(parcel, 6, this.f7655e);
        y3.a.A(parcel, 7, this.f7656f, i10);
        y3.a.B(parcel, 8, this.f7657g);
        y3.a.B(parcel, 9, this.f7658h);
        y3.a.y(parcel, 10, this.f7659i);
        y3.a.y(parcel, 11, this.f7660j);
        y3.a.u(parcel, 12, this.k);
        y3.a.A(parcel, 13, this.f7661l, i10);
        y3.a.E(parcel, 14, this.f7662m);
        y3.a.S(G, parcel);
    }
}
