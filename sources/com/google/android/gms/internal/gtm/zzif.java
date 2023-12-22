package com.google.android.gms.internal.gtm;

import w3.b;
import y3.a;

final class zzif {
    private double zza = 60.0d;
    private long zzb;
    private final Object zzc = new Object();
    private final b zzd = a.P;

    public final boolean zza() {
        synchronized (this.zzc) {
            long currentTimeMillis = this.zzd.currentTimeMillis();
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
            zzho.zze("No more tokens available.");
            return false;
        }
    }
}
