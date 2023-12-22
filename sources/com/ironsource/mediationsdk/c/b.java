package com.ironsource.mediationsdk.c;

import java.util.Timer;

public final class b extends a<a> {

    public interface a {
        void b();
    }

    public b(long j10) {
        super(j10);
    }

    public final void a() {
        T t10 = this.f4344c;
        if (t10 != null) {
            ((a) t10).b();
        }
    }

    public final void a(a aVar) {
        boolean z9;
        if (this.f4343b <= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 && aVar != null) {
            this.f4344c = aVar;
            Timer timer = this.f4342a;
            if (timer != null) {
                timer.cancel();
                this.f4342a = null;
            }
            Timer timer2 = new Timer();
            this.f4342a = timer2;
            timer2.schedule(new v7.a(this), this.f4343b);
        }
    }

    public final void d() {
        Timer timer = this.f4342a;
        if (timer != null) {
            timer.cancel();
            this.f4342a = null;
        }
    }
}
