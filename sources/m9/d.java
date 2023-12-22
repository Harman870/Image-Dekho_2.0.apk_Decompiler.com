package m9;

import j9.a;
import j9.e0;
import j9.m;
import k9.e;
import m9.h;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final i f9397a;

    /* renamed from: b  reason: collision with root package name */
    public final a f9398b;

    /* renamed from: c  reason: collision with root package name */
    public final f f9399c;

    /* renamed from: d  reason: collision with root package name */
    public final m f9400d;

    /* renamed from: e  reason: collision with root package name */
    public h.a f9401e;

    /* renamed from: f  reason: collision with root package name */
    public final h f9402f;

    /* renamed from: g  reason: collision with root package name */
    public e f9403g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f9404h;

    /* renamed from: i  reason: collision with root package name */
    public e0 f9405i;

    public d(i iVar, f fVar, a aVar, j9.d dVar, m mVar) {
        this.f9397a = iVar;
        this.f9399c = fVar;
        this.f9398b = aVar;
        this.f9400d = mVar;
        this.f9402f = new h(aVar, fVar.f9426e, dVar, mVar);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final m9.e a(boolean r17, int r18, int r19, int r20) {
        /*
            r16 = this;
            r1 = r16
            m9.f r2 = r1.f9399c
            monitor-enter(r2)
            m9.i r0 = r1.f9397a     // Catch:{ all -> 0x0345 }
            m9.f r3 = r0.f9440b     // Catch:{ all -> 0x0345 }
            monitor-enter(r3)     // Catch:{ all -> 0x0345 }
            boolean r0 = r0.f9450m     // Catch:{ all -> 0x0342 }
            monitor-exit(r3)     // Catch:{ all -> 0x0342 }
            if (r0 != 0) goto L_0x033a
            r0 = 0
            r1.f9404h = r0     // Catch:{ all -> 0x0345 }
            m9.i r3 = r1.f9397a     // Catch:{ all -> 0x0345 }
            m9.e r4 = r3.f9447i     // Catch:{ all -> 0x0345 }
            r5 = 0
            if (r4 == 0) goto L_0x0022
            boolean r6 = r4.k     // Catch:{ all -> 0x0345 }
            if (r6 == 0) goto L_0x0022
            java.net.Socket r3 = r3.f()     // Catch:{ all -> 0x0345 }
            goto L_0x0023
        L_0x0022:
            r3 = r5
        L_0x0023:
            m9.i r6 = r1.f9397a     // Catch:{ all -> 0x0345 }
            m9.e r7 = r6.f9447i     // Catch:{ all -> 0x0345 }
            if (r7 == 0) goto L_0x002b
            r4 = r5
            goto L_0x002c
        L_0x002b:
            r7 = r5
        L_0x002c:
            r8 = 1
            if (r7 != 0) goto L_0x0055
            m9.f r9 = r1.f9399c     // Catch:{ all -> 0x0345 }
            j9.a r10 = r1.f9398b     // Catch:{ all -> 0x0345 }
            boolean r6 = r9.c(r10, r6, r5, r0)     // Catch:{ all -> 0x0345 }
            if (r6 == 0) goto L_0x0040
            m9.i r6 = r1.f9397a     // Catch:{ all -> 0x0345 }
            m9.e r7 = r6.f9447i     // Catch:{ all -> 0x0345 }
            r6 = r5
            r9 = r8
            goto L_0x0057
        L_0x0040:
            j9.e0 r6 = r1.f9405i     // Catch:{ all -> 0x0345 }
            if (r6 == 0) goto L_0x0047
            r1.f9405i = r5     // Catch:{ all -> 0x0345 }
            goto L_0x0053
        L_0x0047:
            boolean r6 = r16.d()     // Catch:{ all -> 0x0345 }
            if (r6 == 0) goto L_0x0055
            m9.i r6 = r1.f9397a     // Catch:{ all -> 0x0345 }
            m9.e r6 = r6.f9447i     // Catch:{ all -> 0x0345 }
            j9.e0 r6 = r6.f9407c     // Catch:{ all -> 0x0345 }
        L_0x0053:
            r9 = r0
            goto L_0x0057
        L_0x0055:
            r9 = r0
            r6 = r5
        L_0x0057:
            monitor-exit(r2)     // Catch:{ all -> 0x0345 }
            k9.e.d(r3)
            if (r4 == 0) goto L_0x0062
            j9.m r2 = r1.f9400d
            r2.getClass()
        L_0x0062:
            if (r9 == 0) goto L_0x0069
            j9.m r2 = r1.f9400d
            r2.getClass()
        L_0x0069:
            if (r7 == 0) goto L_0x006c
            return r7
        L_0x006c:
            if (r6 != 0) goto L_0x0256
            m9.h$a r2 = r1.f9401e
            if (r2 == 0) goto L_0x0081
            int r3 = r2.f9438b
            java.util.List<j9.e0> r2 = r2.f9437a
            int r2 = r2.size()
            if (r3 >= r2) goto L_0x007e
            r2 = r8
            goto L_0x007f
        L_0x007e:
            r2 = r0
        L_0x007f:
            if (r2 != 0) goto L_0x0256
        L_0x0081:
            m9.h r2 = r1.f9402f
            int r3 = r2.f9434e
            java.util.List<java.net.Proxy> r4 = r2.f9433d
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x008f
            r3 = r8
            goto L_0x0090
        L_0x008f:
            r3 = r0
        L_0x0090:
            if (r3 != 0) goto L_0x009d
            java.util.ArrayList r3 = r2.f9436g
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x009b
            goto L_0x009d
        L_0x009b:
            r3 = r0
            goto L_0x009e
        L_0x009d:
            r3 = r8
        L_0x009e:
            if (r3 == 0) goto L_0x0250
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x00a5:
            int r4 = r2.f9434e
            java.util.List<java.net.Proxy> r10 = r2.f9433d
            int r10 = r10.size()
            if (r4 >= r10) goto L_0x00b1
            r4 = r8
            goto L_0x00b2
        L_0x00b1:
            r4 = r0
        L_0x00b2:
            if (r4 == 0) goto L_0x0237
            int r4 = r2.f9434e
            java.util.List<java.net.Proxy> r10 = r2.f9433d
            int r10 = r10.size()
            if (r4 >= r10) goto L_0x00c0
            r4 = r8
            goto L_0x00c1
        L_0x00c0:
            r4 = r0
        L_0x00c1:
            java.lang.String r10 = "No route to "
            if (r4 == 0) goto L_0x0216
            java.util.List<java.net.Proxy> r4 = r2.f9433d
            int r11 = r2.f9434e
            int r12 = r11 + 1
            r2.f9434e = r12
            java.lang.Object r4 = r4.get(r11)
            java.net.Proxy r4 = (java.net.Proxy) r4
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r2.f9435f = r11
            java.net.Proxy$Type r11 = r4.type()
            java.net.Proxy$Type r12 = java.net.Proxy.Type.DIRECT
            if (r11 == r12) goto L_0x0120
            java.net.Proxy$Type r11 = r4.type()
            java.net.Proxy$Type r12 = java.net.Proxy.Type.SOCKS
            if (r11 != r12) goto L_0x00eb
            goto L_0x0120
        L_0x00eb:
            java.net.SocketAddress r11 = r4.address()
            boolean r12 = r11 instanceof java.net.InetSocketAddress
            if (r12 == 0) goto L_0x0109
            java.net.InetSocketAddress r11 = (java.net.InetSocketAddress) r11
            java.net.InetAddress r12 = r11.getAddress()
            if (r12 != 0) goto L_0x0100
            java.lang.String r12 = r11.getHostName()
            goto L_0x0104
        L_0x0100:
            java.lang.String r12 = r12.getHostAddress()
        L_0x0104:
            int r11 = r11.getPort()
            goto L_0x0128
        L_0x0109:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Proxy.address() is not an InetSocketAddress: "
            java.lang.StringBuilder r2 = androidx.activity.f.g(r2)
            java.lang.Class r3 = r11.getClass()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0120:
            j9.a r11 = r2.f9430a
            j9.q r11 = r11.f8810a
            java.lang.String r12 = r11.f8945d
            int r11 = r11.f8946e
        L_0x0128:
            if (r11 < r8) goto L_0x01f4
            r8 = 65535(0xffff, float:9.1834E-41)
            if (r11 > r8) goto L_0x01f4
            java.net.Proxy$Type r8 = r4.type()
            java.net.Proxy$Type r10 = java.net.Proxy.Type.SOCKS
            if (r8 != r10) goto L_0x0141
            java.util.List<java.net.InetSocketAddress> r8 = r2.f9435f
            java.net.InetSocketAddress r10 = java.net.InetSocketAddress.createUnresolved(r12, r11)
            r8.add(r10)
            goto L_0x017e
        L_0x0141:
            j9.m r8 = r2.f9432c
            r8.getClass()
            j9.a r8 = r2.f9430a
            j9.l r8 = r8.f8811b
            com.ironsource.adapters.ironsource.a r8 = (com.ironsource.adapters.ironsource.a) r8
            r8.getClass()
            if (r12 == 0) goto L_0x01ec
            java.net.InetAddress[] r8 = java.net.InetAddress.getAllByName(r12)     // Catch:{ NullPointerException -> 0x01dc }
            java.util.List r8 = java.util.Arrays.asList(r8)     // Catch:{ NullPointerException -> 0x01dc }
            boolean r10 = r8.isEmpty()
            if (r10 != 0) goto L_0x01be
            j9.m r10 = r2.f9432c
            r10.getClass()
            int r10 = r8.size()
            r12 = r0
        L_0x0169:
            if (r12 >= r10) goto L_0x017e
            java.lang.Object r13 = r8.get(r12)
            java.net.InetAddress r13 = (java.net.InetAddress) r13
            java.util.List<java.net.InetSocketAddress> r14 = r2.f9435f
            java.net.InetSocketAddress r15 = new java.net.InetSocketAddress
            r15.<init>(r13, r11)
            r14.add(r15)
            int r12 = r12 + 1
            goto L_0x0169
        L_0x017e:
            java.util.List<java.net.InetSocketAddress> r8 = r2.f9435f
            int r8 = r8.size()
            r10 = r0
        L_0x0185:
            if (r10 >= r8) goto L_0x01b3
            j9.e0 r11 = new j9.e0
            j9.a r12 = r2.f9430a
            java.util.List<java.net.InetSocketAddress> r13 = r2.f9435f
            java.lang.Object r13 = r13.get(r10)
            java.net.InetSocketAddress r13 = (java.net.InetSocketAddress) r13
            r11.<init>(r12, r4, r13)
            y0.c r12 = r2.f9431b
            monitor-enter(r12)
            java.lang.Object r13 = r12.f13011a     // Catch:{ all -> 0x01b0 }
            java.util.Set r13 = (java.util.Set) r13     // Catch:{ all -> 0x01b0 }
            boolean r13 = r13.contains(r11)     // Catch:{ all -> 0x01b0 }
            monitor-exit(r12)
            if (r13 == 0) goto L_0x01aa
            java.util.ArrayList r12 = r2.f9436g
            r12.add(r11)
            goto L_0x01ad
        L_0x01aa:
            r3.add(r11)
        L_0x01ad:
            int r10 = r10 + 1
            goto L_0x0185
        L_0x01b0:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L_0x01b3:
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x01bb
            goto L_0x0237
        L_0x01bb:
            r8 = 1
            goto L_0x00a5
        L_0x01be:
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            j9.a r2 = r2.f9430a
            j9.l r2 = r2.f8811b
            r3.append(r2)
            java.lang.String r2 = " returned no addresses for "
            r3.append(r2)
            r3.append(r12)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x01dc:
            r0 = move-exception
            java.net.UnknownHostException r2 = new java.net.UnknownHostException
            java.lang.String r3 = "Broken system behaviour for dns lookup of "
            java.lang.String r3 = com.ironsource.adapters.ironsource.a.g(r3, r12)
            r2.<init>(r3)
            r2.initCause(r0)
            throw r2
        L_0x01ec:
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.String r2 = "hostname == null"
            r0.<init>(r2)
            throw r0
        L_0x01f4:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r12)
            java.lang.String r3 = ":"
            r2.append(r3)
            r2.append(r11)
            java.lang.String r3 = "; port is out of range"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0216:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r3 = androidx.activity.f.g(r10)
            j9.a r4 = r2.f9430a
            j9.q r4 = r4.f8810a
            java.lang.String r4 = r4.f8945d
            r3.append(r4)
            java.lang.String r4 = "; exhausted proxy configurations: "
            r3.append(r4)
            java.util.List<java.net.Proxy> r2 = r2.f9433d
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x0237:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0247
            java.util.ArrayList r4 = r2.f9436g
            r3.addAll(r4)
            java.util.ArrayList r2 = r2.f9436g
            r2.clear()
        L_0x0247:
            m9.h$a r2 = new m9.h$a
            r2.<init>(r3)
            r1.f9401e = r2
            r2 = 1
            goto L_0x0257
        L_0x0250:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0256:
            r2 = r0
        L_0x0257:
            m9.f r3 = r1.f9399c
            monitor-enter(r3)
            m9.i r4 = r1.f9397a     // Catch:{ all -> 0x0337 }
            m9.f r8 = r4.f9440b     // Catch:{ all -> 0x0337 }
            monitor-enter(r8)     // Catch:{ all -> 0x0337 }
            boolean r4 = r4.f9450m     // Catch:{ all -> 0x0334 }
            monitor-exit(r8)     // Catch:{ all -> 0x0334 }
            if (r4 != 0) goto L_0x032c
            if (r2 == 0) goto L_0x0284
            m9.h$a r2 = r1.f9401e     // Catch:{ all -> 0x0337 }
            r2.getClass()     // Catch:{ all -> 0x0337 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0337 }
            java.util.List<j9.e0> r2 = r2.f9437a     // Catch:{ all -> 0x0337 }
            r4.<init>(r2)     // Catch:{ all -> 0x0337 }
            m9.f r2 = r1.f9399c     // Catch:{ all -> 0x0337 }
            j9.a r8 = r1.f9398b     // Catch:{ all -> 0x0337 }
            m9.i r10 = r1.f9397a     // Catch:{ all -> 0x0337 }
            boolean r2 = r2.c(r8, r10, r4, r0)     // Catch:{ all -> 0x0337 }
            if (r2 == 0) goto L_0x0285
            m9.i r2 = r1.f9397a     // Catch:{ all -> 0x0337 }
            m9.e r7 = r2.f9447i     // Catch:{ all -> 0x0337 }
            r9 = 1
            goto L_0x0285
        L_0x0284:
            r4 = r5
        L_0x0285:
            if (r9 != 0) goto L_0x02b7
            if (r6 != 0) goto L_0x02ae
            m9.h$a r2 = r1.f9401e     // Catch:{ all -> 0x0337 }
            int r6 = r2.f9438b     // Catch:{ all -> 0x0337 }
            java.util.List<j9.e0> r7 = r2.f9437a     // Catch:{ all -> 0x0337 }
            int r7 = r7.size()     // Catch:{ all -> 0x0337 }
            if (r6 >= r7) goto L_0x0296
            r0 = 1
        L_0x0296:
            if (r0 == 0) goto L_0x02a8
            java.util.List<j9.e0> r0 = r2.f9437a     // Catch:{ all -> 0x0337 }
            int r6 = r2.f9438b     // Catch:{ all -> 0x0337 }
            int r7 = r6 + 1
            r2.f9438b = r7     // Catch:{ all -> 0x0337 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0337 }
            r6 = r0
            j9.e0 r6 = (j9.e0) r6     // Catch:{ all -> 0x0337 }
            goto L_0x02ae
        L_0x02a8:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0337 }
            r0.<init>()     // Catch:{ all -> 0x0337 }
            throw r0     // Catch:{ all -> 0x0337 }
        L_0x02ae:
            m9.e r7 = new m9.e     // Catch:{ all -> 0x0337 }
            m9.f r0 = r1.f9399c     // Catch:{ all -> 0x0337 }
            r7.<init>(r0, r6)     // Catch:{ all -> 0x0337 }
            r1.f9403g = r7     // Catch:{ all -> 0x0337 }
        L_0x02b7:
            monitor-exit(r3)     // Catch:{ all -> 0x0337 }
            if (r9 == 0) goto L_0x02bb
            goto L_0x031d
        L_0x02bb:
            j9.m r15 = r1.f9400d
            r10 = r7
            r11 = r18
            r12 = r19
            r13 = r20
            r14 = r17
            r10.c(r11, r12, r13, r14, r15)
            m9.f r0 = r1.f9399c
            y0.c r0 = r0.f9426e
            j9.e0 r2 = r7.f9407c
            r0.c(r2)
            m9.f r2 = r1.f9399c
            monitor-enter(r2)
            r1.f9403g = r5     // Catch:{ all -> 0x0329 }
            m9.f r0 = r1.f9399c     // Catch:{ all -> 0x0329 }
            j9.a r3 = r1.f9398b     // Catch:{ all -> 0x0329 }
            m9.i r8 = r1.f9397a     // Catch:{ all -> 0x0329 }
            r9 = 1
            boolean r0 = r0.c(r3, r8, r4, r9)     // Catch:{ all -> 0x0329 }
            if (r0 == 0) goto L_0x02f0
            r7.k = r9     // Catch:{ all -> 0x0329 }
            java.net.Socket r5 = r7.f9409e     // Catch:{ all -> 0x0329 }
            m9.i r0 = r1.f9397a     // Catch:{ all -> 0x0329 }
            m9.e r0 = r0.f9447i     // Catch:{ all -> 0x0329 }
            r1.f9405i = r6     // Catch:{ all -> 0x0329 }
            r7 = r0
            goto L_0x0319
        L_0x02f0:
            m9.f r0 = r1.f9399c     // Catch:{ all -> 0x0329 }
            boolean r3 = r0.f9427f     // Catch:{ all -> 0x0329 }
            if (r3 != 0) goto L_0x0300
            r3 = 1
            r0.f9427f = r3     // Catch:{ all -> 0x0329 }
            java.util.concurrent.ThreadPoolExecutor r3 = m9.f.f9421g     // Catch:{ all -> 0x0329 }
            androidx.activity.b r4 = r0.f9424c     // Catch:{ all -> 0x0329 }
            r3.execute(r4)     // Catch:{ all -> 0x0329 }
        L_0x0300:
            java.util.ArrayDeque r0 = r0.f9425d     // Catch:{ all -> 0x0329 }
            r0.add(r7)     // Catch:{ all -> 0x0329 }
            m9.i r0 = r1.f9397a     // Catch:{ all -> 0x0329 }
            m9.e r3 = r0.f9447i     // Catch:{ all -> 0x0329 }
            if (r3 != 0) goto L_0x0323
            r0.f9447i = r7     // Catch:{ all -> 0x0329 }
            java.util.ArrayList r3 = r7.f9419p     // Catch:{ all -> 0x0329 }
            m9.i$b r4 = new m9.i$b     // Catch:{ all -> 0x0329 }
            java.lang.Object r6 = r0.f9444f     // Catch:{ all -> 0x0329 }
            r4.<init>(r0, r6)     // Catch:{ all -> 0x0329 }
            r3.add(r4)     // Catch:{ all -> 0x0329 }
        L_0x0319:
            monitor-exit(r2)     // Catch:{ all -> 0x0329 }
            k9.e.d(r5)
        L_0x031d:
            j9.m r0 = r1.f9400d
            r0.getClass()
            return r7
        L_0x0323:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0329 }
            r0.<init>()     // Catch:{ all -> 0x0329 }
            throw r0     // Catch:{ all -> 0x0329 }
        L_0x0329:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0329 }
            throw r0
        L_0x032c:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0337 }
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)     // Catch:{ all -> 0x0337 }
            throw r0     // Catch:{ all -> 0x0337 }
        L_0x0334:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0334 }
            throw r0     // Catch:{ all -> 0x0337 }
        L_0x0337:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0337 }
            throw r0
        L_0x033a:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0345 }
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch:{ all -> 0x0345 }
            throw r0     // Catch:{ all -> 0x0345 }
        L_0x0342:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0342 }
            throw r0     // Catch:{ all -> 0x0345 }
        L_0x0345:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0345 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.d.a(boolean, int, int, int):m9.e");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        if (r6.f9409e.isClosed() != false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        if (r6.f9409e.isInputShutdown() != false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (r6.f9409e.isOutputShutdown() == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
        r7 = r6.f9412h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        if (r7 == null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0043, code lost:
        r10 = java.lang.System.nanoTime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004a, code lost:
        if (r7.f10749g == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0053, code lost:
        if (r7.f10755n >= r7.f10754m) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0059, code lost:
        if (r10 < r7.f10756o) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005b, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005d, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0062, code lost:
        if (r21 == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r7 = r6.f9409e.getSoTimeout();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r6.f9409e.setSoTimeout(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0075, code lost:
        if (r6.f9413i.p() == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r6.f9409e.setSoTimeout(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x007d, code lost:
        r6.f9409e.setSoTimeout(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0083, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0084, code lost:
        r6.f9409e.setSoTimeout(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0089, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x008d A[LOOP:0: B:1:0x000a->B:56:0x008d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0092 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final m9.e b(int r17, int r18, int r19, boolean r20, boolean r21) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
        L_0x000a:
            m9.e r6 = r1.a(r5, r2, r3, r4)
            m9.f r7 = r1.f9399c
            monitor-enter(r7)
            int r0 = r6.f9416m     // Catch:{ all -> 0x0022 }
            r8 = 1
            r9 = 0
            if (r0 != 0) goto L_0x0025
            p9.f r0 = r6.f9412h     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x001d
            r0 = r8
            goto L_0x001e
        L_0x001d:
            r0 = r9
        L_0x001e:
            if (r0 != 0) goto L_0x0025
            monitor-exit(r7)     // Catch:{ all -> 0x0022 }
            return r6
        L_0x0022:
            r0 = move-exception
            goto L_0x0093
        L_0x0025:
            monitor-exit(r7)     // Catch:{ all -> 0x0022 }
            java.net.Socket r0 = r6.f9409e
            boolean r0 = r0.isClosed()
            if (r0 != 0) goto L_0x008a
            java.net.Socket r0 = r6.f9409e
            boolean r0 = r0.isInputShutdown()
            if (r0 != 0) goto L_0x008a
            java.net.Socket r0 = r6.f9409e
            boolean r0 = r0.isOutputShutdown()
            if (r0 == 0) goto L_0x003f
            goto L_0x008a
        L_0x003f:
            p9.f r7 = r6.f9412h
            if (r7 == 0) goto L_0x0062
            long r10 = java.lang.System.nanoTime()
            monitor-enter(r7)
            boolean r0 = r7.f10749g     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x004d
            goto L_0x005b
        L_0x004d:
            long r12 = r7.f10755n     // Catch:{ all -> 0x005f }
            long r14 = r7.f10754m     // Catch:{ all -> 0x005f }
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x005d
            long r12 = r7.f10756o     // Catch:{ all -> 0x005f }
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x005d
        L_0x005b:
            monitor-exit(r7)
            goto L_0x008a
        L_0x005d:
            monitor-exit(r7)
            goto L_0x008b
        L_0x005f:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0062:
            if (r21 == 0) goto L_0x008b
            java.net.Socket r0 = r6.f9409e     // Catch:{ SocketTimeoutException -> 0x008b, IOException -> 0x008a }
            int r7 = r0.getSoTimeout()     // Catch:{ SocketTimeoutException -> 0x008b, IOException -> 0x008a }
            java.net.Socket r0 = r6.f9409e     // Catch:{ all -> 0x0083 }
            r0.setSoTimeout(r8)     // Catch:{ all -> 0x0083 }
            t9.t r0 = r6.f9413i     // Catch:{ all -> 0x0083 }
            boolean r0 = r0.p()     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x007d
            java.net.Socket r0 = r6.f9409e     // Catch:{ SocketTimeoutException -> 0x008b, IOException -> 0x008a }
            r0.setSoTimeout(r7)     // Catch:{ SocketTimeoutException -> 0x008b, IOException -> 0x008a }
            goto L_0x008a
        L_0x007d:
            java.net.Socket r0 = r6.f9409e     // Catch:{ SocketTimeoutException -> 0x008b, IOException -> 0x008a }
            r0.setSoTimeout(r7)     // Catch:{ SocketTimeoutException -> 0x008b, IOException -> 0x008a }
            goto L_0x008b
        L_0x0083:
            r0 = move-exception
            java.net.Socket r10 = r6.f9409e     // Catch:{ SocketTimeoutException -> 0x008b, IOException -> 0x008a }
            r10.setSoTimeout(r7)     // Catch:{ SocketTimeoutException -> 0x008b, IOException -> 0x008a }
            throw r0     // Catch:{ SocketTimeoutException -> 0x008b, IOException -> 0x008a }
        L_0x008a:
            r8 = r9
        L_0x008b:
            if (r8 != 0) goto L_0x0092
            r6.h()
            goto L_0x000a
        L_0x0092:
            return r6
        L_0x0093:
            monitor-exit(r7)     // Catch:{ all -> 0x0022 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.d.b(int, int, int, boolean, boolean):m9.e");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        if (r1 == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0050, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
            r6 = this;
            m9.f r0 = r6.f9399c
            monitor-enter(r0)
            j9.e0 r1 = r6.f9405i     // Catch:{ all -> 0x0051 }
            r2 = 1
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            return r2
        L_0x000a:
            boolean r1 = r6.d()     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x001a
            m9.i r1 = r6.f9397a     // Catch:{ all -> 0x0051 }
            m9.e r1 = r1.f9447i     // Catch:{ all -> 0x0051 }
            j9.e0 r1 = r1.f9407c     // Catch:{ all -> 0x0051 }
            r6.f9405i = r1     // Catch:{ all -> 0x0051 }
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            return r2
        L_0x001a:
            m9.h$a r1 = r6.f9401e     // Catch:{ all -> 0x0051 }
            r3 = 0
            if (r1 == 0) goto L_0x002e
            int r4 = r1.f9438b     // Catch:{ all -> 0x0051 }
            java.util.List<j9.e0> r1 = r1.f9437a     // Catch:{ all -> 0x0051 }
            int r1 = r1.size()     // Catch:{ all -> 0x0051 }
            if (r4 >= r1) goto L_0x002b
            r1 = r2
            goto L_0x002c
        L_0x002b:
            r1 = r3
        L_0x002c:
            if (r1 != 0) goto L_0x004f
        L_0x002e:
            m9.h r1 = r6.f9402f     // Catch:{ all -> 0x0051 }
            int r4 = r1.f9434e     // Catch:{ all -> 0x0051 }
            java.util.List<java.net.Proxy> r5 = r1.f9433d     // Catch:{ all -> 0x0051 }
            int r5 = r5.size()     // Catch:{ all -> 0x0051 }
            if (r4 >= r5) goto L_0x003c
            r4 = r2
            goto L_0x003d
        L_0x003c:
            r4 = r3
        L_0x003d:
            if (r4 != 0) goto L_0x004a
            java.util.ArrayList r1 = r1.f9436g     // Catch:{ all -> 0x0051 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0051 }
            if (r1 != 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r1 = r3
            goto L_0x004b
        L_0x004a:
            r1 = r2
        L_0x004b:
            if (r1 == 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r2 = r3
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            return r2
        L_0x0051:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.d.c():boolean");
    }

    public final boolean d() {
        e eVar = this.f9397a.f9447i;
        if (eVar == null || eVar.f9415l != 0 || !e.q(eVar.f9407c.f8868a.f8810a, this.f9398b.f8810a)) {
            return false;
        }
        return true;
    }
}
