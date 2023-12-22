package com.google.android.gms.internal.gtm;

import android.content.Context;
import q4.a;
import r3.o;

public final class zzfk {
    public static final Object zza = new Object();
    public static a zzb;
    public static Boolean zzc;

    public static boolean zza(Context context) {
        o.h(context);
        Boolean bool = zzc;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zzi = zzfu.zzi(context, "com.google.android.gms.analytics.AnalyticsReceiver", false);
        zzc = Boolean.valueOf(zzi);
        return zzi;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static final void zzb(android.content.Context r5, android.content.Intent r6) {
        /*
            com.google.android.gms.internal.gtm.zzbx r0 = com.google.android.gms.internal.gtm.zzbx.zzg(r5)
            com.google.android.gms.internal.gtm.zzfd r1 = r0.zzm()
            if (r6 != 0) goto L_0x0010
            java.lang.String r5 = "AnalyticsReceiver called with null intent"
            r1.zzQ(r5)
            return
        L_0x0010:
            java.lang.String r6 = r6.getAction()
            r0.zzj()
            java.lang.String r0 = "Local AnalyticsReceiver got"
            r1.zzO(r0, r6)
            java.lang.String r0 = "com.google.android.gms.analytics.ANALYTICS_DISPATCH"
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L_0x0072
            boolean r6 = com.google.android.gms.internal.gtm.zzfp.zzh(r5)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "com.google.android.gms.analytics.ANALYTICS_DISPATCH"
            r0.<init>(r2)
            java.lang.String r2 = "com.google.android.gms.analytics.AnalyticsService"
            android.content.ComponentName r3 = new android.content.ComponentName
            r3.<init>(r5, r2)
            r0.setComponent(r3)
            java.lang.String r2 = "com.google.android.gms.analytics.ANALYTICS_DISPATCH"
            r0.setAction(r2)
            java.lang.Object r2 = zza
            monitor-enter(r2)
            r5.startService(r0)     // Catch:{ all -> 0x006f }
            if (r6 != 0) goto L_0x0048
            monitor-exit(r2)     // Catch:{ all -> 0x006f }
            return
        L_0x0048:
            q4.a r6 = zzb     // Catch:{ SecurityException -> 0x0068 }
            if (r6 != 0) goto L_0x0060
            q4.a r6 = new q4.a     // Catch:{ SecurityException -> 0x0068 }
            java.lang.String r0 = "Analytics WakeLock"
            r6.<init>(r5, r0)     // Catch:{ SecurityException -> 0x0068 }
            zzb = r6     // Catch:{ SecurityException -> 0x0068 }
            r5 = 0
            java.lang.Object r0 = r6.f11321a     // Catch:{ SecurityException -> 0x0068 }
            monitor-enter(r0)     // Catch:{ SecurityException -> 0x0068 }
            r6.f11327g = r5     // Catch:{ all -> 0x005d }
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            goto L_0x0060
        L_0x005d:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            throw r5     // Catch:{ SecurityException -> 0x0068 }
        L_0x0060:
            q4.a r5 = zzb     // Catch:{ SecurityException -> 0x0068 }
            r3 = 1000(0x3e8, double:4.94E-321)
            r5.a(r3)     // Catch:{ SecurityException -> 0x0068 }
            goto L_0x006d
        L_0x0068:
            java.lang.String r5 = "Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions."
            r1.zzQ(r5)     // Catch:{ all -> 0x006f }
        L_0x006d:
            monitor-exit(r2)     // Catch:{ all -> 0x006f }
            return
        L_0x006f:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006f }
            throw r5
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfk.zzb(android.content.Context, android.content.Intent):void");
    }
}
