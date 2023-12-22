package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import r3.o;

final class zzgn implements Runnable, zzpl {
    public final /* synthetic */ zzgs zza;

    public /* synthetic */ zzgn(zzgs zzgs, zzgm zzgm) {
        this.zza = zzgs;
    }

    public final void run() {
        boolean z9 = true;
        if (this.zza.zzm != 1) {
            z9 = false;
        }
        o.k(z9);
        ArrayList arrayList = new ArrayList();
        this.zza.zzp = false;
        if (zzhv.zza().zze(this.zza.zzb)) {
            arrayList.add(0);
        } else {
            zzgs zzgs = this.zza;
            zzgs.zzp = zzgs.zzk.zzf();
            if (!this.zza.zzp) {
                arrayList.add(0);
                arrayList.add(1);
            } else {
                arrayList.add(1);
                arrayList.add(0);
            }
            arrayList.add(2);
        }
        zzgs zzgs2 = this.zza;
        zzgs2.zzf.zzc(zzgs2.zzb, zzgs2.zzd, zzgs2.zzc, arrayList, this, zzgs2.zzk);
    }

    public final void zza(zzpv zzpv) {
        if (zzpv.getStatus() == Status.f2805f) {
            zzgs zzgs = this.zza;
            zzgs.zzg.execute(new zzgr(zzgs, zzpv));
            return;
        }
        zzgs zzgs2 = this.zza;
        zzgs2.zzg.execute(new zzgl(zzgs2, (zzgk) null));
    }
}
