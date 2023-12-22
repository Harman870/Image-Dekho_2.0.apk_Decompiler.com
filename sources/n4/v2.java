package n4;

public final class v2 {

    /* renamed from: g  reason: collision with root package name */
    public static final Object f10175g = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f10176a;

    /* renamed from: b  reason: collision with root package name */
    public final u2 f10177b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f10178c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f10179d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f10180e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f10181f = null;

    public /* synthetic */ v2(String str, Object obj, Object obj2, u2 u2Var) {
        this.f10176a = str;
        this.f10178c = obj;
        this.f10179d = obj2;
        this.f10177b = u2Var;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0044 */
    public final java.lang.Object a(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f10180e
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            if (r4 == 0) goto L_0x0007
            return r4
        L_0x0007:
            i4.z7 r4 = y3.a.f13023d
            if (r4 != 0) goto L_0x000e
            java.lang.Object r4 = r3.f10178c
            return r4
        L_0x000e:
            java.lang.Object r4 = f10175g
            monitor-enter(r4)
            boolean r0 = i4.z7.a()     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r3.f10181f     // Catch:{ all -> 0x0068 }
            if (r0 != 0) goto L_0x001e
            java.lang.Object r0 = r3.f10178c     // Catch:{ all -> 0x0068 }
            goto L_0x0020
        L_0x001e:
            java.lang.Object r0 = r3.f10181f     // Catch:{ all -> 0x0068 }
        L_0x0020:
            monitor-exit(r4)     // Catch:{ all -> 0x0068 }
            return r0
        L_0x0022:
            monitor-exit(r4)     // Catch:{ all -> 0x0068 }
            java.util.List r4 = n4.w2.f10205a     // Catch:{ SecurityException -> 0x0056 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x0056 }
        L_0x0029:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x0056 }
            if (r0 == 0) goto L_0x0056
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x0056 }
            n4.v2 r0 = (n4.v2) r0     // Catch:{ SecurityException -> 0x0056 }
            boolean r1 = i4.z7.a()     // Catch:{ SecurityException -> 0x0056 }
            if (r1 != 0) goto L_0x004e
            r1 = 0
            n4.u2 r2 = r0.f10177b     // Catch:{ IllegalStateException -> 0x0044 }
            if (r2 == 0) goto L_0x0044
            java.lang.Object r1 = r2.zza()     // Catch:{ IllegalStateException -> 0x0044 }
        L_0x0044:
            java.lang.Object r2 = f10175g     // Catch:{ SecurityException -> 0x0056 }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x0056 }
            r0.f10181f = r1     // Catch:{ all -> 0x004b }
            monitor-exit(r2)     // Catch:{ all -> 0x004b }
            goto L_0x0029
        L_0x004b:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004b }
            throw r4     // Catch:{ SecurityException -> 0x0056 }
        L_0x004e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x0056 }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x0056 }
            throw r4     // Catch:{ SecurityException -> 0x0056 }
        L_0x0056:
            n4.u2 r4 = r3.f10177b
            if (r4 != 0) goto L_0x005d
            java.lang.Object r4 = r3.f10178c
            return r4
        L_0x005d:
            java.lang.Object r4 = r4.zza()     // Catch:{ SecurityException -> 0x0065, IllegalStateException -> 0x0062 }
            return r4
        L_0x0062:
            java.lang.Object r4 = r3.f10178c
            return r4
        L_0x0065:
            java.lang.Object r4 = r3.f10178c
            return r4
        L_0x0068:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0068 }
            throw r0
        L_0x006b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.v2.a(java.lang.Object):java.lang.Object");
    }
}
