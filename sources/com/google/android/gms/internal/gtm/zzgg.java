package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import w3.b;
import y3.a;

public final class zzgg {
    private static final Object zza = new Object();
    private static zzgg zzb;
    private volatile long zzc = 900000;
    private volatile long zzd = 30000;
    /* access modifiers changed from: private */
    public volatile boolean zze = true;
    private volatile boolean zzf = false;
    private volatile AdvertisingIdClient.Info zzg;
    private volatile long zzh;
    private volatile long zzi;
    /* access modifiers changed from: private */
    public final Context zzj;
    private final b zzk;
    private final Thread zzl;
    private final Object zzm = new Object();
    private final zzgf zzn = new zzgd(this);

    public zzgg(Context context, zzgf zzgf, b bVar) {
        this.zzk = bVar;
        this.zzj = context != null ? context.getApplicationContext() : null;
        this.zzh = bVar.currentTimeMillis();
        this.zzl = new Thread(new zzge(this));
    }

    public static zzgg zzb(Context context) {
        if (zzb == null) {
            synchronized (zza) {
                try {
                    if (zzb == null) {
                        zzgg zzgg = new zzgg(context, (zzgf) null, a.P);
                        zzb = zzgg;
                        zzgg.zzl.start();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zzb;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static /* bridge */ /* synthetic */ void zze(com.google.android.gms.internal.gtm.zzgg r4) {
        /*
            r0 = 10
            android.os.Process.setThreadPriority(r0)
        L_0x0005:
            boolean r0 = r4.zzf
            boolean r0 = r4.zze
            if (r0 == 0) goto L_0x0012
            com.google.android.gms.internal.gtm.zzgf r0 = r4.zzn
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r0 = r0.zza()
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 == 0) goto L_0x0024
            r4.zzg = r0
            w3.b r0 = r4.zzk
            long r0 = r0.currentTimeMillis()
            r4.zzi = r0
            java.lang.String r0 = "Obtained fresh AdvertisingId info from GmsCore."
            com.google.android.gms.internal.gtm.zzho.zzc(r0)
        L_0x0024:
            monitor-enter(r4)
            r4.notifyAll()     // Catch:{ all -> 0x003e }
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            java.lang.Object r0 = r4.zzm     // Catch:{ InterruptedException -> 0x0038 }
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0038 }
            java.lang.Object r1 = r4.zzm     // Catch:{ all -> 0x0035 }
            long r2 = r4.zzc     // Catch:{ all -> 0x0035 }
            r1.wait(r2)     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            goto L_0x0005
        L_0x0035:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r1     // Catch:{ InterruptedException -> 0x0038 }
        L_0x0038:
            java.lang.String r0 = "sleep interrupted in AdvertiserDataPoller thread; continuing"
            com.google.android.gms.internal.gtm.zzho.zzc(r0)
            goto L_0x0005
        L_0x003e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzgg.zze(com.google.android.gms.internal.gtm.zzgg):void");
    }

    private final void zzg() {
        if (this.zzk.currentTimeMillis() - this.zzi > 3600000) {
            this.zzg = null;
        }
    }

    private final void zzh() {
        if (this.zzk.currentTimeMillis() - this.zzh > this.zzd) {
            synchronized (this.zzm) {
                this.zzm.notify();
            }
            this.zzh = this.zzk.currentTimeMillis();
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzi() {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.zzh()     // Catch:{ InterruptedException -> 0x000c }
            r0 = 500(0x1f4, double:2.47E-321)
            r2.wait(r0)     // Catch:{ InterruptedException -> 0x000c }
            goto L_0x000c
        L_0x000a:
            r0 = move-exception
            goto L_0x000e
        L_0x000c:
            monitor-exit(r2)     // Catch:{ all -> 0x000a }
            return
        L_0x000e:
            monitor-exit(r2)     // Catch:{ all -> 0x000a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzgg.zzi():void");
    }

    public final String zzc() {
        if (this.zzg == null) {
            zzi();
        } else {
            zzh();
        }
        zzg();
        if (this.zzg == null) {
            return null;
        }
        return this.zzg.getId();
    }

    public final boolean zzf() {
        if (this.zzg == null) {
            zzi();
        } else {
            zzh();
        }
        zzg();
        if (this.zzg == null) {
            return true;
        }
        return this.zzg.isLimitAdTrackingEnabled();
    }
}
