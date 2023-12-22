package n4;

import java.lang.Thread;

public final class j4 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final String f9862a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m4 f9863b;

    public j4(m4 m4Var, String str) {
        this.f9863b = m4Var;
        this.f9862a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f9863b.f9600a.a().f9828f.b(this.f9862a, th);
    }
}
