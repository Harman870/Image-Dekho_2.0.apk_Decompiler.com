package e1;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.imgdkh.app.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static volatile a f6164d;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f6165e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f6166a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f6167b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public final Context f6168c;

    public a(Context context) {
        this.f6168c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f6164d == null) {
            synchronized (f6165e) {
                if (f6164d == null) {
                    f6164d = new a(context);
                }
            }
        }
        return f6164d;
    }

    public final void a(Bundle bundle) {
        String string = this.f6168c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String next : bundle.keySet()) {
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            this.f6167b.add(cls);
                        }
                    }
                }
                Iterator it = this.f6167b.iterator();
                while (it.hasNext()) {
                    b((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new c((Throwable) e10);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (f1.a.a()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!hashSet.contains(cls)) {
            if (!this.f6166a.containsKey(cls)) {
                hashSet.add(cls);
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends b<?>>> a10 = bVar.a();
                if (!a10.isEmpty()) {
                    for (Class next : a10) {
                        if (!this.f6166a.containsKey(next)) {
                            b(next, hashSet);
                        }
                    }
                }
                obj = bVar.b(this.f6168c);
                hashSet.remove(cls);
                this.f6166a.put(cls, obj);
            } else {
                obj = this.f6166a.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }
}
