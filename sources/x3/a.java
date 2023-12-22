package x3;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import n3.l;

public final class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final String f12947a;

    /* renamed from: b  reason: collision with root package name */
    public final ThreadFactory f12948b = Executors.defaultThreadFactory();

    public a(String str) {
        this.f12947a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f12948b.newThread(new l(runnable));
        newThread.setName(this.f12947a);
        return newThread;
    }
}
