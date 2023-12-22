package c6;

import android.content.Context;
import j6.i;
import j6.w;
import r6.c;
import u6.a;

public final /* synthetic */ class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2489a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2490b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2491c;

    public /* synthetic */ d(Object obj, int i10, Object obj2) {
        this.f2489a = i10;
        this.f2490b = obj;
        this.f2491c = obj2;
    }

    public final Object get() {
        switch (this.f2489a) {
            case 0:
                f fVar = (f) this.f2490b;
                return new z6.a((Context) this.f2491c, fVar.f(), (c) fVar.f2497d.a(c.class));
            default:
                i iVar = (i) this.f2490b;
                j6.a aVar = (j6.a) this.f2491c;
                iVar.getClass();
                return aVar.f8722f.h(new w(aVar, iVar));
        }
    }
}
