package s1;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f11825a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final C0140b f11826b = new C0140b();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ReentrantLock f11827a = new ReentrantLock();

        /* renamed from: b  reason: collision with root package name */
        public int f11828b;
    }

    /* renamed from: s1.b$b  reason: collision with other inner class name */
    public static class C0140b {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayDeque f11829a = new ArrayDeque();
    }

    public final void a(String str) {
        a aVar;
        synchronized (this) {
            Object obj = this.f11825a.get(str);
            y3.a.h(obj);
            aVar = (a) obj;
            int i10 = aVar.f11828b;
            if (i10 >= 1) {
                int i11 = i10 - 1;
                aVar.f11828b = i11;
                if (i11 == 0) {
                    a aVar2 = (a) this.f11825a.remove(str);
                    if (aVar2.equals(aVar)) {
                        C0140b bVar = this.f11826b;
                        synchronized (bVar.f11829a) {
                            if (bVar.f11829a.size() < 10) {
                                bVar.f11829a.offer(aVar2);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f11828b);
            }
        }
        aVar.f11827a.unlock();
    }
}
