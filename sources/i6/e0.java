package i6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import h6.u;
import i4.c;
import i4.rg;
import i4.yd;
import org.json.JSONException;
import org.json.JSONObject;
import r3.o;
import s3.a;

public final class e0 extends a implements u {
    public static final Parcelable.Creator<e0> CREATOR = new f0();

    /* renamed from: a  reason: collision with root package name */
    public final String f7885a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7886b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7887c;

    /* renamed from: d  reason: collision with root package name */
    public String f7888d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7889e;

    /* renamed from: f  reason: collision with root package name */
    public final String f7890f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f7891g;

    /* renamed from: h  reason: collision with root package name */
    public final String f7892h;

    public e0(c cVar) {
        o.h(cVar);
        this.f7885a = cVar.f7215a;
        String str = cVar.f7218d;
        o.e(str);
        this.f7886b = str;
        this.f7887c = cVar.f7216b;
        Uri parse = !TextUtils.isEmpty(cVar.f7217c) ? Uri.parse(cVar.f7217c) : null;
        if (parse != null) {
            this.f7888d = parse.toString();
        }
        this.f7889e = cVar.f7221g;
        this.f7890f = cVar.f7220f;
        this.f7891g = false;
        this.f7892h = cVar.f7219e;
    }

    public e0(String str, String str2, String str3, String str4, String str5, String str6, boolean z9, String str7) {
        this.f7885a = str;
        this.f7886b = str2;
        this.f7889e = str3;
        this.f7890f = str4;
        this.f7887c = str5;
        this.f7888d = str6;
        if (!TextUtils.isEmpty(str6)) {
            Uri.parse(this.f7888d);
        }
        this.f7891g = z9;
        this.f7892h = str7;
    }

    public final String q() {
        return this.f7886b;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.B(parcel, 1, this.f7885a);
        y3.a.B(parcel, 2, this.f7886b);
        y3.a.B(parcel, 3, this.f7887c);
        y3.a.B(parcel, 4, this.f7888d);
        y3.a.B(parcel, 5, this.f7889e);
        y3.a.B(parcel, 6, this.f7890f);
        y3.a.u(parcel, 7, this.f7891g);
        y3.a.B(parcel, 8, this.f7892h);
        y3.a.S(G, parcel);
    }

    public final String zzb() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(DataKeys.USER_ID, this.f7885a);
            jSONObject.putOpt("providerId", this.f7886b);
            jSONObject.putOpt("displayName", this.f7887c);
            jSONObject.putOpt("photoUrl", this.f7888d);
            jSONObject.putOpt("email", this.f7889e);
            jSONObject.putOpt("phoneNumber", this.f7890f);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f7891g));
            jSONObject.putOpt("rawUserInfo", this.f7892h);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new yd(e10);
        }
    }

    public e0(rg rgVar) {
        o.h(rgVar);
        o.e("firebase");
        String str = rgVar.f7651a;
        o.e(str);
        this.f7885a = str;
        this.f7886b = "firebase";
        this.f7889e = rgVar.f7652b;
        this.f7887c = rgVar.f7654d;
        Uri parse = !TextUtils.isEmpty(rgVar.f7655e) ? Uri.parse(rgVar.f7655e) : null;
        if (parse != null) {
            this.f7888d = parse.toString();
        }
        this.f7891g = rgVar.f7653c;
        this.f7892h = null;
        this.f7890f = rgVar.f7658h;
    }
}
