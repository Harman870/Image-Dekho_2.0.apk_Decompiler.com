package j4;

import java.util.Iterator;
import java.util.Map;

public final class f9 implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public int f8148a = -1;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8149b;

    /* renamed from: c  reason: collision with root package name */
    public Iterator f8150c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h9 f8151d;

    public /* synthetic */ f9(h9 h9Var) {
        this.f8151d = h9Var;
    }

    public final Iterator a() {
        if (this.f8150c == null) {
            this.f8150c = this.f8151d.f8220c.entrySet().iterator();
        }
        return this.f8150c;
    }

    public final boolean hasNext() {
        if (this.f8148a + 1 < this.f8151d.f8219b.size()) {
            return true;
        }
        if (this.f8151d.f8220c.isEmpty()) {
            return false;
        }
        if (a().hasNext()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Object obj;
        this.f8149b = true;
        int i10 = this.f8148a + 1;
        this.f8148a = i10;
        if (i10 < this.f8151d.f8219b.size()) {
            obj = this.f8151d.f8219b.get(this.f8148a);
        } else {
            obj = a().next();
        }
        return (Map.Entry) obj;
    }

    public final void remove() {
        if (this.f8149b) {
            this.f8149b = false;
            h9 h9Var = this.f8151d;
            int i10 = h9.f8217g;
            h9Var.g();
            if (this.f8148a < this.f8151d.f8219b.size()) {
                h9 h9Var2 = this.f8151d;
                int i11 = this.f8148a;
                this.f8148a = i11 - 1;
                h9Var2.e(i11);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
