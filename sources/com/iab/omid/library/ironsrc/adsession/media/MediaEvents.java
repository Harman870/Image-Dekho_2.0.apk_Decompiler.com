package com.iab.omid.library.ironsrc.adsession.media;

import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.a;
import com.iab.omid.library.ironsrc.internal.h;
import com.iab.omid.library.ironsrc.utils.c;
import com.iab.omid.library.ironsrc.utils.g;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final a adSession;

    private MediaEvents(a aVar) {
        this.adSession = aVar;
    }

    private void confirmValidDuration(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
    }

    private void confirmValidVolume(float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    public static MediaEvents createMediaEvents(AdSession adSession2) {
        a aVar = (a) adSession2;
        g.a((Object) adSession2, "AdSession is null");
        g.f(aVar);
        g.c(aVar);
        g.b(aVar);
        g.h(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().a(mediaEvents);
        return mediaEvents;
    }

    public final void adUserInteraction(InteractionType interactionType) {
        g.a((Object) interactionType, "InteractionType is null");
        g.a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().a("adUserInteraction", jSONObject);
    }

    public final void bufferFinish() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("bufferFinish");
    }

    public final void bufferStart() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("bufferStart");
    }

    public final void complete() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("complete");
    }

    public final void firstQuartile() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("firstQuartile");
    }

    public final void midpoint() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("midpoint");
    }

    public final void pause() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("pause");
    }

    public final void playerStateChange(PlayerState playerState) {
        g.a((Object) playerState, "PlayerState is null");
        g.a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().a("playerStateChange", jSONObject);
    }

    public final void resume() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("resume");
    }

    public final void skipped() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("skipped");
    }

    public final void start(float f10, float f11) {
        confirmValidDuration(f10);
        confirmValidVolume(f11);
        g.a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, IronSourceConstants.EVENTS_DURATION, Float.valueOf(f10));
        c.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f11));
        c.a(jSONObject, "deviceVolume", Float.valueOf(h.c().b()));
        this.adSession.getAdSessionStatePublisher().a("start", jSONObject);
    }

    public final void thirdQuartile() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("thirdQuartile");
    }

    public final void volumeChange(float f10) {
        confirmValidVolume(f10);
        g.a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f10));
        c.a(jSONObject, "deviceVolume", Float.valueOf(h.c().b()));
        this.adSession.getAdSessionStatePublisher().a("volumeChange", jSONObject);
    }
}
