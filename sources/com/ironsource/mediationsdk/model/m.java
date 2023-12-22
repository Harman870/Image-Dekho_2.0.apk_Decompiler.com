package com.ironsource.mediationsdk.model;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4768a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4769b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4770c;

    /* renamed from: d  reason: collision with root package name */
    public n f4771d;

    /* renamed from: e  reason: collision with root package name */
    public int f4772e;

    /* renamed from: f  reason: collision with root package name */
    public int f4773f;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f4774a = true;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4775b = false;

        /* renamed from: c  reason: collision with root package name */
        public boolean f4776c = false;

        /* renamed from: d  reason: collision with root package name */
        public n f4777d = null;

        /* renamed from: e  reason: collision with root package name */
        public int f4778e = 0;

        /* renamed from: f  reason: collision with root package name */
        public int f4779f = 0;

        public final a a(boolean z9, int i10) {
            this.f4776c = z9;
            this.f4779f = i10;
            return this;
        }

        public final a a(boolean z9, n nVar, int i10) {
            this.f4775b = z9;
            if (nVar == null) {
                nVar = n.PER_DAY;
            }
            this.f4777d = nVar;
            this.f4778e = i10;
            return this;
        }

        public final m a() {
            return new m(this.f4774a, this.f4775b, this.f4776c, this.f4777d, this.f4778e, this.f4779f);
        }
    }

    public m(boolean z9, boolean z10, boolean z11, n nVar, int i10, int i11) {
        this.f4768a = z9;
        this.f4769b = z10;
        this.f4770c = z11;
        this.f4771d = nVar;
        this.f4772e = i10;
        this.f4773f = i11;
    }
}
