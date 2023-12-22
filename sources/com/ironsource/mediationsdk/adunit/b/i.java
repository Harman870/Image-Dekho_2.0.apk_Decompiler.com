package com.ironsource.mediationsdk.adunit.b;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import s7.a;

public final class i extends a {
    public i(d dVar) {
        super(dVar);
    }

    public final void a() {
        a(b.COLLECT_TOKEN, new HashMap());
    }

    public final void a(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        a(b.COLLECT_TOKENS_COMPLETED, hashMap);
    }

    public final void a(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        }
        a(b.COLLECT_TOKENS_FAILED, hashMap);
    }

    public final void a(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        a(b.INSTANCE_COLLECT_TOKEN, hashMap);
    }

    public final void a(Map<String, Object> map, long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        a(b.INSTANCE_COLLECT_TOKEN_SUCCESS, hashMap);
    }

    public final void a(Map<String, Object> map, long j10, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        }
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        a(b.INSTANCE_COLLECT_TOKEN_FAILED, hashMap);
    }

    public final void b(Map<String, Object> map, long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        a(b.INSTANCE_COLLECT_TOKEN_TIMED_OUT, hashMap);
    }
}
