package t9;

import androidx.activity.f;
import java.io.IOException;

public final class a implements x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f12031a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f12032b;

    public a(p pVar, n nVar) {
        this.f12032b = pVar;
        this.f12031a = nVar;
    }

    public final void close() {
        this.f12032b.i();
        try {
            this.f12031a.close();
            this.f12032b.k(true);
        } catch (IOException e10) {
            throw this.f12032b.j(e10);
        } catch (Throwable th) {
            this.f12032b.k(false);
            throw th;
        }
    }

    public final z e() {
        return this.f12032b;
    }

    public final void flush() {
        this.f12032b.i();
        try {
            this.f12031a.flush();
            this.f12032b.k(true);
        } catch (IOException e10) {
            throw this.f12032b.j(e10);
        } catch (Throwable th) {
            this.f12032b.k(false);
            throw th;
        }
    }

    public final void g(e eVar, long j10) {
        a0.a(eVar.f12045b, 0, j10);
        while (true) {
            long j11 = 0;
            if (j10 > 0) {
                u uVar = eVar.f12044a;
                while (true) {
                    if (j11 >= 65536) {
                        break;
                    }
                    j11 += (long) (uVar.f12081c - uVar.f12080b);
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    }
                    uVar = uVar.f12084f;
                }
                this.f12032b.i();
                try {
                    this.f12031a.g(eVar, j11);
                    j10 -= j11;
                    this.f12032b.k(true);
                } catch (IOException e10) {
                    throw this.f12032b.j(e10);
                } catch (Throwable th) {
                    this.f12032b.k(false);
                    throw th;
                }
            } else {
                return;
            }
        }
    }

    public final String toString() {
        StringBuilder g10 = f.g("AsyncTimeout.sink(");
        g10.append(this.f12031a);
        g10.append(")");
        return g10.toString();
    }
}
