package p3;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import p3.a.c;
import p3.d;
import q3.i;
import q3.v;
import r3.b;

public final class a<O extends c> {

    /* renamed from: a  reason: collision with root package name */
    public final C0125a<?, O> f10657a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10658b;

    /* renamed from: p3.a$a  reason: collision with other inner class name */
    public static abstract class C0125a<T extends e, O> extends d<T, O> {
        @Deprecated
        public e a(Context context, Looper looper, r3.c cVar, c cVar2, d.a aVar, d.b bVar) {
            return b(context, looper, cVar, cVar2, aVar, bVar);
        }

        public e b(Context context, Looper looper, r3.c cVar, c cVar2, q3.c cVar3, i iVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public static class b<C> {
    }

    public interface c {

        /* renamed from: m0  reason: collision with root package name */
        public static final C0127c f10659m0 = new C0127c(0);

        /* renamed from: p3.a$c$a  reason: collision with other inner class name */
        public interface C0126a extends c {
            Account g();
        }

        public interface b extends c {
            GoogleSignInAccount r();
        }

        /* renamed from: p3.a$c$c  reason: collision with other inner class name */
        public static final class C0127c implements c {
            public C0127c() {
            }

            public /* synthetic */ C0127c(int i10) {
            }
        }
    }

    public static abstract class d<T, O> {
    }

    public interface e {
        boolean a();

        Set<Scope> b();

        void c(b.c cVar);

        void d(r3.i iVar, Set<Scope> set);

        void e(String str);

        boolean f();

        int g();

        boolean h();

        o3.d[] i();

        String j();

        String k();

        boolean l();

        void m(v vVar);
    }

    public static final class f<C extends e> extends b<C> {
    }

    public <C extends e> a(String str, C0125a<C, O> aVar, f<C> fVar) {
        this.f10658b = str;
        this.f10657a = aVar;
    }
}
