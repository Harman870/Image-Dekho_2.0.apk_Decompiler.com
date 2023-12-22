package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import r3.o;
import w3.b;

public abstract class zzpk {
    public final zzpt zza;
    public final zzpp zzb;
    public final b zzc;
    public final zzgu zzd;
    private final int zze;

    public zzpk(int i10, zzpt zzpt, zzpp zzpp, zzgu zzgu, b bVar) {
        o.h(zzpt);
        this.zza = zzpt;
        o.h(zzpt.zza());
        this.zze = i10;
        o.h(zzpp);
        this.zzb = zzpp;
        o.h(bVar);
        this.zzc = bVar;
        this.zzd = zzgu;
    }

    public abstract void zza(zzpv zzpv);

    public final void zzb(int i10, int i11) {
        zzgu zzgu = this.zzd;
        if (zzgu != null && i11 == 0 && i10 == 3) {
            zzgu.zzd();
        }
        String zzb2 = this.zza.zza().zzb();
        String str = i10 != 0 ? i10 != 1 ? i10 != 2 ? "Unknown reason" : "Server error" : "IOError" : "Resource not available";
        zzho.zzd("Failed to fetch the container resource for the container \"" + zzb2 + "\": " + str);
        zza(new zzpv(Status.f2807h, i11, (zzpu) null, (zzqs) null));
    }

    public final void zzc(byte[] bArr) {
        zzpv zzpv;
        zzpv zzpv2;
        Status status;
        try {
            zzpv = this.zzb.zza(bArr);
        } catch (zzpi unused) {
            zzho.zzc("Resource data is corrupted");
            zzpv = null;
        }
        zzgu zzgu = this.zzd;
        if (zzgu != null && this.zze == 0) {
            zzgu.zze();
        }
        if (zzpv == null || zzpv.getStatus() != (status = Status.f2805f)) {
            zzpv2 = new zzpv(Status.f2807h, this.zze, (zzpu) null, (zzqs) null);
        } else {
            zzpv2 = new zzpv(status, this.zze, new zzpu(this.zza.zza(), bArr, zzpv.zzb().zzc(), this.zzc.currentTimeMillis()), zzpv.zzc());
        }
        zza(zzpv2);
    }
}
