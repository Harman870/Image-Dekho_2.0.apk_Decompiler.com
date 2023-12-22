package w2;

import b3.d;
import d3.s;
import java.util.HashMap;
import t2.a;
import t2.b;
import w2.h;
import w2.j;

public final class v<T> {

    /* renamed from: a  reason: collision with root package name */
    public final s f12725a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12726b = "FCM_CLIENT_EVENT_LOGGING";

    /* renamed from: c  reason: collision with root package name */
    public final b f12727c;

    /* renamed from: d  reason: collision with root package name */
    public final s f12728d;

    /* renamed from: e  reason: collision with root package name */
    public final w f12729e;

    public v(s sVar, b bVar, s sVar2, w wVar) {
        this.f12725a = sVar;
        this.f12727c = bVar;
        this.f12728d = sVar2;
        this.f12729e = wVar;
    }

    public final void a(a aVar) {
        u uVar = new u();
        w wVar = this.f12729e;
        s sVar = this.f12725a;
        if (sVar != null) {
            String str = this.f12726b;
            if (str != null) {
                s sVar2 = this.f12728d;
                if (sVar2 != null) {
                    b bVar = this.f12727c;
                    if (bVar != null) {
                        i iVar = new i(sVar, str, aVar, sVar2, bVar);
                        x xVar = (x) wVar;
                        d dVar = xVar.f12733c;
                        s sVar3 = iVar.f12699a;
                        t2.d c10 = iVar.f12701c.c();
                        sVar3.getClass();
                        j.a a10 = s.a();
                        a10.b(sVar3.b());
                        a10.c(c10);
                        a10.f12708b = sVar3.c();
                        j a11 = a10.a();
                        h.a aVar2 = new h.a();
                        aVar2.f12698f = new HashMap();
                        aVar2.f12696d = Long.valueOf(xVar.f12731a.a());
                        aVar2.f12697e = Long.valueOf(xVar.f12732b.a());
                        aVar2.d(iVar.f12700b);
                        aVar2.c(new m(iVar.f12703e, (byte[]) iVar.f12702d.apply(iVar.f12701c.b())));
                        aVar2.f12694b = iVar.f12701c.a();
                        dVar.a(aVar2.b(), a11, uVar);
                        return;
                    }
                    throw new NullPointerException("Null encoding");
                }
                throw new NullPointerException("Null transformer");
            }
            throw new NullPointerException("Null transportName");
        }
        throw new NullPointerException("Null transportContext");
    }
}
