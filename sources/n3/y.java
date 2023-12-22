package n3;

import android.content.Context;
import android.util.Log;
import c4.h;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import q4.a;

public final /* synthetic */ class y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9578a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9579b;

    public /* synthetic */ y(int i10, Object obj) {
        this.f9578a = i10;
        this.f9579b = obj;
    }

    public final void run() {
        long j10;
        String str;
        String str2;
        switch (this.f9578a) {
            case 0:
                if (((TaskCompletionSource) this.f9579b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 2:
                long j11 = ((h) this.f9579b).f2450a.getSharedPreferences("app_set_id_storage", 0).getLong("app_set_id_last_used_time", -1);
                if (j11 != -1) {
                    j10 = j11 + 33696000000L;
                } else {
                    j10 = -1;
                }
                if (j10 != -1 && System.currentTimeMillis() > j10) {
                    Context context = ((h) this.f9579b).f2450a;
                    if (!context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id").commit()) {
                        String valueOf = String.valueOf(context.getPackageName());
                        if (valueOf.length() != 0) {
                            str2 = "Failed to clear app set ID generated for App ".concat(valueOf);
                        } else {
                            str2 = new String("Failed to clear app set ID generated for App ");
                        }
                        Log.e("AppSet", str2);
                    }
                    if (!context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                        String valueOf2 = String.valueOf(context.getPackageName());
                        if (valueOf2.length() != 0) {
                            str = "Failed to clear app set ID last used time for App ".concat(valueOf2);
                        } else {
                            str = new String("Failed to clear app set ID last used time for App ");
                        }
                        Log.e("AppSet", str);
                        return;
                    }
                    return;
                }
                return;
            default:
                a aVar = (a) this.f9579b;
                synchronized (aVar.f11321a) {
                    if (aVar.b()) {
                        Log.e("WakeLock", String.valueOf(aVar.f11330j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                        aVar.d();
                        if (aVar.b()) {
                            aVar.f11323c = 1;
                            aVar.e();
                        }
                    }
                }
                return;
        }
    }

    public /* synthetic */ y(h hVar) {
        this.f9578a = 2;
        this.f9579b = hVar;
    }
}
