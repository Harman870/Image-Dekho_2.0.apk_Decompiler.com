package com.ironsource.mediationsdk.ads.nativead;

import android.app.Activity;
import b3.a;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.c.g;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import v0.b;
import x8.d;
import x8.f;

public final class LevelPlayNativeAd implements NativeAdDataInterface, NativeAdInterface, InternalNativeAdListener {

    /* renamed from: a  reason: collision with root package name */
    public String f4093a;

    /* renamed from: b  reason: collision with root package name */
    public Placement f4094b;

    /* renamed from: c  reason: collision with root package name */
    public LevelPlayNativeAdListener f4095c;

    /* renamed from: d  reason: collision with root package name */
    public g f4096d;

    /* renamed from: e  reason: collision with root package name */
    public AdapterNativeAdData f4097e;

    /* renamed from: f  reason: collision with root package name */
    public AdapterNativeAdViewBinder f4098f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicBoolean f4099g = new AtomicBoolean(false);

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f4100a;

        /* renamed from: b  reason: collision with root package name */
        public LevelPlayNativeAdListener f4101b;

        public final LevelPlayNativeAd build() {
            return new LevelPlayNativeAd(this, (d) null);
        }

        public final LevelPlayNativeAdListener getMListener$mediationsdk_release() {
            return this.f4101b;
        }

        public final String getMPlacementName$mediationsdk_release() {
            return this.f4100a;
        }

        public final void setMListener$mediationsdk_release(LevelPlayNativeAdListener levelPlayNativeAdListener) {
            this.f4101b = levelPlayNativeAdListener;
        }

        public final void setMPlacementName$mediationsdk_release(String str) {
            this.f4100a = str;
        }

        public final Builder withActivity(Activity activity) {
            ContextProvider.getInstance().updateActivity(activity);
            IronLog ironLog = IronLog.INTERNAL;
            StringBuilder sb = new StringBuilder("activity is updated to: ");
            sb.append(activity != null ? activity.hashCode() : 0);
            ironLog.verbose(sb.toString());
            return this;
        }

        public final Builder withListener(LevelPlayNativeAdListener levelPlayNativeAdListener) {
            f.f(levelPlayNativeAdListener, "listener");
            this.f4101b = levelPlayNativeAdListener;
            return this;
        }

        public final Builder withPlacementName(String str) {
            this.f4100a = str;
            return this;
        }
    }

    public LevelPlayNativeAd(Builder builder, d dVar) {
        this.f4093a = builder.getMPlacementName$mediationsdk_release();
        this.f4095c = builder.getMListener$mediationsdk_release();
    }

    public final void destroyAd() {
        IronLog.API.info(String.valueOf(this));
        try {
            g gVar = this.f4096d;
            if (gVar != null) {
                gVar.h();
            }
        } catch (Throwable unused) {
            IronLog.API.error("destroyNativeAd()");
        }
    }

    public final String getAdvertiser() {
        AdapterNativeAdData adapterNativeAdData = this.f4097e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    public final String getBody() {
        AdapterNativeAdData adapterNativeAdData = this.f4097e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    public final String getCallToAction() {
        AdapterNativeAdData adapterNativeAdData = this.f4097e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    public final NativeAdDataInterface.Image getIcon() {
        AdapterNativeAdData adapterNativeAdData = this.f4097e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getIcon();
        }
        return null;
    }

    public final AdapterNativeAdViewBinder getNativeAdViewBinder() {
        return this.f4098f;
    }

    public final UUID getObjectId() {
        g gVar = this.f4096d;
        if (gVar != null) {
            return gVar.f4252a;
        }
        return null;
    }

    public final String getTitle() {
        AdapterNativeAdData adapterNativeAdData = this.f4097e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        r0 = (r0 = r0.f5017a).f4787d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void loadAd() {
        /*
            r6 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.API
            java.lang.String r1 = java.lang.String.valueOf(r6)
            r0.info(r1)
            com.ironsource.mediationsdk.z r0 = com.ironsource.mediationsdk.z.a()
            boolean r1 = r0.f5072v
            java.lang.String r2 = "init() had failed"
            r3 = 1
            if (r1 != 0) goto L_0x0017
            java.lang.String r2 = "init() must be called first"
            goto L_0x0038
        L_0x0017:
            com.ironsource.mediationsdk.E r1 = com.ironsource.mediationsdk.E.a()
            int[] r4 = com.ironsource.mediationsdk.z.AnonymousClass2.f5077b
            com.ironsource.mediationsdk.E$a r5 = r1.b()
            int r5 = r5.ordinal()
            r4 = r4[r5]
            if (r4 == r3) goto L_0x0038
            r5 = 2
            if (r4 == r5) goto L_0x002f
            java.lang.String r2 = ""
            goto L_0x0038
        L_0x002f:
            boolean r1 = r1.c()
            if (r1 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            java.lang.String r2 = "init() not finished yet"
        L_0x0038:
            boolean r1 = r0.j()
            r4 = 0
            if (r1 == 0) goto L_0x0058
            com.ironsource.mediationsdk.utils.k r0 = r0.f5053f
            if (r0 == 0) goto L_0x0053
            com.ironsource.mediationsdk.model.o r0 = r0.f5017a
            if (r0 == 0) goto L_0x0053
            java.util.ArrayList<java.lang.String> r0 = r0.f4787d
            if (r0 == 0) goto L_0x0053
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0053
            r0 = r3
            goto L_0x0054
        L_0x0053:
            r0 = r4
        L_0x0054:
            if (r0 == 0) goto L_0x0058
            r0 = r3
            goto L_0x0059
        L_0x0058:
            r0 = r4
        L_0x0059:
            if (r0 != 0) goto L_0x0063
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0063
            java.lang.String r2 = "No Native Ad configurations found"
        L_0x0063:
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r3 = r4
        L_0x006b:
            if (r3 == 0) goto L_0x0089
            com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener r0 = r6.f4095c
            if (r0 == 0) goto L_0x0088
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "loadAd(): "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Native Ad"
            com.ironsource.mediationsdk.logger.IronSourceError r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r1, r2)
            r0.onAdLoadFailed(r6, r1)
        L_0x0088:
            return
        L_0x0089:
            com.ironsource.environment.thread.IronSourceThreadManager r0 = com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE
            android.os.Handler r0 = r0.getInitHandler()
            androidx.activity.m r1 = new androidx.activity.m
            r2 = 4
            r1.<init>(r2, r6)
            r0.post(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd.loadAd():void");
    }

    public final void onNativeAdClicked(AdInfo adInfo) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new z.g(this, 3, adInfo), 0, 2, (Object) null);
    }

    public final void onNativeAdImpression(AdInfo adInfo) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new j6.g(this, 1, adInfo), 0, 2, (Object) null);
    }

    public final void onNativeAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new b(this, 2, ironSourceError), 0, 2, (Object) null);
    }

    public final void onNativeAdLoaded(AdInfo adInfo, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        f.f(adapterNativeAdData, "adapterNativeAdData");
        f.f(adapterNativeAdViewBinder, "nativeAdViewBinder");
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new a(this, adapterNativeAdData, adapterNativeAdViewBinder, adInfo, 1), 0, 2, (Object) null);
    }

    public final void setListener(LevelPlayNativeAdListener levelPlayNativeAdListener) {
        this.f4095c = levelPlayNativeAdListener;
    }
}
