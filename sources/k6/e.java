package k6;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k6.l;

public final /* synthetic */ class e implements l.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f9079a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f9080b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f9081c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f9082d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f9083e;

    public /* synthetic */ e(k kVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        this.f9079a = kVar;
        this.f9080b = runnable;
        this.f9081c = j10;
        this.f9082d = j11;
        this.f9083e = timeUnit;
    }

    public final ScheduledFuture a(l.a aVar) {
        k kVar = this.f9079a;
        Runnable runnable = this.f9080b;
        return kVar.f9100b.scheduleAtFixedRate(new f(kVar, runnable, aVar), this.f9081c, this.f9082d, this.f9083e);
    }
}
