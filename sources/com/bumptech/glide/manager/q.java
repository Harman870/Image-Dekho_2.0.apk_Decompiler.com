package com.bumptech.glide.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import com.bumptech.glide.manager.b;
import j2.f;
import j2.g;
import j2.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class q {

    /* renamed from: d  reason: collision with root package name */
    public static volatile q f2644d;

    /* renamed from: a  reason: collision with root package name */
    public final c f2645a;

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f2646b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public boolean f2647c;

    public class a implements g<ConnectivityManager> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f2648a;

        public a(Context context) {
            this.f2648a = context;
        }

        public final Object get() {
            return (ConnectivityManager) this.f2648a.getSystemService("connectivity");
        }
    }

    public class b implements b.a {
        public b() {
        }

        public final void a(boolean z9) {
            ArrayList arrayList;
            l.a();
            synchronized (q.this) {
                arrayList = new ArrayList(q.this.f2646b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b.a) it.next()).a(z9);
            }
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2650a;

        /* renamed from: b  reason: collision with root package name */
        public final b.a f2651b;

        /* renamed from: c  reason: collision with root package name */
        public final g<ConnectivityManager> f2652c;

        /* renamed from: d  reason: collision with root package name */
        public final a f2653d = new a();

        public class a extends ConnectivityManager.NetworkCallback {
            public a() {
            }

            public final void onAvailable(Network network) {
                l.f().post(new r(this, true));
            }

            public final void onLost(Network network) {
                l.f().post(new r(this, false));
            }
        }

        public c(f fVar, b bVar) {
            this.f2652c = fVar;
            this.f2651b = bVar;
        }
    }

    public q(Context context) {
        this.f2645a = new c(new f(new a(context)), new b());
    }

    public static q a(Context context) {
        if (f2644d == null) {
            synchronized (q.class) {
                if (f2644d == null) {
                    f2644d = new q(context.getApplicationContext());
                }
            }
        }
        return f2644d;
    }

    public final void b() {
        boolean z9;
        if (!this.f2647c && !this.f2646b.isEmpty()) {
            c cVar = this.f2645a;
            boolean z10 = true;
            if (cVar.f2652c.get().getActiveNetwork() != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            cVar.f2650a = z9;
            try {
                cVar.f2652c.get().registerDefaultNetworkCallback(cVar.f2653d);
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e10);
                }
                z10 = false;
            }
            this.f2647c = z10;
        }
    }
}
