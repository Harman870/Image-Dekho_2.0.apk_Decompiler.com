package z5;

import android.os.RemoteException;
import b6.o;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class f extends k {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f13200c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f13201d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ l f13202e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(l lVar, TaskCompletionSource taskCompletionSource, long j10, TaskCompletionSource taskCompletionSource2) {
        super(lVar, taskCompletionSource);
        this.f13202e = lVar;
        this.f13200c = j10;
        this.f13201d = taskCompletionSource2;
    }

    public final void b() {
        if (l.c(this.f13202e)) {
            a(new a(-2, (Throwable) null));
            return;
        }
        try {
            l lVar = this.f13202e;
            ((o) lVar.f13216d.f2284n).x(l.b(lVar, this.f13200c), new j(this.f13202e, this.f13201d));
        } catch (RemoteException e10) {
            this.f13202e.f13213a.a("warmUpIntegrityToken(%s)", e10, Long.valueOf(this.f13200c));
            this.f13201d.trySetException(new a(-100, e10));
        }
    }
}
