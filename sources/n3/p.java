package n3;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import e2.c;
import g4.b;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import r3.o;
import v3.a;

public final class p implements ServiceConnection {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    public int f9555a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Messenger f9556b = new Messenger(new b(Looper.getMainLooper(), new j(this)));

    /* renamed from: c  reason: collision with root package name */
    public c f9557c;
    @GuardedBy("this")

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f9558d = new ArrayDeque();
    @GuardedBy("this")

    /* renamed from: e  reason: collision with root package name */
    public final SparseArray<r<?>> f9559e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ u f9560f;

    public /* synthetic */ p(u uVar) {
        this.f9560f = uVar;
    }

    public final synchronized void a(int i10, String str) {
        b(i10, str, (SecurityException) null);
    }

    public final synchronized void b(int i10, String str, SecurityException securityException) {
        String str2;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Disconnected: ".concat(valueOf);
            } else {
                str2 = new String("Disconnected: ");
            }
            Log.d("MessengerIpcClient", str2);
        }
        int i11 = this.f9555a;
        if (i11 == 0) {
            throw new IllegalStateException();
        } else if (i11 == 1 || i11 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f9555a = 4;
            a.b().c(this.f9560f.f9566a, this);
            s sVar = new s(str, securityException);
            Iterator it = this.f9558d.iterator();
            while (it.hasNext()) {
                ((r) it.next()).c(sVar);
            }
            this.f9558d.clear();
            for (int i12 = 0; i12 < this.f9559e.size(); i12++) {
                this.f9559e.valueAt(i12).c(sVar);
            }
            this.f9559e.clear();
        } else if (i11 == 3) {
            this.f9555a = 4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void c() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f9555a     // Catch:{ all -> 0x0037 }
            r1 = 2
            if (r0 != r1) goto L_0x0035
            java.util.ArrayDeque r0 = r2.f9558d     // Catch:{ all -> 0x0037 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0035
            android.util.SparseArray<n3.r<?>> r0 = r2.f9559e     // Catch:{ all -> 0x0037 }
            int r0 = r0.size()     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = "MessengerIpcClient"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = "MessengerIpcClient"
            java.lang.String r1 = "Finished handling requests, unbinding"
            android.util.Log.v(r0, r1)     // Catch:{ all -> 0x0037 }
        L_0x0025:
            r0 = 3
            r2.f9555a = r0     // Catch:{ all -> 0x0037 }
            v3.a r0 = v3.a.b()     // Catch:{ all -> 0x0037 }
            n3.u r1 = r2.f9560f     // Catch:{ all -> 0x0037 }
            android.content.Context r1 = r1.f9566a     // Catch:{ all -> 0x0037 }
            r0.c(r1, r2)     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)
            return
        L_0x0035:
            monitor-exit(r2)
            return
        L_0x0037:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.p.c():void");
    }

    public final synchronized boolean d(r<?> rVar) {
        boolean z9;
        int i10 = this.f9555a;
        if (i10 == 0) {
            this.f9558d.add(rVar);
            if (this.f9555a == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            o.k(z9);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f9555a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (!a.b().a(this.f9560f.f9566a, intent, this, 1)) {
                    a(0, "Unable to bind to service");
                } else {
                    this.f9560f.f9567b.schedule(new m(0, this), 30, TimeUnit.SECONDS);
                }
            } catch (SecurityException e10) {
                b(0, "Unable to bind to service", e10);
            }
        } else if (i10 == 1) {
            this.f9558d.add(rVar);
            return true;
        } else if (i10 != 2) {
            return false;
        } else {
            this.f9558d.add(rVar);
            this.f9560f.f9567b.execute(new l(this, 0));
            return true;
        }
        return true;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f9560f.f9567b.execute(new n(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f9560f.f9567b.execute(new k(0, this));
    }
}
