package n4;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import j4.pa;
import j4.qa;
import j4.tc;

public final class k7 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l7 f9895a;

    public k7(l7 l7Var) {
        this.f9895a = l7Var;
    }

    public final void a() {
        this.f9895a.g();
        w3 r4 = this.f9895a.f9600a.r();
        this.f9895a.f9600a.f9998n.getClass();
        if (r4.q(System.currentTimeMillis())) {
            this.f9895a.f9600a.r().k.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f9895a.f9600a.a().f9835n.a("Detected application was in foreground");
                this.f9895a.f9600a.f9998n.getClass();
                c(System.currentTimeMillis(), false);
            }
        }
    }

    public final void b(long j10, boolean z9) {
        this.f9895a.g();
        this.f9895a.k();
        if (this.f9895a.f9600a.r().q(j10)) {
            this.f9895a.f9600a.r().k.a(true);
            tc.b();
            if (this.f9895a.f9600a.f9992g.o((String) null, w2.f10224j0)) {
                this.f9895a.f9600a.o().n();
            }
        }
        this.f9895a.f9600a.r().f10263n.b(j10);
        if (this.f9895a.f9600a.r().k.b()) {
            c(j10, z9);
        }
    }

    public final void c(long j10, boolean z9) {
        this.f9895a.g();
        if (this.f9895a.f9600a.g()) {
            this.f9895a.f9600a.r().f10263n.b(j10);
            this.f9895a.f9600a.f9998n.getClass();
            this.f9895a.f9600a.a().f9835n.b("Session started, time", Long.valueOf(SystemClock.elapsedRealtime()));
            Long valueOf = Long.valueOf(j10 / 1000);
            this.f9895a.f9600a.t().y(j10, valueOf, "auto", "_sid");
            this.f9895a.f9600a.r().f10264o.b(valueOf.longValue());
            this.f9895a.f9600a.r().k.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f9895a.f9600a.f9992g.o((String) null, w2.f10206a0) && z9) {
                bundle.putLong("_aib", 1);
            }
            this.f9895a.f9600a.t().o("auto", "_s", bundle, j10);
            ((qa) pa.f8389b.f8390a.zza()).zza();
            if (this.f9895a.f9600a.f9992g.o((String) null, w2.f10212d0)) {
                String a10 = this.f9895a.f9600a.r().f10269t.a();
                if (!TextUtils.isEmpty(a10)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a10);
                    this.f9895a.f9600a.t().o("auto", "_ssr", bundle2, j10);
                }
            }
        }
    }
}
