package o9;

import j9.b0;
import j9.p;
import j9.q;
import j9.u;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import n9.h;
import n9.j;
import t9.g;
import t9.k;
import t9.x;
import t9.y;
import t9.z;

public final class a implements n9.c {

    /* renamed from: a  reason: collision with root package name */
    public final u f10611a;

    /* renamed from: b  reason: collision with root package name */
    public final m9.e f10612b;

    /* renamed from: c  reason: collision with root package name */
    public final g f10613c;

    /* renamed from: d  reason: collision with root package name */
    public final t9.f f10614d;

    /* renamed from: e  reason: collision with root package name */
    public int f10615e = 0;

    /* renamed from: f  reason: collision with root package name */
    public long f10616f = 262144;

    /* renamed from: g  reason: collision with root package name */
    public p f10617g;

    /* renamed from: o9.a$a  reason: collision with other inner class name */
    public abstract class C0123a implements y {

        /* renamed from: a  reason: collision with root package name */
        public final k f10618a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f10619b;

        public C0123a() {
            this.f10618a = new k(a.this.f10613c.e());
        }

        public final void a() {
            int i10 = a.this.f10615e;
            if (i10 != 6) {
                if (i10 == 5) {
                    k kVar = this.f10618a;
                    z zVar = kVar.f12054e;
                    kVar.f12054e = z.f12090d;
                    zVar.a();
                    zVar.b();
                    a.this.f10615e = 6;
                    return;
                }
                StringBuilder g10 = androidx.activity.f.g("state: ");
                g10.append(a.this.f10615e);
                throw new IllegalStateException(g10.toString());
            }
        }

        public final z e() {
            return this.f10618a;
        }

        public long z(t9.e eVar, long j10) {
            try {
                return a.this.f10613c.z(eVar, j10);
            } catch (IOException e10) {
                a.this.f10612b.h();
                a();
                throw e10;
            }
        }
    }

    public final class b implements x {

        /* renamed from: a  reason: collision with root package name */
        public final k f10621a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f10622b;

        public b() {
            this.f10621a = new k(a.this.f10614d.e());
        }

        public final synchronized void close() {
            if (!this.f10622b) {
                this.f10622b = true;
                a.this.f10614d.F("0\r\n\r\n");
                a aVar = a.this;
                k kVar = this.f10621a;
                aVar.getClass();
                z zVar = kVar.f12054e;
                kVar.f12054e = z.f12090d;
                zVar.a();
                zVar.b();
                a.this.f10615e = 3;
            }
        }

        public final z e() {
            return this.f10621a;
        }

        public final synchronized void flush() {
            if (!this.f10622b) {
                a.this.f10614d.flush();
            }
        }

        public final void g(t9.e eVar, long j10) {
            if (this.f10622b) {
                throw new IllegalStateException("closed");
            } else if (j10 != 0) {
                a.this.f10614d.i(j10);
                a.this.f10614d.F("\r\n");
                a.this.f10614d.g(eVar, j10);
                a.this.f10614d.F("\r\n");
            }
        }
    }

    public class c extends C0123a {

        /* renamed from: d  reason: collision with root package name */
        public final q f10624d;

        /* renamed from: e  reason: collision with root package name */
        public long f10625e = -1;

        /* renamed from: f  reason: collision with root package name */
        public boolean f10626f = true;

        public c(q qVar) {
            super();
            this.f10624d = qVar;
        }

        public final void close() {
            if (!this.f10619b) {
                if (this.f10626f && !k9.e.i(this, TimeUnit.MILLISECONDS)) {
                    a.this.f10612b.h();
                    a();
                }
                this.f10619b = true;
            }
        }

        public final long z(t9.e eVar, long j10) {
            if (this.f10619b) {
                throw new IllegalStateException("closed");
            } else if (!this.f10626f) {
                return -1;
            } else {
                long j11 = this.f10625e;
                if (j11 == 0 || j11 == -1) {
                    if (j11 != -1) {
                        a.this.f10613c.l();
                    }
                    try {
                        this.f10625e = a.this.f10613c.H();
                        String trim = a.this.f10613c.l().trim();
                        if (this.f10625e < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f10625e + trim + "\"");
                        }
                        if (this.f10625e == 0) {
                            this.f10626f = false;
                            a aVar = a.this;
                            aVar.f10617g = aVar.k();
                            a aVar2 = a.this;
                            n9.e.d(aVar2.f10611a.f8987h, this.f10624d, aVar2.f10617g);
                            a();
                        }
                        if (!this.f10626f) {
                            return -1;
                        }
                    } catch (NumberFormatException e10) {
                        throw new ProtocolException(e10.getMessage());
                    }
                }
                long z9 = super.z(eVar, Math.min(8192, this.f10625e));
                if (z9 != -1) {
                    this.f10625e -= z9;
                    return z9;
                }
                a.this.f10612b.h();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
        }
    }

    public class d extends C0123a {

        /* renamed from: d  reason: collision with root package name */
        public long f10628d;

        public d(long j10) {
            super();
            this.f10628d = j10;
            if (j10 == 0) {
                a();
            }
        }

        public final void close() {
            if (!this.f10619b) {
                if (this.f10628d != 0 && !k9.e.i(this, TimeUnit.MILLISECONDS)) {
                    a.this.f10612b.h();
                    a();
                }
                this.f10619b = true;
            }
        }

        public final long z(t9.e eVar, long j10) {
            if (!this.f10619b) {
                long j11 = this.f10628d;
                if (j11 == 0) {
                    return -1;
                }
                long z9 = super.z(eVar, Math.min(j11, 8192));
                if (z9 != -1) {
                    long j12 = this.f10628d - z9;
                    this.f10628d = j12;
                    if (j12 == 0) {
                        a();
                    }
                    return z9;
                }
                a.this.f10612b.h();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
            throw new IllegalStateException("closed");
        }
    }

    public final class e implements x {

        /* renamed from: a  reason: collision with root package name */
        public final k f10630a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f10631b;

        public e() {
            this.f10630a = new k(a.this.f10614d.e());
        }

        public final void close() {
            if (!this.f10631b) {
                this.f10631b = true;
                a aVar = a.this;
                k kVar = this.f10630a;
                aVar.getClass();
                z zVar = kVar.f12054e;
                kVar.f12054e = z.f12090d;
                zVar.a();
                zVar.b();
                a.this.f10615e = 3;
            }
        }

        public final z e() {
            return this.f10630a;
        }

        public final void flush() {
            if (!this.f10631b) {
                a.this.f10614d.flush();
            }
        }

        public final void g(t9.e eVar, long j10) {
            if (!this.f10631b) {
                long j11 = eVar.f12045b;
                byte[] bArr = k9.e.f9152a;
                if ((0 | j10) < 0 || 0 > j11 || j11 - 0 < j10) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                a.this.f10614d.g(eVar, j10);
                return;
            }
            throw new IllegalStateException("closed");
        }
    }

    public class f extends C0123a {

        /* renamed from: d  reason: collision with root package name */
        public boolean f10633d;

        public f(a aVar) {
            super();
        }

        public final void close() {
            if (!this.f10619b) {
                if (!this.f10633d) {
                    a();
                }
                this.f10619b = true;
            }
        }

        public final long z(t9.e eVar, long j10) {
            if (this.f10619b) {
                throw new IllegalStateException("closed");
            } else if (this.f10633d) {
                return -1;
            } else {
                long z9 = super.z(eVar, 8192);
                if (z9 != -1) {
                    return z9;
                }
                this.f10633d = true;
                a();
                return -1;
            }
        }
    }

    public a(u uVar, m9.e eVar, g gVar, t9.f fVar) {
        this.f10611a = uVar;
        this.f10612b = eVar;
        this.f10613c = gVar;
        this.f10614d = fVar;
    }

    public final long a(b0 b0Var) {
        if (!n9.e.b(b0Var)) {
            return 0;
        }
        if ("chunked".equalsIgnoreCase(b0Var.a("Transfer-Encoding"))) {
            return -1;
        }
        return n9.e.a(b0Var);
    }

    public final void b() {
        this.f10614d.flush();
    }

    public final void c() {
        this.f10614d.flush();
    }

    public final void cancel() {
        m9.e eVar = this.f10612b;
        if (eVar != null) {
            k9.e.d(eVar.f9408d);
        }
    }

    public final x d(j9.x xVar, long j10) {
        if ("chunked".equalsIgnoreCase(xVar.a("Transfer-Encoding"))) {
            if (this.f10615e == 1) {
                this.f10615e = 2;
                return new b();
            }
            StringBuilder g10 = androidx.activity.f.g("state: ");
            g10.append(this.f10615e);
            throw new IllegalStateException(g10.toString());
        } else if (j10 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.f10615e == 1) {
            this.f10615e = 2;
            return new e();
        } else {
            StringBuilder g11 = androidx.activity.f.g("state: ");
            g11.append(this.f10615e);
            throw new IllegalStateException(g11.toString());
        }
    }

    public final void e(j9.x xVar) {
        boolean z9;
        Proxy.Type type = this.f10612b.f9407c.f8869b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(xVar.f9017b);
        sb.append(' ');
        if (xVar.f9016a.f8942a.equals("https") || type != Proxy.Type.HTTP) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            sb.append(xVar.f9016a);
        } else {
            sb.append(h.a(xVar.f9016a));
        }
        sb.append(" HTTP/1.1");
        l(xVar.f9018c, sb.toString());
    }

    public final y f(b0 b0Var) {
        if (!n9.e.b(b0Var)) {
            return i(0);
        }
        if ("chunked".equalsIgnoreCase(b0Var.a("Transfer-Encoding"))) {
            q qVar = b0Var.f8821a.f9016a;
            if (this.f10615e == 4) {
                this.f10615e = 5;
                return new c(qVar);
            }
            StringBuilder g10 = androidx.activity.f.g("state: ");
            g10.append(this.f10615e);
            throw new IllegalStateException(g10.toString());
        }
        long a10 = n9.e.a(b0Var);
        if (a10 != -1) {
            return i(a10);
        }
        if (this.f10615e == 4) {
            this.f10615e = 5;
            this.f10612b.h();
            return new f(this);
        }
        StringBuilder g11 = androidx.activity.f.g("state: ");
        g11.append(this.f10615e);
        throw new IllegalStateException(g11.toString());
    }

    public final b0.a g(boolean z9) {
        String str;
        int i10 = this.f10615e;
        if (i10 == 1 || i10 == 3) {
            try {
                j a10 = j.a(j());
                b0.a aVar = new b0.a();
                aVar.f8834b = a10.f10403a;
                aVar.f8835c = a10.f10404b;
                aVar.f8836d = a10.f10405c;
                aVar.f8838f = k().e();
                if (z9 && a10.f10404b == 100) {
                    return null;
                }
                if (a10.f10404b == 100) {
                    this.f10615e = 3;
                    return aVar;
                }
                this.f10615e = 4;
                return aVar;
            } catch (EOFException e10) {
                m9.e eVar = this.f10612b;
                if (eVar != null) {
                    str = eVar.f9407c.f8868a.f8810a.o();
                } else {
                    str = "unknown";
                }
                throw new IOException(com.ironsource.adapters.ironsource.a.g("unexpected end of stream on ", str), e10);
            }
        } else {
            StringBuilder g10 = androidx.activity.f.g("state: ");
            g10.append(this.f10615e);
            throw new IllegalStateException(g10.toString());
        }
    }

    public final m9.e h() {
        return this.f10612b;
    }

    public final d i(long j10) {
        if (this.f10615e == 4) {
            this.f10615e = 5;
            return new d(j10);
        }
        StringBuilder g10 = androidx.activity.f.g("state: ");
        g10.append(this.f10615e);
        throw new IllegalStateException(g10.toString());
    }

    public final String j() {
        String w = this.f10613c.w(this.f10616f);
        this.f10616f -= (long) w.length();
        return w;
    }

    public final p k() {
        String str;
        p.a aVar = new p.a();
        while (true) {
            String j10 = j();
            if (j10.length() == 0) {
                return new p(aVar);
            }
            k9.a.f9148a.getClass();
            int indexOf = j10.indexOf(":", 1);
            if (indexOf != -1) {
                str = j10.substring(0, indexOf);
                j10 = j10.substring(indexOf + 1);
            } else {
                if (j10.startsWith(":")) {
                    j10 = j10.substring(1);
                }
                str = "";
            }
            aVar.b(str, j10);
        }
    }

    public final void l(p pVar, String str) {
        if (this.f10615e == 0) {
            this.f10614d.F(str).F("\r\n");
            int length = pVar.f8939a.length / 2;
            for (int i10 = 0; i10 < length; i10++) {
                this.f10614d.F(pVar.d(i10)).F(": ").F(pVar.g(i10)).F("\r\n");
            }
            this.f10614d.F("\r\n");
            this.f10615e = 1;
            return;
        }
        StringBuilder g10 = androidx.activity.f.g("state: ");
        g10.append(this.f10615e);
        throw new IllegalStateException(g10.toString());
    }
}
