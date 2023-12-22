package z5;

import android.os.RemoteException;
import b6.o;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class g extends k {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f13203c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f13204d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ long f13205e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f13206f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ l f13207g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(l lVar, TaskCompletionSource taskCompletionSource, String str, long j10, long j11, TaskCompletionSource taskCompletionSource2) {
        super(lVar, taskCompletionSource);
        this.f13207g = lVar;
        this.f13203c = str;
        this.f13204d = j10;
        this.f13205e = j11;
        this.f13206f = taskCompletionSource2;
    }

    public final void b() {
        if (l.c(this.f13207g)) {
            a(new a(-2, (Throwable) null));
            return;
        }
        try {
            l lVar = this.f13207g;
            ((o) lVar.f13216d.f2284n).o(l.a(lVar, this.f13203c, this.f13204d, this.f13205e), new i(this.f13207g, this.f13206f));
        } catch (RemoteException e10) {
            this.f13207g.f13213a.a("requestExpressIntegrityToken(%s, %s)", e10, this.f13203c, Long.valueOf(this.f13204d));
            this.f13206f.trySetException(new a(-100, e10));
        }
    }
}
