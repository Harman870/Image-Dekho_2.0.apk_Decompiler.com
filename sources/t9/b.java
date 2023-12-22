package t9;

import androidx.activity.f;
import java.io.IOException;

public final class b implements y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y f12034a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f12035b;

    public b(p pVar, o oVar) {
        this.f12035b = pVar;
        this.f12034a = oVar;
    }

    public final void close() {
        this.f12035b.i();
        try {
            this.f12034a.close();
            this.f12035b.k(true);
        } catch (IOException e10) {
            throw this.f12035b.j(e10);
        } catch (Throwable th) {
            this.f12035b.k(false);
            throw th;
        }
    }

    public final z e() {
        return this.f12035b;
    }

    public final String toString() {
        StringBuilder g10 = f.g("AsyncTimeout.source(");
        g10.append(this.f12034a);
        g10.append(")");
        return g10.toString();
    }

    public final long z(e eVar, long j10) {
        this.f12035b.i();
        try {
            long z9 = this.f12034a.z(eVar, 8192);
            this.f12035b.k(true);
            return z9;
        } catch (IOException e10) {
            throw this.f12035b.j(e10);
        } catch (Throwable th) {
            this.f12035b.k(false);
            throw th;
        }
    }
}
