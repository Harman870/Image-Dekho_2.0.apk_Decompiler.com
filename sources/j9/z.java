package j9;

import javax.annotation.Nullable;
import t9.f;

public final class z extends a0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f9029a = null;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f9030b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ byte[] f9031c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f9032d;

    public z(int i10, byte[] bArr) {
        this.f9030b = i10;
        this.f9031c = bArr;
        this.f9032d = 0;
    }

    public final long a() {
        return (long) this.f9030b;
    }

    @Nullable
    public final s b() {
        return this.f9029a;
    }

    public final void c(f fVar) {
        fVar.write(this.f9031c, this.f9032d, this.f9030b);
    }
}
