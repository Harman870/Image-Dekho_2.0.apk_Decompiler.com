package androidx.lifecycle;

import x8.f;
import y0.a;
import y0.d;

public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f1730a;

    /* renamed from: b  reason: collision with root package name */
    public final a f1731b;

    /* renamed from: c  reason: collision with root package name */
    public final y0.a f1732c;

    public interface a {
        <T extends b0> T a(Class<T> cls) {
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        b0 b(Class cls, d dVar) {
            return a(cls);
        }
    }

    public static class b {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, a aVar) {
        this(e0Var, aVar, a.C0169a.f13009b);
        f.f(e0Var, "store");
        f.f(aVar, "factory");
    }

    public d0(e0 e0Var, a aVar, y0.a aVar2) {
        f.f(e0Var, "store");
        f.f(aVar, "factory");
        f.f(aVar2, "defaultCreationExtras");
        this.f1730a = e0Var;
        this.f1731b = aVar;
        this.f1732c = aVar2;
    }

    public final <T extends b0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final b0 b(Class cls, String str) {
        b0 b0Var;
        b bVar;
        f.f(str, "key");
        b0 b0Var2 = this.f1730a.f1733a.get(str);
        if (cls.isInstance(b0Var2)) {
            a aVar = this.f1731b;
            if (aVar instanceof b) {
                bVar = (b) aVar;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                f.e(b0Var2, "viewModel");
            }
            if (b0Var2 != null) {
                return b0Var2;
            }
            throw new NullPointerException("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        }
        d dVar = new d(this.f1732c);
        dVar.f13008a.put(c6.b.f2469a, str);
        try {
            b0Var = this.f1731b.b(cls, dVar);
        } catch (AbstractMethodError unused) {
            b0Var = this.f1731b.a(cls);
        }
        b0 put = this.f1730a.f1733a.put(str, b0Var);
        if (put != null) {
            put.a();
        }
        return b0Var;
    }
}
