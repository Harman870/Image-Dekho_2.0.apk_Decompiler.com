package com.iab.omid.library.ironsrc.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.ironsrc.adsession.a;
import com.iab.omid.library.ironsrc.devicevolume.b;
import com.iab.omid.library.ironsrc.devicevolume.c;
import com.iab.omid.library.ironsrc.devicevolume.e;
import com.iab.omid.library.ironsrc.internal.d;
import com.iab.omid.library.ironsrc.walking.TreeWalker;

public class h implements c, d.a {

    /* renamed from: f  reason: collision with root package name */
    private static h f3560f;

    /* renamed from: a  reason: collision with root package name */
    private float f3561a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    private final e f3562b;

    /* renamed from: c  reason: collision with root package name */
    private final b f3563c;

    /* renamed from: d  reason: collision with root package name */
    private com.iab.omid.library.ironsrc.devicevolume.d f3564d;

    /* renamed from: e  reason: collision with root package name */
    private c f3565e;

    public h(e eVar, b bVar) {
        this.f3562b = eVar;
        this.f3563c = bVar;
    }

    private c a() {
        if (this.f3565e == null) {
            this.f3565e = c.c();
        }
        return this.f3565e;
    }

    public static h c() {
        if (f3560f == null) {
            f3560f = new h(new e(), new b());
        }
        return f3560f;
    }

    public void a(float f10) {
        this.f3561a = f10;
        for (a adSessionStatePublisher : a().a()) {
            adSessionStatePublisher.getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f3564d = this.f3562b.a(new Handler(), context, this.f3563c.a(), this);
    }

    public void a(boolean z9) {
        if (z9) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }

    public float b() {
        return this.f3561a;
    }

    public void d() {
        b.g().a((d.a) this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f3564d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f3564d.d();
    }
}
