package j2;

public final class b<K, V> extends m.b<K, V> {

    /* renamed from: i  reason: collision with root package name */
    public int f8008i;

    public final void clear() {
        this.f8008i = 0;
        super.clear();
    }

    public final int hashCode() {
        if (this.f8008i == 0) {
            this.f8008i = super.hashCode();
        }
        return this.f8008i;
    }

    public final void i(m.b bVar) {
        this.f8008i = 0;
        super.i(bVar);
    }

    public final V j(int i10) {
        this.f8008i = 0;
        return super.j(i10);
    }

    public final V k(int i10, V v10) {
        this.f8008i = 0;
        return super.k(i10, v10);
    }

    public final V put(K k, V v10) {
        this.f8008i = 0;
        return super.put(k, v10);
    }
}
