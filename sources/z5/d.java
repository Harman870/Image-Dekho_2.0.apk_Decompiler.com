package z5;

import b6.b;
import b6.u;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import i4.h6;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final l f13196a;

    /* renamed from: b  reason: collision with root package name */
    public final q f13197b;

    public d(l lVar, q qVar) {
        this.f13196a = lVar;
        this.f13197b = qVar;
    }

    public final Task a(r rVar) {
        l lVar = this.f13196a;
        long j10 = rVar.f13225a;
        lVar.f13213a.b("warmUpIntegrityToken(%s)", Long.valueOf(j10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        b bVar = lVar.f13216d;
        f fVar = new f(lVar, taskCompletionSource, j10, taskCompletionSource);
        bVar.getClass();
        bVar.a().post(new u(bVar, taskCompletionSource, taskCompletionSource, fVar));
        return taskCompletionSource.getTask().onSuccessTask(new h6((Object) this, (Object) rVar));
    }
}
