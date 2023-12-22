package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import org.json.JSONException;
import org.json.JSONObject;
import x8.f;

/* renamed from: com.ironsource.mediationsdk.w  reason: case insensitive filesystem */
public final class C0198w {

    /* renamed from: a  reason: collision with root package name */
    public static a f5039a = new a((byte) 0);

    /* renamed from: com.ironsource.mediationsdk.w$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b10) {
            this();
        }

        public final C0191p a(Context context) {
            JSONObject jSONObject;
            f.f(context, "context");
            try {
                jSONObject = new JSONObject(IronSourceUtils.getLastResponse(context));
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            String optString = jSONObject.optString("appKey");
            String optString2 = jSONObject.optString(DataKeys.USER_ID);
            String optString3 = jSONObject.optString("response");
            f.e(optString, "cachedAppKey");
            f.e(optString2, "cachedUserId");
            f.e(optString3, "cachedSettings");
            return new C0191p(optString, optString2, optString3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if ((r0.f4817c.length() > 0) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.ironsource.mediationsdk.utils.k a(android.content.Context r4) {
        /*
            com.ironsource.mediationsdk.w$a r0 = f5039a
            java.lang.String r1 = "context"
            x8.f.f(r4, r1)
            com.ironsource.mediationsdk.p r0 = r0.a(r4)
            java.lang.String r1 = r0.f4815a
            int r1 = r1.length()
            r2 = 1
            r3 = 0
            if (r1 <= 0) goto L_0x0017
            r1 = r2
            goto L_0x0018
        L_0x0017:
            r1 = r3
        L_0x0018:
            if (r1 == 0) goto L_0x0028
            java.lang.String r1 = r0.f4817c
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0024
            r1 = r2
            goto L_0x0025
        L_0x0024:
            r1 = r3
        L_0x0025:
            if (r1 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r2 = r3
        L_0x0029:
            r1 = 0
            if (r2 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r0 = r1
        L_0x002e:
            if (r0 == 0) goto L_0x003f
            com.ironsource.mediationsdk.utils.k r1 = new com.ironsource.mediationsdk.utils.k
            java.lang.String r2 = r0.f4815a
            java.lang.String r3 = r0.f4816b
            java.lang.String r0 = r0.f4817c
            r1.<init>(r4, r2, r3, r0)
            int r4 = com.ironsource.mediationsdk.utils.k.a.f5026b
            r1.f5021e = r4
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C0198w.a(android.content.Context):com.ironsource.mediationsdk.utils.k");
    }

    public static final boolean b(Context context) {
        a aVar = f5039a;
        f.f(context, "context");
        C0191p a10 = aVar.a(context);
        if (a10.f4815a.length() > 0) {
            if (a10.f4817c.length() > 0) {
                return true;
            }
        }
        return false;
    }
}
