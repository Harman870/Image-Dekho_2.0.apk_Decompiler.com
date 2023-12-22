package d1;

import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.m;
import androidx.savedstate.Recreator;
import d1.b;
import j.b;
import java.util.Map;
import x8.f;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final d f6041a;

    /* renamed from: b  reason: collision with root package name */
    public final b f6042b = new b();

    /* renamed from: c  reason: collision with root package name */
    public boolean f6043c;

    public c(d dVar) {
        this.f6041a = dVar;
    }

    public final void a() {
        boolean z9;
        m r4 = this.f6041a.r();
        f.e(r4, "owner.lifecycle");
        if (r4.f1744b == g.c.INITIALIZED) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            r4.a(new Recreator(this.f6041a));
            b bVar = this.f6042b;
            bVar.getClass();
            if (!bVar.f6038b) {
                r4.a(new a(bVar));
                bVar.f6038b = true;
                this.f6043c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void b(Bundle bundle) {
        Bundle bundle2;
        if (!this.f6043c) {
            a();
        }
        m r4 = this.f6041a.r();
        f.e(r4, "owner.lifecycle");
        if (!r4.f1744b.a(g.c.STARTED)) {
            b bVar = this.f6042b;
            if (!bVar.f6038b) {
                throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
            } else if (!bVar.f6040d) {
                if (bundle != null) {
                    bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                } else {
                    bundle2 = null;
                }
                bVar.f6039c = bundle2;
                bVar.f6040d = true;
            } else {
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
        } else {
            StringBuilder g10 = androidx.activity.f.g("performRestore cannot be called when owner is ");
            g10.append(r4.f1744b);
            throw new IllegalStateException(g10.toString().toString());
        }
    }

    public final void c(Bundle bundle) {
        f.f(bundle, "outBundle");
        b bVar = this.f6042b;
        bVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = bVar.f6039c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        b<String, b.C0076b> bVar2 = bVar.f6037a;
        bVar2.getClass();
        b.d dVar = new b.d();
        bVar2.f7989c.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((b.C0076b) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
}
