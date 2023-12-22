package j4;

import java.nio.charset.Charset;

public final class v6 {

    /* renamed from: a  reason: collision with root package name */
    public final u6 f8509a;

    public v6(s6 s6Var) {
        Charset charset = s7.f8462a;
        this.f8509a = s6Var;
        s6Var.w = this;
    }

    public final void a(int i10, int i11) {
        this.f8509a.f0(i10, (i11 >> 31) ^ (i11 + i11));
    }

    public final void b(int i10, long j10) {
        this.f8509a.h0(i10, (j10 >> 63) ^ (j10 + j10));
    }

    public final void c(int i10, int i11) {
        this.f8509a.f0(i10, i11);
    }

    public final void d(int i10, long j10) {
        this.f8509a.h0(i10, j10);
    }

    public final void e(int i10, boolean z9) {
        this.f8509a.V(i10, z9);
    }

    public final void f(int i10, q6 q6Var) {
        this.f8509a.W(i10, q6Var);
    }

    public final void g(double d10, int i10) {
        this.f8509a.Z(i10, Double.doubleToRawLongBits(d10));
    }

    public final void h(int i10, int i11) {
        this.f8509a.b0(i10, i11);
    }

    public final void i(int i10, int i11) {
        this.f8509a.X(i10, i11);
    }

    public final void j(int i10, long j10) {
        this.f8509a.Z(i10, j10);
    }

    public final void k(int i10, float f10) {
        this.f8509a.X(i10, Float.floatToRawIntBits(f10));
    }

    public final void l(int i10, y8 y8Var, Object obj) {
        u6 u6Var = this.f8509a;
        u6Var.e0(i10, 3);
        y8Var.g((n8) obj, u6Var.w);
        u6Var.e0(i10, 4);
    }

    public final void m(int i10, int i11) {
        this.f8509a.b0(i10, i11);
    }

    public final void n(int i10, long j10) {
        this.f8509a.h0(i10, j10);
    }

    public final void o(int i10, y8 y8Var, Object obj) {
        n8 n8Var = (n8) obj;
        s6 s6Var = (s6) this.f8509a;
        s6Var.g0((i10 << 3) | 2);
        s6Var.g0(((f6) n8Var).a(y8Var));
        y8Var.g(n8Var, s6Var.w);
    }

    public final void p(int i10, int i11) {
        this.f8509a.X(i10, i11);
    }

    public final void q(int i10, long j10) {
        this.f8509a.Z(i10, j10);
    }
}
