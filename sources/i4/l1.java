package i4;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class l1 extends u implements RandomAccess, m1 {

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f7462b;

    static {
        new l1(10).f7694a = false;
    }

    public l1() {
        this(10);
    }

    public l1(int i10) {
        this.f7462b = new ArrayList(i10);
    }

    public l1(ArrayList arrayList) {
        this.f7462b = arrayList;
    }

    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        a();
        this.f7462b.add(i10, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i10, Collection collection) {
        a();
        if (collection instanceof m1) {
            collection = ((m1) collection).b();
        }
        boolean addAll = this.f7462b.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public final List b() {
        return Collections.unmodifiableList(this.f7462b);
    }

    public final /* bridge */ /* synthetic */ f1 c(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f7462b);
            return new l1(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final void clear() {
        a();
        this.f7462b.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public final String get(int i10) {
        String str;
        Object obj = this.f7462b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            Charset charset = g1.f7324a;
            if (e0Var.g() == 0) {
                str = "";
            } else {
                str = e0Var.l(charset);
            }
            if (e0Var.n()) {
                this.f7462b.set(i10, str);
            }
            return str;
        }
        byte[] bArr = (byte[]) obj;
        String str2 = new String(bArr, g1.f7324a);
        k3 k3Var = m3.f7487a;
        int length = bArr.length;
        k3Var.getClass();
        if (i3.a(bArr, 0, length)) {
            this.f7462b.set(i10, str2);
        }
        return str2;
    }

    public final Object e(int i10) {
        return this.f7462b.get(i10);
    }

    public final void f(d0 d0Var) {
        a();
        this.f7462b.add(d0Var);
        this.modCount++;
    }

    public final Object remove(int i10) {
        a();
        Object remove = this.f7462b.remove(i10);
        this.modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof e0)) {
            return new String((byte[]) remove, g1.f7324a);
        }
        e0 e0Var = (e0) remove;
        Charset charset = g1.f7324a;
        if (e0Var.g() == 0) {
            return "";
        }
        return e0Var.l(charset);
    }

    public final Object set(int i10, Object obj) {
        a();
        Object obj2 = this.f7462b.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof e0)) {
            return new String((byte[]) obj2, g1.f7324a);
        }
        e0 e0Var = (e0) obj2;
        Charset charset = g1.f7324a;
        if (e0Var.g() == 0) {
            return "";
        }
        return e0Var.l(charset);
    }

    public final int size() {
        return this.f7462b.size();
    }

    public final m1 zze() {
        if (this.f7694a) {
            return new c3(this);
        }
        return this;
    }
}
