package com.google.android.gms.internal.gtm;

import android.net.Uri;
import java.util.Map;
import r3.o;

public final class zzpf extends zzjy {
    private final zzhc zza;

    public zzpf(zzhc zzhc) {
        this.zza = zzhc;
    }

    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        String str;
        int length = zzqzArr.length;
        boolean z9 = false;
        o.b(length > 0);
        zzqz zzqz = zzqzArr[0];
        o.b(!(zzqz instanceof zzrd));
        zzrd zzrd = length > 1 ? zzqzArr[1] : zzrd.zze;
        zzrd zzrd2 = zzrd.zze;
        o.b(zzrd == zzrd2 || (zzrd instanceof zzrg));
        zzrd zzrd3 = length > 2 ? zzqzArr[2] : zzrd2;
        if (zzrd3 == zzrd2 || !(zzrd3 instanceof zzrd)) {
            z9 = true;
        }
        o.b(z9);
        Uri.Builder buildUpon = Uri.parse(zzjx.zzd(zzqz)).buildUpon();
        if (zzrd != zzrd2) {
            for (zzqz zzqz2 : ((zzrg) zzrd).zzk()) {
                o.b(zzqz2 instanceof zzrh);
                for (Map.Entry entry : ((zzrh) zzqz2).zzi().entrySet()) {
                    buildUpon.appendQueryParameter(((String) entry.getKey()).toString(), zzjx.zzd(zzrl.zzc(zzie, (zzqz) entry.getValue())));
                }
            }
        }
        String uri = buildUpon.build().toString();
        zzrd zzrd4 = zzrd.zze;
        if (zzrd3 == zzrd4) {
            ((zzgx) this.zza).zzb(uri, (String) null, (String) null, (Map) null, (String) null);
            str = "SendPixel: url = ".concat(String.valueOf(uri));
        } else {
            String zzd = zzjx.zzd(zzrd3);
            ((zzgx) this.zza).zzb(uri, (String) null, zzd, (Map) null, (String) null);
            str = "SendPixel: url = " + uri + ", uniqueId = " + zzd;
        }
        zzho.zzd(str);
        return zzrd4;
    }
}
