package n4;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

public final class i8 {

    /* renamed from: a  reason: collision with root package name */
    public final n4 f9854a;

    public i8(n4 n4Var) {
        this.f9854a = n4Var;
    }

    public final void a(String str, Bundle bundle) {
        String str2;
        this.f9854a.d().g();
        if (!this.f9854a.g()) {
            if (bundle.isEmpty()) {
                str2 = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String next : bundle.keySet()) {
                    builder.appendQueryParameter(next, bundle.getString(next));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f9854a.r().u.b(str2);
                t3 t3Var = this.f9854a.r().f10270v;
                this.f9854a.f9998n.getClass();
                t3Var.b(System.currentTimeMillis());
            }
        }
    }

    public final boolean b() {
        return this.f9854a.r().f10270v.a() > 0;
    }

    public final boolean c() {
        if (!b()) {
            return false;
        }
        this.f9854a.f9998n.getClass();
        if (System.currentTimeMillis() - this.f9854a.r().f10270v.a() > this.f9854a.f9992g.l((String) null, w2.S)) {
            return true;
        }
        return false;
    }
}
