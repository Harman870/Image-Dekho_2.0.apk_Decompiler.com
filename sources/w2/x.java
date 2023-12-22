package w2;

import android.content.Context;
import androidx.activity.i;
import b3.d;
import c3.q;
import c3.t;
import f3.a;

public final class x implements w {

    /* renamed from: e  reason: collision with root package name */
    public static volatile k f12730e;

    /* renamed from: a  reason: collision with root package name */
    public final a f12731a;

    /* renamed from: b  reason: collision with root package name */
    public final a f12732b;

    /* renamed from: c  reason: collision with root package name */
    public final d f12733c;

    /* renamed from: d  reason: collision with root package name */
    public final q f12734d;

    public x(a aVar, a aVar2, d dVar, q qVar, t tVar) {
        this.f12731a = aVar;
        this.f12732b = aVar2;
        this.f12733c = dVar;
        this.f12734d = qVar;
        tVar.f2438a.execute(new i(5, tVar));
    }

    public static x a() {
        k kVar = f12730e;
        if (kVar != null) {
            return kVar.f12715f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f12730e == null) {
            synchronized (x.class) {
                if (f12730e == null) {
                    context.getClass();
                    Class<Context> cls = Context.class;
                    f12730e = new k(context);
                }
            }
        }
    }
}
