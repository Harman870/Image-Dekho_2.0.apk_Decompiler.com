package com.google.android.gms.internal.gtm;

public final class zzno extends zzjy {
    private final zzib zza;

    public zzno(zzib zzib) {
        this.zza = zzib;
    }

    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        zzrd zzrd;
        zzrk zzrk;
        zzrd zzrd2;
        int length = zzqzArr.length;
        if (length == 0 || zzqzArr[0] == (zzrd = zzrd.zze)) {
            return new zzrk("");
        }
        Object obj = this.zza.zza().zzd().get("_ldl");
        if (obj == null) {
            return new zzrk("");
        }
        zzqz zzb = zzrl.zzb(obj);
        if (!(zzb instanceof zzrk)) {
            return new zzrk("");
        }
        String zzk = ((zzrk) zzb).zzk();
        if (!zzhn.zza(zzk, "conv").equals(zzjx.zzd(zzqzArr[0]))) {
            return new zzrk("");
        }
        String str = null;
        if (length > 1 && (zzrd2 = zzqzArr[1]) != zzrd) {
            str = zzjx.zzd(zzrd2);
        }
        String zza2 = zzhn.zza(zzk, str);
        if (zza2 == null) {
            zzrk = new zzrk("");
        }
        return zzrk;
    }
}
