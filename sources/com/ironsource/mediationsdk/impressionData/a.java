package com.ironsource.mediationsdk.impressionData;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.b;
import com.ironsource.mediationsdk.utils.h;
import com.ironsource.mediationsdk.y;
import com.ironsource.mediationsdk.z;
import com.ironsource.sdk.a.g;
import java.util.List;
import org.json.JSONObject;
import x8.f;

public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4609a = true;

    /* renamed from: b  reason: collision with root package name */
    public String f4610b = "https://outcome-arm-ext-med-ext.sonic-us.supersonicads.com/aemData";

    /* renamed from: com.ironsource.mediationsdk.impressionData.a$a  reason: collision with other inner class name */
    public static final class C0053a implements com.ironsource.mediationsdk.server.a {
        public final void a(boolean z9) {
            if (!z9) {
                IronLog.API.error("failed to send impression data");
            }
        }
    }

    public final void a(String str) {
    }

    public final void a(String str, JSONObject jSONObject) {
        f.f(str, "dataSource");
        f.f(jSONObject, "impressionData");
        if (!this.f4609a) {
            IronLog.INTERNAL.verbose("disabled from server");
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("deviceOS", "android");
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            if (applicationContext != null) {
                jSONObject2.put("deviceType", IronSourceUtils.getDeviceType(applicationContext));
                y ironSourceAdvId = IronSourceUtils.getIronSourceAdvId(applicationContext);
                if (ironSourceAdvId != null) {
                    jSONObject2.put("advId", ironSourceAdvId.f5040a);
                    jSONObject2.put("advIdType", ironSourceAdvId.f5041b);
                }
            }
            String str2 = z.a().f5055g;
            if (str2 != null) {
                jSONObject2.put("applicationKey", str2);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.putOpt("externalMediationSource", str);
            jSONObject3.putOpt("externalMediationData", jSONObject);
            jSONObject3.putOpt("clientParams", jSONObject2);
            IronLog ironLog = IronLog.API;
            ironLog.info("impressionData: " + jSONObject3);
            HttpFunctions.sendPostRequest(this.f4610b, jSONObject3.toString(), new C0053a());
        } catch (Exception e10) {
            IronLog ironLog2 = IronLog.API;
            ironLog2.error("exception " + e10.getMessage() + " sending impression data");
            e10.printStackTrace();
        }
    }

    public final void a(List<IronSource.AD_UNIT> list, boolean z9, com.ironsource.mediationsdk.model.f fVar) {
        if (fVar != null) {
            g gVar = fVar.f4726b;
            b f10 = gVar != null ? gVar.f() : null;
            f.c(f10);
            this.f4609a = f10.f4968a;
            this.f4610b = fVar.f4726b.f().f4969b;
        }
    }

    public final void c() {
    }
}
