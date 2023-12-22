package e2;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d3.f0;
import i4.fg;
import i4.n;
import i4.p3;
import i4.q3;
import i4.xf;
import java.util.concurrent.atomic.AtomicReference;
import m.b;
import n3.h;
import n3.w;
import u1.t;

public final class c implements OnCompleteListener, fg {

    /* renamed from: a  reason: collision with root package name */
    public final Object f6175a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6176b;

    public /* synthetic */ c() {
        this.f6175a = new AtomicReference();
        this.f6176b = new b();
    }

    public /* synthetic */ c(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f6175a = new Messenger(iBinder);
            this.f6176b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f6176b = new h(iBinder);
            this.f6175a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    public /* synthetic */ c(p3 p3Var) {
        this.f6175a = p3Var;
        this.f6176b = null;
    }

    public /* synthetic */ c(q3 q3Var) {
        this.f6175a = null;
        this.f6176b = q3Var;
    }

    public /* synthetic */ c(Object obj, Object obj2) {
        this.f6176b = obj;
        this.f6175a = obj2;
    }

    public final /* bridge */ /* synthetic */ void c(xf xfVar) {
        f0 f0Var = (f0) this.f6176b;
        t.h((t) f0Var.f6061c, (n) xfVar, (w) f0Var.f6060b, this);
    }

    public final void onComplete(Task task) {
        ((q3.n) this.f6176b).f11263b.remove((TaskCompletionSource) this.f6175a);
    }

    public final void zza(String str) {
        ((fg) this.f6175a).zza(str);
    }
}
