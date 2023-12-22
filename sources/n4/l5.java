package n4;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

public final class l5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a6 f9918a;

    public l5(a6 a6Var) {
        this.f9918a = a6Var;
    }

    public final void run() {
        String str;
        i8 i8Var = this.f9918a.f9609l;
        i8Var.f9854a.d().g();
        if (i8Var.b()) {
            if (i8Var.c()) {
                i8Var.f9854a.r().u.b((String) null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                i8Var.f9854a.t().n("auto", "_cmpx", bundle);
            } else {
                String a10 = i8Var.f9854a.r().u.a();
                if (TextUtils.isEmpty(a10)) {
                    i8Var.f9854a.a().f9829g.a("Cache still valid but referrer not found");
                } else {
                    long a11 = i8Var.f9854a.r().f10270v.a() / 3600000;
                    Uri parse = Uri.parse(a10);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String next : parse.getQueryParameterNames()) {
                        bundle2.putString(next, parse.getQueryParameter(next));
                    }
                    ((Bundle) pair.second).putLong("_cc", (a11 - 1) * 3600000);
                    Object obj = pair.first;
                    if (obj == null) {
                        str = "app";
                    } else {
                        str = (String) obj;
                    }
                    i8Var.f9854a.t().n(str, "_cmp", (Bundle) pair.second);
                }
                i8Var.f9854a.r().u.b((String) null);
            }
            i8Var.f9854a.r().f10270v.b(0);
        }
    }
}
