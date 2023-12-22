package com.ironsource.sdk.e.a;

import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.CreativeType;
import com.iab.omid.library.ironsrc.adsession.ImpressionType;
import com.iab.omid.library.ironsrc.adsession.Owner;
import com.iab.omid.library.ironsrc.adsession.Partner;
import com.ironsource.sdk.g.f;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f5579a = Omid.getVersion();

    /* renamed from: b  reason: collision with root package name */
    public final Partner f5580b = Partner.createPartner("Ironsrc", "7");

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, AdSession> f5581c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f5582d = false;

    /* renamed from: com.ironsource.sdk.e.a.a$a  reason: collision with other inner class name */
    public static class C0065a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f5583a;

        /* renamed from: b  reason: collision with root package name */
        public Owner f5584b;

        /* renamed from: c  reason: collision with root package name */
        public Owner f5585c;

        /* renamed from: d  reason: collision with root package name */
        public String f5586d;

        /* renamed from: e  reason: collision with root package name */
        public ImpressionType f5587e;

        /* renamed from: f  reason: collision with root package name */
        public CreativeType f5588f;

        /* renamed from: g  reason: collision with root package name */
        public String f5589g;

        public static C0065a a(JSONObject jSONObject) {
            C0065a aVar = new C0065a();
            aVar.f5583a = jSONObject.optBoolean("isolateVerificationScripts", false);
            String optString = jSONObject.optString("impressionOwner", "");
            if (!TextUtils.isEmpty(optString)) {
                try {
                    aVar.f5584b = Owner.valueOf(optString.toUpperCase());
                    String optString2 = jSONObject.optString("videoEventsOwner", "");
                    if (!TextUtils.isEmpty(optString)) {
                        try {
                            aVar.f5585c = Owner.valueOf(optString2.toUpperCase());
                            aVar.f5586d = jSONObject.optString("customReferenceData", "");
                            String optString3 = jSONObject.optString("creativeType", "");
                            if (!TextUtils.isEmpty(optString3)) {
                                for (CreativeType creativeType : CreativeType.values()) {
                                    if (optString3.equalsIgnoreCase(creativeType.toString())) {
                                        aVar.f5588f = creativeType;
                                        String optString4 = jSONObject.optString("impressionType", "");
                                        if (!TextUtils.isEmpty(optString4)) {
                                            for (ImpressionType impressionType : ImpressionType.values()) {
                                                if (optString4.equalsIgnoreCase(impressionType.toString())) {
                                                    aVar.f5587e = impressionType;
                                                    String optString5 = jSONObject.optString("adViewId", "");
                                                    if (!TextUtils.isEmpty(optString5)) {
                                                        aVar.f5589g = optString5;
                                                        String optString6 = jSONObject.optString("videoEventsOwner", "");
                                                        Owner owner = Owner.NATIVE;
                                                        try {
                                                            Owner.valueOf(optString6.toUpperCase());
                                                        } catch (IllegalArgumentException unused) {
                                                        }
                                                        return aVar;
                                                    }
                                                    throw new IllegalArgumentException(com.ironsource.adapters.ironsource.a.j("Missing adview id in OMID params", optString5));
                                                }
                                            }
                                            throw new IllegalArgumentException(com.ironsource.adapters.ironsource.a.j("Missing OMID creativeType", optString4));
                                        }
                                        throw new IllegalArgumentException(com.ironsource.adapters.ironsource.a.j("Missing OMID creativeType", optString4));
                                    }
                                }
                                throw new IllegalArgumentException(com.ironsource.adapters.ironsource.a.j("Missing OMID creativeType", optString3));
                            }
                            throw new IllegalArgumentException(com.ironsource.adapters.ironsource.a.j("Missing OMID creativeType", optString3));
                        } catch (IllegalArgumentException unused2) {
                            throw new IllegalArgumentException(com.ironsource.adapters.ironsource.a.j("Invalid OMID videoEventsOwner ", optString2));
                        }
                    } else {
                        throw new IllegalArgumentException("Missing OMID videoEventsOwner");
                    }
                } catch (IllegalArgumentException unused3) {
                    throw new IllegalArgumentException(com.ironsource.adapters.ironsource.a.j("Invalid OMID impressionOwner ", optString));
                }
            } else {
                throw new IllegalArgumentException("Missing OMID impressionOwner");
            }
        }
    }

    public final f a() {
        f fVar = new f();
        fVar.a("omidVersion", SDKUtils.encodeString(f5579a));
        fVar.a("omidPartnerName", SDKUtils.encodeString("Ironsrc"));
        fVar.a("omidPartnerVersion", SDKUtils.encodeString("7"));
        fVar.a("omidActiveAdSessions", SDKUtils.encodeString(Arrays.toString(this.f5581c.keySet().toArray())));
        return fVar;
    }

    public void a(JSONObject jSONObject) {
        if (!this.f5582d) {
            throw new IllegalStateException("OMID has not been activated");
        } else if (jSONObject == null) {
            throw new IllegalStateException("OMID Session has not started");
        }
    }
}
