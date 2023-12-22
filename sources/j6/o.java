package j6;

import a7.n;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import r6.b;
import r6.c;
import r6.d;

public final class o implements d, c {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f8755a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public ArrayDeque f8756b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public final Executor f8757c;

    public o(Executor executor) {
        this.f8757c = executor;
    }

    public final void a(n nVar) {
        b(this.f8757c, nVar);
    }

    public final synchronized void b(Executor executor, b bVar) {
        Class<c6.b> cls = c6.b.class;
        synchronized (this) {
            executor.getClass();
            if (!this.f8755a.containsKey(cls)) {
                this.f8755a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f8755a.get(cls)).put(bVar, executor);
        }
    }
}
