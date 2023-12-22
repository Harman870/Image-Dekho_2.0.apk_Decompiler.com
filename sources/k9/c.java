package k9;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class c implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f9150a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f9151b;

    public /* synthetic */ c(String str, boolean z9) {
        this.f9150a = str;
        this.f9151b = z9;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f9150a;
        boolean z9 = this.f9151b;
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z9);
        return thread;
    }
}
