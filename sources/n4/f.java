package n4;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import c.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.reflect.InvocationTargetException;
import r3.o;
import y3.c;

public final class f extends a5 {

    /* renamed from: b  reason: collision with root package name */
    public Boolean f9730b;

    /* renamed from: c  reason: collision with root package name */
    public e f9731c = a.f2353o;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f9732d;

    public f(n4 n4Var) {
        super(n4Var);
    }

    public final String h(String str) {
        String str2;
        g3 g3Var;
        Class<String> cls = String.class;
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, ""});
            o.h(str3);
            return str3;
        } catch (ClassNotFoundException e10) {
            e = e10;
            g3Var = this.f9600a.a().f9828f;
            str2 = "Could not find SystemProperties class";
            g3Var.b(str2, e);
            return "";
        } catch (NoSuchMethodException e11) {
            e = e11;
            g3Var = this.f9600a.a().f9828f;
            str2 = "Could not find SystemProperties.get() method";
            g3Var.b(str2, e);
            return "";
        } catch (IllegalAccessException e12) {
            e = e12;
            g3Var = this.f9600a.a().f9828f;
            str2 = "Could not access SystemProperties.get()";
            g3Var.b(str2, e);
            return "";
        } catch (InvocationTargetException e13) {
            e = e13;
            g3Var = this.f9600a.a().f9828f;
            str2 = "SystemProperties.get() threw an exception";
            g3Var.b(str2, e);
            return "";
        }
    }

    public final int i(String str, v2 v2Var) {
        if (str != null) {
            String b10 = this.f9731c.b(str, v2Var.f10176a);
            if (!TextUtils.isEmpty(b10)) {
                try {
                    return ((Integer) v2Var.a(Integer.valueOf(Integer.parseInt(b10)))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Integer) v2Var.a((Object) null)).intValue();
    }

    public final int j(String str, v2 v2Var, int i10, int i11) {
        return Math.max(Math.min(i(str, v2Var), i11), i10);
    }

    public final void k() {
        this.f9600a.getClass();
    }

    public final long l(String str, v2 v2Var) {
        if (str != null) {
            String b10 = this.f9731c.b(str, v2Var.f10176a);
            if (!TextUtils.isEmpty(b10)) {
                try {
                    return ((Long) v2Var.a(Long.valueOf(Long.parseLong(b10)))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Long) v2Var.a((Object) null)).longValue();
    }

    public final Bundle m() {
        try {
            if (this.f9600a.f9986a.getPackageManager() == null) {
                this.f9600a.a().f9828f.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a10 = c.a(this.f9600a.f9986a).a(128, this.f9600a.f9986a.getPackageName());
            if (a10 != null) {
                return a10.metaData;
            }
            this.f9600a.a().f9828f.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            this.f9600a.a().f9828f.b("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    public final Boolean n(String str) {
        o.e(str);
        Bundle m2 = m();
        if (m2 == null) {
            this.f9600a.a().f9828f.a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!m2.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(m2.getBoolean(str));
        }
    }

    public final boolean o(String str, v2 v2Var) {
        Object a10;
        if (str != null) {
            String b10 = this.f9731c.b(str, v2Var.f10176a);
            if (!TextUtils.isEmpty(b10)) {
                a10 = v2Var.a(Boolean.valueOf(IronSourceConstants.BOOLEAN_TRUE_AS_STRING.equals(b10)));
                return ((Boolean) a10).booleanValue();
            }
        }
        a10 = v2Var.a((Object) null);
        return ((Boolean) a10).booleanValue();
    }

    public final boolean p() {
        Boolean n2 = n("google_analytics_automatic_screen_reporting_enabled");
        return n2 == null || n2.booleanValue();
    }

    public final boolean q() {
        this.f9600a.getClass();
        Boolean n2 = n("firebase_analytics_collection_deactivated");
        return n2 != null && n2.booleanValue();
    }

    public final boolean r(String str) {
        return IronSourceConstants.BOOLEAN_TRUE_AS_STRING.equals(this.f9731c.b(str, "measurement.event_sampling_enabled"));
    }

    public final boolean s() {
        if (this.f9730b == null) {
            Boolean n2 = n("app_measurement_lite");
            this.f9730b = n2;
            if (n2 == null) {
                this.f9730b = Boolean.FALSE;
            }
        }
        return this.f9730b.booleanValue() || !this.f9600a.f9990e;
    }
}
