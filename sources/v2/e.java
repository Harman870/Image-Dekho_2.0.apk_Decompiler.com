package v2;

import androidx.activity.f;
import v2.k;

public final class e extends k {

    /* renamed from: a  reason: collision with root package name */
    public final k.a f12471a;

    /* renamed from: b  reason: collision with root package name */
    public final a f12472b;

    public e(k.a aVar, a aVar2) {
        this.f12471a = aVar;
        this.f12472b = aVar2;
    }

    public final a a() {
        return this.f12472b;
    }

    public final k.a b() {
        return this.f12471a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.a aVar = this.f12471a;
        if (aVar != null ? aVar.equals(kVar.b()) : kVar.b() == null) {
            a aVar2 = this.f12472b;
            a a10 = kVar.a();
            if (aVar2 == null) {
                if (a10 == null) {
                    return true;
                }
            } else if (aVar2.equals(a10)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        k.a aVar = this.f12471a;
        int i10 = 0;
        int hashCode = ((aVar == null ? 0 : aVar.hashCode()) ^ 1000003) * 1000003;
        a aVar2 = this.f12472b;
        if (aVar2 != null) {
            i10 = aVar2.hashCode();
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        StringBuilder g10 = f.g("ClientInfo{clientType=");
        g10.append(this.f12471a);
        g10.append(", androidClientInfo=");
        g10.append(this.f12472b);
        g10.append("}");
        return g10.toString();
    }
}
