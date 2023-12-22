package com.ironsource.mediationsdk;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.environment.thread.IronSourceThreadManager;

/* renamed from: com.ironsource.mediationsdk.n  reason: case insensitive filesystem */
public class C0189n {

    /* renamed from: a  reason: collision with root package name */
    public long f4806a;

    /* renamed from: b  reason: collision with root package name */
    public long f4807b;

    /* renamed from: com.ironsource.mediationsdk.n$c */
    public static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ IronSourceBannerLayout f4808a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ View f4809b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ FrameLayout.LayoutParams f4810c;

        public c(IronSourceBannerLayout ironSourceBannerLayout, View view, FrameLayout.LayoutParams layoutParams) {
            this.f4808a = ironSourceBannerLayout;
            this.f4809b = view;
            this.f4810c = layoutParams;
        }

        public final void run() {
            this.f4808a.removeAllViews();
            ViewParent parent = this.f4809b.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f4809b);
            }
            this.f4808a.addView(this.f4809b, 0, this.f4810c);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.n$d */
    public interface d {
        void a();

        void a(String str);
    }

    public static ISBannerSize a() {
        return new ISBannerSize("LEADERBOARD", 728, 90);
    }

    public static ISBannerSize a(String str, int i10, int i11) {
        return new ISBannerSize(str, i10, i11);
    }

    public static void a(IronSourceBannerLayout ironSourceBannerLayout, View view, FrameLayout.LayoutParams layoutParams) {
        if (ironSourceBannerLayout != null && view != null && layoutParams != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(ironSourceBannerLayout, view, layoutParams));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0098 A[Catch:{ Exception -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.util.Map<java.lang.String, java.lang.Object> r8, com.ironsource.mediationsdk.ISBannerSize r9) {
        /*
            java.lang.String r0 = "ext1"
            if (r9 == 0) goto L_0x00c3
            java.lang.String r1 = r9.getDescription()     // Catch:{ Exception -> 0x00b9 }
            r2 = -1
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x00b9 }
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r3) {
                case -387072689: goto L_0x003d;
                case 72205083: goto L_0x0033;
                case 79011241: goto L_0x0029;
                case 1951953708: goto L_0x001f;
                case 1999208305: goto L_0x0015;
                default: goto L_0x0014;
            }     // Catch:{ Exception -> 0x00b9 }
        L_0x0014:
            goto L_0x0046
        L_0x0015:
            java.lang.String r3 = "CUSTOM"
            boolean r1 = r1.equals(r3)     // Catch:{ Exception -> 0x00b9 }
            if (r1 == 0) goto L_0x0046
            r2 = r4
            goto L_0x0046
        L_0x001f:
            java.lang.String r3 = "BANNER"
            boolean r1 = r1.equals(r3)     // Catch:{ Exception -> 0x00b9 }
            if (r1 == 0) goto L_0x0046
            r2 = 0
            goto L_0x0046
        L_0x0029:
            java.lang.String r3 = "SMART"
            boolean r1 = r1.equals(r3)     // Catch:{ Exception -> 0x00b9 }
            if (r1 == 0) goto L_0x0046
            r2 = r5
            goto L_0x0046
        L_0x0033:
            java.lang.String r3 = "LARGE"
            boolean r1 = r1.equals(r3)     // Catch:{ Exception -> 0x00b9 }
            if (r1 == 0) goto L_0x0046
            r2 = r7
            goto L_0x0046
        L_0x003d:
            java.lang.String r3 = "RECTANGLE"
            boolean r1 = r1.equals(r3)     // Catch:{ Exception -> 0x00b9 }
            if (r1 == 0) goto L_0x0046
            r2 = r6
        L_0x0046:
            java.lang.String r1 = "bannerAdSize"
            if (r2 == 0) goto L_0x008d
            if (r2 == r7) goto L_0x0088
            if (r2 == r6) goto L_0x0083
            if (r2 == r5) goto L_0x007d
            if (r2 == r4) goto L_0x0053
            goto L_0x0092
        L_0x0053:
            r2 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x00b9 }
            r8.put(r1, r2)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r1 = "custom_banner_size"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b9 }
            r2.<init>()     // Catch:{ Exception -> 0x00b9 }
            int r3 = r9.getWidth()     // Catch:{ Exception -> 0x00b9 }
            r2.append(r3)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r3 = "x"
            r2.append(r3)     // Catch:{ Exception -> 0x00b9 }
            int r3 = r9.getHeight()     // Catch:{ Exception -> 0x00b9 }
            r2.append(r3)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00b9 }
        L_0x0079:
            r8.put(r1, r2)     // Catch:{ Exception -> 0x00b9 }
            goto L_0x0092
        L_0x007d:
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x00b9 }
            goto L_0x0079
        L_0x0083:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x00b9 }
            goto L_0x0079
        L_0x0088:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x00b9 }
            goto L_0x0079
        L_0x008d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x00b9 }
            goto L_0x0079
        L_0x0092:
            boolean r9 = r9.isAdaptive()     // Catch:{ Exception -> 0x00b9 }
            if (r9 == 0) goto L_0x00b8
            java.lang.String r9 = "Adaptive=true"
            boolean r1 = r8.containsKey(r0)     // Catch:{ Exception -> 0x00b9 }
            if (r1 == 0) goto L_0x00b5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b9 }
            r9.<init>()     // Catch:{ Exception -> 0x00b9 }
            java.lang.Object r1 = r8.get(r0)     // Catch:{ Exception -> 0x00b9 }
            r9.append(r1)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r1 = " , Adaptive=true"
            r9.append(r1)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00b9 }
        L_0x00b5:
            r8.put(r0, r9)     // Catch:{ Exception -> 0x00b9 }
        L_0x00b8:
            return
        L_0x00b9:
            r8 = move-exception
            com.ironsource.mediationsdk.logger.IronLog r9 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r8 = android.util.Log.getStackTraceString(r8)
            r9.error(r8)
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C0189n.a(java.util.Map, com.ironsource.mediationsdk.ISBannerSize):void");
    }

    public static void b(IronSourceBannerLayout ironSourceBannerLayout) {
        if (ironSourceBannerLayout != null) {
            ironSourceBannerLayout.f3934d = true;
            ironSourceBannerLayout.f3933c = null;
            ironSourceBannerLayout.f3931a = null;
            ironSourceBannerLayout.f3932b = null;
            ironSourceBannerLayout.f3935e = null;
            ironSourceBannerLayout.removeBannerListener();
        }
    }

    public void a(long j10) {
        this.f4806a = System.currentTimeMillis() + j10;
    }

    public long b() {
        return Math.max(0, this.f4806a - System.currentTimeMillis());
    }

    public void b(long j10) {
        this.f4807b = j10;
    }

    public void c() {
        this.f4806a = 0;
        this.f4807b = 0;
    }

    public void c(long j10) {
        this.f4806a = (j10 - this.f4807b) + this.f4806a;
    }
}
