package j9;

import androidx.activity.f;
import androidx.fragment.app.w0;
import j9.p;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import k9.e;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final q f9016a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9017b;

    /* renamed from: c  reason: collision with root package name */
    public final p f9018c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final a0 f9019d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<Class<?>, Object> f9020e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public volatile c f9021f;

    public static class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public q f9022a;

        /* renamed from: b  reason: collision with root package name */
        public String f9023b;

        /* renamed from: c  reason: collision with root package name */
        public p.a f9024c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public a0 f9025d;

        /* renamed from: e  reason: collision with root package name */
        public Map<Class<?>, Object> f9026e;

        public a() {
            this.f9026e = Collections.emptyMap();
            this.f9023b = "GET";
            this.f9024c = new p.a();
        }

        public a(x xVar) {
            this.f9026e = Collections.emptyMap();
            this.f9022a = xVar.f9016a;
            this.f9023b = xVar.f9017b;
            this.f9025d = xVar.f9019d;
            this.f9026e = xVar.f9020e.isEmpty() ? Collections.emptyMap() : new LinkedHashMap<>(xVar.f9020e);
            this.f9024c = xVar.f9018c.e();
        }

        public final x a() {
            if (this.f9022a != null) {
                return new x(this);
            }
            throw new IllegalStateException("url == null");
        }

        public final void b(String str, @Nullable a0 a0Var) {
            boolean z9;
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (a0Var == null || y3.a.q(str)) {
                if (a0Var == null) {
                    if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        throw new IllegalArgumentException(w0.d("method ", str, " must have a request body."));
                    }
                }
                this.f9023b = str;
                this.f9025d = a0Var;
            } else {
                throw new IllegalArgumentException(w0.d("method ", str, " must not have a request body."));
            }
        }

        public final void c(String str) {
            this.f9024c.c(str);
        }

        public final void d(Class cls, @Nullable Object obj) {
            if (cls == null) {
                throw new NullPointerException("type == null");
            } else if (obj == null) {
                this.f9026e.remove(cls);
            } else {
                if (this.f9026e.isEmpty()) {
                    this.f9026e = new LinkedHashMap();
                }
                this.f9026e.put(cls, cls.cast(obj));
            }
        }
    }

    public x(a aVar) {
        Map<Class<?>, Object> map;
        this.f9016a = aVar.f9022a;
        this.f9017b = aVar.f9023b;
        p.a aVar2 = aVar.f9024c;
        aVar2.getClass();
        this.f9018c = new p(aVar2);
        this.f9019d = aVar.f9025d;
        Map<Class<?>, Object> map2 = aVar.f9026e;
        byte[] bArr = e.f9152a;
        if (map2.isEmpty()) {
            map = Collections.emptyMap();
        } else {
            map = Collections.unmodifiableMap(new LinkedHashMap(map2));
        }
        this.f9020e = map;
    }

    @Nullable
    public final String a(String str) {
        return this.f9018c.c(str);
    }

    public final String toString() {
        StringBuilder g10 = f.g("Request{method=");
        g10.append(this.f9017b);
        g10.append(", url=");
        g10.append(this.f9016a);
        g10.append(", tags=");
        g10.append(this.f9020e);
        g10.append('}');
        return g10.toString();
    }
}
