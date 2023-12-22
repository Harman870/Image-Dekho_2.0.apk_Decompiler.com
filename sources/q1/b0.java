package q1;

import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.util.ArrayList;
import o1.a;
import o1.f;
import q1.h;
import u1.n;

public final class b0 implements h, h.a {

    /* renamed from: a  reason: collision with root package name */
    public final i<?> f10975a;

    /* renamed from: b  reason: collision with root package name */
    public final h.a f10976b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f10977c;

    /* renamed from: d  reason: collision with root package name */
    public volatile e f10978d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f10979e;

    /* renamed from: f  reason: collision with root package name */
    public volatile n.a<?> f10980f;

    /* renamed from: g  reason: collision with root package name */
    public volatile f f10981g;

    public b0(i<?> iVar, h.a aVar) {
        this.f10975a = iVar;
        this.f10976b = aVar;
    }

    public final void a(f fVar, Object obj, d<?> dVar, a aVar, f fVar2) {
        this.f10976b.a(fVar, obj, dVar, this.f10980f.f12137c.e(), fVar);
    }

    public final void b() {
        throw new UnsupportedOperationException();
    }

    public final void c(f fVar, Exception exc, d<?> dVar, a aVar) {
        this.f10976b.c(fVar, exc, dVar, this.f10980f.f12137c.e());
    }

    public final void cancel() {
        n.a<?> aVar = this.f10980f;
        if (aVar != null) {
            aVar.f12137c.cancel();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r0 = "SourceGenerator"
            int r1 = j2.h.f8019b
            long r1 = android.os.SystemClock.elapsedRealtimeNanos()
            r3 = 1
            r4 = 0
            q1.i<?> r5 = r12.f10975a     // Catch:{ all -> 0x00e2 }
            com.bumptech.glide.h r5 = r5.f11005c     // Catch:{ all -> 0x00e2 }
            com.bumptech.glide.k r5 = r5.a()     // Catch:{ all -> 0x00e2 }
            com.bumptech.glide.load.data.e r5 = r5.f(r13)     // Catch:{ all -> 0x00e2 }
            java.lang.Object r6 = r5.a()     // Catch:{ all -> 0x00e2 }
            q1.i<?> r7 = r12.f10975a     // Catch:{ all -> 0x00e2 }
            o1.d r7 = r7.e(r6)     // Catch:{ all -> 0x00e2 }
            q1.g r8 = new q1.g     // Catch:{ all -> 0x00e2 }
            q1.i<?> r9 = r12.f10975a     // Catch:{ all -> 0x00e2 }
            o1.h r9 = r9.f11011i     // Catch:{ all -> 0x00e2 }
            r8.<init>(r7, r6, r9)     // Catch:{ all -> 0x00e2 }
            q1.f r6 = new q1.f     // Catch:{ all -> 0x00e2 }
            u1.n$a<?> r9 = r12.f10980f     // Catch:{ all -> 0x00e2 }
            o1.f r9 = r9.f12135a     // Catch:{ all -> 0x00e2 }
            q1.i<?> r10 = r12.f10975a     // Catch:{ all -> 0x00e2 }
            o1.f r11 = r10.f11015n     // Catch:{ all -> 0x00e2 }
            r6.<init>(r9, r11)     // Catch:{ all -> 0x00e2 }
            q1.j$d r9 = r10.f11010h     // Catch:{ all -> 0x00e2 }
            q1.m$c r9 = (q1.m.c) r9     // Catch:{ all -> 0x00e2 }
            s1.a r9 = r9.a()     // Catch:{ all -> 0x00e2 }
            r9.b(r6, r8)     // Catch:{ all -> 0x00e2 }
            r8 = 2
            boolean r8 = android.util.Log.isLoggable(r0, r8)     // Catch:{ all -> 0x00e2 }
            java.lang.String r10 = ", data: "
            if (r8 == 0) goto L_0x0078
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e2 }
            r8.<init>()     // Catch:{ all -> 0x00e2 }
            java.lang.String r11 = "Finished encoding source to cache, key: "
            r8.append(r11)     // Catch:{ all -> 0x00e2 }
            r8.append(r6)     // Catch:{ all -> 0x00e2 }
            r8.append(r10)     // Catch:{ all -> 0x00e2 }
            r8.append(r13)     // Catch:{ all -> 0x00e2 }
            java.lang.String r11 = ", encoder: "
            r8.append(r11)     // Catch:{ all -> 0x00e2 }
            r8.append(r7)     // Catch:{ all -> 0x00e2 }
            java.lang.String r7 = ", duration: "
            r8.append(r7)     // Catch:{ all -> 0x00e2 }
            double r1 = j2.h.a(r1)     // Catch:{ all -> 0x00e2 }
            r8.append(r1)     // Catch:{ all -> 0x00e2 }
            java.lang.String r1 = r8.toString()     // Catch:{ all -> 0x00e2 }
            android.util.Log.v(r0, r1)     // Catch:{ all -> 0x00e2 }
        L_0x0078:
            java.io.File r1 = r9.a(r6)     // Catch:{ all -> 0x00e2 }
            if (r1 == 0) goto L_0x0099
            r12.f10981g = r6     // Catch:{ all -> 0x00e2 }
            q1.e r13 = new q1.e     // Catch:{ all -> 0x00e2 }
            u1.n$a<?> r0 = r12.f10980f     // Catch:{ all -> 0x00e2 }
            o1.f r0 = r0.f12135a     // Catch:{ all -> 0x00e2 }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x00e2 }
            q1.i<?> r1 = r12.f10975a     // Catch:{ all -> 0x00e2 }
            r13.<init>(r0, r1, r12)     // Catch:{ all -> 0x00e2 }
            r12.f10978d = r13     // Catch:{ all -> 0x00e2 }
            u1.n$a<?> r13 = r12.f10980f
            com.bumptech.glide.load.data.d<Data> r13 = r13.f12137c
            r13.b()
            return r3
        L_0x0099:
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e2 }
            if (r1 == 0) goto L_0x00c1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e2 }
            r1.<init>()     // Catch:{ all -> 0x00e2 }
            java.lang.String r2 = "Attempt to write: "
            r1.append(r2)     // Catch:{ all -> 0x00e2 }
            q1.f r2 = r12.f10981g     // Catch:{ all -> 0x00e2 }
            r1.append(r2)     // Catch:{ all -> 0x00e2 }
            r1.append(r10)     // Catch:{ all -> 0x00e2 }
            r1.append(r13)     // Catch:{ all -> 0x00e2 }
            java.lang.String r13 = " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly..."
            r1.append(r13)     // Catch:{ all -> 0x00e2 }
            java.lang.String r13 = r1.toString()     // Catch:{ all -> 0x00e2 }
            android.util.Log.d(r0, r13)     // Catch:{ all -> 0x00e2 }
        L_0x00c1:
            q1.h$a r13 = r12.f10976b     // Catch:{ all -> 0x00e0 }
            u1.n$a<?> r0 = r12.f10980f     // Catch:{ all -> 0x00e0 }
            o1.f r6 = r0.f12135a     // Catch:{ all -> 0x00e0 }
            java.lang.Object r7 = r5.a()     // Catch:{ all -> 0x00e0 }
            u1.n$a<?> r0 = r12.f10980f     // Catch:{ all -> 0x00e0 }
            com.bumptech.glide.load.data.d<Data> r8 = r0.f12137c     // Catch:{ all -> 0x00e0 }
            u1.n$a<?> r0 = r12.f10980f     // Catch:{ all -> 0x00e0 }
            com.bumptech.glide.load.data.d<Data> r0 = r0.f12137c     // Catch:{ all -> 0x00e0 }
            o1.a r9 = r0.e()     // Catch:{ all -> 0x00e0 }
            u1.n$a<?> r0 = r12.f10980f     // Catch:{ all -> 0x00e0 }
            o1.f r10 = r0.f12135a     // Catch:{ all -> 0x00e0 }
            r5 = r13
            r5.a(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00e0 }
            return r4
        L_0x00e0:
            r13 = move-exception
            goto L_0x00e4
        L_0x00e2:
            r13 = move-exception
            r3 = r4
        L_0x00e4:
            if (r3 != 0) goto L_0x00ed
            u1.n$a<?> r0 = r12.f10980f
            com.bumptech.glide.load.data.d<Data> r0 = r0.f12137c
            r0.b()
        L_0x00ed:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.b0.d(java.lang.Object):boolean");
    }

    public final boolean e() {
        boolean z9;
        boolean z10;
        if (this.f10979e != null) {
            Object obj = this.f10979e;
            this.f10979e = null;
            try {
                if (!d(obj)) {
                    return true;
                }
            } catch (IOException e10) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e10);
                }
            }
        }
        if (this.f10978d != null && this.f10978d.e()) {
            return true;
        }
        this.f10978d = null;
        this.f10980f = null;
        boolean z11 = false;
        while (!z11) {
            if (this.f10977c < this.f10975a.b().size()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                break;
            }
            ArrayList b10 = this.f10975a.b();
            int i10 = this.f10977c;
            this.f10977c = i10 + 1;
            this.f10980f = (n.a) b10.get(i10);
            if (this.f10980f != null) {
                if (!this.f10975a.f11017p.c(this.f10980f.f12137c.e())) {
                    if (this.f10975a.c(this.f10980f.f12137c.a()) != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                    }
                }
                this.f10980f.f12137c.f(this.f10975a.f11016o, new a0(this, this.f10980f));
                z11 = true;
            }
        }
        return z11;
    }
}
