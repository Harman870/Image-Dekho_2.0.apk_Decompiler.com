package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

public class ISBannerSize {
    public static final ISBannerSize BANNER = C0189n.a("BANNER", 320, 50);
    public static final ISBannerSize LARGE = C0189n.a("LARGE", 320, 90);
    public static final ISBannerSize RECTANGLE = C0189n.a("RECTANGLE", 300, (int) IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);
    public static final ISBannerSize SMART = C0189n.a("SMART", 0, 0);

    /* renamed from: e  reason: collision with root package name */
    public static final ISBannerSize f3924e = C0189n.a();

    /* renamed from: a  reason: collision with root package name */
    public final int f3925a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3926b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3927c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3928d;

    public ISBannerSize(int i10, int i11) {
        this("CUSTOM", i10, i11);
    }

    public ISBannerSize(String str, int i10, int i11) {
        this.f3927c = str;
        this.f3925a = i10;
        this.f3926b = i11;
    }

    public String getDescription() {
        return this.f3927c;
    }

    public int getHeight() {
        return this.f3926b;
    }

    public int getWidth() {
        return this.f3925a;
    }

    public boolean isAdaptive() {
        return this.f3928d;
    }

    public boolean isSmart() {
        return this.f3927c.equals("SMART");
    }

    public void setAdaptive(boolean z9) {
        this.f3928d = z9;
    }
}
