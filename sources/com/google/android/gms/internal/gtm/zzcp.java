package com.google.android.gms.internal.gtm;

import i3.s;
import i3.t;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public final class zzcp extends zzbu {
    private volatile String zza;
    private Future zzb;

    public zzcp(zzbx zzbx) {
        super(zzbx);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r4 == null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        if (r4 == null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        zzJ("Failed to close clientId writing stream", r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzf() {
        /*
            r7 = this;
            java.lang.String r0 = "0"
            java.lang.String r1 = "Failed to close clientId writing stream"
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r3)
            i3.t r3 = r7.zzq()     // Catch:{ Exception -> 0x0065 }
            android.content.Context r3 = r3.f7162a     // Catch:{ Exception -> 0x0065 }
            r3.o.e(r2)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = "ClientId should be saved from worker thread"
            r3.o.g(r4)     // Catch:{ Exception -> 0x0065 }
            r4 = 0
            java.lang.String r5 = "Storing clientId"
            r7.zzO(r5, r2)     // Catch:{ FileNotFoundException -> 0x004d, IOException -> 0x003f }
            java.lang.String r5 = "gaClientId"
            r6 = 0
            java.io.FileOutputStream r4 = r3.openFileOutput(r5, r6)     // Catch:{ FileNotFoundException -> 0x004d, IOException -> 0x003f }
            byte[] r3 = r2.getBytes()     // Catch:{ FileNotFoundException -> 0x004d, IOException -> 0x003f }
            r4.write(r3)     // Catch:{ FileNotFoundException -> 0x004d, IOException -> 0x003f }
            r4.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x003c
        L_0x0038:
            r3 = move-exception
            r7.zzJ(r1, r3)     // Catch:{ Exception -> 0x0065 }
        L_0x003c:
            return r2
        L_0x003d:
            r2 = move-exception
            goto L_0x005a
        L_0x003f:
            r2 = move-exception
            java.lang.String r3 = "Error writing to clientId file"
            r7.zzJ(r3, r2)     // Catch:{ all -> 0x003d }
            if (r4 == 0) goto L_0x0059
        L_0x0047:
            r4.close()     // Catch:{ IOException -> 0x004b }
            goto L_0x0059
        L_0x004b:
            r2 = move-exception
            goto L_0x0056
        L_0x004d:
            r2 = move-exception
            java.lang.String r3 = "Error creating clientId file"
            r7.zzJ(r3, r2)     // Catch:{ all -> 0x003d }
            if (r4 == 0) goto L_0x0059
            goto L_0x0047
        L_0x0056:
            r7.zzJ(r1, r2)     // Catch:{ Exception -> 0x0065 }
        L_0x0059:
            return r0
        L_0x005a:
            if (r4 == 0) goto L_0x0064
            r4.close()     // Catch:{ IOException -> 0x0060 }
            goto L_0x0064
        L_0x0060:
            r3 = move-exception
            r7.zzJ(r1, r3)     // Catch:{ Exception -> 0x0065 }
        L_0x0064:
            throw r2     // Catch:{ Exception -> 0x0065 }
        L_0x0065:
            r1 = move-exception
            java.lang.String r2 = "Error saving clientId file"
            r7.zzJ(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcp.zzf():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050 A[Catch:{ InterruptedException -> 0x0043, ExecutionException -> 0x003a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzb() {
        /*
            r3 = this;
            r3.zzV()
            monitor-enter(r3)
            java.lang.String r0 = r3.zza     // Catch:{ all -> 0x0062 }
            if (r0 != 0) goto L_0x002d
            i3.t r0 = r3.zzq()     // Catch:{ all -> 0x0062 }
            com.google.android.gms.internal.gtm.zzcn r1 = new com.google.android.gms.internal.gtm.zzcn     // Catch:{ all -> 0x0062 }
            r1.<init>(r3)     // Catch:{ all -> 0x0062 }
            r0.getClass()     // Catch:{ all -> 0x0062 }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0062 }
            boolean r2 = r2 instanceof i3.s     // Catch:{ all -> 0x0062 }
            if (r2 == 0) goto L_0x0025
            java.util.concurrent.FutureTask r0 = new java.util.concurrent.FutureTask     // Catch:{ all -> 0x0062 }
            r0.<init>(r1)     // Catch:{ all -> 0x0062 }
            r0.run()     // Catch:{ all -> 0x0062 }
            goto L_0x002b
        L_0x0025:
            i3.q r0 = r0.f7164c     // Catch:{ all -> 0x0062 }
            java.util.concurrent.Future r0 = r0.submit(r1)     // Catch:{ all -> 0x0062 }
        L_0x002b:
            r3.zzb = r0     // Catch:{ all -> 0x0062 }
        L_0x002d:
            java.util.concurrent.Future r0 = r3.zzb     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x005e
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException -> 0x0043, ExecutionException -> 0x003a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ InterruptedException -> 0x0043, ExecutionException -> 0x003a }
            r3.zza = r0     // Catch:{ InterruptedException -> 0x0043, ExecutionException -> 0x003a }
            goto L_0x004c
        L_0x003a:
            r0 = move-exception
            java.lang.String r1 = "Failed to load or generate client id"
            r3.zzJ(r1, r0)     // Catch:{ all -> 0x0062 }
        L_0x0040:
            java.lang.String r0 = "0"
            goto L_0x004a
        L_0x0043:
            r0 = move-exception
            java.lang.String r1 = "ClientId loading or generation was interrupted"
            r3.zzR(r1, r0)     // Catch:{ all -> 0x0062 }
            goto L_0x0040
        L_0x004a:
            r3.zza = r0     // Catch:{ all -> 0x0062 }
        L_0x004c:
            java.lang.String r0 = r3.zza     // Catch:{ all -> 0x0062 }
            if (r0 != 0) goto L_0x0054
            java.lang.String r0 = "0"
            r3.zza = r0     // Catch:{ all -> 0x0062 }
        L_0x0054:
            java.lang.String r0 = "Loaded clientId"
            java.lang.String r1 = r3.zza     // Catch:{ all -> 0x0062 }
            r3.zzO(r0, r1)     // Catch:{ all -> 0x0062 }
            r0 = 0
            r3.zzb = r0     // Catch:{ all -> 0x0062 }
        L_0x005e:
            java.lang.String r0 = r3.zza     // Catch:{ all -> 0x0062 }
            monitor-exit(r3)     // Catch:{ all -> 0x0062 }
            return r0
        L_0x0062:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0062 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcp.zzb():java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006c A[SYNTHETIC, Splitter:B:32:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0074 A[SYNTHETIC, Splitter:B:37:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080 A[SYNTHETIC, Splitter:B:46:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x008f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzc() {
        /*
            r9 = this;
            java.lang.String r0 = "gaClientId"
            java.lang.String r1 = "Failed to close client id reading stream"
            i3.t r2 = r9.zzq()
            android.content.Context r2 = r2.f7162a
            java.lang.String r3 = "ClientId should be loaded from worker thread"
            r3.o.g(r3)
            r3 = 0
            java.io.FileInputStream r4 = r2.openFileInput(r0)     // Catch:{ FileNotFoundException -> 0x007d, IOException -> 0x0060, all -> 0x005e }
            r5 = 36
            byte[] r6 = new byte[r5]     // Catch:{ FileNotFoundException -> 0x007e, IOException -> 0x005c }
            r7 = 0
            int r5 = r4.read(r6, r7, r5)     // Catch:{ FileNotFoundException -> 0x007e, IOException -> 0x005c }
            int r8 = r4.available()     // Catch:{ FileNotFoundException -> 0x007e, IOException -> 0x005c }
            if (r8 <= 0) goto L_0x0032
            java.lang.String r5 = "clientId file seems corrupted, deleting it."
            r9.zzQ(r5)     // Catch:{ FileNotFoundException -> 0x007e, IOException -> 0x005c }
            r4.close()     // Catch:{ FileNotFoundException -> 0x007e, IOException -> 0x005c }
            r2.deleteFile(r0)     // Catch:{ FileNotFoundException -> 0x007e, IOException -> 0x005c }
            r4.close()     // Catch:{ IOException -> 0x0084 }
            goto L_0x0088
        L_0x0032:
            r8 = 14
            if (r5 >= r8) goto L_0x0045
            java.lang.String r5 = "clientId file is empty, deleting it."
            r9.zzQ(r5)     // Catch:{ FileNotFoundException -> 0x007e, IOException -> 0x005c }
            r4.close()     // Catch:{ FileNotFoundException -> 0x007e, IOException -> 0x005c }
            r2.deleteFile(r0)     // Catch:{ FileNotFoundException -> 0x007e, IOException -> 0x005c }
            r4.close()     // Catch:{ IOException -> 0x0084 }
            goto L_0x0088
        L_0x0045:
            r4.close()     // Catch:{ FileNotFoundException -> 0x007e, IOException -> 0x005c }
            java.lang.String r8 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x007e, IOException -> 0x005c }
            r8.<init>(r6, r7, r5)     // Catch:{ FileNotFoundException -> 0x007e, IOException -> 0x005c }
            java.lang.String r5 = "Read client id from disk"
            r9.zzO(r5, r8)     // Catch:{ FileNotFoundException -> 0x007e, IOException -> 0x005c }
            r4.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x005a
        L_0x0056:
            r0 = move-exception
            r9.zzJ(r1, r0)
        L_0x005a:
            r3 = r8
            goto L_0x0088
        L_0x005c:
            r5 = move-exception
            goto L_0x0062
        L_0x005e:
            r0 = move-exception
            goto L_0x0072
        L_0x0060:
            r5 = move-exception
            r4 = r3
        L_0x0062:
            java.lang.String r6 = "Error reading client id file, deleting it"
            r9.zzJ(r6, r5)     // Catch:{ all -> 0x0070 }
            r2.deleteFile(r0)     // Catch:{ all -> 0x0070 }
            if (r4 == 0) goto L_0x0088
            r4.close()     // Catch:{ IOException -> 0x0084 }
            goto L_0x0088
        L_0x0070:
            r0 = move-exception
            r3 = r4
        L_0x0072:
            if (r3 == 0) goto L_0x007c
            r3.close()     // Catch:{ IOException -> 0x0078 }
            goto L_0x007c
        L_0x0078:
            r2 = move-exception
            r9.zzJ(r1, r2)
        L_0x007c:
            throw r0
        L_0x007d:
            r4 = r3
        L_0x007e:
            if (r4 == 0) goto L_0x0088
            r4.close()     // Catch:{ IOException -> 0x0084 }
            goto L_0x0088
        L_0x0084:
            r0 = move-exception
            r9.zzJ(r1, r0)
        L_0x0088:
            if (r3 != 0) goto L_0x008f
            java.lang.String r0 = r9.zzf()
            return r0
        L_0x008f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcp.zzc():java.lang.String");
    }

    public final void zzd() {
    }

    public final String zze() {
        FutureTask futureTask;
        synchronized (this) {
            try {
                this.zza = null;
                t zzq = zzq();
                zzco zzco = new zzco(this);
                zzq.getClass();
                if (Thread.currentThread() instanceof s) {
                    FutureTask futureTask2 = new FutureTask(zzco);
                    futureTask2.run();
                    futureTask = futureTask2;
                } else {
                    futureTask = zzq.f7164c.submit(zzco);
                }
                this.zzb = futureTask;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return zzb();
    }
}
