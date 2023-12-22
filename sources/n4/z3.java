package n4;

import y3.b;
import y3.c;

public final class z3 {

    /* renamed from: a  reason: collision with root package name */
    public final n4 f10345a;

    public z3(w7 w7Var) {
        this.f10345a = w7Var.f10292l;
    }

    public final boolean a() {
        try {
            b a10 = c.a(this.f10345a.f9986a);
            if (a10 == null) {
                this.f10345a.a().f9835n.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (a10.b(128, "com.android.vending").versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e10) {
            this.f10345a.a().f9835n.b("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
