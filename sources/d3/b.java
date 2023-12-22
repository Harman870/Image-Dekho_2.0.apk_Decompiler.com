package d3;

import androidx.activity.f;
import w2.n;
import w2.s;

public final class b extends i {

    /* renamed from: a  reason: collision with root package name */
    public final long f6049a;

    /* renamed from: b  reason: collision with root package name */
    public final s f6050b;

    /* renamed from: c  reason: collision with root package name */
    public final n f6051c;

    public b(long j10, s sVar, n nVar) {
        this.f6049a = j10;
        if (sVar != null) {
            this.f6050b = sVar;
            if (nVar != null) {
                this.f6051c = nVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    public final n a() {
        return this.f6051c;
    }

    public final long b() {
        return this.f6049a;
    }

    public final s c() {
        return this.f6050b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f6049a == iVar.b() && this.f6050b.equals(iVar.c()) && this.f6051c.equals(iVar.a());
    }

    public final int hashCode() {
        long j10 = this.f6049a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f6050b.hashCode()) * 1000003) ^ this.f6051c.hashCode();
    }

    public final String toString() {
        StringBuilder g10 = f.g("PersistedEvent{id=");
        g10.append(this.f6049a);
        g10.append(", transportContext=");
        g10.append(this.f6050b);
        g10.append(", event=");
        g10.append(this.f6051c);
        g10.append("}");
        return g10.toString();
    }
}
