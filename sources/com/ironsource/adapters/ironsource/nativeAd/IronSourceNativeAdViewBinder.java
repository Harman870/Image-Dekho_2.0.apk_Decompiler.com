package com.ironsource.adapters.ironsource.nativeAd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdOptionsPosition;
import com.ironsource.mediationsdk.adunit.adapter.utility.NativeAdProperties;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.k.b;
import com.ironsource.sdk.k.c;
import com.ironsource.sdk.k.d;
import com.ironsource.sdk.k.e;
import com.ironsource.sdk.mediation.R;
import x8.f;

public final class IronSourceNativeAdViewBinder extends AdapterNativeAdViewBinder {
    private final d nativeAd;
    private final NativeAdProperties nativeAdProperties;
    private b networkNativeAdView;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdOptionsPosition.values().length];
            iArr[AdOptionsPosition.TOP_LEFT.ordinal()] = 1;
            iArr[AdOptionsPosition.TOP_RIGHT.ordinal()] = 2;
            iArr[AdOptionsPosition.BOTTOM_LEFT.ordinal()] = 3;
            iArr[AdOptionsPosition.BOTTOM_RIGHT.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public IronSourceNativeAdViewBinder(d dVar, NativeAdProperties nativeAdProperties2) {
        f.f(dVar, "nativeAd");
        f.f(nativeAdProperties2, "nativeAdProperties");
        this.nativeAd = dVar;
        this.nativeAdProperties = nativeAdProperties2;
    }

    @SuppressLint({"RtlHardcoded"})
    private final FrameLayout.LayoutParams getPrivacyIconLayoutParams() {
        int i10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.nativeAdProperties.getAdOptionsPosition().ordinal()];
        if (i11 == 1) {
            i10 = 51;
        } else if (i11 == 2) {
            i10 = 53;
        } else if (i11 == 3) {
            i10 = 83;
        } else if (i11 == 4) {
            i10 = 85;
        } else {
            throw new o8.d();
        }
        layoutParams.gravity = i10;
        return layoutParams;
    }

    public final b getNetworkNativeAdView() {
        return this.networkNativeAdView;
    }

    public final void setNativeAdView(View view) {
        if (view == null) {
            IronLog.INTERNAL.error("nativeAdView is null");
        } else if (this.nativeAd.a() == null) {
            IronLog.INTERNAL.error("nativeAd.adData is null");
        } else {
            LevelPlayMediaView mediaView = getNativeAdViewHolder().getMediaView();
            if (mediaView != null) {
                c a10 = this.nativeAd.a();
                f.c(a10);
                WebView webView = a10.f5689f;
                if (webView != null) {
                    mediaView.addView(webView, new ViewGroup.LayoutParams(-1, -1));
                }
            }
            c a11 = this.nativeAd.a();
            f.c(a11);
            View view2 = a11.f5690g;
            view2.setId(R.id.privacy_icon_button);
            view2.setLayoutParams(getPrivacyIconLayoutParams());
            Context context = view.getContext();
            f.e(context, "context");
            b bVar = new b(context);
            bVar.addView(view);
            bVar.addView(view2);
            this.networkNativeAdView = bVar;
            b networkNativeAdView2 = getNetworkNativeAdView();
            f.c(networkNativeAdView2);
            this.nativeAd.a(new e(networkNativeAdView2, getNativeAdViewHolder().getTitleView(), getNativeAdViewHolder().getAdvertiserView(), getNativeAdViewHolder().getIconView(), getNativeAdViewHolder().getBodyView(), getNativeAdViewHolder().getMediaView(), getNativeAdViewHolder().getCallToActionView(), view2));
        }
    }
}
