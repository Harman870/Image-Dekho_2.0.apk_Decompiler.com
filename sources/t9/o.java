package t9;

import androidx.activity.f;
import java.io.IOException;
import java.io.InputStream;

public final class o implements y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z f12066a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InputStream f12067b;

    public o(InputStream inputStream, z zVar) {
        this.f12066a = zVar;
        this.f12067b = inputStream;
    }

    public final void close() {
        this.f12067b.close();
    }

    public final z e() {
        return this.f12066a;
    }

    public final String toString() {
        StringBuilder g10 = f.g("source(");
        g10.append(this.f12067b);
        g10.append(")");
        return g10.toString();
    }

    public final long z(e eVar, long j10) {
        boolean z9 = true;
        try {
            this.f12066a.f();
            u P = eVar.P(1);
            int read = this.f12067b.read(P.f12079a, P.f12081c, (int) Math.min(8192, (long) (8192 - P.f12081c)));
            if (read == -1) {
                return -1;
            }
            P.f12081c += read;
            long j11 = (long) read;
            eVar.f12045b += j11;
            return j11;
        } catch (AssertionError e10) {
            if (e10.getCause() == null || e10.getMessage() == null || !e10.getMessage().contains("getsockname failed")) {
                z9 = false;
            }
            if (z9) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }
}
