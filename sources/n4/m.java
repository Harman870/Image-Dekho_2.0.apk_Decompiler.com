package n4;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.activity.e;
import java.util.Iterator;
import r3.o;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f9935a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9936b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9937c;

    /* renamed from: d  reason: collision with root package name */
    public final long f9938d;

    /* renamed from: e  reason: collision with root package name */
    public final long f9939e;

    /* renamed from: f  reason: collision with root package name */
    public final p f9940f;

    public m(n4 n4Var, String str, String str2, String str3, long j10, long j11, p pVar) {
        o.e(str2);
        o.e(str3);
        o.h(pVar);
        this.f9935a = str2;
        this.f9936b = str3;
        this.f9937c = true == TextUtils.isEmpty(str) ? null : str;
        this.f9938d = j10;
        this.f9939e = j11;
        if (j11 != 0 && j11 > j10) {
            n4Var.a().f9831i.c("Event created with reverse previous/current timestamps. appId, name", i3.p(str2), i3.p(str3));
        }
        this.f9940f = pVar;
    }

    public final m a(n4 n4Var, long j10) {
        return new m(n4Var, this.f9937c, this.f9935a, this.f9936b, this.f9938d, j10, this.f9940f);
    }

    public final String toString() {
        String str = this.f9935a;
        String str2 = this.f9936b;
        String pVar = this.f9940f.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        return e.c(sb, pVar, "}");
    }

    public m(n4 n4Var, String str, String str2, String str3, long j10, Bundle bundle) {
        p pVar;
        o.e(str2);
        o.e(str3);
        this.f9935a = str2;
        this.f9936b = str3;
        this.f9937c = true == TextUtils.isEmpty(str) ? null : str;
        this.f9938d = j10;
        this.f9939e = 0;
        if (!bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    n4Var.a().f9828f.a("Param name can't be null");
                } else {
                    Object k = n4Var.x().k(bundle2.get(next), next);
                    if (k == null) {
                        n4Var.a().f9831i.b("Param value can't be null", n4Var.f9997m.e(next));
                    } else {
                        n4Var.x().y(bundle2, next, k);
                    }
                }
                it.remove();
            }
            pVar = new p(bundle2);
        } else {
            pVar = new p(new Bundle());
        }
        this.f9940f = pVar;
    }
}
