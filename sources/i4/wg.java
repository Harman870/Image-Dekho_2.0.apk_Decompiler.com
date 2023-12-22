package i4;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import s3.a;
import w3.i;

public final class wg extends a implements xf<wg> {
    public static final Parcelable.Creator<wg> CREATOR = new xg();

    /* renamed from: f  reason: collision with root package name */
    public static final String f7775f = wg.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public String f7776a;

    /* renamed from: b  reason: collision with root package name */
    public String f7777b;

    /* renamed from: c  reason: collision with root package name */
    public Long f7778c;

    /* renamed from: d  reason: collision with root package name */
    public String f7779d;

    /* renamed from: e  reason: collision with root package name */
    public Long f7780e;

    public wg() {
        this.f7780e = Long.valueOf(System.currentTimeMillis());
    }

    public wg(String str, String str2, Long l6, String str3) {
        this(str, str2, l6, str3, Long.valueOf(System.currentTimeMillis()));
    }

    public wg(String str, String str2, Long l6, String str3, Long l10) {
        this.f7776a = str;
        this.f7777b = str2;
        this.f7778c = l6;
        this.f7779d = str3;
        this.f7780e = l10;
    }

    public static wg x(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            wg wgVar = new wg();
            wgVar.f7776a = jSONObject.optString("refresh_token", (String) null);
            wgVar.f7777b = jSONObject.optString("access_token", (String) null);
            wgVar.f7778c = Long.valueOf(jSONObject.optLong("expires_in"));
            wgVar.f7779d = jSONObject.optString("token_type", (String) null);
            wgVar.f7780e = Long.valueOf(jSONObject.optLong("issued_at"));
            return wgVar;
        } catch (JSONException e10) {
            Log.d(f7775f, "Failed to read GetTokenResponse from JSONObject");
            throw new yd(e10);
        }
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        long j10;
        int G = y3.a.G(20293, parcel);
        y3.a.B(parcel, 2, this.f7776a);
        y3.a.B(parcel, 3, this.f7777b);
        Long l6 = this.f7778c;
        if (l6 == null) {
            j10 = 0;
        } else {
            j10 = l6.longValue();
        }
        y3.a.z(parcel, 4, Long.valueOf(j10));
        y3.a.B(parcel, 5, this.f7779d);
        y3.a.z(parcel, 6, Long.valueOf(this.f7780e.longValue()));
        y3.a.S(G, parcel);
    }

    public final String y() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.f7776a);
            jSONObject.put("access_token", this.f7777b);
            jSONObject.put("expires_in", this.f7778c);
            jSONObject.put("token_type", this.f7779d);
            jSONObject.put("issued_at", this.f7780e);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d(f7775f, "Failed to convert GetTokenResponse to JSON");
            throw new yd(e10);
        }
    }

    public final boolean z() {
        return System.currentTimeMillis() + 300000 < (this.f7778c.longValue() * 1000) + this.f7780e.longValue();
    }

    public final /* bridge */ /* synthetic */ xf zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f7776a = i.a(jSONObject.optString("refresh_token"));
            this.f7777b = i.a(jSONObject.optString("access_token"));
            this.f7778c = Long.valueOf(jSONObject.optLong("expires_in", 0));
            this.f7779d = i.a(jSONObject.optString("token_type"));
            this.f7780e = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw r.a(e10, f7775f, str);
        }
    }
}
