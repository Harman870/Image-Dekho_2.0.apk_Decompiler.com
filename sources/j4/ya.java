package j4;

public final class ya implements wa {

    /* renamed from: a  reason: collision with root package name */
    public static final z4 f8572a;

    /* renamed from: b  reason: collision with root package name */
    public static final z4 f8573b;

    /* renamed from: c  reason: collision with root package name */
    public static final z4 f8574c;

    static {
        c5 c5Var = new c5(v4.a(), false, true);
        c5Var.c("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f8572a = c5Var.c("measurement.audience.refresh_event_count_filters_timestamp", false);
        f8573b = c5Var.c("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f8574c = c5Var.c("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    public final boolean a() {
        return ((Boolean) f8574c.b()).booleanValue();
    }

    public final void zza() {
    }

    public final boolean zzb() {
        return ((Boolean) f8572a.b()).booleanValue();
    }

    public final boolean zzc() {
        return ((Boolean) f8573b.b()).booleanValue();
    }
}
