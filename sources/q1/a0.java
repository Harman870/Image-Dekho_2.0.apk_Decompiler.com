package q1;

import com.bumptech.glide.load.data.d;
import o1.f;
import q1.h;
import u1.n;

public final class a0 implements d.a<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n.a f10972a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b0 f10973b;

    public a0(b0 b0Var, n.a aVar) {
        this.f10973b = b0Var;
        this.f10972a = aVar;
    }

    public final void c(Exception exc) {
        boolean z9;
        b0 b0Var = this.f10973b;
        n.a<?> aVar = this.f10972a;
        n.a<?> aVar2 = b0Var.f10980f;
        if (aVar2 == null || aVar2 != aVar) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            b0 b0Var2 = this.f10973b;
            n.a aVar3 = this.f10972a;
            h.a aVar4 = b0Var2.f10976b;
            f fVar = b0Var2.f10981g;
            d<Data> dVar = aVar3.f12137c;
            aVar4.c(fVar, exc, dVar, dVar.e());
        }
    }

    public final void d(Object obj) {
        boolean z9;
        b0 b0Var = this.f10973b;
        n.a<?> aVar = this.f10972a;
        n.a<?> aVar2 = b0Var.f10980f;
        if (aVar2 == null || aVar2 != aVar) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            b0 b0Var2 = this.f10973b;
            n.a aVar3 = this.f10972a;
            l lVar = b0Var2.f10975a.f11017p;
            if (obj == null || !lVar.c(aVar3.f12137c.e())) {
                h.a aVar4 = b0Var2.f10976b;
                f fVar = aVar3.f12135a;
                d<Data> dVar = aVar3.f12137c;
                aVar4.a(fVar, obj, dVar, dVar.e(), b0Var2.f10981g);
                return;
            }
            b0Var2.f10979e = obj;
            b0Var2.f10976b.b();
        }
    }
}
