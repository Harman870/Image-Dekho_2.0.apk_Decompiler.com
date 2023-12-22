package i3;

import androidx.activity.e;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class r implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f7160a = new AtomicInteger();

    public final Thread newThread(Runnable runnable) {
        return new s(runnable, e.a("measurement-", f7160a.incrementAndGet()));
    }
}
