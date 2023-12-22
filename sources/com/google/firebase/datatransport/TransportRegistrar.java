package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.fragment.app.w0;
import c7.f;
import com.google.firebase.components.ComponentRegistrar;
import j6.a;
import j6.b;
import j6.k;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import t2.e;
import u2.a;
import w2.j;
import w2.l;
import w2.s;
import w2.t;
import w2.x;

@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* access modifiers changed from: private */
    public static e lambda$getComponents$0(b bVar) {
        Set<T> set;
        x.b((Context) bVar.a(Context.class));
        x a10 = x.a();
        a aVar = a.f12180e;
        a10.getClass();
        if (aVar instanceof l) {
            aVar.getClass();
            set = Collections.unmodifiableSet(a.f12179d);
        } else {
            set = Collections.singleton(new t2.b("proto"));
        }
        j.a a11 = s.a();
        aVar.getClass();
        a11.b("cct");
        a11.f12708b = aVar.b();
        return new t(set, a11.a(), a10);
    }

    public List<j6.a<?>> getComponents() {
        a.C0105a<e> a10 = j6.a.a(e.class);
        a10.f8724a = LIBRARY_NAME;
        a10.a(k.a(Context.class));
        a10.f8729f = new w0();
        return Arrays.asList(new j6.a[]{a10.b(), f.a(LIBRARY_NAME, "18.1.7")});
    }
}
