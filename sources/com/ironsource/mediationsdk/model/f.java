package com.ironsource.mediationsdk.model;

import com.ironsource.sdk.a.g;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final i f4725a;

    /* renamed from: b  reason: collision with root package name */
    public final g f4726b;

    /* renamed from: c  reason: collision with root package name */
    public final q f4727c;

    /* renamed from: d  reason: collision with root package name */
    public final h f4728d;

    /* renamed from: e  reason: collision with root package name */
    public final k f4729e;

    /* renamed from: f  reason: collision with root package name */
    public final d f4730f;

    /* renamed from: g  reason: collision with root package name */
    public final s f4731g;

    /* renamed from: h  reason: collision with root package name */
    public final com.ironsource.mediationsdk.utils.g f4732h;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public q f4733a = null;

        /* renamed from: b  reason: collision with root package name */
        public h f4734b = null;

        /* renamed from: c  reason: collision with root package name */
        public k f4735c = null;

        /* renamed from: d  reason: collision with root package name */
        public d f4736d = null;

        /* renamed from: e  reason: collision with root package name */
        public i f4737e = null;

        /* renamed from: f  reason: collision with root package name */
        public g f4738f = null;

        /* renamed from: g  reason: collision with root package name */
        public s f4739g = null;

        /* renamed from: h  reason: collision with root package name */
        public com.ironsource.mediationsdk.utils.g f4740h = null;

        public final a a(d dVar) {
            this.f4736d = dVar;
            return this;
        }

        public final a a(h hVar) {
            this.f4734b = hVar;
            return this;
        }

        public final a a(i iVar) {
            this.f4737e = iVar;
            return this;
        }

        public final a a(k kVar) {
            this.f4735c = kVar;
            return this;
        }

        public final a a(q qVar) {
            this.f4733a = qVar;
            return this;
        }

        public final a a(s sVar) {
            this.f4739g = sVar;
            return this;
        }

        public final a a(com.ironsource.mediationsdk.utils.g gVar) {
            this.f4740h = gVar;
            return this;
        }

        public final a a(g gVar) {
            this.f4738f = gVar;
            return this;
        }

        public final f a() {
            return new f(this.f4733a, this.f4734b, this.f4735c, this.f4736d, this.f4737e, this.f4738f, this.f4739g, this.f4740h, (byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return x8.f.a(this.f4733a, aVar.f4733a) && x8.f.a(this.f4734b, aVar.f4734b) && x8.f.a(this.f4735c, aVar.f4735c) && x8.f.a(this.f4736d, aVar.f4736d) && x8.f.a(this.f4737e, aVar.f4737e) && x8.f.a(this.f4738f, aVar.f4738f) && x8.f.a(this.f4739g, aVar.f4739g) && x8.f.a(this.f4740h, aVar.f4740h);
        }

        public final int hashCode() {
            q qVar = this.f4733a;
            int i10 = 0;
            int hashCode = (qVar == null ? 0 : qVar.hashCode()) * 31;
            h hVar = this.f4734b;
            int hashCode2 = (hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
            k kVar = this.f4735c;
            int hashCode3 = (hashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
            d dVar = this.f4736d;
            int hashCode4 = (hashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            i iVar = this.f4737e;
            int hashCode5 = (hashCode4 + (iVar == null ? 0 : iVar.hashCode())) * 31;
            g gVar = this.f4738f;
            int hashCode6 = (hashCode5 + (gVar == null ? 0 : gVar.hashCode())) * 31;
            s sVar = this.f4739g;
            int hashCode7 = (hashCode6 + (sVar == null ? 0 : sVar.hashCode())) * 31;
            com.ironsource.mediationsdk.utils.g gVar2 = this.f4740h;
            if (gVar2 != null) {
                i10 = gVar2.hashCode();
            }
            return hashCode7 + i10;
        }

        public final String toString() {
            return "Builder(rewardedVideoConfigurations=" + this.f4733a + ", interstitialConfigurations=" + this.f4734b + ", offerwallConfigurations=" + this.f4735c + ", bannerConfigurations=" + this.f4736d + ", nativeAdConfigurations=" + this.f4737e + ", applicationConfigurations=" + this.f4738f + ", testSuiteSettings=" + this.f4739g + ", adQualityConfigurations=" + this.f4740h + ')';
        }
    }

    public f(q qVar, h hVar, k kVar, d dVar, i iVar, g gVar, s sVar, com.ironsource.mediationsdk.utils.g gVar2, byte b10) {
        this.f4727c = qVar;
        this.f4728d = hVar;
        this.f4729e = kVar;
        this.f4730f = dVar;
        this.f4725a = iVar;
        this.f4726b = gVar;
        this.f4731g = sVar;
        this.f4732h = gVar2;
    }

    public final q a() {
        return this.f4727c;
    }

    public final h b() {
        return this.f4728d;
    }

    public final k c() {
        return this.f4729e;
    }

    public final d d() {
        return this.f4730f;
    }

    public final i e() {
        return this.f4725a;
    }

    public final g f() {
        return this.f4726b;
    }

    public final s g() {
        return this.f4731g;
    }

    public final com.ironsource.mediationsdk.utils.g h() {
        return this.f4732h;
    }
}
