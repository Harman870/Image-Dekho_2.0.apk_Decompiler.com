package j4;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import m.b;
import m.g;

public final class o4 {

    /* renamed from: h  reason: collision with root package name */
    public static final b f8354h = new b();

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f8355i = {"key", "value"};

    /* renamed from: a  reason: collision with root package name */
    public final ContentResolver f8356a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f8357b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f8358c;

    /* renamed from: d  reason: collision with root package name */
    public final n4 f8359d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f8360e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public volatile Map f8361f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f8362g = new ArrayList();

    public o4(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        n4 n4Var = new n4(this);
        this.f8359d = n4Var;
        contentResolver.getClass();
        uri.getClass();
        this.f8356a = contentResolver;
        this.f8357b = uri;
        this.f8358c = runnable;
        contentResolver.registerContentObserver(uri, false, n4Var);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0017 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static j4.o4 a(android.content.ContentResolver r4, android.net.Uri r5, java.lang.Runnable r6) {
        /*
            java.lang.Class<j4.o4> r0 = j4.o4.class
            monitor-enter(r0)
            m.b r1 = f8354h     // Catch:{ all -> 0x0019 }
            r2 = 0
            java.lang.Object r2 = r1.getOrDefault(r5, r2)     // Catch:{ all -> 0x0019 }
            j4.o4 r2 = (j4.o4) r2     // Catch:{ all -> 0x0019 }
            if (r2 != 0) goto L_0x0017
            j4.o4 r3 = new j4.o4     // Catch:{ SecurityException -> 0x0017 }
            r3.<init>(r4, r5, r6)     // Catch:{ SecurityException -> 0x0017 }
            r1.put(r5, r3)     // Catch:{ SecurityException -> 0x0016 }
        L_0x0016:
            r2 = r3
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return r2
        L_0x0019:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.o4.a(android.content.ContentResolver, android.net.Uri, java.lang.Runnable):j4.o4");
    }

    public static synchronized void c() {
        synchronized (o4.class) {
            Iterator it = ((g.e) f8354h.values()).iterator();
            while (it.hasNext()) {
                o4 o4Var = (o4) it.next();
                o4Var.f8356a.unregisterContentObserver(o4Var.f8359d);
            }
            f8354h.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3 = android.os.Binder.clearCallingIdentity();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2 = r2.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        android.os.Binder.restoreCallingIdentity(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0030, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        android.util.Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        android.os.StrictMode.setThreadPolicy(r0);
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0042, code lost:
        android.os.StrictMode.setThreadPolicy(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0045, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001a */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[ExcHandler: SQLiteException | IllegalStateException | SecurityException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:9:0x0010] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map b() {
        /*
            r5 = this;
            java.util.Map r0 = r5.f8361f
            if (r0 != 0) goto L_0x0049
            java.lang.Object r1 = r5.f8360e
            monitor-enter(r1)
            java.util.Map r0 = r5.f8361f     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x000c
            goto L_0x0040
        L_0x000c:
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ all -> 0x0046 }
            i4.af r2 = new i4.af     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0032 }
            r2.<init>((j4.o4) r5)     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0032 }
            java.lang.Object r2 = r2.a()     // Catch:{ SecurityException -> 0x001a, SQLiteException | IllegalStateException | SecurityException -> 0x0032 }
            goto L_0x0025
        L_0x001a:
            long r3 = android.os.Binder.clearCallingIdentity()     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0032 }
            java.lang.Object r2 = r2.a()     // Catch:{ all -> 0x002b }
            android.os.Binder.restoreCallingIdentity(r3)     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0032 }
        L_0x0025:
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0032 }
            android.os.StrictMode.setThreadPolicy(r0)     // Catch:{ all -> 0x0046 }
            goto L_0x003d
        L_0x002b:
            r2 = move-exception
            android.os.Binder.restoreCallingIdentity(r3)     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0032 }
            throw r2     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0032 }
        L_0x0030:
            r2 = move-exception
            goto L_0x0042
        L_0x0032:
            java.lang.String r2 = "ConfigurationContentLdr"
            java.lang.String r3 = "PhenotypeFlag unable to load ContentProvider, using default values"
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x0030 }
            android.os.StrictMode.setThreadPolicy(r0)     // Catch:{ all -> 0x0046 }
            r2 = 0
        L_0x003d:
            r5.f8361f = r2     // Catch:{ all -> 0x0046 }
            r0 = r2
        L_0x0040:
            monitor-exit(r1)     // Catch:{ all -> 0x0046 }
            goto L_0x0049
        L_0x0042:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch:{ all -> 0x0046 }
            throw r2     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0046 }
            throw r0
        L_0x0049:
            if (r0 == 0) goto L_0x004c
            return r0
        L_0x004c:
            java.util.Map r0 = java.util.Collections.emptyMap()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.o4.b():java.util.Map");
    }
}
