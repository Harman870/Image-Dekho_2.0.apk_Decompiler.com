package n4;

import android.content.SharedPreferences;
import r3.o;

public final class u3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f10153a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10154b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10155c;

    /* renamed from: d  reason: collision with root package name */
    public final long f10156d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ w3 f10157e;

    public /* synthetic */ u3(w3 w3Var, long j10) {
        this.f10157e = w3Var;
        o.e("health_monitor");
        o.b(j10 > 0);
        this.f10153a = "health_monitor:start";
        this.f10154b = "health_monitor:count";
        this.f10155c = "health_monitor:value";
        this.f10156d = j10;
    }

    public final void a() {
        this.f10157e.g();
        this.f10157e.f9600a.f9998n.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = this.f10157e.k().edit();
        edit.remove(this.f10154b);
        edit.remove(this.f10155c);
        edit.putLong(this.f10153a, currentTimeMillis);
        edit.apply();
    }
}
