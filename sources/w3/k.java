package w3;

import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f12747a;

    /* renamed from: b  reason: collision with root package name */
    public static final Method f12748b;

    /* renamed from: c  reason: collision with root package name */
    public static Boolean f12749c = null;

    static {
        Method method;
        Method method2;
        boolean z9;
        boolean z10;
        boolean z11;
        Class<String> cls = String.class;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            method = null;
        }
        f12747a = method;
        try {
            method2 = WorkSource.class.getMethod("add", new Class[]{Integer.TYPE, cls});
        } catch (Exception unused2) {
            method2 = null;
        }
        f12748b = method2;
        try {
            WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused3) {
        }
        try {
            WorkSource.class.getMethod("get", new Class[]{Integer.TYPE});
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", new Class[]{Integer.TYPE});
        } catch (Exception unused5) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            try {
                WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e10) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e10);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{Integer.TYPE, cls});
            } catch (Exception e11) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e11);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            try {
                WorkSource.class.getMethod("isEmpty", new Class[0]).setAccessible(true);
            } catch (Exception unused6) {
            }
        }
    }
}
