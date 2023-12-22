package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.fragment.app.v0;
import b4.c;
import b4.d;
import b4.e;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import o3.a;
import o3.f;
import o3.g;
import r3.o;

@ParametersAreNonnullByDefault
public class AdvertisingIdClient {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    public a f2749a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    public e f2750b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    public boolean f2751c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f2752d;
    @GuardedBy("mAutoDisconnectTaskLock")

    /* renamed from: e  reason: collision with root package name */
    public zzb f2753e;
    @GuardedBy("this")

    /* renamed from: f  reason: collision with root package name */
    public final Context f2754f;

    /* renamed from: g  reason: collision with root package name */
    public final long f2755g;

    public static final class Info {

        /* renamed from: a  reason: collision with root package name */
        public final String f2756a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f2757b;

        @Deprecated
        public Info(String str, boolean z9) {
            this.f2756a = str;
            this.f2757b = z9;
        }

        public String getId() {
            return this.f2756a;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.f2757b;
        }

        public String toString() {
            String str = this.f2756a;
            boolean z9 = this.f2757b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z9);
            return sb.toString();
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000, false, false);
    }

    public AdvertisingIdClient(Context context, long j10, boolean z9, boolean z10) {
        Context applicationContext;
        this.f2752d = new Object();
        o.h(context);
        if (z9 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f2754f = context;
        this.f2751c = false;
        this.f2755g = j10;
    }

    public static void b(Info info, long j10, Throwable th) {
        if (Math.random() <= 0.0d) {
            String str = IronSourceConstants.BOOLEAN_TRUE_AS_STRING;
            HashMap c10 = v0.c("app_context", str);
            if (info != null) {
                if (true != info.isLimitAdTrackingEnabled()) {
                    str = "0";
                }
                c10.put("limit_ad_tracking", str);
                String id = info.getId();
                if (id != null) {
                    c10.put("ad_id_size", Integer.toString(id.length()));
                }
            }
            if (th != null) {
                c10.put("error", th.getClass().getName());
            }
            c10.put("tag", "AdvertisingIdClient");
            c10.put("time_spent", Long.toString(j10));
            new zza(c10).start();
        }
    }

    public static Info getAdvertisingIdInfo(Context context) {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.a(false);
            Info c10 = advertisingIdClient.c();
            b(c10, SystemClock.elapsedRealtime() - elapsedRealtime, (Throwable) null);
            advertisingIdClient.zza();
            return c10;
        } catch (Throwable th) {
            advertisingIdClient.zza();
            throw th;
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) {
        boolean a10;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, false, false);
        try {
            advertisingIdClient.a(false);
            o.g("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                if (!advertisingIdClient.f2751c) {
                    synchronized (advertisingIdClient.f2752d) {
                        zzb zzb = advertisingIdClient.f2753e;
                        if (zzb == null || !zzb.f2762d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        advertisingIdClient.a(false);
                        if (!advertisingIdClient.f2751c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (RemoteException e10) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                        throw new IOException("Remote exception");
                    } catch (Exception e11) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e11);
                    }
                }
                o.h(advertisingIdClient.f2749a);
                o.h(advertisingIdClient.f2750b);
                a10 = advertisingIdClient.f2750b.a();
            }
            advertisingIdClient.d();
            return a10;
        } finally {
            advertisingIdClient.zza();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z9) {
    }

    public final void a(boolean z9) {
        e eVar;
        o.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f2751c) {
                zza();
            }
            Context context = this.f2754f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int b10 = f.f10556b.b(context, 12451000);
                if (b10 != 0) {
                    if (b10 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                }
                a aVar = new a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (v3.a.b().a(context, intent, aVar, 1)) {
                    this.f2749a = aVar;
                    IBinder a10 = aVar.a(TimeUnit.MILLISECONDS);
                    int i10 = d.f2265a;
                    IInterface queryLocalInterface = a10.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    if (queryLocalInterface instanceof e) {
                        eVar = (e) queryLocalInterface;
                    } else {
                        eVar = new c(a10);
                    }
                    this.f2750b = eVar;
                    this.f2751c = true;
                    if (z9) {
                        d();
                    }
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                throw new g();
            } catch (InterruptedException unused2) {
                throw new IOException("Interrupted exception");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        }
    }

    public final Info c() {
        Info info;
        o.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f2751c) {
                synchronized (this.f2752d) {
                    zzb zzb = this.f2753e;
                    if (zzb == null || !zzb.f2762d) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    a(false);
                    if (!this.f2751c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e10) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                    throw new IOException("Remote exception");
                } catch (Exception e11) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e11);
                }
            }
            o.h(this.f2749a);
            o.h(this.f2750b);
            info = new Info(this.f2750b.zzc(), this.f2750b.zze());
        }
        d();
        return info;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f2752d
            monitor-enter(r0)
            com.google.android.gms.ads.identifier.zzb r1 = r5.f2753e     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0011
            java.util.concurrent.CountDownLatch r1 = r1.f2761c     // Catch:{ all -> 0x0022 }
            r1.countDown()     // Catch:{ all -> 0x0022 }
            com.google.android.gms.ads.identifier.zzb r1 = r5.f2753e     // Catch:{ InterruptedException -> 0x0011 }
            r1.join()     // Catch:{ InterruptedException -> 0x0011 }
        L_0x0011:
            long r1 = r5.f2755g     // Catch:{ all -> 0x0022 }
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0020
            com.google.android.gms.ads.identifier.zzb r3 = new com.google.android.gms.ads.identifier.zzb     // Catch:{ all -> 0x0022 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0022 }
            r5.f2753e = r3     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return
        L_0x0022:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.d():void");
    }

    public final void finalize() {
        zza();
        super.finalize();
    }

    public Info getInfo() {
        return c();
    }

    public void start() {
        a(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            r3.o.g(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f2754f     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            o3.a r0 = r3.f2749a     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0031
        L_0x000f:
            boolean r0 = r3.f2751c     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0027
            v3.a r0 = v3.a.b()     // Catch:{ all -> 0x001f }
            android.content.Context r1 = r3.f2754f     // Catch:{ all -> 0x001f }
            o3.a r2 = r3.f2749a     // Catch:{ all -> 0x001f }
            r0.c(r1, r2)     // Catch:{ all -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0033 }
        L_0x0027:
            r0 = 0
            r3.f2751c = r0     // Catch:{ all -> 0x0033 }
            r0 = 0
            r3.f2750b = r0     // Catch:{ all -> 0x0033 }
            r3.f2749a = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0031:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.zza():void");
    }
}
