package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.e;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import o3.b;
import p3.h;
import p3.m;
import r3.m;
import s3.a;

public final class Status extends a implements h, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new m();

    /* renamed from: f  reason: collision with root package name */
    public static final Status f2805f = new Status(0, (String) null);

    /* renamed from: g  reason: collision with root package name */
    public static final Status f2806g = new Status(14, (String) null);

    /* renamed from: h  reason: collision with root package name */
    public static final Status f2807h = new Status(8, (String) null);

    /* renamed from: i  reason: collision with root package name */
    public static final Status f2808i = new Status(15, (String) null);

    /* renamed from: j  reason: collision with root package name */
    public static final Status f2809j = new Status(16, (String) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f2810a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2811b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2812c;

    /* renamed from: d  reason: collision with root package name */
    public final PendingIntent f2813d;

    /* renamed from: e  reason: collision with root package name */
    public final b f2814e;

    static {
        new Status(-1, (String) null);
        new Status(17, (String) null);
        new Status(18, (String) null);
    }

    public Status() {
        throw null;
    }

    public Status(int i10, int i11, String str, PendingIntent pendingIntent, b bVar) {
        this.f2810a = i10;
        this.f2811b = i11;
        this.f2812c = str;
        this.f2813d = pendingIntent;
        this.f2814e = bVar;
    }

    public Status(int i10, String str) {
        this(1, i10, str, (PendingIntent) null, (b) null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f2810a == status.f2810a && this.f2811b == status.f2811b && r3.m.a(this.f2812c, status.f2812c) && r3.m.a(this.f2813d, status.f2813d) && r3.m.a(this.f2814e, status.f2814e);
    }

    public final Status getStatus() {
        return this;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2810a), Integer.valueOf(this.f2811b), this.f2812c, this.f2813d, this.f2814e});
    }

    public final String toString() {
        m.a aVar = new m.a(this);
        String str = this.f2812c;
        if (str == null) {
            int i10 = this.f2811b;
            switch (i10) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
                default:
                    str = e.a("unknown status code: ", i10);
                    break;
            }
        }
        aVar.a(str, "statusCode");
        aVar.a(this.f2813d, "resolution");
        return aVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.x(parcel, 1, this.f2811b);
        y3.a.B(parcel, 2, this.f2812c);
        y3.a.A(parcel, 3, this.f2813d, i10);
        y3.a.A(parcel, 4, this.f2814e, i10);
        y3.a.x(parcel, 1000, this.f2810a);
        y3.a.S(G, parcel);
    }

    public final boolean x() {
        return this.f2811b <= 0;
    }
}
