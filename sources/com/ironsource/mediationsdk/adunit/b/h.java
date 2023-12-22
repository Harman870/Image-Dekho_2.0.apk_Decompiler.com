package com.ironsource.mediationsdk.adunit.b;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import s7.a;

public final class h extends a {
    public h(d dVar) {
        super(dVar);
    }

    public final void a() {
        a(b.RELOAD_AD, new HashMap());
    }

    public final void a(int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(i10));
        a(b.DESTROY_AD, hashMap);
    }

    public final void a(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        a(b.RELOAD_AD_SUCCESS, hashMap);
    }

    public final void a(long j10, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        a(b.LOAD_AD_FAILED, hashMap);
    }

    public final void a(long j10, int i10, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        }
        a(b.LOAD_AD_FAILED_WITH_REASON, hashMap);
    }

    public final void a(long j10, boolean z9) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        if (z9) {
            hashMap.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        a(b.LOAD_AD_SUCCESS, hashMap);
    }

    public final void a(boolean z9) {
        HashMap hashMap = new HashMap();
        if (z9) {
            hashMap.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        a(b.LOAD_AD, hashMap);
    }

    public final void a(boolean z9, long j10, boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        if (z10) {
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS));
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired");
        }
        a(z9 ? b.AD_AVAILABILITY_CHANGED_TRUE : b.AD_AVAILABILITY_CHANGED_FALSE, hashMap);
    }

    public final void b(int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        a(b.SKIP_RELOAD_AD, hashMap);
    }

    public final void b(long j10, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        a(b.LOAD_AD_NO_FILL, hashMap);
    }

    public final void b(long j10, int i10, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        }
        a(b.RELOAD_AD_FAILED_WITH_REASON, hashMap);
    }

    public final void c(long j10, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        a(b.RELOAD_AD_NO_FILL, hashMap);
    }
}
