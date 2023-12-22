package j4;

public final class a8 extends b8 {
    public final void a(long j10, Object obj) {
        ((r7) t9.j(j10, obj)).zzb();
    }

    public final void b(long j10, Object obj, Object obj2) {
        r7 r7Var = (r7) t9.j(j10, obj);
        r7 r7Var2 = (r7) t9.j(j10, obj2);
        int size = r7Var.size();
        int size2 = r7Var2.size();
        if (size > 0 && size2 > 0) {
            if (!r7Var.zzc()) {
                r7Var = r7Var.c(size2 + size);
            }
            r7Var.addAll(r7Var2);
        }
        if (size > 0) {
            r7Var2 = r7Var;
        }
        t9.r(j10, obj, r7Var2);
    }
}
