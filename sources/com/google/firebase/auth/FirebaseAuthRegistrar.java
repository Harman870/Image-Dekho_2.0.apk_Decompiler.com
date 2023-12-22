package com.google.firebase.auth;

import androidx.annotation.Keep;
import androidx.lifecycle.c0;
import c6.f;
import com.google.firebase.components.ComponentRegistrar;
import i6.g0;
import j6.a;
import j6.b;
import j6.k;
import java.util.Arrays;
import java.util.List;
import s6.g;
import s6.h;

@Keep
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static /* synthetic */ FirebaseAuth lambda$getComponents$0(b bVar) {
        return new g0((f) bVar.a(f.class), bVar.d(h.class));
    }

    @Keep
    public List<a<?>> getComponents() {
        a.C0105a aVar = new a.C0105a(FirebaseAuth.class, new Class[]{i6.b.class});
        aVar.a(k.a(f.class));
        aVar.a(new k(1, 1, h.class));
        aVar.f8729f = c6.b.f2474f;
        aVar.c(2);
        c0 c0Var = new c0();
        a.C0105a<g> a10 = a.a(g.class);
        a10.f8728e = 1;
        a10.f8729f = new d3.k(c0Var);
        return Arrays.asList(new a[]{aVar.b(), a10.b(), c7.f.a("fire-auth", "21.1.0")});
    }
}
