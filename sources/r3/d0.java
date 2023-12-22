package r3;

import c.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import p3.b;
import p3.e;
import p3.g;
import p3.h;

public final class d0 implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f11552a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f11553b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ n f11554c;

    public d0(BasePendingResult basePendingResult, TaskCompletionSource taskCompletionSource, a aVar) {
        this.f11552a = basePendingResult;
        this.f11553b = taskCompletionSource;
        this.f11554c = aVar;
    }

    public final void a(Status status) {
        boolean z9;
        Exception exc;
        if (status.x()) {
            h await = this.f11552a.await(0, TimeUnit.MILLISECONDS);
            TaskCompletionSource taskCompletionSource = this.f11553b;
            this.f11554c.c(await);
            taskCompletionSource.setResult(null);
            return;
        }
        TaskCompletionSource taskCompletionSource2 = this.f11553b;
        if (status.f2813d != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            exc = new g(status);
        } else {
            exc = new b(status);
        }
        taskCompletionSource2.setException(exc);
    }
}
