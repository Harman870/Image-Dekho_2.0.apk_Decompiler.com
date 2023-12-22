package w2;

import androidx.activity.f;
import java.util.Arrays;
import t2.b;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final b f12716a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f12717b;

    public m(b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.f12716a = bVar;
            this.f12717b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.f12716a.equals(mVar.f12716a)) {
            return false;
        }
        return Arrays.equals(this.f12717b, mVar.f12717b);
    }

    public final int hashCode() {
        return ((this.f12716a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12717b);
    }

    public final String toString() {
        StringBuilder g10 = f.g("EncodedPayload{encoding=");
        g10.append(this.f12716a);
        g10.append(", bytes=[...]}");
        return g10.toString();
    }
}
