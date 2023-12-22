package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import androidx.activity.f;
import androidx.fragment.app.w0;
import com.ironsource.sdk.c.e;
import java.util.ArrayList;
import r3.o;

public final class zzjx {
    public static double zza(zzqz zzqz) {
        double zzb = zzb(zzqz);
        if (Double.isNaN(zzb)) {
            return 0.0d;
        }
        int i10 = (zzb > 0.0d ? 1 : (zzb == 0.0d ? 0 : -1));
        if (i10 == 0 || i10 == 0 || Double.isInfinite(zzb)) {
            return zzb;
        }
        return Math.floor(Math.abs(zzb)) * Math.signum(zzb);
    }

    public static double zzb(zzqz zzqz) {
        o.b(zzqz != null);
        if (zzqz == zzrd.zze) {
            return Double.NaN;
        }
        if (zzqz == zzrd.zzd) {
            return 0.0d;
        }
        if (zzqz instanceof zzra) {
            return ((zzra) zzqz).zzi().booleanValue() ? 1.0d : 0.0d;
        }
        if (zzqz instanceof zzrb) {
            return ((zzrb) zzqz).zzi().doubleValue();
        }
        if (zzqz instanceof zzrg) {
            zzrg zzrg = (zzrg) zzqz;
            if (zzrg.zzk().isEmpty()) {
                return 0.0d;
            }
            if (zzrg.zzk().size() == 1) {
                return zzb(new zzrk(zzd(zzrg.zzi(0))));
            }
        } else if (zzqz instanceof zzrk) {
            zzrk zzrk = (zzrk) zzqz;
            if (zzrk.zzk().isEmpty()) {
                return 0.0d;
            }
            try {
                return Double.parseDouble(zzrk.zzk());
            } catch (NumberFormatException unused) {
                return Double.NaN;
            }
        }
        if (!zzj(zzqz)) {
            return Double.NaN;
        }
        throw new IllegalArgumentException(w0.d("Illegal type given to numberEquivalent: ", zzqz.toString(), "."));
    }

    public static double zzc(zzqz zzqz, zzqz zzqz2) {
        boolean z9 = true;
        o.b(zzqz != null);
        if (zzqz2 == null) {
            z9 = false;
        }
        o.b(z9);
        double zzb = zzb(zzqz);
        double zzb2 = zzb(zzqz2);
        if (Double.isNaN(zzb) || Double.isNaN(zzb2)) {
            return Double.NaN;
        }
        if ((zzb == Double.POSITIVE_INFINITY && zzb2 == Double.NEGATIVE_INFINITY) || (zzb == Double.NEGATIVE_INFINITY && zzb2 == Double.POSITIVE_INFINITY)) {
            return Double.NaN;
        }
        return (!Double.isInfinite(zzb) || Double.isInfinite(zzb2)) ? (Double.isInfinite(zzb) || !Double.isInfinite(zzb2)) ? zzb + zzb2 : zzb2 : zzb;
    }

    public static String zzd(zzqz zzqz) {
        boolean z9;
        String str;
        String str2;
        if (zzqz != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        o.b(z9);
        if (zzqz == zzrd.zze) {
            return "undefined";
        }
        if (zzqz == zzrd.zzd) {
            return "null";
        }
        if (zzqz instanceof zzra) {
            if (true != ((zzra) zzqz).zzi().booleanValue()) {
                return "false";
            }
            return "true";
        } else if (zzqz instanceof zzrb) {
            String d10 = Double.toString(((zzrb) zzqz).zzi().doubleValue());
            int indexOf = d10.indexOf("E");
            if (indexOf > 0) {
                int parseInt = Integer.parseInt(d10.substring(indexOf + 1, d10.length()));
                if (parseInt < 0) {
                    if (parseInt > -7) {
                        String replace = d10.substring(0, indexOf).replace(".", "");
                        StringBuilder g10 = f.g("0.");
                        while (true) {
                            parseInt++;
                            if (parseInt < 0) {
                                g10.append("0");
                            } else {
                                g10.append(replace);
                                return g10.toString();
                            }
                        }
                    } else {
                        str2 = e.f5173a;
                    }
                } else if (parseInt < 21) {
                    String replace2 = d10.substring(0, indexOf).replace(".", "");
                    int length = replace2.length() - (replace2.startsWith("-") ? 1 : 0);
                    StringBuilder sb = new StringBuilder();
                    int i10 = (parseInt + 1) - length;
                    if (i10 < 0) {
                        int length2 = replace2.length() + i10;
                        sb.append(replace2.substring(0, length2));
                        sb.append(".");
                        sb.append(replace2.substring(length2, replace2.length()));
                    } else {
                        sb.append(replace2);
                        while (i10 > 0) {
                            sb.append("0");
                            i10--;
                        }
                    }
                    return sb.toString();
                } else {
                    str2 = "e+";
                }
                return d10.replace("E", str2);
            } else if (!d10.endsWith(".0")) {
                return d10;
            } else {
                String substring = d10.substring(0, d10.length() - 2);
                if (substring.equals("-0")) {
                    return "0";
                }
                return substring;
            }
        } else {
            if (zzqz instanceof zzrc) {
                zzjw zzi = ((zzrc) zzqz).zzi();
                if (zzi instanceof zzjv) {
                    return ((zzjv) zzi).zzb();
                }
            } else if (zzqz instanceof zzrg) {
                ArrayList arrayList = new ArrayList();
                for (zzqz zzqz2 : ((zzrg) zzqz).zzk()) {
                    if (zzqz2 == zzrd.zzd || zzqz2 == zzrd.zze) {
                        arrayList.add("");
                    } else {
                        arrayList.add(zzd(zzqz2));
                    }
                }
                return TextUtils.join(",", arrayList);
            } else if (zzqz instanceof zzrh) {
                return "[object Object]";
            } else {
                if (zzqz instanceof zzrk) {
                    return ((zzrk) zzqz).zzk();
                }
            }
            if (zzj(zzqz)) {
                str = w0.d("Illegal type given to stringEquivalent: ", zzqz.toString(), ".");
            } else {
                str = "Unknown type in stringEquivalent.";
            }
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean zze(com.google.android.gms.internal.gtm.zzqz r12, com.google.android.gms.internal.gtm.zzqz r13) {
        /*
            r0 = 1
            r1 = 0
            if (r12 == 0) goto L_0x0006
            r2 = r0
            goto L_0x0007
        L_0x0006:
            r2 = r1
        L_0x0007:
            r3.o.b(r2)
            if (r13 == 0) goto L_0x000e
            r2 = r0
            goto L_0x000f
        L_0x000e:
            r2 = r1
        L_0x000f:
            r3.o.b(r2)
            boolean r2 = zzj(r12)
            java.lang.String r3 = "Illegal type given to abstractEqualityCompare: "
            if (r2 != 0) goto L_0x019a
            boolean r2 = zzj(r13)
            if (r2 != 0) goto L_0x0190
            java.lang.String r2 = zzi(r12)
            java.lang.String r3 = zzi(r13)
            boolean r4 = r2.equals(r3)
            java.lang.String r5 = "Boolean"
            java.lang.String r6 = "Object"
            java.lang.String r7 = "String"
            java.lang.String r8 = "Number"
            if (r4 == 0) goto L_0x00d2
            int r3 = r2.hashCode()
            r4 = 5
            r9 = 4
            r10 = 3
            r11 = 2
            switch(r3) {
                case -1950496919: goto L_0x006e;
                case -1939501217: goto L_0x0066;
                case -1808118735: goto L_0x005e;
                case 2439591: goto L_0x0054;
                case 965837104: goto L_0x004a;
                case 1729365000: goto L_0x0042;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x0076
        L_0x0042:
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0076
            r2 = r9
            goto L_0x0077
        L_0x004a:
            java.lang.String r3 = "Undefined"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0076
            r2 = r1
            goto L_0x0077
        L_0x0054:
            java.lang.String r3 = "Null"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0076
            r2 = r0
            goto L_0x0077
        L_0x005e:
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x0076
            r2 = r10
            goto L_0x0077
        L_0x0066:
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0076
            r2 = r4
            goto L_0x0077
        L_0x006e:
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0076
            r2 = r11
            goto L_0x0077
        L_0x0076:
            r2 = -1
        L_0x0077:
            if (r2 == 0) goto L_0x00d1
            if (r2 == r0) goto L_0x00d1
            if (r2 == r11) goto L_0x00aa
            if (r2 == r10) goto L_0x0099
            if (r2 == r9) goto L_0x0088
            if (r2 == r4) goto L_0x0084
            return r1
        L_0x0084:
            if (r12 != r13) goto L_0x0087
            return r0
        L_0x0087:
            return r1
        L_0x0088:
            com.google.android.gms.internal.gtm.zzra r12 = (com.google.android.gms.internal.gtm.zzra) r12
            java.lang.Boolean r12 = r12.zzi()
            com.google.android.gms.internal.gtm.zzra r13 = (com.google.android.gms.internal.gtm.zzra) r13
            java.lang.Boolean r13 = r13.zzi()
            boolean r12 = r12.equals(r13)
            return r12
        L_0x0099:
            com.google.android.gms.internal.gtm.zzrk r12 = (com.google.android.gms.internal.gtm.zzrk) r12
            java.lang.String r12 = r12.zzk()
            com.google.android.gms.internal.gtm.zzrk r13 = (com.google.android.gms.internal.gtm.zzrk) r13
            java.lang.String r13 = r13.zzk()
            boolean r12 = r12.equals(r13)
            return r12
        L_0x00aa:
            com.google.android.gms.internal.gtm.zzrb r12 = (com.google.android.gms.internal.gtm.zzrb) r12
            java.lang.Double r12 = r12.zzi()
            double r2 = r12.doubleValue()
            com.google.android.gms.internal.gtm.zzrb r13 = (com.google.android.gms.internal.gtm.zzrb) r13
            java.lang.Double r12 = r13.zzi()
            double r12 = r12.doubleValue()
            boolean r4 = java.lang.Double.isNaN(r2)
            if (r4 != 0) goto L_0x00d0
            boolean r4 = java.lang.Double.isNaN(r12)
            if (r4 == 0) goto L_0x00cb
            goto L_0x00d0
        L_0x00cb:
            int r12 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r12 != 0) goto L_0x00d0
            return r0
        L_0x00d0:
            return r1
        L_0x00d1:
            return r0
        L_0x00d2:
            com.google.android.gms.internal.gtm.zzrd r4 = com.google.android.gms.internal.gtm.zzrd.zze
            if (r12 == r4) goto L_0x00da
            com.google.android.gms.internal.gtm.zzrd r9 = com.google.android.gms.internal.gtm.zzrd.zzd
            if (r12 != r9) goto L_0x00e0
        L_0x00da:
            if (r13 == r4) goto L_0x018f
            com.google.android.gms.internal.gtm.zzrd r4 = com.google.android.gms.internal.gtm.zzrd.zzd
            if (r13 == r4) goto L_0x018f
        L_0x00e0:
            boolean r0 = r2.equals(r8)
            if (r0 == 0) goto L_0x00ff
            boolean r0 = r3.equals(r7)
            if (r0 != 0) goto L_0x00ed
            goto L_0x00ff
        L_0x00ed:
            com.google.android.gms.internal.gtm.zzrb r0 = new com.google.android.gms.internal.gtm.zzrb
            double r1 = zzb(r13)
            java.lang.Double r13 = java.lang.Double.valueOf(r1)
            r0.<init>(r13)
            boolean r12 = zze(r12, r0)
            return r12
        L_0x00ff:
            boolean r0 = r2.equals(r7)
            if (r0 == 0) goto L_0x011e
            boolean r0 = r3.equals(r8)
            if (r0 != 0) goto L_0x010c
            goto L_0x011e
        L_0x010c:
            com.google.android.gms.internal.gtm.zzrb r0 = new com.google.android.gms.internal.gtm.zzrb
            double r1 = zzb(r12)
            java.lang.Double r12 = java.lang.Double.valueOf(r1)
            r0.<init>(r12)
            boolean r12 = zze(r0, r13)
            return r12
        L_0x011e:
            boolean r0 = r2.equals(r5)
            if (r0 == 0) goto L_0x0136
            com.google.android.gms.internal.gtm.zzrb r0 = new com.google.android.gms.internal.gtm.zzrb
            double r1 = zzb(r12)
            java.lang.Double r12 = java.lang.Double.valueOf(r1)
            r0.<init>(r12)
            boolean r12 = zze(r0, r13)
            return r12
        L_0x0136:
            boolean r0 = r3.equals(r5)
            if (r0 == 0) goto L_0x014e
            com.google.android.gms.internal.gtm.zzrb r0 = new com.google.android.gms.internal.gtm.zzrb
            double r1 = zzb(r13)
            java.lang.Double r13 = java.lang.Double.valueOf(r1)
            r0.<init>(r13)
            boolean r12 = zze(r12, r0)
            return r12
        L_0x014e:
            boolean r0 = r2.equals(r7)
            if (r0 != 0) goto L_0x015a
            boolean r0 = r2.equals(r8)
            if (r0 == 0) goto L_0x0160
        L_0x015a:
            boolean r0 = r3.equals(r6)
            if (r0 != 0) goto L_0x0181
        L_0x0160:
            boolean r0 = r2.equals(r6)
            if (r0 == 0) goto L_0x0180
            boolean r0 = r3.equals(r7)
            if (r0 != 0) goto L_0x0172
            boolean r0 = r3.equals(r8)
            if (r0 == 0) goto L_0x0180
        L_0x0172:
            com.google.android.gms.internal.gtm.zzrk r0 = new com.google.android.gms.internal.gtm.zzrk
            java.lang.String r12 = zzd(r12)
            r0.<init>(r12)
            boolean r12 = zze(r0, r13)
            return r12
        L_0x0180:
            return r1
        L_0x0181:
            com.google.android.gms.internal.gtm.zzrk r0 = new com.google.android.gms.internal.gtm.zzrk
            java.lang.String r13 = zzd(r13)
            r0.<init>(r13)
            boolean r12 = zze(r12, r0)
            return r12
        L_0x018f:
            return r0
        L_0x0190:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = androidx.fragment.app.w0.d(r3, r13.toString(), ".")
            r12.<init>(r13)
            throw r12
        L_0x019a:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r12 = androidx.fragment.app.w0.d(r3, r12.toString(), ".")
            r13.<init>(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzjx.zze(com.google.android.gms.internal.gtm.zzqz, com.google.android.gms.internal.gtm.zzqz):boolean");
    }

    public static boolean zzf(zzqz zzqz, zzqz zzqz2) {
        int i10;
        o.b(zzqz != null);
        o.b(zzqz2 != null);
        if (zzj(zzqz)) {
            throw new IllegalArgumentException(w0.d("Illegal type given to abstractRelationalCompare: ", zzqz.toString(), "."));
        } else if (!zzj(zzqz2)) {
            if ((zzqz instanceof zzrh) || (zzqz instanceof zzrg) || (zzqz instanceof zzrc)) {
                zzqz = new zzrk(zzd(zzqz));
            }
            if ((zzqz2 instanceof zzrh) || (zzqz2 instanceof zzrg) || (zzqz2 instanceof zzrc)) {
                zzqz2 = new zzrk(zzd(zzqz2));
            }
            if ((zzqz instanceof zzrk) && (zzqz2 instanceof zzrk)) {
                return ((zzrk) zzqz).zzk().compareTo(((zzrk) zzqz2).zzk()) < 0;
            }
            double zzb = zzb(zzqz);
            double zzb2 = zzb(zzqz2);
            if (Double.isNaN(zzb) || Double.isNaN(zzb2) || ((zzb == 0.0d && zzb2 == 0.0d) || ((i10 == 0 && zzb2 == 0.0d) || zzb == Double.POSITIVE_INFINITY))) {
                return false;
            }
            if (zzb2 == Double.POSITIVE_INFINITY) {
                return true;
            }
            if (zzb2 == Double.NEGATIVE_INFINITY) {
                return false;
            }
            return zzb == Double.NEGATIVE_INFINITY || Double.compare(zzb, zzb2) < 0;
        } else {
            throw new IllegalArgumentException(w0.d("Illegal type given to abstractRelationalCompare: ", zzqz2.toString(), "."));
        }
    }

    public static boolean zzg(zzqz zzqz) {
        o.b(zzqz != null);
        if (zzqz == zzrd.zze || zzqz == zzrd.zzd) {
            return false;
        }
        if (zzqz instanceof zzra) {
            return ((zzra) zzqz).zzi().booleanValue();
        }
        if (zzqz instanceof zzrb) {
            zzrb zzrb = (zzrb) zzqz;
            if (zzrb.zzi().doubleValue() == 0.0d || zzrb.zzi().doubleValue() == 0.0d || Double.isNaN(zzrb.zzi().doubleValue())) {
                return false;
            }
        } else if (zzqz instanceof zzrk) {
            if (((zzrk) zzqz).zzk().isEmpty()) {
                return false;
            }
        } else if (zzj(zzqz)) {
            throw new IllegalArgumentException(w0.d("Illegal type given to isTruthy: ", zzqz.toString(), "."));
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean zzh(com.google.android.gms.internal.gtm.zzqz r7, com.google.android.gms.internal.gtm.zzqz r8) {
        /*
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L_0x0006
            r2 = r0
            goto L_0x0007
        L_0x0006:
            r2 = r1
        L_0x0007:
            r3.o.b(r2)
            if (r8 == 0) goto L_0x000e
            r2 = r0
            goto L_0x000f
        L_0x000e:
            r2 = r1
        L_0x000f:
            r3.o.b(r2)
            boolean r2 = zzj(r7)
            java.lang.String r3 = "Illegal type given to strictEqualityCompare: "
            if (r2 != 0) goto L_0x00d2
            boolean r2 = zzj(r8)
            if (r2 != 0) goto L_0x00c8
            java.lang.String r2 = zzi(r7)
            java.lang.String r3 = zzi(r8)
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x002f
            return r1
        L_0x002f:
            int r3 = r2.hashCode()
            r4 = 4
            r5 = 3
            r6 = 2
            switch(r3) {
                case -1950496919: goto L_0x0062;
                case -1808118735: goto L_0x0058;
                case 2439591: goto L_0x004e;
                case 965837104: goto L_0x0044;
                case 1729365000: goto L_0x003a;
                default: goto L_0x0039;
            }
        L_0x0039:
            goto L_0x006c
        L_0x003a:
            java.lang.String r3 = "Boolean"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006c
            r2 = r4
            goto L_0x006d
        L_0x0044:
            java.lang.String r3 = "Undefined"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006c
            r2 = r1
            goto L_0x006d
        L_0x004e:
            java.lang.String r3 = "Null"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006c
            r2 = r0
            goto L_0x006d
        L_0x0058:
            java.lang.String r3 = "String"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006c
            r2 = r5
            goto L_0x006d
        L_0x0062:
            java.lang.String r3 = "Number"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006c
            r2 = r6
            goto L_0x006d
        L_0x006c:
            r2 = -1
        L_0x006d:
            if (r2 == 0) goto L_0x00c7
            if (r2 == r0) goto L_0x00c7
            if (r2 == r6) goto L_0x00a0
            if (r2 == r5) goto L_0x008c
            if (r2 == r4) goto L_0x007b
            if (r7 != r8) goto L_0x007a
            return r0
        L_0x007a:
            return r1
        L_0x007b:
            com.google.android.gms.internal.gtm.zzra r7 = (com.google.android.gms.internal.gtm.zzra) r7
            java.lang.Boolean r7 = r7.zzi()
            com.google.android.gms.internal.gtm.zzra r8 = (com.google.android.gms.internal.gtm.zzra) r8
            java.lang.Boolean r8 = r8.zzi()
            boolean r7 = r7.equals(r8)
            return r7
        L_0x008c:
            com.google.android.gms.internal.gtm.zzrk r7 = (com.google.android.gms.internal.gtm.zzrk) r7
            java.lang.String r7 = r7.zzk()
            com.google.android.gms.internal.gtm.zzrk r8 = (com.google.android.gms.internal.gtm.zzrk) r8
            java.lang.String r8 = r8.zzk()
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x009f
            return r0
        L_0x009f:
            return r1
        L_0x00a0:
            com.google.android.gms.internal.gtm.zzrb r7 = (com.google.android.gms.internal.gtm.zzrb) r7
            java.lang.Double r7 = r7.zzi()
            double r2 = r7.doubleValue()
            com.google.android.gms.internal.gtm.zzrb r8 = (com.google.android.gms.internal.gtm.zzrb) r8
            java.lang.Double r7 = r8.zzi()
            double r7 = r7.doubleValue()
            boolean r4 = java.lang.Double.isNaN(r2)
            if (r4 != 0) goto L_0x00c6
            boolean r4 = java.lang.Double.isNaN(r7)
            if (r4 == 0) goto L_0x00c1
            goto L_0x00c6
        L_0x00c1:
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 != 0) goto L_0x00c6
            return r0
        L_0x00c6:
            return r1
        L_0x00c7:
            return r0
        L_0x00c8:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = androidx.fragment.app.w0.d(r3, r8.toString(), ".")
            r7.<init>(r8)
            throw r7
        L_0x00d2:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = androidx.fragment.app.w0.d(r3, r7.toString(), ".")
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzjx.zzh(com.google.android.gms.internal.gtm.zzqz, com.google.android.gms.internal.gtm.zzqz):boolean");
    }

    private static String zzi(zzqz zzqz) {
        return zzqz == zzrd.zze ? "Undefined" : zzqz == zzrd.zzd ? "Null" : zzqz instanceof zzra ? "Boolean" : zzqz instanceof zzrb ? "Number" : zzqz instanceof zzrk ? "String" : "Object";
    }

    private static boolean zzj(zzqz zzqz) {
        if (zzqz instanceof zzri) {
            return true;
        }
        if (!(zzqz instanceof zzrd) || zzqz == zzrd.zze) {
            return false;
        }
        return zzqz != zzrd.zzd;
    }
}
