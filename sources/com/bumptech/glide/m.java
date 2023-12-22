package com.bumptech.glide;

public final class m {
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bf  */
    public static com.bumptech.glide.k a(com.bumptech.glide.b r30, java.util.List r31) {
        /*
            r0 = r30
            r1.d r1 = r0.f2546a
            r1.b r2 = r0.f2549d
            com.bumptech.glide.h r3 = r0.f2548c
            android.content.Context r3 = r3.getApplicationContext()
            com.bumptech.glide.h r0 = r0.f2548c
            com.bumptech.glide.i r0 = r0.f2560h
            com.bumptech.glide.k r4 = new com.bumptech.glide.k
            r4.<init>()
            java.lang.Class<n1.a> r5 = n1.a.class
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.lang.Class<java.lang.Integer> r7 = java.lang.Integer.class
            java.lang.Class<byte[]> r8 = byte[].class
            x1.k r9 = new x1.k
            r9.<init>()
            d.u r10 = r4.f2576g
            monitor-enter(r10)
            java.lang.Object r11 = r10.f5966a     // Catch:{ all -> 0x041c }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x041c }
            r11.add(r9)     // Catch:{ all -> 0x041c }
            monitor-exit(r10)
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 27
            if (r9 < r10) goto L_0x0047
            x1.p r10 = new x1.p
            r10.<init>()
            d.u r11 = r4.f2576g
            monitor-enter(r11)
            java.lang.Object r12 = r11.f5966a     // Catch:{ all -> 0x0044 }
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x0044 }
            r12.add(r10)     // Catch:{ all -> 0x0044 }
            monitor-exit(r11)
            goto L_0x0047
        L_0x0044:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x0047:
            android.content.res.Resources r10 = r3.getResources()
            java.util.List r11 = r4.d()
            b2.a r12 = new b2.a
            r12.<init>(r3, r11, r1, r2)
            x1.c0 r13 = new x1.c0
            x1.c0$g r14 = new x1.c0$g
            r14.<init>()
            r13.<init>(r1, r14)
            x1.m r14 = new x1.m
            java.util.List r15 = r4.d()
            r30 = r8
            android.util.DisplayMetrics r8 = r10.getDisplayMetrics()
            r14.<init>(r15, r8, r1, r2)
            r8 = 28
            if (r9 < r8) goto L_0x0086
            java.lang.Class<com.bumptech.glide.d> r15 = com.bumptech.glide.d.class
            java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r0.f2563a
            boolean r0 = r0.containsKey(r15)
            if (r0 == 0) goto L_0x0086
            x1.t r0 = new x1.t
            r0.<init>()
            x1.g r15 = new x1.g
            r15.<init>()
            goto L_0x0090
        L_0x0086:
            x1.f r15 = new x1.f
            r15.<init>(r14)
            x1.y r0 = new x1.y
            r0.<init>(r14, r2)
        L_0x0090:
            r16 = r6
            java.lang.String r6 = "Animation"
            if (r9 < r8) goto L_0x00bf
            java.lang.Class<java.io.InputStream> r8 = java.io.InputStream.class
            r17 = r9
            java.lang.Class<android.graphics.drawable.Drawable> r9 = android.graphics.drawable.Drawable.class
            r18 = r7
            z1.a$c r7 = new z1.a$c
            r19 = r5
            z1.a r5 = new z1.a
            r5.<init>(r11, r2)
            r7.<init>(r5)
            r4.c(r7, r8, r9, r6)
            java.lang.Class<java.nio.ByteBuffer> r5 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.drawable.Drawable> r7 = android.graphics.drawable.Drawable.class
            z1.a$b r8 = new z1.a$b
            z1.a r9 = new z1.a
            r9.<init>(r11, r2)
            r8.<init>(r9)
            r4.c(r8, r5, r7, r6)
            goto L_0x00c5
        L_0x00bf:
            r19 = r5
            r18 = r7
            r17 = r9
        L_0x00c5:
            z1.e r5 = new z1.e
            r5.<init>(r3)
            u1.s$c r7 = new u1.s$c
            r7.<init>(r10)
            u1.s$d r8 = new u1.s$d
            r8.<init>(r10)
            u1.s$b r9 = new u1.s$b
            r9.<init>(r10)
            r20 = r8
            u1.s$a r8 = new u1.s$a
            r8.<init>(r10)
            r21 = r8
            x1.b r8 = new x1.b
            r8.<init>(r2)
            r22 = r9
            c2.a r9 = new c2.a
            r9.<init>()
            r23 = r9
            y3.a r9 = new y3.a
            r9.<init>()
            r24 = r9
            android.content.ContentResolver r9 = r3.getContentResolver()
            r25 = r9
            java.lang.Class<java.nio.ByteBuffer> r9 = java.nio.ByteBuffer.class
            r26 = r3
            y3.a r3 = new y3.a
            r3.<init>()
            r27 = r7
            e2.a r7 = r4.f2571b
            monitor-enter(r7)
            r28 = r5
            java.util.ArrayList r5 = r7.f6169a     // Catch:{ all -> 0x0419 }
            r29 = r6
            e2.a$a r6 = new e2.a$a     // Catch:{ all -> 0x0419 }
            r6.<init>(r9, r3)     // Catch:{ all -> 0x0419 }
            r5.add(r6)     // Catch:{ all -> 0x0419 }
            monitor-exit(r7)
            java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
            u1.t r5 = new u1.t
            r5.<init>((java.lang.Object) r2)
            e2.a r6 = r4.f2571b
            monitor-enter(r6)
            java.util.ArrayList r7 = r6.f6169a     // Catch:{ all -> 0x0416 }
            e2.a$a r9 = new e2.a$a     // Catch:{ all -> 0x0416 }
            r9.<init>(r3, r5)     // Catch:{ all -> 0x0416 }
            r7.add(r9)     // Catch:{ all -> 0x0416 }
            monitor-exit(r6)
            java.lang.Class<java.nio.ByteBuffer> r3 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            java.lang.String r6 = "Bitmap"
            r4.c(r15, r3, r5, r6)
            java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            r4.c(r0, r3, r5, r6)
            java.lang.String r3 = android.os.Build.FINGERPRINT
            java.lang.String r5 = "robolectric"
            boolean r5 = r5.equals(r3)
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x0157
            java.lang.Class<android.os.ParcelFileDescriptor> r5 = android.os.ParcelFileDescriptor.class
            java.lang.Class<android.graphics.Bitmap> r7 = android.graphics.Bitmap.class
            x1.v r9 = new x1.v
            r9.<init>(r14)
            r4.c(r9, r5, r7, r6)
        L_0x0157:
            java.lang.Class<android.os.ParcelFileDescriptor> r5 = android.os.ParcelFileDescriptor.class
            java.lang.Class<android.graphics.Bitmap> r7 = android.graphics.Bitmap.class
            r4.c(r13, r5, r7, r6)
            java.lang.Class<android.content.res.AssetFileDescriptor> r5 = android.content.res.AssetFileDescriptor.class
            java.lang.Class<android.graphics.Bitmap> r7 = android.graphics.Bitmap.class
            x1.c0 r9 = new x1.c0
            x1.c0$c r14 = new x1.c0$c
            r14.<init>()
            r9.<init>(r1, r14)
            r4.c(r9, r5, r7, r6)
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            java.lang.Class<android.graphics.Bitmap> r7 = android.graphics.Bitmap.class
            u1.v$a<?> r9 = u1.v.a.f12169a
            r4.a(r5, r7, r9)
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            java.lang.Class<android.graphics.Bitmap> r7 = android.graphics.Bitmap.class
            x1.a0 r14 = new x1.a0
            r14.<init>()
            r4.c(r14, r5, r7, r6)
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            r4.b(r5, r8)
            java.lang.Class<java.nio.ByteBuffer> r5 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r7 = android.graphics.drawable.BitmapDrawable.class
            x1.a r14 = new x1.a
            r14.<init>(r10, r15)
            java.lang.String r15 = "BitmapDrawable"
            r4.c(r14, r5, r7, r15)
            java.lang.Class<java.io.InputStream> r5 = java.io.InputStream.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r7 = android.graphics.drawable.BitmapDrawable.class
            x1.a r14 = new x1.a
            r14.<init>(r10, r0)
            r4.c(r14, r5, r7, r15)
            java.lang.Class<android.os.ParcelFileDescriptor> r0 = android.os.ParcelFileDescriptor.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r5 = android.graphics.drawable.BitmapDrawable.class
            x1.a r7 = new x1.a
            r7.<init>(r10, r13)
            r4.c(r7, r0, r5, r15)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r0 = android.graphics.drawable.BitmapDrawable.class
            q1.t r5 = new q1.t
            r5.<init>((r1.d) r1, (x1.b) r8)
            r4.b(r0, r5)
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            java.lang.Class<b2.c> r5 = b2.c.class
            b2.i r7 = new b2.i
            r7.<init>(r11, r12, r2)
            r8 = r29
            r4.c(r7, r0, r5, r8)
            java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
            java.lang.Class<b2.c> r5 = b2.c.class
            r4.c(r12, r0, r5, r8)
            java.lang.Class<b2.c> r0 = b2.c.class
            c6.b r5 = new c6.b
            r5.<init>()
            r4.b(r0, r5)
            r0 = r19
            r4.a(r0, r0, r9)
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            b2.g r7 = new b2.g
            r7.<init>(r1)
            r4.c(r7, r0, r5, r6)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.graphics.drawable.Drawable> r5 = android.graphics.drawable.Drawable.class
            java.lang.String r6 = "legacy_append"
            r7 = r28
            r4.c(r7, r0, r5, r6)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            x1.x r8 = new x1.x
            r8.<init>(r7, r1)
            r4.c(r8, r0, r5, r6)
            y1.a$a r0 = new y1.a$a
            r0.<init>()
            r4.g(r0)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<java.nio.ByteBuffer> r5 = java.nio.ByteBuffer.class
            u1.c$b r7 = new u1.c$b
            r7.<init>()
            r4.a(r0, r5, r7)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<java.io.InputStream> r5 = java.io.InputStream.class
            u1.e$e r7 = new u1.e$e
            r7.<init>()
            r4.a(r0, r5, r7)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<java.io.File> r5 = java.io.File.class
            a2.a r7 = new a2.a
            r7.<init>()
            r4.c(r7, r0, r5, r6)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<android.os.ParcelFileDescriptor> r5 = android.os.ParcelFileDescriptor.class
            u1.e$b r7 = new u1.e$b
            r7.<init>()
            r4.a(r0, r5, r7)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<java.io.File> r5 = java.io.File.class
            r4.a(r0, r5, r9)
            com.bumptech.glide.load.data.k$a r0 = new com.bumptech.glide.load.data.k$a
            r0.<init>(r2)
            r4.g(r0)
            java.lang.String r0 = "robolectric"
            boolean r0 = r0.equals(r3)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0257
            com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a r0 = new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a
            r0.<init>()
            r4.g(r0)
        L_0x0257:
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.Class<java.io.InputStream> r2 = java.io.InputStream.class
            r3 = r27
            r4.a(r0, r2, r3)
            java.lang.Class<android.os.ParcelFileDescriptor> r2 = android.os.ParcelFileDescriptor.class
            r5 = r22
            r4.a(r0, r2, r5)
            java.lang.Class<java.io.InputStream> r2 = java.io.InputStream.class
            r7 = r18
            r4.a(r7, r2, r3)
            java.lang.Class<android.os.ParcelFileDescriptor> r2 = android.os.ParcelFileDescriptor.class
            r4.a(r7, r2, r5)
            java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
            r3 = r20
            r4.a(r7, r2, r3)
            java.lang.Class<android.content.res.AssetFileDescriptor> r2 = android.content.res.AssetFileDescriptor.class
            r5 = r21
            r4.a(r0, r2, r5)
            java.lang.Class<android.content.res.AssetFileDescriptor> r2 = android.content.res.AssetFileDescriptor.class
            r4.a(r7, r2, r5)
            java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
            r4.a(r0, r2, r3)
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            u1.d$c r2 = new u1.d$c
            r2.<init>()
            r3 = r16
            r4.a(r3, r0, r2)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r2 = java.io.InputStream.class
            u1.d$c r5 = new u1.d$c
            r5.<init>()
            r4.a(r0, r2, r5)
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            u1.u$c r2 = new u1.u$c
            r2.<init>()
            r4.a(r3, r0, r2)
            java.lang.Class<android.os.ParcelFileDescriptor> r0 = android.os.ParcelFileDescriptor.class
            u1.u$b r2 = new u1.u$b
            r2.<init>()
            r4.a(r3, r0, r2)
            java.lang.Class<android.content.res.AssetFileDescriptor> r0 = android.content.res.AssetFileDescriptor.class
            u1.u$a r2 = new u1.u$a
            r2.<init>()
            r4.a(r3, r0, r2)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r2 = java.io.InputStream.class
            u1.a$c r3 = new u1.a$c
            android.content.res.AssetManager r5 = r26.getAssets()
            r3.<init>(r5)
            r4.a(r0, r2, r3)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.content.res.AssetFileDescriptor> r2 = android.content.res.AssetFileDescriptor.class
            u1.a$b r3 = new u1.a$b
            android.content.res.AssetManager r5 = r26.getAssets()
            r3.<init>(r5)
            r4.a(r0, r2, r3)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r2 = java.io.InputStream.class
            v1.b$a r3 = new v1.b$a
            r5 = r26
            r3.<init>(r5)
            r4.a(r0, r2, r3)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r2 = java.io.InputStream.class
            v1.c$a r3 = new v1.c$a
            r3.<init>(r5)
            r4.a(r0, r2, r3)
            r0 = 29
            r2 = r17
            if (r2 < r0) goto L_0x0319
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r2 = java.io.InputStream.class
            v1.d$c r3 = new v1.d$c
            r3.<init>(r5)
            r4.a(r0, r2, r3)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.os.ParcelFileDescriptor> r2 = android.os.ParcelFileDescriptor.class
            v1.d$b r3 = new v1.d$b
            r3.<init>(r5)
            r4.a(r0, r2, r3)
        L_0x0319:
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r2 = java.io.InputStream.class
            u1.w$d r3 = new u1.w$d
            r7 = r25
            r3.<init>(r7)
            r4.a(r0, r2, r3)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.os.ParcelFileDescriptor> r2 = android.os.ParcelFileDescriptor.class
            u1.w$b r3 = new u1.w$b
            r3.<init>(r7)
            r4.a(r0, r2, r3)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.content.res.AssetFileDescriptor> r2 = android.content.res.AssetFileDescriptor.class
            u1.w$a r3 = new u1.w$a
            r3.<init>(r7)
            r4.a(r0, r2, r3)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r2 = java.io.InputStream.class
            u1.x$a r3 = new u1.x$a
            r3.<init>()
            r4.a(r0, r2, r3)
            java.lang.Class<java.net.URL> r0 = java.net.URL.class
            java.lang.Class<java.io.InputStream> r2 = java.io.InputStream.class
            v1.e$a r3 = new v1.e$a
            r3.<init>()
            r4.a(r0, r2, r3)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.File> r2 = java.io.File.class
            u1.j$a r3 = new u1.j$a
            r3.<init>(r5)
            r4.a(r0, r2, r3)
            java.lang.Class<u1.f> r0 = u1.f.class
            java.lang.Class<java.io.InputStream> r2 = java.io.InputStream.class
            v1.a$a r3 = new v1.a$a
            r3.<init>()
            r4.a(r0, r2, r3)
            java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
            u1.b$a r2 = new u1.b$a
            r2.<init>()
            r3 = r30
            r4.a(r3, r0, r2)
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            u1.b$d r2 = new u1.b$d
            r2.<init>()
            r4.a(r3, r0, r2)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
            r4.a(r0, r2, r9)
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            java.lang.Class<android.graphics.drawable.Drawable> r2 = android.graphics.drawable.Drawable.class
            r4.a(r0, r2, r9)
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            java.lang.Class<android.graphics.drawable.Drawable> r2 = android.graphics.drawable.Drawable.class
            z1.f r5 = new z1.f
            r5.<init>()
            r4.c(r5, r0, r2, r6)
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r2 = android.graphics.drawable.BitmapDrawable.class
            c2.b r5 = new c2.b
            r5.<init>((android.content.res.Resources) r10)
            r4.h(r0, r2, r5)
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            r2 = r23
            r4.h(r0, r3, r2)
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            c2.c r5 = new c2.c
            r6 = r24
            r5.<init>((java.lang.Object) r1, (java.lang.Object) r2, (java.lang.Object) r6)
            r4.h(r0, r3, r5)
            java.lang.Class<b2.c> r0 = b2.c.class
            r4.h(r0, r3, r6)
            x1.c0 r0 = new x1.c0
            x1.c0$d r2 = new x1.c0$d
            r2.<init>()
            r0.<init>(r1, r2)
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.Bitmap> r2 = android.graphics.Bitmap.class
            java.lang.String r3 = "legacy_append"
            r4.c(r0, r1, r2, r3)
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r2 = android.graphics.drawable.BitmapDrawable.class
            x1.a r3 = new x1.a
            r3.<init>(r10, r0)
            java.lang.String r0 = "legacy_append"
            r4.c(r3, r1, r2, r0)
            java.util.Iterator r0 = r31.iterator()
        L_0x03e8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0415
            java.lang.Object r1 = r0.next()
            d2.c r1 = (d2.c) r1
            r1.b()     // Catch:{ AbstractMethodError -> 0x03f8 }
            goto L_0x03e8
        L_0x03f8:
            r0 = move-exception
            r2 = r0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r3 = "Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: "
            java.lang.StringBuilder r3 = androidx.activity.f.g(r3)
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1, r2)
            throw r0
        L_0x0415:
            return r4
        L_0x0416:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0419:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x041c:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.m.a(com.bumptech.glide.b, java.util.List):com.bumptech.glide.k");
    }
}
