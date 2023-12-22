package r0;

import c6.b;
import java.nio.ByteBuffer;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public int f11455a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f11456b;

    /* renamed from: c  reason: collision with root package name */
    public int f11457c;

    /* renamed from: d  reason: collision with root package name */
    public int f11458d;

    public c() {
        if (b.f2484q == null) {
            b.f2484q = new b();
        }
    }

    public final int a(int i10) {
        if (i10 < this.f11458d) {
            return this.f11456b.getShort(this.f11457c + i10);
        }
        return 0;
    }
}
