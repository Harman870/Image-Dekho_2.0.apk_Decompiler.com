package com.ironsource.mediationsdk.a;

import com.ironsource.mediationsdk.C0181d;
import com.ironsource.mediationsdk.C0183f;
import com.ironsource.sdk.controller.h;
import java.net.URL;
import org.json.JSONObject;

public final class b extends C0183f.a {
    public b(C0181d dVar, URL url, JSONObject jSONObject, boolean z9, int i10, long j10, boolean z10, boolean z11, int i11) {
        super(dVar, url, jSONObject, z9, i10, j10, z10, z11, i11);
    }

    public final void a(boolean z9, C0181d dVar, long j10) {
        if (z9) {
            try {
                ((h) dVar).a(this.f4564b, j10, this.f4572j, this.f4571i);
            } catch (Exception e10) {
                dVar.a(1000, e10.getMessage(), this.f4568f + 1, this.f4569g, j10);
            }
        } else {
            dVar.a(this.f4565c, this.f4566d, this.f4568f + 1, this.f4569g, j10);
        }
    }
}
