package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import r3.o;

final class zzgq implements Runnable, zzpl {
    public final /* synthetic */ zzgs zza;

    public /* synthetic */ zzgq(zzgs zzgs, zzgp zzgp) {
        this.zza = zzgs;
    }

    public final void run() {
        o.k(this.zza.zzm == 2);
        if (!zzhv.zza().zze(this.zza.zzb)) {
            String zzi = this.zza.zzb;
            zzho.zzd("Refreshing container " + zzi + "...");
            ArrayList arrayList = new ArrayList();
            arrayList.add(0);
            zzgs zzgs = this.zza;
            zzgs.zzf.zzc(zzgs.zzb, zzgs.zzd, zzgs.zzc, arrayList, this, zzgs.zzk);
        }
    }

    public final void zza(zzpv zzpv) {
        if (zzpv.getStatus() == Status.f2805f) {
            String zzi = this.zza.zzb;
            zzho.zzd("Refreshed container " + zzi + ". Reinitializing runtime...");
            zzgs zzgs = this.zza;
            zzgs.zzg.execute(new zzgr(zzgs, zzpv));
            return;
        }
        zzgs zzgs2 = this.zza;
        zzgs.zzr(zzgs2, zzgs2.zzk.zzc());
    }
}
