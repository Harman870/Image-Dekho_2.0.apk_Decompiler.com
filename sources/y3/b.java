package y3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import w3.g;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f13043a;

    public b(Context context) {
        this.f13043a = context;
    }

    @ResultIgnorabilityUnspecified
    public final ApplicationInfo a(int i10, String str) {
        return this.f13043a.getPackageManager().getApplicationInfo(str, i10);
    }

    @ResultIgnorabilityUnspecified
    public final PackageInfo b(int i10, String str) {
        return this.f13043a.getPackageManager().getPackageInfo(str, i10);
    }

    public final boolean c() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return a.l(this.f13043a);
        }
        if (!g.a() || (nameForUid = this.f13043a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f13043a.getPackageManager().isInstantApp(nameForUid);
    }
}
