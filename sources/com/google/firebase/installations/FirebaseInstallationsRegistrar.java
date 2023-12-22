package com.google.firebase.installations;

import androidx.annotation.Keep;
import androidx.lifecycle.c0;
import com.google.firebase.components.ComponentRegistrar;
import g6.a;
import j6.a;
import j6.b;
import j6.k;
import j6.v;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import k6.p;
import k6.s;
import s6.g;
import s6.h;
import v6.e;
import v6.f;

@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* access modifiers changed from: private */
    public static f lambda$getComponents$0(b bVar) {
        return new e((c6.f) bVar.a(c6.f.class), bVar.d(h.class), (ExecutorService) bVar.c(new v(a.class, ExecutorService.class)), new s((Executor) bVar.c(new v(g6.b.class, Executor.class))));
    }

    public List<j6.a<?>> getComponents() {
        a.C0105a<f> a10 = j6.a.a(f.class);
        a10.f8724a = LIBRARY_NAME;
        a10.a(k.a(c6.f.class));
        a10.a(new k(0, 1, h.class));
        a10.a(new k((v<?>) new v(g6.a.class, ExecutorService.class), 1, 0));
        a10.a(new k((v<?>) new v(g6.b.class, Executor.class), 1, 0));
        a10.f8729f = new p(1);
        c0 c0Var = new c0();
        a.C0105a<g> a11 = j6.a.a(g.class);
        a11.f8728e = 1;
        a11.f8729f = new d3.k(c0Var);
        return Arrays.asList(new j6.a[]{a10.b(), a11.b(), c7.f.a(LIBRARY_NAME, "17.1.3")});
    }
}
