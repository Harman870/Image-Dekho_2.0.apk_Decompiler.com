package j4;

public final class wb implements vb {

    /* renamed from: a  reason: collision with root package name */
    public static final z4 f8546a;

    static {
        c5 c5Var = new c5(v4.a(), false, true);
        c5Var.a(0, "measurement.id.lifecycle.app_in_background_parameter");
        c5Var.c("measurement.lifecycle.app_backgrounded_tracking", true);
        f8546a = c5Var.c("measurement.lifecycle.app_in_background_parameter", false);
    }

    public final boolean zza() {
        return ((Boolean) f8546a.b()).booleanValue();
    }
}
