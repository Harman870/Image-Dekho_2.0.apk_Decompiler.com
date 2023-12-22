package h6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import r3.o;
import y3.a;

public final class c extends b {
    public static final Parcelable.Creator<c> CREATOR = new d0();

    /* renamed from: a  reason: collision with root package name */
    public String f6902a;

    /* renamed from: b  reason: collision with root package name */
    public String f6903b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6904c;

    /* renamed from: d  reason: collision with root package name */
    public String f6905d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6906e;

    public c(String str, String str2, String str3, String str4, boolean z9) {
        o.e(str);
        this.f6902a = str;
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            this.f6903b = str2;
            this.f6904c = str3;
            this.f6905d = str4;
            this.f6906e = z9;
            return;
        }
        throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = a.G(20293, parcel);
        a.B(parcel, 1, this.f6902a);
        a.B(parcel, 2, this.f6903b);
        a.B(parcel, 3, this.f6904c);
        a.B(parcel, 4, this.f6905d);
        a.u(parcel, 5, this.f6906e);
        a.S(G, parcel);
    }
}
