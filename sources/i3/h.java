package i3;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.gtm.zzax;
import com.google.android.gms.internal.gtm.zzbg;
import com.google.android.gms.internal.gtm.zzbt;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzbz;
import com.google.android.gms.internal.gtm.zzez;
import com.google.android.gms.internal.gtm.zzfu;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import r3.o;

public final class h extends zzbt implements v {

    /* renamed from: d  reason: collision with root package name */
    public static DecimalFormat f7141d;

    /* renamed from: a  reason: collision with root package name */
    public final zzbx f7142a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7143b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f7144c;

    public h(zzbx zzbx, String str) {
        super(zzbx);
        o.e(str);
        this.f7142a = zzbx;
        this.f7143b = str;
        o.e(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        this.f7144c = builder.build();
    }

    public static String c(double d10) {
        if (f7141d == null) {
            f7141d = new DecimalFormat("0.######");
        }
        return f7141d.format(d10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003d, code lost:
        if (android.text.TextUtils.isEmpty(r7) != false) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0020 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.HashMap j(i3.l r10) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Class<com.google.android.gms.internal.gtm.zzbb> r1 = com.google.android.gms.internal.gtm.zzbb.class
            i3.n r1 = r10.b(r1)
            com.google.android.gms.internal.gtm.zzbb r1 = (com.google.android.gms.internal.gtm.zzbb) r1
            java.lang.String r2 = "1"
            r3 = 0
            r5 = 0
            if (r1 == 0) goto L_0x0073
            java.util.Map r1 = r1.zzd()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0020:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0073
            java.lang.Object r6 = r1.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getValue()
            if (r7 != 0) goto L_0x0033
            goto L_0x0061
        L_0x0033:
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L_0x0040
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L_0x0067
            goto L_0x0061
        L_0x0040:
            boolean r8 = r7 instanceof java.lang.Double
            if (r8 == 0) goto L_0x0057
            java.lang.Double r7 = (java.lang.Double) r7
            double r8 = r7.doubleValue()
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 == 0) goto L_0x0061
            double r7 = r7.doubleValue()
            java.lang.String r7 = c(r7)
            goto L_0x0067
        L_0x0057:
            boolean r8 = r7 instanceof java.lang.Boolean
            if (r8 == 0) goto L_0x0063
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            if (r7 == r8) goto L_0x0061
            r7 = r2
            goto L_0x0067
        L_0x0061:
            r7 = r5
            goto L_0x0067
        L_0x0063:
            java.lang.String r7 = r7.toString()
        L_0x0067:
            if (r7 == 0) goto L_0x0020
            java.lang.Object r6 = r6.getKey()
            java.lang.String r6 = (java.lang.String) r6
            r0.put(r6, r7)
            goto L_0x0020
        L_0x0073:
            java.lang.Class<com.google.android.gms.internal.gtm.zzbg> r1 = com.google.android.gms.internal.gtm.zzbg.class
            i3.n r1 = r10.b(r1)
            com.google.android.gms.internal.gtm.zzbg r1 = (com.google.android.gms.internal.gtm.zzbg) r1
            if (r1 == 0) goto L_0x00bc
            java.lang.String r6 = r1.zzf()
            java.lang.String r7 = "t"
            o(r0, r7, r6)
            java.lang.String r6 = r1.zze()
            java.lang.String r7 = "cid"
            o(r0, r7, r6)
            java.lang.String r6 = r1.zzg()
            java.lang.String r7 = "uid"
            o(r0, r7, r6)
            java.lang.String r6 = "sc"
            o(r0, r6, r5)
            boolean r6 = r1.zzo()
            if (r6 == 0) goto L_0x00a8
            java.lang.String r6 = "ni"
            r0.put(r6, r2)
        L_0x00a8:
            java.lang.String r6 = r1.zzd()
            java.lang.String r7 = "adid"
            o(r0, r7, r6)
            boolean r1 = r1.zzn()
            if (r1 == 0) goto L_0x00bc
            java.lang.String r1 = "ate"
            r0.put(r1, r2)
        L_0x00bc:
            java.lang.Class<com.google.android.gms.internal.gtm.zzbh> r1 = com.google.android.gms.internal.gtm.zzbh.class
            i3.n r1 = r10.b(r1)
            com.google.android.gms.internal.gtm.zzbh r1 = (com.google.android.gms.internal.gtm.zzbh) r1
            java.lang.String r2 = "cd"
            if (r1 == 0) goto L_0x00e2
            o(r0, r2, r5)
            int r1 = r1.zzd()
            double r6 = (double) r1
            int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00dd
            java.lang.String r1 = c(r6)
            java.lang.String r3 = "a"
            r0.put(r3, r1)
        L_0x00dd:
            java.lang.String r1 = "dr"
            o(r0, r1, r5)
        L_0x00e2:
            java.lang.Class<com.google.android.gms.internal.gtm.zzbe> r1 = com.google.android.gms.internal.gtm.zzbe.class
            i3.n r1 = r10.b(r1)
            com.google.android.gms.internal.gtm.zzbe r1 = (com.google.android.gms.internal.gtm.zzbe) r1
            if (r1 == 0) goto L_0x00fb
            java.lang.String r1 = "ec"
            o(r0, r1, r5)
            java.lang.String r1 = "ea"
            o(r0, r1, r5)
            java.lang.String r1 = "el"
            o(r0, r1, r5)
        L_0x00fb:
            java.lang.Class<com.google.android.gms.internal.gtm.zzay> r1 = com.google.android.gms.internal.gtm.zzay.class
            i3.n r1 = r10.b(r1)
            com.google.android.gms.internal.gtm.zzay r1 = (com.google.android.gms.internal.gtm.zzay) r1
            java.lang.String r3 = "cm"
            if (r1 == 0) goto L_0x015f
            java.lang.String r4 = r1.zzl()
            java.lang.String r6 = "cn"
            o(r0, r6, r4)
            java.lang.String r4 = r1.zzm()
            java.lang.String r6 = "cs"
            o(r0, r6, r4)
            java.lang.String r4 = r1.zzk()
            o(r0, r3, r4)
            java.lang.String r4 = r1.zzj()
            java.lang.String r6 = "ck"
            o(r0, r6, r4)
            java.lang.String r4 = r1.zzf()
            java.lang.String r6 = "cc"
            o(r0, r6, r4)
            java.lang.String r4 = r1.zzi()
            java.lang.String r6 = "ci"
            o(r0, r6, r4)
            java.lang.String r4 = r1.zze()
            java.lang.String r6 = "anid"
            o(r0, r6, r4)
            java.lang.String r4 = r1.zzh()
            java.lang.String r6 = "gclid"
            o(r0, r6, r4)
            java.lang.String r4 = r1.zzg()
            java.lang.String r6 = "dclid"
            o(r0, r6, r4)
            java.lang.String r1 = r1.zzd()
            java.lang.String r4 = "aclid"
            o(r0, r4, r1)
        L_0x015f:
            java.lang.Class<com.google.android.gms.internal.gtm.zzbf> r1 = com.google.android.gms.internal.gtm.zzbf.class
            i3.n r1 = r10.b(r1)
            com.google.android.gms.internal.gtm.zzbf r1 = (com.google.android.gms.internal.gtm.zzbf) r1
            if (r1 == 0) goto L_0x016e
            java.lang.String r1 = "exd"
            o(r0, r1, r5)
        L_0x016e:
            java.lang.Class<com.google.android.gms.internal.gtm.zzbi> r1 = com.google.android.gms.internal.gtm.zzbi.class
            i3.n r1 = r10.b(r1)
            com.google.android.gms.internal.gtm.zzbi r1 = (com.google.android.gms.internal.gtm.zzbi) r1
            if (r1 == 0) goto L_0x0187
            java.lang.String r1 = "sn"
            o(r0, r1, r5)
            java.lang.String r1 = "sa"
            o(r0, r1, r5)
            java.lang.String r1 = "st"
            o(r0, r1, r5)
        L_0x0187:
            java.lang.Class<com.google.android.gms.internal.gtm.zzbj> r1 = com.google.android.gms.internal.gtm.zzbj.class
            i3.n r1 = r10.b(r1)
            com.google.android.gms.internal.gtm.zzbj r1 = (com.google.android.gms.internal.gtm.zzbj) r1
            if (r1 == 0) goto L_0x01a0
            java.lang.String r1 = "utv"
            o(r0, r1, r5)
            java.lang.String r1 = "utc"
            o(r0, r1, r5)
            java.lang.String r1 = "utl"
            o(r0, r1, r5)
        L_0x01a0:
            java.lang.Class<com.google.android.gms.internal.gtm.zzaz> r1 = com.google.android.gms.internal.gtm.zzaz.class
            i3.n r1 = r10.b(r1)
            com.google.android.gms.internal.gtm.zzaz r1 = (com.google.android.gms.internal.gtm.zzaz) r1
            if (r1 == 0) goto L_0x01e0
            java.util.Map r1 = r1.zzd()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x01b6:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x01e0
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.String r5 = i3.i.a(r5, r2)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x01b6
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r0.put(r5, r4)
            goto L_0x01b6
        L_0x01e0:
            java.lang.Class<com.google.android.gms.internal.gtm.zzba> r1 = com.google.android.gms.internal.gtm.zzba.class
            i3.n r1 = r10.b(r1)
            com.google.android.gms.internal.gtm.zzba r1 = (com.google.android.gms.internal.gtm.zzba) r1
            if (r1 == 0) goto L_0x0228
            java.util.Map r1 = r1.zzd()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x01f6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0228
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.String r4 = i3.i.a(r4, r3)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x01f6
            java.lang.Object r2 = r2.getValue()
            java.lang.Double r2 = (java.lang.Double) r2
            double r5 = r2.doubleValue()
            java.lang.String r2 = c(r5)
            r0.put(r4, r2)
            goto L_0x01f6
        L_0x0228:
            java.lang.Class<com.google.android.gms.internal.gtm.zzbd> r1 = com.google.android.gms.internal.gtm.zzbd.class
            i3.n r1 = r10.b(r1)
            com.google.android.gms.internal.gtm.zzbd r1 = (com.google.android.gms.internal.gtm.zzbd) r1
            if (r1 == 0) goto L_0x02e3
            java.util.List r2 = r1.zze()
            java.util.Iterator r2 = r2.iterator()
            r3 = 1
            r4 = r3
        L_0x023c:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0257
            java.lang.Object r5 = r2.next()
            j3.c r5 = (j3.c) r5
            java.lang.String r6 = "promo"
            java.lang.String r6 = i3.i.a(r4, r6)
            java.util.HashMap r5 = r5.a(r6)
            r0.putAll(r5)
            int r4 = r4 + r3
            goto L_0x023c
        L_0x0257:
            java.util.List r2 = r1.zzd()
            java.util.Iterator r2 = r2.iterator()
            r4 = r3
        L_0x0260:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x027b
            java.lang.Object r5 = r2.next()
            j3.a r5 = (j3.a) r5
            java.lang.String r6 = "pr"
            java.lang.String r6 = i3.i.a(r4, r6)
            java.util.HashMap r5 = r5.a(r6)
            r0.putAll(r5)
            int r4 = r4 + r3
            goto L_0x0260
        L_0x027b:
            java.util.Map r1 = r1.zzf()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r2 = r3
        L_0x0288:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x02e3
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getValue()
            java.util.List r5 = (java.util.List) r5
            java.lang.String r6 = "il"
            java.lang.String r6 = i3.i.a(r2, r6)
            java.util.Iterator r5 = r5.iterator()
            r7 = r3
        L_0x02a5:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x02c5
            java.lang.Object r8 = r5.next()
            j3.a r8 = (j3.a) r8
            java.lang.String r9 = "pi"
            java.lang.String r9 = i3.i.a(r7, r9)
            java.lang.String r9 = r6.concat(r9)
            java.util.HashMap r8 = r8.a(r9)
            r0.putAll(r8)
            int r7 = r7 + 1
            goto L_0x02a5
        L_0x02c5:
            java.lang.Object r5 = r4.getKey()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x02e0
            java.lang.Object r4 = r4.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "nm"
            java.lang.String r5 = r6.concat(r5)
            r0.put(r5, r4)
        L_0x02e0:
            int r2 = r2 + 1
            goto L_0x0288
        L_0x02e3:
            java.lang.Class<com.google.android.gms.internal.gtm.zzbc> r1 = com.google.android.gms.internal.gtm.zzbc.class
            i3.n r1 = r10.b(r1)
            com.google.android.gms.internal.gtm.zzbc r1 = (com.google.android.gms.internal.gtm.zzbc) r1
            if (r1 == 0) goto L_0x0317
            java.lang.String r2 = r1.zzd()
            java.lang.String r3 = "ul"
            o(r0, r3, r2)
            int r2 = r1.zza
            int r1 = r1.zzb
            if (r2 <= 0) goto L_0x0317
            if (r1 <= 0) goto L_0x0317
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "x"
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "sr"
            r0.put(r2, r1)
        L_0x0317:
            java.lang.Class<com.google.android.gms.internal.gtm.zzax> r1 = com.google.android.gms.internal.gtm.zzax.class
            i3.n r10 = r10.b(r1)
            com.google.android.gms.internal.gtm.zzax r10 = (com.google.android.gms.internal.gtm.zzax) r10
            if (r10 == 0) goto L_0x0345
            java.lang.String r1 = r10.zzf()
            java.lang.String r2 = "an"
            o(r0, r2, r1)
            java.lang.String r1 = r10.zzd()
            java.lang.String r2 = "aid"
            o(r0, r2, r1)
            java.lang.String r1 = r10.zze()
            java.lang.String r2 = "aiid"
            o(r0, r2, r1)
            java.lang.String r10 = r10.zzg()
            java.lang.String r1 = "av"
            o(r0, r1, r10)
        L_0x0345:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.h.j(i3.l):java.util.HashMap");
    }

    public static void o(HashMap hashMap, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put(str, str2);
        }
    }

    public final void a(l lVar) {
        o.a("Can't deliver not submitted measurement", lVar.f7149c);
        o.g("deliver should be called on worker thread");
        l lVar2 = new l(lVar);
        zzbg zzbg = (zzbg) lVar2.a(zzbg.class);
        if (TextUtils.isEmpty(zzbg.zzf())) {
            zzz().zzc(j(lVar2), "Ignoring measurement without type");
        } else if (TextUtils.isEmpty(zzbg.zze())) {
            zzz().zzc(j(lVar2), "Ignoring measurement without client id");
        } else {
            this.f7142a.zzc().getClass();
            if (zzfu.zzj(0.0d, zzbg.zze())) {
                zzF("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(0.0d));
                return;
            }
            HashMap j10 = j(lVar2);
            j10.put("v", IronSourceConstants.BOOLEAN_TRUE_AS_STRING);
            j10.put("_v", zzbv.zzb);
            j10.put("tid", this.f7143b);
            if (this.f7142a.zzc().f7124g) {
                StringBuilder sb = new StringBuilder();
                for (Map.Entry entry : j10.entrySet()) {
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    sb.append((String) entry.getKey());
                    sb.append("=");
                    sb.append((String) entry.getValue());
                }
                zzM("Dry run is enabled. GoogleAnalytics would have sent", sb.toString());
                return;
            }
            HashMap hashMap = new HashMap();
            zzfu.zzg(hashMap, "uid", zzbg.zzg());
            zzax zzax = (zzax) lVar.b(zzax.class);
            if (zzax != null) {
                zzfu.zzg(hashMap, "an", zzax.zzf());
                zzfu.zzg(hashMap, "aid", zzax.zzd());
                zzfu.zzg(hashMap, "av", zzax.zzg());
                zzfu.zzg(hashMap, "aiid", zzax.zze());
            }
            j10.put("_s", String.valueOf(zzs().zza(new zzbz(0, zzbg.zze(), this.f7143b, !TextUtils.isEmpty(zzbg.zzd()), 0, hashMap))));
            zzs().zzh(new zzez(zzz(), j10, lVar.f7150d, true));
        }
    }

    public final Uri zzb() {
        return this.f7144c;
    }
}
