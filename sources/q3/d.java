package q3;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import f4.f;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import o3.b;
import o3.e;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import r3.b0;
import r3.p;
import r3.q;
import r3.r;
import t3.c;
import w3.g;
import y3.a;

public final class d implements Handler.Callback {

    /* renamed from: p  reason: collision with root package name */
    public static final Status f11208p = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: q  reason: collision with root package name */
    public static final Status f11209q = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: r  reason: collision with root package name */
    public static final Object f11210r = new Object();
    @GuardedBy("lock")

    /* renamed from: s  reason: collision with root package name */
    public static d f11211s;

    /* renamed from: a  reason: collision with root package name */
    public long f11212a = 10000;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11213b = false;

    /* renamed from: c  reason: collision with root package name */
    public r f11214c;

    /* renamed from: d  reason: collision with root package name */
    public c f11215d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f11216e;

    /* renamed from: f  reason: collision with root package name */
    public final e f11217f;

    /* renamed from: g  reason: collision with root package name */
    public final b0 f11218g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicInteger f11219h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f11220i;

    /* renamed from: j  reason: collision with root package name */
    public final ConcurrentHashMap f11221j;
    @GuardedBy("lock")
    public o k;
    @GuardedBy("lock")

    /* renamed from: l  reason: collision with root package name */
    public final m.d f11222l;

    /* renamed from: m  reason: collision with root package name */
    public final m.d f11223m;
    @NotOnlyInitialized

    /* renamed from: n  reason: collision with root package name */
    public final f f11224n;

    /* renamed from: o  reason: collision with root package name */
    public volatile boolean f11225o;

    public d(Context context, Looper looper) {
        e eVar = e.f10553d;
        boolean z9 = true;
        this.f11219h = new AtomicInteger(1);
        this.f11220i = new AtomicInteger(0);
        this.f11221j = new ConcurrentHashMap(5, 0.75f, 1);
        this.k = null;
        this.f11222l = new m.d();
        this.f11223m = new m.d();
        this.f11225o = true;
        this.f11216e = context;
        f fVar = new f(looper, this);
        this.f11224n = fVar;
        this.f11217f = eVar;
        this.f11218g = new b0();
        PackageManager packageManager = context.getPackageManager();
        if (w3.d.f12744d == null) {
            w3.d.f12744d = Boolean.valueOf((!g.a() || !packageManager.hasSystemFeature("android.hardware.type.automotive")) ? false : z9);
        }
        if (w3.d.f12744d.booleanValue()) {
            this.f11225o = false;
        }
        fVar.sendMessage(fVar.obtainMessage(6));
    }

    public static Status d(a<?> aVar, b bVar) {
        String str = aVar.f11193b.f10658b;
        String valueOf = String.valueOf(bVar);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(1, 17, sb.toString(), bVar.f10540c, bVar);
    }

    public static d f(Context context) {
        d dVar;
        HandlerThread handlerThread;
        synchronized (f11210r) {
            try {
                if (f11211s == null) {
                    synchronized (r3.g.f11584a) {
                        handlerThread = r3.g.f11586c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            r3.g.f11586c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = r3.g.f11586c;
                        }
                    }
                    Looper looper = handlerThread.getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = e.f10552c;
                    f11211s = new d(applicationContext, looper);
                }
                dVar = f11211s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public final void a(o oVar) {
        synchronized (f11210r) {
            if (this.k != oVar) {
                this.k = oVar;
                this.f11222l.clear();
            }
            this.f11222l.addAll(oVar.f11264e);
        }
    }

    public final boolean b() {
        if (this.f11213b) {
            return false;
        }
        q qVar = p.a().f11619a;
        if (qVar != null && !qVar.f11624b) {
            return false;
        }
        int i10 = this.f11218g.f11521a.get(203400000, -1);
        if (i10 == -1 || i10 == 0) {
            return true;
        }
        return false;
    }

    public final boolean c(b bVar, int i10) {
        boolean z9;
        PendingIntent pendingIntent;
        e eVar = this.f11217f;
        Context context = this.f11216e;
        eVar.getClass();
        if (!a.l(context)) {
            int i11 = bVar.f10539b;
            if (i11 == 0 || bVar.f10540c == null) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9) {
                pendingIntent = bVar.f10540c;
            } else {
                Intent a10 = eVar.a(context, (String) null, i11);
                if (a10 == null) {
                    pendingIntent = null;
                } else {
                    pendingIntent = PendingIntent.getActivity(context, 0, a10, 201326592);
                }
            }
            if (pendingIntent != null) {
                int i12 = bVar.f10539b;
                int i13 = GoogleApiActivity.f2801b;
                Intent intent = new Intent(context, GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i10);
                intent.putExtra("notify_manager", true);
                eVar.g(context, i12, PendingIntent.getActivity(context, 0, intent, f4.e.f6384a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final w<?> e(p3.c<?> cVar) {
        a<O> aVar = cVar.f10665e;
        w<?> wVar = (w) this.f11221j.get(aVar);
        if (wVar == null) {
            wVar = new w<>(this, cVar);
            this.f11221j.put(aVar, wVar);
        }
        if (wVar.f11287b.l()) {
            this.f11223m.add(aVar);
        }
        wVar.o();
        return wVar;
    }

    public final void g(b bVar, int i10) {
        if (!c(bVar, i10)) {
            f fVar = this.f11224n;
            fVar.sendMessage(fVar.obtainMessage(5, i10, 0, bVar));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0167, code lost:
        r5 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r11) {
        /*
            r10 = this;
            int r0 = r11.what
            java.lang.String r1 = "GoogleApiManager"
            r2 = 1
            r3 = 0
            r4 = 300000(0x493e0, double:1.482197E-318)
            r6 = 17
            r7 = 0
            switch(r0) {
                case 1: goto L_0x03f6;
                case 2: goto L_0x03ee;
                case 3: goto L_0x03cb;
                case 4: goto L_0x0390;
                case 5: goto L_0x02f5;
                case 6: goto L_0x029d;
                case 7: goto L_0x0294;
                case 8: goto L_0x0390;
                case 9: goto L_0x0270;
                case 10: goto L_0x0246;
                case 11: goto L_0x01f7;
                case 12: goto L_0x01de;
                case 13: goto L_0x0390;
                case 14: goto L_0x01c2;
                case 15: goto L_0x018a;
                case 16: goto L_0x00f6;
                case 17: goto L_0x00d2;
                case 18: goto L_0x002a;
                case 19: goto L_0x0026;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r2 = 31
            r11.<init>(r2)
            java.lang.String r2 = "Unknown message id: "
            r11.append(r2)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            android.util.Log.w(r1, r11)
            return r7
        L_0x0026:
            r10.f11213b = r7
            goto L_0x042e
        L_0x002a:
            java.lang.Object r11 = r11.obj
            q3.e0 r11 = (q3.e0) r11
            long r0 = r11.f11234c
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x005b
            r3.r r0 = new r3.r
            int r1 = r11.f11233b
            r3.l[] r3 = new r3.l[r2]
            r3.l r11 = r11.f11232a
            r3[r7] = r11
            java.util.List r11 = java.util.Arrays.asList(r3)
            r0.<init>(r11, r1)
            t3.c r11 = r10.f11215d
            if (r11 != 0) goto L_0x0054
            android.content.Context r11 = r10.f11216e
            t3.c r1 = new t3.c
            r1.<init>(r11)
            r10.f11215d = r1
        L_0x0054:
            t3.c r11 = r10.f11215d
            r11.c(r0)
            goto L_0x042e
        L_0x005b:
            r3.r r0 = r10.f11214c
            if (r0 == 0) goto L_0x00ae
            java.util.List<r3.l> r1 = r0.f11629b
            int r0 = r0.f11628a
            int r4 = r11.f11233b
            if (r0 != r4) goto L_0x0087
            if (r1 == 0) goto L_0x0072
            int r0 = r1.size()
            int r1 = r11.f11235d
            if (r0 < r1) goto L_0x0072
            goto L_0x0087
        L_0x0072:
            r3.r r0 = r10.f11214c
            r3.l r1 = r11.f11232a
            java.util.List<r3.l> r3 = r0.f11629b
            if (r3 != 0) goto L_0x0081
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f11629b = r3
        L_0x0081:
            java.util.List<r3.l> r0 = r0.f11629b
            r0.add(r1)
            goto L_0x00ae
        L_0x0087:
            f4.f r0 = r10.f11224n
            r0.removeMessages(r6)
            r3.r r0 = r10.f11214c
            if (r0 == 0) goto L_0x00ae
            int r1 = r0.f11628a
            if (r1 > 0) goto L_0x009a
            boolean r1 = r10.b()
            if (r1 == 0) goto L_0x00ac
        L_0x009a:
            t3.c r1 = r10.f11215d
            if (r1 != 0) goto L_0x00a7
            android.content.Context r1 = r10.f11216e
            t3.c r4 = new t3.c
            r4.<init>(r1)
            r10.f11215d = r4
        L_0x00a7:
            t3.c r1 = r10.f11215d
            r1.c(r0)
        L_0x00ac:
            r10.f11214c = r3
        L_0x00ae:
            r3.r r0 = r10.f11214c
            if (r0 != 0) goto L_0x042e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.l r1 = r11.f11232a
            r0.add(r1)
            r3.r r1 = new r3.r
            int r3 = r11.f11233b
            r1.<init>(r0, r3)
            r10.f11214c = r1
            f4.f r0 = r10.f11224n
            android.os.Message r1 = r0.obtainMessage(r6)
            long r3 = r11.f11234c
            r0.sendMessageDelayed(r1, r3)
            goto L_0x042e
        L_0x00d2:
            r3.r r11 = r10.f11214c
            if (r11 == 0) goto L_0x042e
            int r0 = r11.f11628a
            if (r0 > 0) goto L_0x00e0
            boolean r0 = r10.b()
            if (r0 == 0) goto L_0x00f2
        L_0x00e0:
            t3.c r0 = r10.f11215d
            if (r0 != 0) goto L_0x00ed
            android.content.Context r0 = r10.f11216e
            t3.c r1 = new t3.c
            r1.<init>(r0)
            r10.f11215d = r1
        L_0x00ed:
            t3.c r0 = r10.f11215d
            r0.c(r11)
        L_0x00f2:
            r10.f11214c = r3
            goto L_0x042e
        L_0x00f6:
            java.lang.Object r11 = r11.obj
            q3.x r11 = (q3.x) r11
            java.util.concurrent.ConcurrentHashMap r0 = r10.f11221j
            q3.a<?> r1 = r11.f11299a
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x042e
            java.util.concurrent.ConcurrentHashMap r0 = r10.f11221j
            q3.a<?> r1 = r11.f11299a
            java.lang.Object r0 = r0.get(r1)
            q3.w r0 = (q3.w) r0
            java.util.ArrayList r1 = r0.f11295j
            boolean r1 = r1.remove(r11)
            if (r1 == 0) goto L_0x042e
            q3.d r1 = r0.f11297m
            f4.f r1 = r1.f11224n
            r3 = 15
            r1.removeMessages(r3, r11)
            q3.d r1 = r0.f11297m
            f4.f r1 = r1.f11224n
            r3 = 16
            r1.removeMessages(r3, r11)
            o3.d r11 = r11.f11300b
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.LinkedList r3 = r0.f11286a
            int r3 = r3.size()
            r1.<init>(r3)
            java.util.LinkedList r3 = r0.f11286a
            java.util.Iterator r3 = r3.iterator()
        L_0x013b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x016e
            java.lang.Object r4 = r3.next()
            q3.r0 r4 = (q3.r0) r4
            boolean r5 = r4 instanceof q3.c0
            if (r5 == 0) goto L_0x013b
            r5 = r4
            q3.c0 r5 = (q3.c0) r5
            o3.d[] r5 = r5.g(r0)
            if (r5 == 0) goto L_0x013b
            int r6 = r5.length
            r8 = r7
        L_0x0156:
            if (r8 >= r6) goto L_0x0167
            r9 = r5[r8]
            boolean r9 = r3.m.a(r9, r11)
            if (r9 == 0) goto L_0x0164
            if (r8 < 0) goto L_0x0167
            r5 = r2
            goto L_0x0168
        L_0x0164:
            int r8 = r8 + 1
            goto L_0x0156
        L_0x0167:
            r5 = r7
        L_0x0168:
            if (r5 == 0) goto L_0x013b
            r1.add(r4)
            goto L_0x013b
        L_0x016e:
            int r3 = r1.size()
        L_0x0172:
            if (r7 >= r3) goto L_0x042e
            java.lang.Object r4 = r1.get(r7)
            q3.r0 r4 = (q3.r0) r4
            java.util.LinkedList r5 = r0.f11286a
            r5.remove(r4)
            p3.j r5 = new p3.j
            r5.<init>(r11)
            r4.b(r5)
            int r7 = r7 + 1
            goto L_0x0172
        L_0x018a:
            java.lang.Object r11 = r11.obj
            q3.x r11 = (q3.x) r11
            java.util.concurrent.ConcurrentHashMap r0 = r10.f11221j
            q3.a<?> r1 = r11.f11299a
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x042e
            java.util.concurrent.ConcurrentHashMap r0 = r10.f11221j
            q3.a<?> r1 = r11.f11299a
            java.lang.Object r0 = r0.get(r1)
            q3.w r0 = (q3.w) r0
            java.util.ArrayList r1 = r0.f11295j
            boolean r11 = r1.contains(r11)
            if (r11 != 0) goto L_0x01ac
            goto L_0x042e
        L_0x01ac:
            boolean r11 = r0.f11294i
            if (r11 != 0) goto L_0x042e
            p3.a$e r11 = r0.f11287b
            boolean r11 = r11.a()
            if (r11 != 0) goto L_0x01bd
            r0.o()
            goto L_0x042e
        L_0x01bd:
            r0.g()
            goto L_0x042e
        L_0x01c2:
            java.lang.Object r11 = r11.obj
            q3.p r11 = (q3.p) r11
            r11.getClass()
            java.util.concurrent.ConcurrentHashMap r11 = r10.f11221j
            boolean r11 = r11.containsKey(r3)
            if (r11 != 0) goto L_0x01d2
            throw r3
        L_0x01d2:
            java.util.concurrent.ConcurrentHashMap r11 = r10.f11221j
            java.lang.Object r11 = r11.get(r3)
            q3.w r11 = (q3.w) r11
            r11.n(r7)
            throw r3
        L_0x01de:
            java.util.concurrent.ConcurrentHashMap r0 = r10.f11221j
            java.lang.Object r1 = r11.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x042e
            java.util.concurrent.ConcurrentHashMap r0 = r10.f11221j
            java.lang.Object r11 = r11.obj
            java.lang.Object r11 = r0.get(r11)
            q3.w r11 = (q3.w) r11
            r11.n(r2)
            goto L_0x042e
        L_0x01f7:
            java.util.concurrent.ConcurrentHashMap r0 = r10.f11221j
            java.lang.Object r1 = r11.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x042e
            java.util.concurrent.ConcurrentHashMap r0 = r10.f11221j
            java.lang.Object r11 = r11.obj
            java.lang.Object r11 = r0.get(r11)
            q3.w r11 = (q3.w) r11
            q3.d r0 = r11.f11297m
            f4.f r0 = r0.f11224n
            r3.o.c(r0)
            boolean r0 = r11.f11294i
            if (r0 == 0) goto L_0x042e
            r11.k()
            q3.d r0 = r11.f11297m
            o3.e r1 = r0.f11217f
            android.content.Context r0 = r0.f11216e
            int r0 = r1.c(r0)
            r1 = 18
            if (r0 != r1) goto L_0x0231
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 21
            java.lang.String r3 = "Connection timed out waiting for Google Play services update to complete."
            r0.<init>(r1, r3)
            goto L_0x023a
        L_0x0231:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 22
            java.lang.String r3 = "API failed to connect while resuming due to an unknown error."
            r0.<init>(r1, r3)
        L_0x023a:
            r11.e(r0)
            p3.a$e r11 = r11.f11287b
            java.lang.String r0 = "Timing out connection while resuming."
            r11.e(r0)
            goto L_0x042e
        L_0x0246:
            m.d r11 = r10.f11223m
            java.util.Iterator r11 = r11.iterator()
        L_0x024c:
            r0 = r11
            m.g$a r0 = (m.g.a) r0
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0269
            java.lang.Object r0 = r0.next()
            q3.a r0 = (q3.a) r0
            java.util.concurrent.ConcurrentHashMap r1 = r10.f11221j
            java.lang.Object r0 = r1.remove(r0)
            q3.w r0 = (q3.w) r0
            if (r0 == 0) goto L_0x024c
            r0.r()
            goto L_0x024c
        L_0x0269:
            m.d r11 = r10.f11223m
            r11.clear()
            goto L_0x042e
        L_0x0270:
            java.util.concurrent.ConcurrentHashMap r0 = r10.f11221j
            java.lang.Object r1 = r11.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x042e
            java.util.concurrent.ConcurrentHashMap r0 = r10.f11221j
            java.lang.Object r11 = r11.obj
            java.lang.Object r11 = r0.get(r11)
            q3.w r11 = (q3.w) r11
            q3.d r0 = r11.f11297m
            f4.f r0 = r0.f11224n
            r3.o.c(r0)
            boolean r0 = r11.f11294i
            if (r0 == 0) goto L_0x042e
            r11.o()
            goto L_0x042e
        L_0x0294:
            java.lang.Object r11 = r11.obj
            p3.c r11 = (p3.c) r11
            r10.e(r11)
            goto L_0x042e
        L_0x029d:
            android.content.Context r11 = r10.f11216e
            android.content.Context r11 = r11.getApplicationContext()
            boolean r11 = r11 instanceof android.app.Application
            if (r11 == 0) goto L_0x042e
            android.content.Context r11 = r10.f11216e
            android.content.Context r11 = r11.getApplicationContext()
            android.app.Application r11 = (android.app.Application) r11
            q3.b.a(r11)
            q3.b r11 = q3.b.f11201e
            q3.s r0 = new q3.s
            r0.<init>(r10)
            r11.getClass()
            monitor-enter(r11)
            java.util.ArrayList r1 = r11.f11204c     // Catch:{ all -> 0x02f2 }
            r1.add(r0)     // Catch:{ all -> 0x02f2 }
            monitor-exit(r11)     // Catch:{ all -> 0x02f2 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.f11203b
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x02e6
            android.app.ActivityManager$RunningAppProcessInfo r0 = new android.app.ActivityManager$RunningAppProcessInfo
            r0.<init>()
            android.app.ActivityManager.getMyMemoryState(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r11.f11203b
            boolean r1 = r1.getAndSet(r2)
            if (r1 != 0) goto L_0x02e6
            int r0 = r0.importance
            r1 = 100
            if (r0 <= r1) goto L_0x02e6
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.f11202a
            r0.set(r2)
        L_0x02e6:
            java.util.concurrent.atomic.AtomicBoolean r11 = r11.f11202a
            boolean r11 = r11.get()
            if (r11 != 0) goto L_0x042e
            r10.f11212a = r4
            goto L_0x042e
        L_0x02f2:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x02f2 }
            throw r0
        L_0x02f5:
            int r0 = r11.arg1
            java.lang.Object r11 = r11.obj
            o3.b r11 = (o3.b) r11
            java.util.concurrent.ConcurrentHashMap r4 = r10.f11221j
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L_0x0305:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0316
            java.lang.Object r5 = r4.next()
            q3.w r5 = (q3.w) r5
            int r7 = r5.f11292g
            if (r7 != r0) goto L_0x0305
            r3 = r5
        L_0x0316:
            if (r3 == 0) goto L_0x036e
            int r0 = r11.f10539b
            r1 = 13
            if (r0 != r1) goto L_0x0363
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            o3.e r1 = r10.f11217f
            int r4 = r11.f10539b
            r1.getClass()
            java.util.concurrent.atomic.AtomicBoolean r1 = o3.i.f10562a
            java.lang.String r1 = o3.b.x(r4)
            java.lang.String r11 = r11.f10541d
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            java.lang.String r5 = java.lang.String.valueOf(r11)
            int r5 = r5.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r4 = r4 + 69
            int r4 = r4 + r5
            r7.<init>(r4)
            java.lang.String r4 = "Error resolution was canceled by the user, original error message: "
            r7.append(r4)
            r7.append(r1)
            java.lang.String r1 = ": "
            r7.append(r1)
            r7.append(r11)
            java.lang.String r11 = r7.toString()
            r0.<init>(r6, r11)
            r3.e(r0)
            goto L_0x042e
        L_0x0363:
            q3.a<O> r0 = r3.f11288c
            com.google.android.gms.common.api.Status r11 = d(r0, r11)
            r3.e(r11)
            goto L_0x042e
        L_0x036e:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r3 = 76
            r11.<init>(r3)
            java.lang.String r3 = "Could not find API instance "
            r11.append(r3)
            r11.append(r0)
            java.lang.String r0 = " while trying to fail enqueued calls."
            r11.append(r0)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r11 = r11.toString()
            android.util.Log.wtf(r1, r11, r0)
            goto L_0x042e
        L_0x0390:
            java.lang.Object r11 = r11.obj
            q3.f0 r11 = (q3.f0) r11
            java.util.concurrent.ConcurrentHashMap r0 = r10.f11221j
            p3.c<?> r1 = r11.f11238c
            q3.a<O> r1 = r1.f10665e
            java.lang.Object r0 = r0.get(r1)
            q3.w r0 = (q3.w) r0
            if (r0 != 0) goto L_0x03a8
            p3.c<?> r0 = r11.f11238c
            q3.w r0 = r10.e(r0)
        L_0x03a8:
            p3.a$e r1 = r0.f11287b
            boolean r1 = r1.l()
            if (r1 == 0) goto L_0x03c5
            java.util.concurrent.atomic.AtomicInteger r1 = r10.f11220i
            int r1 = r1.get()
            int r3 = r11.f11237b
            if (r1 == r3) goto L_0x03c5
            q3.r0 r11 = r11.f11236a
            com.google.android.gms.common.api.Status r1 = f11208p
            r11.a(r1)
            r0.r()
            goto L_0x042e
        L_0x03c5:
            q3.r0 r11 = r11.f11236a
            r0.p(r11)
            goto L_0x042e
        L_0x03cb:
            java.util.concurrent.ConcurrentHashMap r11 = r10.f11221j
            java.util.Collection r11 = r11.values()
            java.util.Iterator r11 = r11.iterator()
        L_0x03d5:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x042e
            java.lang.Object r0 = r11.next()
            q3.w r0 = (q3.w) r0
            q3.d r1 = r0.f11297m
            f4.f r1 = r1.f11224n
            r3.o.c(r1)
            r0.k = r3
            r0.o()
            goto L_0x03d5
        L_0x03ee:
            java.lang.Object r11 = r11.obj
            q3.s0 r11 = (q3.s0) r11
            r11.getClass()
            throw r3
        L_0x03f6:
            java.lang.Object r11 = r11.obj
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r2 == r11) goto L_0x0401
            goto L_0x0403
        L_0x0401:
            r4 = 10000(0x2710, double:4.9407E-320)
        L_0x0403:
            r10.f11212a = r4
            f4.f r11 = r10.f11224n
            r0 = 12
            r11.removeMessages(r0)
            java.util.concurrent.ConcurrentHashMap r11 = r10.f11221j
            java.util.Set r11 = r11.keySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x0416:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x042e
            java.lang.Object r1 = r11.next()
            q3.a r1 = (q3.a) r1
            f4.f r3 = r10.f11224n
            android.os.Message r1 = r3.obtainMessage(r0, r1)
            long r4 = r10.f11212a
            r3.sendMessageDelayed(r1, r4)
            goto L_0x0416
        L_0x042e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.d.handleMessage(android.os.Message):boolean");
    }
}
