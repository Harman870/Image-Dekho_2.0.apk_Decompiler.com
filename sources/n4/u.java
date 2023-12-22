package n4;

import r3.o;

public final class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f10148a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f10149b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q1 f10150c;

    public u(q1 q1Var, String str, long j10) {
        this.f10150c = q1Var;
        this.f10148a = str;
        this.f10149b = j10;
    }

    public final void run() {
        q1 q1Var = this.f10150c;
        String str = this.f10148a;
        long j10 = this.f10149b;
        q1Var.g();
        o.e(str);
        Integer num = (Integer) q1Var.f10069c.getOrDefault(str, null);
        if (num != null) {
            g6 m2 = q1Var.f9600a.u().m(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                q1Var.f10069c.remove(str);
                Long l6 = (Long) q1Var.f10068b.getOrDefault(str, null);
                if (l6 == null) {
                    q1Var.f9600a.a().f9828f.a("First ad unit exposure time was never set");
                } else {
                    q1Var.f10068b.remove(str);
                    q1Var.l(str, j10 - l6.longValue(), m2);
                }
                if (q1Var.f10069c.isEmpty()) {
                    long j11 = q1Var.f10070d;
                    if (j11 == 0) {
                        q1Var.f9600a.a().f9828f.a("First ad exposure time was never set");
                        return;
                    }
                    q1Var.k(j10 - j11, m2);
                    q1Var.f10070d = 0;
                    return;
                }
                return;
            }
            q1Var.f10069c.put(str, Integer.valueOf(intValue));
            return;
        }
        q1Var.f9600a.a().f9828f.b("Call to endAdUnitExposure for unknown ad unit id", str);
    }
}
