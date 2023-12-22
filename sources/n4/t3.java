package n4;

import android.content.SharedPreferences;
import r3.o;

public final class t3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f10130a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10131b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10132c;

    /* renamed from: d  reason: collision with root package name */
    public long f10133d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ w3 f10134e;

    public t3(w3 w3Var, String str, long j10) {
        this.f10134e = w3Var;
        o.e(str);
        this.f10130a = str;
        this.f10131b = j10;
    }

    public final long a() {
        if (!this.f10132c) {
            this.f10132c = true;
            this.f10133d = this.f10134e.k().getLong(this.f10130a, this.f10131b);
        }
        return this.f10133d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor edit = this.f10134e.k().edit();
        edit.putLong(this.f10130a, j10);
        edit.apply();
        this.f10133d = j10;
    }
}
