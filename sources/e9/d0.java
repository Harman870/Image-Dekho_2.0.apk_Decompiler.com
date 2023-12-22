package e9;

import c9.e;
import h9.a;

public abstract class d0 extends p {

    /* renamed from: b  reason: collision with root package name */
    public long f6225b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6226c;

    /* renamed from: d  reason: collision with root package name */
    public a<z<?>> f6227d;

    public final void N() {
        long j10 = this.f6225b - 4294967296L;
        this.f6225b = j10;
        if (j10 <= 0 && this.f6226c) {
            shutdown();
        }
    }

    public final void O(z<?> zVar) {
        a<z<?>> aVar = this.f6227d;
        if (aVar == null) {
            aVar = new a<>();
            this.f6227d = aVar;
        }
        Object[] objArr = aVar.f7038a;
        int i10 = aVar.f7040c;
        objArr[i10] = zVar;
        int length = (objArr.length - 1) & (i10 + 1);
        aVar.f7040c = length;
        int i11 = aVar.f7039b;
        if (length == i11) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[(length2 << 1)];
            e.Z(objArr, objArr2, 0, i11, 0, 10);
            Object[] objArr3 = aVar.f7038a;
            int length3 = objArr3.length;
            int i12 = aVar.f7039b;
            e.Z(objArr3, objArr2, length3 - i12, 0, i12, 4);
            aVar.f7038a = objArr2;
            aVar.f7039b = 0;
            aVar.f7040c = length2;
        }
    }

    public final void P(boolean z9) {
        this.f6225b = (z9 ? 4294967296L : 1) + this.f6225b;
        if (!z9) {
            this.f6226c = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: e9.z} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Q() {
        /*
            r7 = this;
            h9.a<e9.z<?>> r0 = r7.f6227d
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r2 = r0.f7039b
            int r3 = r0.f7040c
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L_0x000f
            goto L_0x001f
        L_0x000f:
            java.lang.Object[] r3 = r0.f7038a
            r6 = r3[r2]
            r3[r2] = r4
            int r2 = r2 + r5
            int r3 = r3.length
            int r3 = r3 + -1
            r2 = r2 & r3
            r0.f7039b = r2
            if (r6 == 0) goto L_0x0028
            r4 = r6
        L_0x001f:
            e9.z r4 = (e9.z) r4
            if (r4 != 0) goto L_0x0024
            return r1
        L_0x0024:
            r4.run()
            return r5
        L_0x0028:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.d0.Q():boolean");
    }

    public void shutdown() {
    }
}
