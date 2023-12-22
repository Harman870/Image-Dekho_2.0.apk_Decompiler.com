package com.google.android.gms.internal.gtm;

import android.content.Context;
import r3.o;

public final class zzqf implements Runnable {
    private final Context zza;
    private final zzpk zzb;
    private final zzpt zzd;
    private final zzqb zze;

    public zzqf(Context context, zzpt zzpt, zzpk zzpk) {
        new zzqe();
        zzqb zzqb = new zzqb();
        o.h(context);
        this.zza = context;
        o.h(zzpk);
        this.zzb = zzpk;
        this.zzd = zzpt;
        this.zze = zzqb;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x008e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00f4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            java.lang.String r0 = " "
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r11.zza(r1)
            r2 = 0
            if (r1 != 0) goto L_0x000e
            java.lang.String r0 = "Missing android.permission.INTERNET. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.INTERNET\" />"
            goto L_0x0018
        L_0x000e:
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r11.zza(r1)
            if (r1 != 0) goto L_0x001d
            java.lang.String r0 = "Missing android.permission.ACCESS_NETWORK_STATE. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />"
        L_0x0018:
            com.google.android.gms.internal.gtm.zzho.zza(r0)
            goto L_0x011b
        L_0x001d:
            android.content.Context r1 = r11.zza
            java.lang.String r3 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r3)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            if (r1 == 0) goto L_0x0116
            boolean r1 = r1.isConnected()
            if (r1 != 0) goto L_0x0035
            goto L_0x0116
        L_0x0035:
            java.lang.String r1 = "Starting to load resource from Network."
            com.google.android.gms.internal.gtm.zzho.zzd(r1)
            com.google.android.gms.internal.gtm.zzqc r1 = new com.google.android.gms.internal.gtm.zzqc
            r1.<init>()
            com.google.android.gms.internal.gtm.zzqb r3 = r11.zze     // Catch:{ all -> 0x0111 }
            com.google.android.gms.internal.gtm.zzpt r4 = r11.zzd     // Catch:{ all -> 0x0111 }
            com.google.android.gms.internal.gtm.zzph r4 = r4.zza()     // Catch:{ all -> 0x0111 }
            java.lang.String r3 = r3.zza(r4)     // Catch:{ all -> 0x0111 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0111 }
            r4.<init>()     // Catch:{ all -> 0x0111 }
            java.lang.String r5 = "Loading resource from "
            r4.append(r5)     // Catch:{ all -> 0x0111 }
            r4.append(r3)     // Catch:{ all -> 0x0111 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0111 }
            com.google.android.gms.internal.gtm.zzho.zzd(r4)     // Catch:{ all -> 0x0111 }
            r4 = 2
            java.io.InputStream r5 = r1.zza(r3)     // Catch:{ FileNotFoundException -> 0x00f4, zzqh -> 0x008e, IOException -> 0x0065 }
            goto L_0x00a9
        L_0x0065:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()     // Catch:{ all -> 0x0111 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0111 }
            r6.<init>()     // Catch:{ all -> 0x0111 }
            java.lang.String r7 = "NetworkLoader: Error when loading resource from url: "
            r6.append(r7)     // Catch:{ all -> 0x0111 }
            r6.append(r3)     // Catch:{ all -> 0x0111 }
            r6.append(r0)     // Catch:{ all -> 0x0111 }
            r6.append(r5)     // Catch:{ all -> 0x0111 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0111 }
            com.google.android.gms.internal.gtm.zzho.zzb(r0, r4)     // Catch:{ all -> 0x0111 }
            com.google.android.gms.internal.gtm.zzpk r0 = r11.zzb     // Catch:{ all -> 0x0111 }
            r3 = 1
            r0.zzb(r3, r2)     // Catch:{ all -> 0x0111 }
            r1.zzb()
            return
        L_0x008e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0111 }
            r5.<init>()     // Catch:{ all -> 0x0111 }
            java.lang.String r6 = "NetworkLoader: Error when loading resource for url: "
            r5.append(r6)     // Catch:{ all -> 0x0111 }
            r5.append(r3)     // Catch:{ all -> 0x0111 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0111 }
            com.google.android.gms.internal.gtm.zzho.zza(r5)     // Catch:{ all -> 0x0111 }
            com.google.android.gms.internal.gtm.zzpk r5 = r11.zzb     // Catch:{ all -> 0x0111 }
            r6 = 3
            r5.zzb(r6, r2)     // Catch:{ all -> 0x0111 }
            r5 = 0
        L_0x00a9:
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x00cc }
            r6.<init>()     // Catch:{ IOException -> 0x00cc }
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r8 = new byte[r7]     // Catch:{ IOException -> 0x00cc }
        L_0x00b2:
            int r9 = r5.read(r8, r2, r7)     // Catch:{ all -> 0x00ca }
            r10 = -1
            if (r9 == r10) goto L_0x00bd
            r6.write(r8, r2, r9)     // Catch:{ all -> 0x00ca }
            goto L_0x00b2
        L_0x00bd:
            com.google.android.gms.internal.gtm.zzpk r5 = r11.zzb     // Catch:{ IOException -> 0x00cc }
            byte[] r6 = r6.toByteArray()     // Catch:{ IOException -> 0x00cc }
            r5.zzc(r6)     // Catch:{ IOException -> 0x00cc }
            r1.zzb()
            return
        L_0x00ca:
            r5 = move-exception
            throw r5     // Catch:{ IOException -> 0x00cc }
        L_0x00cc:
            r5 = move-exception
            java.lang.String r6 = r5.getMessage()     // Catch:{ all -> 0x0111 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0111 }
            r7.<init>()     // Catch:{ all -> 0x0111 }
            java.lang.String r8 = "NetworkLoader: Error when parsing downloaded resources from url: "
            r7.append(r8)     // Catch:{ all -> 0x0111 }
            r7.append(r3)     // Catch:{ all -> 0x0111 }
            r7.append(r0)     // Catch:{ all -> 0x0111 }
            r7.append(r6)     // Catch:{ all -> 0x0111 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0111 }
            com.google.android.gms.internal.gtm.zzho.zzb(r0, r5)     // Catch:{ all -> 0x0111 }
            com.google.android.gms.internal.gtm.zzpk r0 = r11.zzb     // Catch:{ all -> 0x0111 }
            r0.zzb(r4, r2)     // Catch:{ all -> 0x0111 }
            r1.zzb()
            return
        L_0x00f4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0111 }
            r0.<init>()     // Catch:{ all -> 0x0111 }
            java.lang.String r5 = "NetworkLoader: No data was retrieved from the given url: "
            r0.append(r5)     // Catch:{ all -> 0x0111 }
            r0.append(r3)     // Catch:{ all -> 0x0111 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0111 }
            com.google.android.gms.internal.gtm.zzho.zza(r0)     // Catch:{ all -> 0x0111 }
            com.google.android.gms.internal.gtm.zzpk r0 = r11.zzb     // Catch:{ all -> 0x0111 }
            r0.zzb(r4, r2)     // Catch:{ all -> 0x0111 }
            r1.zzb()
            return
        L_0x0111:
            r0 = move-exception
            r1.zzb()
            throw r0
        L_0x0116:
            java.lang.String r0 = "No network connectivity - Offline"
            com.google.android.gms.internal.gtm.zzho.zze(r0)
        L_0x011b:
            com.google.android.gms.internal.gtm.zzpk r0 = r11.zzb
            r0.zzb(r2, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzqf.run():void");
    }

    public final boolean zza(String str) {
        return this.zza.getPackageManager().checkPermission(str, this.zza.getPackageName()) == 0;
    }
}
