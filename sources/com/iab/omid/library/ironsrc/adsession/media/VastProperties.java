package com.iab.omid.library.ironsrc.adsession.media;

import com.iab.omid.library.ironsrc.utils.d;
import com.iab.omid.library.ironsrc.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f3521a;

    /* renamed from: b  reason: collision with root package name */
    private final Float f3522b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3523c;

    /* renamed from: d  reason: collision with root package name */
    private final Position f3524d;

    private VastProperties(boolean z9, Float f10, boolean z10, Position position) {
        this.f3521a = z9;
        this.f3522b = f10;
        this.f3523c = z10;
        this.f3524d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z9, Position position) {
        g.a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z9, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z9, Position position) {
        g.a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z9, position);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f3521a);
            if (this.f3521a) {
                jSONObject.put("skipOffset", this.f3522b);
            }
            jSONObject.put("autoPlay", this.f3523c);
            jSONObject.put("position", this.f3524d);
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }

    public final Position getPosition() {
        return this.f3524d;
    }

    public final Float getSkipOffset() {
        return this.f3522b;
    }

    public final boolean isAutoPlay() {
        return this.f3523c;
    }

    public final boolean isSkippable() {
        return this.f3521a;
    }
}
