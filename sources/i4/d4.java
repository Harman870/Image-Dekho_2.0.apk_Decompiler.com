package i4;

import androidx.activity.f;
import java.security.GeneralSecurityException;
import javax.annotation.concurrent.GuardedBy;

public final class d4 {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    public final dc f7250a;

    public d4(dc dcVar) {
        this.f7250a = dcVar;
    }

    public final synchronized c4 a() {
        gc gcVar;
        gcVar = (gc) this.f7250a.d();
        if (gcVar.v() > 0) {
        } else {
            throw new GeneralSecurityException("empty keyset");
        }
        return new c4(gcVar);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void b(i4.a4 r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            i4.bc r2 = r2.f7180a     // Catch:{ all -> 0x0028 }
            monitor-enter(r1)     // Catch:{ all -> 0x0028 }
            monitor-enter(r1)     // Catch:{ all -> 0x0021 }
            i4.zb r0 = i4.o4.a(r2)     // Catch:{ all -> 0x0023 }
            int r2 = r2.y()     // Catch:{ all -> 0x0023 }
            i4.fc r2 = r1.e(r0, r2)     // Catch:{ all -> 0x0023 }
            monitor-exit(r1)     // Catch:{ all -> 0x0021 }
            i4.dc r0 = r1.f7250a     // Catch:{ all -> 0x0021 }
            r0.j()     // Catch:{ all -> 0x0021 }
            i4.c1 r0 = r0.f7833b     // Catch:{ all -> 0x0021 }
            i4.gc r0 = (i4.gc) r0     // Catch:{ all -> 0x0021 }
            i4.gc.D(r0, r2)     // Catch:{ all -> 0x0021 }
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            monitor-exit(r1)
            return
        L_0x0021:
            r2 = move-exception
            goto L_0x0026
        L_0x0023:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0021 }
            throw r2     // Catch:{ all -> 0x0021 }
        L_0x0026:
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            throw r2     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.d4.b(i4.a4):void");
    }

    public final synchronized void c(int i10) {
        int i11 = 0;
        while (i11 < ((gc) this.f7250a.f7833b).v()) {
            fc y9 = ((gc) this.f7250a.f7833b).y(i11);
            if (y9.v() != i10) {
                i11++;
            } else if (y9.E() == 3) {
                dc dcVar = this.f7250a;
                dcVar.j();
                ((gc) dcVar.f7833b).zzd = i10;
            } else {
                throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i10);
            }
        }
        throw new GeneralSecurityException("key not found: " + i10);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:210)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized int d() {
        /*
            r3 = this;
            monitor-enter(r3)
        L_0x0001:
            int r0 = i4.f8.a()     // Catch:{ all -> 0x0036 }
            monitor-enter(r3)     // Catch:{ all -> 0x0036 }
            i4.dc r1 = r3.f7250a     // Catch:{ all -> 0x0033 }
            i4.c1 r1 = r1.f7833b     // Catch:{ all -> 0x0033 }
            i4.gc r1 = (i4.gc) r1     // Catch:{ all -> 0x0033 }
            i4.f1 r1 = r1.B()     // Catch:{ all -> 0x0033 }
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch:{ all -> 0x0033 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0033 }
        L_0x0018:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0033 }
            if (r2 == 0) goto L_0x002c
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0033 }
            i4.fc r2 = (i4.fc) r2     // Catch:{ all -> 0x0033 }
            int r2 = r2.v()     // Catch:{ all -> 0x0033 }
            if (r2 != r0) goto L_0x0018
            r1 = 1
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0031
            goto L_0x0001
        L_0x0031:
            monitor-exit(r3)
            return r0
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.d4.d():int");
    }

    public final synchronized fc e(zb zbVar, int i10) {
        ec x9;
        int d10 = d();
        if (i10 != 1) {
            x9 = fc.x();
            x9.j();
            fc.A((fc) x9.f7833b, zbVar);
            x9.j();
            ((fc) x9.f7833b).zzf = d10;
            x9.j();
            fc.F((fc) x9.f7833b);
            x9.j();
            ((fc) x9.f7833b).zzg = f.a(i10);
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (fc) x9.d();
    }
}
