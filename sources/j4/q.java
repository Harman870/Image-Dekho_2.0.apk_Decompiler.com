package j4;

import java.util.ArrayList;
import java.util.Iterator;
import o.c;

public final class q implements p {

    /* renamed from: a  reason: collision with root package name */
    public final String f8392a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f8393b;

    public q(String str, ArrayList arrayList) {
        this.f8392a = str;
        ArrayList arrayList2 = new ArrayList();
        this.f8393b = arrayList2;
        arrayList2.addAll(arrayList);
    }

    public final p a() {
        return this;
    }

    public final Double b() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final Iterator d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        String str = this.f8392a;
        if (str == null ? qVar.f8392a == null : str.equals(qVar.f8392a)) {
            return this.f8393b.equals(qVar.f8393b);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f8392a;
        return this.f8393b.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    public final Boolean k() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final p l(String str, c cVar, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final String zzi() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }
}
