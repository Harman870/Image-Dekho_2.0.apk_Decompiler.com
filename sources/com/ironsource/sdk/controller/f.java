package com.ironsource.sdk.controller;

import com.ironsource.sdk.a.h;
import com.ironsource.sdk.l.d;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.Map;
import org.json.JSONObject;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public long f5378a;

    /* renamed from: b  reason: collision with root package name */
    public int f5379b;

    /* renamed from: c  reason: collision with root package name */
    public int f5380c;

    /* renamed from: d  reason: collision with root package name */
    public b f5381d = b.NONE;

    /* renamed from: e  reason: collision with root package name */
    public String f5382e;

    /* renamed from: f  reason: collision with root package name */
    public String f5383f;

    /* renamed from: g  reason: collision with root package name */
    public d f5384g;

    public enum a {
        ;
        

        /* renamed from: a  reason: collision with root package name */
        public static final int f5385a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f5386b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f5387c = 3;

        /* access modifiers changed from: public */
        static {
            f5388d = new int[]{1, 2, 3};
        }

        public static int[] a() {
            return (int[]) f5388d.clone();
        }
    }

    public enum b {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);
        

        /* renamed from: g  reason: collision with root package name */
        public int f5396g;

        /* access modifiers changed from: public */
        b(int i10) {
            this.f5396g = i10;
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5397a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|5|6|7|8|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
        static {
            /*
                int[] r0 = com.ironsource.sdk.controller.f.a.a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5397a = r0
                r1 = 0
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 2
                int[] r1 = f5397a     // Catch:{ NoSuchFieldError -> 0x0012 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r1 = f5397a     // Catch:{ NoSuchFieldError -> 0x0017 }
                r2 = 3
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.f.c.<clinit>():void");
        }
    }

    public f(JSONObject jSONObject, String str, String str2, d dVar) {
        int optInt = jSONObject.optInt("controllerSourceStrategy", -1);
        this.f5379b = optInt;
        this.f5380c = optInt != 1 ? optInt != 2 ? a.f5385a : a.f5387c : a.f5386b;
        this.f5382e = str;
        this.f5383f = str2;
        this.f5384g = dVar;
    }

    public final void a(b bVar) {
        com.ironsource.sdk.a.a a10 = new com.ironsource.sdk.a.a().a("generalmessage", Integer.valueOf(this.f5379b)).a("controllersource", Integer.valueOf(bVar.f5396g));
        if (this.f5378a > 0) {
            a10.a("timingvalue", Long.valueOf(System.currentTimeMillis() - this.f5378a));
        }
        com.ironsource.sdk.a.f.a(h.f5122v, (Map<String, Object>) a10.f5086a);
    }

    public final void b(com.ironsource.sdk.h.c cVar) {
        if (!this.f5384g.b()) {
            this.f5384g.a(cVar, this.f5383f);
        }
    }

    public final com.ironsource.sdk.h.c c() {
        return new com.ironsource.sdk.h.c(this.f5382e, "mobileController.html");
    }

    public final boolean d() {
        try {
            if (!new com.ironsource.sdk.h.c(this.f5382e, "fallback_mobileController.html").exists()) {
                return false;
            }
            return IronSourceStorageUtils.renameFile(new com.ironsource.sdk.h.c(this.f5382e, "fallback_mobileController.html").getPath(), c().getPath());
        } catch (Exception unused) {
            return false;
        }
    }

    public final void e() {
        try {
            com.ironsource.sdk.h.c c10 = c();
            if (c10.exists()) {
                com.ironsource.sdk.h.c cVar = new com.ironsource.sdk.h.c(this.f5382e, "fallback_mobileController.html");
                if (cVar.exists()) {
                    cVar.delete();
                }
                IronSourceStorageUtils.renameFile(c10.getPath(), cVar.getPath());
            }
        } catch (Exception unused) {
        }
    }
}
