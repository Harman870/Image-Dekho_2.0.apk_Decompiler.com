package com.ironsource.mediationsdk.adunit.b;

import androidx.fragment.app.v0;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import s7.a;

public final class j extends a {
    public j(d dVar) {
        super(dVar);
    }

    public final void a(int i10, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        a(b.TROUBLESHOOT_LOAD_FAILED, hashMap);
    }

    public final void a(int i10, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str2);
        a(b.TROUBLESHOOT_NOTIFICATION_ERROR, hashMap);
    }

    public final void a(String str) {
        a(b.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, v0.c(IronSourceConstants.EVENTS_ERROR_REASON, str));
    }

    public final void b(int i10, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        a(b.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, hashMap);
    }

    public final void b(String str) {
        a(b.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, v0.c(IronSourceConstants.EVENTS_ERROR_REASON, str));
    }

    public final void c(String str) {
        a(b.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, v0.c(IronSourceConstants.EVENTS_ERROR_REASON, str));
    }

    public final void d(String str) {
        a(b.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, v0.c(IronSourceConstants.EVENTS_ERROR_REASON, str));
    }

    public final void e(String str) {
        a(b.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, v0.c(IronSourceConstants.EVENTS_ERROR_REASON, str));
    }

    public final void f(String str) {
        a(b.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, v0.c(IronSourceConstants.EVENTS_ERROR_REASON, str));
    }

    public final void g(String str) {
        a(b.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS, v0.c(IronSourceConstants.EVENTS_ERROR_REASON, str));
    }

    public final void h(String str) {
        a(b.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, v0.c(IronSourceConstants.EVENTS_ERROR_REASON, str));
    }

    public final void i(String str) {
        a(b.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED, v0.c(IronSourceConstants.EVENTS_ERROR_REASON, str));
    }

    public final void j(String str) {
        a(b.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, v0.c(IronSourceConstants.EVENTS_ERROR_REASON, str));
    }

    public final void k(String str) {
        a(b.TROUBLESHOOT_UNEXPECTED_CLOSED, v0.c(IronSourceConstants.EVENTS_ERROR_REASON, str));
    }

    public final void l(String str) {
        a(b.TROUBLESHOOT_UNEXPECTED_TIMEOUT, v0.c(IronSourceConstants.EVENTS_ERROR_REASON, str));
    }

    public final void m(String str) {
        a(b.TROUBLESHOOT_UNEXPECTED_OPENED, v0.c(IronSourceConstants.EVENTS_ERROR_REASON, str));
    }

    public final void n(String str) {
        a(b.TROUBLESHOOT_INTERNAL_ERROR, v0.c(IronSourceConstants.EVENTS_ERROR_REASON, str));
    }

    public final void o(String str) {
        a(b.TROUBLESHOOTING_WATERFALL_OVERHEAD, v0.c(IronSourceConstants.EVENTS_ERROR_REASON, str));
    }

    public final void p(String str) {
        a(b.TROUBLESHOOT_AD_EXPIRED, v0.c(IronSourceConstants.EVENTS_ERROR_REASON, str));
    }

    public final void q(String str) {
        a(b.TROUBLESHOOTING_BN_RELOAD_EXCEPTION, v0.c(IronSourceConstants.EVENTS_ERROR_REASON, str));
    }

    public final void a(Map<String, Object> map, String str) {
        HashMap c10 = v0.c(IronSourceConstants.EVENTS_ERROR_REASON, str);
        if (map != null && !map.isEmpty()) {
            c10.putAll(map);
        }
        a(b.TROUBLESHOOT_BIDDING_DATA_MISSING, c10);
    }
}
