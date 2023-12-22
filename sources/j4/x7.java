package j4;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class x7 extends g6 implements RandomAccess, y7 {

    /* renamed from: b  reason: collision with root package name */
    public final List f8554b;

    static {
        new x7((Object) null);
    }

    public x7() {
        this(10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x7(int i10) {
        super(true);
        ArrayList arrayList = new ArrayList(i10);
        this.f8554b = arrayList;
    }

    public x7(Object obj) {
        super(false);
        this.f8554b = Collections.emptyList();
    }

    public x7(ArrayList arrayList) {
        super(true);
        this.f8554b = arrayList;
    }

    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        a();
        this.f8554b.add(i10, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i10, Collection collection) {
        a();
        if (collection instanceof y7) {
            collection = ((y7) collection).b();
        }
        boolean addAll = this.f8554b.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public final List b() {
        return Collections.unmodifiableList(this.f8554b);
    }

    public final /* bridge */ /* synthetic */ r7 c(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f8554b);
            return new x7(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final void clear() {
        a();
        this.f8554b.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public final String get(int i10) {
        String str;
        Object obj = this.f8554b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof q6) {
            q6 q6Var = (q6) obj;
            Charset charset = s7.f8462a;
            if (q6Var.g() == 0) {
                str = "";
            } else {
                str = q6Var.j(charset);
            }
            if (q6Var.l()) {
                this.f8554b.set(i10, str);
            }
            return str;
        }
        byte[] bArr = (byte[]) obj;
        String str2 = new String(bArr, s7.f8462a);
        v9 v9Var = x9.f8559a;
        int length = bArr.length;
        v9Var.getClass();
        if (u9.a(bArr, 0, length)) {
            this.f8554b.set(i10, str2);
        }
        return str2;
    }

    public final Object e(int i10) {
        return this.f8554b.get(i10);
    }

    public final Object remove(int i10) {
        a();
        Object remove = this.f8554b.remove(i10);
        this.modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof q6)) {
            return new String((byte[]) remove, s7.f8462a);
        }
        q6 q6Var = (q6) remove;
        Charset charset = s7.f8462a;
        if (q6Var.g() == 0) {
            return "";
        }
        return q6Var.j(charset);
    }

    public final Object set(int i10, Object obj) {
        a();
        Object obj2 = this.f8554b.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof q6)) {
            return new String((byte[]) obj2, s7.f8462a);
        }
        q6 q6Var = (q6) obj2;
        Charset charset = s7.f8462a;
        if (q6Var.g() == 0) {
            return "";
        }
        return q6Var.j(charset);
    }

    public final int size() {
        return this.f8554b.size();
    }

    public final void v(q6 q6Var) {
        a();
        this.f8554b.add(q6Var);
        this.modCount++;
    }

    public final y7 zze() {
        if (this.f8197a) {
            return new o9(this);
        }
        return this;
    }
}
