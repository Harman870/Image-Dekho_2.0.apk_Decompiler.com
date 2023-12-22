package j4;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class s implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public int f8452a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f8453b;

    public s(t tVar) {
        this.f8453b = tVar;
    }

    public final boolean hasNext() {
        if (this.f8452a < this.f8453b.f8469a.length()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i10 = this.f8452a;
        t tVar = this.f8453b;
        if (i10 < tVar.f8469a.length()) {
            String str = tVar.f8469a;
            this.f8452a = i10 + 1;
            return new t(String.valueOf(str.charAt(i10)));
        }
        throw new NoSuchElementException();
    }
}
