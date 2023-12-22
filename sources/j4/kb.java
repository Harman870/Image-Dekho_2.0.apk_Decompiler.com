package j4;

public final class kb implements jb {

    /* renamed from: a  reason: collision with root package name */
    public static final z4 f8304a;

    static {
        c5 c5Var = new c5(v4.a(), true, true);
        c5Var.c("measurement.client.global_params", true);
        c5Var.c("measurement.service.global_params_in_payload", true);
        f8304a = c5Var.c("measurement.service.clear_global_params_on_uninstall", true);
        c5Var.c("measurement.service.global_params", true);
    }

    public final void zza() {
    }

    public final boolean zzb() {
        return ((Boolean) f8304a.b()).booleanValue();
    }
}
