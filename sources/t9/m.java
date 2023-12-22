package t9;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class m implements y {

    /* renamed from: a  reason: collision with root package name */
    public final g f12060a;

    /* renamed from: b  reason: collision with root package name */
    public final Inflater f12061b;

    /* renamed from: c  reason: collision with root package name */
    public int f12062c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12063d;

    public m(t tVar, Inflater inflater) {
        this.f12060a = tVar;
        this.f12061b = inflater;
    }

    public final void close() {
        if (!this.f12063d) {
            this.f12061b.end();
            this.f12063d = true;
            this.f12060a.close();
        }
    }

    public final z e() {
        return this.f12060a.e();
    }

    public final long z(e eVar, long j10) {
        u P;
        if (!this.f12063d) {
            while (true) {
                boolean z9 = false;
                if (this.f12061b.needsInput()) {
                    int i10 = this.f12062c;
                    if (i10 != 0) {
                        int remaining = i10 - this.f12061b.getRemaining();
                        this.f12062c -= remaining;
                        this.f12060a.skip((long) remaining);
                    }
                    if (this.f12061b.getRemaining() != 0) {
                        throw new IllegalStateException("?");
                    } else if (this.f12060a.p()) {
                        z9 = true;
                    } else {
                        u uVar = this.f12060a.d().f12044a;
                        int i11 = uVar.f12081c;
                        int i12 = uVar.f12080b;
                        int i13 = i11 - i12;
                        this.f12062c = i13;
                        this.f12061b.setInput(uVar.f12079a, i12, i13);
                    }
                }
                try {
                    P = eVar.P(1);
                    int inflate = this.f12061b.inflate(P.f12079a, P.f12081c, (int) Math.min(8192, (long) (8192 - P.f12081c)));
                    if (inflate > 0) {
                        P.f12081c += inflate;
                        long j11 = (long) inflate;
                        eVar.f12045b += j11;
                        return j11;
                    } else if (this.f12061b.finished()) {
                        break;
                    } else if (this.f12061b.needsDictionary()) {
                        break;
                    } else if (z9) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e10) {
                    throw new IOException(e10);
                }
            }
            int i14 = this.f12062c;
            if (i14 != 0) {
                int remaining2 = i14 - this.f12061b.getRemaining();
                this.f12062c -= remaining2;
                this.f12060a.skip((long) remaining2);
            }
            if (P.f12080b != P.f12081c) {
                return -1;
            }
            eVar.f12044a = P.a();
            v.a(P);
            return -1;
        }
        throw new IllegalStateException("closed");
    }
}
