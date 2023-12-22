package com.ironsource.sdk.utils.a;

import d8.a;
import x8.f;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public final a f5768a;

    public c() {
        this((a) null, 1);
    }

    public c(a aVar, int i10) {
        a aVar2 = a.f6107a;
        f.f(aVar2, "connectionFactory");
        this.f5768a = aVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        c6.b.p(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "url"
            x8.f.f(r4, r0)
            boolean r0 = android.webkit.URLUtil.isHttpsUrl(r4)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r1 = "failed to create a drawable"
            if (r0 == 0) goto L_0x0037
            com.ironsource.sdk.utils.a.a r0 = r3.f5768a     // Catch:{ Exception -> 0x0062 }
            java.io.InputStream r0 = r0.a(r4)     // Catch:{ Exception -> 0x0062 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0030 }
            r2.<init>(r4)     // Catch:{ all -> 0x0030 }
            java.lang.String r4 = r2.getName()     // Catch:{ all -> 0x0030 }
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r0, r4)     // Catch:{ all -> 0x0030 }
            r2 = 0
            c6.b.p(r0, r2)     // Catch:{ Exception -> 0x0062 }
            if (r4 != 0) goto L_0x002f
            java.lang.Exception r4 = new java.lang.Exception     // Catch:{ Exception -> 0x0062 }
            r4.<init>(r1)     // Catch:{ Exception -> 0x0062 }
            o8.f$a r4 = c.a.d(r4)     // Catch:{ Exception -> 0x0062 }
        L_0x002f:
            return r4
        L_0x0030:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r1 = move-exception
            c6.b.p(r0, r4)     // Catch:{ Exception -> 0x0062 }
            throw r1     // Catch:{ Exception -> 0x0062 }
        L_0x0037:
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0062 }
            r0.<init>(r4)     // Catch:{ Exception -> 0x0062 }
            boolean r4 = r0.exists()     // Catch:{ Exception -> 0x0062 }
            if (r4 != 0) goto L_0x004e
            java.lang.Exception r4 = new java.lang.Exception     // Catch:{ Exception -> 0x0062 }
            java.lang.String r0 = "file does not exists"
            r4.<init>(r0)     // Catch:{ Exception -> 0x0062 }
            o8.f$a r4 = c.a.d(r4)     // Catch:{ Exception -> 0x0062 }
            return r4
        L_0x004e:
            java.lang.String r4 = r0.getPath()     // Catch:{ Exception -> 0x0062 }
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromPath(r4)     // Catch:{ Exception -> 0x0062 }
            if (r4 != 0) goto L_0x0061
            java.lang.Exception r4 = new java.lang.Exception     // Catch:{ Exception -> 0x0062 }
            r4.<init>(r1)     // Catch:{ Exception -> 0x0062 }
            o8.f$a r4 = c.a.d(r4)     // Catch:{ Exception -> 0x0062 }
        L_0x0061:
            return r4
        L_0x0062:
            r4 = move-exception
            o8.f$a r4 = c.a.d(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.utils.a.c.a(java.lang.String):java.lang.Object");
    }
}
