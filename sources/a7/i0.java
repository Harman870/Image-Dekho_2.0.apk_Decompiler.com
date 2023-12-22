package a7;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final /* synthetic */ class i0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f137a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorService f138b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f139c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ s f140d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ p f141e;

    public /* synthetic */ i0(Context context, FirebaseMessaging firebaseMessaging, p pVar, s sVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f137a = context;
        this.f138b = scheduledThreadPoolExecutor;
        this.f139c = firebaseMessaging;
        this.f140d = sVar;
        this.f141e = pVar;
    }

    public final Object call() {
        h0 h0Var;
        Context context = this.f137a;
        ScheduledExecutorService scheduledExecutorService = this.f138b;
        FirebaseMessaging firebaseMessaging = this.f139c;
        s sVar = this.f140d;
        p pVar = this.f141e;
        synchronized (h0.class) {
            WeakReference<h0> weakReference = h0.f132b;
            if (weakReference != null) {
                h0Var = weakReference.get();
            } else {
                h0Var = null;
            }
            if (h0Var == null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                h0 h0Var2 = new h0(sharedPreferences, scheduledExecutorService);
                synchronized (h0Var2) {
                    h0Var2.f133a = e0.a(sharedPreferences, scheduledExecutorService);
                }
                h0.f132b = new WeakReference<>(h0Var2);
                h0Var = h0Var2;
            }
        }
        return new j0(firebaseMessaging, sVar, h0Var, pVar, context, scheduledExecutorService);
    }
}
