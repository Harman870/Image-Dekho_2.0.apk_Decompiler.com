package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.utils.c;
import java.util.Timer;
import java.util.TimerTask;

public final class R {

    /* renamed from: a  reason: collision with root package name */
    public c f4051a;

    /* renamed from: b  reason: collision with root package name */
    public S f4052b;

    /* renamed from: c  reason: collision with root package name */
    public Timer f4053c = null;

    public class a extends TimerTask {
        public a() {
        }

        public final void run() {
            R.this.f4052b.d();
        }
    }

    public class b extends TimerTask {
        public b() {
        }

        public final void run() {
            R.this.f4052b.d();
        }
    }

    public R(c cVar, S s10) {
        this.f4051a = cVar;
        this.f4052b = s10;
    }

    public final synchronized void a() {
        Timer timer = this.f4053c;
        if (timer != null) {
            timer.cancel();
            this.f4053c = null;
        }
        Timer timer2 = new Timer();
        this.f4053c = timer2;
        timer2.schedule(new a(), this.f4051a.f4983i);
    }

    public final void b() {
        synchronized (this) {
            try {
                Timer timer = this.f4053c;
                if (timer != null) {
                    timer.cancel();
                    this.f4053c = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.f4052b.d();
    }

    public final synchronized void c() {
        Timer timer = this.f4053c;
        if (timer != null) {
            timer.cancel();
            this.f4053c = null;
        }
        Timer timer2 = new Timer();
        this.f4053c = timer2;
        timer2.schedule(new b(), this.f4051a.f4982h);
    }
}
