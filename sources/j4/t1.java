package j4;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class t1 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final ThreadFactory f8470a = Executors.defaultThreadFactory();

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f8470a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
