package q6;

import n6.b;
import n6.c;
import n6.g;

public final class i implements g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f11362a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11363b = false;

    /* renamed from: c  reason: collision with root package name */
    public c f11364c;

    /* renamed from: d  reason: collision with root package name */
    public final f f11365d;

    public i(f fVar) {
        this.f11365d = fVar;
    }

    public final g d(String str) {
        if (!this.f11362a) {
            this.f11362a = true;
            this.f11365d.d(this.f11364c, str, this.f11363b);
            return this;
        }
        throw new b("Cannot encode a second value in the ValueEncoderContext");
    }

    public final g e(boolean z9) {
        if (!this.f11362a) {
            this.f11362a = true;
            this.f11365d.e(this.f11364c, z9 ? 1 : 0, this.f11363b);
            return this;
        }
        throw new b("Cannot encode a second value in the ValueEncoderContext");
    }
}
