package androidx.appcompat.widget;

public final /* synthetic */ class n1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f871a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f872b;

    public /* synthetic */ n1(int i10, Object obj) {
        this.f871a = i10;
        this.f872b = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2 = r0.d();
        r3 = r2.f6155e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r3 != 2) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r4 = r0.f1386d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0028, code lost:
        if (r3 != 0) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r4 = d0.i.f6035a;
        d0.i.a.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
        r3 = r0.f1385c;
        r4 = r0.f1383a;
        r3.getClass();
        r1 = a0.e.f11a.b(r4, new e0.m[]{r2}, 0);
        r2 = a0.m.e(r0.f1383a, r2.f6151a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        if (r2 == null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        if (r1 == null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        d0.i.a.a("EmojiCompat.MetadataRepo.create");
        r3 = new androidx.emoji2.text.n(r1, androidx.emoji2.text.m.a(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        d0.i.a.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        d0.i.a.b();
        r1 = r0.f1386d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0065, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r2 = r0.f1390h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0068, code lost:
        if (r2 == null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006a, code lost:
        r2.b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006d, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r0.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0075, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r2 = d0.i.f6035a;
        d0.i.a.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x007b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0083, code lost:
        throw new java.lang.RuntimeException("Unable to open file.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0084, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r2 = d0.i.f6035a;
        d0.i.a.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x008a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00a6, code lost:
        throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + r3 + ")");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a7, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00aa, code lost:
        monitor-enter(r0.f1386d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r2 = r0.f1390h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ad, code lost:
        if (r2 != null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00af, code lost:
        r2.a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00b3, code lost:
        r0.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            int r0 = r6.f871a
            r1 = 0
            switch(r0) {
                case 0: goto L_0x00bd;
                case 1: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x00c5
        L_0x0008:
            java.lang.Object r0 = r6.f872b
            androidx.emoji2.text.l$b r0 = (androidx.emoji2.text.l.b) r0
            java.lang.Object r2 = r0.f1386d
            monitor-enter(r2)
            androidx.emoji2.text.f$h r3 = r0.f1390h     // Catch:{ all -> 0x00ba }
            if (r3 != 0) goto L_0x0016
            monitor-exit(r2)     // Catch:{ all -> 0x00ba }
            goto L_0x00b6
        L_0x0016:
            monitor-exit(r2)     // Catch:{ all -> 0x00ba }
            e0.m r2 = r0.d()     // Catch:{ all -> 0x00a7 }
            int r3 = r2.f6155e     // Catch:{ all -> 0x00a7 }
            r4 = 2
            if (r3 != r4) goto L_0x0028
            java.lang.Object r4 = r0.f1386d     // Catch:{ all -> 0x00a7 }
            monitor-enter(r4)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r4)     // Catch:{ all -> 0x0025 }
            goto L_0x0028
        L_0x0025:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0025 }
            throw r1     // Catch:{ all -> 0x00a7 }
        L_0x0028:
            if (r3 != 0) goto L_0x008b
            java.lang.String r3 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
            int r4 = d0.i.f6035a     // Catch:{ all -> 0x0084 }
            d0.i.a.a(r3)     // Catch:{ all -> 0x0084 }
            androidx.emoji2.text.l$a r3 = r0.f1385c     // Catch:{ all -> 0x0084 }
            android.content.Context r4 = r0.f1383a     // Catch:{ all -> 0x0084 }
            r3.getClass()     // Catch:{ all -> 0x0084 }
            r3 = 1
            e0.m[] r3 = new e0.m[r3]     // Catch:{ all -> 0x0084 }
            r3[r1] = r2     // Catch:{ all -> 0x0084 }
            a0.l r5 = a0.e.f11a     // Catch:{ all -> 0x0084 }
            android.graphics.Typeface r1 = r5.b(r4, r3, r1)     // Catch:{ all -> 0x0084 }
            android.content.Context r3 = r0.f1383a     // Catch:{ all -> 0x0084 }
            android.net.Uri r2 = r2.f6151a     // Catch:{ all -> 0x0084 }
            java.nio.MappedByteBuffer r2 = a0.m.e(r3, r2)     // Catch:{ all -> 0x0084 }
            if (r2 == 0) goto L_0x007c
            if (r1 == 0) goto L_0x007c
            java.lang.String r3 = "EmojiCompat.MetadataRepo.create"
            d0.i.a.a(r3)     // Catch:{ all -> 0x0075 }
            androidx.emoji2.text.n r3 = new androidx.emoji2.text.n     // Catch:{ all -> 0x0075 }
            r0.b r2 = androidx.emoji2.text.m.a(r2)     // Catch:{ all -> 0x0075 }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x0075 }
            d0.i.a.b()     // Catch:{ all -> 0x0084 }
            d0.i.a.b()     // Catch:{ all -> 0x00a7 }
            java.lang.Object r1 = r0.f1386d     // Catch:{ all -> 0x00a7 }
            monitor-enter(r1)     // Catch:{ all -> 0x00a7 }
            androidx.emoji2.text.f$h r2 = r0.f1390h     // Catch:{ all -> 0x0072 }
            if (r2 == 0) goto L_0x006d
            r2.b(r3)     // Catch:{ all -> 0x0072 }
        L_0x006d:
            monitor-exit(r1)     // Catch:{ all -> 0x0072 }
            r0.b()     // Catch:{ all -> 0x00a7 }
            goto L_0x00b6
        L_0x0072:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0072 }
            throw r2     // Catch:{ all -> 0x00a7 }
        L_0x0075:
            r1 = move-exception
            int r2 = d0.i.f6035a     // Catch:{ all -> 0x0084 }
            d0.i.a.b()     // Catch:{ all -> 0x0084 }
            throw r1     // Catch:{ all -> 0x0084 }
        L_0x007c:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0084 }
            java.lang.String r2 = "Unable to open file."
            r1.<init>(r2)     // Catch:{ all -> 0x0084 }
            throw r1     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r1 = move-exception
            int r2 = d0.i.f6035a     // Catch:{ all -> 0x00a7 }
            d0.i.a.b()     // Catch:{ all -> 0x00a7 }
            throw r1     // Catch:{ all -> 0x00a7 }
        L_0x008b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x00a7 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            r2.<init>()     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = "fetchFonts result is not OK. ("
            r2.append(r4)     // Catch:{ all -> 0x00a7 }
            r2.append(r3)     // Catch:{ all -> 0x00a7 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00a7 }
            r1.<init>(r2)     // Catch:{ all -> 0x00a7 }
            throw r1     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r1 = move-exception
            java.lang.Object r3 = r0.f1386d
            monitor-enter(r3)
            androidx.emoji2.text.f$h r2 = r0.f1390h     // Catch:{ all -> 0x00b7 }
            if (r2 == 0) goto L_0x00b2
            r2.a(r1)     // Catch:{ all -> 0x00b7 }
        L_0x00b2:
            monitor-exit(r3)     // Catch:{ all -> 0x00b7 }
            r0.b()
        L_0x00b6:
            return
        L_0x00b7:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00b7 }
            throw r0
        L_0x00ba:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00ba }
            throw r0
        L_0x00bd:
            java.lang.Object r0 = r6.f872b
            androidx.appcompat.widget.o1 r0 = (androidx.appcompat.widget.o1) r0
            r0.c(r1)
            return
        L_0x00c5:
            java.lang.Object r0 = r6.f872b
            com.ironsource.mediationsdk.testSuite.e.b$b r0 = (com.ironsource.mediationsdk.testSuite.e.b.C0058b) r0
            java.lang.String r1 = "this$0"
            x8.f.f(r0, r1)
            r0.onUIReady()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.n1.run():void");
    }
}
