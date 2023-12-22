package r3;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import p3.a;

public abstract class f<T extends IInterface> extends b<T> implements a.e {
    public final Account A;

    /* renamed from: y  reason: collision with root package name */
    public final c f11582y;

    /* renamed from: z  reason: collision with root package name */
    public final Set<Scope> f11583z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(android.content.Context r10, android.os.Looper r11, int r12, r3.c r13, q3.c r14, q3.i r15) {
        /*
            r9 = this;
            r3.e1 r3 = r3.g.a(r10)
            o3.e r4 = o3.e.f10553d
            r3.o.h(r14)
            r3.o.h(r15)
            r3.z r6 = new r3.z
            r6.<init>(r14)
            r3.a0 r7 = new r3.a0
            r7.<init>(r15)
            java.lang.String r8 = r13.f11532f
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f11582y = r13
            android.accounts.Account r10 = r13.f11527a
            r9.A = r10
            java.util.Set<com.google.android.gms.common.api.Scope> r10 = r13.f11529c
            java.util.Iterator r11 = r10.iterator()
        L_0x002b:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0046
            java.lang.Object r12 = r11.next()
            com.google.android.gms.common.api.Scope r12 = (com.google.android.gms.common.api.Scope) r12
            boolean r12 = r10.contains(r12)
            if (r12 == 0) goto L_0x003e
            goto L_0x002b
        L_0x003e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Expanding scopes is not permitted, use implied scopes instead"
            r10.<init>(r11)
            throw r10
        L_0x0046:
            r9.f11583z = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.f.<init>(android.content.Context, android.os.Looper, int, r3.c, q3.c, q3.i):void");
    }

    public final Set<Scope> b() {
        return l() ? this.f11583z : Collections.emptySet();
    }

    public final Account q() {
        return this.A;
    }

    public final void s() {
    }

    public final Set<Scope> u() {
        return this.f11583z;
    }
}
