package n4;

import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
import r3.o;

public final class a3 extends o3 {

    /* renamed from: c  reason: collision with root package name */
    public String f9587c;

    /* renamed from: d  reason: collision with root package name */
    public String f9588d;

    /* renamed from: e  reason: collision with root package name */
    public int f9589e;

    /* renamed from: f  reason: collision with root package name */
    public String f9590f;

    /* renamed from: g  reason: collision with root package name */
    public long f9591g;

    /* renamed from: h  reason: collision with root package name */
    public final long f9592h;

    /* renamed from: i  reason: collision with root package name */
    public List f9593i;

    /* renamed from: j  reason: collision with root package name */
    public String f9594j;
    public int k;

    /* renamed from: l  reason: collision with root package name */
    public String f9595l;

    /* renamed from: m  reason: collision with root package name */
    public String f9596m;

    /* renamed from: n  reason: collision with root package name */
    public String f9597n;

    /* renamed from: o  reason: collision with root package name */
    public long f9598o = 0;

    /* renamed from: p  reason: collision with root package name */
    public String f9599p = null;

    public a3(n4 n4Var, long j10) {
        super(n4Var);
        this.f9592h = j10;
    }

    public final boolean j() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0112 A[Catch:{ IllegalStateException -> 0x0166 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0113 A[Catch:{ IllegalStateException -> 0x0166 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011c A[Catch:{ IllegalStateException -> 0x0166 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0149 A[Catch:{ IllegalStateException -> 0x0166 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01b1 A[SYNTHETIC, Splitter:B:82:0x01b1] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01da  */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k() {
        /*
            r11 = this;
            n4.n4 r0 = r11.f9600a
            android.content.Context r0 = r0.f9986a
            java.lang.String r0 = r0.getPackageName()
            n4.n4 r1 = r11.f9600a
            android.content.Context r1 = r1.f9986a
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "unknown"
            java.lang.String r3 = "Unknown"
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r5 = ""
            r6 = 0
            if (r1 != 0) goto L_0x002d
            n4.n4 r7 = r11.f9600a
            n4.i3 r7 = r7.a()
            n4.g3 r7 = r7.f9828f
            n4.h3 r8 = n4.i3.p(r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.b(r9, r8)
            goto L_0x008c
        L_0x002d:
            java.lang.String r2 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0032 }
            goto L_0x0043
        L_0x0032:
            n4.n4 r7 = r11.f9600a
            n4.i3 r7 = r7.a()
            n4.g3 r7 = r7.f9828f
            n4.h3 r8 = n4.i3.p(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.b(r9, r8)
        L_0x0043:
            if (r2 != 0) goto L_0x0048
            java.lang.String r2 = "manual_install"
            goto L_0x0051
        L_0x0048:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x0051
            r2 = r5
        L_0x0051:
            n4.n4 r7 = r11.f9600a     // Catch:{ NameNotFoundException -> 0x0079 }
            android.content.Context r7 = r7.f9986a     // Catch:{ NameNotFoundException -> 0x0079 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0079 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r6)     // Catch:{ NameNotFoundException -> 0x0079 }
            if (r7 == 0) goto L_0x008c
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0079 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0079 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0079 }
            if (r9 != 0) goto L_0x0070
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0079 }
            goto L_0x0071
        L_0x0070:
            r8 = r3
        L_0x0071:
            java.lang.String r3 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0076 }
            int r4 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0076 }
            goto L_0x008c
        L_0x0076:
            r7 = r3
            r3 = r8
            goto L_0x007a
        L_0x0079:
            r7 = r3
        L_0x007a:
            n4.n4 r8 = r11.f9600a
            n4.i3 r8 = r8.a()
            n4.g3 r8 = r8.f9828f
            n4.h3 r9 = n4.i3.p(r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.c(r10, r9, r3)
            r3 = r7
        L_0x008c:
            r11.f9587c = r0
            r11.f9590f = r2
            r11.f9588d = r3
            r11.f9589e = r4
            r2 = 0
            r11.f9591g = r2
            n4.n4 r2 = r11.f9600a
            java.lang.String r2 = r2.f9987b
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00b0
            n4.n4 r2 = r11.f9600a
            java.lang.String r2 = r2.f9988c
            java.lang.String r3 = "am"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x00b0
            r2 = 1
            goto L_0x00b1
        L_0x00b0:
            r2 = r6
        L_0x00b1:
            n4.n4 r3 = r11.f9600a
            int r3 = r3.k()
            n4.n4 r4 = r11.f9600a
            n4.i3 r4 = r4.a()
            switch(r3) {
                case 0: goto L_0x00e4;
                case 1: goto L_0x00df;
                case 2: goto L_0x00da;
                case 3: goto L_0x00d5;
                case 4: goto L_0x00d0;
                case 5: goto L_0x00cb;
                case 6: goto L_0x00c6;
                case 7: goto L_0x00c1;
                default: goto L_0x00c0;
            }
        L_0x00c0:
            goto L_0x00e9
        L_0x00c1:
            n4.g3 r4 = r4.f9833l
            java.lang.String r7 = "App measurement disabled via the global data collection setting"
            goto L_0x00ed
        L_0x00c6:
            n4.g3 r4 = r4.k
            java.lang.String r7 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            goto L_0x00ed
        L_0x00cb:
            n4.g3 r4 = r4.f9835n
            java.lang.String r7 = "App measurement disabled via the init parameters"
            goto L_0x00ed
        L_0x00d0:
            n4.g3 r4 = r4.f9833l
            java.lang.String r7 = "App measurement disabled via the manifest"
            goto L_0x00ed
        L_0x00d5:
            n4.g3 r4 = r4.f9833l
            java.lang.String r7 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            goto L_0x00ed
        L_0x00da:
            n4.g3 r4 = r4.f9835n
            java.lang.String r7 = "App measurement deactivated via the init parameters"
            goto L_0x00ed
        L_0x00df:
            n4.g3 r4 = r4.f9833l
            java.lang.String r7 = "App measurement deactivated via the manifest"
            goto L_0x00ed
        L_0x00e4:
            n4.g3 r4 = r4.f9835n
            java.lang.String r7 = "App measurement collection enabled"
            goto L_0x00ed
        L_0x00e9:
            n4.g3 r4 = r4.f9833l
            java.lang.String r7 = "App measurement disabled due to denied storage consent"
        L_0x00ed:
            r4.a(r7)
            r11.f9595l = r5
            r11.f9596m = r5
            n4.n4 r4 = r11.f9600a
            r4.getClass()
            if (r2 == 0) goto L_0x0101
            n4.n4 r2 = r11.f9600a
            java.lang.String r2 = r2.f9987b
            r11.f9596m = r2
        L_0x0101:
            r2 = 0
            n4.n4 r4 = r11.f9600a     // Catch:{ IllegalStateException -> 0x0166 }
            android.content.Context r7 = r4.f9986a     // Catch:{ IllegalStateException -> 0x0166 }
            java.lang.String r4 = r4.f10003s     // Catch:{ IllegalStateException -> 0x0166 }
            java.lang.String r4 = y3.a.U(r7, r4)     // Catch:{ IllegalStateException -> 0x0166 }
            boolean r7 = android.text.TextUtils.isEmpty(r4)     // Catch:{ IllegalStateException -> 0x0166 }
            if (r7 == 0) goto L_0x0113
            goto L_0x0114
        L_0x0113:
            r5 = r4
        L_0x0114:
            r11.f9595l = r5     // Catch:{ IllegalStateException -> 0x0166 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ IllegalStateException -> 0x0166 }
            if (r4 != 0) goto L_0x0147
            n4.n4 r4 = r11.f9600a     // Catch:{ IllegalStateException -> 0x0166 }
            android.content.Context r5 = r4.f9986a     // Catch:{ IllegalStateException -> 0x0166 }
            java.lang.String r4 = r4.f10003s     // Catch:{ IllegalStateException -> 0x0166 }
            r3.o.h(r5)     // Catch:{ IllegalStateException -> 0x0166 }
            android.content.res.Resources r7 = r5.getResources()     // Catch:{ IllegalStateException -> 0x0166 }
            boolean r8 = android.text.TextUtils.isEmpty(r4)     // Catch:{ IllegalStateException -> 0x0166 }
            if (r8 != 0) goto L_0x0130
            goto L_0x0134
        L_0x0130:
            java.lang.String r4 = n4.i4.a(r5)     // Catch:{ IllegalStateException -> 0x0166 }
        L_0x0134:
            java.lang.String r5 = "admob_app_id"
            java.lang.String r8 = "string"
            int r4 = r7.getIdentifier(r5, r8, r4)     // Catch:{ IllegalStateException -> 0x0166 }
            if (r4 != 0) goto L_0x013f
            goto L_0x0144
        L_0x013f:
            java.lang.String r4 = r7.getString(r4)     // Catch:{ NotFoundException -> 0x0144 }
            goto L_0x0145
        L_0x0144:
            r4 = r2
        L_0x0145:
            r11.f9596m = r4     // Catch:{ IllegalStateException -> 0x0166 }
        L_0x0147:
            if (r3 != 0) goto L_0x0178
            n4.n4 r3 = r11.f9600a     // Catch:{ IllegalStateException -> 0x0166 }
            n4.i3 r3 = r3.a()     // Catch:{ IllegalStateException -> 0x0166 }
            n4.g3 r3 = r3.f9835n     // Catch:{ IllegalStateException -> 0x0166 }
            java.lang.String r4 = "App measurement enabled for app package, google app id"
            java.lang.String r5 = r11.f9587c     // Catch:{ IllegalStateException -> 0x0166 }
            java.lang.String r7 = r11.f9595l     // Catch:{ IllegalStateException -> 0x0166 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x0166 }
            if (r7 == 0) goto L_0x0160
            java.lang.String r7 = r11.f9596m     // Catch:{ IllegalStateException -> 0x0166 }
            goto L_0x0162
        L_0x0160:
            java.lang.String r7 = r11.f9595l     // Catch:{ IllegalStateException -> 0x0166 }
        L_0x0162:
            r3.c(r4, r5, r7)     // Catch:{ IllegalStateException -> 0x0166 }
            goto L_0x0178
        L_0x0166:
            r3 = move-exception
            n4.n4 r4 = r11.f9600a
            n4.i3 r4 = r4.a()
            n4.g3 r4 = r4.f9828f
            n4.h3 r0 = n4.i3.p(r0)
            java.lang.String r5 = "Fetching Google App Id failed with exception. appId"
            r4.c(r5, r0, r3)
        L_0x0178:
            r11.f9593i = r2
            n4.n4 r0 = r11.f9600a
            r0.getClass()
            n4.n4 r0 = r11.f9600a
            n4.f r0 = r0.f9992g
            r0.getClass()
            java.lang.String r3 = "analytics.safelisted_events"
            r3.o.e(r3)
            android.os.Bundle r4 = r0.m()
            if (r4 != 0) goto L_0x019f
            n4.n4 r3 = r0.f9600a
            n4.i3 r3 = r3.a()
            n4.g3 r3 = r3.f9828f
            java.lang.String r4 = "Failed to load metadata: Metadata bundle is null"
            r3.a(r4)
            goto L_0x01a5
        L_0x019f:
            boolean r5 = r4.containsKey(r3)
            if (r5 != 0) goto L_0x01a7
        L_0x01a5:
            r3 = r2
            goto L_0x01af
        L_0x01a7:
            int r3 = r4.getInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x01af:
            if (r3 == 0) goto L_0x01d7
            n4.n4 r4 = r0.f9600a     // Catch:{ NotFoundException -> 0x01c9 }
            android.content.Context r4 = r4.f9986a     // Catch:{ NotFoundException -> 0x01c9 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ NotFoundException -> 0x01c9 }
            int r3 = r3.intValue()     // Catch:{ NotFoundException -> 0x01c9 }
            java.lang.String[] r3 = r4.getStringArray(r3)     // Catch:{ NotFoundException -> 0x01c9 }
            if (r3 != 0) goto L_0x01c4
            goto L_0x01d7
        L_0x01c4:
            java.util.List r2 = java.util.Arrays.asList(r3)     // Catch:{ NotFoundException -> 0x01c9 }
            goto L_0x01d7
        L_0x01c9:
            r3 = move-exception
            n4.n4 r0 = r0.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.f9828f
            java.lang.String r4 = "Failed to load string array from metadata: resource not found"
            r0.b(r4, r3)
        L_0x01d7:
            if (r2 != 0) goto L_0x01da
            goto L_0x020d
        L_0x01da:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x01ee
            n4.n4 r0 = r11.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.k
            java.lang.String r2 = "Safelisted event list is empty. Ignoring"
            r0.a(r2)
            goto L_0x020f
        L_0x01ee:
            java.util.Iterator r0 = r2.iterator()
        L_0x01f2:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x020d
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            n4.n4 r4 = r11.f9600a
            n4.d8 r4 = r4.x()
            java.lang.String r5 = "safelisted event"
            boolean r3 = r4.N(r5, r3)
            if (r3 != 0) goto L_0x01f2
            goto L_0x020f
        L_0x020d:
            r11.f9593i = r2
        L_0x020f:
            if (r1 == 0) goto L_0x021c
            n4.n4 r0 = r11.f9600a
            android.content.Context r0 = r0.f9986a
            boolean r0 = y3.a.l(r0)
            r11.k = r0
            return
        L_0x021c:
            r11.k = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.a3.k():void");
    }

    public final String l() {
        h();
        o.h(this.f9587c);
        return this.f9587c;
    }

    public final String m() {
        g();
        h();
        o.h(this.f9595l);
        return this.f9595l;
    }

    public final void n() {
        String str;
        String str2;
        g();
        if (!this.f9600a.r().m().f(e5.ANALYTICS_STORAGE)) {
            this.f9600a.a().f9834m.a("Analytics Storage consent is not granted");
            str = null;
        } else {
            byte[] bArr = new byte[16];
            this.f9600a.x().p().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
        }
        g3 g3Var = this.f9600a.a().f9834m;
        Object[] objArr = new Object[1];
        if (str == null) {
            str2 = "null";
        } else {
            str2 = "not null";
        }
        objArr[0] = str2;
        g3Var.a(String.format("Resetting session stitching token to %s", objArr));
        this.f9597n = str;
        this.f9600a.f9998n.getClass();
        this.f9598o = System.currentTimeMillis();
    }
}
