package c9;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class a<T> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<b<T>> f2523a;

    public a(d dVar) {
        this.f2523a = new AtomicReference<>(dVar);
    }

    public final Iterator<T> iterator() {
        b andSet = this.f2523a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
