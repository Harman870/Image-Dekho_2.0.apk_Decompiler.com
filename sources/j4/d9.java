package j4;

import c2.b;
import i4.h6;
import java.util.List;
import o.c;

public final class d9 extends j {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f8107c = 1;

    /* renamed from: d  reason: collision with root package name */
    public final Object f8108d;

    public d9(b bVar) {
        super("internal.logger");
        this.f8108d = bVar;
        this.f8269b.put("log", new rd(this, false, true));
        this.f8269b.put("silent", new xa(0));
        ((j) this.f8269b.get("silent")).i("log", new rd(this, true, true));
        this.f8269b.put("unmonitored", new yb());
        ((j) this.f8269b.get("unmonitored")).i("log", new rd(this, false, false));
    }

    public final p c(c cVar, List list) {
        switch (this.f8107c) {
            case 0:
                return p.f8373c0;
            default:
                return p.f8373c0;
        }
    }

    public d9(h6 h6Var) {
        super("internal.remoteConfig");
        this.f8108d = h6Var;
        this.f8269b.put("getValue", new f8(h6Var));
    }
}
