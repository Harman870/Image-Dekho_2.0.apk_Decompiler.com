package q3;

import com.google.android.gms.tasks.TaskCompletionSource;
import o3.d;

public final class q0 extends m0<Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public final g<?> f11270c;

    public q0(g<?> gVar, TaskCompletionSource<Boolean> taskCompletionSource) {
        super(taskCompletionSource);
        this.f11270c = gVar;
    }

    public final /* bridge */ /* synthetic */ void d(n nVar, boolean z9) {
    }

    public final boolean f(w<?> wVar) {
        if (((g0) wVar.f11291f.get(this.f11270c)) == null) {
            return false;
        }
        throw null;
    }

    public final d[] g(w<?> wVar) {
        if (((g0) wVar.f11291f.get(this.f11270c)) == null) {
            return null;
        }
        throw null;
    }

    public final void h(w<?> wVar) {
        if (((g0) wVar.f11291f.remove(this.f11270c)) == null) {
            this.f11261b.trySetResult(Boolean.FALSE);
            return;
        }
        throw null;
    }
}
