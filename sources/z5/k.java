package z5;

import b6.c;
import b6.s;
import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class k extends s {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f13212b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(l lVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f13212b = lVar;
    }

    public final void a(Exception exc) {
        if (!(exc instanceof c)) {
            super.a(exc);
        } else {
            super.a(l.c(this.f13212b) ? new a(-2, exc) : new a(-9, exc));
        }
    }
}
