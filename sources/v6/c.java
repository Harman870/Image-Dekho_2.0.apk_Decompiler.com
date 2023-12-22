package v6;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f12622a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f12623b;

    public /* synthetic */ c(e eVar, boolean z9) {
        this.f12622a = eVar;
        this.f12623b = z9;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r9 = this;
            v6.e r0 = r9.f12622a
            boolean r1 = r9.f12623b
            r0.getClass()
            java.lang.Object r2 = v6.e.f12626m
            monitor-enter(r2)
            c6.f r3 = r0.f12627a     // Catch:{ all -> 0x010a }
            r3.a()     // Catch:{ all -> 0x010a }
            android.content.Context r3 = r3.f2494a     // Catch:{ all -> 0x010a }
            x2.l r3 = x2.l.b(r3)     // Catch:{ all -> 0x010a }
            x6.c r4 = r0.f12629c     // Catch:{ all -> 0x0103 }
            x6.a r4 = r4.c()     // Catch:{ all -> 0x0103 }
            if (r3 == 0) goto L_0x0020
            r3.c()     // Catch:{ all -> 0x010a }
        L_0x0020:
            monitor-exit(r2)     // Catch:{ all -> 0x010a }
            int r3 = r4.f()     // Catch:{ g -> 0x0047 }
            r5 = 5
            r6 = 1
            r7 = 0
            if (r3 != r5) goto L_0x002c
            r3 = r6
            goto L_0x002d
        L_0x002c:
            r3 = r7
        L_0x002d:
            if (r3 != 0) goto L_0x004f
            int r3 = r4.f()     // Catch:{ g -> 0x0047 }
            r8 = 3
            if (r3 != r8) goto L_0x0038
            r3 = r6
            goto L_0x0039
        L_0x0038:
            r3 = r7
        L_0x0039:
            if (r3 == 0) goto L_0x003c
            goto L_0x004f
        L_0x003c:
            if (r1 != 0) goto L_0x004a
            v6.m r1 = r0.f12630d     // Catch:{ g -> 0x0047 }
            boolean r1 = r1.a(r4)     // Catch:{ g -> 0x0047 }
            if (r1 == 0) goto L_0x00ff
            goto L_0x004a
        L_0x0047:
            r1 = move-exception
            goto L_0x00df
        L_0x004a:
            x6.a r1 = r0.c(r4)     // Catch:{ g -> 0x0047 }
            goto L_0x0053
        L_0x004f:
            x6.a r1 = r0.f(r4)     // Catch:{ g -> 0x0047 }
        L_0x0053:
            monitor-enter(r2)
            c6.f r3 = r0.f12627a     // Catch:{ all -> 0x00dc }
            r3.a()     // Catch:{ all -> 0x00dc }
            android.content.Context r3 = r3.f2494a     // Catch:{ all -> 0x00dc }
            x2.l r3 = x2.l.b(r3)     // Catch:{ all -> 0x00dc }
            x6.c r8 = r0.f12629c     // Catch:{ all -> 0x00d5 }
            r8.b(r1)     // Catch:{ all -> 0x00d5 }
            if (r3 == 0) goto L_0x0069
            r3.c()     // Catch:{ all -> 0x00dc }
        L_0x0069:
            monitor-exit(r2)     // Catch:{ all -> 0x00dc }
            monitor-enter(r0)
            java.util.HashSet r2 = r0.k     // Catch:{ all -> 0x00d2 }
            int r2 = r2.size()     // Catch:{ all -> 0x00d2 }
            if (r2 == 0) goto L_0x0093
            java.lang.String r2 = r4.f12970b     // Catch:{ all -> 0x00d2 }
            java.lang.String r3 = r1.f12970b     // Catch:{ all -> 0x00d2 }
            boolean r2 = android.text.TextUtils.equals(r2, r3)     // Catch:{ all -> 0x00d2 }
            if (r2 != 0) goto L_0x0093
            java.util.HashSet r2 = r0.k     // Catch:{ all -> 0x00d2 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00d2 }
        L_0x0083:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00d2 }
            if (r3 == 0) goto L_0x0093
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00d2 }
            w6.a r3 = (w6.a) r3     // Catch:{ all -> 0x00d2 }
            r3.a()     // Catch:{ all -> 0x00d2 }
            goto L_0x0083
        L_0x0093:
            monitor-exit(r0)
            int r2 = r1.f()
            r3 = 4
            if (r2 != r3) goto L_0x009d
            r2 = r6
            goto L_0x009e
        L_0x009d:
            r2 = r7
        L_0x009e:
            if (r2 == 0) goto L_0x00aa
            java.lang.String r2 = r1.f12970b
            monitor-enter(r0)
            r0.f12636j = r2     // Catch:{ all -> 0x00a7 }
            monitor-exit(r0)
            goto L_0x00aa
        L_0x00a7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00aa:
            int r2 = r1.f()
            if (r2 != r5) goto L_0x00b2
            r2 = r6
            goto L_0x00b3
        L_0x00b2:
            r2 = r7
        L_0x00b3:
            if (r2 == 0) goto L_0x00bb
            v6.g r1 = new v6.g
            r1.<init>()
            goto L_0x00df
        L_0x00bb:
            int r2 = r1.f12971c
            r3 = 2
            if (r2 == r3) goto L_0x00c4
            if (r2 != r6) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r6 = r7
        L_0x00c4:
            if (r6 == 0) goto L_0x00ce
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r1.<init>(r2)
            goto L_0x00df
        L_0x00ce:
            r0.g(r1)
            goto L_0x00ff
        L_0x00d2:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00d5:
            r0 = move-exception
            if (r3 == 0) goto L_0x00db
            r3.c()     // Catch:{ all -> 0x00dc }
        L_0x00db:
            throw r0     // Catch:{ all -> 0x00dc }
        L_0x00dc:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00dc }
            throw r0
        L_0x00df:
            java.lang.Object r3 = r0.f12633g
            monitor-enter(r3)
            java.util.ArrayList r0 = r0.f12637l     // Catch:{ all -> 0x0100 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0100 }
        L_0x00e8:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0100 }
            if (r2 == 0) goto L_0x00fe
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0100 }
            v6.l r2 = (v6.l) r2     // Catch:{ all -> 0x0100 }
            boolean r2 = r2.b(r1)     // Catch:{ all -> 0x0100 }
            if (r2 == 0) goto L_0x00e8
            r0.remove()     // Catch:{ all -> 0x0100 }
            goto L_0x00e8
        L_0x00fe:
            monitor-exit(r3)     // Catch:{ all -> 0x0100 }
        L_0x00ff:
            return
        L_0x0100:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0100 }
            throw r0
        L_0x0103:
            r0 = move-exception
            if (r3 == 0) goto L_0x0109
            r3.c()     // Catch:{ all -> 0x010a }
        L_0x0109:
            throw r0     // Catch:{ all -> 0x010a }
        L_0x010a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x010a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.c.run():void");
    }
}
