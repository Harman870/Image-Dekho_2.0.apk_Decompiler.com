package j4;

import java.util.ListIterator;

public final class m9 implements ListIterator {

    /* renamed from: a  reason: collision with root package name */
    public final ListIterator f8326a;

    public m9(o9 o9Var, int i10) {
        this.f8326a = o9Var.f8366a.listIterator(i10);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f8326a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f8326a.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f8326a.next();
    }

    public final int nextIndex() {
        return this.f8326a.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f8326a.previous();
    }

    public final int previousIndex() {
        return this.f8326a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
