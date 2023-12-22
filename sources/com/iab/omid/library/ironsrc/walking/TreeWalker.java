package com.iab.omid.library.ironsrc.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.ironsrc.processor.a;
import com.iab.omid.library.ironsrc.utils.f;
import com.iab.omid.library.ironsrc.utils.h;
import com.iab.omid.library.ironsrc.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements a.C0034a {

    /* renamed from: i  reason: collision with root package name */
    private static TreeWalker f3593i = new TreeWalker();

    /* renamed from: j  reason: collision with root package name */
    private static Handler f3594j = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public static Handler k = null;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final Runnable f3595l = new b();
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final Runnable f3596m = new c();

    /* renamed from: a  reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f3597a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private int f3598b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3599c = false;

    /* renamed from: d  reason: collision with root package name */
    private final List<com.iab.omid.library.ironsrc.weakreference.a> f3600d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private com.iab.omid.library.ironsrc.processor.b f3601e = new com.iab.omid.library.ironsrc.processor.b();

    /* renamed from: f  reason: collision with root package name */
    private a f3602f = new a();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public b f3603g = new b(new com.iab.omid.library.ironsrc.walking.async.c());

    /* renamed from: h  reason: collision with root package name */
    private long f3604h;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i10, long j10);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i10, long j10);
    }

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            TreeWalker.this.f3603g.b();
        }
    }

    public class b implements Runnable {
        public void run() {
            TreeWalker.getInstance().l();
        }
    }

    public class c implements Runnable {
        public void run() {
            if (TreeWalker.k != null) {
                TreeWalker.k.post(TreeWalker.f3595l);
                TreeWalker.k.postDelayed(TreeWalker.f3596m, 200);
            }
        }
    }

    private void a(long j10) {
        if (this.f3597a.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f3597a) {
                next.onTreeProcessed(this.f3598b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f3598b, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.ironsrc.processor.a aVar, JSONObject jSONObject, c cVar, boolean z9) {
        aVar.a(view, jSONObject, this, cVar == c.PARENT_VIEW, z9);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.ironsrc.processor.a b10 = this.f3601e.b();
        String b11 = this.f3602f.b(str);
        if (b11 != null) {
            JSONObject a10 = b10.a(view);
            com.iab.omid.library.ironsrc.utils.c.a(a10, str);
            com.iab.omid.library.ironsrc.utils.c.b(a10, b11);
            com.iab.omid.library.ironsrc.utils.c.a(jSONObject, a10);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0035a c10 = this.f3602f.c(view);
        if (c10 == null) {
            return false;
        }
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, c10);
        return true;
    }

    private boolean b(View view, JSONObject jSONObject) {
        String d10 = this.f3602f.d(view);
        if (d10 == null) {
            return false;
        }
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, d10);
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, Boolean.valueOf(this.f3602f.f(view)));
        this.f3602f.d();
        return true;
    }

    private void d() {
        a(f.b() - this.f3604h);
    }

    private void e() {
        this.f3598b = 0;
        this.f3600d.clear();
        this.f3599c = false;
        Iterator<com.iab.omid.library.ironsrc.adsession.a> it = com.iab.omid.library.ironsrc.internal.c.c().a().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().e()) {
                    this.f3599c = true;
                    break;
                }
            } else {
                break;
            }
        }
        this.f3604h = f.b();
    }

    public static TreeWalker getInstance() {
        return f3593i;
    }

    private void i() {
        if (k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            k = handler;
            handler.post(f3595l);
            k.postDelayed(f3596m, 200);
        }
    }

    private void k() {
        Handler handler = k;
        if (handler != null) {
            handler.removeCallbacks(f3596m);
            k = null;
        }
    }

    /* access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
    }

    public void a(View view, com.iab.omid.library.ironsrc.processor.a aVar, JSONObject jSONObject, boolean z9) {
        c e10;
        if (h.d(view) && (e10 = this.f3602f.e(view)) != c.UNDERLYING_VIEW) {
            JSONObject a10 = aVar.a(view);
            com.iab.omid.library.ironsrc.utils.c.a(jSONObject, a10);
            if (!b(view, a10)) {
                boolean z10 = z9 || a(view, a10);
                if (this.f3599c && e10 == c.OBSTRUCTION_VIEW && !z10) {
                    this.f3600d.add(new com.iab.omid.library.ironsrc.weakreference.a(view));
                }
                a(view, aVar, a10, e10, z10);
            }
            this.f3598b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f3597a.contains(treeWalkerTimeLogger)) {
            this.f3597a.add(treeWalkerTimeLogger);
        }
    }

    public void f() {
        this.f3602f.e();
        long b10 = f.b();
        com.iab.omid.library.ironsrc.processor.a a10 = this.f3601e.a();
        if (this.f3602f.b().size() > 0) {
            Iterator<String> it = this.f3602f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a11 = a10.a((View) null);
                a(next, this.f3602f.a(next), a11);
                com.iab.omid.library.ironsrc.utils.c.b(a11);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f3603g.a(a11, hashSet, b10);
            }
        }
        if (this.f3602f.c().size() > 0) {
            JSONObject a12 = a10.a((View) null);
            a((View) null, a10, a12, c.PARENT_VIEW, false);
            com.iab.omid.library.ironsrc.utils.c.b(a12);
            this.f3603g.b(a12, this.f3602f.c(), b10);
            if (this.f3599c) {
                for (com.iab.omid.library.ironsrc.adsession.a a13 : com.iab.omid.library.ironsrc.internal.c.c().a()) {
                    a13.a(this.f3600d);
                }
            }
        } else {
            this.f3603g.b();
        }
        this.f3602f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f3597a.clear();
        f3594j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f3597a.contains(treeWalkerTimeLogger)) {
            this.f3597a.remove(treeWalkerTimeLogger);
        }
    }
}
