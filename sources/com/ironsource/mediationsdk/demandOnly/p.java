package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.demandOnly.s;
import com.ironsource.mediationsdk.logger.IronSourceError;
import x8.f;

public interface p extends s {

    public static abstract class a implements p {

        /* renamed from: a  reason: collision with root package name */
        public final String f4467a;

        /* renamed from: b  reason: collision with root package name */
        public String f4468b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f4469c;

        public a(String str) {
            this.f4467a = str;
        }

        public final String a() {
            return this.f4467a;
        }

        public final void a(String str) {
            this.f4468b = str;
        }

        public final void a(boolean z9) {
            this.f4469c = true;
        }

        public final String b() {
            return this.f4468b;
        }
    }

    public static final class b extends a {

        /* renamed from: d  reason: collision with root package name */
        public Activity f4470d;

        /* renamed from: e  reason: collision with root package name */
        public ISDemandOnlyBannerLayout f4471e;

        public b(String str) {
            super(str);
        }

        public final void a(Activity activity) {
            this.f4470d = activity;
        }

        public final void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
            this.f4471e = iSDemandOnlyBannerLayout;
        }

        public final ISDemandOnlyBannerLayout c() {
            return this.f4471e;
        }

        public final IronSourceError d() {
            IronSourceError ironSourceError;
            new s.a();
            if (this.f4470d == null) {
                ironSourceError = new IronSourceError(1062, "Banner was initialized and loaded without Activity");
            } else {
                ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.f4471e;
                if (iSDemandOnlyBannerLayout == null) {
                    ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "Missing banner layout");
                } else {
                    f.c(iSDemandOnlyBannerLayout);
                    if (iSDemandOnlyBannerLayout.isDestroyed()) {
                        ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "Banner layout is destroyed");
                    } else {
                        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout2 = this.f4471e;
                        f.c(iSDemandOnlyBannerLayout2);
                        ISBannerSize size = iSDemandOnlyBannerLayout2.getSize();
                        if (size == null) {
                            ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "Missing banner size");
                        } else if ("CUSTOM" == size.getDescription() && (size.getHeight() <= 0 || size.getWidth() <= 0)) {
                            ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "Unsupported banner size. Height and width must be bigger than 0");
                        } else if (this.f4467a == null) {
                            ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "Missing instance Id");
                        } else {
                            String str = this.f4468b;
                            ironSourceError = (!(str == null || str.length() == 0) || !this.f4469c) ? null : new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "Missing adm");
                        }
                    }
                }
            }
            if (ironSourceError != null) {
                return ironSourceError;
            }
            return null;
        }
    }

    public static final class c extends a {
        public c(String str) {
            super(str);
        }

        public final IronSourceError c() {
            IronSourceError ironSourceError;
            new s.b();
            if (this.f4467a == null) {
                ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "Missing instance Id");
            } else {
                String str = this.f4468b;
                ironSourceError = (!(str == null || str.length() == 0) || !this.f4469c) ? null : new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "Missing adm");
            }
            if (ironSourceError != null) {
                return ironSourceError;
            }
            return null;
        }
    }
}
