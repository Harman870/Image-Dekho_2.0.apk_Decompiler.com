package e0;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m.f;
import m.h;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final f<String, Typeface> f6143a = new f<>(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadPoolExecutor f6144b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f6145c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final h<String, ArrayList<g0.a<a>>> f6146d = new h<>();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Typeface f6147a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6148b;

        public a(int i10) {
            this.f6147a = null;
            this.f6148b = i10;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.f6147a = typeface;
            this.f6148b = 0;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new n());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f6144b = threadPoolExecutor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static e0.k.a a(java.lang.String r6, android.content.Context r7, e0.f r8, int r9) {
        /*
            m.f<java.lang.String, android.graphics.Typeface> r0 = f6143a
            java.lang.Object r0 = r0.b(r6)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x0010
            e0.k$a r6 = new e0.k$a
            r6.<init>((android.graphics.Typeface) r0)
            return r6
        L_0x0010:
            e0.l r8 = e0.e.a(r7, r8)     // Catch:{ NameNotFoundException -> 0x0060 }
            int r0 = r8.f6149a
            r1 = -3
            r2 = 1
            if (r0 == 0) goto L_0x001f
            if (r0 == r2) goto L_0x001d
            goto L_0x0034
        L_0x001d:
            r0 = -2
            goto L_0x003d
        L_0x001f:
            e0.m[] r0 = r8.f6150b
            if (r0 == 0) goto L_0x003c
            int r3 = r0.length
            if (r3 != 0) goto L_0x0027
            goto L_0x003c
        L_0x0027:
            int r2 = r0.length
            r3 = 0
            r4 = r3
        L_0x002a:
            if (r4 >= r2) goto L_0x003b
            r5 = r0[r4]
            int r5 = r5.f6155e
            if (r5 == 0) goto L_0x0038
            if (r5 >= 0) goto L_0x0036
        L_0x0034:
            r0 = r1
            goto L_0x003d
        L_0x0036:
            r0 = r5
            goto L_0x003d
        L_0x0038:
            int r4 = r4 + 1
            goto L_0x002a
        L_0x003b:
            r2 = r3
        L_0x003c:
            r0 = r2
        L_0x003d:
            if (r0 == 0) goto L_0x0045
            e0.k$a r6 = new e0.k$a
            r6.<init>((int) r0)
            return r6
        L_0x0045:
            e0.m[] r8 = r8.f6150b
            a0.l r0 = a0.e.f11a
            android.graphics.Typeface r7 = r0.b(r7, r8, r9)
            if (r7 == 0) goto L_0x005a
            m.f<java.lang.String, android.graphics.Typeface> r8 = f6143a
            r8.c(r6, r7)
            e0.k$a r6 = new e0.k$a
            r6.<init>((android.graphics.Typeface) r7)
            return r6
        L_0x005a:
            e0.k$a r6 = new e0.k$a
            r6.<init>((int) r1)
            return r6
        L_0x0060:
            e0.k$a r6 = new e0.k$a
            r7 = -1
            r6.<init>((int) r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.k.a(java.lang.String, android.content.Context, e0.f, int):e0.k$a");
    }
}
