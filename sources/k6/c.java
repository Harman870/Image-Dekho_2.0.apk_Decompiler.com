package k6;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k6.l;

public final /* synthetic */ class c implements l.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f9070a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f9071b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f9072c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f9073d;

    public /* synthetic */ c(k kVar, Runnable runnable, long j10, TimeUnit timeUnit) {
        this.f9070a = kVar;
        this.f9071b = runnable;
        this.f9072c = j10;
        this.f9073d = timeUnit;
    }

    public final ScheduledFuture a(l.a aVar) {
        k kVar = this.f9070a;
        Runnable runnable = this.f9071b;
        return kVar.f9100b.schedule(new h(kVar, runnable, aVar), this.f9072c, this.f9073d);
    }
}
