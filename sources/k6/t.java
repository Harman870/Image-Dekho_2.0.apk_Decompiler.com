package k6;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public enum t implements Executor {
    ;
    
    @SuppressLint({"ThreadPoolCreation"})

    /* renamed from: b  reason: collision with root package name */
    public static final Handler f9115b = null;

    /* access modifiers changed from: public */
    static {
        f9115b = new Handler(Looper.getMainLooper());
    }

    /* access modifiers changed from: public */
    t() {
    }

    public final void execute(Runnable runnable) {
        f9115b.post(runnable);
    }
}
