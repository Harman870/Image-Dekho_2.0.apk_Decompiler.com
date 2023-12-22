package com.ironsource.lifecycle.a;

import android.util.Log;
import com.ironsource.lifecycle.c;
import com.ironsource.lifecycle.d;
import com.ironsource.mediationsdk.C0189n;
import java.util.Timer;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final d f3785a;

    /* renamed from: b  reason: collision with root package name */
    public final Runnable f3786b;

    /* renamed from: c  reason: collision with root package name */
    public final C0189n f3787c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f3788d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public Timer f3789e;

    /* renamed from: f  reason: collision with root package name */
    public final C0043a f3790f = new C0043a();

    /* renamed from: com.ironsource.lifecycle.a.a$a  reason: collision with other inner class name */
    public class C0043a implements c {
        public C0043a() {
        }

        public final void a() {
            a.this.f3787c.c(System.currentTimeMillis());
            a aVar = a.this;
            long b10 = aVar.f3787c.b();
            synchronized (aVar.f3788d) {
                aVar.b();
                Timer timer = new Timer();
                aVar.f3789e = timer;
                timer.schedule(new q7.a(aVar), b10);
            }
        }

        public final void b() {
            a.this.f3787c.b(System.currentTimeMillis());
            a.this.b();
        }
    }

    public a(Runnable runnable, d dVar, C0189n nVar) {
        this.f3786b = runnable;
        this.f3785a = dVar;
        this.f3787c = nVar;
    }

    public final void a() {
        b();
        this.f3785a.b(this.f3790f);
        this.f3787c.c();
    }

    public final void a(long j10) {
        if (j10 < 0) {
            Log.d("a", "cannot start timer with delay < 0");
            return;
        }
        this.f3785a.a(this.f3790f);
        this.f3787c.a(j10);
        if (this.f3785a.b()) {
            this.f3787c.b(System.currentTimeMillis());
            return;
        }
        synchronized (this.f3788d) {
            b();
            Timer timer = new Timer();
            this.f3789e = timer;
            timer.schedule(new q7.a(this), j10);
        }
    }

    public final void b() {
        synchronized (this.f3788d) {
            Timer timer = this.f3789e;
            if (timer != null) {
                timer.cancel();
                this.f3789e = null;
            }
        }
    }
}
