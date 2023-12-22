package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import e1.a;
import e1.b;
import java.util.Collections;
import java.util.List;

public final class ProcessLifecycleInitializer implements b<l> {
    public final List<Class<? extends b<?>>> a() {
        return Collections.emptyList();
    }

    public final Object b(Context context) {
        if (a.c(context).f6167b.contains(ProcessLifecycleInitializer.class)) {
            if (!i.f1742a.getAndSet(true)) {
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new i.a());
            }
            t tVar = t.f1756i;
            tVar.getClass();
            tVar.f1761e = new Handler();
            tVar.f1762f.f(g.b.ON_CREATE);
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new u(tVar));
            return tVar;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
    }
}
