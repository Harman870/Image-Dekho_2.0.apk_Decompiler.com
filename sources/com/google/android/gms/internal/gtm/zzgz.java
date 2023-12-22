package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.tagmanager.zzco;
import java.util.Date;
import java.util.Map;
import w3.b;

public final class zzgz implements b {
    private final Bundle zza;
    private final String zzb;
    private final Date zzc;
    private final String zzd;
    private Map zze;
    private boolean zzf;
    private final zzco zzg;

    public zzgz(String str, Bundle bundle, String str2, Date date, boolean z9, zzco zzco) {
        this.zzb = str;
        this.zza = bundle == null ? new Bundle() : bundle;
        this.zzc = date;
        this.zzd = str2;
        this.zzf = z9;
        this.zzg = zzco;
    }

    public final long currentTimeMillis() {
        return this.zzc.getTime();
    }

    public final long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    public final Bundle zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final Map zzd() {
        if (this.zze == null) {
            try {
                this.zze = this.zzg.zzb();
            } catch (RemoteException e10) {
                zzho.zza("Error calling measurement proxy:".concat(String.valueOf(e10.getMessage())));
            }
        }
        return this.zze;
    }

    public final void zze(boolean z9) {
        this.zzf = false;
    }

    public final boolean zzf() {
        return this.zzf;
    }
}
