package com.ironsource.mediationsdk.adunit.c.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final C0048a f4208a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4209b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4210c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4211d;

    /* renamed from: com.ironsource.mediationsdk.adunit.c.c.a$a  reason: collision with other inner class name */
    public enum C0048a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public a(C0048a aVar, long j10, long j11, long j12) {
        this.f4208a = aVar;
        this.f4209b = j10;
        this.f4210c = j11;
        this.f4211d = j12;
    }

    public final boolean a() {
        C0048a aVar = this.f4208a;
        return aVar == C0048a.MANUAL || aVar == C0048a.MANUAL_WITH_AUTOMATIC_RELOAD;
    }

    public final boolean b() {
        C0048a aVar = this.f4208a;
        return aVar == C0048a.AUTOMATIC_LOAD_AFTER_CLOSE || aVar == C0048a.AUTOMATIC_LOAD_WHILE_SHOW;
    }
}
