package com.google.firebase;

import android.content.Context;
import android.os.Build;
import androidx.activity.e;
import androidx.fragment.app.v0;
import c7.d;
import c7.g;
import com.google.firebase.components.ComponentRegistrar;
import d3.j;
import j6.a;
import j6.k;
import j6.v;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import o8.b;
import s6.f;
import s6.h;
import s6.i;
import w2.u;

public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public final List<a<?>> getComponents() {
        String str;
        Class<g> cls = g.class;
        ArrayList arrayList = new ArrayList();
        a.C0105a<g> a10 = a.a(cls);
        a10.a(new k(2, 0, d.class));
        a10.f8729f = new v0();
        arrayList.add(a10.b());
        v vVar = new v(g6.a.class, Executor.class);
        a.C0105a aVar = new a.C0105a(f.class, new Class[]{h.class, i.class});
        aVar.a(k.a(Context.class));
        aVar.a(k.a(c6.f.class));
        aVar.a(new k(2, 0, s6.g.class));
        aVar.a(new k(1, 1, (Class) cls));
        aVar.a(new k((v<?>) vVar, 1, 0));
        aVar.f8729f = new s6.d(vVar);
        arrayList.add(aVar.b());
        arrayList.add(c7.f.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(c7.f.a("fire-core", "20.3.1"));
        arrayList.add(c7.f.a("device-name", a(Build.PRODUCT)));
        arrayList.add(c7.f.a("device-model", a(Build.DEVICE)));
        arrayList.add(c7.f.a("device-brand", a(Build.BRAND)));
        arrayList.add(c7.f.b("android-target-sdk", new j(2)));
        arrayList.add(c7.f.b("android-min-sdk", new u()));
        arrayList.add(c7.f.b("android-platform", new com.ironsource.adapters.ironsource.a()));
        arrayList.add(c7.f.b("android-installer", new e()));
        try {
            str = b.f10598e.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(c7.f.a("kotlin", str));
        }
        return arrayList;
    }
}
