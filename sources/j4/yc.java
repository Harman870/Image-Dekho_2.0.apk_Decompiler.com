package j4;

public final class yc implements xc {

    /* renamed from: a  reason: collision with root package name */
    public static final z4 f8575a;

    static {
        c5 c5Var = new c5(v4.a(), true, true);
        c5Var.c("measurement.client.sessions.background_sessions_enabled", true);
        f8575a = c5Var.c("measurement.client.sessions.enable_fix_background_engagement", false);
        c5Var.c("measurement.client.sessions.immediate_start_enabled_foreground", true);
        c5Var.c("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        c5Var.c("measurement.client.sessions.session_id_enabled", true);
        c5Var.a(0, "measurement.id.client.sessions.enable_fix_background_engagement");
    }

    public final boolean zza() {
        return ((Boolean) f8575a.b()).booleanValue();
    }
}
