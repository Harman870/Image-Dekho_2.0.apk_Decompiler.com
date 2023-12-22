package com.ironsource.sdk.b;

import android.util.Log;
import android.webkit.WebView;
import com.ironsource.adapters.ironsource.a;
import org.json.JSONException;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public a f5135a;

    /* renamed from: b  reason: collision with root package name */
    public d f5136b = new d();

    /* renamed from: c  reason: collision with root package name */
    public WebView f5137c;

    /* renamed from: d  reason: collision with root package name */
    public String f5138d;

    /* renamed from: e  reason: collision with root package name */
    public String f5139e = "b";

    /* renamed from: f  reason: collision with root package name */
    public String[] f5140f = {"handleGetViewVisibility"};

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("visibilityParams", this.f5136b.a());
            jSONObject.put("configs", jSONObject2);
            jSONObject.put("adViewId", this.f5138d);
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return new JSONObject();
        }
    }

    public JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", jSONObject.getString("id"));
            jSONObject2.put("data", this.f5136b.a());
        } catch (Exception e10) {
            String str = this.f5139e;
            Log.e(str, "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject);
            e10.printStackTrace();
        }
        return jSONObject2;
    }

    public final void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adViewId", this.f5138d);
            a(str, jSONObject);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public final void a(String str, int i10, boolean z9) {
        d dVar = this.f5136b;
        boolean z10 = true;
        if (dVar.f5142a.containsKey(str)) {
            dVar.f5142a.put(str, Boolean.valueOf(i10 == 0));
        }
        dVar.f5142a.put("isShown", Boolean.valueOf(z9));
        if ((!((Boolean) dVar.f5142a.get("isWindowVisible")).booleanValue() && !((Boolean) dVar.f5142a.get("isVisible")).booleanValue()) || !((Boolean) dVar.f5142a.get("isShown")).booleanValue()) {
            z10 = false;
        }
        dVar.f5142a.put("isViewVisible", Boolean.valueOf(z10));
        if (str.equalsIgnoreCase("isVisible") && this.f5135a != null && this.f5136b != null) {
            a("containerIsVisible", a());
        }
    }

    public final void a(String str, String str2) {
        a aVar = this.f5135a;
        if (aVar != null) {
            aVar.a(str, str2, this.f5138d);
        }
    }

    public final void a(String str, String str2, String str3) {
        if (this.f5137c == null) {
            String j10 = a.j("No external adUnit attached to ISNAdView while trying to send message: ", str);
            Log.e(this.f5139e, j10);
            this.f5135a.a(str3, j10, this.f5138d);
            return;
        }
        try {
            new JSONObject(str);
        } catch (JSONException unused) {
            str = "\"" + str + "\"";
        }
        String format = String.format("window.ssa.onMessageReceived(%1$s)", new Object[]{str});
        com.ironsource.environment.thread.a.f3770a.a(new y7.a(this, "javascript:try{" + format + "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}", format));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adViewId", this.f5138d);
        a(str2, jSONObject);
    }

    public final void a(String str, JSONObject jSONObject) {
        a aVar = this.f5135a;
        if (aVar != null) {
            aVar.a(str, jSONObject);
        }
    }

    public final void b(String str) {
        JSONObject a10 = this.f5136b.a();
        a10.put("adViewId", this.f5138d);
        a(str, a10);
    }

    public boolean c(String str) {
        for (String equalsIgnoreCase : this.f5140f) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
