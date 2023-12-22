package h7;

import e7.h;
import e7.t;
import e7.u;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import k7.b;

public final class c extends t<Date> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f6934c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final DateFormat f6935a = DateFormat.getDateTimeInstance(2, 2, Locale.US);

    /* renamed from: b  reason: collision with root package name */
    public final DateFormat f6936b = DateFormat.getDateTimeInstance(2, 2);

    public static class a implements u {
        public final <T> t<T> b(h hVar, j7.a<T> aVar) {
            if (aVar.f8776a == Date.class) {
                return new c();
            }
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:7|8) */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r3 = i7.a.b(r3, new java.text.ParsePosition(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        throw new e7.r(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3 = r2.f6935a.parse(r3);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0020 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(k7.a r3) {
        /*
            r2 = this;
            int r0 = r3.W()
            r1 = 9
            if (r0 != r1) goto L_0x000d
            r3.S()
            r3 = 0
            goto L_0x002b
        L_0x000d:
            java.lang.String r3 = r3.U()
            monitor-enter(r2)
            java.text.DateFormat r0 = r2.f6936b     // Catch:{ ParseException -> 0x0019 }
            java.util.Date r3 = r0.parse(r3)     // Catch:{ ParseException -> 0x0019 }
            goto L_0x002a
        L_0x0019:
            java.text.DateFormat r0 = r2.f6935a     // Catch:{ ParseException -> 0x0020 }
            java.util.Date r3 = r0.parse(r3)     // Catch:{ ParseException -> 0x0020 }
            goto L_0x002a
        L_0x0020:
            java.text.ParsePosition r0 = new java.text.ParsePosition     // Catch:{ ParseException -> 0x002c }
            r1 = 0
            r0.<init>(r1)     // Catch:{ ParseException -> 0x002c }
            java.util.Date r3 = i7.a.b(r3, r0)     // Catch:{ ParseException -> 0x002c }
        L_0x002a:
            monitor-exit(r2)
        L_0x002b:
            return r3
        L_0x002c:
            r0 = move-exception
            e7.r r1 = new e7.r     // Catch:{ all -> 0x0033 }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x0033 }
            throw r1     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.c.a(k7.a):java.lang.Object");
    }

    public final void b(b bVar, Object obj) {
        Date date = (Date) obj;
        synchronized (this) {
            if (date == null) {
                bVar.v();
            } else {
                bVar.O(this.f6935a.format(date));
            }
        }
    }
}
