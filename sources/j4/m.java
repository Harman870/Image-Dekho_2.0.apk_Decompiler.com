package j4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.c;
import y3.a;

public class m implements p, l {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f8322a = new HashMap();

    public final p a() {
        String str;
        HashMap hashMap;
        p pVar;
        m mVar = new m();
        for (Map.Entry entry : this.f8322a.entrySet()) {
            if (entry.getValue() instanceof l) {
                hashMap = mVar.f8322a;
                str = (String) entry.getKey();
                pVar = (p) entry.getValue();
            } else {
                hashMap = mVar.f8322a;
                str = (String) entry.getKey();
                pVar = ((p) entry.getValue()).a();
            }
            hashMap.put(str, pVar);
        }
        return mVar;
    }

    public final Double b() {
        return Double.valueOf(Double.NaN);
    }

    public final Iterator d() {
        return new k(this.f8322a.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        return this.f8322a.equals(((m) obj).f8322a);
    }

    public final boolean g(String str) {
        return this.f8322a.containsKey(str);
    }

    public final p h(String str) {
        return this.f8322a.containsKey(str) ? (p) this.f8322a.get(str) : p.f8373c0;
    }

    public final int hashCode() {
        return this.f8322a.hashCode();
    }

    public final void i(String str, p pVar) {
        if (pVar == null) {
            this.f8322a.remove(str);
        } else {
            this.f8322a.put(str, pVar);
        }
    }

    public final Boolean k() {
        return Boolean.TRUE;
    }

    public p l(String str, c cVar, ArrayList arrayList) {
        return "toString".equals(str) ? new t(toString()) : a.J(this, new t(str), cVar, arrayList);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f8322a.isEmpty()) {
            for (String str : this.f8322a.keySet()) {
                sb.append(String.format("%s: %s,", new Object[]{str, this.f8322a.get(str)}));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    public final String zzi() {
        return "[object Object]";
    }
}
