package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.tagmanager.zzcf;
import com.google.android.gms.tagmanager.zzco;

public final class zzid {
    private final Context zza;
    private final String zzb;
    private final zzco zzc;
    private final zzcf zzd;

    public zzid(Context context, zzco zzco, zzcf zzcf, String str) {
        this.zza = context.getApplicationContext();
        this.zzc = zzco;
        this.zzd = zzcf;
        this.zzb = str;
    }

    public final zzic zza(zzqj zzqj, zzqs zzqs) {
        return new zzic(this.zza, this.zzb, zzqj, zzqs, this.zzc, this.zzd);
    }
}
