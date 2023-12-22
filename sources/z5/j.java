package z5;

import android.os.Bundle;
import b6.r;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class j extends h {

    /* renamed from: c  reason: collision with root package name */
    public final r f13211c = new r("OnWarmUpIntegrityTokenCallback");

    public j(l lVar, TaskCompletionSource taskCompletionSource) {
        super(lVar, taskCompletionSource);
    }

    public final void l(Bundle bundle) {
        super.l(bundle);
        this.f13211c.b("onWarmUpExpressIntegrityToken", new Object[0]);
        int i10 = bundle.getInt("error");
        if (i10 != 0) {
            this.f13208a.trySetException(new a(i10, (Throwable) null));
        } else {
            this.f13208a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
