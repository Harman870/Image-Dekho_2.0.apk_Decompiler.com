package com.ironsource.mediationsdk.events;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import x7.a;
import x7.b;
import x7.c;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public String f4550a;

    /* renamed from: b  reason: collision with root package name */
    public String f4551b;

    /* renamed from: c  reason: collision with root package name */
    public com.ironsource.mediationsdk.model.d f4552c;

    public d(String str, String str2, com.ironsource.mediationsdk.model.d dVar) {
        this.f4550a = str;
        this.f4551b = str2;
        this.f4552c = dVar;
    }

    public static a b(int i10, String str) {
        if ("ironbeast".equals(str)) {
            return new b(i10);
        }
        if ("outcome".equals(str)) {
            return new c(i10);
        }
        if (i10 == 2) {
            return new b(i10);
        }
        if (i10 == 3) {
            return new c(i10);
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
        logger.log(ironSourceTag, "EventsFormatterFactory failed to instantiate a formatter (type: " + str + ", adUnit: " + i10 + ")", 2);
        return null;
    }

    public String a() {
        return this.f4550a;
    }

    public String b() {
        return this.f4551b;
    }

    public boolean c() {
        return this.f4552c.f4720i.f4977c > 0;
    }

    public long d() {
        return this.f4552c.f4720i.f4981g;
    }

    public int e() {
        return this.f4552c.f4719h;
    }

    public long f() {
        return this.f4552c.f4714c;
    }

    public int g() {
        return this.f4552c.f4718g;
    }

    public com.ironsource.mediationsdk.utils.c h() {
        return this.f4552c.f4720i;
    }

    public com.ironsource.mediationsdk.model.d i() {
        return this.f4552c;
    }

    public boolean j() {
        return this.f4552c.k;
    }

    public long k() {
        return this.f4552c.f4722l;
    }
}
