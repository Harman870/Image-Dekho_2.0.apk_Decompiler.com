package com.ironsource.mediationsdk.adunit.b;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import s7.a;

public final class g extends a {
    public g(d dVar) {
        super(dVar);
    }

    public final void a(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        a(b.INIT_ENDED, hashMap);
    }

    public final void a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str + "|" + str2);
        a(b.INIT_STARTED, hashMap);
    }
}
