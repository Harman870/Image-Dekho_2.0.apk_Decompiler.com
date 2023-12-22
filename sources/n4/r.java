package n4;

import android.os.Parcel;
import android.os.Parcelable;
import r3.o;
import s3.a;

public final class r extends a {
    public static final Parcelable.Creator<r> CREATOR = new s();

    /* renamed from: a  reason: collision with root package name */
    public final String f10085a;

    /* renamed from: b  reason: collision with root package name */
    public final p f10086b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10087c;

    /* renamed from: d  reason: collision with root package name */
    public final long f10088d;

    public r(String str, p pVar, String str2, long j10) {
        this.f10085a = str;
        this.f10086b = pVar;
        this.f10087c = str2;
        this.f10088d = j10;
    }

    public r(r rVar, long j10) {
        o.h(rVar);
        this.f10085a = rVar.f10085a;
        this.f10086b = rVar.f10086b;
        this.f10087c = rVar.f10087c;
        this.f10088d = j10;
    }

    public final String toString() {
        String str = this.f10087c;
        String str2 = this.f10085a;
        String valueOf = String.valueOf(this.f10086b);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        s.a(this, parcel, i10);
    }
}
