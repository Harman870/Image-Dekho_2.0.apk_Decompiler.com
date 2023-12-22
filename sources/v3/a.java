package v3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import r3.f1;
import r3.o;
import y3.c;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f12505b = new Object();
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public static volatile a f12506c;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f12507a = new ConcurrentHashMap();

    public static a b() {
        if (f12506c == null) {
            synchronized (f12505b) {
                if (f12506c == null) {
                    f12506c = new a();
                }
            }
        }
        a aVar = f12506c;
        o.h(aVar);
        return aVar;
    }

    @ResultIgnorabilityUnspecified
    public final boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i10) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i10, (Executor) null);
    }

    public final void c(Context context, ServiceConnection serviceConnection) {
        if (!(!(serviceConnection instanceof f1)) || !this.f12507a.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
            }
        } else {
            try {
                try {
                    context.unbindService((ServiceConnection) this.f12507a.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
                }
            } finally {
                this.f12507a.remove(serviceConnection);
            }
        }
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, @Nullable Executor executor) {
        boolean z9;
        ComponentName component = intent.getComponent();
        boolean z10 = false;
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((c.a(context).a(0, packageName).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        boolean z11 = true;
        if (!(serviceConnection instanceof f1)) {
            ServiceConnection serviceConnection2 = (ServiceConnection) this.f12507a.putIfAbsent(serviceConnection, serviceConnection);
            if (!(serviceConnection2 == null || serviceConnection == serviceConnection2)) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()}));
            }
            try {
                if (Build.VERSION.SDK_INT < 29) {
                    z11 = false;
                }
                if (!z11 || executor == null) {
                    z9 = context.bindService(intent, serviceConnection, i10);
                } else {
                    z9 = context.bindService(intent, i10, executor, serviceConnection);
                }
                if (z9) {
                    return z9;
                }
                this.f12507a.remove(serviceConnection, serviceConnection);
                return false;
            } catch (Throwable th) {
                this.f12507a.remove(serviceConnection, serviceConnection);
                throw th;
            }
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                z10 = true;
            }
            if (!z10 || executor == null) {
                return context.bindService(intent, serviceConnection, i10);
            }
            return context.bindService(intent, i10, executor, serviceConnection);
        }
    }
}
