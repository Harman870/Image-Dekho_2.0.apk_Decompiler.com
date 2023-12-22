package d3;

import android.content.Context;
import androidx.activity.result.c;
import d3.f;
import d3.g;
import i4.fg;
import i4.k;
import i4.wg;
import i4.xf;
import i6.h;
import n3.w;
import n8.a;
import r3.o;
import u1.t;
import y2.b;

public final class f0 implements b, fg {

    /* renamed from: a  reason: collision with root package name */
    public final Object f6059a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6060b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f6061c;

    public /* synthetic */ f0(a aVar) {
        f fVar = f.a.f6058a;
        g gVar = g.a.f6062a;
        this.f6059a = aVar;
        this.f6060b = fVar;
        this.f6061c = gVar;
    }

    public /* synthetic */ f0(t tVar, k kVar, w wVar) {
        this.f6061c = tVar;
        this.f6059a = kVar;
        this.f6060b = wVar;
    }

    public final void c(xf xfVar) {
        k kVar = (k) this.f6059a;
        kVar.f7425o = true;
        String str = ((wg) xfVar).f7777b;
        kVar.getClass();
        o.e(str);
        kVar.f7413b = str;
        ((c) ((t) this.f6061c).f12166a).x((k) this.f6059a, new e2.c(this, this));
    }

    public final Object get() {
        return new e0((Context) ((a) this.f6059a).get(), (String) ((a) this.f6060b).get(), ((Integer) ((a) this.f6061c).get()).intValue());
    }

    public final void zza(String str) {
        ((w) this.f6060b).f(h.a(str));
    }
}
