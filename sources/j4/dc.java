package j4;

public final class dc implements cc {

    /* renamed from: a  reason: collision with root package name */
    public static final z4 f8111a;

    /* renamed from: b  reason: collision with root package name */
    public static final a5 f8112b;

    /* renamed from: c  reason: collision with root package name */
    public static final y4 f8113c;

    /* renamed from: d  reason: collision with root package name */
    public static final y4 f8114d;

    /* renamed from: e  reason: collision with root package name */
    public static final b5 f8115e;

    static {
        c5 c5Var = new c5(v4.a(), false, true);
        f8111a = c5Var.c("measurement.test.boolean_flag", false);
        f8112b = new a5(c5Var, Double.valueOf(-3.0d));
        f8113c = c5Var.a(-2, "measurement.test.int_flag");
        f8114d = c5Var.a(-1, "measurement.test.long_flag");
        f8115e = new b5(c5Var, "measurement.test.string_flag", "---");
    }

    public final String a() {
        return (String) f8115e.b();
    }

    public final double zza() {
        return ((Double) f8112b.b()).doubleValue();
    }

    public final long zzb() {
        return ((Long) f8113c.b()).longValue();
    }

    public final long zzc() {
        return ((Long) f8114d.b()).longValue();
    }

    public final boolean zze() {
        return ((Boolean) f8111a.b()).booleanValue();
    }
}
