package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.lifecycle.d;
import com.ironsource.mediationsdk.C0189n;
import com.ironsource.mediationsdk.S;
import com.ironsource.mediationsdk.adunit.c.c.a;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Timer;
import java.util.TimerTask;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final com.ironsource.mediationsdk.adunit.c.c.a f4175a;

    /* renamed from: b  reason: collision with root package name */
    public final S f4176b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ironsource.lifecycle.a.a f4177c = new com.ironsource.lifecycle.a.a(new C0046a(), d.a(), new C0189n());

    /* renamed from: d  reason: collision with root package name */
    public Timer f4178d;

    /* renamed from: com.ironsource.mediationsdk.adunit.c.a$a  reason: collision with other inner class name */
    public class C0046a implements Runnable {
        public C0046a() {
        }

        public final void run() {
            a.this.f4176b.d();
        }
    }

    public class b extends TimerTask {
        public b() {
        }

        public final void run() {
            a.this.f4176b.d();
        }
    }

    public a(com.ironsource.mediationsdk.adunit.c.c.a aVar, S s10) {
        this.f4175a = aVar;
        this.f4176b = s10;
    }

    public final void a() {
        if (this.f4175a.b()) {
            IronLog.INTERNAL.verbose();
            b(0);
        }
    }

    public final void b() {
        com.ironsource.mediationsdk.adunit.c.c.a aVar = this.f4175a;
        if (aVar.f4208a == a.C0048a.MANUAL_WITH_AUTOMATIC_RELOAD && aVar.f4211d > 0) {
            IronLog.INTERNAL.verbose();
            this.f4177c.a(this.f4175a.f4211d);
        }
    }

    public final void b(long j10) {
        Timer timer = this.f4178d;
        if (timer != null) {
            timer.cancel();
            this.f4178d = null;
        }
        Timer timer2 = new Timer();
        this.f4178d = timer2;
        timer2.schedule(new b(), j10);
    }
}
