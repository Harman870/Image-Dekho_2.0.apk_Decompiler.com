package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.b;
import f2.g;
import j2.f;
import java.util.List;
import java.util.Map;
import q1.m;
import r1.b;
import z5.c;

public final class h extends ContextWrapper {
    public static final a k = new a();

    /* renamed from: a  reason: collision with root package name */
    public final b f2553a;

    /* renamed from: b  reason: collision with root package name */
    public final f f2554b;

    /* renamed from: c  reason: collision with root package name */
    public final c f2555c;

    /* renamed from: d  reason: collision with root package name */
    public final b.a f2556d;

    /* renamed from: e  reason: collision with root package name */
    public final List<f2.f<Object>> f2557e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Class<?>, p<?, ?>> f2558f;

    /* renamed from: g  reason: collision with root package name */
    public final m f2559g;

    /* renamed from: h  reason: collision with root package name */
    public final i f2560h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2561i;

    /* renamed from: j  reason: collision with root package name */
    public g f2562j;

    public h(Context context, r1.b bVar, l lVar, c cVar, c cVar2, m.b bVar2, List list, m mVar, i iVar, int i10) {
        super(context.getApplicationContext());
        this.f2553a = bVar;
        this.f2555c = cVar;
        this.f2556d = cVar2;
        this.f2557e = list;
        this.f2558f = bVar2;
        this.f2559g = mVar;
        this.f2560h = iVar;
        this.f2561i = i10;
        this.f2554b = new f(lVar);
    }

    public final k a() {
        return (k) this.f2554b.get();
    }
}
