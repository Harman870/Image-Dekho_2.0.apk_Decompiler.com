package r3;

import android.os.Looper;
import android.text.TextUtils;
import f4.f;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class o {
    public static void a(String str, boolean z9) {
        if (!z9) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(boolean z9) {
        if (!z9) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(f fVar) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != fVar.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = fVar.getLooper().getThread().getName();
            throw new IllegalStateException("Must be called on " + name2 + " thread, but got " + name + ".");
        }
    }

    public static void d(String str) {
        boolean z9;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            throw new IllegalStateException(str);
        }
    }

    @EnsuresNonNull({"#1"})
    public static void e(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    @EnsuresNonNull({"#1"})
    public static void f(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void g(String str) {
        boolean z9;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            throw new IllegalStateException(str);
        }
    }

    @EnsuresNonNull({"#1"})
    public static void h(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    @EnsuresNonNull({"#1"})
    public static void i(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void j(String str, boolean z9) {
        if (!z9) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void k(boolean z9) {
        if (!z9) {
            throw new IllegalStateException();
        }
    }
}
