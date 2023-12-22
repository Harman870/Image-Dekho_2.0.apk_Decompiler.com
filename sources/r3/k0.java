package r3;

import c4.a;

public abstract class k0 extends a {
    public k0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r6.f11623a >= r4.f11623a) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) {
        /*
            r8 = this;
            r12 = -1
            r0 = 0
            r1 = 1
            if (r9 == r1) goto L_0x0091
            r2 = 2
            if (r9 == r2) goto L_0x0076
            r2 = 3
            if (r9 == r2) goto L_0x000d
            r9 = 0
            return r9
        L_0x000d:
            int r9 = r10.readInt()
            android.os.IBinder r2 = r10.readStrongBinder()
            android.os.Parcelable$Creator<r3.x0> r3 = r3.x0.CREATOR
            android.os.Parcelable r3 = h4.a.a(r10, r3)
            r3.x0 r3 = (r3.x0) r3
            h4.a.b(r10)
            r10 = r8
            r3.t0 r10 = (r3.t0) r10
            r3.b r4 = r10.f11636b
            java.lang.String r5 = "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService"
            r3.o.i(r4, r5)
            r3.o.h(r3)
            r4.f11519v = r3
            boolean r4 = r4.z()
            if (r4 == 0) goto L_0x0058
            r3.d r4 = r3.f11653d
            r3.p r5 = r3.p.a()
            if (r4 != 0) goto L_0x003f
            r4 = r0
            goto L_0x0041
        L_0x003f:
            r3.q r4 = r4.f11546a
        L_0x0041:
            monitor-enter(r5)
            if (r4 != 0) goto L_0x0047
            r3.q r4 = r3.p.f11618c     // Catch:{ all -> 0x0055 }
            goto L_0x0051
        L_0x0047:
            r3.q r6 = r5.f11619a     // Catch:{ all -> 0x0055 }
            if (r6 == 0) goto L_0x0051
            int r6 = r6.f11623a     // Catch:{ all -> 0x0055 }
            int r7 = r4.f11623a     // Catch:{ all -> 0x0055 }
            if (r6 >= r7) goto L_0x0053
        L_0x0051:
            r5.f11619a = r4     // Catch:{ all -> 0x0055 }
        L_0x0053:
            monitor-exit(r5)
            goto L_0x0058
        L_0x0055:
            r9 = move-exception
            monitor-exit(r5)
            throw r9
        L_0x0058:
            android.os.Bundle r3 = r3.f11650a
            r3.b r4 = r10.f11636b
            java.lang.String r5 = "onPostInitComplete can be called only once per call to getRemoteService"
            r3.o.i(r4, r5)
            r3.b r4 = r10.f11636b
            int r5 = r10.f11637c
            r3.r0 r6 = r4.f11505f
            r3.v0 r7 = new r3.v0
            r7.<init>(r4, r9, r2, r3)
            android.os.Message r9 = r6.obtainMessage(r1, r5, r12, r7)
            r6.sendMessage(r9)
            r10.f11636b = r0
            goto L_0x00c2
        L_0x0076:
            r10.readInt()
            android.os.Parcelable$Creator r9 = android.os.Bundle.CREATOR
            android.os.Parcelable r9 = h4.a.a(r10, r9)
            android.os.Bundle r9 = (android.os.Bundle) r9
            h4.a.b(r10)
            java.lang.Exception r9 = new java.lang.Exception
            r9.<init>()
            java.lang.String r10 = "GmsClient"
            java.lang.String r12 = "received deprecated onAccountValidationComplete callback, ignoring"
            android.util.Log.wtf(r10, r12, r9)
            goto L_0x00c2
        L_0x0091:
            int r9 = r10.readInt()
            android.os.IBinder r2 = r10.readStrongBinder()
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = h4.a.a(r10, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            h4.a.b(r10)
            r10 = r8
            r3.t0 r10 = (r3.t0) r10
            r3.b r4 = r10.f11636b
            java.lang.String r5 = "onPostInitComplete can be called only once per call to getRemoteService"
            r3.o.i(r4, r5)
            r3.b r4 = r10.f11636b
            int r5 = r10.f11637c
            r3.r0 r6 = r4.f11505f
            r3.v0 r7 = new r3.v0
            r7.<init>(r4, r9, r2, r3)
            android.os.Message r9 = r6.obtainMessage(r1, r5, r12, r7)
            r6.sendMessage(r9)
            r10.f11636b = r0
        L_0x00c2:
            r11.writeNoException()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.k0.c(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
