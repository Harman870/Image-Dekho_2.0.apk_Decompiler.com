package com.ironsource.environment.c;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.a;
import com.ironsource.environment.h;
import com.ironsource.environment.thread.IronSourceThreadManager;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, Object> f3716a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f3717b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicBoolean f3718c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static volatile b f3719a = new b(0);
    }

    private b() {
        this.f3717b = new AtomicBoolean(false);
        this.f3718c = new AtomicBoolean(false);
        this.f3716a = new ConcurrentHashMap<>();
    }

    public /* synthetic */ b(int i10) {
        this();
    }

    public final JSONObject a(Context context) {
        c(context);
        return new JSONObject(d.a(this.f3716a));
    }

    public final void b(String str, Object obj) {
        if (str != null && obj != null) {
            try {
                if (obj instanceof Boolean) {
                    obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
                }
                this.f3716a.put(str, obj);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public final void c(Context context) {
        if (context != null) {
            boolean z9 = false;
            if (!this.f3717b.get()) {
                try {
                    this.f3717b.set(true);
                    IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new n7.a(this, context));
                } catch (Exception unused) {
                    this.f3717b.set(false);
                }
            }
            String B = h.B(context);
            if (!TextUtils.isEmpty(B)) {
                b("asid", B);
            } else {
                try {
                    z9 = this.f3716a.containsKey("asid");
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                if (z9) {
                    try {
                        this.f3716a.remove("asid");
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                b("lang", language.toUpperCase());
            }
            String c10 = h.c();
            if (!TextUtils.isEmpty(c10)) {
                b("tz", c10);
            }
            String a10 = com.ironsource.d.a.a(context);
            if (!TextUtils.isEmpty(a10) && !a10.equals("none")) {
                b("connt", a10);
            }
            b("vpn", Boolean.valueOf(com.ironsource.d.a.c(context)));
            String j10 = h.j(context);
            if (!TextUtils.isEmpty(j10)) {
                b("icc", j10);
            }
            b("vol", Float.valueOf(h.l(context)));
            b("dfs", String.valueOf(h.p()));
            b("scrnw", Integer.valueOf(h.k()));
            b("scrnh", Integer.valueOf(h.l()));
            b("ltime", String.valueOf(h.a()));
            b("tzoff", String.valueOf(h.b()));
            b("mcc", Integer.valueOf(a.AnonymousClass1.c(context)));
            b("mnc", Integer.valueOf(a.AnonymousClass1.d(context)));
            b("sdcrd", Boolean.valueOf(h.d()));
            b("chrg", Boolean.valueOf(h.e(context)));
            b("chrgt", Integer.valueOf(h.f(context)));
            b("apm", Boolean.valueOf(h.g(context)));
            b("owp", Boolean.valueOf(h.h(context)));
            b("rt", Boolean.valueOf(h.j()));
            b("sscl", String.valueOf(h.o()));
            b("bat", Integer.valueOf(h.v(context)));
            b("lpm", Boolean.valueOf(h.w(context)));
            b("apor", h.n(context));
            b("ua", h.q());
            int E = h.E(context);
            if (E >= 0) {
                b("tca", Integer.valueOf(E));
            }
            String F = h.F(context);
            if (F != null) {
                b("tcs", F);
            }
        }
    }
}
