package i4;

import java.util.List;

public final class o1 extends p1 {
    public final List a(long j10, Object obj) {
        f1 f1Var = (f1) h3.j(j10, obj);
        if (f1Var.zzc()) {
            return f1Var;
        }
        int size = f1Var.size();
        f1 c10 = f1Var.c(size == 0 ? 10 : size + size);
        h3.s(j10, obj, c10);
        return c10;
    }

    public final void b(long j10, Object obj) {
        ((f1) h3.j(j10, obj)).zzb();
    }

    public final void c(long j10, Object obj, Object obj2) {
        f1 f1Var = (f1) h3.j(j10, obj);
        f1 f1Var2 = (f1) h3.j(j10, obj2);
        int size = f1Var.size();
        int size2 = f1Var2.size();
        if (size > 0 && size2 > 0) {
            if (!f1Var.zzc()) {
                f1Var = f1Var.c(size2 + size);
            }
            f1Var.addAll(f1Var2);
        }
        if (size > 0) {
            f1Var2 = f1Var;
        }
        h3.s(j10, obj, f1Var2);
    }
}
