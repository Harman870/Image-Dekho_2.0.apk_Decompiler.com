package com.iab.omid.library.ironsrc.internal;

import android.annotation.SuppressLint;
import android.view.View;
import com.iab.omid.library.ironsrc.adsession.a;

public class b extends d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d  reason: collision with root package name */
    private static b f3544d = new b();

    private b() {
    }

    public static b g() {
        return f3544d;
    }

    public void b(boolean z9) {
        for (a adSessionStatePublisher : c.c().b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().a(z9);
        }
    }

    public boolean d() {
        for (a c10 : c.c().a()) {
            View c11 = c10.c();
            if (c11 != null && c11.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
