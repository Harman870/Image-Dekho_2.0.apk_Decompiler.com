package q3;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p3.b;

public abstract class m0<T> extends c0 {

    /* renamed from: b  reason: collision with root package name */
    public final TaskCompletionSource<T> f11261b;

    public m0(TaskCompletionSource taskCompletionSource) {
        super(4);
        this.f11261b = taskCompletionSource;
    }

    public final void a(Status status) {
        this.f11261b.trySetException(new b(status));
    }

    public final void b(RuntimeException runtimeException) {
        this.f11261b.trySetException(runtimeException);
    }

    public final void c(w<?> wVar) {
        try {
            h(wVar);
        } catch (DeadObjectException e10) {
            a(r0.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(r0.e(e11));
        } catch (RuntimeException e12) {
            this.f11261b.trySetException(e12);
        }
    }

    public abstract void h(w<?> wVar);
}
