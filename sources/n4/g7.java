package n4;

import android.content.Context;
import android.content.Intent;
import j4.d1;
import r3.o;

public final class g7 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9767a;

    public g7(Context context) {
        o.h(context);
        this.f9767a = context;
    }

    public final void a(Intent intent) {
        if (intent == null) {
            c().f9828f.a("onRebind called with null intent");
            return;
        }
        c().f9835n.b("onRebind called. action", intent.getAction());
    }

    public final void b(Intent intent) {
        if (intent == null) {
            c().f9828f.a("onUnbind called with null intent");
            return;
        }
        c().f9835n.b("onUnbind called for intent. action", intent.getAction());
    }

    public final i3 c() {
        return n4.s(this.f9767a, (d1) null, (Long) null).a();
    }
}
