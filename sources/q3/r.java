package q3;

import android.os.Handler;
import f4.f;
import java.util.concurrent.Executor;

public final /* synthetic */ class r implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Handler f11271a;

    public /* synthetic */ r(f fVar) {
        this.f11271a = fVar;
    }

    public final void execute(Runnable runnable) {
        this.f11271a.post(runnable);
    }
}
