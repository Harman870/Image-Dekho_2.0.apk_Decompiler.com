package com.google.android.gms.internal.gtm;

import org.json.JSONArray;
import org.json.JSONException;
import r3.o;

public final class zznj extends zzjy {
    private final int zza;
    private final zzie zzb;

    public zznj(int i10, zzie zzie) {
        this.zza = i10;
        this.zzb = zzie;
    }

    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        boolean z9 = true;
        if (zzqzArr.length != 1) {
            z9 = false;
        }
        o.b(z9);
        o.b(zzqzArr[0] instanceof zzrk);
        try {
            zzjv zza2 = zzpj.zza(new JSONArray(zzqzArr[0].zzk()).getJSONArray(0));
            zza2.zzc(this.zzb);
            return this.zza == 0 ? zzrd.zze : zza2.zzd(zzie, new zzqz[0]);
        } catch (JSONException e10) {
            zzho.zzb("Unable to convert Custom Pixie to instruction", e10);
            return zzrd.zze;
        }
    }
}
