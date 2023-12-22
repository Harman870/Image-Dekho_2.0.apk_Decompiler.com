package j6;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import k6.k;
import u6.a;

public final /* synthetic */ class t implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8763a;

    public /* synthetic */ t(int i10) {
        this.f8763a = i10;
    }

    public final Object get() {
        switch (this.f8763a) {
            case 0:
                return null;
            default:
                q<ScheduledExecutorService> qVar = ExecutorsRegistrar.f3480a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i10 = Build.VERSION.SDK_INT;
                detectNetwork.detectResourceMismatches();
                if (i10 >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                return new k(Executors.newFixedThreadPool(4, new k6.a("Firebase Background", 10, detectNetwork.penaltyLog().build())), ExecutorsRegistrar.f3483d.get());
        }
    }
}
