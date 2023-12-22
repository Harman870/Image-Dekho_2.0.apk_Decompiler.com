package j4;

public final class r8 implements y8 {

    /* renamed from: a  reason: collision with root package name */
    public final n8 f8442a;

    /* renamed from: b  reason: collision with root package name */
    public final j9 f8443b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8444c;

    /* renamed from: d  reason: collision with root package name */
    public final z6 f8445d;

    public r8(j9 j9Var, z6 z6Var, n8 n8Var) {
        this.f8443b = j9Var;
        this.f8444c = z6Var.c(n8Var);
        this.f8445d = z6Var;
        this.f8442a = n8Var;
    }

    public final void a(Object obj) {
        this.f8443b.g(obj);
        this.f8445d.b(obj);
    }

    public final int b(Object obj) {
        j9 j9Var = this.f8443b;
        int b10 = j9Var.b(j9Var.d(obj));
        if (!this.f8444c) {
            return b10;
        }
        this.f8445d.a(obj);
        throw null;
    }

    public final void c(Object obj, Object obj2) {
        j9 j9Var = this.f8443b;
        Class cls = z8.f8581a;
        j9Var.h(obj, j9Var.e(j9Var.d(obj), j9Var.d(obj2)));
        if (this.f8444c) {
            this.f8445d.a(obj2);
            throw null;
        }
    }

    public final boolean d(Object obj, Object obj2) {
        if (!this.f8443b.d(obj).equals(this.f8443b.d(obj2))) {
            return false;
        }
        if (!this.f8444c) {
            return true;
        }
        this.f8445d.a(obj);
        this.f8445d.a(obj2);
        throw null;
    }

    public final boolean e(Object obj) {
        this.f8445d.a(obj);
        throw null;
    }

    public final int f(Object obj) {
        int hashCode = this.f8443b.d(obj).hashCode();
        if (!this.f8444c) {
            return hashCode;
        }
        this.f8445d.a(obj);
        throw null;
    }

    public final void g(Object obj, v6 v6Var) {
        this.f8445d.a(obj);
        throw null;
    }

    public final void h(Object obj, byte[] bArr, int i10, int i11, i6 i6Var) {
        m7 m7Var = (m7) obj;
        if (m7Var.zzc == k9.f8298f) {
            m7Var.zzc = k9.b();
        }
        j7 j7Var = (j7) obj;
        throw null;
    }

    public final m7 zze() {
        n8 n8Var = this.f8442a;
        if (n8Var instanceof m7) {
            return (m7) ((m7) n8Var).s(4);
        }
        return n8Var.c().i();
    }
}
