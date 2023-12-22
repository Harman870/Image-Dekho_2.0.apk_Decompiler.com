package o3;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import r3.m;
import s3.a;

public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new m();

    /* renamed from: e  reason: collision with root package name */
    public static final b f10537e = new b(0);

    /* renamed from: a  reason: collision with root package name */
    public final int f10538a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10539b;

    /* renamed from: c  reason: collision with root package name */
    public final PendingIntent f10540c;

    /* renamed from: d  reason: collision with root package name */
    public final String f10541d;

    public b() {
        throw null;
    }

    public b(int i10) {
        this(1, i10, (PendingIntent) null, (String) null);
    }

    public b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f10538a = i10;
        this.f10539b = i11;
        this.f10540c = pendingIntent;
        this.f10541d = str;
    }

    public static String x(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i10 + ")";
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f10539b == bVar.f10539b && m.a(this.f10540c, bVar.f10540c) && m.a(this.f10541d, bVar.f10541d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10539b), this.f10540c, this.f10541d});
    }

    public final String toString() {
        m.a aVar = new m.a(this);
        aVar.a(x(this.f10539b), "statusCode");
        aVar.a(this.f10540c, "resolution");
        aVar.a(this.f10541d, "message");
        return aVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.x(parcel, 1, this.f10538a);
        y3.a.x(parcel, 2, this.f10539b);
        y3.a.A(parcel, 3, this.f10540c, i10);
        y3.a.B(parcel, 4, this.f10541d);
        y3.a.S(G, parcel);
    }

    public b(int i10, PendingIntent pendingIntent) {
        this(1, i10, pendingIntent, (String) null);
    }
}
