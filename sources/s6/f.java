package s6;

import android.content.Context;
import c7.g;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import d0.j;
import java.util.Set;
import java.util.concurrent.Executor;
import u6.a;

public final class f implements h, i {

    /* renamed from: a  reason: collision with root package name */
    public final a<j> f11889a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f11890b;

    /* renamed from: c  reason: collision with root package name */
    public final a<g> f11891c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<g> f11892d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f11893e;

    public f() {
        throw null;
    }

    public f(Context context, String str, Set<g> set, a<g> aVar, Executor executor) {
        this.f11889a = new e(context, str);
        this.f11892d = set;
        this.f11893e = executor;
        this.f11891c = aVar;
        this.f11890b = context;
    }

    public final Task<String> a() {
        if (!j.a(this.f11890b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f11893e, new b(0, this));
    }

    public final synchronized int b() {
        boolean g10;
        long currentTimeMillis = System.currentTimeMillis();
        j jVar = this.f11889a.get();
        synchronized (jVar) {
            g10 = jVar.g(currentTimeMillis);
        }
        if (!g10) {
            return 1;
        }
        synchronized (jVar) {
            String d10 = jVar.d(System.currentTimeMillis());
            jVar.f11894a.edit().putString("last-used-date", d10).commit();
            jVar.f(d10);
        }
        return 3;
    }

    public final void c() {
        if (this.f11892d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!j.a(this.f11890b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.f11893e, new c(this));
        }
    }
}
