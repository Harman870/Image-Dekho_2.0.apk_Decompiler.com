package o;

import android.content.Context;
import c3.d;
import c3.e;
import f3.c;
import g1.t;
import j4.f;
import j4.h;
import j4.p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import n8.a;
import x2.l;
import y2.b;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public Object f10421a;

    /* renamed from: b  reason: collision with root package name */
    public Object f10422b;

    /* renamed from: c  reason: collision with root package name */
    public Object f10423c;

    /* renamed from: d  reason: collision with root package name */
    public Object f10424d;

    public /* synthetic */ c() {
        this.f10421a = new e();
        this.f10422b = new e();
        this.f10423c = new e();
        this.f10424d = new h[32];
    }

    public /* synthetic */ c(a aVar, a aVar2, t tVar) {
        f3.c cVar = c.a.f6378a;
        this.f10421a = aVar;
        this.f10422b = aVar2;
        this.f10423c = tVar;
        this.f10424d = cVar;
    }

    public /* synthetic */ c(c cVar, l lVar) {
        this.f10423c = new HashMap();
        this.f10424d = new HashMap();
        this.f10421a = cVar;
        this.f10422b = lVar;
    }

    public final c a() {
        return new c(this, (l) this.f10422b);
    }

    public final p b(p pVar) {
        return ((l) this.f10422b).d(this, pVar);
    }

    public final p c(f fVar) {
        p pVar = p.f8373c0;
        Iterator o10 = fVar.o();
        while (o10.hasNext()) {
            pVar = ((l) this.f10422b).d(this, fVar.m(((Integer) o10.next()).intValue()));
            if (pVar instanceof h) {
                break;
            }
        }
        return pVar;
    }

    public final p d(String str) {
        if (((Map) this.f10423c).containsKey(str)) {
            return (p) ((Map) this.f10423c).get(str);
        }
        c cVar = (c) this.f10421a;
        if (cVar != null) {
            return cVar.d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", new Object[]{str}));
    }

    public final void e(String str, p pVar) {
        if (!((Map) this.f10424d).containsKey(str)) {
            if (pVar == null) {
                ((Map) this.f10423c).remove(str);
            } else {
                ((Map) this.f10423c).put(str, pVar);
            }
        }
    }

    public final void f(String str, p pVar) {
        c cVar;
        if (!((Map) this.f10423c).containsKey(str) && (cVar = (c) this.f10421a) != null && cVar.g(str)) {
            ((c) this.f10421a).f(str, pVar);
        } else if (!((Map) this.f10424d).containsKey(str)) {
            if (pVar == null) {
                ((Map) this.f10423c).remove(str);
            } else {
                ((Map) this.f10423c).put(str, pVar);
            }
        }
    }

    public final boolean g(String str) {
        if (((Map) this.f10423c).containsKey(str)) {
            return true;
        }
        c cVar = (c) this.f10421a;
        if (cVar != null) {
            return cVar.g(str);
        }
        return false;
    }

    public final Object get() {
        f3.a aVar = (f3.a) ((a) this.f10424d).get();
        return new d((Context) ((a) this.f10421a).get(), (d3.d) ((a) this.f10422b).get(), (e) ((a) this.f10423c).get());
    }
}
