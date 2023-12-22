package b6;

import com.google.android.gms.tasks.TaskCompletionSource;
import n3.w;
import z5.k;

public final class u extends s {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f2298b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ s f2299c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f2300d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(b bVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, k kVar) {
        super(taskCompletionSource);
        this.f2300d = bVar;
        this.f2298b = taskCompletionSource2;
        this.f2299c = kVar;
    }

    public final void b() {
        synchronized (this.f2300d.f2277f) {
            b bVar = this.f2300d;
            TaskCompletionSource taskCompletionSource = this.f2298b;
            bVar.f2276e.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new w((Object) bVar, (Object) taskCompletionSource));
            if (this.f2300d.f2282l.getAndIncrement() > 0) {
                this.f2300d.f2273b.b("Already connected to the service.", new Object[0]);
            }
            b.b(this.f2300d, this.f2299c);
        }
    }
}
