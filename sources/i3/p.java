package i3;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.FutureTask;

public final class p extends FutureTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f7158a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(q qVar, Runnable runnable, Object obj) {
        super(runnable, obj);
        this.f7158a = qVar;
    }

    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f7158a.f7159a.f7166e;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        } else if (Log.isLoggable("GAv4", 6)) {
            Log.e("GAv4", "MeasurementExecutor: job failed with ".concat(String.valueOf(th)));
        }
        super.setException(th);
    }
}
