package z7;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.A;
import com.ironsource.sdk.controller.e;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final e f13234a;

    /* renamed from: b  reason: collision with root package name */
    public final e f13235b;

    public c(e eVar, e eVar2) {
        this.f13234a = eVar;
        this.f13235b = eVar2;
    }

    @JavascriptInterface
    public final void messageHandler(String str, String str2, String str3) {
        boolean z9;
        try {
            Logger.i("z7.c", "messageHandler(" + str + " " + str3 + ")");
            e eVar = this.f13235b;
            eVar.getClass();
            try {
                z9 = str3.equalsIgnoreCase(e.a(str + str2 + eVar.f13239b));
            } catch (Exception e10) {
                e10.printStackTrace();
                z9 = false;
            }
            if (z9) {
                this.f13234a.a(str, str2);
                return;
            }
            e eVar2 = this.f13234a;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("functionName", SDKUtils.encodeString(str));
                jSONObject.put("params", SDKUtils.encodeString(str2));
                jSONObject.put("hash", SDKUtils.encodeString(str3));
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            String jSONObject2 = jSONObject.toString();
            A.d dVar = eVar2.f5377a;
            if (dVar != null) {
                A.this.b(A.b("unauthorizedMessage", jSONObject2, (String) null, (String) null));
            }
        } catch (Exception e12) {
            e12.printStackTrace();
            Logger.i("z7.c", "messageHandler failed with exception " + e12.getMessage());
        }
    }
}
