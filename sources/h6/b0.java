package h6;

import android.os.Parcel;
import android.os.Parcelable;
import i4.k;
import i4.mf;
import y3.a;

public final class b0 extends p {
    public static final Parcelable.Creator<b0> CREATOR = new c0();

    /* renamed from: a  reason: collision with root package name */
    public final String f6895a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6896b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6897c;

    /* renamed from: d  reason: collision with root package name */
    public final k f6898d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6899e;

    /* renamed from: f  reason: collision with root package name */
    public final String f6900f;

    /* renamed from: g  reason: collision with root package name */
    public final String f6901g;

    public b0(String str, String str2, String str3, k kVar, String str4, String str5, String str6) {
        int i10 = mf.f7495a;
        this.f6895a = str == null ? "" : str;
        this.f6896b = str2;
        this.f6897c = str3;
        this.f6898d = kVar;
        this.f6899e = str4;
        this.f6900f = str5;
        this.f6901g = str6;
    }

    public static b0 y(k kVar) {
        if (kVar != null) {
            return new b0((String) null, (String) null, (String) null, kVar, (String) null, (String) null, (String) null);
        }
        throw new NullPointerException("Must specify a non-null webSignInCredential");
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = a.G(20293, parcel);
        a.B(parcel, 1, this.f6895a);
        a.B(parcel, 2, this.f6896b);
        a.B(parcel, 3, this.f6897c);
        a.A(parcel, 4, this.f6898d, i10);
        a.B(parcel, 5, this.f6899e);
        a.B(parcel, 6, this.f6900f);
        a.B(parcel, 7, this.f6901g);
        a.S(G, parcel);
    }

    public final b x() {
        return new b0(this.f6895a, this.f6896b, this.f6897c, this.f6898d, this.f6899e, this.f6900f, this.f6901g);
    }
}
