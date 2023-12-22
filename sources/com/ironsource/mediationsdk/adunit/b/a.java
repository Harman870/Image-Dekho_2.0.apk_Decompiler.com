package com.ironsource.mediationsdk.adunit.b;

import android.app.Activity;
import android.text.TextUtils;
import androidx.fragment.app.v0;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

public final class a extends s7.a {
    public a(d dVar) {
        super(dVar);
    }

    public final void a() {
        a(b.SESSION_CAPPED, (HashMap) null);
    }

    public final void a(boolean z9) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_STATUS, z9 ? "true" : "false");
        a(b.SHOW_AD_CHANCE, hashMap);
    }

    public final void b(String str) {
        a(b.AD_OPENED, v0.c("placement", str));
    }

    public final void c(String str) {
        a(b.AD_CLICKED, v0.c("placement", str));
    }

    public final void d(String str) {
        a(b.AD_STARTED, v0.c("placement", str));
    }

    public final void e(String str) {
        a(b.AD_ENDED, v0.c("placement", str));
    }

    public final void f(String str) {
        a(b.AD_VISIBLE, v0.c("placement", str));
    }

    public final void g(String str) {
        a(b.AD_LEFT_APPLICATION, v0.c("placement", str));
    }

    public final void h(String str) {
        a(b.AD_PRESENT_SCREEN, v0.c("placement", str));
    }

    public final void i(String str) {
        a(b.AD_DISMISS_SCREEN, v0.c("placement", str));
    }

    public final void j(String str) {
        a(b.PLACEMENT_CAPPED, v0.c("placement", str));
    }

    public final void a(Activity activity, String str) {
        HashMap c10 = v0.c("placement", str);
        if (activity != null) {
            c10.put(IronSourceConstants.EVENTS_EXT1, IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW);
        }
        a(b.SHOW_AD, c10);
    }

    public final void a(String str) {
        a(b.SHOW_AD_SUCCESS, v0.c("placement", str));
    }

    public final void a(String str, int i10, String str2, String str3) {
        HashMap c10 = v0.c("placement", str);
        c10.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        c10.put(IronSourceConstants.EVENTS_ERROR_REASON, str2);
        if (!TextUtils.isEmpty(str3)) {
            c10.put(IronSourceConstants.EVENTS_EXT1, str3);
        }
        a(b.SHOW_AD_FAILED, c10);
    }

    public final void a(String str, String str2) {
        HashMap c10 = v0.c("placement", str);
        if (!TextUtils.isEmpty(str2)) {
            c10.put(IronSourceConstants.EVENTS_EXT1, str2);
        }
        a(b.AD_CLOSED, c10);
    }

    public final void a(String str, String str2, int i10, long j10, String str3, long j11, Map<String, Object> map, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        hashMap.put(IronSourceConstants.EVENTS_REWARD_NAME, str2);
        hashMap.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(i10));
        hashMap.put(IronSourceConstants.EVENTS_TRANS_ID, str3);
        if (j11 != 0) {
            hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j11));
        }
        hashMap.putAll(map);
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, str4);
        }
        this.f11895a.a(b.AD_REWARDED, hashMap, j10);
    }
}
