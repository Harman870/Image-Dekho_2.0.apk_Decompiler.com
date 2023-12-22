package k7;

import androidx.activity.f;
import androidx.activity.result.c;
import com.ironsource.mediationsdk.logger.IronSourceError;
import e7.p;
import h7.e;
import j9.d0;
import java.io.Closeable;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;

public class a implements Closeable {

    /* renamed from: p  reason: collision with root package name */
    public static final char[] f9117p = ")]}'\n".toCharArray();

    /* renamed from: a  reason: collision with root package name */
    public final Reader f9118a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9119b = false;

    /* renamed from: c  reason: collision with root package name */
    public final char[] f9120c = new char[IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES];

    /* renamed from: d  reason: collision with root package name */
    public int f9121d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f9122e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f9123f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f9124g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f9125h = 0;

    /* renamed from: i  reason: collision with root package name */
    public long f9126i;

    /* renamed from: j  reason: collision with root package name */
    public int f9127j;
    public String k;

    /* renamed from: l  reason: collision with root package name */
    public int[] f9128l;

    /* renamed from: m  reason: collision with root package name */
    public int f9129m;

    /* renamed from: n  reason: collision with root package name */
    public String[] f9130n;

    /* renamed from: o  reason: collision with root package name */
    public int[] f9131o;

    /* renamed from: k7.a$a  reason: collision with other inner class name */
    public static class C0110a extends c {
        public C0110a() {
            super(0);
        }

        public final void A(a aVar) {
            int i10;
            if (aVar instanceof e) {
                e eVar = (e) aVar;
                eVar.d0(5);
                Map.Entry entry = (Map.Entry) ((Iterator) eVar.e0()).next();
                eVar.g0(entry.getValue());
                eVar.g0(new p((String) entry.getKey()));
                return;
            }
            int i11 = aVar.f9125h;
            if (i11 == 0) {
                i11 = aVar.o();
            }
            if (i11 == 13) {
                i10 = 9;
            } else if (i11 == 12) {
                i10 = 8;
            } else if (i11 == 14) {
                i10 = 10;
            } else {
                StringBuilder g10 = f.g("Expected a name but was ");
                g10.append(com.ironsource.adapters.ironsource.a.l(aVar.W()));
                g10.append(aVar.L());
                throw new IllegalStateException(g10.toString());
            }
            aVar.f9125h = i10;
        }
    }

    static {
        c.f290a = new C0110a();
    }

    public a(d0.a aVar) {
        int[] iArr = new int[32];
        this.f9128l = iArr;
        this.f9129m = 1;
        iArr[0] = 6;
        this.f9130n = new String[32];
        this.f9131o = new int[32];
        this.f9118a = aVar;
    }

    public boolean A() {
        int i10 = this.f9125h;
        if (i10 == 0) {
            i10 = o();
        }
        return (i10 == 2 || i10 == 4) ? false : true;
    }

    public final boolean E(char c10) {
        if (c10 == 9 || c10 == 10 || c10 == 12 || c10 == 13 || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (!(c10 == '/' || c10 == '=')) {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        j();
        return false;
    }

    public final String L() {
        return " at line " + (this.f9123f + 1) + " column " + ((this.f9121d - this.f9124g) + 1) + " path " + v();
    }

    public boolean M() {
        int i10 = this.f9125h;
        if (i10 == 0) {
            i10 = o();
        }
        if (i10 == 5) {
            this.f9125h = 0;
            int[] iArr = this.f9131o;
            int i11 = this.f9129m - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.f9125h = 0;
            int[] iArr2 = this.f9131o;
            int i12 = this.f9129m - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            StringBuilder g10 = f.g("Expected a boolean but was ");
            g10.append(com.ironsource.adapters.ironsource.a.l(W()));
            g10.append(L());
            throw new IllegalStateException(g10.toString());
        }
    }

    public double N() {
        String str;
        char c10;
        int i10 = this.f9125h;
        if (i10 == 0) {
            i10 = o();
        }
        if (i10 == 15) {
            this.f9125h = 0;
            int[] iArr = this.f9131o;
            int i11 = this.f9129m - 1;
            iArr[i11] = iArr[i11] + 1;
            return (double) this.f9126i;
        }
        if (i10 == 16) {
            this.k = new String(this.f9120c, this.f9121d, this.f9127j);
            this.f9121d += this.f9127j;
        } else {
            if (i10 == 8 || i10 == 9) {
                if (i10 == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                str = T(c10);
            } else if (i10 == 10) {
                str = V();
            } else if (i10 != 11) {
                StringBuilder g10 = f.g("Expected a double but was ");
                g10.append(com.ironsource.adapters.ironsource.a.l(W()));
                g10.append(L());
                throw new IllegalStateException(g10.toString());
            }
            this.k = str;
        }
        this.f9125h = 11;
        double parseDouble = Double.parseDouble(this.k);
        if (this.f9119b || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.k = null;
            this.f9125h = 0;
            int[] iArr2 = this.f9131o;
            int i12 = this.f9129m - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return parseDouble;
        }
        throw new c("JSON forbids NaN and infinities: " + parseDouble + L());
    }

    public int O() {
        String str;
        char c10;
        int i10 = this.f9125h;
        if (i10 == 0) {
            i10 = o();
        }
        if (i10 == 15) {
            long j10 = this.f9126i;
            int i11 = (int) j10;
            if (j10 == ((long) i11)) {
                this.f9125h = 0;
                int[] iArr = this.f9131o;
                int i12 = this.f9129m - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            StringBuilder g10 = f.g("Expected an int but was ");
            g10.append(this.f9126i);
            g10.append(L());
            throw new NumberFormatException(g10.toString());
        }
        if (i10 == 16) {
            this.k = new String(this.f9120c, this.f9121d, this.f9127j);
            this.f9121d += this.f9127j;
        } else if (i10 == 8 || i10 == 9 || i10 == 10) {
            if (i10 == 10) {
                str = V();
            } else {
                if (i10 == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                str = T(c10);
            }
            this.k = str;
            try {
                int parseInt = Integer.parseInt(this.k);
                this.f9125h = 0;
                int[] iArr2 = this.f9131o;
                int i13 = this.f9129m - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder g11 = f.g("Expected an int but was ");
            g11.append(com.ironsource.adapters.ironsource.a.l(W()));
            g11.append(L());
            throw new IllegalStateException(g11.toString());
        }
        this.f9125h = 11;
        double parseDouble = Double.parseDouble(this.k);
        int i14 = (int) parseDouble;
        if (((double) i14) == parseDouble) {
            this.k = null;
            this.f9125h = 0;
            int[] iArr3 = this.f9131o;
            int i15 = this.f9129m - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        }
        StringBuilder g12 = f.g("Expected an int but was ");
        g12.append(this.k);
        g12.append(L());
        throw new NumberFormatException(g12.toString());
    }

    public long P() {
        String str;
        char c10;
        int i10 = this.f9125h;
        if (i10 == 0) {
            i10 = o();
        }
        if (i10 == 15) {
            this.f9125h = 0;
            int[] iArr = this.f9131o;
            int i11 = this.f9129m - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f9126i;
        }
        if (i10 == 16) {
            this.k = new String(this.f9120c, this.f9121d, this.f9127j);
            this.f9121d += this.f9127j;
        } else if (i10 == 8 || i10 == 9 || i10 == 10) {
            if (i10 == 10) {
                str = V();
            } else {
                if (i10 == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                str = T(c10);
            }
            this.k = str;
            try {
                long parseLong = Long.parseLong(this.k);
                this.f9125h = 0;
                int[] iArr2 = this.f9131o;
                int i12 = this.f9129m - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder g10 = f.g("Expected a long but was ");
            g10.append(com.ironsource.adapters.ironsource.a.l(W()));
            g10.append(L());
            throw new IllegalStateException(g10.toString());
        }
        this.f9125h = 11;
        double parseDouble = Double.parseDouble(this.k);
        long j10 = (long) parseDouble;
        if (((double) j10) == parseDouble) {
            this.k = null;
            this.f9125h = 0;
            int[] iArr3 = this.f9131o;
            int i13 = this.f9129m - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return j10;
        }
        StringBuilder g11 = f.g("Expected a long but was ");
        g11.append(this.k);
        g11.append(L());
        throw new NumberFormatException(g11.toString());
    }

    public String Q() {
        String str;
        char c10;
        int i10 = this.f9125h;
        if (i10 == 0) {
            i10 = o();
        }
        if (i10 == 14) {
            str = V();
        } else {
            if (i10 == 12) {
                c10 = '\'';
            } else if (i10 == 13) {
                c10 = '\"';
            } else {
                StringBuilder g10 = f.g("Expected a name but was ");
                g10.append(com.ironsource.adapters.ironsource.a.l(W()));
                g10.append(L());
                throw new IllegalStateException(g10.toString());
            }
            str = T(c10);
        }
        this.f9125h = 0;
        this.f9130n[this.f9129m - 1] = str;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r1 != '/') goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        r9.f9121d = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r4 != r2) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        r9.f9121d = r4 - 1;
        r2 = u(2);
        r9.f9121d++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
        if (r2 != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
        j();
        r2 = r9.f9121d;
        r4 = r0[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (r4 == '*') goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r4 == '/') goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0075, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0076, code lost:
        r9.f9121d = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007b, code lost:
        r9.f9121d = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007f, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        if ((r9.f9121d + 2) <= r9.f9122e) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        if (u(2) == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008e, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0090, code lost:
        r1 = r9.f9120c;
        r2 = r9.f9121d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0096, code lost:
        if (r1[r2] != 10) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0098, code lost:
        r9.f9123f++;
        r9.f9124g = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        if (r4 >= 2) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b1, code lost:
        if (r9.f9120c[r9.f9121d + r4] == "*/".charAt(r4)) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b3, code lost:
        r9.f9121d++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b9, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bc, code lost:
        if (r3 == false) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c3, code lost:
        c0("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c9, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ca, code lost:
        r9.f9121d = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ce, code lost:
        if (r1 != '#') goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d0, code lost:
        j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d8, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int R(boolean r10) {
        /*
            r9 = this;
            char[] r0 = r9.f9120c
        L_0x0002:
            int r1 = r9.f9121d
        L_0x0004:
            int r2 = r9.f9122e
        L_0x0006:
            r3 = 1
            if (r1 != r2) goto L_0x0030
            r9.f9121d = r1
            boolean r1 = r9.u(r3)
            if (r1 != 0) goto L_0x002c
            if (r10 != 0) goto L_0x0015
            r10 = -1
            return r10
        L_0x0015:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            java.lang.StringBuilder r0 = androidx.activity.f.g(r0)
            java.lang.String r1 = r9.L()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x002c:
            int r1 = r9.f9121d
            int r2 = r9.f9122e
        L_0x0030:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L_0x0041
            int r1 = r9.f9123f
            int r1 = r1 + r3
            r9.f9123f = r1
            r9.f9124g = r4
            goto L_0x00d9
        L_0x0041:
            r6 = 32
            if (r1 == r6) goto L_0x00d9
            r6 = 13
            if (r1 == r6) goto L_0x00d9
            r6 = 9
            if (r1 != r6) goto L_0x004f
            goto L_0x00d9
        L_0x004f:
            r6 = 47
            if (r1 != r6) goto L_0x00ca
            r9.f9121d = r4
            r7 = 2
            if (r4 != r2) goto L_0x0068
            int r4 = r4 + -1
            r9.f9121d = r4
            boolean r2 = r9.u(r7)
            int r4 = r9.f9121d
            int r4 = r4 + r3
            r9.f9121d = r4
            if (r2 != 0) goto L_0x0068
            return r1
        L_0x0068:
            r9.j()
            int r2 = r9.f9121d
            char r4 = r0[r2]
            r8 = 42
            if (r4 == r8) goto L_0x007b
            if (r4 == r6) goto L_0x0076
            return r1
        L_0x0076:
            int r2 = r2 + 1
            r9.f9121d = r2
            goto L_0x00d3
        L_0x007b:
            int r2 = r2 + 1
            r9.f9121d = r2
        L_0x007f:
            int r1 = r9.f9121d
            int r1 = r1 + r7
            int r2 = r9.f9122e
            r4 = 0
            if (r1 <= r2) goto L_0x0090
            boolean r1 = r9.u(r7)
            if (r1 == 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            r3 = r4
            goto L_0x00bc
        L_0x0090:
            char[] r1 = r9.f9120c
            int r2 = r9.f9121d
            char r1 = r1[r2]
            if (r1 != r5) goto L_0x00a2
            int r1 = r9.f9123f
            int r1 = r1 + r3
            r9.f9123f = r1
            int r2 = r2 + 1
            r9.f9124g = r2
            goto L_0x00b3
        L_0x00a2:
            if (r4 >= r7) goto L_0x00bc
            char[] r1 = r9.f9120c
            int r2 = r9.f9121d
            int r2 = r2 + r4
            char r1 = r1[r2]
            java.lang.String r2 = "*/"
            char r2 = r2.charAt(r4)
            if (r1 == r2) goto L_0x00b9
        L_0x00b3:
            int r1 = r9.f9121d
            int r1 = r1 + r3
            r9.f9121d = r1
            goto L_0x007f
        L_0x00b9:
            int r4 = r4 + 1
            goto L_0x00a2
        L_0x00bc:
            if (r3 == 0) goto L_0x00c3
            int r1 = r9.f9121d
            int r1 = r1 + r7
            goto L_0x0004
        L_0x00c3:
            java.lang.String r10 = "Unterminated comment"
            r9.c0(r10)
            r10 = 0
            throw r10
        L_0x00ca:
            r2 = 35
            r9.f9121d = r4
            if (r1 != r2) goto L_0x00d8
            r9.j()
        L_0x00d3:
            r9.a0()
            goto L_0x0002
        L_0x00d8:
            return r1
        L_0x00d9:
            r1 = r4
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.a.R(boolean):int");
    }

    public void S() {
        int i10 = this.f9125h;
        if (i10 == 0) {
            i10 = o();
        }
        if (i10 == 7) {
            this.f9125h = 0;
            int[] iArr = this.f9131o;
            int i11 = this.f9129m - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        StringBuilder g10 = f.g("Expected null but was ");
        g10.append(com.ironsource.adapters.ironsource.a.l(W()));
        g10.append(L());
        throw new IllegalStateException(g10.toString());
    }

    public final String T(char c10) {
        char[] cArr = this.f9120c;
        StringBuilder sb = null;
        while (true) {
            int i10 = this.f9121d;
            int i11 = this.f9122e;
            int i12 = i10;
            while (true) {
                if (i12 < i11) {
                    int i13 = i12 + 1;
                    char c11 = cArr[i12];
                    if (c11 == c10) {
                        this.f9121d = i13;
                        int i14 = (i13 - i10) - 1;
                        if (sb == null) {
                            return new String(cArr, i10, i14);
                        }
                        sb.append(cArr, i10, i14);
                        return sb.toString();
                    } else if (c11 == '\\') {
                        this.f9121d = i13;
                        int i15 = (i13 - i10) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i15 + 1) * 2, 16));
                        }
                        sb.append(cArr, i10, i15);
                        sb.append(Y());
                    } else {
                        if (c11 == 10) {
                            this.f9123f++;
                            this.f9124g = i13;
                        }
                        i12 = i13;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i12 - i10) * 2, 16));
                    }
                    sb.append(cArr, i10, i12 - i10);
                    this.f9121d = i12;
                    if (!u(1)) {
                        c0("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public String U() {
        String str;
        char c10;
        int i10 = this.f9125h;
        if (i10 == 0) {
            i10 = o();
        }
        if (i10 == 10) {
            str = V();
        } else {
            if (i10 == 8) {
                c10 = '\'';
            } else if (i10 == 9) {
                c10 = '\"';
            } else if (i10 == 11) {
                str = this.k;
                this.k = null;
            } else if (i10 == 15) {
                str = Long.toString(this.f9126i);
            } else if (i10 == 16) {
                str = new String(this.f9120c, this.f9121d, this.f9127j);
                this.f9121d += this.f9127j;
            } else {
                StringBuilder g10 = f.g("Expected a string but was ");
                g10.append(com.ironsource.adapters.ironsource.a.l(W()));
                g10.append(L());
                throw new IllegalStateException(g10.toString());
            }
            str = T(c10);
        }
        this.f9125h = 0;
        int[] iArr = this.f9131o;
        int i11 = this.f9129m - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        j();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String V() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = r0
        L_0x0003:
            int r3 = r6.f9121d
            int r4 = r3 + r2
            int r5 = r6.f9122e
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f9120c
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.j()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f9120c
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.u(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r0 = r2
            goto L_0x007e
        L_0x005e:
            if (r1 != 0) goto L_0x006b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L_0x006b:
            char[] r3 = r6.f9120c
            int r4 = r6.f9121d
            r1.append(r3, r4, r2)
            int r3 = r6.f9121d
            int r3 = r3 + r2
            r6.f9121d = r3
            r2 = 1
            boolean r2 = r6.u(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r1 != 0) goto L_0x008a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f9120c
            int r3 = r6.f9121d
            r1.<init>(r2, r3, r0)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f9120c
            int r3 = r6.f9121d
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L_0x0095:
            int r2 = r6.f9121d
            int r2 = r2 + r0
            r6.f9121d = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.a.V():java.lang.String");
    }

    public int W() {
        int i10 = this.f9125h;
        if (i10 == 0) {
            i10 = o();
        }
        switch (i10) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void X(int i10) {
        int i11 = this.f9129m;
        int[] iArr = this.f9128l;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[(i11 * 2)];
            int[] iArr3 = new int[(i11 * 2)];
            String[] strArr = new String[(i11 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            System.arraycopy(this.f9131o, 0, iArr3, 0, this.f9129m);
            System.arraycopy(this.f9130n, 0, strArr, 0, this.f9129m);
            this.f9128l = iArr2;
            this.f9131o = iArr3;
            this.f9130n = strArr;
        }
        int[] iArr4 = this.f9128l;
        int i12 = this.f9129m;
        this.f9129m = i12 + 1;
        iArr4[i12] = i10;
    }

    public final char Y() {
        int i10;
        int i11;
        if (this.f9121d != this.f9122e || u(1)) {
            char[] cArr = this.f9120c;
            int i12 = this.f9121d;
            int i13 = i12 + 1;
            this.f9121d = i13;
            char c10 = cArr[i12];
            if (c10 == 10) {
                this.f9123f++;
                this.f9124g = i13;
            } else if (!(c10 == '\"' || c10 == '\'' || c10 == '/' || c10 == '\\')) {
                if (c10 == 'b') {
                    return 8;
                }
                if (c10 == 'f') {
                    return 12;
                }
                if (c10 == 'n') {
                    return 10;
                }
                if (c10 == 'r') {
                    return 13;
                }
                if (c10 == 't') {
                    return 9;
                }
                if (c10 != 'u') {
                    c0("Invalid escape sequence");
                    throw null;
                } else if (i13 + 4 <= this.f9122e || u(4)) {
                    char c11 = 0;
                    int i14 = this.f9121d;
                    int i15 = i14 + 4;
                    while (i14 < i15) {
                        char c12 = this.f9120c[i14];
                        char c13 = (char) (c11 << 4);
                        if (c12 < '0' || c12 > '9') {
                            if (c12 >= 'a' && c12 <= 'f') {
                                i11 = c12 - 'a';
                            } else if (c12 < 'A' || c12 > 'F') {
                                StringBuilder g10 = f.g("\\u");
                                g10.append(new String(this.f9120c, this.f9121d, 4));
                                throw new NumberFormatException(g10.toString());
                            } else {
                                i11 = c12 - 'A';
                            }
                            i10 = i11 + 10;
                        } else {
                            i10 = c12 - '0';
                        }
                        c11 = (char) (i10 + c13);
                        i14++;
                    }
                    this.f9121d += 4;
                    return c11;
                } else {
                    c0("Unterminated escape sequence");
                    throw null;
                }
            }
            return c10;
        }
        c0("Unterminated escape sequence");
        throw null;
    }

    public final void Z(char c10) {
        char[] cArr = this.f9120c;
        while (true) {
            int i10 = this.f9121d;
            int i11 = this.f9122e;
            while (true) {
                if (i10 < i11) {
                    int i12 = i10 + 1;
                    char c11 = cArr[i10];
                    if (c11 == c10) {
                        this.f9121d = i12;
                        return;
                    } else if (c11 == '\\') {
                        this.f9121d = i12;
                        Y();
                        break;
                    } else {
                        if (c11 == 10) {
                            this.f9123f++;
                            this.f9124g = i12;
                        }
                        i10 = i12;
                    }
                } else {
                    this.f9121d = i10;
                    if (!u(1)) {
                        c0("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public void a() {
        int i10 = this.f9125h;
        if (i10 == 0) {
            i10 = o();
        }
        if (i10 == 3) {
            X(1);
            this.f9131o[this.f9129m - 1] = 0;
            this.f9125h = 0;
            return;
        }
        StringBuilder g10 = f.g("Expected BEGIN_ARRAY but was ");
        g10.append(com.ironsource.adapters.ironsource.a.l(W()));
        g10.append(L());
        throw new IllegalStateException(g10.toString());
    }

    public final void a0() {
        char c10;
        do {
            if (this.f9121d < this.f9122e || u(1)) {
                char[] cArr = this.f9120c;
                int i10 = this.f9121d;
                int i11 = i10 + 1;
                this.f9121d = i11;
                c10 = cArr[i10];
                if (c10 == 10) {
                    this.f9123f++;
                    this.f9124g = i11;
                    return;
                }
            } else {
                return;
            }
        } while (c10 != 13);
    }

    public void b0() {
        int i10;
        char c10;
        int i11 = 0;
        do {
            int i12 = this.f9125h;
            if (i12 == 0) {
                i12 = o();
            }
            if (i12 == 3) {
                X(1);
            } else if (i12 == 1) {
                X(3);
            } else if (i12 == 4 || i12 == 2) {
                this.f9129m--;
                i11--;
                this.f9125h = 0;
            } else if (i12 == 14 || i12 == 10) {
                while (true) {
                    i10 = 0;
                    while (true) {
                        int i13 = this.f9121d + i10;
                        if (i13 < this.f9122e) {
                            char c11 = this.f9120c[i13];
                            if (!(c11 == 9 || c11 == 10 || c11 == 12 || c11 == 13 || c11 == ' ')) {
                                if (c11 != '#') {
                                    if (c11 != ',') {
                                        if (!(c11 == '/' || c11 == '=')) {
                                            if (!(c11 == '{' || c11 == '}' || c11 == ':')) {
                                                if (c11 != ';') {
                                                    switch (c11) {
                                                        case '[':
                                                        case ']':
                                                            break;
                                                        case '\\':
                                                            break;
                                                        default:
                                                            i10++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            this.f9121d = i13;
                            if (!u(1)) {
                            }
                        }
                    }
                }
                j();
                this.f9121d += i10;
                this.f9125h = 0;
            } else {
                if (i12 == 8 || i12 == 12) {
                    c10 = '\'';
                } else if (i12 == 9 || i12 == 13) {
                    c10 = '\"';
                } else {
                    if (i12 == 16) {
                        this.f9121d += this.f9127j;
                    }
                    this.f9125h = 0;
                }
                Z(c10);
                this.f9125h = 0;
            }
            i11++;
            this.f9125h = 0;
        } while (i11 != 0);
        int[] iArr = this.f9131o;
        int i14 = this.f9129m;
        int i15 = i14 - 1;
        iArr[i15] = iArr[i15] + 1;
        this.f9130n[i14 - 1] = "null";
    }

    public void c() {
        int i10 = this.f9125h;
        if (i10 == 0) {
            i10 = o();
        }
        if (i10 == 1) {
            X(3);
            this.f9125h = 0;
            return;
        }
        StringBuilder g10 = f.g("Expected BEGIN_OBJECT but was ");
        g10.append(com.ironsource.adapters.ironsource.a.l(W()));
        g10.append(L());
        throw new IllegalStateException(g10.toString());
    }

    public final void c0(String str) {
        StringBuilder g10 = f.g(str);
        g10.append(L());
        throw new c(g10.toString());
    }

    public void close() {
        this.f9125h = 0;
        this.f9128l[0] = 8;
        this.f9129m = 1;
        this.f9118a.close();
    }

    public final void j() {
        if (!this.f9119b) {
            c0("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0209, code lost:
        if (E(r9) != false) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x020b, code lost:
        if (r14 != 2) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x020d, code lost:
        if (r16 == false) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0213, code lost:
        if (r7 != Long.MIN_VALUE) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0215, code lost:
        if (r15 == false) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x021b, code lost:
        if (r7 != 0) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x021d, code lost:
        if (r15 != false) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x021f, code lost:
        if (r15 == false) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0222, code lost:
        r7 = -r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0223, code lost:
        r0.f9126i = r7;
        r0.f9121d += r5;
        r1 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x022d, code lost:
        if (r14 == 2) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0230, code lost:
        if (r14 == 4) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0233, code lost:
        if (r14 != 7) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0235, code lost:
        r0.f9127j = r5;
        r1 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0239, code lost:
        r7 = r1;
        r0.f9125h = r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0176 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0177  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int o() {
        /*
            r19 = this;
            r0 = r19
            int[] r1 = r0.f9128l
            int r2 = r0.f9129m
            int r3 = r2 + -1
            r3 = r1[r3]
            r7 = 0
            r8 = 7
            r9 = 6
            r10 = 4
            r11 = 0
            r12 = 5
            r13 = 1
            r14 = 93
            r15 = 59
            r5 = 44
            r6 = 3
            r4 = 2
            if (r3 != r13) goto L_0x0022
            int r2 = r2 - r13
            r1[r2] = r4
        L_0x001e:
            r1 = 8
            goto L_0x00d3
        L_0x0022:
            if (r3 != r4) goto L_0x003b
            int r1 = r0.R(r13)
            if (r1 == r5) goto L_0x001e
            if (r1 == r15) goto L_0x0037
            if (r1 != r14) goto L_0x0031
            r0.f9125h = r10
            return r10
        L_0x0031:
            java.lang.String r1 = "Unterminated array"
            r0.c0(r1)
            throw r11
        L_0x0037:
            r19.j()
            goto L_0x001e
        L_0x003b:
            if (r3 == r6) goto L_0x02b7
            if (r3 != r12) goto L_0x0041
            goto L_0x02b7
        L_0x0041:
            if (r3 != r10) goto L_0x0075
            int r2 = r2 - r13
            r1[r2] = r12
            int r1 = r0.R(r13)
            r2 = 58
            if (r1 == r2) goto L_0x001e
            r2 = 61
            if (r1 != r2) goto L_0x006f
            r19.j()
            int r1 = r0.f9121d
            int r2 = r0.f9122e
            if (r1 < r2) goto L_0x0061
            boolean r1 = r0.u(r13)
            if (r1 == 0) goto L_0x001e
        L_0x0061:
            char[] r1 = r0.f9120c
            int r2 = r0.f9121d
            char r1 = r1[r2]
            r10 = 62
            if (r1 != r10) goto L_0x001e
            int r2 = r2 + r13
            r0.f9121d = r2
            goto L_0x001e
        L_0x006f:
            java.lang.String r1 = "Expected ':'"
            r0.c0(r1)
            throw r11
        L_0x0075:
            if (r3 != r9) goto L_0x00b8
            boolean r1 = r0.f9119b
            if (r1 == 0) goto L_0x00af
            r0.R(r13)
            int r1 = r0.f9121d
            int r1 = r1 - r13
            r0.f9121d = r1
            char[] r2 = f9117p
            int r10 = r2.length
            int r1 = r1 + r10
            int r10 = r0.f9122e
            if (r1 <= r10) goto L_0x0093
            int r1 = r2.length
            boolean r1 = r0.u(r1)
            if (r1 != 0) goto L_0x0093
            goto L_0x00af
        L_0x0093:
            r1 = r7
        L_0x0094:
            char[] r2 = f9117p
            int r10 = r2.length
            if (r1 >= r10) goto L_0x00a9
            char[] r10 = r0.f9120c
            int r11 = r0.f9121d
            int r11 = r11 + r1
            char r10 = r10[r11]
            char r2 = r2[r1]
            if (r10 == r2) goto L_0x00a5
            goto L_0x00af
        L_0x00a5:
            int r1 = r1 + 1
            r11 = 0
            goto L_0x0094
        L_0x00a9:
            int r1 = r0.f9121d
            int r2 = r2.length
            int r1 = r1 + r2
            r0.f9121d = r1
        L_0x00af:
            int[] r1 = r0.f9128l
            int r2 = r0.f9129m
            int r2 = r2 - r13
            r1[r2] = r8
            goto L_0x001e
        L_0x00b8:
            if (r3 != r8) goto L_0x00cf
            int r1 = r0.R(r7)
            r2 = -1
            if (r1 != r2) goto L_0x00c5
            r4 = 17
            goto L_0x0311
        L_0x00c5:
            r19.j()
            int r1 = r0.f9121d
            int r1 = r1 - r13
            r0.f9121d = r1
            goto L_0x001e
        L_0x00cf:
            r1 = 8
            if (r3 == r1) goto L_0x02af
        L_0x00d3:
            int r2 = r0.R(r13)
            r10 = 34
            if (r2 == r10) goto L_0x02ac
            r10 = 39
            if (r2 == r10) goto L_0x02a7
            if (r2 == r5) goto L_0x0290
            if (r2 == r15) goto L_0x0290
            r1 = 91
            if (r2 == r1) goto L_0x028d
            if (r2 == r14) goto L_0x0287
            r1 = 123(0x7b, float:1.72E-43)
            if (r2 == r1) goto L_0x0284
            int r1 = r0.f9121d
            int r1 = r1 - r13
            r0.f9121d = r1
            char[] r2 = r0.f9120c
            char r1 = r2[r1]
            r2 = 116(0x74, float:1.63E-43)
            if (r1 == r2) goto L_0x011c
            r2 = 84
            if (r1 != r2) goto L_0x00ff
            goto L_0x011c
        L_0x00ff:
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto L_0x0116
            r2 = 70
            if (r1 != r2) goto L_0x0108
            goto L_0x0116
        L_0x0108:
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 == r2) goto L_0x0110
            r2 = 78
            if (r1 != r2) goto L_0x016b
        L_0x0110:
            java.lang.String r1 = "null"
            java.lang.String r2 = "NULL"
            r3 = r8
            goto L_0x0121
        L_0x0116:
            java.lang.String r1 = "false"
            java.lang.String r2 = "FALSE"
            r3 = r9
            goto L_0x0121
        L_0x011c:
            java.lang.String r1 = "true"
            java.lang.String r2 = "TRUE"
            r3 = r12
        L_0x0121:
            int r5 = r1.length()
            r10 = r13
        L_0x0126:
            if (r10 >= r5) goto L_0x014f
            int r11 = r0.f9121d
            int r11 = r11 + r10
            int r14 = r0.f9122e
            if (r11 < r14) goto L_0x0138
            int r11 = r10 + 1
            boolean r11 = r0.u(r11)
            if (r11 != 0) goto L_0x0138
            goto L_0x016b
        L_0x0138:
            char[] r11 = r0.f9120c
            int r14 = r0.f9121d
            int r14 = r14 + r10
            char r11 = r11[r14]
            char r14 = r1.charAt(r10)
            if (r11 == r14) goto L_0x014c
            char r14 = r2.charAt(r10)
            if (r11 == r14) goto L_0x014c
            goto L_0x016b
        L_0x014c:
            int r10 = r10 + 1
            goto L_0x0126
        L_0x014f:
            int r1 = r0.f9121d
            int r1 = r1 + r5
            int r2 = r0.f9122e
            if (r1 < r2) goto L_0x015e
            int r1 = r5 + 1
            boolean r1 = r0.u(r1)
            if (r1 == 0) goto L_0x016d
        L_0x015e:
            char[] r1 = r0.f9120c
            int r2 = r0.f9121d
            int r2 = r2 + r5
            char r1 = r1[r2]
            boolean r1 = r0.E(r1)
            if (r1 == 0) goto L_0x016d
        L_0x016b:
            r3 = r7
            goto L_0x0174
        L_0x016d:
            int r1 = r0.f9121d
            int r1 = r1 + r5
            r0.f9121d = r1
            r0.f9125h = r3
        L_0x0174:
            if (r3 == 0) goto L_0x0177
            return r3
        L_0x0177:
            char[] r1 = r0.f9120c
            int r2 = r0.f9121d
            int r3 = r0.f9122e
            r10 = 0
            r5 = r7
            r14 = r5
            r15 = r14
            r7 = r10
            r16 = r13
        L_0x0185:
            int r9 = r2 + r5
            if (r9 != r3) goto L_0x019c
            int r2 = r1.length
            if (r5 != r2) goto L_0x018e
            goto L_0x0266
        L_0x018e:
            int r2 = r5 + 1
            boolean r2 = r0.u(r2)
            if (r2 != 0) goto L_0x0198
            goto L_0x020b
        L_0x0198:
            int r2 = r0.f9121d
            int r3 = r0.f9122e
        L_0x019c:
            int r9 = r2 + r5
            char r9 = r1[r9]
            r12 = 43
            if (r9 == r12) goto L_0x025a
            r12 = 69
            if (r9 == r12) goto L_0x0250
            r12 = 101(0x65, float:1.42E-43)
            if (r9 == r12) goto L_0x0250
            r12 = 45
            if (r9 == r12) goto L_0x0244
            r12 = 46
            if (r9 == r12) goto L_0x023d
            r12 = 48
            if (r9 < r12) goto L_0x0205
            r12 = 57
            if (r9 <= r12) goto L_0x01bd
            goto L_0x0205
        L_0x01bd:
            if (r14 == r13) goto L_0x01fb
            if (r14 != 0) goto L_0x01c2
            goto L_0x01fb
        L_0x01c2:
            if (r14 != r4) goto L_0x01ee
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x01ca
            goto L_0x0266
        L_0x01ca:
            r17 = 10
            long r17 = r17 * r7
            int r9 = r9 + -48
            long r10 = (long) r9
            long r17 = r17 - r10
            r9 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 > 0) goto L_0x01e5
            if (r9 != 0) goto L_0x01e3
            int r7 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x01e3
            goto L_0x01e5
        L_0x01e3:
            r7 = 0
            goto L_0x01e6
        L_0x01e5:
            r7 = r13
        L_0x01e6:
            r7 = r16 & r7
            r16 = r7
            r7 = r17
            r10 = 6
            goto L_0x0201
        L_0x01ee:
            if (r14 != r6) goto L_0x01f3
            r10 = 6
            r14 = 4
            goto L_0x0201
        L_0x01f3:
            r9 = 5
            r10 = 6
            if (r14 == r9) goto L_0x01f9
            if (r14 != r10) goto L_0x0201
        L_0x01f9:
            r14 = 7
            goto L_0x0201
        L_0x01fb:
            r10 = 6
            int r9 = r9 + -48
            int r7 = -r9
            long r7 = (long) r7
            r14 = r4
        L_0x0201:
            r11 = 0
            goto L_0x0260
        L_0x0205:
            boolean r1 = r0.E(r9)
            if (r1 != 0) goto L_0x0266
        L_0x020b:
            if (r14 != r4) goto L_0x022d
            if (r16 == 0) goto L_0x022d
            r1 = -9223372036854775808
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0217
            if (r15 == 0) goto L_0x022d
        L_0x0217:
            r11 = 0
            int r1 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x021f
            if (r15 != 0) goto L_0x022d
        L_0x021f:
            if (r15 == 0) goto L_0x0222
            goto L_0x0223
        L_0x0222:
            long r7 = -r7
        L_0x0223:
            r0.f9126i = r7
            int r1 = r0.f9121d
            int r1 = r1 + r5
            r0.f9121d = r1
            r1 = 15
            goto L_0x0239
        L_0x022d:
            if (r14 == r4) goto L_0x0235
            r1 = 4
            if (r14 == r1) goto L_0x0235
            r9 = 7
            if (r14 != r9) goto L_0x0266
        L_0x0235:
            r0.f9127j = r5
            r1 = 16
        L_0x0239:
            r7 = r1
            r0.f9125h = r7
            goto L_0x0267
        L_0x023d:
            r11 = r10
            r9 = 7
            r10 = 6
            if (r14 != r4) goto L_0x0266
            r10 = r6
            goto L_0x025f
        L_0x0244:
            r11 = r10
            r9 = 7
            r10 = 6
            if (r14 != 0) goto L_0x024c
            r14 = r13
            r15 = r14
            goto L_0x0260
        L_0x024c:
            r9 = 5
            if (r14 != r9) goto L_0x0266
            goto L_0x025f
        L_0x0250:
            r11 = r10
            r9 = 5
            r10 = 6
            if (r14 == r4) goto L_0x0258
            r10 = 4
            if (r14 != r10) goto L_0x0266
        L_0x0258:
            r14 = r9
            goto L_0x0260
        L_0x025a:
            r11 = r10
            r9 = 5
            if (r14 != r9) goto L_0x0266
            r10 = 6
        L_0x025f:
            r14 = r10
        L_0x0260:
            int r5 = r5 + 1
            r10 = r11
            r12 = 5
            goto L_0x0185
        L_0x0266:
            r7 = 0
        L_0x0267:
            if (r7 == 0) goto L_0x026a
            return r7
        L_0x026a:
            char[] r1 = r0.f9120c
            int r2 = r0.f9121d
            char r1 = r1[r2]
            boolean r1 = r0.E(r1)
            if (r1 == 0) goto L_0x027d
            r19.j()
            r4 = 10
            goto L_0x0311
        L_0x027d:
            java.lang.String r1 = "Expected value"
            r0.c0(r1)
            r1 = 0
            throw r1
        L_0x0284:
            r4 = r13
            goto L_0x0311
        L_0x0287:
            if (r3 != r13) goto L_0x0290
            r1 = 4
            r0.f9125h = r1
            return r1
        L_0x028d:
            r0.f9125h = r6
            return r6
        L_0x0290:
            if (r3 == r13) goto L_0x029c
            if (r3 != r4) goto L_0x0295
            goto L_0x029c
        L_0x0295:
            java.lang.String r1 = "Unexpected value"
            r0.c0(r1)
            r1 = 0
            throw r1
        L_0x029c:
            r19.j()
            int r1 = r0.f9121d
            int r1 = r1 - r13
            r0.f9121d = r1
            r4 = 7
            goto L_0x0311
        L_0x02a7:
            r19.j()
            r4 = r1
            goto L_0x0311
        L_0x02ac:
            r4 = 9
            goto L_0x0311
        L_0x02af:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x02b7:
            int r2 = r2 - r13
            r6 = 4
            r1[r2] = r6
            r1 = 125(0x7d, float:1.75E-43)
            r2 = 5
            if (r3 != r2) goto L_0x02d7
            int r2 = r0.R(r13)
            if (r2 == r5) goto L_0x02d7
            if (r2 == r15) goto L_0x02d4
            if (r2 != r1) goto L_0x02cd
            r0.f9125h = r4
            return r4
        L_0x02cd:
            java.lang.String r1 = "Unterminated object"
            r0.c0(r1)
            r1 = 0
            throw r1
        L_0x02d4:
            r19.j()
        L_0x02d7:
            int r2 = r0.R(r13)
            r5 = 34
            if (r2 == r5) goto L_0x030f
            r5 = 39
            if (r2 == r5) goto L_0x0309
            java.lang.String r5 = "Expected name"
            if (r2 == r1) goto L_0x02fe
            r19.j()
            int r1 = r0.f9121d
            int r1 = r1 - r13
            r0.f9121d = r1
            char r1 = (char) r2
            boolean r1 = r0.E(r1)
            if (r1 == 0) goto L_0x02f9
            r4 = 14
            goto L_0x0311
        L_0x02f9:
            r0.c0(r5)
            r1 = 0
            throw r1
        L_0x02fe:
            r1 = 0
            r2 = 5
            if (r3 == r2) goto L_0x0305
            r0.f9125h = r4
            return r4
        L_0x0305:
            r0.c0(r5)
            throw r1
        L_0x0309:
            r19.j()
            r4 = 12
            goto L_0x0311
        L_0x030f:
            r4 = 13
        L_0x0311:
            r0.f9125h = r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.a.o():int");
    }

    public void s() {
        int i10 = this.f9125h;
        if (i10 == 0) {
            i10 = o();
        }
        if (i10 == 4) {
            int i11 = this.f9129m - 1;
            this.f9129m = i11;
            int[] iArr = this.f9131o;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f9125h = 0;
            return;
        }
        StringBuilder g10 = f.g("Expected END_ARRAY but was ");
        g10.append(com.ironsource.adapters.ironsource.a.l(W()));
        g10.append(L());
        throw new IllegalStateException(g10.toString());
    }

    public void t() {
        int i10 = this.f9125h;
        if (i10 == 0) {
            i10 = o();
        }
        if (i10 == 2) {
            int i11 = this.f9129m - 1;
            this.f9129m = i11;
            this.f9130n[i11] = null;
            int[] iArr = this.f9131o;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f9125h = 0;
            return;
        }
        StringBuilder g10 = f.g("Expected END_OBJECT but was ");
        g10.append(com.ironsource.adapters.ironsource.a.l(W()));
        g10.append(L());
        throw new IllegalStateException(g10.toString());
    }

    public String toString() {
        return getClass().getSimpleName() + L();
    }

    public final boolean u(int i10) {
        int i11;
        int i12;
        char[] cArr = this.f9120c;
        int i13 = this.f9124g;
        int i14 = this.f9121d;
        this.f9124g = i13 - i14;
        int i15 = this.f9122e;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f9122e = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f9122e = 0;
        }
        this.f9121d = 0;
        do {
            Reader reader = this.f9118a;
            int i17 = this.f9122e;
            int read = reader.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f9122e + read;
            this.f9122e = i11;
            if (this.f9123f == 0 && (i12 = this.f9124g) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f9121d++;
                this.f9124g = i12 + 1;
                i10++;
                continue;
            }
        } while (i11 < i10);
        return true;
    }

    public String v() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i10 = this.f9129m;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f9128l[i11];
            if (i12 == 1 || i12 == 2) {
                sb.append('[');
                sb.append(this.f9131o[i11]);
                sb.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb.append('.');
                String str = this.f9130n[i11];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }
}
