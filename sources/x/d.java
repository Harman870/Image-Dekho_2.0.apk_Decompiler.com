package x;

import android.util.Log;
import java.lang.reflect.Method;

public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f12767a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f12768b;

    public d(Object obj, Object obj2) {
        this.f12767a = obj;
        this.f12768b = obj2;
    }

    public final void run() {
        try {
            Method method = e.f12772d;
            if (method != null) {
                method.invoke(this.f12767a, new Object[]{this.f12768b, Boolean.FALSE, "AppCompat recreation"});
                return;
            }
            e.f12773e.invoke(this.f12767a, new Object[]{this.f12768b, Boolean.FALSE});
        } catch (RuntimeException e10) {
            if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                throw e10;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
