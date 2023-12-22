package com.google.android.gms.internal.gtm;

import androidx.fragment.app.w0;
import java.util.List;
import r3.o;

public final class zzll extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        boolean z9;
        if (zzqzArr.length == 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        o.b(z9);
        o.b(zzqzArr[1] instanceof zzrk);
        o.b(zzqzArr[2] instanceof zzrg);
        zzqz zzqz = zzqzArr[0];
        String zzk = zzqzArr[1].zzk();
        List zzk2 = zzqzArr[2].zzk();
        if (zzqz.zzh(zzk)) {
            zzqz zzb = zzqz.zzb(zzk);
            if (zzb instanceof zzrc) {
                return ((zzrc) zzb).zzi().zzd(zzie, (zzqz[]) zzk2.toArray(new zzqz[zzk2.size()]));
            }
            throw new IllegalArgumentException(w0.d("Apply TypeError: ", zzk, " is not a function"));
        } else if (zzqz.zzg(zzk)) {
            zzjw zza = zzqz.zza(zzk);
            zzk2.add(0, zzqz);
            return zza.zzd(zzie, (zzqz[]) zzk2.toArray(new zzqz[zzk2.size()]));
        } else {
            throw new IllegalArgumentException(w0.d("Apply TypeError: object has no ", zzk, " property"));
        }
    }
}
