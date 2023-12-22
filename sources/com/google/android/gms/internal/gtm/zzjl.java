package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tagmanager.zzcf;
import com.google.android.gms.tagmanager.zzco;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import r3.o;

public final class zzjl extends zzhl {
    /* access modifiers changed from: private */
    public final Map zza = new HashMap(1);
    private final ExecutorService zzb;
    /* access modifiers changed from: private */
    public final zzgt zzc;
    private final zzco zzd;
    /* access modifiers changed from: private */
    public final Context zze;

    public zzjl(Context context, zzco zzco, zzcf zzcf) {
        zzgt zzgt = new zzgt(context, zzco, zzcf);
        ExecutorService zza2 = zzjn.zza(context);
        o.h(zzco);
        this.zzd = zzco;
        this.zzc = zzgt;
        this.zzb = zza2;
        this.zze = context;
    }

    public final void zze() {
        this.zzb.execute(new zzjk(this));
    }

    public final void zzf(String str, Bundle bundle, String str2, long j10, boolean z9) {
        this.zzb.execute(new zzjj(this, new zzgz(str, bundle, str2, new Date(j10), z9, this.zzd)));
    }

    public final void zzg(String str, String str2, String str3) {
        zzh(str, str2, str3, (zzhj) null);
    }

    public final void zzh(String str, String str2, String str3, zzhj zzhj) {
        this.zzb.execute(new zzji(this, str, str2, str3, zzhj));
    }

    public final void zzi() {
        this.zza.clear();
    }
}
