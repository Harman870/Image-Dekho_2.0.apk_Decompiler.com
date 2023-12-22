package com.ironsource.mediationsdk.adquality;

import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import x8.f;

public final class AdQualityBridge$configBuilder$1 implements ISAdQualityInitListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AdQualityBridge f4092a;

    public AdQualityBridge$configBuilder$1(AdQualityBridge adQualityBridge) {
        this.f4092a = adQualityBridge;
    }

    public final void adQualitySdkInitFailed(ISAdQualityInitError iSAdQualityInitError, String str) {
        f.f(iSAdQualityInitError, "isAdQualityInitError");
        f.f(str, "message");
        AdQualityBridge.access$logEvent(this.f4092a, iSAdQualityInitError == ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED ? 82 : 83, Integer.valueOf(iSAdQualityInitError.getValue()), str);
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        logger.log(ironSourceTag, "Ad Quality failed to initialize: " + str, 3);
    }

    public final void adQualitySdkInitSuccess() {
        AdQualityBridge adQualityBridge = this.f4092a;
        AdQualityBridge.Companion companion = AdQualityBridge.Companion;
        adQualityBridge.getClass();
        AdQualityBridge.c(81, (Integer) null, (String) null);
    }
}
