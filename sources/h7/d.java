package h7;

import androidx.activity.f;
import e7.h;
import e7.k;
import e7.q;
import e7.s;
import e7.t;
import e7.u;
import g7.c;
import j7.a;

public final class d implements u {

    /* renamed from: a  reason: collision with root package name */
    public final c f6937a;

    public d(c cVar) {
        this.f6937a = cVar;
    }

    public static t a(c cVar, h hVar, a aVar, f7.a aVar2) {
        t tVar;
        q qVar;
        Object j10 = cVar.a(new a(aVar2.value())).j();
        if (j10 instanceof t) {
            tVar = (t) j10;
        } else if (j10 instanceof u) {
            tVar = ((u) j10).b(hVar, aVar);
        } else {
            boolean z9 = j10 instanceof q;
            if (z9 || (j10 instanceof k)) {
                k kVar = null;
                if (z9) {
                    qVar = (q) j10;
                } else {
                    qVar = null;
                }
                if (j10 instanceof k) {
                    kVar = (k) j10;
                }
                tVar = new m(qVar, kVar, hVar, aVar);
            } else {
                StringBuilder g10 = f.g("Invalid attempt to bind an instance of ");
                g10.append(j10.getClass().getName());
                g10.append(" as a @JsonAdapter for ");
                g10.append(aVar.toString());
                g10.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(g10.toString());
            }
        }
        if (tVar == null || !aVar2.nullSafe()) {
            return tVar;
        }
        return new s(tVar);
    }

    public final <T> t<T> b(h hVar, a<T> aVar) {
        f7.a aVar2 = (f7.a) aVar.f8776a.getAnnotation(f7.a.class);
        if (aVar2 == null) {
            return null;
        }
        return a(this.f6937a, hVar, aVar, aVar2);
    }
}
