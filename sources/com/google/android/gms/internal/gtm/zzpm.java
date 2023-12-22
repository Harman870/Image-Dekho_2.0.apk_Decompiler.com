package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import java.util.List;
import y3.a;

final class zzpm extends zzpk {
    public final /* synthetic */ zzpo zze;
    private final zzpl zzf;
    private final List zzg;
    private final int zzh;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzpm(zzpo zzpo, int i10, zzpt zzpt, zzpp zzpp, List list, int i11, zzpl zzpl, zzgu zzgu) {
        super(i10, zzpt, zzpp, zzgu, a.P);
        this.zze = zzpo;
        this.zzf = zzpl;
        this.zzg = list;
        this.zzh = i11;
    }

    public final void zza(zzpv zzpv) {
        if (zzpv.getStatus() == Status.f2805f) {
            zzho.zzd("Container resource successfully loaded from ".concat(zzpv.zzd()));
            if (zzpv.zza() == 0) {
                zzpu zzb = zzpv.zzb();
                if (!zzb.zzb().zzg()) {
                    this.zze.zzd(zzpv.getStatus(), zzb);
                    if (zzb.zzd() != null && zzb.zzd().length > 0) {
                        this.zze.zzc.zzg(zzb.zzb().zzd(), zzb.zzd());
                    }
                }
            }
            this.zzf.zza(zzpv);
            return;
        }
        String zzd = zzpv.zzd();
        String str = true != zzpv.getStatus().x() ? "FAILURE" : "SUCCESS";
        zzho.zzd("Cannot fetch a valid resource from " + zzd + ". Response status: " + str);
        if (zzpv.getStatus().x()) {
            zzho.zzd("Response source: ".concat(zzpv.zzd()));
            int length = zzpv.zzb().zzd().length;
            zzho.zzd("Response size: " + length);
        }
        this.zze.zzb(this.zza, this.zzg, this.zzh + 1, this.zzf, this.zzd);
    }
}
