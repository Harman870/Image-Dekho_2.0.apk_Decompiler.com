package n9;

import com.ironsource.mediationsdk.config.VersionInfo;
import j9.b0;
import t9.h;

public final class e {
    static {
        h.d("\"\\");
        h.d("\t ,=");
    }

    public static long a(b0 b0Var) {
        String c10 = b0Var.f8826f.c("Content-Length");
        if (c10 != null) {
            try {
                return Long.parseLong(c10);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public static boolean b(b0 b0Var) {
        if (b0Var.f8821a.f9017b.equals(VersionInfo.GIT_BRANCH)) {
            return false;
        }
        int i10 = b0Var.f8823c;
        if (((i10 >= 100 && i10 < 200) || i10 == 204 || i10 == 304) && a(b0Var) == -1 && !"chunked".equalsIgnoreCase(b0Var.a("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    public static int c(int i10, String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01f2, code lost:
        if (r9 == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0225, code lost:
        if (r11 != false) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0234, code lost:
        if (r11 == false) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0236, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0344, code lost:
        if (r0 == null) goto L_0x0346;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0115, code lost:
        if (r19 <= 0) goto L_0x012a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:146:0x023e */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x032a A[LOOP:10: B:213:0x0327->B:215:0x032a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0399 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(j9.j r33, j9.q r34, j9.p r35) {
        /*
            r0 = r35
            j9.j$a r1 = j9.j.f8921a
            r2 = r33
            if (r2 != r1) goto L_0x0009
            return
        L_0x0009:
            java.util.regex.Pattern r1 = j9.i.f8909j
            java.lang.String r1 = "Set-Cookie"
            java.lang.String[] r3 = r0.f8939a
            int r3 = r3.length
            r4 = 2
            int r3 = r3 / r4
            r5 = 0
            r7 = r5
            r8 = 0
        L_0x0015:
            if (r7 >= r3) goto L_0x0032
            java.lang.String r9 = r0.d(r7)
            boolean r9 = r1.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x002f
            if (r8 != 0) goto L_0x0028
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r4)
        L_0x0028:
            java.lang.String r9 = r0.g(r7)
            r8.add(r9)
        L_0x002f:
            int r7 = r7 + 1
            goto L_0x0015
        L_0x0032:
            if (r8 == 0) goto L_0x0039
            java.util.List r0 = java.util.Collections.unmodifiableList(r8)
            goto L_0x003d
        L_0x0039:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x003d:
            r1 = r0
            int r3 = r1.size()
            r4 = r5
            r7 = 0
        L_0x0044:
            if (r4 >= r3) goto L_0x03a2
            java.lang.Object r0 = r1.get(r4)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            long r9 = java.lang.System.currentTimeMillis()
            int r11 = r8.length()
            r12 = 59
            int r0 = k9.e.h(r8, r5, r11, r12)
            r13 = 61
            int r14 = k9.e.h(r8, r5, r0, r13)
            if (r14 != r0) goto L_0x006a
        L_0x0063:
            r6 = r34
            r26 = r1
            r2 = r5
            goto L_0x038a
        L_0x006a:
            java.lang.String r15 = k9.e.v(r5, r14, r8)
            boolean r16 = r15.isEmpty()
            if (r16 != 0) goto L_0x0063
            int r6 = r15.length()
        L_0x0078:
            r12 = 31
            if (r5 >= r6) goto L_0x008c
            char r13 = r15.charAt(r5)
            if (r13 <= r12) goto L_0x008d
            r12 = 127(0x7f, float:1.78E-43)
            if (r13 < r12) goto L_0x0087
            goto L_0x008d
        L_0x0087:
            int r5 = r5 + 1
            r12 = 59
            goto L_0x0078
        L_0x008c:
            r5 = -1
        L_0x008d:
            r6 = -1
            if (r5 == r6) goto L_0x0096
        L_0x0090:
            r6 = r34
        L_0x0092:
            r26 = r1
            goto L_0x0346
        L_0x0096:
            int r14 = r14 + 1
            java.lang.String r5 = k9.e.v(r14, r0, r8)
            int r6 = r5.length()
            r12 = 0
        L_0x00a1:
            if (r12 >= r6) goto L_0x00b5
            char r13 = r5.charAt(r12)
            r14 = 31
            if (r13 <= r14) goto L_0x00b3
            r14 = 127(0x7f, float:1.78E-43)
            if (r13 < r14) goto L_0x00b0
            goto L_0x00b3
        L_0x00b0:
            int r12 = r12 + 1
            goto L_0x00a1
        L_0x00b3:
            r6 = r12
            goto L_0x00b6
        L_0x00b5:
            r6 = -1
        L_0x00b6:
            r12 = -1
            if (r6 == r12) goto L_0x00ba
            goto L_0x0090
        L_0x00ba:
            int r0 = r0 + 1
            r17 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r26 = r17
            r14 = 0
            r19 = -1
            r22 = 0
            r23 = 0
            r24 = 1
            r25 = 0
            r28 = 0
        L_0x00d0:
            r29 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r31 = -9223372036854775808
            if (r0 >= r11) goto L_0x0188
            r12 = 59
            int r13 = k9.e.h(r8, r0, r11, r12)
            r12 = 61
            int r6 = k9.e.h(r8, r0, r13, r12)
            java.lang.String r0 = k9.e.v(r0, r6, r8)
            if (r6 >= r13) goto L_0x00f2
            int r6 = r6 + 1
            java.lang.String r6 = k9.e.v(r6, r13, r8)
            goto L_0x00f4
        L_0x00f2:
            java.lang.String r6 = ""
        L_0x00f4:
            java.lang.String r12 = "expires"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L_0x0105
            int r0 = r6.length()     // Catch:{ IllegalArgumentException -> 0x0184 }
            long r26 = j9.i.b(r0, r6)     // Catch:{ IllegalArgumentException -> 0x0184 }
            goto L_0x012f
        L_0x0105:
            java.lang.String r12 = "max-age"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L_0x0133
            long r19 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x0118 }
            r29 = 0
            int r0 = (r19 > r29 ? 1 : (r19 == r29 ? 0 : -1))
            if (r0 > 0) goto L_0x012f
            goto L_0x012a
        L_0x0118:
            r0 = move-exception
            r12 = r0
            java.lang.String r0 = "-?\\d+"
            boolean r0 = r6.matches(r0)     // Catch:{  }
            if (r0 == 0) goto L_0x0132
            java.lang.String r0 = "-"
            boolean r0 = r6.startsWith(r0)     // Catch:{  }
            if (r0 == 0) goto L_0x012d
        L_0x012a:
            r19 = r31
            goto L_0x012f
        L_0x012d:
            r19 = r29
        L_0x012f:
            r25 = 1
            goto L_0x0184
        L_0x0132:
            throw r12     // Catch:{  }
        L_0x0133:
            java.lang.String r12 = "domain"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L_0x0164
            java.lang.String r0 = "."
            boolean r12 = r6.endsWith(r0)     // Catch:{ IllegalArgumentException -> 0x0184 }
            if (r12 != 0) goto L_0x015e
            boolean r0 = r6.startsWith(r0)     // Catch:{ IllegalArgumentException -> 0x0184 }
            if (r0 == 0) goto L_0x014e
            r12 = 1
            java.lang.String r6 = r6.substring(r12)     // Catch:{ IllegalArgumentException -> 0x0184 }
        L_0x014e:
            java.lang.String r0 = k9.e.b(r6)     // Catch:{ IllegalArgumentException -> 0x0184 }
            if (r0 == 0) goto L_0x0158
            r14 = r0
            r24 = 0
            goto L_0x0184
        L_0x0158:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0184 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x0184 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0184 }
        L_0x015e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0184 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x0184 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0184 }
        L_0x0164:
            java.lang.String r12 = "path"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L_0x016f
            r28 = r6
            goto L_0x0184
        L_0x016f:
            java.lang.String r6 = "secure"
            boolean r6 = r0.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x017a
            r22 = 1
            goto L_0x0184
        L_0x017a:
            java.lang.String r6 = "httponly"
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x0184
            r23 = 1
        L_0x0184:
            int r0 = r13 + 1
            goto L_0x00d0
        L_0x0188:
            int r0 = (r19 > r31 ? 1 : (r19 == r31 ? 0 : -1))
            if (r0 != 0) goto L_0x0191
            r6 = r34
            r18 = r31
            goto L_0x01bd
        L_0x0191:
            r11 = -1
            int r0 = (r19 > r11 ? 1 : (r19 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x01b9
            r11 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r0 = (r19 > r11 ? 1 : (r19 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x01a4
            r11 = 1000(0x3e8, double:4.94E-321)
            long r29 = r19 * r11
        L_0x01a4:
            long r29 = r9 + r29
            int r0 = (r29 > r9 ? 1 : (r29 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x01b4
            int r0 = (r29 > r17 ? 1 : (r29 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x01af
            goto L_0x01b4
        L_0x01af:
            r6 = r34
            r18 = r29
            goto L_0x01bd
        L_0x01b4:
            r6 = r34
            r18 = r17
            goto L_0x01bd
        L_0x01b9:
            r6 = r34
            r18 = r26
        L_0x01bd:
            java.lang.String r0 = r6.f8945d
            r8 = 46
            if (r14 != 0) goto L_0x01c5
            r14 = r0
            goto L_0x01f6
        L_0x01c5:
            boolean r9 = r0.equals(r14)
            if (r9 == 0) goto L_0x01cc
            goto L_0x01ef
        L_0x01cc:
            boolean r9 = r0.endsWith(r14)
            if (r9 == 0) goto L_0x01f1
            int r9 = r0.length()
            int r10 = r14.length()
            int r9 = r9 - r10
            r10 = 1
            int r9 = r9 - r10
            char r9 = r0.charAt(r9)
            if (r9 != r8) goto L_0x01f1
            java.util.regex.Pattern r9 = k9.e.k
            java.util.regex.Matcher r9 = r9.matcher(r0)
            boolean r9 = r9.matches()
            if (r9 != 0) goto L_0x01f1
        L_0x01ef:
            r9 = 1
            goto L_0x01f2
        L_0x01f1:
            r9 = 0
        L_0x01f2:
            if (r9 != 0) goto L_0x01f6
            goto L_0x0092
        L_0x01f6:
            int r0 = r0.length()
            int r9 = r14.length()
            if (r0 == r9) goto L_0x0353
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r9 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f10637h
            r9.getClass()
            java.lang.String r0 = java.net.IDN.toUnicode(r14)
            java.lang.String r10 = "\\."
            java.lang.String[] r10 = r0.split(r10)
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.f10638a
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x024f
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.f10638a
            r11 = 0
            r12 = 1
            boolean r0 = r0.compareAndSet(r11, r12)
            if (r0 == 0) goto L_0x024f
            r11 = 0
        L_0x0222:
            r9.b()     // Catch:{ InterruptedIOException -> 0x023e, IOException -> 0x022a }
            if (r11 == 0) goto L_0x025c
            goto L_0x0236
        L_0x0228:
            r0 = move-exception
            goto L_0x0245
        L_0x022a:
            r0 = move-exception
            r12 = r0
            q9.f r0 = q9.f.f11399a     // Catch:{ all -> 0x0228 }
            r13 = 5
            java.lang.String r8 = "Failed to read public suffix list"
            r0.m(r13, r8, r12)     // Catch:{ all -> 0x0228 }
            if (r11 == 0) goto L_0x025c
        L_0x0236:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x025c
        L_0x023e:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0228 }
            r8 = 46
            r11 = 1
            goto L_0x0222
        L_0x0245:
            if (r11 == 0) goto L_0x024e
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x024e:
            throw r0
        L_0x024f:
            java.util.concurrent.CountDownLatch r0 = r9.f10639b     // Catch:{ InterruptedException -> 0x0255 }
            r0.await()     // Catch:{ InterruptedException -> 0x0255 }
            goto L_0x025c
        L_0x0255:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x025c:
            monitor-enter(r9)
            byte[] r0 = r9.f10640c     // Catch:{ all -> 0x0350 }
            if (r0 == 0) goto L_0x0348
            monitor-exit(r9)     // Catch:{ all -> 0x0350 }
            int r0 = r10.length
            byte[][] r8 = new byte[r0][]
            r11 = 0
        L_0x0266:
            int r12 = r10.length
            if (r11 >= r12) goto L_0x0276
            r12 = r10[r11]
            java.nio.charset.Charset r13 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r12 = r12.getBytes(r13)
            r8[r11] = r12
            int r11 = r11 + 1
            goto L_0x0266
        L_0x0276:
            r11 = 0
        L_0x0277:
            if (r11 >= r0) goto L_0x0286
            byte[] r12 = r9.f10640c
            java.lang.String r12 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(r12, r8, r11)
            if (r12 == 0) goto L_0x0283
            r11 = 1
            goto L_0x0288
        L_0x0283:
            int r11 = r11 + 1
            goto L_0x0277
        L_0x0286:
            r11 = 1
            r12 = 0
        L_0x0288:
            if (r0 <= r11) goto L_0x02a8
            java.lang.Object r13 = r8.clone()
            byte[][] r13 = (byte[][]) r13
            r26 = r1
            r1 = 0
        L_0x0293:
            int r2 = r13.length
            int r2 = r2 - r11
            if (r1 >= r2) goto L_0x02aa
            byte[] r2 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f10634e
            r13[r1] = r2
            byte[] r2 = r9.f10640c
            java.lang.String r2 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(r2, r13, r1)
            if (r2 == 0) goto L_0x02a4
            goto L_0x02ab
        L_0x02a4:
            int r1 = r1 + 1
            r11 = 1
            goto L_0x0293
        L_0x02a8:
            r26 = r1
        L_0x02aa:
            r2 = 0
        L_0x02ab:
            if (r2 == 0) goto L_0x02be
            r1 = 0
        L_0x02ae:
            int r11 = r0 + -1
            if (r1 >= r11) goto L_0x02be
            byte[] r11 = r9.f10641d
            java.lang.String r11 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(r11, r8, r1)
            if (r11 == 0) goto L_0x02bb
            goto L_0x02bf
        L_0x02bb:
            int r1 = r1 + 1
            goto L_0x02ae
        L_0x02be:
            r11 = 0
        L_0x02bf:
            if (r11 == 0) goto L_0x02d9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "!"
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "\\."
            java.lang.String[] r0 = r0.split(r1)
            goto L_0x02fc
        L_0x02d9:
            if (r12 != 0) goto L_0x02e0
            if (r2 != 0) goto L_0x02e0
            java.lang.String[] r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f10636g
            goto L_0x02fc
        L_0x02e0:
            if (r12 == 0) goto L_0x02e9
            java.lang.String r0 = "\\."
            java.lang.String[] r0 = r12.split(r0)
            goto L_0x02eb
        L_0x02e9:
            java.lang.String[] r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f10635f
        L_0x02eb:
            if (r2 == 0) goto L_0x02f4
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r2.split(r1)
            goto L_0x02f6
        L_0x02f4:
            java.lang.String[] r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f10635f
        L_0x02f6:
            int r2 = r0.length
            int r8 = r1.length
            if (r2 <= r8) goto L_0x02fb
            goto L_0x02fc
        L_0x02fb:
            r0 = r1
        L_0x02fc:
            int r1 = r10.length
            int r2 = r0.length
            r8 = 33
            if (r1 != r2) goto L_0x030d
            r1 = 0
            r2 = r0[r1]
            char r2 = r2.charAt(r1)
            if (r2 == r8) goto L_0x030e
            r0 = 0
            goto L_0x0344
        L_0x030d:
            r1 = 0
        L_0x030e:
            r2 = r0[r1]
            char r2 = r2.charAt(r1)
            int r1 = r10.length
            int r0 = r0.length
            if (r2 != r8) goto L_0x0319
            goto L_0x031b
        L_0x0319:
            int r0 = r0 + 1
        L_0x031b:
            int r1 = r1 - r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "\\."
            java.lang.String[] r2 = r14.split(r2)
        L_0x0327:
            int r8 = r2.length
            if (r1 >= r8) goto L_0x0337
            r8 = r2[r1]
            r0.append(r8)
            r8 = 46
            r0.append(r8)
            int r1 = r1 + 1
            goto L_0x0327
        L_0x0337:
            int r1 = r0.length()
            r2 = 1
            int r1 = r1 - r2
            r0.deleteCharAt(r1)
            java.lang.String r0 = r0.toString()
        L_0x0344:
            if (r0 != 0) goto L_0x0355
        L_0x0346:
            r2 = 0
            goto L_0x038a
        L_0x0348:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0350 }
            java.lang.String r1 = "Unable to load publicsuffixes.gz resource from the classpath."
            r0.<init>(r1)     // Catch:{ all -> 0x0350 }
            throw r0     // Catch:{ all -> 0x0350 }
        L_0x0350:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0350 }
            throw r0
        L_0x0353:
            r26 = r1
        L_0x0355:
            r1 = r28
            if (r1 == 0) goto L_0x0366
            java.lang.String r0 = "/"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0362
            goto L_0x0366
        L_0x0362:
            r21 = r1
            r2 = 0
            goto L_0x037c
        L_0x0366:
            java.lang.String r0 = r34.f()
            r1 = 47
            int r1 = r0.lastIndexOf(r1)
            r2 = 0
            if (r1 == 0) goto L_0x0378
            java.lang.String r0 = r0.substring(r2, r1)
            goto L_0x037a
        L_0x0378:
            java.lang.String r0 = "/"
        L_0x037a:
            r21 = r0
        L_0x037c:
            j9.i r0 = new j9.i
            r1 = r15
            r15 = r0
            r16 = r1
            r17 = r5
            r20 = r14
            r15.<init>(r16, r17, r18, r20, r21, r22, r23, r24, r25)
            goto L_0x038b
        L_0x038a:
            r0 = 0
        L_0x038b:
            if (r0 != 0) goto L_0x038e
            goto L_0x0399
        L_0x038e:
            if (r7 != 0) goto L_0x0396
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r7 = r1
        L_0x0396:
            r7.add(r0)
        L_0x0399:
            int r4 = r4 + 1
            r5 = r2
            r1 = r26
            r2 = r33
            goto L_0x0044
        L_0x03a2:
            if (r7 == 0) goto L_0x03a9
            java.util.List r0 = java.util.Collections.unmodifiableList(r7)
            goto L_0x03ad
        L_0x03a9:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x03ad:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x03b4
            return
        L_0x03b4:
            r33.getClass()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.e.d(j9.j, j9.q, j9.p):void");
    }

    public static int e(int i10, String str, String str2) {
        while (i10 < str.length() && str2.indexOf(str.charAt(i10)) == -1) {
            i10++;
        }
        return i10;
    }
}
