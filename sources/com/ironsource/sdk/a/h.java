package com.ironsource.sdk.a;

import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static a f5103a = new a(2001, a("initsdk"));

    /* renamed from: b  reason: collision with root package name */
    public static a f5104b = new a(2026, a("sdkrecoverstart"));

    /* renamed from: c  reason: collision with root package name */
    public static a f5105c = new a(2002, a("createcontrollerweb"));

    /* renamed from: d  reason: collision with root package name */
    public static a f5106d = new a(2003, a("createcontrollernative"));

    /* renamed from: e  reason: collision with root package name */
    public static a f5107e = new a(2004, a("controllerstageready"));

    /* renamed from: f  reason: collision with root package name */
    public static a f5108f = new a(IronSourceConstants.IS_INSTANCE_OPENED, a("loadad"));

    /* renamed from: g  reason: collision with root package name */
    public static a f5109g = new a(2006, a("loadadfailed"));

    /* renamed from: h  reason: collision with root package name */
    public static a f5110h = new a(2007, a("initproduct"));

    /* renamed from: i  reason: collision with root package name */
    public static a f5111i = new a(AdError.REMOTE_ADS_SERVICE_ERROR, a("initproductfailed"));

    /* renamed from: j  reason: collision with root package name */
    public static a f5112j = new a(AdError.INTERSTITIAL_AD_TIMEOUT, a("loadproduct"));
    public static a k = new a(2010, a("parseadmfailed"));

    /* renamed from: l  reason: collision with root package name */
    public static a f5113l = new a(2011, a("loadadsuccess"));

    /* renamed from: m  reason: collision with root package name */
    public static a f5114m = new a(2027, a("destroyproduct"));

    /* renamed from: n  reason: collision with root package name */
    public static a f5115n = new a(2030, a("registerad"));

    /* renamed from: o  reason: collision with root package name */
    public static a f5116o = new a(2013, a("controllerfailed"));

    /* renamed from: p  reason: collision with root package name */
    public static a f5117p = new a(2015, a("appendnativefeaturesdatafailed"));

    /* renamed from: q  reason: collision with root package name */
    public static a f5118q = new a(2016, a("adunitcouldnotloadtowebview"));

    /* renamed from: r  reason: collision with root package name */
    public static a f5119r = new a(2017, a("webviewcleanupfailed"));

    /* renamed from: s  reason: collision with root package name */
    public static a f5120s = new a(2018, a("removewebviewfailed"));

    /* renamed from: t  reason: collision with root package name */
    public static a f5121t = new a(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_SUCCESS, a("fialedregactlifecycle"));
    public static a u = new a(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_FAILED, a("loadcontrollerhtml"));

    /* renamed from: v  reason: collision with root package name */
    public static a f5122v = new a(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, a("controllerhtmlsuccess"));
    public static a w = new a(2024, a("controllerhtmlfailed"));

    /* renamed from: x  reason: collision with root package name */
    public static a f5123x = new a(2025, a("webviewcrashrpg"));

    /* renamed from: y  reason: collision with root package name */
    public static a f5124y = new a(2031, a("getorientationcalled"));

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f5125a;

        /* renamed from: b  reason: collision with root package name */
        public int f5126b;

        public a(int i10, String str) {
            this.f5126b = i10;
            this.f5125a = str;
        }
    }

    static {
        a("banneralreadydestroyed");
    }

    public static String a(String str) {
        return com.ironsource.adapters.ironsource.a.j("n_", str);
    }
}
