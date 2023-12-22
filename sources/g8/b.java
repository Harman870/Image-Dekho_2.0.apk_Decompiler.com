package g8;

import androidx.fragment.app.d0;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import java.lang.ref.WeakReference;
import m.i;

public final class b extends d0 {

    /* renamed from: f  reason: collision with root package name */
    public final c f6643f;

    /* renamed from: g  reason: collision with root package name */
    public final i<WeakReference<o>> f6644g;

    public b(y yVar, c cVar) {
        super(yVar);
        this.f6643f = cVar;
        this.f6644g = new i<>(cVar.size());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r1 = r0.f9305c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r5, androidx.fragment.app.o r6) {
        /*
            r4 = this;
            m.i<java.lang.ref.WeakReference<androidx.fragment.app.o>> r0 = r4.f6644g
            int[] r1 = r0.f9304b
            int r2 = r0.f9306d
            int r5 = androidx.lifecycle.c0.c(r2, r5, r1)
            if (r5 < 0) goto L_0x0019
            java.lang.Object[] r1 = r0.f9305c
            r2 = r1[r5]
            java.lang.Object r3 = m.i.f9302e
            if (r2 == r3) goto L_0x0019
            r1[r5] = r3
            r5 = 1
            r0.f9303a = r5
        L_0x0019:
            androidx.fragment.app.a r5 = r4.f1449c
            if (r5 != 0) goto L_0x0029
            androidx.fragment.app.y r5 = r4.f1447a
            r5.getClass()
            androidx.fragment.app.a r0 = new androidx.fragment.app.a
            r0.<init>(r5)
            r4.f1449c = r0
        L_0x0029:
            androidx.fragment.app.a r5 = r4.f1449c
            r5.getClass()
            androidx.fragment.app.y r0 = r6.f1579s
            if (r0 == 0) goto L_0x0053
            androidx.fragment.app.y r1 = r5.f1409p
            if (r0 != r1) goto L_0x0037
            goto L_0x0053
        L_0x0037:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot detach Fragment attached to a different FragmentManager. Fragment "
            java.lang.StringBuilder r0 = androidx.activity.f.g(r0)
            java.lang.String r6 = r6.toString()
            r0.append(r6)
            java.lang.String r6 = " is already attached to a FragmentManager."
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L_0x0053:
            androidx.fragment.app.h0$a r0 = new androidx.fragment.app.h0$a
            r1 = 6
            r0.<init>((int) r1, (androidx.fragment.app.o) r6)
            r5.b(r0)
            androidx.fragment.app.o r5 = r4.f1450d
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0067
            r5 = 0
            r4.f1450d = r5
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.b.a(int, androidx.fragment.app.o):void");
    }

    public final int b() {
        return this.f6643f.size();
    }
}
