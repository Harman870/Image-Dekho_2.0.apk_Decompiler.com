package n4;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class c6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d6 f9658a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f9659b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Exception f9660c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ byte[] f9661d;

    public /* synthetic */ c6(d6 d6Var, int i10, IOException iOException, byte[] bArr, Map map) {
        this.f9658a = d6Var;
        this.f9659b = i10;
        this.f9660c = iOException;
        this.f9661d = bArr;
    }

    public final void run() {
        d6 d6Var = this.f9658a;
        int i10 = this.f9659b;
        Exception exc = this.f9660c;
        byte[] bArr = this.f9661d;
        n4 n4Var = (n4) d6Var.f9699c.f12166a;
        if (!(i10 == 200 || i10 == 204)) {
            if (i10 == 304) {
                i10 = 304;
            }
            n4Var.a().f9831i.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), exc);
        }
        if (exc == null) {
            n4Var.r().f10267r.a(true);
            if (bArr == null || bArr.length == 0) {
                n4Var.a().f9834m.a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    n4Var.a().f9834m.a("Deferred Deep Link is empty.");
                    return;
                }
                d8 x9 = n4Var.x();
                n4 n4Var2 = x9.f9600a;
                if (!TextUtils.isEmpty(optString)) {
                    List<ResolveInfo> queryIntentActivities = x9.f9600a.f9986a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        n4Var.f10000p.n("auto", "_cmp", bundle);
                        d8 x10 = n4Var.x();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = x10.f9600a.f9986a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    x10.f9600a.f9986a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e10) {
                                x10.f9600a.a().f9828f.b("Failed to persist Deferred Deep Link. exception", e10);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                n4Var.a().f9831i.c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            } catch (JSONException e11) {
                n4Var.a().f9828f.b("Failed to parse the Deferred Deep Link response. exception", e11);
                return;
            }
        }
        n4Var.a().f9831i.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), exc);
    }
}
