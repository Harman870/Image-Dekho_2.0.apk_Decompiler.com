package j4;

import java.util.HashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f8049a;

    /* renamed from: b  reason: collision with root package name */
    public final long f8050b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f8051c;

    public b(HashMap hashMap, long j10, String str) {
        this.f8049a = str;
        this.f8050b = j10;
        HashMap hashMap2 = new HashMap();
        this.f8051c = hashMap2;
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
    }

    /* renamed from: a */
    public final b clone() {
        String str = this.f8049a;
        return new b(new HashMap(this.f8051c), this.f8050b, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f8050b == bVar.f8050b && this.f8049a.equals(bVar.f8049a)) {
            return this.f8051c.equals(bVar.f8051c);
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f8050b;
        return (((this.f8049a.hashCode() * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f8051c.hashCode();
    }

    public final String toString() {
        String str = this.f8049a;
        long j10 = this.f8050b;
        String obj = this.f8051c.toString();
        return "Event{name='" + str + "', timestamp=" + j10 + ", params=" + obj + "}";
    }
}
