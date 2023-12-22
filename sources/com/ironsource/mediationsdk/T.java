package com.ironsource.mediationsdk;

import com.ironsource.lifecycle.g;
import com.ironsource.mediationsdk.events.h;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class T {

    public final class a extends g {
        public a(T t10) {
        }

        public final void run() {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
            try {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_DURATION, this.f3819a);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            h.f4553x.a(new com.ironsource.environment.c.a(44, mediationAdditionalData));
        }
    }

    public final void a() {
        new com.ironsource.lifecycle.a(new a(this));
    }
}
