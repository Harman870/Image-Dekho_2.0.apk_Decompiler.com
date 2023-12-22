package u9;

import q8.d;
import s8.e;
import z5.c;

public final class s {

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f12296a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Exception f12297b;

        public a(Exception exc, b bVar) {
            this.f12296a = bVar;
            this.f12297b = exc;
        }

        public final void run() {
            c.k(this.f12296a).e(c.a.d(this.f12297b));
        }
    }

    @e(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {113}, m = "suspendAndThrow")
    public static final class b extends s8.c {

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ Object f12298d;

        /* renamed from: e  reason: collision with root package name */
        public int f12299e;

        public b(d dVar) {
            super(dVar);
        }

        public final Object c(Object obj) {
            this.f12298d = obj;
            this.f12299e |= Integer.MIN_VALUE;
            return s.a((Exception) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(java.lang.Exception r4, q8.d<?> r5) {
        /*
            boolean r0 = r5 instanceof u9.s.b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            u9.s$b r0 = (u9.s.b) r0
            int r1 = r0.f12299e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12299e = r1
            goto L_0x0018
        L_0x0013:
            u9.s$b r0 = new u9.s$b
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f12298d
            r8.a r1 = r8.a.COROUTINE_SUSPENDED
            int r2 = r0.f12299e
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            c.a.k(r5)
            o8.h r4 = o8.h.f10610a
            return r4
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            c.a.k(r5)
            r0.getClass()
            r0.f12299e = r3
            i9.c r5 = e9.a0.f6218a
            q8.f r2 = r0.f11898b
            x8.f.c(r2)
            u9.s$a r3 = new u9.s$a
            r3.<init>(r4, r0)
            r5.L(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.s.a(java.lang.Exception, q8.d):java.lang.Object");
    }
}
