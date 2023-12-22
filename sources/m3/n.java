package m3;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public final class n {

    /* renamed from: c  reason: collision with root package name */
    public static n f9367c;

    /* renamed from: a  reason: collision with root package name */
    public final b f9368a;

    /* renamed from: b  reason: collision with root package name */
    public GoogleSignInAccount f9369b;

    public n(Context context) {
        b a10 = b.a(context);
        this.f9368a = a10;
        this.f9369b = a10.b();
        a10.c();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static synchronized m3.n a(android.content.Context r2) {
        /*
            java.lang.Class<m3.n> r0 = m3.n.class
            monitor-enter(r0)
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x001b }
            monitor-enter(r0)     // Catch:{ all -> 0x001b }
            m3.n r1 = f9367c     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x000e
        L_0x000c:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            goto L_0x0016
        L_0x000e:
            m3.n r1 = new m3.n     // Catch:{ all -> 0x0018 }
            r1.<init>(r2)     // Catch:{ all -> 0x0018 }
            f9367c = r1     // Catch:{ all -> 0x0018 }
            goto L_0x000c
        L_0x0016:
            monitor-exit(r0)
            return r1
        L_0x0018:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r2     // Catch:{ all -> 0x001b }
        L_0x001b:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.n.a(android.content.Context):m3.n");
    }

    /* JADX INFO: finally extract failed */
    public final synchronized void b() {
        b bVar = this.f9368a;
        bVar.f9358a.lock();
        try {
            bVar.f9359b.edit().clear().apply();
            bVar.f9358a.unlock();
            this.f9369b = null;
        } catch (Throwable th) {
            bVar.f9358a.unlock();
            throw th;
        }
    }
}
