package i4;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import w3.i;

public final class o implements xf {

    /* renamed from: a  reason: collision with root package name */
    public String f7537a;

    /* renamed from: b  reason: collision with root package name */
    public String f7538b;

    /* renamed from: c  reason: collision with root package name */
    public long f7539c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f7540d;

    /* renamed from: e  reason: collision with root package name */
    public String f7541e;

    public final /* bridge */ /* synthetic */ xf zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            i.a(jSONObject.optString("localId", (String) null));
            i.a(jSONObject.optString("email", (String) null));
            i.a(jSONObject.optString("displayName", (String) null));
            this.f7537a = i.a(jSONObject.optString("idToken", (String) null));
            i.a(jSONObject.optString("photoUrl", (String) null));
            this.f7538b = i.a(jSONObject.optString("refreshToken", (String) null));
            this.f7539c = jSONObject.optLong("expiresIn", 0);
            this.f7540d = a.x(jSONObject.optJSONArray("mfaInfo"));
            this.f7541e = jSONObject.optString("mfaPendingCredential", (String) null);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw r.a(e10, "o", str);
        }
    }
}
