package com.ironsource.environment.thread;

import android.os.Handler;
import android.os.Looper;
import x8.f;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f3770a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final Handler f3771b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public static final b f3772c;

    /* renamed from: d  reason: collision with root package name */
    public static final b f3773d;

    static {
        b bVar = new b("isadplayer-background");
        bVar.start();
        bVar.a();
        f3772c = bVar;
        b bVar2 = new b("isadplayer-publisher-callbacks");
        bVar2.start();
        bVar2.a();
        f3773d = bVar2;
    }

    private a() {
    }

    public static Looper a() {
        return f3772c.getLooper();
    }

    public final void a(Runnable runnable) {
        f.f(runnable, "action");
        f3771b.postDelayed(runnable, 0);
    }

    public final void b(Runnable runnable) {
        f.f(runnable, "action");
        f3772c.a(runnable, 0);
    }

    public final void c(Runnable runnable) {
        f.f(runnable, "action");
        f3773d.a(runnable, 0);
    }
}
