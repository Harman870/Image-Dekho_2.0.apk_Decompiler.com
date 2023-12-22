package j4;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class e implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public int f8116a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f8117b;

    public e(f fVar) {
        this.f8117b = fVar;
    }

    public final boolean hasNext() {
        return this.f8116a < this.f8117b.j();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f8116a < this.f8117b.j()) {
            f fVar = this.f8117b;
            int i10 = this.f8116a;
            this.f8116a = i10 + 1;
            return fVar.m(i10);
        }
        throw new NoSuchElementException(androidx.activity.e.a("Out of bounds index: ", this.f8116a));
    }
}
