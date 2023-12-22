package com.google.android.gms.internal.gtm;

import android.content.Context;
import i3.i;
import j3.a;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r3.o;

public final class zzpg extends zzjy {
    private static final List zzb = Arrays.asList(new String[]{"detail", "checkout", "checkout_option", "click", "add", "remove", "purchase", "refund"});
    private static final Pattern zzc = Pattern.compile("dimension(\\d+)");
    private static final Pattern zzd = Pattern.compile("metric(\\d+)");
    private static final zzsx zze = zzsx.zzi("", "0", "false");
    private static final zzsw zzf = zzsw.zzc("transactionId", "&ti", "transactionAffiliation", "&ta", "transactionTax", "&tt", "transactionShipping", "&ts", "transactionTotal", "&tr", "transactionCurrency", "&cu");
    private static final zzsw zzg = zzsw.zzc("name", "&in", "sku", "&ic", "category", "&iv", "price", "&ip", "quantity", "&iq", "currency", "&cu");
    private final zzjs zzh;
    private final zzib zzi;
    private Map zzj;

    static {
        zza.UNIVERSAL_ANALYTICS.toString();
    }

    public zzpg(Context context, zzib zzib) {
        zzjs zzjs = new zzjs(context);
        this.zzi = zzib;
        this.zzh = zzjs;
    }

    private static final Map zzb(zzqz zzqz) {
        o.h(zzqz);
        o.b(zzqz instanceof zzrh);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zzrl.zze(zzqz);
        Object zzg2 = zzrl.zzg(zzqz);
        o.k(zzg2 instanceof Map);
        for (Map.Entry entry : ((Map) zzg2).entrySet()) {
            linkedHashMap.put(entry.getKey().toString(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    private static final Double zzc(Object obj) {
        if (obj instanceof String) {
            try {
                return Double.valueOf((String) obj);
            } catch (NumberFormatException e10) {
                throw new RuntimeException("Cannot convert the object to Double: ".concat(String.valueOf(e10.getMessage())));
            }
        } else if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        } else {
            if (obj instanceof Double) {
                return (Double) obj;
            }
            throw new RuntimeException("Cannot convert the object to Double: ".concat(String.valueOf(obj.toString())));
        }
    }

    private static final Integer zze(Object obj) {
        if (obj instanceof String) {
            try {
                return Integer.valueOf((String) obj);
            } catch (NumberFormatException e10) {
                throw new RuntimeException("Cannot convert the object to Integer: ".concat(String.valueOf(e10.getMessage())));
            }
        } else if (obj instanceof Double) {
            return Integer.valueOf(((Double) obj).intValue());
        } else {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            throw new RuntimeException("Cannot convert the object to Integer: ".concat(String.valueOf(obj.toString())));
        }
    }

    private static final Map zzf(zzqz zzqz) {
        Map zzb2 = zzb(zzqz);
        String str = (String) zzb2.get("&aip");
        if (str != null && zze.contains(str.toLowerCase())) {
            zzb2.remove("&aip");
        }
        return zzb2;
    }

    private static final a zzg(Map map) {
        String valueOf;
        String str;
        a aVar = new a();
        Object obj = map.get("id");
        if (obj != null) {
            aVar.b("id", obj.toString());
        }
        Object obj2 = map.get("name");
        if (obj2 != null) {
            aVar.b("nm", obj2.toString());
        }
        Object obj3 = map.get("brand");
        if (obj3 != null) {
            aVar.b("br", obj3.toString());
        }
        Object obj4 = map.get("category");
        if (obj4 != null) {
            aVar.b("ca", obj4.toString());
        }
        Object obj5 = map.get("variant");
        if (obj5 != null) {
            aVar.b("va", obj5.toString());
        }
        Object obj6 = map.get("coupon");
        if (obj6 != null) {
            aVar.b("cc", obj6.toString());
        }
        Object obj7 = map.get("position");
        if (obj7 != null) {
            aVar.b("ps", Integer.toString(zze(obj7).intValue()));
        }
        Object obj8 = map.get("price");
        if (obj8 != null) {
            aVar.b("pr", Double.toString(zzc(obj8).doubleValue()));
        }
        Object obj9 = map.get("quantity");
        if (obj9 != null) {
            aVar.b("qt", Integer.toString(zze(obj9).intValue()));
        }
        for (String str2 : map.keySet()) {
            Matcher matcher = zzc.matcher(str2);
            if (matcher.matches()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    aVar.b(i.a(parseInt, "cd"), String.valueOf(map.get(str2)));
                } catch (NumberFormatException unused) {
                    valueOf = String.valueOf(str2);
                    str = "illegal number in custom dimension value: ";
                    zzho.zze(str.concat(valueOf));
                }
            } else {
                Matcher matcher2 = zzd.matcher(str2);
                if (matcher2.matches()) {
                    try {
                        int parseInt2 = Integer.parseInt(matcher2.group(1));
                        aVar.b(i.a(parseInt2, "cm"), Integer.toString(zze(map.get(str2)).intValue()));
                    } catch (NumberFormatException unused2) {
                        valueOf = String.valueOf(str2);
                        str = "illegal number in custom metric value: ";
                        zzho.zze(str.concat(valueOf));
                    }
                }
            }
        }
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:138:0x020e, code lost:
        r6 = (java.util.Map) r9.get(r4);
        r0 = (java.util.List) r6.get("products");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x021d, code lost:
        if (r0 == null) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x021f, code lost:
        r9 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0227, code lost:
        if (r9.hasNext() == false) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        r0 = zzg((java.util.Map) r9.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0233, code lost:
        if (r0 != null) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0235, code lost:
        com.google.android.gms.internal.gtm.zzfc.zze("product should be non-null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x023b, code lost:
        r5.f7130e.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0241, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        com.google.android.gms.internal.gtm.zzho.zza("Failed to extract a product from event data. ".concat(java.lang.String.valueOf(r0.getMessage())));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0256, code lost:
        if (r6.containsKey("actionField") == false) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0258, code lost:
        r0 = (java.util.Map) r6.get("actionField");
        r2 = new j3.b(r4);
        r3 = r0.get("id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0267, code lost:
        if (r3 == null) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0269, code lost:
        r2.a("&ti", r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0270, code lost:
        r3 = r0.get("affiliation");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0276, code lost:
        if (r3 == null) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0278, code lost:
        r2.a("&ta", r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0281, code lost:
        r3 = r0.get("coupon");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0287, code lost:
        if (r3 == null) goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0289, code lost:
        r2.a("&tcc", r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0292, code lost:
        r3 = r0.get("list");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0296, code lost:
        if (r3 == null) goto L_0x02a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0298, code lost:
        r2.a("&pal", r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02a1, code lost:
        r3 = r0.get("option");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02a7, code lost:
        if (r3 == null) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02a9, code lost:
        r2.a("&col", r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02b2, code lost:
        r3 = r0.get(com.ironsource.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_REVENUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02b8, code lost:
        if (r3 == null) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02ba, code lost:
        r2.a("&tr", java.lang.Double.toString(zzc(r3).doubleValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02cb, code lost:
        r3 = r0.get("tax");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02d1, code lost:
        if (r3 == null) goto L_0x02e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02d3, code lost:
        r2.a("&tt", java.lang.Double.toString(zzc(r3).doubleValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x02e4, code lost:
        r3 = r0.get("shipping");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x02ea, code lost:
        if (r3 == null) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02ec, code lost:
        r2.a("&ts", java.lang.Double.toString(zzc(r3).doubleValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x02fd, code lost:
        r0 = r0.get("step");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0303, code lost:
        if (r0 == null) goto L_0x031c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0305, code lost:
        r2.a("&cos", java.lang.Integer.toString(zze(r0).intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0317, code lost:
        r2 = new j3.b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x031c, code lost:
        r5.f7127b = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x031f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:?, code lost:
        com.google.android.gms.internal.gtm.zzho.zza("Failed to extract a product action from event data. ".concat(java.lang.String.valueOf(r0.getMessage())));
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x017e A[SYNTHETIC, Splitter:B:104:0x017e] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0202 A[Catch:{ RuntimeException -> 0x0145, all -> 0x046b }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0336 A[Catch:{ RuntimeException -> 0x0145, all -> 0x046b }] */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0331 A[EDGE_INSN: B:264:0x0331->B:187:0x0331 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009c A[Catch:{ RuntimeException -> 0x0145, all -> 0x046b }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a9 A[Catch:{ RuntimeException -> 0x0145, all -> 0x046b }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d0 A[SYNTHETIC, Splitter:B:62:0x00d0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.gtm.zzqz zza(com.google.android.gms.internal.gtm.zzie r19, com.google.android.gms.internal.gtm.zzqz... r20) {
        /*
            r18 = this;
            r1 = r18
            r0 = r20
            java.lang.String r2 = "actionField"
            java.lang.String r3 = "promoView"
            java.lang.String r4 = "&cu"
            java.lang.String r5 = "&t"
            java.lang.String r6 = "promoClick"
            int r7 = r0.length
            r8 = 1
            r9 = 0
            if (r7 <= 0) goto L_0x0015
            r10 = r8
            goto L_0x0016
        L_0x0015:
            r10 = r9
        L_0x0016:
            r3.o.b(r10)
            com.google.android.gms.internal.gtm.zzib r11 = r1.zzi     // Catch:{ all -> 0x046b }
            com.google.android.gms.internal.gtm.zzgz r11 = r11.zza()     // Catch:{ all -> 0x046b }
            android.os.Bundle r11 = r11.zza()     // Catch:{ all -> 0x046b }
            java.util.Map r11 = com.google.android.gms.internal.gtm.zzrl.zzh(r11)     // Catch:{ all -> 0x046b }
            r1.zzj = r11     // Catch:{ all -> 0x046b }
            r11 = r0[r9]     // Catch:{ all -> 0x046b }
            if (r7 <= r8) goto L_0x0030
            r12 = r0[r8]     // Catch:{ all -> 0x046b }
            goto L_0x0037
        L_0x0030:
            com.google.android.gms.internal.gtm.zzra r12 = new com.google.android.gms.internal.gtm.zzra     // Catch:{ all -> 0x046b }
            java.lang.Boolean r13 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x046b }
            r12.<init>(r13)     // Catch:{ all -> 0x046b }
        L_0x0037:
            r13 = 2
            if (r7 <= r13) goto L_0x003d
            r13 = r0[r13]     // Catch:{ all -> 0x046b }
            goto L_0x0044
        L_0x003d:
            com.google.android.gms.internal.gtm.zzra r13 = new com.google.android.gms.internal.gtm.zzra     // Catch:{ all -> 0x046b }
            java.lang.Boolean r14 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x046b }
            r13.<init>(r14)     // Catch:{ all -> 0x046b }
        L_0x0044:
            r14 = 3
            if (r7 <= r14) goto L_0x004a
            r14 = r0[r14]     // Catch:{ all -> 0x046b }
            goto L_0x004c
        L_0x004a:
            com.google.android.gms.internal.gtm.zzrd r14 = com.google.android.gms.internal.gtm.zzrd.zze     // Catch:{ all -> 0x046b }
        L_0x004c:
            r15 = 4
            if (r7 <= r15) goto L_0x0052
            r15 = r0[r15]     // Catch:{ all -> 0x046b }
            goto L_0x0054
        L_0x0052:
            com.google.android.gms.internal.gtm.zzrd r15 = com.google.android.gms.internal.gtm.zzrd.zze     // Catch:{ all -> 0x046b }
        L_0x0054:
            r8 = 5
            if (r7 <= r8) goto L_0x005a
            r8 = r0[r8]     // Catch:{ all -> 0x046b }
            goto L_0x0061
        L_0x005a:
            com.google.android.gms.internal.gtm.zzra r8 = new com.google.android.gms.internal.gtm.zzra     // Catch:{ all -> 0x046b }
            java.lang.Boolean r9 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x046b }
            r8.<init>(r9)     // Catch:{ all -> 0x046b }
        L_0x0061:
            r9 = 6
            if (r7 <= r9) goto L_0x0067
            r9 = r0[r9]     // Catch:{ all -> 0x046b }
            goto L_0x006e
        L_0x0067:
            com.google.android.gms.internal.gtm.zzra r9 = new com.google.android.gms.internal.gtm.zzra     // Catch:{ all -> 0x046b }
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x046b }
            r9.<init>(r10)     // Catch:{ all -> 0x046b }
        L_0x006e:
            r10 = 7
            if (r7 <= r10) goto L_0x0074
            r10 = r0[r10]     // Catch:{ all -> 0x046b }
            goto L_0x0076
        L_0x0074:
            com.google.android.gms.internal.gtm.zzrd r10 = com.google.android.gms.internal.gtm.zzrd.zze     // Catch:{ all -> 0x046b }
        L_0x0076:
            r17 = r5
            r5 = 8
            if (r7 <= r5) goto L_0x007f
            r0 = r0[r5]     // Catch:{ all -> 0x046b }
            goto L_0x0086
        L_0x007f:
            com.google.android.gms.internal.gtm.zzra r0 = new com.google.android.gms.internal.gtm.zzra     // Catch:{ all -> 0x046b }
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x046b }
            r0.<init>(r5)     // Catch:{ all -> 0x046b }
        L_0x0086:
            boolean r5 = r11 instanceof com.google.android.gms.internal.gtm.zzrh     // Catch:{ all -> 0x046b }
            r3.o.b(r5)     // Catch:{ all -> 0x046b }
            com.google.android.gms.internal.gtm.zzrd r5 = com.google.android.gms.internal.gtm.zzrd.zze     // Catch:{ all -> 0x046b }
            if (r14 == r5) goto L_0x0096
            boolean r7 = r14 instanceof com.google.android.gms.internal.gtm.zzrh     // Catch:{ all -> 0x046b }
            if (r7 == 0) goto L_0x0094
            goto L_0x0096
        L_0x0094:
            r7 = 0
            goto L_0x0097
        L_0x0096:
            r7 = 1
        L_0x0097:
            r3.o.b(r7)     // Catch:{ all -> 0x046b }
            if (r15 == r5) goto L_0x00a3
            boolean r7 = r15 instanceof com.google.android.gms.internal.gtm.zzrh     // Catch:{ all -> 0x046b }
            if (r7 == 0) goto L_0x00a1
            goto L_0x00a3
        L_0x00a1:
            r7 = 0
            goto L_0x00a4
        L_0x00a3:
            r7 = 1
        L_0x00a4:
            r3.o.b(r7)     // Catch:{ all -> 0x046b }
            if (r10 == r5) goto L_0x00b1
            boolean r7 = r10 instanceof com.google.android.gms.internal.gtm.zzrh     // Catch:{ all -> 0x046b }
            if (r7 == 0) goto L_0x00ae
            goto L_0x00b1
        L_0x00ae:
            r16 = 0
            goto L_0x00b3
        L_0x00b1:
            r16 = 1
        L_0x00b3:
            r3.o.b(r16)     // Catch:{ all -> 0x046b }
            com.google.android.gms.internal.gtm.zzjs r7 = r1.zzh     // Catch:{ all -> 0x046b }
            r16 = r15
            java.lang.String r15 = "_GTM_DEFAULT_TRACKER_"
            i3.f r7 = r7.zza(r15)     // Catch:{ all -> 0x046b }
            boolean r0 = com.google.android.gms.internal.gtm.zzjx.zzg(r0)     // Catch:{ all -> 0x046b }
            r7.f7131a = r0     // Catch:{ all -> 0x046b }
            boolean r0 = com.google.android.gms.internal.gtm.zzjx.zzg(r8)     // Catch:{ all -> 0x046b }
            java.lang.String r8 = "&ti"
            java.lang.String r15 = "name"
            if (r0 == 0) goto L_0x0336
            i3.d r5 = new i3.d     // Catch:{ all -> 0x046b }
            r5.<init>()     // Catch:{ all -> 0x046b }
            java.util.Map r0 = zzf(r11)     // Catch:{ all -> 0x046b }
            if (r0 != 0) goto L_0x00dc
            goto L_0x00e6
        L_0x00dc:
            java.util.HashMap r11 = r5.f7126a     // Catch:{ all -> 0x046b }
            java.util.HashMap r12 = new java.util.HashMap     // Catch:{ all -> 0x046b }
            r12.<init>(r0)     // Catch:{ all -> 0x046b }
            r11.putAll(r12)     // Catch:{ all -> 0x046b }
        L_0x00e6:
            boolean r9 = com.google.android.gms.internal.gtm.zzjx.zzg(r9)     // Catch:{ all -> 0x046b }
            if (r9 == 0) goto L_0x00f5
            java.util.Map r9 = r1.zzj     // Catch:{ all -> 0x046b }
            java.lang.String r10 = "ecommerce"
            java.lang.Object r9 = r9.get(r10)     // Catch:{ all -> 0x046b }
            goto L_0x00fc
        L_0x00f5:
            com.google.android.gms.internal.gtm.zzrl.zze(r10)     // Catch:{ all -> 0x046b }
            java.lang.Object r9 = com.google.android.gms.internal.gtm.zzrl.zzg(r10)     // Catch:{ all -> 0x046b }
        L_0x00fc:
            boolean r10 = r9 instanceof java.util.Map     // Catch:{ all -> 0x046b }
            if (r10 == 0) goto L_0x0331
            java.util.Map r9 = (java.util.Map) r9     // Catch:{ all -> 0x046b }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x046b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x046b }
            if (r0 != 0) goto L_0x0112
            java.lang.String r0 = "currencyCode"
            java.lang.Object r0 = r9.get(r0)     // Catch:{ all -> 0x046b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x046b }
        L_0x0112:
            if (r0 == 0) goto L_0x0117
            r5.c(r4, r0)     // Catch:{ all -> 0x046b }
        L_0x0117:
            java.lang.String r0 = "impressions"
            java.lang.Object r0 = r9.get(r0)     // Catch:{ all -> 0x046b }
            boolean r4 = r0 instanceof java.util.List     // Catch:{ all -> 0x046b }
            java.lang.String r10 = "Failed to extract a product from event data. "
            java.lang.String r11 = "list"
            if (r4 == 0) goto L_0x0156
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x046b }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x046b }
        L_0x012b:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x0156
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x046b }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x046b }
            j3.a r12 = zzg(r0)     // Catch:{ RuntimeException -> 0x0145 }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ RuntimeException -> 0x0145 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ RuntimeException -> 0x0145 }
            r5.a(r12, r0)     // Catch:{ RuntimeException -> 0x0145 }
            goto L_0x012b
        L_0x0145:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x046b }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x046b }
            java.lang.String r0 = r10.concat(r0)     // Catch:{ all -> 0x046b }
            com.google.android.gms.internal.gtm.zzho.zza(r0)     // Catch:{ all -> 0x046b }
            goto L_0x012b
        L_0x0156:
            boolean r0 = r9.containsKey(r6)     // Catch:{ all -> 0x046b }
            java.lang.String r4 = "promotions"
            if (r0 == 0) goto L_0x0169
            java.lang.Object r0 = r9.get(r6)     // Catch:{ all -> 0x046b }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x046b }
        L_0x0164:
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x046b }
            goto L_0x0176
        L_0x0169:
            boolean r0 = r9.containsKey(r3)     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x0179
            java.lang.Object r0 = r9.get(r3)     // Catch:{ all -> 0x046b }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x046b }
            goto L_0x0164
        L_0x0176:
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x046b }
            goto L_0x017a
        L_0x0179:
            r0 = 0
        L_0x017a:
            java.lang.String r3 = "id"
            if (r0 == 0) goto L_0x01f6
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x046b }
        L_0x0182:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x01e2
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x046b }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x046b }
            j3.c r12 = new j3.c     // Catch:{ RuntimeException -> 0x01cf }
            r12.<init>()     // Catch:{ RuntimeException -> 0x01cf }
            java.lang.Object r13 = r0.get(r3)     // Catch:{ RuntimeException -> 0x01cf }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ RuntimeException -> 0x01cf }
            if (r13 == 0) goto L_0x019e
            r12.b(r3, r13)     // Catch:{ RuntimeException -> 0x01cf }
        L_0x019e:
            java.lang.Object r13 = r0.get(r15)     // Catch:{ RuntimeException -> 0x01cf }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ RuntimeException -> 0x01cf }
            if (r13 == 0) goto L_0x01ab
            java.lang.String r14 = "nm"
            r12.b(r14, r13)     // Catch:{ RuntimeException -> 0x01cf }
        L_0x01ab:
            java.lang.String r13 = "creative"
            java.lang.Object r13 = r0.get(r13)     // Catch:{ RuntimeException -> 0x01cf }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ RuntimeException -> 0x01cf }
            if (r13 == 0) goto L_0x01ba
            java.lang.String r14 = "cr"
            r12.b(r14, r13)     // Catch:{ RuntimeException -> 0x01cf }
        L_0x01ba:
            java.lang.String r13 = "position"
            java.lang.Object r0 = r0.get(r13)     // Catch:{ RuntimeException -> 0x01cf }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ RuntimeException -> 0x01cf }
            if (r0 == 0) goto L_0x01c9
            java.lang.String r13 = "ps"
            r12.b(r13, r0)     // Catch:{ RuntimeException -> 0x01cf }
        L_0x01c9:
            java.util.ArrayList r0 = r5.f7129d     // Catch:{ RuntimeException -> 0x01cf }
            r0.add(r12)     // Catch:{ RuntimeException -> 0x01cf }
            goto L_0x0182
        L_0x01cf:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x046b }
            java.lang.String r12 = "Failed to extract a promotion from event data. "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x046b }
            java.lang.String r0 = r12.concat(r0)     // Catch:{ all -> 0x046b }
            com.google.android.gms.internal.gtm.zzho.zza(r0)     // Catch:{ all -> 0x046b }
            goto L_0x0182
        L_0x01e2:
            boolean r0 = r9.containsKey(r6)     // Catch:{ all -> 0x046b }
            java.lang.String r4 = "&promoa"
            if (r0 == 0) goto L_0x01f1
            java.lang.String r0 = "click"
            r5.c(r4, r0)     // Catch:{ all -> 0x046b }
            goto L_0x0331
        L_0x01f1:
            java.lang.String r0 = "view"
            r5.c(r4, r0)     // Catch:{ all -> 0x046b }
        L_0x01f6:
            java.util.List r0 = zzb     // Catch:{ all -> 0x046b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x046b }
        L_0x01fc:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x046b }
            if (r4 == 0) goto L_0x0331
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x046b }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x046b }
            boolean r6 = r9.containsKey(r4)     // Catch:{ all -> 0x046b }
            if (r6 == 0) goto L_0x01fc
            java.lang.Object r0 = r9.get(r4)     // Catch:{ all -> 0x046b }
            r6 = r0
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ all -> 0x046b }
            java.lang.String r0 = "products"
            java.lang.Object r0 = r6.get(r0)     // Catch:{ all -> 0x046b }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x0252
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x046b }
        L_0x0223:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x0252
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x046b }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x046b }
            j3.a r0 = zzg(r0)     // Catch:{ RuntimeException -> 0x0241 }
            if (r0 != 0) goto L_0x023b
            java.lang.String r0 = "product should be non-null"
            com.google.android.gms.internal.gtm.zzfc.zze(r0)     // Catch:{ RuntimeException -> 0x0241 }
            goto L_0x0223
        L_0x023b:
            java.util.ArrayList r12 = r5.f7130e     // Catch:{ RuntimeException -> 0x0241 }
            r12.add(r0)     // Catch:{ RuntimeException -> 0x0241 }
            goto L_0x0223
        L_0x0241:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x046b }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x046b }
            java.lang.String r0 = r10.concat(r0)     // Catch:{ all -> 0x046b }
            com.google.android.gms.internal.gtm.zzho.zza(r0)     // Catch:{ all -> 0x046b }
            goto L_0x0223
        L_0x0252:
            boolean r0 = r6.containsKey(r2)     // Catch:{ RuntimeException -> 0x031f }
            if (r0 == 0) goto L_0x0317
            java.lang.Object r0 = r6.get(r2)     // Catch:{ RuntimeException -> 0x031f }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ RuntimeException -> 0x031f }
            j3.b r2 = new j3.b     // Catch:{ RuntimeException -> 0x031f }
            r2.<init>(r4)     // Catch:{ RuntimeException -> 0x031f }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ RuntimeException -> 0x031f }
            if (r3 == 0) goto L_0x0270
            java.lang.String r3 = r3.toString()     // Catch:{ RuntimeException -> 0x031f }
            r2.a(r8, r3)     // Catch:{ RuntimeException -> 0x031f }
        L_0x0270:
            java.lang.String r3 = "affiliation"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ RuntimeException -> 0x031f }
            if (r3 == 0) goto L_0x0281
            java.lang.String r3 = r3.toString()     // Catch:{ RuntimeException -> 0x031f }
            java.lang.String r4 = "&ta"
            r2.a(r4, r3)     // Catch:{ RuntimeException -> 0x031f }
        L_0x0281:
            java.lang.String r3 = "coupon"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ RuntimeException -> 0x031f }
            if (r3 == 0) goto L_0x0292
            java.lang.String r3 = r3.toString()     // Catch:{ RuntimeException -> 0x031f }
            java.lang.String r4 = "&tcc"
            r2.a(r4, r3)     // Catch:{ RuntimeException -> 0x031f }
        L_0x0292:
            java.lang.Object r3 = r0.get(r11)     // Catch:{ RuntimeException -> 0x031f }
            if (r3 == 0) goto L_0x02a1
            java.lang.String r3 = r3.toString()     // Catch:{ RuntimeException -> 0x031f }
            java.lang.String r4 = "&pal"
            r2.a(r4, r3)     // Catch:{ RuntimeException -> 0x031f }
        L_0x02a1:
            java.lang.String r3 = "option"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ RuntimeException -> 0x031f }
            if (r3 == 0) goto L_0x02b2
            java.lang.String r3 = r3.toString()     // Catch:{ RuntimeException -> 0x031f }
            java.lang.String r4 = "&col"
            r2.a(r4, r3)     // Catch:{ RuntimeException -> 0x031f }
        L_0x02b2:
            java.lang.String r3 = "revenue"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ RuntimeException -> 0x031f }
            if (r3 == 0) goto L_0x02cb
            java.lang.Double r3 = zzc(r3)     // Catch:{ RuntimeException -> 0x031f }
            double r3 = r3.doubleValue()     // Catch:{ RuntimeException -> 0x031f }
            java.lang.String r3 = java.lang.Double.toString(r3)     // Catch:{ RuntimeException -> 0x031f }
            java.lang.String r4 = "&tr"
            r2.a(r4, r3)     // Catch:{ RuntimeException -> 0x031f }
        L_0x02cb:
            java.lang.String r3 = "tax"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ RuntimeException -> 0x031f }
            if (r3 == 0) goto L_0x02e4
            java.lang.Double r3 = zzc(r3)     // Catch:{ RuntimeException -> 0x031f }
            double r3 = r3.doubleValue()     // Catch:{ RuntimeException -> 0x031f }
            java.lang.String r3 = java.lang.Double.toString(r3)     // Catch:{ RuntimeException -> 0x031f }
            java.lang.String r4 = "&tt"
            r2.a(r4, r3)     // Catch:{ RuntimeException -> 0x031f }
        L_0x02e4:
            java.lang.String r3 = "shipping"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ RuntimeException -> 0x031f }
            if (r3 == 0) goto L_0x02fd
            java.lang.Double r3 = zzc(r3)     // Catch:{ RuntimeException -> 0x031f }
            double r3 = r3.doubleValue()     // Catch:{ RuntimeException -> 0x031f }
            java.lang.String r3 = java.lang.Double.toString(r3)     // Catch:{ RuntimeException -> 0x031f }
            java.lang.String r4 = "&ts"
            r2.a(r4, r3)     // Catch:{ RuntimeException -> 0x031f }
        L_0x02fd:
            java.lang.String r3 = "step"
            java.lang.Object r0 = r0.get(r3)     // Catch:{ RuntimeException -> 0x031f }
            if (r0 == 0) goto L_0x031c
            java.lang.Integer r0 = zze(r0)     // Catch:{ RuntimeException -> 0x031f }
            int r0 = r0.intValue()     // Catch:{ RuntimeException -> 0x031f }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ RuntimeException -> 0x031f }
            java.lang.String r3 = "&cos"
            r2.a(r3, r0)     // Catch:{ RuntimeException -> 0x031f }
            goto L_0x031c
        L_0x0317:
            j3.b r2 = new j3.b     // Catch:{ RuntimeException -> 0x031f }
            r2.<init>(r4)     // Catch:{ RuntimeException -> 0x031f }
        L_0x031c:
            r5.f7127b = r2     // Catch:{ RuntimeException -> 0x031f }
            goto L_0x0331
        L_0x031f:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x046b }
            java.lang.String r2 = "Failed to extract a product action from event data. "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x046b }
            java.lang.String r0 = r2.concat(r0)     // Catch:{ all -> 0x046b }
            com.google.android.gms.internal.gtm.zzho.zza(r0)     // Catch:{ all -> 0x046b }
        L_0x0331:
            java.util.HashMap r0 = r5.b()     // Catch:{ all -> 0x046b }
            goto L_0x0340
        L_0x0336:
            boolean r0 = com.google.android.gms.internal.gtm.zzjx.zzg(r12)     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x0345
            java.util.Map r0 = zzf(r11)     // Catch:{ all -> 0x046b }
        L_0x0340:
            r7.c(r0)     // Catch:{ all -> 0x046b }
            goto L_0x0465
        L_0x0345:
            boolean r0 = com.google.android.gms.internal.gtm.zzjx.zzg(r13)     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x0460
            java.util.Map r0 = r1.zzj     // Catch:{ all -> 0x046b }
            java.lang.String r2 = "transactionId"
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x046b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x046b }
            if (r0 != 0) goto L_0x035e
            java.lang.String r0 = "Cannot find transactionId in data layer."
            com.google.android.gms.internal.gtm.zzho.zza(r0)     // Catch:{ all -> 0x046b }
            goto L_0x0465
        L_0x035e:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x046b }
            r2.<init>()     // Catch:{ all -> 0x046b }
            java.util.Map r3 = zzf(r11)     // Catch:{ IllegalArgumentException -> 0x0459 }
            java.lang.String r4 = "transaction"
            r6 = r17
            r3.put(r6, r4)     // Catch:{ IllegalArgumentException -> 0x0459 }
            if (r14 != r5) goto L_0x0373
            com.google.android.gms.internal.gtm.zzsw r4 = zzf     // Catch:{ IllegalArgumentException -> 0x0459 }
            goto L_0x0377
        L_0x0373:
            java.util.Map r4 = zzb(r14)     // Catch:{ IllegalArgumentException -> 0x0459 }
        L_0x0377:
            java.util.Set r4 = r4.entrySet()     // Catch:{ IllegalArgumentException -> 0x0459 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IllegalArgumentException -> 0x0459 }
        L_0x037f:
            boolean r5 = r4.hasNext()     // Catch:{ IllegalArgumentException -> 0x0459 }
            if (r5 == 0) goto L_0x03a3
            java.lang.Object r5 = r4.next()     // Catch:{ IllegalArgumentException -> 0x0459 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ IllegalArgumentException -> 0x0459 }
            java.util.Map r9 = r1.zzj     // Catch:{ IllegalArgumentException -> 0x0459 }
            java.lang.Object r10 = r5.getKey()     // Catch:{ IllegalArgumentException -> 0x0459 }
            java.lang.Object r9 = r9.get(r10)     // Catch:{ IllegalArgumentException -> 0x0459 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ IllegalArgumentException -> 0x0459 }
            if (r9 == 0) goto L_0x037f
            java.lang.Object r5 = r5.getValue()     // Catch:{ IllegalArgumentException -> 0x0459 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IllegalArgumentException -> 0x0459 }
            r3.put(r5, r9)     // Catch:{ IllegalArgumentException -> 0x0459 }
            goto L_0x037f
        L_0x03a3:
            r2.add(r3)     // Catch:{ IllegalArgumentException -> 0x0459 }
            java.lang.String r3 = "transactionProducts"
            java.util.Map r4 = r1.zzj     // Catch:{ IllegalArgumentException -> 0x0459 }
            java.lang.Object r3 = r4.get(r3)     // Catch:{ IllegalArgumentException -> 0x0459 }
            if (r3 != 0) goto L_0x03b2
            r3 = 0
            goto L_0x03d3
        L_0x03b2:
            boolean r4 = r3 instanceof java.util.List     // Catch:{ IllegalArgumentException -> 0x0459 }
            if (r4 == 0) goto L_0x0451
            java.util.List r3 = (java.util.List) r3     // Catch:{ IllegalArgumentException -> 0x0459 }
            java.util.Iterator r4 = r3.iterator()     // Catch:{ IllegalArgumentException -> 0x0459 }
        L_0x03bc:
            boolean r5 = r4.hasNext()     // Catch:{ IllegalArgumentException -> 0x0459 }
            if (r5 == 0) goto L_0x03d3
            java.lang.Object r5 = r4.next()     // Catch:{ IllegalArgumentException -> 0x0459 }
            boolean r5 = r5 instanceof java.util.Map     // Catch:{ IllegalArgumentException -> 0x0459 }
            if (r5 == 0) goto L_0x03cb
            goto L_0x03bc
        L_0x03cb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0459 }
            java.lang.String r2 = "Each element of transactionProducts should be of type Map."
            r0.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0459 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0459 }
        L_0x03d3:
            if (r3 == 0) goto L_0x043d
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IllegalArgumentException -> 0x0459 }
        L_0x03d9:
            boolean r4 = r3.hasNext()     // Catch:{ IllegalArgumentException -> 0x0459 }
            if (r4 == 0) goto L_0x043d
            java.lang.Object r4 = r3.next()     // Catch:{ IllegalArgumentException -> 0x0459 }
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ IllegalArgumentException -> 0x0459 }
            java.lang.Object r5 = r4.get(r15)     // Catch:{ IllegalArgumentException -> 0x0459 }
            if (r5 != 0) goto L_0x03f2
            java.lang.String r0 = "Unable to send transaction item hit due to missing 'name' field."
            com.google.android.gms.internal.gtm.zzho.zza(r0)     // Catch:{ IllegalArgumentException -> 0x0459 }
            goto L_0x0465
        L_0x03f2:
            java.util.Map r5 = zzf(r11)     // Catch:{ IllegalArgumentException -> 0x0459 }
            java.lang.String r9 = "item"
            r5.put(r6, r9)     // Catch:{ IllegalArgumentException -> 0x0459 }
            r5.put(r8, r0)     // Catch:{ IllegalArgumentException -> 0x0459 }
            com.google.android.gms.internal.gtm.zzrd r9 = com.google.android.gms.internal.gtm.zzrd.zze     // Catch:{ IllegalArgumentException -> 0x0459 }
            r10 = r16
            if (r10 != r9) goto L_0x0407
            com.google.android.gms.internal.gtm.zzsw r9 = zzg     // Catch:{ IllegalArgumentException -> 0x0459 }
            goto L_0x040b
        L_0x0407:
            java.util.Map r9 = zzb(r10)     // Catch:{ IllegalArgumentException -> 0x0459 }
        L_0x040b:
            java.util.Set r9 = r9.entrySet()     // Catch:{ IllegalArgumentException -> 0x0459 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ IllegalArgumentException -> 0x0459 }
        L_0x0413:
            boolean r12 = r9.hasNext()     // Catch:{ IllegalArgumentException -> 0x0459 }
            if (r12 == 0) goto L_0x0437
            java.lang.Object r12 = r9.next()     // Catch:{ IllegalArgumentException -> 0x0459 }
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ IllegalArgumentException -> 0x0459 }
            java.lang.Object r13 = r12.getKey()     // Catch:{ IllegalArgumentException -> 0x0459 }
            java.lang.Object r13 = r4.get(r13)     // Catch:{ IllegalArgumentException -> 0x0459 }
            if (r13 == 0) goto L_0x0413
            java.lang.Object r12 = r12.getValue()     // Catch:{ IllegalArgumentException -> 0x0459 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ IllegalArgumentException -> 0x0459 }
            java.lang.String r13 = r13.toString()     // Catch:{ IllegalArgumentException -> 0x0459 }
            r5.put(r12, r13)     // Catch:{ IllegalArgumentException -> 0x0459 }
            goto L_0x0413
        L_0x0437:
            r2.add(r5)     // Catch:{ IllegalArgumentException -> 0x0459 }
            r16 = r10
            goto L_0x03d9
        L_0x043d:
            java.util.Iterator r0 = r2.iterator()     // Catch:{ IllegalArgumentException -> 0x0459 }
        L_0x0441:
            boolean r2 = r0.hasNext()     // Catch:{ IllegalArgumentException -> 0x0459 }
            if (r2 == 0) goto L_0x0465
            java.lang.Object r2 = r0.next()     // Catch:{ IllegalArgumentException -> 0x0459 }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ IllegalArgumentException -> 0x0459 }
            r7.c(r2)     // Catch:{ IllegalArgumentException -> 0x0459 }
            goto L_0x0441
        L_0x0451:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0459 }
            java.lang.String r2 = "transactionProducts should be of type List."
            r0.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0459 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0459 }
        L_0x0459:
            r0 = move-exception
            java.lang.String r2 = "Unable to send transaction"
            com.google.android.gms.internal.gtm.zzho.zzb(r2, r0)     // Catch:{ all -> 0x046b }
            goto L_0x0465
        L_0x0460:
            java.lang.String r0 = "Ignoring unknown tag."
            com.google.android.gms.internal.gtm.zzho.zze(r0)     // Catch:{ all -> 0x046b }
        L_0x0465:
            r2 = 0
            r1.zzj = r2
            com.google.android.gms.internal.gtm.zzrd r0 = com.google.android.gms.internal.gtm.zzrd.zze
            return r0
        L_0x046b:
            r0 = move-exception
            r2 = 0
            r1.zzj = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzpg.zza(com.google.android.gms.internal.gtm.zzie, com.google.android.gms.internal.gtm.zzqz[]):com.google.android.gms.internal.gtm.zzqz");
    }
}
