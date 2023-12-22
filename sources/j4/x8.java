package j4;

public final class x8 implements l8 {

    /* renamed from: a  reason: collision with root package name */
    public final n8 f8555a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8556b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f8557c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8558d;

    public x8(m7 m7Var, String str, Object[] objArr) {
        this.f8555a = m7Var;
        this.f8556b = str;
        this.f8557c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f8558d = charAt;
            return;
        }
        char c10 = charAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 >= 55296) {
                c10 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            } else {
                this.f8558d = c10 | (charAt2 << i10);
                return;
            }
        }
    }

    public final String a() {
        return this.f8556b;
    }

    public final Object[] b() {
        return this.f8557c;
    }

    public final n8 zza() {
        return this.f8555a;
    }

    public final boolean zzb() {
        return (this.f8558d & 2) == 2;
    }

    public final int zzc() {
        return (this.f8558d & 1) == 1 ? 1 : 2;
    }
}
