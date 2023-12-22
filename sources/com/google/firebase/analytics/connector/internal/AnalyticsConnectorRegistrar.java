package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import c6.f;
import com.google.firebase.components.ComponentRegistrar;
import e6.a;
import e6.c;
import j4.c2;
import j6.a;
import j6.b;
import j6.k;
import java.util.Arrays;
import java.util.List;
import r3.o;
import r6.d;

@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static a lambda$getComponents$0(b bVar) {
        boolean z9;
        f fVar = (f) bVar.a(f.class);
        Context context = (Context) bVar.a(Context.class);
        d dVar = (d) bVar.a(d.class);
        o.h(fVar);
        o.h(context);
        o.h(dVar);
        o.h(context.getApplicationContext());
        if (e6.b.f6194b == null) {
            synchronized (e6.b.class) {
                if (e6.b.f6194b == null) {
                    Bundle bundle = new Bundle(1);
                    fVar.a();
                    if ("[DEFAULT]".equals(fVar.f2495b)) {
                        dVar.b(c.f6196a, e6.d.f6197a);
                        fVar.a();
                        z6.a aVar = fVar.f2500g.get();
                        synchronized (aVar) {
                            z9 = aVar.f13229b;
                        }
                        bundle.putBoolean("dataCollectionDefaultEnabled", z9);
                    }
                    e6.b.f6194b = new e6.b(c2.c(context, bundle).f8076d);
                }
            }
        }
        return e6.b.f6194b;
    }

    @SuppressLint({"MissingPermission"})
    @Keep
    public List<j6.a<?>> getComponents() {
        a.C0105a<e6.a> a10 = j6.a.a(e6.a.class);
        a10.a(k.a(f.class));
        a10.a(k.a(Context.class));
        a10.a(k.a(d.class));
        a10.f8729f = z5.c.f13179c;
        a10.c(2);
        return Arrays.asList(new j6.a[]{a10.b(), c7.f.a("fire-analytics", "21.3.0")});
    }
}
