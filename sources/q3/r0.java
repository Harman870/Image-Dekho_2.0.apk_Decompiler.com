package q3;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class r0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f11272a;

    public r0(int i10) {
        this.f11272a = i10;
    }

    public static /* bridge */ /* synthetic */ Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(Status status);

    public abstract void b(RuntimeException runtimeException);

    public abstract void c(w<?> wVar);

    public abstract void d(n nVar, boolean z9);
}
