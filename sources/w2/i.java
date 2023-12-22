package w2;

import androidx.activity.f;
import d3.s;
import t2.b;
import t2.c;

public final class i extends r {

    /* renamed from: a  reason: collision with root package name */
    public final s f12699a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12700b;

    /* renamed from: c  reason: collision with root package name */
    public final c<?> f12701c;

    /* renamed from: d  reason: collision with root package name */
    public final s f12702d;

    /* renamed from: e  reason: collision with root package name */
    public final b f12703e;

    public i(s sVar, String str, c cVar, s sVar2, b bVar) {
        this.f12699a = sVar;
        this.f12700b = str;
        this.f12701c = cVar;
        this.f12702d = sVar2;
        this.f12703e = bVar;
    }

    public final b a() {
        return this.f12703e;
    }

    public final c<?> b() {
        return this.f12701c;
    }

    public final s c() {
        return this.f12702d;
    }

    public final s d() {
        return this.f12699a;
    }

    public final String e() {
        return this.f12700b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f12699a.equals(rVar.d()) && this.f12700b.equals(rVar.e()) && this.f12701c.equals(rVar.b()) && this.f12702d.equals(rVar.c()) && this.f12703e.equals(rVar.a());
    }

    public final int hashCode() {
        return ((((((((this.f12699a.hashCode() ^ 1000003) * 1000003) ^ this.f12700b.hashCode()) * 1000003) ^ this.f12701c.hashCode()) * 1000003) ^ this.f12702d.hashCode()) * 1000003) ^ this.f12703e.hashCode();
    }

    public final String toString() {
        StringBuilder g10 = f.g("SendRequest{transportContext=");
        g10.append(this.f12699a);
        g10.append(", transportName=");
        g10.append(this.f12700b);
        g10.append(", event=");
        g10.append(this.f12701c);
        g10.append(", transformer=");
        g10.append(this.f12702d);
        g10.append(", encoding=");
        g10.append(this.f12703e);
        g10.append("}");
        return g10.toString();
    }
}
