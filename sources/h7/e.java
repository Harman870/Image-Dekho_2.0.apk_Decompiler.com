package h7;

import androidx.activity.f;
import e7.j;
import e7.n;
import e7.o;
import e7.p;
import g7.l;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;

public final class e extends k7.a {
    public static final Object u = new Object();

    /* renamed from: q  reason: collision with root package name */
    public Object[] f6938q;

    /* renamed from: r  reason: collision with root package name */
    public int f6939r;

    /* renamed from: s  reason: collision with root package name */
    public String[] f6940s;

    /* renamed from: t  reason: collision with root package name */
    public int[] f6941t;

    public static class a extends Reader {
        public final void close() {
            throw new AssertionError();
        }

        public final int read(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    static {
        new a();
    }

    private String L() {
        StringBuilder g10 = f.g(" at path ");
        g10.append(v());
        return g10.toString();
    }

    public final boolean A() {
        int W = W();
        return (W == 4 || W == 2) ? false : true;
    }

    public final boolean M() {
        d0(8);
        boolean d10 = ((p) f0()).d();
        int i10 = this.f6939r;
        if (i10 > 0) {
            int[] iArr = this.f6941t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return d10;
    }

    public final double N() {
        double d10;
        int W = W();
        if (W == 7 || W == 6) {
            p pVar = (p) e0();
            if (pVar.f6212a instanceof Number) {
                d10 = pVar.g().doubleValue();
            } else {
                d10 = Double.parseDouble(pVar.h());
            }
            if (this.f9119b || (!Double.isNaN(d10) && !Double.isInfinite(d10))) {
                f0();
                int i10 = this.f6939r;
                if (i10 > 0) {
                    int[] iArr = this.f6941t;
                    int i11 = i10 - 1;
                    iArr[i11] = iArr[i11] + 1;
                }
                return d10;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + d10);
        }
        StringBuilder g10 = f.g("Expected ");
        g10.append(com.ironsource.adapters.ironsource.a.l(7));
        g10.append(" but was ");
        g10.append(com.ironsource.adapters.ironsource.a.l(W));
        g10.append(L());
        throw new IllegalStateException(g10.toString());
    }

    public final int O() {
        int i10;
        int W = W();
        if (W == 7 || W == 6) {
            p pVar = (p) e0();
            if (pVar.f6212a instanceof Number) {
                i10 = pVar.g().intValue();
            } else {
                i10 = Integer.parseInt(pVar.h());
            }
            f0();
            int i11 = this.f6939r;
            if (i11 > 0) {
                int[] iArr = this.f6941t;
                int i12 = i11 - 1;
                iArr[i12] = iArr[i12] + 1;
            }
            return i10;
        }
        StringBuilder g10 = f.g("Expected ");
        g10.append(com.ironsource.adapters.ironsource.a.l(7));
        g10.append(" but was ");
        g10.append(com.ironsource.adapters.ironsource.a.l(W));
        g10.append(L());
        throw new IllegalStateException(g10.toString());
    }

    public final long P() {
        long j10;
        int W = W();
        if (W == 7 || W == 6) {
            p pVar = (p) e0();
            if (pVar.f6212a instanceof Number) {
                j10 = pVar.g().longValue();
            } else {
                j10 = Long.parseLong(pVar.h());
            }
            f0();
            int i10 = this.f6939r;
            if (i10 > 0) {
                int[] iArr = this.f6941t;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return j10;
        }
        StringBuilder g10 = f.g("Expected ");
        g10.append(com.ironsource.adapters.ironsource.a.l(7));
        g10.append(" but was ");
        g10.append(com.ironsource.adapters.ironsource.a.l(W));
        g10.append(L());
        throw new IllegalStateException(g10.toString());
    }

    public final String Q() {
        d0(5);
        Map.Entry entry = (Map.Entry) ((Iterator) e0()).next();
        String str = (String) entry.getKey();
        this.f6940s[this.f6939r - 1] = str;
        g0(entry.getValue());
        return str;
    }

    public final void S() {
        d0(9);
        f0();
        int i10 = this.f6939r;
        if (i10 > 0) {
            int[] iArr = this.f6941t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public final String U() {
        int W = W();
        if (W == 6 || W == 7) {
            String h10 = ((p) f0()).h();
            int i10 = this.f6939r;
            if (i10 > 0) {
                int[] iArr = this.f6941t;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return h10;
        }
        StringBuilder g10 = f.g("Expected ");
        g10.append(com.ironsource.adapters.ironsource.a.l(6));
        g10.append(" but was ");
        g10.append(com.ironsource.adapters.ironsource.a.l(W));
        g10.append(L());
        throw new IllegalStateException(g10.toString());
    }

    public final int W() {
        if (this.f6939r == 0) {
            return 10;
        }
        Object e02 = e0();
        if (e02 instanceof Iterator) {
            boolean z9 = this.f6938q[this.f6939r - 2] instanceof o;
            Iterator it = (Iterator) e02;
            if (it.hasNext()) {
                if (z9) {
                    return 5;
                }
                g0(it.next());
                return W();
            } else if (z9) {
                return 4;
            } else {
                return 2;
            }
        } else if (e02 instanceof o) {
            return 3;
        } else {
            if (e02 instanceof j) {
                return 1;
            }
            if (e02 instanceof p) {
                Object obj = ((p) e02).f6212a;
                if (obj instanceof String) {
                    return 6;
                }
                if (obj instanceof Boolean) {
                    return 8;
                }
                if (obj instanceof Number) {
                    return 7;
                }
                throw new AssertionError();
            } else if (e02 instanceof n) {
                return 9;
            } else {
                if (e02 == u) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public final void a() {
        d0(1);
        g0(((j) e0()).iterator());
        this.f6941t[this.f6939r - 1] = 0;
    }

    public final void b0() {
        if (W() == 5) {
            Q();
            this.f6940s[this.f6939r - 2] = "null";
        } else {
            f0();
            int i10 = this.f6939r;
            if (i10 > 0) {
                this.f6940s[i10 - 1] = "null";
            }
        }
        int i11 = this.f6939r;
        if (i11 > 0) {
            int[] iArr = this.f6941t;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    public final void c() {
        d0(3);
        g0(new l.b.a((l.b) ((o) e0()).f6210a.entrySet()));
    }

    public final void close() {
        this.f6938q = new Object[]{u};
        this.f6939r = 1;
    }

    public final void d0(int i10) {
        if (W() != i10) {
            StringBuilder g10 = f.g("Expected ");
            g10.append(com.ironsource.adapters.ironsource.a.l(i10));
            g10.append(" but was ");
            g10.append(com.ironsource.adapters.ironsource.a.l(W()));
            g10.append(L());
            throw new IllegalStateException(g10.toString());
        }
    }

    public final Object e0() {
        return this.f6938q[this.f6939r - 1];
    }

    public final Object f0() {
        Object[] objArr = this.f6938q;
        int i10 = this.f6939r - 1;
        this.f6939r = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void g0(Object obj) {
        int i10 = this.f6939r;
        Object[] objArr = this.f6938q;
        if (i10 == objArr.length) {
            Object[] objArr2 = new Object[(i10 * 2)];
            int[] iArr = new int[(i10 * 2)];
            String[] strArr = new String[(i10 * 2)];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f6941t, 0, iArr, 0, this.f6939r);
            System.arraycopy(this.f6940s, 0, strArr, 0, this.f6939r);
            this.f6938q = objArr2;
            this.f6941t = iArr;
            this.f6940s = strArr;
        }
        Object[] objArr3 = this.f6938q;
        int i11 = this.f6939r;
        this.f6939r = i11 + 1;
        objArr3[i11] = obj;
    }

    public final void s() {
        d0(2);
        f0();
        f0();
        int i10 = this.f6939r;
        if (i10 > 0) {
            int[] iArr = this.f6941t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public final void t() {
        d0(4);
        f0();
        f0();
        int i10 = this.f6939r;
        if (i10 > 0) {
            int[] iArr = this.f6941t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public final String toString() {
        return e.class.getSimpleName();
    }

    public final String v() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i10 = 0;
        while (i10 < this.f6939r) {
            Object[] objArr = this.f6938q;
            Object obj = objArr[i10];
            if (obj instanceof j) {
                i10++;
                if (objArr[i10] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f6941t[i10]);
                    sb.append(']');
                }
            } else if (obj instanceof o) {
                i10++;
                if (objArr[i10] instanceof Iterator) {
                    sb.append('.');
                    String str = this.f6940s[i10];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            }
            i10++;
        }
        return sb.toString();
    }
}
