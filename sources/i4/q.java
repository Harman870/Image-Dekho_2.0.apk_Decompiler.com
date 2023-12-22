package i4;

import org.json.JSONException;
import org.json.JSONObject;
import w3.i;

public final class q implements xf {

    /* renamed from: a  reason: collision with root package name */
    public String f7600a;

    /* renamed from: b  reason: collision with root package name */
    public String f7601b;

    /* renamed from: c  reason: collision with root package name */
    public long f7602c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7603d;

    /* renamed from: e  reason: collision with root package name */
    public String f7604e;

    /* renamed from: f  reason: collision with root package name */
    public String f7605f;

    public final /* bridge */ /* synthetic */ xf zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f7600a = i.a(jSONObject.optString("idToken", (String) null));
            this.f7601b = i.a(jSONObject.optString("refreshToken", (String) null));
            this.f7602c = jSONObject.optLong("expiresIn", 0);
            i.a(jSONObject.optString("localId", (String) null));
            this.f7603d = jSONObject.optBoolean("isNewUser", false);
            this.f7604e = i.a(jSONObject.optString("temporaryProof", (String) null));
            this.f7605f = i.a(jSONObject.optString("phoneNumber", (String) null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw r.a(e10, "q", str);
        }
    }
}
