package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.HashMap;
import java.util.Map;
import z3.b;

final class zzbo {
    private static volatile DynamiteModule zza;
    private static volatile zzcr zzb;
    /* access modifiers changed from: private */
    public static final Map zzc = new HashMap();
    /* access modifiers changed from: private */
    public static final Map zzd = new HashMap();

    private zzbo() {
    }

    public static IBinder zza(Context context) {
        try {
            return zzct.asInterface(zzg(context).b("com.google.android.gms.tagmanager.TagManagerServiceProviderImpl")).getService(new b(context), zzh(context), new zzbn()).asBinder();
        } catch (RemoteException e10) {
            throw new IllegalStateException(e10);
        } catch (DynamiteModule.a e11) {
            throw new RuntimeException(e11);
        }
    }

    public static void zze(Context context) {
        Class<zzbo> cls = zzbo.class;
        zzcr zzi = zzi(context);
        synchronized (cls) {
            try {
                zzi.initialize(new b(context), zzh(context), new zzbn());
            } catch (RemoteException e10) {
                throw new IllegalStateException(e10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void zzf(Intent intent, Context context) {
        Class<zzbo> cls = zzbo.class;
        zzcr zzi = zzi(context);
        synchronized (cls) {
            try {
                zzi.previewIntent(intent, new b(context), new b(zza.f2827a), zzh(context), new zzbn());
            } catch (RemoteException e10) {
                throw new IllegalStateException(e10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static DynamiteModule zzg(Context context) {
        DynamiteModule dynamiteModule = zza;
        if (dynamiteModule == null) {
            synchronized (zzbo.class) {
                dynamiteModule = zza;
                if (zza == null) {
                    DynamiteModule c10 = DynamiteModule.c(context, DynamiteModule.f2817d, ModuleDescriptor.MODULE_ID);
                    zza = c10;
                    dynamiteModule = c10;
                }
            }
        }
        return dynamiteModule;
    }

    private static zzco zzh(Context context) {
        return new zzbm(AppMeasurement.getInstance(context));
    }

    private static zzcr zzi(Context context) {
        zzcr zzcr = zzb;
        if (zzcr == null) {
            synchronized (zzbo.class) {
                zzcr = zzb;
                if (zzcr == null) {
                    try {
                        zzcr asInterface = zzcq.asInterface(zzg(context).b("com.google.android.gms.tagmanager.TagManagerApiImpl"));
                        zzb = asInterface;
                        zzcr = asInterface;
                    } catch (DynamiteModule.a e10) {
                        throw new RuntimeException(e10);
                    }
                }
            }
        }
        return zzcr;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0028 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object zzj(java.lang.String r9, java.lang.Class r10) {
        /*
            java.lang.String r0 = " doesn't have an accessible no-arg constructor"
            java.lang.String r1 = "GoogleTagManagerAPI"
            r2 = 0
            java.lang.Class r3 = java.lang.Class.forName(r9)     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.Class[] r4 = r3.getInterfaces()     // Catch:{ ClassNotFoundException -> 0x0092 }
            int r5 = r4.length     // Catch:{ ClassNotFoundException -> 0x0092 }
            r6 = 0
            r7 = r6
        L_0x0010:
            if (r7 >= r5) goto L_0x0074
            r8 = r4[r7]     // Catch:{ ClassNotFoundException -> 0x0092 }
            boolean r8 = r8.equals(r10)     // Catch:{ ClassNotFoundException -> 0x0092 }
            if (r8 == 0) goto L_0x0071
            java.lang.Class[] r10 = new java.lang.Class[r6]     // Catch:{ NoSuchMethodException -> 0x0063, SecurityException -> 0x0057, InvocationTargetException -> 0x0049, InstantiationException -> 0x003b, IllegalAccessException -> 0x0028 }
            java.lang.reflect.Constructor r10 = r3.getConstructor(r10)     // Catch:{ NoSuchMethodException -> 0x0063, SecurityException -> 0x0057, InvocationTargetException -> 0x0049, InstantiationException -> 0x003b, IllegalAccessException -> 0x0028 }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ NoSuchMethodException -> 0x0063, SecurityException -> 0x0057, InvocationTargetException -> 0x0049, InstantiationException -> 0x003b, IllegalAccessException -> 0x0028 }
            java.lang.Object r2 = r10.newInstance(r3)     // Catch:{ NoSuchMethodException -> 0x0063, SecurityException -> 0x0057, InvocationTargetException -> 0x0049, InstantiationException -> 0x003b, IllegalAccessException -> 0x0028 }
            goto L_0x009f
        L_0x0028:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0092 }
            r10.<init>()     // Catch:{ ClassNotFoundException -> 0x0092 }
            r10.append(r9)     // Catch:{ ClassNotFoundException -> 0x0092 }
            r10.append(r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
        L_0x0033:
            java.lang.String r10 = r10.toString()     // Catch:{ ClassNotFoundException -> 0x0092 }
        L_0x0037:
            android.util.Log.e(r1, r10)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x009f
        L_0x003b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0092 }
            r10.<init>()     // Catch:{ ClassNotFoundException -> 0x0092 }
            r10.append(r9)     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r0 = " is an abstract class."
            r10.append(r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x0033
        L_0x0049:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0092 }
            r10.<init>()     // Catch:{ ClassNotFoundException -> 0x0092 }
            r10.append(r9)     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r0 = " construction threw an exception."
            r10.append(r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x0033
        L_0x0057:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0092 }
            r10.<init>()     // Catch:{ ClassNotFoundException -> 0x0092 }
            r10.append(r9)     // Catch:{ ClassNotFoundException -> 0x0092 }
            r10.append(r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x0033
        L_0x0063:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0092 }
            r10.<init>()     // Catch:{ ClassNotFoundException -> 0x0092 }
            r10.append(r9)     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r0 = " doesn't have a valid no-arg constructor"
            r10.append(r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x0033
        L_0x0071:
            int r7 = r7 + 1
            goto L_0x0010
        L_0x0074:
            java.lang.String r10 = r10.getCanonicalName()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0092 }
            r0.<init>()     // Catch:{ ClassNotFoundException -> 0x0092 }
            r0.append(r9)     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r3 = " doesn't implement "
            r0.append(r3)     // Catch:{ ClassNotFoundException -> 0x0092 }
            r0.append(r10)     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r10 = " interface."
            r0.append(r10)     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r10 = r0.toString()     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x0037
        L_0x0092:
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r10 = " can't be found in the application."
            java.lang.String r9 = r9.concat(r10)
            android.util.Log.e(r1, r9)
        L_0x009f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzbo.zzj(java.lang.String, java.lang.Class):java.lang.Object");
    }
}
