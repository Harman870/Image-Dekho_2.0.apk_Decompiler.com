package j4;

public final class vc implements uc {

    /* renamed from: a  reason: collision with root package name */
    public static final z4 f8526a;

    /* renamed from: b  reason: collision with root package name */
    public static final z4 f8527b;

    /* renamed from: c  reason: collision with root package name */
    public static final z4 f8528c;

    /* renamed from: d  reason: collision with root package name */
    public static final z4 f8529d;

    static {
        c5 c5Var = new c5(v4.a(), true, true);
        f8526a = c5Var.c("measurement.collection.enable_session_stitching_token.client.dev", true);
        f8527b = c5Var.c("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        f8528c = c5Var.c("measurement.session_stitching_token_enabled", false);
        f8529d = c5Var.c("measurement.link_sst_to_sid", true);
    }

    public final boolean a() {
        return ((Boolean) f8528c.b()).booleanValue();
    }

    public final void zza() {
    }

    public final boolean zzb() {
        return ((Boolean) f8526a.b()).booleanValue();
    }

    public final boolean zzc() {
        return ((Boolean) f8527b.b()).booleanValue();
    }

    public final boolean zze() {
        return ((Boolean) f8529d.b()).booleanValue();
    }
}
