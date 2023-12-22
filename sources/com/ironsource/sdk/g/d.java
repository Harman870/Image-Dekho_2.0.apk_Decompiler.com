package com.ironsource.sdk.g;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public int f5626a;

    /* renamed from: b  reason: collision with root package name */
    public int f5627b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5628c;

    public enum a {
        ;
        

        /* renamed from: a  reason: collision with root package name */
        public static final int f5629a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f5630b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f5631c = 3;

        /* access modifiers changed from: public */
        static {
            f5632d = new int[]{1, 2, 3};
        }

        public static int[] a() {
            return (int[]) f5632d.clone();
        }
    }

    public enum b {
        None,
        Loading,
        Loaded,
        Ready
    }

    public enum c {
        Web,
        Native,
        None
    }

    /* renamed from: com.ironsource.sdk.g.d$d  reason: collision with other inner class name */
    public enum C0067d {
        MODE_0(0),
        MODE_1(1),
        MODE_3(3);
        

        /* renamed from: d  reason: collision with root package name */
        public int f5646d;

        /* access modifiers changed from: public */
        C0067d(int i10) {
            this.f5646d = i10;
        }
    }

    public enum e {
        f5647a,
        OfferWall,
        f5649c,
        OfferWallCredits,
        RewardedVideo,
        NativeAd
    }

    public d() {
    }

    public d(int i10, int i11, int i12, boolean z9) {
        this.f5626a = i11;
        this.f5627b = i12;
        this.f5628c = z9;
    }

    public int a() {
        return this.f5626a;
    }

    public int b() {
        return this.f5627b;
    }

    public boolean c() {
        return this.f5628c;
    }
}
