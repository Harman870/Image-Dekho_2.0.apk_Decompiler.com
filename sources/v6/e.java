package v6;

import android.annotation.SuppressLint;
import android.net.TrafficStats;
import android.util.Log;
import androidx.activity.m;
import c6.f;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import j6.q;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import k6.s;
import o.g;
import r3.o;
import u6.a;
import x2.l;
import x6.a;
import x6.b;
import y6.b;
import y6.c;

public final class e implements f {

    /* renamed from: m  reason: collision with root package name */
    public static final Object f12626m = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final f f12627a;

    /* renamed from: b  reason: collision with root package name */
    public final c f12628b;

    /* renamed from: c  reason: collision with root package name */
    public final x6.c f12629c;

    /* renamed from: d  reason: collision with root package name */
    public final m f12630d;

    /* renamed from: e  reason: collision with root package name */
    public final q<b> f12631e;

    /* renamed from: f  reason: collision with root package name */
    public final k f12632f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f12633g;

    /* renamed from: h  reason: collision with root package name */
    public final ExecutorService f12634h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f12635i;

    /* renamed from: j  reason: collision with root package name */
    public String f12636j;
    public HashSet k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f12637l;

    static {
        new AtomicInteger(1);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public e() {
        throw null;
    }

    @SuppressLint({"ThreadPoolCreation"})
    public e(f fVar, a aVar, ExecutorService executorService, s sVar) {
        fVar.a();
        c cVar = new c(fVar.f2494a, aVar);
        x6.c cVar2 = new x6.c(fVar);
        if (y3.a.f13022c == null) {
            y3.a.f13022c = new y3.a();
        }
        y3.a aVar2 = y3.a.f13022c;
        if (m.f12645d == null) {
            m.f12645d = new m(aVar2);
        }
        m mVar = m.f12645d;
        q<b> qVar = new q<>(new b(fVar));
        k kVar = new k();
        this.f12633g = new Object();
        this.k = new HashSet();
        this.f12637l = new ArrayList();
        this.f12627a = fVar;
        this.f12628b = cVar;
        this.f12629c = cVar2;
        this.f12630d = mVar;
        this.f12631e = qVar;
        this.f12632f = kVar;
        this.f12634h = executorService;
        this.f12635i = sVar;
    }

    public final Task a() {
        d();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h hVar = new h(this.f12630d, taskCompletionSource);
        synchronized (this.f12633g) {
            this.f12637l.add(hVar);
        }
        Task task = taskCompletionSource.getTask();
        this.f12634h.execute(new d(this));
        return task;
    }

    public final void b(boolean z9) {
        x6.a c10;
        synchronized (f12626m) {
            f fVar = this.f12627a;
            fVar.a();
            l b10 = l.b(fVar.f2494a);
            try {
                c10 = this.f12629c.c();
                int i10 = c10.f12971c;
                boolean z10 = true;
                if (i10 != 2) {
                    if (i10 != 1) {
                        z10 = false;
                    }
                }
                if (z10) {
                    String e10 = e(c10);
                    x6.c cVar = this.f12629c;
                    a.C0166a aVar = new a.C0166a(c10);
                    aVar.f12977a = e10;
                    aVar.b(3);
                    c10 = aVar.a();
                    cVar.b(c10);
                }
            } finally {
                if (b10 != null) {
                    b10.c();
                }
            }
        }
        if (z9) {
            a.C0166a aVar2 = new a.C0166a(c10);
            aVar2.f12979c = null;
            c10 = aVar2.a();
        }
        g(c10);
        this.f12635i.execute(new c(this, z9));
    }

    public final x6.a c(x6.a aVar) {
        boolean z9;
        boolean z10;
        y6.b f10;
        b.a aVar2;
        x6.a aVar3 = aVar;
        c cVar = this.f12628b;
        f fVar = this.f12627a;
        fVar.a();
        String str = fVar.f2496c.f2506a;
        String str2 = aVar3.f12970b;
        f fVar2 = this.f12627a;
        fVar2.a();
        String str3 = fVar2.f2496c.f2512g;
        String str4 = aVar3.f12973e;
        y6.e eVar = cVar.f13063c;
        synchronized (eVar) {
            if (eVar.f13068c != 0) {
                eVar.f13066a.f12646a.getClass();
                if (System.currentTimeMillis() <= eVar.f13067b) {
                    z9 = false;
                }
            }
            z9 = true;
        }
        if (z9) {
            URL a10 = c.a(String.format("projects/%s/installations/%s/authTokens:generate", new Object[]{str3, str2}));
            int i10 = 0;
            while (i10 <= 1) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c10 = cVar.c(a10, str);
                try {
                    c10.setRequestMethod("POST");
                    c10.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c10.setDoOutput(true);
                    c.h(c10);
                    int responseCode = c10.getResponseCode();
                    cVar.f13063c.a(responseCode);
                    if (responseCode < 200 || responseCode >= 300) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        f10 = c.f(c10);
                    } else {
                        c.b(c10, (String) null, str, str3);
                        if (responseCode != 401) {
                            if (responseCode != 404) {
                                if (responseCode == 429) {
                                    throw new g("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                                } else if (responseCode < 500 || responseCode >= 600) {
                                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                    aVar2 = new b.a();
                                    aVar2.f13057a = 0L;
                                    aVar2.f13058b = 2;
                                    f10 = aVar2.a();
                                } else {
                                    c10.disconnect();
                                    TrafficStats.clearThreadStatsTag();
                                    i10++;
                                }
                            }
                        }
                        aVar2 = new b.a();
                        aVar2.f13057a = 0L;
                        aVar2.f13058b = 3;
                        f10 = aVar2.a();
                    }
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    int b10 = g.b(f10.f13056c);
                    if (b10 == 0) {
                        String str5 = f10.f13054a;
                        long j10 = f10.f13055b;
                        m mVar = this.f12630d;
                        mVar.getClass();
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        mVar.f12646a.getClass();
                        long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                        a.C0166a aVar4 = new a.C0166a(aVar3);
                        aVar4.f12979c = str5;
                        aVar4.f12981e = Long.valueOf(j10);
                        aVar4.f12982f = Long.valueOf(seconds);
                        return aVar4.a();
                    } else if (b10 == 1) {
                        a.C0166a h10 = aVar.h();
                        h10.f12983g = "BAD CONFIG";
                        h10.b(5);
                        return h10.a();
                    } else if (b10 == 2) {
                        synchronized (this) {
                            try {
                                this.f12636j = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        a.C0166a aVar5 = new a.C0166a(aVar3);
                        aVar5.b(2);
                        return aVar5.a();
                    } else {
                        throw new g("Firebase Installations Service is unavailable. Please try again later.");
                    }
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th2) {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            }
            throw new g("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new g("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void d() {
        f fVar = this.f12627a;
        fVar.a();
        o.f("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", fVar.f2496c.f2507b);
        f fVar2 = this.f12627a;
        fVar2.a();
        o.f("Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", fVar2.f2496c.f2512g);
        f fVar3 = this.f12627a;
        fVar3.a();
        o.f("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", fVar3.f2496c.f2506a);
        f fVar4 = this.f12627a;
        fVar4.a();
        String str = fVar4.f2496c.f2507b;
        Pattern pattern = m.f12644c;
        o.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        f fVar5 = this.f12627a;
        fVar5.a();
        o.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", m.f12644c.matcher(fVar5.f2496c.f2506a).matches());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if ("[DEFAULT]".equals(r0.f2495b) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String e(x6.a r6) {
        /*
            r5 = this;
            c6.f r0 = r5.f12627a
            r0.a()
            java.lang.String r0 = r0.f2495b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001e
            c6.f r0 = r5.f12627a
            r0.a()
            java.lang.String r0 = r0.f2495b
            java.lang.String r1 = "[DEFAULT]"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0027
        L_0x001e:
            int r6 = r6.f12971c
            r0 = 1
            if (r6 != r0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r0 != 0) goto L_0x0031
        L_0x0027:
            v6.k r6 = r5.f12632f
            r6.getClass()
            java.lang.String r6 = v6.k.a()
            return r6
        L_0x0031:
            j6.q<x6.b> r6 = r5.f12631e
            java.lang.Object r6 = r6.get()
            x6.b r6 = (x6.b) r6
            android.content.SharedPreferences r0 = r6.f12985a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f12985a     // Catch:{ all -> 0x0064 }
            monitor-enter(r1)     // Catch:{ all -> 0x0064 }
            android.content.SharedPreferences r2 = r6.f12985a     // Catch:{ all -> 0x0061 }
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch:{ all -> 0x0061 }
            monitor-exit(r1)     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x004c
            goto L_0x0050
        L_0x004c:
            java.lang.String r2 = r6.a()     // Catch:{ all -> 0x0064 }
        L_0x0050:
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L_0x0060
            v6.k r6 = r5.f12632f
            r6.getClass()
            java.lang.String r2 = v6.k.a()
        L_0x0060:
            return r2
        L_0x0061:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0061 }
            throw r6     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.e.e(x6.a):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|(1:(2:9|(1:22)(3:92|13|(2:15|16)(1:18)))(0))|19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a1, code lost:
        r14.disconnect();
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a7, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0064 */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d8 A[Catch:{ IOException | AssertionError -> 0x00db, all -> 0x00d8 }, ExcHandler: all (r0v4 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ IOException | AssertionError -> 0x00db, all -> 0x00d8 }]), Splitter:B:41:0x00ca] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final x6.a f(x6.a r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.String r2 = r0.f12970b
            r3 = 0
            r4 = 4
            if (r2 == 0) goto L_0x006b
            int r2 = r2.length()
            r6 = 11
            if (r2 != r6) goto L_0x006b
            j6.q<x6.b> r2 = r1.f12631e
            java.lang.Object r2 = r2.get()
            x6.b r2 = (x6.b) r2
            android.content.SharedPreferences r6 = r2.f12985a
            monitor-enter(r6)
            java.lang.String[] r7 = x6.b.f12984c     // Catch:{ all -> 0x0061 }
            r8 = 0
        L_0x0020:
            if (r8 >= r4) goto L_0x0064
            r9 = r7[r8]     // Catch:{ all -> 0x0061 }
            java.lang.String r10 = r2.f12986b     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r11.<init>()     // Catch:{ all -> 0x0061 }
            java.lang.String r12 = "|T|"
            r11.append(r12)     // Catch:{ all -> 0x0061 }
            r11.append(r10)     // Catch:{ all -> 0x0061 }
            java.lang.String r10 = "|"
            r11.append(r10)     // Catch:{ all -> 0x0061 }
            r11.append(r9)     // Catch:{ all -> 0x0061 }
            java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x0061 }
            android.content.SharedPreferences r10 = r2.f12985a     // Catch:{ all -> 0x0061 }
            java.lang.String r9 = r10.getString(r9, r3)     // Catch:{ all -> 0x0061 }
            if (r9 == 0) goto L_0x0066
            boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x0061 }
            if (r10 != 0) goto L_0x0066
            java.lang.String r2 = "{"
            boolean r2 = r9.startsWith(r2)     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x0063
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0064 }
            r2.<init>(r9)     // Catch:{ JSONException -> 0x0064 }
            java.lang.String r7 = "token"
            java.lang.String r3 = r2.getString(r7)     // Catch:{ JSONException -> 0x0064 }
            goto L_0x0064
        L_0x0061:
            r0 = move-exception
            goto L_0x0069
        L_0x0063:
            r3 = r9
        L_0x0064:
            monitor-exit(r6)     // Catch:{ all -> 0x0061 }
            goto L_0x006b
        L_0x0066:
            int r8 = r8 + 1
            goto L_0x0020
        L_0x0069:
            monitor-exit(r6)     // Catch:{ all -> 0x0061 }
            throw r0
        L_0x006b:
            y6.c r2 = r1.f12628b
            c6.f r6 = r1.f12627a
            r6.a()
            c6.i r6 = r6.f2496c
            java.lang.String r6 = r6.f2506a
            java.lang.String r7 = r0.f12970b
            c6.f r8 = r1.f12627a
            r8.a()
            c6.i r8 = r8.f2496c
            java.lang.String r8 = r8.f2512g
            c6.f r9 = r1.f12627a
            r9.a()
            c6.i r9 = r9.f2496c
            java.lang.String r9 = r9.f2507b
            y6.e r10 = r2.f13063c
            monitor-enter(r10)
            int r11 = r10.f13068c     // Catch:{ all -> 0x01bf }
            r12 = 1
            if (r11 == 0) goto L_0x00a6
            v6.m r11 = r10.f13066a     // Catch:{ all -> 0x01bf }
            y3.a r11 = r11.f12646a     // Catch:{ all -> 0x01bf }
            r11.getClass()     // Catch:{ all -> 0x01bf }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01bf }
            long r4 = r10.f13067b     // Catch:{ all -> 0x01bf }
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            r4 = 0
            goto L_0x00a7
        L_0x00a6:
            r4 = r12
        L_0x00a7:
            monitor-exit(r10)
            java.lang.String r5 = "Firebase Installations Service is unavailable. Please try again later."
            if (r4 == 0) goto L_0x01b9
            java.lang.Object[] r4 = new java.lang.Object[r12]
            r10 = 0
            r4[r10] = r8
            java.lang.String r13 = "projects/%s/installations"
            java.lang.String r4 = java.lang.String.format(r13, r4)
            java.net.URL r4 = y6.c.a(r4)
            r13 = r10
        L_0x00bc:
            if (r13 > r12) goto L_0x01b3
            r14 = 32769(0x8001, float:4.5919E-41)
            android.net.TrafficStats.setThreadStatsTag(r14)
            java.net.HttpURLConnection r14 = r2.c(r4, r6)
            java.lang.String r15 = "POST"
            r14.setRequestMethod(r15)     // Catch:{ IOException | AssertionError -> 0x00db, all -> 0x00d8 }
            r14.setDoOutput(r12)     // Catch:{ IOException | AssertionError -> 0x00db, all -> 0x00d8 }
            if (r3 == 0) goto L_0x00de
            java.lang.String r15 = "x-goog-fis-android-iid-migration-auth"
            r14.addRequestProperty(r15, r3)     // Catch:{ IOException | AssertionError -> 0x00db, all -> 0x00d8 }
            goto L_0x00de
        L_0x00d8:
            r0 = move-exception
            goto L_0x01a1
        L_0x00db:
            r10 = 4
            goto L_0x01a8
        L_0x00de:
            y6.c.g(r14, r7, r9)     // Catch:{ IOException | AssertionError -> 0x00db, all -> 0x00d8 }
            int r15 = r14.getResponseCode()     // Catch:{ IOException | AssertionError -> 0x00db, all -> 0x00d8 }
            y6.e r10 = r2.f13063c     // Catch:{ IOException | AssertionError -> 0x00db, all -> 0x00d8 }
            r10.a(r15)     // Catch:{ IOException | AssertionError -> 0x00db, all -> 0x00d8 }
            r10 = 200(0xc8, float:2.8E-43)
            if (r15 < r10) goto L_0x00f4
            r10 = 300(0x12c, float:4.2E-43)
            if (r15 >= r10) goto L_0x00f4
            r10 = r12
            goto L_0x00f5
        L_0x00f4:
            r10 = 0
        L_0x00f5:
            if (r10 == 0) goto L_0x0102
            y6.a r2 = y6.c.e(r14)     // Catch:{ IOException | AssertionError -> 0x00db, all -> 0x00d8 }
            r14.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            goto L_0x0131
        L_0x0102:
            y6.c.b(r14, r9, r6, r8)     // Catch:{ IOException | AssertionError -> 0x00db, all -> 0x00d8 }
            r10 = 429(0x1ad, float:6.01E-43)
            if (r15 == r10) goto L_0x0198
            r10 = 500(0x1f4, float:7.0E-43)
            if (r15 < r10) goto L_0x0112
            r10 = 600(0x258, float:8.41E-43)
            if (r15 >= r10) goto L_0x0112
            goto L_0x00db
        L_0x0112:
            java.lang.String r10 = "Firebase-Installations"
            java.lang.String r15 = "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase."
            android.util.Log.e(r10, r15)     // Catch:{ IOException | AssertionError -> 0x00db, all -> 0x00d8 }
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            r21 = 2
            y6.a r10 = new y6.a     // Catch:{ IOException | AssertionError -> 0x00db, all -> 0x00d8 }
            r16 = r10
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ IOException | AssertionError -> 0x00db, all -> 0x00d8 }
            r14.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            r2 = r10
        L_0x0131:
            int r3 = r2.f13053e
            int r3 = o.g.b(r3)
            if (r3 == 0) goto L_0x0154
            if (r3 != r12) goto L_0x014c
            x6.a$a r0 = r23.h()
            java.lang.String r2 = "BAD CONFIG"
            r0.f12983g = r2
            r2 = 5
            r0.b(r2)
            x6.a r0 = r0.a()
            return r0
        L_0x014c:
            v6.g r0 = new v6.g
            java.lang.String r2 = "Firebase Installations Service is unavailable. Please try again later."
            r0.<init>(r2)
            throw r0
        L_0x0154:
            java.lang.String r3 = r2.f13050b
            java.lang.String r4 = r2.f13051c
            v6.m r5 = r1.f12630d
            r5.getClass()
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            y3.a r5 = r5.f12646a
            r5.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            long r5 = r6.toSeconds(r7)
            y6.f r7 = r2.f13052d
            java.lang.String r7 = r7.b()
            y6.f r2 = r2.f13052d
            long r8 = r2.c()
            x6.a$a r2 = new x6.a$a
            r2.<init>(r0)
            r2.f12977a = r3
            r10 = 4
            r2.b(r10)
            r2.f12979c = r7
            r2.f12980d = r4
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r2.f12981e = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r2.f12982f = r0
            x6.a r0 = r2.a()
            return r0
        L_0x0198:
            r10 = 4
            v6.g r11 = new v6.g     // Catch:{ IOException | AssertionError -> 0x01a8, all -> 0x00d8 }
            java.lang.String r15 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            r11.<init>(r15)     // Catch:{ IOException | AssertionError -> 0x01a8, all -> 0x00d8 }
            throw r11     // Catch:{ IOException | AssertionError -> 0x01a8, all -> 0x00d8 }
        L_0x01a1:
            r14.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x01a8:
            r14.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            int r13 = r13 + 1
            r10 = 0
            goto L_0x00bc
        L_0x01b3:
            v6.g r0 = new v6.g
            r0.<init>(r5)
            throw r0
        L_0x01b9:
            v6.g r0 = new v6.g
            r0.<init>(r5)
            throw r0
        L_0x01bf:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.e.f(x6.a):x6.a");
    }

    public final void g(x6.a aVar) {
        synchronized (this.f12633g) {
            Iterator it = this.f12637l.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).a(aVar)) {
                    it.remove();
                }
            }
        }
    }

    public final Task<String> getId() {
        String str;
        d();
        synchronized (this) {
            str = this.f12636j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        i iVar = new i(taskCompletionSource);
        synchronized (this.f12633g) {
            this.f12637l.add(iVar);
        }
        Task<String> task = taskCompletionSource.getTask();
        this.f12634h.execute(new m(3, this));
        return task;
    }
}
