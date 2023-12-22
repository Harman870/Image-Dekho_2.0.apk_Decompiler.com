package n3;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;
import x3.a;

public final class u {
    @GuardedBy("MessengerIpcClient.class")

    /* renamed from: e  reason: collision with root package name */
    public static u f9565e;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9566a;

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f9567b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    public p f9568c = new p(this);
    @GuardedBy("this")

    /* renamed from: d  reason: collision with root package name */
    public int f9569d = 1;

    public u(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f9567b = scheduledExecutorService;
        this.f9566a = context.getApplicationContext();
    }

    public static synchronized u a(Context context) {
        u uVar;
        synchronized (u.class) {
            if (f9565e == null) {
                f9565e = new u(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new a("MessengerIpcClient"))));
            }
            uVar = f9565e;
        }
        return uVar;
    }

    public final synchronized <T> Task<T> b(r<T> rVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(rVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f9568c.d(rVar)) {
            p pVar = new p(this);
            this.f9568c = pVar;
            pVar.d(rVar);
        }
        return rVar.f9562b.getTask();
    }
}
