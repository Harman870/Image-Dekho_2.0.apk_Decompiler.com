package o8;

import java.io.Serializable;

public final class f<T> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Object f10605a;

    public static final class a implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f10606a;

        public a(Throwable th) {
            x8.f.f(th, "exception");
            this.f10606a = th;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof a) && x8.f.a(this.f10606a, ((a) obj).f10606a);
        }

        public final int hashCode() {
            return this.f10606a.hashCode();
        }

        public final String toString() {
            StringBuilder g10 = androidx.activity.f.g("Failure(");
            g10.append(this.f10606a);
            g10.append(')');
            return g10.toString();
        }
    }

    public /* synthetic */ f(Object obj) {
        this.f10605a = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).f10606a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        Object obj2 = this.f10605a;
        if ((obj instanceof f) && x8.f.a(obj2, ((f) obj).f10605a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f10605a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f10605a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
