package i4;

import java.util.Iterator;
import java.util.Map;

public final class s2 implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public int f7665a = -1;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7666b;

    /* renamed from: c  reason: collision with root package name */
    public Iterator f7667c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ u2 f7668d;

    public /* synthetic */ s2(u2 u2Var) {
        this.f7668d = u2Var;
    }

    public final Iterator a() {
        if (this.f7667c == null) {
            this.f7667c = this.f7668d.f7703c.entrySet().iterator();
        }
        return this.f7667c;
    }

    public final boolean hasNext() {
        if (this.f7665a + 1 < this.f7668d.f7702b.size()) {
            return true;
        }
        if (this.f7668d.f7703c.isEmpty()) {
            return false;
        }
        if (a().hasNext()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Object obj;
        this.f7666b = true;
        int i10 = this.f7665a + 1;
        this.f7665a = i10;
        if (i10 < this.f7668d.f7702b.size()) {
            obj = this.f7668d.f7702b.get(this.f7665a);
        } else {
            obj = a().next();
        }
        return (Map.Entry) obj;
    }

    public final void remove() {
        if (this.f7666b) {
            this.f7666b = false;
            u2 u2Var = this.f7668d;
            int i10 = u2.f7700g;
            u2Var.g();
            if (this.f7665a < this.f7668d.f7702b.size()) {
                u2 u2Var2 = this.f7668d;
                int i11 = this.f7665a;
                this.f7665a = i11 - 1;
                u2Var2.e(i11);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
