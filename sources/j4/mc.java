package j4;

public final class mc implements lc {

    /* renamed from: a  reason: collision with root package name */
    public static final z4 f8329a;

    /* renamed from: b  reason: collision with root package name */
    public static final z4 f8330b;

    static {
        c5 c5Var = new c5(v4.a(), true, true);
        c5Var.c("measurement.redaction.app_instance_id", true);
        c5Var.c("measurement.redaction.client_ephemeral_aiid_generation", true);
        c5Var.c("measurement.redaction.config_redacted_fields", true);
        c5Var.c("measurement.redaction.device_info", true);
        c5Var.c("measurement.redaction.e_tag", true);
        c5Var.c("measurement.redaction.enhanced_uid", true);
        c5Var.c("measurement.redaction.populate_ephemeral_app_instance_id", true);
        c5Var.c("measurement.redaction.google_signals", true);
        c5Var.c("measurement.redaction.no_aiid_in_config_request", true);
        f8329a = c5Var.c("measurement.redaction.retain_major_os_version", true);
        f8330b = c5Var.c("measurement.redaction.scion_payload_generator", true);
        c5Var.c("measurement.redaction.upload_redacted_fields", true);
        c5Var.c("measurement.redaction.upload_subdomain_override", true);
        c5Var.c("measurement.redaction.user_id", true);
    }

    public final boolean zza() {
        return ((Boolean) f8329a.b()).booleanValue();
    }

    public final boolean zzb() {
        return ((Boolean) f8330b.b()).booleanValue();
    }
}
