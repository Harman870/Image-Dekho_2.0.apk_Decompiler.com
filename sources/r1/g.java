package r1;

import java.util.ArrayList;
import java.util.HashMap;
import r1.l;

public final class g<K extends l, V> {

    /* renamed from: a  reason: collision with root package name */
    public final a<K, V> f11460a = new a<>();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f11461b = new HashMap();

    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f11462a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList f11463b;

        /* renamed from: c  reason: collision with root package name */
        public a<K, V> f11464c;

        /* renamed from: d  reason: collision with root package name */
        public a<K, V> f11465d;

        public a() {
            this((Object) null);
        }

        public a(K k) {
            this.f11465d = this;
            this.f11464c = this;
            this.f11462a = k;
        }
    }

    public final V a(K k) {
        int i10;
        a<K, V> aVar = (a) this.f11461b.get(k);
        if (aVar == null) {
            aVar = new a<>(k);
            this.f11461b.put(k, aVar);
        } else {
            k.a();
        }
        a<K, V> aVar2 = aVar.f11465d;
        aVar2.f11464c = aVar.f11464c;
        aVar.f11464c.f11465d = aVar2;
        a<K, V> aVar3 = this.f11460a;
        aVar.f11465d = aVar3;
        a<K, V> aVar4 = aVar3.f11464c;
        aVar.f11464c = aVar4;
        aVar4.f11465d = aVar;
        aVar.f11465d.f11464c = aVar;
        ArrayList arrayList = aVar.f11463b;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            return aVar.f11463b.remove(i10 - 1);
        }
        return null;
    }

    public final void b(K k, V v10) {
        a<K, V> aVar = (a) this.f11461b.get(k);
        if (aVar == null) {
            aVar = new a<>(k);
            a<K, V> aVar2 = aVar.f11465d;
            aVar2.f11464c = aVar.f11464c;
            aVar.f11464c.f11465d = aVar2;
            a<K, V> aVar3 = this.f11460a;
            aVar.f11465d = aVar3.f11465d;
            aVar.f11464c = aVar3;
            aVar3.f11465d = aVar;
            aVar.f11465d.f11464c = aVar;
            this.f11461b.put(k, aVar);
        } else {
            k.a();
        }
        if (aVar.f11463b == null) {
            aVar.f11463b = new ArrayList();
        }
        aVar.f11463b.add(v10);
    }

    public final V c() {
        int i10;
        a<K, V> aVar = this.f11460a;
        while (true) {
            aVar = aVar.f11465d;
            V v10 = null;
            if (aVar.equals(this.f11460a)) {
                return null;
            }
            ArrayList arrayList = aVar.f11463b;
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                v10 = aVar.f11463b.remove(i10 - 1);
            }
            if (v10 != null) {
                return v10;
            }
            a<K, V> aVar2 = aVar.f11465d;
            aVar2.f11464c = aVar.f11464c;
            aVar.f11464c.f11465d = aVar2;
            this.f11461b.remove(aVar.f11462a);
            ((l) aVar.f11462a).a();
        }
    }

    public final String toString() {
        int i10;
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z9 = false;
        for (a<K, V> aVar = this.f11460a.f11464c; !aVar.equals(this.f11460a); aVar = aVar.f11464c) {
            z9 = true;
            sb.append('{');
            sb.append(aVar.f11462a);
            sb.append(':');
            ArrayList arrayList = aVar.f11463b;
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            sb.append(i10);
            sb.append("}, ");
        }
        if (z9) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
