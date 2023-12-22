package com.google.android.gms.internal.gtm;

import java.util.HashMap;
import java.util.Map;
import r3.o;

public final class zzni extends zzjy {
    private final zznh zza;

    public zzni(zznh zznh) {
        this.zza = zznh;
    }

    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        zzrd zzrd;
        o.h(zzqzArr);
        int length = zzqzArr.length;
        o.b(length > 0);
        o.b(zzqzArr[0] instanceof zzrk);
        String zzk = zzqzArr[0].zzk();
        HashMap hashMap = new HashMap();
        if (length >= 2 && (zzrd = zzqzArr[1]) != zzrd.zze) {
            o.b(zzrd instanceof zzrh);
            for (Map.Entry entry : zzqzArr[1].zzi().entrySet()) {
                o.k(!(entry.getValue() instanceof zzri));
                o.k(!zzrl.zzi((zzqz) entry.getValue()));
                hashMap.put((String) entry.getKey(), ((zzqz) entry.getValue()).zzc());
            }
        }
        return zzrl.zzb(this.zza.zza(zzk, hashMap));
    }
}
