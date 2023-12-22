package com.google.android.gms.internal.gtm;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import i3.t;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;
import r3.o;

final class zzfg extends zzbu {
    /* access modifiers changed from: private */
    public static final byte[] zza = "\n".getBytes();
    private final String zzb = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{"GoogleAnalytics", zzbv.zza, Build.VERSION.RELEASE, zzfu.zzd(Locale.getDefault()), Build.MODEL, Build.ID});
    private final zzfq zzc;

    public zzfg(zzbx zzbx) {
        super(zzbx);
        this.zzc = new zzfq(zzbx.zzr());
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0076 A[SYNTHETIC, Splitter:B:34:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008a A[SYNTHETIC, Splitter:B:42:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzg(java.net.URL r5, byte[] r6, int r7) {
        /*
            r4 = this;
            java.lang.String r7 = "Error closing http post connection output stream"
            r3.o.h(r5)
            r3.o.h(r6)
            int r0 = r6.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "POST bytes, url"
            r4.zzG(r2, r1, r5)
            boolean r1 = com.google.android.gms.internal.gtm.zzbt.zzU()
            if (r1 == 0) goto L_0x0022
            java.lang.String r1 = new java.lang.String
            r1.<init>(r6)
            java.lang.String r2 = "Post payload\n"
            r4.zzO(r2, r1)
        L_0x0022:
            r1 = 0
            java.net.HttpURLConnection r5 = r4.zzb(r5)     // Catch:{ IOException -> 0x006d, all -> 0x006a }
            r2 = 1
            r5.setDoOutput(r2)     // Catch:{ IOException -> 0x0068 }
            r5.setFixedLengthStreamingMode(r0)     // Catch:{ IOException -> 0x0068 }
            r5.connect()     // Catch:{ IOException -> 0x0068 }
            java.io.OutputStream r0 = r5.getOutputStream()     // Catch:{ IOException -> 0x0068 }
            r0.write(r6)     // Catch:{ IOException -> 0x0063, all -> 0x0060 }
            r4.zzk(r5)     // Catch:{ IOException -> 0x0063, all -> 0x0060 }
            int r6 = r5.getResponseCode()     // Catch:{ IOException -> 0x0063, all -> 0x0060 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r6 != r1) goto L_0x004b
            com.google.android.gms.internal.gtm.zzbs r6 = r4.zzs()     // Catch:{ IOException -> 0x0063, all -> 0x0060 }
            r6.zzi()     // Catch:{ IOException -> 0x0063, all -> 0x0060 }
            r6 = r1
        L_0x004b:
            java.lang.String r1 = "POST status"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x0063, all -> 0x0060 }
            r4.zzF(r1, r2)     // Catch:{ IOException -> 0x0063, all -> 0x0060 }
            r0.close()     // Catch:{ IOException -> 0x0058 }
            goto L_0x005c
        L_0x0058:
            r0 = move-exception
            r4.zzJ(r7, r0)
        L_0x005c:
            r5.disconnect()
            return r6
        L_0x0060:
            r6 = move-exception
            r1 = r0
            goto L_0x0085
        L_0x0063:
            r6 = move-exception
            r1 = r0
            goto L_0x006f
        L_0x0066:
            r6 = move-exception
            goto L_0x0085
        L_0x0068:
            r6 = move-exception
            goto L_0x006f
        L_0x006a:
            r5 = move-exception
            r6 = r1
            goto L_0x0088
        L_0x006d:
            r6 = move-exception
            r5 = r1
        L_0x006f:
            java.lang.String r0 = "Network POST connection error"
            r4.zzR(r0, r6)     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x007e
            r1.close()     // Catch:{ IOException -> 0x007a }
            goto L_0x007e
        L_0x007a:
            r6 = move-exception
            r4.zzJ(r7, r6)
        L_0x007e:
            if (r5 == 0) goto L_0x0083
            r5.disconnect()
        L_0x0083:
            r5 = 0
            return r5
        L_0x0085:
            r3 = r6
            r6 = r5
            r5 = r3
        L_0x0088:
            if (r1 == 0) goto L_0x0092
            r1.close()     // Catch:{ IOException -> 0x008e }
            goto L_0x0092
        L_0x008e:
            r0 = move-exception
            r4.zzJ(r7, r0)
        L_0x0092:
            if (r6 == 0) goto L_0x0097
            r6.disconnect()
        L_0x0097:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfg.zzg(java.net.URL, byte[], int):int");
    }

    private final URL zzh() {
        zzw();
        String zzi = zzcv.zzi();
        zzw();
        try {
            return new URL(zzi.concat((String) zzew.zzt.zzb()));
        } catch (MalformedURLException e10) {
            zzJ("Error trying to parse the hardcoded host url", e10);
            return null;
        }
    }

    private final URL zzi(zzez zzez) {
        boolean zzh = zzez.zzh();
        zzw();
        String zzi = zzh ? zzcv.zzi() : zzcv.zzk();
        zzw();
        try {
            return new URL(zzi.concat(zzcv.zzj()));
        } catch (MalformedURLException e10) {
            zzJ("Error trying to parse the hardcoded host url", e10);
            return null;
        }
    }

    private final URL zzj(zzez zzez, String str) {
        String str2;
        StringBuilder sb;
        String str3;
        boolean zzh = zzez.zzh();
        zzw();
        if (zzh) {
            str2 = zzcv.zzi();
            zzw();
            str3 = zzcv.zzj();
            sb = new StringBuilder();
        } else {
            str2 = zzcv.zzk();
            zzw();
            str3 = zzcv.zzj();
            sb = new StringBuilder();
        }
        sb.append(str2);
        sb.append(str3);
        sb.append("?");
        sb.append(str);
        try {
            return new URL(sb.toString());
        } catch (MalformedURLException e10) {
            zzJ("Error trying to parse the hardcoded host url", e10);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x001f A[SYNTHETIC, Splitter:B:18:0x001f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzk(java.net.HttpURLConnection r4) {
        /*
            r3 = this;
            java.lang.String r0 = "Error closing http connection input stream"
            java.io.InputStream r4 = r4.getInputStream()     // Catch:{ all -> 0x001b }
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x0019 }
        L_0x000a:
            int r2 = r4.read(r1)     // Catch:{ all -> 0x0019 }
            if (r2 > 0) goto L_0x000a
            r4.close()     // Catch:{ IOException -> 0x0014 }
            return
        L_0x0014:
            r4 = move-exception
            r3.zzJ(r0, r4)
            return
        L_0x0019:
            r1 = move-exception
            goto L_0x001d
        L_0x001b:
            r1 = move-exception
            r4 = 0
        L_0x001d:
            if (r4 == 0) goto L_0x0027
            r4.close()     // Catch:{ IOException -> 0x0023 }
            goto L_0x0027
        L_0x0023:
            r4 = move-exception
            r3.zzJ(r0, r4)
        L_0x0027:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfg.zzk(java.net.HttpURLConnection):void");
    }

    private static final void zzl(StringBuilder sb, String str, String str2) {
        if (sb.length() != 0) {
            sb.append('&');
        }
        sb.append(URLEncoder.encode(str, "UTF-8"));
        sb.append('=');
        sb.append(URLEncoder.encode(str2, "UTF-8"));
    }

    public final String zza(zzez zzez, boolean z9) {
        o.h(zzez);
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry entry : zzez.zzg().entrySet()) {
                String str = (String) entry.getKey();
                if (!"ht".equals(str) && !"qt".equals(str) && !"AppUID".equals(str) && !"z".equals(str) && !"_gmsv".equals(str)) {
                    zzl(sb, str, (String) entry.getValue());
                }
            }
            zzl(sb, "ht", String.valueOf(zzez.zzd()));
            zzl(sb, "qt", String.valueOf(zzC().currentTimeMillis() - zzez.zzd()));
            zzw();
            if (z9) {
                long zzc2 = zzez.zzc();
                zzl(sb, "z", zzc2 != 0 ? String.valueOf(zzc2) : String.valueOf(zzez.zzb()));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e10) {
            zzJ("Failed to encode name or value", e10);
            return null;
        }
    }

    public final HttpURLConnection zzb(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzw();
            httpURLConnection.setConnectTimeout(((Integer) zzew.zzE.zzb()).intValue());
            zzw();
            httpURLConnection.setReadTimeout(((Integer) zzew.zzF.zzb()).intValue());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("User-Agent", this.zzb);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain http connection");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02ea, code lost:
        zzI(r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0310 A[EDGE_INSN: B:158:0x0310->B:152:0x0310 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01af A[SYNTHETIC, Splitter:B:73:0x01af] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01cc A[SYNTHETIC, Splitter:B:84:0x01cc] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0219  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List zzc(java.util.List r21) {
        /*
            r20 = this;
            r1 = r20
            java.lang.String r2 = "Error closing http compressed post connection output stream"
            i3.t.a()
            r20.zzV()
            r3.o.h(r21)
            com.google.android.gms.internal.gtm.zzcv r0 = r20.zzw()
            java.util.Set r0 = r0.zza()
            boolean r0 = r0.isEmpty()
            r3 = 1
            if (r0 != 0) goto L_0x0088
            com.google.android.gms.internal.gtm.zzfq r0 = r1.zzc
            r20.zzw()
            com.google.android.gms.internal.gtm.zzev r5 = com.google.android.gms.internal.gtm.zzew.zzC
            java.lang.Object r5 = r5.zzb()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            long r5 = (long) r5
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            boolean r0 = r0.zzc(r5)
            if (r0 != 0) goto L_0x0038
            goto L_0x0088
        L_0x0038:
            r20.zzw()
            com.google.android.gms.internal.gtm.zzev r0 = com.google.android.gms.internal.gtm.zzew.zzv
            java.lang.Object r0 = r0.zzb()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r5 = "BATCH_BY_SESSION"
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 == 0) goto L_0x004c
            goto L_0x006f
        L_0x004c:
            java.lang.String r5 = "BATCH_BY_TIME"
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 == 0) goto L_0x0055
            goto L_0x006f
        L_0x0055:
            java.lang.String r5 = "BATCH_BY_BRUTE_FORCE"
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 == 0) goto L_0x005e
            goto L_0x006f
        L_0x005e:
            java.lang.String r5 = "BATCH_BY_COUNT"
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 == 0) goto L_0x0067
            goto L_0x006f
        L_0x0067:
            java.lang.String r5 = "BATCH_BY_SIZE"
            boolean r0 = r5.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0071
        L_0x006f:
            r0 = r3
            goto L_0x0072
        L_0x0071:
            r0 = 0
        L_0x0072:
            r20.zzw()
            com.google.android.gms.internal.gtm.zzev r5 = com.google.android.gms.internal.gtm.zzew.zzw
            java.lang.Object r5 = r5.zzb()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "GZIP"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r3 == r5) goto L_0x0086
            goto L_0x0089
        L_0x0086:
            r5 = r3
            goto L_0x008a
        L_0x0088:
            r0 = 0
        L_0x0089:
            r5 = 0
        L_0x008a:
            r6 = 200(0xc8, float:2.8E-43)
            if (r0 == 0) goto L_0x0219
            boolean r0 = r21.isEmpty()
            r0 = r0 ^ r3
            r3.o.b(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            int r8 = r21.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "Uploading batched hits. compression, count"
            r1.zzP(r9, r0, r8)
            com.google.android.gms.internal.gtm.zzff r8 = new com.google.android.gms.internal.gtm.zzff
            r8.<init>(r1)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r0 = r21.iterator()
            r10 = 0
        L_0x00b6:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x00db
            java.lang.Object r11 = r0.next()
            com.google.android.gms.internal.gtm.zzez r11 = (com.google.android.gms.internal.gtm.zzez) r11
            boolean r12 = r8.zzb(r11)
            if (r12 != 0) goto L_0x00c9
            goto L_0x00db
        L_0x00c9:
            long r12 = r11.zzb()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r9.add(r12)
            if (r10 > 0) goto L_0x00b6
            int r10 = r11.zza()
            goto L_0x00b6
        L_0x00db:
            int r0 = r8.zza()
            if (r0 != 0) goto L_0x00e3
            goto L_0x0218
        L_0x00e3:
            java.net.URL r0 = r20.zzh()
            if (r0 != 0) goto L_0x00f0
            java.lang.String r0 = "Failed to build batching endpoint url"
            r1.zzI(r0)
            goto L_0x0214
        L_0x00f0:
            if (r5 == 0) goto L_0x01db
            byte[] r5 = r8.zzc()
            r3.o.h(r5)
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x01a5, all -> 0x019f }
            r10.<init>()     // Catch:{ IOException -> 0x01a5, all -> 0x019f }
            java.util.zip.GZIPOutputStream r11 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x01a5, all -> 0x019f }
            r11.<init>(r10)     // Catch:{ IOException -> 0x01a5, all -> 0x019f }
            r11.write(r5)     // Catch:{ IOException -> 0x01a5, all -> 0x019f }
            r11.close()     // Catch:{ IOException -> 0x01a5, all -> 0x019f }
            r10.close()     // Catch:{ IOException -> 0x01a5, all -> 0x019f }
            byte[] r10 = r10.toByteArray()     // Catch:{ IOException -> 0x01a5, all -> 0x019f }
            java.lang.String r11 = "POST compressed size, ratio %, url"
            int r12 = r10.length     // Catch:{ IOException -> 0x01a5, all -> 0x019f }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)     // Catch:{ IOException -> 0x01a5, all -> 0x019f }
            long r14 = (long) r12     // Catch:{ IOException -> 0x01a5, all -> 0x019f }
            int r7 = r5.length     // Catch:{ IOException -> 0x01a5, all -> 0x019f }
            r17 = 100
            long r14 = r14 * r17
            long r3 = (long) r7     // Catch:{ IOException -> 0x01a5, all -> 0x019f }
            long r14 = r14 / r3
            java.lang.Long r3 = java.lang.Long.valueOf(r14)     // Catch:{ IOException -> 0x01a5, all -> 0x019f }
            r1.zzH(r11, r13, r3, r0)     // Catch:{ IOException -> 0x01a5, all -> 0x019f }
            if (r12 <= r7) goto L_0x0131
            java.lang.String r3 = "Compressed payload is larger then uncompressed. compressed, uncompressed"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x01a5, all -> 0x019f }
            r1.zzS(r3, r13, r4)     // Catch:{ IOException -> 0x01a5, all -> 0x019f }
        L_0x0131:
            boolean r3 = com.google.android.gms.internal.gtm.zzbt.zzU()     // Catch:{ IOException -> 0x01a5, all -> 0x019f }
            if (r3 == 0) goto L_0x0152
            java.lang.String r3 = "Post payload"
            java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x01a5, all -> 0x019f }
            r4.<init>(r5)     // Catch:{ IOException -> 0x01a5, all -> 0x019f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01a5, all -> 0x019f }
            r5.<init>()     // Catch:{ IOException -> 0x01a5, all -> 0x019f }
            java.lang.String r7 = "\n"
            r5.append(r7)     // Catch:{ IOException -> 0x01a5, all -> 0x019f }
            r5.append(r4)     // Catch:{ IOException -> 0x01a5, all -> 0x019f }
            java.lang.String r4 = r5.toString()     // Catch:{ IOException -> 0x01a5, all -> 0x019f }
            r1.zzO(r3, r4)     // Catch:{ IOException -> 0x01a5, all -> 0x019f }
        L_0x0152:
            java.net.HttpURLConnection r3 = r1.zzb(r0)     // Catch:{ IOException -> 0x01a5, all -> 0x019f }
            r0 = 1
            r3.setDoOutput(r0)     // Catch:{ IOException -> 0x019d, all -> 0x0198 }
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r4 = "gzip"
            r3.addRequestProperty(r0, r4)     // Catch:{ IOException -> 0x019d, all -> 0x0198 }
            r3.setFixedLengthStreamingMode(r12)     // Catch:{ IOException -> 0x019d, all -> 0x0198 }
            r3.connect()     // Catch:{ IOException -> 0x019d, all -> 0x0198 }
            java.io.OutputStream r4 = r3.getOutputStream()     // Catch:{ IOException -> 0x019d, all -> 0x0198 }
            r4.write(r10)     // Catch:{ IOException -> 0x0195, all -> 0x0190 }
            r4.close()     // Catch:{ IOException -> 0x0195, all -> 0x0190 }
            r1.zzk(r3)     // Catch:{ IOException -> 0x019d, all -> 0x0198 }
            int r0 = r3.getResponseCode()     // Catch:{ IOException -> 0x019d, all -> 0x0198 }
            if (r0 != r6) goto L_0x0182
            com.google.android.gms.internal.gtm.zzbs r0 = r20.zzs()     // Catch:{ IOException -> 0x019d, all -> 0x0198 }
            r0.zzi()     // Catch:{ IOException -> 0x019d, all -> 0x0198 }
            r0 = r6
        L_0x0182:
            java.lang.String r4 = "POST status"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x019d, all -> 0x0198 }
            r1.zzF(r4, r5)     // Catch:{ IOException -> 0x019d, all -> 0x0198 }
            r3.disconnect()
            r4 = r0
            goto L_0x01e3
        L_0x0190:
            r0 = move-exception
            r7 = r3
            r16 = r4
            goto L_0x01c3
        L_0x0195:
            r0 = move-exception
            r7 = r4
            goto L_0x01a8
        L_0x0198:
            r0 = move-exception
            r7 = r3
            r16 = 0
            goto L_0x01c3
        L_0x019d:
            r0 = move-exception
            goto L_0x01a7
        L_0x019f:
            r0 = move-exception
            r3 = r0
            r7 = 0
            r16 = 0
            goto L_0x01ca
        L_0x01a5:
            r0 = move-exception
            r3 = 0
        L_0x01a7:
            r7 = 0
        L_0x01a8:
            java.lang.String r4 = "Network compressed POST connection error"
            r1.zzR(r4, r0)     // Catch:{ all -> 0x01bf }
            if (r7 == 0) goto L_0x01b8
            r7.close()     // Catch:{ IOException -> 0x01b3 }
            goto L_0x01b8
        L_0x01b3:
            r0 = move-exception
            r4 = r0
            r1.zzJ(r2, r4)
        L_0x01b8:
            if (r3 == 0) goto L_0x01bd
            r3.disconnect()
        L_0x01bd:
            r4 = 0
            goto L_0x01e3
        L_0x01bf:
            r0 = move-exception
            r16 = r7
            r7 = r3
        L_0x01c3:
            r3 = r0
            r19 = r16
            r16 = r7
            r7 = r19
        L_0x01ca:
            if (r7 == 0) goto L_0x01d5
            r7.close()     // Catch:{ IOException -> 0x01d0 }
            goto L_0x01d5
        L_0x01d0:
            r0 = move-exception
            r4 = r0
            r1.zzJ(r2, r4)
        L_0x01d5:
            if (r16 == 0) goto L_0x01da
            r16.disconnect()
        L_0x01da:
            throw r3
        L_0x01db:
            byte[] r2 = r8.zzc()
            int r4 = r1.zzg(r0, r2, r10)
        L_0x01e3:
            if (r4 != r6) goto L_0x01f3
            int r0 = r8.zza()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "Batched upload completed. Hits batched"
            r1.zzO(r2, r0)
            goto L_0x0218
        L_0x01f3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.String r2 = "Network error uploading hits. status code"
            r1.zzO(r2, r0)
            com.google.android.gms.internal.gtm.zzcv r2 = r20.zzw()
            java.util.Set r2 = r2.zza()
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0214
            java.lang.String r0 = "Server instructed the client to stop batching"
            r1.zzQ(r0)
            com.google.android.gms.internal.gtm.zzfq r0 = r1.zzc
            r0.zzb()
        L_0x0214:
            java.util.List r9 = java.util.Collections.emptyList()
        L_0x0218:
            return r9
        L_0x0219:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r0 = r21.size()
            r2.<init>(r0)
            java.util.Iterator r0 = r21.iterator()
        L_0x0226:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0310
            java.lang.Object r3 = r0.next()
            com.google.android.gms.internal.gtm.zzez r3 = (com.google.android.gms.internal.gtm.zzez) r3
            r3.o.h(r3)
            boolean r4 = r3.zzh()
            r5 = 1
            r4 = r4 ^ r5
            java.lang.String r4 = r1.zza(r3, r4)
            if (r4 != 0) goto L_0x024b
            com.google.android.gms.internal.gtm.zzfd r4 = r20.zzz()
            java.lang.String r7 = "Error formatting hit for upload"
            r4.zzb(r3, r7)
            goto L_0x0295
        L_0x024b:
            r20.zzw()
            com.google.android.gms.internal.gtm.zzev r7 = com.google.android.gms.internal.gtm.zzew.zzu
            java.lang.Object r7 = r7.zzb()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            int r8 = r4.length()
            if (r8 > r7) goto L_0x02b4
            java.net.URL r4 = r1.zzj(r3, r4)
            if (r4 != 0) goto L_0x026a
            java.lang.String r0 = "Failed to build collect GET endpoint url"
            goto L_0x02ea
        L_0x026a:
            java.lang.String r7 = "GET request"
            r1.zzF(r7, r4)
            java.net.HttpURLConnection r4 = r1.zzb(r4)     // Catch:{ IOException -> 0x02a0, all -> 0x029d }
            r4.connect()     // Catch:{ IOException -> 0x029a, all -> 0x0297 }
            r1.zzk(r4)     // Catch:{ IOException -> 0x029a, all -> 0x0297 }
            int r7 = r4.getResponseCode()     // Catch:{ IOException -> 0x029a, all -> 0x0297 }
            if (r7 != r6) goto L_0x0287
            com.google.android.gms.internal.gtm.zzbs r7 = r20.zzs()     // Catch:{ IOException -> 0x029a, all -> 0x0297 }
            r7.zzi()     // Catch:{ IOException -> 0x029a, all -> 0x0297 }
            r7 = r6
        L_0x0287:
            java.lang.String r8 = "GET status"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x029a, all -> 0x0297 }
            r1.zzF(r8, r9)     // Catch:{ IOException -> 0x029a, all -> 0x0297 }
            r4.disconnect()
            if (r7 != r6) goto L_0x0310
        L_0x0295:
            r4 = 0
            goto L_0x02f8
        L_0x0297:
            r0 = move-exception
            r7 = r4
            goto L_0x02ae
        L_0x029a:
            r0 = move-exception
            r7 = r4
            goto L_0x02a2
        L_0x029d:
            r0 = move-exception
            r7 = 0
            goto L_0x02ae
        L_0x02a0:
            r0 = move-exception
            r7 = 0
        L_0x02a2:
            java.lang.String r3 = "Network GET connection error"
            r1.zzR(r3, r0)     // Catch:{ all -> 0x02ad }
            if (r7 == 0) goto L_0x0310
            r7.disconnect()
            goto L_0x0310
        L_0x02ad:
            r0 = move-exception
        L_0x02ae:
            if (r7 == 0) goto L_0x02b3
            r7.disconnect()
        L_0x02b3:
            throw r0
        L_0x02b4:
            r4 = 0
            java.lang.String r7 = r1.zza(r3, r4)
            if (r7 != 0) goto L_0x02c2
            com.google.android.gms.internal.gtm.zzfd r7 = r20.zzz()
            java.lang.String r8 = "Error formatting hit for POST upload"
            goto L_0x02de
        L_0x02c2:
            byte[] r7 = r7.getBytes()
            int r8 = r7.length
            r20.zzw()
            com.google.android.gms.internal.gtm.zzev r9 = com.google.android.gms.internal.gtm.zzew.zzz
            java.lang.Object r9 = r9.zzb()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r8 <= r9) goto L_0x02e2
            com.google.android.gms.internal.gtm.zzfd r7 = r20.zzz()
            java.lang.String r8 = "Hit payload exceeds size limit"
        L_0x02de:
            r7.zzb(r3, r8)
            goto L_0x02f8
        L_0x02e2:
            java.net.URL r8 = r1.zzi(r3)
            if (r8 != 0) goto L_0x02ee
            java.lang.String r0 = "Failed to build collect POST endpoint url"
        L_0x02ea:
            r1.zzI(r0)
            goto L_0x0310
        L_0x02ee:
            int r9 = r3.zza()
            int r7 = r1.zzg(r8, r7, r9)
            if (r7 != r6) goto L_0x0310
        L_0x02f8:
            long r7 = r3.zzb()
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            r2.add(r3)
            int r3 = r2.size()
            r20.zzw()
            int r7 = com.google.android.gms.internal.gtm.zzcv.zzh()
            if (r3 < r7) goto L_0x0226
        L_0x0310:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfg.zzc(java.util.List):java.util.List");
    }

    public final void zzd() {
        zzO("Network initialized. User agent", this.zzb);
    }

    public final boolean zze() {
        NetworkInfo networkInfo;
        t.a();
        zzV();
        try {
            networkInfo = ((ConnectivityManager) zzo().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        zzN("No network connectivity");
        return false;
    }
}
