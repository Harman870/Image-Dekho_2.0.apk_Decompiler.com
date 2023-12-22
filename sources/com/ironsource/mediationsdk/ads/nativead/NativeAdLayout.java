package com.ironsource.mediationsdk.ads.nativead;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import x8.f;

public final class NativeAdLayout extends FrameLayout implements NativeAdViewBinderInterface {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final NativeAdViewHolder f4102a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NativeAdLayout(Context context) {
        super(context);
        f.f(context, "context");
        this.f4102a = new NativeAdViewHolder();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NativeAdLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f.f(context, "context");
        this.f4102a = new NativeAdViewHolder();
    }

    public final void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public final View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i10);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    public final void setAdvertiserView(View view) {
        this.f4102a.setAdvertiserView(view);
    }

    public final void setBodyView(View view) {
        this.f4102a.setBodyView(view);
    }

    public final void setCallToActionView(View view) {
        this.f4102a.setCallToActionView(view);
    }

    public final void setIconView(View view) {
        this.f4102a.setIconView(view);
    }

    public final void setMediaView(LevelPlayMediaView levelPlayMediaView) {
        this.f4102a.setMediaView(levelPlayMediaView);
    }

    public final void setNativeAd(LevelPlayNativeAd levelPlayNativeAd) {
        f.f(levelPlayNativeAd, "nativeAd");
        ArrayList<View> arrayList = new ArrayList<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f.e(childAt, "child");
            arrayList.add(childAt);
        }
        removeAllViews();
        FrameLayout frameLayout = new FrameLayout(getContext());
        for (View addView : arrayList) {
            frameLayout.addView(addView);
        }
        AdapterNativeAdViewBinder nativeAdViewBinder = levelPlayNativeAd.getNativeAdViewBinder();
        if (nativeAdViewBinder != null) {
            nativeAdViewBinder.setBodyView(this.f4102a.getBodyView());
            nativeAdViewBinder.setMediaView(this.f4102a.getMediaView());
            nativeAdViewBinder.setCallToActionView(this.f4102a.getCallToActionView());
            nativeAdViewBinder.setTitleView(this.f4102a.getTitleView());
            nativeAdViewBinder.setIconView(this.f4102a.getIconView());
            nativeAdViewBinder.setAdvertiserView(this.f4102a.getAdvertiserView());
            nativeAdViewBinder.setNativeAdView(frameLayout);
            addView(nativeAdViewBinder.getNetworkNativeAdView());
        }
    }

    public final void setTitleView(View view) {
        this.f4102a.setTitleView(view);
    }
}
