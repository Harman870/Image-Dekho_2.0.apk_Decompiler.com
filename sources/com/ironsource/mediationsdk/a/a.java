package com.ironsource.mediationsdk.a;

import com.ironsource.mediationsdk.demandOnly.q;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import org.json.JSONObject;
import x8.f;

public interface a {

    /* renamed from: com.ironsource.mediationsdk.a.a$a  reason: collision with other inner class name */
    public static final class C0045a implements a {

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f4066a;

        public C0045a() {
            this(new JSONObject());
        }

        public C0045a(JSONObject jSONObject) {
            this.f4066a = jSONObject;
        }

        public final q a(String str) {
            f.f(str, ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_ID);
            JSONObject jSONObject = this.f4066a;
            String str2 = null;
            JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject(str) : null;
            if (optJSONObject != null) {
                str2 = optJSONObject.optString("plumbus");
            }
            return str2 != null ? new q.a(str2) : new q.b();
        }
    }

    q a(String str);
}
