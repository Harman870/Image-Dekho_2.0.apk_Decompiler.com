package r3;

import android.os.Looper;
import h4.b;

public final class r0 extends b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f11630a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r0(b bVar, Looper looper) {
        super(looper);
        this.f11630a = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004c, code lost:
        if (r0 == 5) goto L_0x004e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r11) {
        /*
            r10 = this;
            r3.b r0 = r10.f11630a
            java.util.concurrent.atomic.AtomicInteger r0 = r0.w
            int r0 = r0.get()
            int r1 = r11.arg1
            r2 = 0
            r3 = 7
            r4 = 2
            r5 = 1
            r6 = 0
            if (r0 == r1) goto L_0x003c
            int r0 = r11.what
            if (r0 == r4) goto L_0x0019
            if (r0 == r5) goto L_0x0019
            if (r0 != r3) goto L_0x001a
        L_0x0019:
            r2 = r5
        L_0x001a:
            if (r2 == 0) goto L_0x003b
            java.lang.Object r11 = r11.obj
            r3.s0 r11 = (r3.s0) r11
            r11.b()
            monitor-enter(r11)
            r11.f11633a = r6     // Catch:{ all -> 0x0038 }
            monitor-exit(r11)     // Catch:{ all -> 0x0038 }
            r3.b r0 = r11.f11635c
            java.util.ArrayList r0 = r0.f11510l
            monitor-enter(r0)
            r3.b r1 = r11.f11635c     // Catch:{ all -> 0x0035 }
            java.util.ArrayList r1 = r1.f11510l     // Catch:{ all -> 0x0035 }
            r1.remove(r11)     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            goto L_0x003b
        L_0x0035:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r11
        L_0x0038:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0038 }
            throw r0
        L_0x003b:
            return
        L_0x003c:
            int r0 = r11.what
            r1 = 4
            r7 = 5
            if (r0 == r5) goto L_0x004e
            if (r0 == r3) goto L_0x004e
            if (r0 != r1) goto L_0x004c
            r3.b r0 = r10.f11630a
            r0.getClass()
            goto L_0x004e
        L_0x004c:
            if (r0 != r7) goto L_0x0056
        L_0x004e:
            r3.b r0 = r10.f11630a
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x01af
        L_0x0056:
            int r0 = r11.what
            r8 = 8
            r9 = 3
            if (r0 != r1) goto L_0x00b2
            r3.b r0 = r10.f11630a
            o3.b r1 = new o3.b
            int r11 = r11.arg2
            r1.<init>(r11)
            r0.f11518t = r1
            r3.b r11 = r10.f11630a
            boolean r0 = r11.u
            if (r0 == 0) goto L_0x006f
            goto L_0x0089
        L_0x006f:
            java.lang.String r0 = r11.w()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x007a
            goto L_0x0089
        L_0x007a:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x0081
            goto L_0x0089
        L_0x0081:
            java.lang.String r11 = r11.w()     // Catch:{ ClassNotFoundException -> 0x0089 }
            java.lang.Class.forName(r11)     // Catch:{ ClassNotFoundException -> 0x0089 }
            r2 = r5
        L_0x0089:
            if (r2 == 0) goto L_0x0096
            r3.b r11 = r10.f11630a
            boolean r0 = r11.u
            if (r0 == 0) goto L_0x0092
            goto L_0x0096
        L_0x0092:
            r11.B(r9, r6)
            return
        L_0x0096:
            r3.b r11 = r10.f11630a
            o3.b r11 = r11.f11518t
            if (r11 == 0) goto L_0x009d
            goto L_0x00a2
        L_0x009d:
            o3.b r11 = new o3.b
            r11.<init>(r8)
        L_0x00a2:
            r3.b r0 = r10.f11630a
            r3.b$c r0 = r0.f11509j
            r0.a(r11)
            r3.b r11 = r10.f11630a
            r11.getClass()
            java.lang.System.currentTimeMillis()
            return
        L_0x00b2:
            if (r0 != r7) goto L_0x00d0
            r3.b r11 = r10.f11630a
            o3.b r11 = r11.f11518t
            if (r11 == 0) goto L_0x00bb
            goto L_0x00c0
        L_0x00bb:
            o3.b r11 = new o3.b
            r11.<init>(r8)
        L_0x00c0:
            r3.b r0 = r10.f11630a
            r3.b$c r0 = r0.f11509j
            r0.a(r11)
            r3.b r11 = r10.f11630a
            r11.getClass()
            java.lang.System.currentTimeMillis()
            return
        L_0x00d0:
            if (r0 != r9) goto L_0x00f2
            java.lang.Object r0 = r11.obj
            boolean r1 = r0 instanceof android.app.PendingIntent
            if (r1 == 0) goto L_0x00db
            r6 = r0
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
        L_0x00db:
            o3.b r0 = new o3.b
            int r11 = r11.arg2
            r0.<init>(r11, r6)
            r3.b r11 = r10.f11630a
            r3.b$c r11 = r11.f11509j
            r11.a(r0)
            r3.b r11 = r10.f11630a
            r11.getClass()
            java.lang.System.currentTimeMillis()
            return
        L_0x00f2:
            r1 = 6
            if (r0 != r1) goto L_0x0113
            r3.b r0 = r10.f11630a
            r0.B(r7, r6)
            r3.b r0 = r10.f11630a
            r3.b$a r0 = r0.f11513o
            if (r0 == 0) goto L_0x0105
            int r11 = r11.arg2
            r0.c(r11)
        L_0x0105:
            r3.b r11 = r10.f11630a
            r11.getClass()
            java.lang.System.currentTimeMillis()
            r3.b r11 = r10.f11630a
            r3.b.A(r11, r7, r5, r6)
            return
        L_0x0113:
            if (r0 != r4) goto L_0x013e
            r3.b r0 = r10.f11630a
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x011e
            goto L_0x013e
        L_0x011e:
            java.lang.Object r11 = r11.obj
            r0 = r11
            r3.s0 r0 = (r3.s0) r0
            r0.b()
            monitor-enter(r0)
            r0.f11633a = r6     // Catch:{ all -> 0x013b }
            monitor-exit(r0)     // Catch:{ all -> 0x013b }
            r3.b r11 = r0.f11635c
            java.util.ArrayList r11 = r11.f11510l
            monitor-enter(r11)
            r3.b r1 = r0.f11635c     // Catch:{ all -> 0x0138 }
            java.util.ArrayList r1 = r1.f11510l     // Catch:{ all -> 0x0138 }
            r1.remove(r0)     // Catch:{ all -> 0x0138 }
            monitor-exit(r11)     // Catch:{ all -> 0x0138 }
            return
        L_0x0138:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0138 }
            throw r0
        L_0x013b:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x013b }
            throw r11
        L_0x013e:
            int r0 = r11.what
            if (r0 == r4) goto L_0x0146
            if (r0 == r5) goto L_0x0146
            if (r0 != r3) goto L_0x0147
        L_0x0146:
            r2 = r5
        L_0x0147:
            if (r2 == 0) goto L_0x019e
            java.lang.Object r11 = r11.obj
            r3.s0 r11 = (r3.s0) r11
            monitor-enter(r11)
            java.lang.Object r0 = r11.f11633a     // Catch:{ all -> 0x019b }
            boolean r1 = r11.f11634b     // Catch:{ all -> 0x019b }
            if (r1 == 0) goto L_0x0173
            java.lang.String r1 = "GmsClient"
            java.lang.String r2 = r11.toString()     // Catch:{ all -> 0x019b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x019b }
            r3.<init>()     // Catch:{ all -> 0x019b }
            java.lang.String r4 = "Callback proxy "
            r3.append(r4)     // Catch:{ all -> 0x019b }
            r3.append(r2)     // Catch:{ all -> 0x019b }
            java.lang.String r2 = " being reused. This is not safe."
            r3.append(r2)     // Catch:{ all -> 0x019b }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x019b }
            android.util.Log.w(r1, r2)     // Catch:{ all -> 0x019b }
        L_0x0173:
            monitor-exit(r11)     // Catch:{ all -> 0x019b }
            if (r0 == 0) goto L_0x017c
            r11.a()     // Catch:{ RuntimeException -> 0x017a }
            goto L_0x017c
        L_0x017a:
            r11 = move-exception
            throw r11
        L_0x017c:
            monitor-enter(r11)
            r11.f11634b = r5     // Catch:{ all -> 0x0198 }
            monitor-exit(r11)     // Catch:{ all -> 0x0198 }
            monitor-enter(r11)
            r11.f11633a = r6     // Catch:{ all -> 0x0195 }
            monitor-exit(r11)     // Catch:{ all -> 0x0195 }
            r3.b r0 = r11.f11635c
            java.util.ArrayList r0 = r0.f11510l
            monitor-enter(r0)
            r3.b r1 = r11.f11635c     // Catch:{ all -> 0x0192 }
            java.util.ArrayList r1 = r1.f11510l     // Catch:{ all -> 0x0192 }
            r1.remove(r11)     // Catch:{ all -> 0x0192 }
            monitor-exit(r0)     // Catch:{ all -> 0x0192 }
            return
        L_0x0192:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0192 }
            throw r11
        L_0x0195:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0195 }
            throw r0
        L_0x0198:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0198 }
            throw r0
        L_0x019b:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x019b }
            throw r0
        L_0x019e:
            java.lang.String r11 = "Don't know how to handle message: "
            java.lang.String r11 = androidx.activity.e.a(r11, r0)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r1 = "GmsClient"
            android.util.Log.wtf(r1, r11, r0)
            return
        L_0x01af:
            java.lang.Object r11 = r11.obj
            r3.s0 r11 = (r3.s0) r11
            r11.b()
            monitor-enter(r11)
            r11.f11633a = r6     // Catch:{ all -> 0x01cb }
            monitor-exit(r11)     // Catch:{ all -> 0x01cb }
            r3.b r0 = r11.f11635c
            java.util.ArrayList r0 = r0.f11510l
            monitor-enter(r0)
            r3.b r1 = r11.f11635c     // Catch:{ all -> 0x01c8 }
            java.util.ArrayList r1 = r1.f11510l     // Catch:{ all -> 0x01c8 }
            r1.remove(r11)     // Catch:{ all -> 0x01c8 }
            monitor-exit(r0)     // Catch:{ all -> 0x01c8 }
            return
        L_0x01c8:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01c8 }
            throw r11
        L_0x01cb:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x01cb }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.r0.handleMessage(android.os.Message):void");
    }
}
