package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;

public final class p {

    /* renamed from: b  reason: collision with root package name */
    public static p f4788b;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<NetworkSettings> f4789a = new ArrayList<>();

    private p() {
    }

    public static synchronized p a() {
        p pVar;
        synchronized (p.class) {
            if (f4788b == null) {
                f4788b = new p();
            }
            pVar = f4788b;
        }
        return pVar;
    }

    public final NetworkSettings a(String str) {
        Iterator<NetworkSettings> it = this.f4789a.iterator();
        while (it.hasNext()) {
            NetworkSettings next = it.next();
            if (next.getProviderName().equals(str)) {
                return next;
            }
        }
        NetworkSettings networkSettings = new NetworkSettings(str);
        a(networkSettings);
        return networkSettings;
    }

    public final void a(NetworkSettings networkSettings) {
        this.f4789a.add(networkSettings);
    }

    public final void b() {
        Iterator<NetworkSettings> it = this.f4789a.iterator();
        while (it.hasNext()) {
            NetworkSettings next = it.next();
            if (next.isMultipleInstances() && !TextUtils.isEmpty(next.getProviderTypeForReflection())) {
                NetworkSettings a10 = a(next.getProviderDefaultInstance());
                next.setApplicationSettings(IronSourceUtils.mergeJsons(next.getApplicationSettings(), a10.getApplicationSettings()));
                next.setInterstitialSettings(IronSourceUtils.mergeJsons(next.getInterstitialSettings(), a10.getInterstitialSettings()));
                next.setRewardedVideoSettings(IronSourceUtils.mergeJsons(next.getRewardedVideoSettings(), a10.getRewardedVideoSettings()));
                next.setBannerSettings(IronSourceUtils.mergeJsons(next.getBannerSettings(), a10.getBannerSettings()));
                next.setNativeAdSettings(IronSourceUtils.mergeJsons(next.getNativeAdSettings(), a10.getNativeAdSettings()));
            }
        }
    }

    public final boolean b(String str) {
        Iterator<NetworkSettings> it = this.f4789a.iterator();
        while (it.hasNext()) {
            if (it.next().getProviderName().equals(str)) {
                return true;
            }
        }
        return false;
    }
}
