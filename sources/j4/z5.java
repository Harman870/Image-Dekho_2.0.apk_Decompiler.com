package j4;

import java.util.NoSuchElementException;

public final class z5 extends d6 {

    /* renamed from: b  reason: collision with root package name */
    public boolean f8578b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f8579c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z5(Object obj) {
        super(0);
        this.f8579c = obj;
    }

    public final boolean hasNext() {
        return !this.f8578b;
    }

    public final Object next() {
        if (!this.f8578b) {
            this.f8578b = true;
            return this.f8579c;
        }
        throw new NoSuchElementException();
    }
}
