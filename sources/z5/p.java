package z5;

import b6.u;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import z5.b;

public final /* synthetic */ class p implements b.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f13221a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f13222b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f13223c;

    public /* synthetic */ p(q qVar, long j10, long j11) {
        this.f13221a = qVar;
        this.f13222b = j10;
        this.f13223c = j11;
    }

    public final Task a(s sVar) {
        q qVar = this.f13221a;
        long j10 = this.f13222b;
        long j11 = this.f13223c;
        l lVar = qVar.f13224a;
        String str = sVar.f13226a;
        lVar.f13213a.b("requestExpressIntegrityToken(%s)", Long.valueOf(j11));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        b6.b bVar = lVar.f13216d;
        g gVar = new g(lVar, taskCompletionSource, str, j10, j11, taskCompletionSource);
        bVar.getClass();
        bVar.a().post(new u(bVar, taskCompletionSource, taskCompletionSource, gVar));
        return taskCompletionSource.getTask();
    }
}
