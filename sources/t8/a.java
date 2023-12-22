package t8;

import java.lang.reflect.Method;
import x8.f;
import y8.b;
import y8.c;

public class a {

    /* renamed from: t8.a$a  reason: collision with other inner class name */
    public static final class C0149a {

        /* renamed from: a  reason: collision with root package name */
        public static final Method f12029a;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Class[]} */
        /* JADX WARNING: type inference failed for: r5v5 */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
            if (x8.f.a(r5, r0) != false) goto L_0x0036;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        static {
            /*
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                x8.f.e(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L_0x000e:
                r5 = 0
                if (r4 >= r2) goto L_0x003d
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = x8.f.a(r7, r8)
                r8 = 1
                if (r7 == 0) goto L_0x0035
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r9 = "it.parameterTypes"
                x8.f.e(r7, r9)
                int r9 = r7.length
                if (r9 != r8) goto L_0x002e
                r5 = r7[r3]
            L_0x002e:
                boolean r5 = x8.f.a(r5, r0)
                if (r5 == 0) goto L_0x0035
                goto L_0x0036
            L_0x0035:
                r8 = r3
            L_0x0036:
                if (r8 == 0) goto L_0x003a
                r5 = r6
                goto L_0x003d
            L_0x003a:
                int r4 = r4 + 1
                goto L_0x000e
            L_0x003d:
                f12029a = r5
                int r0 = r1.length
            L_0x0040:
                if (r3 >= r0) goto L_0x0054
                r2 = r1[r3]
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = x8.f.a(r2, r4)
                if (r2 == 0) goto L_0x0051
                goto L_0x0054
            L_0x0051:
                int r3 = r3 + 1
                goto L_0x0040
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t8.a.C0149a.<clinit>():void");
        }
    }

    public void a(Throwable th, Throwable th2) {
        f.f(th, "cause");
        f.f(th2, "exception");
        Method method = C0149a.f12029a;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }

    public c b() {
        return new b();
    }
}
