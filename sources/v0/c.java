package v0;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import java.util.LinkedHashMap;
import java.util.Set;
import p8.h;
import x8.f;
import z.g;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static C0160c f12386a = C0160c.f12394c;

    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    public interface b {
        void a();
    }

    /* renamed from: v0.c$c  reason: collision with other inner class name */
    public static final class C0160c {

        /* renamed from: c  reason: collision with root package name */
        public static final C0160c f12394c = new C0160c();

        /* renamed from: a  reason: collision with root package name */
        public final Set<a> f12395a = h.f10707a;

        /* renamed from: b  reason: collision with root package name */
        public final LinkedHashMap f12396b = new LinkedHashMap();
    }

    public static C0160c a(o oVar) {
        while (oVar != null) {
            if (oVar.w()) {
                oVar.o();
            }
            oVar = oVar.f1581v;
        }
        return f12386a;
    }

    public static void b(C0160c cVar, f fVar) {
        o oVar = fVar.f12397a;
        String name = oVar.getClass().getName();
        if (cVar.f12395a.contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", f.j(name, "Policy violation in "), fVar);
        }
        cVar.getClass();
        if (cVar.f12395a.contains(a.PENALTY_DEATH)) {
            e(oVar, new g(name, 1, fVar));
        }
    }

    public static void c(f fVar) {
        if (y.I(3)) {
            Log.d("FragmentManager", f.j(fVar.f12397a.getClass().getName(), "StrictMode violation in "), fVar);
        }
    }

    public static final void d(o oVar, String str) {
        f.f(oVar, "fragment");
        f.f(str, "previousFragmentId");
        a aVar = new a(oVar, str);
        c(aVar);
        C0160c a10 = a(oVar);
        if (a10.f12395a.contains(a.DETECT_FRAGMENT_REUSE) && f(a10, oVar.getClass(), a.class)) {
            b(a10, aVar);
        }
    }

    public static void e(o oVar, Runnable runnable) {
        if (oVar.w()) {
            Handler handler = oVar.o().f1660o.f1637d;
            f.e(handler, "fragment.parentFragmentManager.host.handler");
            if (!f.a(handler.getLooper(), Looper.myLooper())) {
                handler.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    public static boolean f(C0160c cVar, Class cls, Class cls2) {
        Set set = (Set) cVar.f12396b.get(cls);
        if (set == null) {
            return true;
        }
        if (f.a(cls2.getSuperclass(), f.class) || !set.contains(cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
