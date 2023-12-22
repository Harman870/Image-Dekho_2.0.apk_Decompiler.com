package c3;

import androidx.activity.f;
import c3.e;
import f3.a;
import java.util.Map;
import t2.d;

public final class b extends e {

    /* renamed from: a  reason: collision with root package name */
    public final a f2379a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<d, e.a> f2380b;

    public b(a aVar, Map<d, e.a> map) {
        if (aVar != null) {
            this.f2379a = aVar;
            if (map != null) {
                this.f2380b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    public final a a() {
        return this.f2379a;
    }

    public final Map<d, e.a> c() {
        return this.f2380b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f2379a.equals(eVar.a()) && this.f2380b.equals(eVar.c());
    }

    public final int hashCode() {
        return ((this.f2379a.hashCode() ^ 1000003) * 1000003) ^ this.f2380b.hashCode();
    }

    public final String toString() {
        StringBuilder g10 = f.g("SchedulerConfig{clock=");
        g10.append(this.f2379a);
        g10.append(", values=");
        g10.append(this.f2380b);
        g10.append("}");
        return g10.toString();
    }
}
