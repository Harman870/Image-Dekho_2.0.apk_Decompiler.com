package com.google.android.gms.internal.gtm;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import r3.o;

public final class zzoh extends zzjy {
    private static final void zzb(Set set, String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            set.add(Character.valueOf(str.charAt(i10)));
        }
    }

    private static final String zzc(String str, int i10, Set set) {
        if (i10 == 1) {
            try {
                return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
            } catch (UnsupportedEncodingException unused) {
                return str;
            }
        } else if (i10 != 2) {
            return str;
        } else {
            String replace = str.replace("\\", "\\\\");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String ch = ((Character) it.next()).toString();
                replace = replace.replace(ch, "\\".concat(String.valueOf(ch)));
            }
            return replace;
        }
    }

    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        zzrd zzrd;
        zzrd zzrd2;
        int length = zzqzArr.length;
        boolean z9 = true;
        o.b(length > 0);
        zzrg zzrg = zzqzArr[0];
        zzrd zzrd3 = length > 1 ? zzqzArr[1] : zzrd.zze;
        int i10 = 2;
        String zzd = (length <= 2 || (zzrd2 = zzqzArr[2]) == zzrd.zze) ? "" : zzjx.zzd(zzrd2);
        String str = "=";
        if (length > 3 && (zzrd = zzqzArr[3]) != zzrd.zze) {
            str = zzjx.zzd(zzrd);
        }
        HashSet hashSet = null;
        if (zzrd3 != zzrd.zze) {
            o.b(zzrd3 instanceof zzrk);
            if ("url".equals(zzrd3.zzc())) {
                i10 = 1;
            } else if (!"backslash".equals(zzrd3.zzc())) {
                return new zzrk("");
            } else {
                hashSet = new HashSet();
                zzb(hashSet, zzd);
                zzb(hashSet, str);
                hashSet.remove('\\');
            }
        } else {
            i10 = 0;
        }
        StringBuilder sb = new StringBuilder();
        if (zzrg instanceof zzrg) {
            for (zzqz zzqz : zzrg.zzk()) {
                if (!z9) {
                    sb.append(zzd);
                }
                sb.append(zzc(zzjx.zzd(zzqz), i10, hashSet));
                z9 = false;
            }
        } else if (zzrg instanceof zzrh) {
            Map zzi = ((zzrh) zzrg).zzi();
            for (String str2 : zzi.keySet()) {
                if (!z9) {
                    sb.append(zzd);
                }
                String zzd2 = zzjx.zzd((zzqz) zzi.get(str2));
                sb.append(zzc(str2, i10, hashSet));
                sb.append(str);
                sb.append(zzc(zzd2, i10, hashSet));
                z9 = false;
            }
        } else {
            sb.append(zzc(zzjx.zzd(zzrg), i10, hashSet));
        }
        return new zzrk(sb.toString());
    }
}
