package n4;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import d.u;
import g1.t;
import i4.z7;
import j4.b4;
import j4.c4;
import j4.cd;
import j4.d1;
import j4.dd;
import j4.j3;
import j4.k3;
import j4.ma;
import j4.n3;
import j4.na;
import j4.o3;
import j4.s3;
import j4.t3;
import j4.tc;
import j4.x2;
import j4.xb;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import n3.n;
import r3.o;
import w3.b;
import y3.a;
import z5.c;

public final class w7 implements c5 {
    public static volatile w7 F;
    public final HashMap A;
    public final HashMap B;
    public g6 C;
    public String D;
    public final t E = new t((Object) this);

    /* renamed from: a  reason: collision with root package name */
    public final h4 f10282a;

    /* renamed from: b  reason: collision with root package name */
    public final n3 f10283b;

    /* renamed from: c  reason: collision with root package name */
    public i f10284c;

    /* renamed from: d  reason: collision with root package name */
    public q3 f10285d;

    /* renamed from: e  reason: collision with root package name */
    public o7 f10286e;

    /* renamed from: f  reason: collision with root package name */
    public b f10287f;

    /* renamed from: g  reason: collision with root package name */
    public final y7 f10288g;

    /* renamed from: h  reason: collision with root package name */
    public f6 f10289h;

    /* renamed from: i  reason: collision with root package name */
    public d7 f10290i;

    /* renamed from: j  reason: collision with root package name */
    public final r7 f10291j;
    public z3 k;

    /* renamed from: l  reason: collision with root package name */
    public final n4 f10292l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f10293m = false;

    /* renamed from: n  reason: collision with root package name */
    public boolean f10294n;

    /* renamed from: o  reason: collision with root package name */
    public long f10295o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f10296p;

    /* renamed from: q  reason: collision with root package name */
    public int f10297q;

    /* renamed from: r  reason: collision with root package name */
    public int f10298r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f10299s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f10300t;
    public boolean u;

    /* renamed from: v  reason: collision with root package name */
    public FileLock f10301v;
    public FileChannel w;

    /* renamed from: x  reason: collision with root package name */
    public ArrayList f10302x;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList f10303y;

    /* renamed from: z  reason: collision with root package name */
    public long f10304z;

    public w7(x7 x7Var) {
        this.f10292l = n4.s(x7Var.f10320a, (d1) null, (Long) null);
        this.f10304z = -1;
        this.f10291j = new r7(this);
        y7 y7Var = new y7(this);
        y7Var.i();
        this.f10288g = y7Var;
        n3 n3Var = new n3(this);
        n3Var.i();
        this.f10283b = n3Var;
        h4 h4Var = new h4(this);
        h4Var.i();
        this.f10282a = h4Var;
        this.A = new HashMap();
        this.B = new HashMap();
        d().o(new n(this, 2, x7Var));
    }

    public static final boolean G(g8 g8Var) {
        return !TextUtils.isEmpty(g8Var.f9769b) || !TextUtils.isEmpty(g8Var.f9783q);
    }

    public static final void H(q7 q7Var) {
        if (q7Var == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!q7Var.f10084c) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(q7Var.getClass())));
        }
    }

    public static w7 N(Context context) {
        o.h(context);
        o.h(context.getApplicationContext());
        if (F == null) {
            synchronized (w7.class) {
                if (F == null) {
                    F = new w7(new x7(context));
                }
            }
        }
        return F;
    }

    public static final void w(j3 j3Var, int i10, String str) {
        List p5 = j3Var.p();
        int i11 = 0;
        while (i11 < p5.size()) {
            if (!"_err".equals(((o3) p5.get(i11)).z())) {
                i11++;
            } else {
                return;
            }
        }
        n3 x9 = o3.x();
        x9.l("_err");
        x9.k(Long.valueOf((long) i10).longValue());
        n3 x10 = o3.x();
        x10.l("_ev");
        x10.j();
        o3.D((o3) x10.f8238b, str);
        j3Var.j();
        k3.D((k3) j3Var.f8238b, (o3) x9.h());
        j3Var.j();
        k3.D((k3) j3Var.f8238b, (o3) x10.h());
    }

    public static final void x(j3 j3Var, String str) {
        List p5 = j3Var.p();
        for (int i10 = 0; i10 < p5.size(); i10++) {
            if (str.equals(((o3) p5.get(i10)).z())) {
                j3Var.j();
                k3.G((k3) j3Var.f8238b, i10);
                return;
            }
        }
    }

    public final void A() {
        d().g();
        if (this.f10299s || this.f10300t || this.u) {
            a().f9835n.d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f10299s), Boolean.valueOf(this.f10300t), Boolean.valueOf(this.u));
            return;
        }
        a().f9835n.a("Stopping uploading service(s)");
        ArrayList arrayList = this.f10296p;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            ArrayList arrayList2 = this.f10296p;
            o.h(arrayList2);
            arrayList2.clear();
        }
    }

    public final void B(s3 s3Var, long j10, boolean z9) {
        String str;
        b8 b8Var;
        String str2;
        i iVar = this.f10284c;
        H(iVar);
        if (true != z9) {
            str = "_lte";
        } else {
            str = "_se";
        }
        b8 F2 = iVar.F(s3Var.p(), str);
        if (F2 == null || F2.f9639e == null) {
            String p5 = s3Var.p();
            ((a) c()).getClass();
            b8Var = new b8(p5, "auto", str, System.currentTimeMillis(), Long.valueOf(j10));
        } else {
            String p10 = s3Var.p();
            ((a) c()).getClass();
            b8Var = new b8(p10, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) F2.f9639e).longValue() + j10));
        }
        b4 w10 = c4.w();
        w10.j();
        c4.B((c4) w10.f8238b, str);
        ((a) c()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        w10.j();
        c4.A((c4) w10.f8238b, currentTimeMillis);
        long longValue = ((Long) b8Var.f9639e).longValue();
        w10.j();
        c4.E((c4) w10.f8238b, longValue);
        c4 c4Var = (c4) w10.h();
        int u10 = y7.u(s3Var, str);
        if (u10 >= 0) {
            s3Var.j();
            t3.B0((t3) s3Var.f8238b, u10, c4Var);
        } else {
            s3Var.j();
            t3.C0((t3) s3Var.f8238b, c4Var);
        }
        if (j10 > 0) {
            i iVar2 = this.f10284c;
            H(iVar2);
            iVar2.r(b8Var);
            if (true != z9) {
                str2 = "lifetime";
            } else {
                str2 = "session-scoped";
            }
            a().f9835n.c("Updated engagement user property. scope, value", str2, b8Var.f9639e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0318  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C() {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r0 = "com.google.android.gms.measurement.AppMeasurementJobService"
            n4.m4 r2 = r19.d()
            r2.g()
            r19.g()
            long r2 = r1.f10295o
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0046
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            w3.b r6 = r19.c()
            y3.a r6 = (y3.a) r6
            r6.getClass()
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r8 = r1.f10295o
            long r6 = r6 - r8
            long r6 = java.lang.Math.abs(r6)
            long r2 = r2 - r6
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0044
            n4.i3 r0 = r19.a()
            n4.g3 r0 = r0.f9835n
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r0.b(r3, r2)
            r6 = r1
            goto L_0x03da
        L_0x0044:
            r1.f10295o = r4
        L_0x0046:
            n4.n4 r2 = r1.f10292l
            boolean r2 = r2.h()
            if (r2 == 0) goto L_0x03ce
            boolean r2 = r19.E()
            if (r2 != 0) goto L_0x0056
            goto L_0x03ce
        L_0x0056:
            w3.b r2 = r19.c()
            y3.a r2 = (y3.a) r2
            r2.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            r19.J()
            n4.v2 r6 = n4.w2.A
            r7 = 0
            java.lang.Object r6 = r6.a(r7)
            java.lang.Long r6 = (java.lang.Long) r6
            long r8 = r6.longValue()
            long r8 = java.lang.Math.max(r4, r8)
            n4.i r6 = r1.f10284c
            H(r6)
            java.lang.String r10 = "select count(1) > 0 from raw_events where realtime = 1"
            long r10 = r6.u(r10, r7)
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0088
            r6 = 1
            goto L_0x0089
        L_0x0088:
            r6 = 0
        L_0x0089:
            if (r6 != 0) goto L_0x00a2
            n4.i r6 = r1.f10284c
            H(r6)
            java.lang.String r12 = "select count(1) > 0 from queue where has_realtime = 1"
            long r12 = r6.u(r12, r7)
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x009c
            r6 = 1
            goto L_0x009d
        L_0x009c:
            r6 = 0
        L_0x009d:
            if (r6 == 0) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r6 = 0
            goto L_0x00a3
        L_0x00a2:
            r6 = 1
        L_0x00a3:
            if (r6 == 0) goto L_0x00c9
            n4.f r12 = r19.J()
            java.lang.String r13 = "debug.firebase.analytics.app"
            java.lang.String r12 = r12.h(r13)
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            if (r13 != 0) goto L_0x00c3
            java.lang.String r13 = ".none."
            boolean r12 = r13.equals(r12)
            if (r12 != 0) goto L_0x00c3
            r19.J()
            n4.v2 r12 = n4.w2.f10243v
            goto L_0x00ce
        L_0x00c3:
            r19.J()
            n4.v2 r12 = n4.w2.u
            goto L_0x00ce
        L_0x00c9:
            r19.J()
            n4.v2 r12 = n4.w2.f10241t
        L_0x00ce:
            java.lang.Object r12 = r12.a(r7)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = java.lang.Math.max(r4, r12)
            n4.d7 r14 = r1.f10290i
            n4.t3 r14 = r14.f9703g
            long r14 = r14.a()
            n4.d7 r10 = r1.f10290i
            n4.t3 r10 = r10.f9704h
            long r16 = r10.a()
            n4.i r10 = r1.f10284c
            H(r10)
            java.lang.String r11 = "select max(bundle_end_timestamp) from queue"
            long r10 = r10.w(r11, r7, r4)
            n4.i r4 = r1.f10284c
            H(r4)
            java.lang.String r5 = "select max(timestamp) from raw_events"
            r18 = r0
            r0 = 0
            long r4 = r4.w(r5, r7, r0)
            long r4 = java.lang.Math.max(r10, r4)
            int r10 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r10 != 0) goto L_0x0112
            r6 = r19
            goto L_0x0191
        L_0x0112:
            long r4 = r4 - r2
            long r0 = java.lang.Math.abs(r4)
            long r0 = r2 - r0
            long r14 = r14 - r2
            long r4 = java.lang.Math.abs(r14)
            long r4 = r2 - r4
            long r16 = r16 - r2
            long r10 = java.lang.Math.abs(r16)
            long r2 = r2 - r10
            long r8 = r8 + r0
            long r4 = java.lang.Math.max(r4, r2)
            if (r6 == 0) goto L_0x0139
            r10 = 0
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 <= 0) goto L_0x0139
            long r8 = java.lang.Math.min(r0, r4)
            long r8 = r8 + r12
        L_0x0139:
            r6 = r19
            n4.y7 r10 = r6.f10288g
            H(r10)
            boolean r10 = r10.H(r4, r12)
            if (r10 != 0) goto L_0x0148
            long r8 = r4 + r12
        L_0x0148:
            r4 = 0
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x0196
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0196
            r0 = 0
        L_0x0153:
            r19.J()
            r1 = 20
            n4.v2 r4 = n4.w2.C
            java.lang.Object r4 = r4.a(r7)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            int r1 = java.lang.Math.min(r1, r4)
            if (r0 >= r1) goto L_0x0191
            r4 = 1
            long r4 = r4 << r0
            r19.J()
            n4.v2 r1 = n4.w2.B
            java.lang.Object r1 = r1.a(r7)
            java.lang.Long r1 = (java.lang.Long) r1
            long r10 = r1.longValue()
            r12 = 0
            long r10 = java.lang.Math.max(r12, r10)
            long r10 = r10 * r4
            long r8 = r8 + r10
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x018e
            goto L_0x0196
        L_0x018e:
            int r0 = r0 + 1
            goto L_0x0153
        L_0x0191:
            r0 = 0
            r8 = 0
            goto L_0x0198
        L_0x0196:
            r0 = 0
        L_0x0198:
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x03c5
            n4.n3 r0 = r6.f10283b
            H(r0)
            boolean r0 = r0.k()
            if (r0 == 0) goto L_0x036f
            n4.d7 r0 = r6.f10290i
            n4.t3 r0 = r0.f9702f
            long r0 = r0.a()
            r19.J()
            n4.v2 r2 = n4.w2.f10239s
            java.lang.Object r2 = r2.a(r7)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r4 = 0
            long r2 = java.lang.Math.max(r4, r2)
            n4.y7 r4 = r6.f10288g
            H(r4)
            boolean r4 = r4.H(r0, r2)
            if (r4 != 0) goto L_0x01d4
            long r0 = r0 + r2
            long r8 = java.lang.Math.max(r8, r0)
        L_0x01d4:
            n4.q3 r0 = r19.L()
            r0.a()
            w3.b r0 = r19.c()
            y3.a r0 = (y3.a) r0
            r0.getClass()
            long r0 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r0
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0216
            r19.J()
            n4.v2 r2 = n4.w2.w
            java.lang.Object r2 = r2.a(r7)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            long r8 = java.lang.Math.max(r0, r2)
            n4.d7 r0 = r6.f10290i
            n4.t3 r0 = r0.f9703g
            w3.b r1 = r19.c()
            y3.a r1 = (y3.a) r1
            r1.getClass()
            long r1 = java.lang.System.currentTimeMillis()
            r0.b(r1)
        L_0x0216:
            n4.i3 r0 = r19.a()
            n4.g3 r0 = r0.f9835n
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            java.lang.String r2 = "Upload scheduled in approximately ms"
            r0.b(r2, r1)
            n4.o7 r0 = r6.f10286e
            H(r0)
            r0.h()
            n4.n4 r1 = r0.f9600a
            r1.getClass()
            n4.n4 r1 = r0.f9600a
            android.content.Context r1 = r1.f9986a
            boolean r2 = n4.d8.V(r1)
            if (r2 != 0) goto L_0x0249
            n4.n4 r2 = r0.f9600a
            n4.i3 r2 = r2.a()
            n4.g3 r2 = r2.f9834m
            java.lang.String r3 = "Receiver not registered/enabled"
            r2.a(r3)
        L_0x0249:
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x024f }
            if (r2 != 0) goto L_0x0252
        L_0x024f:
            r4 = r18
            goto L_0x0266
        L_0x0252:
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x024f }
            r4 = r18
            r3.<init>(r1, r4)     // Catch:{ NameNotFoundException -> 0x0266 }
            r1 = 0
            android.content.pm.ServiceInfo r2 = r2.getServiceInfo(r3, r1)     // Catch:{ NameNotFoundException -> 0x0266 }
            if (r2 == 0) goto L_0x0266
            boolean r1 = r2.enabled     // Catch:{ NameNotFoundException -> 0x0266 }
            if (r1 == 0) goto L_0x0266
            r1 = 1
            goto L_0x0267
        L_0x0266:
            r1 = 0
        L_0x0267:
            if (r1 != 0) goto L_0x0276
            n4.n4 r1 = r0.f9600a
            n4.i3 r1 = r1.a()
            n4.g3 r1 = r1.f9834m
            java.lang.String r2 = "Service not registered/enabled"
            r1.a(r2)
        L_0x0276:
            r0.k()
            n4.n4 r1 = r0.f9600a
            n4.i3 r1 = r1.a()
            n4.g3 r1 = r1.f9835n
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            java.lang.String r3 = "Scheduling upload, millis"
            r1.b(r3, r2)
            n4.n4 r1 = r0.f9600a
            y3.a r1 = r1.f9998n
            r1.getClass()
            android.os.SystemClock.elapsedRealtime()
            n4.n4 r1 = r0.f9600a
            r1.getClass()
            n4.v2 r1 = n4.w2.f10246x
            java.lang.Object r1 = r1.a(r7)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r10 = 0
            long r1 = java.lang.Math.max(r10, r1)
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x02c5
            n4.k r1 = r0.n()
            long r1 = r1.f9883c
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 == 0) goto L_0x02bb
            r1 = 1
            goto L_0x02bc
        L_0x02bb:
            r1 = 0
        L_0x02bc:
            if (r1 != 0) goto L_0x02c5
            n4.k r1 = r0.n()
            r1.c(r8)
        L_0x02c5:
            n4.n4 r1 = r0.f9600a
            r1.getClass()
            n4.n4 r1 = r0.f9600a
            android.content.Context r1 = r1.f9986a
            android.content.ComponentName r2 = new android.content.ComponentName
            r2.<init>(r1, r4)
            int r0 = r0.l()
            android.os.PersistableBundle r3 = new android.os.PersistableBundle
            r3.<init>()
            java.lang.String r4 = "action"
            java.lang.String r5 = "com.google.android.gms.measurement.UPLOAD"
            r3.putString(r4, r5)
            android.app.job.JobInfo$Builder r4 = new android.app.job.JobInfo$Builder
            r4.<init>(r0, r2)
            android.app.job.JobInfo$Builder r0 = r4.setMinimumLatency(r8)
            long r8 = r8 + r8
            android.app.job.JobInfo$Builder r0 = r0.setOverrideDeadline(r8)
            android.app.job.JobInfo$Builder r0 = r0.setExtras(r3)
            android.app.job.JobInfo r2 = r0.build()
            java.lang.reflect.Method r0 = j4.o0.f8349a
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r0 = r1.getSystemService(r0)
            r3 = r0
            android.app.job.JobScheduler r3 = (android.app.job.JobScheduler) r3
            r3.getClass()
            java.lang.reflect.Method r0 = j4.o0.f8349a
            if (r0 == 0) goto L_0x036b
            java.lang.String r0 = "android.permission.UPDATE_DEVICE_STATS"
            int r0 = r1.checkSelfPermission(r0)
            if (r0 == 0) goto L_0x0314
            goto L_0x036b
        L_0x0314:
            java.lang.reflect.Method r0 = j4.o0.f8350b
            if (r0 == 0) goto L_0x033b
            java.lang.Class<android.os.UserHandle> r1 = android.os.UserHandle.class
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException -> 0x032c, InvocationTargetException -> 0x032a }
            java.lang.Object r0 = r0.invoke(r1, r5)     // Catch:{ IllegalAccessException -> 0x032c, InvocationTargetException -> 0x032a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalAccessException -> 0x032c, InvocationTargetException -> 0x032a }
            if (r0 == 0) goto L_0x033b
            int r5 = r0.intValue()     // Catch:{ IllegalAccessException -> 0x032c, InvocationTargetException -> 0x032a }
            goto L_0x033c
        L_0x032a:
            r0 = move-exception
            goto L_0x032d
        L_0x032c:
            r0 = move-exception
        L_0x032d:
            r1 = 6
            java.lang.String r4 = "JobSchedulerCompat"
            boolean r1 = android.util.Log.isLoggable(r4, r1)
            if (r1 == 0) goto L_0x033b
            java.lang.String r1 = "myUserId invocation illegal"
            android.util.Log.e(r4, r1, r0)
        L_0x033b:
            r5 = 0
        L_0x033c:
            java.lang.String r1 = "UploadAlarm"
            java.lang.String r0 = "com.google.android.gms"
            java.lang.reflect.Method r4 = j4.o0.f8349a
            if (r4 == 0) goto L_0x036b
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ IllegalAccessException -> 0x0365, InvocationTargetException -> 0x0363 }
            r8 = 0
            r7[r8] = r2     // Catch:{ IllegalAccessException -> 0x0365, InvocationTargetException -> 0x0363 }
            r8 = 1
            r7[r8] = r0     // Catch:{ IllegalAccessException -> 0x0365, InvocationTargetException -> 0x0363 }
            r0 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ IllegalAccessException -> 0x0365, InvocationTargetException -> 0x0363 }
            r7[r0] = r5     // Catch:{ IllegalAccessException -> 0x0365, InvocationTargetException -> 0x0363 }
            r0 = 3
            r7[r0] = r1     // Catch:{ IllegalAccessException -> 0x0365, InvocationTargetException -> 0x0363 }
            java.lang.Object r0 = r4.invoke(r3, r7)     // Catch:{ IllegalAccessException -> 0x0365, InvocationTargetException -> 0x0363 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalAccessException -> 0x0365, InvocationTargetException -> 0x0363 }
            if (r0 == 0) goto L_0x036e
            r0.intValue()     // Catch:{ IllegalAccessException -> 0x0365, InvocationTargetException -> 0x0363 }
            goto L_0x036e
        L_0x0363:
            r0 = move-exception
            goto L_0x0366
        L_0x0365:
            r0 = move-exception
        L_0x0366:
            java.lang.String r4 = "error calling scheduleAsPackage"
            android.util.Log.e(r1, r4, r0)
        L_0x036b:
            r3.schedule(r2)
        L_0x036e:
            return
        L_0x036f:
            n4.i3 r0 = r19.a()
            n4.g3 r0 = r0.f9835n
            java.lang.String r1 = "No network"
            r0.a(r1)
            n4.q3 r0 = r19.L()
            n4.w7 r1 = r0.f10072a
            r1.g()
            n4.w7 r1 = r0.f10072a
            n4.m4 r1 = r1.d()
            r1.g()
            boolean r1 = r0.f10073b
            if (r1 == 0) goto L_0x0391
            goto L_0x03e1
        L_0x0391:
            n4.w7 r1 = r0.f10072a
            n4.n4 r1 = r1.f10292l
            android.content.Context r1 = r1.f9986a
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r3 = "android.net.conn.CONNECTIVITY_CHANGE"
            r2.<init>(r3)
            r1.registerReceiver(r0, r2)
            n4.w7 r1 = r0.f10072a
            n4.n3 r1 = r1.f10283b
            H(r1)
            boolean r1 = r1.k()
            r0.f10074c = r1
            n4.w7 r1 = r0.f10072a
            n4.i3 r1 = r1.a()
            n4.g3 r1 = r1.f9835n
            boolean r2 = r0.f10074c
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r3 = "Registering connectivity change receiver. Network connected"
            r1.b(r3, r2)
            r1 = 1
            r0.f10073b = r1
            goto L_0x03e1
        L_0x03c5:
            n4.i3 r0 = r19.a()
            n4.g3 r0 = r0.f9835n
            java.lang.String r1 = "Next upload time is 0"
            goto L_0x03d7
        L_0x03ce:
            r6 = r1
            n4.i3 r0 = r19.a()
            n4.g3 r0 = r0.f9835n
            java.lang.String r1 = "Nothing to upload or uploading impossible"
        L_0x03d7:
            r0.a(r1)
        L_0x03da:
            n4.q3 r0 = r19.L()
            r0.a()
        L_0x03e1:
            n4.o7 r0 = r6.f10286e
            H(r0)
            r0.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.w7.C():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1246:0x1a6e, code lost:
        if (r8 > (((java.lang.Long) r10.a((java.lang.Object) null)).longValue() + r6)) goto L_0x1a74;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0a3f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x0a40, code lost:
        r1 = r0;
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0a43, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0a44, code lost:
        r39 = r4;
        r37 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0a61, code lost:
        if (r8 == null) goto L_0x0a76;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:598:0x0bd1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:599:0x0bd2, code lost:
        r1 = r0;
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:0x0bf2, code lost:
        if (r5 != null) goto L_0x0bf4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:640:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:789:0x10af, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:790:0x10b0, code lost:
        r1 = r0;
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:794:0x10cf, code lost:
        if (r12 == null) goto L_0x10d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:801:0x10dd, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:877:0x12c7, code lost:
        if (r12 == null) goto L_0x12cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:924:0x1420, code lost:
        if (r12 != false) goto L_0x142b;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:1031:0x1687 A[SYNTHETIC, Splitter:B:1031:0x1687] */
    /* JADX WARNING: Removed duplicated region for block: B:1033:0x16a7 A[SYNTHETIC, Splitter:B:1033:0x16a7] */
    /* JADX WARNING: Removed duplicated region for block: B:1132:0x1897 A[Catch:{ all -> 0x188c, all -> 0x1c5c }] */
    /* JADX WARNING: Removed duplicated region for block: B:1135:0x18ae A[Catch:{ all -> 0x188c, all -> 0x1c5c }] */
    /* JADX WARNING: Removed duplicated region for block: B:1136:0x18c7 A[Catch:{ all -> 0x188c, all -> 0x1c5c }] */
    /* JADX WARNING: Removed duplicated region for block: B:1216:0x19ab A[SYNTHETIC, Splitter:B:1216:0x19ab] */
    /* JADX WARNING: Removed duplicated region for block: B:1241:0x1a57 A[SYNTHETIC, Splitter:B:1241:0x1a57] */
    /* JADX WARNING: Removed duplicated region for block: B:1256:0x1ae9 A[Catch:{ all -> 0x188c, all -> 0x1c5c }] */
    /* JADX WARNING: Removed duplicated region for block: B:1260:0x1b07 A[Catch:{ SQLiteException -> 0x1b1f }] */
    /* JADX WARNING: Removed duplicated region for block: B:1274:0x1b6e A[Catch:{ all -> 0x188c, all -> 0x1c5c }] */
    /* JADX WARNING: Removed duplicated region for block: B:1279:0x1b9f A[Catch:{ all -> 0x188c, all -> 0x1c5c }] */
    /* JADX WARNING: Removed duplicated region for block: B:1302:0x1c15 A[SYNTHETIC, Splitter:B:1302:0x1c15] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03f2 A[Catch:{ all -> 0x0103, all -> 0x059a }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x04c7 A[Catch:{ all -> 0x0103, all -> 0x059a }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0511 A[Catch:{ all -> 0x0103, all -> 0x059a }] */
    /* JADX WARNING: Removed duplicated region for block: B:509:0x0a3f A[ExcHandler: all (r0v86 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:466:0x099e] */
    /* JADX WARNING: Removed duplicated region for block: B:522:0x0a6c A[Catch:{ all -> 0x0a67, all -> 0x1c09 }] */
    /* JADX WARNING: Removed duplicated region for block: B:533:0x0aac A[Catch:{ SQLiteException -> 0x0b1d }] */
    /* JADX WARNING: Removed duplicated region for block: B:537:0x0ab9 A[SYNTHETIC, Splitter:B:537:0x0ab9] */
    /* JADX WARNING: Removed duplicated region for block: B:571:0x0b4a A[SYNTHETIC, Splitter:B:571:0x0b4a] */
    /* JADX WARNING: Removed duplicated region for block: B:575:0x0b54 A[Catch:{ all -> 0x0a67, all -> 0x1c09 }] */
    /* JADX WARNING: Removed duplicated region for block: B:577:0x0b5a A[Catch:{ all -> 0x0a67, all -> 0x1c09 }] */
    /* JADX WARNING: Removed duplicated region for block: B:598:0x0bd1 A[ExcHandler: all (r0v19 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:581:0x0b85] */
    /* JADX WARNING: Removed duplicated region for block: B:639:0x0d20 A[SYNTHETIC, Splitter:B:639:0x0d20] */
    /* JADX WARNING: Removed duplicated region for block: B:721:0x0ef3 A[Catch:{ all -> 0x0a67, all -> 0x1c09 }] */
    /* JADX WARNING: Removed duplicated region for block: B:789:0x10af A[ExcHandler: all (r0v23 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:735:0x0fe2] */
    /* JADX WARNING: Removed duplicated region for block: B:801:0x10dd A[Catch:{ all -> 0x10d8, all -> 0x1445 }] */
    /* JADX WARNING: Removed duplicated region for block: B:829:0x11de A[Catch:{ all -> 0x0a67, all -> 0x1c09 }] */
    /* JADX WARNING: Removed duplicated region for block: B:830:0x11e0 A[Catch:{ all -> 0x0a67, all -> 0x1c09 }] */
    /* JADX WARNING: Removed duplicated region for block: B:885:0x12d6 A[Catch:{ all -> 0x10d8, all -> 0x1445 }] */
    /* JADX WARNING: Removed duplicated region for block: B:936:0x146c A[SYNTHETIC, Splitter:B:936:0x146c] */
    /* JADX WARNING: Removed duplicated region for block: B:953:0x14fd A[EDGE_INSN: B:953:0x14fd->B:954:? ?: BREAK  , SYNTHETIC, Splitter:B:953:0x14fd] */
    /* JADX WARNING: Removed duplicated region for block: B:961:0x151b A[Catch:{ all -> 0x182f, all -> 0x1bff }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean D(long r81) {
        /*
            r80 = this;
            r1 = r80
            java.lang.String r2 = "1"
            java.lang.String r3 = "_npa"
            java.lang.String r4 = "_ai"
            n4.i r5 = r1.f10284c
            H(r5)
            r5.M()
            n4.u7 r5 = new n4.u7     // Catch:{ all -> 0x1c5e }
            r5.<init>(r1)     // Catch:{ all -> 0x1c5e }
            n4.i r6 = r1.f10284c     // Catch:{ all -> 0x1c5e }
            H(r6)     // Catch:{ all -> 0x1c5e }
            long r9 = r1.f10304z     // Catch:{ all -> 0x1c5e }
            r7 = r81
            r11 = r5
            r6.s(r7, r9, r11)     // Catch:{ all -> 0x1c5e }
            java.util.ArrayList r6 = r5.f10169c     // Catch:{ all -> 0x1c5e }
            if (r6 == 0) goto L_0x1c49
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x1c5e }
            if (r6 == 0) goto L_0x002e
            goto L_0x1c49
        L_0x002e:
            j4.t3 r6 = r5.f10167a     // Catch:{ all -> 0x1c5e }
            j4.i7 r6 = r6.j()     // Catch:{ all -> 0x1c5e }
            j4.s3 r6 = (j4.s3) r6     // Catch:{ all -> 0x1c5e }
            r6.j()     // Catch:{ all -> 0x1c5e }
            j4.m7 r8 = r6.f8238b     // Catch:{ all -> 0x1c45 }
            j4.t3 r8 = (j4.t3) r8     // Catch:{ all -> 0x1c45 }
            j4.t3.x0(r8)     // Catch:{ all -> 0x1c45 }
            r9 = -1
            r10 = 0
            r11 = -1
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0047:
            java.util.ArrayList r7 = r5.f10169c     // Catch:{ all -> 0x1c5e }
            int r7 = r7.size()     // Catch:{ all -> 0x1c5e }
            java.lang.String r8 = "_fr"
            r17 = r10
            java.lang.String r10 = "_et"
            r18 = r3
            java.lang.String r3 = "_e"
            r19 = 1000(0x3e8, double:4.94E-321)
            r21 = r14
            r22 = r15
            if (r13 >= r7) goto L_0x059f
            java.util.ArrayList r7 = r5.f10169c     // Catch:{ all -> 0x059a }
            java.lang.Object r7 = r7.get(r13)     // Catch:{ all -> 0x059a }
            j4.k3 r7 = (j4.k3) r7     // Catch:{ all -> 0x059a }
            j4.i7 r7 = r7.j()     // Catch:{ all -> 0x059a }
            j4.j3 r7 = (j4.j3) r7     // Catch:{ all -> 0x059a }
            n4.h4 r15 = r1.f10282a     // Catch:{ all -> 0x059a }
            H(r15)     // Catch:{ all -> 0x059a }
            j4.t3 r14 = r5.f10167a     // Catch:{ all -> 0x059a }
            java.lang.String r14 = r14.K1()     // Catch:{ all -> 0x059a }
            r26 = r13
            java.lang.String r13 = r7.o()     // Catch:{ all -> 0x059a }
            boolean r13 = r15.t(r14, r13)     // Catch:{ all -> 0x059a }
            java.lang.String r14 = "_err"
            if (r13 == 0) goto L_0x0117
            n4.i3 r3 = r80.a()     // Catch:{ all -> 0x059a }
            n4.g3 r3 = r3.n()     // Catch:{ all -> 0x059a }
            java.lang.String r8 = "Dropping blocked raw event. appId"
            j4.t3 r10 = r5.f10167a     // Catch:{ all -> 0x059a }
            java.lang.String r10 = r10.K1()     // Catch:{ all -> 0x059a }
            n4.h3 r10 = n4.i3.p(r10)     // Catch:{ all -> 0x059a }
            n4.n4 r13 = r1.f10292l     // Catch:{ all -> 0x059a }
            n4.d3 r13 = r13.q()     // Catch:{ all -> 0x059a }
            java.lang.String r15 = r7.o()     // Catch:{ all -> 0x059a }
            java.lang.String r13 = r13.d(r15)     // Catch:{ all -> 0x059a }
            r3.c(r8, r10, r13)     // Catch:{ all -> 0x059a }
            n4.h4 r3 = r1.f10282a     // Catch:{ all -> 0x059a }
            H(r3)     // Catch:{ all -> 0x059a }
            j4.t3 r8 = r5.f10167a     // Catch:{ all -> 0x059a }
            java.lang.String r8 = r8.K1()     // Catch:{ all -> 0x059a }
            java.lang.String r10 = "measurement.upload.blacklist_internal"
            java.lang.String r3 = r3.b(r8, r10)     // Catch:{ all -> 0x0114 }
            boolean r3 = r2.equals(r3)     // Catch:{ all -> 0x0114 }
            if (r3 != 0) goto L_0x0106
            n4.h4 r3 = r1.f10282a     // Catch:{ all -> 0x059a }
            H(r3)     // Catch:{ all -> 0x059a }
            j4.t3 r8 = r5.f10167a     // Catch:{ all -> 0x059a }
            java.lang.String r8 = r8.K1()     // Catch:{ all -> 0x059a }
            java.lang.String r10 = "measurement.upload.blacklist_public"
            java.lang.String r3 = r3.b(r8, r10)     // Catch:{ all -> 0x0103 }
            boolean r3 = r2.equals(r3)     // Catch:{ all -> 0x0103 }
            if (r3 == 0) goto L_0x00da
            goto L_0x0106
        L_0x00da:
            java.lang.String r3 = r7.o()     // Catch:{ all -> 0x059a }
            boolean r3 = r14.equals(r3)     // Catch:{ all -> 0x059a }
            if (r3 != 0) goto L_0x0106
            n4.d8 r3 = r80.P()     // Catch:{ all -> 0x059a }
            g1.t r8 = r1.E     // Catch:{ all -> 0x059a }
            j4.t3 r10 = r5.f10167a     // Catch:{ all -> 0x059a }
            java.lang.String r28 = r10.K1()     // Catch:{ all -> 0x059a }
            r29 = 11
            java.lang.String r30 = "_ev"
            java.lang.String r31 = r7.o()     // Catch:{ all -> 0x059a }
            r32 = 0
            r3.getClass()     // Catch:{ all -> 0x059a }
            r27 = r8
            n4.d8.x(r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x059a }
            goto L_0x0106
        L_0x0103:
            r0 = move-exception
            goto L_0x059b
        L_0x0106:
            r27 = r2
            r23 = r4
            r10 = r17
            r14 = r21
            r15 = r22
            r4 = r26
            goto L_0x058a
        L_0x0114:
            r0 = move-exception
            goto L_0x059b
        L_0x0117:
            java.lang.String r13 = r7.o()     // Catch:{ all -> 0x059a }
            java.lang.String[] r15 = c.a.f2360s     // Catch:{ all -> 0x0598 }
            r27 = r2
            java.lang.String[] r2 = c.a.f2356q     // Catch:{ all -> 0x0598 }
            java.lang.String r2 = y3.a.R(r4, r15, r2)     // Catch:{ all -> 0x0598 }
            boolean r2 = r13.equals(r2)     // Catch:{ all -> 0x059a }
            if (r2 == 0) goto L_0x01a0
            r7.j()     // Catch:{ all -> 0x019d }
            j4.m7 r2 = r7.f8238b     // Catch:{ all -> 0x019d }
            j4.k3 r2 = (j4.k3) r2     // Catch:{ all -> 0x019d }
            j4.k3.H(r2, r4)     // Catch:{ all -> 0x019d }
            n4.i3 r2 = r80.a()     // Catch:{ all -> 0x059a }
            n4.g3 r2 = r2.m()     // Catch:{ all -> 0x059a }
            java.lang.String r13 = "Renaming ad_impression to _ai"
            r2.a(r13)     // Catch:{ all -> 0x059a }
            n4.i3 r2 = r80.a()     // Catch:{ all -> 0x059a }
            java.lang.String r2 = r2.t()     // Catch:{ all -> 0x059a }
            r13 = 5
            boolean r2 = android.util.Log.isLoggable(r2, r13)     // Catch:{ all -> 0x059a }
            if (r2 == 0) goto L_0x01a0
            r2 = 0
        L_0x0152:
            j4.m7 r13 = r7.f8238b     // Catch:{ all -> 0x019a }
            j4.k3 r13 = (j4.k3) r13     // Catch:{ all -> 0x019a }
            int r13 = r13.u()     // Catch:{ all -> 0x019a }
            if (r2 >= r13) goto L_0x01a0
            java.lang.String r13 = "ad_platform"
            j4.o3 r15 = r7.n(r2)     // Catch:{ all -> 0x059a }
            java.lang.String r15 = r15.z()     // Catch:{ all -> 0x059a }
            boolean r13 = r13.equals(r15)     // Catch:{ all -> 0x059a }
            if (r13 == 0) goto L_0x0197
            j4.o3 r13 = r7.n(r2)     // Catch:{ all -> 0x059a }
            java.lang.String r13 = r13.A()     // Catch:{ all -> 0x059a }
            boolean r13 = r13.isEmpty()     // Catch:{ all -> 0x059a }
            if (r13 != 0) goto L_0x0197
            java.lang.String r13 = "admob"
            j4.o3 r15 = r7.n(r2)     // Catch:{ all -> 0x059a }
            java.lang.String r15 = r15.A()     // Catch:{ all -> 0x059a }
            boolean r13 = r13.equalsIgnoreCase(r15)     // Catch:{ all -> 0x059a }
            if (r13 == 0) goto L_0x0197
            n4.i3 r13 = r80.a()     // Catch:{ all -> 0x059a }
            n4.g3 r13 = r13.o()     // Catch:{ all -> 0x059a }
            java.lang.String r15 = "AdMob ad impression logged from app. Potentially duplicative."
            r13.a(r15)     // Catch:{ all -> 0x059a }
        L_0x0197:
            int r2 = r2 + 1
            goto L_0x0152
        L_0x019a:
            r0 = move-exception
            goto L_0x059b
        L_0x019d:
            r0 = move-exception
            goto L_0x059b
        L_0x01a0:
            n4.h4 r2 = r1.f10282a     // Catch:{ all -> 0x059a }
            H(r2)     // Catch:{ all -> 0x059a }
            j4.t3 r13 = r5.f10167a     // Catch:{ all -> 0x059a }
            java.lang.String r13 = r13.K1()     // Catch:{ all -> 0x059a }
            java.lang.String r15 = r7.o()     // Catch:{ all -> 0x059a }
            boolean r2 = r2.s(r13, r15)     // Catch:{ all -> 0x059a }
            java.lang.String r13 = "_c"
            if (r2 != 0) goto L_0x01eb
            n4.y7 r15 = r1.f10288g     // Catch:{ all -> 0x059a }
            H(r15)     // Catch:{ all -> 0x059a }
            java.lang.String r15 = r7.o()     // Catch:{ all -> 0x059a }
            r3.o.e(r15)     // Catch:{ all -> 0x059a }
            r23 = r4
            int r4 = r15.hashCode()     // Catch:{ all -> 0x059a }
            r28 = r11
            r11 = 95027(0x17333, float:1.33161E-40)
            if (r4 == r11) goto L_0x01d1
            goto L_0x01db
        L_0x01d1:
            java.lang.String r4 = "_ui"
            boolean r4 = r15.equals(r4)
            if (r4 == 0) goto L_0x01db
            r4 = 0
            goto L_0x01dc
        L_0x01db:
            r4 = -1
        L_0x01dc:
            if (r4 == 0) goto L_0x01ef
            r30 = r6
            r31 = r9
            r29 = r10
            r15 = r12
            r10 = r17
            r24 = 0
            goto L_0x03f0
        L_0x01eb:
            r23 = r4
            r28 = r11
        L_0x01ef:
            r4 = 0
            r11 = 0
            r15 = 0
        L_0x01f2:
            r29 = r10
            j4.m7 r10 = r7.f8238b     // Catch:{ all -> 0x0596 }
            j4.k3 r10 = (j4.k3) r10     // Catch:{ all -> 0x0596 }
            int r10 = r10.u()     // Catch:{ all -> 0x0596 }
            r30 = r6
            java.lang.String r6 = "_r"
            if (r4 >= r10) goto L_0x0276
            j4.o3 r10 = r7.n(r4)     // Catch:{ all -> 0x059a }
            java.lang.String r10 = r10.z()     // Catch:{ all -> 0x059a }
            boolean r10 = r13.equals(r10)     // Catch:{ all -> 0x059a }
            if (r10 == 0) goto L_0x0236
            j4.o3 r6 = r7.n(r4)     // Catch:{ all -> 0x059a }
            j4.i7 r6 = r6.j()     // Catch:{ all -> 0x059a }
            j4.n3 r6 = (j4.n3) r6     // Catch:{ all -> 0x059a }
            r10 = 1
            r6.k(r10)     // Catch:{ all -> 0x059a }
            j4.m7 r6 = r6.h()     // Catch:{ all -> 0x059a }
            j4.o3 r6 = (j4.o3) r6     // Catch:{ all -> 0x059a }
            r7.j()     // Catch:{ all -> 0x0233 }
            j4.m7 r10 = r7.f8238b     // Catch:{ all -> 0x0233 }
            j4.k3 r10 = (j4.k3) r10     // Catch:{ all -> 0x0233 }
            j4.k3.C(r10, r4, r6)     // Catch:{ all -> 0x0233 }
            r31 = r9
            r11 = 1
            goto L_0x026c
        L_0x0233:
            r0 = move-exception
            goto L_0x059b
        L_0x0236:
            j4.o3 r10 = r7.n(r4)     // Catch:{ all -> 0x059a }
            java.lang.String r10 = r10.z()     // Catch:{ all -> 0x059a }
            boolean r6 = r6.equals(r10)     // Catch:{ all -> 0x059a }
            if (r6 == 0) goto L_0x026a
            j4.o3 r6 = r7.n(r4)     // Catch:{ all -> 0x059a }
            j4.i7 r6 = r6.j()     // Catch:{ all -> 0x059a }
            j4.n3 r6 = (j4.n3) r6     // Catch:{ all -> 0x059a }
            r31 = r9
            r9 = 1
            r6.k(r9)     // Catch:{ all -> 0x059a }
            j4.m7 r6 = r6.h()     // Catch:{ all -> 0x059a }
            j4.o3 r6 = (j4.o3) r6     // Catch:{ all -> 0x059a }
            r7.j()     // Catch:{ all -> 0x0267 }
            j4.m7 r9 = r7.f8238b     // Catch:{ all -> 0x0267 }
            j4.k3 r9 = (j4.k3) r9     // Catch:{ all -> 0x0267 }
            j4.k3.C(r9, r4, r6)     // Catch:{ all -> 0x0267 }
            r15 = 1
            goto L_0x026c
        L_0x0267:
            r0 = move-exception
            goto L_0x059b
        L_0x026a:
            r31 = r9
        L_0x026c:
            int r4 = r4 + 1
            r10 = r29
            r6 = r30
            r9 = r31
            goto L_0x01f2
        L_0x0276:
            r31 = r9
            if (r11 != 0) goto L_0x02a6
            if (r2 == 0) goto L_0x02a6
            n4.i3 r4 = r80.a()     // Catch:{ all -> 0x059a }
            n4.g3 r4 = r4.m()     // Catch:{ all -> 0x059a }
            java.lang.String r9 = "Marking event as conversion"
            n4.n4 r10 = r1.f10292l     // Catch:{ all -> 0x059a }
            n4.d3 r10 = r10.q()     // Catch:{ all -> 0x059a }
            java.lang.String r11 = r7.o()     // Catch:{ all -> 0x059a }
            java.lang.String r10 = r10.d(r11)     // Catch:{ all -> 0x059a }
            r4.b(r9, r10)     // Catch:{ all -> 0x059a }
            j4.n3 r4 = j4.o3.x()     // Catch:{ all -> 0x059a }
            r4.l(r13)     // Catch:{ all -> 0x059a }
            r9 = 1
            r4.k(r9)     // Catch:{ all -> 0x059a }
            r7.m(r4)     // Catch:{ all -> 0x059a }
        L_0x02a6:
            if (r15 != 0) goto L_0x02d2
            n4.i3 r4 = r80.a()     // Catch:{ all -> 0x059a }
            n4.g3 r4 = r4.m()     // Catch:{ all -> 0x059a }
            java.lang.String r9 = "Marking event as real-time"
            n4.n4 r10 = r1.f10292l     // Catch:{ all -> 0x059a }
            n4.d3 r10 = r10.q()     // Catch:{ all -> 0x059a }
            java.lang.String r11 = r7.o()     // Catch:{ all -> 0x059a }
            java.lang.String r10 = r10.d(r11)     // Catch:{ all -> 0x059a }
            r4.b(r9, r10)     // Catch:{ all -> 0x059a }
            j4.n3 r4 = j4.o3.x()     // Catch:{ all -> 0x059a }
            r4.l(r6)     // Catch:{ all -> 0x059a }
            r9 = 1
            r4.k(r9)     // Catch:{ all -> 0x059a }
            r7.m(r4)     // Catch:{ all -> 0x059a }
        L_0x02d2:
            n4.i r4 = r1.f10284c     // Catch:{ all -> 0x059a }
            H(r4)     // Catch:{ all -> 0x059a }
            long r33 = r80.v()     // Catch:{ all -> 0x059a }
            j4.t3 r9 = r5.f10167a     // Catch:{ all -> 0x059a }
            java.lang.String r35 = r9.K1()     // Catch:{ all -> 0x059a }
            r36 = 0
            r37 = 1
            r32 = r4
            n4.g r4 = r32.C(r33, r35, r36, r37)     // Catch:{ all -> 0x059a }
            long r9 = r4.f9752e     // Catch:{ all -> 0x059a }
            n4.f r4 = r80.J()     // Catch:{ all -> 0x059a }
            j4.t3 r11 = r5.f10167a     // Catch:{ all -> 0x059a }
            java.lang.String r11 = r11.K1()     // Catch:{ all -> 0x059a }
            n4.v2 r15 = n4.w2.f10234p     // Catch:{ all -> 0x059a }
            int r4 = r4.i(r11, r15)     // Catch:{ all -> 0x059a }
            r15 = r12
            long r11 = (long) r4     // Catch:{ all -> 0x059a }
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0309
            x(r7, r6)     // Catch:{ all -> 0x059a }
            r10 = r17
            goto L_0x030a
        L_0x0309:
            r10 = 1
        L_0x030a:
            java.lang.String r4 = r7.o()     // Catch:{ all -> 0x059a }
            boolean r4 = n4.d8.U(r4)     // Catch:{ all -> 0x059a }
            if (r4 == 0) goto L_0x03ec
            if (r2 == 0) goto L_0x03ec
            n4.i r4 = r1.f10284c     // Catch:{ all -> 0x059a }
            H(r4)     // Catch:{ all -> 0x059a }
            long r33 = r80.v()     // Catch:{ all -> 0x059a }
            j4.t3 r6 = r5.f10167a     // Catch:{ all -> 0x059a }
            java.lang.String r35 = r6.K1()     // Catch:{ all -> 0x059a }
            r36 = 1
            r37 = 0
            r32 = r4
            n4.g r4 = r32.C(r33, r35, r36, r37)     // Catch:{ all -> 0x059a }
            long r11 = r4.f9750c     // Catch:{ all -> 0x059a }
            n4.f r4 = r80.J()     // Catch:{ all -> 0x059a }
            j4.t3 r6 = r5.f10167a     // Catch:{ all -> 0x059a }
            java.lang.String r6 = r6.K1()     // Catch:{ all -> 0x059a }
            n4.v2 r9 = n4.w2.f10232o     // Catch:{ all -> 0x059a }
            int r4 = r4.i(r6, r9)     // Catch:{ all -> 0x059a }
            r6 = r10
            long r9 = (long) r4     // Catch:{ all -> 0x059a }
            int r4 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x03e9
            n4.i3 r4 = r80.a()     // Catch:{ all -> 0x059a }
            n4.g3 r4 = r4.n()     // Catch:{ all -> 0x059a }
            java.lang.String r9 = "Too many conversions. Not logging as conversion. appId"
            j4.t3 r10 = r5.f10167a     // Catch:{ all -> 0x059a }
            java.lang.String r10 = r10.K1()     // Catch:{ all -> 0x059a }
            n4.h3 r10 = n4.i3.p(r10)     // Catch:{ all -> 0x059a }
            r4.b(r9, r10)     // Catch:{ all -> 0x059a }
            r4 = 0
            r9 = 0
            r10 = 0
            r11 = -1
        L_0x0362:
            j4.m7 r12 = r7.f8238b     // Catch:{ all -> 0x03e6 }
            j4.k3 r12 = (j4.k3) r12     // Catch:{ all -> 0x03e6 }
            int r12 = r12.u()     // Catch:{ all -> 0x03e6 }
            if (r9 >= r12) goto L_0x0395
            j4.o3 r12 = r7.n(r9)     // Catch:{ all -> 0x059a }
            r24 = r2
            java.lang.String r2 = r12.z()     // Catch:{ all -> 0x059a }
            boolean r2 = r13.equals(r2)     // Catch:{ all -> 0x059a }
            if (r2 == 0) goto L_0x0385
            j4.i7 r2 = r12.j()     // Catch:{ all -> 0x059a }
            j4.n3 r2 = (j4.n3) r2     // Catch:{ all -> 0x059a }
            r4 = r2
            r11 = r9
            goto L_0x0390
        L_0x0385:
            java.lang.String r2 = r12.z()     // Catch:{ all -> 0x059a }
            boolean r2 = r14.equals(r2)     // Catch:{ all -> 0x059a }
            if (r2 == 0) goto L_0x0390
            r10 = 1
        L_0x0390:
            int r9 = r9 + 1
            r2 = r24
            goto L_0x0362
        L_0x0395:
            r24 = r2
            if (r10 == 0) goto L_0x03aa
            if (r4 == 0) goto L_0x03a9
            r7.j()     // Catch:{ all -> 0x03a6 }
            j4.m7 r2 = r7.f8238b     // Catch:{ all -> 0x03a6 }
            j4.k3 r2 = (j4.k3) r2     // Catch:{ all -> 0x03a6 }
            j4.k3.G(r2, r11)     // Catch:{ all -> 0x03a6 }
            goto L_0x03ef
        L_0x03a6:
            r0 = move-exception
            goto L_0x059b
        L_0x03a9:
            r4 = 0
        L_0x03aa:
            if (r4 == 0) goto L_0x03ce
            j4.i7 r2 = r4.clone()     // Catch:{ all -> 0x059a }
            j4.n3 r2 = (j4.n3) r2     // Catch:{ all -> 0x059a }
            r2.l(r14)     // Catch:{ all -> 0x059a }
            r9 = 10
            r2.k(r9)     // Catch:{ all -> 0x059a }
            j4.m7 r2 = r2.h()     // Catch:{ all -> 0x059a }
            j4.o3 r2 = (j4.o3) r2     // Catch:{ all -> 0x059a }
            r7.j()     // Catch:{ all -> 0x03cb }
            j4.m7 r4 = r7.f8238b     // Catch:{ all -> 0x03cb }
            j4.k3 r4 = (j4.k3) r4     // Catch:{ all -> 0x03cb }
            j4.k3.C(r4, r11, r2)     // Catch:{ all -> 0x03cb }
            goto L_0x03ef
        L_0x03cb:
            r0 = move-exception
            goto L_0x059b
        L_0x03ce:
            n4.i3 r2 = r80.a()     // Catch:{ all -> 0x059a }
            n4.g3 r2 = r2.l()     // Catch:{ all -> 0x059a }
            java.lang.String r4 = "Did not find conversion parameter. appId"
            j4.t3 r9 = r5.f10167a     // Catch:{ all -> 0x059a }
            java.lang.String r9 = r9.K1()     // Catch:{ all -> 0x059a }
            n4.h3 r9 = n4.i3.p(r9)     // Catch:{ all -> 0x059a }
            r2.b(r4, r9)     // Catch:{ all -> 0x059a }
            goto L_0x03ef
        L_0x03e6:
            r0 = move-exception
            goto L_0x059b
        L_0x03e9:
            r24 = r2
            goto L_0x03ef
        L_0x03ec:
            r24 = r2
            r6 = r10
        L_0x03ef:
            r10 = r6
        L_0x03f0:
            if (r24 == 0) goto L_0x04bd
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x059a }
            java.util.List r4 = r7.p()     // Catch:{ all -> 0x059a }
            r2.<init>(r4)     // Catch:{ all -> 0x059a }
            r4 = 0
            r6 = -1
            r9 = -1
        L_0x03fe:
            int r11 = r2.size()     // Catch:{ all -> 0x059a }
            java.lang.String r12 = "currency"
            java.lang.String r14 = "value"
            if (r4 >= r11) goto L_0x042e
            java.lang.Object r11 = r2.get(r4)     // Catch:{ all -> 0x059a }
            j4.o3 r11 = (j4.o3) r11     // Catch:{ all -> 0x059a }
            java.lang.String r11 = r11.z()     // Catch:{ all -> 0x059a }
            boolean r11 = r14.equals(r11)     // Catch:{ all -> 0x059a }
            if (r11 == 0) goto L_0x041a
            r6 = r4
            goto L_0x042b
        L_0x041a:
            java.lang.Object r11 = r2.get(r4)     // Catch:{ all -> 0x059a }
            j4.o3 r11 = (j4.o3) r11     // Catch:{ all -> 0x059a }
            java.lang.String r11 = r11.z()     // Catch:{ all -> 0x059a }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x059a }
            if (r11 == 0) goto L_0x042b
            r9 = r4
        L_0x042b:
            int r4 = r4 + 1
            goto L_0x03fe
        L_0x042e:
            r4 = -1
            if (r6 != r4) goto L_0x0433
            goto L_0x04bd
        L_0x0433:
            java.lang.Object r4 = r2.get(r6)     // Catch:{ all -> 0x059a }
            j4.o3 r4 = (j4.o3) r4     // Catch:{ all -> 0x059a }
            boolean r4 = r4.O()     // Catch:{ all -> 0x059a }
            if (r4 != 0) goto L_0x046e
            java.lang.Object r4 = r2.get(r6)     // Catch:{ all -> 0x059a }
            j4.o3 r4 = (j4.o3) r4     // Catch:{ all -> 0x059a }
            boolean r4 = r4.M()     // Catch:{ all -> 0x059a }
            if (r4 != 0) goto L_0x046e
            n4.i3 r2 = r80.a()     // Catch:{ all -> 0x059a }
            n4.g3 r2 = r2.o()     // Catch:{ all -> 0x059a }
            java.lang.String r4 = "Value must be specified with a numeric type."
            r2.a(r4)     // Catch:{ all -> 0x059a }
            r7.j()     // Catch:{ all -> 0x046b }
            j4.m7 r2 = r7.f8238b     // Catch:{ all -> 0x046b }
            j4.k3 r2 = (j4.k3) r2     // Catch:{ all -> 0x046b }
            j4.k3.G(r2, r6)     // Catch:{ all -> 0x046b }
            x(r7, r13)     // Catch:{ all -> 0x059a }
            r2 = 18
            w(r7, r2, r14)     // Catch:{ all -> 0x059a }
            goto L_0x04bd
        L_0x046b:
            r0 = move-exception
            goto L_0x059b
        L_0x046e:
            r4 = -1
            if (r9 != r4) goto L_0x0472
            goto L_0x049a
        L_0x0472:
            java.lang.Object r2 = r2.get(r9)     // Catch:{ all -> 0x059a }
            j4.o3 r2 = (j4.o3) r2     // Catch:{ all -> 0x059a }
            java.lang.String r2 = r2.A()     // Catch:{ all -> 0x059a }
            int r4 = r2.length()     // Catch:{ all -> 0x059a }
            r9 = 3
            if (r4 != r9) goto L_0x049a
            r4 = 0
        L_0x0484:
            int r9 = r2.length()     // Catch:{ all -> 0x059a }
            if (r4 >= r9) goto L_0x04bd
            int r9 = r2.codePointAt(r4)     // Catch:{ all -> 0x059a }
            boolean r11 = java.lang.Character.isLetter(r9)     // Catch:{ all -> 0x059a }
            if (r11 == 0) goto L_0x049a
            int r9 = java.lang.Character.charCount(r9)     // Catch:{ all -> 0x059a }
            int r4 = r4 + r9
            goto L_0x0484
        L_0x049a:
            n4.i3 r2 = r80.a()     // Catch:{ all -> 0x059a }
            n4.g3 r2 = r2.o()     // Catch:{ all -> 0x059a }
            java.lang.String r4 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.a(r4)     // Catch:{ all -> 0x059a }
            r7.j()     // Catch:{ all -> 0x04ba }
            j4.m7 r2 = r7.f8238b     // Catch:{ all -> 0x04ba }
            j4.k3 r2 = (j4.k3) r2     // Catch:{ all -> 0x04ba }
            j4.k3.G(r2, r6)     // Catch:{ all -> 0x04ba }
            x(r7, r13)     // Catch:{ all -> 0x059a }
            r2 = 19
            w(r7, r2, r12)     // Catch:{ all -> 0x059a }
            goto L_0x04bd
        L_0x04ba:
            r0 = move-exception
            goto L_0x059b
        L_0x04bd:
            java.lang.String r2 = r7.o()     // Catch:{ all -> 0x059a }
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x059a }
            if (r2 == 0) goto L_0x0511
            n4.y7 r2 = r1.f10288g     // Catch:{ all -> 0x059a }
            H(r2)     // Catch:{ all -> 0x059a }
            j4.m7 r2 = r7.h()     // Catch:{ all -> 0x059a }
            j4.k3 r2 = (j4.k3) r2     // Catch:{ all -> 0x059a }
            j4.o3 r2 = n4.y7.l(r2, r8)     // Catch:{ all -> 0x059a }
            if (r2 != 0) goto L_0x050c
            if (r15 == 0) goto L_0x0501
            long r2 = r15.l()     // Catch:{ all -> 0x059a }
            long r8 = r7.l()     // Catch:{ all -> 0x059a }
            long r2 = r2 - r8
            long r2 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x059a }
            int r2 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r2 > 0) goto L_0x0501
            j4.i7 r2 = r15.clone()     // Catch:{ all -> 0x059a }
            j4.j3 r2 = (j4.j3) r2     // Catch:{ all -> 0x059a }
            boolean r3 = r1.F(r7, r2)     // Catch:{ all -> 0x059a }
            if (r3 == 0) goto L_0x0501
            r6 = r30
            r8 = r31
            r6.m(r8, r2)     // Catch:{ all -> 0x059a }
            r3 = r28
            goto L_0x0558
        L_0x0501:
            r6 = r30
            r8 = r31
            r9 = r8
            r12 = r15
            r11 = r21
            r15 = r7
            goto L_0x056b
        L_0x050c:
            r6 = r30
            r8 = r31
            goto L_0x0564
        L_0x0511:
            r6 = r30
            r8 = r31
            java.lang.String r2 = "_vs"
            java.lang.String r3 = r7.o()     // Catch:{ all -> 0x059a }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x059a }
            if (r2 == 0) goto L_0x0564
            n4.y7 r2 = r1.f10288g     // Catch:{ all -> 0x059a }
            H(r2)     // Catch:{ all -> 0x059a }
            j4.m7 r2 = r7.h()     // Catch:{ all -> 0x059a }
            j4.k3 r2 = (j4.k3) r2     // Catch:{ all -> 0x059a }
            r4 = r29
            j4.o3 r2 = n4.y7.l(r2, r4)     // Catch:{ all -> 0x059a }
            if (r2 != 0) goto L_0x0564
            if (r22 == 0) goto L_0x055d
            long r2 = r22.l()     // Catch:{ all -> 0x059a }
            long r11 = r7.l()     // Catch:{ all -> 0x059a }
            long r2 = r2 - r11
            long r2 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x059a }
            int r2 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r2 > 0) goto L_0x055d
            j4.i7 r2 = r22.clone()     // Catch:{ all -> 0x059a }
            j4.j3 r2 = (j4.j3) r2     // Catch:{ all -> 0x059a }
            boolean r3 = r1.F(r2, r7)     // Catch:{ all -> 0x059a }
            if (r3 == 0) goto L_0x055d
            r3 = r28
            r6.m(r3, r2)     // Catch:{ all -> 0x059a }
        L_0x0558:
            r11 = r3
            r9 = r8
            r12 = 0
            r15 = 0
            goto L_0x056b
        L_0x055d:
            r3 = r28
            r11 = r3
            r12 = r7
            r9 = r21
            goto L_0x0569
        L_0x0564:
            r3 = r28
            r11 = r3
            r9 = r8
            r12 = r15
        L_0x0569:
            r15 = r22
        L_0x056b:
            java.util.ArrayList r2 = r5.f10169c     // Catch:{ all -> 0x059a }
            j4.m7 r3 = r7.h()     // Catch:{ all -> 0x059a }
            j4.k3 r3 = (j4.k3) r3     // Catch:{ all -> 0x059a }
            r4 = r26
            r2.set(r4, r3)     // Catch:{ all -> 0x059a }
            int r14 = r21 + 1
            r6.j()     // Catch:{ all -> 0x0594 }
            j4.m7 r2 = r6.f8238b     // Catch:{ all -> 0x0594 }
            j4.t3 r2 = (j4.t3) r2     // Catch:{ all -> 0x0594 }
            j4.m7 r3 = r7.h()     // Catch:{ all -> 0x0594 }
            j4.k3 r3 = (j4.k3) r3     // Catch:{ all -> 0x0594 }
            j4.t3.O(r2, r3)     // Catch:{ all -> 0x0594 }
        L_0x058a:
            int r13 = r4 + 1
            r3 = r18
            r4 = r23
            r2 = r27
            goto L_0x0047
        L_0x0594:
            r0 = move-exception
            goto L_0x059b
        L_0x0596:
            r0 = move-exception
            goto L_0x059b
        L_0x0598:
            r0 = move-exception
            goto L_0x059b
        L_0x059a:
            r0 = move-exception
        L_0x059b:
            r2 = r0
            r4 = r1
            goto L_0x1c61
        L_0x059f:
            r4 = r10
            r9 = 0
            r11 = r9
            r14 = r21
            r2 = 0
        L_0x05a6:
            if (r2 >= r14) goto L_0x05fd
            j4.m7 r7 = r6.f8238b     // Catch:{ all -> 0x05fb }
            j4.t3 r7 = (j4.t3) r7     // Catch:{ all -> 0x05fb }
            j4.k3 r7 = r7.F1(r2)     // Catch:{ all -> 0x05fb }
            java.lang.String r13 = r7.A()     // Catch:{ all -> 0x059a }
            boolean r13 = r3.equals(r13)     // Catch:{ all -> 0x059a }
            if (r13 == 0) goto L_0x05cd
            n4.y7 r13 = r1.f10288g     // Catch:{ all -> 0x059a }
            H(r13)     // Catch:{ all -> 0x059a }
            j4.o3 r13 = n4.y7.l(r7, r8)     // Catch:{ all -> 0x059a }
            if (r13 == 0) goto L_0x05cd
            r6.k(r2)     // Catch:{ all -> 0x059a }
            int r14 = r14 + -1
            int r2 = r2 + -1
            goto L_0x05f8
        L_0x05cd:
            n4.y7 r13 = r1.f10288g     // Catch:{ all -> 0x059a }
            H(r13)     // Catch:{ all -> 0x059a }
            j4.o3 r7 = n4.y7.l(r7, r4)     // Catch:{ all -> 0x059a }
            if (r7 == 0) goto L_0x05f8
            boolean r13 = r7.O()     // Catch:{ all -> 0x059a }
            if (r13 == 0) goto L_0x05e7
            long r21 = r7.w()     // Catch:{ all -> 0x059a }
            java.lang.Long r7 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x059a }
            goto L_0x05e8
        L_0x05e7:
            r7 = 0
        L_0x05e8:
            if (r7 == 0) goto L_0x05f8
            long r21 = r7.longValue()     // Catch:{ all -> 0x059a }
            int r13 = (r21 > r9 ? 1 : (r21 == r9 ? 0 : -1))
            if (r13 <= 0) goto L_0x05f8
            long r21 = r7.longValue()     // Catch:{ all -> 0x059a }
            long r11 = r11 + r21
        L_0x05f8:
            r7 = 1
            int r2 = r2 + r7
            goto L_0x05a6
        L_0x05fb:
            r0 = move-exception
            goto L_0x059b
        L_0x05fd:
            r2 = 0
            r1.B(r6, r11, r2)     // Catch:{ all -> 0x1c5e }
            j4.m7 r2 = r6.f8238b     // Catch:{ all -> 0x1c5e }
            j4.t3 r2 = (j4.t3) r2     // Catch:{ all -> 0x1c41 }
            j4.r7 r2 = r2.H()     // Catch:{ all -> 0x1c41 }
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x1c41 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x1c5e }
        L_0x0611:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x1c5e }
            java.lang.String r4 = "_se"
            java.lang.String r7 = "_s"
            if (r3 == 0) goto L_0x0637
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x059a }
            j4.k3 r3 = (j4.k3) r3     // Catch:{ all -> 0x059a }
            java.lang.String r3 = r3.A()     // Catch:{ all -> 0x059a }
            boolean r3 = r7.equals(r3)     // Catch:{ all -> 0x059a }
            if (r3 == 0) goto L_0x0611
            n4.i r2 = r1.f10284c     // Catch:{ all -> 0x059a }
            H(r2)     // Catch:{ all -> 0x059a }
            java.lang.String r3 = r6.p()     // Catch:{ all -> 0x059a }
            r2.k(r3, r4)     // Catch:{ all -> 0x059a }
        L_0x0637:
            java.lang.String r2 = "_sid"
            int r2 = n4.y7.u(r6, r2)     // Catch:{ all -> 0x1c5e }
            if (r2 < 0) goto L_0x0644
            r2 = 1
            r1.B(r6, r11, r2)     // Catch:{ all -> 0x059a }
            goto L_0x066f
        L_0x0644:
            int r2 = n4.y7.u(r6, r4)     // Catch:{ all -> 0x1c5e }
            if (r2 < 0) goto L_0x066f
            r6.j()     // Catch:{ all -> 0x066c }
            j4.m7 r3 = r6.f8238b     // Catch:{ all -> 0x066c }
            j4.t3 r3 = (j4.t3) r3     // Catch:{ all -> 0x066c }
            j4.t3.D0(r3, r2)     // Catch:{ all -> 0x066c }
            n4.i3 r2 = r80.a()     // Catch:{ all -> 0x059a }
            n4.g3 r2 = r2.l()     // Catch:{ all -> 0x059a }
            java.lang.String r3 = "Session engagement user property is in the bundle without session ID. appId"
            j4.t3 r4 = r5.f10167a     // Catch:{ all -> 0x059a }
            java.lang.String r4 = r4.K1()     // Catch:{ all -> 0x059a }
            n4.h3 r4 = n4.i3.p(r4)     // Catch:{ all -> 0x059a }
            r2.b(r3, r4)     // Catch:{ all -> 0x059a }
            goto L_0x066f
        L_0x066c:
            r0 = move-exception
            goto L_0x059b
        L_0x066f:
            n4.y7 r2 = r1.f10288g     // Catch:{ all -> 0x1c5e }
            H(r2)     // Catch:{ all -> 0x1c5e }
            n4.n4 r3 = r2.f9600a     // Catch:{ all -> 0x1c5e }
            n4.i3 r3 = r3.a()     // Catch:{ all -> 0x1c5e }
            n4.g3 r3 = r3.m()     // Catch:{ all -> 0x1c5e }
            java.lang.String r4 = "Checking account type status for ad personalization signals"
            r3.a(r4)     // Catch:{ all -> 0x1c5e }
            n4.w7 r3 = r2.f10066b     // Catch:{ all -> 0x1c5e }
            n4.h4 r3 = r3.f10282a     // Catch:{ all -> 0x1c5e }
            H(r3)     // Catch:{ all -> 0x1c5e }
            java.lang.String r4 = r6.p()     // Catch:{ all -> 0x1c5e }
            r3.g()     // Catch:{ all -> 0x1c5e }
            j4.x2 r3 = r3.q(r4)     // Catch:{ all -> 0x1c3d }
            if (r3 != 0) goto L_0x0699
            r3 = 0
            goto L_0x069d
        L_0x0699:
            boolean r3 = r3.K()     // Catch:{ all -> 0x1c3d }
        L_0x069d:
            r11 = 86400000(0x5265c00, double:4.2687272E-316)
            if (r3 == 0) goto L_0x0804
            n4.w7 r3 = r2.f10066b     // Catch:{ all -> 0x059a }
            n4.i r3 = r3.f10284c     // Catch:{ all -> 0x059a }
            H(r3)     // Catch:{ all -> 0x059a }
            java.lang.String r4 = r6.p()     // Catch:{ all -> 0x059a }
            n4.d5 r3 = r3.A(r4)     // Catch:{ all -> 0x059a }
            if (r3 == 0) goto L_0x0804
            n4.n4 r4 = r3.f9674a     // Catch:{ all -> 0x0801 }
            n4.m4 r4 = r4.d()     // Catch:{ all -> 0x0801 }
            r4.g()     // Catch:{ all -> 0x0801 }
            boolean r3 = r3.f9688p     // Catch:{ all -> 0x0801 }
            if (r3 == 0) goto L_0x0804
            n4.n4 r3 = r2.f9600a     // Catch:{ all -> 0x059a }
            n4.l r3 = r3.n()     // Catch:{ all -> 0x059a }
            java.lang.String r4 = "com.google"
            r3.g()     // Catch:{ all -> 0x07fe }
            n4.n4 r8 = r3.f9600a     // Catch:{ all -> 0x07fe }
            y3.a r8 = r8.f9998n     // Catch:{ all -> 0x07fe }
            r8.getClass()     // Catch:{ all -> 0x07fe }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x07fe }
            long r9 = r3.f9904g     // Catch:{ all -> 0x07fe }
            long r8 = r13 - r9
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 <= 0) goto L_0x06e1
            r8 = 0
            r3.f9903f = r8     // Catch:{ all -> 0x07fe }
        L_0x06e1:
            java.lang.Boolean r8 = r3.f9903f     // Catch:{ all -> 0x07fe }
            if (r8 != 0) goto L_0x0768
            n4.n4 r8 = r3.f9600a     // Catch:{ all -> 0x07fe }
            android.content.Context r8 = r8.f9986a     // Catch:{ all -> 0x07fe }
            java.lang.String r9 = "android.permission.GET_ACCOUNTS"
            int r8 = y.a.a(r8, r9)     // Catch:{ all -> 0x07fe }
            if (r8 == 0) goto L_0x06ff
            n4.n4 r4 = r3.f9600a     // Catch:{ all -> 0x07fe }
            n4.i3 r4 = r4.a()     // Catch:{ all -> 0x07fe }
            n4.g3 r4 = r4.f9832j     // Catch:{ all -> 0x07fe }
            java.lang.String r8 = "Permission error checking for dasher/unicorn accounts"
            r4.a(r8)     // Catch:{ all -> 0x07fe }
            goto L_0x0760
        L_0x06ff:
            android.accounts.AccountManager r8 = r3.f9902e     // Catch:{ all -> 0x07fe }
            if (r8 != 0) goto L_0x070d
            n4.n4 r8 = r3.f9600a     // Catch:{ all -> 0x07fe }
            android.content.Context r8 = r8.f9986a     // Catch:{ all -> 0x07fe }
            android.accounts.AccountManager r8 = android.accounts.AccountManager.get(r8)     // Catch:{ all -> 0x07fe }
            r3.f9902e = r8     // Catch:{ all -> 0x07fe }
        L_0x070d:
            android.accounts.AccountManager r8 = r3.f9902e     // Catch:{ AuthenticatorException -> 0x0751, IOException -> 0x074f, OperationCanceledException -> 0x074c }
            java.lang.String r9 = "service_HOSTED"
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch:{ AuthenticatorException -> 0x0751, IOException -> 0x074f, OperationCanceledException -> 0x074c }
            r10 = 0
            android.accounts.AccountManagerFuture r8 = r8.getAccountsByTypeAndFeatures(r4, r9, r10, r10)     // Catch:{ AuthenticatorException -> 0x0751, IOException -> 0x074f, OperationCanceledException -> 0x074c }
            java.lang.Object r8 = r8.getResult()     // Catch:{ AuthenticatorException -> 0x0751, IOException -> 0x074f, OperationCanceledException -> 0x074c }
            android.accounts.Account[] r8 = (android.accounts.Account[]) r8     // Catch:{ AuthenticatorException -> 0x0751, IOException -> 0x074f, OperationCanceledException -> 0x074c }
            if (r8 == 0) goto L_0x072d
            int r8 = r8.length     // Catch:{ AuthenticatorException -> 0x0751, IOException -> 0x074f, OperationCanceledException -> 0x074c }
            if (r8 <= 0) goto L_0x072d
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ AuthenticatorException -> 0x0751, IOException -> 0x074f, OperationCanceledException -> 0x074c }
            r3.f9903f = r4     // Catch:{ AuthenticatorException -> 0x0751, IOException -> 0x074f, OperationCanceledException -> 0x074c }
            r3.f9904g = r13     // Catch:{ AuthenticatorException -> 0x0751, IOException -> 0x074f, OperationCanceledException -> 0x074c }
        L_0x072b:
            r3 = 1
            goto L_0x076c
        L_0x072d:
            android.accounts.AccountManager r8 = r3.f9902e     // Catch:{ AuthenticatorException -> 0x0751, IOException -> 0x074f, OperationCanceledException -> 0x074c }
            java.lang.String r9 = "service_uca"
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch:{ AuthenticatorException -> 0x0751, IOException -> 0x074f, OperationCanceledException -> 0x074c }
            r10 = 0
            android.accounts.AccountManagerFuture r4 = r8.getAccountsByTypeAndFeatures(r4, r9, r10, r10)     // Catch:{ AuthenticatorException -> 0x0751, IOException -> 0x074f, OperationCanceledException -> 0x074c }
            java.lang.Object r4 = r4.getResult()     // Catch:{ AuthenticatorException -> 0x0751, IOException -> 0x074f, OperationCanceledException -> 0x074c }
            android.accounts.Account[] r4 = (android.accounts.Account[]) r4     // Catch:{ AuthenticatorException -> 0x0751, IOException -> 0x074f, OperationCanceledException -> 0x074c }
            if (r4 == 0) goto L_0x0760
            int r4 = r4.length     // Catch:{ AuthenticatorException -> 0x0751, IOException -> 0x074f, OperationCanceledException -> 0x074c }
            if (r4 <= 0) goto L_0x0760
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ AuthenticatorException -> 0x0751, IOException -> 0x074f, OperationCanceledException -> 0x074c }
            r3.f9903f = r4     // Catch:{ AuthenticatorException -> 0x0751, IOException -> 0x074f, OperationCanceledException -> 0x074c }
            r3.f9904g = r13     // Catch:{ AuthenticatorException -> 0x0751, IOException -> 0x074f, OperationCanceledException -> 0x074c }
            goto L_0x072b
        L_0x074c:
            r0 = move-exception
        L_0x074d:
            r4 = r0
            goto L_0x0753
        L_0x074f:
            r0 = move-exception
            goto L_0x074d
        L_0x0751:
            r0 = move-exception
            goto L_0x074d
        L_0x0753:
            n4.n4 r8 = r3.f9600a     // Catch:{ all -> 0x07fe }
            n4.i3 r8 = r8.a()     // Catch:{ all -> 0x07fe }
            n4.g3 r8 = r8.f9829g     // Catch:{ all -> 0x07fe }
            java.lang.String r9 = "Exception checking account types"
            r8.b(r9, r4)     // Catch:{ all -> 0x07fe }
        L_0x0760:
            r3.f9904g = r13     // Catch:{ all -> 0x07fe }
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x07fe }
            r3.f9903f = r4     // Catch:{ all -> 0x07fe }
            r3 = 0
            goto L_0x076c
        L_0x0768:
            boolean r3 = r8.booleanValue()     // Catch:{ all -> 0x07fe }
        L_0x076c:
            if (r3 == 0) goto L_0x0804
            n4.n4 r3 = r2.f9600a     // Catch:{ all -> 0x059a }
            n4.i3 r3 = r3.a()     // Catch:{ all -> 0x059a }
            n4.g3 r3 = r3.k()     // Catch:{ all -> 0x059a }
            java.lang.String r4 = "Turning off ad personalization due to account type"
            r3.a(r4)     // Catch:{ all -> 0x059a }
            j4.b4 r3 = j4.c4.w()     // Catch:{ all -> 0x059a }
            r3.j()     // Catch:{ all -> 0x07fb }
            j4.m7 r4 = r3.f8238b     // Catch:{ all -> 0x07fb }
            j4.c4 r4 = (j4.c4) r4     // Catch:{ all -> 0x07fb }
            r8 = r18
            j4.c4.B(r4, r8)     // Catch:{ all -> 0x07fb }
            n4.n4 r2 = r2.f9600a     // Catch:{ all -> 0x059a }
            n4.l r2 = r2.n()     // Catch:{ all -> 0x059a }
            long r9 = r2.k()     // Catch:{ all -> 0x059a }
            r3.j()     // Catch:{ all -> 0x07f8 }
            j4.m7 r2 = r3.f8238b     // Catch:{ all -> 0x07f8 }
            j4.c4 r2 = (j4.c4) r2     // Catch:{ all -> 0x07f8 }
            j4.c4.A(r2, r9)     // Catch:{ all -> 0x07f8 }
            r3.j()     // Catch:{ all -> 0x07f5 }
            j4.m7 r2 = r3.f8238b     // Catch:{ all -> 0x07f5 }
            j4.c4 r2 = (j4.c4) r2     // Catch:{ all -> 0x07f5 }
            r9 = 1
            j4.c4.E(r2, r9)     // Catch:{ all -> 0x07f5 }
            j4.m7 r2 = r3.h()     // Catch:{ all -> 0x059a }
            j4.c4 r2 = (j4.c4) r2     // Catch:{ all -> 0x059a }
            r3 = 0
        L_0x07b4:
            j4.m7 r4 = r6.f8238b     // Catch:{ all -> 0x07f2 }
            j4.t3 r4 = (j4.t3) r4     // Catch:{ all -> 0x07f2 }
            int r4 = r4.t1()     // Catch:{ all -> 0x07f2 }
            if (r3 >= r4) goto L_0x07e4
            j4.m7 r4 = r6.f8238b     // Catch:{ all -> 0x07e1 }
            j4.t3 r4 = (j4.t3) r4     // Catch:{ all -> 0x07e1 }
            j4.c4 r4 = r4.I1(r3)     // Catch:{ all -> 0x07e1 }
            java.lang.String r4 = r4.y()     // Catch:{ all -> 0x059a }
            boolean r4 = r8.equals(r4)     // Catch:{ all -> 0x059a }
            if (r4 == 0) goto L_0x07de
            r6.j()     // Catch:{ all -> 0x07db }
            j4.m7 r4 = r6.f8238b     // Catch:{ all -> 0x07db }
            j4.t3 r4 = (j4.t3) r4     // Catch:{ all -> 0x07db }
            j4.t3.B0(r4, r3, r2)     // Catch:{ all -> 0x07db }
            goto L_0x0804
        L_0x07db:
            r0 = move-exception
            goto L_0x059b
        L_0x07de:
            int r3 = r3 + 1
            goto L_0x07b4
        L_0x07e1:
            r0 = move-exception
            goto L_0x059b
        L_0x07e4:
            r6.j()     // Catch:{ all -> 0x07ef }
            j4.m7 r3 = r6.f8238b     // Catch:{ all -> 0x07ef }
            j4.t3 r3 = (j4.t3) r3     // Catch:{ all -> 0x07ef }
            j4.t3.C0(r3, r2)     // Catch:{ all -> 0x07ef }
            goto L_0x0804
        L_0x07ef:
            r0 = move-exception
            goto L_0x059b
        L_0x07f2:
            r0 = move-exception
            goto L_0x059b
        L_0x07f5:
            r0 = move-exception
            goto L_0x059b
        L_0x07f8:
            r0 = move-exception
            goto L_0x059b
        L_0x07fb:
            r0 = move-exception
            goto L_0x059b
        L_0x07fe:
            r0 = move-exception
            goto L_0x059b
        L_0x0801:
            r0 = move-exception
            goto L_0x059b
        L_0x0804:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6.j()     // Catch:{ all -> 0x1c5e }
            j4.m7 r4 = r6.f8238b     // Catch:{ all -> 0x1c39 }
            j4.t3 r4 = (j4.t3) r4     // Catch:{ all -> 0x1c39 }
            j4.t3.F0(r4, r2)     // Catch:{ all -> 0x1c39 }
            r2 = -9223372036854775808
            r6.j()     // Catch:{ all -> 0x1c5e }
            j4.m7 r4 = r6.f8238b     // Catch:{ all -> 0x1c35 }
            j4.t3 r4 = (j4.t3) r4     // Catch:{ all -> 0x1c35 }
            j4.t3.G0(r4, r2)     // Catch:{ all -> 0x1c35 }
            r2 = 0
        L_0x0820:
            j4.m7 r3 = r6.f8238b     // Catch:{ all -> 0x1c5e }
            j4.t3 r3 = (j4.t3) r3     // Catch:{ all -> 0x1c31 }
            int r3 = r3.p1()     // Catch:{ all -> 0x1c31 }
            if (r2 >= r3) goto L_0x0882
            j4.m7 r3 = r6.f8238b     // Catch:{ all -> 0x087f }
            j4.t3 r3 = (j4.t3) r3     // Catch:{ all -> 0x087f }
            j4.k3 r3 = r3.F1(r2)     // Catch:{ all -> 0x087f }
            long r8 = r3.w()     // Catch:{ all -> 0x059a }
            j4.m7 r4 = r6.f8238b     // Catch:{ all -> 0x087c }
            j4.t3 r4 = (j4.t3) r4     // Catch:{ all -> 0x087c }
            long r13 = r4.B1()     // Catch:{ all -> 0x087c }
            int r4 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x0854
            long r8 = r3.w()     // Catch:{ all -> 0x059a }
            r6.j()     // Catch:{ all -> 0x0851 }
            j4.m7 r4 = r6.f8238b     // Catch:{ all -> 0x0851 }
            j4.t3 r4 = (j4.t3) r4     // Catch:{ all -> 0x0851 }
            j4.t3.F0(r4, r8)     // Catch:{ all -> 0x0851 }
            goto L_0x0854
        L_0x0851:
            r0 = move-exception
            goto L_0x059b
        L_0x0854:
            long r8 = r3.w()     // Catch:{ all -> 0x059a }
            j4.m7 r4 = r6.f8238b     // Catch:{ all -> 0x0879 }
            j4.t3 r4 = (j4.t3) r4     // Catch:{ all -> 0x0879 }
            long r13 = r4.x1()     // Catch:{ all -> 0x0879 }
            int r4 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x0876
            long r3 = r3.w()     // Catch:{ all -> 0x059a }
            r6.j()     // Catch:{ all -> 0x0873 }
            j4.m7 r8 = r6.f8238b     // Catch:{ all -> 0x0873 }
            j4.t3 r8 = (j4.t3) r8     // Catch:{ all -> 0x0873 }
            j4.t3.G0(r8, r3)     // Catch:{ all -> 0x0873 }
            goto L_0x0876
        L_0x0873:
            r0 = move-exception
            goto L_0x059b
        L_0x0876:
            int r2 = r2 + 1
            goto L_0x0820
        L_0x0879:
            r0 = move-exception
            goto L_0x059b
        L_0x087c:
            r0 = move-exception
            goto L_0x059b
        L_0x087f:
            r0 = move-exception
            goto L_0x059b
        L_0x0882:
            r6.D()     // Catch:{ all -> 0x1c5e }
            r6.x()     // Catch:{ all -> 0x1c5e }
            n4.b r2 = r1.f10287f     // Catch:{ all -> 0x1c5e }
            H(r2)     // Catch:{ all -> 0x1c5e }
            java.lang.String r3 = r6.p()     // Catch:{ all -> 0x1c5e }
            j4.m7 r4 = r6.f8238b     // Catch:{ all -> 0x1c5e }
            j4.t3 r4 = (j4.t3) r4     // Catch:{ all -> 0x1c2d }
            j4.r7 r4 = r4.H()     // Catch:{ all -> 0x1c2d }
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)     // Catch:{ all -> 0x1c2d }
            j4.m7 r8 = r6.f8238b     // Catch:{ all -> 0x1c5e }
            j4.t3 r8 = (j4.t3) r8     // Catch:{ all -> 0x1c29 }
            j4.r7 r8 = r8.I()     // Catch:{ all -> 0x1c29 }
            java.util.List r8 = java.util.Collections.unmodifiableList(r8)     // Catch:{ all -> 0x1c29 }
            j4.m7 r9 = r6.f8238b     // Catch:{ all -> 0x1c5e }
            j4.t3 r9 = (j4.t3) r9     // Catch:{ all -> 0x1c25 }
            long r9 = r9.B1()     // Catch:{ all -> 0x1c25 }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x1c5e }
            j4.m7 r10 = r6.f8238b     // Catch:{ all -> 0x1c5e }
            j4.t3 r10 = (j4.t3) r10     // Catch:{ all -> 0x1c21 }
            long r13 = r10.x1()     // Catch:{ all -> 0x1c21 }
            java.lang.Long r10 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x1c5e }
            java.lang.String r13 = "current_results"
            r3.o.e(r3)     // Catch:{ all -> 0x1c1d }
            r3.o.h(r4)     // Catch:{ all -> 0x1c1d }
            r3.o.h(r8)     // Catch:{ all -> 0x1c1d }
            r2.f9619d = r3     // Catch:{ all -> 0x1c1d }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x1c1d }
            r3.<init>()     // Catch:{ all -> 0x1c1d }
            r2.f9620e = r3     // Catch:{ all -> 0x1c1d }
            m.b r3 = new m.b     // Catch:{ all -> 0x1c1d }
            r3.<init>()     // Catch:{ all -> 0x1c1d }
            r2.f9621f = r3     // Catch:{ all -> 0x1c1d }
            r2.f9622g = r9     // Catch:{ all -> 0x1c1d }
            r2.f9623h = r10     // Catch:{ all -> 0x1c1d }
            java.util.Iterator r3 = r4.iterator()     // Catch:{ all -> 0x1c1d }
        L_0x08e4:
            boolean r9 = r3.hasNext()     // Catch:{ all -> 0x1c1d }
            if (r9 == 0) goto L_0x08fc
            java.lang.Object r9 = r3.next()     // Catch:{ all -> 0x1c1d }
            j4.k3 r9 = (j4.k3) r9     // Catch:{ all -> 0x1c1d }
            java.lang.String r9 = r9.A()     // Catch:{ all -> 0x1c1d }
            boolean r9 = r7.equals(r9)     // Catch:{ all -> 0x1c1d }
            if (r9 == 0) goto L_0x08e4
            r3 = 1
            goto L_0x08fd
        L_0x08fc:
            r3 = 0
        L_0x08fd:
            j4.va.a()     // Catch:{ all -> 0x1c1d }
            n4.n4 r7 = r2.f9600a     // Catch:{ all -> 0x1c1d }
            n4.f r7 = r7.m()     // Catch:{ all -> 0x1c1d }
            java.lang.String r9 = r2.f9619d     // Catch:{ all -> 0x1c1d }
            n4.v2 r10 = n4.w2.X     // Catch:{ all -> 0x1c1d }
            boolean r7 = r7.o(r9, r10)     // Catch:{ all -> 0x1c1d }
            j4.va.a()     // Catch:{ all -> 0x1c1d }
            n4.n4 r9 = r2.f9600a     // Catch:{ all -> 0x1c1d }
            n4.f r9 = r9.m()     // Catch:{ all -> 0x1c1d }
            java.lang.String r10 = r2.f9619d     // Catch:{ all -> 0x1c1d }
            n4.v2 r14 = n4.w2.W     // Catch:{ all -> 0x1c1d }
            boolean r9 = r9.o(r10, r14)     // Catch:{ all -> 0x1c1d }
            if (r3 == 0) goto L_0x0974
            n4.w7 r10 = r2.f10066b     // Catch:{ all -> 0x1c09 }
            n4.i r10 = r10.K()     // Catch:{ all -> 0x1c09 }
            java.lang.String r14 = r2.f9619d     // Catch:{ all -> 0x1c09 }
            r10.h()     // Catch:{ all -> 0x1c09 }
            r10.g()     // Catch:{ all -> 0x1c09 }
            r3.o.e(r14)     // Catch:{ all -> 0x1c09 }
            android.content.ContentValues r15 = new android.content.ContentValues     // Catch:{ all -> 0x1c09 }
            r15.<init>()     // Catch:{ all -> 0x1c09 }
            r18 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r18)     // Catch:{ all -> 0x1c09 }
            java.lang.String r12 = "current_session_count"
            r15.put(r12, r11)     // Catch:{ all -> 0x1c09 }
            android.database.sqlite.SQLiteDatabase r11 = r10.z()     // Catch:{ SQLiteException -> 0x095a }
            java.lang.String r12 = "events"
            java.lang.String r1 = "app_id = ?"
            r18 = r5
            r36 = r6
            r5 = 1
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0958 }
            r5 = 0
            r6[r5] = r14     // Catch:{ SQLiteException -> 0x0958 }
            r11.update(r12, r15, r1, r6)     // Catch:{ SQLiteException -> 0x0958 }
            goto L_0x0978
        L_0x0958:
            r0 = move-exception
            goto L_0x095f
        L_0x095a:
            r0 = move-exception
            r18 = r5
            r36 = r6
        L_0x095f:
            r1 = r0
            n4.n4 r5 = r10.f9600a     // Catch:{ all -> 0x1c09 }
            n4.i3 r5 = r5.a()     // Catch:{ all -> 0x1c09 }
            n4.g3 r5 = r5.l()     // Catch:{ all -> 0x1c09 }
            n4.h3 r6 = n4.i3.p(r14)     // Catch:{ all -> 0x1c09 }
            java.lang.String r10 = "Error resetting session-scoped event counts. appId"
            r5.c(r10, r6, r1)     // Catch:{ all -> 0x1c09 }
            goto L_0x0978
        L_0x0974:
            r18 = r5
            r36 = r6
        L_0x0978:
            java.util.Map r1 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x1c09 }
            java.lang.String r5 = "Failed to merge filter. appId"
            java.lang.String r6 = "Database error querying filters. appId"
            java.lang.String r10 = "audience_id"
            java.lang.String r11 = "data"
            if (r9 == 0) goto L_0x0a70
            if (r7 == 0) goto L_0x0a70
            n4.w7 r1 = r2.f10066b     // Catch:{ all -> 0x1c09 }
            n4.i r1 = r1.K()     // Catch:{ all -> 0x1c09 }
            java.lang.String r12 = r2.f9619d     // Catch:{ all -> 0x1c09 }
            r3.o.e(r12)     // Catch:{ all -> 0x1c09 }
            m.b r14 = new m.b     // Catch:{ all -> 0x1c09 }
            r14.<init>()     // Catch:{ all -> 0x1c09 }
            android.database.sqlite.SQLiteDatabase r26 = r1.z()     // Catch:{ all -> 0x1c09 }
            java.lang.String r27 = "event_filters"
            java.lang.String[] r28 = new java.lang.String[]{r10, r11}     // Catch:{ SQLiteException -> 0x0a43, all -> 0x0a3f }
            java.lang.String r29 = "app_id=?"
            r37 = r8
            r15 = 1
            java.lang.String[] r8 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0a3b, all -> 0x0a3f }
            r15 = 0
            r8[r15] = r12     // Catch:{ SQLiteException -> 0x0a3b, all -> 0x0a3f }
            r31 = 0
            r32 = 0
            r33 = 0
            r30 = r8
            android.database.Cursor r8 = r26.query(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ SQLiteException -> 0x0a3b, all -> 0x0a3f }
            boolean r15 = r8.moveToFirst()     // Catch:{ SQLiteException -> 0x0a34 }
            if (r15 == 0) goto L_0x0a29
            r38 = r11
        L_0x09c0:
            r15 = 1
            byte[] r11 = r8.getBlob(r15)     // Catch:{ SQLiteException -> 0x0a25 }
            j4.f2 r15 = j4.g2.v()     // Catch:{ IOException -> 0x0a02 }
            j4.i7 r11 = n4.y7.z(r15, r11)     // Catch:{ IOException -> 0x0a02 }
            j4.f2 r11 = (j4.f2) r11     // Catch:{ IOException -> 0x0a02 }
            j4.m7 r11 = r11.h()     // Catch:{ IOException -> 0x0a02 }
            j4.g2 r11 = (j4.g2) r11     // Catch:{ IOException -> 0x0a02 }
            boolean r15 = r11.G()     // Catch:{ SQLiteException -> 0x0a25 }
            if (r15 != 0) goto L_0x09de
            r39 = r4
            goto L_0x0a17
        L_0x09de:
            r15 = 0
            int r26 = r8.getInt(r15)     // Catch:{ SQLiteException -> 0x0a25 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r26)     // Catch:{ SQLiteException -> 0x0a25 }
            java.lang.Object r26 = r14.get(r15)     // Catch:{ SQLiteException -> 0x0a25 }
            java.util.List r26 = (java.util.List) r26     // Catch:{ SQLiteException -> 0x0a25 }
            if (r26 != 0) goto L_0x09fa
            r39 = r4
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0a32 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0a32 }
            r14.put(r15, r4)     // Catch:{ SQLiteException -> 0x0a32 }
            goto L_0x09fe
        L_0x09fa:
            r39 = r4
            r4 = r26
        L_0x09fe:
            r4.add(r11)     // Catch:{ SQLiteException -> 0x0a32 }
            goto L_0x0a17
        L_0x0a02:
            r0 = move-exception
            r39 = r4
            r4 = r0
            n4.n4 r11 = r1.f9600a     // Catch:{ SQLiteException -> 0x0a32 }
            n4.i3 r11 = r11.a()     // Catch:{ SQLiteException -> 0x0a32 }
            n4.g3 r11 = r11.l()     // Catch:{ SQLiteException -> 0x0a32 }
            n4.h3 r15 = n4.i3.p(r12)     // Catch:{ SQLiteException -> 0x0a32 }
            r11.c(r5, r15, r4)     // Catch:{ SQLiteException -> 0x0a32 }
        L_0x0a17:
            boolean r4 = r8.moveToNext()     // Catch:{ SQLiteException -> 0x0a32 }
            if (r4 != 0) goto L_0x0a22
            r8.close()     // Catch:{ all -> 0x1445 }
            goto L_0x0a77
        L_0x0a22:
            r4 = r39
            goto L_0x09c0
        L_0x0a25:
            r0 = move-exception
            r39 = r4
            goto L_0x0a39
        L_0x0a29:
            r39 = r4
            r38 = r11
            java.util.Map r1 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0a32 }
            goto L_0x0a63
        L_0x0a32:
            r0 = move-exception
            goto L_0x0a39
        L_0x0a34:
            r0 = move-exception
            r39 = r4
            r38 = r11
        L_0x0a39:
            r4 = r0
            goto L_0x0a4c
        L_0x0a3b:
            r0 = move-exception
            r39 = r4
            goto L_0x0a48
        L_0x0a3f:
            r0 = move-exception
            r1 = r0
            r9 = 0
            goto L_0x0a6a
        L_0x0a43:
            r0 = move-exception
            r39 = r4
            r37 = r8
        L_0x0a48:
            r38 = r11
            r4 = r0
            r8 = 0
        L_0x0a4c:
            n4.n4 r1 = r1.f9600a     // Catch:{ all -> 0x0a67 }
            n4.i3 r1 = r1.a()     // Catch:{ all -> 0x0a67 }
            n4.g3 r1 = r1.l()     // Catch:{ all -> 0x0a67 }
            n4.h3 r11 = n4.i3.p(r12)     // Catch:{ all -> 0x0a67 }
            r1.c(r6, r11, r4)     // Catch:{ all -> 0x0a67 }
            java.util.Map r1 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0a67 }
            if (r8 == 0) goto L_0x0a76
        L_0x0a63:
            r8.close()     // Catch:{ all -> 0x1c09 }
            goto L_0x0a76
        L_0x0a67:
            r0 = move-exception
            r1 = r0
            r9 = r8
        L_0x0a6a:
            if (r9 == 0) goto L_0x0a6f
            r9.close()     // Catch:{ all -> 0x1c09 }
        L_0x0a6f:
            throw r1     // Catch:{ all -> 0x1c09 }
        L_0x0a70:
            r39 = r4
            r37 = r8
            r38 = r11
        L_0x0a76:
            r14 = r1
        L_0x0a77:
            n4.w7 r1 = r2.f10066b     // Catch:{ all -> 0x1c09 }
            n4.i r1 = r1.K()     // Catch:{ all -> 0x1c09 }
            java.lang.String r4 = r2.f9619d     // Catch:{ all -> 0x1c09 }
            r1.h()     // Catch:{ all -> 0x1c09 }
            r1.g()     // Catch:{ all -> 0x1c09 }
            r3.o.e(r4)     // Catch:{ all -> 0x1c09 }
            android.database.sqlite.SQLiteDatabase r26 = r1.z()     // Catch:{ all -> 0x1c09 }
            java.lang.String r27 = "audience_filter_values"
            java.lang.String[] r28 = new java.lang.String[]{r10, r13}     // Catch:{ SQLiteException -> 0x0b2a, all -> 0x0b23 }
            java.lang.String r29 = "app_id=?"
            r8 = 1
            java.lang.String[] r11 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x0b2a, all -> 0x0b23 }
            r8 = 0
            r11[r8] = r4     // Catch:{ SQLiteException -> 0x0b2a, all -> 0x0b23 }
            r31 = 0
            r32 = 0
            r33 = 0
            r30 = r11
            android.database.Cursor r8 = r26.query(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ SQLiteException -> 0x0b2a, all -> 0x0b23 }
            boolean r11 = r8.moveToFirst()     // Catch:{ SQLiteException -> 0x0b1d }
            if (r11 != 0) goto L_0x0ab9
            java.util.Map r1 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0b1d }
            r8.close()     // Catch:{ all -> 0x1c09 }
            r41 = r6
            r40 = r13
            goto L_0x0b4d
        L_0x0ab9:
            m.b r11 = new m.b     // Catch:{ SQLiteException -> 0x0b1d }
            r11.<init>()     // Catch:{ SQLiteException -> 0x0b1d }
        L_0x0abe:
            r12 = 0
            int r15 = r8.getInt(r12)     // Catch:{ SQLiteException -> 0x0b1d }
            r40 = r13
            r12 = 1
            byte[] r13 = r8.getBlob(r12)     // Catch:{ SQLiteException -> 0x0b19 }
            j4.x3 r12 = j4.y3.x()     // Catch:{ IOException -> 0x0ae6 }
            j4.i7 r12 = n4.y7.z(r12, r13)     // Catch:{ IOException -> 0x0ae6 }
            j4.x3 r12 = (j4.x3) r12     // Catch:{ IOException -> 0x0ae6 }
            j4.m7 r12 = r12.h()     // Catch:{ IOException -> 0x0ae6 }
            j4.y3 r12 = (j4.y3) r12     // Catch:{ IOException -> 0x0ae6 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)     // Catch:{ SQLiteException -> 0x0b19 }
            r11.put(r13, r12)     // Catch:{ SQLiteException -> 0x0b19 }
            r41 = r6
            r26 = r11
            goto L_0x0b03
        L_0x0ae6:
            r0 = move-exception
            r12 = r0
            n4.n4 r13 = r1.f9600a     // Catch:{ SQLiteException -> 0x0b19 }
            n4.i3 r13 = r13.a()     // Catch:{ SQLiteException -> 0x0b19 }
            n4.g3 r13 = r13.l()     // Catch:{ SQLiteException -> 0x0b19 }
            r26 = r11
            java.lang.String r11 = "Failed to merge filter results. appId, audienceId, error"
            r41 = r6
            n4.h3 r6 = n4.i3.p(r4)     // Catch:{ SQLiteException -> 0x0b16 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ SQLiteException -> 0x0b16 }
            r13.d(r11, r6, r15, r12)     // Catch:{ SQLiteException -> 0x0b16 }
        L_0x0b03:
            boolean r6 = r8.moveToNext()     // Catch:{ SQLiteException -> 0x0b16 }
            if (r6 != 0) goto L_0x0b0f
            r8.close()     // Catch:{ all -> 0x1445 }
            r1 = r26
            goto L_0x0b4d
        L_0x0b0f:
            r11 = r26
            r13 = r40
            r6 = r41
            goto L_0x0abe
        L_0x0b16:
            r0 = move-exception
        L_0x0b17:
            r6 = r0
            goto L_0x0b31
        L_0x0b19:
            r0 = move-exception
            r41 = r6
            goto L_0x0b17
        L_0x0b1d:
            r0 = move-exception
            r41 = r6
            r40 = r13
            goto L_0x0b17
        L_0x0b23:
            r0 = move-exception
            r1 = r0
            r9 = 0
            r4 = r80
            goto L_0x1c13
        L_0x0b2a:
            r0 = move-exception
            r41 = r6
            r40 = r13
            r6 = r0
            r8 = 0
        L_0x0b31:
            n4.n4 r1 = r1.f9600a     // Catch:{ all -> 0x1c0e }
            n4.i3 r1 = r1.a()     // Catch:{ all -> 0x1c0e }
            n4.g3 r1 = r1.l()     // Catch:{ all -> 0x1c0e }
            java.lang.String r11 = "Database error querying filter results. appId"
            n4.h3 r4 = n4.i3.p(r4)     // Catch:{ all -> 0x1c0e }
            r1.c(r11, r4, r6)     // Catch:{ all -> 0x1c0e }
            java.util.Map r1 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x1c0e }
            if (r8 == 0) goto L_0x0b4d
            r8.close()     // Catch:{ all -> 0x1c09 }
        L_0x0b4d:
            boolean r4 = r1.isEmpty()     // Catch:{ all -> 0x1c09 }
            r6 = 2
            if (r4 == 0) goto L_0x0b5a
            r42 = r5
        L_0x0b56:
            r45 = r10
            goto L_0x0ee1
        L_0x0b5a:
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x1c09 }
            java.util.Set r8 = r1.keySet()     // Catch:{ all -> 0x1c09 }
            r4.<init>(r8)     // Catch:{ all -> 0x1c09 }
            if (r3 == 0) goto L_0x0d24
            java.lang.String r3 = r2.f9619d     // Catch:{ all -> 0x1c09 }
            n4.w7 r8 = r2.f10066b     // Catch:{ all -> 0x1c09 }
            n4.i r8 = r8.K()     // Catch:{ all -> 0x1c09 }
            java.lang.String r11 = r2.f9619d     // Catch:{ all -> 0x1c09 }
            r8.h()     // Catch:{ all -> 0x1c09 }
            r8.g()     // Catch:{ all -> 0x1c09 }
            r3.o.e(r11)     // Catch:{ all -> 0x1c09 }
            m.b r12 = new m.b     // Catch:{ all -> 0x1c09 }
            r12.<init>()     // Catch:{ all -> 0x1c09 }
            android.database.sqlite.SQLiteDatabase r13 = r8.z()     // Catch:{ all -> 0x1c09 }
            java.lang.String r15 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            r42 = r5
            java.lang.String[] r5 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0bcd, all -> 0x0bd1 }
            r6 = 0
            r5[r6] = r11     // Catch:{ SQLiteException -> 0x0bcd, all -> 0x0bd1 }
            r25 = 1
            r5[r25] = r11     // Catch:{ SQLiteException -> 0x0bcd, all -> 0x0bd1 }
            android.database.Cursor r5 = r13.rawQuery(r15, r5)     // Catch:{ SQLiteException -> 0x0bcd, all -> 0x0bd1 }
            boolean r13 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0bca }
            if (r13 == 0) goto L_0x0bc5
        L_0x0b98:
            int r13 = r5.getInt(r6)     // Catch:{ SQLiteException -> 0x0bca }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)     // Catch:{ SQLiteException -> 0x0bca }
            java.lang.Object r13 = r12.get(r6)     // Catch:{ SQLiteException -> 0x0bca }
            java.util.List r13 = (java.util.List) r13     // Catch:{ SQLiteException -> 0x0bca }
            if (r13 != 0) goto L_0x0bb0
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0bca }
            r13.<init>()     // Catch:{ SQLiteException -> 0x0bca }
            r12.put(r6, r13)     // Catch:{ SQLiteException -> 0x0bca }
        L_0x0bb0:
            r6 = 1
            int r15 = r5.getInt(r6)     // Catch:{ SQLiteException -> 0x0bca }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)     // Catch:{ SQLiteException -> 0x0bca }
            r13.add(r6)     // Catch:{ SQLiteException -> 0x0bca }
            boolean r6 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x0bca }
            if (r6 != 0) goto L_0x0bc3
            goto L_0x0bf4
        L_0x0bc3:
            r6 = 0
            goto L_0x0b98
        L_0x0bc5:
            java.util.Map r12 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0bca }
            goto L_0x0bf4
        L_0x0bca:
            r0 = move-exception
            r6 = r0
            goto L_0x0bdb
        L_0x0bcd:
            r0 = move-exception
            r5 = r0
            r6 = r5
            goto L_0x0bda
        L_0x0bd1:
            r0 = move-exception
            r1 = r0
            r9 = 0
            goto L_0x0d1e
        L_0x0bd6:
            r0 = move-exception
            r42 = r5
            r6 = r0
        L_0x0bda:
            r5 = 0
        L_0x0bdb:
            n4.n4 r8 = r8.f9600a     // Catch:{ all -> 0x0d1b }
            n4.i3 r8 = r8.a()     // Catch:{ all -> 0x0d1b }
            n4.g3 r8 = r8.l()     // Catch:{ all -> 0x0d1b }
            java.lang.String r12 = "Database error querying scoped filters. appId"
            n4.h3 r11 = n4.i3.p(r11)     // Catch:{ all -> 0x0d1b }
            r8.c(r12, r11, r6)     // Catch:{ all -> 0x0d1b }
            java.util.Map r12 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0d1b }
            if (r5 == 0) goto L_0x0bf7
        L_0x0bf4:
            r5.close()     // Catch:{ all -> 0x1445 }
        L_0x0bf7:
            r3.o.e(r3)     // Catch:{ all -> 0x1445 }
            m.b r3 = new m.b     // Catch:{ all -> 0x1445 }
            r3.<init>()     // Catch:{ all -> 0x1445 }
            boolean r5 = r1.isEmpty()     // Catch:{ all -> 0x1445 }
            if (r5 == 0) goto L_0x0c07
            goto L_0x0d27
        L_0x0c07:
            java.util.Set r5 = r1.keySet()     // Catch:{ all -> 0x1445 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x1445 }
        L_0x0c0f:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x1445 }
            if (r6 == 0) goto L_0x0d27
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x1445 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x1445 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x1445 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x1445 }
            java.lang.Object r11 = r1.get(r8)     // Catch:{ all -> 0x1445 }
            j4.y3 r11 = (j4.y3) r11     // Catch:{ all -> 0x1445 }
            java.lang.Object r13 = r12.get(r8)     // Catch:{ all -> 0x1445 }
            java.util.List r13 = (java.util.List) r13     // Catch:{ all -> 0x1445 }
            if (r13 == 0) goto L_0x0d0e
            boolean r15 = r13.isEmpty()     // Catch:{ all -> 0x1445 }
            if (r15 == 0) goto L_0x0c39
            goto L_0x0d0e
        L_0x0c39:
            n4.w7 r8 = r2.f10066b     // Catch:{ all -> 0x1445 }
            n4.y7 r8 = r8.O()     // Catch:{ all -> 0x1445 }
            java.util.List r15 = r11.B()     // Catch:{ all -> 0x1445 }
            j4.q7 r15 = (j4.q7) r15     // Catch:{ all -> 0x1445 }
            java.util.List r8 = r8.C(r15, r13)     // Catch:{ all -> 0x1445 }
            boolean r15 = r8.isEmpty()     // Catch:{ all -> 0x1445 }
            if (r15 != 0) goto L_0x0d09
            j4.i7 r15 = r11.j()     // Catch:{ all -> 0x1445 }
            j4.x3 r15 = (j4.x3) r15     // Catch:{ all -> 0x1445 }
            r15.l()     // Catch:{ all -> 0x1445 }
            r15.j()     // Catch:{ all -> 0x1445 }
            r26 = r5
            j4.m7 r5 = r15.f8238b     // Catch:{ all -> 0x1445 }
            j4.y3 r5 = (j4.y3) r5     // Catch:{ all -> 0x1445 }
            j4.y3.G(r5, r8)     // Catch:{ all -> 0x1445 }
            n4.w7 r5 = r2.f10066b     // Catch:{ all -> 0x1445 }
            n4.y7 r5 = r5.O()     // Catch:{ all -> 0x1445 }
            j4.q7 r8 = r11.D()     // Catch:{ all -> 0x1445 }
            java.util.List r5 = r5.C(r8, r13)     // Catch:{ all -> 0x1445 }
            r15.n()     // Catch:{ all -> 0x1445 }
            r15.j()     // Catch:{ all -> 0x1445 }
            j4.m7 r8 = r15.f8238b     // Catch:{ all -> 0x1445 }
            j4.y3 r8 = (j4.y3) r8     // Catch:{ all -> 0x1445 }
            j4.y3.E(r8, r5)     // Catch:{ all -> 0x1445 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x1445 }
            r5.<init>()     // Catch:{ all -> 0x1445 }
            j4.r7 r8 = r11.A()     // Catch:{ all -> 0x1445 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x1445 }
        L_0x0c8c:
            boolean r27 = r8.hasNext()     // Catch:{ all -> 0x1445 }
            if (r27 == 0) goto L_0x0cb4
            java.lang.Object r27 = r8.next()     // Catch:{ all -> 0x1445 }
            r28 = r8
            r8 = r27
            j4.i3 r8 = (j4.i3) r8     // Catch:{ all -> 0x1445 }
            int r27 = r8.t()     // Catch:{ all -> 0x1445 }
            r29 = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r27)     // Catch:{ all -> 0x1445 }
            boolean r12 = r13.contains(r12)     // Catch:{ all -> 0x1445 }
            if (r12 != 0) goto L_0x0caf
            r5.add(r8)     // Catch:{ all -> 0x1445 }
        L_0x0caf:
            r8 = r28
            r12 = r29
            goto L_0x0c8c
        L_0x0cb4:
            r29 = r12
            r15.k()     // Catch:{ all -> 0x1445 }
            r15.j()     // Catch:{ all -> 0x1445 }
            j4.m7 r8 = r15.f8238b     // Catch:{ all -> 0x1445 }
            j4.y3 r8 = (j4.y3) r8     // Catch:{ all -> 0x1445 }
            j4.y3.I(r8, r5)     // Catch:{ all -> 0x1445 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x1445 }
            r5.<init>()     // Catch:{ all -> 0x1445 }
            j4.r7 r8 = r11.C()     // Catch:{ all -> 0x1445 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x1445 }
        L_0x0cd0:
            boolean r11 = r8.hasNext()     // Catch:{ all -> 0x1445 }
            if (r11 == 0) goto L_0x0cee
            java.lang.Object r11 = r8.next()     // Catch:{ all -> 0x1445 }
            j4.a4 r11 = (j4.a4) r11     // Catch:{ all -> 0x1445 }
            int r12 = r11.u()     // Catch:{ all -> 0x1445 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x1445 }
            boolean r12 = r13.contains(r12)     // Catch:{ all -> 0x1445 }
            if (r12 != 0) goto L_0x0cd0
            r5.add(r11)     // Catch:{ all -> 0x1445 }
            goto L_0x0cd0
        L_0x0cee:
            r15.m()     // Catch:{ all -> 0x1445 }
            r15.j()     // Catch:{ all -> 0x1445 }
            j4.m7 r8 = r15.f8238b     // Catch:{ all -> 0x1445 }
            j4.y3 r8 = (j4.y3) r8     // Catch:{ all -> 0x1445 }
            j4.y3.K(r8, r5)     // Catch:{ all -> 0x1445 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x1445 }
            j4.m7 r6 = r15.h()     // Catch:{ all -> 0x1445 }
            j4.y3 r6 = (j4.y3) r6     // Catch:{ all -> 0x1445 }
            r3.put(r5, r6)     // Catch:{ all -> 0x1445 }
            goto L_0x0d15
        L_0x0d09:
            r26 = r5
            r29 = r12
            goto L_0x0d15
        L_0x0d0e:
            r26 = r5
            r29 = r12
            r3.put(r8, r11)     // Catch:{ all -> 0x1445 }
        L_0x0d15:
            r5 = r26
            r12 = r29
            goto L_0x0c0f
        L_0x0d1b:
            r0 = move-exception
            r1 = r0
            r9 = r5
        L_0x0d1e:
            if (r9 == 0) goto L_0x0d23
            r9.close()     // Catch:{ all -> 0x1c09 }
        L_0x0d23:
            throw r1     // Catch:{ all -> 0x1c09 }
        L_0x0d24:
            r42 = r5
            r3 = r1
        L_0x0d27:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x1c09 }
        L_0x0d2b:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x1c09 }
            if (r5 == 0) goto L_0x0b56
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x1c09 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x1c09 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x1c09 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x1c09 }
            java.lang.Object r6 = r3.get(r6)     // Catch:{ all -> 0x1c09 }
            j4.y3 r6 = (j4.y3) r6     // Catch:{ all -> 0x1c09 }
            java.util.BitSet r8 = new java.util.BitSet     // Catch:{ all -> 0x1c09 }
            r8.<init>()     // Catch:{ all -> 0x1c09 }
            java.util.BitSet r11 = new java.util.BitSet     // Catch:{ all -> 0x1c09 }
            r11.<init>()     // Catch:{ all -> 0x1c09 }
            m.b r12 = new m.b     // Catch:{ all -> 0x1c09 }
            r12.<init>()     // Catch:{ all -> 0x1c09 }
            if (r6 == 0) goto L_0x0d97
            int r13 = r6.t()     // Catch:{ all -> 0x1c09 }
            if (r13 != 0) goto L_0x0d5d
            goto L_0x0d97
        L_0x0d5d:
            j4.r7 r13 = r6.A()     // Catch:{ all -> 0x1c09 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x1c09 }
        L_0x0d65:
            boolean r15 = r13.hasNext()     // Catch:{ all -> 0x1445 }
            if (r15 == 0) goto L_0x0d97
            java.lang.Object r15 = r13.next()     // Catch:{ all -> 0x1445 }
            j4.i3 r15 = (j4.i3) r15     // Catch:{ all -> 0x1445 }
            boolean r26 = r15.A()     // Catch:{ all -> 0x1445 }
            if (r26 == 0) goto L_0x0d65
            int r26 = r15.t()     // Catch:{ all -> 0x1445 }
            r43 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r26)     // Catch:{ all -> 0x1445 }
            boolean r26 = r15.z()     // Catch:{ all -> 0x1445 }
            if (r26 == 0) goto L_0x0d90
            long r26 = r15.u()     // Catch:{ all -> 0x1445 }
            java.lang.Long r15 = java.lang.Long.valueOf(r26)     // Catch:{ all -> 0x1445 }
            goto L_0x0d91
        L_0x0d90:
            r15 = 0
        L_0x0d91:
            r12.put(r3, r15)     // Catch:{ all -> 0x1445 }
            r3 = r43
            goto L_0x0d65
        L_0x0d97:
            r43 = r3
            m.b r3 = new m.b     // Catch:{ all -> 0x1c09 }
            r3.<init>()     // Catch:{ all -> 0x1c09 }
            if (r6 == 0) goto L_0x0dee
            int r13 = r6.v()     // Catch:{ all -> 0x1c09 }
            if (r13 != 0) goto L_0x0da7
            goto L_0x0dee
        L_0x0da7:
            j4.r7 r13 = r6.C()     // Catch:{ all -> 0x1445 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x1445 }
        L_0x0daf:
            boolean r15 = r13.hasNext()     // Catch:{ all -> 0x1445 }
            if (r15 == 0) goto L_0x0dee
            java.lang.Object r15 = r13.next()     // Catch:{ all -> 0x1445 }
            j4.a4 r15 = (j4.a4) r15     // Catch:{ all -> 0x1445 }
            boolean r26 = r15.B()     // Catch:{ all -> 0x1445 }
            if (r26 == 0) goto L_0x0deb
            int r26 = r15.t()     // Catch:{ all -> 0x1445 }
            if (r26 <= 0) goto L_0x0deb
            int r26 = r15.u()     // Catch:{ all -> 0x1445 }
            r44 = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r26)     // Catch:{ all -> 0x1445 }
            int r26 = r15.t()     // Catch:{ all -> 0x1445 }
            r27 = r13
            r16 = -1
            int r13 = r26 + -1
            long r28 = r15.v(r13)     // Catch:{ all -> 0x1445 }
            java.lang.Long r13 = java.lang.Long.valueOf(r28)     // Catch:{ all -> 0x1445 }
            r3.put(r4, r13)     // Catch:{ all -> 0x1445 }
            r13 = r27
            r4 = r44
            goto L_0x0daf
        L_0x0deb:
            r16 = -1
            goto L_0x0daf
        L_0x0dee:
            r44 = r4
            r16 = -1
            if (r6 == 0) goto L_0x0e47
            r4 = 0
        L_0x0df5:
            int r13 = r6.w()     // Catch:{ all -> 0x1445 }
            int r13 = r13 * 64
            if (r4 >= r13) goto L_0x0e47
            j4.q7 r13 = r6.D()     // Catch:{ all -> 0x1445 }
            boolean r13 = n4.y7.G(r13, r4)     // Catch:{ all -> 0x1445 }
            if (r13 == 0) goto L_0x0e35
            n4.n4 r13 = r2.f9600a     // Catch:{ all -> 0x1445 }
            n4.i3 r13 = r13.a()     // Catch:{ all -> 0x1445 }
            n4.g3 r13 = r13.m()     // Catch:{ all -> 0x1445 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x1445 }
            r45 = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x1445 }
            r33 = r3
            java.lang.String r3 = "Filter already evaluated. audience ID, filter ID"
            r13.c(r3, r15, r10)     // Catch:{ all -> 0x1445 }
            r11.set(r4)     // Catch:{ all -> 0x1445 }
            java.util.List r3 = r6.B()     // Catch:{ all -> 0x1445 }
            j4.q7 r3 = (j4.q7) r3     // Catch:{ all -> 0x1445 }
            boolean r3 = n4.y7.G(r3, r4)     // Catch:{ all -> 0x1445 }
            if (r3 == 0) goto L_0x0e39
            r8.set(r4)     // Catch:{ all -> 0x1445 }
            goto L_0x0e40
        L_0x0e35:
            r33 = r3
            r45 = r10
        L_0x0e39:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x1445 }
            r12.remove(r3)     // Catch:{ all -> 0x1445 }
        L_0x0e40:
            int r4 = r4 + 1
            r3 = r33
            r10 = r45
            goto L_0x0df5
        L_0x0e47:
            r33 = r3
            r45 = r10
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x1445 }
            java.lang.Object r4 = r1.get(r3)     // Catch:{ all -> 0x1445 }
            r29 = r4
            j4.y3 r29 = (j4.y3) r29     // Catch:{ all -> 0x1445 }
            if (r9 == 0) goto L_0x0eb9
            if (r7 == 0) goto L_0x0eb9
            java.lang.Object r3 = r14.get(r3)     // Catch:{ all -> 0x1445 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x1445 }
            if (r3 == 0) goto L_0x0eb9
            java.lang.Long r4 = r2.f9623h     // Catch:{ all -> 0x1445 }
            if (r4 == 0) goto L_0x0eb9
            java.lang.Long r4 = r2.f9622g     // Catch:{ all -> 0x1445 }
            if (r4 != 0) goto L_0x0e6c
            goto L_0x0eb9
        L_0x0e6c:
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x1445 }
        L_0x0e70:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x1445 }
            if (r4 == 0) goto L_0x0eb9
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x1445 }
            j4.g2 r4 = (j4.g2) r4     // Catch:{ all -> 0x1445 }
            int r6 = r4.u()     // Catch:{ all -> 0x1445 }
            java.lang.Long r10 = r2.f9623h     // Catch:{ all -> 0x1445 }
            long r26 = r10.longValue()     // Catch:{ all -> 0x1445 }
            long r26 = r26 / r19
            boolean r4 = r4.E()     // Catch:{ all -> 0x1445 }
            if (r4 == 0) goto L_0x0e96
            java.lang.Long r4 = r2.f9622g     // Catch:{ all -> 0x1445 }
            long r26 = r4.longValue()     // Catch:{ all -> 0x1445 }
            long r26 = r26 / r19
        L_0x0e96:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x1445 }
            boolean r6 = r12.containsKey(r4)     // Catch:{ all -> 0x1445 }
            if (r6 == 0) goto L_0x0ea7
            java.lang.Long r6 = java.lang.Long.valueOf(r26)     // Catch:{ all -> 0x1445 }
            r12.put(r4, r6)     // Catch:{ all -> 0x1445 }
        L_0x0ea7:
            r6 = r33
            boolean r10 = r6.containsKey(r4)     // Catch:{ all -> 0x1445 }
            if (r10 == 0) goto L_0x0eb6
            java.lang.Long r10 = java.lang.Long.valueOf(r26)     // Catch:{ all -> 0x1445 }
            r6.put(r4, r10)     // Catch:{ all -> 0x1445 }
        L_0x0eb6:
            r33 = r6
            goto L_0x0e70
        L_0x0eb9:
            r6 = r33
            n4.j8 r3 = new n4.j8     // Catch:{ all -> 0x1445 }
            java.lang.String r4 = r2.f9619d     // Catch:{ all -> 0x1445 }
            r26 = r3
            r27 = r2
            r28 = r4
            r30 = r8
            r31 = r11
            r32 = r12
            r33 = r6
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x1445 }
            m.b r4 = r2.f9621f     // Catch:{ all -> 0x1445 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x1445 }
            r4.put(r5, r3)     // Catch:{ all -> 0x1445 }
            r3 = r43
            r4 = r44
            r10 = r45
            goto L_0x0d2b
        L_0x0ee1:
            boolean r1 = r39.isEmpty()     // Catch:{ all -> 0x1c09 }
            java.lang.String r3 = "Skipping failed audience ID"
            if (r1 == 0) goto L_0x0ef3
        L_0x0ee9:
            r33 = r3
            r5 = r38
            r6 = r41
            r3 = r45
            goto L_0x11d8
        L_0x0ef3:
            n4.k8 r1 = new n4.k8     // Catch:{ all -> 0x1c09 }
            r1.<init>(r2)     // Catch:{ all -> 0x1c09 }
            m.b r4 = new m.b     // Catch:{ all -> 0x1c09 }
            r4.<init>()     // Catch:{ all -> 0x1c09 }
            java.util.Iterator r5 = r39.iterator()     // Catch:{ all -> 0x1c09 }
        L_0x0f01:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x1c09 }
            if (r6 == 0) goto L_0x0ee9
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x1c09 }
            j4.k3 r6 = (j4.k3) r6     // Catch:{ all -> 0x1c09 }
            java.lang.String r7 = r2.f9619d     // Catch:{ all -> 0x1c09 }
            j4.k3 r7 = r1.a(r6, r7)     // Catch:{ all -> 0x1c09 }
            if (r7 == 0) goto L_0x0f01
            n4.w7 r8 = r2.f10066b     // Catch:{ all -> 0x1c09 }
            n4.i r8 = r8.K()     // Catch:{ all -> 0x1c09 }
            java.lang.String r9 = r2.f9619d     // Catch:{ all -> 0x1c09 }
            java.lang.String r10 = r7.A()     // Catch:{ all -> 0x1c09 }
            java.lang.String r11 = r6.A()     // Catch:{ all -> 0x1c09 }
            n4.n r11 = r8.E(r9, r11)     // Catch:{ all -> 0x1c09 }
            if (r11 != 0) goto L_0x0f6e
            n4.n4 r11 = r8.f9600a     // Catch:{ all -> 0x1445 }
            n4.i3 r11 = r11.a()     // Catch:{ all -> 0x1445 }
            n4.g3 r11 = r11.n()     // Catch:{ all -> 0x1445 }
            n4.h3 r12 = n4.i3.p(r9)     // Catch:{ all -> 0x1445 }
            n4.n4 r8 = r8.f9600a     // Catch:{ all -> 0x1445 }
            n4.d3 r8 = r8.q()     // Catch:{ all -> 0x1445 }
            java.lang.String r8 = r8.d(r10)     // Catch:{ all -> 0x1445 }
            java.lang.String r10 = "Event aggregate wasn't created during raw event logging. appId, event"
            r11.c(r10, r12, r8)     // Catch:{ all -> 0x1445 }
            n4.n r8 = new n4.n     // Catch:{ all -> 0x1445 }
            java.lang.String r48 = r6.A()     // Catch:{ all -> 0x1445 }
            r49 = 1
            r51 = 1
            r53 = 1
            long r55 = r6.w()     // Catch:{ all -> 0x1445 }
            r57 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r46 = r8
            r47 = r9
            r46.<init>(r47, r48, r49, r51, r53, r55, r57, r59, r60, r61, r62)     // Catch:{ all -> 0x1445 }
            r16 = r1
            r19 = r5
            goto L_0x0fa7
        L_0x0f6e:
            n4.n r8 = new n4.n     // Catch:{ all -> 0x1445 }
            java.lang.String r6 = r11.f9973a     // Catch:{ all -> 0x1445 }
            java.lang.String r9 = r11.f9974b     // Catch:{ all -> 0x1445 }
            long r12 = r11.f9975c     // Catch:{ all -> 0x1445 }
            r14 = 1
            long r66 = r12 + r14
            long r12 = r11.f9976d     // Catch:{ all -> 0x1445 }
            long r68 = r12 + r14
            long r12 = r11.f9977e     // Catch:{ all -> 0x1445 }
            long r70 = r12 + r14
            long r12 = r11.f9978f     // Catch:{ all -> 0x1445 }
            long r14 = r11.f9979g     // Catch:{ all -> 0x1445 }
            java.lang.Long r10 = r11.f9980h     // Catch:{ all -> 0x1445 }
            r16 = r1
            java.lang.Long r1 = r11.f9981i     // Catch:{ all -> 0x1445 }
            r19 = r5
            java.lang.Long r5 = r11.f9982j     // Catch:{ all -> 0x1445 }
            java.lang.Boolean r11 = r11.k     // Catch:{ all -> 0x1445 }
            r63 = r8
            r64 = r6
            r65 = r9
            r72 = r12
            r74 = r14
            r76 = r10
            r77 = r1
            r78 = r5
            r79 = r11
            r63.<init>(r64, r65, r66, r68, r70, r72, r74, r76, r77, r78, r79)     // Catch:{ all -> 0x1445 }
        L_0x0fa7:
            r1 = r8
            n4.w7 r5 = r2.f10066b     // Catch:{ all -> 0x1445 }
            n4.i r5 = r5.K()     // Catch:{ all -> 0x1445 }
            r5.n(r1)     // Catch:{ all -> 0x1445 }
            long r5 = r1.f9975c     // Catch:{ all -> 0x1445 }
            java.lang.String r8 = r7.A()     // Catch:{ all -> 0x1445 }
            java.lang.Object r9 = r4.get(r8)     // Catch:{ all -> 0x1445 }
            java.util.Map r9 = (java.util.Map) r9     // Catch:{ all -> 0x1445 }
            if (r9 != 0) goto L_0x10e1
            n4.w7 r9 = r2.f10066b     // Catch:{ all -> 0x1445 }
            n4.i r9 = r9.K()     // Catch:{ all -> 0x1445 }
            java.lang.String r10 = r2.f9619d     // Catch:{ all -> 0x1445 }
            r9.h()     // Catch:{ all -> 0x1445 }
            r9.g()     // Catch:{ all -> 0x1445 }
            r3.o.e(r10)     // Catch:{ all -> 0x1445 }
            r3.o.e(r8)     // Catch:{ all -> 0x1445 }
            m.b r11 = new m.b     // Catch:{ all -> 0x1445 }
            r11.<init>()     // Catch:{ all -> 0x1445 }
            android.database.sqlite.SQLiteDatabase r26 = r9.z()     // Catch:{ all -> 0x1445 }
            java.lang.String r27 = "event_filters"
            r14 = r38
            r15 = r45
            java.lang.String[] r28 = new java.lang.String[]{r15, r14}     // Catch:{ SQLiteException -> 0x10a4, all -> 0x10af }
            java.lang.String r29 = "app_id=? AND event_name=?"
            r12 = 2
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x10a4, all -> 0x10af }
            r12 = 0
            r13[r12] = r10     // Catch:{ SQLiteException -> 0x10a4, all -> 0x10af }
            r12 = 1
            r13[r12] = r8     // Catch:{ SQLiteException -> 0x10a4, all -> 0x10af }
            r31 = 0
            r32 = 0
            r33 = 0
            r30 = r13
            android.database.Cursor r12 = r26.query(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ SQLiteException -> 0x10a4, all -> 0x10af }
            boolean r13 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x109c }
            if (r13 == 0) goto L_0x108b
        L_0x1003:
            r38 = r14
            r13 = 1
            byte[] r14 = r12.getBlob(r13)     // Catch:{ SQLiteException -> 0x1082 }
            j4.f2 r13 = j4.g2.v()     // Catch:{ IOException -> 0x104e }
            j4.i7 r13 = n4.y7.z(r13, r14)     // Catch:{ IOException -> 0x104e }
            j4.f2 r13 = (j4.f2) r13     // Catch:{ IOException -> 0x104e }
            j4.m7 r13 = r13.h()     // Catch:{ IOException -> 0x104e }
            j4.g2 r13 = (j4.g2) r13     // Catch:{ IOException -> 0x104e }
            r14 = 0
            int r20 = r12.getInt(r14)     // Catch:{ SQLiteException -> 0x1044 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r20)     // Catch:{ SQLiteException -> 0x1044 }
            java.lang.Object r20 = r11.get(r14)     // Catch:{ SQLiteException -> 0x1044 }
            java.util.List r20 = (java.util.List) r20     // Catch:{ SQLiteException -> 0x1044 }
            if (r20 != 0) goto L_0x1038
            r45 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x1036 }
            r15.<init>()     // Catch:{ SQLiteException -> 0x1036 }
            r11.put(r14, r15)     // Catch:{ SQLiteException -> 0x1036 }
            goto L_0x103c
        L_0x1036:
            r0 = move-exception
            goto L_0x1047
        L_0x1038:
            r45 = r15
            r15 = r20
        L_0x103c:
            r15.add(r13)     // Catch:{ SQLiteException -> 0x1036 }
            r20 = r1
            r1 = r42
            goto L_0x1067
        L_0x1044:
            r0 = move-exception
            r45 = r15
        L_0x1047:
            r11 = r0
            r20 = r1
            r1 = r42
            goto L_0x10b8
        L_0x104e:
            r0 = move-exception
            r45 = r15
            r13 = r0
            n4.n4 r14 = r9.f9600a     // Catch:{ SQLiteException -> 0x107e }
            n4.i3 r14 = r14.a()     // Catch:{ SQLiteException -> 0x107e }
            n4.g3 r14 = r14.l()     // Catch:{ SQLiteException -> 0x107e }
            n4.h3 r15 = n4.i3.p(r10)     // Catch:{ SQLiteException -> 0x107e }
            r20 = r1
            r1 = r42
            r14.c(r1, r15, r13)     // Catch:{ SQLiteException -> 0x109a }
        L_0x1067:
            boolean r13 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x109a }
            if (r13 != 0) goto L_0x1075
            r12.close()     // Catch:{ all -> 0x1445 }
            r9 = r11
            r15 = r41
            goto L_0x10d4
        L_0x1075:
            r42 = r1
            r1 = r20
            r14 = r38
            r15 = r45
            goto L_0x1003
        L_0x107e:
            r0 = move-exception
            r20 = r1
            goto L_0x1087
        L_0x1082:
            r0 = move-exception
            r20 = r1
            r45 = r15
        L_0x1087:
            r1 = r42
        L_0x1089:
            r11 = r0
            goto L_0x10b8
        L_0x108b:
            r20 = r1
            r38 = r14
            r45 = r15
            r1 = r42
            java.util.Map r9 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x109a }
            r15 = r41
            goto L_0x10d1
        L_0x109a:
            r0 = move-exception
            goto L_0x1089
        L_0x109c:
            r0 = move-exception
            r20 = r1
            r38 = r14
            r45 = r15
            goto L_0x1087
        L_0x10a4:
            r0 = move-exception
            r20 = r1
            r38 = r14
            r45 = r15
        L_0x10ab:
            r1 = r42
            r11 = r0
            goto L_0x10b7
        L_0x10af:
            r0 = move-exception
            r1 = r0
            r9 = 0
            goto L_0x10db
        L_0x10b3:
            r0 = move-exception
            r20 = r1
            goto L_0x10ab
        L_0x10b7:
            r12 = 0
        L_0x10b8:
            n4.n4 r9 = r9.f9600a     // Catch:{ all -> 0x10d8 }
            n4.i3 r9 = r9.a()     // Catch:{ all -> 0x10d8 }
            n4.g3 r9 = r9.l()     // Catch:{ all -> 0x10d8 }
            n4.h3 r10 = n4.i3.p(r10)     // Catch:{ all -> 0x10d8 }
            r15 = r41
            r9.c(r15, r10, r11)     // Catch:{ all -> 0x10d8 }
            java.util.Map r9 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x10d8 }
            if (r12 == 0) goto L_0x10d4
        L_0x10d1:
            r12.close()     // Catch:{ all -> 0x1445 }
        L_0x10d4:
            r4.put(r8, r9)     // Catch:{ all -> 0x1445 }
            goto L_0x10e7
        L_0x10d8:
            r0 = move-exception
            r1 = r0
            r9 = r12
        L_0x10db:
            if (r9 == 0) goto L_0x10e0
            r9.close()     // Catch:{ all -> 0x1445 }
        L_0x10e0:
            throw r1     // Catch:{ all -> 0x1445 }
        L_0x10e1:
            r20 = r1
            r15 = r41
            r1 = r42
        L_0x10e7:
            r14 = r9
            java.util.Set r8 = r14.keySet()     // Catch:{ all -> 0x1445 }
            java.util.Iterator r26 = r8.iterator()     // Catch:{ all -> 0x1445 }
        L_0x10f0:
            boolean r8 = r26.hasNext()     // Catch:{ all -> 0x1445 }
            if (r8 == 0) goto L_0x11ce
            java.lang.Object r8 = r26.next()     // Catch:{ all -> 0x1445 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x1445 }
            int r12 = r8.intValue()     // Catch:{ all -> 0x1445 }
            java.util.HashSet r8 = r2.f9620e     // Catch:{ all -> 0x1445 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x1445 }
            boolean r8 = r8.contains(r9)     // Catch:{ all -> 0x1445 }
            if (r8 == 0) goto L_0x111a
            n4.n4 r8 = r2.f9600a     // Catch:{ all -> 0x1445 }
            n4.i3 r8 = r8.a()     // Catch:{ all -> 0x1445 }
            n4.g3 r8 = r8.m()     // Catch:{ all -> 0x1445 }
            r8.b(r3, r9)     // Catch:{ all -> 0x1445 }
            goto L_0x10f0
        L_0x111a:
            java.lang.Object r8 = r14.get(r9)     // Catch:{ all -> 0x1445 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x1445 }
            java.util.Iterator r27 = r8.iterator()     // Catch:{ all -> 0x1445 }
            r8 = 1
        L_0x1125:
            boolean r9 = r27.hasNext()     // Catch:{ all -> 0x1445 }
            if (r9 == 0) goto L_0x119e
            java.lang.Object r8 = r27.next()     // Catch:{ all -> 0x1445 }
            j4.g2 r8 = (j4.g2) r8     // Catch:{ all -> 0x1445 }
            n4.l8 r13 = new n4.l8     // Catch:{ all -> 0x1445 }
            java.lang.String r9 = r2.f9619d     // Catch:{ all -> 0x1445 }
            r13.<init>(r2, r9, r12, r8)     // Catch:{ all -> 0x1445 }
            java.lang.Long r9 = r2.f9622g     // Catch:{ all -> 0x1445 }
            java.lang.Long r10 = r2.f9623h     // Catch:{ all -> 0x1445 }
            int r8 = r8.u()     // Catch:{ all -> 0x1445 }
            m.b r11 = r2.f9621f     // Catch:{ all -> 0x1445 }
            r42 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x1445 }
            r28 = r4
            r4 = 0
            java.lang.Object r1 = r11.getOrDefault(r1, r4)     // Catch:{ all -> 0x1445 }
            n4.j8 r1 = (n4.j8) r1     // Catch:{ all -> 0x1445 }
            if (r1 != 0) goto L_0x1155
            r1 = 0
            goto L_0x115b
        L_0x1155:
            java.util.BitSet r1 = r1.f9875d     // Catch:{ all -> 0x1445 }
            boolean r1 = r1.get(r8)     // Catch:{ all -> 0x1445 }
        L_0x115b:
            r8 = r13
            r11 = r7
            r29 = r7
            r4 = r12
            r7 = r13
            r12 = r5
            r31 = r5
            r30 = r14
            r5 = r38
            r14 = r20
            r33 = r3
            r6 = r15
            r3 = r45
            r15 = r1
            boolean r8 = r8.g(r9, r10, r11, r12, r14, r15)     // Catch:{ all -> 0x1445 }
            if (r8 == 0) goto L_0x1194
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x1445 }
            n4.j8 r1 = r2.k(r1)     // Catch:{ all -> 0x1445 }
            r1.b(r7)     // Catch:{ all -> 0x1445 }
            r45 = r3
            r12 = r4
            r38 = r5
            r15 = r6
            r4 = r28
            r7 = r29
            r14 = r30
            r5 = r31
            r3 = r33
            r1 = r42
            goto L_0x1125
        L_0x1194:
            java.util.HashSet r1 = r2.f9620e     // Catch:{ all -> 0x1445 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x1445 }
            r1.add(r7)     // Catch:{ all -> 0x1445 }
            goto L_0x11b0
        L_0x119e:
            r42 = r1
            r33 = r3
            r28 = r4
            r31 = r5
            r29 = r7
            r4 = r12
            r30 = r14
            r6 = r15
            r5 = r38
            r3 = r45
        L_0x11b0:
            if (r8 != 0) goto L_0x11bb
            java.util.HashSet r1 = r2.f9620e     // Catch:{ all -> 0x1445 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x1445 }
            r1.add(r4)     // Catch:{ all -> 0x1445 }
        L_0x11bb:
            r45 = r3
            r38 = r5
            r15 = r6
            r4 = r28
            r7 = r29
            r14 = r30
            r5 = r31
            r3 = r33
            r1 = r42
            goto L_0x10f0
        L_0x11ce:
            r42 = r1
            r41 = r15
            r1 = r16
            r5 = r19
            goto L_0x0f01
        L_0x11d8:
            boolean r1 = r37.isEmpty()     // Catch:{ all -> 0x1c09 }
            if (r1 == 0) goto L_0x11e0
            goto L_0x1449
        L_0x11e0:
            m.b r1 = new m.b     // Catch:{ all -> 0x1c09 }
            r1.<init>()     // Catch:{ all -> 0x1c09 }
            java.util.Iterator r4 = r37.iterator()     // Catch:{ all -> 0x1c09 }
        L_0x11e9:
            boolean r7 = r4.hasNext()     // Catch:{ all -> 0x1c09 }
            if (r7 == 0) goto L_0x1449
            java.lang.Object r7 = r4.next()     // Catch:{ all -> 0x1445 }
            j4.c4 r7 = (j4.c4) r7     // Catch:{ all -> 0x1445 }
            java.lang.String r8 = r7.y()     // Catch:{ all -> 0x1445 }
            java.lang.Object r9 = r1.get(r8)     // Catch:{ all -> 0x1445 }
            java.util.Map r9 = (java.util.Map) r9     // Catch:{ all -> 0x1445 }
            if (r9 != 0) goto L_0x12da
            n4.w7 r9 = r2.f10066b     // Catch:{ all -> 0x1445 }
            n4.i r9 = r9.K()     // Catch:{ all -> 0x1445 }
            java.lang.String r10 = r2.f9619d     // Catch:{ all -> 0x1445 }
            r9.h()     // Catch:{ all -> 0x1445 }
            r9.g()     // Catch:{ all -> 0x1445 }
            r3.o.e(r10)     // Catch:{ all -> 0x1445 }
            r3.o.e(r8)     // Catch:{ all -> 0x1445 }
            m.b r11 = new m.b     // Catch:{ all -> 0x1445 }
            r11.<init>()     // Catch:{ all -> 0x1445 }
            android.database.sqlite.SQLiteDatabase r43 = r9.z()     // Catch:{ all -> 0x1445 }
            java.lang.String r44 = "property_filters"
            java.lang.String[] r45 = new java.lang.String[]{r3, r5}     // Catch:{ SQLiteException -> 0x12a8, all -> 0x12ac }
            java.lang.String r46 = "app_id=? AND property_name=?"
            r12 = 2
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x12a8, all -> 0x12ac }
            r12 = 0
            r13[r12] = r10     // Catch:{ SQLiteException -> 0x12a8, all -> 0x12ac }
            r12 = 1
            r13[r12] = r8     // Catch:{ SQLiteException -> 0x12a8, all -> 0x12ac }
            r48 = 0
            r49 = 0
            r50 = 0
            r47 = r13
            android.database.Cursor r12 = r43.query(r44, r45, r46, r47, r48, r49, r50)     // Catch:{ SQLiteException -> 0x12a8, all -> 0x12ac }
            boolean r13 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x12a4 }
            if (r13 == 0) goto L_0x129a
        L_0x1241:
            r13 = 1
            byte[] r14 = r12.getBlob(r13)     // Catch:{ SQLiteException -> 0x12a4 }
            j4.m2 r13 = j4.n2.v()     // Catch:{ IOException -> 0x1275 }
            j4.i7 r13 = n4.y7.z(r13, r14)     // Catch:{ IOException -> 0x1275 }
            j4.m2 r13 = (j4.m2) r13     // Catch:{ IOException -> 0x1275 }
            j4.m7 r13 = r13.h()     // Catch:{ IOException -> 0x1275 }
            j4.n2 r13 = (j4.n2) r13     // Catch:{ IOException -> 0x1275 }
            r14 = 0
            int r15 = r12.getInt(r14)     // Catch:{ SQLiteException -> 0x12a4 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)     // Catch:{ SQLiteException -> 0x12a4 }
            java.lang.Object r15 = r11.get(r14)     // Catch:{ SQLiteException -> 0x12a4 }
            java.util.List r15 = (java.util.List) r15     // Catch:{ SQLiteException -> 0x12a4 }
            if (r15 != 0) goto L_0x126f
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x12a4 }
            r15.<init>()     // Catch:{ SQLiteException -> 0x12a4 }
            r11.put(r14, r15)     // Catch:{ SQLiteException -> 0x12a4 }
        L_0x126f:
            r15.add(r13)     // Catch:{ SQLiteException -> 0x12a4 }
            r16 = r4
            goto L_0x128c
        L_0x1275:
            r0 = move-exception
            r13 = r0
            n4.n4 r14 = r9.f9600a     // Catch:{ SQLiteException -> 0x12a4 }
            n4.i3 r14 = r14.a()     // Catch:{ SQLiteException -> 0x12a4 }
            n4.g3 r14 = r14.l()     // Catch:{ SQLiteException -> 0x12a4 }
            java.lang.String r15 = "Failed to merge filter"
            r16 = r4
            n4.h3 r4 = n4.i3.p(r10)     // Catch:{ SQLiteException -> 0x12a1 }
            r14.c(r15, r4, r13)     // Catch:{ SQLiteException -> 0x12a1 }
        L_0x128c:
            boolean r4 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x12a1 }
            if (r4 != 0) goto L_0x1297
            r12.close()     // Catch:{ all -> 0x1445 }
            r9 = r11
            goto L_0x12cd
        L_0x1297:
            r4 = r16
            goto L_0x1241
        L_0x129a:
            r16 = r4
            java.util.Map r4 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x12a1 }
            goto L_0x12c9
        L_0x12a1:
            r0 = move-exception
        L_0x12a2:
            r4 = r0
            goto L_0x12b2
        L_0x12a4:
            r0 = move-exception
            r16 = r4
            goto L_0x12a2
        L_0x12a8:
            r0 = move-exception
            r16 = r4
            goto L_0x12b0
        L_0x12ac:
            r0 = move-exception
            r1 = r0
            r9 = 0
            goto L_0x12d4
        L_0x12b0:
            r4 = r0
            r12 = 0
        L_0x12b2:
            n4.n4 r9 = r9.f9600a     // Catch:{ all -> 0x12d1 }
            n4.i3 r9 = r9.a()     // Catch:{ all -> 0x12d1 }
            n4.g3 r9 = r9.l()     // Catch:{ all -> 0x12d1 }
            n4.h3 r10 = n4.i3.p(r10)     // Catch:{ all -> 0x12d1 }
            r9.c(r6, r10, r4)     // Catch:{ all -> 0x12d1 }
            java.util.Map r4 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x12d1 }
            if (r12 == 0) goto L_0x12cc
        L_0x12c9:
            r12.close()     // Catch:{ all -> 0x1445 }
        L_0x12cc:
            r9 = r4
        L_0x12cd:
            r1.put(r8, r9)     // Catch:{ all -> 0x1445 }
            goto L_0x12dc
        L_0x12d1:
            r0 = move-exception
            r1 = r0
            r9 = r12
        L_0x12d4:
            if (r9 == 0) goto L_0x12d9
            r9.close()     // Catch:{ all -> 0x1445 }
        L_0x12d9:
            throw r1     // Catch:{ all -> 0x1445 }
        L_0x12da:
            r16 = r4
        L_0x12dc:
            java.util.Set r4 = r9.keySet()     // Catch:{ all -> 0x1445 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x1445 }
        L_0x12e4:
            boolean r8 = r4.hasNext()     // Catch:{ all -> 0x1445 }
            if (r8 == 0) goto L_0x1435
            java.lang.Object r8 = r4.next()     // Catch:{ all -> 0x1445 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x1445 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x1445 }
            java.util.HashSet r10 = r2.f9620e     // Catch:{ all -> 0x1445 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x1445 }
            boolean r10 = r10.contains(r11)     // Catch:{ all -> 0x1445 }
            if (r10 == 0) goto L_0x1315
            n4.n4 r4 = r2.f9600a     // Catch:{ all -> 0x1445 }
            n4.i3 r4 = r4.a()     // Catch:{ all -> 0x1445 }
            n4.g3 r4 = r4.m()     // Catch:{ all -> 0x1445 }
            r10 = r33
            r4.b(r10, r11)     // Catch:{ all -> 0x1445 }
            r19 = r1
            r41 = r6
            goto L_0x143b
        L_0x1315:
            r10 = r33
            java.lang.Object r11 = r9.get(r11)     // Catch:{ all -> 0x1445 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x1445 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x1445 }
            r12 = 1
        L_0x1322:
            boolean r13 = r11.hasNext()     // Catch:{ all -> 0x1445 }
            if (r13 == 0) goto L_0x141a
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x1445 }
            j4.n2 r12 = (j4.n2) r12     // Catch:{ all -> 0x1445 }
            n4.n4 r13 = r2.f9600a     // Catch:{ all -> 0x1445 }
            n4.i3 r13 = r13.a()     // Catch:{ all -> 0x1445 }
            java.lang.String r13 = r13.t()     // Catch:{ all -> 0x1445 }
            r14 = 2
            boolean r13 = android.util.Log.isLoggable(r13, r14)     // Catch:{ all -> 0x1445 }
            if (r13 == 0) goto L_0x1390
            n4.n4 r13 = r2.f9600a     // Catch:{ all -> 0x1445 }
            n4.i3 r13 = r13.a()     // Catch:{ all -> 0x1445 }
            n4.g3 r13 = r13.m()     // Catch:{ all -> 0x1445 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x1445 }
            boolean r15 = r12.C()     // Catch:{ all -> 0x1445 }
            if (r15 == 0) goto L_0x135e
            int r15 = r12.t()     // Catch:{ all -> 0x1445 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x1445 }
            r19 = r1
            goto L_0x1361
        L_0x135e:
            r19 = r1
            r15 = 0
        L_0x1361:
            n4.n4 r1 = r2.f9600a     // Catch:{ all -> 0x1445 }
            n4.d3 r1 = r1.q()     // Catch:{ all -> 0x1445 }
            r20 = r4
            java.lang.String r4 = r12.x()     // Catch:{ all -> 0x1445 }
            java.lang.String r1 = r1.f(r4)     // Catch:{ all -> 0x1445 }
            java.lang.String r4 = "Evaluating filter. audience, filter, property"
            r13.d(r4, r14, r15, r1)     // Catch:{ all -> 0x1445 }
            n4.n4 r1 = r2.f9600a     // Catch:{ all -> 0x1445 }
            n4.i3 r1 = r1.a()     // Catch:{ all -> 0x1445 }
            n4.g3 r1 = r1.m()     // Catch:{ all -> 0x1445 }
            n4.w7 r4 = r2.f10066b     // Catch:{ all -> 0x1445 }
            n4.y7 r4 = r4.O()     // Catch:{ all -> 0x1445 }
            java.lang.String r4 = r4.B(r12)     // Catch:{ all -> 0x1445 }
            java.lang.String r13 = "Filter definition"
            r1.b(r13, r4)     // Catch:{ all -> 0x1445 }
            goto L_0x1394
        L_0x1390:
            r19 = r1
            r20 = r4
        L_0x1394:
            boolean r1 = r12.C()     // Catch:{ all -> 0x1445 }
            if (r1 == 0) goto L_0x13ee
            int r1 = r12.t()     // Catch:{ all -> 0x1445 }
            r4 = 256(0x100, float:3.59E-43)
            if (r1 <= r4) goto L_0x13a3
            goto L_0x13ee
        L_0x13a3:
            n4.n8 r1 = new n4.n8     // Catch:{ all -> 0x1445 }
            java.lang.String r4 = r2.f9619d     // Catch:{ all -> 0x1445 }
            r1.<init>(r2, r4, r8, r12)     // Catch:{ all -> 0x1445 }
            java.lang.Long r4 = r2.f9622g     // Catch:{ all -> 0x1445 }
            java.lang.Long r13 = r2.f9623h     // Catch:{ all -> 0x1445 }
            int r12 = r12.t()     // Catch:{ all -> 0x1445 }
            m.b r14 = r2.f9621f     // Catch:{ all -> 0x1445 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x1445 }
            r41 = r6
            r6 = 0
            java.lang.Object r14 = r14.getOrDefault(r15, r6)     // Catch:{ all -> 0x1445 }
            n4.j8 r14 = (n4.j8) r14     // Catch:{ all -> 0x1445 }
            if (r14 != 0) goto L_0x13c5
            r6 = 0
            goto L_0x13cb
        L_0x13c5:
            java.util.BitSet r6 = r14.f9875d     // Catch:{ all -> 0x1445 }
            boolean r6 = r6.get(r12)     // Catch:{ all -> 0x1445 }
        L_0x13cb:
            boolean r12 = r1.g(r4, r13, r7, r6)     // Catch:{ all -> 0x1445 }
            if (r12 == 0) goto L_0x13e4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x1445 }
            n4.j8 r4 = r2.k(r4)     // Catch:{ all -> 0x1445 }
            r4.b(r1)     // Catch:{ all -> 0x1445 }
            r1 = r19
            r4 = r20
            r6 = r41
            goto L_0x1322
        L_0x13e4:
            java.util.HashSet r1 = r2.f9620e     // Catch:{ all -> 0x1445 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x1445 }
            r1.add(r4)     // Catch:{ all -> 0x1445 }
            goto L_0x1420
        L_0x13ee:
            r41 = r6
            n4.n4 r1 = r2.f9600a     // Catch:{ all -> 0x1445 }
            n4.i3 r1 = r1.a()     // Catch:{ all -> 0x1445 }
            n4.g3 r1 = r1.n()     // Catch:{ all -> 0x1445 }
            java.lang.String r4 = r2.f9619d     // Catch:{ all -> 0x1445 }
            n4.h3 r4 = n4.i3.p(r4)     // Catch:{ all -> 0x1445 }
            boolean r6 = r12.C()     // Catch:{ all -> 0x1445 }
            if (r6 == 0) goto L_0x140f
            int r6 = r12.t()     // Catch:{ all -> 0x1445 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x1445 }
            goto L_0x1410
        L_0x140f:
            r6 = 0
        L_0x1410:
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x1445 }
            java.lang.String r11 = "Invalid property filter ID. appId, id"
            r1.c(r11, r4, r6)     // Catch:{ all -> 0x1445 }
            goto L_0x1422
        L_0x141a:
            r19 = r1
            r20 = r4
            r41 = r6
        L_0x1420:
            if (r12 != 0) goto L_0x142b
        L_0x1422:
            java.util.HashSet r1 = r2.f9620e     // Catch:{ all -> 0x1445 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x1445 }
            r1.add(r4)     // Catch:{ all -> 0x1445 }
        L_0x142b:
            r33 = r10
            r1 = r19
            r4 = r20
            r6 = r41
            goto L_0x12e4
        L_0x1435:
            r19 = r1
            r41 = r6
            r10 = r33
        L_0x143b:
            r33 = r10
            r4 = r16
            r1 = r19
            r6 = r41
            goto L_0x11e9
        L_0x1445:
            r0 = move-exception
            r1 = r0
            goto L_0x14f9
        L_0x1449:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x1c09 }
            r1.<init>()     // Catch:{ all -> 0x1c09 }
            m.b r4 = r2.f9621f     // Catch:{ all -> 0x1c09 }
            java.util.Set r4 = r4.keySet()     // Catch:{ all -> 0x1c09 }
            java.util.HashSet r6 = r2.f9620e     // Catch:{ all -> 0x1c09 }
            m.g$c r4 = (m.g.c) r4     // Catch:{ all -> 0x1c09 }
            r4.removeAll(r6)     // Catch:{ all -> 0x1c09 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x1c09 }
        L_0x145f:
            r6 = r4
            m.g$a r6 = (m.g.a) r6     // Catch:{ all -> 0x1c09 }
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x1c09 }
            r8 = -1
            java.lang.String r10 = "app_id"
            if (r7 == 0) goto L_0x14fd
            java.lang.Object r6 = r6.next()     // Catch:{ all -> 0x1445 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x1445 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x1445 }
            m.b r7 = r2.f9621f     // Catch:{ all -> 0x1445 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x1445 }
            java.lang.Object r7 = r7.get(r11)     // Catch:{ all -> 0x1445 }
            n4.j8 r7 = (n4.j8) r7     // Catch:{ all -> 0x1445 }
            r3.o.h(r7)     // Catch:{ all -> 0x1445 }
            j4.g3 r6 = r7.a(r6)     // Catch:{ all -> 0x1445 }
            r1.add(r6)     // Catch:{ all -> 0x1445 }
            n4.w7 r7 = r2.f10066b     // Catch:{ all -> 0x1445 }
            n4.i r7 = r7.K()     // Catch:{ all -> 0x1445 }
            java.lang.String r12 = r2.f9619d     // Catch:{ all -> 0x1445 }
            j4.y3 r6 = r6.w()     // Catch:{ all -> 0x1445 }
            r7.h()     // Catch:{ all -> 0x1445 }
            r7.g()     // Catch:{ all -> 0x1445 }
            r3.o.e(r12)     // Catch:{ all -> 0x1445 }
            r3.o.h(r6)     // Catch:{ all -> 0x1445 }
            byte[] r6 = r6.g()     // Catch:{ all -> 0x1445 }
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ all -> 0x1445 }
            r13.<init>()     // Catch:{ all -> 0x1445 }
            r13.put(r10, r12)     // Catch:{ all -> 0x1445 }
            r13.put(r3, r11)     // Catch:{ all -> 0x1445 }
            r10 = r40
            r13.put(r10, r6)     // Catch:{ all -> 0x1445 }
            android.database.sqlite.SQLiteDatabase r6 = r7.z()     // Catch:{ SQLiteException -> 0x14df }
            java.lang.String r11 = "audience_filter_values"
            r14 = 5
            r15 = 0
            long r19 = r6.insertWithOnConflict(r11, r15, r13, r14)     // Catch:{ SQLiteException -> 0x14dc }
            int r6 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x14f5
            n4.n4 r6 = r7.f9600a     // Catch:{ SQLiteException -> 0x14dc }
            n4.i3 r6 = r6.a()     // Catch:{ SQLiteException -> 0x14dc }
            n4.g3 r6 = r6.l()     // Catch:{ SQLiteException -> 0x14dc }
            java.lang.String r8 = "Failed to insert filter results (got -1). appId"
            n4.h3 r9 = n4.i3.p(r12)     // Catch:{ SQLiteException -> 0x14dc }
            r6.b(r8, r9)     // Catch:{ SQLiteException -> 0x14dc }
            goto L_0x14f5
        L_0x14dc:
            r0 = move-exception
        L_0x14dd:
            r6 = r0
            goto L_0x14e2
        L_0x14df:
            r0 = move-exception
            r14 = 5
            goto L_0x14dd
        L_0x14e2:
            n4.n4 r7 = r7.f9600a     // Catch:{ all -> 0x1445 }
            n4.i3 r7 = r7.a()     // Catch:{ all -> 0x1445 }
            n4.g3 r7 = r7.l()     // Catch:{ all -> 0x1445 }
            n4.h3 r8 = n4.i3.p(r12)     // Catch:{ all -> 0x1445 }
            java.lang.String r9 = "Error storing filter results. appId"
            r7.c(r9, r8, r6)     // Catch:{ all -> 0x1445 }
        L_0x14f5:
            r40 = r10
            goto L_0x145f
        L_0x14f9:
            r4 = r80
            goto L_0x1890
        L_0x14fd:
            r36.j()     // Catch:{ all -> 0x1bff }
            r6 = r36
            j4.m7 r2 = r6.f8238b     // Catch:{ all -> 0x1c04 }
            j4.t3 r2 = (j4.t3) r2     // Catch:{ all -> 0x1c04 }
            j4.t3.k0(r2, r1)     // Catch:{ all -> 0x1c04 }
            n4.f r1 = r80.J()     // Catch:{ all -> 0x1bff }
            r2 = r18
            j4.t3 r3 = r2.f10167a     // Catch:{ all -> 0x1bff }
            java.lang.String r3 = r3.K1()     // Catch:{ all -> 0x1bff }
            boolean r1 = r1.r(r3)     // Catch:{ all -> 0x1bff }
            if (r1 == 0) goto L_0x1897
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x1bff }
            r1.<init>()     // Catch:{ all -> 0x1bff }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x1bff }
            r3.<init>()     // Catch:{ all -> 0x1bff }
            n4.d8 r4 = r80.P()     // Catch:{ all -> 0x1bff }
            java.security.SecureRandom r4 = r4.p()     // Catch:{ all -> 0x1bff }
            r7 = 0
        L_0x152e:
            j4.m7 r11 = r6.f8238b     // Catch:{ all -> 0x1bff }
            j4.t3 r11 = (j4.t3) r11     // Catch:{ all -> 0x1893 }
            int r11 = r11.p1()     // Catch:{ all -> 0x1893 }
            if (r7 >= r11) goto L_0x183f
            j4.m7 r11 = r6.f8238b     // Catch:{ all -> 0x1839 }
            j4.t3 r11 = (j4.t3) r11     // Catch:{ all -> 0x1835 }
            j4.k3 r11 = r11.F1(r7)     // Catch:{ all -> 0x1835 }
            j4.i7 r11 = r11.j()     // Catch:{ all -> 0x1bff }
            j4.j3 r11 = (j4.j3) r11     // Catch:{ all -> 0x1bff }
            java.lang.String r12 = r11.o()     // Catch:{ all -> 0x1bff }
            java.lang.String r13 = "_ep"
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x1bff }
            java.lang.String r13 = "_efs"
            java.lang.String r14 = "_sr"
            if (r12 == 0) goto L_0x15d4
            r12 = r80
            n4.y7 r15 = r12.f10288g     // Catch:{ all -> 0x15cf }
            H(r15)     // Catch:{ all -> 0x15cf }
            j4.m7 r15 = r11.h()     // Catch:{ all -> 0x15cf }
            j4.k3 r15 = (j4.k3) r15     // Catch:{ all -> 0x15cf }
            java.lang.String r8 = "_en"
            java.io.Serializable r8 = n4.y7.m(r15, r8)     // Catch:{ all -> 0x15cf }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x15cf }
            java.lang.Object r9 = r1.get(r8)     // Catch:{ all -> 0x15cf }
            n4.n r9 = (n4.n) r9     // Catch:{ all -> 0x15cf }
            if (r9 != 0) goto L_0x158a
            n4.i r9 = r12.f10284c     // Catch:{ all -> 0x15cf }
            H(r9)     // Catch:{ all -> 0x15cf }
            j4.t3 r15 = r2.f10167a     // Catch:{ all -> 0x15cf }
            java.lang.String r15 = r15.K1()     // Catch:{ all -> 0x15cf }
            r3.o.h(r8)     // Catch:{ all -> 0x15cf }
            n4.n r9 = r9.E(r15, r8)     // Catch:{ all -> 0x15cf }
            if (r9 == 0) goto L_0x158a
            r1.put(r8, r9)     // Catch:{ all -> 0x15cf }
        L_0x158a:
            if (r9 == 0) goto L_0x15c9
            java.lang.Long r8 = r9.f9981i     // Catch:{ all -> 0x15cf }
            if (r8 != 0) goto L_0x15c9
            java.lang.Long r8 = r9.f9982j     // Catch:{ all -> 0x15cf }
            if (r8 == 0) goto L_0x15a8
            long r15 = r8.longValue()     // Catch:{ all -> 0x15cf }
            r23 = 1
            int r8 = (r15 > r23 ? 1 : (r15 == r23 ? 0 : -1))
            if (r8 <= 0) goto L_0x15a8
            n4.y7 r8 = r12.f10288g     // Catch:{ all -> 0x15cf }
            H(r8)     // Catch:{ all -> 0x15cf }
            java.lang.Long r8 = r9.f9982j     // Catch:{ all -> 0x15cf }
            n4.y7.k(r11, r14, r8)     // Catch:{ all -> 0x15cf }
        L_0x15a8:
            java.lang.Boolean r8 = r9.k     // Catch:{ all -> 0x15cf }
            if (r8 == 0) goto L_0x15c0
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x15cf }
            if (r8 == 0) goto L_0x15c0
            n4.y7 r8 = r12.f10288g     // Catch:{ all -> 0x15cf }
            H(r8)     // Catch:{ all -> 0x15cf }
            r8 = 1
            java.lang.Long r14 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x15cf }
            n4.y7.k(r11, r13, r14)     // Catch:{ all -> 0x15cf }
        L_0x15c0:
            j4.m7 r8 = r11.h()     // Catch:{ all -> 0x15cf }
            j4.k3 r8 = (j4.k3) r8     // Catch:{ all -> 0x15cf }
            r3.add(r8)     // Catch:{ all -> 0x15cf }
        L_0x15c9:
            r38 = r5
            r20 = r10
            goto L_0x1756
        L_0x15cf:
            r0 = move-exception
            r2 = r0
            r4 = r12
            goto L_0x1c61
        L_0x15d4:
            r12 = r80
            n4.h4 r8 = r12.f10282a     // Catch:{ all -> 0x1bff }
            H(r8)     // Catch:{ all -> 0x1bff }
            j4.t3 r9 = r2.f10167a     // Catch:{ all -> 0x1bff }
            java.lang.String r9 = r9.K1()     // Catch:{ all -> 0x1bff }
            java.lang.String r15 = "measurement.account.time_zone_offset_minutes"
            java.lang.String r15 = r8.b(r9, r15)     // Catch:{ all -> 0x1bff }
            boolean r16 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x1bff }
            if (r16 != 0) goto L_0x160c
            long r8 = java.lang.Long.parseLong(r15)     // Catch:{ NumberFormatException -> 0x15f4 }
            r38 = r5
            goto L_0x1610
        L_0x15f4:
            r0 = move-exception
            r15 = r0
            n4.n4 r8 = r8.f9600a     // Catch:{ all -> 0x15cf }
            n4.i3 r8 = r8.a()     // Catch:{ all -> 0x15cf }
            n4.g3 r8 = r8.n()     // Catch:{ all -> 0x15cf }
            r38 = r5
            java.lang.String r5 = "Unable to parse timezone offset. appId"
            n4.h3 r9 = n4.i3.p(r9)     // Catch:{ all -> 0x15cf }
            r8.c(r5, r9, r15)     // Catch:{ all -> 0x15cf }
            goto L_0x160e
        L_0x160c:
            r38 = r5
        L_0x160e:
            r8 = 0
        L_0x1610:
            n4.d8 r5 = r80.P()     // Catch:{ all -> 0x1bff }
            long r15 = r11.l()     // Catch:{ all -> 0x1bff }
            r5.getClass()     // Catch:{ all -> 0x1831 }
            r26 = 60000(0xea60, double:2.9644E-319)
            long r8 = r8 * r26
            long r15 = r15 + r8
            r28 = r8
            r26 = 86400000(0x5265c00, double:4.2687272E-316)
            long r8 = r15 / r26
            j4.m7 r5 = r11.h()     // Catch:{ all -> 0x1bff }
            j4.k3 r5 = (j4.k3) r5     // Catch:{ all -> 0x1bff }
            r20 = r10
            r15 = 1
            java.lang.Long r10 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x1bff }
            java.lang.String r15 = "_dbg"
            boolean r16 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x1bff }
            if (r16 != 0) goto L_0x1672
            java.util.List r5 = r5.B()     // Catch:{ all -> 0x15cf }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x15cf }
        L_0x1646:
            boolean r16 = r5.hasNext()     // Catch:{ all -> 0x15cf }
            if (r16 == 0) goto L_0x1672
            java.lang.Object r16 = r5.next()     // Catch:{ all -> 0x15cf }
            j4.o3 r16 = (j4.o3) r16     // Catch:{ all -> 0x15cf }
            r23 = r5
            java.lang.String r5 = r16.z()     // Catch:{ all -> 0x15cf }
            boolean r5 = r15.equals(r5)     // Catch:{ all -> 0x15cf }
            if (r5 == 0) goto L_0x166f
            long r15 = r16.w()     // Catch:{ all -> 0x15cf }
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x15cf }
            boolean r5 = r10.equals(r5)     // Catch:{ all -> 0x15cf }
            if (r5 != 0) goto L_0x166d
            goto L_0x1672
        L_0x166d:
            r5 = 1
            goto L_0x1685
        L_0x166f:
            r5 = r23
            goto L_0x1646
        L_0x1672:
            n4.h4 r5 = r12.f10282a     // Catch:{ all -> 0x1bff }
            H(r5)     // Catch:{ all -> 0x1bff }
            j4.t3 r10 = r2.f10167a     // Catch:{ all -> 0x1bff }
            java.lang.String r10 = r10.K1()     // Catch:{ all -> 0x1bff }
            java.lang.String r15 = r11.o()     // Catch:{ all -> 0x1bff }
            int r5 = r5.p(r10, r15)     // Catch:{ all -> 0x1bff }
        L_0x1685:
            if (r5 > 0) goto L_0x16a7
            n4.i3 r8 = r80.a()     // Catch:{ all -> 0x15cf }
            n4.g3 r8 = r8.n()     // Catch:{ all -> 0x15cf }
            java.lang.String r9 = "Sample rate must be positive. event, rate"
            java.lang.String r10 = r11.o()     // Catch:{ all -> 0x15cf }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x15cf }
            r8.c(r9, r10, r5)     // Catch:{ all -> 0x15cf }
            j4.m7 r5 = r11.h()     // Catch:{ all -> 0x15cf }
            j4.k3 r5 = (j4.k3) r5     // Catch:{ all -> 0x15cf }
            r3.add(r5)     // Catch:{ all -> 0x15cf }
            goto L_0x1756
        L_0x16a7:
            java.lang.String r10 = r11.o()     // Catch:{ all -> 0x1bff }
            java.lang.Object r10 = r1.get(r10)     // Catch:{ all -> 0x1bff }
            n4.n r10 = (n4.n) r10     // Catch:{ all -> 0x1bff }
            if (r10 != 0) goto L_0x170c
            n4.i r10 = r12.f10284c     // Catch:{ all -> 0x15cf }
            H(r10)     // Catch:{ all -> 0x15cf }
            j4.t3 r15 = r2.f10167a     // Catch:{ all -> 0x15cf }
            java.lang.String r15 = r15.K1()     // Catch:{ all -> 0x15cf }
            r16 = r13
            java.lang.String r13 = r11.o()     // Catch:{ all -> 0x15cf }
            n4.n r10 = r10.E(r15, r13)     // Catch:{ all -> 0x15cf }
            if (r10 != 0) goto L_0x1709
            n4.i3 r10 = r80.a()     // Catch:{ all -> 0x15cf }
            n4.g3 r10 = r10.n()     // Catch:{ all -> 0x15cf }
            java.lang.String r13 = "Event being bundled has no eventAggregate. appId, eventName"
            j4.t3 r15 = r2.f10167a     // Catch:{ all -> 0x15cf }
            java.lang.String r15 = r15.K1()     // Catch:{ all -> 0x15cf }
            r26 = r8
            java.lang.String r8 = r11.o()     // Catch:{ all -> 0x15cf }
            r10.c(r13, r15, r8)     // Catch:{ all -> 0x15cf }
            n4.n r10 = new n4.n     // Catch:{ all -> 0x15cf }
            j4.t3 r8 = r2.f10167a     // Catch:{ all -> 0x15cf }
            java.lang.String r44 = r8.K1()     // Catch:{ all -> 0x15cf }
            java.lang.String r45 = r11.o()     // Catch:{ all -> 0x15cf }
            r46 = 1
            r48 = 1
            r50 = 1
            long r52 = r11.l()     // Catch:{ all -> 0x15cf }
            r54 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r43 = r10
            r43.<init>(r44, r45, r46, r48, r50, r52, r54, r56, r57, r58, r59)     // Catch:{ all -> 0x15cf }
            goto L_0x1710
        L_0x1709:
            r26 = r8
            goto L_0x1710
        L_0x170c:
            r26 = r8
            r16 = r13
        L_0x1710:
            n4.y7 r8 = r12.f10288g     // Catch:{ all -> 0x1bff }
            H(r8)     // Catch:{ all -> 0x1bff }
            j4.m7 r8 = r11.h()     // Catch:{ all -> 0x1bff }
            j4.k3 r8 = (j4.k3) r8     // Catch:{ all -> 0x1bff }
            java.lang.String r9 = "_eid"
            java.io.Serializable r8 = n4.y7.m(r8, r9)     // Catch:{ all -> 0x1bff }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x1bff }
            if (r8 == 0) goto L_0x1727
            r9 = 1
            goto L_0x1728
        L_0x1727:
            r9 = 0
        L_0x1728:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x1bff }
            r13 = 1
            if (r5 != r13) goto L_0x1760
            j4.m7 r5 = r11.h()     // Catch:{ all -> 0x15cf }
            j4.k3 r5 = (j4.k3) r5     // Catch:{ all -> 0x15cf }
            r3.add(r5)     // Catch:{ all -> 0x15cf }
            boolean r5 = r9.booleanValue()     // Catch:{ all -> 0x15cf }
            if (r5 == 0) goto L_0x1756
            java.lang.Long r5 = r10.f9981i     // Catch:{ all -> 0x15cf }
            if (r5 != 0) goto L_0x174a
            java.lang.Long r5 = r10.f9982j     // Catch:{ all -> 0x15cf }
            if (r5 != 0) goto L_0x174a
            java.lang.Boolean r5 = r10.k     // Catch:{ all -> 0x15cf }
            if (r5 == 0) goto L_0x1756
        L_0x174a:
            r5 = 0
            n4.n r8 = r10.a(r5, r5, r5)     // Catch:{ all -> 0x15cf }
            java.lang.String r5 = r11.o()     // Catch:{ all -> 0x15cf }
            r1.put(r5, r8)     // Catch:{ all -> 0x15cf }
        L_0x1756:
            r6.m(r7, r11)     // Catch:{ all -> 0x15cf }
            r15 = r4
            r4 = r7
            r28 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x1824
        L_0x1760:
            int r13 = r4.nextInt(r5)     // Catch:{ all -> 0x1bff }
            if (r13 != 0) goto L_0x17a0
            n4.y7 r8 = r12.f10288g     // Catch:{ all -> 0x15cf }
            H(r8)     // Catch:{ all -> 0x15cf }
            r13 = r4
            long r4 = (long) r5     // Catch:{ all -> 0x15cf }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x15cf }
            n4.y7.k(r11, r14, r4)     // Catch:{ all -> 0x15cf }
            j4.m7 r5 = r11.h()     // Catch:{ all -> 0x15cf }
            j4.k3 r5 = (j4.k3) r5     // Catch:{ all -> 0x15cf }
            r3.add(r5)     // Catch:{ all -> 0x15cf }
            boolean r5 = r9.booleanValue()     // Catch:{ all -> 0x15cf }
            if (r5 == 0) goto L_0x1788
            r5 = 0
            n4.n r10 = r10.a(r5, r4, r5)     // Catch:{ all -> 0x15cf }
        L_0x1788:
            java.lang.String r4 = r11.o()     // Catch:{ all -> 0x15cf }
            long r8 = r11.l()     // Catch:{ all -> 0x15cf }
            r14 = r26
            n4.n r5 = r10.b(r8, r14)     // Catch:{ all -> 0x15cf }
            r1.put(r4, r5)     // Catch:{ all -> 0x15cf }
            r4 = r7
            r15 = r13
            r28 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x1821
        L_0x17a0:
            r13 = r4
            r30 = r6
            r4 = r7
            r6 = r26
            java.lang.Long r15 = r10.f9980h     // Catch:{ all -> 0x1bff }
            if (r15 == 0) goto L_0x17b2
            long r26 = r15.longValue()     // Catch:{ all -> 0x15cf }
            r28 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x17c4
        L_0x17b2:
            n4.d8 r15 = r80.P()     // Catch:{ all -> 0x1bff }
            long r26 = r11.k()     // Catch:{ all -> 0x1bff }
            r15.getClass()     // Catch:{ all -> 0x182f }
            long r26 = r28 + r26
            r28 = 86400000(0x5265c00, double:4.2687272E-316)
            long r26 = r26 / r28
        L_0x17c4:
            int r15 = (r26 > r6 ? 1 : (r26 == r6 ? 0 : -1))
            if (r15 == 0) goto L_0x180c
            n4.y7 r8 = r12.f10288g     // Catch:{ all -> 0x1bff }
            H(r8)     // Catch:{ all -> 0x1bff }
            r23 = 1
            java.lang.Long r8 = java.lang.Long.valueOf(r23)     // Catch:{ all -> 0x1bff }
            r15 = r16
            n4.y7.k(r11, r15, r8)     // Catch:{ all -> 0x1bff }
            n4.y7 r8 = r12.f10288g     // Catch:{ all -> 0x1bff }
            H(r8)     // Catch:{ all -> 0x1bff }
            r15 = r13
            long r12 = (long) r5     // Catch:{ all -> 0x1bff }
            java.lang.Long r5 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x1bff }
            n4.y7.k(r11, r14, r5)     // Catch:{ all -> 0x1bff }
            j4.m7 r8 = r11.h()     // Catch:{ all -> 0x1bff }
            j4.k3 r8 = (j4.k3) r8     // Catch:{ all -> 0x1bff }
            r3.add(r8)     // Catch:{ all -> 0x1bff }
            boolean r8 = r9.booleanValue()     // Catch:{ all -> 0x1bff }
            if (r8 == 0) goto L_0x17fc
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x1bff }
            r9 = 0
            n4.n r10 = r10.a(r9, r5, r8)     // Catch:{ all -> 0x1bff }
        L_0x17fc:
            java.lang.String r5 = r11.o()     // Catch:{ all -> 0x1bff }
            long r8 = r11.l()     // Catch:{ all -> 0x1bff }
            n4.n r6 = r10.b(r8, r6)     // Catch:{ all -> 0x1bff }
            r1.put(r5, r6)     // Catch:{ all -> 0x1bff }
            goto L_0x181f
        L_0x180c:
            r15 = r13
            boolean r5 = r9.booleanValue()     // Catch:{ all -> 0x1bff }
            if (r5 == 0) goto L_0x181f
            java.lang.String r5 = r11.o()     // Catch:{ all -> 0x1bff }
            r6 = 0
            n4.n r7 = r10.a(r8, r6, r6)     // Catch:{ all -> 0x1bff }
            r1.put(r5, r7)     // Catch:{ all -> 0x1bff }
        L_0x181f:
            r6 = r30
        L_0x1821:
            r6.m(r4, r11)     // Catch:{ all -> 0x1bff }
        L_0x1824:
            int r7 = r4 + 1
            r4 = r15
            r10 = r20
            r5 = r38
            r8 = -1
            goto L_0x152e
        L_0x182f:
            r0 = move-exception
            goto L_0x183a
        L_0x1831:
            r0 = move-exception
            goto L_0x183a
        L_0x1833:
            r1 = r0
            goto L_0x1837
        L_0x1835:
            r0 = move-exception
            goto L_0x1833
        L_0x1837:
            r2 = r1
            goto L_0x183b
        L_0x1839:
            r0 = move-exception
        L_0x183a:
            r2 = r0
        L_0x183b:
            r4 = r80
            goto L_0x1c61
        L_0x183f:
            r38 = r5
            r20 = r10
            int r4 = r3.size()     // Catch:{ all -> 0x1bff }
            j4.m7 r5 = r6.f8238b     // Catch:{ all -> 0x1bff }
            j4.t3 r5 = (j4.t3) r5     // Catch:{ all -> 0x188c }
            int r5 = r5.p1()     // Catch:{ all -> 0x188c }
            if (r4 >= r5) goto L_0x1862
            r6.j()     // Catch:{ all -> 0x1839 }
            j4.m7 r4 = r6.f8238b     // Catch:{ all -> 0x185f }
            j4.t3 r4 = (j4.t3) r4     // Catch:{ all -> 0x185f }
            j4.t3.x0(r4)     // Catch:{ all -> 0x185f }
            r6.r(r3)     // Catch:{ all -> 0x1bff }
            goto L_0x1862
        L_0x185f:
            r0 = move-exception
            r1 = r0
            goto L_0x1837
        L_0x1862:
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x1bff }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x1bff }
        L_0x186a:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x1bff }
            if (r3 == 0) goto L_0x1887
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x1bff }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x1bff }
            r4 = r80
            n4.i r5 = r4.f10284c     // Catch:{ all -> 0x1c5c }
            H(r5)     // Catch:{ all -> 0x1c5c }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x1c5c }
            n4.n r3 = (n4.n) r3     // Catch:{ all -> 0x1c5c }
            r5.n(r3)     // Catch:{ all -> 0x1c5c }
            goto L_0x186a
        L_0x1887:
            r4 = r80
            goto L_0x189d
        L_0x188a:
            r1 = r0
            goto L_0x1890
        L_0x188c:
            r0 = move-exception
            r4 = r80
            goto L_0x188a
        L_0x1890:
            r2 = r1
            goto L_0x1c61
        L_0x1893:
            r0 = move-exception
            r4 = r80
            goto L_0x188a
        L_0x1897:
            r4 = r80
            r38 = r5
            r20 = r10
        L_0x189d:
            j4.t3 r1 = r2.f10167a     // Catch:{ all -> 0x1c5c }
            java.lang.String r1 = r1.K1()     // Catch:{ all -> 0x1c5c }
            n4.i r3 = r4.f10284c     // Catch:{ all -> 0x1c5c }
            H(r3)     // Catch:{ all -> 0x1c5c }
            n4.d5 r3 = r3.A(r1)     // Catch:{ all -> 0x1c5c }
            if (r3 != 0) goto L_0x18c7
            n4.i3 r3 = r80.a()     // Catch:{ all -> 0x1c5c }
            n4.g3 r3 = r3.l()     // Catch:{ all -> 0x1c5c }
            java.lang.String r5 = "Bundling raw events w/o app info. appId"
            j4.t3 r7 = r2.f10167a     // Catch:{ all -> 0x1c5c }
            java.lang.String r7 = r7.K1()     // Catch:{ all -> 0x1c5c }
            n4.h3 r7 = n4.i3.p(r7)     // Catch:{ all -> 0x1c5c }
            r3.b(r5, r7)     // Catch:{ all -> 0x1c5c }
            goto L_0x19a1
        L_0x18c7:
            j4.m7 r5 = r6.f8238b     // Catch:{ all -> 0x1c5c }
            j4.t3 r5 = (j4.t3) r5     // Catch:{ all -> 0x1bfc }
            int r5 = r5.p1()     // Catch:{ all -> 0x1bfc }
            if (r5 <= 0) goto L_0x19a1
            n4.n4 r5 = r3.f9674a     // Catch:{ all -> 0x1c5c }
            n4.m4 r5 = r5.d()     // Catch:{ all -> 0x199e }
            r5.g()     // Catch:{ all -> 0x199e }
            long r7 = r3.f9682i     // Catch:{ all -> 0x199e }
            r9 = 0
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x18ef
            r6.j()     // Catch:{ all -> 0x1c5c }
            j4.m7 r5 = r6.f8238b     // Catch:{ all -> 0x18ed }
            j4.t3 r5 = (j4.t3) r5     // Catch:{ all -> 0x18ed }
            j4.t3.J0(r5, r7)     // Catch:{ all -> 0x18ed }
            goto L_0x18f2
        L_0x18ed:
            r0 = move-exception
            goto L_0x188a
        L_0x18ef:
            r6.A()     // Catch:{ all -> 0x1c5c }
        L_0x18f2:
            n4.n4 r5 = r3.f9674a     // Catch:{ all -> 0x1c5c }
            n4.m4 r5 = r5.d()     // Catch:{ all -> 0x199b }
            r5.g()     // Catch:{ all -> 0x199b }
            long r9 = r3.f9681h     // Catch:{ all -> 0x199b }
            r11 = 0
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x1904
            goto L_0x1905
        L_0x1904:
            r7 = r9
        L_0x1905:
            int r5 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x1917
            r6.j()     // Catch:{ all -> 0x1c5c }
            j4.m7 r5 = r6.f8238b     // Catch:{ all -> 0x1914 }
            j4.t3 r5 = (j4.t3) r5     // Catch:{ all -> 0x1914 }
            j4.t3.H0(r5, r7)     // Catch:{ all -> 0x1914 }
            goto L_0x191a
        L_0x1914:
            r0 = move-exception
            goto L_0x188a
        L_0x1917:
            r6.B()     // Catch:{ all -> 0x1c5c }
        L_0x191a:
            n4.n4 r5 = r3.f9674a     // Catch:{ all -> 0x1c5c }
            n4.m4 r5 = r5.d()     // Catch:{ all -> 0x1998 }
            r5.g()     // Catch:{ all -> 0x1998 }
            long r7 = r3.f9680g     // Catch:{ all -> 0x1998 }
            r9 = 1
            long r7 = r7 + r9
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 <= 0) goto L_0x1944
            n4.n4 r5 = r3.f9674a     // Catch:{ all -> 0x1998 }
            n4.i3 r5 = r5.a()     // Catch:{ all -> 0x1998 }
            n4.g3 r5 = r5.f9831i     // Catch:{ all -> 0x1998 }
            java.lang.String r7 = r3.f9675b     // Catch:{ all -> 0x1998 }
            n4.h3 r7 = n4.i3.p(r7)     // Catch:{ all -> 0x1998 }
            java.lang.String r8 = "Bundle index overflow. appId"
            r5.b(r8, r7)     // Catch:{ all -> 0x1998 }
            r9 = r11
            goto L_0x1945
        L_0x1944:
            r9 = r7
        L_0x1945:
            r5 = 1
            r3.F = r5     // Catch:{ all -> 0x1998 }
            r3.f9680g = r9     // Catch:{ all -> 0x1998 }
            n4.n4 r5 = r3.f9674a     // Catch:{ all -> 0x1c5c }
            n4.m4 r5 = r5.d()     // Catch:{ all -> 0x1995 }
            r5.g()     // Catch:{ all -> 0x1995 }
            long r7 = r3.f9680g     // Catch:{ all -> 0x1995 }
            int r5 = (int) r7
            r6.j()     // Catch:{ all -> 0x1c5c }
            j4.m7 r7 = r6.f8238b     // Catch:{ all -> 0x1992 }
            j4.t3 r7 = (j4.t3) r7     // Catch:{ all -> 0x1992 }
            j4.t3.f0(r7, r5)     // Catch:{ all -> 0x1992 }
            j4.m7 r5 = r6.f8238b     // Catch:{ all -> 0x1c5c }
            j4.t3 r5 = (j4.t3) r5     // Catch:{ all -> 0x198f }
            long r7 = r5.B1()     // Catch:{ all -> 0x198f }
            r3.p(r7)     // Catch:{ all -> 0x1c5c }
            j4.m7 r5 = r6.f8238b     // Catch:{ all -> 0x1c5c }
            j4.t3 r5 = (j4.t3) r5     // Catch:{ all -> 0x198c }
            long r7 = r5.x1()     // Catch:{ all -> 0x198c }
            r3.n(r7)     // Catch:{ all -> 0x1c5c }
            java.lang.String r5 = r3.v()     // Catch:{ all -> 0x1c5c }
            if (r5 == 0) goto L_0x1980
            r6.n(r5)     // Catch:{ all -> 0x1c5c }
            goto L_0x1983
        L_0x1980:
            r6.y()     // Catch:{ all -> 0x1c5c }
        L_0x1983:
            n4.i r5 = r4.f10284c     // Catch:{ all -> 0x1c5c }
            H(r5)     // Catch:{ all -> 0x1c5c }
            r5.m(r3)     // Catch:{ all -> 0x1c5c }
            goto L_0x19a1
        L_0x198c:
            r0 = move-exception
            goto L_0x188a
        L_0x198f:
            r0 = move-exception
            goto L_0x188a
        L_0x1992:
            r0 = move-exception
            goto L_0x188a
        L_0x1995:
            r0 = move-exception
            goto L_0x188a
        L_0x1998:
            r0 = move-exception
            goto L_0x188a
        L_0x199b:
            r0 = move-exception
            goto L_0x188a
        L_0x199e:
            r0 = move-exception
            goto L_0x188a
        L_0x19a1:
            j4.m7 r3 = r6.f8238b     // Catch:{ all -> 0x1c5c }
            j4.t3 r3 = (j4.t3) r3     // Catch:{ all -> 0x1bf9 }
            int r3 = r3.p1()     // Catch:{ all -> 0x1bf9 }
            if (r3 <= 0) goto L_0x1b50
            n4.n4 r3 = r4.f10292l     // Catch:{ all -> 0x1c5c }
            r3.getClass()     // Catch:{ all -> 0x1c5c }
            n4.h4 r3 = r4.f10282a     // Catch:{ all -> 0x1c5c }
            H(r3)     // Catch:{ all -> 0x1c5c }
            j4.t3 r5 = r2.f10167a     // Catch:{ all -> 0x1c5c }
            java.lang.String r5 = r5.K1()     // Catch:{ all -> 0x1c5c }
            j4.x2 r3 = r3.q(r5)     // Catch:{ all -> 0x1c5c }
            if (r3 == 0) goto L_0x19da
            boolean r5 = r3.M()     // Catch:{ all -> 0x1c5c }
            if (r5 != 0) goto L_0x19c8
            goto L_0x19da
        L_0x19c8:
            long r7 = r3.v()     // Catch:{ all -> 0x1c5c }
            r6.j()     // Catch:{ all -> 0x1c5c }
            j4.m7 r3 = r6.f8238b     // Catch:{ all -> 0x19d7 }
            j4.t3 r3 = (j4.t3) r3     // Catch:{ all -> 0x19d7 }
            j4.t3.q0(r3, r7)     // Catch:{ all -> 0x19d7 }
            goto L_0x1a0d
        L_0x19d7:
            r0 = move-exception
            goto L_0x188a
        L_0x19da:
            j4.t3 r3 = r2.f10167a     // Catch:{ all -> 0x1c5c }
            java.lang.String r3 = r3.z()     // Catch:{ all -> 0x1c5c }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x1c5c }
            if (r3 == 0) goto L_0x19f6
            r6.j()     // Catch:{ all -> 0x1c5c }
            j4.m7 r3 = r6.f8238b     // Catch:{ all -> 0x19f3 }
            j4.t3 r3 = (j4.t3) r3     // Catch:{ all -> 0x19f3 }
            r7 = -1
            j4.t3.q0(r3, r7)     // Catch:{ all -> 0x19f3 }
            goto L_0x1a0d
        L_0x19f3:
            r0 = move-exception
            goto L_0x188a
        L_0x19f6:
            n4.i3 r3 = r80.a()     // Catch:{ all -> 0x1c5c }
            n4.g3 r3 = r3.n()     // Catch:{ all -> 0x1c5c }
            java.lang.String r5 = "Did not find measurement config or missing version info. appId"
            j4.t3 r7 = r2.f10167a     // Catch:{ all -> 0x1c5c }
            java.lang.String r7 = r7.K1()     // Catch:{ all -> 0x1c5c }
            n4.h3 r7 = n4.i3.p(r7)     // Catch:{ all -> 0x1c5c }
            r3.b(r5, r7)     // Catch:{ all -> 0x1c5c }
        L_0x1a0d:
            n4.i r3 = r4.f10284c     // Catch:{ all -> 0x1c5c }
            H(r3)     // Catch:{ all -> 0x1c5c }
            j4.m7 r5 = r6.h()     // Catch:{ all -> 0x1c5c }
            j4.t3 r5 = (j4.t3) r5     // Catch:{ all -> 0x1c5c }
            r3.g()     // Catch:{ all -> 0x1c5c }
            r3.h()     // Catch:{ all -> 0x1c5c }
            java.lang.String r6 = r5.K1()     // Catch:{ all -> 0x1c5c }
            r3.o.e(r6)     // Catch:{ all -> 0x1c5c }
            boolean r6 = r5.b1()     // Catch:{ all -> 0x1c5c }
            r3.o.k(r6)     // Catch:{ all -> 0x1c5c }
            r3.P()     // Catch:{ all -> 0x1c5c }
            n4.n4 r6 = r3.f9600a     // Catch:{ all -> 0x1c5c }
            w3.b r6 = r6.c()     // Catch:{ all -> 0x1c5c }
            y3.a r6 = (y3.a) r6     // Catch:{ all -> 0x1c5c }
            long r6 = r6.currentTimeMillis()     // Catch:{ all -> 0x1c5c }
            long r8 = r5.x1()     // Catch:{ all -> 0x1c5c }
            n4.n4 r10 = r3.f9600a     // Catch:{ all -> 0x1c5c }
            r10.getClass()     // Catch:{ all -> 0x1c5c }
            n4.v2 r10 = n4.w2.D     // Catch:{ all -> 0x1c5c }
            r11 = 0
            java.lang.Object r12 = r10.a(r11)     // Catch:{ all -> 0x1b4d }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x1b4d }
            long r11 = r12.longValue()     // Catch:{ all -> 0x1b4d }
            long r11 = r6 - r11
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 < 0) goto L_0x1a74
            long r8 = r5.x1()     // Catch:{ all -> 0x1c5c }
            n4.n4 r11 = r3.f9600a     // Catch:{ all -> 0x1c5c }
            r11.getClass()     // Catch:{ all -> 0x1c5c }
            r11 = 0
            java.lang.Object r10 = r10.a(r11)     // Catch:{ all -> 0x1c5c }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x1a71 }
            long r10 = r10.longValue()     // Catch:{ all -> 0x1a71 }
            long r10 = r10 + r6
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x1a97
            goto L_0x1a74
        L_0x1a71:
            r0 = move-exception
            goto L_0x188a
        L_0x1a74:
            n4.n4 r8 = r3.f9600a     // Catch:{ all -> 0x1c5c }
            n4.i3 r8 = r8.a()     // Catch:{ all -> 0x1c5c }
            n4.g3 r8 = r8.n()     // Catch:{ all -> 0x1c5c }
            java.lang.String r9 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            java.lang.String r10 = r5.K1()     // Catch:{ all -> 0x1c5c }
            n4.h3 r10 = n4.i3.p(r10)     // Catch:{ all -> 0x1c5c }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x1c5c }
            long r11 = r5.x1()     // Catch:{ all -> 0x1c5c }
            java.lang.Long r7 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x1c5c }
            r8.d(r9, r10, r6, r7)     // Catch:{ all -> 0x1c5c }
        L_0x1a97:
            byte[] r6 = r5.g()     // Catch:{ all -> 0x1c5c }
            n4.w7 r7 = r3.f10066b     // Catch:{ IOException -> 0x1b36 }
            n4.y7 r7 = r7.f10288g     // Catch:{ IOException -> 0x1b36 }
            H(r7)     // Catch:{ IOException -> 0x1b36 }
            byte[] r6 = r7.J(r6)     // Catch:{ IOException -> 0x1b36 }
            n4.n4 r7 = r3.f9600a     // Catch:{ all -> 0x1c5c }
            n4.i3 r7 = r7.a()     // Catch:{ all -> 0x1c5c }
            n4.g3 r7 = r7.m()     // Catch:{ all -> 0x1c5c }
            java.lang.String r8 = "Saving bundle, size"
            int r9 = r6.length     // Catch:{ all -> 0x1c5c }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x1c5c }
            r7.b(r8, r9)     // Catch:{ all -> 0x1c5c }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x1c5c }
            r7.<init>()     // Catch:{ all -> 0x1c5c }
            java.lang.String r8 = r5.K1()     // Catch:{ all -> 0x1c5c }
            r9 = r20
            r7.put(r9, r8)     // Catch:{ all -> 0x1c5c }
            java.lang.String r8 = "bundle_end_timestamp"
            long r9 = r5.x1()     // Catch:{ all -> 0x1c5c }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x1c5c }
            r7.put(r8, r9)     // Catch:{ all -> 0x1c5c }
            r8 = r38
            r7.put(r8, r6)     // Catch:{ all -> 0x1c5c }
            java.lang.String r6 = "has_realtime"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x1c5c }
            r7.put(r6, r8)     // Catch:{ all -> 0x1c5c }
            boolean r6 = r5.h1()     // Catch:{ all -> 0x1c5c }
            if (r6 == 0) goto L_0x1af6
            java.lang.String r6 = "retry_count"
            int r8 = r5.r1()     // Catch:{ all -> 0x1c5c }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x1c5c }
            r7.put(r6, r8)     // Catch:{ all -> 0x1c5c }
        L_0x1af6:
            android.database.sqlite.SQLiteDatabase r6 = r3.z()     // Catch:{ SQLiteException -> 0x1b1f }
            java.lang.String r8 = "queue"
            r9 = 0
            long r6 = r6.insert(r8, r9, r7)     // Catch:{ SQLiteException -> 0x1b1f }
            r8 = -1
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x1b50
            n4.n4 r6 = r3.f9600a     // Catch:{ SQLiteException -> 0x1b1f }
            n4.i3 r6 = r6.a()     // Catch:{ SQLiteException -> 0x1b1f }
            n4.g3 r6 = r6.l()     // Catch:{ SQLiteException -> 0x1b1f }
            java.lang.String r7 = "Failed to insert bundle (got -1). appId"
            java.lang.String r8 = r5.K1()     // Catch:{ SQLiteException -> 0x1b1f }
            n4.h3 r8 = n4.i3.p(r8)     // Catch:{ SQLiteException -> 0x1b1f }
            r6.b(r7, r8)     // Catch:{ SQLiteException -> 0x1b1f }
            goto L_0x1b50
        L_0x1b1f:
            r0 = move-exception
            r6 = r0
            n4.n4 r3 = r3.f9600a     // Catch:{ all -> 0x1c5c }
            n4.i3 r3 = r3.a()     // Catch:{ all -> 0x1c5c }
            n4.g3 r3 = r3.l()     // Catch:{ all -> 0x1c5c }
            java.lang.String r7 = "Error storing bundle. appId"
            java.lang.String r5 = r5.K1()     // Catch:{ all -> 0x1c5c }
        L_0x1b31:
            n4.h3 r5 = n4.i3.p(r5)     // Catch:{ all -> 0x1c5c }
            goto L_0x1b49
        L_0x1b36:
            r0 = move-exception
            r6 = r0
            n4.n4 r3 = r3.f9600a     // Catch:{ all -> 0x1c5c }
            n4.i3 r3 = r3.a()     // Catch:{ all -> 0x1c5c }
            n4.g3 r3 = r3.l()     // Catch:{ all -> 0x1c5c }
            java.lang.String r7 = "Data loss. Failed to serialize bundle. appId"
            java.lang.String r5 = r5.K1()     // Catch:{ all -> 0x1c5c }
            goto L_0x1b31
        L_0x1b49:
            r3.c(r7, r5, r6)     // Catch:{ all -> 0x1c5c }
            goto L_0x1b50
        L_0x1b4d:
            r0 = move-exception
            goto L_0x188a
        L_0x1b50:
            n4.i r3 = r4.f10284c     // Catch:{ all -> 0x1c5c }
            H(r3)     // Catch:{ all -> 0x1c5c }
            java.util.ArrayList r2 = r2.f10168b     // Catch:{ all -> 0x1c5c }
            r3.o.h(r2)     // Catch:{ all -> 0x1c5c }
            r3.g()     // Catch:{ all -> 0x1c5c }
            r3.h()     // Catch:{ all -> 0x1c5c }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x1c5c }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x1c5c }
            r6 = 0
        L_0x1b68:
            int r7 = r2.size()     // Catch:{ all -> 0x1c5c }
            if (r6 >= r7) goto L_0x1b85
            if (r6 == 0) goto L_0x1b75
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x1c5c }
        L_0x1b75:
            java.lang.Object r7 = r2.get(r6)     // Catch:{ all -> 0x1c5c }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x1c5c }
            long r7 = r7.longValue()     // Catch:{ all -> 0x1c5c }
            r5.append(r7)     // Catch:{ all -> 0x1c5c }
            int r6 = r6 + 1
            goto L_0x1b68
        L_0x1b85:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x1c5c }
            android.database.sqlite.SQLiteDatabase r6 = r3.z()     // Catch:{ all -> 0x1c5c }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x1c5c }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x1c5c }
            int r6 = r2.size()     // Catch:{ all -> 0x1c5c }
            if (r5 == r6) goto L_0x1bba
            n4.n4 r3 = r3.f9600a     // Catch:{ all -> 0x1c5c }
            n4.i3 r3 = r3.a()     // Catch:{ all -> 0x1c5c }
            n4.g3 r3 = r3.l()     // Catch:{ all -> 0x1c5c }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x1c5c }
            int r2 = r2.size()     // Catch:{ all -> 0x1c5c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x1c5c }
            r3.c(r6, r5, r2)     // Catch:{ all -> 0x1c5c }
        L_0x1bba:
            n4.i r2 = r4.f10284c     // Catch:{ all -> 0x1c5c }
            H(r2)     // Catch:{ all -> 0x1c5c }
            android.database.sqlite.SQLiteDatabase r3 = r2.z()     // Catch:{ all -> 0x1c5c }
            java.lang.String r5 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x1bd2 }
            r7 = 0
            r6[r7] = r1     // Catch:{ SQLiteException -> 0x1bd2 }
            r7 = 1
            r6[r7] = r1     // Catch:{ SQLiteException -> 0x1bd2 }
            r3.execSQL(r5, r6)     // Catch:{ SQLiteException -> 0x1bd2 }
            goto L_0x1be7
        L_0x1bd2:
            r0 = move-exception
            r3 = r0
            n4.n4 r2 = r2.f9600a     // Catch:{ all -> 0x1c5c }
            n4.i3 r2 = r2.a()     // Catch:{ all -> 0x1c5c }
            n4.g3 r2 = r2.l()     // Catch:{ all -> 0x1c5c }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            n4.h3 r1 = n4.i3.p(r1)     // Catch:{ all -> 0x1c5c }
            r2.c(r5, r1, r3)     // Catch:{ all -> 0x1c5c }
        L_0x1be7:
            n4.i r1 = r4.f10284c     // Catch:{ all -> 0x1c5c }
            H(r1)     // Catch:{ all -> 0x1c5c }
            r1.l()     // Catch:{ all -> 0x1c5c }
            n4.i r1 = r4.f10284c
            H(r1)
            r1.N()
            r1 = 1
            return r1
        L_0x1bf9:
            r0 = move-exception
            goto L_0x188a
        L_0x1bfc:
            r0 = move-exception
            goto L_0x188a
        L_0x1bff:
            r0 = move-exception
            r4 = r80
            goto L_0x1c60
        L_0x1c04:
            r0 = move-exception
            r4 = r80
            goto L_0x188a
        L_0x1c09:
            r0 = move-exception
            r4 = r80
            goto L_0x188a
        L_0x1c0e:
            r0 = move-exception
            r4 = r80
            r1 = r0
            r9 = r8
        L_0x1c13:
            if (r9 == 0) goto L_0x1c1c
            r9.close()     // Catch:{ all -> 0x1c19 }
            goto L_0x1c1c
        L_0x1c19:
            r0 = move-exception
            goto L_0x188a
        L_0x1c1c:
            throw r1     // Catch:{ all -> 0x1c19 }
        L_0x1c1d:
            r0 = move-exception
            r4 = r1
            goto L_0x188a
        L_0x1c21:
            r0 = move-exception
            r4 = r1
            goto L_0x188a
        L_0x1c25:
            r0 = move-exception
            r4 = r1
            goto L_0x188a
        L_0x1c29:
            r0 = move-exception
            r4 = r1
            goto L_0x188a
        L_0x1c2d:
            r0 = move-exception
            r4 = r1
            goto L_0x188a
        L_0x1c31:
            r0 = move-exception
            r4 = r1
            goto L_0x188a
        L_0x1c35:
            r0 = move-exception
            r4 = r1
            goto L_0x188a
        L_0x1c39:
            r0 = move-exception
            r4 = r1
            goto L_0x188a
        L_0x1c3d:
            r0 = move-exception
            r4 = r1
            goto L_0x188a
        L_0x1c41:
            r0 = move-exception
            r4 = r1
            goto L_0x188a
        L_0x1c45:
            r0 = move-exception
            r4 = r1
            goto L_0x188a
        L_0x1c49:
            r4 = r1
            n4.i r1 = r4.f10284c     // Catch:{ all -> 0x1c5c }
            H(r1)     // Catch:{ all -> 0x1c5c }
            r1.l()     // Catch:{ all -> 0x1c5c }
            n4.i r1 = r4.f10284c
            H(r1)
            r1.N()
            r1 = 0
            return r1
        L_0x1c5c:
            r0 = move-exception
            goto L_0x1c60
        L_0x1c5e:
            r0 = move-exception
            r4 = r1
        L_0x1c60:
            r2 = r0
        L_0x1c61:
            n4.i r1 = r4.f10284c
            H(r1)
            r1.N()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.w7.D(long):boolean");
    }

    public final boolean E() {
        boolean z9;
        d().g();
        g();
        i iVar = this.f10284c;
        H(iVar);
        if (iVar.u("select count(1) > 0 from raw_events", (String[]) null) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            i iVar2 = this.f10284c;
            H(iVar2);
            if (!TextUtils.isEmpty(iVar2.H())) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean F(j3 j3Var, j3 j3Var2) {
        o.b("_e".equals(j3Var.o()));
        H(this.f10288g);
        o3 l6 = y7.l((k3) j3Var.h(), "_sc");
        String str = null;
        String A2 = l6 == null ? null : l6.A();
        H(this.f10288g);
        o3 l10 = y7.l((k3) j3Var2.h(), "_pc");
        if (l10 != null) {
            str = l10.A();
        }
        if (str == null || !str.equals(A2)) {
            return false;
        }
        o.b("_e".equals(j3Var.o()));
        H(this.f10288g);
        o3 l11 = y7.l((k3) j3Var.h(), "_et");
        if (l11 == null || !l11.O() || l11.w() <= 0) {
            return true;
        }
        long w10 = l11.w();
        H(this.f10288g);
        o3 l12 = y7.l((k3) j3Var2.h(), "_et");
        if (l12 != null && l12.w() > 0) {
            w10 += l12.w();
        }
        H(this.f10288g);
        y7.k(j3Var2, "_et", Long.valueOf(w10));
        H(this.f10288g);
        y7.k(j3Var, "_fr", 1L);
        return true;
    }

    public final d5 I(g8 g8Var) {
        String str;
        boolean z9;
        boolean z10;
        Pair pair;
        e5 e5Var = e5.ANALYTICS_STORAGE;
        d().g();
        g();
        o.h(g8Var);
        o.e(g8Var.f9768a);
        if (!g8Var.w.isEmpty()) {
            this.B.put(g8Var.f9768a, new v7(this, g8Var.w));
        }
        i iVar = this.f10284c;
        H(iVar);
        d5 A2 = iVar.A(g8Var.f9768a);
        f5 c10 = M(g8Var.f9768a).c(f5.b(100, g8Var.f9787v));
        e5 e5Var2 = e5.AD_STORAGE;
        if (c10.f(e5Var2)) {
            str = this.f10290i.l(g8Var.f9768a, g8Var.f9781o);
        } else {
            str = "";
        }
        if (A2 == null) {
            A2 = new d5(this.f10292l, g8Var.f9768a);
            if (c10.f(e5Var)) {
                A2.c(Q(c10));
            }
            if (c10.f(e5Var2)) {
                A2.r(str);
            }
        } else {
            if (c10.f(e5Var2) && str != null) {
                A2.f9674a.d().g();
                if (!str.equals(A2.f9678e)) {
                    A2.r(str);
                    if (g8Var.f9781o) {
                        d7 d7Var = this.f10290i;
                        String str2 = g8Var.f9768a;
                        d7Var.getClass();
                        if (c10.f(e5Var2)) {
                            pair = d7Var.k(str2);
                        } else {
                            pair = new Pair("", Boolean.FALSE);
                        }
                        if (!"00000000-0000-0000-0000-000000000000".equals(pair.first)) {
                            A2.c(Q(c10));
                            i iVar2 = this.f10284c;
                            H(iVar2);
                            if (iVar2.F(g8Var.f9768a, "_id") != null) {
                                i iVar3 = this.f10284c;
                                H(iVar3);
                                if (iVar3.F(g8Var.f9768a, "_lair") == null) {
                                    ((a) c()).getClass();
                                    b8 b8Var = new b8(g8Var.f9768a, "auto", "_lair", System.currentTimeMillis(), 1L);
                                    i iVar4 = this.f10284c;
                                    H(iVar4);
                                    iVar4.r(b8Var);
                                }
                            }
                        }
                    }
                }
            }
            if (TextUtils.isEmpty(A2.x()) && c10.f(e5Var)) {
                A2.c(Q(c10));
            }
        }
        A2.k(g8Var.f9769b);
        A2.b(g8Var.f9783q);
        if (!TextUtils.isEmpty(g8Var.k)) {
            A2.j(g8Var.k);
        }
        long j10 = g8Var.f9772e;
        if (j10 != 0) {
            A2.l(j10);
        }
        if (!TextUtils.isEmpty(g8Var.f9770c)) {
            A2.e(g8Var.f9770c);
        }
        A2.f(g8Var.f9777j);
        String str3 = g8Var.f9771d;
        if (str3 != null) {
            A2.d(str3);
        }
        A2.h(g8Var.f9773f);
        A2.q(g8Var.f9775h);
        if (!TextUtils.isEmpty(g8Var.f9774g)) {
            A2.m(g8Var.f9774g);
        }
        boolean z11 = g8Var.f9781o;
        A2.f9674a.d().g();
        boolean z12 = A2.F;
        boolean z13 = false;
        if (A2.f9688p != z11) {
            z9 = true;
        } else {
            z9 = false;
        }
        A2.F = z12 | z9;
        A2.f9688p = z11;
        Boolean bool = g8Var.f9784r;
        A2.f9674a.d().g();
        A2.F |= !c.w(A2.f9690r, bool);
        A2.f9690r = bool;
        A2.i(g8Var.f9785s);
        tc.b();
        if (J().o((String) null, w2.f10222i0) || J().o(g8Var.f9768a, w2.f10225k0)) {
            String str4 = g8Var.f9788x;
            A2.f9674a.d().g();
            A2.F |= !c.w(A2.u, str4);
            A2.u = str4;
        }
        ma maVar = ma.f8327b;
        ((na) maVar.f8328a.zza()).zza();
        if (J().o((String) null, w2.f10220h0)) {
            A2.s(g8Var.f9786t);
        } else {
            ((na) maVar.f8328a.zza()).zza();
            if (J().o((String) null, w2.f10218g0)) {
                A2.s((List) null);
            }
        }
        ((dd) cd.f8091b.f8092a.zza()).zza();
        if (J().o((String) null, w2.f10227l0)) {
            boolean z14 = g8Var.f9789y;
            A2.f9674a.d().g();
            boolean z15 = A2.F;
            if (A2.f9693v != z14) {
                z10 = true;
            } else {
                z10 = false;
            }
            A2.F = z15 | z10;
            A2.f9693v = z14;
        }
        xb.a();
        if (J().o((String) null, w2.f10245w0)) {
            long j11 = g8Var.f9790z;
            A2.f9674a.d().g();
            boolean z16 = A2.F;
            if (A2.w != j11) {
                z13 = true;
            }
            A2.F = z16 | z13;
            A2.w = j11;
        }
        A2.f9674a.d().g();
        if (A2.F) {
            i iVar5 = this.f10284c;
            H(iVar5);
            iVar5.m(A2);
        }
        return A2;
    }

    public final f J() {
        n4 n4Var = this.f10292l;
        o.h(n4Var);
        return n4Var.f9992g;
    }

    public final i K() {
        i iVar = this.f10284c;
        H(iVar);
        return iVar;
    }

    public final q3 L() {
        q3 q3Var = this.f10285d;
        if (q3Var != null) {
            return q3Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final f5 M(String str) {
        String str2;
        f5 f5Var = f5.f9743c;
        d().g();
        g();
        f5 f5Var2 = (f5) this.A.get(str);
        if (f5Var2 != null) {
            return f5Var2;
        }
        i iVar = this.f10284c;
        H(iVar);
        o.h(str);
        iVar.g();
        iVar.h();
        Cursor cursor = null;
        try {
            Cursor rawQuery = iVar.z().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
            if (rawQuery.moveToFirst()) {
                str2 = rawQuery.getString(0);
                rawQuery.close();
            } else {
                rawQuery.close();
                str2 = "G1";
            }
            f5 b10 = f5.b(100, str2);
            r(str, b10);
            return b10;
        } catch (SQLiteException e10) {
            iVar.f9600a.a().f9828f.c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e10);
            throw e10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final y7 O() {
        y7 y7Var = this.f10288g;
        H(y7Var);
        return y7Var;
    }

    public final d8 P() {
        n4 n4Var = this.f10292l;
        o.h(n4Var);
        return n4Var.x();
    }

    public final String Q(f5 f5Var) {
        if (!f5Var.f(e5.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        P().p().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    public final i3 a() {
        n4 n4Var = this.f10292l;
        o.h(n4Var);
        return n4Var.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r10 = this;
            n4.m4 r0 = r10.d()
            r0.g()
            r10.g()
            boolean r0 = r10.f10294n
            if (r0 != 0) goto L_0x018e
            r0 = 1
            r10.f10294n = r0
            n4.m4 r1 = r10.d()
            r1.g()
            java.nio.channels.FileLock r1 = r10.f10301v
            java.lang.String r2 = "Storage concurrent access okay"
            r3 = 0
            if (r1 == 0) goto L_0x0030
            boolean r1 = r1.isValid()
            if (r1 != 0) goto L_0x0026
            goto L_0x0030
        L_0x0026:
            n4.i3 r1 = r10.a()
            n4.g3 r1 = r1.f9835n
            r1.a(r2)
            goto L_0x0064
        L_0x0030:
            n4.i r1 = r10.f10284c
            n4.n4 r1 = r1.f9600a
            r1.getClass()
            n4.n4 r1 = r10.f10292l
            android.content.Context r1 = r1.f9986a
            java.io.File r1 = r1.getFilesDir()
            java.io.File r4 = new java.io.File
            java.lang.String r5 = "google_app_measurement.db"
            r4.<init>(r1, r5)
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x007c, OverlappingFileLockException -> 0x0072 }
            java.lang.String r5 = "rw"
            r1.<init>(r4, r5)     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x007c, OverlappingFileLockException -> 0x0072 }
            java.nio.channels.FileChannel r1 = r1.getChannel()     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x007c, OverlappingFileLockException -> 0x0072 }
            r10.w = r1     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x007c, OverlappingFileLockException -> 0x0072 }
            java.nio.channels.FileLock r1 = r1.tryLock()     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x007c, OverlappingFileLockException -> 0x0072 }
            r10.f10301v = r1     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x007c, OverlappingFileLockException -> 0x0072 }
            if (r1 == 0) goto L_0x0066
            n4.i3 r1 = r10.a()     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x007c, OverlappingFileLockException -> 0x0072 }
            n4.g3 r1 = r1.f9835n     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x007c, OverlappingFileLockException -> 0x0072 }
            r1.a(r2)     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x007c, OverlappingFileLockException -> 0x0072 }
        L_0x0064:
            r1 = r0
            goto L_0x0093
        L_0x0066:
            n4.i3 r1 = r10.a()     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x007c, OverlappingFileLockException -> 0x0072 }
            n4.g3 r1 = r1.f9828f     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x007c, OverlappingFileLockException -> 0x0072 }
            java.lang.String r2 = "Storage concurrent data access panic"
            r1.a(r2)     // Catch:{ FileNotFoundException -> 0x0086, IOException -> 0x007c, OverlappingFileLockException -> 0x0072 }
            goto L_0x0092
        L_0x0072:
            r1 = move-exception
            n4.i3 r2 = r10.a()
            n4.g3 r2 = r2.f9831i
            java.lang.String r4 = "Storage lock already acquired"
            goto L_0x008f
        L_0x007c:
            r1 = move-exception
            n4.i3 r2 = r10.a()
            n4.g3 r2 = r2.f9828f
            java.lang.String r4 = "Failed to access storage lock file"
            goto L_0x008f
        L_0x0086:
            r1 = move-exception
            n4.i3 r2 = r10.a()
            n4.g3 r2 = r2.f9828f
            java.lang.String r4 = "Failed to acquire storage lock"
        L_0x008f:
            r2.b(r4, r1)
        L_0x0092:
            r1 = r3
        L_0x0093:
            if (r1 == 0) goto L_0x018e
            java.nio.channels.FileChannel r1 = r10.w
            n4.m4 r2 = r10.d()
            r2.g()
            r4 = 0
            java.lang.String r2 = "Bad channel to read from"
            r6 = 4
            if (r1 == 0) goto L_0x00e1
            boolean r7 = r1.isOpen()
            if (r7 != 0) goto L_0x00ac
            goto L_0x00e1
        L_0x00ac:
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r6)
            r1.position(r4)     // Catch:{ IOException -> 0x00d4 }
            int r1 = r1.read(r7)     // Catch:{ IOException -> 0x00d4 }
            if (r1 == r6) goto L_0x00cc
            r7 = -1
            if (r1 == r7) goto L_0x00ea
            n4.i3 r7 = r10.a()     // Catch:{ IOException -> 0x00d4 }
            n4.g3 r7 = r7.f9831i     // Catch:{ IOException -> 0x00d4 }
            java.lang.String r8 = "Unexpected data length. Bytes read"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x00d4 }
            r7.b(r8, r1)     // Catch:{ IOException -> 0x00d4 }
            goto L_0x00ea
        L_0x00cc:
            r7.flip()     // Catch:{ IOException -> 0x00d4 }
            int r3 = r7.getInt()     // Catch:{ IOException -> 0x00d4 }
            goto L_0x00ea
        L_0x00d4:
            r1 = move-exception
            n4.i3 r7 = r10.a()
            n4.g3 r7 = r7.f9828f
            java.lang.String r8 = "Failed to read from channel"
            r7.b(r8, r1)
            goto L_0x00ea
        L_0x00e1:
            n4.i3 r1 = r10.a()
            n4.g3 r1 = r1.f9828f
            r1.a(r2)
        L_0x00ea:
            n4.n4 r1 = r10.f10292l
            n4.a3 r1 = r1.o()
            r1.h()
            int r1 = r1.f9589e
            n4.m4 r7 = r10.d()
            r7.g()
            if (r3 <= r1) goto L_0x0110
            n4.i3 r0 = r10.a()
            n4.g3 r0 = r0.f9828f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Panic: can't downgrade version. Previous, current version"
            goto L_0x018b
        L_0x0110:
            if (r3 >= r1) goto L_0x018e
            java.nio.channels.FileChannel r7 = r10.w
            n4.m4 r8 = r10.d()
            r8.g()
            if (r7 == 0) goto L_0x0172
            boolean r8 = r7.isOpen()
            if (r8 != 0) goto L_0x0124
            goto L_0x0172
        L_0x0124:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r6)
            r2.putInt(r1)
            r2.flip()
            r7.truncate(r4)     // Catch:{ IOException -> 0x0165 }
            r7.write(r2)     // Catch:{ IOException -> 0x0165 }
            r7.force(r0)     // Catch:{ IOException -> 0x0165 }
            long r4 = r7.size()     // Catch:{ IOException -> 0x0165 }
            r8 = 4
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0154
            n4.i3 r0 = r10.a()     // Catch:{ IOException -> 0x0165 }
            n4.g3 r0 = r0.f9828f     // Catch:{ IOException -> 0x0165 }
            java.lang.String r2 = "Error writing to channel. Bytes written"
            long r4 = r7.size()     // Catch:{ IOException -> 0x0165 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x0165 }
            r0.b(r2, r4)     // Catch:{ IOException -> 0x0165 }
        L_0x0154:
            n4.i3 r0 = r10.a()
            n4.g3 r0 = r0.f9835n
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Storage version upgraded. Previous, current version"
            goto L_0x018b
        L_0x0165:
            r0 = move-exception
            n4.i3 r2 = r10.a()
            n4.g3 r2 = r2.f9828f
            java.lang.String r4 = "Failed to write to channel"
            r2.b(r4, r0)
            goto L_0x017b
        L_0x0172:
            n4.i3 r0 = r10.a()
            n4.g3 r0 = r0.f9828f
            r0.a(r2)
        L_0x017b:
            n4.i3 r0 = r10.a()
            n4.g3 r0 = r0.f9828f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Storage version upgrade failed. Previous, current version"
        L_0x018b:
            r0.c(r3, r2, r1)
        L_0x018e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.w7.b():void");
    }

    public final b c() {
        n4 n4Var = this.f10292l;
        o.h(n4Var);
        return n4Var.f9998n;
    }

    public final m4 d() {
        n4 n4Var = this.f10292l;
        o.h(n4Var);
        return n4Var.d();
    }

    public final z7 e() {
        throw null;
    }

    public final Context f() {
        return this.f10292l.f9986a;
    }

    public final void g() {
        if (!this.f10293m) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final void h(d5 d5Var) {
        m.b bVar;
        m.b bVar2;
        d().g();
        if (!TextUtils.isEmpty(d5Var.a()) || !TextUtils.isEmpty(d5Var.u())) {
            r7 r7Var = this.f10291j;
            Uri.Builder builder = new Uri.Builder();
            String a10 = d5Var.a();
            if (TextUtils.isEmpty(a10)) {
                a10 = d5Var.u();
            }
            m.b bVar3 = null;
            Uri.Builder appendQueryParameter = builder.scheme((String) w2.f10215f.a((Object) null)).encodedAuthority((String) w2.f10217g.a((Object) null)).path("config/app/".concat(String.valueOf(a10))).appendQueryParameter("platform", "android");
            r7Var.f9600a.f9992g.k();
            appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(79000)).appendQueryParameter("runtime_version", "0");
            String uri = builder.build().toString();
            try {
                String w10 = d5Var.w();
                o.h(w10);
                URL url = new URL(uri);
                a().f9835n.b("Fetching remote configuration", w10);
                h4 h4Var = this.f10282a;
                H(h4Var);
                x2 q10 = h4Var.q(w10);
                h4 h4Var2 = this.f10282a;
                H(h4Var2);
                h4Var2.g();
                String str = (String) h4Var2.f9804m.getOrDefault(w10, null);
                if (q10 != null) {
                    if (!TextUtils.isEmpty(str)) {
                        bVar2 = new m.b();
                        bVar2.put("If-Modified-Since", str);
                    } else {
                        bVar2 = null;
                    }
                    h4 h4Var3 = this.f10282a;
                    H(h4Var3);
                    h4Var3.g();
                    String str2 = (String) h4Var3.f9805n.getOrDefault(w10, null);
                    if (!TextUtils.isEmpty(str2)) {
                        if (bVar2 == null) {
                            bVar2 = new m.b();
                        }
                        bVar3 = bVar2;
                        bVar3.put("If-None-Match", str2);
                    } else {
                        bVar = bVar2;
                        this.f10299s = true;
                        n3 n3Var = this.f10283b;
                        H(n3Var);
                        u uVar = new u(this);
                        n3Var.g();
                        n3Var.h();
                        n3Var.f9600a.d().n(new m3(n3Var, w10, url, (byte[]) null, bVar, uVar));
                    }
                }
                bVar = bVar3;
                this.f10299s = true;
                n3 n3Var2 = this.f10283b;
                H(n3Var2);
                u uVar2 = new u(this);
                n3Var2.g();
                n3Var2.h();
                n3Var2.f9600a.d().n(new m3(n3Var2, w10, url, (byte[]) null, bVar, uVar2));
            } catch (MalformedURLException unused) {
                a().f9828f.c("Failed to parse config URL. Not fetching. appId", i3.p(d5Var.w()), uri);
            }
        } else {
            String w11 = d5Var.w();
            o.h(w11);
            l(w11, 204, (Throwable) null, (byte[]) null, (Map) null);
        }
    }

    public final void i(r rVar, g8 g8Var) {
        g6 g6Var;
        boolean z9;
        r rVar2;
        List<c> list;
        List<c> list2;
        List<c> list3;
        g3 g3Var;
        String str;
        Object p5;
        String f10;
        String str2;
        g8 g8Var2 = g8Var;
        o.h(g8Var);
        o.e(g8Var2.f9768a);
        d().g();
        g();
        String str3 = g8Var2.f9768a;
        long j10 = rVar.f10088d;
        j3 b10 = j3.b(rVar);
        d().g();
        if (this.C == null || (str2 = this.D) == null || !str2.equals(str3)) {
            g6Var = null;
        } else {
            g6Var = this.C;
        }
        d8.t(g6Var, b10.f9861d, false);
        r a10 = b10.a();
        H(this.f10288g);
        if (!TextUtils.isEmpty(g8Var2.f9769b) || !TextUtils.isEmpty(g8Var2.f9783q)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (!g8Var2.f9775h) {
                I(g8Var2);
                return;
            }
            List list4 = g8Var2.f9786t;
            if (list4 == null) {
                rVar2 = a10;
            } else if (list4.contains(a10.f10085a)) {
                Bundle x9 = a10.f10086b.x();
                x9.putLong("ga_safelisted", 1);
                rVar2 = new r(a10.f10085a, new p(x9), a10.f10087c, a10.f10088d);
            } else {
                a().f9834m.d("Dropping non-safelisted event. appId, event name, origin", str3, a10.f10085a, a10.f10087c);
                return;
            }
            i iVar = this.f10284c;
            H(iVar);
            iVar.M();
            try {
                i iVar2 = this.f10284c;
                H(iVar2);
                o.e(str3);
                iVar2.g();
                iVar2.h();
                int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
                if (i10 < 0) {
                    iVar2.f9600a.a().f9831i.c("Invalid time querying timed out conditional properties", i3.p(str3), Long.valueOf(j10));
                    list = Collections.emptyList();
                } else {
                    list = iVar2.J("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str3, String.valueOf(j10)});
                }
                for (c cVar : list) {
                    if (cVar != null) {
                        a().f9835n.d("User property timed out", cVar.f9640a, this.f10292l.f9997m.f(cVar.f9642c.f10354b), cVar.f9642c.x());
                        r rVar3 = cVar.f9646g;
                        if (rVar3 != null) {
                            u(new r(rVar3, j10), g8Var2);
                        }
                        i iVar3 = this.f10284c;
                        H(iVar3);
                        iVar3.v(str3, cVar.f9642c.f10354b);
                    }
                }
                i iVar4 = this.f10284c;
                H(iVar4);
                o.e(str3);
                iVar4.g();
                iVar4.h();
                if (i10 < 0) {
                    iVar4.f9600a.a().f9831i.c("Invalid time querying expired conditional properties", i3.p(str3), Long.valueOf(j10));
                    list2 = Collections.emptyList();
                } else {
                    list2 = iVar4.J("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str3, String.valueOf(j10)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (c cVar2 : list2) {
                    if (cVar2 != null) {
                        a().f9835n.d("User property expired", cVar2.f9640a, this.f10292l.f9997m.f(cVar2.f9642c.f10354b), cVar2.f9642c.x());
                        i iVar5 = this.f10284c;
                        H(iVar5);
                        iVar5.k(str3, cVar2.f9642c.f10354b);
                        r rVar4 = cVar2.k;
                        if (rVar4 != null) {
                            arrayList.add(rVar4);
                        }
                        i iVar6 = this.f10284c;
                        H(iVar6);
                        iVar6.v(str3, cVar2.f9642c.f10354b);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    u(new r((r) it.next(), j10), g8Var2);
                }
                i iVar7 = this.f10284c;
                H(iVar7);
                String str4 = rVar2.f10085a;
                o.e(str3);
                o.e(str4);
                iVar7.g();
                iVar7.h();
                if (i10 < 0) {
                    iVar7.f9600a.a().f9831i.d("Invalid time querying triggered conditional properties", i3.p(str3), iVar7.f9600a.f9997m.d(str4), Long.valueOf(j10));
                    list3 = Collections.emptyList();
                } else {
                    list3 = iVar7.J("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str3, str4, String.valueOf(j10)});
                }
                ArrayList arrayList2 = new ArrayList(list3.size());
                for (c cVar3 : list3) {
                    if (cVar3 != null) {
                        z7 z7Var = cVar3.f9642c;
                        String str5 = cVar3.f9640a;
                        o.h(str5);
                        String str6 = cVar3.f9641b;
                        String str7 = z7Var.f10354b;
                        Object x10 = z7Var.x();
                        o.h(x10);
                        b8 b8Var = new b8(str5, str6, str7, j10, x10);
                        i iVar8 = this.f10284c;
                        H(iVar8);
                        if (iVar8.r(b8Var)) {
                            g3Var = a().f9835n;
                            str = "User property triggered";
                            p5 = cVar3.f9640a;
                            f10 = this.f10292l.f9997m.f(b8Var.f9637c);
                        } else {
                            g3Var = a().f9828f;
                            str = "Too many active user properties, ignoring";
                            p5 = i3.p(cVar3.f9640a);
                            f10 = this.f10292l.f9997m.f(b8Var.f9637c);
                        }
                        g3Var.d(str, p5, f10, b8Var.f9639e);
                        r rVar5 = cVar3.f9648i;
                        if (rVar5 != null) {
                            arrayList2.add(rVar5);
                        }
                        cVar3.f9642c = new z7(b8Var);
                        cVar3.f9644e = true;
                        i iVar9 = this.f10284c;
                        H(iVar9);
                        iVar9.q(cVar3);
                    }
                }
                u(rVar2, g8Var2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    u(new r((r) it2.next(), j10), g8Var2);
                }
                i iVar10 = this.f10284c;
                H(iVar10);
                iVar10.l();
            } finally {
                i iVar11 = this.f10284c;
                H(iVar11);
                iVar11.N();
            }
        }
    }

    public final void j(r rVar, String str) {
        r rVar2 = rVar;
        String str2 = str;
        i iVar = this.f10284c;
        H(iVar);
        d5 A2 = iVar.A(str2);
        if (A2 == null || TextUtils.isEmpty(A2.y())) {
            a().f9834m.b("No app data available; dropping event", str2);
            return;
        }
        Boolean z9 = z(A2);
        if (z9 == null) {
            if (!"_ui".equals(rVar2.f10085a)) {
                a().f9831i.b("Could not find package. appId", i3.p(str));
            }
        } else if (!z9.booleanValue()) {
            a().f9828f.b("App version does not match; dropping event. appId", i3.p(str));
            return;
        }
        String a10 = A2.a();
        String y9 = A2.y();
        long t10 = A2.t();
        A2.f9674a.d().g();
        String str3 = A2.f9684l;
        A2.f9674a.d().g();
        long j10 = A2.f9685m;
        A2.f9674a.d().g();
        long j11 = A2.f9686n;
        A2.f9674a.d().g();
        boolean z10 = A2.f9687o;
        String z11 = A2.z();
        A2.f9674a.d().g();
        A2.f9674a.d().g();
        boolean z12 = A2.f9688p;
        String u10 = A2.u();
        A2.f9674a.d().g();
        Boolean bool = A2.f9690r;
        A2.f9674a.d().g();
        boolean z13 = z10;
        long j12 = A2.f9691s;
        A2.f9674a.d().g();
        ArrayList arrayList = A2.f9692t;
        String e10 = M(str2).e();
        A2.f9674a.d().g();
        boolean z14 = A2.f9693v;
        A2.f9674a.d().g();
        g8 g8Var = r2;
        g8 g8Var2 = new g8(str, a10, y9, t10, str3, j10, j11, (String) null, z13, false, z11, 0, 0, z12, false, u10, bool, j12, arrayList, e10, "", (String) null, z14, A2.w);
        k(rVar2, g8Var);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: android.os.Bundle} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00dc, code lost:
        if (r5 == null) goto L_0x00e1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0146  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(n4.r r12, n4.g8 r13) {
        /*
            r11 = this;
            java.lang.String r0 = r13.f9768a
            r3.o.e(r0)
            n4.j3 r12 = n4.j3.b(r12)
            n4.d8 r0 = r11.P()
            android.os.Bundle r1 = r12.f9861d
            n4.i r2 = r11.f10284c
            H(r2)
            java.lang.String r3 = r13.f9768a
            r2.g()
            r2.h()
            r4 = 0
            android.database.sqlite.SQLiteDatabase r5 = r2.z()     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00ca }
            java.lang.String r6 = "select parameters from default_event_params where app_id=?"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00ca }
            r8 = 0
            r7[r8] = r3     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00ca }
            android.database.Cursor r5 = r5.rawQuery(r6, r7)     // Catch:{ SQLiteException -> 0x00cd, all -> 0x00ca }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x00c8 }
            if (r6 != 0) goto L_0x0042
            n4.n4 r3 = r2.f9600a     // Catch:{ SQLiteException -> 0x00c8 }
            n4.i3 r3 = r3.a()     // Catch:{ SQLiteException -> 0x00c8 }
            n4.g3 r3 = r3.f9835n     // Catch:{ SQLiteException -> 0x00c8 }
            java.lang.String r6 = "Default event parameters not found"
            r3.a(r6)     // Catch:{ SQLiteException -> 0x00c8 }
            goto L_0x00de
        L_0x0042:
            byte[] r6 = r5.getBlob(r8)     // Catch:{ SQLiteException -> 0x00c8 }
            j4.j3 r7 = j4.k3.x()     // Catch:{ IOException -> 0x00b5 }
            j4.i7 r6 = n4.y7.z(r7, r6)     // Catch:{ IOException -> 0x00b5 }
            j4.j3 r6 = (j4.j3) r6     // Catch:{ IOException -> 0x00b5 }
            j4.m7 r6 = r6.h()     // Catch:{ IOException -> 0x00b5 }
            j4.k3 r6 = (j4.k3) r6     // Catch:{ IOException -> 0x00b5 }
            n4.w7 r3 = r2.f10066b     // Catch:{ SQLiteException -> 0x00c8 }
            r3.O()     // Catch:{ SQLiteException -> 0x00c8 }
            java.util.List r3 = r6.B()     // Catch:{ SQLiteException -> 0x00c8 }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ SQLiteException -> 0x00c8 }
            r6.<init>()     // Catch:{ SQLiteException -> 0x00c8 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ SQLiteException -> 0x00c8 }
        L_0x0068:
            boolean r7 = r3.hasNext()     // Catch:{ SQLiteException -> 0x00c8 }
            if (r7 == 0) goto L_0x00b0
            java.lang.Object r7 = r3.next()     // Catch:{ SQLiteException -> 0x00c8 }
            j4.o3 r7 = (j4.o3) r7     // Catch:{ SQLiteException -> 0x00c8 }
            java.lang.String r8 = r7.z()     // Catch:{ SQLiteException -> 0x00c8 }
            boolean r9 = r7.M()     // Catch:{ SQLiteException -> 0x00c8 }
            if (r9 == 0) goto L_0x0086
            double r9 = r7.t()     // Catch:{ SQLiteException -> 0x00c8 }
            r6.putDouble(r8, r9)     // Catch:{ SQLiteException -> 0x00c8 }
            goto L_0x0068
        L_0x0086:
            boolean r9 = r7.N()     // Catch:{ SQLiteException -> 0x00c8 }
            if (r9 == 0) goto L_0x0094
            float r7 = r7.u()     // Catch:{ SQLiteException -> 0x00c8 }
            r6.putFloat(r8, r7)     // Catch:{ SQLiteException -> 0x00c8 }
            goto L_0x0068
        L_0x0094:
            boolean r9 = r7.Q()     // Catch:{ SQLiteException -> 0x00c8 }
            if (r9 == 0) goto L_0x00a2
            java.lang.String r7 = r7.A()     // Catch:{ SQLiteException -> 0x00c8 }
            r6.putString(r8, r7)     // Catch:{ SQLiteException -> 0x00c8 }
            goto L_0x0068
        L_0x00a2:
            boolean r9 = r7.O()     // Catch:{ SQLiteException -> 0x00c8 }
            if (r9 == 0) goto L_0x0068
            long r9 = r7.w()     // Catch:{ SQLiteException -> 0x00c8 }
            r6.putLong(r8, r9)     // Catch:{ SQLiteException -> 0x00c8 }
            goto L_0x0068
        L_0x00b0:
            r5.close()
            r4 = r6
            goto L_0x00e1
        L_0x00b5:
            r6 = move-exception
            n4.n4 r7 = r2.f9600a     // Catch:{ SQLiteException -> 0x00c8 }
            n4.i3 r7 = r7.a()     // Catch:{ SQLiteException -> 0x00c8 }
            n4.g3 r7 = r7.f9828f     // Catch:{ SQLiteException -> 0x00c8 }
            java.lang.String r8 = "Failed to retrieve default event parameters. appId"
            n4.h3 r3 = n4.i3.p(r3)     // Catch:{ SQLiteException -> 0x00c8 }
            r7.c(r8, r3, r6)     // Catch:{ SQLiteException -> 0x00c8 }
            goto L_0x00de
        L_0x00c8:
            r3 = move-exception
            goto L_0x00cf
        L_0x00ca:
            r12 = move-exception
            goto L_0x0144
        L_0x00cd:
            r3 = move-exception
            r5 = r4
        L_0x00cf:
            n4.n4 r2 = r2.f9600a     // Catch:{ all -> 0x0142 }
            n4.i3 r2 = r2.a()     // Catch:{ all -> 0x0142 }
            n4.g3 r2 = r2.f9828f     // Catch:{ all -> 0x0142 }
            java.lang.String r6 = "Error selecting default event parameters"
            r2.b(r6, r3)     // Catch:{ all -> 0x0142 }
            if (r5 == 0) goto L_0x00e1
        L_0x00de:
            r5.close()
        L_0x00e1:
            r0.u(r1, r4)
            n4.d8 r0 = r11.P()
            n4.f r1 = r11.J()
            java.lang.String r2 = r13.f9768a
            r1.getClass()
            n4.v2 r3 = n4.w2.I
            r4 = 25
            r5 = 100
            int r1 = r1.j(r2, r3, r4, r5)
            r0.w(r12, r1)
            n4.r r12 = r12.a()
            java.lang.String r0 = r12.f10085a
            java.lang.String r1 = "_cmp"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x010d
            goto L_0x013e
        L_0x010d:
            n4.p r0 = r12.f10086b
            android.os.Bundle r0 = r0.f10048a
            java.lang.String r1 = "_cis"
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "referrer API v2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x013e
            n4.p r0 = r12.f10086b
            android.os.Bundle r0 = r0.f10048a
            java.lang.String r1 = "gclid"
            java.lang.String r5 = r0.getString(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x013e
            n4.z7 r0 = new n4.z7
            long r3 = r12.f10088d
            java.lang.String r6 = "_lgclid"
            java.lang.String r7 = "auto"
            r2 = r0
            r2.<init>(r3, r5, r6, r7)
            r11.s(r0, r13)
        L_0x013e:
            r11.i(r12, r13)
            return
        L_0x0142:
            r12 = move-exception
            r4 = r5
        L_0x0144:
            if (r4 == 0) goto L_0x0149
            r4.close()
        L_0x0149:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.w7.k(n4.r, n4.g8):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048 A[Catch:{ all -> 0x00dd, all -> 0x01a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059 A[Catch:{ all -> 0x00dd, all -> 0x01a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0153 A[Catch:{ all -> 0x00dd, all -> 0x01a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015f A[Catch:{ all -> 0x00dd, all -> 0x01a5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(java.lang.String r9, int r10, java.lang.Throwable r11, byte[] r12, java.util.Map r13) {
        /*
            r8 = this;
            n4.m4 r0 = r8.d()
            r0.g()
            r8.g()
            r3.o.e(r9)
            r0 = 0
            if (r12 != 0) goto L_0x0012
            byte[] r12 = new byte[r0]     // Catch:{ all -> 0x01a5 }
        L_0x0012:
            n4.i3 r1 = r8.a()     // Catch:{ all -> 0x01a5 }
            n4.g3 r1 = r1.f9835n     // Catch:{ all -> 0x01a5 }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r12.length     // Catch:{ all -> 0x01a5 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01a5 }
            r1.b(r2, r3)     // Catch:{ all -> 0x01a5 }
            n4.i r1 = r8.f10284c     // Catch:{ all -> 0x01a5 }
            H(r1)     // Catch:{ all -> 0x01a5 }
            r1.M()     // Catch:{ all -> 0x01a5 }
            n4.i r1 = r8.f10284c     // Catch:{ all -> 0x00dd }
            H(r1)     // Catch:{ all -> 0x00dd }
            n4.d5 r1 = r1.A(r9)     // Catch:{ all -> 0x00dd }
            r2 = 200(0xc8, float:2.8E-43)
            r4 = 304(0x130, float:4.26E-43)
            r5 = 1
            if (r10 == r2) goto L_0x0041
            r2 = 204(0xcc, float:2.86E-43)
            if (r10 == r2) goto L_0x0041
            if (r10 != r4) goto L_0x0045
            r10 = r4
        L_0x0041:
            if (r11 != 0) goto L_0x0045
            r2 = r5
            goto L_0x0046
        L_0x0045:
            r2 = r0
        L_0x0046:
            if (r1 != 0) goto L_0x0059
            n4.i3 r10 = r8.a()     // Catch:{ all -> 0x00dd }
            n4.g3 r10 = r10.f9831i     // Catch:{ all -> 0x00dd }
            java.lang.String r11 = "App does not exist in onConfigFetched. appId"
            n4.h3 r9 = n4.i3.p(r9)     // Catch:{ all -> 0x00dd }
            r10.b(r11, r9)     // Catch:{ all -> 0x00dd }
            goto L_0x0186
        L_0x0059:
            r6 = 404(0x194, float:5.66E-43)
            r7 = 0
            if (r2 != 0) goto L_0x00e0
            if (r10 != r6) goto L_0x0062
            goto L_0x00e0
        L_0x0062:
            w3.b r12 = r8.c()     // Catch:{ all -> 0x00dd }
            y3.a r12 = (y3.a) r12     // Catch:{ all -> 0x00dd }
            r12.getClass()     // Catch:{ all -> 0x00dd }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00dd }
            n4.n4 r2 = r1.f9674a     // Catch:{ all -> 0x00dd }
            n4.m4 r2 = r2.d()     // Catch:{ all -> 0x00dd }
            r2.g()     // Catch:{ all -> 0x00dd }
            boolean r2 = r1.F     // Catch:{ all -> 0x00dd }
            long r3 = r1.H     // Catch:{ all -> 0x00dd }
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r5 = r0
        L_0x0082:
            r2 = r2 | r5
            r1.F = r2     // Catch:{ all -> 0x00dd }
            r1.H = r12     // Catch:{ all -> 0x00dd }
            n4.i r12 = r8.f10284c     // Catch:{ all -> 0x00dd }
            H(r12)     // Catch:{ all -> 0x00dd }
            r12.m(r1)     // Catch:{ all -> 0x00dd }
            n4.i3 r12 = r8.a()     // Catch:{ all -> 0x00dd }
            n4.g3 r12 = r12.f9835n     // Catch:{ all -> 0x00dd }
            java.lang.String r13 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x00dd }
            r12.c(r13, r1, r11)     // Catch:{ all -> 0x00dd }
            n4.h4 r11 = r8.f10282a     // Catch:{ all -> 0x00dd }
            H(r11)     // Catch:{ all -> 0x00dd }
            r11.g()     // Catch:{ all -> 0x00dd }
            m.b r11 = r11.f9804m     // Catch:{ all -> 0x00dd }
            r11.put(r9, r7)     // Catch:{ all -> 0x00dd }
            n4.d7 r9 = r8.f10290i     // Catch:{ all -> 0x00dd }
            n4.t3 r9 = r9.f9704h     // Catch:{ all -> 0x00dd }
            w3.b r11 = r8.c()     // Catch:{ all -> 0x00dd }
            y3.a r11 = (y3.a) r11     // Catch:{ all -> 0x00dd }
            r11.getClass()     // Catch:{ all -> 0x00dd }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00dd }
            r9.b(r11)     // Catch:{ all -> 0x00dd }
            r9 = 503(0x1f7, float:7.05E-43)
            if (r10 == r9) goto L_0x00c7
            r9 = 429(0x1ad, float:6.01E-43)
            if (r10 != r9) goto L_0x0183
        L_0x00c7:
            n4.d7 r9 = r8.f10290i     // Catch:{ all -> 0x00dd }
            n4.t3 r9 = r9.f9702f     // Catch:{ all -> 0x00dd }
            w3.b r10 = r8.c()     // Catch:{ all -> 0x00dd }
            y3.a r10 = (y3.a) r10     // Catch:{ all -> 0x00dd }
            r10.getClass()     // Catch:{ all -> 0x00dd }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00dd }
            r9.b(r10)     // Catch:{ all -> 0x00dd }
            goto L_0x0183
        L_0x00dd:
            r9 = move-exception
            goto L_0x019c
        L_0x00e0:
            if (r13 == 0) goto L_0x00eb
            java.lang.String r11 = "Last-Modified"
            java.lang.Object r11 = r13.get(r11)     // Catch:{ all -> 0x00dd }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x00dd }
            goto L_0x00ec
        L_0x00eb:
            r11 = r7
        L_0x00ec:
            if (r11 == 0) goto L_0x00fb
            boolean r2 = r11.isEmpty()     // Catch:{ all -> 0x00dd }
            if (r2 != 0) goto L_0x00fb
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x00dd }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x00dd }
            goto L_0x00fc
        L_0x00fb:
            r11 = r7
        L_0x00fc:
            if (r13 == 0) goto L_0x0107
            java.lang.String r2 = "ETag"
            java.lang.Object r13 = r13.get(r2)     // Catch:{ all -> 0x00dd }
            java.util.List r13 = (java.util.List) r13     // Catch:{ all -> 0x00dd }
            goto L_0x0108
        L_0x0107:
            r13 = r7
        L_0x0108:
            if (r13 == 0) goto L_0x0117
            boolean r2 = r13.isEmpty()     // Catch:{ all -> 0x00dd }
            if (r2 != 0) goto L_0x0117
            java.lang.Object r13 = r13.get(r0)     // Catch:{ all -> 0x00dd }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x00dd }
            goto L_0x0118
        L_0x0117:
            r13 = r7
        L_0x0118:
            if (r10 == r6) goto L_0x0126
            if (r10 != r4) goto L_0x011d
            goto L_0x0126
        L_0x011d:
            n4.h4 r2 = r8.f10282a     // Catch:{ all -> 0x00dd }
            H(r2)     // Catch:{ all -> 0x00dd }
            r2.u(r9, r12, r11, r13)     // Catch:{ all -> 0x00dd }
            goto L_0x0139
        L_0x0126:
            n4.h4 r11 = r8.f10282a     // Catch:{ all -> 0x00dd }
            H(r11)     // Catch:{ all -> 0x00dd }
            j4.x2 r11 = r11.q(r9)     // Catch:{ all -> 0x00dd }
            if (r11 != 0) goto L_0x0139
            n4.h4 r11 = r8.f10282a     // Catch:{ all -> 0x00dd }
            H(r11)     // Catch:{ all -> 0x00dd }
            r11.u(r9, r7, r7, r7)     // Catch:{ all -> 0x00dd }
        L_0x0139:
            w3.b r11 = r8.c()     // Catch:{ all -> 0x00dd }
            y3.a r11 = (y3.a) r11     // Catch:{ all -> 0x00dd }
            r11.getClass()     // Catch:{ all -> 0x00dd }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00dd }
            r1.g(r11)     // Catch:{ all -> 0x00dd }
            n4.i r11 = r8.f10284c     // Catch:{ all -> 0x00dd }
            H(r11)     // Catch:{ all -> 0x00dd }
            r11.m(r1)     // Catch:{ all -> 0x00dd }
            if (r10 != r6) goto L_0x015f
            n4.i3 r10 = r8.a()     // Catch:{ all -> 0x00dd }
            n4.g3 r10 = r10.k     // Catch:{ all -> 0x00dd }
            java.lang.String r11 = "Config not found. Using empty config. appId"
            r10.b(r11, r9)     // Catch:{ all -> 0x00dd }
            goto L_0x016e
        L_0x015f:
            n4.i3 r9 = r8.a()     // Catch:{ all -> 0x00dd }
            n4.g3 r9 = r9.f9835n     // Catch:{ all -> 0x00dd }
            java.lang.String r11 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x00dd }
            r9.c(r11, r10, r3)     // Catch:{ all -> 0x00dd }
        L_0x016e:
            n4.n3 r9 = r8.f10283b     // Catch:{ all -> 0x00dd }
            H(r9)     // Catch:{ all -> 0x00dd }
            boolean r9 = r9.k()     // Catch:{ all -> 0x00dd }
            if (r9 == 0) goto L_0x0183
            boolean r9 = r8.E()     // Catch:{ all -> 0x00dd }
            if (r9 == 0) goto L_0x0183
            r8.t()     // Catch:{ all -> 0x00dd }
            goto L_0x0186
        L_0x0183:
            r8.C()     // Catch:{ all -> 0x00dd }
        L_0x0186:
            n4.i r9 = r8.f10284c     // Catch:{ all -> 0x00dd }
            H(r9)     // Catch:{ all -> 0x00dd }
            r9.l()     // Catch:{ all -> 0x00dd }
            n4.i r9 = r8.f10284c     // Catch:{ all -> 0x01a5 }
            H(r9)     // Catch:{ all -> 0x01a5 }
            r9.N()     // Catch:{ all -> 0x01a5 }
            r8.f10299s = r0
            r8.A()
            return
        L_0x019c:
            n4.i r10 = r8.f10284c     // Catch:{ all -> 0x01a5 }
            H(r10)     // Catch:{ all -> 0x01a5 }
            r10.N()     // Catch:{ all -> 0x01a5 }
            throw r9     // Catch:{ all -> 0x01a5 }
        L_0x01a5:
            r9 = move-exception
            r8.f10299s = r0
            r8.A()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.w7.l(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:133:0x03c4 A[Catch:{ RuntimeException -> 0x035c, all -> 0x0541 }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03e8 A[Catch:{ RuntimeException -> 0x035c, all -> 0x0541 }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03f9 A[SYNTHETIC, Splitter:B:137:0x03f9] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0493 A[Catch:{ RuntimeException -> 0x035c, all -> 0x0541 }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x04af A[Catch:{ RuntimeException -> 0x035c, all -> 0x0541 }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0511 A[Catch:{ RuntimeException -> 0x035c, all -> 0x0541 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0202 A[Catch:{ RuntimeException -> 0x035c, all -> 0x0541 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0238 A[Catch:{ RuntimeException -> 0x035c, all -> 0x0541 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0259 A[Catch:{ RuntimeException -> 0x035c, all -> 0x0541 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x025f A[Catch:{ RuntimeException -> 0x035c, all -> 0x0541 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x026e A[Catch:{ RuntimeException -> 0x035c, all -> 0x0541 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x027e A[Catch:{ RuntimeException -> 0x035c, all -> 0x0541 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(n4.g8 r25) {
        /*
            r24 = this;
            r1 = r24
            r2 = r25
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "com.android.vending"
            java.lang.String r6 = "_pfo"
            java.lang.String r0 = "_npa"
            java.lang.String r7 = "_uwa"
            java.lang.String r8 = "app_id=?"
            n4.m4 r9 = r24.d()
            r9.g()
            r24.g()
            r3.o.h(r25)
            java.lang.String r9 = r2.f9768a
            r3.o.e(r9)
            boolean r9 = G(r25)
            if (r9 == 0) goto L_0x054b
            n4.i r9 = r1.f10284c
            H(r9)
            java.lang.String r10 = r2.f9768a
            n4.d5 r9 = r9.A(r10)
            r10 = 0
            if (r9 == 0) goto L_0x0065
            java.lang.String r12 = r9.a()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x0065
            java.lang.String r12 = r2.f9769b
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x0065
            r9.g(r10)
            n4.i r12 = r1.f10284c
            H(r12)
            r12.m(r9)
            n4.h4 r9 = r1.f10282a
            H(r9)
            java.lang.String r12 = r2.f9768a
            r9.g()
            m.b r9 = r9.f9800h
            r9.remove(r12)
        L_0x0065:
            boolean r9 = r2.f9775h
            if (r9 != 0) goto L_0x006d
            r24.I(r25)
            return
        L_0x006d:
            long r12 = r2.f9779m
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x0080
            w3.b r9 = r24.c()
            y3.a r9 = (y3.a) r9
            r9.getClass()
            long r12 = java.lang.System.currentTimeMillis()
        L_0x0080:
            n4.n4 r9 = r1.f10292l
            n4.l r9 = r9.n()
            r9.g()
            r15 = 0
            r9.f9903f = r15
            r9.f9904g = r10
            int r9 = r2.f9780n
            r10 = 1
            if (r9 == 0) goto L_0x00ab
            if (r9 == r10) goto L_0x00ab
            n4.i3 r11 = r24.a()
            n4.g3 r11 = r11.f9831i
            java.lang.String r14 = r2.f9768a
            n4.h3 r14 = n4.i3.p(r14)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r15 = "Incorrect app type, assuming installed app. appId, appType"
            r11.c(r15, r14, r9)
            r9 = 0
        L_0x00ab:
            n4.i r11 = r1.f10284c
            H(r11)
            r11.M()
            n4.i r11 = r1.f10284c     // Catch:{ all -> 0x0541 }
            H(r11)     // Catch:{ all -> 0x0541 }
            java.lang.String r14 = r2.f9768a     // Catch:{ all -> 0x0541 }
            n4.b8 r11 = r11.F(r14, r0)     // Catch:{ all -> 0x0541 }
            if (r11 == 0) goto L_0x00ca
            java.lang.String r14 = "auto"
            java.lang.String r15 = r11.f9636b     // Catch:{ all -> 0x0541 }
            boolean r14 = r14.equals(r15)     // Catch:{ all -> 0x0541 }
            if (r14 == 0) goto L_0x0104
        L_0x00ca:
            java.lang.Boolean r14 = r2.f9784r     // Catch:{ all -> 0x0541 }
            if (r14 == 0) goto L_0x00ff
            n4.z7 r0 = new n4.z7     // Catch:{ all -> 0x0541 }
            java.lang.String r20 = "_npa"
            boolean r14 = r14.booleanValue()     // Catch:{ all -> 0x0541 }
            if (r10 == r14) goto L_0x00db
            r14 = 0
            goto L_0x00dd
        L_0x00db:
            r14 = 1
        L_0x00dd:
            java.lang.Long r21 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0541 }
            java.lang.String r22 = "auto"
            r15 = 0
            r14 = r0
            r15 = r12
            r17 = r21
            r18 = r20
            r19 = r22
            r14.<init>(r15, r17, r18, r19)     // Catch:{ all -> 0x0541 }
            if (r11 == 0) goto L_0x00fb
            java.lang.Object r11 = r11.f9639e     // Catch:{ all -> 0x0541 }
            java.lang.Long r14 = r0.f10356d     // Catch:{ all -> 0x0541 }
            boolean r11 = r11.equals(r14)     // Catch:{ all -> 0x0541 }
            if (r11 != 0) goto L_0x0104
        L_0x00fb:
            r1.s(r0, r2)     // Catch:{ all -> 0x0541 }
            goto L_0x0104
        L_0x00ff:
            if (r11 == 0) goto L_0x0104
            r1.o(r0, r2)     // Catch:{ all -> 0x0541 }
        L_0x0104:
            n4.i r0 = r1.f10284c     // Catch:{ all -> 0x0541 }
            H(r0)     // Catch:{ all -> 0x0541 }
            java.lang.String r11 = r2.f9768a     // Catch:{ all -> 0x0541 }
            r3.o.h(r11)     // Catch:{ all -> 0x0541 }
            n4.d5 r15 = r0.A(r11)     // Catch:{ all -> 0x0541 }
            if (r15 == 0) goto L_0x01f9
            n4.d8 r0 = r24.P()     // Catch:{ all -> 0x0541 }
            java.lang.String r11 = r2.f9769b     // Catch:{ all -> 0x0541 }
            java.lang.String r14 = r15.a()     // Catch:{ all -> 0x0541 }
            java.lang.String r10 = r2.f9783q     // Catch:{ all -> 0x0541 }
            r21 = r3
            java.lang.String r3 = r15.u()     // Catch:{ all -> 0x0541 }
            r0.getClass()     // Catch:{ all -> 0x0541 }
            boolean r0 = n4.d8.W(r11, r14, r10, r3)     // Catch:{ all -> 0x0541 }
            if (r0 == 0) goto L_0x01fb
            n4.i3 r0 = r24.a()     // Catch:{ all -> 0x0541 }
            n4.g3 r0 = r0.f9831i     // Catch:{ all -> 0x0541 }
            java.lang.String r3 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r10 = r15.w()     // Catch:{ all -> 0x0541 }
            n4.h3 r10 = n4.i3.p(r10)     // Catch:{ all -> 0x0541 }
            r0.b(r3, r10)     // Catch:{ all -> 0x0541 }
            n4.i r3 = r1.f10284c     // Catch:{ all -> 0x0541 }
            H(r3)     // Catch:{ all -> 0x0541 }
            java.lang.String r10 = r15.w()     // Catch:{ all -> 0x0541 }
            r3.h()     // Catch:{ all -> 0x0541 }
            r3.g()     // Catch:{ all -> 0x0541 }
            r3.o.e(r10)     // Catch:{ all -> 0x0541 }
            android.database.sqlite.SQLiteDatabase r0 = r3.z()     // Catch:{ SQLiteException -> 0x01e0 }
            r11 = 1
            java.lang.String[] r14 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x01e0 }
            r11 = 0
            r14[r11] = r10     // Catch:{ SQLiteException -> 0x01e0 }
            java.lang.String r15 = "events"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01e0 }
            java.lang.String r11 = "user_attributes"
            int r11 = r0.delete(r11, r8, r14)     // Catch:{ SQLiteException -> 0x01e0 }
            int r15 = r15 + r11
            java.lang.String r11 = "conditional_properties"
            int r11 = r0.delete(r11, r8, r14)     // Catch:{ SQLiteException -> 0x01e0 }
            int r15 = r15 + r11
            java.lang.String r11 = "apps"
            int r11 = r0.delete(r11, r8, r14)     // Catch:{ SQLiteException -> 0x01e0 }
            int r15 = r15 + r11
            java.lang.String r11 = "raw_events"
            int r11 = r0.delete(r11, r8, r14)     // Catch:{ SQLiteException -> 0x01e0 }
            int r15 = r15 + r11
            java.lang.String r11 = "raw_events_metadata"
            int r11 = r0.delete(r11, r8, r14)     // Catch:{ SQLiteException -> 0x01e0 }
            int r15 = r15 + r11
            java.lang.String r11 = "event_filters"
            int r11 = r0.delete(r11, r8, r14)     // Catch:{ SQLiteException -> 0x01e0 }
            int r15 = r15 + r11
            java.lang.String r11 = "property_filters"
            int r11 = r0.delete(r11, r8, r14)     // Catch:{ SQLiteException -> 0x01e0 }
            int r15 = r15 + r11
            java.lang.String r11 = "audience_filter_values"
            int r11 = r0.delete(r11, r8, r14)     // Catch:{ SQLiteException -> 0x01e0 }
            int r15 = r15 + r11
            java.lang.String r11 = "consent_settings"
            int r11 = r0.delete(r11, r8, r14)     // Catch:{ SQLiteException -> 0x01e0 }
            int r15 = r15 + r11
            j4.ib r11 = j4.ib.f8264b     // Catch:{ SQLiteException -> 0x01e0 }
            j4.m5 r11 = r11.f8265a     // Catch:{ SQLiteException -> 0x01e0 }
            java.lang.Object r11 = r11.zza()     // Catch:{ SQLiteException -> 0x01e0 }
            j4.jb r11 = (j4.jb) r11     // Catch:{ SQLiteException -> 0x01e0 }
            r11.zza()     // Catch:{ SQLiteException -> 0x01e0 }
            n4.n4 r11 = r3.f9600a     // Catch:{ SQLiteException -> 0x01e0 }
            n4.f r11 = r11.f9992g     // Catch:{ SQLiteException -> 0x01e0 }
            r22 = r4
            n4.v2 r4 = n4.w2.f10231n0     // Catch:{ SQLiteException -> 0x01de }
            r23 = r6
            r6 = 0
            boolean r4 = r11.o(r6, r4)     // Catch:{ SQLiteException -> 0x01dc }
            if (r4 == 0) goto L_0x01c8
            java.lang.String r4 = "default_event_params"
            int r0 = r0.delete(r4, r8, r14)     // Catch:{ SQLiteException -> 0x01dc }
            int r15 = r15 + r0
        L_0x01c8:
            if (r15 <= 0) goto L_0x01f7
            n4.n4 r0 = r3.f9600a     // Catch:{ SQLiteException -> 0x01dc }
            n4.i3 r0 = r0.a()     // Catch:{ SQLiteException -> 0x01dc }
            n4.g3 r0 = r0.f9835n     // Catch:{ SQLiteException -> 0x01dc }
            java.lang.String r4 = "Deleted application data. app, records"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)     // Catch:{ SQLiteException -> 0x01dc }
            r0.c(r4, r10, r8)     // Catch:{ SQLiteException -> 0x01dc }
            goto L_0x01f7
        L_0x01dc:
            r0 = move-exception
            goto L_0x01e6
        L_0x01de:
            r0 = move-exception
            goto L_0x01e3
        L_0x01e0:
            r0 = move-exception
            r22 = r4
        L_0x01e3:
            r23 = r6
            r6 = 0
        L_0x01e6:
            n4.n4 r3 = r3.f9600a     // Catch:{ all -> 0x0541 }
            n4.i3 r3 = r3.a()     // Catch:{ all -> 0x0541 }
            n4.g3 r3 = r3.f9828f     // Catch:{ all -> 0x0541 }
            java.lang.String r4 = "Error deleting application data. appId, error"
            n4.h3 r8 = n4.i3.p(r10)     // Catch:{ all -> 0x0541 }
            r3.c(r4, r8, r0)     // Catch:{ all -> 0x0541 }
        L_0x01f7:
            r15 = r6
            goto L_0x0200
        L_0x01f9:
            r21 = r3
        L_0x01fb:
            r22 = r4
            r23 = r6
            r6 = 0
        L_0x0200:
            if (r15 == 0) goto L_0x0259
            long r3 = r15.t()     // Catch:{ all -> 0x0541 }
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x021a
            long r3 = r15.t()     // Catch:{ all -> 0x0541 }
            r8 = r7
            long r6 = r2.f9777j     // Catch:{ all -> 0x0541 }
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x021b
            r14 = 1
            goto L_0x021c
        L_0x021a:
            r8 = r7
        L_0x021b:
            r14 = 0
        L_0x021c:
            java.lang.String r0 = r15.y()     // Catch:{ all -> 0x0541 }
            long r3 = r15.t()     // Catch:{ all -> 0x0541 }
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x0234
            if (r0 == 0) goto L_0x0234
            java.lang.String r3 = r2.f9770c     // Catch:{ all -> 0x0541 }
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x0541 }
            if (r3 != 0) goto L_0x0234
            r3 = 1
            goto L_0x0235
        L_0x0234:
            r3 = 0
        L_0x0235:
            r3 = r3 | r14
            if (r3 == 0) goto L_0x025a
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x0541 }
            r3.<init>()     // Catch:{ all -> 0x0541 }
            java.lang.String r4 = "_pv"
            r3.putString(r4, r0)     // Catch:{ all -> 0x0541 }
            n4.r r0 = new n4.r     // Catch:{ all -> 0x0541 }
            java.lang.String r15 = "_au"
            n4.p r4 = new n4.p     // Catch:{ all -> 0x0541 }
            r4.<init>(r3)     // Catch:{ all -> 0x0541 }
            java.lang.String r17 = "auto"
            r14 = r0
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x0541 }
            r1.i(r0, r2)     // Catch:{ all -> 0x0541 }
            goto L_0x025a
        L_0x0259:
            r8 = r7
        L_0x025a:
            r24.I(r25)     // Catch:{ all -> 0x0541 }
            if (r9 != 0) goto L_0x026e
            n4.i r0 = r1.f10284c     // Catch:{ all -> 0x0541 }
            H(r0)     // Catch:{ all -> 0x0541 }
            java.lang.String r3 = r2.f9768a     // Catch:{ all -> 0x0541 }
            java.lang.String r4 = "_f"
            n4.n r0 = r0.E(r3, r4)     // Catch:{ all -> 0x0541 }
            r14 = 0
            goto L_0x027c
        L_0x026e:
            n4.i r0 = r1.f10284c     // Catch:{ all -> 0x0541 }
            H(r0)     // Catch:{ all -> 0x0541 }
            java.lang.String r3 = r2.f9768a     // Catch:{ all -> 0x0541 }
            java.lang.String r4 = "_v"
            n4.n r0 = r0.E(r3, r4)     // Catch:{ all -> 0x0541 }
            r14 = 1
        L_0x027c:
            if (r0 != 0) goto L_0x0511
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            long r6 = r12 / r3
            r9 = 1
            long r6 = r6 + r9
            long r6 = r6 * r3
            java.lang.String r3 = "_dac"
            java.lang.String r4 = "_et"
            java.lang.String r11 = "_r"
            java.lang.String r15 = "_c"
            if (r14 != 0) goto L_0x04c9
            n4.z7 r0 = new n4.z7     // Catch:{ all -> 0x0541 }
            java.lang.String r18 = "_fot"
            java.lang.Long r17 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0541 }
            java.lang.String r19 = "auto"
            r14 = r0
            r6 = r15
            r15 = r12
            r14.<init>(r15, r17, r18, r19)     // Catch:{ all -> 0x0541 }
            r1.s(r0, r2)     // Catch:{ all -> 0x0541 }
            n4.m4 r0 = r24.d()     // Catch:{ all -> 0x0541 }
            r0.g()     // Catch:{ all -> 0x0541 }
            n4.z3 r7 = r1.k     // Catch:{ all -> 0x0541 }
            r3.o.h(r7)     // Catch:{ all -> 0x0541 }
            java.lang.String r0 = r2.f9768a     // Catch:{ all -> 0x0541 }
            if (r0 == 0) goto L_0x0385
            boolean r14 = r0.isEmpty()     // Catch:{ all -> 0x0541 }
            if (r14 == 0) goto L_0x02bc
            goto L_0x0385
        L_0x02bc:
            n4.n4 r14 = r7.f10345a     // Catch:{ all -> 0x0541 }
            n4.m4 r14 = r14.d()     // Catch:{ all -> 0x0541 }
            r14.g()     // Catch:{ all -> 0x0541 }
            boolean r14 = r7.a()     // Catch:{ all -> 0x0541 }
            if (r14 != 0) goto L_0x02d7
            n4.n4 r0 = r7.f10345a     // Catch:{ all -> 0x0541 }
            n4.i3 r0 = r0.a()     // Catch:{ all -> 0x0541 }
            n4.g3 r0 = r0.f9833l     // Catch:{ all -> 0x0541 }
            java.lang.String r5 = "Install Referrer Reporter is not available"
            goto L_0x038f
        L_0x02d7:
            n4.y3 r14 = new n4.y3     // Catch:{ all -> 0x0541 }
            r14.<init>(r7, r0)     // Catch:{ all -> 0x0541 }
            n4.n4 r0 = r7.f10345a     // Catch:{ all -> 0x0541 }
            n4.m4 r0 = r0.d()     // Catch:{ all -> 0x0541 }
            r0.g()     // Catch:{ all -> 0x0541 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x0541 }
            java.lang.String r15 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r15)     // Catch:{ all -> 0x0541 }
            android.content.ComponentName r15 = new android.content.ComponentName     // Catch:{ all -> 0x0541 }
            java.lang.String r9 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r15.<init>(r5, r9)     // Catch:{ all -> 0x0541 }
            r0.setComponent(r15)     // Catch:{ all -> 0x0541 }
            n4.n4 r9 = r7.f10345a     // Catch:{ all -> 0x0541 }
            android.content.Context r9 = r9.f9986a     // Catch:{ all -> 0x0541 }
            android.content.pm.PackageManager r9 = r9.getPackageManager()     // Catch:{ all -> 0x0541 }
            if (r9 != 0) goto L_0x030c
            n4.n4 r0 = r7.f10345a     // Catch:{ all -> 0x0541 }
            n4.i3 r0 = r0.a()     // Catch:{ all -> 0x0541 }
            n4.g3 r0 = r0.f9832j     // Catch:{ all -> 0x0541 }
            java.lang.String r5 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            goto L_0x038f
        L_0x030c:
            r10 = 0
            java.util.List r9 = r9.queryIntentServices(r0, r10)     // Catch:{ all -> 0x0541 }
            if (r9 == 0) goto L_0x037a
            boolean r15 = r9.isEmpty()     // Catch:{ all -> 0x0541 }
            if (r15 != 0) goto L_0x037a
            java.lang.Object r9 = r9.get(r10)     // Catch:{ all -> 0x0541 }
            android.content.pm.ResolveInfo r9 = (android.content.pm.ResolveInfo) r9     // Catch:{ all -> 0x0541 }
            android.content.pm.ServiceInfo r9 = r9.serviceInfo     // Catch:{ all -> 0x0541 }
            if (r9 == 0) goto L_0x0392
            java.lang.String r10 = r9.packageName     // Catch:{ all -> 0x0541 }
            java.lang.String r9 = r9.name     // Catch:{ all -> 0x0541 }
            if (r9 == 0) goto L_0x036f
            boolean r5 = r5.equals(r10)     // Catch:{ all -> 0x0541 }
            if (r5 == 0) goto L_0x036f
            boolean r5 = r7.a()     // Catch:{ all -> 0x0541 }
            if (r5 == 0) goto L_0x036f
            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x0541 }
            r5.<init>(r0)     // Catch:{ all -> 0x0541 }
            v3.a r0 = v3.a.b()     // Catch:{ RuntimeException -> 0x035c }
            n4.n4 r9 = r7.f10345a     // Catch:{ RuntimeException -> 0x035c }
            android.content.Context r9 = r9.f9986a     // Catch:{ RuntimeException -> 0x035c }
            r10 = 1
            boolean r0 = r0.a(r9, r5, r14, r10)     // Catch:{ RuntimeException -> 0x035c }
            n4.n4 r5 = r7.f10345a     // Catch:{ RuntimeException -> 0x035c }
            n4.i3 r5 = r5.a()     // Catch:{ RuntimeException -> 0x035c }
            n4.g3 r5 = r5.f9835n     // Catch:{ RuntimeException -> 0x035c }
            java.lang.String r9 = "Install Referrer Service is"
            if (r0 == 0) goto L_0x0356
            java.lang.String r0 = "available"
            goto L_0x0358
        L_0x0356:
            java.lang.String r0 = "not available"
        L_0x0358:
            r5.b(r9, r0)     // Catch:{ RuntimeException -> 0x035c }
            goto L_0x0392
        L_0x035c:
            r0 = move-exception
            n4.n4 r5 = r7.f10345a     // Catch:{ all -> 0x0541 }
            n4.i3 r5 = r5.a()     // Catch:{ all -> 0x0541 }
            n4.g3 r5 = r5.f9828f     // Catch:{ all -> 0x0541 }
            java.lang.String r7 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0541 }
            r5.b(r7, r0)     // Catch:{ all -> 0x0541 }
            goto L_0x0392
        L_0x036f:
            n4.n4 r0 = r7.f10345a     // Catch:{ all -> 0x0541 }
            n4.i3 r0 = r0.a()     // Catch:{ all -> 0x0541 }
            n4.g3 r0 = r0.f9831i     // Catch:{ all -> 0x0541 }
            java.lang.String r5 = "Play Store version 8.3.73 or higher required for Install Referrer"
            goto L_0x038f
        L_0x037a:
            n4.n4 r0 = r7.f10345a     // Catch:{ all -> 0x0541 }
            n4.i3 r0 = r0.a()     // Catch:{ all -> 0x0541 }
            n4.g3 r0 = r0.f9833l     // Catch:{ all -> 0x0541 }
            java.lang.String r5 = "Play Service for fetching Install Referrer is unavailable on device"
            goto L_0x038f
        L_0x0385:
            n4.n4 r0 = r7.f10345a     // Catch:{ all -> 0x0541 }
            n4.i3 r0 = r0.a()     // Catch:{ all -> 0x0541 }
            n4.g3 r0 = r0.f9832j     // Catch:{ all -> 0x0541 }
            java.lang.String r5 = "Install Referrer Reporter was called with invalid app package name"
        L_0x038f:
            r0.a(r5)     // Catch:{ all -> 0x0541 }
        L_0x0392:
            n4.m4 r0 = r24.d()     // Catch:{ all -> 0x0541 }
            r0.g()     // Catch:{ all -> 0x0541 }
            r24.g()     // Catch:{ all -> 0x0541 }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x0541 }
            r5.<init>()     // Catch:{ all -> 0x0541 }
            r9 = 1
            r5.putLong(r6, r9)     // Catch:{ all -> 0x0541 }
            r5.putLong(r11, r9)     // Catch:{ all -> 0x0541 }
            r6 = 0
            r5.putLong(r8, r6)     // Catch:{ all -> 0x0541 }
            r11 = r23
            r5.putLong(r11, r6)     // Catch:{ all -> 0x0541 }
            r15 = r22
            r5.putLong(r15, r6)     // Catch:{ all -> 0x0541 }
            r14 = r21
            r5.putLong(r14, r6)     // Catch:{ all -> 0x0541 }
            r5.putLong(r4, r9)     // Catch:{ all -> 0x0541 }
            boolean r0 = r2.f9782p     // Catch:{ all -> 0x0541 }
            if (r0 == 0) goto L_0x03c7
            r5.putLong(r3, r9)     // Catch:{ all -> 0x0541 }
        L_0x03c7:
            java.lang.String r3 = r2.f9768a     // Catch:{ all -> 0x0541 }
            r3.o.h(r3)     // Catch:{ all -> 0x0541 }
            n4.i r0 = r1.f10284c     // Catch:{ all -> 0x0541 }
            H(r0)     // Catch:{ all -> 0x0541 }
            r3.o.e(r3)     // Catch:{ all -> 0x0541 }
            r0.g()     // Catch:{ all -> 0x0541 }
            r0.h()     // Catch:{ all -> 0x0541 }
            long r6 = r0.x(r3)     // Catch:{ all -> 0x0541 }
            n4.n4 r0 = r1.f10292l     // Catch:{ all -> 0x0541 }
            android.content.Context r0 = r0.f9986a     // Catch:{ all -> 0x0541 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x0541 }
            if (r0 != 0) goto L_0x03f9
            n4.i3 r0 = r24.a()     // Catch:{ all -> 0x0541 }
            n4.g3 r0 = r0.f9828f     // Catch:{ all -> 0x0541 }
            java.lang.String r4 = "PackageManager is null, first open report might be inaccurate. appId"
            n4.h3 r3 = n4.i3.p(r3)     // Catch:{ all -> 0x0541 }
            r0.b(r4, r3)     // Catch:{ all -> 0x0541 }
            goto L_0x04a9
        L_0x03f9:
            n4.n4 r0 = r1.f10292l     // Catch:{ NameNotFoundException -> 0x0407 }
            android.content.Context r0 = r0.f9986a     // Catch:{ NameNotFoundException -> 0x0407 }
            y3.b r0 = y3.c.a(r0)     // Catch:{ NameNotFoundException -> 0x0407 }
            r4 = 0
            android.content.pm.PackageInfo r0 = r0.b(r4, r3)     // Catch:{ NameNotFoundException -> 0x0407 }
            goto L_0x0418
        L_0x0407:
            r0 = move-exception
            n4.i3 r4 = r24.a()     // Catch:{ all -> 0x0541 }
            n4.g3 r4 = r4.f9828f     // Catch:{ all -> 0x0541 }
            java.lang.String r9 = "Package info is null, first open report might be inaccurate. appId"
            n4.h3 r10 = n4.i3.p(r3)     // Catch:{ all -> 0x0541 }
            r4.c(r9, r10, r0)     // Catch:{ all -> 0x0541 }
            r0 = 0
        L_0x0418:
            if (r0 == 0) goto L_0x046f
            long r9 = r0.firstInstallTime     // Catch:{ all -> 0x0541 }
            r16 = 0
            int r4 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x046f
            r21 = r14
            r22 = r15
            long r14 = r0.lastUpdateTime     // Catch:{ all -> 0x0541 }
            int r0 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x044e
            n4.f r0 = r24.J()     // Catch:{ all -> 0x0541 }
            n4.v2 r4 = n4.w2.f10210c0     // Catch:{ all -> 0x0541 }
            r9 = 0
            boolean r0 = r0.o(r9, r4)     // Catch:{ all -> 0x0541 }
            if (r0 == 0) goto L_0x0447
            r14 = 0
            int r0 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x044c
            r14 = 1
            r5.putLong(r8, r14)     // Catch:{ all -> 0x0541 }
            r6 = 0
            goto L_0x044c
        L_0x0447:
            r14 = 1
            r5.putLong(r8, r14)     // Catch:{ all -> 0x0541 }
        L_0x044c:
            r14 = 0
            goto L_0x0450
        L_0x044e:
            r9 = 0
            r14 = 1
        L_0x0450:
            n4.z7 r0 = new n4.z7     // Catch:{ all -> 0x0541 }
            java.lang.String r18 = "_fi"
            r4 = 1
            if (r4 == r14) goto L_0x045a
            r14 = 0
            goto L_0x045c
        L_0x045a:
            r14 = 1
        L_0x045c:
            java.lang.Long r17 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0541 }
            java.lang.String r19 = "auto"
            r4 = r21
            r14 = r0
            r8 = r22
            r15 = r12
            r14.<init>(r15, r17, r18, r19)     // Catch:{ all -> 0x0541 }
            r1.s(r0, r2)     // Catch:{ all -> 0x0541 }
            goto L_0x0472
        L_0x046f:
            r4 = r14
            r8 = r15
            r9 = 0
        L_0x0472:
            n4.n4 r0 = r1.f10292l     // Catch:{ NameNotFoundException -> 0x0480 }
            android.content.Context r0 = r0.f9986a     // Catch:{ NameNotFoundException -> 0x0480 }
            y3.b r0 = y3.c.a(r0)     // Catch:{ NameNotFoundException -> 0x0480 }
            r10 = 0
            android.content.pm.ApplicationInfo r15 = r0.a(r10, r3)     // Catch:{ NameNotFoundException -> 0x0480 }
            goto L_0x0491
        L_0x0480:
            r0 = move-exception
            n4.i3 r10 = r24.a()     // Catch:{ all -> 0x0541 }
            n4.g3 r10 = r10.f9828f     // Catch:{ all -> 0x0541 }
            java.lang.String r14 = "Application info is null, first open report might be inaccurate. appId"
            n4.h3 r3 = n4.i3.p(r3)     // Catch:{ all -> 0x0541 }
            r10.c(r14, r3, r0)     // Catch:{ all -> 0x0541 }
            r15 = r9
        L_0x0491:
            if (r15 == 0) goto L_0x04a9
            int r0 = r15.flags     // Catch:{ all -> 0x0541 }
            r3 = 1
            r0 = r0 & r3
            if (r0 == 0) goto L_0x049e
            r9 = 1
            r5.putLong(r8, r9)     // Catch:{ all -> 0x0541 }
        L_0x049e:
            int r0 = r15.flags     // Catch:{ all -> 0x0541 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x04a9
            r8 = 1
            r5.putLong(r4, r8)     // Catch:{ all -> 0x0541 }
        L_0x04a9:
            r3 = 0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x04b2
            r5.putLong(r11, r6)     // Catch:{ all -> 0x0541 }
        L_0x04b2:
            n4.r r0 = new n4.r     // Catch:{ all -> 0x0541 }
            java.lang.String r15 = "_f"
            n4.p r3 = new n4.p     // Catch:{ all -> 0x0541 }
            r3.<init>(r5)     // Catch:{ all -> 0x0541 }
            java.lang.String r17 = "auto"
            r14 = r0
            r16 = r3
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x0541 }
            r1.k(r0, r2)     // Catch:{ all -> 0x0541 }
            goto L_0x0530
        L_0x04c9:
            r5 = r15
            n4.z7 r0 = new n4.z7     // Catch:{ all -> 0x0541 }
            java.lang.String r18 = "_fvt"
            java.lang.Long r17 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0541 }
            java.lang.String r19 = "auto"
            r14 = r0
            r15 = r12
            r14.<init>(r15, r17, r18, r19)     // Catch:{ all -> 0x0541 }
            r1.s(r0, r2)     // Catch:{ all -> 0x0541 }
            n4.m4 r0 = r24.d()     // Catch:{ all -> 0x0541 }
            r0.g()     // Catch:{ all -> 0x0541 }
            r24.g()     // Catch:{ all -> 0x0541 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0541 }
            r0.<init>()     // Catch:{ all -> 0x0541 }
            r6 = 1
            r0.putLong(r5, r6)     // Catch:{ all -> 0x0541 }
            r0.putLong(r11, r6)     // Catch:{ all -> 0x0541 }
            r0.putLong(r4, r6)     // Catch:{ all -> 0x0541 }
            boolean r4 = r2.f9782p     // Catch:{ all -> 0x0541 }
            if (r4 == 0) goto L_0x04fd
            r0.putLong(r3, r6)     // Catch:{ all -> 0x0541 }
        L_0x04fd:
            n4.r r3 = new n4.r     // Catch:{ all -> 0x0541 }
            java.lang.String r15 = "_v"
            n4.p r4 = new n4.p     // Catch:{ all -> 0x0541 }
            r4.<init>(r0)     // Catch:{ all -> 0x0541 }
            java.lang.String r17 = "auto"
            r14 = r3
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x0541 }
            goto L_0x052d
        L_0x0511:
            boolean r0 = r2.f9776i     // Catch:{ all -> 0x0541 }
            if (r0 == 0) goto L_0x0530
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0541 }
            r0.<init>()     // Catch:{ all -> 0x0541 }
            n4.r r3 = new n4.r     // Catch:{ all -> 0x0541 }
            java.lang.String r15 = "_cd"
            n4.p r4 = new n4.p     // Catch:{ all -> 0x0541 }
            r4.<init>(r0)     // Catch:{ all -> 0x0541 }
            java.lang.String r17 = "auto"
            r14 = r3
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x0541 }
        L_0x052d:
            r1.k(r3, r2)     // Catch:{ all -> 0x0541 }
        L_0x0530:
            n4.i r0 = r1.f10284c     // Catch:{ all -> 0x0541 }
            H(r0)     // Catch:{ all -> 0x0541 }
            r0.l()     // Catch:{ all -> 0x0541 }
            n4.i r0 = r1.f10284c
            H(r0)
            r0.N()
            return
        L_0x0541:
            r0 = move-exception
            n4.i r2 = r1.f10284c
            H(r2)
            r2.N()
            throw r0
        L_0x054b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.w7.m(n4.g8):void");
    }

    public final void n(c cVar, g8 g8Var) {
        Bundle bundle;
        o.h(cVar);
        o.e(cVar.f9640a);
        o.h(cVar.f9642c);
        o.e(cVar.f9642c.f10354b);
        d().g();
        g();
        if (G(g8Var)) {
            if (g8Var.f9775h) {
                i iVar = this.f10284c;
                H(iVar);
                iVar.M();
                try {
                    I(g8Var);
                    String str = cVar.f9640a;
                    o.h(str);
                    i iVar2 = this.f10284c;
                    H(iVar2);
                    c B2 = iVar2.B(str, cVar.f9642c.f10354b);
                    if (B2 != null) {
                        a().f9834m.c("Removing conditional user property", cVar.f9640a, this.f10292l.f9997m.f(cVar.f9642c.f10354b));
                        i iVar3 = this.f10284c;
                        H(iVar3);
                        iVar3.v(str, cVar.f9642c.f10354b);
                        if (B2.f9644e) {
                            i iVar4 = this.f10284c;
                            H(iVar4);
                            iVar4.k(str, cVar.f9642c.f10354b);
                        }
                        r rVar = cVar.k;
                        if (rVar != null) {
                            p pVar = rVar.f10086b;
                            if (pVar != null) {
                                bundle = pVar.x();
                            } else {
                                bundle = null;
                            }
                            Bundle bundle2 = bundle;
                            d8 P = P();
                            r rVar2 = cVar.k;
                            o.h(rVar2);
                            r n02 = P.n0(rVar2.f10085a, bundle2, B2.f9641b, cVar.k.f10088d, true);
                            o.h(n02);
                            u(n02, g8Var);
                        }
                    } else {
                        a().f9831i.c("Conditional user property doesn't exist", i3.p(cVar.f9640a), this.f10292l.f9997m.f(cVar.f9642c.f10354b));
                    }
                    i iVar5 = this.f10284c;
                    H(iVar5);
                    iVar5.l();
                } finally {
                    i iVar6 = this.f10284c;
                    H(iVar6);
                    iVar6.N();
                }
            } else {
                I(g8Var);
            }
        }
    }

    public final void o(String str, g8 g8Var) {
        long j10;
        d().g();
        g();
        if (G(g8Var)) {
            if (!g8Var.f9775h) {
                I(g8Var);
            } else if (!"_npa".equals(str) || g8Var.f9784r == null) {
                a().f9834m.b("Removing user property", this.f10292l.f9997m.f(str));
                i iVar = this.f10284c;
                H(iVar);
                iVar.M();
                try {
                    I(g8Var);
                    if ("_id".equals(str)) {
                        i iVar2 = this.f10284c;
                        H(iVar2);
                        String str2 = g8Var.f9768a;
                        o.h(str2);
                        iVar2.k(str2, "_lair");
                    }
                    i iVar3 = this.f10284c;
                    H(iVar3);
                    String str3 = g8Var.f9768a;
                    o.h(str3);
                    iVar3.k(str3, str);
                    i iVar4 = this.f10284c;
                    H(iVar4);
                    iVar4.l();
                    a().f9834m.b("User property removed", this.f10292l.f9997m.f(str));
                } finally {
                    i iVar5 = this.f10284c;
                    H(iVar5);
                    iVar5.N();
                }
            } else {
                a().f9834m.a("Falling back to manifest metadata value for ad personalization");
                ((a) c()).getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (true != g8Var.f9784r.booleanValue()) {
                    j10 = 0;
                } else {
                    j10 = 1;
                }
                s(new z7(currentTimeMillis, Long.valueOf(j10), "_npa", "auto"), g8Var);
            }
        }
    }

    public final void p(g8 g8Var) {
        if (this.f10302x != null) {
            ArrayList arrayList = new ArrayList();
            this.f10303y = arrayList;
            arrayList.addAll(this.f10302x);
        }
        i iVar = this.f10284c;
        H(iVar);
        String str = g8Var.f9768a;
        o.h(str);
        o.e(str);
        iVar.g();
        iVar.h();
        try {
            SQLiteDatabase z9 = iVar.z();
            String[] strArr = {str};
            int delete = z9.delete("apps", "app_id=?", strArr) + z9.delete("events", "app_id=?", strArr) + z9.delete("user_attributes", "app_id=?", strArr) + z9.delete("conditional_properties", "app_id=?", strArr) + z9.delete("raw_events", "app_id=?", strArr) + z9.delete("raw_events_metadata", "app_id=?", strArr) + z9.delete("queue", "app_id=?", strArr) + z9.delete("audience_filter_values", "app_id=?", strArr) + z9.delete("main_event_params", "app_id=?", strArr) + z9.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                iVar.f9600a.a().f9835n.c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e10) {
            iVar.f9600a.a().f9828f.c("Error resetting analytics data. appId, error", i3.p(str), e10);
        }
        if (g8Var.f9775h) {
            m(g8Var);
        }
    }

    public final void q(c cVar, g8 g8Var) {
        g3 g3Var;
        String str;
        Object p5;
        String f10;
        z7 z7Var;
        g3 g3Var2;
        String str2;
        Object p10;
        String f11;
        r rVar;
        o.h(cVar);
        o.e(cVar.f9640a);
        o.h(cVar.f9641b);
        o.h(cVar.f9642c);
        o.e(cVar.f9642c.f10354b);
        d().g();
        g();
        if (G(g8Var)) {
            if (!g8Var.f9775h) {
                I(g8Var);
                return;
            }
            c cVar2 = new c(cVar);
            boolean z9 = false;
            cVar2.f9644e = false;
            i iVar = this.f10284c;
            H(iVar);
            iVar.M();
            try {
                i iVar2 = this.f10284c;
                H(iVar2);
                String str3 = cVar2.f9640a;
                o.h(str3);
                c B2 = iVar2.B(str3, cVar2.f9642c.f10354b);
                if (B2 != null && !B2.f9641b.equals(cVar2.f9641b)) {
                    a().f9831i.d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f10292l.f9997m.f(cVar2.f9642c.f10354b), cVar2.f9641b, B2.f9641b);
                }
                if (B2 != null && B2.f9644e) {
                    cVar2.f9641b = B2.f9641b;
                    cVar2.f9643d = B2.f9643d;
                    cVar2.f9647h = B2.f9647h;
                    cVar2.f9645f = B2.f9645f;
                    cVar2.f9648i = B2.f9648i;
                    cVar2.f9644e = true;
                    z7 z7Var2 = cVar2.f9642c;
                    cVar2.f9642c = new z7(B2.f9642c.f10355c, z7Var2.x(), z7Var2.f10354b, B2.f9642c.f10358f);
                } else if (TextUtils.isEmpty(cVar2.f9645f)) {
                    z7 z7Var3 = cVar2.f9642c;
                    cVar2.f9642c = new z7(cVar2.f9643d, z7Var3.x(), z7Var3.f10354b, cVar2.f9642c.f10358f);
                    cVar2.f9644e = true;
                    z9 = true;
                }
                if (cVar2.f9644e) {
                    z7 z7Var4 = cVar2.f9642c;
                    String str4 = cVar2.f9640a;
                    o.h(str4);
                    String str5 = cVar2.f9641b;
                    String str6 = z7Var4.f10354b;
                    long j10 = z7Var4.f10355c;
                    Object x9 = z7Var4.x();
                    o.h(x9);
                    b8 b8Var = new b8(str4, str5, str6, j10, x9);
                    i iVar3 = this.f10284c;
                    H(iVar3);
                    if (iVar3.r(b8Var)) {
                        g3Var2 = a().f9834m;
                        str2 = "User property updated immediately";
                        p10 = cVar2.f9640a;
                        f11 = this.f10292l.f9997m.f(b8Var.f9637c);
                    } else {
                        g3Var2 = a().f9828f;
                        str2 = "(2)Too many active user properties, ignoring";
                        p10 = i3.p(cVar2.f9640a);
                        f11 = this.f10292l.f9997m.f(b8Var.f9637c);
                    }
                    g3Var2.d(str2, p10, f11, b8Var.f9639e);
                    if (z9 && (rVar = cVar2.f9648i) != null) {
                        u(new r(rVar, cVar2.f9643d), g8Var);
                    }
                }
                i iVar4 = this.f10284c;
                H(iVar4);
                if (iVar4.q(cVar2)) {
                    g3Var = a().f9834m;
                    str = "Conditional property added";
                    p5 = cVar2.f9640a;
                    f10 = this.f10292l.f9997m.f(cVar2.f9642c.f10354b);
                    z7Var = cVar2.f9642c;
                } else {
                    g3Var = a().f9828f;
                    str = "Too many conditional properties, ignoring";
                    p5 = i3.p(cVar2.f9640a);
                    f10 = this.f10292l.f9997m.f(cVar2.f9642c.f10354b);
                    z7Var = cVar2.f9642c;
                }
                g3Var.d(str, p5, f10, z7Var.x());
                i iVar5 = this.f10284c;
                H(iVar5);
                iVar5.l();
            } finally {
                i iVar6 = this.f10284c;
                H(iVar6);
                iVar6.N();
            }
        }
    }

    public final void r(String str, f5 f5Var) {
        d().g();
        g();
        this.A.put(str, f5Var);
        i iVar = this.f10284c;
        H(iVar);
        o.h(str);
        iVar.g();
        iVar.h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", f5Var.e());
        try {
            if (iVar.z().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                iVar.f9600a.a().f9828f.b("Failed to insert/update consent setting (got -1). appId", i3.p(str));
            }
        } catch (SQLiteException e10) {
            iVar.f9600a.a().f9828f.c("Error storing consent setting. appId, error", i3.p(str), e10);
        }
    }

    public final void s(z7 z7Var, g8 g8Var) {
        long j10;
        int i10;
        z7 z7Var2 = z7Var;
        g8 g8Var2 = g8Var;
        d().g();
        g();
        if (G(g8Var)) {
            if (!g8Var2.f9775h) {
                I(g8Var2);
                return;
            }
            int g02 = P().g0(z7Var2.f10354b);
            int i11 = 0;
            if (g02 != 0) {
                d8 P = P();
                String str = z7Var2.f10354b;
                J();
                P.getClass();
                String n2 = d8.n(24, str, true);
                String str2 = z7Var2.f10354b;
                if (str2 != null) {
                    i10 = str2.length();
                } else {
                    i10 = 0;
                }
                d8 P2 = P();
                t tVar = this.E;
                String str3 = g8Var2.f9768a;
                P2.getClass();
                d8.x(tVar, str3, g02, "_ev", n2, i10);
                return;
            }
            int c02 = P().c0(z7Var.x(), z7Var2.f10354b);
            if (c02 != 0) {
                d8 P3 = P();
                String str4 = z7Var2.f10354b;
                J();
                P3.getClass();
                String n10 = d8.n(24, str4, true);
                Object x9 = z7Var.x();
                if (x9 != null && ((x9 instanceof String) || (x9 instanceof CharSequence))) {
                    i11 = x9.toString().length();
                }
                d8 P4 = P();
                t tVar2 = this.E;
                String str5 = g8Var2.f9768a;
                P4.getClass();
                d8.x(tVar2, str5, c02, "_ev", n10, i11);
                return;
            }
            Object l6 = P().l(z7Var.x(), z7Var2.f10354b);
            if (l6 != null) {
                long j11 = 0;
                if ("_sid".equals(z7Var2.f10354b)) {
                    long j12 = z7Var2.f10355c;
                    String str6 = z7Var2.f10358f;
                    String str7 = g8Var2.f9768a;
                    o.h(str7);
                    i iVar = this.f10284c;
                    H(iVar);
                    b8 F2 = iVar.F(str7, "_sno");
                    if (F2 != null) {
                        Object obj = F2.f9639e;
                        if (obj instanceof Long) {
                            j10 = ((Long) obj).longValue();
                            s(new z7(j12, Long.valueOf(j10 + 1), "_sno", str6), g8Var2);
                        }
                    }
                    if (F2 != null) {
                        a().f9831i.b("Retrieved last session number from database does not contain a valid (long) value", F2.f9639e);
                    }
                    i iVar2 = this.f10284c;
                    H(iVar2);
                    n E2 = iVar2.E(str7, "_s");
                    if (E2 != null) {
                        j10 = E2.f9975c;
                        a().f9835n.b("Backfill the session number. Last used session number", Long.valueOf(j10));
                    } else {
                        j10 = 0;
                    }
                    s(new z7(j12, Long.valueOf(j10 + 1), "_sno", str6), g8Var2);
                }
                String str8 = g8Var2.f9768a;
                o.h(str8);
                String str9 = z7Var2.f10358f;
                o.h(str9);
                b8 b8Var = new b8(str8, str9, z7Var2.f10354b, z7Var2.f10355c, l6);
                a().f9835n.c("Setting user property", this.f10292l.f9997m.f(b8Var.f9637c), l6);
                i iVar3 = this.f10284c;
                H(iVar3);
                iVar3.M();
                try {
                    if ("_id".equals(b8Var.f9637c)) {
                        i iVar4 = this.f10284c;
                        H(iVar4);
                        b8 F3 = iVar4.F(g8Var2.f9768a, "_id");
                        if (F3 != null && !b8Var.f9639e.equals(F3.f9639e)) {
                            i iVar5 = this.f10284c;
                            H(iVar5);
                            iVar5.k(g8Var2.f9768a, "_lair");
                        }
                    }
                    I(g8Var2);
                    i iVar6 = this.f10284c;
                    H(iVar6);
                    boolean r4 = iVar6.r(b8Var);
                    if (J().o((String) null, w2.f10251z0) && "_sid".equals(z7Var2.f10354b)) {
                        y7 y7Var = this.f10288g;
                        H(y7Var);
                        String str10 = g8Var2.f9788x;
                        if (!TextUtils.isEmpty(str10)) {
                            j11 = y7Var.v(str10.getBytes(Charset.forName("UTF-8")));
                        }
                        long j13 = j11;
                        i iVar7 = this.f10284c;
                        H(iVar7);
                        d5 A2 = iVar7.A(g8Var2.f9768a);
                        if (A2 != null) {
                            A2.f9674a.d().g();
                            boolean z9 = A2.F;
                            if (A2.f9694x != j13) {
                                i11 = 1;
                            }
                            A2.F = z9 | i11;
                            A2.f9694x = j13;
                            A2.f9674a.d().g();
                            if (A2.F) {
                                i iVar8 = this.f10284c;
                                H(iVar8);
                                iVar8.m(A2);
                            }
                        }
                    }
                    i iVar9 = this.f10284c;
                    H(iVar9);
                    iVar9.l();
                    if (!r4) {
                        a().f9828f.c("Too many unique user properties are set. Ignoring user property", this.f10292l.f9997m.f(b8Var.f9637c), b8Var.f9639e);
                        d8 P5 = P();
                        t tVar3 = this.E;
                        String str11 = g8Var2.f9768a;
                        P5.getClass();
                        d8.x(tVar3, str11, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    i iVar10 = this.f10284c;
                    H(iVar10);
                    iVar10.N();
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:302|303) */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0273, code lost:
        r9 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:?, code lost:
        r9 = r9.subList(0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0308, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:?, code lost:
        a().l().c("Failed to parse upload URL. Not uploading. appId", n4.i3.p(r7), r6.c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0760, code lost:
        if (r3 != null) goto L_0x0762;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0115, code lost:
        if (r12 != null) goto L_0x0117;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:302:0x06d8 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02a1 A[SYNTHETIC, Splitter:B:153:0x02a1] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02aa A[Catch:{ all -> 0x0620, all -> 0x078a }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0430 A[Catch:{ all -> 0x0620, all -> 0x078a }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x044e A[Catch:{ all -> 0x0620, all -> 0x078a }] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0474 A[Catch:{ all -> 0x0620, all -> 0x078a }] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x04d4 A[Catch:{ all -> 0x0620, all -> 0x078a }] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x04d6 A[Catch:{ all -> 0x0620, all -> 0x078a }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x050f A[Catch:{ all -> 0x0620, all -> 0x078a }] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0511 A[Catch:{ all -> 0x0620, all -> 0x078a }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0514 A[Catch:{ all -> 0x0620, all -> 0x078a }] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0542 A[Catch:{ all -> 0x0620, all -> 0x078a }] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0544 A[Catch:{ all -> 0x0620, all -> 0x078a }] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0547 A[Catch:{ all -> 0x0620, all -> 0x078a }] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x05a1 A[Catch:{ all -> 0x0620, all -> 0x078a }] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x05c6 A[Catch:{ all -> 0x0620, all -> 0x078a }] */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x05c8 A[Catch:{ all -> 0x0620, all -> 0x078a }] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x05cb A[Catch:{ all -> 0x0620, all -> 0x078a }] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x05d7 A[Catch:{ all -> 0x0620, all -> 0x078a }] */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x05ed A[Catch:{ all -> 0x0620, all -> 0x078a }] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x06f4 A[Catch:{ all -> 0x0620, all -> 0x078a }] */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x076c A[Catch:{ all -> 0x0620, all -> 0x078a }] */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0786 A[SYNTHETIC, Splitter:B:342:0x0786] */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x0603 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0122 A[Catch:{ all -> 0x011d, all -> 0x078d }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:139:0x0270=Splitter:B:139:0x0270, B:328:0x0762=Splitter:B:328:0x0762, B:302:0x06d8=Splitter:B:302:0x06d8, B:150:0x028a=Splitter:B:150:0x028a, B:181:0x030f=Splitter:B:181:0x030f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t() {
        /*
            r24 = this;
            r1 = r24
            n4.e5 r2 = n4.e5.AD_STORAGE
            n4.m4 r3 = r24.d()
            r3.g()
            r24.g()
            r3 = 1
            r1.u = r3
            r4 = 0
            n4.n4 r5 = r1.f10292l     // Catch:{ all -> 0x078d }
            r5.getClass()     // Catch:{ all -> 0x078d }
            n4.n4 r5 = r1.f10292l     // Catch:{ all -> 0x078d }
            n4.a7 r5 = r5.v()     // Catch:{ all -> 0x078d }
            java.lang.Boolean r5 = r5.f9614e     // Catch:{ all -> 0x078d }
            if (r5 != 0) goto L_0x002a
            n4.i3 r2 = r24.a()     // Catch:{ all -> 0x078d }
            n4.g3 r2 = r2.f9831i     // Catch:{ all -> 0x078d }
            java.lang.String r3 = "Upload data called on the client side before use of service was decided"
            goto L_0x0055
        L_0x002a:
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x078d }
            if (r5 == 0) goto L_0x0039
            n4.i3 r2 = r24.a()     // Catch:{ all -> 0x078d }
            n4.g3 r2 = r2.f9828f     // Catch:{ all -> 0x078d }
            java.lang.String r3 = "Upload called in the client side when service should be used"
            goto L_0x0055
        L_0x0039:
            long r5 = r1.f10295o     // Catch:{ all -> 0x078d }
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0042
            goto L_0x006f
        L_0x0042:
            n4.m4 r5 = r24.d()     // Catch:{ all -> 0x078d }
            r5.g()     // Catch:{ all -> 0x078d }
            java.util.ArrayList r5 = r1.f10302x     // Catch:{ all -> 0x078d }
            if (r5 == 0) goto L_0x0059
            n4.i3 r2 = r24.a()     // Catch:{ all -> 0x078d }
            n4.g3 r2 = r2.f9835n     // Catch:{ all -> 0x078d }
            java.lang.String r3 = "Uploading requested multiple times"
        L_0x0055:
            r2.a(r3)     // Catch:{ all -> 0x078d }
            goto L_0x0072
        L_0x0059:
            n4.n3 r5 = r1.f10283b     // Catch:{ all -> 0x078d }
            H(r5)     // Catch:{ all -> 0x078d }
            boolean r5 = r5.k()     // Catch:{ all -> 0x078d }
            if (r5 != 0) goto L_0x0076
            n4.i3 r2 = r24.a()     // Catch:{ all -> 0x078d }
            n4.g3 r2 = r2.f9835n     // Catch:{ all -> 0x078d }
            java.lang.String r3 = "Network not connected, ignoring upload request"
            r2.a(r3)     // Catch:{ all -> 0x078d }
        L_0x006f:
            r24.C()     // Catch:{ all -> 0x078d }
        L_0x0072:
            r1.u = r4
            goto L_0x077d
        L_0x0076:
            w3.b r5 = r24.c()     // Catch:{ all -> 0x078d }
            y3.a r5 = (y3.a) r5     // Catch:{ all -> 0x078a }
            r5.getClass()     // Catch:{ all -> 0x078a }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x078a }
            n4.f r9 = r24.J()     // Catch:{ all -> 0x078d }
            n4.v2 r10 = n4.w2.R     // Catch:{ all -> 0x078d }
            r11 = 0
            int r9 = r9.i(r11, r10)     // Catch:{ all -> 0x078d }
            r24.J()     // Catch:{ all -> 0x078d }
            n4.v2 r10 = n4.w2.f10213e     // Catch:{ all -> 0x078d }
            java.lang.Object r10 = r10.a(r11)     // Catch:{ all -> 0x078d }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x078d }
            long r12 = r10.longValue()     // Catch:{ all -> 0x078d }
            long r12 = r5 - r12
            r10 = r4
        L_0x00a0:
            if (r10 >= r9) goto L_0x00ab
            boolean r14 = r1.D(r12)     // Catch:{ all -> 0x078d }
            if (r14 == 0) goto L_0x00ab
            int r10 = r10 + 1
            goto L_0x00a0
        L_0x00ab:
            n4.d7 r9 = r1.f10290i     // Catch:{ all -> 0x078d }
            n4.t3 r9 = r9.f9703g     // Catch:{ all -> 0x078d }
            long r9 = r9.a()     // Catch:{ all -> 0x078d }
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x00cc
            n4.i3 r7 = r24.a()     // Catch:{ all -> 0x078d }
            n4.g3 r7 = r7.f9834m     // Catch:{ all -> 0x078d }
            java.lang.String r8 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r9 = r5 - r9
            long r9 = java.lang.Math.abs(r9)     // Catch:{ all -> 0x078d }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x078d }
            r7.b(r8, r9)     // Catch:{ all -> 0x078d }
        L_0x00cc:
            n4.i r7 = r1.f10284c     // Catch:{ all -> 0x078d }
            H(r7)     // Catch:{ all -> 0x078d }
            java.lang.String r7 = r7.H()     // Catch:{ all -> 0x078d }
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x078d }
            r9 = -1
            if (r8 != 0) goto L_0x06f8
            long r12 = r1.f10304z     // Catch:{ all -> 0x078d }
            int r8 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0126
            n4.i r8 = r1.f10284c     // Catch:{ all -> 0x078d }
            H(r8)     // Catch:{ all -> 0x078d }
            android.database.sqlite.SQLiteDatabase r12 = r8.z()     // Catch:{ SQLiteException -> 0x0105, all -> 0x0102 }
            java.lang.String r13 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r12 = r12.rawQuery(r13, r11)     // Catch:{ SQLiteException -> 0x0105, all -> 0x0102 }
            boolean r13 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x00ff }
            if (r13 != 0) goto L_0x00f9
            goto L_0x0117
        L_0x00f9:
            long r8 = r12.getLong(r4)     // Catch:{ SQLiteException -> 0x00ff }
            r9 = r8
            goto L_0x0117
        L_0x00ff:
            r0 = move-exception
            r13 = r0
            goto L_0x0108
        L_0x0102:
            r0 = move-exception
            r2 = r0
            goto L_0x0120
        L_0x0105:
            r0 = move-exception
            r13 = r0
            r12 = r11
        L_0x0108:
            n4.n4 r8 = r8.f9600a     // Catch:{ all -> 0x011d }
            n4.i3 r8 = r8.a()     // Catch:{ all -> 0x011d }
            n4.g3 r8 = r8.f9828f     // Catch:{ all -> 0x011d }
            java.lang.String r14 = "Error querying raw events"
            r8.b(r14, r13)     // Catch:{ all -> 0x011d }
            if (r12 == 0) goto L_0x011a
        L_0x0117:
            r12.close()     // Catch:{ all -> 0x078d }
        L_0x011a:
            r1.f10304z = r9     // Catch:{ all -> 0x078d }
            goto L_0x0126
        L_0x011d:
            r0 = move-exception
            r2 = r0
            r11 = r12
        L_0x0120:
            if (r11 == 0) goto L_0x0125
            r11.close()     // Catch:{ all -> 0x078d }
        L_0x0125:
            throw r2     // Catch:{ all -> 0x078d }
        L_0x0126:
            n4.f r8 = r24.J()     // Catch:{ all -> 0x078d }
            n4.v2 r9 = n4.w2.f10219h     // Catch:{ all -> 0x078d }
            int r8 = r8.i(r7, r9)     // Catch:{ all -> 0x078d }
            n4.f r9 = r24.J()     // Catch:{ all -> 0x078d }
            n4.v2 r10 = n4.w2.f10221i     // Catch:{ all -> 0x078d }
            int r9 = r9.i(r7, r10)     // Catch:{ all -> 0x078d }
            int r9 = java.lang.Math.max(r4, r9)     // Catch:{ all -> 0x078d }
            n4.i r10 = r1.f10284c     // Catch:{ all -> 0x078d }
            H(r10)     // Catch:{ all -> 0x078d }
            r10.g()     // Catch:{ all -> 0x078d }
            r10.h()     // Catch:{ all -> 0x078d }
            if (r8 <= 0) goto L_0x014d
            r12 = r3
            goto L_0x014e
        L_0x014d:
            r12 = r4
        L_0x014e:
            r3.o.b(r12)     // Catch:{ all -> 0x078d }
            if (r9 <= 0) goto L_0x0155
            r12 = r3
            goto L_0x0156
        L_0x0155:
            r12 = r4
        L_0x0156:
            r3.o.b(r12)     // Catch:{ all -> 0x078d }
            r3.o.e(r7)     // Catch:{ all -> 0x078d }
            android.database.sqlite.SQLiteDatabase r13 = r10.z()     // Catch:{ SQLiteException -> 0x0283, all -> 0x027e }
            java.lang.String r14 = "queue"
            java.lang.String r15 = "rowid"
            java.lang.String r11 = "data"
            java.lang.String r12 = "retry_count"
            java.lang.String[] r15 = new java.lang.String[]{r15, r11, r12}     // Catch:{ SQLiteException -> 0x0283, all -> 0x027e }
            java.lang.String r16 = "app_id=?"
            java.lang.String[] r11 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0283, all -> 0x027e }
            r11[r4] = r7     // Catch:{ SQLiteException -> 0x0283, all -> 0x027e }
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            java.lang.String r21 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x0283, all -> 0x027e }
            r17 = r11
            android.database.Cursor r8 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x0283, all -> 0x027e }
            boolean r11 = r8.moveToFirst()     // Catch:{ SQLiteException -> 0x0278 }
            if (r11 != 0) goto L_0x0195
            java.util.List r9 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x0278 }
            r8.close()     // Catch:{ all -> 0x078d }
            r20 = r2
            r17 = r5
            goto L_0x02a4
        L_0x0195:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0278 }
            r11.<init>()     // Catch:{ SQLiteException -> 0x0278 }
            r12 = r4
        L_0x019b:
            long r13 = r8.getLong(r4)     // Catch:{ SQLiteException -> 0x0278 }
            byte[] r15 = r8.getBlob(r3)     // Catch:{ IOException -> 0x0249 }
            n4.w7 r3 = r10.f10066b     // Catch:{ IOException -> 0x0249 }
            n4.y7 r3 = r3.f10288g     // Catch:{ IOException -> 0x0249 }
            H(r3)     // Catch:{ IOException -> 0x0249 }
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0230 }
            r4.<init>(r15)     // Catch:{ IOException -> 0x0230 }
            java.util.zip.GZIPInputStream r15 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0230 }
            r15.<init>(r4)     // Catch:{ IOException -> 0x0230 }
            r17 = r5
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x022b, SQLiteException -> 0x0227 }
            r5.<init>()     // Catch:{ IOException -> 0x022b, SQLiteException -> 0x0227 }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ IOException -> 0x022b, SQLiteException -> 0x0227 }
            r20 = r2
        L_0x01c1:
            int r2 = r15.read(r6)     // Catch:{ IOException -> 0x0225 }
            if (r2 > 0) goto L_0x021c
            r15.close()     // Catch:{ IOException -> 0x0225 }
            r4.close()     // Catch:{ IOException -> 0x0225 }
            byte[] r2 = r5.toByteArray()     // Catch:{ IOException -> 0x0225 }
            boolean r3 = r11.isEmpty()     // Catch:{ SQLiteException -> 0x0275 }
            if (r3 != 0) goto L_0x01dd
            int r3 = r2.length     // Catch:{ SQLiteException -> 0x0275 }
            int r3 = r3 + r12
            if (r3 <= r9) goto L_0x01dd
            goto L_0x0270
        L_0x01dd:
            j4.s3 r3 = j4.t3.G1()     // Catch:{ IOException -> 0x0209 }
            j4.i7 r3 = n4.y7.z(r3, r2)     // Catch:{ IOException -> 0x0209 }
            j4.s3 r3 = (j4.s3) r3     // Catch:{ IOException -> 0x0209 }
            r4 = 2
            boolean r5 = r8.isNull(r4)     // Catch:{ SQLiteException -> 0x0275 }
            if (r5 != 0) goto L_0x01f5
            int r5 = r8.getInt(r4)     // Catch:{ SQLiteException -> 0x0275 }
            r3.o(r5)     // Catch:{ SQLiteException -> 0x0275 }
        L_0x01f5:
            int r2 = r2.length     // Catch:{ SQLiteException -> 0x0275 }
            int r12 = r12 + r2
            j4.m7 r2 = r3.h()     // Catch:{ SQLiteException -> 0x0275 }
            j4.t3 r2 = (j4.t3) r2     // Catch:{ SQLiteException -> 0x0275 }
            java.lang.Long r3 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteException -> 0x0275 }
            android.util.Pair r2 = android.util.Pair.create(r2, r3)     // Catch:{ SQLiteException -> 0x0275 }
            r11.add(r2)     // Catch:{ SQLiteException -> 0x0275 }
            goto L_0x025f
        L_0x0209:
            r0 = move-exception
            r2 = r0
            n4.n4 r3 = r10.f9600a     // Catch:{ SQLiteException -> 0x0275 }
            n4.i3 r3 = r3.a()     // Catch:{ SQLiteException -> 0x0275 }
            n4.g3 r3 = r3.l()     // Catch:{ SQLiteException -> 0x0275 }
            java.lang.String r4 = "Failed to merge queued bundle. appId"
        L_0x0217:
            n4.h3 r5 = n4.i3.p(r7)     // Catch:{ SQLiteException -> 0x0275 }
            goto L_0x025c
        L_0x021c:
            r21 = r4
            r4 = 0
            r5.write(r6, r4, r2)     // Catch:{ IOException -> 0x0225 }
            r4 = r21
            goto L_0x01c1
        L_0x0225:
            r0 = move-exception
            goto L_0x022e
        L_0x0227:
            r0 = move-exception
            r20 = r2
            goto L_0x0276
        L_0x022b:
            r0 = move-exception
            r20 = r2
        L_0x022e:
            r2 = r0
            goto L_0x0236
        L_0x0230:
            r0 = move-exception
            r20 = r2
            r17 = r5
            goto L_0x022e
        L_0x0236:
            n4.n4 r3 = r3.f9600a     // Catch:{ IOException -> 0x0246 }
            n4.i3 r3 = r3.a()     // Catch:{ IOException -> 0x0246 }
            n4.g3 r3 = r3.l()     // Catch:{ IOException -> 0x0246 }
            java.lang.String r4 = "Failed to ungzip content"
            r3.b(r4, r2)     // Catch:{ IOException -> 0x0246 }
            throw r2     // Catch:{ IOException -> 0x0246 }
        L_0x0246:
            r0 = move-exception
        L_0x0247:
            r2 = r0
            goto L_0x024f
        L_0x0249:
            r0 = move-exception
            r20 = r2
            r17 = r5
            goto L_0x0247
        L_0x024f:
            n4.n4 r3 = r10.f9600a     // Catch:{ SQLiteException -> 0x0275 }
            n4.i3 r3 = r3.a()     // Catch:{ SQLiteException -> 0x0275 }
            n4.g3 r3 = r3.l()     // Catch:{ SQLiteException -> 0x0275 }
            java.lang.String r4 = "Failed to unzip queued bundle. appId"
            goto L_0x0217
        L_0x025c:
            r3.c(r4, r5, r2)     // Catch:{ SQLiteException -> 0x0275 }
        L_0x025f:
            boolean r2 = r8.moveToNext()     // Catch:{ SQLiteException -> 0x0275 }
            if (r2 == 0) goto L_0x0270
            if (r12 <= r9) goto L_0x0268
            goto L_0x0270
        L_0x0268:
            r5 = r17
            r2 = r20
            r3 = 1
            r4 = 0
            goto L_0x019b
        L_0x0270:
            r8.close()     // Catch:{ all -> 0x078a }
            r9 = r11
            goto L_0x02a4
        L_0x0275:
            r0 = move-exception
        L_0x0276:
            r2 = r0
            goto L_0x028a
        L_0x0278:
            r0 = move-exception
            r20 = r2
            r17 = r5
            goto L_0x0276
        L_0x027e:
            r0 = move-exception
            r2 = r0
            r11 = 0
            goto L_0x06f2
        L_0x0283:
            r0 = move-exception
            r20 = r2
            r17 = r5
            r2 = r0
            r8 = 0
        L_0x028a:
            n4.n4 r3 = r10.f9600a     // Catch:{ all -> 0x06ef }
            n4.i3 r3 = r3.a()     // Catch:{ all -> 0x06ef }
            n4.g3 r3 = r3.f9828f     // Catch:{ all -> 0x06ef }
            java.lang.String r4 = "Error querying bundles. appId"
            n4.h3 r5 = n4.i3.p(r7)     // Catch:{ all -> 0x06ef }
            r3.c(r4, r5, r2)     // Catch:{ all -> 0x06ef }
            java.util.List r9 = java.util.Collections.emptyList()     // Catch:{ all -> 0x06ef }
            if (r8 == 0) goto L_0x02a4
            r8.close()     // Catch:{ all -> 0x078a }
        L_0x02a4:
            boolean r2 = r9.isEmpty()     // Catch:{ all -> 0x078a }
            if (r2 != 0) goto L_0x077a
            n4.f5 r2 = r1.M(r7)     // Catch:{ all -> 0x078a }
            r3 = r20
            boolean r2 = r2.f(r3)     // Catch:{ all -> 0x078a }
            if (r2 == 0) goto L_0x030f
            java.util.Iterator r2 = r9.iterator()     // Catch:{ all -> 0x078a }
        L_0x02ba:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x078a }
            if (r4 == 0) goto L_0x02d9
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x078a }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x078a }
            java.lang.Object r4 = r4.first     // Catch:{ all -> 0x078a }
            j4.t3 r4 = (j4.t3) r4     // Catch:{ all -> 0x078a }
            java.lang.String r5 = r4.D()     // Catch:{ all -> 0x078a }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x078a }
            if (r5 != 0) goto L_0x02ba
            java.lang.String r2 = r4.D()     // Catch:{ all -> 0x078a }
            goto L_0x02da
        L_0x02d9:
            r2 = 0
        L_0x02da:
            if (r2 == 0) goto L_0x030f
            r4 = 0
        L_0x02dd:
            int r5 = r9.size()     // Catch:{ all -> 0x078a }
            if (r4 >= r5) goto L_0x030f
            java.lang.Object r5 = r9.get(r4)     // Catch:{ all -> 0x078a }
            android.util.Pair r5 = (android.util.Pair) r5     // Catch:{ all -> 0x078a }
            java.lang.Object r5 = r5.first     // Catch:{ all -> 0x078a }
            j4.t3 r5 = (j4.t3) r5     // Catch:{ all -> 0x078a }
            java.lang.String r6 = r5.D()     // Catch:{ all -> 0x078a }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x078a }
            if (r6 == 0) goto L_0x02f8
            goto L_0x030c
        L_0x02f8:
            java.lang.String r5 = r5.D()     // Catch:{ all -> 0x078a }
            boolean r5 = r5.equals(r2)     // Catch:{ all -> 0x078a }
            if (r5 != 0) goto L_0x030c
            r2 = 0
            java.util.List r9 = r9.subList(r2, r4)     // Catch:{ all -> 0x0308 }
            goto L_0x030f
        L_0x0308:
            r0 = move-exception
        L_0x0309:
            r2 = r0
            goto L_0x0790
        L_0x030c:
            int r4 = r4 + 1
            goto L_0x02dd
        L_0x030f:
            j4.q3 r2 = j4.r3.t()     // Catch:{ all -> 0x078a }
            int r4 = r9.size()     // Catch:{ all -> 0x078a }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x078a }
            int r6 = r9.size()     // Catch:{ all -> 0x078a }
            r5.<init>(r6)     // Catch:{ all -> 0x078a }
            n4.f r6 = r24.J()     // Catch:{ all -> 0x078a }
            n4.e r6 = r6.f9731c     // Catch:{ all -> 0x078a }
            java.lang.String r8 = "gaia_collection_enabled"
            java.lang.String r6 = r6.b(r7, r8)     // Catch:{ all -> 0x078a }
            java.lang.String r8 = "1"
            boolean r6 = r8.equals(r6)     // Catch:{ all -> 0x078a }
            if (r6 == 0) goto L_0x0340
            n4.f5 r6 = r1.M(r7)     // Catch:{ all -> 0x078a }
            boolean r6 = r6.f(r3)     // Catch:{ all -> 0x078a }
            if (r6 == 0) goto L_0x0340
            r6 = 1
            goto L_0x0341
        L_0x0340:
            r6 = 0
        L_0x0341:
            n4.f5 r8 = r1.M(r7)     // Catch:{ all -> 0x078a }
            boolean r3 = r8.f(r3)     // Catch:{ all -> 0x078a }
            n4.f5 r8 = r1.M(r7)     // Catch:{ all -> 0x078a }
            n4.e5 r10 = n4.e5.ANALYTICS_STORAGE     // Catch:{ all -> 0x078a }
            boolean r8 = r8.f(r10)     // Catch:{ all -> 0x078a }
            j4.tc.b()     // Catch:{ all -> 0x078a }
            n4.f r10 = r24.J()     // Catch:{ all -> 0x078a }
            n4.v2 r11 = n4.w2.f10225k0     // Catch:{ all -> 0x078a }
            boolean r10 = r10.o(r7, r11)     // Catch:{ all -> 0x078a }
            r11 = 0
        L_0x0361:
            if (r11 >= r4) goto L_0x0623
            java.lang.Object r12 = r9.get(r11)     // Catch:{ all -> 0x078a }
            android.util.Pair r12 = (android.util.Pair) r12     // Catch:{ all -> 0x078a }
            java.lang.Object r12 = r12.first     // Catch:{ all -> 0x078a }
            j4.t3 r12 = (j4.t3) r12     // Catch:{ all -> 0x078a }
            j4.i7 r12 = r12.j()     // Catch:{ all -> 0x078a }
            j4.s3 r12 = (j4.s3) r12     // Catch:{ all -> 0x078a }
            java.lang.Object r13 = r9.get(r11)     // Catch:{ all -> 0x078a }
            android.util.Pair r13 = (android.util.Pair) r13     // Catch:{ all -> 0x078a }
            java.lang.Object r13 = r13.second     // Catch:{ all -> 0x078a }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ all -> 0x078a }
            r5.add(r13)     // Catch:{ all -> 0x078a }
            n4.f r13 = r24.J()     // Catch:{ all -> 0x078a }
            r13.k()     // Catch:{ all -> 0x078a }
            r12.j()     // Catch:{ all -> 0x078a }
            j4.m7 r13 = r12.f8238b     // Catch:{ all -> 0x078a }
            j4.t3 r13 = (j4.t3) r13     // Catch:{ all -> 0x078a }
            j4.t3.X(r13)     // Catch:{ all -> 0x078a }
            r12.j()     // Catch:{ all -> 0x078a }
            j4.m7 r13 = r12.f8238b     // Catch:{ all -> 0x078a }
            j4.t3 r13 = (j4.t3) r13     // Catch:{ all -> 0x078a }
            r14 = r17
            j4.t3.E0(r13, r14)     // Catch:{ all -> 0x078a }
            n4.n4 r13 = r1.f10292l     // Catch:{ all -> 0x078a }
            r13.getClass()     // Catch:{ all -> 0x078a }
            r12.j()     // Catch:{ all -> 0x0620 }
            j4.m7 r13 = r12.f8238b     // Catch:{ all -> 0x0620 }
            j4.t3 r13 = (j4.t3) r13     // Catch:{ all -> 0x0620 }
            j4.t3.j0(r13)     // Catch:{ all -> 0x0620 }
            if (r6 != 0) goto L_0x03b8
            r12.j()     // Catch:{ all -> 0x078a }
            j4.m7 r13 = r12.f8238b     // Catch:{ all -> 0x078a }
            j4.t3 r13 = (j4.t3) r13     // Catch:{ all -> 0x078a }
            j4.t3.J(r13)     // Catch:{ all -> 0x078a }
        L_0x03b8:
            if (r3 != 0) goto L_0x03c0
            r12.C()     // Catch:{ all -> 0x078a }
            r12.z()     // Catch:{ all -> 0x078a }
        L_0x03c0:
            if (r8 != 0) goto L_0x03cc
            r12.j()     // Catch:{ all -> 0x078a }
            j4.m7 r13 = r12.f8238b     // Catch:{ all -> 0x078a }
            j4.t3 r13 = (j4.t3) r13     // Catch:{ all -> 0x078a }
            j4.t3.d0(r13)     // Catch:{ all -> 0x078a }
        L_0x03cc:
            n4.h4 r13 = r1.f10282a     // Catch:{ all -> 0x078a }
            H(r13)     // Catch:{ all -> 0x078a }
            r13.g()     // Catch:{ all -> 0x078a }
            r13.m(r7)     // Catch:{ all -> 0x078a }
            m.b r13 = r13.f9797e     // Catch:{ all -> 0x078a }
            r17 = r3
            r3 = 0
            java.lang.Object r13 = r13.getOrDefault(r7, r3)     // Catch:{ all -> 0x078a }
            java.util.Set r13 = (java.util.Set) r13     // Catch:{ all -> 0x078a }
            if (r13 == 0) goto L_0x03ee
            r12.j()     // Catch:{ all -> 0x078a }
            j4.m7 r3 = r12.f8238b     // Catch:{ all -> 0x078a }
            j4.t3 r3 = (j4.t3) r3     // Catch:{ all -> 0x078a }
            j4.t3.w0(r3, r13)     // Catch:{ all -> 0x078a }
        L_0x03ee:
            n4.h4 r3 = r1.f10282a     // Catch:{ all -> 0x078a }
            H(r3)     // Catch:{ all -> 0x078a }
            r3.g()     // Catch:{ all -> 0x078a }
            r3.m(r7)     // Catch:{ all -> 0x078a }
            m.b r13 = r3.f9797e     // Catch:{ all -> 0x078a }
            r18 = r6
            r6 = 0
            java.lang.Object r13 = r13.getOrDefault(r7, r6)     // Catch:{ all -> 0x078a }
            java.lang.String r6 = "device_info"
            if (r13 == 0) goto L_0x042b
            m.b r13 = r3.f9797e     // Catch:{ all -> 0x078a }
            r20 = r8
            r8 = 0
            java.lang.Object r13 = r13.getOrDefault(r7, r8)     // Catch:{ all -> 0x078a }
            java.util.Set r13 = (java.util.Set) r13     // Catch:{ all -> 0x078a }
            java.lang.String r8 = "device_model"
            boolean r8 = r13.contains(r8)     // Catch:{ all -> 0x078a }
            if (r8 != 0) goto L_0x0429
            m.b r3 = r3.f9797e     // Catch:{ all -> 0x078a }
            r8 = 0
            java.lang.Object r3 = r3.getOrDefault(r7, r8)     // Catch:{ all -> 0x078a }
            java.util.Set r3 = (java.util.Set) r3     // Catch:{ all -> 0x078a }
            boolean r3 = r3.contains(r6)     // Catch:{ all -> 0x078a }
            if (r3 != 0) goto L_0x0429
            goto L_0x042d
        L_0x0429:
            r3 = 1
            goto L_0x042e
        L_0x042b:
            r20 = r8
        L_0x042d:
            r3 = 0
        L_0x042e:
            if (r3 == 0) goto L_0x043a
            r12.j()     // Catch:{ all -> 0x078a }
            j4.m7 r3 = r12.f8238b     // Catch:{ all -> 0x078a }
            j4.t3 r3 = (j4.t3) r3     // Catch:{ all -> 0x078a }
            j4.t3.P0(r3)     // Catch:{ all -> 0x078a }
        L_0x043a:
            n4.h4 r3 = r1.f10282a     // Catch:{ all -> 0x078a }
            H(r3)     // Catch:{ all -> 0x078a }
            r3.g()     // Catch:{ all -> 0x078a }
            r3.m(r7)     // Catch:{ all -> 0x078a }
            m.b r8 = r3.f9797e     // Catch:{ all -> 0x078a }
            r13 = 0
            java.lang.Object r8 = r8.getOrDefault(r7, r13)     // Catch:{ all -> 0x078a }
            if (r8 == 0) goto L_0x0470
            m.b r8 = r3.f9797e     // Catch:{ all -> 0x078a }
            java.lang.Object r8 = r8.getOrDefault(r7, r13)     // Catch:{ all -> 0x078a }
            java.util.Set r8 = (java.util.Set) r8     // Catch:{ all -> 0x078a }
            java.lang.String r13 = "os_version"
            boolean r8 = r8.contains(r13)     // Catch:{ all -> 0x078a }
            if (r8 != 0) goto L_0x046e
            m.b r3 = r3.f9797e     // Catch:{ all -> 0x078a }
            r8 = 0
            java.lang.Object r3 = r3.getOrDefault(r7, r8)     // Catch:{ all -> 0x078a }
            java.util.Set r3 = (java.util.Set) r3     // Catch:{ all -> 0x078a }
            boolean r3 = r3.contains(r6)     // Catch:{ all -> 0x078a }
            if (r3 != 0) goto L_0x046e
            goto L_0x0470
        L_0x046e:
            r3 = 1
            goto L_0x0471
        L_0x0470:
            r3 = 0
        L_0x0471:
            r6 = -1
            if (r3 == 0) goto L_0x04b0
            n4.f r3 = r24.J()     // Catch:{ all -> 0x078a }
            n4.v2 r8 = n4.w2.f10229m0     // Catch:{ all -> 0x078a }
            boolean r3 = r3.o(r7, r8)     // Catch:{ all -> 0x078a }
            if (r3 == 0) goto L_0x04a6
            j4.m7 r3 = r12.f8238b     // Catch:{ all -> 0x078a }
            j4.t3 r3 = (j4.t3) r3     // Catch:{ all -> 0x078a }
            java.lang.String r3 = r3.B()     // Catch:{ all -> 0x078a }
            boolean r8 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x078a }
            if (r8 != 0) goto L_0x04b0
            java.lang.String r8 = "."
            int r8 = r3.indexOf(r8)     // Catch:{ all -> 0x078a }
            if (r8 == r6) goto L_0x04b0
            r13 = 0
            java.lang.String r3 = r3.substring(r13, r8)     // Catch:{ all -> 0x078a }
            r12.j()     // Catch:{ all -> 0x078a }
            j4.m7 r8 = r12.f8238b     // Catch:{ all -> 0x078a }
            j4.t3 r8 = (j4.t3) r8     // Catch:{ all -> 0x078a }
            j4.t3.M0(r8, r3)     // Catch:{ all -> 0x078a }
            goto L_0x04b0
        L_0x04a6:
            r12.j()     // Catch:{ all -> 0x078a }
            j4.m7 r3 = r12.f8238b     // Catch:{ all -> 0x078a }
            j4.t3 r3 = (j4.t3) r3     // Catch:{ all -> 0x078a }
            j4.t3.N0(r3)     // Catch:{ all -> 0x078a }
        L_0x04b0:
            n4.h4 r3 = r1.f10282a     // Catch:{ all -> 0x078a }
            H(r3)     // Catch:{ all -> 0x078a }
            r3.g()     // Catch:{ all -> 0x078a }
            r3.m(r7)     // Catch:{ all -> 0x078a }
            m.b r8 = r3.f9797e     // Catch:{ all -> 0x078a }
            r13 = 0
            java.lang.Object r8 = r8.getOrDefault(r7, r13)     // Catch:{ all -> 0x078a }
            if (r8 == 0) goto L_0x04d6
            m.b r3 = r3.f9797e     // Catch:{ all -> 0x078a }
            java.lang.Object r3 = r3.getOrDefault(r7, r13)     // Catch:{ all -> 0x078a }
            java.util.Set r3 = (java.util.Set) r3     // Catch:{ all -> 0x078a }
            java.lang.String r8 = "user_id"
            boolean r3 = r3.contains(r8)     // Catch:{ all -> 0x078a }
            if (r3 == 0) goto L_0x04d6
            r3 = 1
            goto L_0x04d7
        L_0x04d6:
            r3 = 0
        L_0x04d7:
            if (r3 == 0) goto L_0x04eb
            java.lang.String r3 = "_id"
            int r3 = n4.y7.u(r12, r3)     // Catch:{ all -> 0x078a }
            if (r3 == r6) goto L_0x04eb
            r12.j()     // Catch:{ all -> 0x078a }
            j4.m7 r6 = r12.f8238b     // Catch:{ all -> 0x078a }
            j4.t3 r6 = (j4.t3) r6     // Catch:{ all -> 0x078a }
            j4.t3.D0(r6, r3)     // Catch:{ all -> 0x078a }
        L_0x04eb:
            n4.h4 r3 = r1.f10282a     // Catch:{ all -> 0x078a }
            H(r3)     // Catch:{ all -> 0x078a }
            r3.g()     // Catch:{ all -> 0x078a }
            r3.m(r7)     // Catch:{ all -> 0x078a }
            m.b r6 = r3.f9797e     // Catch:{ all -> 0x078a }
            r8 = 0
            java.lang.Object r6 = r6.getOrDefault(r7, r8)     // Catch:{ all -> 0x078a }
            if (r6 == 0) goto L_0x0511
            m.b r3 = r3.f9797e     // Catch:{ all -> 0x078a }
            java.lang.Object r3 = r3.getOrDefault(r7, r8)     // Catch:{ all -> 0x078a }
            java.util.Set r3 = (java.util.Set) r3     // Catch:{ all -> 0x078a }
            java.lang.String r6 = "google_signals"
            boolean r3 = r3.contains(r6)     // Catch:{ all -> 0x078a }
            if (r3 == 0) goto L_0x0511
            r3 = 1
            goto L_0x0512
        L_0x0511:
            r3 = 0
        L_0x0512:
            if (r3 == 0) goto L_0x051e
            r12.j()     // Catch:{ all -> 0x078a }
            j4.m7 r3 = r12.f8238b     // Catch:{ all -> 0x078a }
            j4.t3 r3 = (j4.t3) r3     // Catch:{ all -> 0x078a }
            j4.t3.J(r3)     // Catch:{ all -> 0x078a }
        L_0x051e:
            n4.h4 r3 = r1.f10282a     // Catch:{ all -> 0x078a }
            H(r3)     // Catch:{ all -> 0x078a }
            r3.g()     // Catch:{ all -> 0x078a }
            r3.m(r7)     // Catch:{ all -> 0x078a }
            m.b r6 = r3.f9797e     // Catch:{ all -> 0x078a }
            r8 = 0
            java.lang.Object r6 = r6.getOrDefault(r7, r8)     // Catch:{ all -> 0x078a }
            if (r6 == 0) goto L_0x0544
            m.b r3 = r3.f9797e     // Catch:{ all -> 0x078a }
            java.lang.Object r3 = r3.getOrDefault(r7, r8)     // Catch:{ all -> 0x078a }
            java.util.Set r3 = (java.util.Set) r3     // Catch:{ all -> 0x078a }
            java.lang.String r6 = "app_instance_id"
            boolean r3 = r3.contains(r6)     // Catch:{ all -> 0x078a }
            if (r3 == 0) goto L_0x0544
            r3 = 1
            goto L_0x0545
        L_0x0544:
            r3 = 0
        L_0x0545:
            if (r3 == 0) goto L_0x05a1
            r12.j()     // Catch:{ all -> 0x078a }
            j4.m7 r3 = r12.f8238b     // Catch:{ all -> 0x078a }
            j4.t3 r3 = (j4.t3) r3     // Catch:{ all -> 0x078a }
            j4.t3.d0(r3)     // Catch:{ all -> 0x078a }
            java.util.HashMap r3 = r1.B     // Catch:{ all -> 0x078a }
            java.lang.Object r3 = r3.get(r7)     // Catch:{ all -> 0x078a }
            n4.v7 r3 = (n4.v7) r3     // Catch:{ all -> 0x078a }
            if (r3 == 0) goto L_0x0581
            r6 = r9
            long r8 = r3.f10201b     // Catch:{ all -> 0x078a }
            n4.f r13 = r24.J()     // Catch:{ all -> 0x078a }
            r21 = r3
            n4.v2 r3 = n4.w2.T     // Catch:{ all -> 0x078a }
            long r22 = r13.l(r7, r3)     // Catch:{ all -> 0x078a }
            long r22 = r22 + r8
            w3.b r3 = r24.c()     // Catch:{ all -> 0x078a }
            y3.a r3 = (y3.a) r3     // Catch:{ all -> 0x078a }
            r3.getClass()     // Catch:{ all -> 0x078a }
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x078a }
            int r3 = (r22 > r8 ? 1 : (r22 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x057e
            goto L_0x0582
        L_0x057e:
            r3 = r21
            goto L_0x0594
        L_0x0581:
            r6 = r9
        L_0x0582:
            n4.v7 r3 = new n4.v7     // Catch:{ all -> 0x078a }
            n4.d8 r8 = r24.P()     // Catch:{ all -> 0x078a }
            java.lang.String r8 = r8.m()     // Catch:{ all -> 0x078a }
            r3.<init>(r1, r8)     // Catch:{ all -> 0x078a }
            java.util.HashMap r8 = r1.B     // Catch:{ all -> 0x078a }
            r8.put(r7, r3)     // Catch:{ all -> 0x078a }
        L_0x0594:
            java.lang.String r3 = r3.f10200a     // Catch:{ all -> 0x078a }
            r12.j()     // Catch:{ all -> 0x078a }
            j4.m7 r8 = r12.f8238b     // Catch:{ all -> 0x078a }
            j4.t3 r8 = (j4.t3) r8     // Catch:{ all -> 0x078a }
            j4.t3.y0(r8, r3)     // Catch:{ all -> 0x078a }
            goto L_0x05a2
        L_0x05a1:
            r6 = r9
        L_0x05a2:
            n4.h4 r3 = r1.f10282a     // Catch:{ all -> 0x078a }
            H(r3)     // Catch:{ all -> 0x078a }
            r3.g()     // Catch:{ all -> 0x078a }
            r3.m(r7)     // Catch:{ all -> 0x078a }
            m.b r8 = r3.f9797e     // Catch:{ all -> 0x078a }
            r9 = 0
            java.lang.Object r8 = r8.getOrDefault(r7, r9)     // Catch:{ all -> 0x078a }
            if (r8 == 0) goto L_0x05c8
            m.b r3 = r3.f9797e     // Catch:{ all -> 0x078a }
            java.lang.Object r3 = r3.getOrDefault(r7, r9)     // Catch:{ all -> 0x078a }
            java.util.Set r3 = (java.util.Set) r3     // Catch:{ all -> 0x078a }
            java.lang.String r8 = "enhanced_user_id"
            boolean r3 = r3.contains(r8)     // Catch:{ all -> 0x078a }
            if (r3 == 0) goto L_0x05c8
            r3 = 1
            goto L_0x05c9
        L_0x05c8:
            r3 = 0
        L_0x05c9:
            if (r3 == 0) goto L_0x05d5
            r12.j()     // Catch:{ all -> 0x078a }
            j4.m7 r3 = r12.f8238b     // Catch:{ all -> 0x078a }
            j4.t3 r3 = (j4.t3) r3     // Catch:{ all -> 0x078a }
            j4.t3.v0(r3)     // Catch:{ all -> 0x078a }
        L_0x05d5:
            if (r10 != 0) goto L_0x05e1
            r12.j()     // Catch:{ all -> 0x078a }
            j4.m7 r3 = r12.f8238b     // Catch:{ all -> 0x078a }
            j4.t3 r3 = (j4.t3) r3     // Catch:{ all -> 0x078a }
            j4.t3.v0(r3)     // Catch:{ all -> 0x078a }
        L_0x05e1:
            n4.f r3 = r24.J()     // Catch:{ all -> 0x078a }
            n4.v2 r8 = n4.w2.U     // Catch:{ all -> 0x078a }
            boolean r3 = r3.o(r7, r8)     // Catch:{ all -> 0x078a }
            if (r3 == 0) goto L_0x0603
            j4.m7 r3 = r12.h()     // Catch:{ all -> 0x078a }
            j4.t3 r3 = (j4.t3) r3     // Catch:{ all -> 0x078a }
            byte[] r3 = r3.g()     // Catch:{ all -> 0x078a }
            n4.y7 r8 = r1.f10288g     // Catch:{ all -> 0x078a }
            H(r8)     // Catch:{ all -> 0x078a }
            long r8 = r8.v(r3)     // Catch:{ all -> 0x078a }
            r12.l(r8)     // Catch:{ all -> 0x078a }
        L_0x0603:
            r2.j()     // Catch:{ all -> 0x078a }
            j4.m7 r3 = r2.f8238b     // Catch:{ all -> 0x078a }
            j4.r3 r3 = (j4.r3) r3     // Catch:{ all -> 0x078a }
            j4.m7 r8 = r12.h()     // Catch:{ all -> 0x078a }
            j4.t3 r8 = (j4.t3) r8     // Catch:{ all -> 0x078a }
            j4.r3.x(r3, r8)     // Catch:{ all -> 0x078a }
            int r11 = r11 + 1
            r9 = r6
            r3 = r17
            r6 = r18
            r8 = r20
            r17 = r14
            goto L_0x0361
        L_0x0620:
            r0 = move-exception
            goto L_0x0309
        L_0x0623:
            r14 = r17
            n4.i3 r3 = r24.a()     // Catch:{ all -> 0x078a }
            java.lang.String r3 = r3.t()     // Catch:{ all -> 0x078a }
            r6 = 2
            boolean r3 = android.util.Log.isLoggable(r3, r6)     // Catch:{ all -> 0x078a }
            if (r3 == 0) goto L_0x0644
            n4.y7 r3 = r1.f10288g     // Catch:{ all -> 0x078a }
            H(r3)     // Catch:{ all -> 0x078a }
            j4.m7 r6 = r2.h()     // Catch:{ all -> 0x078a }
            j4.r3 r6 = (j4.r3) r6     // Catch:{ all -> 0x078a }
            java.lang.String r11 = r3.A(r6)     // Catch:{ all -> 0x078a }
            goto L_0x0645
        L_0x0644:
            r11 = 0
        L_0x0645:
            n4.y7 r3 = r1.f10288g     // Catch:{ all -> 0x078a }
            H(r3)     // Catch:{ all -> 0x078a }
            j4.m7 r3 = r2.h()     // Catch:{ all -> 0x078a }
            j4.r3 r3 = (j4.r3) r3     // Catch:{ all -> 0x078a }
            byte[] r3 = r3.g()     // Catch:{ all -> 0x078a }
            n4.r7 r6 = r1.f10291j     // Catch:{ all -> 0x078a }
            n3.w r6 = r6.h(r7)     // Catch:{ all -> 0x078a }
            boolean r8 = r5.isEmpty()     // Catch:{ MalformedURLException -> 0x06d8 }
            r9 = 1
            r8 = r8 ^ r9
            r3.o.b(r8)     // Catch:{ MalformedURLException -> 0x06d8 }
            java.util.ArrayList r8 = r1.f10302x     // Catch:{ MalformedURLException -> 0x06d8 }
            if (r8 == 0) goto L_0x0675
            n4.i3 r5 = r24.a()     // Catch:{ MalformedURLException -> 0x06d8 }
            n4.g3 r5 = r5.l()     // Catch:{ MalformedURLException -> 0x06d8 }
            java.lang.String r8 = "Set uploading progress before finishing the previous upload"
            r5.a(r8)     // Catch:{ MalformedURLException -> 0x06d8 }
            goto L_0x067c
        L_0x0675:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x06d8 }
            r8.<init>(r5)     // Catch:{ MalformedURLException -> 0x06d8 }
            r1.f10302x = r8     // Catch:{ MalformedURLException -> 0x06d8 }
        L_0x067c:
            n4.d7 r5 = r1.f10290i     // Catch:{ MalformedURLException -> 0x06d8 }
            n4.t3 r5 = r5.f9704h     // Catch:{ MalformedURLException -> 0x06d8 }
            r5.b(r14)     // Catch:{ MalformedURLException -> 0x06d8 }
            java.lang.String r5 = "?"
            if (r4 <= 0) goto L_0x068f
            j4.t3 r2 = r2.k()     // Catch:{  }
            java.lang.String r5 = r2.K1()     // Catch:{ MalformedURLException -> 0x06d8 }
        L_0x068f:
            n4.i3 r2 = r24.a()     // Catch:{ MalformedURLException -> 0x06d8 }
            n4.g3 r2 = r2.m()     // Catch:{ MalformedURLException -> 0x06d8 }
            java.lang.String r4 = "Uploading data. app, uncompressed size, data"
            int r8 = r3.length     // Catch:{ MalformedURLException -> 0x06d8 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ MalformedURLException -> 0x06d8 }
            r2.d(r4, r5, r8, r11)     // Catch:{ MalformedURLException -> 0x06d8 }
            r2 = 1
            r1.f10300t = r2     // Catch:{ MalformedURLException -> 0x06d8 }
            n4.n3 r13 = r1.f10283b     // Catch:{ MalformedURLException -> 0x06d8 }
            H(r13)     // Catch:{ MalformedURLException -> 0x06d8 }
            java.net.URL r15 = new java.net.URL     // Catch:{ MalformedURLException -> 0x06d8 }
            java.lang.String r2 = r6.c()     // Catch:{ MalformedURLException -> 0x06d8 }
            r15.<init>(r2)     // Catch:{ MalformedURLException -> 0x06d8 }
            java.util.Map r17 = r6.d()     // Catch:{ MalformedURLException -> 0x06d8 }
            androidx.appcompat.widget.l r2 = new androidx.appcompat.widget.l     // Catch:{ MalformedURLException -> 0x06d8 }
            r4 = 6
            r2.<init>(r1, r4, r7)     // Catch:{ MalformedURLException -> 0x06d8 }
            r13.g()     // Catch:{ MalformedURLException -> 0x06d8 }
            r13.h()     // Catch:{ MalformedURLException -> 0x06d8 }
            n4.n4 r4 = r13.f9600a     // Catch:{ MalformedURLException -> 0x06d8 }
            n4.m4 r4 = r4.d()     // Catch:{ MalformedURLException -> 0x06d8 }
            n4.m3 r5 = new n4.m3     // Catch:{ MalformedURLException -> 0x06d8 }
            r12 = r5
            r14 = r7
            r16 = r3
            r18 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ MalformedURLException -> 0x06d8 }
            r4.n(r5)     // Catch:{ MalformedURLException -> 0x06d8 }
            goto L_0x077a
        L_0x06d8:
            n4.i3 r2 = r24.a()     // Catch:{ all -> 0x078a }
            n4.g3 r2 = r2.l()     // Catch:{ all -> 0x078a }
            java.lang.String r3 = "Failed to parse upload URL. Not uploading. appId"
            n4.h3 r4 = n4.i3.p(r7)     // Catch:{ all -> 0x078a }
            java.lang.String r5 = r6.c()     // Catch:{ all -> 0x078a }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x078a }
            goto L_0x077a
        L_0x06ef:
            r0 = move-exception
            r2 = r0
            r11 = r8
        L_0x06f2:
            if (r11 == 0) goto L_0x06f7
            r11.close()     // Catch:{ all -> 0x078a }
        L_0x06f7:
            throw r2     // Catch:{ all -> 0x078a }
        L_0x06f8:
            r14 = r5
            r1.f10304z = r9     // Catch:{ all -> 0x078a }
            n4.i r2 = r1.f10284c     // Catch:{ all -> 0x078a }
            H(r2)     // Catch:{ all -> 0x078a }
            r24.J()     // Catch:{ all -> 0x078a }
            n4.v2 r3 = n4.w2.f10213e     // Catch:{ all -> 0x078a }
            r4 = 0
            java.lang.Object r3 = r3.a(r4)     // Catch:{ all -> 0x078a }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x078a }
            long r5 = r3.longValue()     // Catch:{ all -> 0x078a }
            long r5 = r14 - r5
            r2.g()     // Catch:{ all -> 0x078a }
            r2.h()     // Catch:{ all -> 0x078a }
            android.database.sqlite.SQLiteDatabase r3 = r2.z()     // Catch:{ SQLiteException -> 0x0750, all -> 0x074c }
            java.lang.String r7 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x0750, all -> 0x074c }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0750, all -> 0x074c }
            r6 = 0
            r8[r6] = r5     // Catch:{ SQLiteException -> 0x0750, all -> 0x074c }
            android.database.Cursor r3 = r3.rawQuery(r7, r8)     // Catch:{ SQLiteException -> 0x0750, all -> 0x074c }
            boolean r5 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0749 }
            if (r5 != 0) goto L_0x0740
            n4.n4 r5 = r2.f9600a     // Catch:{ SQLiteException -> 0x0749 }
            n4.i3 r5 = r5.a()     // Catch:{ SQLiteException -> 0x0749 }
            n4.g3 r5 = r5.f9835n     // Catch:{ SQLiteException -> 0x0749 }
            java.lang.String r6 = "No expired configs for apps with pending events"
            r5.a(r6)     // Catch:{ SQLiteException -> 0x0749 }
            goto L_0x0762
        L_0x0740:
            r5 = 0
            java.lang.String r11 = r3.getString(r5)     // Catch:{ SQLiteException -> 0x0749 }
            r3.close()     // Catch:{ all -> 0x078a }
            goto L_0x0766
        L_0x0749:
            r0 = move-exception
            r5 = r0
            goto L_0x0753
        L_0x074c:
            r0 = move-exception
            r2 = r0
            r11 = r4
            goto L_0x0784
        L_0x0750:
            r0 = move-exception
            r5 = r0
            r3 = r4
        L_0x0753:
            n4.n4 r2 = r2.f9600a     // Catch:{ all -> 0x0781 }
            n4.i3 r2 = r2.a()     // Catch:{ all -> 0x0781 }
            n4.g3 r2 = r2.f9828f     // Catch:{ all -> 0x0781 }
            java.lang.String r6 = "Error selecting expired configs"
            r2.b(r6, r5)     // Catch:{ all -> 0x0781 }
            if (r3 == 0) goto L_0x0765
        L_0x0762:
            r3.close()     // Catch:{ all -> 0x078a }
        L_0x0765:
            r11 = r4
        L_0x0766:
            boolean r2 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x078a }
            if (r2 != 0) goto L_0x077a
            n4.i r2 = r1.f10284c     // Catch:{ all -> 0x078a }
            H(r2)     // Catch:{ all -> 0x078a }
            n4.d5 r2 = r2.A(r11)     // Catch:{ all -> 0x078a }
            if (r2 == 0) goto L_0x077a
            r1.h(r2)     // Catch:{ all -> 0x078a }
        L_0x077a:
            r2 = 0
            r1.u = r2
        L_0x077d:
            r24.A()
            return
        L_0x0781:
            r0 = move-exception
            r2 = r0
            r11 = r3
        L_0x0784:
            if (r11 == 0) goto L_0x0789
            r11.close()     // Catch:{ all -> 0x078a }
        L_0x0789:
            throw r2     // Catch:{ all -> 0x078a }
        L_0x078a:
            r0 = move-exception
            goto L_0x0309
        L_0x078d:
            r0 = move-exception
            goto L_0x0309
        L_0x0790:
            r3 = 0
            r1.u = r3
            r24.A()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.w7.t():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:252:0x08e6, code lost:
        if (r13.isEmpty() != false) goto L_0x08e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0c22, code lost:
        r15 = 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0396 A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03e4 A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x03e7 A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0450 A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x047e  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x05fe A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0638 A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x06c1 A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0742 A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0756 A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x076a A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x07b1 A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x07d0 A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0825 A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0858 A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x085d A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0863 A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x08eb A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x091c A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0921 A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x094a A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x09bd A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x09d1 A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x09f2 A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0a82 A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0aa5 A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x0c14 A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0c95 A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }, LOOP:5: B:341:0x0c8f->B:343:0x0c95, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x0d00 A[Catch:{ SQLiteException -> 0x0d1b }] */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x0d16  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x0c28 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0216 A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0230 A[SYNTHETIC, Splitter:B:61:0x0230] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x02b7 A[Catch:{ NumberFormatException -> 0x08d0, all -> 0x0d97 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(n4.r r38, n4.g8 r39) {
        /*
            r37 = this;
            r1 = r37
            r2 = r38
            r3 = r39
            java.lang.String r4 = "metadata_fingerprint"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "raw_events"
            java.lang.String r7 = "_sno"
            r3.o.h(r39)
            java.lang.String r8 = r3.f9768a
            r3.o.e(r8)
            long r8 = java.lang.System.nanoTime()
            n4.m4 r10 = r37.d()
            r10.g()
            r37.g()
            java.lang.String r10 = r3.f9768a
            n4.y7 r11 = r1.f10288g
            H(r11)
            java.lang.String r11 = r3.f9769b
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            r28 = 1
            if (r11 == 0) goto L_0x003f
            java.lang.String r11 = r3.f9783q
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x003f
            r11 = 0
            goto L_0x0041
        L_0x003f:
            r11 = r28
        L_0x0041:
            if (r11 != 0) goto L_0x0044
            return
        L_0x0044:
            boolean r11 = r3.f9775h
            if (r11 == 0) goto L_0x0da2
            n4.h4 r11 = r1.f10282a
            H(r11)
            java.lang.String r12 = r2.f10085a
            boolean r11 = r11.t(r10, r12)
            java.lang.String r14 = "_err"
            r13 = 0
            if (r11 == 0) goto L_0x0110
            n4.i3 r3 = r37.a()
            n4.g3 r3 = r3.n()
            n4.h3 r4 = n4.i3.p(r10)
            n4.n4 r5 = r1.f10292l
            n4.d3 r5 = r5.q()
            java.lang.String r6 = r2.f10085a
            java.lang.String r5 = r5.d(r6)
            java.lang.String r6 = "Dropping blocked event. appId"
            r3.c(r6, r4, r5)
            n4.h4 r3 = r1.f10282a
            H(r3)
            java.lang.String r4 = "measurement.upload.blacklist_internal"
            java.lang.String r3 = r3.b(r10, r4)
            java.lang.String r4 = "1"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x00b8
            n4.h4 r3 = r1.f10282a
            H(r3)
            java.lang.String r5 = "measurement.upload.blacklist_public"
            java.lang.String r3 = r3.b(r10, r5)
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x009a
            goto L_0x00b8
        L_0x009a:
            java.lang.String r3 = r2.f10085a
            boolean r3 = r14.equals(r3)
            if (r3 != 0) goto L_0x010f
            n4.d8 r3 = r37.P()
            g1.t r11 = r1.E
            java.lang.String r15 = r2.f10085a
            r13 = 11
            r16 = 0
            r3.getClass()
            java.lang.String r14 = "_ev"
            r12 = r10
            n4.d8.x(r11, r12, r13, r14, r15, r16)
            return
        L_0x00b8:
            n4.i r2 = r1.f10284c
            H(r2)
            n4.d5 r2 = r2.A(r10)
            if (r2 == 0) goto L_0x010f
            n4.n4 r3 = r2.f9674a
            n4.m4 r3 = r3.d()
            r3.g()
            long r3 = r2.H
            n4.n4 r5 = r2.f9674a
            n4.m4 r5 = r5.d()
            r5.g()
            long r5 = r2.G
            long r3 = java.lang.Math.max(r3, r5)
            w3.b r5 = r37.c()
            y3.a r5 = (y3.a) r5
            long r5 = r5.currentTimeMillis()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            r37.J()
            n4.v2 r5 = n4.w2.f10250z
            java.lang.Object r5 = r5.a(r13)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x010f
            n4.i3 r3 = r37.a()
            n4.g3 r3 = r3.k()
            java.lang.String r4 = "Fetching config for blocked app"
            r3.a(r4)
            r1.h(r2)
        L_0x010f:
            return
        L_0x0110:
            n4.j3 r2 = n4.j3.b(r38)
            n4.d8 r11 = r37.P()
            n4.f r12 = r37.J()
            r12.getClass()
            n4.v2 r15 = n4.w2.I
            r13 = 25
            r29 = r8
            r8 = 100
            int r9 = r12.j(r10, r15, r13, r8)
            r11.w(r2, r9)
            j4.ob r9 = j4.ob.f8369b
            j4.m5 r9 = r9.f8370a
            java.lang.Object r9 = r9.zza()
            j4.pb r9 = (j4.pb) r9
            r9.zza()
            n4.f r9 = r37.J()
            n4.v2 r11 = n4.w2.f10242t0
            r12 = 0
            boolean r9 = r9.o(r12, r11)
            if (r9 == 0) goto L_0x0157
            n4.f r9 = r37.J()
            n4.v2 r11 = n4.w2.Q
            r12 = 10
            r13 = 35
            int r9 = r9.j(r10, r11, r12, r13)
            goto L_0x0158
        L_0x0157:
            r9 = 0
        L_0x0158:
            java.util.TreeSet r11 = new java.util.TreeSet
            android.os.Bundle r12 = r2.f9861d
            java.util.Set r12 = r12.keySet()
            r11.<init>(r12)
            java.util.Iterator r11 = r11.iterator()
        L_0x0167:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x01a7
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = "items"
            boolean r13 = r13.equals(r12)
            if (r13 == 0) goto L_0x0167
            n4.d8 r13 = r37.P()
            android.os.Bundle r15 = r2.f9861d
            android.os.Parcelable[] r12 = r15.getParcelableArray(r12)
            j4.ob r15 = j4.ob.f8369b
            j4.m5 r15 = r15.f8370a
            java.lang.Object r15 = r15.zza()
            j4.pb r15 = (j4.pb) r15
            r15.zza()
            n4.f r15 = r37.J()
            n4.v2 r8 = n4.w2.f10242t0
            r18 = r11
            r11 = 0
            boolean r8 = r15.o(r11, r8)
            r13.v(r12, r9, r8)
            r11 = r18
            r8 = 100
            goto L_0x0167
        L_0x01a7:
            n4.r r2 = r2.a()
            n4.i3 r8 = r37.a()
            java.lang.String r8 = r8.t()
            r9 = 2
            boolean r8 = android.util.Log.isLoggable(r8, r9)
            if (r8 == 0) goto L_0x01d1
            n4.i3 r8 = r37.a()
            n4.g3 r8 = r8.m()
            n4.n4 r11 = r1.f10292l
            n4.d3 r11 = r11.q()
            java.lang.String r11 = r11.c(r2)
            java.lang.String r12 = "Logging event"
            r8.b(r12, r11)
        L_0x01d1:
            j4.lb.a()
            n4.f r8 = r37.J()
            n4.v2 r11 = n4.w2.f10236q0
            r13 = 0
            r8.o(r13, r11)
            n4.i r8 = r1.f10284c
            H(r8)
            r8.M()
            r1.I(r3)     // Catch:{ all -> 0x0d97 }
            java.lang.String r8 = "ecommerce_purchase"
            java.lang.String r11 = r2.f10085a     // Catch:{ all -> 0x0d97 }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0d97 }
            java.lang.String r11 = "refund"
            if (r8 != 0) goto L_0x020a
            java.lang.String r8 = "purchase"
            java.lang.String r12 = r2.f10085a     // Catch:{ all -> 0x0d97 }
            boolean r8 = r8.equals(r12)     // Catch:{ all -> 0x0d97 }
            if (r8 != 0) goto L_0x020a
            java.lang.String r8 = r2.f10085a     // Catch:{ all -> 0x0d97 }
            boolean r8 = r11.equals(r8)     // Catch:{ all -> 0x0d97 }
            if (r8 == 0) goto L_0x0208
            goto L_0x020a
        L_0x0208:
            r8 = 0
            goto L_0x020c
        L_0x020a:
            r8 = r28
        L_0x020c:
            java.lang.String r12 = "_iap"
            java.lang.String r15 = r2.f10085a     // Catch:{ all -> 0x0d97 }
            boolean r12 = r12.equals(r15)     // Catch:{ all -> 0x0d97 }
            if (r12 != 0) goto L_0x0222
            if (r8 == 0) goto L_0x021b
            r8 = r28
            goto L_0x0222
        L_0x021b:
            r33 = r4
            r32 = r14
        L_0x021f:
            r4 = 0
            goto L_0x03cf
        L_0x0222:
            n4.p r12 = r2.f10086b     // Catch:{ all -> 0x0d97 }
            java.lang.String r15 = "currency"
            android.os.Bundle r12 = r12.f10048a     // Catch:{ all -> 0x0d97 }
            java.lang.String r12 = r12.getString(r15)     // Catch:{ all -> 0x0d97 }
            java.lang.String r15 = "value"
            if (r8 == 0) goto L_0x029f
            n4.p r8 = r2.f10086b     // Catch:{ all -> 0x0d97 }
            java.lang.Double r8 = r8.y()     // Catch:{ all -> 0x0d97 }
            double r17 = r8.doubleValue()     // Catch:{ all -> 0x0d97 }
            r19 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r17 = r17 * r19
            r21 = 0
            int r8 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r8 != 0) goto L_0x025d
            n4.p r8 = r2.f10086b     // Catch:{ all -> 0x0d97 }
            android.os.Bundle r8 = r8.f10048a     // Catch:{ all -> 0x0d97 }
            long r17 = r8.getLong(r15)     // Catch:{ all -> 0x0d97 }
            java.lang.Long r8 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0d97 }
            r21 = r14
            long r13 = r8.longValue()     // Catch:{ all -> 0x0d97 }
            double r13 = (double) r13     // Catch:{ all -> 0x0d97 }
            double r17 = r13 * r19
            goto L_0x025f
        L_0x025d:
            r21 = r14
        L_0x025f:
            r13 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r8 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r8 > 0) goto L_0x0279
            r13 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r8 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r8 < 0) goto L_0x0279
            long r13 = java.lang.Math.round(r17)     // Catch:{ all -> 0x0d97 }
            java.lang.String r8 = r2.f10085a     // Catch:{ all -> 0x0d97 }
            boolean r8 = r11.equals(r8)     // Catch:{ all -> 0x0d97 }
            if (r8 == 0) goto L_0x02b1
            long r13 = -r13
            goto L_0x02b1
        L_0x0279:
            n4.i3 r2 = r37.a()     // Catch:{ all -> 0x0d97 }
            n4.g3 r2 = r2.n()     // Catch:{ all -> 0x0d97 }
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            n4.h3 r4 = n4.i3.p(r10)     // Catch:{ all -> 0x0d97 }
            java.lang.Double r5 = java.lang.Double.valueOf(r17)     // Catch:{ all -> 0x0d97 }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x0d97 }
            n4.i r2 = r1.f10284c     // Catch:{ all -> 0x0d97 }
            H(r2)     // Catch:{ all -> 0x0d97 }
            r2.l()     // Catch:{ all -> 0x0d97 }
            n4.i r2 = r1.f10284c
            H(r2)
            r2.N()
            return
        L_0x029f:
            r21 = r14
            n4.p r8 = r2.f10086b     // Catch:{ all -> 0x0d97 }
            android.os.Bundle r8 = r8.f10048a     // Catch:{ all -> 0x0d97 }
            long r13 = r8.getLong(r15)     // Catch:{ all -> 0x0d97 }
            java.lang.Long r8 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0d97 }
            long r13 = r8.longValue()     // Catch:{ all -> 0x0d97 }
        L_0x02b1:
            boolean r8 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0d97 }
            if (r8 != 0) goto L_0x03c9
            java.util.Locale r8 = java.util.Locale.US     // Catch:{ all -> 0x0d97 }
            java.lang.String r8 = r12.toUpperCase(r8)     // Catch:{ all -> 0x0d97 }
            java.lang.String r11 = "[A-Z]{3}"
            boolean r11 = r8.matches(r11)     // Catch:{ all -> 0x0d97 }
            if (r11 == 0) goto L_0x03c9
            java.lang.String r11 = "_ltv_"
            java.lang.String r8 = r11.concat(r8)     // Catch:{ all -> 0x0d97 }
            n4.i r11 = r1.f10284c     // Catch:{ all -> 0x0d97 }
            H(r11)     // Catch:{ all -> 0x0d97 }
            n4.b8 r11 = r11.F(r10, r8)     // Catch:{ all -> 0x0d97 }
            if (r11 == 0) goto L_0x030d
            java.lang.Object r11 = r11.f9639e     // Catch:{ all -> 0x0d97 }
            boolean r12 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0d97 }
            if (r12 != 0) goto L_0x02dd
            goto L_0x030d
        L_0x02dd:
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0d97 }
            long r11 = r11.longValue()     // Catch:{ all -> 0x0d97 }
            n4.b8 r18 = new n4.b8     // Catch:{ all -> 0x0d97 }
            java.lang.String r15 = r2.f10087c     // Catch:{ all -> 0x0d97 }
            w3.b r17 = r37.c()     // Catch:{ all -> 0x0d97 }
            y3.a r17 = (y3.a) r17     // Catch:{ all -> 0x0d97 }
            long r19 = r17.currentTimeMillis()     // Catch:{ all -> 0x0d97 }
            long r11 = r11 + r13
            java.lang.Long r17 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0d97 }
            r11 = r18
            r12 = r10
            r14 = 0
            r13 = r15
            r15 = r21
            r14 = r8
            r32 = r15
            r8 = 0
            r15 = r19
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0d97 }
            r33 = r4
            r4 = r8
        L_0x0309:
            r8 = r18
            goto L_0x038b
        L_0x030d:
            r32 = r21
            r15 = 0
            n4.i r11 = r1.f10284c     // Catch:{ all -> 0x0d97 }
            H(r11)     // Catch:{ all -> 0x0d97 }
            n4.f r12 = r37.J()     // Catch:{ all -> 0x0d97 }
            n4.v2 r9 = n4.w2.E     // Catch:{ all -> 0x0d97 }
            int r9 = r12.i(r10, r9)     // Catch:{ all -> 0x0d97 }
            int r9 = r9 + -1
            r3.o.e(r10)     // Catch:{ all -> 0x0d97 }
            r11.g()     // Catch:{ all -> 0x0d97 }
            r11.h()     // Catch:{ all -> 0x0d97 }
            android.database.sqlite.SQLiteDatabase r12 = r11.z()     // Catch:{ SQLiteException -> 0x0352 }
            java.lang.String r15 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r33 = r4
            r4 = 3
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x034a }
            r16 = 0
            r4[r16] = r10     // Catch:{ SQLiteException -> 0x0347 }
            r4[r28] = r10     // Catch:{ SQLiteException -> 0x0347 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x0347 }
            r17 = 2
            r4[r17] = r9     // Catch:{ SQLiteException -> 0x0347 }
            r12.execSQL(r15, r4)     // Catch:{ SQLiteException -> 0x0347 }
            goto L_0x036b
        L_0x0347:
            r0 = move-exception
        L_0x0348:
            r4 = r0
            goto L_0x0358
        L_0x034a:
            r0 = move-exception
        L_0x034b:
            r16 = 0
            goto L_0x0348
        L_0x034e:
            r0 = move-exception
            r33 = r4
            goto L_0x034b
        L_0x0352:
            r0 = move-exception
            r33 = r4
            r16 = r15
            goto L_0x0348
        L_0x0358:
            n4.n4 r9 = r11.f9600a     // Catch:{ all -> 0x0d97 }
            n4.i3 r9 = r9.a()     // Catch:{ all -> 0x0d97 }
            n4.g3 r9 = r9.l()     // Catch:{ all -> 0x0d97 }
            java.lang.String r11 = "Error pruning currencies. appId"
            n4.h3 r12 = n4.i3.p(r10)     // Catch:{ all -> 0x0d97 }
            r9.c(r11, r12, r4)     // Catch:{ all -> 0x0d97 }
        L_0x036b:
            n4.b8 r18 = new n4.b8     // Catch:{ all -> 0x0d97 }
            java.lang.String r4 = r2.f10087c     // Catch:{ all -> 0x0d97 }
            w3.b r9 = r37.c()     // Catch:{ all -> 0x0d97 }
            y3.a r9 = (y3.a) r9     // Catch:{ all -> 0x0d97 }
            long r19 = r9.currentTimeMillis()     // Catch:{ all -> 0x0d97 }
            java.lang.Long r17 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0d97 }
            r11 = r18
            r12 = r10
            r13 = r4
            r14 = r8
            r4 = r16
            r15 = r19
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0d97 }
            goto L_0x0309
        L_0x038b:
            n4.i r9 = r1.f10284c     // Catch:{ all -> 0x0d97 }
            H(r9)     // Catch:{ all -> 0x0d97 }
            boolean r9 = r9.r(r8)     // Catch:{ all -> 0x0d97 }
            if (r9 != 0) goto L_0x03cf
            n4.i3 r9 = r37.a()     // Catch:{ all -> 0x0d97 }
            n4.g3 r9 = r9.l()     // Catch:{ all -> 0x0d97 }
            java.lang.String r11 = "Too many unique user properties are set. Ignoring user property. appId"
            n4.h3 r12 = n4.i3.p(r10)     // Catch:{ all -> 0x0d97 }
            n4.n4 r13 = r1.f10292l     // Catch:{ all -> 0x0d97 }
            n4.d3 r13 = r13.q()     // Catch:{ all -> 0x0d97 }
            java.lang.String r14 = r8.f9637c     // Catch:{ all -> 0x0d97 }
            java.lang.String r13 = r13.f(r14)     // Catch:{ all -> 0x0d97 }
            java.lang.Object r8 = r8.f9639e     // Catch:{ all -> 0x0d97 }
            r9.d(r11, r12, r13, r8)     // Catch:{ all -> 0x0d97 }
            n4.d8 r8 = r37.P()     // Catch:{ all -> 0x0d97 }
            g1.t r11 = r1.E     // Catch:{ all -> 0x0d97 }
            r13 = 9
            r14 = 0
            r15 = 0
            r16 = 0
            r8.getClass()     // Catch:{ all -> 0x0d97 }
            r12 = r10
            n4.d8.x(r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0d97 }
            goto L_0x03cf
        L_0x03c9:
            r33 = r4
            r32 = r21
            goto L_0x021f
        L_0x03cf:
            java.lang.String r8 = r2.f10085a     // Catch:{ all -> 0x0d97 }
            boolean r8 = n4.d8.U(r8)     // Catch:{ all -> 0x0d97 }
            java.lang.String r9 = r2.f10085a     // Catch:{ all -> 0x0d97 }
            r11 = r32
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0d97 }
            r37.P()     // Catch:{ all -> 0x0d97 }
            n4.p r11 = r2.f10086b     // Catch:{ all -> 0x0d97 }
            if (r11 != 0) goto L_0x03e7
            r16 = 0
            goto L_0x0410
        L_0x03e7:
            android.os.Bundle r12 = r11.f10048a     // Catch:{ all -> 0x0d97 }
            java.util.Set r12 = r12.keySet()     // Catch:{ all -> 0x0d97 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x0d97 }
            r16 = 0
        L_0x03f3:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x0d97 }
            if (r13 == 0) goto L_0x0410
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x0d97 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0d97 }
            android.os.Bundle r14 = r11.f10048a     // Catch:{ all -> 0x0d97 }
            java.lang.Object r13 = r14.get(r13)     // Catch:{ all -> 0x0d97 }
            boolean r14 = r13 instanceof android.os.Parcelable[]     // Catch:{ all -> 0x0d97 }
            if (r14 == 0) goto L_0x03f3
            android.os.Parcelable[] r13 = (android.os.Parcelable[]) r13     // Catch:{ all -> 0x0d97 }
            int r13 = r13.length     // Catch:{ all -> 0x0d97 }
            long r13 = (long) r13     // Catch:{ all -> 0x0d97 }
            long r16 = r16 + r13
            goto L_0x03f3
        L_0x0410:
            n4.i r11 = r1.f10284c     // Catch:{ all -> 0x0d97 }
            H(r11)     // Catch:{ all -> 0x0d97 }
            long r12 = r37.v()     // Catch:{ all -> 0x0d97 }
            r23 = 1
            long r15 = r16 + r23
            r17 = 1
            r20 = 0
            r21 = 0
            r32 = r5
            r4 = 0
            r14 = r10
            r18 = r8
            r19 = r20
            r20 = r9
            n4.g r11 = r11.D(r12, r14, r15, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0d97 }
            long r12 = r11.f9749b     // Catch:{ all -> 0x0d97 }
            r37.J()     // Catch:{ all -> 0x0d97 }
            n4.v2 r14 = n4.w2.f10226l     // Catch:{ all -> 0x0d97 }
            r15 = 0
            java.lang.Object r14 = r14.a(r15)     // Catch:{ all -> 0x0d97 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0d97 }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0d97 }
            r31 = r6
            r16 = r7
            long r6 = (long) r14     // Catch:{ all -> 0x0d97 }
            long r12 = r12 - r6
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            r17 = 1000(0x3e8, double:4.94E-321)
            if (r6 <= 0) goto L_0x047e
            long r12 = r12 % r17
            int r2 = (r12 > r23 ? 1 : (r12 == r23 ? 0 : -1))
            if (r2 != 0) goto L_0x046d
            n4.i3 r2 = r37.a()     // Catch:{ all -> 0x0d97 }
            n4.g3 r2 = r2.l()     // Catch:{ all -> 0x0d97 }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            n4.h3 r4 = n4.i3.p(r10)     // Catch:{ all -> 0x0d97 }
            long r5 = r11.f9749b     // Catch:{ all -> 0x0d97 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0d97 }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x0d97 }
        L_0x046d:
            n4.i r2 = r1.f10284c     // Catch:{ all -> 0x0d97 }
            H(r2)     // Catch:{ all -> 0x0d97 }
            r2.l()     // Catch:{ all -> 0x0d97 }
            n4.i r2 = r1.f10284c
            H(r2)
            r2.N()
            return
        L_0x047e:
            if (r8 == 0) goto L_0x04da
            long r6 = r11.f9748a     // Catch:{ all -> 0x0d97 }
            r37.J()     // Catch:{ all -> 0x0d97 }
            n4.v2 r12 = n4.w2.f10230n     // Catch:{ all -> 0x0d97 }
            java.lang.Object r12 = r12.a(r15)     // Catch:{ all -> 0x0d97 }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x0d97 }
            int r12 = r12.intValue()     // Catch:{ all -> 0x0d97 }
            long r12 = (long) r12     // Catch:{ all -> 0x0d97 }
            long r6 = r6 - r12
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x04da
            long r6 = r6 % r17
            int r3 = (r6 > r23 ? 1 : (r6 == r23 ? 0 : -1))
            if (r3 != 0) goto L_0x04b4
            n4.i3 r3 = r37.a()     // Catch:{ all -> 0x0d97 }
            n4.g3 r3 = r3.l()     // Catch:{ all -> 0x0d97 }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            n4.h3 r5 = n4.i3.p(r10)     // Catch:{ all -> 0x0d97 }
            long r6 = r11.f9748a     // Catch:{ all -> 0x0d97 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d97 }
            r3.c(r4, r5, r6)     // Catch:{ all -> 0x0d97 }
        L_0x04b4:
            n4.d8 r3 = r37.P()     // Catch:{ all -> 0x0d97 }
            g1.t r11 = r1.E     // Catch:{ all -> 0x0d97 }
            r13 = 16
            java.lang.String r14 = "_ev"
            java.lang.String r15 = r2.f10085a     // Catch:{ all -> 0x0d97 }
            r16 = 0
            r3.getClass()     // Catch:{ all -> 0x0d97 }
            r12 = r10
            n4.d8.x(r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0d97 }
            n4.i r2 = r1.f10284c     // Catch:{ all -> 0x0d97 }
            H(r2)     // Catch:{ all -> 0x0d97 }
            r2.l()     // Catch:{ all -> 0x0d97 }
            n4.i r2 = r1.f10284c
            H(r2)
            r2.N()
            return
        L_0x04da:
            r6 = 1000000(0xf4240, float:1.401298E-39)
            if (r9 == 0) goto L_0x0528
            long r12 = r11.f9751d     // Catch:{ all -> 0x0d97 }
            n4.f r7 = r37.J()     // Catch:{ all -> 0x0d97 }
            java.lang.String r9 = r3.f9768a     // Catch:{ all -> 0x0d97 }
            n4.v2 r14 = n4.w2.f10228m     // Catch:{ all -> 0x0d97 }
            int r7 = r7.i(r9, r14)     // Catch:{ all -> 0x0d97 }
            int r7 = java.lang.Math.min(r6, r7)     // Catch:{ all -> 0x0d97 }
            r9 = 0
            int r7 = java.lang.Math.max(r9, r7)     // Catch:{ all -> 0x0d97 }
            long r6 = (long) r7     // Catch:{ all -> 0x0d97 }
            long r12 = r12 - r6
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0528
            int r2 = (r12 > r23 ? 1 : (r12 == r23 ? 0 : -1))
            if (r2 != 0) goto L_0x0517
            n4.i3 r2 = r37.a()     // Catch:{ all -> 0x0d97 }
            n4.g3 r2 = r2.l()     // Catch:{ all -> 0x0d97 }
            java.lang.String r3 = "Too many error events logged. appId, count"
            n4.h3 r4 = n4.i3.p(r10)     // Catch:{ all -> 0x0d97 }
            long r5 = r11.f9751d     // Catch:{ all -> 0x0d97 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0d97 }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x0d97 }
        L_0x0517:
            n4.i r2 = r1.f10284c     // Catch:{ all -> 0x0d97 }
            H(r2)     // Catch:{ all -> 0x0d97 }
            r2.l()     // Catch:{ all -> 0x0d97 }
            n4.i r2 = r1.f10284c
            H(r2)
            r2.N()
            return
        L_0x0528:
            n4.p r6 = r2.f10086b     // Catch:{ all -> 0x0d97 }
            android.os.Bundle r6 = r6.x()     // Catch:{ all -> 0x0d97 }
            n4.d8 r7 = r37.P()     // Catch:{ all -> 0x0d97 }
            java.lang.String r11 = "_o"
            java.lang.String r12 = r2.f10087c     // Catch:{ all -> 0x0d97 }
            r7.y(r6, r11, r12)     // Catch:{ all -> 0x0d97 }
            n4.d8 r7 = r37.P()     // Catch:{ all -> 0x0d97 }
            r7.getClass()     // Catch:{ all -> 0x0d97 }
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0d97 }
            if (r11 == 0) goto L_0x0548
            r7 = 0
            goto L_0x055b
        L_0x0548:
            n4.n4 r11 = r7.f9600a     // Catch:{ all -> 0x0d97 }
            n4.f r11 = r11.f9992g     // Catch:{ all -> 0x0d97 }
            java.lang.String r12 = "debug.firebase.analytics.app"
            java.lang.String r11 = r11.h(r12)     // Catch:{ all -> 0x0d97 }
            n4.n4 r7 = r7.f9600a     // Catch:{ all -> 0x0d97 }
            r7.getClass()     // Catch:{ all -> 0x0d97 }
            boolean r7 = r11.equals(r10)     // Catch:{ all -> 0x0d97 }
        L_0x055b:
            java.lang.String r14 = "_r"
            if (r7 == 0) goto L_0x0573
            n4.d8 r7 = r37.P()     // Catch:{ all -> 0x0d97 }
            java.lang.String r11 = "_dbg"
            java.lang.Long r12 = java.lang.Long.valueOf(r23)     // Catch:{ all -> 0x0d97 }
            r7.y(r6, r11, r12)     // Catch:{ all -> 0x0d97 }
            n4.d8 r7 = r37.P()     // Catch:{ all -> 0x0d97 }
            r7.y(r6, r14, r12)     // Catch:{ all -> 0x0d97 }
        L_0x0573:
            java.lang.String r7 = "_s"
            java.lang.String r11 = r2.f10085a     // Catch:{ all -> 0x0d97 }
            boolean r7 = r7.equals(r11)     // Catch:{ all -> 0x0d97 }
            if (r7 == 0) goto L_0x059b
            n4.i r7 = r1.f10284c     // Catch:{ all -> 0x0d97 }
            H(r7)     // Catch:{ all -> 0x0d97 }
            java.lang.String r11 = r3.f9768a     // Catch:{ all -> 0x0d97 }
            r12 = r16
            n4.b8 r7 = r7.F(r11, r12)     // Catch:{ all -> 0x0d97 }
            if (r7 == 0) goto L_0x059b
            java.lang.Object r11 = r7.f9639e     // Catch:{ all -> 0x0d97 }
            boolean r11 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0d97 }
            if (r11 == 0) goto L_0x059b
            n4.d8 r11 = r37.P()     // Catch:{ all -> 0x0d97 }
            java.lang.Object r7 = r7.f9639e     // Catch:{ all -> 0x0d97 }
            r11.y(r6, r12, r7)     // Catch:{ all -> 0x0d97 }
        L_0x059b:
            n4.i r7 = r1.f10284c     // Catch:{ all -> 0x0d97 }
            H(r7)     // Catch:{ all -> 0x0d97 }
            r3.o.e(r10)     // Catch:{ all -> 0x0d97 }
            r7.g()     // Catch:{ all -> 0x0d97 }
            r7.h()     // Catch:{ all -> 0x0d97 }
            android.database.sqlite.SQLiteDatabase r11 = r7.z()     // Catch:{ SQLiteException -> 0x05e1 }
            n4.n4 r12 = r7.f9600a     // Catch:{ SQLiteException -> 0x05e1 }
            n4.f r12 = r12.m()     // Catch:{ SQLiteException -> 0x05e1 }
            n4.v2 r13 = n4.w2.f10235q     // Catch:{ SQLiteException -> 0x05e1 }
            int r12 = r12.i(r10, r13)     // Catch:{ SQLiteException -> 0x05e1 }
            r9 = 1000000(0xf4240, float:1.401298E-39)
            int r9 = java.lang.Math.min(r9, r12)     // Catch:{ SQLiteException -> 0x05e1 }
            r13 = 0
            int r9 = java.lang.Math.max(r13, r9)     // Catch:{ SQLiteException -> 0x05dc }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x05dc }
            java.lang.String r12 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            r15 = 2
            java.lang.String[] r15 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x05dc }
            r15[r13] = r10     // Catch:{ SQLiteException -> 0x05dc }
            r15[r28] = r9     // Catch:{ SQLiteException -> 0x05dc }
            r9 = r31
            int r7 = r11.delete(r9, r12, r15)     // Catch:{ SQLiteException -> 0x05da }
            long r11 = (long) r7
            goto L_0x05fa
        L_0x05da:
            r0 = move-exception
            goto L_0x05df
        L_0x05dc:
            r0 = move-exception
            r9 = r31
        L_0x05df:
            r11 = r0
            goto L_0x05e6
        L_0x05e1:
            r0 = move-exception
            r9 = r31
            r13 = 0
            goto L_0x05df
        L_0x05e6:
            n4.n4 r7 = r7.f9600a     // Catch:{ all -> 0x0d97 }
            n4.i3 r7 = r7.a()     // Catch:{ all -> 0x0d97 }
            n4.g3 r7 = r7.l()     // Catch:{ all -> 0x0d97 }
            java.lang.String r12 = "Error deleting over the limit events. appId"
            n4.h3 r15 = n4.i3.p(r10)     // Catch:{ all -> 0x0d97 }
            r7.c(r12, r15, r11)     // Catch:{ all -> 0x0d97 }
            r11 = r4
        L_0x05fa:
            int r7 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x0613
            n4.i3 r7 = r37.a()     // Catch:{ all -> 0x0d97 }
            n4.g3 r7 = r7.n()     // Catch:{ all -> 0x0d97 }
            java.lang.String r15 = "Data lost. Too many events stored on disk, deleted. appId"
            n4.h3 r13 = n4.i3.p(r10)     // Catch:{ all -> 0x0d97 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0d97 }
            r7.c(r15, r13, r11)     // Catch:{ all -> 0x0d97 }
        L_0x0613:
            n4.m r7 = new n4.m     // Catch:{ all -> 0x0d97 }
            n4.n4 r12 = r1.f10292l     // Catch:{ all -> 0x0d97 }
            java.lang.String r13 = r2.f10087c     // Catch:{ all -> 0x0d97 }
            java.lang.String r15 = r2.f10085a     // Catch:{ all -> 0x0d97 }
            long r4 = r2.f10088d     // Catch:{ all -> 0x0d97 }
            r11 = r7
            r2 = 0
            r2 = r14
            r14 = r10
            r34 = r9
            r9 = 0
            r16 = r4
            r18 = r6
            r11.<init>(r12, r13, r14, r15, r16, r18)     // Catch:{ all -> 0x0d97 }
            n4.i r4 = r1.f10284c     // Catch:{ all -> 0x0d97 }
            H(r4)     // Catch:{ all -> 0x0d97 }
            java.lang.String r5 = r7.f9936b     // Catch:{ all -> 0x0d97 }
            n4.n r4 = r4.E(r10, r5)     // Catch:{ all -> 0x0d97 }
            if (r4 != 0) goto L_0x06c1
            n4.i r4 = r1.f10284c     // Catch:{ all -> 0x0d97 }
            H(r4)     // Catch:{ all -> 0x0d97 }
            long r4 = r4.y(r10)     // Catch:{ all -> 0x0d97 }
            n4.f r6 = r37.J()     // Catch:{ all -> 0x0d97 }
            r6.getClass()     // Catch:{ all -> 0x0d97 }
            n4.v2 r11 = n4.w2.H     // Catch:{ all -> 0x0d97 }
            r12 = 2000(0x7d0, float:2.803E-42)
            r13 = 500(0x1f4, float:7.0E-43)
            int r6 = r6.j(r10, r11, r13, r12)     // Catch:{ all -> 0x0d97 }
            long r14 = (long) r6     // Catch:{ all -> 0x0d97 }
            int r4 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r4 < 0) goto L_0x06a1
            if (r8 == 0) goto L_0x06a1
            n4.i3 r2 = r37.a()     // Catch:{ all -> 0x0d97 }
            n4.g3 r2 = r2.l()     // Catch:{ all -> 0x0d97 }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            n4.h3 r4 = n4.i3.p(r10)     // Catch:{ all -> 0x0d97 }
            n4.n4 r5 = r1.f10292l     // Catch:{ all -> 0x0d97 }
            n4.d3 r5 = r5.q()     // Catch:{ all -> 0x0d97 }
            java.lang.String r6 = r7.f9936b     // Catch:{ all -> 0x0d97 }
            java.lang.String r5 = r5.d(r6)     // Catch:{ all -> 0x0d97 }
            n4.f r6 = r37.J()     // Catch:{ all -> 0x0d97 }
            r6.getClass()     // Catch:{ all -> 0x0d97 }
            int r6 = r6.j(r10, r11, r13, r12)     // Catch:{ all -> 0x0d97 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0d97 }
            r2.d(r3, r4, r5, r6)     // Catch:{ all -> 0x0d97 }
            n4.d8 r2 = r37.P()     // Catch:{ all -> 0x0d97 }
            g1.t r11 = r1.E     // Catch:{ all -> 0x0d97 }
            r13 = 8
            r14 = 0
            r15 = 0
            r16 = 0
            r2.getClass()     // Catch:{ all -> 0x0d97 }
            r12 = r10
            n4.d8.x(r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0d97 }
            n4.i r2 = r1.f10284c
            H(r2)
            r2.N()
            return
        L_0x06a1:
            n4.n r4 = new n4.n     // Catch:{ all -> 0x0d97 }
            java.lang.String r13 = r7.f9936b     // Catch:{ all -> 0x0d97 }
            long r5 = r7.f9938d     // Catch:{ all -> 0x0d97 }
            r14 = 0
            r16 = 0
            r18 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r11 = r4
            r12 = r10
            r20 = r5
            r11.<init>(r12, r13, r14, r16, r18, r20, r22, r24, r25, r26, r27)     // Catch:{ all -> 0x0d97 }
            r35 = r2
            goto L_0x06fe
        L_0x06c1:
            n4.n4 r5 = r1.f10292l     // Catch:{ all -> 0x0d97 }
            long r10 = r4.f9978f     // Catch:{ all -> 0x0d97 }
            n4.m r7 = r7.a(r5, r10)     // Catch:{ all -> 0x0d97 }
            long r5 = r7.f9938d     // Catch:{ all -> 0x0d97 }
            n4.n r8 = new n4.n     // Catch:{ all -> 0x0d97 }
            java.lang.String r11 = r4.f9973a     // Catch:{ all -> 0x0d97 }
            java.lang.String r12 = r4.f9974b     // Catch:{ all -> 0x0d97 }
            long r13 = r4.f9975c     // Catch:{ all -> 0x0d97 }
            long r9 = r4.f9976d     // Catch:{ all -> 0x0d97 }
            r35 = r2
            long r2 = r4.f9977e     // Catch:{ all -> 0x0d97 }
            r19 = r5
            long r5 = r4.f9979g     // Catch:{ all -> 0x0d97 }
            java.lang.Long r15 = r4.f9980h     // Catch:{ all -> 0x0d97 }
            r36 = r7
            java.lang.Long r7 = r4.f9981i     // Catch:{ all -> 0x0d97 }
            r16 = r9
            java.lang.Long r9 = r4.f9982j     // Catch:{ all -> 0x0d97 }
            java.lang.Boolean r4 = r4.k     // Catch:{ all -> 0x0d97 }
            r10 = r8
            r23 = r15
            r15 = r16
            r17 = r2
            r21 = r5
            r24 = r7
            r25 = r9
            r26 = r4
            r10.<init>(r11, r12, r13, r15, r17, r19, r21, r23, r24, r25, r26)     // Catch:{ all -> 0x0d97 }
            r4 = r8
            r7 = r36
        L_0x06fe:
            n4.i r2 = r1.f10284c     // Catch:{ all -> 0x0d97 }
            H(r2)     // Catch:{ all -> 0x0d97 }
            r2.n(r4)     // Catch:{ all -> 0x0d97 }
            n4.m4 r2 = r37.d()     // Catch:{ all -> 0x0d97 }
            r2.g()     // Catch:{ all -> 0x0d97 }
            r37.g()     // Catch:{ all -> 0x0d97 }
            java.lang.String r2 = r7.f9935a     // Catch:{ all -> 0x0d97 }
            r3.o.e(r2)     // Catch:{ all -> 0x0d97 }
            java.lang.String r2 = r7.f9935a     // Catch:{ all -> 0x0d97 }
            r3 = r39
            java.lang.String r4 = r3.f9768a     // Catch:{ all -> 0x0d97 }
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0d97 }
            r3.o.b(r2)     // Catch:{ all -> 0x0d97 }
            j4.s3 r2 = j4.t3.G1()     // Catch:{ all -> 0x0d97 }
            r2.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r4 = r2.f8238b     // Catch:{ all -> 0x0d97 }
            j4.t3 r4 = (j4.t3) r4     // Catch:{ all -> 0x0d97 }
            j4.t3.o0(r4)     // Catch:{ all -> 0x0d97 }
            r2.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r4 = r2.f8238b     // Catch:{ all -> 0x0d97 }
            j4.t3 r4 = (j4.t3) r4     // Catch:{ all -> 0x0d97 }
            j4.t3.L0(r4)     // Catch:{ all -> 0x0d97 }
            java.lang.String r4 = r3.f9768a     // Catch:{ all -> 0x0d97 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0d97 }
            if (r4 != 0) goto L_0x074e
            java.lang.String r4 = r3.f9768a     // Catch:{ all -> 0x0d97 }
            r2.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r5 = r2.f8238b     // Catch:{ all -> 0x0d97 }
            j4.t3 r5 = (j4.t3) r5     // Catch:{ all -> 0x0d97 }
            j4.t3.U(r5, r4)     // Catch:{ all -> 0x0d97 }
        L_0x074e:
            java.lang.String r4 = r3.f9771d     // Catch:{ all -> 0x0d97 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0d97 }
            if (r4 != 0) goto L_0x0762
            java.lang.String r4 = r3.f9771d     // Catch:{ all -> 0x0d97 }
            r2.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r5 = r2.f8238b     // Catch:{ all -> 0x0d97 }
            j4.t3 r5 = (j4.t3) r5     // Catch:{ all -> 0x0d97 }
            j4.t3.T(r5, r4)     // Catch:{ all -> 0x0d97 }
        L_0x0762:
            java.lang.String r4 = r3.f9770c     // Catch:{ all -> 0x0d97 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0d97 }
            if (r4 != 0) goto L_0x0776
            java.lang.String r4 = r3.f9770c     // Catch:{ all -> 0x0d97 }
            r2.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r5 = r2.f8238b     // Catch:{ all -> 0x0d97 }
            j4.t3 r5 = (j4.t3) r5     // Catch:{ all -> 0x0d97 }
            j4.t3.V(r5, r4)     // Catch:{ all -> 0x0d97 }
        L_0x0776:
            j4.tc.b()     // Catch:{ all -> 0x0d97 }
            java.lang.String r4 = r3.f9788x     // Catch:{ all -> 0x0d97 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0d97 }
            if (r4 != 0) goto L_0x07a8
            n4.f r4 = r37.J()     // Catch:{ all -> 0x0d97 }
            n4.v2 r5 = n4.w2.f10222i0     // Catch:{ all -> 0x0d97 }
            r6 = 0
            boolean r4 = r4.o(r6, r5)     // Catch:{ all -> 0x0d97 }
            if (r4 != 0) goto L_0x079c
            n4.f r4 = r37.J()     // Catch:{ all -> 0x0d97 }
            java.lang.String r5 = r3.f9768a     // Catch:{ all -> 0x0d97 }
            n4.v2 r6 = n4.w2.f10225k0     // Catch:{ all -> 0x0d97 }
            boolean r4 = r4.o(r5, r6)     // Catch:{ all -> 0x0d97 }
            if (r4 == 0) goto L_0x07a8
        L_0x079c:
            java.lang.String r4 = r3.f9788x     // Catch:{ all -> 0x0d97 }
            r2.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r5 = r2.f8238b     // Catch:{ all -> 0x0d97 }
            j4.t3 r5 = (j4.t3) r5     // Catch:{ all -> 0x0d97 }
            j4.t3.u0(r5, r4)     // Catch:{ all -> 0x0d97 }
        L_0x07a8:
            long r4 = r3.f9777j     // Catch:{ all -> 0x0d97 }
            r8 = -2147483648(0xffffffff80000000, double:NaN)
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x07bc
            int r4 = (int) r4     // Catch:{ all -> 0x0d97 }
            r2.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r5 = r2.f8238b     // Catch:{ all -> 0x0d97 }
            j4.t3 r5 = (j4.t3) r5     // Catch:{ all -> 0x0d97 }
            j4.t3.n0(r5, r4)     // Catch:{ all -> 0x0d97 }
        L_0x07bc:
            long r4 = r3.f9772e     // Catch:{ all -> 0x0d97 }
            r2.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r6 = r2.f8238b     // Catch:{ all -> 0x0d97 }
            j4.t3 r6 = (j4.t3) r6     // Catch:{ all -> 0x0d97 }
            j4.t3.W(r6, r4)     // Catch:{ all -> 0x0d97 }
            java.lang.String r4 = r3.f9769b     // Catch:{ all -> 0x0d97 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0d97 }
            if (r4 != 0) goto L_0x07dc
            java.lang.String r4 = r3.f9769b     // Catch:{ all -> 0x0d97 }
            r2.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r5 = r2.f8238b     // Catch:{ all -> 0x0d97 }
            j4.t3 r5 = (j4.t3) r5     // Catch:{ all -> 0x0d97 }
            j4.t3.i0(r5, r4)     // Catch:{ all -> 0x0d97 }
        L_0x07dc:
            java.lang.String r4 = r3.f9768a     // Catch:{ all -> 0x0d97 }
            r3.o.h(r4)     // Catch:{ all -> 0x0d97 }
            n4.f5 r4 = r1.M(r4)     // Catch:{ all -> 0x0d97 }
            java.lang.String r5 = r3.f9787v     // Catch:{ all -> 0x0d97 }
            r6 = 100
            n4.f5 r5 = n4.f5.b(r6, r5)     // Catch:{ all -> 0x0d97 }
            n4.f5 r4 = r4.c(r5)     // Catch:{ all -> 0x0d97 }
            java.lang.String r4 = r4.e()     // Catch:{ all -> 0x0d97 }
            r2.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r5 = r2.f8238b     // Catch:{ all -> 0x0d97 }
            j4.t3 r5 = (j4.t3) r5     // Catch:{ all -> 0x0d97 }
            j4.t3.R(r5, r4)     // Catch:{ all -> 0x0d97 }
            java.lang.String r4 = r2.q()     // Catch:{ all -> 0x0d97 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0d97 }
            if (r4 == 0) goto L_0x081d
            java.lang.String r4 = r3.f9783q     // Catch:{ all -> 0x0d97 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0d97 }
            if (r4 != 0) goto L_0x081d
            java.lang.String r4 = r3.f9783q     // Catch:{ all -> 0x0d97 }
            r2.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r5 = r2.f8238b     // Catch:{ all -> 0x0d97 }
            j4.t3 r5 = (j4.t3) r5     // Catch:{ all -> 0x0d97 }
            j4.t3.M(r5, r4)     // Catch:{ all -> 0x0d97 }
        L_0x081d:
            long r4 = r3.f9773f     // Catch:{ all -> 0x0d97 }
            r8 = 0
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x082f
            r2.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r6 = r2.f8238b     // Catch:{ all -> 0x0d97 }
            j4.t3 r6 = (j4.t3) r6     // Catch:{ all -> 0x0d97 }
            j4.t3.e0(r6, r4)     // Catch:{ all -> 0x0d97 }
        L_0x082f:
            long r4 = r3.f9785s     // Catch:{ all -> 0x0d97 }
            r2.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r6 = r2.f8238b     // Catch:{ all -> 0x0d97 }
            j4.t3 r6 = (j4.t3) r6     // Catch:{ all -> 0x0d97 }
            j4.t3.P(r6, r4)     // Catch:{ all -> 0x0d97 }
            n4.y7 r4 = r1.f10288g     // Catch:{ all -> 0x0d97 }
            H(r4)     // Catch:{ all -> 0x0d97 }
            n4.w7 r5 = r4.f10066b     // Catch:{ all -> 0x0d97 }
            n4.n4 r5 = r5.f10292l     // Catch:{ all -> 0x0d97 }
            android.content.Context r5 = r5.f()     // Catch:{ all -> 0x0d97 }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ all -> 0x0d97 }
            android.net.Uri r6 = j4.v4.a()     // Catch:{ all -> 0x0d97 }
            n4.t r8 = n4.t.f10126a     // Catch:{ all -> 0x0d97 }
            j4.o4 r5 = j4.o4.a(r5, r6, r8)     // Catch:{ all -> 0x0d97 }
            if (r5 != 0) goto L_0x085d
            java.util.Map r5 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0d97 }
            goto L_0x0861
        L_0x085d:
            java.util.Map r5 = r5.b()     // Catch:{ all -> 0x0d97 }
        L_0x0861:
            if (r5 == 0) goto L_0x08e8
            boolean r6 = r5.isEmpty()     // Catch:{ all -> 0x0d97 }
            if (r6 == 0) goto L_0x086b
            goto L_0x08e8
        L_0x086b:
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0d97 }
            r13.<init>()     // Catch:{ all -> 0x0d97 }
            n4.v2 r6 = n4.w2.P     // Catch:{ all -> 0x0d97 }
            r8 = 0
            java.lang.Object r6 = r6.a(r8)     // Catch:{ all -> 0x0d97 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0d97 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x0d97 }
            java.util.Set r5 = r5.entrySet()     // Catch:{ all -> 0x0d97 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0d97 }
        L_0x0885:
            boolean r8 = r5.hasNext()     // Catch:{ all -> 0x0d97 }
            if (r8 == 0) goto L_0x08e2
            java.lang.Object r8 = r5.next()     // Catch:{ all -> 0x0d97 }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ all -> 0x0d97 }
            java.lang.Object r9 = r8.getKey()     // Catch:{ all -> 0x0d97 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0d97 }
            java.lang.String r10 = "measurement.id."
            boolean r9 = r9.startsWith(r10)     // Catch:{ all -> 0x0d97 }
            if (r9 == 0) goto L_0x0885
            java.lang.Object r8 = r8.getValue()     // Catch:{ NumberFormatException -> 0x08d0 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ NumberFormatException -> 0x08d0 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x08d0 }
            if (r8 == 0) goto L_0x0885
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ NumberFormatException -> 0x08d0 }
            r13.add(r8)     // Catch:{ NumberFormatException -> 0x08d0 }
            int r8 = r13.size()     // Catch:{ NumberFormatException -> 0x08d0 }
            if (r8 < r6) goto L_0x0885
            n4.n4 r8 = r4.f9600a     // Catch:{ NumberFormatException -> 0x08d0 }
            n4.i3 r8 = r8.a()     // Catch:{ NumberFormatException -> 0x08d0 }
            n4.g3 r8 = r8.n()     // Catch:{ NumberFormatException -> 0x08d0 }
            java.lang.String r9 = "Too many experiment IDs. Number of IDs"
            int r10 = r13.size()     // Catch:{ NumberFormatException -> 0x08d0 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x08d0 }
            r8.b(r9, r10)     // Catch:{ NumberFormatException -> 0x08d0 }
            goto L_0x08e2
        L_0x08d0:
            r0 = move-exception
            r8 = r0
            n4.n4 r9 = r4.f9600a     // Catch:{ all -> 0x0d97 }
            n4.i3 r9 = r9.a()     // Catch:{ all -> 0x0d97 }
            n4.g3 r9 = r9.n()     // Catch:{ all -> 0x0d97 }
            java.lang.String r10 = "Experiment ID NumberFormatException"
            r9.b(r10, r8)     // Catch:{ all -> 0x0d97 }
            goto L_0x0885
        L_0x08e2:
            boolean r4 = r13.isEmpty()     // Catch:{ all -> 0x0d97 }
            if (r4 == 0) goto L_0x08e9
        L_0x08e8:
            r13 = 0
        L_0x08e9:
            if (r13 == 0) goto L_0x08ee
            r2.v(r13)     // Catch:{ all -> 0x0d97 }
        L_0x08ee:
            java.lang.String r4 = r3.f9768a     // Catch:{ all -> 0x0d97 }
            r3.o.h(r4)     // Catch:{ all -> 0x0d97 }
            n4.f5 r4 = r1.M(r4)     // Catch:{ all -> 0x0d97 }
            java.lang.String r5 = r3.f9787v     // Catch:{ all -> 0x0d97 }
            r6 = 100
            n4.f5 r5 = n4.f5.b(r6, r5)     // Catch:{ all -> 0x0d97 }
            n4.f5 r4 = r4.c(r5)     // Catch:{ all -> 0x0d97 }
            n4.e5 r5 = n4.e5.AD_STORAGE     // Catch:{ all -> 0x0d97 }
            boolean r6 = r4.f(r5)     // Catch:{ all -> 0x0d97 }
            if (r6 == 0) goto L_0x095a
            boolean r6 = r3.f9781o     // Catch:{ all -> 0x0d97 }
            if (r6 == 0) goto L_0x095a
            n4.d7 r6 = r1.f10290i     // Catch:{ all -> 0x0d97 }
            java.lang.String r8 = r3.f9768a     // Catch:{ all -> 0x0d97 }
            r6.getClass()     // Catch:{ all -> 0x0d97 }
            boolean r9 = r4.f(r5)     // Catch:{ all -> 0x0d97 }
            if (r9 == 0) goto L_0x0921
            android.util.Pair r6 = r6.k(r8)     // Catch:{ all -> 0x0d97 }
            goto L_0x092a
        L_0x0921:
            android.util.Pair r6 = new android.util.Pair     // Catch:{ all -> 0x0d97 }
            java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0d97 }
            java.lang.String r9 = ""
            r6.<init>(r9, r8)     // Catch:{ all -> 0x0d97 }
        L_0x092a:
            java.lang.Object r8 = r6.first     // Catch:{ all -> 0x0d97 }
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ all -> 0x0d97 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0d97 }
            if (r8 != 0) goto L_0x095a
            boolean r8 = r3.f9781o     // Catch:{ all -> 0x0d97 }
            if (r8 == 0) goto L_0x095a
            java.lang.Object r8 = r6.first     // Catch:{ all -> 0x0d97 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0d97 }
            r2.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r9 = r2.f8238b     // Catch:{ all -> 0x0d97 }
            j4.t3 r9 = (j4.t3) r9     // Catch:{ all -> 0x0d97 }
            j4.t3.Y(r9, r8)     // Catch:{ all -> 0x0d97 }
            java.lang.Object r6 = r6.second     // Catch:{ all -> 0x0d97 }
            if (r6 == 0) goto L_0x095a
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0d97 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0d97 }
            r2.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r8 = r2.f8238b     // Catch:{ all -> 0x0d97 }
            j4.t3 r8 = (j4.t3) r8     // Catch:{ all -> 0x0d97 }
            j4.t3.a0(r8, r6)     // Catch:{ all -> 0x0d97 }
        L_0x095a:
            n4.n4 r6 = r1.f10292l     // Catch:{ all -> 0x0d97 }
            n4.l r6 = r6.n()     // Catch:{ all -> 0x0d97 }
            r6.i()     // Catch:{ all -> 0x0d97 }
            java.lang.String r6 = android.os.Build.MODEL     // Catch:{ all -> 0x0d97 }
            r2.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r8 = r2.f8238b     // Catch:{ all -> 0x0d97 }
            j4.t3 r8 = (j4.t3) r8     // Catch:{ all -> 0x0d97 }
            j4.t3.O0(r8, r6)     // Catch:{ all -> 0x0d97 }
            n4.n4 r6 = r1.f10292l     // Catch:{ all -> 0x0d97 }
            n4.l r6 = r6.n()     // Catch:{ all -> 0x0d97 }
            r6.i()     // Catch:{ all -> 0x0d97 }
            java.lang.String r6 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0d97 }
            r2.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r8 = r2.f8238b     // Catch:{ all -> 0x0d97 }
            j4.t3 r8 = (j4.t3) r8     // Catch:{ all -> 0x0d97 }
            j4.t3.M0(r8, r6)     // Catch:{ all -> 0x0d97 }
            n4.n4 r6 = r1.f10292l     // Catch:{ all -> 0x0d97 }
            n4.l r6 = r6.n()     // Catch:{ all -> 0x0d97 }
            long r8 = r6.l()     // Catch:{ all -> 0x0d97 }
            int r6 = (int) r8     // Catch:{ all -> 0x0d97 }
            r2.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r8 = r2.f8238b     // Catch:{ all -> 0x0d97 }
            j4.t3 r8 = (j4.t3) r8     // Catch:{ all -> 0x0d97 }
            j4.t3.R0(r8, r6)     // Catch:{ all -> 0x0d97 }
            n4.n4 r6 = r1.f10292l     // Catch:{ all -> 0x0d97 }
            n4.l r6 = r6.n()     // Catch:{ all -> 0x0d97 }
            java.lang.String r6 = r6.m()     // Catch:{ all -> 0x0d97 }
            r2.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r8 = r2.f8238b     // Catch:{ all -> 0x0d97 }
            j4.t3 r8 = (j4.t3) r8     // Catch:{ all -> 0x0d97 }
            j4.t3.Q0(r8, r6)     // Catch:{ all -> 0x0d97 }
            j4.xb.a()     // Catch:{ all -> 0x0d97 }
            n4.f r6 = r37.J()     // Catch:{ all -> 0x0d97 }
            n4.v2 r8 = n4.w2.f10245w0     // Catch:{ all -> 0x0d97 }
            r9 = 0
            boolean r6 = r6.o(r9, r8)     // Catch:{ all -> 0x0d97 }
            if (r6 == 0) goto L_0x09c9
            long r8 = r3.f9790z     // Catch:{ all -> 0x0d97 }
            r2.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r6 = r2.f8238b     // Catch:{ all -> 0x0d97 }
            j4.t3 r6 = (j4.t3) r6     // Catch:{ all -> 0x0d97 }
            j4.t3.z0(r6, r8)     // Catch:{ all -> 0x0d97 }
        L_0x09c9:
            n4.n4 r6 = r1.f10292l     // Catch:{ all -> 0x0d97 }
            boolean r6 = r6.g()     // Catch:{ all -> 0x0d97 }
            if (r6 == 0) goto L_0x09e5
            r2.p()     // Catch:{ all -> 0x0d97 }
            r6 = 0
            boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0d97 }
            if (r8 == 0) goto L_0x09dc
            goto L_0x09e5
        L_0x09dc:
            r2.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r2 = r2.f8238b     // Catch:{ all -> 0x0d97 }
            j4.t3 r2 = (j4.t3) r2     // Catch:{ all -> 0x0d97 }
            r2 = 0
            throw r2     // Catch:{ all -> 0x0d97 }
        L_0x09e5:
            n4.i r6 = r1.f10284c     // Catch:{ all -> 0x0d97 }
            H(r6)     // Catch:{ all -> 0x0d97 }
            java.lang.String r8 = r3.f9768a     // Catch:{ all -> 0x0d97 }
            n4.d5 r6 = r6.A(r8)     // Catch:{ all -> 0x0d97 }
            if (r6 != 0) goto L_0x0a55
            n4.d5 r6 = new n4.d5     // Catch:{ all -> 0x0d97 }
            n4.n4 r8 = r1.f10292l     // Catch:{ all -> 0x0d97 }
            java.lang.String r9 = r3.f9768a     // Catch:{ all -> 0x0d97 }
            r6.<init>(r8, r9)     // Catch:{ all -> 0x0d97 }
            java.lang.String r8 = r1.Q(r4)     // Catch:{ all -> 0x0d97 }
            r6.c(r8)     // Catch:{ all -> 0x0d97 }
            java.lang.String r8 = r3.k     // Catch:{ all -> 0x0d97 }
            r6.j(r8)     // Catch:{ all -> 0x0d97 }
            java.lang.String r8 = r3.f9769b     // Catch:{ all -> 0x0d97 }
            r6.k(r8)     // Catch:{ all -> 0x0d97 }
            boolean r5 = r4.f(r5)     // Catch:{ all -> 0x0d97 }
            if (r5 == 0) goto L_0x0a1f
            n4.d7 r5 = r1.f10290i     // Catch:{ all -> 0x0d97 }
            java.lang.String r8 = r3.f9768a     // Catch:{ all -> 0x0d97 }
            boolean r9 = r3.f9781o     // Catch:{ all -> 0x0d97 }
            java.lang.String r5 = r5.l(r8, r9)     // Catch:{ all -> 0x0d97 }
            r6.r(r5)     // Catch:{ all -> 0x0d97 }
        L_0x0a1f:
            r8 = 0
            r6.o(r8)     // Catch:{ all -> 0x0d97 }
            r6.p(r8)     // Catch:{ all -> 0x0d97 }
            r6.n(r8)     // Catch:{ all -> 0x0d97 }
            java.lang.String r5 = r3.f9770c     // Catch:{ all -> 0x0d97 }
            r6.e(r5)     // Catch:{ all -> 0x0d97 }
            long r8 = r3.f9777j     // Catch:{ all -> 0x0d97 }
            r6.f(r8)     // Catch:{ all -> 0x0d97 }
            java.lang.String r5 = r3.f9771d     // Catch:{ all -> 0x0d97 }
            r6.d(r5)     // Catch:{ all -> 0x0d97 }
            long r8 = r3.f9772e     // Catch:{ all -> 0x0d97 }
            r6.l(r8)     // Catch:{ all -> 0x0d97 }
            long r8 = r3.f9773f     // Catch:{ all -> 0x0d97 }
            r6.h(r8)     // Catch:{ all -> 0x0d97 }
            boolean r5 = r3.f9775h     // Catch:{ all -> 0x0d97 }
            r6.q(r5)     // Catch:{ all -> 0x0d97 }
            long r8 = r3.f9785s     // Catch:{ all -> 0x0d97 }
            r6.i(r8)     // Catch:{ all -> 0x0d97 }
            n4.i r5 = r1.f10284c     // Catch:{ all -> 0x0d97 }
            H(r5)     // Catch:{ all -> 0x0d97 }
            r5.m(r6)     // Catch:{ all -> 0x0d97 }
        L_0x0a55:
            n4.e5 r5 = n4.e5.ANALYTICS_STORAGE     // Catch:{ all -> 0x0d97 }
            boolean r4 = r4.f(r5)     // Catch:{ all -> 0x0d97 }
            if (r4 == 0) goto L_0x0a78
            java.lang.String r4 = r6.x()     // Catch:{ all -> 0x0d97 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0d97 }
            if (r4 != 0) goto L_0x0a78
            java.lang.String r4 = r6.x()     // Catch:{ all -> 0x0d97 }
            r3.o.h(r4)     // Catch:{ all -> 0x0d97 }
            r2.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r5 = r2.f8238b     // Catch:{ all -> 0x0d97 }
            j4.t3 r5 = (j4.t3) r5     // Catch:{ all -> 0x0d97 }
            j4.t3.c0(r5, r4)     // Catch:{ all -> 0x0d97 }
        L_0x0a78:
            java.lang.String r4 = r6.z()     // Catch:{ all -> 0x0d97 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0d97 }
            if (r4 != 0) goto L_0x0a93
            java.lang.String r4 = r6.z()     // Catch:{ all -> 0x0d97 }
            r3.o.h(r4)     // Catch:{ all -> 0x0d97 }
            r2.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r5 = r2.f8238b     // Catch:{ all -> 0x0d97 }
            j4.t3 r5 = (j4.t3) r5     // Catch:{ all -> 0x0d97 }
            j4.t3.m0(r5, r4)     // Catch:{ all -> 0x0d97 }
        L_0x0a93:
            n4.i r4 = r1.f10284c     // Catch:{ all -> 0x0d97 }
            H(r4)     // Catch:{ all -> 0x0d97 }
            java.lang.String r5 = r3.f9768a     // Catch:{ all -> 0x0d97 }
            java.util.List r4 = r4.K(r5)     // Catch:{ all -> 0x0d97 }
            r15 = 0
        L_0x0a9f:
            int r5 = r4.size()     // Catch:{ all -> 0x0d97 }
            if (r15 >= r5) goto L_0x0baf
            j4.b4 r5 = j4.c4.w()     // Catch:{ all -> 0x0d97 }
            java.lang.Object r8 = r4.get(r15)     // Catch:{ all -> 0x0d97 }
            n4.b8 r8 = (n4.b8) r8     // Catch:{ all -> 0x0d97 }
            java.lang.String r8 = r8.f9637c     // Catch:{ all -> 0x0d97 }
            r5.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r9 = r5.f8238b     // Catch:{ all -> 0x0d97 }
            j4.c4 r9 = (j4.c4) r9     // Catch:{ all -> 0x0d97 }
            j4.c4.B(r9, r8)     // Catch:{ all -> 0x0d97 }
            java.lang.Object r8 = r4.get(r15)     // Catch:{ all -> 0x0d97 }
            n4.b8 r8 = (n4.b8) r8     // Catch:{ all -> 0x0d97 }
            long r8 = r8.f9638d     // Catch:{ all -> 0x0d97 }
            r5.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r10 = r5.f8238b     // Catch:{ all -> 0x0d97 }
            j4.c4 r10 = (j4.c4) r10     // Catch:{ all -> 0x0d97 }
            j4.c4.A(r10, r8)     // Catch:{ all -> 0x0d97 }
            n4.y7 r8 = r1.f10288g     // Catch:{ all -> 0x0d97 }
            H(r8)     // Catch:{ all -> 0x0d97 }
            java.lang.Object r9 = r4.get(r15)     // Catch:{ all -> 0x0d97 }
            n4.b8 r9 = (n4.b8) r9     // Catch:{ all -> 0x0d97 }
            java.lang.Object r9 = r9.f9639e     // Catch:{ all -> 0x0d97 }
            r3.o.h(r9)     // Catch:{ all -> 0x0d97 }
            r5.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r10 = r5.f8238b     // Catch:{ all -> 0x0d97 }
            j4.c4 r10 = (j4.c4) r10     // Catch:{ all -> 0x0d97 }
            j4.c4.D(r10)     // Catch:{ all -> 0x0d97 }
            r5.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r10 = r5.f8238b     // Catch:{ all -> 0x0d97 }
            j4.c4 r10 = (j4.c4) r10     // Catch:{ all -> 0x0d97 }
            j4.c4.F(r10)     // Catch:{ all -> 0x0d97 }
            r5.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r10 = r5.f8238b     // Catch:{ all -> 0x0d97 }
            j4.c4 r10 = (j4.c4) r10     // Catch:{ all -> 0x0d97 }
            j4.c4.H(r10)     // Catch:{ all -> 0x0d97 }
            boolean r10 = r9 instanceof java.lang.String     // Catch:{ all -> 0x0d97 }
            if (r10 == 0) goto L_0x0b0c
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0d97 }
            r5.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r8 = r5.f8238b     // Catch:{ all -> 0x0d97 }
            j4.c4 r8 = (j4.c4) r8     // Catch:{ all -> 0x0d97 }
            j4.c4.C(r8, r9)     // Catch:{ all -> 0x0d97 }
            goto L_0x0b43
        L_0x0b0c:
            boolean r10 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x0d97 }
            if (r10 == 0) goto L_0x0b21
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x0d97 }
            long r8 = r9.longValue()     // Catch:{ all -> 0x0d97 }
            r5.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r10 = r5.f8238b     // Catch:{ all -> 0x0d97 }
            j4.c4 r10 = (j4.c4) r10     // Catch:{ all -> 0x0d97 }
            j4.c4.E(r10, r8)     // Catch:{ all -> 0x0d97 }
            goto L_0x0b43
        L_0x0b21:
            boolean r10 = r9 instanceof java.lang.Double     // Catch:{ all -> 0x0d97 }
            if (r10 == 0) goto L_0x0b36
            java.lang.Double r9 = (java.lang.Double) r9     // Catch:{ all -> 0x0d97 }
            double r8 = r9.doubleValue()     // Catch:{ all -> 0x0d97 }
            r5.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r10 = r5.f8238b     // Catch:{ all -> 0x0d97 }
            j4.c4 r10 = (j4.c4) r10     // Catch:{ all -> 0x0d97 }
            j4.c4.G(r10, r8)     // Catch:{ all -> 0x0d97 }
            goto L_0x0b43
        L_0x0b36:
            n4.n4 r8 = r8.f9600a     // Catch:{ all -> 0x0d97 }
            n4.i3 r8 = r8.a()     // Catch:{ all -> 0x0d97 }
            n4.g3 r8 = r8.f9828f     // Catch:{ all -> 0x0d97 }
            java.lang.String r10 = "Ignoring invalid (type) user attribute value"
            r8.b(r10, r9)     // Catch:{ all -> 0x0d97 }
        L_0x0b43:
            r2.w(r5)     // Catch:{ all -> 0x0d97 }
            n4.f r5 = r37.J()     // Catch:{ all -> 0x0d97 }
            n4.v2 r8 = n4.w2.f10251z0     // Catch:{ all -> 0x0d97 }
            r9 = 0
            boolean r5 = r5.o(r9, r8)     // Catch:{ all -> 0x0d97 }
            if (r5 == 0) goto L_0x0bab
            java.lang.String r5 = "_sid"
            java.lang.Object r8 = r4.get(r15)     // Catch:{ all -> 0x0d97 }
            n4.b8 r8 = (n4.b8) r8     // Catch:{ all -> 0x0d97 }
            java.lang.String r8 = r8.f9637c     // Catch:{ all -> 0x0d97 }
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x0d97 }
            if (r5 == 0) goto L_0x0bab
            n4.n4 r5 = r6.f9674a     // Catch:{ all -> 0x0d97 }
            n4.m4 r5 = r5.d()     // Catch:{ all -> 0x0d97 }
            r5.g()     // Catch:{ all -> 0x0d97 }
            long r8 = r6.f9694x     // Catch:{ all -> 0x0d97 }
            r10 = 0
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0bab
            n4.y7 r5 = r1.f10288g     // Catch:{ all -> 0x0d97 }
            H(r5)     // Catch:{ all -> 0x0d97 }
            java.lang.String r8 = r3.f9788x     // Catch:{ all -> 0x0d97 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0d97 }
            if (r9 == 0) goto L_0x0b84
            r8 = 0
            goto L_0x0b92
        L_0x0b84:
            java.lang.String r9 = "UTF-8"
            java.nio.charset.Charset r9 = java.nio.charset.Charset.forName(r9)     // Catch:{ all -> 0x0d97 }
            byte[] r8 = r8.getBytes(r9)     // Catch:{ all -> 0x0d97 }
            long r8 = r5.v(r8)     // Catch:{ all -> 0x0d97 }
        L_0x0b92:
            n4.n4 r5 = r6.f9674a     // Catch:{ all -> 0x0d97 }
            n4.m4 r5 = r5.d()     // Catch:{ all -> 0x0d97 }
            r5.g()     // Catch:{ all -> 0x0d97 }
            long r10 = r6.f9694x     // Catch:{ all -> 0x0d97 }
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0bab
            r2.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r5 = r2.f8238b     // Catch:{ all -> 0x0d97 }
            j4.t3 r5 = (j4.t3) r5     // Catch:{ all -> 0x0d97 }
            j4.t3.v0(r5)     // Catch:{ all -> 0x0d97 }
        L_0x0bab:
            int r15 = r15 + 1
            goto L_0x0a9f
        L_0x0baf:
            n4.i r3 = r1.f10284c     // Catch:{ IOException -> 0x0d4d }
            H(r3)     // Catch:{ IOException -> 0x0d4d }
            j4.m7 r4 = r2.h()     // Catch:{ IOException -> 0x0d4d }
            j4.t3 r4 = (j4.t3) r4     // Catch:{ IOException -> 0x0d4d }
            r3.g()     // Catch:{ IOException -> 0x0d4d }
            r3.h()     // Catch:{ IOException -> 0x0d4d }
            java.lang.String r5 = r4.K1()     // Catch:{ IOException -> 0x0d4d }
            r3.o.e(r5)     // Catch:{ IOException -> 0x0d4d }
            byte[] r5 = r4.g()     // Catch:{ IOException -> 0x0d4d }
            n4.w7 r6 = r3.f10066b     // Catch:{ IOException -> 0x0d4d }
            n4.y7 r6 = r6.f10288g     // Catch:{ IOException -> 0x0d4d }
            H(r6)     // Catch:{ IOException -> 0x0d4d }
            long r8 = r6.v(r5)     // Catch:{ IOException -> 0x0d4d }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ IOException -> 0x0d4d }
            r6.<init>()     // Catch:{ IOException -> 0x0d4d }
            java.lang.String r10 = r4.K1()     // Catch:{ IOException -> 0x0d4d }
            r11 = r32
            r6.put(r11, r10)     // Catch:{ IOException -> 0x0d4d }
            java.lang.Long r10 = java.lang.Long.valueOf(r8)     // Catch:{ IOException -> 0x0d4d }
            r12 = r33
            r6.put(r12, r10)     // Catch:{ IOException -> 0x0d4d }
            java.lang.String r10 = "metadata"
            r6.put(r10, r5)     // Catch:{ IOException -> 0x0d4d }
            android.database.sqlite.SQLiteDatabase r5 = r3.z()     // Catch:{ SQLiteException -> 0x0d33 }
            java.lang.String r10 = "raw_events_metadata"
            r13 = 4
            r14 = 0
            r5.insertWithOnConflict(r10, r14, r6, r13)     // Catch:{ SQLiteException -> 0x0d33 }
            n4.i r2 = r1.f10284c     // Catch:{ all -> 0x0d97 }
            H(r2)     // Catch:{ all -> 0x0d97 }
            n4.p r3 = r7.f9940f     // Catch:{ all -> 0x0d97 }
            android.os.Bundle r3 = r3.f10048a     // Catch:{ all -> 0x0d97 }
            java.util.Set r3 = r3.keySet()     // Catch:{ all -> 0x0d97 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0d97 }
        L_0x0c0e:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0d97 }
            if (r4 == 0) goto L_0x0c28
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0d97 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0d97 }
            r5 = r35
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x0d97 }
            if (r4 == 0) goto L_0x0c25
        L_0x0c22:
            r15 = r28
            goto L_0x0c61
        L_0x0c25:
            r35 = r5
            goto L_0x0c0e
        L_0x0c28:
            n4.h4 r3 = r1.f10282a     // Catch:{ all -> 0x0d97 }
            H(r3)     // Catch:{ all -> 0x0d97 }
            java.lang.String r4 = r7.f9935a     // Catch:{ all -> 0x0d97 }
            java.lang.String r5 = r7.f9936b     // Catch:{ all -> 0x0d97 }
            boolean r3 = r3.s(r4, r5)     // Catch:{ all -> 0x0d97 }
            n4.i r13 = r1.f10284c     // Catch:{ all -> 0x0d97 }
            H(r13)     // Catch:{ all -> 0x0d97 }
            long r14 = r37.v()     // Catch:{ all -> 0x0d97 }
            java.lang.String r4 = r7.f9935a     // Catch:{ all -> 0x0d97 }
            r17 = 0
            r18 = 0
            r16 = r4
            n4.g r4 = r13.C(r14, r16, r17, r18)     // Catch:{ all -> 0x0d97 }
            if (r3 == 0) goto L_0x0c60
            long r3 = r4.f9752e     // Catch:{ all -> 0x0d97 }
            n4.f r5 = r37.J()     // Catch:{ all -> 0x0d97 }
            java.lang.String r6 = r7.f9935a     // Catch:{ all -> 0x0d97 }
            n4.v2 r10 = n4.w2.f10234p     // Catch:{ all -> 0x0d97 }
            int r5 = r5.i(r6, r10)     // Catch:{ all -> 0x0d97 }
            long r5 = (long) r5     // Catch:{ all -> 0x0d97 }
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0c60
            goto L_0x0c22
        L_0x0c60:
            r15 = 0
        L_0x0c61:
            r2.g()     // Catch:{ all -> 0x0d97 }
            r2.h()     // Catch:{ all -> 0x0d97 }
            java.lang.String r3 = r7.f9935a     // Catch:{ all -> 0x0d97 }
            r3.o.e(r3)     // Catch:{ all -> 0x0d97 }
            n4.w7 r3 = r2.f10066b     // Catch:{ all -> 0x0d97 }
            n4.y7 r3 = r3.f10288g     // Catch:{ all -> 0x0d97 }
            H(r3)     // Catch:{ all -> 0x0d97 }
            j4.j3 r4 = j4.k3.x()     // Catch:{ all -> 0x0d97 }
            long r5 = r7.f9939e     // Catch:{ all -> 0x0d97 }
            r4.j()     // Catch:{ all -> 0x0d97 }
            j4.m7 r10 = r4.f8238b     // Catch:{ all -> 0x0d97 }
            j4.k3 r10 = (j4.k3) r10     // Catch:{ all -> 0x0d97 }
            j4.k3.J(r5, r10)     // Catch:{ all -> 0x0d97 }
            n4.p r5 = r7.f9940f     // Catch:{ all -> 0x0d97 }
            android.os.Bundle r5 = r5.f10048a     // Catch:{ all -> 0x0d97 }
            java.util.Set r5 = r5.keySet()     // Catch:{ all -> 0x0d97 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0d97 }
        L_0x0c8f:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0d97 }
            if (r6 == 0) goto L_0x0cb4
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0d97 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0d97 }
            j4.n3 r10 = j4.o3.x()     // Catch:{ all -> 0x0d97 }
            r10.l(r6)     // Catch:{ all -> 0x0d97 }
            n4.p r13 = r7.f9940f     // Catch:{ all -> 0x0d97 }
            android.os.Bundle r13 = r13.f10048a     // Catch:{ all -> 0x0d97 }
            java.lang.Object r6 = r13.get(r6)     // Catch:{ all -> 0x0d97 }
            r3.o.h(r6)     // Catch:{ all -> 0x0d97 }
            r3.F(r10, r6)     // Catch:{ all -> 0x0d97 }
            r4.m(r10)     // Catch:{ all -> 0x0d97 }
            goto L_0x0c8f
        L_0x0cb4:
            j4.m7 r3 = r4.h()     // Catch:{ all -> 0x0d97 }
            j4.k3 r3 = (j4.k3) r3     // Catch:{ all -> 0x0d97 }
            byte[] r3 = r3.g()     // Catch:{ all -> 0x0d97 }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0d97 }
            r4.<init>()     // Catch:{ all -> 0x0d97 }
            java.lang.String r5 = r7.f9935a     // Catch:{ all -> 0x0d97 }
            r4.put(r11, r5)     // Catch:{ all -> 0x0d97 }
            java.lang.String r5 = "name"
            java.lang.String r6 = r7.f9936b     // Catch:{ all -> 0x0d97 }
            r4.put(r5, r6)     // Catch:{ all -> 0x0d97 }
            java.lang.String r5 = "timestamp"
            long r10 = r7.f9938d     // Catch:{ all -> 0x0d97 }
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0d97 }
            r4.put(r5, r6)     // Catch:{ all -> 0x0d97 }
            java.lang.Long r5 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0d97 }
            r4.put(r12, r5)     // Catch:{ all -> 0x0d97 }
            java.lang.String r5 = "data"
            r4.put(r5, r3)     // Catch:{ all -> 0x0d97 }
            java.lang.String r3 = "realtime"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0d97 }
            r4.put(r3, r5)     // Catch:{ all -> 0x0d97 }
            android.database.sqlite.SQLiteDatabase r3 = r2.z()     // Catch:{ SQLiteException -> 0x0d1b }
            r5 = r34
            r6 = 0
            long r3 = r3.insert(r5, r6, r4)     // Catch:{ SQLiteException -> 0x0d1b }
            r5 = -1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0d16
            n4.n4 r3 = r2.f9600a     // Catch:{ SQLiteException -> 0x0d1b }
            n4.i3 r3 = r3.a()     // Catch:{ SQLiteException -> 0x0d1b }
            n4.g3 r3 = r3.l()     // Catch:{ SQLiteException -> 0x0d1b }
            java.lang.String r4 = "Failed to insert raw event (got -1). appId"
            java.lang.String r5 = r7.f9935a     // Catch:{ SQLiteException -> 0x0d1b }
            n4.h3 r5 = n4.i3.p(r5)     // Catch:{ SQLiteException -> 0x0d1b }
            r3.b(r4, r5)     // Catch:{ SQLiteException -> 0x0d1b }
            goto L_0x0d64
        L_0x0d16:
            r2 = 0
            r1.f10295o = r2     // Catch:{ all -> 0x0d97 }
            goto L_0x0d64
        L_0x0d1b:
            r0 = move-exception
            r3 = r0
            n4.n4 r2 = r2.f9600a     // Catch:{ all -> 0x0d97 }
            n4.i3 r2 = r2.a()     // Catch:{ all -> 0x0d97 }
            n4.g3 r2 = r2.l()     // Catch:{ all -> 0x0d97 }
            java.lang.String r4 = "Error storing raw event. appId"
            java.lang.String r5 = r7.f9935a     // Catch:{ all -> 0x0d97 }
            n4.h3 r5 = n4.i3.p(r5)     // Catch:{ all -> 0x0d97 }
            r2.c(r4, r5, r3)     // Catch:{ all -> 0x0d97 }
            goto L_0x0d64
        L_0x0d33:
            r0 = move-exception
            r5 = r0
            n4.n4 r3 = r3.f9600a     // Catch:{ IOException -> 0x0d4d }
            n4.i3 r3 = r3.a()     // Catch:{ IOException -> 0x0d4d }
            n4.g3 r3 = r3.l()     // Catch:{ IOException -> 0x0d4d }
            java.lang.String r6 = "Error storing raw event metadata. appId"
            java.lang.String r4 = r4.K1()     // Catch:{ IOException -> 0x0d4d }
            n4.h3 r4 = n4.i3.p(r4)     // Catch:{ IOException -> 0x0d4d }
            r3.c(r6, r4, r5)     // Catch:{ IOException -> 0x0d4d }
            throw r5     // Catch:{ IOException -> 0x0d4d }
        L_0x0d4d:
            r0 = move-exception
            r3 = r0
            n4.i3 r4 = r37.a()     // Catch:{ all -> 0x0d97 }
            n4.g3 r4 = r4.l()     // Catch:{ all -> 0x0d97 }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.p()     // Catch:{ all -> 0x0d97 }
            n4.h3 r2 = n4.i3.p(r2)     // Catch:{ all -> 0x0d97 }
            r4.c(r5, r2, r3)     // Catch:{ all -> 0x0d97 }
        L_0x0d64:
            n4.i r2 = r1.f10284c     // Catch:{ all -> 0x0d97 }
            H(r2)     // Catch:{ all -> 0x0d97 }
            r2.l()     // Catch:{ all -> 0x0d97 }
            n4.i r2 = r1.f10284c
            H(r2)
            r2.N()
            r37.C()
            n4.i3 r2 = r37.a()
            n4.g3 r2 = r2.m()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r29
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.b(r4, r3)
            return
        L_0x0d97:
            r0 = move-exception
            r2 = r0
            n4.i r3 = r1.f10284c
            H(r3)
            r3.N()
            throw r2
        L_0x0da2:
            r1.I(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.w7.u(n4.r, n4.g8):void");
    }

    public final long v() {
        ((a) c()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        d7 d7Var = this.f10290i;
        d7Var.h();
        d7Var.g();
        long a10 = d7Var.f9705i.a();
        if (a10 == 0) {
            a10 = ((long) d7Var.f9600a.x().p().nextInt(86400000)) + 1;
            d7Var.f9705i.b(a10);
        }
        return ((((currentTimeMillis + a10) / 1000) / 60) / 60) / 24;
    }

    public final g8 y(String str) {
        String str2;
        Object obj;
        g3 g3Var;
        i iVar = this.f10284c;
        H(iVar);
        String str3 = str;
        d5 A2 = iVar.A(str3);
        if (A2 == null || TextUtils.isEmpty(A2.y())) {
            g3Var = a().f9834m;
            obj = str3;
            str2 = "No app data available; dropping";
        } else {
            Boolean z9 = z(A2);
            if (z9 == null || z9.booleanValue()) {
                String a10 = A2.a();
                String y9 = A2.y();
                long t10 = A2.t();
                A2.f9674a.d().g();
                String str4 = A2.f9684l;
                A2.f9674a.d().g();
                long j10 = A2.f9685m;
                A2.f9674a.d().g();
                long j11 = A2.f9686n;
                A2.f9674a.d().g();
                boolean z10 = A2.f9687o;
                String z11 = A2.z();
                A2.f9674a.d().g();
                A2.f9674a.d().g();
                boolean z12 = A2.f9688p;
                String u10 = A2.u();
                A2.f9674a.d().g();
                Boolean bool = A2.f9690r;
                A2.f9674a.d().g();
                long j12 = A2.f9691s;
                A2.f9674a.d().g();
                ArrayList arrayList = A2.f9692t;
                String e10 = M(str).e();
                A2.f9674a.d().g();
                boolean z13 = A2.f9693v;
                A2.f9674a.d().g();
                return new g8(str, a10, y9, t10, str4, j10, j11, (String) null, z10, false, z11, 0, 0, z12, false, u10, bool, j12, arrayList, e10, "", (String) null, z13, A2.w);
            }
            g3Var = a().f9828f;
            obj = i3.p(str);
            str2 = "App version does not match; dropping. appId";
        }
        g3Var.b(str2, obj);
        return null;
    }

    public final Boolean z(d5 d5Var) {
        try {
            if (d5Var.t() != -2147483648L) {
                if (d5Var.t() == ((long) y3.c.a(this.f10292l.f9986a).b(0, d5Var.w()).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = y3.c.a(this.f10292l.f9986a).b(0, d5Var.w()).versionName;
                String y9 = d5Var.y();
                if (y9 != null && y9.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
