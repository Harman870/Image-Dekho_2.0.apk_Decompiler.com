package com.ironsource.mediationsdk.adunit.b;

import android.text.TextUtils;
import androidx.fragment.app.v0;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import s7.a;

public final class e extends a {
    public e(d dVar) {
        super(dVar);
    }

    public final void a() {
        a(b.AUCTION_REQUEST, (HashMap) null);
    }

    public final void a(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        a(b.AUCTION_SUCCESS, hashMap);
    }

    public final void a(long j10, int i10, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        }
        a(b.AUCTION_FAILED, hashMap);
    }

    public final void b(String str) {
        a(b.AUCTION_RESULT_WATERFALL, v0.c(IronSourceConstants.EVENTS_EXT1, str));
    }

    public final void c(String str) {
        a(b.AD_UNIT_CAPPED, v0.c("auctionId", str));
    }

    public final void a(String str) {
        a(b.AUCTION_REQUEST_WATERFALL, v0.c(IronSourceConstants.EVENTS_EXT1, str));
    }
}
