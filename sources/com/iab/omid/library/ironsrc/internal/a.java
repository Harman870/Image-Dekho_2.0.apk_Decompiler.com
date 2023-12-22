package com.iab.omid.library.ironsrc.internal;

import android.content.Context;
import com.iab.omid.library.ironsrc.internal.d;
import com.iab.omid.library.ironsrc.utils.f;
import java.util.Date;

public class a implements d.a {

    /* renamed from: f  reason: collision with root package name */
    private static a f3538f = new a(new d());

    /* renamed from: a  reason: collision with root package name */
    public f f3539a = new f();

    /* renamed from: b  reason: collision with root package name */
    private Date f3540b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3541c;

    /* renamed from: d  reason: collision with root package name */
    private d f3542d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3543e;

    private a(d dVar) {
        this.f3542d = dVar;
    }

    public static a a() {
        return f3538f;
    }

    private void c() {
        if (this.f3541c && this.f3540b != null) {
            for (com.iab.omid.library.ironsrc.adsession.a adSessionStatePublisher : c.c().a()) {
                adSessionStatePublisher.getAdSessionStatePublisher().a(b());
            }
        }
    }

    public void a(Context context) {
        if (!this.f3541c) {
            this.f3542d.a(context);
            this.f3542d.a((d.a) this);
            this.f3542d.e();
            this.f3543e = this.f3542d.c();
            this.f3541c = true;
        }
    }

    public void a(boolean z9) {
        if (!this.f3543e && z9) {
            d();
        }
        this.f3543e = z9;
    }

    public Date b() {
        Date date = this.f3540b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date a10 = this.f3539a.a();
        Date date = this.f3540b;
        if (date == null || a10.after(date)) {
            this.f3540b = a10;
            c();
        }
    }
}
