package i4;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class p2 implements Iterator {
    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
