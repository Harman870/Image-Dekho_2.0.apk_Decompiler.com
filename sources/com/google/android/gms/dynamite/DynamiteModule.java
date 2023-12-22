package com.google.android.gms.dynamite;

import a4.e;
import a4.f;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import javax.annotation.concurrent.GuardedBy;
import q3.w0;
import r3.m;

public final class DynamiteModule {

    /* renamed from: b  reason: collision with root package name */
    public static final b f2815b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final c f2816c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final d f2817d = new d();
    @GuardedBy("DynamiteModule.class")

    /* renamed from: e  reason: collision with root package name */
    public static Boolean f2818e = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: f  reason: collision with root package name */
    public static String f2819f = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: g  reason: collision with root package name */
    public static boolean f2820g = false;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: h  reason: collision with root package name */
    public static int f2821h = -1;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: i  reason: collision with root package name */
    public static Boolean f2822i;

    /* renamed from: j  reason: collision with root package name */
    public static final ThreadLocal f2823j = new ThreadLocal();
    public static final w0 k = new w0(1);

    /* renamed from: l  reason: collision with root package name */
    public static final a f2824l = new a();
    @GuardedBy("DynamiteModule.class")

    /* renamed from: m  reason: collision with root package name */
    public static e f2825m;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: n  reason: collision with root package name */
    public static f f2826n;

    /* renamed from: a  reason: collision with root package name */
    public final Context f2827a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        public /* synthetic */ a(String str) {
            super(str);
        }

        public /* synthetic */ a(String str, Throwable th) {
            super(str, th);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str);

            int b(Context context, String str, boolean z9);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b  reason: collision with other inner class name */
        public static class C0024b {

            /* renamed from: a  reason: collision with root package name */
            public int f2828a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f2829b = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f2830c = 0;
        }

        C0024b a(Context context, String str, a aVar);
    }

    public DynamiteModule(Context context) {
        this.f2827a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (m.a(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:141:0x025f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0260, code lost:
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0263, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0264, code lost:
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0267, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0268, code lost:
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0181, code lost:
        r0 = th;
     */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02c9 A[Catch:{ all -> 0x034a }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x02fb A[SYNTHETIC, Splitter:B:178:0x02fb] */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.DynamiteModule c(android.content.Context r18, com.google.android.gms.dynamite.DynamiteModule.b r19, java.lang.String r20) {
        /*
            r1 = r18
            r2 = r20
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r3 = com.google.android.gms.dynamite.DynamiteModule.class
            android.content.Context r4 = r18.getApplicationContext()
            if (r4 == 0) goto L_0x036d
            java.lang.ThreadLocal r0 = f2823j
            java.lang.Object r5 = r0.get()
            a4.d r5 = (a4.d) r5
            a4.d r6 = new a4.d
            r7 = 0
            r6.<init>(r7)
            r0.set(r6)
            q3.w0 r8 = k
            java.lang.Object r9 = r8.get()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x034a }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x034a }
            r8.set(r13)     // Catch:{ all -> 0x034a }
            com.google.android.gms.dynamite.a r13 = f2824l     // Catch:{ all -> 0x034a }
            r14 = r19
            com.google.android.gms.dynamite.DynamiteModule$b$b r13 = r14.a(r1, r2, r13)     // Catch:{ all -> 0x034a }
            java.lang.String r15 = "DynamiteModule"
            int r7 = r13.f2828a     // Catch:{ all -> 0x034a }
            int r11 = r13.f2829b     // Catch:{ all -> 0x034a }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x034a }
            r12.<init>()     // Catch:{ all -> 0x034a }
            java.lang.String r14 = "Considering local module "
            r12.append(r14)     // Catch:{ all -> 0x034a }
            r12.append(r2)     // Catch:{ all -> 0x034a }
            java.lang.String r14 = ":"
            r12.append(r14)     // Catch:{ all -> 0x034a }
            r12.append(r7)     // Catch:{ all -> 0x034a }
            java.lang.String r7 = " and remote module "
            r12.append(r7)     // Catch:{ all -> 0x034a }
            r12.append(r2)     // Catch:{ all -> 0x034a }
            java.lang.String r7 = ":"
            r12.append(r7)     // Catch:{ all -> 0x034a }
            r12.append(r11)     // Catch:{ all -> 0x034a }
            java.lang.String r7 = r12.toString()     // Catch:{ all -> 0x034a }
            android.util.Log.i(r15, r7)     // Catch:{ all -> 0x034a }
            int r7 = r13.f2830c     // Catch:{ all -> 0x034a }
            if (r7 == 0) goto L_0x031a
            r11 = -1
            if (r7 != r11) goto L_0x007a
            int r7 = r13.f2828a     // Catch:{ all -> 0x034a }
            if (r7 == 0) goto L_0x031a
            r7 = r11
        L_0x007a:
            r12 = 1
            if (r7 != r12) goto L_0x0081
            int r14 = r13.f2829b     // Catch:{ all -> 0x034a }
            if (r14 == 0) goto L_0x031a
        L_0x0081:
            if (r7 != r11) goto L_0x00af
            java.lang.String r1 = "Selected local version of "
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x034a }
            java.lang.String r2 = "DynamiteModule"
            android.util.Log.i(r2, r1)     // Catch:{ all -> 0x034a }
            com.google.android.gms.dynamite.DynamiteModule r1 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ all -> 0x034a }
            r1.<init>(r4)     // Catch:{ all -> 0x034a }
            r2 = 0
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x009d
            r8.remove()
            goto L_0x00a4
        L_0x009d:
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r8.set(r2)
        L_0x00a4:
            android.database.Cursor r2 = r6.f56a
            if (r2 == 0) goto L_0x00ab
            r2.close()
        L_0x00ab:
            r0.set(r5)
            return r1
        L_0x00af:
            if (r7 != r12) goto L_0x0303
            int r7 = r13.f2829b     // Catch:{ a -> 0x0295 }
            monitor-enter(r3)     // Catch:{ RemoteException -> 0x0163, a -> 0x015e, all -> 0x026d }
            boolean r14 = g(r18)     // Catch:{ all -> 0x0256 }
            if (r14 == 0) goto L_0x024a
            java.lang.Boolean r14 = f2818e     // Catch:{ all -> 0x0256 }
            monitor-exit(r3)     // Catch:{ all -> 0x0256 }
            if (r14 == 0) goto L_0x023a
            boolean r14 = r14.booleanValue()     // Catch:{ RemoteException -> 0x0163, a -> 0x015e, all -> 0x026d }
            if (r14 == 0) goto L_0x0183
            java.lang.String r14 = "DynamiteModule"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0163, a -> 0x015e, all -> 0x026d }
            r12.<init>()     // Catch:{ RemoteException -> 0x0163, a -> 0x015e, all -> 0x026d }
            java.lang.String r11 = "Selected remote version of "
            r12.append(r11)     // Catch:{ RemoteException -> 0x0163, a -> 0x015e, all -> 0x026d }
            r12.append(r2)     // Catch:{ RemoteException -> 0x0163, a -> 0x015e, all -> 0x026d }
            java.lang.String r11 = ", version >= "
            r12.append(r11)     // Catch:{ RemoteException -> 0x0163, a -> 0x015e, all -> 0x026d }
            r12.append(r7)     // Catch:{ RemoteException -> 0x0163, a -> 0x015e, all -> 0x026d }
            java.lang.String r11 = r12.toString()     // Catch:{ RemoteException -> 0x0163, a -> 0x015e, all -> 0x026d }
            android.util.Log.i(r14, r11)     // Catch:{ RemoteException -> 0x0163, a -> 0x015e, all -> 0x026d }
            monitor-enter(r3)     // Catch:{ RemoteException -> 0x0163, a -> 0x015e, all -> 0x026d }
            a4.f r11 = f2826n     // Catch:{ all -> 0x017c }
            monitor-exit(r3)     // Catch:{ all -> 0x017c }
            if (r11 == 0) goto L_0x0172
            java.lang.Object r12 = r0.get()     // Catch:{ RemoteException -> 0x0163, a -> 0x015e, all -> 0x026d }
            a4.d r12 = (a4.d) r12     // Catch:{ RemoteException -> 0x0163, a -> 0x015e, all -> 0x026d }
            if (r12 == 0) goto L_0x0168
            android.database.Cursor r14 = r12.f56a     // Catch:{ RemoteException -> 0x0163, a -> 0x015e, all -> 0x026d }
            if (r14 == 0) goto L_0x0168
            android.content.Context r14 = r18.getApplicationContext()     // Catch:{ RemoteException -> 0x0163, a -> 0x015e, all -> 0x026d }
            android.database.Cursor r12 = r12.f56a     // Catch:{ RemoteException -> 0x0163, a -> 0x015e, all -> 0x026d }
            z3.b r15 = new z3.b     // Catch:{ RemoteException -> 0x0163, a -> 0x015e, all -> 0x026d }
            r17 = r4
            r4 = 0
            r15.<init>(r4)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            monitor-enter(r3)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            int r4 = f2821h     // Catch:{ all -> 0x015b }
            r15 = 2
            if (r4 < r15) goto L_0x010c
            r16 = 1
            goto L_0x010e
        L_0x010c:
            r16 = 0
        L_0x010e:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r16)     // Catch:{ all -> 0x015b }
            monitor-exit(r3)     // Catch:{ all -> 0x015b }
            boolean r3 = r4.booleanValue()     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            if (r3 == 0) goto L_0x012f
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r4 = "Dynamite loader version >= 2, using loadModule2NoCrashUtils"
            android.util.Log.v(r3, r4)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            z3.b r3 = new z3.b     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            r3.<init>(r14)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            z3.b r4 = new z3.b     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            r4.<init>(r12)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            z3.a r3 = r11.E(r3, r2, r7, r4)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            goto L_0x0144
        L_0x012f:
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r4 = "Dynamite loader version < 2, falling back to loadModule2"
            android.util.Log.w(r3, r4)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            z3.b r3 = new z3.b     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            r3.<init>(r14)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            z3.b r4 = new z3.b     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            r4.<init>(r12)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            z3.a r3 = r11.d(r3, r2, r7, r4)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
        L_0x0144:
            java.lang.Object r3 = z3.b.F(r3)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            android.content.Context r3 = (android.content.Context) r3     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            if (r3 == 0) goto L_0x0153
            com.google.android.gms.dynamite.DynamiteModule r4 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            r4.<init>(r3)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            goto L_0x020e
        L_0x0153:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            java.lang.String r3 = "Failed to get module context"
            r0.<init>(r3)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            throw r0     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
        L_0x015b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x015b }
            throw r0     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
        L_0x015e:
            r0 = move-exception
            r17 = r4
            goto L_0x0280
        L_0x0163:
            r0 = move-exception
            r17 = r4
            goto L_0x0286
        L_0x0168:
            r17 = r4
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            java.lang.String r3 = "No result cursor"
            r0.<init>(r3)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            throw r0     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
        L_0x0172:
            r17 = r4
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            java.lang.String r3 = "DynamiteLoaderV2 was not cached."
            r0.<init>(r3)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            throw r0     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
        L_0x017c:
            r0 = move-exception
            r17 = r4
        L_0x017f:
            monitor-exit(r3)     // Catch:{ all -> 0x0181 }
            throw r0     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
        L_0x0181:
            r0 = move-exception
            goto L_0x017f
        L_0x0183:
            r17 = r4
            java.lang.String r3 = "DynamiteModule"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            r4.<init>()     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            java.lang.String r11 = "Selected remote version of "
            r4.append(r11)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            r4.append(r2)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            java.lang.String r11 = ", version >= "
            r4.append(r11)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            r4.append(r7)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            java.lang.String r4 = r4.toString()     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            android.util.Log.i(r3, r4)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            a4.e r3 = h(r18)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            if (r3 == 0) goto L_0x0232
            android.os.Parcel r4 = r3.c()     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            r11 = 6
            android.os.Parcel r4 = r3.b(r11, r4)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            int r11 = r4.readInt()     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            r4.recycle()     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            r4 = 3
            if (r11 < r4) goto L_0x01dd
            java.lang.Object r4 = r0.get()     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            a4.d r4 = (a4.d) r4     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            if (r4 == 0) goto L_0x01d5
            z3.b r11 = new z3.b     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            r11.<init>(r1)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            android.database.Cursor r4 = r4.f56a     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            z3.b r12 = new z3.b     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            r12.<init>(r4)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            z3.a r3 = r3.E(r11, r2, r7, r12)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            goto L_0x0201
        L_0x01d5:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            java.lang.String r3 = "No cached result cursor holder"
            r0.<init>(r3)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            throw r0     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
        L_0x01dd:
            r4 = 2
            if (r11 != r4) goto L_0x01f1
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r11 = "IDynamite loader version = 2"
            android.util.Log.w(r4, r11)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            z3.b r4 = new z3.b     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            r4.<init>(r1)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            z3.a r3 = r3.F(r4, r2, r7)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            goto L_0x0201
        L_0x01f1:
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r11 = "Dynamite loader version < 2, falling back to createModuleContext"
            android.util.Log.w(r4, r11)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            z3.b r4 = new z3.b     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            r4.<init>(r1)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            z3.a r3 = r3.d(r4, r2, r7)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
        L_0x0201:
            java.lang.Object r3 = z3.b.F(r3)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            if (r3 == 0) goto L_0x022a
            com.google.android.gms.dynamite.DynamiteModule r4 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            android.content.Context r3 = (android.content.Context) r3     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            r4.<init>(r3)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
        L_0x020e:
            r1 = 0
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0218
            r8.remove()
            goto L_0x021f
        L_0x0218:
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            r8.set(r1)
        L_0x021f:
            android.database.Cursor r1 = r6.f56a
            if (r1 == 0) goto L_0x0226
            r1.close()
        L_0x0226:
            r0.set(r5)
            return r4
        L_0x022a:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            java.lang.String r3 = "Failed to load remote module."
            r0.<init>(r3)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            throw r0     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
        L_0x0232:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            java.lang.String r3 = "Failed to create IDynamiteLoader."
            r0.<init>(r3)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            throw r0     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
        L_0x023a:
            r17 = r4
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            java.lang.String r3 = "Failed to determine which loading route to use."
            r0.<init>(r3)     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
            throw r0     // Catch:{ RemoteException -> 0x0248, a -> 0x0246, all -> 0x0244 }
        L_0x0244:
            r0 = move-exception
            goto L_0x0270
        L_0x0246:
            r0 = move-exception
            goto L_0x0280
        L_0x0248:
            r0 = move-exception
            goto L_0x0286
        L_0x024a:
            r17 = r4
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x0254 }
            java.lang.String r4 = "Remote loading disabled"
            r0.<init>(r4)     // Catch:{ all -> 0x0254 }
            throw r0     // Catch:{ all -> 0x0254 }
        L_0x0254:
            r0 = move-exception
            goto L_0x0259
        L_0x0256:
            r0 = move-exception
            r17 = r4
        L_0x0259:
            r4 = r3
            r3 = r2
            r2 = r19
        L_0x025d:
            monitor-exit(r4)     // Catch:{ all -> 0x026b }
            throw r0     // Catch:{ RemoteException -> 0x0267, a -> 0x0263, all -> 0x025f }
        L_0x025f:
            r0 = move-exception
            r4 = r17
            goto L_0x0275
        L_0x0263:
            r0 = move-exception
            r4 = r17
            goto L_0x0285
        L_0x0267:
            r0 = move-exception
            r4 = r17
            goto L_0x028b
        L_0x026b:
            r0 = move-exception
            goto L_0x025d
        L_0x026d:
            r0 = move-exception
            r17 = r4
        L_0x0270:
            r3 = r2
            r4 = r17
            r2 = r19
        L_0x0275:
            w3.c.a(r1, r0)     // Catch:{ a -> 0x0293 }
            com.google.android.gms.dynamite.DynamiteModule$a r7 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ a -> 0x0293 }
            java.lang.String r8 = "Failed to load remote module."
            r7.<init>(r8, r0)     // Catch:{ a -> 0x0293 }
            throw r7     // Catch:{ a -> 0x0293 }
        L_0x0280:
            r3 = r2
            r4 = r17
            r2 = r19
        L_0x0285:
            throw r0     // Catch:{ a -> 0x0293 }
        L_0x0286:
            r3 = r2
            r4 = r17
            r2 = r19
        L_0x028b:
            com.google.android.gms.dynamite.DynamiteModule$a r7 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ a -> 0x0293 }
            java.lang.String r8 = "Failed to load remote module."
            r7.<init>(r8, r0)     // Catch:{ a -> 0x0293 }
            throw r7     // Catch:{ a -> 0x0293 }
        L_0x0293:
            r0 = move-exception
            goto L_0x029d
        L_0x0295:
            r0 = move-exception
            r17 = r4
            r3 = r2
            r4 = r17
            r2 = r19
        L_0x029d:
            java.lang.String r7 = "DynamiteModule"
            java.lang.String r8 = r0.getMessage()     // Catch:{ all -> 0x034a }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x034a }
            r11.<init>()     // Catch:{ all -> 0x034a }
            java.lang.String r12 = "Failed to load remote module: "
            r11.append(r12)     // Catch:{ all -> 0x034a }
            r11.append(r8)     // Catch:{ all -> 0x034a }
            java.lang.String r8 = r11.toString()     // Catch:{ all -> 0x034a }
            android.util.Log.w(r7, r8)     // Catch:{ all -> 0x034a }
            int r7 = r13.f2828a     // Catch:{ all -> 0x034a }
            if (r7 == 0) goto L_0x02fb
            com.google.android.gms.dynamite.e r8 = new com.google.android.gms.dynamite.e     // Catch:{ all -> 0x034a }
            r8.<init>(r7)     // Catch:{ all -> 0x034a }
            com.google.android.gms.dynamite.DynamiteModule$b$b r1 = r2.a(r1, r3, r8)     // Catch:{ all -> 0x034a }
            int r1 = r1.f2830c     // Catch:{ all -> 0x034a }
            r2 = -1
            if (r1 != r2) goto L_0x02fb
            java.lang.String r0 = "Selected local version of "
            java.lang.String r0 = r0.concat(r3)     // Catch:{ all -> 0x034a }
            java.lang.String r1 = "DynamiteModule"
            android.util.Log.i(r1, r0)     // Catch:{ all -> 0x034a }
            com.google.android.gms.dynamite.DynamiteModule r0 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ all -> 0x034a }
            r0.<init>(r4)     // Catch:{ all -> 0x034a }
            r1 = 0
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x02e5
            q3.w0 r1 = k
            r1.remove()
            goto L_0x02ee
        L_0x02e5:
            q3.w0 r1 = k
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r1.set(r2)
        L_0x02ee:
            android.database.Cursor r1 = r6.f56a
            if (r1 == 0) goto L_0x02f5
            r1.close()
        L_0x02f5:
            java.lang.ThreadLocal r1 = f2823j
            r1.set(r5)
            return r0
        L_0x02fb:
            com.google.android.gms.dynamite.DynamiteModule$a r1 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x034a }
            java.lang.String r2 = "Remote load failed. No local fallback found."
            r1.<init>(r2, r0)     // Catch:{ all -> 0x034a }
            throw r1     // Catch:{ all -> 0x034a }
        L_0x0303:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x034a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x034a }
            r1.<init>()     // Catch:{ all -> 0x034a }
            java.lang.String r2 = "VersionPolicy returned invalid code:"
            r1.append(r2)     // Catch:{ all -> 0x034a }
            r1.append(r7)     // Catch:{ all -> 0x034a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x034a }
            r0.<init>(r1)     // Catch:{ all -> 0x034a }
            throw r0     // Catch:{ all -> 0x034a }
        L_0x031a:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x034a }
            int r1 = r13.f2828a     // Catch:{ all -> 0x034a }
            int r3 = r13.f2829b     // Catch:{ all -> 0x034a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x034a }
            r4.<init>()     // Catch:{ all -> 0x034a }
            java.lang.String r7 = "No acceptable module "
            r4.append(r7)     // Catch:{ all -> 0x034a }
            r4.append(r2)     // Catch:{ all -> 0x034a }
            java.lang.String r2 = " found. Local version is "
            r4.append(r2)     // Catch:{ all -> 0x034a }
            r4.append(r1)     // Catch:{ all -> 0x034a }
            java.lang.String r1 = " and remote version is "
            r4.append(r1)     // Catch:{ all -> 0x034a }
            r4.append(r3)     // Catch:{ all -> 0x034a }
            java.lang.String r1 = "."
            r4.append(r1)     // Catch:{ all -> 0x034a }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x034a }
            r0.<init>(r1)     // Catch:{ all -> 0x034a }
            throw r0     // Catch:{ all -> 0x034a }
        L_0x034a:
            r0 = move-exception
            r1 = 0
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0357
            q3.w0 r1 = k
            r1.remove()
            goto L_0x0360
        L_0x0357:
            q3.w0 r1 = k
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r1.set(r2)
        L_0x0360:
            android.database.Cursor r1 = r6.f56a
            if (r1 == 0) goto L_0x0367
            r1.close()
        L_0x0367:
            java.lang.ThreadLocal r1 = f2823j
            r1.set(r5)
            throw r0
        L_0x036d:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a
            java.lang.String r1 = "null application Context"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.c(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:29:0x0054=Splitter:B:29:0x0054, B:48:0x0098=Splitter:B:48:0x0098, B:16:0x003a=Splitter:B:16:0x003a} */
    public static int d(android.content.Context r11, java.lang.String r12, boolean r13) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x0203 }
            java.lang.Boolean r1 = f2818e     // Catch:{ all -> 0x0200 }
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x00d2
            android.content.Context r1 = r11.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00b3, IllegalAccessException -> 0x00b1, NoSuchFieldException -> 0x00af }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00b3, IllegalAccessException -> 0x00b1, NoSuchFieldException -> 0x00af }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r5 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r5 = r5.getName()     // Catch:{ ClassNotFoundException -> 0x00b3, IllegalAccessException -> 0x00b1, NoSuchFieldException -> 0x00af }
            java.lang.Class r1 = r1.loadClass(r5)     // Catch:{ ClassNotFoundException -> 0x00b3, IllegalAccessException -> 0x00b1, NoSuchFieldException -> 0x00af }
            java.lang.String r5 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r5)     // Catch:{ ClassNotFoundException -> 0x00b3, IllegalAccessException -> 0x00b1, NoSuchFieldException -> 0x00af }
            java.lang.Class r5 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00b3, IllegalAccessException -> 0x00b1, NoSuchFieldException -> 0x00af }
            monitor-enter(r5)     // Catch:{ ClassNotFoundException -> 0x00b3, IllegalAccessException -> 0x00b1, NoSuchFieldException -> 0x00af }
            java.lang.Object r6 = r1.get(r2)     // Catch:{ all -> 0x00ac }
            java.lang.ClassLoader r6 = (java.lang.ClassLoader) r6     // Catch:{ all -> 0x00ac }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00ac }
            if (r6 != r7) goto L_0x0035
            goto L_0x00a8
        L_0x0035:
            if (r6 == 0) goto L_0x003e
            f(r6)     // Catch:{ a -> 0x003a }
        L_0x003a:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00ac }
            goto L_0x00aa
        L_0x003e:
            boolean r6 = g(r11)     // Catch:{ all -> 0x00ac }
            if (r6 != 0) goto L_0x0047
            monitor-exit(r5)     // Catch:{ all -> 0x00ac }
            monitor-exit(r0)     // Catch:{ all -> 0x0200 }
            return r4
        L_0x0047:
            boolean r6 = f2820g     // Catch:{ all -> 0x00ac }
            if (r6 != 0) goto L_0x00a3
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00ac }
            boolean r7 = r6.equals(r2)     // Catch:{ all -> 0x00ac }
            if (r7 == 0) goto L_0x0054
            goto L_0x00a3
        L_0x0054:
            int r7 = e(r11, r12, r13, r3)     // Catch:{ a -> 0x009b }
            java.lang.String r8 = f2819f     // Catch:{ a -> 0x009b }
            if (r8 == 0) goto L_0x0098
            boolean r8 = r8.isEmpty()     // Catch:{ a -> 0x009b }
            if (r8 == 0) goto L_0x0063
            goto L_0x0098
        L_0x0063:
            java.lang.ClassLoader r8 = a4.b.a()     // Catch:{ a -> 0x009b }
            if (r8 == 0) goto L_0x006a
            goto L_0x008d
        L_0x006a:
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ a -> 0x009b }
            r9 = 29
            if (r8 < r9) goto L_0x007f
            dalvik.system.DelegateLastClassLoader r8 = new dalvik.system.DelegateLastClassLoader     // Catch:{ a -> 0x009b }
            java.lang.String r9 = f2819f     // Catch:{ a -> 0x009b }
            r3.o.h(r9)     // Catch:{ a -> 0x009b }
            java.lang.ClassLoader r10 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x009b }
            r8.<init>(r9, r10)     // Catch:{ a -> 0x009b }
            goto L_0x008d
        L_0x007f:
            a4.c r8 = new a4.c     // Catch:{ a -> 0x009b }
            java.lang.String r9 = f2819f     // Catch:{ a -> 0x009b }
            r3.o.h(r9)     // Catch:{ a -> 0x009b }
            java.lang.ClassLoader r10 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x009b }
            r8.<init>(r10, r9)     // Catch:{ a -> 0x009b }
        L_0x008d:
            f(r8)     // Catch:{ a -> 0x009b }
            r1.set(r2, r8)     // Catch:{ a -> 0x009b }
            f2818e = r6     // Catch:{ a -> 0x009b }
            monitor-exit(r5)     // Catch:{ all -> 0x00ac }
            monitor-exit(r0)     // Catch:{ all -> 0x0200 }
            return r7
        L_0x0098:
            monitor-exit(r5)     // Catch:{ all -> 0x00ac }
            monitor-exit(r0)     // Catch:{ all -> 0x0200 }
            return r7
        L_0x009b:
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00ac }
        L_0x009f:
            r1.set(r2, r6)     // Catch:{ all -> 0x00ac }
            goto L_0x00a8
        L_0x00a3:
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00ac }
            goto L_0x009f
        L_0x00a8:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00ac }
        L_0x00aa:
            monitor-exit(r5)     // Catch:{ all -> 0x00ac }
            goto L_0x00d0
        L_0x00ac:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00ac }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00b3, IllegalAccessException -> 0x00b1, NoSuchFieldException -> 0x00af }
        L_0x00af:
            r1 = move-exception
            goto L_0x00b4
        L_0x00b1:
            r1 = move-exception
            goto L_0x00b4
        L_0x00b3:
            r1 = move-exception
        L_0x00b4:
            java.lang.String r5 = "DynamiteModule"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0200 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0200 }
            r6.<init>()     // Catch:{ all -> 0x0200 }
            java.lang.String r7 = "Failed to load module via V2: "
            r6.append(r7)     // Catch:{ all -> 0x0200 }
            r6.append(r1)     // Catch:{ all -> 0x0200 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0200 }
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x0200 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0200 }
        L_0x00d0:
            f2818e = r1     // Catch:{ all -> 0x0200 }
        L_0x00d2:
            monitor-exit(r0)     // Catch:{ all -> 0x0200 }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x0203 }
            if (r0 == 0) goto L_0x00fa
            int r11 = e(r11, r12, r13, r4)     // Catch:{ a -> 0x00de }
            return r11
        L_0x00de:
            r12 = move-exception
            java.lang.String r13 = "DynamiteModule"
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x0203 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0203 }
            r0.<init>()     // Catch:{ all -> 0x0203 }
            java.lang.String r1 = "Failed to retrieve remote module version: "
            r0.append(r1)     // Catch:{ all -> 0x0203 }
            r0.append(r12)     // Catch:{ all -> 0x0203 }
            java.lang.String r12 = r0.toString()     // Catch:{ all -> 0x0203 }
            android.util.Log.w(r13, r12)     // Catch:{ all -> 0x0203 }
            return r4
        L_0x00fa:
            a4.e r5 = h(r11)     // Catch:{ all -> 0x0203 }
            if (r5 != 0) goto L_0x0102
            goto L_0x01f7
        L_0x0102:
            android.os.Parcel r0 = r5.c()     // Catch:{ RemoteException -> 0x0186 }
            r1 = 6
            android.os.Parcel r0 = r5.b(r1, r0)     // Catch:{ RemoteException -> 0x0186 }
            int r1 = r0.readInt()     // Catch:{ RemoteException -> 0x0186 }
            r0.recycle()     // Catch:{ RemoteException -> 0x0186 }
            r0 = 3
            if (r1 < r0) goto L_0x0188
            java.lang.ThreadLocal r0 = f2823j     // Catch:{ RemoteException -> 0x0186 }
            java.lang.Object r1 = r0.get()     // Catch:{ RemoteException -> 0x0186 }
            a4.d r1 = (a4.d) r1     // Catch:{ RemoteException -> 0x0186 }
            if (r1 == 0) goto L_0x0129
            android.database.Cursor r1 = r1.f56a     // Catch:{ RemoteException -> 0x0186 }
            if (r1 == 0) goto L_0x0129
            int r4 = r1.getInt(r4)     // Catch:{ RemoteException -> 0x0186 }
            goto L_0x01f7
        L_0x0129:
            z3.b r6 = new z3.b     // Catch:{ RemoteException -> 0x0186 }
            r6.<init>(r11)     // Catch:{ RemoteException -> 0x0186 }
            q3.w0 r1 = k     // Catch:{ RemoteException -> 0x0186 }
            java.lang.Object r1 = r1.get()     // Catch:{ RemoteException -> 0x0186 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ RemoteException -> 0x0186 }
            long r9 = r1.longValue()     // Catch:{ RemoteException -> 0x0186 }
            r7 = r12
            r8 = r13
            z3.a r12 = r5.G(r6, r7, r8, r9)     // Catch:{ RemoteException -> 0x0186 }
            java.lang.Object r12 = z3.b.F(r12)     // Catch:{ RemoteException -> 0x0186 }
            android.database.Cursor r12 = (android.database.Cursor) r12     // Catch:{ RemoteException -> 0x0186 }
            if (r12 == 0) goto L_0x0172
            boolean r13 = r12.moveToFirst()     // Catch:{ RemoteException -> 0x0180, all -> 0x0164 }
            if (r13 != 0) goto L_0x014f
            goto L_0x0172
        L_0x014f:
            int r13 = r12.getInt(r4)     // Catch:{ RemoteException -> 0x0180, all -> 0x0164 }
            if (r13 <= 0) goto L_0x016b
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0180, all -> 0x0164 }
            a4.d r0 = (a4.d) r0     // Catch:{ RemoteException -> 0x0180, all -> 0x0164 }
            if (r0 == 0) goto L_0x0167
            android.database.Cursor r1 = r0.f56a     // Catch:{ RemoteException -> 0x0180, all -> 0x0164 }
            if (r1 != 0) goto L_0x0167
            r0.f56a = r12     // Catch:{ RemoteException -> 0x0180, all -> 0x0164 }
            goto L_0x0168
        L_0x0164:
            r13 = move-exception
            goto L_0x01fa
        L_0x0167:
            r3 = r4
        L_0x0168:
            if (r3 == 0) goto L_0x016b
            goto L_0x016c
        L_0x016b:
            r2 = r12
        L_0x016c:
            if (r2 == 0) goto L_0x01d5
            r2.close()     // Catch:{ all -> 0x0203 }
            goto L_0x01d5
        L_0x0172:
            java.lang.String r13 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r13, r0)     // Catch:{ RemoteException -> 0x0180, all -> 0x0164 }
            if (r12 == 0) goto L_0x01f7
            r12.close()     // Catch:{ all -> 0x0203 }
            goto L_0x01f7
        L_0x0180:
            r13 = move-exception
            r2 = r12
            goto L_0x01d8
        L_0x0183:
            r12 = move-exception
            goto L_0x01f8
        L_0x0186:
            r12 = move-exception
            goto L_0x01d7
        L_0x0188:
            r3 = 2
            if (r1 != r3) goto L_0x01b1
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r1 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r0, r1)     // Catch:{ RemoteException -> 0x0186 }
            z3.b r0 = new z3.b     // Catch:{ RemoteException -> 0x0186 }
            r0.<init>(r11)     // Catch:{ RemoteException -> 0x0186 }
            android.os.Parcel r1 = r5.c()     // Catch:{ RemoteException -> 0x0186 }
            h4.a.c(r1, r0)     // Catch:{ RemoteException -> 0x0186 }
            r1.writeString(r12)     // Catch:{ RemoteException -> 0x0186 }
            r1.writeInt(r13)     // Catch:{ RemoteException -> 0x0186 }
            r12 = 5
            android.os.Parcel r12 = r5.b(r12, r1)     // Catch:{ RemoteException -> 0x0186 }
            int r13 = r12.readInt()     // Catch:{ RemoteException -> 0x0186 }
            r12.recycle()     // Catch:{ RemoteException -> 0x0186 }
            goto L_0x01d5
        L_0x01b1:
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r3 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r1, r3)     // Catch:{ RemoteException -> 0x0186 }
            z3.b r1 = new z3.b     // Catch:{ RemoteException -> 0x0186 }
            r1.<init>(r11)     // Catch:{ RemoteException -> 0x0186 }
            android.os.Parcel r3 = r5.c()     // Catch:{ RemoteException -> 0x0186 }
            h4.a.c(r3, r1)     // Catch:{ RemoteException -> 0x0186 }
            r3.writeString(r12)     // Catch:{ RemoteException -> 0x0186 }
            r3.writeInt(r13)     // Catch:{ RemoteException -> 0x0186 }
            android.os.Parcel r12 = r5.b(r0, r3)     // Catch:{ RemoteException -> 0x0186 }
            int r13 = r12.readInt()     // Catch:{ RemoteException -> 0x0186 }
            r12.recycle()     // Catch:{ RemoteException -> 0x0186 }
        L_0x01d5:
            r4 = r13
            goto L_0x01f7
        L_0x01d7:
            r13 = r12
        L_0x01d8:
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r13 = r13.getMessage()     // Catch:{ all -> 0x0183 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0183 }
            r0.<init>()     // Catch:{ all -> 0x0183 }
            java.lang.String r1 = "Failed to retrieve remote module version: "
            r0.append(r1)     // Catch:{ all -> 0x0183 }
            r0.append(r13)     // Catch:{ all -> 0x0183 }
            java.lang.String r13 = r0.toString()     // Catch:{ all -> 0x0183 }
            android.util.Log.w(r12, r13)     // Catch:{ all -> 0x0183 }
            if (r2 == 0) goto L_0x01f7
            r2.close()     // Catch:{ all -> 0x0203 }
        L_0x01f7:
            return r4
        L_0x01f8:
            r13 = r12
            r12 = r2
        L_0x01fa:
            if (r12 == 0) goto L_0x01ff
            r12.close()     // Catch:{ all -> 0x0203 }
        L_0x01ff:
            throw r13     // Catch:{ all -> 0x0203 }
        L_0x0200:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0200 }
            throw r12     // Catch:{ all -> 0x0203 }
        L_0x0203:
            r12 = move-exception
            w3.c.a(r11, r12)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.d(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d4 A[Catch:{ all -> 0x00f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d5 A[Catch:{ all -> 0x00f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int e(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            r0 = 0
            q3.w0 r1 = k     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L_0x0019
            r10 = r4
        L_0x0019:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            r12.<init>()     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            if (r10 == 0) goto L_0x00b6
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x00c8, all -> 0x00c5 }
            if (r11 == 0) goto L_0x00b6
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch:{ Exception -> 0x00c8, all -> 0x00c5 }
            if (r12 <= 0) goto L_0x00a0
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x00c8, all -> 0x00c5 }
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch:{ all -> 0x009d }
            f2819f = r2     // Catch:{ all -> 0x009d }
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x009d }
            if (r2 < 0) goto L_0x006f
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x009d }
            f2821h = r2     // Catch:{ all -> 0x009d }
        L_0x006f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader2"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x009d }
            if (r2 < 0) goto L_0x0083
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x009d }
            if (r2 == 0) goto L_0x007f
            r2 = r9
            goto L_0x0080
        L_0x007f:
            r2 = r11
        L_0x0080:
            f2820g = r2     // Catch:{ all -> 0x009d }
            goto L_0x0084
        L_0x0083:
            r2 = r11
        L_0x0084:
            monitor-exit(r1)     // Catch:{ all -> 0x009d }
            java.lang.ThreadLocal r1 = f2823j     // Catch:{ Exception -> 0x00c8, all -> 0x00c5 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00c8, all -> 0x00c5 }
            a4.d r1 = (a4.d) r1     // Catch:{ Exception -> 0x00c8, all -> 0x00c5 }
            if (r1 == 0) goto L_0x0096
            android.database.Cursor r3 = r1.f56a     // Catch:{ Exception -> 0x00c8, all -> 0x00c5 }
            if (r3 != 0) goto L_0x0096
            r1.f56a = r10     // Catch:{ Exception -> 0x00c8, all -> 0x00c5 }
            goto L_0x0097
        L_0x0096:
            r9 = r11
        L_0x0097:
            if (r9 == 0) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r0 = r10
        L_0x009b:
            r11 = r2
            goto L_0x00a1
        L_0x009d:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x009d }
            throw r11     // Catch:{ Exception -> 0x00c8, all -> 0x00c5 }
        L_0x00a0:
            r0 = r10
        L_0x00a1:
            if (r13 == 0) goto L_0x00b0
            if (r11 != 0) goto L_0x00a6
            goto L_0x00b0
        L_0x00a6:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x00ae }
            java.lang.String r11 = "forcing fallback to container DynamiteLoader impl"
            r10.<init>(r11)     // Catch:{ Exception -> 0x00ae }
            throw r10     // Catch:{ Exception -> 0x00ae }
        L_0x00ae:
            r11 = move-exception
            goto L_0x00cf
        L_0x00b0:
            if (r0 == 0) goto L_0x00b5
            r0.close()
        L_0x00b5:
            return r12
        L_0x00b6:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch:{ Exception -> 0x00c8, all -> 0x00c5 }
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x00c8, all -> 0x00c5 }
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12)     // Catch:{ Exception -> 0x00c8, all -> 0x00c5 }
            throw r11     // Catch:{ Exception -> 0x00c8, all -> 0x00c5 }
        L_0x00c5:
            r11 = move-exception
            r0 = r10
            goto L_0x00f1
        L_0x00c8:
            r11 = move-exception
            r0 = r10
            goto L_0x00cf
        L_0x00cb:
            r10 = move-exception
            goto L_0x00f2
        L_0x00cd:
            r10 = move-exception
            r11 = r10
        L_0x00cf:
            boolean r10 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.a     // Catch:{ all -> 0x00f0 }
            if (r10 == 0) goto L_0x00d5
            throw r11     // Catch:{ all -> 0x00f0 }
        L_0x00d5:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x00f0 }
            java.lang.String r12 = r11.getMessage()     // Catch:{ all -> 0x00f0 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f0 }
            r13.<init>()     // Catch:{ all -> 0x00f0 }
            java.lang.String r1 = "V2 version check failed: "
            r13.append(r1)     // Catch:{ all -> 0x00f0 }
            r13.append(r12)     // Catch:{ all -> 0x00f0 }
            java.lang.String r12 = r13.toString()     // Catch:{ all -> 0x00f0 }
            r10.<init>(r12, r11)     // Catch:{ all -> 0x00f0 }
            throw r10     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r11 = move-exception
        L_0x00f1:
            r10 = r11
        L_0x00f2:
            if (r0 == 0) goto L_0x00f7
            r0.close()
        L_0x00f7:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @javax.annotation.concurrent.GuardedBy("DynamiteModule.class")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void f(java.lang.ClassLoader r2) {
        /*
            java.lang.String r0 = "com.google.android.gms.dynamiteloader.DynamiteLoaderV2"
            java.lang.Class r2 = r2.loadClass(r0)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r1)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            java.lang.Object r2 = r2.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            if (r2 != 0) goto L_0x0019
            r2 = 0
            goto L_0x002d
        L_0x0019:
            java.lang.String r0 = "com.google.android.gms.dynamite.IDynamiteLoaderV2"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            boolean r1 = r0 instanceof a4.f     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            if (r1 == 0) goto L_0x0027
            r2 = r0
            a4.f r2 = (a4.f) r2     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            goto L_0x002d
        L_0x0027:
            a4.f r0 = new a4.f     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            r0.<init>(r2)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            r2 = r0
        L_0x002d:
            f2826n = r2     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            return
        L_0x0030:
            r2 = move-exception
            goto L_0x0039
        L_0x0032:
            r2 = move-exception
            goto L_0x0039
        L_0x0034:
            r2 = move-exception
            goto L_0x0039
        L_0x0036:
            r2 = move-exception
            goto L_0x0039
        L_0x0038:
            r2 = move-exception
        L_0x0039:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a
            java.lang.String r1 = "Failed to instantiate dynamite loader"
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.f(java.lang.ClassLoader):void");
    }

    @GuardedBy("DynamiteModule.class")
    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals((Object) null) || bool.equals(f2822i)) {
            return true;
        }
        boolean z9 = false;
        if (f2822i == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (o3.f.f10556b.b(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z9 = true;
            }
            Boolean valueOf = Boolean.valueOf(z9);
            f2822i = valueOf;
            z9 = valueOf.booleanValue();
            if (z9 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f2820g = true;
            }
        }
        if (!z9) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z9;
    }

    public static e h(Context context) {
        e eVar;
        synchronized (DynamiteModule.class) {
            e eVar2 = f2825m;
            if (eVar2 != null) {
                return eVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    eVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    eVar = queryLocalInterface instanceof e ? (e) queryLocalInterface : new e(iBinder);
                }
                if (eVar != null) {
                    f2825m = eVar;
                    return eVar;
                }
            } catch (Exception e10) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
        }
        return null;
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f2827a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new a("Failed to instantiate module class: ".concat(str), e10);
        }
    }
}
