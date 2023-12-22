package q1;

import android.util.Log;
import androidx.activity.f;
import c2.d;
import com.bumptech.glide.load.data.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k2.a;
import o1.h;
import o1.j;

public final class k<DataType, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<DataType> f11051a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends j<DataType, ResourceType>> f11052b;

    /* renamed from: c  reason: collision with root package name */
    public final d<ResourceType, Transcode> f11053c;

    /* renamed from: d  reason: collision with root package name */
    public final g0.d<List<Throwable>> f11054d;

    /* renamed from: e  reason: collision with root package name */
    public final String f11055e;

    public k(Class cls, Class cls2, Class cls3, List list, d dVar, a.c cVar) {
        this.f11051a = cls;
        this.f11052b = list;
        this.f11053c = dVar;
        this.f11054d = cVar;
        StringBuilder g10 = f.g("Failed DecodePath{");
        g10.append(cls.getSimpleName());
        g10.append("->");
        g10.append(cls2.getSimpleName());
        g10.append("->");
        g10.append(cls3.getSimpleName());
        g10.append("}");
        this.f11055e = g10.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: q1.w<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: q1.w<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: q1.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: q1.v<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: q1.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: q1.w<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: q1.w<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: q1.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: q1.y} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final q1.w a(int r18, int r19, o1.h r20, com.bumptech.glide.load.data.e r21, q1.j.b r22) {
        /*
            r17 = this;
            r7 = r17
            r0 = r22
            g0.d<java.util.List<java.lang.Throwable>> r1 = r7.f11054d
            java.lang.Object r1 = r1.b()
            y3.a.h(r1)
            r8 = r1
            java.util.List r8 = (java.util.List) r8
            r1 = r17
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r8
            q1.w r1 = r1.b(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0138 }
            g0.d<java.util.List<java.lang.Throwable>> r2 = r7.f11054d
            r2.a(r8)
            q1.j r2 = q1.j.this
            o1.a r0 = r0.f11043a
            r2.getClass()
            java.lang.Object r3 = r1.get()
            java.lang.Class r15 = r3.getClass()
            o1.a r3 = o1.a.RESOURCE_DISK_CACHE
            r4 = 0
            if (r0 == r3) goto L_0x004a
            q1.i<R> r3 = r2.f11020a
            o1.l r3 = r3.f(r15)
            com.bumptech.glide.h r5 = r2.f11027h
            int r6 = r2.f11030l
            int r8 = r2.f11031m
            q1.w r5 = r3.a(r5, r1, r6, r8)
            r14 = r3
            goto L_0x004c
        L_0x004a:
            r5 = r1
            r14 = r4
        L_0x004c:
            boolean r3 = r1.equals(r5)
            if (r3 != 0) goto L_0x0055
            r1.c()
        L_0x0055:
            q1.i<R> r1 = r2.f11020a
            com.bumptech.glide.h r1 = r1.f11005c
            com.bumptech.glide.k r1 = r1.a()
            e2.e r1 = r1.f2573d
            java.lang.Class r3 = r5.b()
            o1.k r1 = r1.a(r3)
            r3 = 0
            r6 = 1
            if (r1 == 0) goto L_0x006d
            r1 = r6
            goto L_0x006e
        L_0x006d:
            r1 = r3
        L_0x006e:
            if (r1 == 0) goto L_0x0095
            q1.i<R> r1 = r2.f11020a
            com.bumptech.glide.h r1 = r1.f11005c
            com.bumptech.glide.k r1 = r1.a()
            e2.e r1 = r1.f2573d
            java.lang.Class r4 = r5.b()
            o1.k r4 = r1.a(r4)
            if (r4 == 0) goto L_0x008b
            o1.h r1 = r2.f11033o
            o1.c r1 = r4.c(r1)
            goto L_0x0097
        L_0x008b:
            com.bumptech.glide.k$d r0 = new com.bumptech.glide.k$d
            java.lang.Class r1 = r5.b()
            r0.<init>(r1)
            throw r0
        L_0x0095:
            o1.c r1 = o1.c.NONE
        L_0x0097:
            q1.i<R> r8 = r2.f11020a
            o1.f r9 = r2.f11040x
            java.util.ArrayList r8 = r8.b()
            int r10 = r8.size()
            r11 = r3
        L_0x00a4:
            if (r11 >= r10) goto L_0x00b9
            java.lang.Object r12 = r8.get(r11)
            u1.n$a r12 = (u1.n.a) r12
            o1.f r12 = r12.f12135a
            boolean r12 = r12.equals(r9)
            if (r12 == 0) goto L_0x00b6
            r8 = r6
            goto L_0x00ba
        L_0x00b6:
            int r11 = r11 + 1
            goto L_0x00a4
        L_0x00b9:
            r8 = r3
        L_0x00ba:
            r8 = r8 ^ r6
            q1.l r9 = r2.f11032n
            boolean r0 = r9.d(r8, r0, r1)
            if (r0 == 0) goto L_0x012f
            if (r4 == 0) goto L_0x0121
            int r0 = r1.ordinal()
            if (r0 == 0) goto L_0x00fd
            if (r0 != r6) goto L_0x00e6
            q1.y r0 = new q1.y
            q1.i<R> r1 = r2.f11020a
            com.bumptech.glide.h r1 = r1.f11005c
            r1.b r9 = r1.f2553a
            o1.f r10 = r2.f11040x
            o1.f r11 = r2.f11028i
            int r12 = r2.f11030l
            int r13 = r2.f11031m
            o1.h r1 = r2.f11033o
            r8 = r0
            r16 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0106
        L_0x00e6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown strategy: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x00fd:
            q1.f r0 = new q1.f
            o1.f r1 = r2.f11040x
            o1.f r8 = r2.f11028i
            r0.<init>(r1, r8)
        L_0x0106:
            k2.a$c r1 = q1.v.f11143e
            java.lang.Object r1 = r1.b()
            q1.v r1 = (q1.v) r1
            y3.a.h(r1)
            r1.f11147d = r3
            r1.f11146c = r6
            r1.f11145b = r5
            q1.j$c<?> r2 = r2.f11025f
            r2.f11045a = r0
            r2.f11046b = r4
            r2.f11047c = r1
            r5 = r1
            goto L_0x012f
        L_0x0121:
            com.bumptech.glide.k$d r0 = new com.bumptech.glide.k$d
            java.lang.Object r1 = r5.get()
            java.lang.Class r1 = r1.getClass()
            r0.<init>(r1)
            throw r0
        L_0x012f:
            c2.d<ResourceType, Transcode> r0 = r7.f11053c
            r1 = r20
            q1.w r0 = r0.a(r5, r1)
            return r0
        L_0x0138:
            r0 = move-exception
            r1 = r0
            g0.d<java.util.List<java.lang.Throwable>> r0 = r7.f11054d
            r0.a(r8)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.k.a(int, int, o1.h, com.bumptech.glide.load.data.e, q1.j$b):q1.w");
    }

    public final w<ResourceType> b(e<DataType> eVar, int i10, int i11, h hVar, List<Throwable> list) {
        int size = this.f11052b.size();
        w<ResourceType> wVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            j jVar = (j) this.f11052b.get(i12);
            try {
                if (jVar.a(eVar.a(), hVar)) {
                    wVar = jVar.b(eVar.a(), i10, i11, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e10);
                }
                list.add(e10);
            }
            if (wVar != null) {
                break;
            }
        }
        if (wVar != null) {
            return wVar;
        }
        throw new r(this.f11055e, new ArrayList(list));
    }

    public final String toString() {
        StringBuilder g10 = f.g("DecodePath{ dataClass=");
        g10.append(this.f11051a);
        g10.append(", decoders=");
        g10.append(this.f11052b);
        g10.append(", transcoder=");
        g10.append(this.f11053c);
        g10.append('}');
        return g10.toString();
    }
}
