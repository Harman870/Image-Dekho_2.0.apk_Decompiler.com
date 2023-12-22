package com.ironsource.sdk.b;

import java.util.HashMap;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public a f5142a = new a();

    /* renamed from: b  reason: collision with root package name */
    public int f5143b = 4;

    /* renamed from: c  reason: collision with root package name */
    public int f5144c = 4;

    public class a extends HashMap<String, Boolean> {
        public a() {
            boolean z9 = true;
            put("isVisible", Boolean.valueOf(d.this.f5143b == 0));
            put("isWindowVisible", Boolean.valueOf(d.this.f5144c != 0 ? false : z9));
            Boolean bool = Boolean.FALSE;
            put("isShown", bool);
            put("isViewVisible", bool);
        }
    }

    public final JSONObject a() {
        return new JSONObject(this.f5142a);
    }
}
