package a7;

import a7.m0;
import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import c3.k;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
public abstract class j extends Service {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f142f = 0;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f143a;

    /* renamed from: b  reason: collision with root package name */
    public m0 f144b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f145c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public int f146d;

    /* renamed from: e  reason: collision with root package name */
    public int f147e = 0;

    public class a implements m0.a {
        public a() {
        }
    }

    public j() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new x3.a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f143a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public final void a(Intent intent) {
        if (intent != null) {
            l0.a(intent);
        }
        synchronized (this.f145c) {
            int i10 = this.f147e - 1;
            this.f147e = i10;
            if (i10 == 0) {
                stopSelfResult(this.f146d);
            }
        }
    }

    public Intent b(Intent intent) {
        return intent;
    }

    public abstract void c(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f144b == null) {
            this.f144b = new m0(new a());
        }
        return this.f144b;
    }

    public final void onDestroy() {
        this.f143a.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i10, int i11) {
        synchronized (this.f145c) {
            this.f146d = i11;
            this.f147e++;
        }
        Intent b10 = b(intent);
        if (b10 == null) {
            a(intent);
            return 2;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f143a.execute(new i(this, b10, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        if (task.isComplete()) {
            a(intent);
            return 2;
        }
        task.addOnCompleteListener((Executor) new h(), new k(this, intent));
        return 3;
    }
}
