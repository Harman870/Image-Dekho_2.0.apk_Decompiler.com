package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.MutableContextWrapper;

/* renamed from: com.ironsource.sdk.controller.c  reason: case insensitive filesystem */
public final class C0201c {

    /* renamed from: a  reason: collision with root package name */
    public MutableContextWrapper f5375a;

    public final Activity a() {
        return (Activity) this.f5375a.getBaseContext();
    }

    public final synchronized void a(Activity activity) {
        if (this.f5375a == null) {
            this.f5375a = new MutableContextWrapper(activity);
        }
        this.f5375a.setBaseContext(activity);
    }

    public final synchronized void b() {
        this.f5375a = null;
    }
}
