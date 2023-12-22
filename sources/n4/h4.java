package n4;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import j4.b3;
import j4.e4;
import j4.f4;
import j4.m1;
import j4.r0;
import j4.t2;
import j4.u2;
import j4.u7;
import j4.v2;
import j4.w2;
import j4.x2;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import m.b;
import r3.o;
import y3.a;

public final class h4 extends q7 implements e {

    /* renamed from: d  reason: collision with root package name */
    public final b f9796d = new b();

    /* renamed from: e  reason: collision with root package name */
    public final b f9797e = new b();

    /* renamed from: f  reason: collision with root package name */
    public final b f9798f = new b();

    /* renamed from: g  reason: collision with root package name */
    public final b f9799g = new b();

    /* renamed from: h  reason: collision with root package name */
    public final b f9800h = new b();

    /* renamed from: i  reason: collision with root package name */
    public final b f9801i = new b();

    /* renamed from: j  reason: collision with root package name */
    public final g4 f9802j = new g4(this);
    public final c2.b k = new c2.b((Object) this);

    /* renamed from: l  reason: collision with root package name */
    public final b f9803l = new b();

    /* renamed from: m  reason: collision with root package name */
    public final b f9804m = new b();

    /* renamed from: n  reason: collision with root package name */
    public final b f9805n = new b();

    public h4(w7 w7Var) {
        super(w7Var);
    }

    public static final b o(x2 x2Var) {
        b bVar = new b();
        for (b3 b3Var : x2Var.H()) {
            bVar.put(b3Var.u(), b3Var.v());
        }
        return bVar;
    }

    public final String b(String str, String str2) {
        g();
        m(str);
        Map map = (Map) this.f9796d.getOrDefault(str, null);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final void j() {
    }

    public final x2 k(String str, byte[] bArr) {
        Long l6;
        if (bArr == null) {
            return x2.z();
        }
        try {
            x2 x2Var = (x2) ((w2) y7.z(x2.x(), bArr)).h();
            g3 g3Var = this.f9600a.a().f9835n;
            String str2 = null;
            if (x2Var.M()) {
                l6 = Long.valueOf(x2Var.v());
            } else {
                l6 = null;
            }
            if (x2Var.L()) {
                str2 = x2Var.A();
            }
            g3Var.c("Parsed config. version, gmp_app_id", l6, str2);
            return x2Var;
        } catch (u7 | RuntimeException e10) {
            this.f9600a.a().f9831i.c("Unable to merge remote config. appId", i3.p(str), e10);
            return x2.z();
        }
    }

    public final void l(String str, w2 w2Var) {
        HashSet hashSet = new HashSet();
        b bVar = new b();
        b bVar2 = new b();
        b bVar3 = new b();
        for (t2 u : Collections.unmodifiableList(((x2) w2Var.f8238b).F())) {
            hashSet.add(u.u());
        }
        for (int i10 = 0; i10 < ((x2) w2Var.f8238b).u(); i10++) {
            u2 u2Var = (u2) ((x2) w2Var.f8238b).w(i10).j();
            if (u2Var.k().isEmpty()) {
                this.f9600a.a().f9831i.a("EventConfig contained null event name");
            } else {
                String k10 = u2Var.k();
                String R = a.R(u2Var.k(), c.a.f2356q, c.a.f2360s);
                if (!TextUtils.isEmpty(R)) {
                    u2Var.j();
                    v2.w((v2) u2Var.f8238b, R);
                    w2Var.j();
                    x2.I((x2) w2Var.f8238b, i10, (v2) u2Var.h());
                }
                if (((v2) u2Var.f8238b).z() && ((v2) u2Var.f8238b).x()) {
                    bVar.put(k10, Boolean.TRUE);
                }
                if (((v2) u2Var.f8238b).A() && ((v2) u2Var.f8238b).y()) {
                    bVar2.put(u2Var.k(), Boolean.TRUE);
                }
                if (((v2) u2Var.f8238b).B()) {
                    if (((v2) u2Var.f8238b).t() < 2 || ((v2) u2Var.f8238b).t() > 65535) {
                        this.f9600a.a().f9831i.c("Invalid sampling rate. Event name, sample rate", u2Var.k(), Integer.valueOf(((v2) u2Var.f8238b).t()));
                    } else {
                        bVar3.put(u2Var.k(), Integer.valueOf(((v2) u2Var.f8238b).t()));
                    }
                }
            }
        }
        this.f9797e.put(str, hashSet);
        this.f9798f.put(str, bVar);
        this.f9799g.put(str, bVar2);
        this.f9801i.put(str, bVar3);
    }

    /* JADX WARNING: type inference failed for: r1v11, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0091, code lost:
        if (r2 != null) goto L_0x0093;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(java.lang.String r13) {
        /*
            r12 = this;
            r12.h()
            r12.g()
            r3.o.e(r13)
            m.b r0 = r12.f9800h
            r1 = 0
            java.lang.Object r0 = r0.getOrDefault(r13, r1)
            if (r0 != 0) goto L_0x0120
            n4.w7 r0 = r12.f10066b
            n4.i r0 = r0.f10284c
            n4.w7.H(r0)
            r3.o.e(r13)
            r0.g()
            r0.h()
            android.database.sqlite.SQLiteDatabase r2 = r0.z()     // Catch:{ SQLiteException -> 0x007d, all -> 0x007a }
            java.lang.String r3 = "apps"
            java.lang.String r4 = "remote_config"
            java.lang.String r5 = "config_last_modified_time"
            java.lang.String r6 = "e_tag"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6}     // Catch:{ SQLiteException -> 0x007d, all -> 0x007a }
            java.lang.String r5 = "app_id=?"
            r10 = 1
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x007d, all -> 0x007a }
            r11 = 0
            r6[r11] = r13     // Catch:{ SQLiteException -> 0x007d, all -> 0x007a }
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x007d, all -> 0x007a }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0078 }
            if (r3 != 0) goto L_0x0048
            goto L_0x0093
        L_0x0048:
            byte[] r3 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x0078 }
            java.lang.String r4 = r2.getString(r10)     // Catch:{ SQLiteException -> 0x0078 }
            r5 = 2
            java.lang.String r5 = r2.getString(r5)     // Catch:{ SQLiteException -> 0x0078 }
            boolean r6 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0078 }
            if (r6 == 0) goto L_0x006c
            n4.n4 r6 = r0.f9600a     // Catch:{ SQLiteException -> 0x0078 }
            n4.i3 r6 = r6.a()     // Catch:{ SQLiteException -> 0x0078 }
            n4.g3 r6 = r6.f9828f     // Catch:{ SQLiteException -> 0x0078 }
            java.lang.String r7 = "Got multiple records for app config, expected one. appId"
            n4.h3 r8 = n4.i3.p(r13)     // Catch:{ SQLiteException -> 0x0078 }
            r6.b(r7, r8)     // Catch:{ SQLiteException -> 0x0078 }
        L_0x006c:
            if (r3 != 0) goto L_0x006f
            goto L_0x0093
        L_0x006f:
            c2.c r6 = new c2.c     // Catch:{ SQLiteException -> 0x0078 }
            r6.<init>((java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5)     // Catch:{ SQLiteException -> 0x0078 }
            r2.close()
            goto L_0x0097
        L_0x0078:
            r3 = move-exception
            goto L_0x0080
        L_0x007a:
            r13 = move-exception
            goto L_0x011a
        L_0x007d:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x0080:
            n4.n4 r0 = r0.f9600a     // Catch:{ all -> 0x0118 }
            n4.i3 r0 = r0.a()     // Catch:{ all -> 0x0118 }
            n4.g3 r0 = r0.f9828f     // Catch:{ all -> 0x0118 }
            java.lang.String r4 = "Error querying remote config. appId"
            n4.h3 r5 = n4.i3.p(r13)     // Catch:{ all -> 0x0118 }
            r0.c(r4, r5, r3)     // Catch:{ all -> 0x0118 }
            if (r2 == 0) goto L_0x0096
        L_0x0093:
            r2.close()
        L_0x0096:
            r6 = r1
        L_0x0097:
            if (r6 != 0) goto L_0x00c4
            m.b r0 = r12.f9796d
            r0.put(r13, r1)
            m.b r0 = r12.f9798f
            r0.put(r13, r1)
            m.b r0 = r12.f9797e
            r0.put(r13, r1)
            m.b r0 = r12.f9799g
            r0.put(r13, r1)
            m.b r0 = r12.f9800h
            r0.put(r13, r1)
            m.b r0 = r12.f9803l
            r0.put(r13, r1)
            m.b r0 = r12.f9804m
            r0.put(r13, r1)
            m.b r0 = r12.f9805n
            r0.put(r13, r1)
            m.b r0 = r12.f9801i
            goto L_0x0114
        L_0x00c4:
            java.lang.Object r0 = r6.f2372a
            byte[] r0 = (byte[]) r0
            j4.x2 r0 = r12.k(r13, r0)
            j4.i7 r0 = r0.j()
            j4.w2 r0 = (j4.w2) r0
            r12.l(r13, r0)
            m.b r1 = r12.f9796d
            j4.m7 r2 = r0.h()
            j4.x2 r2 = (j4.x2) r2
            m.b r2 = o(r2)
            r1.put(r13, r2)
            m.b r1 = r12.f9800h
            j4.m7 r2 = r0.h()
            j4.x2 r2 = (j4.x2) r2
            r1.put(r13, r2)
            j4.m7 r1 = r0.h()
            j4.x2 r1 = (j4.x2) r1
            r12.n(r13, r1)
            m.b r1 = r12.f9803l
            j4.m7 r0 = r0.f8238b
            j4.x2 r0 = (j4.x2) r0
            java.lang.String r0 = r0.D()
            r1.put(r13, r0)
            m.b r0 = r12.f9804m
            java.lang.Object r1 = r6.f2373b
            java.lang.String r1 = (java.lang.String) r1
            r0.put(r13, r1)
            m.b r0 = r12.f9805n
            java.lang.Object r1 = r6.f2374c
            java.lang.String r1 = (java.lang.String) r1
        L_0x0114:
            r0.put(r13, r1)
            return
        L_0x0118:
            r13 = move-exception
            r1 = r2
        L_0x011a:
            if (r1 == 0) goto L_0x011f
            r1.close()
        L_0x011f:
            throw r13
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.h4.m(java.lang.String):void");
    }

    public final void n(String str, x2 x2Var) {
        if (x2Var.t() != 0) {
            this.f9600a.a().f9835n.b("EES programs found", Integer.valueOf(x2Var.t()));
            f4 f4Var = (f4) x2Var.G().get(0);
            try {
                r0 r0Var = new r0();
                r0Var.f8425a.f8438d.f8538a.put("internal.remoteConfig", new d4(this, str));
                r0Var.f8425a.f8438d.f8538a.put("internal.appMetadata", new e4(this, str));
                r0Var.f8425a.f8438d.f8538a.put("internal.logger", new f4(this));
                r0Var.a(f4Var);
                this.f9802j.c(str, r0Var);
                this.f9600a.a().f9835n.c("EES program loaded for appId, activities", str, Integer.valueOf(f4Var.t().t()));
                for (e4 u : f4Var.t().w()) {
                    this.f9600a.a().f9835n.b("EES program activity", u.u());
                }
            } catch (m1 unused) {
                this.f9600a.a().f9828f.b("Failed to load EES program. appId", str);
            }
        } else {
            g4 g4Var = this.f9802j;
            if (str != null) {
                synchronized (g4Var) {
                    if (g4Var.f9275a.remove(str) != null) {
                        g4Var.f9276b--;
                    }
                }
                return;
            }
            g4Var.getClass();
            throw new NullPointerException("key == null");
        }
    }

    public final int p(String str, String str2) {
        Integer num;
        g();
        m(str);
        Map map = (Map) this.f9801i.getOrDefault(str, null);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final x2 q(String str) {
        h();
        g();
        o.e(str);
        m(str);
        return (x2) this.f9800h.getOrDefault(str, null);
    }

    public final boolean r(String str) {
        x2 x2Var;
        if (TextUtils.isEmpty(str) || (x2Var = (x2) this.f9800h.getOrDefault(str, null)) == null || x2Var.t() == 0) {
            return false;
        }
        return true;
    }

    public final boolean s(String str, String str2) {
        Boolean bool;
        g();
        m(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f9799g.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean t(String str, String str2) {
        Boolean bool;
        g();
        m(str);
        if (IronSourceConstants.BOOLEAN_TRUE_AS_STRING.equals(b(str, "measurement.upload.blacklist_internal")) && d8.T(str2)) {
            return true;
        }
        if (IronSourceConstants.BOOLEAN_TRUE_AS_STRING.equals(b(str, "measurement.upload.blacklist_public")) && d8.U(str2)) {
            return true;
        }
        Map map = (Map) this.f9798f.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x03e8, code lost:
        r0 = java.lang.Boolean.valueOf(r3.B());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x03f1, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x03f2, code lost:
        r12.put("session_scoped", r0);
        r12.put("data", r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0404, code lost:
        if (r6.z().insertWithOnConflict("property_filters", (java.lang.String) null, r12, 5) != -1) goto L_0x0418;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0406, code lost:
        r6.f9600a.a().f9828f.b("Failed to insert property filter (got -1). appId", n4.i3.p(r26));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0418, code lost:
        r0 = r23;
        r4 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x041e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        r3 = r6.f9600a.a().f9828f;
        r4 = "Error storing property filter. appId";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0429, code lost:
        r3.c(r4, n4.i3.p(r26), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0430, code lost:
        r6.h();
        r6.g();
        r3.o.e(r26);
        r0 = r6.z();
        r11 = r18;
        r0.delete("property_filters", r11, new java.lang.String[]{r2, java.lang.String.valueOf(r8)});
        r0.delete("event_filters", r11, new java.lang.String[]{r2, java.lang.String.valueOf(r8)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x045d, code lost:
        r11 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x045f, code lost:
        r18 = r11;
        r3 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0250, code lost:
        r11 = r0.A().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x025c, code lost:
        if (r11.hasNext() == false) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0268, code lost:
        if (((j4.n2) r11.next()).C() != false) goto L_0x0258;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x026a, code lost:
        r0 = r6.f9600a.a().f9831i;
        r4 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x027e, code lost:
        r11 = r0.z().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x028a, code lost:
        r4 = "audience_id";
        r21 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0298, code lost:
        if (r11.hasNext() == false) goto L_0x035a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r12 = (j4.g2) r11.next();
        r6.h();
        r6.g();
        r3.o.e(r26);
        r3.o.h(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x02b4, code lost:
        if (r12.z().isEmpty() == false) goto L_0x02e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x02b6, code lost:
        r0 = r6.f9600a.a().f9831i;
        r4 = n4.i3.p(r26);
        r5 = java.lang.Integer.valueOf(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x02cc, code lost:
        if (r12.H() == false) goto L_0x02d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x02ce, code lost:
        r11 = java.lang.Integer.valueOf(r12.u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x02d7, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02d8, code lost:
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r4, r5, java.lang.String.valueOf(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02e1, code lost:
        r3 = r12.g();
        r23 = r11;
        r11 = new android.content.ContentValues();
        r11.put("app_id", r2);
        r11.put(r4, java.lang.Integer.valueOf(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02fa, code lost:
        if (r12.H() == false) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02fc, code lost:
        r4 = java.lang.Integer.valueOf(r12.u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0305, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0306, code lost:
        r11.put("filter_id", r4);
        r11.put("event_name", r12.z());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0316, code lost:
        if (r12.I() == false) goto L_0x0321;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0318, code lost:
        r4 = java.lang.Boolean.valueOf(r12.F());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0321, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0322, code lost:
        r11.put("session_scoped", r4);
        r11.put("data", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0334, code lost:
        if (r6.z().insertWithOnConflict("event_filters", (java.lang.String) null, r11, 5) != -1) goto L_0x0347;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0336, code lost:
        r6.f9600a.a().f9828f.b("Failed to insert event filter (got -1). appId", n4.i3.p(r26));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0347, code lost:
        r3 = r21;
        r11 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x035a, code lost:
        r0 = r0.A().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0366, code lost:
        if (r0.hasNext() == false) goto L_0x045d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0368, code lost:
        r3 = (j4.n2) r0.next();
        r6.h();
        r6.g();
        r3.o.e(r26);
        r3.o.h(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0382, code lost:
        if (r3.x().isEmpty() == false) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0384, code lost:
        r0 = r6.f9600a.a().f9831i;
        r5 = n4.i3.p(r26);
        r11 = java.lang.Integer.valueOf(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x039a, code lost:
        if (r3.C() == false) goto L_0x03a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x039c, code lost:
        r3 = java.lang.Integer.valueOf(r3.t());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x03a5, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x03a6, code lost:
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r5, r11, java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x03af, code lost:
        r11 = r3.g();
        r12 = new android.content.ContentValues();
        r12.put("app_id", r2);
        r23 = r0;
        r12.put(r4, java.lang.Integer.valueOf(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x03c8, code lost:
        if (r3.C() == false) goto L_0x03d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x03ca, code lost:
        r0 = java.lang.Integer.valueOf(r3.t());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x03d3, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x03d4, code lost:
        r12.put("filter_id", r0);
        r24 = r4;
        r12.put("property_name", r3.x());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x03e6, code lost:
        if (r3.D() == false) goto L_0x03f1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x05b7 A[Catch:{ SQLiteException -> 0x05c9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(java.lang.String r26, byte[] r27, java.lang.String r28, java.lang.String r29) {
        /*
            r25 = this;
            r1 = r25
            r2 = r26
            r3 = r28
            r4 = r29
            r25.h()
            r25.g()
            r3.o.e(r26)
            j4.x2 r0 = r25.k(r26, r27)
            j4.i7 r0 = r0.j()
            r5 = r0
            j4.w2 r5 = (j4.w2) r5
            r1.l(r2, r5)
            j4.m7 r0 = r5.h()
            j4.x2 r0 = (j4.x2) r0
            r1.n(r2, r0)
            m.b r0 = r1.f9800h
            j4.m7 r6 = r5.h()
            j4.x2 r6 = (j4.x2) r6
            r0.put(r2, r6)
            m.b r0 = r1.f9803l
            j4.m7 r6 = r5.f8238b
            j4.x2 r6 = (j4.x2) r6
            java.lang.String r6 = r6.D()
            r0.put(r2, r6)
            m.b r0 = r1.f9804m
            r0.put(r2, r3)
            m.b r0 = r1.f9805n
            r0.put(r2, r4)
            m.b r0 = r1.f9796d
            j4.m7 r6 = r5.h()
            j4.x2 r6 = (j4.x2) r6
            m.b r6 = o(r6)
            r0.put(r2, r6)
            n4.w7 r0 = r1.f10066b
            n4.i r6 = r0.f10284c
            n4.w7.H(r6)
            java.util.ArrayList r7 = new java.util.ArrayList
            j4.m7 r0 = r5.f8238b
            j4.x2 r0 = (j4.x2) r0
            j4.r7 r0 = r0.E()
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r7.<init>(r0)
            java.lang.String r8 = "app_id=? and audience_id=?"
            java.lang.String r0 = "app_id=?"
            java.lang.String r9 = "event_filters"
            java.lang.String r10 = "property_filters"
            r12 = 0
        L_0x007a:
            int r13 = r7.size()
            if (r12 >= r13) goto L_0x01be
            java.lang.Object r13 = r7.get(r12)
            j4.e2 r13 = (j4.e2) r13
            j4.i7 r13 = r13.j()
            j4.d2 r13 = (j4.d2) r13
            j4.m7 r15 = r13.f8238b
            j4.e2 r15 = (j4.e2) r15
            int r15 = r15.u()
            if (r15 == 0) goto L_0x0155
            r15 = 0
        L_0x0097:
            j4.m7 r11 = r13.f8238b
            j4.e2 r11 = (j4.e2) r11
            int r11 = r11.u()
            if (r15 >= r11) goto L_0x0155
            j4.m7 r11 = r13.f8238b
            j4.e2 r11 = (j4.e2) r11
            j4.g2 r11 = r11.x(r15)
            j4.i7 r11 = r11.j()
            j4.f2 r11 = (j4.f2) r11
            j4.i7 r16 = r11.clone()
            r14 = r16
            j4.f2 r14 = (j4.f2) r14
            j4.m7 r4 = r11.f8238b
            j4.g2 r4 = (j4.g2) r4
            java.lang.String r4 = r4.z()
            java.lang.String[] r3 = c.a.f2356q
            java.lang.String[] r1 = c.a.f2360s
            java.lang.String r1 = y3.a.R(r4, r3, r1)
            if (r1 == 0) goto L_0x00d5
            r14.j()
            j4.m7 r3 = r14.f8238b
            j4.g2 r3 = (j4.g2) r3
            j4.g2.B(r3, r1)
            r1 = 1
            goto L_0x00d6
        L_0x00d5:
            r1 = 0
        L_0x00d6:
            r3 = r1
            r1 = 0
        L_0x00d8:
            j4.m7 r4 = r11.f8238b
            j4.g2 r4 = (j4.g2) r4
            int r4 = r4.t()
            if (r1 >= r4) goto L_0x0128
            j4.m7 r4 = r11.f8238b
            j4.g2 r4 = (j4.g2) r4
            j4.i2 r4 = r4.x(r1)
            r16 = r11
            java.lang.String r11 = r4.x()
            r17 = r5
            java.lang.String[] r5 = y3.a.J
            r18 = r8
            java.lang.String[] r8 = y3.a.K
            java.lang.String r5 = y3.a.R(r11, r5, r8)
            if (r5 == 0) goto L_0x011f
            j4.i7 r3 = r4.j()
            j4.h2 r3 = (j4.h2) r3
            r3.j()
            j4.m7 r4 = r3.f8238b
            j4.i2 r4 = (j4.i2) r4
            j4.i2.y(r4, r5)
            j4.m7 r3 = r3.h()
            j4.i2 r3 = (j4.i2) r3
            r14.j()
            j4.m7 r4 = r14.f8238b
            j4.g2 r4 = (j4.g2) r4
            j4.g2.C(r4, r1, r3)
            r3 = 1
        L_0x011f:
            int r1 = r1 + 1
            r11 = r16
            r5 = r17
            r8 = r18
            goto L_0x00d8
        L_0x0128:
            r17 = r5
            r18 = r8
            if (r3 == 0) goto L_0x0147
            r13.j()
            j4.m7 r1 = r13.f8238b
            j4.e2 r1 = (j4.e2) r1
            j4.m7 r3 = r14.h()
            j4.g2 r3 = (j4.g2) r3
            j4.e2.C(r1, r15, r3)
            j4.m7 r1 = r13.h()
            j4.e2 r1 = (j4.e2) r1
            r7.set(r12, r1)
        L_0x0147:
            int r15 = r15 + 1
            r1 = r25
            r3 = r28
            r4 = r29
            r5 = r17
            r8 = r18
            goto L_0x0097
        L_0x0155:
            r17 = r5
            r18 = r8
            j4.m7 r1 = r13.f8238b
            j4.e2 r1 = (j4.e2) r1
            int r1 = r1.v()
            if (r1 == 0) goto L_0x01b0
            r1 = 0
        L_0x0164:
            j4.m7 r3 = r13.f8238b
            j4.e2 r3 = (j4.e2) r3
            int r3 = r3.v()
            if (r1 >= r3) goto L_0x01b0
            j4.m7 r3 = r13.f8238b
            j4.e2 r3 = (j4.e2) r3
            j4.n2 r3 = r3.y(r1)
            java.lang.String r4 = r3.x()
            java.lang.String[] r5 = z5.c.f13183g
            java.lang.String[] r8 = z5.c.f13184h
            java.lang.String r4 = y3.a.R(r4, r5, r8)
            if (r4 == 0) goto L_0x01ad
            j4.i7 r3 = r3.j()
            j4.m2 r3 = (j4.m2) r3
            r3.j()
            j4.m7 r5 = r3.f8238b
            j4.n2 r5 = (j4.n2) r5
            j4.n2.y(r5, r4)
            r13.j()
            j4.m7 r4 = r13.f8238b
            j4.e2 r4 = (j4.e2) r4
            j4.m7 r3 = r3.h()
            j4.n2 r3 = (j4.n2) r3
            j4.e2.B(r4, r1, r3)
            j4.m7 r3 = r13.h()
            j4.e2 r3 = (j4.e2) r3
            r7.set(r12, r3)
        L_0x01ad:
            int r1 = r1 + 1
            goto L_0x0164
        L_0x01b0:
            int r12 = r12 + 1
            r1 = r25
            r3 = r28
            r4 = r29
            r5 = r17
            r8 = r18
            goto L_0x007a
        L_0x01be:
            r17 = r5
            r18 = r8
            r6.h()
            r6.g()
            r3.o.e(r26)
            android.database.sqlite.SQLiteDatabase r1 = r6.z()
            r1.beginTransaction()
            r6.h()     // Catch:{ all -> 0x05e7 }
            r6.g()     // Catch:{ all -> 0x05e7 }
            r3.o.e(r26)     // Catch:{ all -> 0x05e7 }
            android.database.sqlite.SQLiteDatabase r3 = r6.z()     // Catch:{ all -> 0x05e7 }
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ all -> 0x05e7 }
            r8 = 0
            r5[r8] = r2     // Catch:{ all -> 0x05e7 }
            r3.delete(r10, r0, r5)     // Catch:{ all -> 0x05e7 }
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ all -> 0x05e7 }
            r5[r8] = r2     // Catch:{ all -> 0x05e7 }
            r3.delete(r9, r0, r5)     // Catch:{ all -> 0x05e7 }
            java.util.Iterator r3 = r7.iterator()     // Catch:{ all -> 0x05e7 }
        L_0x01f3:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x05e7 }
            if (r0 == 0) goto L_0x0465
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x05e7 }
            j4.e2 r0 = (j4.e2) r0     // Catch:{ all -> 0x05e7 }
            r6.h()     // Catch:{ all -> 0x05e7 }
            r6.g()     // Catch:{ all -> 0x05e7 }
            r3.o.e(r26)     // Catch:{ all -> 0x05e7 }
            r3.o.h(r0)     // Catch:{ all -> 0x05e7 }
            boolean r8 = r0.D()     // Catch:{ all -> 0x05e7 }
            if (r8 != 0) goto L_0x0223
            n4.n4 r0 = r6.f9600a     // Catch:{ all -> 0x05e7 }
            n4.i3 r0 = r0.a()     // Catch:{ all -> 0x05e7 }
            n4.g3 r0 = r0.f9831i     // Catch:{ all -> 0x05e7 }
            java.lang.String r4 = "Audience with no ID. appId"
            n4.h3 r5 = n4.i3.p(r26)     // Catch:{ all -> 0x05e7 }
            r0.b(r4, r5)     // Catch:{ all -> 0x05e7 }
            goto L_0x01f3
        L_0x0223:
            int r8 = r0.t()     // Catch:{ all -> 0x05e7 }
            java.util.List r11 = r0.z()     // Catch:{ all -> 0x05e7 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x05e7 }
        L_0x022f:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x05e7 }
            if (r12 == 0) goto L_0x0250
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x05e7 }
            j4.g2 r12 = (j4.g2) r12     // Catch:{ all -> 0x05e7 }
            boolean r12 = r12.H()     // Catch:{ all -> 0x05e7 }
            if (r12 != 0) goto L_0x022f
            n4.n4 r0 = r6.f9600a     // Catch:{ all -> 0x05e7 }
            n4.i3 r0 = r0.a()     // Catch:{ all -> 0x05e7 }
            n4.g3 r0 = r0.f9831i     // Catch:{ all -> 0x05e7 }
            java.lang.String r4 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
        L_0x024b:
            n4.h3 r5 = n4.i3.p(r26)     // Catch:{ all -> 0x05e7 }
            goto L_0x0275
        L_0x0250:
            j4.r7 r11 = r0.A()     // Catch:{ all -> 0x05e7 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x05e7 }
        L_0x0258:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x05e7 }
            if (r12 == 0) goto L_0x027e
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x05e7 }
            j4.n2 r12 = (j4.n2) r12     // Catch:{ all -> 0x05e7 }
            boolean r12 = r12.C()     // Catch:{ all -> 0x05e7 }
            if (r12 != 0) goto L_0x0258
            n4.n4 r0 = r6.f9600a     // Catch:{ all -> 0x05e7 }
            n4.i3 r0 = r0.a()     // Catch:{ all -> 0x05e7 }
            n4.g3 r0 = r0.f9831i     // Catch:{ all -> 0x05e7 }
            java.lang.String r4 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            goto L_0x024b
        L_0x0275:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x05e7 }
            r0.c(r4, r5, r8)     // Catch:{ all -> 0x05e7 }
            goto L_0x01f3
        L_0x027e:
            java.util.List r11 = r0.z()     // Catch:{ all -> 0x05e7 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x05e7 }
        L_0x0286:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x05e7 }
            java.lang.String r13 = "data"
            java.lang.String r14 = "session_scoped"
            java.lang.String r15 = "filter_id"
            java.lang.String r4 = "audience_id"
            java.lang.String r5 = "app_id"
            r19 = -1
            r21 = r3
            if (r12 == 0) goto L_0x035a
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x05e7 }
            j4.g2 r12 = (j4.g2) r12     // Catch:{ all -> 0x05e7 }
            r6.h()     // Catch:{ all -> 0x05e7 }
            r6.g()     // Catch:{ all -> 0x05e7 }
            r3.o.e(r26)     // Catch:{ all -> 0x05e7 }
            r3.o.h(r12)     // Catch:{ all -> 0x05e7 }
            java.lang.String r22 = r12.z()     // Catch:{ all -> 0x05e7 }
            boolean r22 = r22.isEmpty()     // Catch:{ all -> 0x05e7 }
            if (r22 == 0) goto L_0x02e1
            n4.n4 r0 = r6.f9600a     // Catch:{ all -> 0x05e7 }
            n4.i3 r0 = r0.a()     // Catch:{ all -> 0x05e7 }
            n4.g3 r0 = r0.f9831i     // Catch:{ all -> 0x05e7 }
            java.lang.String r3 = "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId"
            n4.h3 r4 = n4.i3.p(r26)     // Catch:{ all -> 0x05e7 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x05e7 }
            boolean r11 = r12.H()     // Catch:{ all -> 0x05e7 }
            if (r11 == 0) goto L_0x02d7
            int r11 = r12.u()     // Catch:{ all -> 0x05e7 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x05e7 }
            goto L_0x02d8
        L_0x02d7:
            r11 = 0
        L_0x02d8:
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x05e7 }
            r0.d(r3, r4, r5, r11)     // Catch:{ all -> 0x05e7 }
            goto L_0x0430
        L_0x02e1:
            byte[] r3 = r12.g()     // Catch:{ all -> 0x05e7 }
            r23 = r11
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x05e7 }
            r11.<init>()     // Catch:{ all -> 0x05e7 }
            r11.put(r5, r2)     // Catch:{ all -> 0x05e7 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x05e7 }
            r11.put(r4, r5)     // Catch:{ all -> 0x05e7 }
            boolean r4 = r12.H()     // Catch:{ all -> 0x05e7 }
            if (r4 == 0) goto L_0x0305
            int r4 = r12.u()     // Catch:{ all -> 0x05e7 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x05e7 }
            goto L_0x0306
        L_0x0305:
            r4 = 0
        L_0x0306:
            r11.put(r15, r4)     // Catch:{ all -> 0x05e7 }
            java.lang.String r4 = "event_name"
            java.lang.String r5 = r12.z()     // Catch:{ all -> 0x05e7 }
            r11.put(r4, r5)     // Catch:{ all -> 0x05e7 }
            boolean r4 = r12.I()     // Catch:{ all -> 0x05e7 }
            if (r4 == 0) goto L_0x0321
            boolean r4 = r12.F()     // Catch:{ all -> 0x05e7 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x05e7 }
            goto L_0x0322
        L_0x0321:
            r4 = 0
        L_0x0322:
            r11.put(r14, r4)     // Catch:{ all -> 0x05e7 }
            r11.put(r13, r3)     // Catch:{ all -> 0x05e7 }
            android.database.sqlite.SQLiteDatabase r3 = r6.z()     // Catch:{ SQLiteException -> 0x034d }
            r4 = 5
            r5 = 0
            long r3 = r3.insertWithOnConflict(r9, r5, r11, r4)     // Catch:{ SQLiteException -> 0x034d }
            int r3 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r3 != 0) goto L_0x0347
            n4.n4 r3 = r6.f9600a     // Catch:{ SQLiteException -> 0x034d }
            n4.i3 r3 = r3.a()     // Catch:{ SQLiteException -> 0x034d }
            n4.g3 r3 = r3.f9828f     // Catch:{ SQLiteException -> 0x034d }
            java.lang.String r4 = "Failed to insert event filter (got -1). appId"
            n4.h3 r5 = n4.i3.p(r26)     // Catch:{ SQLiteException -> 0x034d }
            r3.b(r4, r5)     // Catch:{ SQLiteException -> 0x034d }
        L_0x0347:
            r3 = r21
            r11 = r23
            goto L_0x0286
        L_0x034d:
            r0 = move-exception
            n4.n4 r3 = r6.f9600a     // Catch:{ all -> 0x05e7 }
            n4.i3 r3 = r3.a()     // Catch:{ all -> 0x05e7 }
            n4.g3 r3 = r3.f9828f     // Catch:{ all -> 0x05e7 }
            java.lang.String r4 = "Error storing event filter. appId"
            goto L_0x0429
        L_0x035a:
            j4.r7 r0 = r0.A()     // Catch:{ all -> 0x05e7 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x05e7 }
        L_0x0362:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x05e7 }
            if (r3 == 0) goto L_0x045d
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x05e7 }
            j4.n2 r3 = (j4.n2) r3     // Catch:{ all -> 0x05e7 }
            r6.h()     // Catch:{ all -> 0x05e7 }
            r6.g()     // Catch:{ all -> 0x05e7 }
            r3.o.e(r26)     // Catch:{ all -> 0x05e7 }
            r3.o.h(r3)     // Catch:{ all -> 0x05e7 }
            java.lang.String r11 = r3.x()     // Catch:{ all -> 0x05e7 }
            boolean r11 = r11.isEmpty()     // Catch:{ all -> 0x05e7 }
            if (r11 == 0) goto L_0x03af
            n4.n4 r0 = r6.f9600a     // Catch:{ all -> 0x05e7 }
            n4.i3 r0 = r0.a()     // Catch:{ all -> 0x05e7 }
            n4.g3 r0 = r0.f9831i     // Catch:{ all -> 0x05e7 }
            java.lang.String r4 = "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId"
            n4.h3 r5 = n4.i3.p(r26)     // Catch:{ all -> 0x05e7 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x05e7 }
            boolean r12 = r3.C()     // Catch:{ all -> 0x05e7 }
            if (r12 == 0) goto L_0x03a5
            int r3 = r3.t()     // Catch:{ all -> 0x05e7 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x05e7 }
            goto L_0x03a6
        L_0x03a5:
            r3 = 0
        L_0x03a6:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x05e7 }
            r0.d(r4, r5, r11, r3)     // Catch:{ all -> 0x05e7 }
            goto L_0x0430
        L_0x03af:
            byte[] r11 = r3.g()     // Catch:{ all -> 0x05e7 }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x05e7 }
            r12.<init>()     // Catch:{ all -> 0x05e7 }
            r12.put(r5, r2)     // Catch:{ all -> 0x05e7 }
            r23 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x05e7 }
            r12.put(r4, r0)     // Catch:{ all -> 0x05e7 }
            boolean r0 = r3.C()     // Catch:{ all -> 0x05e7 }
            if (r0 == 0) goto L_0x03d3
            int r0 = r3.t()     // Catch:{ all -> 0x05e7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x05e7 }
            goto L_0x03d4
        L_0x03d3:
            r0 = 0
        L_0x03d4:
            r12.put(r15, r0)     // Catch:{ all -> 0x05e7 }
            java.lang.String r0 = "property_name"
            r24 = r4
            java.lang.String r4 = r3.x()     // Catch:{ all -> 0x05e7 }
            r12.put(r0, r4)     // Catch:{ all -> 0x05e7 }
            boolean r0 = r3.D()     // Catch:{ all -> 0x05e7 }
            if (r0 == 0) goto L_0x03f1
            boolean r0 = r3.B()     // Catch:{ all -> 0x05e7 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x05e7 }
            goto L_0x03f2
        L_0x03f1:
            r0 = 0
        L_0x03f2:
            r12.put(r14, r0)     // Catch:{ all -> 0x05e7 }
            r12.put(r13, r11)     // Catch:{ all -> 0x05e7 }
            android.database.sqlite.SQLiteDatabase r0 = r6.z()     // Catch:{ SQLiteException -> 0x041e }
            r3 = 0
            r4 = 5
            long r11 = r0.insertWithOnConflict(r10, r3, r12, r4)     // Catch:{ SQLiteException -> 0x041e }
            int r0 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x0418
            n4.n4 r0 = r6.f9600a     // Catch:{ SQLiteException -> 0x041e }
            n4.i3 r0 = r0.a()     // Catch:{ SQLiteException -> 0x041e }
            n4.g3 r0 = r0.f9828f     // Catch:{ SQLiteException -> 0x041e }
            java.lang.String r3 = "Failed to insert property filter (got -1). appId"
            n4.h3 r4 = n4.i3.p(r26)     // Catch:{ SQLiteException -> 0x041e }
            r0.b(r3, r4)     // Catch:{ SQLiteException -> 0x041e }
            goto L_0x0430
        L_0x0418:
            r0 = r23
            r4 = r24
            goto L_0x0362
        L_0x041e:
            r0 = move-exception
            n4.n4 r3 = r6.f9600a     // Catch:{ all -> 0x05e7 }
            n4.i3 r3 = r3.a()     // Catch:{ all -> 0x05e7 }
            n4.g3 r3 = r3.f9828f     // Catch:{ all -> 0x05e7 }
            java.lang.String r4 = "Error storing property filter. appId"
        L_0x0429:
            n4.h3 r5 = n4.i3.p(r26)     // Catch:{ all -> 0x05e7 }
            r3.c(r4, r5, r0)     // Catch:{ all -> 0x05e7 }
        L_0x0430:
            r6.h()     // Catch:{ all -> 0x05e7 }
            r6.g()     // Catch:{ all -> 0x05e7 }
            r3.o.e(r26)     // Catch:{ all -> 0x05e7 }
            android.database.sqlite.SQLiteDatabase r0 = r6.z()     // Catch:{ all -> 0x05e7 }
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ all -> 0x05e7 }
            r5 = 0
            r4[r5] = r2     // Catch:{ all -> 0x05e7 }
            java.lang.String r11 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x05e7 }
            r12 = 1
            r4[r12] = r11     // Catch:{ all -> 0x05e7 }
            r11 = r18
            r0.delete(r10, r11, r4)     // Catch:{ all -> 0x05e7 }
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ all -> 0x05e7 }
            r3[r5] = r2     // Catch:{ all -> 0x05e7 }
            java.lang.String r4 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x05e7 }
            r3[r12] = r4     // Catch:{ all -> 0x05e7 }
            r0.delete(r9, r11, r3)     // Catch:{ all -> 0x05e7 }
            goto L_0x045f
        L_0x045d:
            r11 = r18
        L_0x045f:
            r18 = r11
            r3 = r21
            goto L_0x01f3
        L_0x0465:
            r3 = 0
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x05e7 }
            r0.<init>()     // Catch:{ all -> 0x05e7 }
            java.util.Iterator r4 = r7.iterator()     // Catch:{ all -> 0x05e7 }
        L_0x046f:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x05e7 }
            if (r5 == 0) goto L_0x048f
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x05e7 }
            j4.e2 r5 = (j4.e2) r5     // Catch:{ all -> 0x05e7 }
            boolean r7 = r5.D()     // Catch:{ all -> 0x05e7 }
            if (r7 == 0) goto L_0x048a
            int r5 = r5.t()     // Catch:{ all -> 0x05e7 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x05e7 }
            goto L_0x048b
        L_0x048a:
            r5 = r3
        L_0x048b:
            r0.add(r5)     // Catch:{ all -> 0x05e7 }
            goto L_0x046f
        L_0x048f:
            r3.o.e(r26)     // Catch:{ all -> 0x05e7 }
            r6.h()     // Catch:{ all -> 0x05e7 }
            r6.g()     // Catch:{ all -> 0x05e7 }
            android.database.sqlite.SQLiteDatabase r3 = r6.z()     // Catch:{ all -> 0x05e7 }
            java.lang.String r4 = "select count(1) from audience_filter_values where app_id=?"
            r5 = 1
            java.lang.String[] r7 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x052b }
            r5 = 0
            r7[r5] = r2     // Catch:{ SQLiteException -> 0x052b }
            long r4 = r6.u(r4, r7)     // Catch:{ SQLiteException -> 0x052b }
            n4.n4 r6 = r6.f9600a     // Catch:{ all -> 0x05e7 }
            n4.f r6 = r6.f9992g     // Catch:{ all -> 0x05e7 }
            r7 = 2000(0x7d0, float:2.803E-42)
            n4.v2 r8 = n4.w2.F     // Catch:{ all -> 0x05e7 }
            int r6 = r6.i(r2, r8)     // Catch:{ all -> 0x05e7 }
            int r6 = java.lang.Math.min(r7, r6)     // Catch:{ all -> 0x05e7 }
            r7 = 0
            int r6 = java.lang.Math.max(r7, r6)     // Catch:{ all -> 0x05e7 }
            long r7 = (long) r6     // Catch:{ all -> 0x05e7 }
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x04c4
            goto L_0x053d
        L_0x04c4:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x05e7 }
            r4.<init>()     // Catch:{ all -> 0x05e7 }
            r5 = 0
        L_0x04ca:
            int r7 = r0.size()     // Catch:{ all -> 0x05e7 }
            if (r5 >= r7) goto L_0x04e6
            java.lang.Object r7 = r0.get(r5)     // Catch:{ all -> 0x05e7 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x05e7 }
            if (r7 == 0) goto L_0x053d
            int r7 = r7.intValue()     // Catch:{ all -> 0x05e7 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x05e7 }
            r4.add(r7)     // Catch:{ all -> 0x05e7 }
            int r5 = r5 + 1
            goto L_0x04ca
        L_0x04e6:
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r4)     // Catch:{ all -> 0x05e7 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x05e7 }
            r4.<init>()     // Catch:{ all -> 0x05e7 }
            java.lang.String r5 = "("
            r4.append(r5)     // Catch:{ all -> 0x05e7 }
            r4.append(r0)     // Catch:{ all -> 0x05e7 }
            java.lang.String r0 = ")"
            r4.append(r0)     // Catch:{ all -> 0x05e7 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x05e7 }
            java.lang.String r4 = "audience_filter_values"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x05e7 }
            r5.<init>()     // Catch:{ all -> 0x05e7 }
            java.lang.String r7 = "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in "
            r5.append(r7)     // Catch:{ all -> 0x05e7 }
            r5.append(r0)     // Catch:{ all -> 0x05e7 }
            java.lang.String r0 = " order by rowid desc limit -1 offset ?)"
            r5.append(r0)     // Catch:{ all -> 0x05e7 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x05e7 }
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ all -> 0x05e7 }
            r7 = 0
            r5[r7] = r2     // Catch:{ all -> 0x05e7 }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x05e7 }
            r7 = 1
            r5[r7] = r6     // Catch:{ all -> 0x05e7 }
            r3.delete(r4, r0, r5)     // Catch:{ all -> 0x05e7 }
            goto L_0x053d
        L_0x052b:
            r0 = move-exception
            n4.n4 r3 = r6.f9600a     // Catch:{ all -> 0x05e7 }
            n4.i3 r3 = r3.a()     // Catch:{ all -> 0x05e7 }
            n4.g3 r3 = r3.f9828f     // Catch:{ all -> 0x05e7 }
            java.lang.String r4 = "Database error querying filters. appId"
            n4.h3 r5 = n4.i3.p(r26)     // Catch:{ all -> 0x05e7 }
            r3.c(r4, r5, r0)     // Catch:{ all -> 0x05e7 }
        L_0x053d:
            r1.setTransactionSuccessful()     // Catch:{ all -> 0x05e7 }
            r1.endTransaction()
            r17.j()     // Catch:{ RuntimeException -> 0x055e }
            r1 = r17
            j4.m7 r0 = r1.f8238b     // Catch:{ RuntimeException -> 0x055c }
            j4.x2 r0 = (j4.x2) r0     // Catch:{ RuntimeException -> 0x055c }
            j4.x2.J(r0)     // Catch:{ RuntimeException -> 0x055c }
            j4.m7 r0 = r1.h()     // Catch:{ RuntimeException -> 0x055c }
            j4.x2 r0 = (j4.x2) r0     // Catch:{ RuntimeException -> 0x055c }
            byte[] r0 = r0.g()     // Catch:{ RuntimeException -> 0x055c }
            r3 = r25
            goto L_0x0576
        L_0x055c:
            r0 = move-exception
            goto L_0x0561
        L_0x055e:
            r0 = move-exception
            r1 = r17
        L_0x0561:
            r3 = r25
            n4.n4 r4 = r3.f9600a
            n4.i3 r4 = r4.a()
            n4.g3 r4 = r4.f9831i
            n4.h3 r5 = n4.i3.p(r26)
            java.lang.String r6 = "Unable to serialize reduced-size config. Storing full config instead. appId"
            r4.c(r6, r5, r0)
            r0 = r27
        L_0x0576:
            n4.w7 r4 = r3.f10066b
            n4.i r4 = r4.f10284c
            n4.w7.H(r4)
            r3.o.e(r26)
            r4.g()
            r4.h()
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            java.lang.String r6 = "remote_config"
            r5.put(r6, r0)
            java.lang.String r0 = "config_last_modified_time"
            r6 = r28
            r5.put(r0, r6)
            java.lang.String r0 = "e_tag"
            r6 = r29
            r5.put(r0, r6)
            android.database.sqlite.SQLiteDatabase r0 = r4.z()     // Catch:{ SQLiteException -> 0x05c9 }
            java.lang.String r6 = "apps"
            java.lang.String r7 = "app_id = ?"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x05c9 }
            r9 = 0
            r8[r9] = r2     // Catch:{ SQLiteException -> 0x05c9 }
            int r0 = r0.update(r6, r5, r7, r8)     // Catch:{ SQLiteException -> 0x05c9 }
            long r5 = (long) r0     // Catch:{ SQLiteException -> 0x05c9 }
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x05db
            n4.n4 r0 = r4.f9600a     // Catch:{ SQLiteException -> 0x05c9 }
            n4.i3 r0 = r0.a()     // Catch:{ SQLiteException -> 0x05c9 }
            n4.g3 r0 = r0.f9828f     // Catch:{ SQLiteException -> 0x05c9 }
            java.lang.String r5 = "Failed to update remote config (got 0). appId"
            n4.h3 r6 = n4.i3.p(r26)     // Catch:{ SQLiteException -> 0x05c9 }
            r0.b(r5, r6)     // Catch:{ SQLiteException -> 0x05c9 }
            goto L_0x05db
        L_0x05c9:
            r0 = move-exception
            n4.n4 r4 = r4.f9600a
            n4.i3 r4 = r4.a()
            n4.g3 r4 = r4.f9828f
            n4.h3 r5 = n4.i3.p(r26)
            java.lang.String r6 = "Error storing remote config. appId"
            r4.c(r6, r5, r0)
        L_0x05db:
            m.b r0 = r3.f9800h
            j4.m7 r1 = r1.h()
            j4.x2 r1 = (j4.x2) r1
            r0.put(r2, r1)
            return
        L_0x05e7:
            r0 = move-exception
            r3 = r25
            r1.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.h4.u(java.lang.String, byte[], java.lang.String, java.lang.String):void");
    }
}
