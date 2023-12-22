package n4;

import android.content.SharedPreferences;
import r3.o;

public final class v3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f10182a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10183b;

    /* renamed from: c  reason: collision with root package name */
    public String f10184c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ w3 f10185d;

    public v3(w3 w3Var, String str) {
        this.f10185d = w3Var;
        o.e(str);
        this.f10182a = str;
    }

    public final String a() {
        if (!this.f10183b) {
            this.f10183b = true;
            this.f10184c = this.f10185d.k().getString(this.f10182a, (String) null);
        }
        return this.f10184c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f10185d.k().edit();
        edit.putString(this.f10182a, str);
        edit.apply();
        this.f10184c = str;
    }
}
