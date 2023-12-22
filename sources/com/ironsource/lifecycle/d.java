package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.os.Bundle;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.lifecycle.b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: i  reason: collision with root package name */
    public static d f3794i = new d();

    /* renamed from: j  reason: collision with root package name */
    public static AtomicBoolean f3795j = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    public int f3796a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f3797b = 0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3798c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3799d = true;

    /* renamed from: e  reason: collision with root package name */
    public int f3800e = e.f3809a;

    /* renamed from: f  reason: collision with root package name */
    public CopyOnWriteArrayList f3801f = new CopyOnWriteArrayList();

    /* renamed from: g  reason: collision with root package name */
    public a f3802g = new a();

    /* renamed from: h  reason: collision with root package name */
    public e f3803h = new e();

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            d dVar = d.this;
            if (dVar.f3797b == 0) {
                dVar.f3798c = true;
                IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new C0044d());
                dVar.f3800e = e.f3812d;
            }
            d dVar2 = d.this;
            if (dVar2.f3796a == 0 && dVar2.f3798c) {
                IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new p7.a(dVar2));
                dVar2.f3799d = true;
                dVar2.f3800e = e.f3813e;
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            Iterator it = d.this.f3801f.iterator();
            while (it.hasNext()) {
                ((c) it.next()).a();
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            Iterator it = d.this.f3801f.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: com.ironsource.lifecycle.d$d  reason: collision with other inner class name */
    public class C0044d implements Runnable {
        public C0044d() {
        }

        public final void run() {
            Iterator it = d.this.f3801f.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public class e implements b.a {
        public e() {
        }

        public final void a(Activity activity) {
            d dVar = d.this;
            int i10 = dVar.f3796a + 1;
            dVar.f3796a = i10;
            if (i10 == 1 && dVar.f3799d) {
                IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b());
                dVar.f3799d = false;
                dVar.f3800e = e.f3810b;
            }
        }

        public final void b(Activity activity) {
            d dVar = d.this;
            int i10 = dVar.f3797b + 1;
            dVar.f3797b = i10;
            if (i10 != 1) {
                return;
            }
            if (dVar.f3798c) {
                IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new c());
                dVar.f3798c = false;
                dVar.f3800e = e.f3811c;
                return;
            }
            IronSourceThreadManager.INSTANCE.removeUiThreadTask(dVar.f3802g);
        }
    }

    public static d a() {
        return f3794i;
    }

    public final void a(c cVar) {
        if (IronsourceLifecycleProvider.f3782a && cVar != null && !this.f3801f.contains(cVar)) {
            this.f3801f.add(cVar);
        }
    }

    public final void b(c cVar) {
        if (this.f3801f.contains(cVar)) {
            this.f3801f.remove(cVar);
        }
    }

    public final boolean b() {
        return this.f3800e == e.f3813e;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i10 = b.f3792b;
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager != null && fragmentManager.findFragmentByTag("com.ironsource.lifecycle.IronsourceLifecycleFragment") == null) {
            fragmentManager.beginTransaction().add(new b(), "com.ironsource.lifecycle.IronsourceLifecycleFragment").commit();
            fragmentManager.executePendingTransactions();
        }
        b bVar = (b) activity.getFragmentManager().findFragmentByTag("com.ironsource.lifecycle.IronsourceLifecycleFragment");
        if (bVar != null) {
            bVar.f3793a = this.f3803h;
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        int i10 = this.f3797b - 1;
        this.f3797b = i10;
        if (i10 == 0) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(this.f3802g, 700);
        }
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
        int i10 = this.f3796a - 1;
        this.f3796a = i10;
        if (i10 == 0 && this.f3798c) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new p7.a(this));
            this.f3799d = true;
            this.f3800e = e.f3813e;
        }
    }
}
