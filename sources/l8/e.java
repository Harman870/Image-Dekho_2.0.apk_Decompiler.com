package l8;

import android.app.Activity;
import android.preference.PreferenceManager;
import com.imgdkh.app.R;
import com.ironsource.adapters.ironsource.a;
import com.ironsource.mediationsdk.IronSource;
import java.util.concurrent.Callable;
import l2.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u2.b;

public final class e {
    public static void a(Activity activity) {
        try {
            IronSource.setUserId(PreferenceManager.getDefaultSharedPreferences(activity).getString(activity.getString(R.string.id), ""));
            IronSource.init(activity, activity.getString(R.string.iron_source_app_key), new b(3, activity), IronSource.AD_UNIT.INTERSTITIAL, IronSource.AD_UNIT.BANNER, IronSource.AD_UNIT.REWARDED_VIDEO, IronSource.AD_UNIT.OFFERWALL);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static boolean b() {
        try {
            if (!IronSource.isInterstitialReady()) {
                IronSource.loadInterstitial();
            }
            return IronSource.isInterstitialReady();
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static void c(Callable callable) {
        try {
            IronSource.setLevelPlayInterstitialListener(new b(callable));
            IronSource.showInterstitial();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void d(Activity activity) {
        try {
            g gVar = new g(activity);
            JSONArray jSONArray = new JSONArray(gVar.a(activity.getString(R.string.show_self_ads)));
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String string = jSONObject.getString("key");
                if (jSONObject.getBoolean("isActive") && gVar.a(string).equals("")) {
                    String string2 = jSONObject.getString("title");
                    String string3 = jSONObject.getString("msg");
                    String string4 = jSONObject.getString("url");
                    d dVar = new d(activity, 4);
                    dVar.s(string2);
                    dVar.o(string3);
                    dVar.p(R.drawable.app_icon);
                    a aVar = new a(gVar, string, activity, string4);
                    dVar.m("Download");
                    dVar.V = aVar;
                    a aVar2 = new a();
                    dVar.l("Later");
                    dVar.U = aVar2;
                    dVar.show();
                }
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }
}
