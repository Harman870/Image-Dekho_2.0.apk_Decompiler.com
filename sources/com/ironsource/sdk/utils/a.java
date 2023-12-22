package com.ironsource.sdk.utils;

import android.content.Context;
import com.ironsource.environment.h;

public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static a f5761g;

    /* renamed from: a  reason: collision with root package name */
    public String f5762a = h.h();

    /* renamed from: b  reason: collision with root package name */
    public String f5763b = h.g();

    /* renamed from: c  reason: collision with root package name */
    public String f5764c = h.i();

    /* renamed from: d  reason: collision with root package name */
    public String f5765d = h.e();

    /* renamed from: e  reason: collision with root package name */
    public int f5766e = h.f();

    /* renamed from: f  reason: collision with root package name */
    public String f5767f;

    public a(Context context) {
        this.f5767f = h.i(context);
    }

    public static a a(Context context) {
        if (f5761g == null) {
            f5761g = new a(context);
        }
        return f5761g;
    }

    public static void a() {
        f5761g = null;
    }

    public static float b(Context context) {
        return h.l(context);
    }
}
