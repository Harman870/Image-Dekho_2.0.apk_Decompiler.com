package a7;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f206a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f207b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f208c;

    public /* synthetic */ x(Context context, boolean z9, TaskCompletionSource taskCompletionSource) {
        this.f206a = context;
        this.f207b = z9;
        this.f208c = taskCompletionSource;
    }

    public final void run() {
        boolean z9;
        Context context = this.f206a;
        boolean z10 = this.f207b;
        TaskCompletionSource taskCompletionSource = this.f208c;
        try {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
            } else {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                SharedPreferences.Editor edit = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                edit.putBoolean("proxy_notification_initialized", true);
                edit.apply();
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (z10) {
                    notificationManager.setNotificationDelegate("com.google.android.gms");
                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                    notificationManager.setNotificationDelegate((String) null);
                }
            }
        } finally {
            taskCompletionSource.trySetResult(null);
        }
    }
}
