package com.google.firebase.auth;

import android.util.Log;
import androidx.annotation.Keep;
import c6.f;
import h6.l;
import i4.kf;
import i6.i;
import i6.q;
import i6.s;
import i6.t;
import i6.v;
import java.util.concurrent.CopyOnWriteArrayList;
import r3.o;

public abstract class FirebaseAuth implements i6.b {

    /* renamed from: a  reason: collision with root package name */
    public f f3459a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f3460b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList f3461c = new CopyOnWriteArrayList();

    /* renamed from: d  reason: collision with root package name */
    public CopyOnWriteArrayList f3462d = new CopyOnWriteArrayList();

    /* renamed from: e  reason: collision with root package name */
    public kf f3463e;

    /* renamed from: f  reason: collision with root package name */
    public l f3464f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f3465g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public final Object f3466h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public String f3467i;

    /* renamed from: j  reason: collision with root package name */
    public final q f3468j;
    public final v k;

    /* renamed from: l  reason: collision with root package name */
    public final u6.a f3469l;

    /* renamed from: m  reason: collision with root package name */
    public s f3470m;

    /* renamed from: n  reason: collision with root package name */
    public t f3471n = t.f7924b;

    public interface a {
        void a();
    }

    public interface b {
        void a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FirebaseAuth(c6.f r11, u6.a r12) {
        /*
            r10 = this;
            i4.kf r0 = new i4.kf
            r0.<init>(r11)
            i6.q r1 = new i6.q
            r11.a()
            android.content.Context r2 = r11.f2494a
            java.lang.String r3 = r11.f()
            r1.<init>(r2, r3)
            i6.v r2 = i6.v.f7927b
            i6.w r3 = i6.w.f7929a
            r10.<init>()
            java.util.concurrent.CopyOnWriteArrayList r4 = new java.util.concurrent.CopyOnWriteArrayList
            r4.<init>()
            r10.f3460b = r4
            java.util.concurrent.CopyOnWriteArrayList r4 = new java.util.concurrent.CopyOnWriteArrayList
            r4.<init>()
            r10.f3461c = r4
            java.util.concurrent.CopyOnWriteArrayList r4 = new java.util.concurrent.CopyOnWriteArrayList
            r4.<init>()
            r10.f3462d = r4
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            r10.f3465g = r4
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            r10.f3466h = r4
            i6.t r4 = i6.t.f7924b
            r10.f3471n = r4
            r10.f3459a = r11
            r10.f3463e = r0
            r10.f3468j = r1
            r3.o.h(r2)
            r10.k = r2
            r3.o.h(r3)
            r10.f3469l = r12
            java.lang.String r11 = "type"
            android.content.SharedPreferences r12 = r1.f7920a
            java.lang.String r0 = "com.google.firebase.auth.FIREBASE_USER"
            r2 = 0
            java.lang.String r12 = r12.getString(r0, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L_0x0063
            goto L_0x007f
        L_0x0063:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x007f }
            r0.<init>(r12)     // Catch:{ Exception -> 0x007f }
            boolean r12 = r0.has(r11)     // Catch:{ Exception -> 0x007f }
            if (r12 == 0) goto L_0x007f
            java.lang.String r12 = "com.google.firebase.auth.internal.DefaultFirebaseUser"
            java.lang.String r11 = r0.optString(r11)     // Catch:{ Exception -> 0x007f }
            boolean r11 = r12.equalsIgnoreCase(r11)     // Catch:{ Exception -> 0x007f }
            if (r11 == 0) goto L_0x007f
            i6.h0 r11 = r1.a(r0)     // Catch:{ Exception -> 0x007f }
            goto L_0x0080
        L_0x007f:
            r11 = r2
        L_0x0080:
            r10.f3464f = r11
            r12 = 0
            r0 = 1
            if (r11 == 0) goto L_0x00ae
            i6.q r1 = r10.f3468j
            r1.getClass()
            android.content.SharedPreferences r1 = r1.f7920a
            java.lang.Object[] r3 = new java.lang.Object[r0]
            i6.e0 r11 = r11.f7897b
            java.lang.String r11 = r11.f7885a
            r3[r12] = r11
            java.lang.String r11 = "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"
            java.lang.String r11 = java.lang.String.format(r11, r3)
            java.lang.String r11 = r1.getString(r11, r2)
            if (r11 == 0) goto L_0x00a6
            i4.wg r11 = i4.wg.x(r11)
            goto L_0x00a7
        L_0x00a6:
            r11 = r2
        L_0x00a7:
            if (r11 == 0) goto L_0x00ae
            h6.l r1 = r10.f3464f
            d(r10, r1, r11, r12, r12)
        L_0x00ae:
            i6.v r11 = r10.k
            i6.p r11 = r11.f7928a
            r11.getClass()
            c6.f r11 = r10.f3459a
            r11.a()
            android.content.Context r11 = r11.f2494a
            java.lang.String r1 = "com.google.firebase.auth.internal.ProcessDeathHelper"
            android.content.SharedPreferences r11 = r11.getSharedPreferences(r1, r12)
            java.lang.String r1 = "firebaseAppName"
            java.lang.String r3 = ""
            java.lang.String r1 = r11.getString(r1, r3)
            c6.f r3 = r10.f3459a
            r3.a()
            java.lang.String r3 = r3.f2495b
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x00d9
            goto L_0x043a
        L_0x00d9:
            java.lang.String r1 = "verifyAssertionRequest"
            boolean r1 = r11.contains(r1)
            r3 = -1
            r4 = 0
            if (r1 == 0) goto L_0x03de
            java.lang.String r1 = "verifyAssertionRequest"
            java.lang.String r6 = ""
            java.lang.String r1 = r11.getString(r1, r6)
            android.os.Parcelable$Creator<i4.k> r6 = i4.k.CREATOR
            if (r1 != 0) goto L_0x00f2
            r1 = r2
            goto L_0x00f8
        L_0x00f2:
            r7 = 10
            byte[] r1 = android.util.Base64.decode(r1, r7)
        L_0x00f8:
            r3.o.h(r6)
            android.os.Parcel r7 = android.os.Parcel.obtain()
            int r8 = r1.length
            r7.unmarshall(r1, r12, r8)
            r7.setDataPosition(r12)
            java.lang.Object r1 = r6.createFromParcel(r7)
            s3.c r1 = (s3.c) r1
            r7.recycle()
            i4.k r1 = (i4.k) r1
            java.lang.String r6 = "operation"
            java.lang.String r7 = ""
            java.lang.String r6 = r11.getString(r6, r7)
            java.lang.String r7 = "tenantId"
            java.lang.String r7 = r11.getString(r7, r2)
            java.lang.String r8 = "firebaseUserUid"
            java.lang.String r9 = ""
            java.lang.String r8 = r11.getString(r8, r9)
            java.lang.String r9 = "timestamp"
            r11.getLong(r9, r4)
            if (r7 == 0) goto L_0x013d
            r3.o.e(r7)
            java.lang.Object r4 = r10.f3466h
            monitor-enter(r4)
            r10.f3467i = r7     // Catch:{ all -> 0x013a }
            monitor-exit(r4)     // Catch:{ all -> 0x013a }
            r1.f7424n = r7
            goto L_0x013d
        L_0x013a:
            r11 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x013a }
            throw r11
        L_0x013d:
            int r4 = r6.hashCode()
            r5 = -98509410(0xfffffffffa20dd9e, float:-2.088156E35)
            r7 = 2
            if (r4 == r5) goto L_0x0166
            r5 = 175006864(0xa6e6490, float:1.1478197E-32)
            if (r4 == r5) goto L_0x015c
            r5 = 1450464913(0x56745691, float:6.7163159E13)
            if (r4 == r5) goto L_0x0152
            goto L_0x016f
        L_0x0152:
            java.lang.String r4 = "com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x016f
            r3 = r12
            goto L_0x016f
        L_0x015c:
            java.lang.String r4 = "com.google.firebase.auth.internal.NONGMSCORE_LINK"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x016f
            r3 = r0
            goto L_0x016f
        L_0x0166:
            java.lang.String r4 = "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x016f
            r3 = r7
        L_0x016f:
            r4 = 17072(0x42b0, float:2.3923E-41)
            if (r3 == 0) goto L_0x030b
            if (r3 == r0) goto L_0x027e
            if (r3 == r7) goto L_0x0179
            goto L_0x040a
        L_0x0179:
            h6.l r3 = r10.f3464f
            java.lang.String r3 = r3.A()
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L_0x040a
            h6.l r3 = r10.f3464f
            h6.b0 r1 = h6.b0.y(r1)
            r3.o.h(r3)
            h6.b r1 = r1.x()
            boolean r5 = r1 instanceof h6.c
            if (r5 == 0) goto L_0x0229
            h6.c r1 = (h6.c) r1
            java.lang.String r5 = r1.f6903b
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r6 = "password"
            if (r5 != 0) goto L_0x01a4
            r5 = r6
            goto L_0x01a6
        L_0x01a4:
            java.lang.String r5 = "emailLink"
        L_0x01a6:
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x01d9
            i4.kf r12 = r10.f3463e
            c6.f r0 = r10.f3459a
            java.lang.String r2 = r1.f6902a
            java.lang.String r1 = r1.f6903b
            r3.o.e(r1)
            java.lang.String r4 = r3.z()
            h6.h0 r5 = new h6.h0
            r6 = r10
            i6.g0 r6 = (i6.g0) r6
            r5.<init>(r6)
            r12.getClass()
            i4.jf r6 = new i4.jf
            r6.<init>(r2, r1, r4)
            r6.d(r0)
            r6.f7237d = r3
            r6.f7238e = r5
            r6.f7239f = r5
            r12.a(r6)
            goto L_0x040a
        L_0x01d9:
            java.lang.String r5 = r1.f6904c
            r3.o.e(r5)
            int r6 = h6.a.f6892c
            r3.o.e(r5)
            h6.a r6 = new h6.a     // Catch:{ IllegalArgumentException -> 0x01e9 }
            r6.<init>(r5)     // Catch:{ IllegalArgumentException -> 0x01e9 }
            goto L_0x01ea
        L_0x01e9:
            r6 = r2
        L_0x01ea:
            if (r6 == 0) goto L_0x01f7
            java.lang.String r5 = r10.f3467i
            java.lang.String r6 = r6.f6894b
            boolean r5 = android.text.TextUtils.equals(r5, r6)
            if (r5 != 0) goto L_0x01f7
            r12 = r0
        L_0x01f7:
            if (r12 == 0) goto L_0x0207
            com.google.android.gms.common.api.Status r12 = new com.google.android.gms.common.api.Status
            r12.<init>(r4, r2)
            c6.g r12 = i4.of.a(r12)
            com.google.android.gms.tasks.Tasks.forException(r12)
            goto L_0x040a
        L_0x0207:
            i4.kf r12 = r10.f3463e
            c6.f r0 = r10.f3459a
            h6.h0 r2 = new h6.h0
            r4 = r10
            i6.g0 r4 = (i6.g0) r4
            r2.<init>(r4)
            r12.getClass()
            i4.if r4 = new i4.if
            r4.<init>(r1)
            r4.d(r0)
            r4.f7237d = r3
            r4.f7238e = r2
            r4.f7239f = r2
            r12.a(r4)
            goto L_0x040a
        L_0x0229:
            boolean r12 = r1 instanceof h6.q
            if (r12 == 0) goto L_0x0258
            i4.kf r12 = r10.f3463e
            c6.f r0 = r10.f3459a
            h6.q r1 = (h6.q) r1
            java.lang.String r2 = r10.f3467i
            h6.h0 r4 = new h6.h0
            r5 = r10
            i6.g0 r5 = (i6.g0) r5
            r4.<init>(r5)
            r12.getClass()
            m.b r5 = i4.ig.f7388a
            r5.clear()
            i4.df r5 = new i4.df
            r5.<init>(r1, r2)
            r5.d(r0)
            r5.f7237d = r3
            r5.f7238e = r4
            r5.f7239f = r4
            r12.a(r5)
            goto L_0x040a
        L_0x0258:
            i4.kf r12 = r10.f3463e
            c6.f r0 = r10.f3459a
            java.lang.String r2 = r3.z()
            h6.h0 r4 = new h6.h0
            r5 = r10
            i6.g0 r5 = (i6.g0) r5
            r4.<init>(r5)
            r12.getClass()
            i4.hf r5 = new i4.hf
            r5.<init>((h6.b) r1, (java.lang.String) r2)
            r5.d(r0)
            r5.f7237d = r3
            r5.f7238e = r4
            r5.f7239f = r4
            r12.a(r5)
            goto L_0x040a
        L_0x027e:
            h6.l r3 = r10.f3464f
            java.lang.String r3 = r3.A()
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L_0x040a
            h6.l r3 = r10.f3464f
            h6.b0 r1 = h6.b0.y(r1)
            r3.o.h(r3)
            i4.kf r4 = r10.f3463e
            c6.f r5 = r10.f3459a
            h6.b r1 = r1.x()
            h6.h0 r6 = new h6.h0
            r7 = r10
            i6.g0 r7 = (i6.g0) r7
            r6.<init>(r7)
            r4.getClass()
            r3.o.h(r5)
            java.util.List r7 = r3.H()
            if (r7 == 0) goto L_0x02cb
            r8 = r1
            h6.b0 r8 = (h6.b0) r8
            java.lang.String r8 = r8.f6895a
            boolean r7 = r7.contains(r8)
            if (r7 != 0) goto L_0x02bb
            goto L_0x02cb
        L_0x02bb:
            com.google.android.gms.common.api.Status r12 = new com.google.android.gms.common.api.Status
            r0 = 17015(0x4277, float:2.3843E-41)
            r12.<init>(r0, r2)
            c6.g r12 = i4.of.a(r12)
            com.google.android.gms.tasks.Tasks.forException(r12)
            goto L_0x040a
        L_0x02cb:
            boolean r2 = r1 instanceof h6.c
            if (r2 == 0) goto L_0x02e7
            h6.c r1 = (h6.c) r1
            java.lang.String r2 = r1.f6904c
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r0 = r0 ^ r2
            if (r0 != 0) goto L_0x02e0
            i4.df r12 = new i4.df
            r12.<init>(r1)
            goto L_0x02fd
        L_0x02e0:
            i4.gf r0 = new i4.gf
            r0.<init>(r1, r12)
            r12 = r0
            goto L_0x02fd
        L_0x02e7:
            boolean r12 = r1 instanceof h6.q
            if (r12 == 0) goto L_0x02f8
            h6.q r1 = (h6.q) r1
            m.b r12 = i4.ig.f7388a
            r12.clear()
            i4.ff r12 = new i4.ff
            r12.<init>(r1)
            goto L_0x02fd
        L_0x02f8:
            i4.ef r12 = new i4.ef
            r12.<init>(r1)
        L_0x02fd:
            r12.d(r5)
            r12.f7237d = r3
            r12.f7238e = r6
            r12.f7239f = r6
            r4.a(r12)
            goto L_0x040a
        L_0x030b:
            h6.b0 r1 = h6.b0.y(r1)
            h6.b r1 = r1.x()
            boolean r3 = r1 instanceof h6.c
            if (r3 == 0) goto L_0x0395
            h6.c r1 = (h6.c) r1
            java.lang.String r3 = r1.f6904c
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r3 = r3 ^ r0
            if (r3 != 0) goto L_0x0349
            i4.kf r12 = r10.f3463e
            c6.f r0 = r10.f3459a
            java.lang.String r2 = r1.f6902a
            java.lang.String r1 = r1.f6903b
            r3.o.e(r1)
            java.lang.String r3 = r10.f3467i
            h6.g0 r4 = new h6.g0
            r5 = r10
            i6.g0 r5 = (i6.g0) r5
            r4.<init>(r5)
            r12.getClass()
            i4.ff r5 = new i4.ff
            r5.<init>(r2, r1, r3)
            r5.d(r0)
            r5.f7238e = r4
            r12.a(r5)
            goto L_0x040a
        L_0x0349:
            java.lang.String r3 = r1.f6904c
            r3.o.e(r3)
            int r5 = h6.a.f6892c
            r3.o.e(r3)
            h6.a r5 = new h6.a     // Catch:{ IllegalArgumentException -> 0x0359 }
            r5.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x0359 }
            goto L_0x035a
        L_0x0359:
            r5 = r2
        L_0x035a:
            if (r5 == 0) goto L_0x0367
            java.lang.String r3 = r10.f3467i
            java.lang.String r5 = r5.f6894b
            boolean r3 = android.text.TextUtils.equals(r3, r5)
            if (r3 != 0) goto L_0x0367
            r12 = r0
        L_0x0367:
            if (r12 == 0) goto L_0x0377
            com.google.android.gms.common.api.Status r12 = new com.google.android.gms.common.api.Status
            r12.<init>(r4, r2)
            c6.g r12 = i4.of.a(r12)
            com.google.android.gms.tasks.Tasks.forException(r12)
            goto L_0x040a
        L_0x0377:
            i4.kf r12 = r10.f3463e
            c6.f r2 = r10.f3459a
            h6.g0 r3 = new h6.g0
            r4 = r10
            i6.g0 r4 = (i6.g0) r4
            r3.<init>(r4)
            r12.getClass()
            i4.gf r4 = new i4.gf
            r4.<init>(r1, r0)
            r4.d(r2)
            r4.f7238e = r3
            r12.a(r4)
            goto L_0x040a
        L_0x0395:
            boolean r12 = r1 instanceof h6.q
            if (r12 == 0) goto L_0x03bf
            h6.q r1 = (h6.q) r1
            i4.kf r12 = r10.f3463e
            c6.f r0 = r10.f3459a
            java.lang.String r2 = r10.f3467i
            h6.g0 r3 = new h6.g0
            r4 = r10
            i6.g0 r4 = (i6.g0) r4
            r3.<init>(r4)
            r12.getClass()
            m.b r4 = i4.ig.f7388a
            r4.clear()
            i4.hf r4 = new i4.hf
            r4.<init>((h6.q) r1, (java.lang.String) r2)
            r4.d(r0)
            r4.f7238e = r3
            r12.a(r4)
            goto L_0x040a
        L_0x03bf:
            i4.kf r12 = r10.f3463e
            c6.f r0 = r10.f3459a
            java.lang.String r2 = r10.f3467i
            h6.g0 r3 = new h6.g0
            r4 = r10
            i6.g0 r4 = (i6.g0) r4
            r3.<init>(r4)
            r12.getClass()
            i4.ef r4 = new i4.ef
            r4.<init>(r1, r2)
            r4.d(r0)
            r4.f7238e = r3
            r12.a(r4)
            goto L_0x040a
        L_0x03de:
            java.lang.String r12 = "recaptchaToken"
            boolean r12 = r11.contains(r12)
            if (r12 == 0) goto L_0x040e
            java.lang.String r12 = "recaptchaToken"
            java.lang.String r0 = ""
            java.lang.String r12 = r11.getString(r12, r0)
            java.lang.String r0 = "operation"
            java.lang.String r1 = ""
            java.lang.String r0 = r11.getString(r0, r1)
            java.lang.String r1 = "timestamp"
            r11.getLong(r1, r4)
            r0.getClass()
            java.lang.String r1 = "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0407
            goto L_0x040a
        L_0x0407:
            com.google.android.gms.tasks.Tasks.forResult(r12)
        L_0x040a:
            i6.p.a(r11)
            goto L_0x043a
        L_0x040e:
            java.lang.String r12 = "statusCode"
            boolean r12 = r11.contains(r12)
            if (r12 == 0) goto L_0x043a
            java.lang.String r12 = "statusCode"
            r0 = 17062(0x42a6, float:2.3909E-41)
            int r12 = r11.getInt(r12, r0)
            java.lang.String r0 = "statusMessage"
            java.lang.String r1 = ""
            java.lang.String r0 = r11.getString(r0, r1)
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            r1.<init>(r12, r0)
            java.lang.String r12 = "timestamp"
            r11.getLong(r12, r4)
            i6.p.a(r11)
            c6.g r11 = i4.of.a(r1)
            com.google.android.gms.tasks.Tasks.forException(r11)
        L_0x043a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.<init>(c6.f, u6.a):void");
    }

    public static void b(FirebaseAuth firebaseAuth, l lVar) {
        String str;
        if (lVar != null) {
            str = "Notifying auth state listeners about user ( " + lVar.A() + " ).";
        } else {
            str = "Notifying auth state listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        firebaseAuth.f3471n.execute(new b(firebaseAuth));
    }

    public static void c(FirebaseAuth firebaseAuth, l lVar) {
        String str;
        if (lVar != null) {
            str = "Notifying id token listeners about user ( " + lVar.A() + " ).";
        } else {
            str = "Notifying id token listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        firebaseAuth.f3471n.execute(new a(firebaseAuth, new z6.b(lVar != null ? lVar.F() : null)));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:41|42|43|44|45|46) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0126 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(com.google.firebase.auth.FirebaseAuth r16, h6.l r17, i4.wg r18, boolean r19, boolean r20) {
        /*
            r0 = r16
            r1 = r18
            r3.o.h(r17)
            r3.o.h(r18)
            h6.l r2 = r0.f3464f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0022
            java.lang.String r2 = r17.A()
            h6.l r5 = r0.f3464f
            java.lang.String r5 = r5.A()
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0022
            r2 = r3
            goto L_0x0023
        L_0x0022:
            r2 = r4
        L_0x0023:
            if (r2 != 0) goto L_0x0029
            if (r20 != 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            return
        L_0x0029:
            h6.l r5 = r0.f3464f
            if (r5 != 0) goto L_0x0030
            r2 = r3
            r5 = r2
            goto L_0x0045
        L_0x0030:
            i4.wg r5 = r5.E()
            java.lang.String r5 = r5.f7777b
            java.lang.String r6 = r1.f7777b
            boolean r5 = r5.equals(r6)
            r5 = r5 ^ r3
            if (r2 == 0) goto L_0x0043
            if (r5 != 0) goto L_0x0043
            r5 = r4
            goto L_0x0044
        L_0x0043:
            r5 = r3
        L_0x0044:
            r2 = r2 ^ r3
        L_0x0045:
            h6.l r6 = r0.f3464f
            r7 = r17
            if (r6 != 0) goto L_0x004e
            r0.f3464f = r7
            goto L_0x006d
        L_0x004e:
            java.util.List r8 = r17.y()
            r6.D(r8)
            boolean r6 = r17.B()
            if (r6 != 0) goto L_0x0060
            h6.l r6 = r0.f3464f
            r6.C()
        L_0x0060:
            c2.b r6 = r17.x()
            java.util.ArrayList r6 = r6.b()
            h6.l r8 = r0.f3464f
            r8.J(r6)
        L_0x006d:
            if (r19 == 0) goto L_0x018a
            i6.q r6 = r0.f3468j
            h6.l r8 = r0.f3464f
            r6.getClass()
            r3.o.h(r8)
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.lang.Class<i6.h0> r10 = i6.h0.class
            java.lang.Class r11 = r8.getClass()
            boolean r10 = r10.isAssignableFrom(r11)
            if (r10 == 0) goto L_0x0174
            i6.h0 r8 = (i6.h0) r8
            java.lang.String r10 = "cachedTokenState"
            java.lang.String r11 = r8.G()     // Catch:{ Exception -> 0x015e }
            r9.put(r10, r11)     // Catch:{ Exception -> 0x015e }
            java.lang.String r10 = "applicationName"
            java.lang.String r11 = r8.f7898c     // Catch:{ Exception -> 0x015e }
            c6.f r11 = c6.f.e(r11)     // Catch:{ Exception -> 0x015e }
            r11.a()     // Catch:{ Exception -> 0x015e }
            java.lang.String r11 = r11.f2495b     // Catch:{ Exception -> 0x015e }
            r9.put(r10, r11)     // Catch:{ Exception -> 0x015e }
            java.lang.String r10 = "type"
            java.lang.String r11 = "com.google.firebase.auth.internal.DefaultFirebaseUser"
            r9.put(r10, r11)     // Catch:{ Exception -> 0x015e }
            java.util.List r10 = r8.f7900e     // Catch:{ Exception -> 0x015e }
            if (r10 == 0) goto L_0x00fd
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ Exception -> 0x015e }
            r10.<init>()     // Catch:{ Exception -> 0x015e }
            java.util.List r11 = r8.f7900e     // Catch:{ Exception -> 0x015e }
            int r12 = r11.size()     // Catch:{ Exception -> 0x015e }
            int r13 = r11.size()     // Catch:{ Exception -> 0x015e }
            r14 = 30
            if (r13 <= r14) goto L_0x00e5
            u3.a r12 = r6.f7921b     // Catch:{ Exception -> 0x015e }
            r13 = 2
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x015e }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x015e }
            r13[r4] = r15     // Catch:{ Exception -> 0x015e }
            int r15 = r11.size()     // Catch:{ Exception -> 0x015e }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x015e }
            r13[r3] = r15     // Catch:{ Exception -> 0x015e }
            java.lang.String r15 = "Provider user info list size larger than max size, truncating list to %d. Actual list size: %d"
            java.lang.String r14 = r12.f12198a     // Catch:{ Exception -> 0x015e }
            java.lang.String r12 = r12.d(r15, r13)     // Catch:{ Exception -> 0x015e }
            android.util.Log.w(r14, r12)     // Catch:{ Exception -> 0x015e }
            r12 = 30
        L_0x00e5:
            r13 = r4
        L_0x00e6:
            if (r13 >= r12) goto L_0x00f8
            java.lang.Object r14 = r11.get(r13)     // Catch:{ Exception -> 0x015e }
            i6.e0 r14 = (i6.e0) r14     // Catch:{ Exception -> 0x015e }
            java.lang.String r14 = r14.zzb()     // Catch:{ Exception -> 0x015e }
            r10.put(r14)     // Catch:{ Exception -> 0x015e }
            int r13 = r13 + 1
            goto L_0x00e6
        L_0x00f8:
            java.lang.String r11 = "userInfos"
            r9.put(r11, r10)     // Catch:{ Exception -> 0x015e }
        L_0x00fd:
            java.lang.String r10 = "anonymous"
            boolean r11 = r8.B()     // Catch:{ Exception -> 0x015e }
            r9.put(r10, r11)     // Catch:{ Exception -> 0x015e }
            java.lang.String r10 = "version"
            java.lang.String r11 = "2"
            r9.put(r10, r11)     // Catch:{ Exception -> 0x015e }
            i6.j0 r10 = r8.f7904i     // Catch:{ Exception -> 0x015e }
            if (r10 == 0) goto L_0x0129
            java.lang.String r11 = "userMetadata"
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ Exception -> 0x015e }
            r12.<init>()     // Catch:{ Exception -> 0x015e }
            java.lang.String r13 = "lastSignInTimestamp"
            long r14 = r10.f7912a     // Catch:{ JSONException -> 0x0126 }
            r12.put(r13, r14)     // Catch:{ JSONException -> 0x0126 }
            java.lang.String r13 = "creationTimestamp"
            long r14 = r10.f7913b     // Catch:{ JSONException -> 0x0126 }
            r12.put(r13, r14)     // Catch:{ JSONException -> 0x0126 }
        L_0x0126:
            r9.put(r11, r12)     // Catch:{ Exception -> 0x015e }
        L_0x0129:
            c2.b r10 = new c2.b     // Catch:{ Exception -> 0x015e }
            r10.<init>((i6.h0) r8)     // Catch:{ Exception -> 0x015e }
            java.util.ArrayList r8 = r10.b()     // Catch:{ Exception -> 0x015e }
            boolean r10 = r8.isEmpty()     // Catch:{ Exception -> 0x015e }
            if (r10 != 0) goto L_0x0159
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ Exception -> 0x015e }
            r10.<init>()     // Catch:{ Exception -> 0x015e }
            r11 = r4
        L_0x013e:
            int r12 = r8.size()     // Catch:{ Exception -> 0x015e }
            if (r11 >= r12) goto L_0x0154
            java.lang.Object r12 = r8.get(r11)     // Catch:{ Exception -> 0x015e }
            h6.o r12 = (h6.o) r12     // Catch:{ Exception -> 0x015e }
            org.json.JSONObject r12 = r12.x()     // Catch:{ Exception -> 0x015e }
            r10.put(r12)     // Catch:{ Exception -> 0x015e }
            int r11 = r11 + 1
            goto L_0x013e
        L_0x0154:
            java.lang.String r8 = "userMultiFactorInfo"
            r9.put(r8, r10)     // Catch:{ Exception -> 0x015e }
        L_0x0159:
            java.lang.String r8 = r9.toString()     // Catch:{ Exception -> 0x015e }
            goto L_0x0175
        L_0x015e:
            r0 = move-exception
            u3.a r1 = r6.f7921b
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r3 = r1.f12198a
            java.lang.String r4 = "Failed to turn object into JSON"
            java.lang.String r1 = r1.d(r4, r2)
            android.util.Log.wtf(r3, r1, r0)
            i4.yd r1 = new i4.yd
            r1.<init>(r0)
            throw r1
        L_0x0174:
            r8 = 0
        L_0x0175:
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L_0x018a
            android.content.SharedPreferences r6 = r6.f7920a
            android.content.SharedPreferences$Editor r6 = r6.edit()
            java.lang.String r9 = "com.google.firebase.auth.FIREBASE_USER"
            android.content.SharedPreferences$Editor r6 = r6.putString(r9, r8)
            r6.apply()
        L_0x018a:
            if (r5 == 0) goto L_0x0198
            h6.l r5 = r0.f3464f
            if (r5 == 0) goto L_0x0193
            r5.I(r1)
        L_0x0193:
            h6.l r5 = r0.f3464f
            c(r0, r5)
        L_0x0198:
            if (r2 == 0) goto L_0x019f
            h6.l r2 = r0.f3464f
            b(r0, r2)
        L_0x019f:
            if (r19 == 0) goto L_0x01c5
            i6.q r2 = r0.f3468j
            r2.getClass()
            android.content.SharedPreferences r2 = r2.f7920a
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r5 = r17.A()
            r3[r4] = r5
            java.lang.String r4 = "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            java.lang.String r1 = r18.y()
            android.content.SharedPreferences$Editor r1 = r2.putString(r3, r1)
            r1.apply()
        L_0x01c5:
            h6.l r1 = r0.f3464f
            if (r1 == 0) goto L_0x0209
            i6.s r2 = r0.f3470m
            if (r2 != 0) goto L_0x01d9
            c6.f r2 = r0.f3459a
            r3.o.h(r2)
            i6.s r3 = new i6.s
            r3.<init>(r2)
            r0.f3470m = r3
        L_0x01d9:
            i6.s r0 = r0.f3470m
            i4.wg r1 = r1.E()
            r0.getClass()
            if (r1 != 0) goto L_0x01e5
            goto L_0x0209
        L_0x01e5:
            java.lang.Long r2 = r1.f7778c
            r3 = 0
            if (r2 != 0) goto L_0x01ed
            r5 = r3
            goto L_0x01f1
        L_0x01ed:
            long r5 = r2.longValue()
        L_0x01f1:
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x01f7
            r5 = 3600(0xe10, double:1.7786E-320)
        L_0x01f7:
            java.lang.Long r1 = r1.f7780e
            long r1 = r1.longValue()
            i6.i r0 = r0.f7923a
            r3 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r3
            long r5 = r5 + r1
            r0.f7908a = r5
            r1 = -1
            r0.f7909b = r1
        L_0x0209:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.d(com.google.firebase.auth.FirebaseAuth, h6.l, i4.wg, boolean, boolean):void");
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) f.d().b(FirebaseAuth.class);
    }

    @Keep
    public static FirebaseAuth getInstance(f fVar) {
        return (FirebaseAuth) fVar.b(FirebaseAuth.class);
    }

    public final void a() {
        o.h(this.f3468j);
        l lVar = this.f3464f;
        if (lVar != null) {
            q qVar = this.f3468j;
            qVar.f7920a.edit().remove(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{lVar.A()})).apply();
            this.f3464f = null;
        }
        this.f3468j.f7920a.edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
        c(this, (l) null);
        b(this, (l) null);
        s sVar = this.f3470m;
        if (sVar != null) {
            i iVar = sVar.f7923a;
            iVar.f7910c.removeCallbacks(iVar.f7911d);
        }
    }
}
