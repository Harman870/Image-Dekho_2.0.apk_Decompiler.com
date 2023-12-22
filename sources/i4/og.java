package i4;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public final class og implements xf {

    /* renamed from: a  reason: collision with root package name */
    public String f7570a;

    /* renamed from: b  reason: collision with root package name */
    public String f7571b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7572c;

    /* renamed from: d  reason: collision with root package name */
    public long f7573d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f7574e;

    /* renamed from: f  reason: collision with root package name */
    public String f7575f;

    public final /* bridge */ /* synthetic */ xf zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("localId", (String) null);
            jSONObject.optString("email", (String) null);
            this.f7570a = jSONObject.optString("idToken", (String) null);
            this.f7571b = jSONObject.optString("refreshToken", (String) null);
            this.f7572c = jSONObject.optBoolean("isNewUser", false);
            this.f7573d = jSONObject.optLong("expiresIn", 0);
            this.f7574e = a.x(jSONObject.optJSONArray("mfaInfo"));
            this.f7575f = jSONObject.optString("mfaPendingCredential", (String) null);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw r.a(e10, "og", str);
        }
    }
}
