package x2;

import android.content.Context;
import android.util.Log;
import i4.s6;
import i4.xd;
import j4.b0;
import j4.c0;
import j4.d0;
import j4.e0;
import j4.f0;
import j4.g0;
import j4.j4;
import j4.p;
import j4.q;
import j4.v;
import j4.w;
import j4.x;
import j4.y;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import n4.l7;
import n8.a;
import o.c;
import y2.b;

public final class l implements b, s6, c0 {

    /* renamed from: a  reason: collision with root package name */
    public Object f12945a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f12946b;

    public /* synthetic */ l() {
        this.f12945a = new HashMap();
        this.f12946b = new e0();
        e(new v());
        e(new x());
        e(new y(0));
        e(new b0());
        e(new y(1));
        e(new d0());
        e(new f0());
    }

    public /* synthetic */ l(Object obj, Object obj2) {
        this.f12945a = obj;
        this.f12946b = obj2;
    }

    public /* synthetic */ l(l7 l7Var) {
        this.f12946b = l7Var;
    }

    public /* synthetic */ l(byte[] bArr, byte[] bArr2) {
        this.f12945a = xd.a(bArr);
        this.f12946b = xd.a(bArr2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040 A[SYNTHETIC, Splitter:B:15:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045 A[SYNTHETIC, Splitter:B:19:0x0045] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static x2.l b(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0033, Error -> 0x0031, OverlappingFileLockException -> 0x002f }
            java.io.File r5 = r5.getFilesDir()     // Catch:{ IOException -> 0x0033, Error -> 0x0031, OverlappingFileLockException -> 0x002f }
            r2.<init>(r5, r0)     // Catch:{ IOException -> 0x0033, Error -> 0x0031, OverlappingFileLockException -> 0x002f }
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0033, Error -> 0x0031, OverlappingFileLockException -> 0x002f }
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch:{ IOException -> 0x0033, Error -> 0x0031, OverlappingFileLockException -> 0x002f }
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch:{ IOException -> 0x0033, Error -> 0x0031, OverlappingFileLockException -> 0x002f }
            java.nio.channels.FileLock r0 = r5.lock()     // Catch:{ IOException -> 0x002b, Error -> 0x0029, OverlappingFileLockException -> 0x0027 }
            x2.l r2 = new x2.l     // Catch:{ IOException -> 0x0025, Error -> 0x0023, OverlappingFileLockException -> 0x0021 }
            r2.<init>((java.lang.Object) r5, (java.lang.Object) r0)     // Catch:{ IOException -> 0x0025, Error -> 0x0023, OverlappingFileLockException -> 0x0021 }
            return r2
        L_0x0021:
            r2 = move-exception
            goto L_0x0037
        L_0x0023:
            r2 = move-exception
            goto L_0x0037
        L_0x0025:
            r2 = move-exception
            goto L_0x0037
        L_0x0027:
            r0 = move-exception
            goto L_0x002c
        L_0x0029:
            r0 = move-exception
            goto L_0x002c
        L_0x002b:
            r0 = move-exception
        L_0x002c:
            r2 = r0
            r0 = r1
            goto L_0x0037
        L_0x002f:
            r5 = move-exception
            goto L_0x0034
        L_0x0031:
            r5 = move-exception
            goto L_0x0034
        L_0x0033:
            r5 = move-exception
        L_0x0034:
            r2 = r5
            r5 = r1
            r0 = r5
        L_0x0037:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L_0x0043
            r0.release()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            if (r5 == 0) goto L_0x0048
            r5.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.l.b(android.content.Context):x2.l");
    }

    public final c a(p pVar) {
        c a10 = ((c) this.f12945a).a();
        a10.e((String) this.f12946b, pVar);
        return a10;
    }

    public final void c() {
        try {
            ((FileLock) this.f12946b).release();
            ((FileChannel) this.f12945a).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    public final p d(c cVar, p pVar) {
        w wVar;
        j4.c(cVar);
        if (!(pVar instanceof q)) {
            return pVar;
        }
        q qVar = (q) pVar;
        ArrayList arrayList = qVar.f8393b;
        String str = qVar.f8392a;
        if (((Map) this.f12945a).containsKey(str)) {
            wVar = (w) ((Map) this.f12945a).get(str);
        } else {
            wVar = (e0) this.f12946b;
        }
        return wVar.a(str, cVar, arrayList);
    }

    public final void e(w wVar) {
        Iterator it = wVar.f8532a.iterator();
        while (it.hasNext()) {
            ((Map) this.f12945a).put(Integer.valueOf(((g0) it.next()).f8190a).toString(), wVar);
        }
    }

    public final Object get() {
        return new k((Context) ((a) this.f12945a).get(), (i) ((a) this.f12946b).get());
    }

    public final xd zza() {
        return (xd) this.f12945a;
    }

    public final xd zzb() {
        return (xd) this.f12946b;
    }
}
