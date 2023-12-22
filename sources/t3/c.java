package t3;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import o3.d;
import p3.a;
import p3.c;
import q3.l;
import q3.l0;
import r3.r;
import r3.s;

public final class c extends p3.c<s> {
    public static final a<s> k = new a<>("ClientTelemetry.API", new b(), new a.f());

    public c(Context context) {
        super(context, k, s.f11631b, c.a.f10671c);
    }

    public final Task<Void> c(r rVar) {
        l.a aVar = new l.a();
        aVar.f11256c = new d[]{f4.d.f6382a};
        aVar.f11255b = false;
        aVar.f11254a = new y0.c((Object) rVar);
        return b(2, new l0(aVar, aVar.f11256c, aVar.f11255b, aVar.f11257d));
    }
}
