package j4;

import java.util.Iterator;

public abstract class d6 implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8103a;

    public /* synthetic */ d6(int i10) {
        this.f8103a = i10;
    }

    public abstract byte a();

    public /* synthetic */ Object next() {
        return Byte.valueOf(a());
    }

    public final void remove() {
        switch (this.f8103a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
