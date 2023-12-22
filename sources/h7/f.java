package h7;

import e7.j;
import e7.l;
import e7.n;
import e7.o;
import e7.p;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import k7.b;

public final class f extends b {

    /* renamed from: l  reason: collision with root package name */
    public static final a f6942l = new a();

    /* renamed from: m  reason: collision with root package name */
    public static final p f6943m = new p("closed");

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f6944i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public String f6945j;
    public l k = n.f6209a;

    public static class a extends Writer {
        public final void close() {
            throw new AssertionError();
        }

        public final void flush() {
            throw new AssertionError();
        }

        public final void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public f() {
        super(f6942l);
    }

    public final void L(long j10) {
        S(new p((Number) Long.valueOf(j10)));
    }

    public final void M(Boolean bool) {
        if (bool == null) {
            S(n.f6209a);
        } else {
            S(new p(bool));
        }
    }

    public final void N(Number number) {
        if (number == null) {
            S(n.f6209a);
            return;
        }
        if (!this.f9137e) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        S(new p(number));
    }

    public final void O(String str) {
        if (str == null) {
            S(n.f6209a);
        } else {
            S(new p(str));
        }
    }

    public final void P(boolean z9) {
        S(new p(Boolean.valueOf(z9)));
    }

    public final l R() {
        ArrayList arrayList = this.f6944i;
        return (l) arrayList.get(arrayList.size() - 1);
    }

    public final void S(l lVar) {
        if (this.f6945j != null) {
            lVar.getClass();
            if (!(lVar instanceof n) || this.f9139g) {
                ((o) R()).f6210a.put(this.f6945j, lVar);
            }
            this.f6945j = null;
        } else if (this.f6944i.isEmpty()) {
            this.k = lVar;
        } else {
            l R = R();
            if (R instanceof j) {
                j jVar = (j) R;
                if (lVar == null) {
                    jVar.getClass();
                    lVar = n.f6209a;
                }
                jVar.f6208a.add(lVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final void c() {
        j jVar = new j();
        S(jVar);
        this.f6944i.add(jVar);
    }

    public final void close() {
        if (this.f6944i.isEmpty()) {
            this.f6944i.add(f6943m);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public final void flush() {
    }

    public final void j() {
        o oVar = new o();
        S(oVar);
        this.f6944i.add(oVar);
    }

    public final void s() {
        if (this.f6944i.isEmpty() || this.f6945j != null) {
            throw new IllegalStateException();
        } else if (R() instanceof j) {
            ArrayList arrayList = this.f6944i;
            arrayList.remove(arrayList.size() - 1);
        } else {
            throw new IllegalStateException();
        }
    }

    public final void t() {
        if (this.f6944i.isEmpty() || this.f6945j != null) {
            throw new IllegalStateException();
        } else if (R() instanceof o) {
            ArrayList arrayList = this.f6944i;
            arrayList.remove(arrayList.size() - 1);
        } else {
            throw new IllegalStateException();
        }
    }

    public final void u(String str) {
        if (this.f6944i.isEmpty() || this.f6945j != null) {
            throw new IllegalStateException();
        } else if (R() instanceof o) {
            this.f6945j = str;
        } else {
            throw new IllegalStateException();
        }
    }

    public final b v() {
        S(n.f6209a);
        return this;
    }
}
