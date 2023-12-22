package j9;

import java.util.concurrent.atomic.AtomicInteger;
import k9.b;
import m9.i;
import u9.t;

public final class w implements d {

    /* renamed from: a  reason: collision with root package name */
    public final u f9008a;

    /* renamed from: b  reason: collision with root package name */
    public i f9009b;

    /* renamed from: c  reason: collision with root package name */
    public final x f9010c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f9011d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9012e;

    public final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        public final e f9013b;

        /* renamed from: c  reason: collision with root package name */
        public volatile AtomicInteger f9014c = new AtomicInteger(0);

        static {
            Class<w> cls = w.class;
        }

        public a(t.a aVar) {
            super("OkHttp %s", w.this.f9010c.f9016a.o());
            this.f9013b = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[Catch:{ IOException -> 0x0050, all -> 0x0023, all -> 0x004e }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r6 = this;
                j9.w r0 = j9.w.this
                m9.i r0 = r0.f9009b
                m9.i$a r0 = r0.f9443e
                r0.i()
                r0 = 0
                j9.w r1 = j9.w.this     // Catch:{ IOException -> 0x0050, all -> 0x0023 }
                j9.b0 r0 = r1.b()     // Catch:{ IOException -> 0x0050, all -> 0x0023 }
                r1 = 1
                j9.e r2 = r6.f9013b     // Catch:{ IOException -> 0x001e, all -> 0x0019 }
                u9.t$a r2 = (u9.t.a) r2     // Catch:{ IOException -> 0x001e, all -> 0x0019 }
                r2.b(r0)     // Catch:{ IOException -> 0x001e, all -> 0x0019 }
                goto L_0x0078
            L_0x0019:
                r0 = move-exception
                r5 = r1
                r1 = r0
                r0 = r5
                goto L_0x0024
            L_0x001e:
                r0 = move-exception
                r5 = r1
                r1 = r0
                r0 = r5
                goto L_0x0051
            L_0x0023:
                r1 = move-exception
            L_0x0024:
                j9.w r2 = j9.w.this     // Catch:{ all -> 0x004e }
                m9.i r2 = r2.f9009b     // Catch:{ all -> 0x004e }
                r2.a()     // Catch:{ all -> 0x004e }
                if (r0 != 0) goto L_0x004d
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x004e }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x004e }
                r2.<init>()     // Catch:{ all -> 0x004e }
                java.lang.String r3 = "canceled due to "
                r2.append(r3)     // Catch:{ all -> 0x004e }
                r2.append(r1)     // Catch:{ all -> 0x004e }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x004e }
                r0.<init>(r2)     // Catch:{ all -> 0x004e }
                r0.addSuppressed(r1)     // Catch:{ all -> 0x004e }
                j9.e r2 = r6.f9013b     // Catch:{ all -> 0x004e }
                u9.t$a r2 = (u9.t.a) r2     // Catch:{ all -> 0x004e }
                r2.a(r0)     // Catch:{ all -> 0x004e }
            L_0x004d:
                throw r1     // Catch:{ all -> 0x004e }
            L_0x004e:
                r0 = move-exception
                goto L_0x0082
            L_0x0050:
                r1 = move-exception
            L_0x0051:
                if (r0 == 0) goto L_0x0071
                q9.f r0 = q9.f.f11399a     // Catch:{ all -> 0x004e }
                r2 = 4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x004e }
                r3.<init>()     // Catch:{ all -> 0x004e }
                java.lang.String r4 = "Callback failure for "
                r3.append(r4)     // Catch:{ all -> 0x004e }
                j9.w r4 = j9.w.this     // Catch:{ all -> 0x004e }
                java.lang.String r4 = r4.c()     // Catch:{ all -> 0x004e }
                r3.append(r4)     // Catch:{ all -> 0x004e }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x004e }
                r0.m(r2, r3, r1)     // Catch:{ all -> 0x004e }
                goto L_0x0078
            L_0x0071:
                j9.e r0 = r6.f9013b     // Catch:{ all -> 0x004e }
                u9.t$a r0 = (u9.t.a) r0     // Catch:{ all -> 0x004e }
                r0.a(r1)     // Catch:{ all -> 0x004e }
            L_0x0078:
                j9.w r0 = j9.w.this
                j9.u r0 = r0.f9008a
                j9.k r0 = r0.f8980a
                r0.b(r6)
                return
            L_0x0082:
                j9.w r1 = j9.w.this
                j9.u r1 = r1.f9008a
                j9.k r1 = r1.f8980a
                r1.b(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: j9.w.a.a():void");
        }
    }

    public w(u uVar, x xVar, boolean z9) {
        this.f9008a = uVar;
        this.f9010c = xVar;
        this.f9011d = z9;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j9.b0 b() {
        /*
            r13 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            j9.u r0 = r13.f9008a
            java.util.List<j9.r> r0 = r0.f8983d
            r1.addAll(r0)
            n9.i r0 = new n9.i
            j9.u r2 = r13.f9008a
            r0.<init>(r2)
            r1.add(r0)
            n9.a r0 = new n9.a
            j9.u r2 = r13.f9008a
            j9.j$a r2 = r2.f8987h
            r0.<init>(r2)
            r1.add(r0)
            l9.a r0 = new l9.a
            j9.u r2 = r13.f9008a
            r2.getClass()
            r0.<init>()
            r1.add(r0)
            m9.a r0 = new m9.a
            r0.<init>()
            r1.add(r0)
            boolean r0 = r13.f9011d
            if (r0 != 0) goto L_0x0042
            j9.u r0 = r13.f9008a
            java.util.List<j9.r> r0 = r0.f8984e
            r1.addAll(r0)
        L_0x0042:
            n9.b r0 = new n9.b
            boolean r2 = r13.f9011d
            r0.<init>(r2)
            r1.add(r0)
            n9.f r10 = new n9.f
            m9.i r2 = r13.f9009b
            r3 = 0
            r4 = 0
            j9.x r11 = r13.f9010c
            j9.u r0 = r13.f9008a
            int r7 = r0.u
            int r8 = r0.f8999v
            int r9 = r0.w
            r0 = r10
            r5 = r11
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r1 = 0
            j9.b0 r2 = r10.a(r11)     // Catch:{ IOException -> 0x0088, all -> 0x0086 }
            m9.i r3 = r13.f9009b     // Catch:{ IOException -> 0x0088, all -> 0x0086 }
            m9.f r4 = r3.f9440b     // Catch:{ IOException -> 0x0088, all -> 0x0086 }
            monitor-enter(r4)     // Catch:{ IOException -> 0x0088, all -> 0x0086 }
            boolean r3 = r3.f9450m     // Catch:{ all -> 0x0083 }
            monitor-exit(r4)     // Catch:{ all -> 0x0083 }
            if (r3 != 0) goto L_0x0078
            m9.i r0 = r13.f9009b
            r0.e(r1)
            return r2
        L_0x0078:
            k9.e.c(r2)     // Catch:{ IOException -> 0x0088, all -> 0x0086 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0088, all -> 0x0086 }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0088, all -> 0x0086 }
            throw r2     // Catch:{ IOException -> 0x0088, all -> 0x0086 }
        L_0x0083:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0083 }
            throw r2     // Catch:{ IOException -> 0x0088, all -> 0x0086 }
        L_0x0086:
            r2 = move-exception
            goto L_0x0095
        L_0x0088:
            r0 = move-exception
            r2 = 1
            m9.i r3 = r13.f9009b     // Catch:{ all -> 0x0091 }
            java.io.IOException r0 = r3.e(r0)     // Catch:{ all -> 0x0091 }
            throw r0     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r0 = move-exception
            r12 = r2
            r2 = r0
            r0 = r12
        L_0x0095:
            if (r0 != 0) goto L_0x009c
            m9.i r0 = r13.f9009b
            r0.e(r1)
        L_0x009c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.w.b():j9.b0");
    }

    public final String c() {
        boolean z9;
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        i iVar = this.f9009b;
        synchronized (iVar.f9440b) {
            z9 = iVar.f9450m;
        }
        if (z9) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f9011d) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb.append(str2);
        sb.append(" to ");
        sb.append(this.f9010c.f9016a.o());
        return sb.toString();
    }

    public final Object clone() {
        u uVar = this.f9008a;
        w wVar = new w(uVar, this.f9010c, this.f9011d);
        wVar.f9009b = new i(uVar, wVar);
        return wVar;
    }
}
