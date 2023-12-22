package q1;

import j2.b;
import java.security.MessageDigest;
import java.util.Map;
import o1.f;
import o1.h;
import o1.l;
import y3.a;

public final class p implements f {

    /* renamed from: b  reason: collision with root package name */
    public final Object f11114b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11115c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11116d;

    /* renamed from: e  reason: collision with root package name */
    public final Class<?> f11117e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f11118f;

    /* renamed from: g  reason: collision with root package name */
    public final f f11119g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<Class<?>, l<?>> f11120h;

    /* renamed from: i  reason: collision with root package name */
    public final h f11121i;

    /* renamed from: j  reason: collision with root package name */
    public int f11122j;

    public p(Object obj, f fVar, int i10, int i11, b bVar, Class cls, Class cls2, h hVar) {
        a.h(obj);
        this.f11114b = obj;
        if (fVar != null) {
            this.f11119g = fVar;
            this.f11115c = i10;
            this.f11116d = i11;
            a.h(bVar);
            this.f11120h = bVar;
            if (cls != null) {
                this.f11117e = cls;
                if (cls2 != null) {
                    this.f11118f = cls2;
                    a.h(hVar);
                    this.f11121i = hVar;
                    return;
                }
                throw new NullPointerException("Transcode class must not be null");
            }
            throw new NullPointerException("Resource class must not be null");
        }
        throw new NullPointerException("Signature must not be null");
    }

    public final void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f11114b.equals(pVar.f11114b) && this.f11119g.equals(pVar.f11119g) && this.f11116d == pVar.f11116d && this.f11115c == pVar.f11115c && this.f11120h.equals(pVar.f11120h) && this.f11117e.equals(pVar.f11117e) && this.f11118f.equals(pVar.f11118f) && this.f11121i.equals(pVar.f11121i);
    }

    public final int hashCode() {
        if (this.f11122j == 0) {
            int hashCode = this.f11114b.hashCode();
            this.f11122j = hashCode;
            int hashCode2 = ((((this.f11119g.hashCode() + (hashCode * 31)) * 31) + this.f11115c) * 31) + this.f11116d;
            this.f11122j = hashCode2;
            int hashCode3 = this.f11120h.hashCode() + (hashCode2 * 31);
            this.f11122j = hashCode3;
            int hashCode4 = this.f11117e.hashCode() + (hashCode3 * 31);
            this.f11122j = hashCode4;
            int hashCode5 = this.f11118f.hashCode() + (hashCode4 * 31);
            this.f11122j = hashCode5;
            this.f11122j = this.f11121i.hashCode() + (hashCode5 * 31);
        }
        return this.f11122j;
    }

    public final String toString() {
        StringBuilder g10 = androidx.activity.f.g("EngineKey{model=");
        g10.append(this.f11114b);
        g10.append(", width=");
        g10.append(this.f11115c);
        g10.append(", height=");
        g10.append(this.f11116d);
        g10.append(", resourceClass=");
        g10.append(this.f11117e);
        g10.append(", transcodeClass=");
        g10.append(this.f11118f);
        g10.append(", signature=");
        g10.append(this.f11119g);
        g10.append(", hashCode=");
        g10.append(this.f11122j);
        g10.append(", transformations=");
        g10.append(this.f11120h);
        g10.append(", options=");
        g10.append(this.f11121i);
        g10.append('}');
        return g10.toString();
    }
}
