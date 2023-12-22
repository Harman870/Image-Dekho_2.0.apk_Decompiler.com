package k6;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k6.l;

public final /* synthetic */ class b implements l.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f9066a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f9067b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f9068c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f9069d;

    public /* synthetic */ b(k kVar, Callable callable, long j10, TimeUnit timeUnit) {
        this.f9066a = kVar;
        this.f9067b = callable;
        this.f9068c = j10;
        this.f9069d = timeUnit;
    }

    public final ScheduledFuture a(l.a aVar) {
        k kVar = this.f9066a;
        Callable callable = this.f9067b;
        return kVar.f9100b.schedule(new i(kVar, callable, aVar), this.f9068c, this.f9069d);
    }
}
