package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.environment.l;
import com.ironsource.mediationsdk.utils.n;
import org.json.JSONObject;
import x8.f;

public final class W {
    public static JSONObject a(Context context, n nVar) {
        f.f(context, "context");
        f.f(nVar, "tokenSettings");
        return l.a.a(nVar, context);
    }
}
