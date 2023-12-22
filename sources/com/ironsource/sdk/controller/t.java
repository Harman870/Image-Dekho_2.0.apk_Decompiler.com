package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.ironsource.sdk.c.e;
import com.ironsource.sdk.controller.A;
import com.ironsource.sdk.e.a.a;
import com.ironsource.sdk.g.f;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

public class t {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5522a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5523b = new a();

    public t(Context context) {
        this.f5522a = context;
    }

    public final void a(String str, A.d.a aVar) {
        A.d.a aVar2 = aVar;
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("omidFunction");
        JSONObject optJSONObject = jSONObject.optJSONObject("omidParams");
        String optString2 = jSONObject.optString("success");
        String optString3 = jSONObject.optString("fail");
        f fVar = new f();
        if (optJSONObject != null) {
            String optString4 = optJSONObject.optString("adViewId", "");
            if (!TextUtils.isEmpty(optString4)) {
                fVar.a("adViewId", optString4);
            }
        }
        char c10 = 65535;
        try {
            switch (optString.hashCode()) {
                case -1655974669:
                    if (optString.equals("activate")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -984459207:
                    if (optString.equals("getOmidData")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 70701699:
                    if (optString.equals("finishSession")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1208109646:
                    if (optString.equals("impressionOccurred")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1850541012:
                    if (optString.equals("startSession")) {
                        c10 = 1;
                        break;
                    }
                    break;
            }
            if (c10 != 0) {
                if (c10 == 1) {
                    a aVar3 = this.f5523b;
                    a.C0065a a10 = a.C0065a.a(optJSONObject);
                    if (!aVar3.f5582d) {
                        throw new IllegalStateException("OMID has not been activated");
                    } else if (!TextUtils.isEmpty(a10.f5589g)) {
                        String str2 = a10.f5589g;
                        if (!aVar3.f5581c.containsKey(str2)) {
                            com.ironsource.sdk.c.f a11 = e.a().a(str2);
                            if (a11 != null) {
                                AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(a10.f5588f, a10.f5587e, a10.f5584b, a10.f5585c, a10.f5583a), AdSessionContext.createHtmlAdSessionContext(aVar3.f5580b, a11.a(), (String) null, a10.f5586d));
                                createAdSession.registerAdView(a11.a());
                                createAdSession.start();
                                aVar3.f5581c.put(str2, createAdSession);
                            } else {
                                throw new IllegalStateException("No adview found with the provided adViewId");
                            }
                        } else {
                            throw new IllegalStateException("OMID Session has already started");
                        }
                    } else {
                        throw new IllegalStateException("Missing adview id in OMID params");
                    }
                } else if (c10 == 2) {
                    a aVar4 = this.f5523b;
                    aVar4.a(optJSONObject);
                    String optString5 = optJSONObject.optString("adViewId");
                    AdSession adSession = aVar4.f5581c.get(optString5);
                    if (adSession != null) {
                        adSession.finish();
                        aVar4.f5581c.remove(optString5);
                    } else {
                        throw new IllegalStateException("OMID Session has not started");
                    }
                } else if (c10 == 3) {
                    a aVar5 = this.f5523b;
                    aVar5.a(optJSONObject);
                    AdSession adSession2 = aVar5.f5581c.get(optJSONObject.optString("adViewId"));
                    if (adSession2 != null) {
                        AdEvents createAdEvents = AdEvents.createAdEvents(adSession2);
                        if (optJSONObject.optBoolean("signalLoaded")) {
                            createAdEvents.loaded();
                        }
                        createAdEvents.impressionOccurred();
                    } else {
                        throw new IllegalStateException("OMID Session has not started");
                    }
                } else if (c10 != 4) {
                    throw new IllegalArgumentException(String.format("%s | unsupported OMID API", new Object[]{optString}));
                }
                aVar2.a(true, optString2, fVar);
            }
            a aVar6 = this.f5523b;
            Context context = this.f5522a;
            if (!aVar6.f5582d) {
                Omid.activate(context);
                aVar6.f5582d = true;
            }
            fVar = this.f5523b.a();
            aVar2.a(true, optString2, fVar);
        } catch (Exception e10) {
            fVar.a("errMsg", e10.getMessage());
            Logger.i("t", "OMIDJSAdapter " + optString + " Exception: " + e10.getMessage());
            aVar2.a(false, optString3, fVar);
        }
    }
}
