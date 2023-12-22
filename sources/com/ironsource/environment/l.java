package com.ironsource.environment;

import android.content.Context;
import com.ironsource.environment.e.b;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C0180c;
import com.ironsource.mediationsdk.C0182e;
import com.ironsource.mediationsdk.V;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.n;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import x8.f;

public interface l {

    public static final class a implements l {
        public static /* synthetic */ String a(JSONObject jSONObject, String str) {
            String optString = jSONObject.optString(str);
            if (optString.length() == 0) {
                return null;
            }
            return optString;
        }

        public static /* synthetic */ JSONObject a(n nVar, Context context) {
            AbstractAdapter a10;
            if (nVar.f5035d) {
                b bVar = new b();
                f.f(context, "context");
                JSONObject a11 = bVar.f3738b.a(context, bVar.f3737a);
                f.e(a11, "mGlobalDataReader.getDat…s(context, mTokenKeyList)");
                return b.a(a11);
            }
            NetworkSettings networkSettings = nVar.f5033b;
            if (networkSettings == null || (a10 = C0180c.a().a(networkSettings, networkSettings.getApplicationSettings(), true, false)) == null) {
                return null;
            }
            C0182e a12 = C0182e.a();
            JSONObject playerBiddingData = a10.getPlayerBiddingData();
            JSONObject jSONObject = nVar.f5034c;
            ArrayList<String> arrayList = nVar.f5032a;
            V a13 = V.a();
            a13.a(V.c());
            a13.a(a13.b());
            JSONObject a14 = C0182e.a(a13.f4057a, (List<String>) arrayList.isEmpty() ? m.f3759a : arrayList);
            a12.a(a14, a12.b(playerBiddingData, arrayList));
            if (!arrayList.isEmpty()) {
                jSONObject = C0182e.a(jSONObject, (List<String>) arrayList);
            }
            a12.a(a14, jSONObject);
            return a14;
        }

        public final long a() {
            return System.currentTimeMillis();
        }
    }

    long a();
}
