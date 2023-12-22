package b6;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public final class b {

    /* renamed from: o  reason: collision with root package name */
    public static final HashMap f2271o = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f2272a;

    /* renamed from: b  reason: collision with root package name */
    public final r f2273b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2274c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f2275d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f2276e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final Object f2277f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public boolean f2278g;

    /* renamed from: h  reason: collision with root package name */
    public final Intent f2279h;

    /* renamed from: i  reason: collision with root package name */
    public final x f2280i;

    /* renamed from: j  reason: collision with root package name */
    public final WeakReference f2281j;
    public final t k = new t(this);

    /* renamed from: l  reason: collision with root package name */
    public final AtomicInteger f2282l = new AtomicInteger(0);

    /* renamed from: m  reason: collision with root package name */
    public a f2283m;

    /* renamed from: n  reason: collision with root package name */
    public IInterface f2284n;

    public b(Context context, r rVar, Intent intent) {
        c6.b bVar = c6.b.f2488v;
        this.f2272a = context;
        this.f2273b = rVar;
        this.f2274c = "ExpressIntegrityService";
        this.f2279h = intent;
        this.f2280i = bVar;
        this.f2281j = new WeakReference((Object) null);
    }

    public static /* bridge */ /* synthetic */ void b(b bVar, s sVar) {
        if (bVar.f2284n == null && !bVar.f2278g) {
            bVar.f2273b.b("Initiate binding to the service.", new Object[0]);
            bVar.f2275d.add(sVar);
            a aVar = new a(bVar);
            bVar.f2283m = aVar;
            bVar.f2278g = true;
            if (!bVar.f2272a.bindService(bVar.f2279h, aVar, 1)) {
                bVar.f2273b.b("Failed to bind to the service.", new Object[0]);
                bVar.f2278g = false;
                Iterator it = bVar.f2275d.iterator();
                while (it.hasNext()) {
                    ((s) it.next()).a(new c());
                }
                bVar.f2275d.clear();
            }
        } else if (bVar.f2278g) {
            bVar.f2273b.b("Waiting to bind to the service.", new Object[0]);
            bVar.f2275d.add(sVar);
        } else {
            sVar.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f2271o;
        synchronized (hashMap) {
            if (!hashMap.containsKey(this.f2274c)) {
                HandlerThread handlerThread = new HandlerThread(this.f2274c, 10);
                handlerThread.start();
                hashMap.put(this.f2274c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) hashMap.get(this.f2274c);
        }
        return handler;
    }

    public final void c(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f2277f) {
            this.f2276e.remove(taskCompletionSource);
        }
        a().post(new v(this));
    }

    public final void d() {
        Iterator it = this.f2276e.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f2274c).concat(" : Binder has died.")));
        }
        this.f2276e.clear();
    }
}
