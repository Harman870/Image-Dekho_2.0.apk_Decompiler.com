package h7;

import e7.h;
import e7.k;
import e7.q;
import e7.t;
import e7.u;
import java.lang.reflect.Type;
import k7.b;

public final class m<T> extends t<T> {

    /* renamed from: a  reason: collision with root package name */
    public final q<T> f6973a;

    /* renamed from: b  reason: collision with root package name */
    public final k<T> f6974b;

    /* renamed from: c  reason: collision with root package name */
    public final h f6975c;

    /* renamed from: d  reason: collision with root package name */
    public final j7.a<T> f6976d;

    /* renamed from: e  reason: collision with root package name */
    public final u f6977e = null;

    /* renamed from: f  reason: collision with root package name */
    public t<T> f6978f;

    public final class a {
    }

    public m(q qVar, k kVar, h hVar, j7.a aVar) {
        new a();
        this.f6973a = qVar;
        this.f6974b = kVar;
        this.f6975c = hVar;
        this.f6976d = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        throw new e7.r((java.lang.Exception) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        throw new e7.m((java.lang.Exception) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        throw new e7.r((java.lang.Exception) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0043, code lost:
        r4 = e7.n.f6209a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005e, code lost:
        throw new e7.r((java.lang.Exception) r4);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002a A[ExcHandler: NumberFormatException (r4v11 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:7:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031 A[ExcHandler: IOException (r4v10 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:7:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038 A[ExcHandler: c (r4v9 'e' k7.c A[CUSTOM_DECLARE]), Splitter:B:7:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T a(k7.a r4) {
        /*
            r3 = this;
            e7.k<T> r0 = r3.f6974b
            if (r0 != 0) goto L_0x001a
            e7.t<T> r0 = r3.f6978f
            if (r0 == 0) goto L_0x0009
            goto L_0x0015
        L_0x0009:
            e7.h r0 = r3.f6975c
            e7.u r1 = r3.f6977e
            j7.a<T> r2 = r3.f6976d
            e7.t r0 = r0.c(r1, r2)
            r3.f6978f = r0
        L_0x0015:
            java.lang.Object r4 = r0.a(r4)
            return r4
        L_0x001a:
            r4.W()     // Catch:{ EOFException -> 0x003f, c -> 0x0038, IOException -> 0x0031, NumberFormatException -> 0x002a }
            r0 = 0
            h7.o$u r1 = h7.o.A     // Catch:{ EOFException -> 0x0028, c -> 0x0038, IOException -> 0x0031, NumberFormatException -> 0x002a }
            r1.getClass()     // Catch:{ EOFException -> 0x0028, c -> 0x0038, IOException -> 0x0031, NumberFormatException -> 0x002a }
            e7.l r4 = h7.o.u.c(r4)     // Catch:{ EOFException -> 0x0028, c -> 0x0038, IOException -> 0x0031, NumberFormatException -> 0x002a }
            goto L_0x0045
        L_0x0028:
            r4 = move-exception
            goto L_0x0041
        L_0x002a:
            r4 = move-exception
            e7.r r0 = new e7.r
            r0.<init>((java.lang.Exception) r4)
            throw r0
        L_0x0031:
            r4 = move-exception
            e7.m r0 = new e7.m
            r0.<init>((java.lang.Exception) r4)
            throw r0
        L_0x0038:
            r4 = move-exception
            e7.r r0 = new e7.r
            r0.<init>((java.lang.Exception) r4)
            throw r0
        L_0x003f:
            r4 = move-exception
            r0 = 1
        L_0x0041:
            if (r0 == 0) goto L_0x0059
            e7.n r4 = e7.n.f6209a
        L_0x0045:
            r4.getClass()
            boolean r4 = r4 instanceof e7.n
            if (r4 == 0) goto L_0x004e
            r4 = 0
            return r4
        L_0x004e:
            e7.k<T> r4 = r3.f6974b
            j7.a<T> r0 = r3.f6976d
            java.lang.reflect.Type r0 = r0.f8777b
            java.lang.Object r4 = r4.a()
            return r4
        L_0x0059:
            e7.r r0 = new e7.r
            r0.<init>((java.lang.Exception) r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.m.a(k7.a):java.lang.Object");
    }

    public final void b(b bVar, T t10) {
        q<T> qVar = this.f6973a;
        if (qVar == null) {
            t<T> tVar = this.f6978f;
            if (tVar == null) {
                tVar = this.f6975c.c(this.f6977e, this.f6976d);
                this.f6978f = tVar;
            }
            tVar.b(bVar, t10);
        } else if (t10 == null) {
            bVar.v();
        } else {
            Type type = this.f6976d.f8777b;
            o.A.b(bVar, qVar.a());
        }
    }
}
