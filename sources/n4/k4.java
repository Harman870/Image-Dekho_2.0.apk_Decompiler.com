package n4;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public final class k4 extends FutureTask implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public final long f9887a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9888b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9889c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ m4 f9890d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k4(m4 m4Var, Runnable runnable, boolean z9, String str) {
        super(runnable, (Object) null);
        this.f9890d = m4Var;
        long andIncrement = m4.k.getAndIncrement();
        this.f9887a = andIncrement;
        this.f9889c = str;
        this.f9888b = z9;
        if (andIncrement == Long.MAX_VALUE) {
            m4Var.f9600a.a().f9828f.a("Tasks index overflow");
        }
    }

    public final int compareTo(Object obj) {
        k4 k4Var = (k4) obj;
        boolean z9 = this.f9888b;
        if (z9 == k4Var.f9888b) {
            int i10 = (this.f9887a > k4Var.f9887a ? 1 : (this.f9887a == k4Var.f9887a ? 0 : -1));
            if (i10 < 0) {
                return -1;
            }
            if (i10 > 0) {
                return 1;
            }
            this.f9890d.f9600a.a().f9829g.b("Two tasks share the same index. index", Long.valueOf(this.f9887a));
            return 0;
        } else if (!z9) {
            return 1;
        } else {
            return -1;
        }
    }

    public final void setException(Throwable th) {
        this.f9890d.f9600a.a().f9828f.b(this.f9889c, th);
        super.setException(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k4(m4 m4Var, Callable callable, boolean z9) {
        super(callable);
        this.f9890d = m4Var;
        long andIncrement = m4.k.getAndIncrement();
        this.f9887a = andIncrement;
        this.f9889c = "Task exception on worker thread";
        this.f9888b = z9;
        if (andIncrement == Long.MAX_VALUE) {
            m4Var.f9600a.a().f9828f.a("Tasks index overflow");
        }
    }
}
