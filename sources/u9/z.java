package u9;

import j9.a0;
import j9.n;
import j9.p;
import j9.q;
import j9.s;
import j9.t;
import j9.x;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import t9.f;

public final class z {

    /* renamed from: l  reason: collision with root package name */
    public static final char[] f12363l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f12364m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a  reason: collision with root package name */
    public final String f12365a;

    /* renamed from: b  reason: collision with root package name */
    public final q f12366b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public String f12367c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public q.a f12368d;

    /* renamed from: e  reason: collision with root package name */
    public final x.a f12369e = new x.a();

    /* renamed from: f  reason: collision with root package name */
    public final p.a f12370f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    public s f12371g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f12372h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public t.a f12373i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public n.a f12374j;
    @Nullable
    public a0 k;

    public static class a extends a0 {

        /* renamed from: a  reason: collision with root package name */
        public final a0 f12375a;

        /* renamed from: b  reason: collision with root package name */
        public final s f12376b;

        public a(a0 a0Var, s sVar) {
            this.f12375a = a0Var;
            this.f12376b = sVar;
        }

        public final long a() {
            return this.f12375a.a();
        }

        public final s b() {
            return this.f12376b;
        }

        public final void c(f fVar) {
            this.f12375a.c(fVar);
        }
    }

    public z(String str, q qVar, @Nullable String str2, @Nullable p pVar, @Nullable s sVar, boolean z9, boolean z10, boolean z11) {
        this.f12365a = str;
        this.f12366b = qVar;
        this.f12367c = str2;
        this.f12371g = sVar;
        this.f12372h = z9;
        this.f12370f = pVar != null ? pVar.e() : new p.a();
        if (z10) {
            this.f12374j = new n.a();
        } else if (z11) {
            t.a aVar = new t.a();
            this.f12373i = aVar;
            s sVar2 = t.f8965f;
            if (sVar2 == null) {
                throw new NullPointerException("type == null");
            } else if (sVar2.f8962b.equals("multipart")) {
                aVar.f8974b = sVar2;
            } else {
                throw new IllegalArgumentException("multipart != " + sVar2);
            }
        }
    }

    public final void a(String str, String str2, boolean z9) {
        n.a aVar = this.f12374j;
        aVar.getClass();
        if (z9) {
            if (str != null) {
                aVar.f8933a.add(q.c(str, true));
                aVar.f8934b.add(q.c(str2, true));
                return;
            }
            throw new NullPointerException("name == null");
        } else if (str != null) {
            aVar.f8933a.add(q.c(str, false));
            aVar.f8934b.add(q.c(str2, false));
        } else {
            throw new NullPointerException("name == null");
        }
    }

    public final void b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.f12371g = s.a(str2);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException(com.ironsource.adapters.ironsource.a.g("Malformed content type: ", str2), e10);
            }
        } else {
            this.f12370f.a(str, str2);
        }
    }

    public final void c(p pVar, a0 a0Var) {
        t.a aVar = this.f12373i;
        aVar.getClass();
        if (a0Var == null) {
            throw new NullPointerException("body == null");
        } else if (pVar != null && pVar.c("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        } else if (pVar == null || pVar.c("Content-Length") == null) {
            aVar.f8975c.add(new t.b(pVar, a0Var));
        } else {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
    }

    public final void d(String str, @Nullable String str2, boolean z9) {
        q.a aVar;
        String str3 = this.f12367c;
        String str4 = null;
        if (str3 != null) {
            q qVar = this.f12366b;
            qVar.getClass();
            try {
                aVar = new q.a();
                aVar.b(qVar, str3);
            } catch (IllegalArgumentException unused) {
                aVar = null;
            }
            this.f12368d = aVar;
            if (aVar != null) {
                this.f12367c = null;
            } else {
                StringBuilder g10 = androidx.activity.f.g("Malformed URL. Base: ");
                g10.append(this.f12366b);
                g10.append(", Relative: ");
                g10.append(this.f12367c);
                throw new IllegalArgumentException(g10.toString());
            }
        }
        if (z9) {
            q.a aVar2 = this.f12368d;
            if (str != null) {
                if (aVar2.f8957g == null) {
                    aVar2.f8957g = new ArrayList();
                }
                aVar2.f8957g.add(q.b(str, " \"'<>#&=", true, false, true, true));
                ArrayList arrayList = aVar2.f8957g;
                if (str2 != null) {
                    str4 = q.b(str2, " \"'<>#&=", true, false, true, true);
                }
                arrayList.add(str4);
                return;
            }
            aVar2.getClass();
            throw new NullPointerException("encodedName == null");
        }
        q.a aVar3 = this.f12368d;
        if (str != null) {
            if (aVar3.f8957g == null) {
                aVar3.f8957g = new ArrayList();
            }
            aVar3.f8957g.add(q.b(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            ArrayList arrayList2 = aVar3.f8957g;
            if (str2 != null) {
                str4 = q.b(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true);
            }
            arrayList2.add(str4);
            return;
        }
        aVar3.getClass();
        throw new NullPointerException("name == null");
    }
}
