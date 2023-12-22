package com.google.android.gms.internal.gtm;

import w3.b;

public final class zzfb {
    private double zza = 60.0d;
    private long zzb;
    private final Object zzc = new Object();
    private final String zzd = "tracking";
    private final b zze;

    public zzfb(int i10, long j10, String str, b bVar) {
        this.zze = bVar;
    }

    public final boolean zza() {
        synchronized (this.zzc) {
            long currentTimeMillis = this.zze.currentTimeMillis();
            double d10 = this.zza;
            if (d10 < 60.0d) {
                double d11 = ((double) (currentTimeMillis - this.zzb)) / 2000.0d;
                if (d11 > 0.0d) {
                    d10 = Math.min(60.0d, d10 + d11);
                    this.zza = d10;
                }
            }
            this.zzb = currentTimeMillis;
            if (d10 >= 1.0d) {
                this.zza = d10 - 4.0d;
                return true;
            }
            String str = this.zzd;
            zzfc.zze("Excessive " + str + " detected; call ignored.");
            return false;
        }
    }
}
