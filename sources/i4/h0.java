package i4;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final g0 f7340a;

    /* renamed from: b  reason: collision with root package name */
    public int f7341b;

    /* renamed from: c  reason: collision with root package name */
    public int f7342c;

    /* renamed from: d  reason: collision with root package name */
    public int f7343d = 0;

    public h0(g0 g0Var) {
        Charset charset = g1.f7324a;
        this.f7340a = g0Var;
        g0Var.f7323b = this;
    }

    public static final void r(int i10) {
        if ((i10 & 3) != 0) {
            throw i1.d();
        }
    }

    public static final void s(int i10) {
        if ((i10 & 7) != 0) {
            throw i1.d();
        }
    }

    public final void A(List list) {
        int b10;
        int b11;
        if (list instanceof d1) {
            d1 d1Var = (d1) list;
            int i10 = this.f7341b & 7;
            if (i10 == 0) {
                do {
                    d1Var.d(((f0) this.f7340a).i());
                    g0 g0Var = this.f7340a;
                    if (!g0Var.c()) {
                        b11 = g0Var.b();
                    } else {
                        return;
                    }
                } while (b11 == this.f7341b);
                this.f7343d = b11;
            } else if (i10 == 2) {
                int i11 = ((f0) this.f7340a).f7297f + ((f0) this.f7340a).i();
                do {
                    d1Var.d(((f0) this.f7340a).i());
                } while (((f0) this.f7340a).f7297f < i11);
                p(i11);
            } else {
                throw i1.a();
            }
        } else {
            int i12 = this.f7341b & 7;
            if (i12 == 0) {
                do {
                    list.add(Integer.valueOf(((f0) this.f7340a).i()));
                    g0 g0Var2 = this.f7340a;
                    if (!g0Var2.c()) {
                        b10 = g0Var2.b();
                    } else {
                        return;
                    }
                } while (b10 == this.f7341b);
                this.f7343d = b10;
            } else if (i12 == 2) {
                int i13 = ((f0) this.f7340a).f7297f + ((f0) this.f7340a).i();
                do {
                    list.add(Integer.valueOf(((f0) this.f7340a).i()));
                } while (((f0) this.f7340a).f7297f < i13);
                p(i13);
            } else {
                throw i1.a();
            }
        }
    }

    public final void B(List list) {
        int b10;
        int b11;
        if (list instanceof d1) {
            d1 d1Var = (d1) list;
            int i10 = this.f7341b & 7;
            if (i10 == 2) {
                int i11 = ((f0) this.f7340a).i();
                r(i11);
                int i12 = ((f0) this.f7340a).f7297f + i11;
                do {
                    d1Var.d(((f0) this.f7340a).h());
                } while (((f0) this.f7340a).f7297f < i12);
            } else if (i10 == 5) {
                do {
                    d1Var.d(((f0) this.f7340a).h());
                    g0 g0Var = this.f7340a;
                    if (!g0Var.c()) {
                        b11 = g0Var.b();
                    } else {
                        return;
                    }
                } while (b11 == this.f7341b);
                this.f7343d = b11;
            } else {
                throw i1.a();
            }
        } else {
            int i13 = this.f7341b & 7;
            if (i13 == 2) {
                int i14 = ((f0) this.f7340a).i();
                r(i14);
                int i15 = ((f0) this.f7340a).f7297f + i14;
                do {
                    list.add(Integer.valueOf(((f0) this.f7340a).h()));
                } while (((f0) this.f7340a).f7297f < i15);
            } else if (i13 == 5) {
                do {
                    list.add(Integer.valueOf(((f0) this.f7340a).h()));
                    g0 g0Var2 = this.f7340a;
                    if (!g0Var2.c()) {
                        b10 = g0Var2.b();
                    } else {
                        return;
                    }
                } while (b10 == this.f7341b);
                this.f7343d = b10;
            } else {
                throw i1.a();
            }
        }
    }

    public final void a(List list) {
        int b10;
        int b11;
        if (list instanceof q1) {
            q1 q1Var = (q1) list;
            int i10 = this.f7341b & 7;
            if (i10 == 1) {
                do {
                    q1Var.d(((f0) this.f7340a).j());
                    g0 g0Var = this.f7340a;
                    if (!g0Var.c()) {
                        b11 = g0Var.b();
                    } else {
                        return;
                    }
                } while (b11 == this.f7341b);
                this.f7343d = b11;
            } else if (i10 == 2) {
                int i11 = ((f0) this.f7340a).i();
                s(i11);
                int i12 = ((f0) this.f7340a).f7297f + i11;
                do {
                    q1Var.d(((f0) this.f7340a).j());
                } while (((f0) this.f7340a).f7297f < i12);
            } else {
                throw i1.a();
            }
        } else {
            int i13 = this.f7341b & 7;
            if (i13 == 1) {
                do {
                    list.add(Long.valueOf(((f0) this.f7340a).j()));
                    g0 g0Var2 = this.f7340a;
                    if (!g0Var2.c()) {
                        b10 = g0Var2.b();
                    } else {
                        return;
                    }
                } while (b10 == this.f7341b);
                this.f7343d = b10;
            } else if (i13 == 2) {
                int i14 = ((f0) this.f7340a).i();
                s(i14);
                int i15 = ((f0) this.f7340a).f7297f + i14;
                do {
                    list.add(Long.valueOf(((f0) this.f7340a).j()));
                } while (((f0) this.f7340a).f7297f < i15);
            } else {
                throw i1.a();
            }
        }
    }

    public final void b(List list) {
        int b10;
        int b11;
        if (list instanceof w0) {
            w0 w0Var = (w0) list;
            int i10 = this.f7341b & 7;
            if (i10 == 2) {
                int i11 = ((f0) this.f7340a).i();
                r(i11);
                int i12 = ((f0) this.f7340a).f7297f + i11;
                do {
                    w0Var.d(Float.intBitsToFloat(((f0) this.f7340a).h()));
                } while (((f0) this.f7340a).f7297f < i12);
            } else if (i10 == 5) {
                do {
                    w0Var.d(Float.intBitsToFloat(((f0) this.f7340a).h()));
                    g0 g0Var = this.f7340a;
                    if (!g0Var.c()) {
                        b11 = g0Var.b();
                    } else {
                        return;
                    }
                } while (b11 == this.f7341b);
                this.f7343d = b11;
            } else {
                throw i1.a();
            }
        } else {
            int i13 = this.f7341b & 7;
            if (i13 == 2) {
                int i14 = ((f0) this.f7340a).i();
                r(i14);
                int i15 = ((f0) this.f7340a).f7297f + i14;
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((f0) this.f7340a).h())));
                } while (((f0) this.f7340a).f7297f < i15);
            } else if (i13 == 5) {
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((f0) this.f7340a).h())));
                    g0 g0Var2 = this.f7340a;
                    if (!g0Var2.c()) {
                        b10 = g0Var2.b();
                    } else {
                        return;
                    }
                } while (b10 == this.f7341b);
                this.f7343d = b10;
            } else {
                throw i1.a();
            }
        }
    }

    @Deprecated
    public final void c(List list, m2 m2Var, p0 p0Var) {
        int b10;
        int i10 = this.f7341b;
        if ((i10 & 7) == 3) {
            do {
                c1 zze = m2Var.zze();
                n(zze, m2Var, p0Var);
                m2Var.a(zze);
                list.add(zze);
                g0 g0Var = this.f7340a;
                if (!g0Var.c() && this.f7343d == 0) {
                    b10 = g0Var.b();
                } else {
                    return;
                }
            } while (b10 == i10);
            this.f7343d = b10;
            return;
        }
        int i11 = i1.f7378a;
        throw new h1();
    }

    public final void d(List list) {
        int b10;
        int b11;
        if (list instanceof d1) {
            d1 d1Var = (d1) list;
            int i10 = this.f7341b & 7;
            if (i10 == 0) {
                do {
                    d1Var.d(((f0) this.f7340a).i());
                    g0 g0Var = this.f7340a;
                    if (!g0Var.c()) {
                        b11 = g0Var.b();
                    } else {
                        return;
                    }
                } while (b11 == this.f7341b);
                this.f7343d = b11;
            } else if (i10 == 2) {
                int i11 = ((f0) this.f7340a).f7297f + ((f0) this.f7340a).i();
                do {
                    d1Var.d(((f0) this.f7340a).i());
                } while (((f0) this.f7340a).f7297f < i11);
                p(i11);
            } else {
                throw i1.a();
            }
        } else {
            int i12 = this.f7341b & 7;
            if (i12 == 0) {
                do {
                    list.add(Integer.valueOf(((f0) this.f7340a).i()));
                    g0 g0Var2 = this.f7340a;
                    if (!g0Var2.c()) {
                        b10 = g0Var2.b();
                    } else {
                        return;
                    }
                } while (b10 == this.f7341b);
                this.f7343d = b10;
            } else if (i12 == 2) {
                int i13 = ((f0) this.f7340a).f7297f + ((f0) this.f7340a).i();
                do {
                    list.add(Integer.valueOf(((f0) this.f7340a).i()));
                } while (((f0) this.f7340a).f7297f < i13);
                p(i13);
            } else {
                throw i1.a();
            }
        }
    }

    public final void e(List list) {
        int b10;
        int b11;
        if (list instanceof q1) {
            q1 q1Var = (q1) list;
            int i10 = this.f7341b & 7;
            if (i10 == 0) {
                do {
                    q1Var.d(((f0) this.f7340a).k());
                    g0 g0Var = this.f7340a;
                    if (!g0Var.c()) {
                        b11 = g0Var.b();
                    } else {
                        return;
                    }
                } while (b11 == this.f7341b);
                this.f7343d = b11;
            } else if (i10 == 2) {
                int i11 = ((f0) this.f7340a).f7297f + ((f0) this.f7340a).i();
                do {
                    q1Var.d(((f0) this.f7340a).k());
                } while (((f0) this.f7340a).f7297f < i11);
                p(i11);
            } else {
                throw i1.a();
            }
        } else {
            int i12 = this.f7341b & 7;
            if (i12 == 0) {
                do {
                    list.add(Long.valueOf(((f0) this.f7340a).k()));
                    g0 g0Var2 = this.f7340a;
                    if (!g0Var2.c()) {
                        b10 = g0Var2.b();
                    } else {
                        return;
                    }
                } while (b10 == this.f7341b);
                this.f7343d = b10;
            } else if (i12 == 2) {
                int i13 = ((f0) this.f7340a).f7297f + ((f0) this.f7340a).i();
                do {
                    list.add(Long.valueOf(((f0) this.f7340a).k()));
                } while (((f0) this.f7340a).f7297f < i13);
                p(i13);
            } else {
                throw i1.a();
            }
        }
    }

    public final void f(List list, m2 m2Var, p0 p0Var) {
        int b10;
        int i10 = this.f7341b;
        if ((i10 & 7) == 2) {
            do {
                c1 zze = m2Var.zze();
                o(zze, m2Var, p0Var);
                m2Var.a(zze);
                list.add(zze);
                g0 g0Var = this.f7340a;
                if (!g0Var.c() && this.f7343d == 0) {
                    b10 = g0Var.b();
                } else {
                    return;
                }
            } while (b10 == i10);
            this.f7343d = b10;
            return;
        }
        int i11 = i1.f7378a;
        throw new h1();
    }

    public final void g(List list) {
        int b10;
        int b11;
        if (list instanceof d1) {
            d1 d1Var = (d1) list;
            int i10 = this.f7341b & 7;
            if (i10 == 2) {
                int i11 = ((f0) this.f7340a).i();
                r(i11);
                int i12 = ((f0) this.f7340a).f7297f + i11;
                do {
                    d1Var.d(((f0) this.f7340a).h());
                } while (((f0) this.f7340a).f7297f < i12);
            } else if (i10 == 5) {
                do {
                    d1Var.d(((f0) this.f7340a).h());
                    g0 g0Var = this.f7340a;
                    if (!g0Var.c()) {
                        b11 = g0Var.b();
                    } else {
                        return;
                    }
                } while (b11 == this.f7341b);
                this.f7343d = b11;
            } else {
                throw i1.a();
            }
        } else {
            int i13 = this.f7341b & 7;
            if (i13 == 2) {
                int i14 = ((f0) this.f7340a).i();
                r(i14);
                int i15 = ((f0) this.f7340a).f7297f + i14;
                do {
                    list.add(Integer.valueOf(((f0) this.f7340a).h()));
                } while (((f0) this.f7340a).f7297f < i15);
            } else if (i13 == 5) {
                do {
                    list.add(Integer.valueOf(((f0) this.f7340a).h()));
                    g0 g0Var2 = this.f7340a;
                    if (!g0Var2.c()) {
                        b10 = g0Var2.b();
                    } else {
                        return;
                    }
                } while (b10 == this.f7341b);
                this.f7343d = b10;
            } else {
                throw i1.a();
            }
        }
    }

    public final void h(List list) {
        int b10;
        int b11;
        if (list instanceof q1) {
            q1 q1Var = (q1) list;
            int i10 = this.f7341b & 7;
            if (i10 == 1) {
                do {
                    q1Var.d(((f0) this.f7340a).j());
                    g0 g0Var = this.f7340a;
                    if (!g0Var.c()) {
                        b11 = g0Var.b();
                    } else {
                        return;
                    }
                } while (b11 == this.f7341b);
                this.f7343d = b11;
            } else if (i10 == 2) {
                int i11 = ((f0) this.f7340a).i();
                s(i11);
                int i12 = ((f0) this.f7340a).f7297f + i11;
                do {
                    q1Var.d(((f0) this.f7340a).j());
                } while (((f0) this.f7340a).f7297f < i12);
            } else {
                throw i1.a();
            }
        } else {
            int i13 = this.f7341b & 7;
            if (i13 == 1) {
                do {
                    list.add(Long.valueOf(((f0) this.f7340a).j()));
                    g0 g0Var2 = this.f7340a;
                    if (!g0Var2.c()) {
                        b10 = g0Var2.b();
                    } else {
                        return;
                    }
                } while (b10 == this.f7341b);
                this.f7343d = b10;
            } else if (i13 == 2) {
                int i14 = ((f0) this.f7340a).i();
                s(i14);
                int i15 = ((f0) this.f7340a).f7297f + i14;
                do {
                    list.add(Long.valueOf(((f0) this.f7340a).j()));
                } while (((f0) this.f7340a).f7297f < i15);
            } else {
                throw i1.a();
            }
        }
    }

    public final void i(List list) {
        int b10;
        int b11;
        if (list instanceof d1) {
            d1 d1Var = (d1) list;
            int i10 = this.f7341b & 7;
            if (i10 == 0) {
                do {
                    d1Var.d(g0.f(((f0) this.f7340a).i()));
                    g0 g0Var = this.f7340a;
                    if (!g0Var.c()) {
                        b11 = g0Var.b();
                    } else {
                        return;
                    }
                } while (b11 == this.f7341b);
                this.f7343d = b11;
            } else if (i10 == 2) {
                int i11 = ((f0) this.f7340a).f7297f + ((f0) this.f7340a).i();
                do {
                    d1Var.d(g0.f(((f0) this.f7340a).i()));
                } while (((f0) this.f7340a).f7297f < i11);
                p(i11);
            } else {
                throw i1.a();
            }
        } else {
            int i12 = this.f7341b & 7;
            if (i12 == 0) {
                do {
                    list.add(Integer.valueOf(g0.f(((f0) this.f7340a).i())));
                    g0 g0Var2 = this.f7340a;
                    if (!g0Var2.c()) {
                        b10 = g0Var2.b();
                    } else {
                        return;
                    }
                } while (b10 == this.f7341b);
                this.f7343d = b10;
            } else if (i12 == 2) {
                int i13 = ((f0) this.f7340a).f7297f + ((f0) this.f7340a).i();
                do {
                    list.add(Integer.valueOf(g0.f(((f0) this.f7340a).i())));
                } while (((f0) this.f7340a).f7297f < i13);
                p(i13);
            } else {
                throw i1.a();
            }
        }
    }

    public final void j(List list) {
        int b10;
        int b11;
        if (list instanceof q1) {
            q1 q1Var = (q1) list;
            int i10 = this.f7341b & 7;
            if (i10 == 0) {
                do {
                    q1Var.d(g0.g(((f0) this.f7340a).k()));
                    g0 g0Var = this.f7340a;
                    if (!g0Var.c()) {
                        b11 = g0Var.b();
                    } else {
                        return;
                    }
                } while (b11 == this.f7341b);
                this.f7343d = b11;
            } else if (i10 == 2) {
                int i11 = ((f0) this.f7340a).f7297f + ((f0) this.f7340a).i();
                do {
                    q1Var.d(g0.g(((f0) this.f7340a).k()));
                } while (((f0) this.f7340a).f7297f < i11);
                p(i11);
            } else {
                throw i1.a();
            }
        } else {
            int i12 = this.f7341b & 7;
            if (i12 == 0) {
                do {
                    list.add(Long.valueOf(g0.g(((f0) this.f7340a).k())));
                    g0 g0Var2 = this.f7340a;
                    if (!g0Var2.c()) {
                        b10 = g0Var2.b();
                    } else {
                        return;
                    }
                } while (b10 == this.f7341b);
                this.f7343d = b10;
            } else if (i12 == 2) {
                int i13 = ((f0) this.f7340a).f7297f + ((f0) this.f7340a).i();
                do {
                    list.add(Long.valueOf(g0.g(((f0) this.f7340a).k())));
                } while (((f0) this.f7340a).f7297f < i13);
                p(i13);
            } else {
                throw i1.a();
            }
        }
    }

    public final void k(List list, boolean z9) {
        String str;
        int b10;
        int b11;
        if ((this.f7341b & 7) != 2) {
            int i10 = i1.f7378a;
            throw new h1();
        } else if ((list instanceof m1) && !z9) {
            m1 m1Var = (m1) list;
            do {
                m1Var.f(u());
                g0 g0Var = this.f7340a;
                if (!g0Var.c()) {
                    b11 = g0Var.b();
                } else {
                    return;
                }
            } while (b11 == this.f7341b);
            this.f7343d = b11;
        } else {
            do {
                if (z9) {
                    str = w();
                } else {
                    str = v();
                }
                list.add(str);
                g0 g0Var2 = this.f7340a;
                if (!g0Var2.c()) {
                    b10 = g0Var2.b();
                } else {
                    return;
                }
            } while (b10 == this.f7341b);
            this.f7343d = b10;
        }
    }

    public final void l(List list) {
        int b10;
        int b11;
        if (list instanceof d1) {
            d1 d1Var = (d1) list;
            int i10 = this.f7341b & 7;
            if (i10 == 0) {
                do {
                    d1Var.d(((f0) this.f7340a).i());
                    g0 g0Var = this.f7340a;
                    if (!g0Var.c()) {
                        b11 = g0Var.b();
                    } else {
                        return;
                    }
                } while (b11 == this.f7341b);
                this.f7343d = b11;
            } else if (i10 == 2) {
                int i11 = ((f0) this.f7340a).f7297f + ((f0) this.f7340a).i();
                do {
                    d1Var.d(((f0) this.f7340a).i());
                } while (((f0) this.f7340a).f7297f < i11);
                p(i11);
            } else {
                throw i1.a();
            }
        } else {
            int i12 = this.f7341b & 7;
            if (i12 == 0) {
                do {
                    list.add(Integer.valueOf(((f0) this.f7340a).i()));
                    g0 g0Var2 = this.f7340a;
                    if (!g0Var2.c()) {
                        b10 = g0Var2.b();
                    } else {
                        return;
                    }
                } while (b10 == this.f7341b);
                this.f7343d = b10;
            } else if (i12 == 2) {
                int i13 = ((f0) this.f7340a).f7297f + ((f0) this.f7340a).i();
                do {
                    list.add(Integer.valueOf(((f0) this.f7340a).i()));
                } while (((f0) this.f7340a).f7297f < i13);
                p(i13);
            } else {
                throw i1.a();
            }
        }
    }

    public final void m(List list) {
        int b10;
        int b11;
        if (list instanceof q1) {
            q1 q1Var = (q1) list;
            int i10 = this.f7341b & 7;
            if (i10 == 0) {
                do {
                    q1Var.d(((f0) this.f7340a).k());
                    g0 g0Var = this.f7340a;
                    if (!g0Var.c()) {
                        b11 = g0Var.b();
                    } else {
                        return;
                    }
                } while (b11 == this.f7341b);
                this.f7343d = b11;
            } else if (i10 == 2) {
                int i11 = ((f0) this.f7340a).f7297f + ((f0) this.f7340a).i();
                do {
                    q1Var.d(((f0) this.f7340a).k());
                } while (((f0) this.f7340a).f7297f < i11);
                p(i11);
            } else {
                throw i1.a();
            }
        } else {
            int i12 = this.f7341b & 7;
            if (i12 == 0) {
                do {
                    list.add(Long.valueOf(((f0) this.f7340a).k()));
                    g0 g0Var2 = this.f7340a;
                    if (!g0Var2.c()) {
                        b10 = g0Var2.b();
                    } else {
                        return;
                    }
                } while (b10 == this.f7341b);
                this.f7343d = b10;
            } else if (i12 == 2) {
                int i13 = ((f0) this.f7340a).f7297f + ((f0) this.f7340a).i();
                do {
                    list.add(Long.valueOf(((f0) this.f7340a).k()));
                } while (((f0) this.f7340a).f7297f < i13);
                p(i13);
            } else {
                throw i1.a();
            }
        }
    }

    public final void n(Object obj, m2 m2Var, p0 p0Var) {
        int i10 = this.f7342c;
        this.f7342c = ((this.f7341b >>> 3) << 3) | 4;
        try {
            m2Var.i(obj, this, p0Var);
            if (this.f7341b != this.f7342c) {
                throw i1.d();
            }
        } finally {
            this.f7342c = i10;
        }
    }

    public final void o(Object obj, m2 m2Var, p0 p0Var) {
        int i10 = ((f0) this.f7340a).i();
        g0 g0Var = this.f7340a;
        if (g0Var.f7322a < 100) {
            int a10 = g0Var.a(i10);
            this.f7340a.f7322a++;
            m2Var.i(obj, this, p0Var);
            g0 g0Var2 = this.f7340a;
            if (((f0) g0Var2).f7298g == 0) {
                g0Var2.f7322a--;
                f0 f0Var = (f0) g0Var2;
                f0Var.f7299h = a10;
                int i11 = f0Var.f7295d + f0Var.f7296e;
                f0Var.f7295d = i11;
                if (i11 > a10) {
                    int i12 = i11 - a10;
                    f0Var.f7296e = i12;
                    f0Var.f7295d = i11 - i12;
                    return;
                }
                f0Var.f7296e = 0;
                return;
            }
            throw new i1("Protocol message end-group tag did not match expected tag.");
        }
        throw new i1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final void p(int i10) {
        if (((f0) this.f7340a).f7297f != i10) {
            throw i1.e();
        }
    }

    public final void q(int i10) {
        if ((this.f7341b & 7) != i10) {
            throw i1.a();
        }
    }

    public final int t() {
        int i10 = this.f7343d;
        if (i10 != 0) {
            this.f7341b = i10;
            this.f7343d = 0;
        } else {
            i10 = this.f7340a.b();
            this.f7341b = i10;
        }
        if (i10 == 0 || i10 == this.f7342c) {
            return Integer.MAX_VALUE;
        }
        return i10 >>> 3;
    }

    public final d0 u() {
        q(2);
        f0 f0Var = (f0) this.f7340a;
        int i10 = f0Var.i();
        if (i10 > 0) {
            int i11 = f0Var.f7295d;
            int i12 = f0Var.f7297f;
            if (i10 <= i11 - i12) {
                d0 q10 = e0.q(f0Var.f7294c, i12, i10);
                f0Var.f7297f += i10;
                return q10;
            }
        }
        if (i10 == 0) {
            return e0.f7269b;
        }
        if (i10 > 0) {
            int i13 = f0Var.f7295d;
            int i14 = f0Var.f7297f;
            if (i10 <= i13 - i14) {
                int i15 = i10 + i14;
                f0Var.f7297f = i15;
                byte[] copyOfRange = Arrays.copyOfRange(f0Var.f7294c, i14, i15);
                d0 d0Var = e0.f7269b;
                return new d0(copyOfRange);
            }
        }
        if (i10 <= 0) {
            throw i1.c();
        }
        throw i1.e();
    }

    public final String v() {
        q(2);
        f0 f0Var = (f0) this.f7340a;
        int i10 = f0Var.i();
        if (i10 > 0) {
            int i11 = f0Var.f7295d;
            int i12 = f0Var.f7297f;
            if (i10 <= i11 - i12) {
                String str = new String(f0Var.f7294c, i12, i10, g1.f7324a);
                f0Var.f7297f += i10;
                return str;
            }
        }
        if (i10 == 0) {
            return "";
        }
        if (i10 < 0) {
            throw i1.c();
        }
        throw i1.e();
    }

    public final String w() {
        q(2);
        f0 f0Var = (f0) this.f7340a;
        int i10 = f0Var.i();
        if (i10 > 0) {
            int i11 = f0Var.f7295d;
            int i12 = f0Var.f7297f;
            if (i10 <= i11 - i12) {
                String c10 = m3.c(f0Var.f7294c, i12, i10);
                f0Var.f7297f += i10;
                return c10;
            }
        }
        if (i10 == 0) {
            return "";
        }
        if (i10 <= 0) {
            throw i1.c();
        }
        throw i1.e();
    }

    public final void x(List list) {
        int b10;
        int b11;
        if (list instanceof y) {
            y yVar = (y) list;
            int i10 = this.f7341b & 7;
            if (i10 == 0) {
                do {
                    yVar.d(this.f7340a.d());
                    g0 g0Var = this.f7340a;
                    if (!g0Var.c()) {
                        b11 = g0Var.b();
                    } else {
                        return;
                    }
                } while (b11 == this.f7341b);
                this.f7343d = b11;
            } else if (i10 == 2) {
                int i11 = ((f0) this.f7340a).f7297f + ((f0) this.f7340a).i();
                do {
                    yVar.d(this.f7340a.d());
                } while (((f0) this.f7340a).f7297f < i11);
                p(i11);
            } else {
                throw i1.a();
            }
        } else {
            int i12 = this.f7341b & 7;
            if (i12 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f7340a.d()));
                    g0 g0Var2 = this.f7340a;
                    if (!g0Var2.c()) {
                        b10 = g0Var2.b();
                    } else {
                        return;
                    }
                } while (b10 == this.f7341b);
                this.f7343d = b10;
            } else if (i12 == 2) {
                int i13 = ((f0) this.f7340a).f7297f + ((f0) this.f7340a).i();
                do {
                    list.add(Boolean.valueOf(this.f7340a.d()));
                } while (((f0) this.f7340a).f7297f < i13);
                p(i13);
            } else {
                throw i1.a();
            }
        }
    }

    public final void y(List list) {
        int b10;
        if ((this.f7341b & 7) == 2) {
            do {
                list.add(u());
                g0 g0Var = this.f7340a;
                if (!g0Var.c()) {
                    b10 = g0Var.b();
                } else {
                    return;
                }
            } while (b10 == this.f7341b);
            this.f7343d = b10;
            return;
        }
        int i10 = i1.f7378a;
        throw new h1();
    }

    public final void z(List list) {
        int b10;
        int b11;
        if (list instanceof n0) {
            n0 n0Var = (n0) list;
            int i10 = this.f7341b & 7;
            if (i10 == 1) {
                do {
                    n0Var.d(Double.longBitsToDouble(((f0) this.f7340a).j()));
                    g0 g0Var = this.f7340a;
                    if (!g0Var.c()) {
                        b11 = g0Var.b();
                    } else {
                        return;
                    }
                } while (b11 == this.f7341b);
                this.f7343d = b11;
            } else if (i10 == 2) {
                int i11 = ((f0) this.f7340a).i();
                s(i11);
                int i12 = ((f0) this.f7340a).f7297f + i11;
                do {
                    n0Var.d(Double.longBitsToDouble(((f0) this.f7340a).j()));
                } while (((f0) this.f7340a).f7297f < i12);
            } else {
                throw i1.a();
            }
        } else {
            int i13 = this.f7341b & 7;
            if (i13 == 1) {
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((f0) this.f7340a).j())));
                    g0 g0Var2 = this.f7340a;
                    if (!g0Var2.c()) {
                        b10 = g0Var2.b();
                    } else {
                        return;
                    }
                } while (b10 == this.f7341b);
                this.f7343d = b10;
            } else if (i13 == 2) {
                int i14 = ((f0) this.f7340a).i();
                s(i14);
                int i15 = ((f0) this.f7340a).f7297f + i14;
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((f0) this.f7340a).j())));
                } while (((f0) this.f7340a).f7297f < i15);
            } else {
                throw i1.a();
            }
        }
    }
}
