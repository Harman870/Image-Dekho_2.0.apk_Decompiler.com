package com.google.firebase.messaging;

import a7.a0;
import a7.b0;
import a7.f0;
import a7.i0;
import a7.j0;
import a7.m;
import a7.n;
import a7.p;
import a7.s;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.appcompat.widget.j1;
import b3.b;
import c6.f;
import c7.g;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.a;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r3.o;
import r6.d;
import s6.i;
import t2.e;

public class FirebaseMessaging {
    public static final long k = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: l  reason: collision with root package name */
    public static a f3484l;
    @SuppressLint({"FirebaseUnknownNullness"})

    /* renamed from: m  reason: collision with root package name */
    public static e f3485m;

    /* renamed from: n  reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f3486n;

    /* renamed from: a  reason: collision with root package name */
    public final f f3487a;

    /* renamed from: b  reason: collision with root package name */
    public final t6.a f3488b;

    /* renamed from: c  reason: collision with root package name */
    public final v6.f f3489c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f3490d;

    /* renamed from: e  reason: collision with root package name */
    public final p f3491e;

    /* renamed from: f  reason: collision with root package name */
    public final b0 f3492f;

    /* renamed from: g  reason: collision with root package name */
    public final a f3493g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f3494h;

    /* renamed from: i  reason: collision with root package name */
    public final s f3495i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3496j;

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final d f3497a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3498b;

        /* renamed from: c  reason: collision with root package name */
        public Boolean f3499c;

        public a(d dVar) {
            this.f3497a = dVar;
        }

        public final synchronized void a() {
            if (!this.f3498b) {
                Boolean b10 = b();
                this.f3499c = b10;
                if (b10 == null) {
                    this.f3497a.a(new n(this));
                }
                this.f3498b = true;
            }
        }

        public final Boolean b() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            f fVar = FirebaseMessaging.this.f3487a;
            fVar.a();
            Context context = fVar.f2494a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging() {
        throw null;
    }

    public FirebaseMessaging(f fVar, t6.a aVar, u6.a<g> aVar2, u6.a<i> aVar3, v6.f fVar2, e eVar, d dVar) {
        f fVar3 = fVar;
        t6.a aVar4 = aVar;
        fVar.a();
        s sVar = new s(fVar3.f2494a);
        p pVar = new p(fVar, sVar, aVar2, aVar3, fVar2);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new x3.a("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new x3.a("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new x3.a("Firebase-Messaging-File-Io"));
        this.f3496j = false;
        f3485m = eVar;
        this.f3487a = fVar3;
        this.f3488b = aVar4;
        this.f3489c = fVar2;
        this.f3493g = new a(dVar);
        fVar.a();
        Context context = fVar3.f2494a;
        this.f3490d = context;
        m mVar = new m();
        this.f3495i = sVar;
        this.f3491e = pVar;
        this.f3492f = new b0(newSingleThreadExecutor);
        this.f3494h = threadPoolExecutor;
        fVar.a();
        Context context2 = fVar3.f2494a;
        if (context2 instanceof Application) {
            ((Application) context2).registerActivityLifecycleCallbacks(mVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar4 != null) {
            aVar.c();
        }
        scheduledThreadPoolExecutor.execute(new s5.f(1, this));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new x3.a("Firebase-Messaging-Topics-Io"));
        int i10 = j0.f150j;
        Tasks.call(scheduledThreadPoolExecutor2, new i0(context, this, pVar, sVar, scheduledThreadPoolExecutor2)).addOnSuccessListener((Executor) scheduledThreadPoolExecutor, new c3.n(this));
        scheduledThreadPoolExecutor.execute(new j1(2, this));
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static void b(f0 f0Var, long j10) {
        synchronized (FirebaseMessaging.class) {
            if (f3486n == null) {
                f3486n = new ScheduledThreadPoolExecutor(1, new x3.a("TAG"));
            }
            f3486n.schedule(f0Var, j10, TimeUnit.SECONDS);
        }
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(f fVar) {
        FirebaseMessaging firebaseMessaging;
        Class cls = FirebaseMessaging.class;
        synchronized (cls) {
            firebaseMessaging = (FirebaseMessaging) fVar.b(cls);
            o.i(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task<TContinuationResult> task;
        t6.a aVar = this.f3488b;
        if (aVar != null) {
            try {
                return (String) Tasks.await(aVar.b());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        } else {
            a.C0033a c10 = c();
            if (!f(c10)) {
                return c10.f3504a;
            }
            String a10 = s.a(this.f3487a);
            b0 b0Var = this.f3492f;
            synchronized (b0Var) {
                task = (Task) b0Var.f102b.getOrDefault(a10, null);
                if (task == null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Making new request for: " + a10);
                    }
                    p pVar = this.f3491e;
                    task = pVar.a(pVar.c(s.a(pVar.f191a), "*", new Bundle())).onSuccessTask(this.f3494h, new b(this, a10, c10)).continueWithTask(b0Var.f101a, new a0(b0Var, a10));
                    b0Var.f102b.put(a10, task);
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Joining ongoing request for: " + a10);
                }
            }
            try {
                return (String) Tasks.await(task);
            } catch (InterruptedException | ExecutionException e11) {
                throw new IOException(e11);
            }
        }
    }

    public final a.C0033a c() {
        a aVar;
        String str;
        a.C0033a b10;
        Context context = this.f3490d;
        synchronized (FirebaseMessaging.class) {
            if (f3484l == null) {
                f3484l = new a(context);
            }
            aVar = f3484l;
        }
        f fVar = this.f3487a;
        fVar.a();
        if ("[DEFAULT]".equals(fVar.f2495b)) {
            str = "";
        } else {
            str = this.f3487a.f();
        }
        String a10 = s.a(this.f3487a);
        synchronized (aVar) {
            b10 = a.C0033a.b(aVar.f3502a.getString(a.a(str, a10), (String) null));
        }
        return b10;
    }

    public final void d() {
        t6.a aVar = this.f3488b;
        if (aVar != null) {
            aVar.a();
        } else if (f(c())) {
            synchronized (this) {
                if (!this.f3496j) {
                    e(0);
                }
            }
        }
    }

    public final synchronized void e(long j10) {
        b(new f0(this, Math.min(Math.max(30, 2 * j10), k)), j10);
        this.f3496j = true;
    }

    public final boolean f(a.C0033a aVar) {
        String str;
        boolean z9;
        if (aVar != null) {
            s sVar = this.f3495i;
            synchronized (sVar) {
                if (sVar.f201b == null) {
                    sVar.d();
                }
                str = sVar.f201b;
            }
            if (System.currentTimeMillis() > aVar.f3506c + a.C0033a.f3503d || !str.equals(aVar.f3505b)) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                return false;
            }
        }
        return true;
    }
}
