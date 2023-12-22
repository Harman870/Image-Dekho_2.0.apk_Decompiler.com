package com.iab.omid.library.ironsrc;

import android.content.Context;
import com.iab.omid.library.ironsrc.internal.f;
import com.iab.omid.library.ironsrc.internal.h;
import com.iab.omid.library.ironsrc.utils.a;
import com.iab.omid.library.ironsrc.utils.c;
import com.iab.omid.library.ironsrc.utils.e;
import com.iab.omid.library.ironsrc.utils.g;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f3525a;

    private void b(Context context) {
        g.a((Object) context, "Application Context cannot be null");
    }

    public String a() {
        return "1.4.2-Ironsrc";
    }

    public void a(Context context) {
        b(context);
        if (!b()) {
            a(true);
            h.c().a(context);
            com.iab.omid.library.ironsrc.internal.b.g().a(context);
            a.a(context);
            c.a(context);
            e.a(context);
            f.b().a(context);
            com.iab.omid.library.ironsrc.internal.a.a().a(context);
        }
    }

    public void a(boolean z9) {
        this.f3525a = z9;
    }

    public boolean b() {
        return this.f3525a;
    }

    public void c() {
        g.a();
        com.iab.omid.library.ironsrc.internal.a.a().d();
    }
}
