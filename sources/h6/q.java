package h6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import r3.o;
import y3.a;

public final class q extends b implements Cloneable {
    public static final Parcelable.Creator<q> CREATOR = new x();

    /* renamed from: a  reason: collision with root package name */
    public String f6914a;

    /* renamed from: b  reason: collision with root package name */
    public String f6915b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6916c;

    /* renamed from: d  reason: collision with root package name */
    public String f6917d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6918e;

    /* renamed from: f  reason: collision with root package name */
    public String f6919f;

    /* renamed from: g  reason: collision with root package name */
    public String f6920g;

    public q(String str, String str2, boolean z9, String str3, boolean z10, String str4, String str5) {
        o.a("Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, temporary proof, or enrollment ID.", (z9 && !TextUtils.isEmpty(str3) && TextUtils.isEmpty(str5)) || (z9 && TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str5)) || ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4))));
        this.f6914a = str;
        this.f6915b = str2;
        this.f6916c = z9;
        this.f6917d = str3;
        this.f6918e = z10;
        this.f6919f = str4;
        this.f6920g = str5;
    }

    public final Object clone() {
        return new q(this.f6914a, this.f6915b, this.f6916c, this.f6917d, this.f6918e, this.f6919f, this.f6920g);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = a.G(20293, parcel);
        a.B(parcel, 1, this.f6914a);
        a.B(parcel, 2, this.f6915b);
        a.u(parcel, 3, this.f6916c);
        a.B(parcel, 4, this.f6917d);
        a.u(parcel, 5, this.f6918e);
        a.B(parcel, 6, this.f6919f);
        a.B(parcel, 7, this.f6920g);
        a.S(G, parcel);
    }
}
