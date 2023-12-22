package com.ironsource.mediationsdk;

import com.ironsource.lifecycle.f;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.mediationsdk.r  reason: case insensitive filesystem */
public final class C0193r {

    /* renamed from: a  reason: collision with root package name */
    public c f4829a = new c();

    /* renamed from: b  reason: collision with root package name */
    public int f4830b;

    /* renamed from: c  reason: collision with root package name */
    public C0179b f4831c;

    /* renamed from: d  reason: collision with root package name */
    public f f4832d;

    /* renamed from: com.ironsource.mediationsdk.r$c */
    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            IronLog.INTERNAL.verbose("loaded ads are expired");
            C0179b bVar = C0193r.this.f4831c;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public C0193r(int i10, C0179b bVar) {
        this.f4831c = bVar;
        this.f4830b = i10;
    }

    public final void a() {
        if ((this.f4830b > 0) && this.f4832d != null) {
            IronLog.INTERNAL.verbose("canceling expiration timer");
            this.f4832d.c();
            this.f4832d = null;
        }
    }

    public final void a(long j10) {
        if (this.f4830b > 0) {
            long millis = TimeUnit.MINUTES.toMillis((long) this.f4830b) - Math.max(0, 0);
            if (millis > 0) {
                a();
                this.f4832d = new f(millis, this.f4829a, true);
                Calendar instance = Calendar.getInstance();
                instance.add(14, (int) millis);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("loaded ads will expire on: " + instance.getTime() + " in " + String.format("%.2f", new Object[]{Double.valueOf((((double) millis) / 1000.0d) / 60.0d)}) + " minutes");
                return;
            }
            IronLog.INTERNAL.verbose("no delay - onAdExpired called");
            this.f4831c.a();
        }
    }
}
