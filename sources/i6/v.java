package i6;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;

public final class v {

    /* renamed from: b  reason: collision with root package name */
    public static final v f7927b = new v();

    /* renamed from: a  reason: collision with root package name */
    public final p f7928a;

    public v() {
        p pVar = p.f7919b;
        if (k.f7914a == null) {
            k.f7914a = new k();
        }
        this.f7928a = pVar;
    }

    public static void a(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.f2811b);
        edit.putString("statusMessage", status.f2812c);
        edit.putLong("timestamp", System.currentTimeMillis());
        edit.commit();
    }
}
