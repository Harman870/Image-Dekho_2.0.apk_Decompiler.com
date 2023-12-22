package i4;

import java.nio.charset.Charset;

public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public final l0 f7486a;

    public m0(l0 l0Var) {
        Charset charset = g1.f7324a;
        this.f7486a = l0Var;
        l0Var.f7461b = this;
    }

    public final void a(int i10, int i11) {
        this.f7486a.R(i10, (i11 >> 31) ^ (i11 + i11));
    }

    public final void b(int i10, long j10) {
        this.f7486a.T(i10, (j10 >> 63) ^ (j10 + j10));
    }

    public final void c(int i10, int i11) {
        this.f7486a.R(i10, i11);
    }

    public final void d(int i10, long j10) {
        this.f7486a.T(i10, j10);
    }

    public final void e(int i10, boolean z9) {
        this.f7486a.G(i10, z9);
    }

    public final void f(int i10, e0 e0Var) {
        this.f7486a.H(i10, e0Var);
    }

    public final void g(double d10, int i10) {
        this.f7486a.K(i10, Double.doubleToRawLongBits(d10));
    }

    public final void h(int i10, int i11) {
        this.f7486a.M(i10, i11);
    }

    public final void i(int i10, int i11) {
        this.f7486a.I(i10, i11);
    }

    public final void j(int i10, long j10) {
        this.f7486a.K(i10, j10);
    }

    public final void k(int i10, float f10) {
        this.f7486a.I(i10, Float.floatToRawIntBits(f10));
    }

    public final void l(int i10, m2 m2Var, Object obj) {
        l0 l0Var = this.f7486a;
        l0Var.Q(i10, 3);
        m2Var.h((b2) obj, l0Var.f7461b);
        l0Var.Q(i10, 4);
    }

    public final void m(int i10, int i11) {
        this.f7486a.M(i10, i11);
    }

    public final void n(int i10, long j10) {
        this.f7486a.T(i10, j10);
    }

    public final void o(int i10, m2 m2Var, Object obj) {
        this.f7486a.O(i10, (b2) obj, m2Var);
    }

    public final void p(int i10, int i11) {
        this.f7486a.I(i10, i11);
    }

    public final void q(int i10, long j10) {
        this.f7486a.K(i10, j10);
    }
}
