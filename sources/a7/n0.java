package a7;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import c3.n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s5.f;

public final class n0 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final Context f183a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f184b;

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledExecutorService f185c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f186d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public m0 f187e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f188f = false;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f189a;

        /* renamed from: b  reason: collision with root package name */
        public final TaskCompletionSource<Void> f190b = new TaskCompletionSource<>();

        public a(Intent intent) {
            this.f189a = intent;
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public n0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new x3.a("Firebase-FirebaseInstanceIdServiceConnection"));
        Context applicationContext = context.getApplicationContext();
        this.f183a = applicationContext;
        this.f184b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f185c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f186d.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            m0 m0Var = this.f187e;
            if (m0Var == null || !m0Var.isBinderAlive()) {
                c();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f187e.a((a) this.f186d.poll());
        }
    }

    public final synchronized Task<Void> b(Intent intent) {
        a aVar;
        boolean z9;
        long j10;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new a(intent);
        ScheduledExecutorService scheduledExecutorService = this.f185c;
        if ((aVar.f189a.getFlags() & 268435456) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        f fVar = new f(2, aVar);
        if (z9) {
            j10 = l0.f176a;
        } else {
            j10 = 9000;
        }
        aVar.f190b.getTask().addOnCompleteListener((Executor) scheduledExecutorService, new n(scheduledExecutorService.schedule(fVar, j10, TimeUnit.MILLISECONDS)));
        this.f186d.add(aVar);
        a();
        return aVar.f190b.getTask();
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder g10 = androidx.activity.f.g("binder is dead. start connection? ");
            g10.append(!this.f188f);
            Log.d("FirebaseMessaging", g10.toString());
        }
        if (!this.f188f) {
            this.f188f = true;
            try {
                if (!v3.a.b().a(this.f183a, this.f184b, this, 65)) {
                    Log.e("FirebaseMessaging", "binding to the service failed");
                    this.f188f = false;
                    while (!this.f186d.isEmpty()) {
                        ((a) this.f186d.poll()).f190b.trySetResult(null);
                    }
                }
            } catch (SecurityException e10) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e10);
            }
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f188f = false;
        if (!(iBinder instanceof m0)) {
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            while (!this.f186d.isEmpty()) {
                ((a) this.f186d.poll()).f190b.trySetResult(null);
            }
            return;
        }
        this.f187e = (m0) iBinder;
        a();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
