package i4;

public final class l2 implements z1 {

    /* renamed from: a  reason: collision with root package name */
    public final b2 f7463a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7464b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f7465c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7466d;

    public l2(c1 c1Var, String str, Object[] objArr) {
        this.f7463a = c1Var;
        this.f7464b = str;
        this.f7465c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f7466d = charAt;
            return;
        }
        char c10 = charAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 >= 55296) {
                c10 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            } else {
                this.f7466d = c10 | (charAt2 << i11);
                return;
            }
        }
    }

    public final String a() {
        return this.f7464b;
    }

    public final Object[] b() {
        return this.f7465c;
    }

    public final b2 zza() {
        return this.f7463a;
    }

    public final boolean zzb() {
        return (this.f7466d & 2) == 2;
    }

    public final int zzc() {
        return (this.f7466d & 1) == 1 ? 1 : 2;
    }
}
