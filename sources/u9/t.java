package u9;

import j9.b0;
import j9.c0;
import j9.d;
import j9.d0;
import j9.e;
import j9.k;
import j9.n;
import j9.p;
import j9.q;
import j9.s;
import j9.t;
import j9.u;
import j9.w;
import j9.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import m9.i;
import q9.f;
import t9.g;
import t9.j;
import t9.q;
import u9.z;

public final class t<T> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f12300a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f12301b;

    /* renamed from: c  reason: collision with root package name */
    public final d.a f12302c;

    /* renamed from: d  reason: collision with root package name */
    public final f<d0, T> f12303d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f12304e;
    @GuardedBy("this")
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public w f12305f;
    @GuardedBy("this")
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    public Throwable f12306g;
    @GuardedBy("this")

    /* renamed from: h  reason: collision with root package name */
    public boolean f12307h;

    public class a implements e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f12308a;

        public a(d dVar) {
            this.f12308a = dVar;
        }

        public final void a(Throwable th) {
            try {
                this.f12308a.b(t.this, th);
            } catch (Throwable th2) {
                h0.m(th2);
                th2.printStackTrace();
            }
        }

        public final void b(b0 b0Var) {
            try {
                try {
                    this.f12308a.a(t.this, t.this.d(b0Var));
                } catch (Throwable th) {
                    h0.m(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                h0.m(th2);
                a(th2);
            }
        }
    }

    public static final class b extends d0 {

        /* renamed from: b  reason: collision with root package name */
        public final d0 f12310b;

        /* renamed from: c  reason: collision with root package name */
        public final t9.t f12311c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public IOException f12312d;

        public class a extends j {
            public a(g gVar) {
                super(gVar);
            }

            public final long z(t9.e eVar, long j10) {
                try {
                    return this.f12053a.z(eVar, 8192);
                } catch (IOException e10) {
                    b.this.f12312d = e10;
                    throw e10;
                }
            }
        }

        public b(d0 d0Var) {
            this.f12310b = d0Var;
            a aVar = new a(d0Var.j());
            Logger logger = q.f12068a;
            this.f12311c = new t9.t(aVar);
        }

        public final long a() {
            return this.f12310b.a();
        }

        public final s c() {
            return this.f12310b.c();
        }

        public final void close() {
            this.f12310b.close();
        }

        public final g j() {
            return this.f12311c;
        }
    }

    public static final class c extends d0 {
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public final s f12314b;

        /* renamed from: c  reason: collision with root package name */
        public final long f12315c;

        public c(@Nullable s sVar, long j10) {
            this.f12314b = sVar;
            this.f12315c = j10;
        }

        public final long a() {
            return this.f12315c;
        }

        public final s c() {
            return this.f12314b;
        }

        public final g j() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public t(a0 a0Var, Object[] objArr, d.a aVar, f<d0, T> fVar) {
        this.f12300a = a0Var;
        this.f12301b = objArr;
        this.f12302c = aVar;
        this.f12303d = fVar;
    }

    public final b0<T> a() {
        d c10;
        synchronized (this) {
            if (!this.f12307h) {
                this.f12307h = true;
                c10 = c();
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.f12304e) {
            ((w) c10).f9009b.a();
        }
        w wVar = (w) c10;
        synchronized (wVar) {
            if (!wVar.f9012e) {
                wVar.f9012e = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        wVar.f9009b.f9443e.i();
        i iVar = wVar.f9009b;
        iVar.getClass();
        iVar.f9444f = f.f11399a.k();
        iVar.f9442d.getClass();
        try {
            k kVar = wVar.f9008a.f8980a;
            synchronized (kVar) {
                kVar.f8927f.add(wVar);
            }
            b0 b10 = wVar.b();
            k kVar2 = wVar.f9008a.f8980a;
            kVar2.c(kVar2.f8927f, wVar);
            return d(b10);
        } catch (Throwable th) {
            k kVar3 = wVar.f9008a.f8980a;
            kVar3.c(kVar3.f8927f, wVar);
            throw th;
        }
    }

    public final w b() {
        j9.q qVar;
        q.a aVar;
        d.a aVar2 = this.f12302c;
        a0 a0Var = this.f12300a;
        Object[] objArr = this.f12301b;
        x<?>[] xVarArr = a0Var.f12222j;
        int length = objArr.length;
        if (length == xVarArr.length) {
            z zVar = new z(a0Var.f12215c, a0Var.f12214b, a0Var.f12216d, a0Var.f12217e, a0Var.f12218f, a0Var.f12219g, a0Var.f12220h, a0Var.f12221i);
            if (a0Var.k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(objArr[i10]);
                xVarArr[i10].a(zVar, objArr[i10]);
            }
            q.a aVar3 = zVar.f12368d;
            if (aVar3 != null) {
                qVar = aVar3.a();
            } else {
                j9.q qVar2 = zVar.f12366b;
                String str = zVar.f12367c;
                qVar2.getClass();
                try {
                    aVar = new q.a();
                    aVar.b(qVar2, str);
                } catch (IllegalArgumentException unused) {
                    aVar = null;
                }
                if (aVar != null) {
                    qVar = aVar.a();
                } else {
                    qVar = null;
                }
                if (qVar == null) {
                    StringBuilder g10 = androidx.activity.f.g("Malformed URL. Base: ");
                    g10.append(zVar.f12366b);
                    g10.append(", Relative: ");
                    g10.append(zVar.f12367c);
                    throw new IllegalArgumentException(g10.toString());
                }
            }
            z.a aVar4 = zVar.k;
            if (aVar4 == null) {
                n.a aVar5 = zVar.f12374j;
                if (aVar5 != null) {
                    aVar4 = new n(aVar5.f8933a, aVar5.f8934b);
                } else {
                    t.a aVar6 = zVar.f12373i;
                    if (aVar6 != null) {
                        if (!aVar6.f8975c.isEmpty()) {
                            aVar4 = new j9.t(aVar6.f8973a, aVar6.f8974b, aVar6.f8975c);
                        } else {
                            throw new IllegalStateException("Multipart body must have at least one part.");
                        }
                    } else if (zVar.f12372h) {
                        byte[] bArr = new byte[0];
                        long j10 = (long) 0;
                        byte[] bArr2 = k9.e.f9152a;
                        if ((j10 | j10) < 0 || j10 > j10 || j10 - j10 < j10) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        aVar4 = new j9.z(0, bArr);
                    }
                }
            }
            s sVar = zVar.f12371g;
            if (sVar != null) {
                if (aVar4 != null) {
                    aVar4 = new z.a(aVar4, sVar);
                } else {
                    zVar.f12370f.a("Content-Type", sVar.f8961a);
                }
            }
            x.a aVar7 = zVar.f12369e;
            aVar7.f9022a = qVar;
            p.a aVar8 = zVar.f12370f;
            aVar8.getClass();
            ArrayList arrayList2 = aVar8.f8940a;
            p.a aVar9 = new p.a();
            Collections.addAll(aVar9.f8940a, (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            aVar7.f9024c = aVar9;
            aVar7.b(zVar.f12365a, aVar4);
            aVar7.d(l.class, new l(a0Var.f12213a, arrayList));
            x a10 = aVar7.a();
            u uVar = (u) aVar2;
            uVar.getClass();
            w wVar = new w(uVar, a10, false);
            wVar.f9009b = new i(uVar, wVar);
            return wVar;
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + xVarArr.length + ")");
    }

    @GuardedBy("this")
    public final d c() {
        w wVar = this.f12305f;
        if (wVar != null) {
            return wVar;
        }
        Throwable th = this.f12306g;
        if (th == null) {
            try {
                w b10 = b();
                this.f12305f = b10;
                return b10;
            } catch (IOException | Error | RuntimeException e10) {
                h0.m(e10);
                this.f12306g = e10;
                throw e10;
            }
        } else if (th instanceof IOException) {
            throw ((IOException) th);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else {
            throw ((Error) th);
        }
    }

    public final void cancel() {
        w wVar;
        this.f12304e = true;
        synchronized (this) {
            wVar = this.f12305f;
        }
        if (wVar != null) {
            wVar.f9009b.a();
        }
    }

    public final Object clone() {
        return new t(this.f12300a, this.f12301b, this.f12302c, this.f12303d);
    }

    public final b0<T> d(b0 b0Var) {
        d0 d0Var = b0Var.f8827g;
        b0.a aVar = new b0.a(b0Var);
        aVar.f8839g = new c(d0Var.c(), d0Var.a());
        b0 a10 = aVar.a();
        int i10 = a10.f8823c;
        boolean z9 = true;
        if (i10 < 200 || i10 >= 300) {
            try {
                t9.e eVar = new t9.e();
                d0Var.j().x(eVar);
                new c0(d0Var.c(), d0Var.a(), eVar);
                int i11 = a10.f8823c;
                if (i11 < 200 || i11 >= 300) {
                    z9 = false;
                }
                if (!z9) {
                    return new b0<>(a10, (Object) null);
                }
                throw new IllegalArgumentException("rawResponse should not be successful response");
            } finally {
                d0Var.close();
            }
        } else if (i10 == 204 || i10 == 205) {
            d0Var.close();
            int i12 = a10.f8823c;
            if (i12 < 200 || i12 >= 300) {
                z9 = false;
            }
            if (z9) {
                return new b0<>(a10, (Object) null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } else {
            b bVar = new b(d0Var);
            try {
                T b10 = this.f12303d.b(bVar);
                int i13 = a10.f8823c;
                if (i13 < 200 || i13 >= 300) {
                    z9 = false;
                }
                if (z9) {
                    return new b0<>(a10, b10);
                }
                throw new IllegalArgumentException("rawResponse must be successful response");
            } catch (RuntimeException e10) {
                IOException iOException = bVar.f12312d;
                if (iOException == null) {
                    throw e10;
                }
                throw iOException;
            }
        }
    }

    public final void s(d<T> dVar) {
        w wVar;
        Throwable th;
        w.a a10;
        synchronized (this) {
            if (!this.f12307h) {
                this.f12307h = true;
                wVar = this.f12305f;
                th = this.f12306g;
                if (wVar == null && th == null) {
                    try {
                        w b10 = b();
                        this.f12305f = b10;
                        wVar = b10;
                    } catch (Throwable th2) {
                        th = th2;
                        h0.m(th);
                        this.f12306g = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            dVar.b(this, th);
            return;
        }
        if (this.f12304e) {
            wVar.f9009b.a();
        }
        a aVar = new a(dVar);
        synchronized (wVar) {
            if (!wVar.f9012e) {
                wVar.f9012e = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        i iVar = wVar.f9009b;
        iVar.getClass();
        iVar.f9444f = f.f11399a.k();
        iVar.f9442d.getClass();
        k kVar = wVar.f9008a.f8980a;
        w.a aVar2 = new w.a(aVar);
        synchronized (kVar) {
            try {
                kVar.f8925d.add(aVar2);
                if (!wVar.f9011d && (a10 = kVar.a(wVar.f9010c.f9016a.f8945d)) != null) {
                    aVar2.f9014c = a10.f9014c;
                }
            } catch (Throwable th3) {
                while (true) {
                    throw th3;
                }
            }
        }
        kVar.d();
    }

    public final synchronized x t() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return ((w) c()).f9010c;
    }

    public final boolean u() {
        boolean z9;
        boolean z10 = true;
        if (this.f12304e) {
            return true;
        }
        synchronized (this) {
            w wVar = this.f12305f;
            if (wVar != null) {
                i iVar = wVar.f9009b;
                synchronized (iVar.f9440b) {
                    z9 = iVar.f9450m;
                }
                if (z9) {
                }
            }
            z10 = false;
        }
        return z10;
    }

    /* renamed from: clone  reason: collision with other method in class */
    public final b m14clone() {
        return new t(this.f12300a, this.f12301b, this.f12302c, this.f12303d);
    }
}
