package c4;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import n3.y;

public final class h implements AppSetIdClient {

    /* renamed from: d  reason: collision with root package name */
    public static h f2449d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f2450a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2451b = false;

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorService f2452c;

    public h(Context context) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f2452c = Executors.newSingleThreadExecutor();
        this.f2450a = context;
        if (!this.f2451b) {
            newSingleThreadScheduledExecutor.scheduleAtFixedRate(new y(this), 0, 86400, TimeUnit.SECONDS);
            this.f2451b = true;
        }
    }

    public static final void a(Context context) {
        String str;
        SharedPreferences sharedPreferences = context.getSharedPreferences("app_set_id_storage", 0);
        if (!sharedPreferences.edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            if (valueOf.length() != 0) {
                str = "Failed to store app set ID last used time for App ".concat(valueOf);
            } else {
                str = new String("Failed to store app set ID last used time for App ");
            }
            Log.e("AppSet", str);
            throw new g("Failed to store the app set ID last used time.");
        }
    }

    public final Task<AppSetIdInfo> getAppSetIdInfo() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f2452c.execute(new f(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
