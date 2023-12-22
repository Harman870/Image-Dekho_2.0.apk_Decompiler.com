package i4;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class a0 implements Iterator {
    public final Object next() {
        z zVar = (z) this;
        int i10 = zVar.f7829a;
        if (i10 < zVar.f7830b) {
            zVar.f7829a = i10 + 1;
            return Byte.valueOf(zVar.f7831c.d(i10));
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
