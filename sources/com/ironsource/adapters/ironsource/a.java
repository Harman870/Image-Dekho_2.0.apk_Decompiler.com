package com.ironsource.adapters.ironsource;

import android.content.Context;
import android.os.Build;
import c7.f;
import com.google.firebase.components.ComponentRegistrar;
import com.ironsource.mediationsdk.logger.IronLog;
import d3.x;
import j6.e;
import j9.l;
import java.util.List;
import l2.d;

public final /* synthetic */ class a implements x.a, f.a, e, d.c, l {
    public static /* synthetic */ int d(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        if (i10 == 6) {
            return -1;
        }
        throw null;
    }

    public static float e(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) * f12) + f13;
    }

    public static int f(int i10, int i11, int i12, int i13) {
        return ((i10 * i11) / i12) + i13;
    }

    public static String g(String str, String str2) {
        return str + str2;
    }

    public static StringBuilder h(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static void i(StringBuilder sb, String str, String str2, IronLog ironLog) {
        sb.append(str);
        sb.append(str2);
        ironLog.verbose(sb.toString());
    }

    public static String j(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ String k(int i10) {
        if (i10 == 1) {
            return "UNKNOWN_KEYMATERIAL";
        }
        if (i10 == 2) {
            return "SYMMETRIC";
        }
        if (i10 == 3) {
            return "ASYMMETRIC_PRIVATE";
        }
        if (i10 == 4) {
            return "ASYMMETRIC_PUBLIC";
        }
        if (i10 == 5) {
            return "REMOTE";
        }
        if (i10 == 6) {
            return "UNRECOGNIZED";
        }
        throw null;
    }

    public static /* synthetic */ String l(int i10) {
        return i10 == 1 ? "BEGIN_ARRAY" : i10 == 2 ? "END_ARRAY" : i10 == 3 ? "BEGIN_OBJECT" : i10 == 4 ? "END_OBJECT" : i10 == 5 ? "NAME" : i10 == 6 ? "STRING" : i10 == 7 ? "NUMBER" : i10 == 8 ? "BOOLEAN" : i10 == 9 ? "NULL" : i10 == 10 ? "END_DOCUMENT" : "null";
    }

    public static /* synthetic */ String m(int i10) {
        return i10 == 1 ? "OK" : i10 == 2 ? "TRANSIENT_ERROR" : i10 == 3 ? "FATAL_ERROR" : i10 == 4 ? "INVALID_PAYLOAD" : "null";
    }

    public List a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    public Object apply(Object obj) {
        throw new e3.a("Timed out while trying to open db.", (Throwable) obj);
    }

    public String b(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
    }

    public void c(d dVar) {
        dVar.dismiss();
    }
}
