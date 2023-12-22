package com.ironsource.mediationsdk.services;

import com.ironsource.mediationsdk.services.a;
import o8.g;
import x8.d;
import x8.f;

public final class MediationServices implements IMediationServiceEditor, IMediationServiceProvider {
    public static final Companion Companion = new Companion((d) null);

    /* renamed from: b  reason: collision with root package name */
    public static final g f4881b;

    /* renamed from: a  reason: collision with root package name */
    public final b f4882a;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }

        public static /* synthetic */ void getEditor$annotations() {
        }

        public static /* synthetic */ void getProvider$annotations() {
        }

        public final IMediationServiceEditor getEditor() {
            return (MediationServices) MediationServices.f4881b.getValue();
        }

        public final IMediationServiceProvider getProvider() {
            return (MediationServices) MediationServices.f4881b.getValue();
        }
    }

    public static final class a extends x8.g implements w8.a<MediationServices> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f4883a = new a();

        public a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new MediationServices((d) null);
        }
    }

    static {
        a aVar = a.f4883a;
        f.f(aVar, "initializer");
        f4881b = new g(aVar);
    }

    private MediationServices() {
        this.f4882a = new b();
    }

    public /* synthetic */ MediationServices(d dVar) {
        this();
    }

    public static final IMediationServiceEditor getEditor() {
        return Companion.getEditor();
    }

    public static final IMediationServiceProvider getProvider() {
        return Companion.getProvider();
    }

    public final a getSessionDepthService() {
        return this.f4882a;
    }

    public final a.C0056a getSessionDepthServiceEditor() {
        return this.f4882a;
    }
}
