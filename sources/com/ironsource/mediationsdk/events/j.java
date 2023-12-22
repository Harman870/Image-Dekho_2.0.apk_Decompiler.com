package com.ironsource.mediationsdk.events;

import android.os.Handler;
import android.os.HandlerThread;
import com.ironsource.mediationsdk.logger.c;

public final class j extends Thread {

    /* renamed from: b  reason: collision with root package name */
    public static j f4554b;

    /* renamed from: a  reason: collision with root package name */
    public a f4555a;

    public class a extends HandlerThread {

        /* renamed from: a  reason: collision with root package name */
        public Handler f4556a;

        public a() {
            super("j");
            setUncaughtExceptionHandler(new c());
        }
    }

    private j() {
        Class<j> cls = j.class;
        a aVar = new a();
        this.f4555a = aVar;
        aVar.start();
        a aVar2 = this.f4555a;
        aVar2.f4556a = new Handler(aVar2.getLooper());
    }

    public static synchronized j a() {
        j jVar;
        synchronized (j.class) {
            if (f4554b == null) {
                f4554b = new j();
            }
            jVar = f4554b;
        }
        return jVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.Runnable r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.ironsource.mediationsdk.events.j$a r0 = r1.f4555a     // Catch:{ all -> 0x0010 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            android.os.Handler r0 = r0.f4556a     // Catch:{ all -> 0x0010 }
            if (r0 == 0) goto L_0x000e
            r0.post(r2)     // Catch:{ all -> 0x0010 }
        L_0x000e:
            monitor-exit(r1)
            return
        L_0x0010:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.events.j.a(java.lang.Runnable):void");
    }
}
