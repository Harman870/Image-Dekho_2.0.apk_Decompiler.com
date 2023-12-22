package n4;

import android.content.SharedPreferences;
import r3.o;

public final class r3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f10091a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10092b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10093c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f10094d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ w3 f10095e;

    public r3(w3 w3Var, String str, boolean z9) {
        this.f10095e = w3Var;
        o.e(str);
        this.f10091a = str;
        this.f10092b = z9;
    }

    public final void a(boolean z9) {
        SharedPreferences.Editor edit = this.f10095e.k().edit();
        edit.putBoolean(this.f10091a, z9);
        edit.apply();
        this.f10094d = z9;
    }

    public final boolean b() {
        if (!this.f10093c) {
            this.f10093c = true;
            this.f10094d = this.f10095e.k().getBoolean(this.f10091a, this.f10092b);
        }
        return this.f10094d;
    }
}
