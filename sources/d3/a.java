package d3;

import androidx.activity.f;

public final class a extends e {

    /* renamed from: b  reason: collision with root package name */
    public final long f6044b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6045c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6046d;

    /* renamed from: e  reason: collision with root package name */
    public final long f6047e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6048f;

    public a(long j10, int i10, int i11, long j11, int i12) {
        this.f6044b = j10;
        this.f6045c = i10;
        this.f6046d = i11;
        this.f6047e = j11;
        this.f6048f = i12;
    }

    public final int a() {
        return this.f6046d;
    }

    public final long b() {
        return this.f6047e;
    }

    public final int c() {
        return this.f6045c;
    }

    public final int d() {
        return this.f6048f;
    }

    public final long e() {
        return this.f6044b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f6044b == eVar.e() && this.f6045c == eVar.c() && this.f6046d == eVar.a() && this.f6047e == eVar.b() && this.f6048f == eVar.d();
    }

    public final int hashCode() {
        long j10 = this.f6044b;
        long j11 = this.f6047e;
        return ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f6045c) * 1000003) ^ this.f6046d) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f6048f;
    }

    public final String toString() {
        StringBuilder g10 = f.g("EventStoreConfig{maxStorageSizeInBytes=");
        g10.append(this.f6044b);
        g10.append(", loadBatchSize=");
        g10.append(this.f6045c);
        g10.append(", criticalSectionEnterTimeoutMs=");
        g10.append(this.f6046d);
        g10.append(", eventCleanUpAge=");
        g10.append(this.f6047e);
        g10.append(", maxBlobByteSizePerRow=");
        g10.append(this.f6048f);
        g10.append("}");
        return g10.toString();
    }
}
