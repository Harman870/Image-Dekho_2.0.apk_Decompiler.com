package com.google.android.gms.internal.gtm;

import android.util.DisplayMetrics;
import java.util.Locale;

public final class zzcz extends zzbu {
    public zzcz(zzbx zzbx) {
        super(zzbx);
    }

    public final zzbc zza() {
        zzV();
        DisplayMetrics displayMetrics = zzq().f7162a.getResources().getDisplayMetrics();
        zzbc zzbc = new zzbc();
        zzbc.zze(zzfu.zzd(Locale.getDefault()));
        zzbc.zza = displayMetrics.widthPixels;
        zzbc.zzb = displayMetrics.heightPixels;
        return zzbc;
    }

    public final String zzb() {
        zzV();
        zzbc zza = zza();
        int i10 = zza.zza;
        int i11 = zza.zzb;
        return i10 + "x" + i11;
    }

    public final void zzd() {
    }
}
