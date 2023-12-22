package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import androidx.activity.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import r3.o;

public final class zzez {
    private final Map zza;
    private final List zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;
    private final boolean zzf;
    private final String zzg;

    public zzez(zzbt zzbt, Map map, long j10, boolean z9) {
        this(zzbt, map, j10, z9, 0, 0, (List) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzez(com.google.android.gms.internal.gtm.zzbt r1, java.util.Map r2, long r3, boolean r5, long r6, int r8, java.util.List r9) {
        /*
            r0 = this;
            r0.<init>()
            r3.o.h(r1)
            r3.o.h(r2)
            r0.zzd = r3
            r0.zzf = r5
            r0.zzc = r6
            r0.zze = r8
            if (r9 == 0) goto L_0x0015
            r3 = r9
            goto L_0x0019
        L_0x0015:
            java.util.List r3 = java.util.Collections.emptyList()
        L_0x0019:
            r0.zzb = r3
            r3 = 0
            if (r9 == 0) goto L_0x003f
            java.util.Iterator r4 = r9.iterator()
        L_0x0022:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x003f
            java.lang.Object r5 = r4.next()
            com.google.android.gms.internal.gtm.zzcr r5 = (com.google.android.gms.internal.gtm.zzcr) r5
            java.lang.String r6 = r5.zza()
            java.lang.String r7 = "appendVersion"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0022
            java.lang.String r4 = r5.zzb()
            goto L_0x0040
        L_0x003f:
            r4 = r3
        L_0x0040:
            r5 = 1
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r5 != r6) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r3 = r4
        L_0x0049:
            r0.zzg = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Set r4 = r2.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0058:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0084
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            boolean r6 = zzl(r6)
            if (r6 == 0) goto L_0x0058
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = zzj(r1, r6)
            if (r6 == 0) goto L_0x0058
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = zzk(r1, r5)
            r3.put(r6, r5)
            goto L_0x0058
        L_0x0084:
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x008c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00b8
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            boolean r5 = zzl(r5)
            if (r5 != 0) goto L_0x008c
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = zzj(r1, r5)
            if (r5 == 0) goto L_0x008c
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = zzk(r1, r4)
            r3.put(r5, r4)
            goto L_0x008c
        L_0x00b8:
            java.lang.String r1 = r0.zzg
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00e0
            java.lang.String r1 = r0.zzg
            java.lang.String r2 = "_v"
            com.google.android.gms.internal.gtm.zzfu.zzg(r3, r2, r1)
            java.lang.String r1 = r0.zzg
            java.lang.String r2 = "ma4.0.0"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00db
            java.lang.String r1 = r0.zzg
            java.lang.String r2 = "ma4.0.1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00e0
        L_0x00db:
            java.lang.String r1 = "adid"
            r3.remove(r1)
        L_0x00e0:
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r3)
            r0.zza = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzez.<init>(com.google.android.gms.internal.gtm.zzbt, java.util.Map, long, boolean, long, int, java.util.List):void");
    }

    public static zzez zze(zzbt zzbt, zzez zzez, Map map) {
        return new zzez(zzbt, map, zzez.zzd, zzez.zzf, zzez.zzc, zzez.zze, zzez.zzb);
    }

    private final String zzi(String str, String str2) {
        o.e(str);
        o.a("Short param name required", !str.startsWith("&"));
        String str3 = (String) this.zza.get(str);
        return str3 != null ? str3 : str2;
    }

    private static String zzj(zzbt zzbt, Object obj) {
        if (obj == null) {
            return null;
        }
        String obj2 = obj.toString();
        if (obj2.startsWith("&")) {
            obj2 = obj2.substring(1);
        }
        int length = obj2.length();
        if (length > 256) {
            obj2 = obj2.substring(0, 256);
            zzbt.zzS("Hit param name is too long and will be trimmed", Integer.valueOf(length), obj2);
        }
        if (TextUtils.isEmpty(obj2)) {
            return null;
        }
        return obj2;
    }

    private static String zzk(zzbt zzbt, Object obj) {
        String obj2 = obj == null ? "" : obj.toString();
        int length = obj2.length();
        if (length <= 8192) {
            return obj2;
        }
        String substring = obj2.substring(0, 8192);
        zzbt.zzS("Hit param value is too long and will be trimmed", Integer.valueOf(length), substring);
        return substring;
    }

    private static boolean zzl(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.toString().startsWith("&");
    }

    public final String toString() {
        StringBuilder g10 = f.g("ht=");
        g10.append(this.zzd);
        if (this.zzc != 0) {
            g10.append(", dbId=");
            g10.append(this.zzc);
        }
        if (this.zze != 0) {
            g10.append(", appUID=");
            g10.append(this.zze);
        }
        ArrayList arrayList = new ArrayList(this.zza.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = (String) arrayList.get(i10);
            g10.append(", ");
            g10.append(str);
            g10.append("=");
            g10.append((String) this.zza.get(str));
        }
        return g10.toString();
    }

    public final int zza() {
        return this.zze;
    }

    public final long zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return zzfu.zza(zzi("_s", "0"));
    }

    public final long zzd() {
        return this.zzd;
    }

    public final String zzf() {
        return zzi("_m", "");
    }

    public final Map zzg() {
        return this.zza;
    }

    public final boolean zzh() {
        return this.zzf;
    }
}
