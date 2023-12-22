package c6;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import d0.j;
import j6.i;
import j6.q;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import m.g;
import q3.b;
import r3.m;
import r3.o;
import w3.h;

public final class f {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f2493j = new Object();
    public static final m.b k = new m.b();

    /* renamed from: a  reason: collision with root package name */
    public final Context f2494a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2495b;

    /* renamed from: c  reason: collision with root package name */
    public final i f2496c;

    /* renamed from: d  reason: collision with root package name */
    public final i f2497d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f2498e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f2499f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    public final q<z6.a> f2500g;

    /* renamed from: h  reason: collision with root package name */
    public final u6.a<s6.f> f2501h;

    /* renamed from: i  reason: collision with root package name */
    public final CopyOnWriteArrayList f2502i = new CopyOnWriteArrayList();

    public interface a {
        void a(boolean z9);
    }

    @TargetApi(14)
    public static class b implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public static AtomicReference<b> f2503a = new AtomicReference<>();

        public final void a(boolean z9) {
            synchronized (f.f2493j) {
                Iterator it = new ArrayList(f.k.values()).iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    if (fVar.f2498e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it2 = fVar.f2502i.iterator();
                        while (it2.hasNext()) {
                            ((a) it2.next()).a(z9);
                        }
                    }
                }
            }
        }
    }

    @TargetApi(24)
    public static class c extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static AtomicReference<c> f2504b = new AtomicReference<>();

        /* renamed from: a  reason: collision with root package name */
        public final Context f2505a;

        public c(Context context) {
            this.f2505a = context;
        }

        public final void onReceive(Context context, Intent intent) {
            synchronized (f.f2493j) {
                Iterator it = ((g.e) f.k.values()).iterator();
                while (it.hasNext()) {
                    ((f) it.next()).g();
                }
            }
            this.f2505a.unregisterReceiver(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bb A[LOOP:1: B:24:0x00b5->B:26:0x00bb, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(android.content.Context r9, c6.i r10, java.lang.String r11) {
        /*
            r8 = this;
            r8.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r8.f2498e = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r8.f2499f = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r8.f2502i = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r8.f2494a = r9
            r3.o.e(r11)
            r8.f2495b = r11
            r8.f2496c = r10
            c6.a r11 = com.google.firebase.provider.FirebaseInitProvider.f3507a
            java.lang.String r0 = "Firebase"
            android.os.Trace.beginSection(r0)
            java.lang.String r0 = "ComponentDiscovery"
            android.os.Trace.beginSection(r0)
            java.lang.Class<com.google.firebase.components.ComponentDiscoveryService> r2 = com.google.firebase.components.ComponentDiscoveryService.class
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.content.pm.PackageManager r4 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0068 }
            if (r4 != 0) goto L_0x0043
            java.lang.String r2 = "Context has no PackageManager."
            goto L_0x0061
        L_0x0043:
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0068 }
            r5.<init>(r9, r2)     // Catch:{ NameNotFoundException -> 0x0068 }
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r4 = r4.getServiceInfo(r5, r6)     // Catch:{ NameNotFoundException -> 0x0068 }
            if (r4 != 0) goto L_0x0065
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0068 }
            r4.<init>()     // Catch:{ NameNotFoundException -> 0x0068 }
            r4.append(r2)     // Catch:{ NameNotFoundException -> 0x0068 }
            java.lang.String r2 = " has no service info."
            r4.append(r2)     // Catch:{ NameNotFoundException -> 0x0068 }
            java.lang.String r2 = r4.toString()     // Catch:{ NameNotFoundException -> 0x0068 }
        L_0x0061:
            android.util.Log.w(r0, r2)     // Catch:{ NameNotFoundException -> 0x0068 }
            goto L_0x006d
        L_0x0065:
            android.os.Bundle r2 = r4.metaData     // Catch:{ NameNotFoundException -> 0x0068 }
            goto L_0x006e
        L_0x0068:
            java.lang.String r2 = "Application info not found."
            android.util.Log.w(r0, r2)
        L_0x006d:
            r2 = 0
        L_0x006e:
            if (r2 != 0) goto L_0x007a
            java.lang.String r2 = "Could not retrieve metadata, returning empty list of registrars."
            android.util.Log.w(r0, r2)
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x00b1
        L_0x007a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r4 = r2.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0087:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00b1
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r2.get(r5)
            java.lang.String r7 = "com.google.firebase.components.ComponentRegistrar"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0087
            java.lang.String r6 = "com.google.firebase.components:"
            boolean r6 = r5.startsWith(r6)
            if (r6 == 0) goto L_0x0087
            r6 = 31
            java.lang.String r5 = r5.substring(r6)
            r0.add(r5)
            goto L_0x0087
        L_0x00b1:
            java.util.Iterator r0 = r0.iterator()
        L_0x00b5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00ca
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            j6.c r4 = new j6.c
            r4.<init>(r2)
            r3.add(r4)
            goto L_0x00b5
        L_0x00ca:
            android.os.Trace.endSection()
            java.lang.String r0 = "Runtime"
            android.os.Trace.beginSection(r0)
            k6.t r0 = k6.t.f9114a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.addAll(r3)
            com.google.firebase.FirebaseCommonRegistrar r3 = new com.google.firebase.FirebaseCommonRegistrar
            r3.<init>()
            j6.h r5 = new j6.h
            r5.<init>(r3)
            r2.add(r5)
            com.google.firebase.concurrent.ExecutorsRegistrar r3 = new com.google.firebase.concurrent.ExecutorsRegistrar
            r3.<init>()
            j6.h r5 = new j6.h
            r5.<init>(r3)
            r2.add(r5)
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            java.lang.Class[] r5 = new java.lang.Class[r1]
            j6.a r3 = j6.a.b(r9, r3, r5)
            r4.add(r3)
            java.lang.Class<c6.f> r3 = c6.f.class
            java.lang.Class[] r5 = new java.lang.Class[r1]
            j6.a r3 = j6.a.b(r8, r3, r5)
            r4.add(r3)
            java.lang.Class<c6.i> r3 = c6.i.class
            java.lang.Class[] r5 = new java.lang.Class[r1]
            j6.a r10 = j6.a.b(r10, r3, r5)
            r4.add(r10)
            d7.b r10 = new d7.b
            r10.<init>()
            boolean r3 = d0.j.a(r9)
            if (r3 == 0) goto L_0x013a
            java.util.concurrent.atomic.AtomicBoolean r3 = com.google.firebase.provider.FirebaseInitProvider.f3508b
            boolean r3 = r3.get()
            if (r3 == 0) goto L_0x013a
            java.lang.Class<c6.k> r3 = c6.k.class
            java.lang.Class[] r5 = new java.lang.Class[r1]
            j6.a r11 = j6.a.b(r11, r3, r5)
            r4.add(r11)
        L_0x013a:
            j6.i r11 = new j6.i
            r11.<init>(r0, r2, r4, r10)
            r8.f2497d = r11
            android.os.Trace.endSection()
            j6.q r10 = new j6.q
            c6.d r0 = new c6.d
            r0.<init>(r8, r1, r9)
            r10.<init>(r0)
            r8.f2500g = r10
            java.lang.Class<s6.f> r9 = s6.f.class
            u6.a r9 = r11.d(r9)
            r8.f2501h = r9
            c6.e r9 = new c6.e
            r9.<init>(r8)
            r8.a()
            java.util.concurrent.atomic.AtomicBoolean r10 = r8.f2498e
            boolean r10 = r10.get()
            if (r10 == 0) goto L_0x0176
            q3.b r10 = q3.b.f11201e
            java.util.concurrent.atomic.AtomicBoolean r10 = r10.f11202a
            boolean r10 = r10.get()
            if (r10 == 0) goto L_0x0176
            r10 = 1
            r9.a(r10)
        L_0x0176:
            java.util.concurrent.CopyOnWriteArrayList r10 = r8.f2502i
            r10.add(r9)
            android.os.Trace.endSection()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.f.<init>(android.content.Context, c6.i, java.lang.String):void");
    }

    public static ArrayList c() {
        ArrayList arrayList = new ArrayList();
        synchronized (f2493j) {
            Iterator it = ((g.e) k.values()).iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                fVar.a();
                arrayList.add(fVar.f2495b);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static f d() {
        f fVar;
        synchronized (f2493j) {
            fVar = (f) k.getOrDefault("[DEFAULT]", null);
            if (fVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + h.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return fVar;
    }

    public static f e(String str) {
        f fVar;
        String str2;
        synchronized (f2493j) {
            fVar = (f) k.getOrDefault(str.trim(), null);
            if (fVar != null) {
                fVar.f2501h.get().c();
            } else {
                ArrayList c10 = c();
                if (c10.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", c10);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", new Object[]{str, str2}));
            }
        }
        return fVar;
    }

    public static f h(Context context) {
        synchronized (f2493j) {
            if (k.containsKey("[DEFAULT]")) {
                f d10 = d();
                return d10;
            }
            i a10 = i.a(context);
            if (a10 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            f i10 = i(context, a10);
            return i10;
        }
    }

    public static f i(Context context, i iVar) {
        f fVar;
        boolean z9;
        AtomicReference<b> atomicReference = b.f2503a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            if (b.f2503a.get() == null) {
                b bVar = new b();
                AtomicReference<b> atomicReference2 = b.f2503a;
                while (true) {
                    if (!atomicReference2.compareAndSet((Object) null, bVar)) {
                        if (atomicReference2.get() != null) {
                            z9 = false;
                            break;
                        }
                    } else {
                        z9 = true;
                        break;
                    }
                }
                if (z9) {
                    q3.b.a(application);
                    q3.b bVar2 = q3.b.f11201e;
                    bVar2.getClass();
                    synchronized (bVar2) {
                        bVar2.f11204c.add(bVar);
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f2493j) {
            m.b bVar3 = k;
            o.j("FirebaseApp name [DEFAULT] already exists!", true ^ bVar3.containsKey("[DEFAULT]"));
            o.i(context, "Application context cannot be null.");
            fVar = new f(context, iVar, "[DEFAULT]");
            bVar3.put("[DEFAULT]", fVar);
        }
        fVar.g();
        return fVar;
    }

    public final void a() {
        o.j("FirebaseApp was deleted", !this.f2499f.get());
    }

    public final <T> T b(Class<T> cls) {
        a();
        return this.f2497d.a(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        String str = this.f2495b;
        f fVar = (f) obj;
        fVar.a();
        return str.equals(fVar.f2495b);
    }

    public final String f() {
        String str;
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.f2495b.getBytes(Charset.defaultCharset());
        String str2 = null;
        if (bytes == null) {
            str = null;
        } else {
            str = Base64.encodeToString(bytes, 11);
        }
        sb.append(str);
        sb.append("+");
        a();
        byte[] bytes2 = this.f2496c.f2507b.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str2 = Base64.encodeToString(bytes2, 11);
        }
        sb.append(str2);
        return sb.toString();
    }

    public final void g() {
        HashMap hashMap;
        boolean z9 = true;
        if (!j.a(this.f2494a)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.f2495b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f2494a;
            if (c.f2504b.get() == null) {
                c cVar = new c(context);
                AtomicReference<c> atomicReference = c.f2504b;
                while (true) {
                    if (!atomicReference.compareAndSet((Object) null, cVar)) {
                        if (atomicReference.get() != null) {
                            z9 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z9) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.f2495b);
        Log.i("FirebaseApp", sb2.toString());
        i iVar = this.f2497d;
        a();
        boolean equals = "[DEFAULT]".equals(this.f2495b);
        AtomicReference<Boolean> atomicReference2 = iVar.f8741e;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (!atomicReference2.compareAndSet((Object) null, valueOf)) {
                if (atomicReference2.get() != null) {
                    z9 = false;
                    break;
                }
            } else {
                break;
            }
        }
        if (z9) {
            synchronized (iVar) {
                hashMap = new HashMap(iVar.f8737a);
            }
            iVar.g(hashMap, equals);
        }
        this.f2501h.get().c();
    }

    public final int hashCode() {
        return this.f2495b.hashCode();
    }

    public final String toString() {
        m.a aVar = new m.a(this);
        aVar.a(this.f2495b, "name");
        aVar.a(this.f2496c, "options");
        return aVar.toString();
    }
}
