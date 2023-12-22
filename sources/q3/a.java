package q3;

import java.util.Arrays;
import p3.a;
import p3.a.c;
import r3.m;

public final class a<O extends a.c> {

    /* renamed from: a  reason: collision with root package name */
    public final int f11192a;

    /* renamed from: b  reason: collision with root package name */
    public final p3.a<O> f11193b;

    /* renamed from: c  reason: collision with root package name */
    public final O f11194c;

    /* renamed from: d  reason: collision with root package name */
    public final String f11195d;

    public a(p3.a<O> aVar, O o10, String str) {
        this.f11193b = aVar;
        this.f11194c = o10;
        this.f11195d = str;
        this.f11192a = Arrays.hashCode(new Object[]{aVar, o10, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f11193b, aVar.f11193b) && m.a(this.f11194c, aVar.f11194c) && m.a(this.f11195d, aVar.f11195d);
    }

    public final int hashCode() {
        return this.f11192a;
    }
}
