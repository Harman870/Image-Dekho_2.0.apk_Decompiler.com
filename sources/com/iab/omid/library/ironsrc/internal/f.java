package com.iab.omid.library.ironsrc.internal;

import android.annotation.SuppressLint;
import android.content.Context;

public class f {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b  reason: collision with root package name */
    private static f f3555b = new f();

    /* renamed from: a  reason: collision with root package name */
    private Context f3556a;

    private f() {
    }

    public static f b() {
        return f3555b;
    }

    public Context a() {
        return this.f3556a;
    }

    public void a(Context context) {
        this.f3556a = context != null ? context.getApplicationContext() : null;
    }
}
