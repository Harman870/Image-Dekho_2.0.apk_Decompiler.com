package com.ironsource.lifecycle;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public final class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public Timer f3814a;

    /* renamed from: b  reason: collision with root package name */
    public Long f3815b = null;

    /* renamed from: c  reason: collision with root package name */
    public long f3816c;

    /* renamed from: d  reason: collision with root package name */
    public Runnable f3817d;

    public class a extends TimerTask {
        public a() {
        }

        public final void run() {
            f.this.f3817d.run();
        }
    }

    public f(long j10, Runnable runnable, boolean z9) {
        this.f3816c = j10;
        this.f3817d = runnable;
        d.a().a(this);
        this.f3815b = Long.valueOf(System.currentTimeMillis() + this.f3816c);
        if (!d.a().b()) {
            d();
        }
    }

    public final void a() {
        Long l6;
        if (this.f3814a == null && (l6 = this.f3815b) != null) {
            long longValue = l6.longValue() - System.currentTimeMillis();
            this.f3816c = longValue;
            if (longValue <= 0) {
                c();
                this.f3817d.run();
                return;
            }
            d();
        }
    }

    public final void b() {
        Timer timer = this.f3814a;
        if (timer != null && timer != null) {
            timer.cancel();
            this.f3814a = null;
        }
    }

    public final void c() {
        Timer timer = this.f3814a;
        if (timer != null) {
            timer.cancel();
            this.f3814a = null;
        }
        this.f3815b = null;
        d.a().b(this);
    }

    public final void d() {
        if (this.f3814a == null) {
            Timer timer = new Timer();
            this.f3814a = timer;
            timer.schedule(new a(), this.f3816c);
            Calendar.getInstance().setTimeInMillis(this.f3815b.longValue());
        }
    }
}
