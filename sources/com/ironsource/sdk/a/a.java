package com.ironsource.sdk.a;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, Object> f5086a = new HashMap<>();

    public final a a(String str, Object obj) {
        if (obj != null) {
            this.f5086a.put(str, SDKUtils.encodeString(obj.toString()));
        }
        return this;
    }
}
