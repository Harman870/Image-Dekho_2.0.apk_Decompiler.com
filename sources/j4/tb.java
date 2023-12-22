package j4;

public final class tb implements sb {

    /* renamed from: a  reason: collision with root package name */
    public static final z4 f8480a;

    static {
        c5 c5Var = new c5(v4.a(), false, true);
        c5Var.c("measurement.sdk.collection.enable_extend_user_property_size", true);
        c5Var.c("measurement.sdk.collection.last_deep_link_referrer2", true);
        f8480a = c5Var.c("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        c5Var.a(0, "measurement.id.sdk.collection.last_deep_link_referrer2");
    }

    public final boolean zza() {
        return ((Boolean) f8480a.b()).booleanValue();
    }
}
