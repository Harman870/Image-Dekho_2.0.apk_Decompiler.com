package a4;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ClassLoader f54a;

    /* renamed from: b  reason: collision with root package name */
    public static Thread f55b;

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009f, code lost:
        if (r1 == null) goto L_0x00ca;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.ClassLoader a() {
        /*
            java.lang.Class<a4.b> r0 = a4.b.class
            monitor-enter(r0)
            java.lang.ClassLoader r1 = f54a     // Catch:{ all -> 0x00d3 }
            if (r1 != 0) goto L_0x00cf
            java.lang.Thread r1 = f55b     // Catch:{ all -> 0x00d3 }
            r2 = 0
            if (r1 != 0) goto L_0x00a4
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x00d3 }
            java.lang.Thread r1 = r1.getThread()     // Catch:{ all -> 0x00d3 }
            java.lang.ThreadGroup r1 = r1.getThreadGroup()     // Catch:{ all -> 0x00d3 }
            if (r1 != 0) goto L_0x001d
            r1 = r2
            goto L_0x009d
        L_0x001d:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            monitor-enter(r3)     // Catch:{ all -> 0x00d3 }
            int r4 = r1.activeGroupCount()     // Catch:{ SecurityException -> 0x007e }
            java.lang.ThreadGroup[] r5 = new java.lang.ThreadGroup[r4]     // Catch:{ SecurityException -> 0x007e }
            r1.enumerate(r5)     // Catch:{ SecurityException -> 0x007e }
            r6 = 0
            r7 = r6
        L_0x002b:
            if (r7 >= r4) goto L_0x003f
            r8 = r5[r7]     // Catch:{ SecurityException -> 0x007e }
            java.lang.String r9 = "dynamiteLoader"
            java.lang.String r10 = r8.getName()     // Catch:{ SecurityException -> 0x007e }
            boolean r9 = r9.equals(r10)     // Catch:{ SecurityException -> 0x007e }
            if (r9 == 0) goto L_0x003c
            goto L_0x0040
        L_0x003c:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x003f:
            r8 = r2
        L_0x0040:
            if (r8 != 0) goto L_0x0049
            java.lang.ThreadGroup r8 = new java.lang.ThreadGroup     // Catch:{ SecurityException -> 0x007e }
            java.lang.String r4 = "dynamiteLoader"
            r8.<init>(r1, r4)     // Catch:{ SecurityException -> 0x007e }
        L_0x0049:
            int r1 = r8.activeCount()     // Catch:{ SecurityException -> 0x007e }
            java.lang.Thread[] r4 = new java.lang.Thread[r1]     // Catch:{ SecurityException -> 0x007e }
            r8.enumerate(r4)     // Catch:{ SecurityException -> 0x007e }
        L_0x0052:
            if (r6 >= r1) goto L_0x0066
            r5 = r4[r6]     // Catch:{ SecurityException -> 0x007e }
            java.lang.String r7 = "GmsDynamite"
            java.lang.String r9 = r5.getName()     // Catch:{ SecurityException -> 0x007e }
            boolean r7 = r7.equals(r9)     // Catch:{ SecurityException -> 0x007e }
            if (r7 == 0) goto L_0x0063
            goto L_0x0067
        L_0x0063:
            int r6 = r6 + 1
            goto L_0x0052
        L_0x0066:
            r5 = r2
        L_0x0067:
            if (r5 != 0) goto L_0x009b
            a4.a r1 = new a4.a     // Catch:{ SecurityException -> 0x0079 }
            r1.<init>(r8)     // Catch:{ SecurityException -> 0x0079 }
            r1.setContextClassLoader(r2)     // Catch:{ SecurityException -> 0x0076 }
            r1.start()     // Catch:{ SecurityException -> 0x0076 }
            r5 = r1
            goto L_0x009b
        L_0x0076:
            r4 = move-exception
            r5 = r1
            goto L_0x0081
        L_0x0079:
            r1 = move-exception
            r4 = r1
            goto L_0x0081
        L_0x007c:
            r1 = move-exception
            goto L_0x00a2
        L_0x007e:
            r1 = move-exception
            r4 = r1
            r5 = r2
        L_0x0081:
            java.lang.String r1 = "DynamiteLoaderV2CL"
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x007c }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x007c }
            r6.<init>()     // Catch:{ all -> 0x007c }
            java.lang.String r7 = "Failed to enumerate thread/threadgroup "
            r6.append(r7)     // Catch:{ all -> 0x007c }
            r6.append(r4)     // Catch:{ all -> 0x007c }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x007c }
            android.util.Log.w(r1, r4)     // Catch:{ all -> 0x007c }
        L_0x009b:
            monitor-exit(r3)     // Catch:{ all -> 0x007c }
            r1 = r5
        L_0x009d:
            f55b = r1     // Catch:{ all -> 0x00d3 }
            if (r1 != 0) goto L_0x00a4
            goto L_0x00ca
        L_0x00a2:
            monitor-exit(r3)     // Catch:{ all -> 0x007c }
            throw r1     // Catch:{ all -> 0x00d3 }
        L_0x00a4:
            monitor-enter(r1)     // Catch:{ all -> 0x00d3 }
            java.lang.Thread r3 = f55b     // Catch:{ SecurityException -> 0x00ae }
            java.lang.ClassLoader r2 = r3.getContextClassLoader()     // Catch:{ SecurityException -> 0x00ae }
            goto L_0x00c9
        L_0x00ac:
            r2 = move-exception
            goto L_0x00cd
        L_0x00ae:
            r3 = move-exception
            java.lang.String r4 = "DynamiteLoaderV2CL"
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x00ac }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ac }
            r5.<init>()     // Catch:{ all -> 0x00ac }
            java.lang.String r6 = "Failed to get thread context classloader "
            r5.append(r6)     // Catch:{ all -> 0x00ac }
            r5.append(r3)     // Catch:{ all -> 0x00ac }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00ac }
            android.util.Log.w(r4, r3)     // Catch:{ all -> 0x00ac }
        L_0x00c9:
            monitor-exit(r1)     // Catch:{ all -> 0x00ac }
        L_0x00ca:
            f54a = r2     // Catch:{ all -> 0x00d3 }
            goto L_0x00cf
        L_0x00cd:
            monitor-exit(r1)     // Catch:{ all -> 0x00ac }
            throw r2     // Catch:{ all -> 0x00d3 }
        L_0x00cf:
            java.lang.ClassLoader r1 = f54a     // Catch:{ all -> 0x00d3 }
            monitor-exit(r0)
            return r1
        L_0x00d3:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.b.a():java.lang.ClassLoader");
    }
}
