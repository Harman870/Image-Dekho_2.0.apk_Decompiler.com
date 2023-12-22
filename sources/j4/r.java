package j4;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class r implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public int f8423a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f8424b;

    public r(t tVar) {
        this.f8424b = tVar;
    }

    public final boolean hasNext() {
        if (this.f8423a < this.f8424b.f8469a.length()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i10 = this.f8423a;
        if (i10 < this.f8424b.f8469a.length()) {
            this.f8423a = i10 + 1;
            return new t(String.valueOf(i10));
        }
        throw new NoSuchElementException();
    }
}
