package com.google.firebase.messaging;

import androidx.annotation.Keep;
import c6.f;
import c7.g;
import com.google.firebase.components.ComponentRegistrar;
import j6.a;
import j6.b;
import j6.k;
import java.util.Arrays;
import java.util.List;
import k6.q;
import r6.d;
import s6.i;
import t2.e;
import t6.a;

@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(b bVar) {
        return new FirebaseMessaging((f) bVar.a(f.class), (a) bVar.a(a.class), bVar.d(g.class), bVar.d(i.class), (v6.f) bVar.a(v6.f.class), (e) bVar.a(e.class), (d) bVar.a(d.class));
    }

    @Keep
    public List<j6.a<?>> getComponents() {
        a.C0105a<FirebaseMessaging> a10 = j6.a.a(FirebaseMessaging.class);
        a10.f8724a = LIBRARY_NAME;
        a10.a(k.a(f.class));
        a10.a(new k(0, 0, t6.a.class));
        a10.a(new k(0, 1, g.class));
        a10.a(new k(0, 1, i.class));
        a10.a(new k(0, 0, e.class));
        a10.a(k.a(v6.f.class));
        a10.a(k.a(d.class));
        a10.f8729f = new q(1);
        a10.c(1);
        return Arrays.asList(new j6.a[]{a10.b(), c7.f.a(LIBRARY_NAME, "23.1.2")});
    }
}
