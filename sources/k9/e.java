package k9;

import androidx.activity.f;
import androidx.fragment.app.w0;
import com.ironsource.adapters.ironsource.a;
import j9.c0;
import j9.p;
import j9.q;
import j9.s;
import j9.u;
import j9.z;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p9.b;
import t9.g;
import t9.h;
import t9.r;
import t9.y;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f9152a;

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f9153b = new String[0];

    /* renamed from: c  reason: collision with root package name */
    public static final p f9154c = p.f(new String[0]);

    /* renamed from: d  reason: collision with root package name */
    public static final c0 f9155d;

    /* renamed from: e  reason: collision with root package name */
    public static final r f9156e;

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f9157f = Charset.forName("UTF-32BE");

    /* renamed from: g  reason: collision with root package name */
    public static final Charset f9158g = Charset.forName("UTF-32LE");

    /* renamed from: h  reason: collision with root package name */
    public static final TimeZone f9159h = TimeZone.getTimeZone("GMT");

    /* renamed from: i  reason: collision with root package name */
    public static final d f9160i = new d();

    /* renamed from: j  reason: collision with root package name */
    public static final Method f9161j;
    public static final Pattern k = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    static {
        byte[] bArr = new byte[0];
        f9152a = bArr;
        t9.e eVar = new t9.e();
        eVar.write(bArr, 0, 0);
        long j10 = (long) 0;
        Method method = null;
        f9155d = new c0((s) null, j10, eVar);
        if ((j10 | j10) < 0 || j10 > j10 || j10 - j10 < j10) {
            throw new ArrayIndexOutOfBoundsException();
        }
        new z(0, bArr);
        h[] hVarArr = {h.b("efbbbf"), h.b("feff"), h.b("fffe"), h.b("0000ffff"), h.b("ffff0000")};
        int i10 = r.f12069c;
        ArrayList arrayList = new ArrayList(Arrays.asList(hVarArr));
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(-1);
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList2.set(Collections.binarySearch(arrayList, hVarArr[i12]), Integer.valueOf(i12));
        }
        if (((h) arrayList.get(0)).j() != 0) {
            int i13 = 0;
            while (i13 < arrayList.size()) {
                h hVar = (h) arrayList.get(i13);
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < arrayList.size()) {
                    h hVar2 = (h) arrayList.get(i15);
                    hVar2.getClass();
                    if (!hVar2.i(hVar, hVar.j())) {
                        continue;
                        break;
                    } else if (hVar2.j() == hVar.j()) {
                        throw new IllegalArgumentException("duplicate option: " + hVar2);
                    } else if (((Integer) arrayList2.get(i15)).intValue() > ((Integer) arrayList2.get(i13)).intValue()) {
                        arrayList.remove(i15);
                        arrayList2.remove(i15);
                    } else {
                        i15++;
                    }
                }
                i13 = i14;
            }
            t9.e eVar2 = new t9.e();
            r.a(0, eVar2, 0, arrayList, 0, arrayList.size(), arrayList2);
            int i16 = (int) (eVar2.f12045b / 4);
            int[] iArr = new int[i16];
            for (int i17 = 0; i17 < i16; i17++) {
                iArr[i17] = eVar2.readInt();
            }
            if (eVar2.p()) {
                f9156e = new r((h[]) hVarArr.clone(), iArr);
                try {
                    method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
                } catch (Exception unused) {
                }
                f9161j = method;
                return;
            }
            throw new AssertionError();
        }
        throw new IllegalArgumentException("the empty byte string is not a supported option");
    }

    public static Charset a(g gVar, Charset charset) {
        int I = gVar.I(f9156e);
        if (I == -1) {
            return charset;
        }
        if (I == 0) {
            return StandardCharsets.UTF_8;
        }
        if (I == 1) {
            return StandardCharsets.UTF_16BE;
        }
        if (I == 2) {
            return StandardCharsets.UTF_16LE;
        }
        if (I == 3) {
            return f9157f;
        }
        if (I == 4) {
            return f9158g;
        }
        throw new AssertionError();
    }

    public static String b(String str) {
        InetAddress inetAddress;
        boolean z9 = true;
        int i10 = -1;
        int i11 = 0;
        if (str.contains(":")) {
            if (!str.startsWith("[") || !str.endsWith("]")) {
                inetAddress = f(0, str.length(), str);
            } else {
                inetAddress = f(1, str.length() - 1, str);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                int i12 = 0;
                int i13 = 0;
                while (i12 < address.length) {
                    int i14 = i12;
                    while (i14 < 16 && address[i14] == 0 && address[i14 + 1] == 0) {
                        i14 += 2;
                    }
                    int i15 = i14 - i12;
                    if (i15 > i13 && i15 >= 4) {
                        i10 = i12;
                        i13 = i15;
                    }
                    i12 = i14 + 2;
                }
                t9.e eVar = new t9.e();
                while (i11 < address.length) {
                    if (i11 == i10) {
                        eVar.R(58);
                        i11 += i13;
                        if (i11 == 16) {
                            eVar.R(58);
                        }
                    } else {
                        if (i11 > 0) {
                            eVar.R(58);
                        }
                        eVar.T((long) (((address[i11] & 255) << 8) | (address[i11 + 1] & 255)));
                        i11 += 2;
                    }
                }
                return eVar.M();
            } else if (address.length == 4) {
                return inetAddress.getHostAddress();
            } else {
                throw new AssertionError(w0.d("Invalid IPv6 address: '", str, "'"));
            }
        } else {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                int i16 = 0;
                while (true) {
                    if (i16 >= lowerCase.length()) {
                        z9 = false;
                        break;
                    }
                    char charAt = lowerCase.charAt(i16);
                    if (charAt <= 31) {
                        break;
                    } else if (charAt >= 127) {
                        break;
                    } else if (" #%/:?@[\\]".indexOf(charAt) != -1) {
                        break;
                    } else {
                        i16++;
                    }
                }
                if (z9) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static void d(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e10) {
                if (!o(e10)) {
                    throw e10;
                }
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }

    public static int e(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (c10 < 'a' || c10 > 'f') {
            c11 = 'A';
            if (c10 < 'A' || c10 > 'F') {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009a, code lost:
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00db, code lost:
        if (r7 == r0) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00de, code lost:
        if (r8 != -1) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e0, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e1, code lost:
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00f3, code lost:
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f9, code lost:
        throw new java.lang.AssertionError();
     */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.net.InetAddress f(int r16, int r17, java.lang.String r18) {
        /*
            r0 = r17
            r1 = r18
            r2 = 16
            byte[] r3 = new byte[r2]
            r4 = -1
            r5 = 0
            r6 = r16
            r8 = r4
            r9 = r8
            r7 = r5
        L_0x000f:
            r10 = 0
            if (r6 >= r0) goto L_0x00da
            if (r7 != r2) goto L_0x0015
            return r10
        L_0x0015:
            int r11 = r6 + 2
            r12 = 255(0xff, float:3.57E-43)
            r13 = 4
            if (r11 > r0) goto L_0x0034
            java.lang.String r14 = "::"
            r15 = 2
            boolean r14 = r1.regionMatches(r6, r14, r5, r15)
            if (r14 == 0) goto L_0x0034
            if (r8 == r4) goto L_0x0028
            return r10
        L_0x0028:
            int r7 = r7 + 2
            if (r11 != r0) goto L_0x0030
            r0 = r2
            r8 = r7
            goto L_0x00db
        L_0x0030:
            r8 = r7
            r9 = r11
            goto L_0x00a7
        L_0x0034:
            if (r7 == 0) goto L_0x00a6
            java.lang.String r11 = ":"
            r14 = 1
            boolean r11 = r1.regionMatches(r6, r11, r5, r14)
            if (r11 == 0) goto L_0x0043
            int r6 = r6 + 1
            goto L_0x00a6
        L_0x0043:
            java.lang.String r11 = "."
            boolean r6 = r1.regionMatches(r6, r11, r5, r14)
            if (r6 == 0) goto L_0x00a5
            int r6 = r7 + -2
            r11 = r6
        L_0x004e:
            if (r9 >= r0) goto L_0x0097
            if (r11 != r2) goto L_0x0054
        L_0x0052:
            r14 = r5
            goto L_0x009d
        L_0x0054:
            if (r11 == r6) goto L_0x0061
            char r15 = r1.charAt(r9)
            r14 = 46
            if (r15 == r14) goto L_0x005f
            goto L_0x0052
        L_0x005f:
            int r9 = r9 + 1
        L_0x0061:
            r15 = r5
            r14 = r9
        L_0x0063:
            if (r14 >= r0) goto L_0x0085
            char r5 = r1.charAt(r14)
            r2 = 48
            if (r5 < r2) goto L_0x0085
            r4 = 57
            if (r5 <= r4) goto L_0x0072
            goto L_0x0085
        L_0x0072:
            if (r15 != 0) goto L_0x0077
            if (r9 == r14) goto L_0x0077
            goto L_0x009a
        L_0x0077:
            int r15 = r15 * 10
            int r15 = r15 + r5
            int r15 = r15 - r2
            if (r15 <= r12) goto L_0x007e
            goto L_0x009a
        L_0x007e:
            int r14 = r14 + 1
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x0063
        L_0x0085:
            int r2 = r14 - r9
            if (r2 != 0) goto L_0x008a
            goto L_0x009a
        L_0x008a:
            int r2 = r11 + 1
            byte r4 = (byte) r15
            r3[r11] = r4
            r11 = r2
            r9 = r14
            r2 = 16
            r4 = -1
            r5 = 0
            r14 = 1
            goto L_0x004e
        L_0x0097:
            int r6 = r6 + r13
            if (r11 == r6) goto L_0x009c
        L_0x009a:
            r14 = 0
            goto L_0x009d
        L_0x009c:
            r14 = 1
        L_0x009d:
            if (r14 != 0) goto L_0x00a0
            return r10
        L_0x00a0:
            int r7 = r7 + 2
            r0 = 16
            goto L_0x00db
        L_0x00a5:
            return r10
        L_0x00a6:
            r9 = r6
        L_0x00a7:
            r6 = r9
            r2 = 0
        L_0x00a9:
            if (r6 >= r0) goto L_0x00bd
            char r4 = r1.charAt(r6)
            int r4 = e(r4)
            r5 = -1
            if (r4 != r5) goto L_0x00b7
            goto L_0x00bd
        L_0x00b7:
            int r2 = r2 << 4
            int r2 = r2 + r4
            int r6 = r6 + 1
            goto L_0x00a9
        L_0x00bd:
            int r4 = r6 - r9
            if (r4 == 0) goto L_0x00d9
            if (r4 <= r13) goto L_0x00c4
            goto L_0x00d9
        L_0x00c4:
            int r4 = r7 + 1
            int r5 = r2 >>> 8
            r5 = r5 & r12
            byte r5 = (byte) r5
            r3[r7] = r5
            int r7 = r4 + 1
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r4] = r2
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x000f
        L_0x00d9:
            return r10
        L_0x00da:
            r0 = r2
        L_0x00db:
            if (r7 == r0) goto L_0x00ef
            r1 = -1
            if (r8 != r1) goto L_0x00e1
            return r10
        L_0x00e1:
            int r1 = r7 - r8
            int r2 = 16 - r1
            java.lang.System.arraycopy(r3, r8, r3, r2, r1)
            int r2 = 16 - r7
            int r2 = r2 + r8
            r0 = 0
            java.util.Arrays.fill(r3, r8, r2, r0)
        L_0x00ef:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r3)     // Catch:{ UnknownHostException -> 0x00f4 }
            return r0
        L_0x00f4:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.e.f(int, int, java.lang.String):java.net.InetAddress");
    }

    public static int g(int i10, String str, int i11, String str2) {
        while (i10 < i11) {
            if (str2.indexOf(str.charAt(i10)) != -1) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int h(String str, int i10, int i11, char c10) {
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static boolean i(y yVar, TimeUnit timeUnit) {
        try {
            return r(yVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static String j(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String k(q qVar, boolean z9) {
        String str;
        if (qVar.f8945d.contains(":")) {
            str = androidx.activity.e.c(f.g("["), qVar.f8945d, "]");
        } else {
            str = qVar.f8945d;
        }
        if (!z9 && qVar.f8946e == q.d(qVar.f8942a)) {
            return str;
        }
        StringBuilder h10 = a.h(str, ":");
        h10.append(qVar.f8946e);
        return h10.toString();
    }

    public static <T> List<T> l(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    @SafeVarargs
    public static <T> List<T> m(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static String[] n(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i10++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean o(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean p(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String compare : strArr2) {
                    if (comparator.compare(str, compare) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean q(q qVar, q qVar2) {
        if (!qVar.f8945d.equals(qVar2.f8945d) || qVar.f8946e != qVar2.f8946e || !qVar.f8942a.equals(qVar2.f8942a)) {
            return false;
        }
        return true;
    }

    public static boolean r(y yVar, int i10, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long c10 = yVar.e().e() ? yVar.e().c() - nanoTime : Long.MAX_VALUE;
        yVar.e().d(Math.min(c10, timeUnit.toNanos((long) i10)) + nanoTime);
        try {
            t9.e eVar = new t9.e();
            while (yVar.z(eVar, 8192) != -1) {
                eVar.c();
            }
            int i11 = (c10 > Long.MAX_VALUE ? 1 : (c10 == Long.MAX_VALUE ? 0 : -1));
            t9.z e10 = yVar.e();
            if (i11 == 0) {
                e10.a();
            } else {
                e10.d(nanoTime + c10);
            }
            return true;
        } catch (InterruptedIOException unused) {
            int i12 = (c10 > Long.MAX_VALUE ? 1 : (c10 == Long.MAX_VALUE ? 0 : -1));
            t9.z e11 = yVar.e();
            if (i12 == 0) {
                e11.a();
            } else {
                e11.d(nanoTime + c10);
            }
            return false;
        } catch (Throwable th) {
            int i13 = (c10 > Long.MAX_VALUE ? 1 : (c10 == Long.MAX_VALUE ? 0 : -1));
            t9.z e12 = yVar.e();
            if (i13 == 0) {
                e12.a();
            } else {
                e12.d(nanoTime + c10);
            }
            throw th;
        }
    }

    public static int s(int i10, int i11, String str) {
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int t(int i10, int i11, String str) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            char charAt = str.charAt(i12);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i12 + 1;
            }
        }
        return i10;
    }

    public static p u(ArrayList arrayList) {
        p.a aVar = new p.a();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            u.a aVar2 = a.f9148a;
            String m2 = bVar.f10714a.m();
            String m8 = bVar.f10715b.m();
            aVar2.getClass();
            aVar.b(m2, m8);
        }
        return new p(aVar);
    }

    public static String v(int i10, int i11, String str) {
        int s10 = s(i10, i11, str);
        return str.substring(s10, t(s10, i11, str));
    }
}
