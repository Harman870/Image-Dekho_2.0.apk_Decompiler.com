package q1;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import o1.f;
import q1.q;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10982a = false;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f10983b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ReferenceQueue<q<?>> f10984c = new ReferenceQueue<>();

    /* renamed from: d  reason: collision with root package name */
    public q.a f10985d;

    public static final class a extends WeakReference<q<?>> {

        /* renamed from: a  reason: collision with root package name */
        public final f f10986a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f10987b;

        /* renamed from: c  reason: collision with root package name */
        public w<?> f10988c;

        public a(f fVar, q<?> qVar, ReferenceQueue<? super q<?>> referenceQueue, boolean z9) {
            super(qVar, referenceQueue);
            w<Z> wVar;
            y3.a.h(fVar);
            this.f10986a = fVar;
            if (!qVar.f11123a || !z9) {
                wVar = null;
            } else {
                wVar = qVar.f11125c;
                y3.a.h(wVar);
            }
            this.f10988c = wVar;
            this.f10987b = qVar.f11123a;
        }
    }

    public c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new a());
        newSingleThreadExecutor.execute(new b(this));
    }

    public final synchronized void a(f fVar, q<?> qVar) {
        a aVar = (a) this.f10983b.put(fVar, new a(fVar, qVar, this.f10984c, this.f10982a));
        if (aVar != null) {
            aVar.f10988c = null;
            aVar.clear();
        }
    }

    public final void b(a aVar) {
        synchronized (this) {
            this.f10983b.remove(aVar.f10986a);
            if (aVar.f10987b) {
                w<?> wVar = aVar.f10988c;
                if (wVar != null) {
                    this.f10985d.a(aVar.f10986a, new q(wVar, true, false, aVar.f10986a, this.f10985d));
                }
            }
        }
    }
}
