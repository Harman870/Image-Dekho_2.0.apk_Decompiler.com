package kotlinx.coroutines.android;

import android.os.Build;
import androidx.annotation.Keep;
import e9.q;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import q8.a;
import q8.f;

@Keep
public final class AndroidExceptionPreHandler extends a implements q {
    private volatile Object _preHandler = this;

    public AndroidExceptionPreHandler() {
        super(q.a.f6259a);
    }

    private final Method preHandler() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        boolean z9 = false;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                z9 = true;
            }
            if (z9) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    public void handleException(f fVar, Throwable th) {
        int i10 = Build.VERSION.SDK_INT;
        if (26 <= i10 && i10 < 28) {
            Method preHandler = preHandler();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            Object invoke = preHandler == null ? null : preHandler.invoke((Object) null, new Object[0]);
            if (invoke instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) invoke;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
