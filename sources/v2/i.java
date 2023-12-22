package v2;

import androidx.activity.f;
import v2.o;

public final class i extends o {

    /* renamed from: a  reason: collision with root package name */
    public final o.b f12495a;

    /* renamed from: b  reason: collision with root package name */
    public final o.a f12496b;

    public i(o.b bVar, o.a aVar) {
        this.f12495a = bVar;
        this.f12496b = aVar;
    }

    public final o.a a() {
        return this.f12496b;
    }

    public final o.b b() {
        return this.f12495a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.b bVar = this.f12495a;
        if (bVar != null ? bVar.equals(oVar.b()) : oVar.b() == null) {
            o.a aVar = this.f12496b;
            o.a a10 = oVar.a();
            if (aVar == null) {
                if (a10 == null) {
                    return true;
                }
            } else if (aVar.equals(a10)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        o.b bVar = this.f12495a;
        int i10 = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        o.a aVar = this.f12496b;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        StringBuilder g10 = f.g("NetworkConnectionInfo{networkType=");
        g10.append(this.f12495a);
        g10.append(", mobileSubtype=");
        g10.append(this.f12496b);
        g10.append("}");
        return g10.toString();
    }
}
