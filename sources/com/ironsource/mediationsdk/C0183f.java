package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.C0182e;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.c;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.f  reason: case insensitive filesystem */
public final class C0183f {

    /* renamed from: a  reason: collision with root package name */
    public C0184g f4557a;

    /* renamed from: b  reason: collision with root package name */
    public IronSource.AD_UNIT f4558b;

    /* renamed from: c  reason: collision with root package name */
    public String f4559c;

    /* renamed from: d  reason: collision with root package name */
    public c f4560d;

    /* renamed from: e  reason: collision with root package name */
    public C0181d f4561e;

    /* renamed from: f  reason: collision with root package name */
    public ISBannerSize f4562f;

    /* renamed from: com.ironsource.mediationsdk.f$a */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<C0181d> f4563a;

        /* renamed from: b  reason: collision with root package name */
        public C0182e.a f4564b;

        /* renamed from: c  reason: collision with root package name */
        public int f4565c;

        /* renamed from: d  reason: collision with root package name */
        public String f4566d;

        /* renamed from: e  reason: collision with root package name */
        public long f4567e;

        /* renamed from: f  reason: collision with root package name */
        public int f4568f;

        /* renamed from: g  reason: collision with root package name */
        public String f4569g = "other";

        /* renamed from: h  reason: collision with root package name */
        public int f4570h;

        /* renamed from: i  reason: collision with root package name */
        public String f4571i = "";

        /* renamed from: j  reason: collision with root package name */
        public int f4572j = 0;
        public final URL k;

        /* renamed from: l  reason: collision with root package name */
        public final JSONObject f4573l;

        /* renamed from: m  reason: collision with root package name */
        public final boolean f4574m;

        /* renamed from: n  reason: collision with root package name */
        public final int f4575n;

        /* renamed from: o  reason: collision with root package name */
        public final long f4576o;

        /* renamed from: p  reason: collision with root package name */
        public final boolean f4577p;

        /* renamed from: q  reason: collision with root package name */
        public final boolean f4578q;

        /* renamed from: r  reason: collision with root package name */
        public final int f4579r;

        public a(C0181d dVar, URL url, JSONObject jSONObject, boolean z9, int i10, long j10, boolean z10, boolean z11, int i11) {
            this.f4563a = new WeakReference<>(dVar);
            this.k = url;
            this.f4573l = jSONObject;
            this.f4574m = z9;
            this.f4575n = i10;
            this.f4576o = j10;
            this.f4577p = z10;
            this.f4578q = z11;
            this.f4579r = i11;
        }

        public static String a(HttpURLConnection httpURLConnection) {
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb.toString();
                }
            }
        }

        public void a(boolean z9, C0181d dVar, long j10) {
            if (z9) {
                C0182e.a aVar = this.f4564b;
                dVar.a(aVar.f4494b, aVar.f4493a, aVar.f4495c, aVar.f4496d, aVar.f4497e, this.f4568f + 1, j10, this.f4572j, this.f4571i);
                return;
            }
            dVar.a(this.f4565c, this.f4566d, this.f4568f + 1, this.f4569g, j10);
        }

        /* JADX WARNING: type inference failed for: r0v20, types: [java.net.URLConnection] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x02e0 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x02e1  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00ce A[Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00d7 A[Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00e1 A[Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00ed A[Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00f6 A[Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0105 A[Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x012c A[Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0169 A[Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }] */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x0265  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r17 = this;
                r1 = r17
                java.lang.String r2 = "decompression error"
                java.lang.String r3 = "decryption error"
                java.lang.String r4 = "other"
                long r5 = androidx.fragment.app.v0.b()
                r1.f4567e = r5
                r0 = 0
                r5 = 1
                int r6 = r1.f4572j     // Catch:{ Exception -> 0x02ae }
                r7 = 1015(0x3f7, float:1.422E-42)
                if (r6 != r7) goto L_0x0018
                r6 = r5
                goto L_0x001a
            L_0x0018:
                int r6 = r1.f4579r     // Catch:{ Exception -> 0x02ae }
            L_0x001a:
                r1.f4570h = r6     // Catch:{ Exception -> 0x02ae }
                r1.f4568f = r0
                r6 = 0
            L_0x001f:
                int r8 = r1.f4568f
                int r9 = r1.f4575n
                if (r8 >= r9) goto L_0x02a5
                java.util.Date r8 = new java.util.Date     // Catch:{ SocketTimeoutException -> 0x0275, all -> 0x024f }
                r8.<init>()     // Catch:{ SocketTimeoutException -> 0x0275, all -> 0x024f }
                long r8 = r8.getTime()     // Catch:{ SocketTimeoutException -> 0x0275, all -> 0x024f }
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0275, all -> 0x024f }
                java.lang.String r11 = "Auction Handler: auction trial "
                r10.<init>(r11)     // Catch:{ SocketTimeoutException -> 0x0275, all -> 0x024f }
                int r11 = r1.f4568f     // Catch:{ SocketTimeoutException -> 0x0275, all -> 0x024f }
                int r11 = r11 + r5
                r10.append(r11)     // Catch:{ SocketTimeoutException -> 0x0275, all -> 0x024f }
                java.lang.String r11 = " out of "
                r10.append(r11)     // Catch:{ SocketTimeoutException -> 0x0275, all -> 0x024f }
                int r11 = r1.f4575n     // Catch:{ SocketTimeoutException -> 0x0275, all -> 0x024f }
                r10.append(r11)     // Catch:{ SocketTimeoutException -> 0x0275, all -> 0x024f }
                java.lang.String r11 = " max trials"
                r10.append(r11)     // Catch:{ SocketTimeoutException -> 0x0275, all -> 0x024f }
                java.lang.String r10 = r10.toString()     // Catch:{ SocketTimeoutException -> 0x0275, all -> 0x024f }
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager r11 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ SocketTimeoutException -> 0x0275, all -> 0x024f }
                com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r12 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ SocketTimeoutException -> 0x0275, all -> 0x024f }
                r11.log(r12, r10, r0)     // Catch:{ SocketTimeoutException -> 0x0275, all -> 0x024f }
                com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r10)     // Catch:{ SocketTimeoutException -> 0x0275, all -> 0x024f }
                java.net.URL r0 = r1.k     // Catch:{ SocketTimeoutException -> 0x0275, all -> 0x024f }
                long r10 = r1.f4576o     // Catch:{ SocketTimeoutException -> 0x0275, all -> 0x024f }
                int r10 = (int) r10     // Catch:{ SocketTimeoutException -> 0x0275, all -> 0x024f }
                java.net.URLConnection r0 = r0.openConnection()     // Catch:{ SocketTimeoutException -> 0x0275, all -> 0x024f }
                r11 = r0
                java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11     // Catch:{ SocketTimeoutException -> 0x0275, all -> 0x024f }
                java.lang.String r0 = "POST"
                r11.setRequestMethod(r0)     // Catch:{ SocketTimeoutException -> 0x0275, all -> 0x024f }
                java.lang.String r0 = "Content-Type"
                java.lang.String r12 = "application/json; charset=utf-8"
                r11.setRequestProperty(r0, r12)     // Catch:{ SocketTimeoutException -> 0x0275, all -> 0x024f }
                r11.setReadTimeout(r10)     // Catch:{ SocketTimeoutException -> 0x0275, all -> 0x024f }
                r11.setDoInput(r5)     // Catch:{ SocketTimeoutException -> 0x0275, all -> 0x024f }
                r11.setDoOutput(r5)     // Catch:{ SocketTimeoutException -> 0x0275, all -> 0x024f }
                org.json.JSONObject r6 = r1.f4573l     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                boolean r10 = r1.f4577p     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                java.io.OutputStream r12 = r11.getOutputStream()     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                java.io.OutputStreamWriter r13 = new java.io.OutputStreamWriter     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                r13.<init>(r12, r0)     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                java.io.BufferedWriter r14 = new java.io.BufferedWriter     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                r14.<init>(r13)     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                java.lang.String r15 = ""
                int r0 = r1.f4570h     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                r16 = r15
                r15 = 2
                if (r0 != r15) goto L_0x00c3
                com.ironsource.mediationsdk.utils.e r0 = com.ironsource.mediationsdk.utils.e.a()     // Catch:{ JSONException -> 0x00a1 }
                java.lang.String r15 = r0.d()     // Catch:{ JSONException -> 0x00a1 }
                goto L_0x00c5
            L_0x00a1:
                r0 = move-exception
                java.lang.String r15 = r0.getLocalizedMessage()     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                r1.f4571i = r15     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                r1.f4572j = r7     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                r1.f4570h = r5     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                java.lang.String r15 = "get encrypted session key exception "
                r7.<init>(r15)     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                r7.append(r0)     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                java.lang.String r0 = r7.toString()     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                r5.error(r0)     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
            L_0x00c3:
                r15 = r16
            L_0x00c5:
                java.lang.String r0 = r6.toString()     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                int r5 = r1.f4570h     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                r6 = 2
                if (r5 != r6) goto L_0x00d7
                com.ironsource.mediationsdk.utils.e r5 = com.ironsource.mediationsdk.utils.e.a()     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                java.lang.String r5 = r5.c()     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                goto L_0x00df
            L_0x00d7:
                com.ironsource.mediationsdk.utils.e r5 = com.ironsource.mediationsdk.utils.e.a()     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                java.lang.String r5 = r5.b()     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
            L_0x00df:
                if (r10 == 0) goto L_0x00ed
                com.ironsource.mediationsdk.logger.IronLog r6 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                java.lang.String r7 = "compressing and encrypting auction request"
                r6.verbose(r7)     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.compressAndEncrypt(r5, r0)     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                goto L_0x00f1
            L_0x00ed:
                java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.encode(r5, r0)     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
            L_0x00f1:
                int r5 = r1.f4570h     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                r6 = 2
                if (r5 != r6) goto L_0x0105
                java.lang.String r5 = "{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}"
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                r7 = 0
                r6[r7] = r15     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                r7 = 1
                r6[r7] = r0     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                java.lang.String r0 = java.lang.String.format(r5, r6)     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                goto L_0x0111
            L_0x0105:
                java.lang.String r5 = "{\"request\" : \"%1$s\"}"
                r6 = 1
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                r7 = 0
                r6[r7] = r0     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                java.lang.String r0 = java.lang.String.format(r5, r6)     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
            L_0x0111:
                r14.write(r0)     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                r14.flush()     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                r14.close()     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                r13.close()     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                r12.close()     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                int r0 = r11.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                r5 = 200(0xc8, float:2.8E-43)
                if (r0 == r5) goto L_0x0169
                r5 = 204(0xcc, float:2.86E-43)
                if (r0 == r5) goto L_0x0169
                r5 = 1001(0x3e9, float:1.403E-42)
                r1.f4565c = r5     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                java.lang.String r6 = "Auction response code not valid, error code response from server - "
                r5.<init>(r6)     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                r5.append(r0)     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                java.lang.String r0 = r5.toString()     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                r1.f4566d = r0     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                r5.error(r0)     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                r11.disconnect()     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                int r0 = r1.f4568f     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                int r5 = r1.f4575n     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                int r5 = r5 + -1
                if (r0 >= r5) goto L_0x0166
                long r5 = r1.f4576o     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                java.util.Date r0 = new java.util.Date     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                r0.<init>()     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                long r12 = r0.getTime()     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                long r12 = r12 - r8
                long r5 = r5 - r12
                r7 = 0
                int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r0 <= 0) goto L_0x0166
                android.os.SystemClock.sleep(r5)     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
            L_0x0166:
                r6 = r11
                goto L_0x029a
            L_0x0169:
                java.lang.String r0 = a(r11)     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                boolean r5 = r1.f4574m     // Catch:{ JSONException -> 0x01f3 }
                boolean r6 = r1.f4578q     // Catch:{ JSONException -> 0x01f3 }
                boolean r7 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x01f3 }
                if (r7 != 0) goto L_0x01eb
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01f3 }
                r7.<init>(r0)     // Catch:{ JSONException -> 0x01f3 }
                if (r5 == 0) goto L_0x01d4
                int r0 = r1.f4570h     // Catch:{ JSONException -> 0x01f3 }
                r5 = 2
                if (r0 != r5) goto L_0x018c
                com.ironsource.mediationsdk.utils.e r0 = com.ironsource.mediationsdk.utils.e.a()     // Catch:{ JSONException -> 0x01f3 }
                java.lang.String r0 = r0.c()     // Catch:{ JSONException -> 0x01f3 }
                goto L_0x0194
            L_0x018c:
                com.ironsource.mediationsdk.utils.e r0 = com.ironsource.mediationsdk.utils.e.a()     // Catch:{ JSONException -> 0x01f3 }
                java.lang.String r0 = r0.b()     // Catch:{ JSONException -> 0x01f3 }
            L_0x0194:
                int r5 = r1.f4570h     // Catch:{ JSONException -> 0x01f3 }
                r8 = 2
                if (r5 != r8) goto L_0x019c
                java.lang.String r5 = "ct"
                goto L_0x019e
            L_0x019c:
                java.lang.String r5 = "response"
            L_0x019e:
                java.lang.String r5 = r7.getString(r5)     // Catch:{ JSONException -> 0x01f3 }
                if (r6 == 0) goto L_0x01bd
                com.ironsource.mediationsdk.logger.IronLog r6 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ JSONException -> 0x01f3 }
                java.lang.String r7 = "decrypting and decompressing auction response"
                r6.verbose(r7)     // Catch:{ JSONException -> 0x01f3 }
                java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.decryptAndDecompress(r0, r5)     // Catch:{ JSONException -> 0x01f3 }
                if (r0 == 0) goto L_0x01b7
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01f3 }
                r5.<init>(r0)     // Catch:{ JSONException -> 0x01f3 }
                goto L_0x01cc
            L_0x01b7:
                org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x01f3 }
                r0.<init>(r2)     // Catch:{ JSONException -> 0x01f3 }
                throw r0     // Catch:{ JSONException -> 0x01f3 }
            L_0x01bd:
                java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.decode(r0, r5)     // Catch:{ JSONException -> 0x01f3 }
                boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x01f3 }
                if (r5 != 0) goto L_0x01ce
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01f3 }
                r5.<init>(r0)     // Catch:{ JSONException -> 0x01f3 }
            L_0x01cc:
                r7 = r5
                goto L_0x01d4
            L_0x01ce:
                org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x01f3 }
                r0.<init>(r3)     // Catch:{ JSONException -> 0x01f3 }
                throw r0     // Catch:{ JSONException -> 0x01f3 }
            L_0x01d4:
                com.ironsource.mediationsdk.C0182e.a()     // Catch:{ JSONException -> 0x01f3 }
                com.ironsource.mediationsdk.e$a r0 = com.ironsource.mediationsdk.C0182e.a((org.json.JSONObject) r7)     // Catch:{ JSONException -> 0x01f3 }
                r1.f4564b = r0     // Catch:{ JSONException -> 0x01f3 }
                int r5 = r0.f4498f     // Catch:{ JSONException -> 0x01f3 }
                r1.f4565c = r5     // Catch:{ JSONException -> 0x01f3 }
                java.lang.String r0 = r0.f4499g     // Catch:{ JSONException -> 0x01f3 }
                r1.f4566d = r0     // Catch:{ JSONException -> 0x01f3 }
                r11.disconnect()     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                r0 = 1
                goto L_0x02d6
            L_0x01eb:
                org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x01f3 }
                java.lang.String r5 = "empty response"
                r0.<init>(r5)     // Catch:{ JSONException -> 0x01f3 }
                throw r0     // Catch:{ JSONException -> 0x01f3 }
            L_0x01f3:
                r0 = move-exception
                java.lang.String r5 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                if (r5 == 0) goto L_0x020b
                java.lang.String r5 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                boolean r5 = r5.equalsIgnoreCase(r3)     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                if (r5 == 0) goto L_0x020b
                r5 = 1003(0x3eb, float:1.406E-42)
                r1.f4565c = r5     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                java.lang.String r5 = "Auction decryption error"
                goto L_0x0228
            L_0x020b:
                java.lang.String r5 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                if (r5 == 0) goto L_0x0222
                java.lang.String r5 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                boolean r5 = r5.equalsIgnoreCase(r2)     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                if (r5 == 0) goto L_0x0222
                r5 = 1008(0x3f0, float:1.413E-42)
                r1.f4565c = r5     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                java.lang.String r5 = "Auction decompression error"
                goto L_0x0228
            L_0x0222:
                r5 = 1002(0x3ea, float:1.404E-42)
                r1.f4565c = r5     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                java.lang.String r5 = "Auction parsing error"
            L_0x0228:
                r1.f4566d = r5     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                java.lang.String r5 = "parsing"
                r1.f4569g = r5     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                java.lang.String r7 = "Auction handle response exception "
                r6.<init>(r7)     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                r6.append(r0)     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                java.lang.String r0 = r6.toString()     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                r5.error(r0)     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                r11.disconnect()     // Catch:{ SocketTimeoutException -> 0x024c, all -> 0x0249 }
                goto L_0x02ac
            L_0x0249:
                r0 = move-exception
                r6 = r11
                goto L_0x0250
            L_0x024c:
                r0 = move-exception
                r6 = r11
                goto L_0x0276
            L_0x024f:
                r0 = move-exception
            L_0x0250:
                com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r5 = "getting exception "
                r3.<init>(r5)
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                r2.error(r3)
                if (r6 == 0) goto L_0x0268
                r6.disconnect()
            L_0x0268:
                r2 = 1000(0x3e8, float:1.401E-42)
                r1.f4565c = r2
                java.lang.String r0 = r0.getMessage()
                r1.f4566d = r0
                r1.f4569g = r4
                goto L_0x02ac
            L_0x0275:
                r0 = move-exception
            L_0x0276:
                if (r6 == 0) goto L_0x027b
                r6.disconnect()
            L_0x027b:
                r5 = 1006(0x3ee, float:1.41E-42)
                r1.f4565c = r5
                java.lang.String r5 = "Connection timed out"
                r1.f4566d = r5
                com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                java.lang.String r8 = "Auction socket timeout exception "
                r7.<init>(r8)
                java.lang.String r0 = r0.getMessage()
                r7.append(r0)
                java.lang.String r0 = r7.toString()
                r5.error(r0)
            L_0x029a:
                int r0 = r1.f4568f
                r5 = 1
                int r0 = r0 + r5
                r1.f4568f = r0
                r0 = 0
                r7 = 1015(0x3f7, float:1.422E-42)
                goto L_0x001f
            L_0x02a5:
                int r9 = r9 - r5
                r1.f4568f = r9
                java.lang.String r0 = "trials_fail"
                r1.f4569g = r0
            L_0x02ac:
                r0 = 0
                goto L_0x02d6
            L_0x02ae:
                r0 = move-exception
                r2 = 1007(0x3ef, float:1.411E-42)
                r1.f4565c = r2
                java.lang.String r2 = r0.getMessage()
                r1.f4566d = r2
                r2 = 0
                r1.f4568f = r2
                r1.f4569g = r4
                com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "Auction request exception "
                r4.<init>(r5)
                java.lang.String r0 = r0.getMessage()
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r3.error(r0)
                r0 = r2
            L_0x02d6:
                java.lang.ref.WeakReference<com.ironsource.mediationsdk.d> r2 = r1.f4563a
                java.lang.Object r2 = r2.get()
                com.ironsource.mediationsdk.d r2 = (com.ironsource.mediationsdk.C0181d) r2
                if (r2 != 0) goto L_0x02e1
                return
            L_0x02e1:
                long r3 = androidx.fragment.app.v0.b()
                long r5 = r1.f4567e
                long r3 = r3 - r5
                r1.a(r0, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C0183f.a.run():void");
        }
    }

    @Deprecated
    public C0183f(IronSource.AD_UNIT ad_unit, c cVar, C0181d dVar) {
        this.f4558b = ad_unit;
        this.f4560d = cVar;
        this.f4561e = dVar;
        this.f4559c = IronSourceUtils.getSessionId();
    }

    public C0183f(C0184g gVar) {
        this.f4557a = gVar;
    }

    public static void a(com.ironsource.mediationsdk.adunit.a.a aVar, int i10, com.ironsource.mediationsdk.adunit.a.a aVar2) {
        for (String a10 : aVar.i()) {
            String a11 = C0182e.a().a(a10, i10, aVar, "", "", "");
            C0182e.a();
            C0182e.a("reportLoadSuccess", aVar.a(), a11);
        }
        if (aVar2 != null) {
            for (String a12 : aVar2.i()) {
                String a13 = C0182e.a().a(a12, i10, aVar, "", "102", "");
                C0182e.a();
                C0182e.a("reportLoadSuccess", "GenericNotifications", a13);
            }
        }
    }

    public static void a(com.ironsource.mediationsdk.adunit.a.a aVar, int i10, com.ironsource.mediationsdk.adunit.a.a aVar2, String str) {
        for (String a10 : aVar.g()) {
            String a11 = C0182e.a().a(a10, i10, aVar, "", "", str);
            C0182e.a();
            C0182e.a("reportImpression", aVar.a(), a11);
        }
        if (aVar2 != null) {
            for (String a12 : aVar2.g()) {
                String a13 = C0182e.a().a(a12, i10, aVar, "", "102", str);
                C0182e.a();
                C0182e.a("reportImpression", "GenericNotifications", a13);
            }
        }
    }

    public static void a(ArrayList<String> arrayList, ConcurrentHashMap<String, com.ironsource.mediationsdk.adunit.a.a> concurrentHashMap, int i10, com.ironsource.mediationsdk.adunit.a.a aVar, com.ironsource.mediationsdk.adunit.a.a aVar2) {
        int f10 = aVar2.f();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!next.equals(aVar2.a())) {
                com.ironsource.mediationsdk.adunit.a.a aVar3 = concurrentHashMap.get(next);
                int f11 = aVar3.f();
                String d10 = aVar3.d();
                String str = f11 < f10 ? IronSourceConstants.BOOLEAN_TRUE_AS_STRING : "102";
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("instance=" + aVar3.a() + ", instancePriceOrder= " + f11 + ", loseReasonCode=" + str + ", winnerInstance=" + aVar2.a() + ", winnerInstancePriceOrder=" + f10);
                for (String a10 : aVar3.h()) {
                    String a11 = C0182e.a().a(a10, i10, aVar2, d10, str, "");
                    C0182e.a();
                    C0182e.a("reportAuctionLose", aVar3.a(), a11);
                }
            } else {
                ConcurrentHashMap<String, com.ironsource.mediationsdk.adunit.a.a> concurrentHashMap2 = concurrentHashMap;
            }
        }
        if (aVar != null) {
            for (String a12 : aVar.h()) {
                String a13 = C0182e.a().a(a12, i10, aVar2, "", "102", "");
                C0182e.a();
                C0182e.a("reportAuctionLose", "GenericNotifications", a13);
            }
        }
    }

    public final JSONObject a(Context context, Map<String, Object> map, List<String> list, h hVar, int i10, boolean z9, IronSourceSegment ironSourceSegment) {
        boolean z10 = z9;
        IronSourceSegment ironSourceSegment2 = ironSourceSegment;
        new JSONObject();
        if (z.a().f5053f.f5019c.f().c().f5035d) {
            C0187k kVar = new C0187k(this.f4558b);
            kVar.a(map);
            kVar.a(list);
            kVar.a(hVar);
            kVar.a(i10);
            kVar.a(this.f4562f);
            kVar.a(ironSourceSegment2);
            kVar.b(z10);
            return C0182e.a().c(kVar);
        }
        Map<String, Object> map2 = map;
        List<String> list2 = list;
        h hVar2 = hVar;
        int i11 = i10;
        JSONObject b10 = C0182e.a().b(context, map, list, hVar, i10, this.f4559c, this.f4560d, this.f4562f, ironSourceSegment2 != null ? ironSourceSegment.toJson() : null, false, false);
        b10.put("adUnit", this.f4558b.toString());
        b10.put("doNotEncryptResponse", z10 ? "false" : "true");
        return b10;
    }

    public final void a(Context context, C0187k kVar, C0181d dVar) {
        try {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f4557a.a(context, kVar, dVar));
        } catch (Exception e10) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("execute auction exception " + e10.getMessage());
            if (dVar != null) {
                dVar.a(1000, e10.getMessage(), 0, "other", 0);
            }
        }
    }

    @Deprecated
    public final void a(Context context, Map<String, Object> map, List<String> list, h hVar, int i10, IronSourceSegment ironSourceSegment) {
        try {
            boolean isEncryptedResponse = IronSourceUtils.isEncryptedResponse();
            JSONObject a10 = a(context, map, list, hVar, i10, isEncryptedResponse, ironSourceSegment);
            C0181d dVar = this.f4561e;
            URL url = new URL(this.f4560d.a(false));
            c cVar = this.f4560d;
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(dVar, url, a10, isEncryptedResponse, cVar.f4977c, cVar.f4980f, cVar.f4985l, cVar.f4986m, cVar.f4987n));
        } catch (Exception e10) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("execute auction exception " + e10.getMessage());
            this.f4561e.a(1000, e10.getMessage(), 0, "other", 0);
        }
    }

    @Deprecated
    public final void a(Context context, Map<String, Object> map, List<String> list, h hVar, int i10, IronSourceSegment ironSourceSegment, ISBannerSize iSBannerSize) {
        this.f4562f = iSBannerSize;
        a(context, map, list, hVar, i10, ironSourceSegment);
    }

    public final void a(CopyOnWriteArrayList<O> copyOnWriteArrayList, ConcurrentHashMap<String, com.ironsource.mediationsdk.adunit.a.a> concurrentHashMap, int i10, com.ironsource.mediationsdk.adunit.a.a aVar, com.ironsource.mediationsdk.adunit.a.a aVar2) {
        ArrayList arrayList = new ArrayList();
        Iterator<O> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().n());
        }
        a((ArrayList<String>) arrayList, concurrentHashMap, i10, aVar, aVar2);
    }
}
