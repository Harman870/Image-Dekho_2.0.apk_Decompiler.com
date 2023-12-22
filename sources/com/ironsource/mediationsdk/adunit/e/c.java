package com.ironsource.mediationsdk.adunit.e;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.c.c.a;
import com.ironsource.mediationsdk.adunit.d.a.c;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class c<Smash extends com.ironsource.mediationsdk.adunit.d.a.c<?>> {

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<String, CopyOnWriteArrayList<Smash>> f4289a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public String f4290b = "";

    /* renamed from: c  reason: collision with root package name */
    public com.ironsource.mediationsdk.adunit.d.a.c<?> f4291c;

    /* renamed from: d  reason: collision with root package name */
    public String f4292d = "";

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f4293e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4294f;

    /* renamed from: g  reason: collision with root package name */
    public final Timer f4295g = new Timer();

    /* renamed from: h  reason: collision with root package name */
    public d f4296h;

    /* renamed from: i  reason: collision with root package name */
    public ConcurrentHashMap<String, AdInfo> f4297i = new ConcurrentHashMap<>();

    public class a extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f4298a;

        public a(String str) {
            this.f4298a = str;
        }

        public final void run() {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.f4298a + " from memory");
                c.this.f4289a.remove(this.f4298a);
                ironLog.verbose("waterfall size is currently " + c.this.f4289a.size());
                ironLog.verbose("removing adInfo with id " + this.f4298a + " from memory");
                c.this.f4297i.remove(this.f4298a);
                ironLog.verbose("adInfo size is currently " + c.this.f4297i.size());
            } finally {
                cancel();
            }
        }
    }

    public c(List<String> list, int i10, d dVar) {
        this.f4293e = list;
        this.f4294f = i10;
        this.f4296h = dVar;
    }

    public static boolean a(AdapterBaseInterface adapterBaseInterface, IronSource.AD_UNIT ad_unit, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof AdapterSettingsInterface) || !((AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(ad_unit)) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }

    public final AdInfo a(String str) {
        if (this.f4297i.containsKey(str)) {
            return this.f4297i.get(str);
        }
        return null;
    }

    public final List<Smash> a() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4289a.get(this.f4290b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList() : copyOnWriteArrayList;
    }

    public final void a(a.C0048a aVar, CopyOnWriteArrayList<Smash> copyOnWriteArrayList, String str) {
        boolean z9;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        for (com.ironsource.mediationsdk.adunit.d.a.c cVar : a()) {
            if (!cVar.equals(this.f4291c)) {
                cVar.s();
            }
        }
        if (aVar == a.C0048a.AUTOMATIC_LOAD_WHILE_SHOW) {
            this.f4289a.put(str, copyOnWriteArrayList);
            if (!TextUtils.isEmpty(this.f4292d)) {
                synchronized (this) {
                    com.ironsource.mediationsdk.adunit.d.a.c<?> cVar2 = this.f4291c;
                    z9 = cVar2 != null && cVar2.u() && this.f4291c.q().equals(this.f4292d);
                }
                if (z9) {
                    IronLog ironLog2 = IronLog.INTERNAL;
                    StringBuilder sb = new StringBuilder("ad from previous waterfall ");
                    sb.append(this.f4292d);
                    sb.append(" is still showing - the current waterfall ");
                    com.ironsource.adapters.ironsource.a.i(sb, this.f4290b, " will be deleted instead", ironLog2);
                    String str2 = this.f4290b;
                    this.f4290b = this.f4292d;
                    this.f4292d = str2;
                }
                this.f4295g.schedule(new a(this.f4292d), (long) this.f4294f);
            }
        } else {
            this.f4297i.remove(this.f4292d);
            this.f4289a.clear();
            this.f4289a.put(str, copyOnWriteArrayList);
        }
        this.f4292d = this.f4290b;
        this.f4290b = str;
        if (this.f4289a.size() > 5) {
            this.f4296h.a(this.f4289a.size());
        }
    }

    public final void a(String str, ImpressionData impressionData) {
        if (!TextUtils.isEmpty(str) && impressionData != null) {
            this.f4297i.put(str, new AdInfo(impressionData));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        if (r1.f4293e.contains(r4) == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        if (r1.f4291c.p().equals(r4) == false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(com.ironsource.mediationsdk.adunit.c.c.a.C0048a r2, java.lang.String r3, java.lang.String r4, com.ironsource.mediationsdk.LoadWhileShowSupportState r5, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface r6, com.ironsource.mediationsdk.IronSource.AD_UNIT r7) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r6 = a((com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface) r6, (com.ironsource.mediationsdk.IronSource.AD_UNIT) r7, (java.lang.String) r3)     // Catch:{ all -> 0x005e }
            r7 = 0
            r0 = 1
            if (r6 == 0) goto L_0x000a
            goto L_0x0044
        L_0x000a:
            com.ironsource.mediationsdk.adunit.c.c.a$a r6 = com.ironsource.mediationsdk.adunit.c.c.a.C0048a.AUTOMATIC_LOAD_WHILE_SHOW     // Catch:{ all -> 0x005e }
            if (r2 == r6) goto L_0x0010
        L_0x000e:
            r7 = r0
            goto L_0x0044
        L_0x0010:
            com.ironsource.mediationsdk.adunit.d.a.c<?> r2 = r1.f4291c     // Catch:{ all -> 0x005e }
            if (r2 == 0) goto L_0x000e
            boolean r2 = r2.u()     // Catch:{ all -> 0x005e }
            if (r2 != 0) goto L_0x001b
            goto L_0x000e
        L_0x001b:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r2 = com.ironsource.mediationsdk.LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK     // Catch:{ all -> 0x005e }
            if (r5 != r2) goto L_0x002c
            com.ironsource.mediationsdk.adunit.d.a.c<?> r2 = r1.f4291c     // Catch:{ all -> 0x005e }
            java.lang.String r2 = r2.n()     // Catch:{ all -> 0x005e }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x005e }
            if (r2 == 0) goto L_0x002c
            goto L_0x0044
        L_0x002c:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r2 = com.ironsource.mediationsdk.LoadWhileShowSupportState.NONE     // Catch:{ all -> 0x005e }
            if (r5 == r2) goto L_0x0038
            java.util.List<java.lang.String> r2 = r1.f4293e     // Catch:{ all -> 0x005e }
            boolean r2 = r2.contains(r4)     // Catch:{ all -> 0x005e }
            if (r2 == 0) goto L_0x000e
        L_0x0038:
            com.ironsource.mediationsdk.adunit.d.a.c<?> r2 = r1.f4291c     // Catch:{ all -> 0x005e }
            java.lang.String r2 = r2.p()     // Catch:{ all -> 0x005e }
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x005e }
            if (r2 == 0) goto L_0x000e
        L_0x0044:
            if (r7 != 0) goto L_0x005c
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x005e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x005e }
            r4.<init>()     // Catch:{ all -> 0x005e }
            r4.append(r3)     // Catch:{ all -> 0x005e }
            java.lang.String r3 = " will not be added to the auction request"
            r4.append(r3)     // Catch:{ all -> 0x005e }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x005e }
            r2.verbose(r3)     // Catch:{ all -> 0x005e }
        L_0x005c:
            monitor-exit(r1)
            return r7
        L_0x005e:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.e.c.a(com.ironsource.mediationsdk.adunit.c.c.a$a, java.lang.String, java.lang.String, com.ironsource.mediationsdk.LoadWhileShowSupportState, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface, com.ironsource.mediationsdk.IronSource$AD_UNIT):boolean");
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
    public final synchronized void a(com.ironsource.mediationsdk.adunit.d.a.c<?> r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0021 }
            r0.verbose()     // Catch:{ all -> 0x0021 }
            com.ironsource.mediationsdk.adunit.d.a.c<?> r0 = r1.f4291c     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0021 }
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)     // Catch:{ all -> 0x0021 }
            com.ironsource.mediationsdk.adunit.d.a.c<?> r0 = r1.f4291c     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0018
            r0.s()     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x0021 }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0021 }
            throw r2     // Catch:{ all -> 0x0021 }
        L_0x001d:
            r1.f4291c = r2     // Catch:{ all -> 0x0021 }
            monitor-exit(r1)
            return
        L_0x0021:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.e.c.a(com.ironsource.mediationsdk.adunit.d.a.c):void");
    }
}
