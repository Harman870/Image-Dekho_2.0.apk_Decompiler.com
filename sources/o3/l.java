package o3;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import f4.f;
import java.util.concurrent.atomic.AtomicBoolean;

@SuppressLint({"HandlerLeak"})
public final class l extends f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f10572a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f10573b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f10573b = eVar;
        this.f10572a = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        PendingIntent pendingIntent;
        int i10 = message.what;
        boolean z9 = true;
        if (i10 != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i10);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int c10 = this.f10573b.c(this.f10572a);
        this.f10573b.getClass();
        AtomicBoolean atomicBoolean = i.f10562a;
        if (!(c10 == 1 || c10 == 2 || c10 == 3 || c10 == 9)) {
            z9 = false;
        }
        if (z9) {
            e eVar = this.f10573b;
            Context context = this.f10572a;
            Intent a10 = eVar.a(context, "n", c10);
            if (a10 == null) {
                pendingIntent = null;
            } else {
                pendingIntent = PendingIntent.getActivity(context, 0, a10, 201326592);
            }
            eVar.g(context, c10, pendingIntent);
        }
    }
}
