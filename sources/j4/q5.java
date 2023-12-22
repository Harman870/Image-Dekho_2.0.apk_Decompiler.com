package j4;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public abstract class q5 extends d6 implements ListIterator {

    /* renamed from: b  reason: collision with root package name */
    public final int f8400b;

    /* renamed from: c  reason: collision with root package name */
    public int f8401c;

    public q5(int i10, int i11) {
        super(0);
        if (i11 < 0 || i11 > i10) {
            throw new IndexOutOfBoundsException(j5.c(i11, i10, "index"));
        }
        this.f8400b = i10;
        this.f8401c = i11;
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        b(obj);
        throw null;
    }

    @Deprecated
    public final void b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void c(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f8401c < this.f8400b;
    }

    public final boolean hasPrevious() {
        return this.f8401c > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i10 = this.f8401c;
            this.f8401c = i10 + 1;
            return ((u5) this).f8491d.get(i10);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f8401c;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f8401c - 1;
            this.f8401c = i10;
            return ((u5) this).f8491d.get(i10);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f8401c - 1;
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        c(obj);
        throw null;
    }
}
