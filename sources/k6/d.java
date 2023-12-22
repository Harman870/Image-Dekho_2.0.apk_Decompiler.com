package k6;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k6.l;

public final /* synthetic */ class d implements l.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f9074a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f9075b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f9076c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f9077d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f9078e;

    public /* synthetic */ d(k kVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        this.f9074a = kVar;
        this.f9075b = runnable;
        this.f9076c = j10;
        this.f9077d = j11;
        this.f9078e = timeUnit;
    }

    public final ScheduledFuture a(l.a aVar) {
        k kVar = this.f9074a;
        Runnable runnable = this.f9075b;
        return kVar.f9100b.scheduleWithFixedDelay(new g(kVar, runnable, aVar), this.f9076c, this.f9077d, this.f9078e);
    }
}
