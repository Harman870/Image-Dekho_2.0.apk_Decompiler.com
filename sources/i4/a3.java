package i4;

import java.util.ListIterator;

public final class a3 implements ListIterator {

    /* renamed from: a  reason: collision with root package name */
    public final ListIterator f7179a;

    public a3(c3 c3Var, int i10) {
        this.f7179a = c3Var.f7222a.listIterator(i10);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f7179a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f7179a.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f7179a.next();
    }

    public final int nextIndex() {
        return this.f7179a.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f7179a.previous();
    }

    public final int previousIndex() {
        return this.f7179a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
