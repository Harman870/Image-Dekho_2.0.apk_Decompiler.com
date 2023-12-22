package i4;

import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class dg implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ eg f7265a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ cg f7266b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f7267c;

    public /* synthetic */ dg(eg egVar, cg cgVar, TaskCompletionSource taskCompletionSource) {
        this.f7265a = egVar;
        this.f7266b = cgVar;
        this.f7267c = taskCompletionSource;
    }

    public final void run() {
        this.f7266b.c(this.f7267c, this.f7265a.f7292a);
    }
}
