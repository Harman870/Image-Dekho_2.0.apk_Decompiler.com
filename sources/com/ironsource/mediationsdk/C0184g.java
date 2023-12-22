package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.mediationsdk.C0183f;
import com.ironsource.mediationsdk.a.b;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.c;
import java.net.URL;
import org.json.JSONObject;
import x8.f;

/* renamed from: com.ironsource.mediationsdk.g  reason: case insensitive filesystem */
public final class C0184g {

    /* renamed from: a  reason: collision with root package name */
    public final c f4580a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4581b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4582c;

    public C0184g(c cVar, boolean z9, String str) {
        f.f(cVar, "settings");
        f.f(str, "sessionId");
        this.f4580a = cVar;
        this.f4581b = z9;
        this.f4582c = str;
    }

    public final C0183f.a a(Context context, C0187k kVar, C0181d dVar) {
        JSONObject b10;
        C0187k kVar2 = kVar;
        f.f(context, "context");
        f.f(kVar2, "auctionRequestParams");
        f.f(dVar, "auctionListener");
        new JSONObject();
        if (this.f4581b) {
            b10 = C0182e.a().c(kVar2);
        } else {
            IronSourceSegment ironSourceSegment = kVar2.f4623i;
            b10 = C0182e.a().b(context, kVar2.f4619e, kVar2.f4620f, kVar2.f4622h, kVar2.f4621g, this.f4582c, this.f4580a, kVar2.k, ironSourceSegment != null ? ironSourceSegment.toJson() : null, kVar2.f4626m, kVar2.f4627n);
            b10.put("adUnit", kVar2.f4615a);
            b10.put("doNotEncryptResponse", kVar2.f4618d ? "false" : "true");
            if (kVar2.f4625l) {
                b10.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            }
            if (kVar2.f4617c) {
                b10.put("isOneFlow", 1);
            }
        }
        JSONObject jSONObject = b10;
        String a10 = this.f4580a.a(kVar2.f4625l);
        if (kVar2.f4625l) {
            URL url = new URL(a10);
            boolean z9 = kVar2.f4618d;
            c cVar = this.f4580a;
            return new b(dVar, url, jSONObject, z9, cVar.f4977c, cVar.f4980f, cVar.f4985l, cVar.f4986m, cVar.f4987n);
        }
        URL url2 = new URL(a10);
        boolean z10 = kVar2.f4618d;
        c cVar2 = this.f4580a;
        return new C0183f.a(dVar, url2, jSONObject, z10, cVar2.f4977c, cVar2.f4980f, cVar2.f4985l, cVar2.f4986m, cVar2.f4987n);
    }

    public final boolean a() {
        return this.f4580a.f4977c > 0;
    }
}
