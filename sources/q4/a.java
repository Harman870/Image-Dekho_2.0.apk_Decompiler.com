package q4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;
import k4.b;
import n3.y;
import r3.o;
import w3.i;
import w3.k;
import y3.c;

@ThreadSafe
public final class a {

    /* renamed from: n  reason: collision with root package name */
    public static final long f11318n = TimeUnit.DAYS.toMillis(366);

    /* renamed from: o  reason: collision with root package name */
    public static volatile ScheduledExecutorService f11319o = null;

    /* renamed from: p  reason: collision with root package name */
    public static final Object f11320p = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f11321a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final PowerManager.WakeLock f11322b;

    /* renamed from: c  reason: collision with root package name */
    public int f11323c = 0;

    /* renamed from: d  reason: collision with root package name */
    public ScheduledFuture f11324d;

    /* renamed from: e  reason: collision with root package name */
    public long f11325e;

    /* renamed from: f  reason: collision with root package name */
    public final HashSet f11326f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    public boolean f11327g = true;

    /* renamed from: h  reason: collision with root package name */
    public k4.a f11328h;

    /* renamed from: i  reason: collision with root package name */
    public y3.a f11329i = y3.a.P;

    /* renamed from: j  reason: collision with root package name */
    public final String f11330j;
    public final HashMap k = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    public AtomicInteger f11331l = new AtomicInteger(0);

    /* renamed from: m  reason: collision with root package name */
    public final ScheduledExecutorService f11332m;

    public a(Context context, String str) {
        boolean booleanValue;
        String str2;
        boolean z9;
        String str3;
        String packageName = context.getPackageName();
        o.f("WakeLock: wakeLockName must not be empty", str);
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f11328h = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            if (str.length() != 0) {
                str3 = "*gcore*:".concat(str);
            } else {
                str3 = new String("*gcore*:");
            }
            this.f11330j = str3;
        } else {
            this.f11330j = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f11322b = powerManager.newWakeLock(1, str);
            Method method = k.f12747a;
            synchronized (k.class) {
                Boolean bool = k.f12749c;
                if (bool == null) {
                    if (y.a.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    bool = Boolean.valueOf(z9);
                    k.f12749c = bool;
                }
                booleanValue = bool.booleanValue();
            }
            if (booleanValue) {
                packageName = i.b(packageName) ? context.getPackageName() : packageName;
                if (!(context.getPackageManager() == null || packageName == null)) {
                    try {
                        ApplicationInfo a10 = c.a(context).a(0, packageName);
                        if (a10 == null) {
                            str2 = "Could not get applicationInfo from package: ";
                            Log.e("WorkSourceUtil", str2.concat(packageName));
                        } else {
                            int i10 = a10.uid;
                            workSource = new WorkSource();
                            Method method2 = k.f12748b;
                            if (method2 != null) {
                                try {
                                    method2.invoke(workSource, new Object[]{Integer.valueOf(i10), packageName});
                                } catch (Exception e10) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                                }
                            } else {
                                Method method3 = k.f12747a;
                                if (method3 != null) {
                                    method3.invoke(workSource, new Object[]{Integer.valueOf(i10)});
                                }
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        str2 = "Could not find package: ";
                    }
                }
                if (workSource != null) {
                    try {
                        this.f11322b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e11) {
                        Log.wtf("WakeLock", e11.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f11319o;
            if (scheduledExecutorService == null) {
                synchronized (f11320p) {
                    scheduledExecutorService = f11319o;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f11319o = scheduledExecutorService;
                    }
                }
            }
            this.f11332m = scheduledExecutorService;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("expected a non-null reference", 0, 29);
        throw new b(sb.toString());
    }

    public final void a(long j10) {
        this.f11331l.incrementAndGet();
        long j11 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f11318n), 1);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f11321a) {
            try {
                if (!b()) {
                    this.f11328h = k4.a.f9060a;
                    this.f11322b.acquire();
                    this.f11329i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f11323c++;
                if (this.f11327g) {
                    TextUtils.isEmpty((CharSequence) null);
                }
                b bVar = (b) this.k.get((Object) null);
                if (bVar == null) {
                    bVar = new b(0);
                    this.k.put((Object) null, bVar);
                }
                bVar.f11333a++;
                this.f11329i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j11 = elapsedRealtime + max;
                }
                if (j11 > this.f11325e) {
                    this.f11325e = j11;
                    ScheduledFuture scheduledFuture = this.f11324d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f11324d = this.f11332m.schedule(new y(3, this), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z9;
        synchronized (this.f11321a) {
            z9 = this.f11323c > 0;
        }
        return z9;
    }

    public final void c() {
        if (this.f11331l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f11330j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f11321a) {
            try {
                if (this.f11327g) {
                    TextUtils.isEmpty((CharSequence) null);
                }
                if (this.k.containsKey((Object) null)) {
                    b bVar = (b) this.k.get((Object) null);
                    if (bVar != null) {
                        int i10 = bVar.f11333a - 1;
                        bVar.f11333a = i10;
                        if (i10 == 0) {
                            this.k.remove((Object) null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f11330j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (!this.f11326f.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f11326f);
            this.f11326f.clear();
            if (arrayList.size() > 0) {
                c cVar = (c) arrayList.get(0);
                throw null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        if (r6.f11328h != null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0080, code lost:
        if (r6.f11328h != null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0082, code lost:
        r6.f11328h = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f11321a
            monitor-enter(r0)
            boolean r1 = r6.b()     // Catch:{ all -> 0x00a0 }
            if (r1 != 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            return
        L_0x000b:
            boolean r1 = r6.f11327g     // Catch:{ all -> 0x00a0 }
            r2 = 0
            if (r1 == 0) goto L_0x001b
            int r1 = r6.f11323c     // Catch:{ all -> 0x00a0 }
            int r1 = r1 + -1
            r6.f11323c = r1     // Catch:{ all -> 0x00a0 }
            if (r1 > 0) goto L_0x0019
            goto L_0x001d
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            return
        L_0x001b:
            r6.f11323c = r2     // Catch:{ all -> 0x00a0 }
        L_0x001d:
            r6.d()     // Catch:{ all -> 0x00a0 }
            java.util.HashMap r1 = r6.k     // Catch:{ all -> 0x00a0 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x00a0 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00a0 }
        L_0x002a:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x00a0 }
            if (r3 == 0) goto L_0x0039
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x00a0 }
            q4.b r3 = (q4.b) r3     // Catch:{ all -> 0x00a0 }
            r3.f11333a = r2     // Catch:{ all -> 0x00a0 }
            goto L_0x002a
        L_0x0039:
            java.util.HashMap r1 = r6.k     // Catch:{ all -> 0x00a0 }
            r1.clear()     // Catch:{ all -> 0x00a0 }
            java.util.concurrent.ScheduledFuture r1 = r6.f11324d     // Catch:{ all -> 0x00a0 }
            r3 = 0
            if (r1 == 0) goto L_0x004c
            r1.cancel(r2)     // Catch:{ all -> 0x00a0 }
            r6.f11324d = r3     // Catch:{ all -> 0x00a0 }
            r1 = 0
            r6.f11325e = r1     // Catch:{ all -> 0x00a0 }
        L_0x004c:
            android.os.PowerManager$WakeLock r1 = r6.f11322b     // Catch:{ all -> 0x00a0 }
            boolean r1 = r1.isHeld()     // Catch:{ all -> 0x00a0 }
            if (r1 == 0) goto L_0x008d
            android.os.PowerManager$WakeLock r1 = r6.f11322b     // Catch:{ RuntimeException -> 0x0060 }
            r1.release()     // Catch:{ RuntimeException -> 0x0060 }
            k4.a r1 = r6.f11328h     // Catch:{ all -> 0x00a0 }
            if (r1 == 0) goto L_0x009e
            goto L_0x0082
        L_0x005e:
            r1 = move-exception
            goto L_0x0086
        L_0x0060:
            r1 = move-exception
            java.lang.Class r2 = r1.getClass()     // Catch:{ all -> 0x005e }
            java.lang.Class<java.lang.RuntimeException> r4 = java.lang.RuntimeException.class
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x005e }
            if (r2 == 0) goto L_0x0085
            java.lang.String r2 = "WakeLock"
            java.lang.String r4 = r6.f11330j     // Catch:{ all -> 0x005e }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x005e }
            java.lang.String r5 = " failed to release!"
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x005e }
            android.util.Log.e(r2, r4, r1)     // Catch:{ all -> 0x005e }
            k4.a r1 = r6.f11328h     // Catch:{ all -> 0x00a0 }
            if (r1 == 0) goto L_0x009e
        L_0x0082:
            r6.f11328h = r3     // Catch:{ all -> 0x00a0 }
            goto L_0x009e
        L_0x0085:
            throw r1     // Catch:{ all -> 0x005e }
        L_0x0086:
            k4.a r2 = r6.f11328h     // Catch:{ all -> 0x00a0 }
            if (r2 == 0) goto L_0x008c
            r6.f11328h = r3     // Catch:{ all -> 0x00a0 }
        L_0x008c:
            throw r1     // Catch:{ all -> 0x00a0 }
        L_0x008d:
            java.lang.String r1 = "WakeLock"
            java.lang.String r2 = r6.f11330j     // Catch:{ all -> 0x00a0 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00a0 }
            java.lang.String r3 = " should be held!"
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x00a0 }
            android.util.Log.e(r1, r2)     // Catch:{ all -> 0x00a0 }
        L_0x009e:
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            return
        L_0x00a0:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.a.e():void");
    }
}
