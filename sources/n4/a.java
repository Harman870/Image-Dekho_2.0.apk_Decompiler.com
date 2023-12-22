package n4;

import m.b;
import r3.o;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f9581a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f9582b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q1 f9583c;

    public a(q1 q1Var, String str, long j10) {
        this.f9583c = q1Var;
        this.f9581a = str;
        this.f9582b = j10;
    }

    public final void run() {
        Object obj;
        b bVar;
        q1 q1Var = this.f9583c;
        String str = this.f9581a;
        long j10 = this.f9582b;
        q1Var.g();
        o.e(str);
        if (q1Var.f10069c.isEmpty()) {
            q1Var.f10070d = j10;
        }
        Integer num = (Integer) q1Var.f10069c.getOrDefault(str, null);
        if (num != null) {
            bVar = q1Var.f10069c;
            obj = Integer.valueOf(num.intValue() + 1);
        } else {
            b bVar2 = q1Var.f10069c;
            if (bVar2.f9301c >= 100) {
                q1Var.f9600a.a().f9831i.a("Too many ads visible");
                return;
            }
            bVar2.put(str, 1);
            bVar = q1Var.f10068b;
            obj = Long.valueOf(j10);
        }
        bVar.put(str, obj);
    }
}
