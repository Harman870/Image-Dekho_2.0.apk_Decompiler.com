package i4;

import android.text.TextUtils;
import org.json.JSONObject;

public final class p implements wf {

    /* renamed from: a  reason: collision with root package name */
    public String f7576a;

    /* renamed from: b  reason: collision with root package name */
    public String f7577b;

    /* renamed from: c  reason: collision with root package name */
    public String f7578c;

    /* renamed from: d  reason: collision with root package name */
    public String f7579d;

    /* renamed from: e  reason: collision with root package name */
    public String f7580e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7581f;

    public final String zza() {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.f7579d)) {
            jSONObject.put("phoneNumber", this.f7576a);
            str2 = this.f7579d;
            str = "temporaryProof";
        } else {
            jSONObject.put("sessionInfo", this.f7577b);
            str2 = this.f7578c;
            str = "code";
        }
        jSONObject.put(str, str2);
        String str3 = this.f7580e;
        if (str3 != null) {
            jSONObject.put("idToken", str3);
        }
        if (!this.f7581f) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }
}
