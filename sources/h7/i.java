package h7;

import e7.h;
import e7.t;
import h7.j;
import j7.a;
import java.lang.reflect.Field;
import k7.b;

public final class i extends j.b {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Field f6954d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f6955e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t f6956f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ h f6957g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ a f6958h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f6959i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(String str, boolean z9, boolean z10, Field field, boolean z11, t tVar, h hVar, a aVar, boolean z12) {
        super(str, z9, z10);
        this.f6954d = field;
        this.f6955e = z11;
        this.f6956f = tVar;
        this.f6957g = hVar;
        this.f6958h = aVar;
        this.f6959i = z12;
    }

    public final void a(k7.a aVar, Object obj) {
        Object a10 = this.f6956f.a(aVar);
        if (a10 != null || !this.f6959i) {
            this.f6954d.set(obj, a10);
        }
    }

    public final void b(b bVar, Object obj) {
        t tVar;
        Object obj2 = this.f6954d.get(obj);
        if (this.f6955e) {
            tVar = this.f6956f;
        } else {
            tVar = new n(this.f6957g, this.f6956f, this.f6958h.f8777b);
        }
        tVar.b(bVar, obj2);
    }

    public final boolean c(Object obj) {
        return this.f6967b && this.f6954d.get(obj) != obj;
    }
}
