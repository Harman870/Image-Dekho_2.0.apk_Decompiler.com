package q3;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.c;
import e9.t;
import o3.d;
import p3.b;
import p3.g;

public final class p0<ResultT> extends c0 {

    /* renamed from: b  reason: collision with root package name */
    public final l<Object, ResultT> f11267b;

    /* renamed from: c  reason: collision with root package name */
    public final TaskCompletionSource<ResultT> f11268c;

    /* renamed from: d  reason: collision with root package name */
    public final t f11269d;

    public p0(int i10, l0 l0Var, TaskCompletionSource taskCompletionSource, t tVar) {
        super(i10);
        this.f11268c = taskCompletionSource;
        this.f11267b = l0Var;
        this.f11269d = tVar;
        if (i10 == 2 && l0Var.f11252b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    public final void a(Status status) {
        boolean z9;
        Exception exc;
        TaskCompletionSource<ResultT> taskCompletionSource = this.f11268c;
        this.f11269d.getClass();
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
        taskCompletionSource.trySetException(exc);
    }

    public final void b(RuntimeException runtimeException) {
        this.f11268c.trySetException(runtimeException);
    }

    public final void c(w<?> wVar) {
        try {
            l<Object, ResultT> lVar = this.f11267b;
            ((l0) lVar).f11258d.f11254a.a(wVar.f11287b, this.f11268c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(r0.e(e11));
        } catch (RuntimeException e12) {
            this.f11268c.trySetException(e12);
        }
    }

    public final void d(n nVar, boolean z9) {
        TaskCompletionSource<ResultT> taskCompletionSource = this.f11268c;
        nVar.f11263b.put(taskCompletionSource, Boolean.valueOf(z9));
        taskCompletionSource.getTask().addOnCompleteListener(new c(nVar, taskCompletionSource));
    }

    public final boolean f(w<?> wVar) {
        return this.f11267b.f11252b;
    }

    public final d[] g(w<?> wVar) {
        return this.f11267b.f11251a;
    }
}
