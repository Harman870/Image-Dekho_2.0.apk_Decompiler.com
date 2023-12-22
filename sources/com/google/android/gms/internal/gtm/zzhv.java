package com.google.android.gms.internal.gtm;

public final class zzhv {
    private static zzhv zza;
    private volatile String zzb = null;
    private volatile String zzc = null;
    private volatile int zzd = 1;

    public static zzhv zza() {
        zzhv zzhv;
        synchronized (zzhv.class) {
            if (zza == null) {
                zza = new zzhv();
            }
            zzhv = zza;
        }
        return zzhv;
    }

    public final String zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return this.zzd == 2;
    }

    public final boolean zze(String str) {
        return zzd() && this.zzb.equals(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0096, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzf(java.lang.String r7, android.net.Uri r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            java.lang.String r1 = r8.toString()     // Catch:{ UnsupportedEncodingException -> 0x00af }
            java.lang.String r2 = "UTF-8"
            java.lang.String r1 = java.net.URLDecoder.decode(r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x00af }
            java.lang.String r2 = "^tagmanager.c.\\S+:\\/\\/preview\\/p\\S+"
            boolean r2 = r1.matches(r2)     // Catch:{ all -> 0x00ad }
            if (r2 != 0) goto L_0x001f
            java.lang.String r7 = "Bad preview url: "
            java.lang.String r7 = r7.concat(r1)     // Catch:{ all -> 0x00ad }
            com.google.android.gms.internal.gtm.zzho.zze(r7)     // Catch:{ all -> 0x00ad }
            monitor-exit(r6)
            return r0
        L_0x001f:
            java.lang.String r2 = "id"
            java.lang.String r2 = r8.getQueryParameter(r2)     // Catch:{ all -> 0x00ad }
            java.lang.String r3 = "gtm_auth"
            java.lang.String r3 = r8.getQueryParameter(r3)     // Catch:{ all -> 0x00ad }
            java.lang.String r4 = "gtm_preview"
            java.lang.String r4 = r8.getQueryParameter(r4)     // Catch:{ all -> 0x00ad }
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ad }
            if (r7 != 0) goto L_0x003e
            java.lang.String r7 = "Preview fails (container doesn't match the container specified by the asset)"
            com.google.android.gms.internal.gtm.zzho.zze(r7)     // Catch:{ all -> 0x00ad }
            monitor-exit(r6)
            return r0
        L_0x003e:
            if (r2 == 0) goto L_0x00a2
            int r7 = r2.length()     // Catch:{ all -> 0x00ad }
            if (r7 <= 0) goto L_0x00a2
            r7 = 1
            if (r4 == 0) goto L_0x007a
            int r5 = r4.length()     // Catch:{ all -> 0x00ad }
            if (r5 != 0) goto L_0x007a
            java.lang.String r8 = r6.zzb     // Catch:{ all -> 0x00ad }
            boolean r8 = r2.equals(r8)     // Catch:{ all -> 0x00ad }
            if (r8 == 0) goto L_0x0073
            int r8 = r6.zzd     // Catch:{ all -> 0x00ad }
            if (r8 != r7) goto L_0x005c
            goto L_0x0073
        L_0x005c:
            java.lang.String r8 = r6.zzb     // Catch:{ all -> 0x00ad }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = "Exit preview mode for container: "
            java.lang.String r8 = r0.concat(r8)     // Catch:{ all -> 0x00ad }
            com.google.android.gms.internal.gtm.zzho.zzd(r8)     // Catch:{ all -> 0x00ad }
            r6.zzd = r7     // Catch:{ all -> 0x00ad }
            r8 = 0
            r6.zzb = r8     // Catch:{ all -> 0x00ad }
            r6.zzc = r8     // Catch:{ all -> 0x00ad }
            goto L_0x0095
        L_0x0073:
            java.lang.String r7 = "Error in exiting preview mode. The container is not in preview."
            com.google.android.gms.internal.gtm.zzho.zze(r7)     // Catch:{ all -> 0x00ad }
            monitor-exit(r6)
            return r0
        L_0x007a:
            if (r4 == 0) goto L_0x0097
            int r4 = r4.length()     // Catch:{ all -> 0x00ad }
            if (r4 <= 0) goto L_0x0097
            if (r3 == 0) goto L_0x0097
            int r3 = r3.length()     // Catch:{ all -> 0x00ad }
            if (r3 <= 0) goto L_0x0097
            r0 = 2
            r6.zzd = r0     // Catch:{ all -> 0x00ad }
            java.lang.String r8 = r8.getQuery()     // Catch:{ all -> 0x00ad }
            r6.zzc = r8     // Catch:{ all -> 0x00ad }
            r6.zzb = r2     // Catch:{ all -> 0x00ad }
        L_0x0095:
            monitor-exit(r6)
            return r7
        L_0x0097:
            java.lang.String r7 = "Bad preview url: "
            java.lang.String r7 = r7.concat(r1)     // Catch:{ all -> 0x00ad }
            com.google.android.gms.internal.gtm.zzho.zze(r7)     // Catch:{ all -> 0x00ad }
            monitor-exit(r6)
            return r0
        L_0x00a2:
            java.lang.String r7 = "Bad preview url: "
            java.lang.String r7 = r7.concat(r1)     // Catch:{ all -> 0x00ad }
            com.google.android.gms.internal.gtm.zzho.zze(r7)     // Catch:{ all -> 0x00ad }
            monitor-exit(r6)
            return r0
        L_0x00ad:
            r7 = move-exception
            goto L_0x00bf
        L_0x00af:
            r7 = move-exception
            java.lang.String r8 = "Error decoding the preview url: "
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00ad }
            java.lang.String r7 = r8.concat(r7)     // Catch:{ all -> 0x00ad }
            com.google.android.gms.internal.gtm.zzho.zze(r7)     // Catch:{ all -> 0x00ad }
            monitor-exit(r6)
            return r0
        L_0x00bf:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzhv.zzf(java.lang.String, android.net.Uri):boolean");
    }
}
