package c6;

import android.content.Context;
import android.text.TextUtils;
import androidx.appcompat.widget.l;
import java.util.Arrays;
import r3.m;
import r3.o;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f2506a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2507b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2508c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2509d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2510e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2511f;

    /* renamed from: g  reason: collision with root package name */
    public final String f2512g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        o.j("ApplicationId must be set.", !w3.i.b(str));
        this.f2507b = str;
        this.f2506a = str2;
        this.f2508c = str3;
        this.f2509d = str4;
        this.f2510e = str5;
        this.f2511f = str6;
        this.f2512g = str7;
    }

    public static i a(Context context) {
        l lVar = new l(context);
        String e10 = lVar.e("google_app_id");
        if (TextUtils.isEmpty(e10)) {
            return null;
        }
        return new i(e10, lVar.e("google_api_key"), lVar.e("firebase_database_url"), lVar.e("ga_trackingId"), lVar.e("gcm_defaultSenderId"), lVar.e("google_storage_bucket"), lVar.e("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return m.a(this.f2507b, iVar.f2507b) && m.a(this.f2506a, iVar.f2506a) && m.a(this.f2508c, iVar.f2508c) && m.a(this.f2509d, iVar.f2509d) && m.a(this.f2510e, iVar.f2510e) && m.a(this.f2511f, iVar.f2511f) && m.a(this.f2512g, iVar.f2512g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2507b, this.f2506a, this.f2508c, this.f2509d, this.f2510e, this.f2511f, this.f2512g});
    }

    public final String toString() {
        m.a aVar = new m.a(this);
        aVar.a(this.f2507b, "applicationId");
        aVar.a(this.f2506a, "apiKey");
        aVar.a(this.f2508c, "databaseUrl");
        aVar.a(this.f2510e, "gcmSenderId");
        aVar.a(this.f2511f, "storageBucket");
        aVar.a(this.f2512g, "projectId");
        return aVar.toString();
    }
}
