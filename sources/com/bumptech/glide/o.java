package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.util.Log;
import b2.c;
import com.bumptech.glide.manager.b;
import com.bumptech.glide.manager.d;
import com.bumptech.glide.manager.e;
import com.bumptech.glide.manager.h;
import com.bumptech.glide.manager.i;
import com.bumptech.glide.manager.p;
import com.bumptech.glide.manager.t;
import f2.f;
import f2.g;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import q1.l;

public final class o implements ComponentCallbacks2, i {
    public static final g k;

    /* renamed from: a  reason: collision with root package name */
    public final b f2661a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f2662b;

    /* renamed from: c  reason: collision with root package name */
    public final h f2663c;

    /* renamed from: d  reason: collision with root package name */
    public final p f2664d;

    /* renamed from: e  reason: collision with root package name */
    public final com.bumptech.glide.manager.o f2665e;

    /* renamed from: f  reason: collision with root package name */
    public final t f2666f = new t();

    /* renamed from: g  reason: collision with root package name */
    public final a f2667g;

    /* renamed from: h  reason: collision with root package name */
    public final com.bumptech.glide.manager.b f2668h;

    /* renamed from: i  reason: collision with root package name */
    public final CopyOnWriteArrayList<f<Object>> f2669i;

    /* renamed from: j  reason: collision with root package name */
    public g f2670j;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            o oVar = o.this;
            oVar.f2663c.g(oVar);
        }
    }

    public class b implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final p f2672a;

        public b(p pVar) {
            this.f2672a = pVar;
        }

        public final void a(boolean z9) {
            if (z9) {
                synchronized (o.this) {
                    this.f2672a.b();
                }
            }
        }
    }

    static {
        g gVar = (g) new g().d(Bitmap.class);
        gVar.f6336t = true;
        k = gVar;
        ((g) new g().d(c.class)).f6336t = true;
        g gVar2 = (g) ((g) ((g) new g().e(l.f11057b)).j()).n();
    }

    public o(b bVar, h hVar, com.bumptech.glide.manager.o oVar, Context context) {
        boolean z9;
        com.bumptech.glide.manager.b bVar2;
        g gVar;
        String str;
        p pVar = new p();
        com.bumptech.glide.manager.c cVar = bVar.f2551f;
        a aVar = new a();
        this.f2667g = aVar;
        this.f2661a = bVar;
        this.f2663c = hVar;
        this.f2665e = oVar;
        this.f2664d = pVar;
        this.f2662b = context;
        Context applicationContext = context.getApplicationContext();
        b bVar3 = new b(pVar);
        ((e) cVar).getClass();
        if (y.a.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            if (z9) {
                str = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
            } else {
                str = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
            }
            Log.d("ConnectivityMonitor", str);
        }
        if (z9) {
            bVar2 = new d(applicationContext, bVar3);
        } else {
            bVar2 = new com.bumptech.glide.manager.l();
        }
        this.f2668h = bVar2;
        if (j2.l.i()) {
            j2.l.f().post(aVar);
        } else {
            hVar.g(this);
        }
        hVar.g(bVar2);
        this.f2669i = new CopyOnWriteArrayList<>(bVar.f2548c.f2557e);
        h hVar2 = bVar.f2548c;
        synchronized (hVar2) {
            if (hVar2.f2562j == null) {
                ((c) hVar2.f2556d).getClass();
                g gVar2 = new g();
                gVar2.f6336t = true;
                hVar2.f2562j = gVar2;
            }
            gVar = hVar2.f2562j;
        }
        synchronized (this) {
            g gVar3 = (g) gVar.clone();
            if (gVar3.f6336t) {
                if (!gVar3.f6337v) {
                    throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
                }
            }
            gVar3.f6337v = true;
            gVar3.f6336t = true;
            this.f2670j = gVar3;
        }
        synchronized (bVar.f2552g) {
            if (!bVar.f2552g.contains(this)) {
                bVar.f2552g.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public final void i(g2.g<?> gVar) {
        boolean z9;
        if (gVar != null) {
            boolean l6 = l(gVar);
            f2.d g10 = gVar.g();
            if (!l6) {
                b bVar = this.f2661a;
                synchronized (bVar.f2552g) {
                    Iterator it = bVar.f2552g.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((o) it.next()).l(gVar)) {
                                z9 = true;
                                break;
                            }
                        } else {
                            z9 = false;
                            break;
                        }
                    }
                }
                if (!z9 && g10 != null) {
                    gVar.b((f2.d) null);
                    g10.clear();
                }
            }
        }
    }

    public final synchronized void j() {
        p pVar = this.f2664d;
        pVar.f2643c = true;
        Iterator it = j2.l.e(pVar.f2641a).iterator();
        while (it.hasNext()) {
            f2.d dVar = (f2.d) it.next();
            if (dVar.isRunning()) {
                dVar.g();
                pVar.f2642b.add(dVar);
            }
        }
    }

    public final synchronized void k() {
        p pVar = this.f2664d;
        pVar.f2643c = false;
        Iterator it = j2.l.e(pVar.f2641a).iterator();
        while (it.hasNext()) {
            f2.d dVar = (f2.d) it.next();
            if (!dVar.i() && !dVar.isRunning()) {
                dVar.h();
            }
        }
        pVar.f2642b.clear();
    }

    public final synchronized boolean l(g2.g<?> gVar) {
        f2.d g10 = gVar.g();
        if (g10 == null) {
            return true;
        }
        if (!this.f2664d.a(g10)) {
            return false;
        }
        this.f2666f.f2658a.remove(gVar);
        gVar.b((f2.d) null);
        return true;
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final synchronized void onDestroy() {
        this.f2666f.onDestroy();
        Iterator it = j2.l.e(this.f2666f.f2658a).iterator();
        while (it.hasNext()) {
            i((g2.g) it.next());
        }
        this.f2666f.f2658a.clear();
        p pVar = this.f2664d;
        Iterator it2 = j2.l.e(pVar.f2641a).iterator();
        while (it2.hasNext()) {
            pVar.a((f2.d) it2.next());
        }
        pVar.f2642b.clear();
        this.f2663c.i(this);
        this.f2663c.i(this.f2668h);
        j2.l.f().removeCallbacks(this.f2667g);
        this.f2661a.c(this);
    }

    public final void onLowMemory() {
    }

    public final synchronized void onStart() {
        k();
        this.f2666f.onStart();
    }

    public final synchronized void onStop() {
        j();
        this.f2666f.onStop();
    }

    public final void onTrimMemory(int i10) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f2664d + ", treeNode=" + this.f2665e + "}";
    }
}
