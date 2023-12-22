package h9;

import e9.s0;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final s0 f7066a;

    /* JADX WARNING: type inference failed for: r0v7, types: [c9.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r3.hintOnError();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x006b */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.fast.service.loader"
            int r1 = h9.o.f7068a
            r1 = 0
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ SecurityException -> 0x000a }
            goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            if (r0 != 0) goto L_0x000e
            goto L_0x0011
        L_0x000e:
            java.lang.Boolean.parseBoolean(r0)
        L_0x0011:
            java.util.Iterator r0 = androidx.activity.f.i()     // Catch:{ all -> 0x007b }
            java.lang.String r2 = "<this>"
            x8.f.f(r0, r2)     // Catch:{ all -> 0x007b }
            c9.d r2 = new c9.d     // Catch:{ all -> 0x007b }
            r2.<init>(r0)     // Catch:{ all -> 0x007b }
            boolean r0 = r2 instanceof c9.a     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0024
            goto L_0x002a
        L_0x0024:
            c9.a r0 = new c9.a     // Catch:{ all -> 0x007b }
            r0.<init>(r2)     // Catch:{ all -> 0x007b }
            r2 = r0
        L_0x002a:
            java.util.List r0 = c9.c.a0(r2)     // Catch:{ all -> 0x007b }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x007b }
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x007b }
            if (r3 != 0) goto L_0x003a
            r3 = r1
            goto L_0x0061
        L_0x003a:
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x007b }
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x007b }
            if (r4 != 0) goto L_0x0045
            goto L_0x0061
        L_0x0045:
            r4 = r3
            h9.i r4 = (h9.i) r4     // Catch:{ all -> 0x007b }
            int r4 = r4.getLoadPriority()     // Catch:{ all -> 0x007b }
        L_0x004c:
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x007b }
            r6 = r5
            h9.i r6 = (h9.i) r6     // Catch:{ all -> 0x007b }
            int r6 = r6.getLoadPriority()     // Catch:{ all -> 0x007b }
            if (r4 >= r6) goto L_0x005b
            r3 = r5
            r4 = r6
        L_0x005b:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x007b }
            if (r5 != 0) goto L_0x004c
        L_0x0061:
            h9.i r3 = (h9.i) r3     // Catch:{ all -> 0x007b }
            if (r3 != 0) goto L_0x0066
            goto L_0x006e
        L_0x0066:
            e9.s0 r1 = r3.createDispatcher(r0)     // Catch:{ all -> 0x006b }
            goto L_0x006e
        L_0x006b:
            r3.hintOnError()     // Catch:{ all -> 0x007b }
        L_0x006e:
            if (r1 == 0) goto L_0x0073
            f7066a = r1
            return
        L_0x0073:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007b }
            java.lang.String r1 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            r0.<init>(r1)     // Catch:{ all -> 0x007b }
            throw r0     // Catch:{ all -> 0x007b }
        L_0x007b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.j.<clinit>():void");
    }
}
