package androidx.savedstate;

import android.os.Bundle;
import androidx.fragment.app.w0;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import com.ironsource.adapters.ironsource.a;
import d1.b;
import d1.d;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import x8.f;

public final class Recreator implements j {

    /* renamed from: a  reason: collision with root package name */
    public final d f2153a;

    public Recreator(d dVar) {
        f.f(dVar, "owner");
        this.f2153a = dVar;
    }

    public final void b(l lVar, g.b bVar) {
        if (bVar == g.b.ON_CREATE) {
            lVar.r().c(this);
            Bundle a10 = this.f2153a.c().a("androidx.savedstate.Restarter");
            if (a10 != null) {
                ArrayList<String> stringArrayList = a10.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String next : stringArrayList) {
                        try {
                            Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(b.a.class);
                            f.e(asSubclass, "{\n                Class.…class.java)\n            }");
                            try {
                                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                    f.e(newInstance, "{\n                constr…wInstance()\n            }");
                                    ((b.a) newInstance).a(this.f2153a);
                                } catch (Exception e10) {
                                    throw new RuntimeException(a.g("Failed to instantiate ", next), e10);
                                }
                            } catch (NoSuchMethodException e11) {
                                StringBuilder g10 = androidx.activity.f.g("Class ");
                                g10.append(asSubclass.getSimpleName());
                                g10.append(" must have default constructor in order to be automatically recreated");
                                throw new IllegalStateException(g10.toString(), e11);
                            }
                        } catch (ClassNotFoundException e12) {
                            throw new RuntimeException(w0.d("Class ", next, " wasn't found"), e12);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
