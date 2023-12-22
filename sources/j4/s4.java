package j4;

import android.content.Context;
import javax.annotation.Nullable;

public final class s4 {

    /* renamed from: c  reason: collision with root package name */
    public static s4 f8457c;
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public final Context f8458a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final r4 f8459b;

    public s4() {
        this.f8458a = null;
        this.f8459b = null;
    }

    public s4(Context context) {
        this.f8458a = context;
        r4 r4Var = new r4();
        this.f8459b = r4Var;
        context.getContentResolver().registerContentObserver(k4.f8284a, true, r4Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004c, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0074, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0075, code lost:
        android.os.Binder.restoreCallingIdentity(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0078, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0079, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x007b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x007e, code lost:
        android.util.Log.e("GservicesLoader", "Unable to read GServices for: ".concat(java.lang.String.valueOf(r10)), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x008d, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0066 */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0079 A[ExcHandler: IllegalStateException | NullPointerException (e java.lang.Throwable), Splitter:B:39:0x005c] */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r10) {
        /*
            r9 = this;
            android.content.Context r0 = r9.f8458a
            r1 = 0
            if (r0 == 0) goto L_0x0091
            boolean r2 = j4.l4.f8312b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x000c
            goto L_0x0059
        L_0x000c:
            java.lang.Class<j4.l4> r2 = j4.l4.class
            monitor-enter(r2)
            boolean r5 = j4.l4.f8312b     // Catch:{ all -> 0x008e }
            if (r5 == 0) goto L_0x0015
            monitor-exit(r2)     // Catch:{ all -> 0x008e }
            goto L_0x0059
        L_0x0015:
            r5 = r4
        L_0x0016:
            r6 = 2
            if (r5 > r6) goto L_0x004c
            android.os.UserManager r6 = j4.l4.f8311a     // Catch:{ all -> 0x008e }
            if (r6 != 0) goto L_0x0027
            java.lang.Class<android.os.UserManager> r6 = android.os.UserManager.class
            java.lang.Object r6 = r0.getSystemService(r6)     // Catch:{ all -> 0x008e }
            android.os.UserManager r6 = (android.os.UserManager) r6     // Catch:{ all -> 0x008e }
            j4.l4.f8311a = r6     // Catch:{ all -> 0x008e }
        L_0x0027:
            android.os.UserManager r6 = j4.l4.f8311a     // Catch:{ all -> 0x008e }
            if (r6 != 0) goto L_0x002d
            r0 = r4
            goto L_0x0051
        L_0x002d:
            boolean r7 = r6.isUserUnlocked()     // Catch:{ NullPointerException -> 0x003f }
            if (r7 != 0) goto L_0x003d
            android.os.UserHandle r7 = android.os.Process.myUserHandle()     // Catch:{ NullPointerException -> 0x003f }
            boolean r0 = r6.isUserRunning(r7)     // Catch:{ NullPointerException -> 0x003f }
            if (r0 != 0) goto L_0x004c
        L_0x003d:
            r0 = r4
            goto L_0x004d
        L_0x003f:
            r6 = move-exception
            java.lang.String r7 = "DirectBootUtils"
            java.lang.String r8 = "Failed to check if user is unlocked."
            android.util.Log.w(r7, r8, r6)     // Catch:{ all -> 0x008e }
            j4.l4.f8311a = r1     // Catch:{ all -> 0x008e }
            int r5 = r5 + 1
            goto L_0x0016
        L_0x004c:
            r0 = r3
        L_0x004d:
            if (r0 == 0) goto L_0x0051
            j4.l4.f8311a = r1     // Catch:{ all -> 0x008e }
        L_0x0051:
            if (r0 == 0) goto L_0x0055
            j4.l4.f8312b = r4     // Catch:{ all -> 0x008e }
        L_0x0055:
            monitor-exit(r2)     // Catch:{ all -> 0x008e }
            if (r0 != 0) goto L_0x0059
            r3 = r4
        L_0x0059:
            if (r3 == 0) goto L_0x005c
            goto L_0x0091
        L_0x005c:
            i4.w6 r0 = new i4.w6     // Catch:{ IllegalStateException -> 0x007d, SecurityException -> 0x007b, NullPointerException -> 0x0079 }
            r0.<init>((j4.s4) r9, (java.lang.String) r10)     // Catch:{ IllegalStateException -> 0x007d, SecurityException -> 0x007b, NullPointerException -> 0x0079 }
            java.lang.Object r0 = r0.a()     // Catch:{ SecurityException -> 0x0066, IllegalStateException -> 0x007d, NullPointerException -> 0x0079 }
            goto L_0x0071
        L_0x0066:
            long r2 = android.os.Binder.clearCallingIdentity()     // Catch:{ IllegalStateException -> 0x007d, SecurityException -> 0x007b, NullPointerException -> 0x0079 }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x0074 }
            android.os.Binder.restoreCallingIdentity(r2)     // Catch:{ IllegalStateException -> 0x007d, SecurityException -> 0x007b, NullPointerException -> 0x0079 }
        L_0x0071:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IllegalStateException -> 0x007d, SecurityException -> 0x007b, NullPointerException -> 0x0079 }
            return r0
        L_0x0074:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r2)     // Catch:{ IllegalStateException -> 0x007d, SecurityException -> 0x007b, NullPointerException -> 0x0079 }
            throw r0     // Catch:{ IllegalStateException -> 0x007d, SecurityException -> 0x007b, NullPointerException -> 0x0079 }
        L_0x0079:
            r0 = move-exception
            goto L_0x007e
        L_0x007b:
            r0 = move-exception
            goto L_0x007e
        L_0x007d:
            r0 = move-exception
        L_0x007e:
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r2 = "Unable to read GServices for: "
            java.lang.String r3 = "GservicesLoader"
            java.lang.String r10 = r2.concat(r10)
            android.util.Log.e(r3, r10, r0)
            return r1
        L_0x008e:
            r10 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008e }
            throw r10
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.s4.a(java.lang.String):java.lang.String");
    }
}
