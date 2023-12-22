package j9;

import androidx.activity.f;
import j9.p;
import java.io.Closeable;
import javax.annotation.Nullable;
import m9.c;

public final class b0 implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final x f8821a;

    /* renamed from: b  reason: collision with root package name */
    public final v f8822b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8823c;

    /* renamed from: d  reason: collision with root package name */
    public final String f8824d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final o f8825e;

    /* renamed from: f  reason: collision with root package name */
    public final p f8826f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    public final d0 f8827g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public final b0 f8828h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public final b0 f8829i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final b0 f8830j;
    public final long k;

    /* renamed from: l  reason: collision with root package name */
    public final long f8831l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    public final c f8832m;

    public static class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public x f8833a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public v f8834b;

        /* renamed from: c  reason: collision with root package name */
        public int f8835c;

        /* renamed from: d  reason: collision with root package name */
        public String f8836d;
        @Nullable

        /* renamed from: e  reason: collision with root package name */
        public o f8837e;

        /* renamed from: f  reason: collision with root package name */
        public p.a f8838f;
        @Nullable

        /* renamed from: g  reason: collision with root package name */
        public d0 f8839g;
        @Nullable

        /* renamed from: h  reason: collision with root package name */
        public b0 f8840h;
        @Nullable

        /* renamed from: i  reason: collision with root package name */
        public b0 f8841i;
        @Nullable

        /* renamed from: j  reason: collision with root package name */
        public b0 f8842j;
        public long k;

        /* renamed from: l  reason: collision with root package name */
        public long f8843l;
        @Nullable

        /* renamed from: m  reason: collision with root package name */
        public c f8844m;

        public a() {
            this.f8835c = -1;
            this.f8838f = new p.a();
        }

        public a(b0 b0Var) {
            this.f8835c = -1;
            this.f8833a = b0Var.f8821a;
            this.f8834b = b0Var.f8822b;
            this.f8835c = b0Var.f8823c;
            this.f8836d = b0Var.f8824d;
            this.f8837e = b0Var.f8825e;
            this.f8838f = b0Var.f8826f.e();
            this.f8839g = b0Var.f8827g;
            this.f8840h = b0Var.f8828h;
            this.f8841i = b0Var.f8829i;
            this.f8842j = b0Var.f8830j;
            this.k = b0Var.k;
            this.f8843l = b0Var.f8831l;
            this.f8844m = b0Var.f8832m;
        }

        public static void b(String str, b0 b0Var) {
            if (b0Var.f8827g != null) {
                throw new IllegalArgumentException(com.ironsource.adapters.ironsource.a.g(str, ".body != null"));
            } else if (b0Var.f8828h != null) {
                throw new IllegalArgumentException(com.ironsource.adapters.ironsource.a.g(str, ".networkResponse != null"));
            } else if (b0Var.f8829i != null) {
                throw new IllegalArgumentException(com.ironsource.adapters.ironsource.a.g(str, ".cacheResponse != null"));
            } else if (b0Var.f8830j != null) {
                throw new IllegalArgumentException(com.ironsource.adapters.ironsource.a.g(str, ".priorResponse != null"));
            }
        }

        public final b0 a() {
            if (this.f8833a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f8834b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f8835c < 0) {
                StringBuilder g10 = f.g("code < 0: ");
                g10.append(this.f8835c);
                throw new IllegalStateException(g10.toString());
            } else if (this.f8836d != null) {
                return new b0(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }
    }

    public b0(a aVar) {
        this.f8821a = aVar.f8833a;
        this.f8822b = aVar.f8834b;
        this.f8823c = aVar.f8835c;
        this.f8824d = aVar.f8836d;
        this.f8825e = aVar.f8837e;
        p.a aVar2 = aVar.f8838f;
        aVar2.getClass();
        this.f8826f = new p(aVar2);
        this.f8827g = aVar.f8839g;
        this.f8828h = aVar.f8840h;
        this.f8829i = aVar.f8841i;
        this.f8830j = aVar.f8842j;
        this.k = aVar.k;
        this.f8831l = aVar.f8843l;
        this.f8832m = aVar.f8844m;
    }

    @Nullable
    public final String a(String str) {
        String c10 = this.f8826f.c(str);
        if (c10 != null) {
            return c10;
        }
        return null;
    }

    public final void close() {
        d0 d0Var = this.f8827g;
        if (d0Var != null) {
            d0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public final String toString() {
        StringBuilder g10 = f.g("Response{protocol=");
        g10.append(this.f8822b);
        g10.append(", code=");
        g10.append(this.f8823c);
        g10.append(", message=");
        g10.append(this.f8824d);
        g10.append(", url=");
        g10.append(this.f8821a.f9016a);
        g10.append('}');
        return g10.toString();
    }
}
