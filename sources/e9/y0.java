package e9;

public final class y0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<d0> f6276a = new ThreadLocal<>();

    public static d0 a() {
        ThreadLocal<d0> threadLocal = f6276a;
        d0 d0Var = threadLocal.get();
        if (d0Var != null) {
            return d0Var;
        }
        c cVar = new c(Thread.currentThread());
        threadLocal.set(cVar);
        return cVar;
    }
}
