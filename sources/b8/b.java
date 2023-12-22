package b8;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;

public final class b implements Callable<com.ironsource.sdk.l.b> {

    /* renamed from: a  reason: collision with root package name */
    public final a f2335a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2336b;

    /* renamed from: c  reason: collision with root package name */
    public long f2337c = 3;

    public b(a aVar, String str) {
        this.f2335a = aVar;
        this.f2336b = str;
    }

    public static byte[] b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr, 0, 8192);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x013e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0142, code lost:
        r11.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0146, code lost:
        r3.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0153, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0157, code lost:
        r11.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x015b, code lost:
        r3.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0168, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x016c, code lost:
        r11.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0170, code lost:
        r3.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x017e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0182, code lost:
        r11.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0186, code lost:
        r3.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ad, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b0, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b1, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b3, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b4, code lost:
        r9 = r3;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b7, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ba, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bd, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c0, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d4, code lost:
        com.ironsource.sdk.utils.Logger.i("FileWorkerThread", r3.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e1, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e5, code lost:
        r11.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e9, code lost:
        r3.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0103, code lost:
        com.ironsource.sdk.utils.Logger.i("FileWorkerThread", r9.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0110, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0114, code lost:
        r11.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0118, code lost:
        r3.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0128, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x012c, code lost:
        r11.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0130, code lost:
        r1.printStackTrace();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x013a A[SYNTHETIC, Splitter:B:100:0x013a] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0142 A[Catch:{ all -> 0x013e }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x014f A[SYNTHETIC, Splitter:B:112:0x014f] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0157 A[Catch:{ all -> 0x0153 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0164 A[SYNTHETIC, Splitter:B:124:0x0164] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x016c A[Catch:{ all -> 0x0168 }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x017a A[SYNTHETIC, Splitter:B:136:0x017a] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0182 A[Catch:{ all -> 0x017e }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0191 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0196 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b0 A[ExcHandler: Error (e java.lang.Error), Splitter:B:12:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[ExcHandler: FileNotFoundException (unused java.io.FileNotFoundException), SYNTHETIC, Splitter:B:12:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[ExcHandler: SocketTimeoutException (unused java.net.SocketTimeoutException), SYNTHETIC, Splitter:B:12:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[ExcHandler: URISyntaxException (unused java.net.URISyntaxException), SYNTHETIC, Splitter:B:12:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[ExcHandler: MalformedURLException (unused java.net.MalformedURLException), SYNTHETIC, Splitter:B:12:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d4 A[Catch:{ all -> 0x00f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00dd A[SYNTHETIC, Splitter:B:58:0x00dd] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e5 A[Catch:{ all -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0103 A[Catch:{ all -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x010c A[SYNTHETIC, Splitter:B:75:0x010c] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0114 A[Catch:{ all -> 0x0110 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0124 A[SYNTHETIC, Splitter:B:87:0x0124] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x012c A[Catch:{ all -> 0x0128 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ironsource.sdk.l.b call() {
        /*
            r14 = this;
            long r0 = r14.f2337c
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x000c
            r0 = 1
            r14.f2337c = r0
        L_0x000c:
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r1
        L_0x0010:
            long r4 = (long) r2
            long r6 = r14.f2337c
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 1018(0x3fa, float:1.427E-42)
            r6 = 1019(0x3fb, float:1.428E-42)
            r7 = 1009(0x3f1, float:1.414E-42)
            java.lang.String r8 = "FileWorkerThread"
            if (r4 >= 0) goto L_0x019b
            b8.a r3 = r14.f2335a
            java.lang.String r4 = r3.f2331b
            int r9 = r3.f2332c
            int r3 = r3.f2333d
            com.ironsource.sdk.l.b r10 = new com.ironsource.sdk.l.b
            r10.<init>()
            boolean r11 = android.text.TextUtils.isEmpty(r4)
            r12 = 1008(0x3f0, float:1.413E-42)
            if (r11 == 0) goto L_0x0038
            r3 = 1007(0x3ef, float:1.411E-42)
            goto L_0x018b
        L_0x0038:
            java.net.URL r11 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0176, URISyntaxException -> 0x0160, SocketTimeoutException -> 0x014b, FileNotFoundException -> 0x0136, Exception -> 0x00f4, Error -> 0x00c7, all -> 0x00c3 }
            r11.<init>(r4)     // Catch:{ MalformedURLException -> 0x0176, URISyntaxException -> 0x0160, SocketTimeoutException -> 0x014b, FileNotFoundException -> 0x0136, Exception -> 0x00f4, Error -> 0x00c7, all -> 0x00c3 }
            r11.toURI()     // Catch:{ MalformedURLException -> 0x0176, URISyntaxException -> 0x0160, SocketTimeoutException -> 0x014b, FileNotFoundException -> 0x0136, Exception -> 0x00f4, Error -> 0x00c7, all -> 0x00c3 }
            java.net.URLConnection r11 = r11.openConnection()     // Catch:{ MalformedURLException -> 0x0176, URISyntaxException -> 0x0160, SocketTimeoutException -> 0x014b, FileNotFoundException -> 0x0136, Exception -> 0x00f4, Error -> 0x00c7, all -> 0x00c3 }
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11     // Catch:{ MalformedURLException -> 0x0176, URISyntaxException -> 0x0160, SocketTimeoutException -> 0x014b, FileNotFoundException -> 0x0136, Exception -> 0x00f4, Error -> 0x00c7, all -> 0x00c3 }
            java.lang.String r13 = "GET"
            r11.setRequestMethod(r13)     // Catch:{ MalformedURLException -> 0x00c0, URISyntaxException -> 0x00bd, SocketTimeoutException -> 0x00ba, FileNotFoundException -> 0x00b7, Exception -> 0x00b3, Error -> 0x00b0, all -> 0x00ad }
            r11.setConnectTimeout(r9)     // Catch:{ MalformedURLException -> 0x00c0, URISyntaxException -> 0x00bd, SocketTimeoutException -> 0x00ba, FileNotFoundException -> 0x00b7, Exception -> 0x00b3, Error -> 0x00b0, all -> 0x00ad }
            r11.setReadTimeout(r3)     // Catch:{ MalformedURLException -> 0x00c0, URISyntaxException -> 0x00bd, SocketTimeoutException -> 0x00ba, FileNotFoundException -> 0x00b7, Exception -> 0x00b3, Error -> 0x00b0, all -> 0x00ad }
            r11.connect()     // Catch:{ MalformedURLException -> 0x00c0, URISyntaxException -> 0x00bd, SocketTimeoutException -> 0x00ba, FileNotFoundException -> 0x00b7, Exception -> 0x00b3, Error -> 0x00b0, all -> 0x00ad }
            int r3 = r11.getResponseCode()     // Catch:{ MalformedURLException -> 0x00c0, URISyntaxException -> 0x00bd, SocketTimeoutException -> 0x00ba, FileNotFoundException -> 0x00b7, Exception -> 0x00b3, Error -> 0x00b0, all -> 0x00ad }
            r9 = 200(0xc8, float:2.8E-43)
            if (r3 < r9) goto L_0x0072
            r9 = 400(0x190, float:5.6E-43)
            if (r3 < r9) goto L_0x0061
            goto L_0x0072
        L_0x0061:
            java.io.InputStream r4 = r11.getInputStream()     // Catch:{ MalformedURLException -> 0x00c0, URISyntaxException -> 0x00bd, SocketTimeoutException -> 0x00ba, FileNotFoundException -> 0x00b7, Exception -> 0x00a9, Error -> 0x00b0, all -> 0x00a6 }
            byte[] r9 = b(r4)     // Catch:{ MalformedURLException -> 0x0178, URISyntaxException -> 0x0162, SocketTimeoutException -> 0x014d, FileNotFoundException -> 0x0138, Exception -> 0x006f, Error -> 0x006c }
            r10.f5728b = r9     // Catch:{ MalformedURLException -> 0x0178, URISyntaxException -> 0x0162, SocketTimeoutException -> 0x014d, FileNotFoundException -> 0x0138, Exception -> 0x006f, Error -> 0x006c }
            goto L_0x0096
        L_0x006c:
            r3 = move-exception
            goto L_0x00ca
        L_0x006f:
            r9 = move-exception
            goto L_0x00f9
        L_0x0072:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x00c0, URISyntaxException -> 0x00bd, SocketTimeoutException -> 0x00ba, FileNotFoundException -> 0x00b7, Exception -> 0x00a9, Error -> 0x00b0, all -> 0x00a6 }
            java.lang.String r13 = " RESPONSE CODE: "
            r9.<init>(r13)     // Catch:{ MalformedURLException -> 0x00c0, URISyntaxException -> 0x00bd, SocketTimeoutException -> 0x00ba, FileNotFoundException -> 0x00b7, Exception -> 0x00a9, Error -> 0x00b0, all -> 0x00a6 }
            r9.append(r3)     // Catch:{ MalformedURLException -> 0x00c0, URISyntaxException -> 0x00bd, SocketTimeoutException -> 0x00ba, FileNotFoundException -> 0x00b7, Exception -> 0x00a9, Error -> 0x00b0, all -> 0x00a6 }
            java.lang.String r13 = " URL: "
            r9.append(r13)     // Catch:{ MalformedURLException -> 0x00c0, URISyntaxException -> 0x00bd, SocketTimeoutException -> 0x00ba, FileNotFoundException -> 0x00b7, Exception -> 0x00a9, Error -> 0x00b0, all -> 0x00a6 }
            r9.append(r4)     // Catch:{ MalformedURLException -> 0x00c0, URISyntaxException -> 0x00bd, SocketTimeoutException -> 0x00ba, FileNotFoundException -> 0x00b7, Exception -> 0x00a9, Error -> 0x00b0, all -> 0x00a6 }
            java.lang.String r4 = " ATTEMPT: "
            r9.append(r4)     // Catch:{ MalformedURLException -> 0x00c0, URISyntaxException -> 0x00bd, SocketTimeoutException -> 0x00ba, FileNotFoundException -> 0x00b7, Exception -> 0x00a9, Error -> 0x00b0, all -> 0x00a6 }
            r9.append(r2)     // Catch:{ MalformedURLException -> 0x00c0, URISyntaxException -> 0x00bd, SocketTimeoutException -> 0x00ba, FileNotFoundException -> 0x00b7, Exception -> 0x00a9, Error -> 0x00b0, all -> 0x00a6 }
            java.lang.String r4 = r9.toString()     // Catch:{ MalformedURLException -> 0x00c0, URISyntaxException -> 0x00bd, SocketTimeoutException -> 0x00ba, FileNotFoundException -> 0x00b7, Exception -> 0x00a9, Error -> 0x00b0, all -> 0x00a6 }
            com.ironsource.sdk.utils.Logger.i(r8, r4)     // Catch:{ MalformedURLException -> 0x00c0, URISyntaxException -> 0x00bd, SocketTimeoutException -> 0x00ba, FileNotFoundException -> 0x00b7, Exception -> 0x00a9, Error -> 0x00b0, all -> 0x00a6 }
            r3 = 1011(0x3f3, float:1.417E-42)
            r4 = r1
        L_0x0096:
            if (r4 == 0) goto L_0x009b
            r4.close()     // Catch:{ all -> 0x00a0 }
        L_0x009b:
            r11.disconnect()     // Catch:{ all -> 0x00a0 }
            goto L_0x018b
        L_0x00a0:
            r4 = move-exception
            r4.printStackTrace()
            goto L_0x018b
        L_0x00a6:
            r0 = move-exception
            goto L_0x0120
        L_0x00a9:
            r9 = move-exception
        L_0x00aa:
            r4 = r1
            goto L_0x00f9
        L_0x00ad:
            r2 = move-exception
            goto L_0x0122
        L_0x00b0:
            r3 = move-exception
            r4 = r1
            goto L_0x00ca
        L_0x00b3:
            r3 = move-exception
            r9 = r3
            r3 = r0
            goto L_0x00aa
        L_0x00b7:
            r4 = r1
            goto L_0x0138
        L_0x00ba:
            r4 = r1
            goto L_0x014d
        L_0x00bd:
            r4 = r1
            goto L_0x0162
        L_0x00c0:
            r4 = r1
            goto L_0x0178
        L_0x00c3:
            r2 = move-exception
            r11 = r1
            goto L_0x0122
        L_0x00c7:
            r3 = move-exception
            r4 = r1
            r11 = r4
        L_0x00ca:
            java.lang.String r9 = r3.getMessage()     // Catch:{ all -> 0x00f0 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x00f0 }
            if (r9 != 0) goto L_0x00db
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x00f0 }
            com.ironsource.sdk.utils.Logger.i(r8, r3)     // Catch:{ all -> 0x00f0 }
        L_0x00db:
            if (r4 == 0) goto L_0x00e3
            r4.close()     // Catch:{ all -> 0x00e1 }
            goto L_0x00e3
        L_0x00e1:
            r3 = move-exception
            goto L_0x00e9
        L_0x00e3:
            if (r11 == 0) goto L_0x00ec
            r11.disconnect()     // Catch:{ all -> 0x00e1 }
            goto L_0x00ec
        L_0x00e9:
            r3.printStackTrace()
        L_0x00ec:
            r10.f5727a = r6
            goto L_0x018d
        L_0x00f0:
            r0 = move-exception
            r1 = r4
            r3 = r6
            goto L_0x0120
        L_0x00f4:
            r3 = move-exception
            r9 = r3
            r3 = r0
            r4 = r1
            r11 = r4
        L_0x00f9:
            java.lang.String r13 = r9.getMessage()     // Catch:{ all -> 0x011e }
            boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x011e }
            if (r13 != 0) goto L_0x010a
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x011e }
            com.ironsource.sdk.utils.Logger.i(r8, r9)     // Catch:{ all -> 0x011e }
        L_0x010a:
            if (r4 == 0) goto L_0x0112
            r4.close()     // Catch:{ all -> 0x0110 }
            goto L_0x0112
        L_0x0110:
            r3 = move-exception
            goto L_0x0118
        L_0x0112:
            if (r11 == 0) goto L_0x011b
            r11.disconnect()     // Catch:{ all -> 0x0110 }
            goto L_0x011b
        L_0x0118:
            r3.printStackTrace()
        L_0x011b:
            r3 = r7
            goto L_0x018b
        L_0x011e:
            r0 = move-exception
            r1 = r4
        L_0x0120:
            r2 = r0
            r0 = r3
        L_0x0122:
            if (r1 == 0) goto L_0x012a
            r1.close()     // Catch:{ all -> 0x0128 }
            goto L_0x012a
        L_0x0128:
            r1 = move-exception
            goto L_0x0130
        L_0x012a:
            if (r11 == 0) goto L_0x0133
            r11.disconnect()     // Catch:{ all -> 0x0128 }
            goto L_0x0133
        L_0x0130:
            r1.printStackTrace()
        L_0x0133:
            r10.f5727a = r0
            throw r2
        L_0x0136:
            r4 = r1
            r11 = r4
        L_0x0138:
            if (r4 == 0) goto L_0x0140
            r4.close()     // Catch:{ all -> 0x013e }
            goto L_0x0140
        L_0x013e:
            r3 = move-exception
            goto L_0x0146
        L_0x0140:
            if (r11 == 0) goto L_0x0149
            r11.disconnect()     // Catch:{ all -> 0x013e }
            goto L_0x0149
        L_0x0146:
            r3.printStackTrace()
        L_0x0149:
            r3 = r5
            goto L_0x018b
        L_0x014b:
            r4 = r1
            r11 = r4
        L_0x014d:
            if (r4 == 0) goto L_0x0155
            r4.close()     // Catch:{ all -> 0x0153 }
            goto L_0x0155
        L_0x0153:
            r3 = move-exception
            goto L_0x015b
        L_0x0155:
            if (r11 == 0) goto L_0x015e
            r11.disconnect()     // Catch:{ all -> 0x0153 }
            goto L_0x015e
        L_0x015b:
            r3.printStackTrace()
        L_0x015e:
            r3 = r12
            goto L_0x018b
        L_0x0160:
            r4 = r1
            r11 = r4
        L_0x0162:
            if (r4 == 0) goto L_0x016a
            r4.close()     // Catch:{ all -> 0x0168 }
            goto L_0x016a
        L_0x0168:
            r3 = move-exception
            goto L_0x0170
        L_0x016a:
            if (r11 == 0) goto L_0x0173
            r11.disconnect()     // Catch:{ all -> 0x0168 }
            goto L_0x0173
        L_0x0170:
            r3.printStackTrace()
        L_0x0173:
            r3 = 1010(0x3f2, float:1.415E-42)
            goto L_0x018b
        L_0x0176:
            r4 = r1
            r11 = r4
        L_0x0178:
            if (r4 == 0) goto L_0x0180
            r4.close()     // Catch:{ all -> 0x017e }
            goto L_0x0180
        L_0x017e:
            r3 = move-exception
            goto L_0x0186
        L_0x0180:
            if (r11 == 0) goto L_0x0189
            r11.disconnect()     // Catch:{ all -> 0x017e }
            goto L_0x0189
        L_0x0186:
            r3.printStackTrace()
        L_0x0189:
            r3 = 1004(0x3ec, float:1.407E-42)
        L_0x018b:
            r10.f5727a = r3
        L_0x018d:
            int r3 = r10.f5727a
            if (r3 == r12) goto L_0x0196
            if (r3 != r7) goto L_0x0194
            goto L_0x0196
        L_0x0194:
            r3 = r10
            goto L_0x019b
        L_0x0196:
            int r2 = r2 + 1
            r3 = r10
            goto L_0x0010
        L_0x019b:
            if (r3 == 0) goto L_0x0226
            byte[] r0 = r3.f5728b
            if (r0 == 0) goto L_0x0226
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r14.f2336b
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            b8.a r2 = r14.f2335a
            com.ironsource.sdk.h.c r2 = r2.f2330a
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            b8.a r4 = r14.f2335a
            java.lang.String r4 = r4.f2334e
            r2.append(r4)
            r2.append(r1)
            java.lang.String r1 = "tmp_"
            r2.append(r1)
            b8.a r1 = r14.f2335a
            com.ironsource.sdk.h.c r1 = r1.f2330a
            java.lang.String r1 = r1.getName()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            byte[] r2 = r3.f5728b     // Catch:{ FileNotFoundException -> 0x0224, Exception -> 0x020f, Error -> 0x01fa }
            int r2 = com.ironsource.sdk.utils.IronSourceStorageUtils.saveFile(r2, r1)     // Catch:{ FileNotFoundException -> 0x0224, Exception -> 0x020f, Error -> 0x01fa }
            if (r2 != 0) goto L_0x01ef
            r0 = 1006(0x3ee, float:1.41E-42)
            r3.f5727a = r0     // Catch:{ FileNotFoundException -> 0x0224, Exception -> 0x020f, Error -> 0x01fa }
            goto L_0x0226
        L_0x01ef:
            boolean r0 = com.ironsource.sdk.utils.IronSourceStorageUtils.renameFile(r1, r0)     // Catch:{ FileNotFoundException -> 0x0224, Exception -> 0x020f, Error -> 0x01fa }
            if (r0 != 0) goto L_0x0226
            r0 = 1014(0x3f6, float:1.421E-42)
            r3.f5727a = r0     // Catch:{ FileNotFoundException -> 0x0224, Exception -> 0x020f, Error -> 0x01fa }
            goto L_0x0226
        L_0x01fa:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x020c
            java.lang.String r0 = r0.getMessage()
            com.ironsource.sdk.utils.Logger.i(r8, r0)
        L_0x020c:
            r3.f5727a = r6
            goto L_0x0226
        L_0x020f:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0221
            java.lang.String r0 = r0.getMessage()
            com.ironsource.sdk.utils.Logger.i(r8, r0)
        L_0x0221:
            r3.f5727a = r7
            goto L_0x0226
        L_0x0224:
            r3.f5727a = r5
        L_0x0226:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.b.call():com.ironsource.sdk.l.b");
    }
}
