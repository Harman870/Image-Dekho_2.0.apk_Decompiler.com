package i3;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class q extends ThreadPoolExecutor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f7159a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(t tVar) {
        super(1, 1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue());
        this.f7159a = tVar;
        setThreadFactory(new r());
        allowCoreThreadTimeOut(true);
    }

    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new p(this, runnable, obj);
    }
}
