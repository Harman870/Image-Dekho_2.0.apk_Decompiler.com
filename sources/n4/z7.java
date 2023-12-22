package n4;

import android.os.Parcel;
import android.os.Parcelable;
import r3.o;
import s3.a;

public final class z7 extends a {
    public static final Parcelable.Creator<z7> CREATOR = new a8();

    /* renamed from: a  reason: collision with root package name */
    public final int f10353a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10354b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10355c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f10356d;

    /* renamed from: e  reason: collision with root package name */
    public final String f10357e;

    /* renamed from: f  reason: collision with root package name */
    public final String f10358f;

    /* renamed from: g  reason: collision with root package name */
    public final Double f10359g;

    public z7(int i10, String str, long j10, Long l6, Float f10, String str2, String str3, Double d10) {
        this.f10353a = i10;
        this.f10354b = str;
        this.f10355c = j10;
        this.f10356d = l6;
        if (i10 == 1) {
            this.f10359g = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        } else {
            this.f10359g = d10;
        }
        this.f10357e = str2;
        this.f10358f = str3;
    }

    public z7(long j10, Object obj, String str, String str2) {
        o.e(str);
        this.f10353a = 2;
        this.f10354b = str;
        this.f10355c = j10;
        this.f10358f = str2;
        if (obj == null) {
            this.f10356d = null;
            this.f10359g = null;
            this.f10357e = null;
        } else if (obj instanceof Long) {
            this.f10356d = (Long) obj;
            this.f10359g = null;
            this.f10357e = null;
        } else if (obj instanceof String) {
            this.f10356d = null;
            this.f10359g = null;
            this.f10357e = (String) obj;
        } else if (obj instanceof Double) {
            this.f10356d = null;
            this.f10359g = (Double) obj;
            this.f10357e = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public z7(b8 b8Var) {
        this(b8Var.f9638d, b8Var.f9639e, b8Var.f9637c, b8Var.f9636b);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        a8.a(this, parcel);
    }

    public final Object x() {
        Long l6 = this.f10356d;
        if (l6 != null) {
            return l6;
        }
        Double d10 = this.f10359g;
        if (d10 != null) {
            return d10;
        }
        String str = this.f10357e;
        if (str != null) {
            return str;
        }
        return null;
    }
}
