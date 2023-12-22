package k3;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.Arrays;
import p3.a;
import r3.m;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final p3.a<GoogleSignInOptions> f9053a;

    @Deprecated
    /* renamed from: k3.a$a  reason: collision with other inner class name */
    public static class C0108a implements a.c {

        /* renamed from: c  reason: collision with root package name */
        public static final C0108a f9054c = new C0108a(new C0109a());

        /* renamed from: a  reason: collision with root package name */
        public final boolean f9055a;

        /* renamed from: b  reason: collision with root package name */
        public final String f9056b;

        @Deprecated
        /* renamed from: k3.a$a$a  reason: collision with other inner class name */
        public static class C0109a {

            /* renamed from: a  reason: collision with root package name */
            public Boolean f9057a = Boolean.FALSE;

            /* renamed from: b  reason: collision with root package name */
            public String f9058b;

            public C0109a() {
            }

            public C0109a(C0108a aVar) {
                C0108a aVar2 = C0108a.f9054c;
                aVar.getClass();
                this.f9057a = Boolean.valueOf(aVar.f9055a);
                this.f9058b = aVar.f9056b;
            }
        }

        public C0108a(C0109a aVar) {
            this.f9055a = aVar.f9057a.booleanValue();
            this.f9056b = aVar.f9058b;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0108a)) {
                return false;
            }
            C0108a aVar = (C0108a) obj;
            aVar.getClass();
            return m.a((Object) null, (Object) null) && this.f9055a == aVar.f9055a && m.a(this.f9056b, aVar.f9056b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f9055a), this.f9056b});
        }
    }

    static {
        a.f fVar = new a.f();
        new d();
        e eVar = new e();
        p3.a<c> aVar = b.f9059a;
        f9053a = new p3.a<>("Auth.GOOGLE_SIGN_IN_API", eVar, fVar);
    }
}
