package w3;

import android.content.Context;
import android.util.Log;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import r3.o;

public final class c {
    @ResultIgnorabilityUnspecified
    public static void a(Context context, Throwable th) {
        try {
            o.h(context);
            o.h(th);
        } catch (Exception e10) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e10);
        }
    }
}
