package a7;

import android.content.Context;
import android.util.Log;
import java.util.ArrayDeque;

public final class d0 {

    /* renamed from: e  reason: collision with root package name */
    public static d0 f107e;

    /* renamed from: a  reason: collision with root package name */
    public String f108a = null;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f109b = null;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f110c = null;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f111d = new ArrayDeque();

    public static synchronized d0 a() {
        d0 d0Var;
        synchronized (d0.class) {
            if (f107e == null) {
                f107e = new d0();
            }
            d0Var = f107e;
        }
        return d0Var;
    }

    public final boolean b(Context context) {
        if (this.f110c == null) {
            this.f110c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f109b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f110c.booleanValue();
    }

    public final boolean c(Context context) {
        if (this.f109b == null) {
            this.f109b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f109b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f109b.booleanValue();
    }
}
