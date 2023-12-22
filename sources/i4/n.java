package i4;

import android.text.TextUtils;
import h6.b0;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import r3.o;
import w3.i;

public final class n implements xf {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7497a;

    /* renamed from: b  reason: collision with root package name */
    public String f7498b;

    /* renamed from: c  reason: collision with root package name */
    public String f7499c;

    /* renamed from: d  reason: collision with root package name */
    public long f7500d;

    /* renamed from: e  reason: collision with root package name */
    public String f7501e;

    /* renamed from: f  reason: collision with root package name */
    public String f7502f;

    /* renamed from: g  reason: collision with root package name */
    public String f7503g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f7504h;

    /* renamed from: i  reason: collision with root package name */
    public String f7505i;

    /* renamed from: j  reason: collision with root package name */
    public String f7506j;
    public String k;

    /* renamed from: l  reason: collision with root package name */
    public String f7507l;

    /* renamed from: m  reason: collision with root package name */
    public String f7508m;

    /* renamed from: n  reason: collision with root package name */
    public String f7509n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList f7510o;

    /* renamed from: p  reason: collision with root package name */
    public String f7511p;

    public final b0 a() {
        if (TextUtils.isEmpty(this.f7505i) && TextUtils.isEmpty(this.f7506j)) {
            return null;
        }
        String str = this.f7502f;
        String str2 = this.f7506j;
        String str3 = this.f7505i;
        String str4 = this.f7508m;
        String str5 = this.k;
        o.f("Must specify a non-empty providerId", str);
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            return new b0(str, str2, str3, (k) null, str4, str5, (String) null);
        }
        throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
    }

    public final /* bridge */ /* synthetic */ xf zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f7497a = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.f7498b = i.a(jSONObject.optString("idToken", (String) null));
            this.f7499c = i.a(jSONObject.optString("refreshToken", (String) null));
            this.f7500d = jSONObject.optLong("expiresIn", 0);
            i.a(jSONObject.optString("localId", (String) null));
            this.f7501e = i.a(jSONObject.optString("email", (String) null));
            i.a(jSONObject.optString("displayName", (String) null));
            i.a(jSONObject.optString("photoUrl", (String) null));
            this.f7502f = i.a(jSONObject.optString("providerId", (String) null));
            this.f7503g = i.a(jSONObject.optString("rawUserInfo", (String) null));
            this.f7504h = jSONObject.optBoolean("isNewUser", false);
            this.f7505i = jSONObject.optString("oauthAccessToken", (String) null);
            this.f7506j = jSONObject.optString("oauthIdToken", (String) null);
            this.f7507l = i.a(jSONObject.optString("errorMessage", (String) null));
            this.f7508m = i.a(jSONObject.optString("pendingToken", (String) null));
            this.f7509n = i.a(jSONObject.optString("tenantId", (String) null));
            this.f7510o = a.x(jSONObject.optJSONArray("mfaInfo"));
            this.f7511p = i.a(jSONObject.optString("mfaPendingCredential", (String) null));
            this.k = i.a(jSONObject.optString("oauthTokenSecret", (String) null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw r.a(e10, "n", str);
        }
    }
}
