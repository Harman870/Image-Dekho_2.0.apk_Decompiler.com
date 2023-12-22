package h9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import y3.a;
import z7.e;

public abstract class b<T> extends k {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7041a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = a.H;

    public final Object a(Object obj) {
        boolean z9;
        Object obj2 = this._consensus;
        e eVar = a.H;
        if (obj2 == eVar) {
            e c10 = c(obj);
            obj2 = this._consensus;
            if (obj2 == eVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7041a;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, eVar, c10)) {
                        if (atomicReferenceFieldUpdater.get(this) != eVar) {
                            z9 = false;
                            break;
                        }
                    } else {
                        z9 = true;
                        break;
                    }
                }
                if (z9) {
                    obj2 = c10;
                } else {
                    obj2 = this._consensus;
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t10, Object obj);

    public abstract e c(Object obj);
}
