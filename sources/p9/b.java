package p9;

import com.ironsource.mediationsdk.logger.IronSourceError;
import k9.e;
import t9.h;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final h f10708d = h.d(":");

    /* renamed from: e  reason: collision with root package name */
    public static final h f10709e = h.d(":status");

    /* renamed from: f  reason: collision with root package name */
    public static final h f10710f = h.d(":method");

    /* renamed from: g  reason: collision with root package name */
    public static final h f10711g = h.d(":path");

    /* renamed from: h  reason: collision with root package name */
    public static final h f10712h = h.d(":scheme");

    /* renamed from: i  reason: collision with root package name */
    public static final h f10713i = h.d(":authority");

    /* renamed from: a  reason: collision with root package name */
    public final h f10714a;

    /* renamed from: b  reason: collision with root package name */
    public final h f10715b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10716c;

    public b(String str, String str2) {
        this(h.d(str), h.d(str2));
    }

    public b(h hVar, String str) {
        this(hVar, h.d(str));
    }

    public b(h hVar, h hVar2) {
        this.f10714a = hVar;
        this.f10715b = hVar2;
        this.f10716c = hVar2.j() + hVar.j() + 32;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f10714a.equals(bVar.f10714a) && this.f10715b.equals(bVar.f10715b);
    }

    public final int hashCode() {
        return this.f10715b.hashCode() + ((this.f10714a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public final String toString() {
        return e.j("%s: %s", this.f10714a.m(), this.f10715b.m());
    }
}
