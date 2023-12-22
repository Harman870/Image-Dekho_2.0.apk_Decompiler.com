package k6;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import j6.q;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import u6.a;

public final /* synthetic */ class m implements a {
    public final Object get() {
        q<ScheduledExecutorService> qVar = ExecutorsRegistrar.f3480a;
        return new k(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), ExecutorsRegistrar.f3483d.get());
    }
}
