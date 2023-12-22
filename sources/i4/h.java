package i4;

import org.json.JSONException;
import org.json.JSONObject;
import w3.i;

public final class h implements xf {

    /* renamed from: a  reason: collision with root package name */
    public e f7336a;

    /* renamed from: b  reason: collision with root package name */
    public String f7337b;

    /* renamed from: c  reason: collision with root package name */
    public String f7338c;

    /* renamed from: d  reason: collision with root package name */
    public long f7339d;

    public final /* bridge */ /* synthetic */ xf zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            i.a(jSONObject.optString("email", (String) null));
            i.a(jSONObject.optString("passwordHash", (String) null));
            jSONObject.optBoolean("emailVerified", false);
            i.a(jSONObject.optString("displayName", (String) null));
            i.a(jSONObject.optString("photoUrl", (String) null));
            this.f7336a = e.x(jSONObject.optJSONArray("providerUserInfo"));
            this.f7337b = i.a(jSONObject.optString("idToken", (String) null));
            this.f7338c = i.a(jSONObject.optString("refreshToken", (String) null));
            this.f7339d = jSONObject.optLong("expiresIn", 0);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw r.a(e10, "h", str);
        }
    }
}
