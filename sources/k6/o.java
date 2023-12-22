package k6;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import j6.q;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import u6.a;

public final /* synthetic */ class o implements a {
    public final Object get() {
        q<ScheduledExecutorService> qVar = ExecutorsRegistrar.f3480a;
        return Executors.newSingleThreadScheduledExecutor(new a("Firebase Scheduler", 0, (StrictMode.ThreadPolicy) null));
    }
}
