package n4;

import j4.k3;
import j4.t3;
import java.util.ArrayList;

public final class u7 {

    /* renamed from: a  reason: collision with root package name */
    public t3 f10167a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f10168b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f10169c;

    /* renamed from: d  reason: collision with root package name */
    public long f10170d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ w7 f10171e;

    public /* synthetic */ u7(w7 w7Var) {
        this.f10171e = w7Var;
    }

    public final boolean a(long j10, k3 k3Var) {
        if (this.f10169c == null) {
            this.f10169c = new ArrayList();
        }
        if (this.f10168b == null) {
            this.f10168b = new ArrayList();
        }
        if (!this.f10169c.isEmpty() && ((((k3) this.f10169c.get(0)).w() / 1000) / 60) / 60 != ((k3Var.w() / 1000) / 60) / 60) {
            return false;
        }
        long e10 = this.f10170d + ((long) k3Var.e());
        this.f10171e.J();
        if (e10 >= ((long) Math.max(0, ((Integer) w2.f10223j.a((Object) null)).intValue()))) {
            return false;
        }
        this.f10170d = e10;
        this.f10169c.add(k3Var);
        this.f10168b.add(Long.valueOf(j10));
        int size = this.f10169c.size();
        this.f10171e.J();
        if (size >= Math.max(1, ((Integer) w2.k.a((Object) null)).intValue())) {
            return false;
        }
        return true;
    }
}
