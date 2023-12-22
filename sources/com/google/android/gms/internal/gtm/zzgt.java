package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.tagmanager.zzcf;
import com.google.android.gms.tagmanager.zzco;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import r3.o;
import y3.a;

public final class zzgt {
    private final Context zza;
    private final zzpo zzb;
    private final ExecutorService zzc;
    private final ScheduledExecutorService zzd;
    private final zzco zze;
    private final zzcf zzf;

    public zzgt(Context context, zzco zzco, zzcf zzcf) {
        zzpo zzpo = new zzpo(context);
        ExecutorService zza2 = zzjn.zza(context);
        ScheduledExecutorService zza3 = zzjp.zza;
        o.h(context);
        this.zza = context.getApplicationContext();
        o.h(zzco);
        this.zze = zzco;
        o.h(zzcf);
        this.zzf = zzcf;
        this.zzb = zzpo;
        o.h(zza2);
        this.zzc = zza2;
        o.h(zza3);
        this.zzd = zza3;
    }

    public final zzgs zza(String str, String str2, String str3) {
        zzid zzid = new zzid(this.zza, this.zze, this.zzf, str);
        zzgu zzgu = new zzgu(this.zza, str);
        return new zzgs(this.zza, str, str2, str3, zzid, this.zzb, this.zzc, this.zzd, this.zze, a.P, zzgu);
    }
}
