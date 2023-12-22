package com.ironsource.sdk.controller;

import java.util.ArrayList;

/* renamed from: com.ironsource.sdk.controller.b  reason: case insensitive filesystem */
public final class C0200b {

    /* renamed from: a  reason: collision with root package name */
    public int f5371a = C0061b.f5373a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f5372b = new ArrayList();

    /* 'enum' modifier removed */
    /* JADX WARNING: Enum class init method not found */
    /* renamed from: com.ironsource.sdk.controller.b$b  reason: collision with other inner class name */
    public static final class C0061b extends Enum<C0061b> {

        /* renamed from: a  reason: collision with root package name */
        public static final int f5373a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f5374b = 2;
    }

    public C0200b(String str) {
    }

    public final synchronized void a() {
        this.f5371a = C0061b.f5374b;
    }

    public final synchronized void a(Runnable runnable) {
        if (this.f5371a != C0061b.f5374b) {
            this.f5372b.add(runnable);
        } else {
            runnable.run();
        }
    }

    public final synchronized void b() {
        this.f5371a = C0061b.f5373a;
    }

    public final synchronized void c() {
        Object[] array = this.f5372b.toArray();
        for (int i10 = 0; i10 < array.length; i10++) {
            ((Runnable) array[i10]).run();
            array[i10] = null;
        }
        this.f5372b.clear();
    }
}
