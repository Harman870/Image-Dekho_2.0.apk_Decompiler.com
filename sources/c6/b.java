package c6;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import b6.x;
import com.bumptech.glide.manager.g;
import com.bumptech.glide.manager.h;
import com.bumptech.glide.manager.i;
import com.google.firebase.auth.FirebaseAuthRegistrar;
import com.imgdkh.app.R;
import g7.m;
import h0.m0;
import h6.r;
import i4.c9;
import i4.e9;
import i4.f9;
import i4.i4;
import i4.k4;
import i4.md;
import i4.z3;
import j4.ga;
import j4.x4;
import j6.d;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import n4.u2;
import n4.w2;
import o1.k;
import q1.w;
import r3.o;
import y.a;
import y3.a;
import z5.c;
import z5.t;
import z7.e;

public class b implements k, g, m, m0, d, u2, h, md, x {

    /* renamed from: a  reason: collision with root package name */
    public static final b f2469a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final e f2470b = new e("REMOVED_TASK", 1);

    /* renamed from: c  reason: collision with root package name */
    public static final e f2471c = new e("CLOSED_EMPTY", 1);

    /* renamed from: d  reason: collision with root package name */
    public static Field f2472d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f2473e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ b f2474f = new b();

    /* renamed from: g  reason: collision with root package name */
    public static final e f2475g = new e("CONDITION_FALSE", 1);

    /* renamed from: h  reason: collision with root package name */
    public static final a f2476h = new a(0);

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f2477i = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f2478j = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    public static final int[] k = {67108863, 33554431};

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f2479l = {26, 25};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f2480m = {R.attr.overlay_height, R.attr.overlay_image, R.attr.overlay_width, R.attr.tile_mode};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f2481n = {R.attr.fromDeg, R.attr.pivotX, R.attr.pivotY, R.attr.rollType, R.attr.toDeg};

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f2482o = {R.attr.SpinKit_Color, R.attr.SpinKit_Style};

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ b f2483p = new b();

    /* renamed from: q  reason: collision with root package name */
    public static b f2484q;

    /* renamed from: r  reason: collision with root package name */
    public static final float[][] f2485r = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: s  reason: collision with root package name */
    public static final float[][] f2486s = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: t  reason: collision with root package name */
    public static final float[] f2487t = {95.047f, 100.0f, 108.883f};
    public static final float[][] u = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ b f2488v = new b();

    public /* synthetic */ b() {
    }

    public static float A() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static f9 B(k4 k4Var) {
        z3 z3Var;
        ArrayList arrayList = new ArrayList();
        c9 c9Var = c9.f7230b;
        c9 c9Var2 = (c9) k4Var.f7439d;
        Iterator it = ((ConcurrentMap) k4Var.f7436a).values().iterator();
        while (true) {
            Integer num = null;
            if (it.hasNext()) {
                Iterator it2 = ((List) it.next()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        i4 i4Var = (i4) it2.next();
                        int i10 = i4Var.f7384f - 2;
                        if (i10 == 1) {
                            z3Var = z3.f7834b;
                        } else if (i10 == 2) {
                            z3Var = z3.f7835c;
                        } else if (i10 == 3) {
                            z3Var = z3.f7836d;
                        } else {
                            throw new IllegalStateException("Unknown key status");
                        }
                        arrayList.add(new e9(z3Var, i4Var.f7382d, i4Var.f7383e.n()));
                    }
                }
            } else {
                i4 i4Var2 = (i4) k4Var.f7437b;
                if (i4Var2 != null) {
                    num = Integer.valueOf(i4Var2.f7382d);
                }
                if (num != null) {
                    try {
                        int intValue = num.intValue();
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            int i12 = i11 + 1;
                            if (((e9) arrayList.get(i11)).f7287b != intValue) {
                                i11 = i12;
                            }
                        }
                        throw new GeneralSecurityException("primary key ID is not present in entries");
                    } catch (GeneralSecurityException e10) {
                        throw new IllegalStateException(e10);
                    }
                }
                return new f9(c9Var2, Collections.unmodifiableList(arrayList), num);
            }
        }
    }

    public static ExecutorService C() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        throw r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0067 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void D(java.lang.String r4, i4.wf r5, i4.fg r6, java.lang.Class r7, i4.ag r8) {
        /*
            r3.o.h(r5)     // Catch:{ SocketTimeoutException -> 0x0070, UnknownHostException -> 0x006d, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            java.net.URL r0 = new java.net.URL     // Catch:{ SocketTimeoutException -> 0x0070, UnknownHostException -> 0x006d, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            r0.<init>(r4)     // Catch:{ SocketTimeoutException -> 0x0070, UnknownHostException -> 0x006d, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            java.net.URLConnection r4 = r0.openConnection()     // Catch:{ SocketTimeoutException -> 0x0070, UnknownHostException -> 0x006d, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ SocketTimeoutException -> 0x0070, UnknownHostException -> 0x006d, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            r0 = 1
            r4.setDoOutput(r0)     // Catch:{ SocketTimeoutException -> 0x0070, UnknownHostException -> 0x006d, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            java.lang.String r5 = r5.zza()     // Catch:{ SocketTimeoutException -> 0x0070, UnknownHostException -> 0x006d, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()     // Catch:{ SocketTimeoutException -> 0x0070, UnknownHostException -> 0x006d, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            byte[] r5 = r5.getBytes(r1)     // Catch:{ SocketTimeoutException -> 0x0070, UnknownHostException -> 0x006d, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            int r1 = r5.length     // Catch:{ SocketTimeoutException -> 0x0070, UnknownHostException -> 0x006d, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            r4.setFixedLengthStreamingMode(r1)     // Catch:{ SocketTimeoutException -> 0x0070, UnknownHostException -> 0x006d, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "application/json"
            r4.setRequestProperty(r2, r3)     // Catch:{ SocketTimeoutException -> 0x0070, UnknownHostException -> 0x006d, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            r2 = 60000(0xea60, float:8.4078E-41)
            r4.setConnectTimeout(r2)     // Catch:{ SocketTimeoutException -> 0x0070, UnknownHostException -> 0x006d, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            r8.a(r4)     // Catch:{ SocketTimeoutException -> 0x0070, UnknownHostException -> 0x006d, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            java.io.BufferedOutputStream r8 = new java.io.BufferedOutputStream     // Catch:{ SocketTimeoutException -> 0x0070, UnknownHostException -> 0x006d, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            java.io.OutputStream r2 = r4.getOutputStream()     // Catch:{ SocketTimeoutException -> 0x0070, UnknownHostException -> 0x006d, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            r8.<init>(r2, r1)     // Catch:{ SocketTimeoutException -> 0x0070, UnknownHostException -> 0x006d, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            r2 = 0
            r8.write(r5, r2, r1)     // Catch:{ all -> 0x004c }
            r8.close()     // Catch:{ SocketTimeoutException -> 0x0070, UnknownHostException -> 0x006d, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            H(r4, r6, r7)     // Catch:{ SocketTimeoutException -> 0x0070, UnknownHostException -> 0x006d, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
            return
        L_0x0046:
            r4 = move-exception
            goto L_0x0068
        L_0x0048:
            r4 = move-exception
            goto L_0x0068
        L_0x004a:
            r4 = move-exception
            goto L_0x0068
        L_0x004c:
            r4 = move-exception
            r8.close()     // Catch:{ all -> 0x0051 }
            goto L_0x0067
        L_0x0051:
            r5 = move-exception
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x0067 }
            java.lang.Class<java.lang.Throwable> r8 = java.lang.Throwable.class
            r7[r2] = r8     // Catch:{ Exception -> 0x0067 }
            java.lang.Class<java.lang.Throwable> r8 = java.lang.Throwable.class
            java.lang.String r1 = "addSuppressed"
            java.lang.reflect.Method r7 = r8.getDeclaredMethod(r1, r7)     // Catch:{ Exception -> 0x0067 }
            java.lang.Object[] r8 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0067 }
            r8[r2] = r5     // Catch:{ Exception -> 0x0067 }
            r7.invoke(r4, r8)     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            throw r4     // Catch:{ SocketTimeoutException -> 0x0070, UnknownHostException -> 0x006d, IOException -> 0x004a, JSONException -> 0x0048, NullPointerException -> 0x0046 }
        L_0x0068:
            java.lang.String r4 = r4.getMessage()
            goto L_0x0072
        L_0x006d:
            java.lang.String r4 = "<<Network Error>>"
            goto L_0x0072
        L_0x0070:
            java.lang.String r4 = "TIMEOUT"
        L_0x0072:
            r6.zza(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.b.D(java.lang.String, i4.wf, i4.fg, java.lang.Class, i4.ag):void");
    }

    public static final void E(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        if (i10 < 0 || byteBuffer2.remaining() < i10 || byteBuffer3.remaining() < i10 || byteBuffer.remaining() < i10) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static void F(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        I(jArr4, jArr2, jArr3);
        N(jArr4);
        L(jArr4);
        System.arraycopy(jArr4, 0, jArr, 0, 10);
    }

    public static ArrayList G(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i4.a aVar = (i4.a) it.next();
            r rVar = null;
            if (aVar != null && !TextUtils.isEmpty(aVar.f7175a)) {
                String str = aVar.f7176b;
                String str2 = aVar.f7177c;
                long j10 = aVar.f7178d;
                String str3 = aVar.f7175a;
                o.e(str3);
                rVar = new r(j10, str, str2, str3);
            }
            if (rVar != null) {
                arrayList.add(rVar);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        throw r12;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0080 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void H(java.net.HttpURLConnection r10, i4.fg r11, java.lang.Class r12) {
        /*
            int r0 = r10.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x008c, IOException -> 0x0056, bf -> 0x0054 }
            r1 = 300(0x12c, float:4.2E-43)
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 1
            r4 = 0
            if (r0 < r2) goto L_0x0010
            if (r0 >= r1) goto L_0x0010
            r5 = r3
            goto L_0x0011
        L_0x0010:
            r5 = r4
        L_0x0011:
            if (r5 == 0) goto L_0x0018
            java.io.InputStream r5 = r10.getInputStream()     // Catch:{ SocketTimeoutException -> 0x008c, IOException -> 0x0056, bf -> 0x0054 }
            goto L_0x001c
        L_0x0018:
            java.io.InputStream r5 = r10.getErrorStream()     // Catch:{ SocketTimeoutException -> 0x008c, IOException -> 0x0056, bf -> 0x0054 }
        L_0x001c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x008c, IOException -> 0x0056, bf -> 0x0054 }
            r6.<init>()     // Catch:{ SocketTimeoutException -> 0x008c, IOException -> 0x0056, bf -> 0x0054 }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ SocketTimeoutException -> 0x008c, IOException -> 0x0056, bf -> 0x0054 }
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ SocketTimeoutException -> 0x008c, IOException -> 0x0056, bf -> 0x0054 }
            java.lang.String r9 = "UTF-8"
            r8.<init>(r5, r9)     // Catch:{ SocketTimeoutException -> 0x008c, IOException -> 0x0056, bf -> 0x0054 }
            r7.<init>(r8)     // Catch:{ SocketTimeoutException -> 0x008c, IOException -> 0x0056, bf -> 0x0054 }
        L_0x002d:
            java.lang.String r5 = r7.readLine()     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x0037
            r6.append(r5)     // Catch:{ all -> 0x0065 }
            goto L_0x002d
        L_0x0037:
            r7.close()     // Catch:{ SocketTimeoutException -> 0x008c, IOException -> 0x0056, bf -> 0x0054 }
            java.lang.String r5 = r6.toString()     // Catch:{ SocketTimeoutException -> 0x008c, IOException -> 0x0056, bf -> 0x0054 }
            if (r0 < r2) goto L_0x0043
            if (r0 >= r1) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r3 = r4
        L_0x0044:
            if (r3 != 0) goto L_0x0058
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            java.lang.Object r12 = i4.vf.a(r5, r12)     // Catch:{ SocketTimeoutException -> 0x008c, IOException -> 0x0056, bf -> 0x0054 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ SocketTimeoutException -> 0x008c, IOException -> 0x0056, bf -> 0x0054 }
            r11.zza(r12)     // Catch:{ SocketTimeoutException -> 0x008c, IOException -> 0x0056, bf -> 0x0054 }
            goto L_0x0061
        L_0x0052:
            r11 = move-exception
            goto L_0x0095
        L_0x0054:
            r12 = move-exception
            goto L_0x0081
        L_0x0056:
            r12 = move-exception
            goto L_0x0081
        L_0x0058:
            java.lang.Object r12 = i4.vf.a(r5, r12)     // Catch:{ SocketTimeoutException -> 0x008c, IOException -> 0x0056, bf -> 0x0054 }
            i4.xf r12 = (i4.xf) r12     // Catch:{ SocketTimeoutException -> 0x008c, IOException -> 0x0056, bf -> 0x0054 }
            r11.c(r12)     // Catch:{ SocketTimeoutException -> 0x008c, IOException -> 0x0056, bf -> 0x0054 }
        L_0x0061:
            r10.disconnect()
            return
        L_0x0065:
            r12 = move-exception
            r7.close()     // Catch:{ all -> 0x006a }
            goto L_0x0080
        L_0x006a:
            r0 = move-exception
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0080 }
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            r1[r4] = r2     // Catch:{ Exception -> 0x0080 }
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r1 = r2.getDeclaredMethod(r5, r1)     // Catch:{ Exception -> 0x0080 }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0080 }
            r2[r4] = r0     // Catch:{ Exception -> 0x0080 }
            r1.invoke(r12, r2)     // Catch:{ Exception -> 0x0080 }
        L_0x0080:
            throw r12     // Catch:{ SocketTimeoutException -> 0x008c, IOException -> 0x0056, bf -> 0x0054 }
        L_0x0081:
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x0052 }
            r11.zza(r12)     // Catch:{ all -> 0x0052 }
            r10.disconnect()
            return
        L_0x008c:
            java.lang.String r12 = "TIMEOUT"
            r11.zza(r12)     // Catch:{ all -> 0x0052 }
            r10.disconnect()
            return
        L_0x0095:
            r10.disconnect()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.b.H(java.net.HttpURLConnection, i4.fg, java.lang.Class):void");
    }

    /* JADX WARNING: type inference failed for: r42v0, types: [long[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void I(long[] r42, long[] r43, long[] r44) {
        /*
            r0 = 0
            r1 = r43[r0]
            r3 = r44[r0]
            long r1 = r1 * r3
            r42[r0] = r1
            r1 = r43[r0]
            r3 = 1
            r4 = r44[r3]
            long r4 = r4 * r1
            r6 = r43[r3]
            r8 = r44[r0]
            long r6 = r6 * r8
            long r6 = r6 + r4
            r42[r3] = r6
            r4 = r43[r3]
            long r6 = r4 + r4
            r10 = r44[r3]
            long r6 = r6 * r10
            r0 = 2
            r12 = r44[r0]
            long r12 = r12 * r1
            long r12 = r12 + r6
            r6 = r43[r0]
            long r6 = r6 * r8
            long r6 = r6 + r12
            r42[r0] = r6
            r6 = r44[r0]
            long r12 = r4 * r6
            r14 = r43[r0]
            long r16 = r14 * r10
            long r16 = r16 + r12
            r0 = 3
            r12 = r44[r0]
            long r12 = r12 * r1
            long r12 = r12 + r16
            r16 = r43[r0]
            long r16 = r16 * r8
            long r16 = r16 + r12
            r42[r0] = r16
            r12 = r44[r0]
            long r16 = r4 * r12
            r18 = r43[r0]
            long r20 = r18 * r10
            long r20 = r20 + r16
            long r16 = r14 * r6
            long r20 = r20 + r20
            long r20 = r20 + r16
            r0 = 4
            r16 = r44[r0]
            long r16 = r16 * r1
            long r16 = r16 + r20
            r20 = r43[r0]
            long r20 = r20 * r8
            long r20 = r20 + r16
            r42[r0] = r20
            long r16 = r14 * r12
            long r20 = r18 * r6
            long r20 = r20 + r16
            r16 = r44[r0]
            long r22 = r4 * r16
            long r22 = r22 + r20
            r20 = r43[r0]
            long r24 = r20 * r10
            long r24 = r24 + r22
            r0 = 5
            r22 = r44[r0]
            long r22 = r22 * r1
            long r22 = r22 + r24
            r24 = r43[r0]
            long r24 = r24 * r8
            long r24 = r24 + r22
            r42[r0] = r24
            long r22 = r18 * r12
            r24 = r44[r0]
            long r26 = r4 * r24
            long r26 = r26 + r22
            r22 = r43[r0]
            long r28 = r22 * r10
            long r28 = r28 + r26
            long r28 = r28 + r28
            long r26 = r14 * r16
            long r26 = r26 + r28
            long r28 = r20 * r6
            long r28 = r28 + r26
            r0 = 6
            r26 = r44[r0]
            long r26 = r26 * r1
            long r26 = r26 + r28
            r28 = r43[r0]
            long r28 = r28 * r8
            long r28 = r28 + r26
            r42[r0] = r28
            long r26 = r18 * r16
            long r28 = r20 * r12
            long r28 = r28 + r26
            long r26 = r14 * r24
            long r26 = r26 + r28
            long r28 = r22 * r6
            long r28 = r28 + r26
            r26 = r44[r0]
            long r30 = r4 * r26
            long r30 = r30 + r28
            r28 = r43[r0]
            long r32 = r28 * r10
            long r32 = r32 + r30
            r0 = 7
            r30 = r44[r0]
            long r30 = r30 * r1
            long r30 = r30 + r32
            r32 = r43[r0]
            long r32 = r32 * r8
            long r32 = r32 + r30
            r42[r0] = r32
            long r30 = r18 * r24
            long r32 = r22 * r12
            long r32 = r32 + r30
            r30 = r44[r0]
            long r34 = r4 * r30
            long r34 = r34 + r32
            r32 = r43[r0]
            long r36 = r32 * r10
            long r36 = r36 + r34
            long r34 = r20 * r16
            long r36 = r36 + r36
            long r36 = r36 + r34
            long r34 = r14 * r26
            long r34 = r34 + r36
            long r36 = r28 * r6
            long r36 = r36 + r34
            r0 = 8
            r34 = r44[r0]
            long r34 = r34 * r1
            long r34 = r34 + r36
            r36 = r43[r0]
            long r36 = r36 * r8
            long r36 = r36 + r34
            r42[r0] = r36
            long r34 = r20 * r24
            long r36 = r22 * r16
            long r36 = r36 + r34
            long r34 = r18 * r26
            long r34 = r34 + r36
            long r36 = r28 * r12
            long r36 = r36 + r34
            long r34 = r14 * r30
            long r34 = r34 + r36
            long r36 = r32 * r6
            long r36 = r36 + r34
            r34 = r44[r0]
            long r38 = r4 * r34
            long r38 = r38 + r36
            r36 = r43[r0]
            long r40 = r36 * r10
            long r40 = r40 + r38
            r0 = 9
            r38 = r44[r0]
            long r1 = r1 * r38
            long r1 = r1 + r40
            r38 = r43[r0]
            long r38 = r38 * r8
            long r38 = r38 + r1
            r42[r0] = r38
            long r1 = r22 * r24
            long r8 = r18 * r30
            long r8 = r8 + r1
            long r1 = r32 * r12
            long r1 = r1 + r8
            r8 = r44[r0]
            long r4 = r4 * r8
            long r4 = r4 + r1
            r0 = r43[r0]
            long r10 = r10 * r0
            long r10 = r10 + r4
            long r10 = r10 + r10
            long r2 = r20 * r26
            long r2 = r2 + r10
            long r4 = r28 * r16
            long r4 = r4 + r2
            long r2 = r14 * r34
            long r2 = r2 + r4
            long r4 = r36 * r6
            long r4 = r4 + r2
            r2 = 10
            r42[r2] = r4
            long r2 = r22 * r26
            long r4 = r28 * r24
            long r4 = r4 + r2
            long r2 = r20 * r30
            long r2 = r2 + r4
            long r4 = r32 * r16
            long r4 = r4 + r2
            long r2 = r18 * r34
            long r2 = r2 + r4
            long r4 = r36 * r12
            long r4 = r4 + r2
            long r14 = r14 * r8
            long r14 = r14 + r4
            long r6 = r6 * r0
            long r6 = r6 + r14
            r2 = 11
            r42[r2] = r6
            long r2 = r22 * r30
            long r4 = r32 * r24
            long r4 = r4 + r2
            long r18 = r18 * r8
            long r18 = r18 + r4
            long r12 = r12 * r0
            long r12 = r12 + r18
            long r2 = r28 * r26
            long r12 = r12 + r12
            long r12 = r12 + r2
            long r2 = r20 * r34
            long r2 = r2 + r12
            long r4 = r36 * r16
            long r4 = r4 + r2
            r2 = 12
            r42[r2] = r4
            long r2 = r28 * r30
            long r4 = r32 * r26
            long r4 = r4 + r2
            long r2 = r22 * r34
            long r2 = r2 + r4
            long r4 = r36 * r24
            long r4 = r4 + r2
            long r20 = r20 * r8
            long r20 = r20 + r4
            long r16 = r16 * r0
            long r16 = r16 + r20
            r2 = 13
            r42[r2] = r16
            long r2 = r32 * r30
            long r22 = r22 * r8
            long r22 = r22 + r2
            long r24 = r24 * r0
            long r24 = r24 + r22
            long r24 = r24 + r24
            long r2 = r28 * r34
            long r2 = r2 + r24
            long r4 = r36 * r26
            long r4 = r4 + r2
            r2 = 14
            r42[r2] = r4
            long r2 = r32 * r34
            long r4 = r36 * r30
            long r4 = r4 + r2
            long r28 = r28 * r8
            long r28 = r28 + r4
            long r26 = r26 * r0
            long r26 = r26 + r28
            r2 = 15
            r42[r2] = r26
            long r2 = r36 * r34
            long r32 = r32 * r8
            long r30 = r30 * r0
            long r30 = r30 + r32
            long r30 = r30 + r30
            long r30 = r30 + r2
            r2 = 16
            r42[r2] = r30
            long r36 = r36 * r8
            long r34 = r34 * r0
            long r34 = r34 + r36
            r2 = 17
            r42[r2] = r34
            long r0 = r0 + r0
            long r0 = r0 * r8
            r2 = 18
            r42[r2] = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.b.I(long[], long[], long[]):void");
    }

    public static final boolean J(byte[] bArr, byte[] bArr2) {
        if (!(bArr == null || bArr2 == null || bArr.length != bArr2.length)) {
            byte b10 = 0;
            for (int i10 = 0; i10 < bArr.length; i10++) {
                b10 |= bArr[i10] ^ bArr2[i10];
            }
            if (b10 == 0) {
                return true;
            }
        }
        return false;
    }

    public static byte[] K(byte[]... bArr) {
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int length2 = bArr[i10].length;
            if (i11 <= Integer.MAX_VALUE - length2) {
                i11 += length2;
                i10++;
            } else {
                throw new GeneralSecurityException("exceeded size limit");
            }
        }
        byte[] bArr2 = new byte[i11];
        int i12 = 0;
        for (byte[] bArr3 : bArr) {
            int length3 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i12, length3);
            i12 += length3;
        }
        return bArr2;
    }

    public static void L(long[] jArr) {
        jArr[10] = 0;
        int i10 = 0;
        while (i10 < 10) {
            long j10 = jArr[i10];
            long j11 = j10 / 67108864;
            jArr[i10] = j10 - (j11 << 26);
            int i11 = i10 + 1;
            long j12 = jArr[i11] + j11;
            jArr[i11] = j12;
            long j13 = j12 / 33554432;
            jArr[i11] = j12 - (j13 << 25);
            i10 += 2;
            jArr[i10] = jArr[i10] + j13;
        }
        long j14 = jArr[0];
        long j15 = jArr[10];
        long j16 = j14 + (j15 << 4);
        jArr[0] = j16;
        long j17 = j15 + j15 + j16;
        jArr[0] = j17;
        long j18 = j17 + j15;
        jArr[0] = j18;
        jArr[10] = 0;
        long j19 = j18 / 67108864;
        jArr[0] = j18 - (j19 << 26);
        jArr[1] = jArr[1] + j19;
    }

    public static final byte[] M(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length == bArr2.length) {
            return P(bArr, 0, bArr2, 0, length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static void N(long[] jArr) {
        long j10 = jArr[8];
        long j11 = jArr[18];
        long j12 = j10 + (j11 << 4);
        jArr[8] = j12;
        long j13 = j11 + j11 + j12;
        jArr[8] = j13;
        jArr[8] = j13 + j11;
        long j14 = jArr[7];
        long j15 = jArr[17];
        long j16 = j14 + (j15 << 4);
        jArr[7] = j16;
        long j17 = j15 + j15 + j16;
        jArr[7] = j17;
        jArr[7] = j17 + j15;
        long j18 = jArr[6];
        long j19 = jArr[16];
        long j20 = j18 + (j19 << 4);
        jArr[6] = j20;
        long j21 = j19 + j19 + j20;
        jArr[6] = j21;
        jArr[6] = j21 + j19;
        long j22 = jArr[5];
        long j23 = jArr[15];
        long j24 = j22 + (j23 << 4);
        jArr[5] = j24;
        long j25 = j23 + j23 + j24;
        jArr[5] = j25;
        jArr[5] = j25 + j23;
        long j26 = jArr[4];
        long j27 = jArr[14];
        long j28 = j26 + (j27 << 4);
        jArr[4] = j28;
        long j29 = j27 + j27 + j28;
        jArr[4] = j29;
        jArr[4] = j29 + j27;
        long j30 = jArr[3];
        long j31 = jArr[13];
        long j32 = j30 + (j31 << 4);
        jArr[3] = j32;
        long j33 = j31 + j31 + j32;
        jArr[3] = j33;
        jArr[3] = j33 + j31;
        long j34 = jArr[2];
        long j35 = jArr[12];
        long j36 = j34 + (j35 << 4);
        jArr[2] = j36;
        long j37 = j35 + j35 + j36;
        jArr[2] = j37;
        jArr[2] = j37 + j35;
        long j38 = jArr[1];
        long j39 = jArr[11];
        long j40 = j38 + (j39 << 4);
        jArr[1] = j40;
        long j41 = j39 + j39 + j40;
        jArr[1] = j41;
        jArr[1] = j41 + j39;
        long j42 = jArr[0];
        long j43 = jArr[10];
        long j44 = j42 + (j43 << 4);
        jArr[0] = j44;
        long j45 = j43 + j43 + j44;
        jArr[0] = j45;
        jArr[0] = j45 + j43;
    }

    public static boolean O(byte b10) {
        return b10 > -65;
    }

    public static final byte[] P(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        if (bArr.length - i12 < i10 || bArr2.length - i12 < i11) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            bArr3[i13] = (byte) (bArr[i13 + i10] ^ bArr2[i13 + i11]);
        }
        return bArr3;
    }

    public static void Q(long[] jArr, long[] jArr2) {
        long j10 = jArr2[0];
        long j11 = jArr2[0];
        long j12 = j11 + j11;
        long j13 = jArr2[1];
        long j14 = (jArr2[2] * j11) + (j13 * j13);
        long j15 = jArr2[2];
        long j16 = (jArr2[3] * j11) + (j13 * j15);
        long j17 = jArr2[3];
        long j18 = j13 * 4 * j17;
        long j19 = j12 * jArr2[4];
        long j20 = jArr2[4];
        long j21 = jArr2[5] * j11;
        long j22 = j21 + (j13 * j20) + (j15 * j17);
        long j23 = jArr2[6] * j11;
        long j24 = j23 + (j15 * j20) + (j17 * j17);
        long j25 = jArr2[5];
        long j26 = ((j13 + j13) * j25) + j24;
        long j27 = jArr2[6];
        long j28 = jArr2[7] * j11;
        long j29 = j28 + (j13 * j27) + (j15 * j25) + (j17 * j20);
        long j30 = jArr2[8];
        long j31 = jArr2[7];
        long j32 = (j17 * j25) + (j13 * j31);
        long j33 = j32 + j32;
        long j34 = j33 + (j30 * j11) + (j15 * j27);
        long j35 = j34 + j34;
        long j36 = (j15 * j31) + (j17 * j27) + (j20 * j25);
        long j37 = jArr2[8];
        long j38 = (j11 * jArr2[9]) + (j13 * j37) + j36;
        long j39 = jArr2[9];
        long j40 = (j13 * j39) + (j17 * j31);
        long j41 = j40 + j40;
        long j42 = j41 + (j15 * j37) + (j20 * j27) + (j25 * j25);
        long j43 = j15 * j39;
        long j44 = j43 + (j17 * j37) + (j20 * j31) + (j25 * j27);
        long j45 = (j17 * j39) + (j25 * j31);
        long j46 = j45 + j45 + (j20 * j37);
        long j47 = j20 * j39;
        long j48 = j47 + (j25 * j37) + (j27 * j31);
        long j49 = (j25 + j25) * j39;
        long j50 = j49 + (j27 * j37) + (j31 * j31);
        long j51 = (j27 * j39) + (j31 * j37);
        long[] jArr3 = {j10 * j10, jArr2[1] * j12, j14 + j14, j16 + j16, j19 + j18 + (j15 * j15), j22 + j22, j26 + j26, j29 + j29, j35 + (j20 * j20), j38 + j38, j42 + j42, j44 + j44, j46 + j46 + (j27 * j27), j48 + j48, j50 + j50, j51 + j51, (j31 * 4 * j39) + (j37 * j37), (j37 + j37) * j39, (j39 + j39) * j39};
        N(jArr3);
        L(jArr3);
        System.arraycopy(jArr3, 0, jArr, 0, 10);
    }

    public static void R(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] - jArr3[i10];
        }
    }

    public static void S(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] + jArr3[i10];
        }
    }

    public static byte[] T(long[] jArr) {
        int i10;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i11 = 0;
        while (true) {
            if (i11 >= 2) {
                break;
            }
            int i12 = 0;
            while (i12 < 9) {
                long j10 = copyOf[i12];
                int i13 = f2479l[i12 & 1];
                int i14 = -((int) (((j10 >> 31) & j10) >> i13));
                copyOf[i12] = j10 + ((long) (i14 << i13));
                i12++;
                copyOf[i12] = copyOf[i12] - ((long) i14);
            }
            long j11 = copyOf[9];
            int i15 = -((int) (((j11 >> 31) & j11) >> 25));
            copyOf[9] = j11 + ((long) (i15 << 25));
            copyOf[0] = copyOf[0] - ((long) (i15 * 19));
            i11++;
        }
        long j12 = copyOf[0];
        int i16 = -((int) (((j12 >> 31) & j12) >> 26));
        copyOf[0] = j12 + ((long) (i16 << 26));
        copyOf[1] = copyOf[1] - ((long) i16);
        for (int i17 = 0; i17 < 2; i17++) {
            int i18 = 0;
            while (i18 < 9) {
                long j13 = copyOf[i18];
                int i19 = i18 & 1;
                int i20 = f2479l[i19];
                copyOf[i18] = ((long) k[i19]) & j13;
                i18++;
                copyOf[i18] = copyOf[i18] + ((long) ((int) (j13 >> i20)));
            }
        }
        long j14 = copyOf[9];
        copyOf[9] = 33554431 & j14;
        long j15 = copyOf[0] + ((long) (((int) (j14 >> 25)) * 19));
        copyOf[0] = j15;
        int i21 = ~((((int) j15) - 67108845) >> 31);
        for (int i22 = 1; i22 < 10; i22++) {
            int i23 = ~(((int) copyOf[i22]) ^ k[i22 & 1]);
            int i24 = i23 & (i23 << 16);
            int i25 = i24 & (i24 << 8);
            int i26 = i25 & (i25 << 4);
            int i27 = i26 & (i26 << 2);
            i21 &= (i27 & (i27 + i27)) >> 31;
        }
        copyOf[0] = copyOf[0] - ((long) (67108845 & i21));
        long j16 = (long) (33554431 & i21);
        copyOf[1] = copyOf[1] - j16;
        for (i10 = 2; i10 < 10; i10 += 2) {
            copyOf[i10] = copyOf[i10] - ((long) (67108863 & i21));
            int i28 = i10 + 1;
            copyOf[i28] = copyOf[i28] - j16;
        }
        for (int i29 = 0; i29 < 10; i29++) {
            copyOf[i29] = copyOf[i29] << f2478j[i29];
        }
        byte[] bArr = new byte[32];
        for (int i30 = 0; i30 < 10; i30++) {
            int i31 = f2477i[i30];
            byte b10 = bArr[i31];
            long j17 = copyOf[i30];
            bArr[i31] = (byte) ((int) (((long) b10) | (j17 & 255)));
            int i32 = i31 + 1;
            bArr[i32] = (byte) ((int) (((long) bArr[i32]) | ((j17 >> 8) & 255)));
            int i33 = i31 + 2;
            bArr[i33] = (byte) ((int) (((long) bArr[i33]) | ((j17 >> 16) & 255)));
            int i34 = i31 + 3;
            bArr[i34] = (byte) ((int) (((j17 >> 24) & 255) | ((long) bArr[i34])));
        }
        return bArr;
    }

    public static void l(String str, boolean z9) {
        if (!z9) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void m(boolean z9) {
        if (!z9) {
            throw new IllegalArgumentException();
        }
    }

    public static void n(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void o(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void p(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            c.c(th, th2);
        }
    }

    public static z5.b q(Context context) {
        t tVar;
        synchronized (c.class) {
            if (c.f13177a == null) {
                x4 x4Var = new x4();
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                x4Var.f8550a = context;
                Class<Context> cls = Context.class;
                c.f13177a = new t(context);
            }
            tVar = c.f13177a;
        }
        return (z5.b) tVar.f13227a.a();
    }

    public static String r(String str, String str2, String str3) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(str2.getBytes(StandardCharsets.UTF_8));
            if (str.length() < 16) {
                int length = 16 - str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    str = str + "0";
                }
            } else if (str.length() > 16) {
                str = str.substring(0, 16);
            }
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(StandardCharsets.UTF_8), "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            instance.init(1, secretKeySpec, ivParameterSpec);
            return Base64.encodeToString(instance.doFinal(str3.getBytes()), 0) + ":" + Base64.encodeToString(str2.getBytes(StandardCharsets.UTF_8), 0);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static int s(Context context, int i10, int i11) {
        TypedValue a10 = n5.b.a(context, i10);
        if (a10 == null) {
            return i11;
        }
        int i12 = a10.resourceId;
        if (i12 == 0) {
            return a10.data;
        }
        Object obj = y.a.f13006a;
        return a.c.a(context, i12);
    }

    public static int t(View view, int i10) {
        Context context = view.getContext();
        TypedValue c10 = n5.b.c(view.getContext(), view.getClass().getCanonicalName(), i10);
        int i11 = c10.resourceId;
        if (i11 == 0) {
            return c10.data;
        }
        Object obj = y.a.f13006a;
        return a.c.a(context, i11);
    }

    public static boolean u(int i10) {
        boolean z9;
        double d10;
        double d11;
        double d12;
        if (i10 != 0) {
            ThreadLocal<double[]> threadLocal = a0.a.f2a;
            double[] dArr = threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i10);
            int green = Color.green(i10);
            int blue = Color.blue(i10);
            if (dArr.length == 3) {
                double d13 = ((double) red) / 255.0d;
                if (d13 < 0.04045d) {
                    d10 = d13 / 12.92d;
                } else {
                    d10 = Math.pow((d13 + 0.055d) / 1.055d, 2.4d);
                }
                double d14 = ((double) green) / 255.0d;
                if (d14 < 0.04045d) {
                    d11 = d14 / 12.92d;
                } else {
                    d11 = Math.pow((d14 + 0.055d) / 1.055d, 2.4d);
                }
                double d15 = ((double) blue) / 255.0d;
                if (d15 < 0.04045d) {
                    d12 = d15 / 12.92d;
                } else {
                    d12 = Math.pow((d15 + 0.055d) / 1.055d, 2.4d);
                }
                z9 = false;
                dArr[0] = ((0.1805d * d12) + (0.3576d * d11) + (0.4124d * d10)) * 100.0d;
                double d16 = ((0.0722d * d12) + (0.7152d * d11) + (0.2126d * d10)) * 100.0d;
                dArr[1] = d16;
                double d17 = d12 * 0.9505d;
                dArr[2] = (d17 + (d11 * 0.1192d) + (d10 * 0.0193d)) * 100.0d;
                if (d16 / 100.0d > 0.5d) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
        } else {
            z9 = false;
        }
        return z9;
    }

    public static int v(float f10, int i10, int i11) {
        return a0.a.b(a0.a.c(i11, Math.round(((float) Color.alpha(i11)) * f10)), i10);
    }

    public static float w(int i10) {
        float f10 = ((float) i10) / 255.0f;
        return (f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((double) ((f10 + 0.055f) / 1.055f), 2.4000000953674316d)) * 100.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x009f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long y(java.lang.String r23, long r24, long r26, long r28) {
        /*
            r0 = r23
            r1 = r26
            r3 = r28
            int r5 = h9.o.f7068a
            java.lang.String r6 = java.lang.System.getProperty(r23)     // Catch:{ SecurityException -> 0x000d }
            goto L_0x000e
        L_0x000d:
            r6 = 0
        L_0x000e:
            if (r6 != 0) goto L_0x0014
            r8 = r24
            goto L_0x00c4
        L_0x0014:
            a9.c r7 = new a9.c
            r8 = 2
            r9 = 36
            r7.<init>(r8, r9)
            r10 = 10
            int r7 = r7.f221b
            r11 = 1
            r12 = 0
            if (r10 > r7) goto L_0x0026
            r7 = r11
            goto L_0x0027
        L_0x0026:
            r7 = r12
        L_0x0027:
            if (r7 == 0) goto L_0x011f
            int r7 = r6.length()
            if (r7 != 0) goto L_0x0033
        L_0x002f:
            r19 = r6
            goto L_0x0095
        L_0x0033:
            char r8 = r6.charAt(r12)
            r9 = 48
            if (r8 >= r9) goto L_0x003d
            r9 = -1
            goto L_0x0042
        L_0x003d:
            if (r8 != r9) goto L_0x0041
            r9 = r12
            goto L_0x0042
        L_0x0041:
            r9 = r11
        L_0x0042:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 >= 0) goto L_0x005b
            if (r7 != r11) goto L_0x004c
            goto L_0x002f
        L_0x004c:
            r9 = 45
            if (r8 != r9) goto L_0x0054
            r13 = -9223372036854775808
            r8 = r11
            goto L_0x005c
        L_0x0054:
            r9 = 43
            if (r8 != r9) goto L_0x002f
            r8 = r11
            r9 = r12
            goto L_0x005d
        L_0x005b:
            r8 = r12
        L_0x005c:
            r9 = r8
        L_0x005d:
            r15 = 0
            r17 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r11 = r15
            r15 = r17
        L_0x0067:
            if (r8 >= r7) goto L_0x009f
            char r5 = r6.charAt(r8)
            int r5 = java.lang.Character.digit(r5, r10)
            if (r5 >= 0) goto L_0x0074
            goto L_0x002f
        L_0x0074:
            int r19 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r19 >= 0) goto L_0x0088
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 != 0) goto L_0x002f
            r19 = r6
            r20 = r7
            long r6 = (long) r10
            long r15 = r13 / r6
            int r6 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r6 >= 0) goto L_0x008c
            goto L_0x0095
        L_0x0088:
            r19 = r6
            r20 = r7
        L_0x008c:
            long r6 = (long) r10
            long r11 = r11 * r6
            long r5 = (long) r5
            long r21 = r13 + r5
            int r7 = (r11 > r21 ? 1 : (r11 == r21 ? 0 : -1))
            if (r7 >= 0) goto L_0x0097
        L_0x0095:
            r5 = 0
            goto L_0x00ad
        L_0x0097:
            long r11 = r11 - r5
            int r8 = r8 + 1
            r6 = r19
            r7 = r20
            goto L_0x0067
        L_0x009f:
            r19 = r6
            if (r9 == 0) goto L_0x00a8
            java.lang.Long r5 = java.lang.Long.valueOf(r11)
            goto L_0x00ad
        L_0x00a8:
            long r5 = -r11
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
        L_0x00ad:
            r6 = 39
            java.lang.String r7 = "System property '"
            if (r5 == 0) goto L_0x00f9
            long r8 = r5.longValue()
            int r5 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x00c1
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x00c1
            r11 = 1
            goto L_0x00c2
        L_0x00c1:
            r11 = 0
        L_0x00c2:
            if (r11 == 0) goto L_0x00c5
        L_0x00c4:
            return r8
        L_0x00c5:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r7)
            r10.append(r0)
            java.lang.String r0 = "' should be in range "
            r10.append(r0)
            r10.append(r1)
            java.lang.String r0 = ".."
            r10.append(r0)
            r10.append(r3)
            java.lang.String r0 = ", but is '"
            r10.append(r0)
            r10.append(r8)
            r10.append(r6)
            java.lang.String r0 = r10.toString()
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x00f9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            r2.append(r0)
            java.lang.String r0 = "' has unrecognized value '"
            r2.append(r0)
            r5 = r19
            r2.append(r5)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x011f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "radix "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = " was not in valid range "
            r1.append(r2)
            a9.c r2 = new a9.c
            r2.<init>(r8, r9)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.b.y(java.lang.String, long, long, long):long");
    }

    public static int z(String str, int i10, int i11, int i12, int i13) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return (int) y(str, (long) i10, (long) i11, (long) i12);
    }

    public /* bridge */ /* synthetic */ Object b(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }

    public o1.c c(o1.h hVar) {
        return o1.c.SOURCE;
    }

    public boolean d(Object obj, File file, o1.h hVar) {
        try {
            j2.a.d(((b2.c) ((w) obj).get()).f2210a.f2220a.f2222a.g().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            }
            return false;
        }
    }

    public void e(View view) {
    }

    public void f() {
    }

    public void g(i iVar) {
        iVar.onStart();
    }

    public Object h(j6.w wVar) {
        return FirebaseAuthRegistrar.lambda$getComponents$0(wVar);
    }

    public void i(i iVar) {
    }

    public Object j() {
        return new ConcurrentHashMap();
    }

    public void k() {
    }

    public void x(View view, int i10) {
        if (!f2473e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f2472d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f2473e = true;
        }
        Field field = f2472d;
        if (field != null) {
            try {
                f2472d.setInt(view, i10 | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public Object zza() {
        List list = w2.f10205a;
        return Long.valueOf(ga.f8203b.zza().C());
    }

    public /* synthetic */ b(int i10) {
    }
}
