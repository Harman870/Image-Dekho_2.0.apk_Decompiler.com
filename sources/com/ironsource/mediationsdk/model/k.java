package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.x;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<l> f4764a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public l f4765b;

    /* renamed from: c  reason: collision with root package name */
    public x f4766c;

    /* renamed from: d  reason: collision with root package name */
    public JSONObject f4767d;

    public k(x xVar) {
        this.f4766c = xVar;
    }

    public final l a() {
        Iterator<l> it = this.f4764a.iterator();
        while (it.hasNext()) {
            l next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f4765b;
    }

    public final l a(String str) {
        Iterator<l> it = this.f4764a.iterator();
        while (it.hasNext()) {
            l next = it.next();
            if (next.getPlacementName().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public final String b() {
        JSONObject jSONObject = this.f4767d;
        return (jSONObject == null || TextUtils.isEmpty(jSONObject.optString("adapterName"))) ? IronSourceConstants.SUPERSONIC_CONFIG_NAME : this.f4767d.optString("adapterName");
    }
}
