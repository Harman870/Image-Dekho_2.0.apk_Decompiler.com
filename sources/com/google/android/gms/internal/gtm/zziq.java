package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import w3.b;
import y3.a;

final class zziq implements zzgy {
    private final String zza;
    private final Context zzb;
    private final zzip zzc;
    private final Map zzd = new HashMap();
    private final Map zze = new HashMap();
    private final b zzf = a.P;

    public zziq(Context context, zzip zzip) {
        new zzio();
        this.zzb = context.getApplicationContext();
        this.zzc = zzip;
        String str = Build.VERSION.RELEASE;
        Locale locale = Locale.getDefault();
        String str2 = null;
        if (!(locale == null || locale.getLanguage() == null || locale.getLanguage().length() == 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append(locale.getLanguage().toLowerCase());
            if (!(locale.getCountry() == null || locale.getCountry().length() == 0)) {
                sb.append("-");
                sb.append(locale.getCountry().toLowerCase());
            }
            str2 = sb.toString();
        }
        this.zza = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{"GoogleTagManager", "5.06", str, str2, Build.MODEL, Build.ID});
    }

    public static final URL zzc(zzhb zzhb) {
        try {
            return new URL(zzhb.zze());
        } catch (MalformedURLException unused) {
            zzho.zza("Error trying to parse the GTM url.");
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v16, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v19, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v20, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v21, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v24, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v25, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v28, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v30, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v31, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v32, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v39, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r15v9, types: [java.lang.Object, java.lang.String] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r5v1, types: [int, boolean] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0285 A[SYNTHETIC, Splitter:B:119:0x0285] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0294 A[SYNTHETIC, Splitter:B:127:0x0294] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02a1 A[SYNTHETIC, Splitter:B:136:0x02a1] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0297 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02a4 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(java.util.List r18) {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = "GET"
            java.lang.String r3 = ": "
            int r0 = r18.size()
            r4 = 40
            int r4 = java.lang.Math.min(r0, r4)
            r5 = 1
            r8 = r5
            r7 = 0
        L_0x0013:
            if (r7 >= r4) goto L_0x034a
            r9 = r18
            java.lang.Object r0 = r9.get(r7)
            r10 = r0
            com.google.android.gms.internal.gtm.zzhb r10 = (com.google.android.gms.internal.gtm.zzhb) r10
            java.net.URL r11 = zzc(r10)
            if (r11 == 0) goto L_0x0061
            java.util.Map r0 = r1.zzd
            java.lang.String r12 = r11.toString()
            boolean r0 = r0.containsKey(r12)
            if (r0 == 0) goto L_0x0061
            java.util.Map r0 = r1.zzd
            java.lang.String r12 = r11.toString()
            java.lang.Object r0 = r0.get(r12)
            java.lang.Long r0 = (java.lang.Long) r0
            long r12 = r0.longValue()
            java.util.Map r0 = r1.zze
            java.lang.String r14 = r11.toString()
            java.lang.Object r0 = r0.get(r14)
            java.lang.Long r0 = (java.lang.Long) r0
            long r14 = r0.longValue()
            long r14 = r14 + r12
            w3.b r0 = r1.zzf
            long r12 = r0.currentTimeMillis()
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0061
            com.google.android.gms.internal.gtm.zzip r0 = r1.zzc
            r0.zzb(r10)
            goto L_0x0079
        L_0x0061:
            java.lang.String r0 = r10.zzd()
            java.util.Map r12 = r10.zzf()
            java.lang.String r13 = r10.zzc()
            if (r11 != 0) goto L_0x007c
            java.lang.String r0 = "No destination: discarding hit."
            com.google.android.gms.internal.gtm.zzho.zze(r0)
            com.google.android.gms.internal.gtm.zzip r0 = r1.zzc
            r0.zza(r10)
        L_0x0079:
            r15 = r5
            goto L_0x0345
        L_0x007c:
            java.net.URLConnection r14 = r11.openConnection()     // Catch:{ IOException -> 0x02aa }
            java.net.HttpURLConnection r14 = (java.net.HttpURLConnection) r14     // Catch:{ IOException -> 0x02aa }
            if (r8 == 0) goto L_0x00a2
            android.content.Context r8 = r1.zzb     // Catch:{ all -> 0x009d }
            android.content.Intent r15 = new android.content.Intent     // Catch:{ all -> 0x009d }
            java.lang.String r6 = "com.google.analytics.RADIO_POWERED"
            r15.<init>(r6)     // Catch:{ all -> 0x009d }
            java.lang.String r6 = r8.getPackageName()     // Catch:{ all -> 0x009d }
            r15.addCategory(r6)     // Catch:{ all -> 0x009d }
            java.lang.String r6 = com.google.android.gms.internal.gtm.zzhp.zza     // Catch:{ all -> 0x009d }
            r15.putExtra(r6, r5)     // Catch:{ all -> 0x009d }
            r8.sendBroadcast(r15)     // Catch:{ all -> 0x009d }
            goto L_0x00a2
        L_0x009d:
            r0 = move-exception
            r8 = r5
            r15 = r8
            goto L_0x029d
        L_0x00a2:
            java.lang.String r6 = "User-Agent"
            java.lang.String r8 = r1.zza     // Catch:{ all -> 0x029a }
            r14.setRequestProperty(r6, r8)     // Catch:{ all -> 0x029a }
            if (r12 == 0) goto L_0x00cf
            java.util.Set r6 = r12.entrySet()     // Catch:{ all -> 0x029a }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x029a }
        L_0x00b3:
            boolean r8 = r6.hasNext()     // Catch:{ all -> 0x029a }
            if (r8 == 0) goto L_0x00cf
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x029a }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ all -> 0x029a }
            java.lang.Object r12 = r8.getKey()     // Catch:{ all -> 0x029a }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x029a }
            java.lang.Object r8 = r8.getValue()     // Catch:{ all -> 0x029a }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x029a }
            r14.setRequestProperty(r12, r8)     // Catch:{ all -> 0x029a }
            goto L_0x00b3
        L_0x00cf:
            if (r0 != 0) goto L_0x00f7
            java.lang.String r0 = "Hit %d retrieved from the store has null HTTP method."
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x029a }
            long r12 = r10.zzb()     // Catch:{ all -> 0x029a }
            java.lang.Long r8 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x029a }
            r12 = 0
            r6[r12] = r8     // Catch:{ all -> 0x029a }
            java.lang.String r0 = java.lang.String.format(r0, r6)     // Catch:{ all -> 0x029a }
            com.google.android.gms.internal.gtm.zzho.zze(r0)     // Catch:{ all -> 0x029a }
            com.google.android.gms.internal.gtm.zzip r0 = r1.zzc     // Catch:{ all -> 0x029a }
            r0.zza(r10)     // Catch:{ all -> 0x029a }
        L_0x00ec:
            r14.disconnect()     // Catch:{ IOException -> 0x00f3 }
            r15 = r5
        L_0x00f0:
            r8 = 0
            goto L_0x0345
        L_0x00f3:
            r0 = move-exception
            r15 = r5
            goto L_0x028e
        L_0x00f7:
            boolean r6 = r0.equals(r2)     // Catch:{ all -> 0x029a }
            java.lang.String r8 = "POST"
            java.lang.String r12 = "PUT"
            java.lang.String r15 = "HEAD"
            if (r6 != 0) goto L_0x0129
            boolean r6 = r0.equals(r15)     // Catch:{ all -> 0x029a }
            if (r6 != 0) goto L_0x0129
            boolean r6 = r0.equals(r8)     // Catch:{ all -> 0x029a }
            if (r6 != 0) goto L_0x0129
            boolean r6 = r0.equals(r12)     // Catch:{ all -> 0x029a }
            if (r6 != 0) goto L_0x0129
            java.lang.String r6 = "Unrecongnized HTTP method %s. Supported methods are GET, HEAD, PUT and/or POST"
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x029a }
            r12 = 0
            r8[r12] = r0     // Catch:{ all -> 0x029a }
            java.lang.String r0 = java.lang.String.format(r6, r8)     // Catch:{ all -> 0x029a }
            com.google.android.gms.internal.gtm.zzho.zze(r0)     // Catch:{ all -> 0x029a }
            com.google.android.gms.internal.gtm.zzip r0 = r1.zzc     // Catch:{ all -> 0x029a }
            r0.zza(r10)     // Catch:{ all -> 0x029a }
            goto L_0x00ec
        L_0x0129:
            int r6 = r0.hashCode()     // Catch:{ all -> 0x029a }
            r5 = 2
            switch(r6) {
                case 70454: goto L_0x014a;
                case 79599: goto L_0x0142;
                case 2213344: goto L_0x013a;
                case 2461856: goto L_0x0132;
                default: goto L_0x0131;
            }
        L_0x0131:
            goto L_0x0152
        L_0x0132:
            boolean r6 = r0.equals(r8)
            if (r6 == 0) goto L_0x0152
            r12 = r5
            goto L_0x0153
        L_0x013a:
            boolean r6 = r0.equals(r15)
            if (r6 == 0) goto L_0x0152
            r12 = 1
            goto L_0x0153
        L_0x0142:
            boolean r6 = r0.equals(r12)
            if (r6 == 0) goto L_0x0152
            r12 = 3
            goto L_0x0153
        L_0x014a:
            boolean r6 = r0.equals(r2)
            if (r6 == 0) goto L_0x0152
            r12 = 0
            goto L_0x0153
        L_0x0152:
            r12 = -1
        L_0x0153:
            if (r12 == 0) goto L_0x018f
            r6 = 1
            if (r12 == r6) goto L_0x018f
            if (r12 == r5) goto L_0x0160
            r5 = 3
            if (r12 == r5) goto L_0x0160
        L_0x015d:
            r15 = r6
            r12 = 0
            goto L_0x01ac
        L_0x0160:
            r14.setRequestMethod(r0)     // Catch:{ all -> 0x018b }
            if (r13 == 0) goto L_0x015d
            r14.setDoOutput(r6)     // Catch:{ all -> 0x018b }
            java.lang.String r5 = "UTF-8"
            java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r5)     // Catch:{ all -> 0x01a3 }
            byte[] r5 = r13.getBytes(r5)     // Catch:{ all -> 0x01a3 }
            int r6 = r5.length     // Catch:{ all -> 0x01a3 }
            r14.setFixedLengthStreamingMode(r6)     // Catch:{ all -> 0x01a3 }
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x01a3 }
            java.io.OutputStream r8 = r14.getOutputStream()     // Catch:{ all -> 0x01a3 }
            r6.<init>(r8)     // Catch:{ all -> 0x01a3 }
            r6.write(r5)     // Catch:{ all -> 0x01a3 }
            r6.flush()     // Catch:{ all -> 0x01a3 }
            r6.close()     // Catch:{ all -> 0x01a3 }
            r12 = 0
            r15 = 1
            goto L_0x01ac
        L_0x018b:
            r0 = move-exception
            r15 = r6
            goto L_0x029c
        L_0x018f:
            if (r13 == 0) goto L_0x01a7
            java.lang.String r6 = "Body of %s hit is ignored: %s."
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x01a3 }
            r12 = 0
            r5[r12] = r0     // Catch:{ all -> 0x01a3 }
            r15 = 1
            r5[r15] = r13     // Catch:{ all -> 0x0298 }
            java.lang.String r5 = java.lang.String.format(r6, r5)     // Catch:{ all -> 0x0298 }
            com.google.android.gms.internal.gtm.zzho.zze(r5)     // Catch:{ all -> 0x0298 }
            goto L_0x01a9
        L_0x01a3:
            r0 = move-exception
            r15 = 1
            goto L_0x029c
        L_0x01a7:
            r12 = 0
            r15 = 1
        L_0x01a9:
            r14.setRequestMethod(r0)     // Catch:{ all -> 0x0298 }
        L_0x01ac:
            int r5 = r14.getResponseCode()     // Catch:{ all -> 0x0298 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0298 }
            r6.<init>()     // Catch:{ all -> 0x0298 }
            java.lang.String r8 = "Response code = "
            r6.append(r8)     // Catch:{ all -> 0x0298 }
            r6.append(r5)     // Catch:{ all -> 0x0298 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0298 }
            com.google.android.gms.internal.gtm.zzho.zzd(r6)     // Catch:{ all -> 0x0298 }
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 < r6) goto L_0x021e
            r6 = 300(0x12c, float:4.2E-43)
            if (r5 < r6) goto L_0x01cd
            goto L_0x021e
        L_0x01cd:
            java.io.InputStream r5 = r14.getInputStream()     // Catch:{ all -> 0x0298 }
            java.lang.String r6 = r11.toString()     // Catch:{ all -> 0x0218 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0218 }
            r8.<init>()     // Catch:{ all -> 0x0218 }
            java.lang.String r13 = "Hit sent to "
            r8.append(r13)     // Catch:{ all -> 0x0218 }
            r8.append(r6)     // Catch:{ all -> 0x0218 }
            java.lang.String r6 = "(method = "
            r8.append(r6)     // Catch:{ all -> 0x0218 }
            r8.append(r0)     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = ")"
            r8.append(r0)     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x0218 }
            com.google.android.gms.internal.gtm.zzho.zzd(r0)     // Catch:{ all -> 0x0218 }
            com.google.android.gms.internal.gtm.zzip r0 = r1.zzc     // Catch:{ all -> 0x0218 }
            com.google.android.gms.internal.gtm.zzhq r0 = (com.google.android.gms.internal.gtm.zzhq) r0     // Catch:{ all -> 0x0218 }
            com.google.android.gms.internal.gtm.zzhs r0 = r0.zza     // Catch:{ all -> 0x0218 }
            long r12 = r10.zzb()     // Catch:{ all -> 0x0218 }
            r0.zzo(r12)     // Catch:{ all -> 0x0218 }
            java.util.Map r0 = r1.zzd     // Catch:{ all -> 0x0218 }
            java.lang.String r6 = r11.toString()     // Catch:{ all -> 0x0218 }
            r0.remove(r6)     // Catch:{ all -> 0x0218 }
            java.util.Map r0 = r1.zze     // Catch:{ all -> 0x0218 }
            java.lang.String r6 = r11.toString()     // Catch:{ all -> 0x0218 }
            r0.remove(r6)     // Catch:{ all -> 0x0218 }
            r16 = r5
            goto L_0x0283
        L_0x0218:
            r0 = move-exception
            r16 = r5
            r8 = 0
            goto L_0x029f
        L_0x021e:
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x0298 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0298 }
            r6.<init>()     // Catch:{ all -> 0x0298 }
            java.lang.String r8 = "Bad response received for "
            r6.append(r8)     // Catch:{ all -> 0x0298 }
            r6.append(r0)     // Catch:{ all -> 0x0298 }
            r6.append(r3)     // Catch:{ all -> 0x0298 }
            r6.append(r5)     // Catch:{ all -> 0x0298 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0298 }
            com.google.android.gms.internal.gtm.zzho.zze(r0)     // Catch:{ all -> 0x0298 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0298 }
            r0.<init>()     // Catch:{ all -> 0x0298 }
            java.io.InputStream r5 = r14.getErrorStream()     // Catch:{ all -> 0x0290 }
            if (r5 == 0) goto L_0x0276
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ all -> 0x0290 }
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ all -> 0x0290 }
            r8.<init>(r5)     // Catch:{ all -> 0x0290 }
            r6.<init>(r8)     // Catch:{ all -> 0x0290 }
        L_0x0251:
            java.lang.String r5 = r6.readLine()     // Catch:{ all -> 0x0274 }
            if (r5 == 0) goto L_0x025b
            r0.append(r5)     // Catch:{ all -> 0x0274 }
            goto L_0x0251
        L_0x025b:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0274 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0274 }
            r5.<init>()     // Catch:{ all -> 0x0274 }
            java.lang.String r8 = "Error Message: "
            r5.append(r8)     // Catch:{ all -> 0x0274 }
            r5.append(r0)     // Catch:{ all -> 0x0274 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0274 }
            com.google.android.gms.internal.gtm.zzho.zze(r0)     // Catch:{ all -> 0x0274 }
            goto L_0x0277
        L_0x0274:
            r0 = move-exception
            goto L_0x0292
        L_0x0276:
            r6 = 0
        L_0x0277:
            if (r6 == 0) goto L_0x027c
            r6.close()     // Catch:{ all -> 0x0298 }
        L_0x027c:
            com.google.android.gms.internal.gtm.zzip r0 = r1.zzc     // Catch:{ all -> 0x0298 }
            r0.zzb(r10)     // Catch:{ all -> 0x0298 }
            r16 = 0
        L_0x0283:
            if (r16 == 0) goto L_0x0288
            r16.close()     // Catch:{ IOException -> 0x028d }
        L_0x0288:
            r14.disconnect()     // Catch:{ IOException -> 0x028d }
            goto L_0x00f0
        L_0x028d:
            r0 = move-exception
        L_0x028e:
            r8 = 0
            goto L_0x02ac
        L_0x0290:
            r0 = move-exception
            r6 = 0
        L_0x0292:
            if (r6 == 0) goto L_0x0297
            r6.close()     // Catch:{ all -> 0x0298 }
        L_0x0297:
            throw r0     // Catch:{ all -> 0x0298 }
        L_0x0298:
            r0 = move-exception
            goto L_0x029c
        L_0x029a:
            r0 = move-exception
            r15 = r5
        L_0x029c:
            r8 = 0
        L_0x029d:
            r16 = 0
        L_0x029f:
            if (r16 == 0) goto L_0x02a4
            r16.close()     // Catch:{ IOException -> 0x02a8 }
        L_0x02a4:
            r14.disconnect()     // Catch:{ IOException -> 0x02a8 }
            throw r0     // Catch:{ IOException -> 0x02a8 }
        L_0x02a8:
            r0 = move-exception
            goto L_0x02ac
        L_0x02aa:
            r0 = move-exception
            r15 = r5
        L_0x02ac:
            java.lang.String r5 = r11.toString()
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = r6.getSimpleName()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Exception sending hit to "
            r12.append(r13)
            r12.append(r5)
            r12.append(r3)
            r12.append(r6)
            java.lang.String r5 = r12.toString()
            com.google.android.gms.internal.gtm.zzho.zze(r5)
            java.lang.String r0 = r0.getMessage()
            com.google.android.gms.internal.gtm.zzho.zze(r0)
            com.google.android.gms.internal.gtm.zzip r0 = r1.zzc
            r0.zzb(r10)
            java.util.Map r0 = r1.zze
            java.lang.String r5 = r11.toString()
            w3.b r6 = r1.zzf
            long r12 = r6.currentTimeMillis()
            java.lang.Long r6 = java.lang.Long.valueOf(r12)
            r0.put(r5, r6)
            java.util.Map r0 = r1.zzd
            java.lang.String r5 = r11.toString()
            boolean r0 = r0.containsKey(r5)
            if (r0 == 0) goto L_0x0316
            java.util.Map r0 = r1.zzd
            java.lang.String r5 = r11.toString()
            java.lang.Object r0 = r0.get(r5)
            java.lang.Long r0 = (java.lang.Long) r0
            long r5 = r0.longValue()
            long r5 = r5 + r5
            r12 = 600000(0x927c0, double:2.964394E-318)
            long r5 = java.lang.Math.min(r5, r12)
            goto L_0x0318
        L_0x0316:
            r5 = 5000(0x1388, double:2.4703E-320)
        L_0x0318:
            java.util.Map r0 = r1.zzd
            java.lang.String r10 = r11.toString()
            java.lang.Long r12 = java.lang.Long.valueOf(r5)
            r0.put(r10, r12)
            java.lang.String r0 = r11.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "URL resulting in exception can be retried in "
            r10.append(r11)
            r10.append(r5)
            java.lang.String r5 = "ms. URL: "
            r10.append(r5)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            com.google.android.gms.internal.gtm.zzho.zze(r0)
        L_0x0345:
            int r7 = r7 + 1
            r5 = r15
            goto L_0x0013
        L_0x034a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zziq.zza(java.util.List):void");
    }

    public final boolean zzb() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.zzb.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        zzho.zzd("...no network connectivity");
        return false;
    }
}
