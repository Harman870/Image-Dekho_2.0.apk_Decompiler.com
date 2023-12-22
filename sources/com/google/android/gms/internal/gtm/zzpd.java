package com.google.android.gms.internal.gtm;

import com.ironsource.mediationsdk.config.VersionInfo;
import java.util.HashMap;
import java.util.Map;
import r3.o;

public final class zzpd extends zzjy {
    private static final zzsx zza = zzsx.zzj("GET", VersionInfo.GIT_BRANCH, "POST", "PUT");
    private final zzhc zzb;

    public zzpd(zzhc zzhc) {
        this.zzb = zzhc;
    }

    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        HashMap hashMap;
        o.b(zzqzArr.length == 1);
        o.b(zzqzArr[0] instanceof zzrh);
        zzqz zzb2 = zzqzArr[0].zzb("url");
        o.b(zzb2 instanceof zzrk);
        String zzk = ((zzrk) zzb2).zzk();
        Object zzb3 = zzqzArr[0].zzb("method");
        zzrd zzrd = zzrd.zze;
        if (zzb3 == zzrd) {
            zzb3 = new zzrk("GET");
        }
        o.b(zzb3 instanceof zzrk);
        String zzk2 = ((zzrk) zzb3).zzk();
        o.b(zza.contains(zzk2));
        zzqz zzb4 = zzqzArr[0].zzb("uniqueId");
        o.b(zzb4 == zzrd || zzb4 == zzrd.zzd || (zzb4 instanceof zzrk));
        String str = null;
        String zzk3 = (zzb4 == zzrd || zzb4 == zzrd.zzd) ? null : ((zzrk) zzb4).zzk();
        zzqz zzb5 = zzqzArr[0].zzb("headers");
        o.b(zzb5 == zzrd || (zzb5 instanceof zzrh));
        HashMap hashMap2 = new HashMap();
        if (zzb5 == zzrd) {
            hashMap = null;
        } else {
            for (Map.Entry entry : ((zzrh) zzb5).zzi().entrySet()) {
                String str2 = (String) entry.getKey();
                zzqz zzqz = (zzqz) entry.getValue();
                if (!(zzqz instanceof zzrk)) {
                    zzho.zze(String.format("Ignore the non-string value of header key %s.", new Object[]{str2}));
                } else {
                    hashMap2.put(str2, ((zzrk) zzqz).zzk());
                }
            }
            hashMap = hashMap2;
        }
        zzqz zzb6 = zzqzArr[0].zzb("body");
        zzrd zzrd2 = zzrd.zze;
        o.b(zzb6 == zzrd2 || (zzb6 instanceof zzrk));
        if (zzb6 != zzrd2) {
            str = ((zzrk) zzb6).zzk();
        }
        String str3 = str;
        if ((zzk2.equals("GET") || zzk2.equals(VersionInfo.GIT_BRANCH)) && str3 != null) {
            zzho.zze(String.format("Body of %s hit will be ignored: %s.", new Object[]{zzk2, str3}));
        }
        this.zzb.zzb(zzk, zzk2, zzk3, hashMap, str3);
        zzho.zzd(String.format("QueueRequest:\n  url = %s,\n  method = %s,\n  uniqueId = %s,\n  headers = %s,\n  body = %s", new Object[]{zzk, zzk2, zzk3, hashMap, str3}));
        return zzrd2;
    }
}
