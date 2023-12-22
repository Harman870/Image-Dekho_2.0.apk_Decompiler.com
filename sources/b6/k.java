package b6;

public final class k extends l {

    /* renamed from: a  reason: collision with root package name */
    public final int f2291a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2292b;

    public k(int i10, long j10) {
        this.f2291a = i10;
        this.f2292b = j10;
    }

    public final int a() {
        return this.f2291a;
    }

    public final long b() {
        return this.f2292b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return this.f2291a == lVar.a() && this.f2292b == lVar.b();
        }
    }

    public final int hashCode() {
        long j10 = this.f2292b;
        return ((this.f2291a ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        int i10 = this.f2291a;
        long j10 = this.f2292b;
        return "EventRecord{eventType=" + i10 + ", eventTimestamp=" + j10 + "}";
    }
}
