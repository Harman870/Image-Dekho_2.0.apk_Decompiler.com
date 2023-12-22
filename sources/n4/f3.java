package n4;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import androidx.activity.e;
import com.ironsource.mediationsdk.logger.IronSourceError;
import w3.h;

public final class f3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9736a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f9737b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f9738c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f9739d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f9740e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ i3 f9741f;

    public f3(i3 i3Var, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f9741f = i3Var;
        this.f9736a = i10;
        this.f9737b = str;
        this.f9738c = obj;
        this.f9739d = obj2;
        this.f9740e = obj3;
    }

    public final void run() {
        char c10;
        i3 i3Var;
        boolean z9;
        w3 r4 = this.f9741f.f9600a.r();
        if (r4.f9629b) {
            i3 i3Var2 = this.f9741f;
            if (i3Var2.f9825c == 0) {
                f fVar = i3Var2.f9600a.f9992g;
                if (fVar.f9732d == null) {
                    synchronized (fVar) {
                        if (fVar.f9732d == null) {
                            ApplicationInfo applicationInfo = fVar.f9600a.f9986a.getApplicationInfo();
                            String a10 = h.a();
                            if (applicationInfo != null) {
                                String str = applicationInfo.processName;
                                if (str == null || !str.equals(a10)) {
                                    z9 = false;
                                } else {
                                    z9 = true;
                                }
                                fVar.f9732d = Boolean.valueOf(z9);
                            }
                            if (fVar.f9732d == null) {
                                fVar.f9732d = Boolean.TRUE;
                                fVar.f9600a.a().f9828f.a("My process not in the list of running processes");
                            }
                        }
                    }
                }
                if (fVar.f9732d.booleanValue()) {
                    i3Var = this.f9741f;
                    i3Var.f9600a.getClass();
                    c10 = 'C';
                } else {
                    i3Var = this.f9741f;
                    i3Var.f9600a.getClass();
                    c10 = 'c';
                }
                i3Var.f9825c = c10;
            }
            i3 i3Var3 = this.f9741f;
            if (i3Var3.f9826d < 0) {
                i3Var3.f9600a.f9992g.k();
                i3Var3.f9826d = 79000;
            }
            char charAt = "01VDIWEA?".charAt(this.f9736a);
            i3 i3Var4 = this.f9741f;
            char c11 = i3Var4.f9825c;
            long j10 = i3Var4.f9826d;
            String q10 = i3.q(true, this.f9737b, this.f9738c, this.f9739d, this.f9740e);
            StringBuilder sb = new StringBuilder();
            sb.append("2");
            sb.append(charAt);
            sb.append(c11);
            sb.append(j10);
            String c12 = e.c(sb, ":", q10);
            if (c12.length() > 1024) {
                c12 = this.f9737b.substring(0, IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
            }
            u3 u3Var = r4.f10254d;
            if (u3Var != null) {
                u3Var.f10157e.g();
                if (u3Var.f10157e.k().getLong(u3Var.f10153a, 0) == 0) {
                    u3Var.a();
                }
                if (c12 == null) {
                    c12 = "";
                }
                long j11 = u3Var.f10157e.k().getLong(u3Var.f10154b, 0);
                if (j11 <= 0) {
                    SharedPreferences.Editor edit = u3Var.f10157e.k().edit();
                    edit.putString(u3Var.f10155c, c12);
                    edit.putLong(u3Var.f10154b, 1);
                    edit.apply();
                    return;
                }
                long j12 = j11 + 1;
                SharedPreferences.Editor edit2 = u3Var.f10157e.k().edit();
                if ((u3Var.f10157e.f9600a.x().p().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j12) {
                    edit2.putString(u3Var.f10155c, c12);
                }
                edit2.putLong(u3Var.f10154b, j12);
                edit2.apply();
                return;
            }
            return;
        }
        Log.println(6, this.f9741f.t(), "Persisted config not initialized. Not logging error/warn");
    }
}
