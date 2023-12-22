package com.ironsource.sdk.service.Connectivity;

import android.content.Context;
import com.ironsource.environment.c;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

public abstract class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public c f5738a;

    public b(Context context, JSONObject jSONObject) {
        this.f5738a = jSONObject.optInt("connectivityStrategy") == 1 ? new a(this) : !c.b(context, "android.permission.ACCESS_NETWORK_STATE") ? new a(this) : new e(this);
        Logger.i("b", "created ConnectivityAdapter with strategy " + this.f5738a.getClass().getSimpleName());
    }

    public void a() {
    }

    public void a(String str) {
    }

    public void a(String str, JSONObject jSONObject) {
    }
}
