package t9;

import androidx.activity.f;
import java.io.OutputStream;

public final class n implements x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z f12064a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ OutputStream f12065b;

    public n(OutputStream outputStream, p pVar) {
        this.f12064a = pVar;
        this.f12065b = outputStream;
    }

    public final void close() {
        this.f12065b.close();
    }

    public final z e() {
        return this.f12064a;
    }

    public final void flush() {
        this.f12065b.flush();
    }

    public final void g(e eVar, long j10) {
        a0.a(eVar.f12045b, 0, j10);
        while (j10 > 0) {
            this.f12064a.f();
            u uVar = eVar.f12044a;
            int min = (int) Math.min(j10, (long) (uVar.f12081c - uVar.f12080b));
            this.f12065b.write(uVar.f12079a, uVar.f12080b, min);
            int i10 = uVar.f12080b + min;
            uVar.f12080b = i10;
            long j11 = (long) min;
            j10 -= j11;
            eVar.f12045b -= j11;
            if (i10 == uVar.f12081c) {
                eVar.f12044a = uVar.a();
                v.a(uVar);
            }
        }
    }

    public final String toString() {
        StringBuilder g10 = f.g("sink(");
        g10.append(this.f12065b);
        g10.append(")");
        return g10.toString();
    }
}
