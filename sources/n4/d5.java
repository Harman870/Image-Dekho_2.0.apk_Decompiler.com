package n4;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import r3.o;
import z5.c;

public final class d5 {
    public long A;
    public long B;
    public long C;
    public long D;
    public String E;
    public boolean F;
    public long G;
    public long H;

    /* renamed from: a  reason: collision with root package name */
    public final n4 f9674a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9675b;

    /* renamed from: c  reason: collision with root package name */
    public String f9676c;

    /* renamed from: d  reason: collision with root package name */
    public String f9677d;

    /* renamed from: e  reason: collision with root package name */
    public String f9678e;

    /* renamed from: f  reason: collision with root package name */
    public String f9679f;

    /* renamed from: g  reason: collision with root package name */
    public long f9680g;

    /* renamed from: h  reason: collision with root package name */
    public long f9681h;

    /* renamed from: i  reason: collision with root package name */
    public long f9682i;

    /* renamed from: j  reason: collision with root package name */
    public String f9683j;
    public long k;

    /* renamed from: l  reason: collision with root package name */
    public String f9684l;

    /* renamed from: m  reason: collision with root package name */
    public long f9685m;

    /* renamed from: n  reason: collision with root package name */
    public long f9686n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f9687o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f9688p;

    /* renamed from: q  reason: collision with root package name */
    public String f9689q;

    /* renamed from: r  reason: collision with root package name */
    public Boolean f9690r;

    /* renamed from: s  reason: collision with root package name */
    public long f9691s;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList f9692t;
    public String u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f9693v;
    public long w;

    /* renamed from: x  reason: collision with root package name */
    public long f9694x;

    /* renamed from: y  reason: collision with root package name */
    public long f9695y;

    /* renamed from: z  reason: collision with root package name */
    public long f9696z;

    public d5(n4 n4Var, String str) {
        o.h(n4Var);
        o.e(str);
        this.f9674a = n4Var;
        this.f9675b = str;
        n4Var.d().g();
    }

    public final String a() {
        this.f9674a.d().g();
        return this.f9677d;
    }

    public final void b(String str) {
        this.f9674a.d().g();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.F |= true ^ c.w(this.f9689q, str);
        this.f9689q = str;
    }

    public final void c(String str) {
        this.f9674a.d().g();
        this.F |= !c.w(this.f9676c, str);
        this.f9676c = str;
    }

    public final void d(String str) {
        this.f9674a.d().g();
        this.F |= !c.w(this.f9684l, str);
        this.f9684l = str;
    }

    public final void e(String str) {
        this.f9674a.d().g();
        this.F |= !c.w(this.f9683j, str);
        this.f9683j = str;
    }

    public final void f(long j10) {
        this.f9674a.d().g();
        this.F |= this.k != j10;
        this.k = j10;
    }

    public final void g(long j10) {
        this.f9674a.d().g();
        this.F |= this.G != j10;
        this.G = j10;
    }

    public final void h(long j10) {
        this.f9674a.d().g();
        this.F |= this.f9686n != j10;
        this.f9686n = j10;
    }

    public final void i(long j10) {
        this.f9674a.d().g();
        this.F |= this.f9691s != j10;
        this.f9691s = j10;
    }

    public final void j(String str) {
        this.f9674a.d().g();
        this.F |= !c.w(this.f9679f, str);
        this.f9679f = str;
    }

    public final void k(String str) {
        this.f9674a.d().g();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.F |= true ^ c.w(this.f9677d, str);
        this.f9677d = str;
    }

    public final void l(long j10) {
        this.f9674a.d().g();
        this.F |= this.f9685m != j10;
        this.f9685m = j10;
    }

    public final void m(String str) {
        this.f9674a.d().g();
        this.F |= !c.w(this.E, str);
        this.E = str;
    }

    public final void n(long j10) {
        this.f9674a.d().g();
        this.F |= this.f9682i != j10;
        this.f9682i = j10;
    }

    public final void o(long j10) {
        boolean z9 = true;
        o.b(j10 >= 0);
        this.f9674a.d().g();
        boolean z10 = this.F;
        if (this.f9680g == j10) {
            z9 = false;
        }
        this.F = z10 | z9;
        this.f9680g = j10;
    }

    public final void p(long j10) {
        this.f9674a.d().g();
        this.F |= this.f9681h != j10;
        this.f9681h = j10;
    }

    public final void q(boolean z9) {
        this.f9674a.d().g();
        this.F |= this.f9687o != z9;
        this.f9687o = z9;
    }

    public final void r(String str) {
        this.f9674a.d().g();
        this.F |= !c.w(this.f9678e, str);
        this.f9678e = str;
    }

    public final void s(List list) {
        this.f9674a.d().g();
        if (!c.w(this.f9692t, list)) {
            this.F = true;
            this.f9692t = list != null ? new ArrayList(list) : null;
        }
    }

    public final long t() {
        this.f9674a.d().g();
        return this.k;
    }

    public final String u() {
        this.f9674a.d().g();
        return this.f9689q;
    }

    public final String v() {
        this.f9674a.d().g();
        String str = this.E;
        m((String) null);
        return str;
    }

    public final String w() {
        this.f9674a.d().g();
        return this.f9675b;
    }

    public final String x() {
        this.f9674a.d().g();
        return this.f9676c;
    }

    public final String y() {
        this.f9674a.d().g();
        return this.f9683j;
    }

    public final String z() {
        this.f9674a.d().g();
        return this.f9679f;
    }
}
