package com.google.android.gms.tagmanager;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.gtm.zzau;
import com.google.android.gms.internal.gtm.zzaw;
import com.google.android.gms.internal.gtm.zzhl;
import com.google.android.gms.internal.gtm.zzhm;
import z3.a;

public final class zzcs extends zzau implements zzcu {
    public zzcs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.ITagManagerServiceProvider");
    }

    public final zzhm getService(a aVar, zzco zzco, zzcf zzcf) {
        Parcel zza = zza();
        zzaw.zze(zza, aVar);
        zzaw.zze(zza, zzco);
        zzaw.zze(zza, zzcf);
        Parcel zzk = zzk(1, zza);
        zzhm zzb = zzhl.zzb(zzk.readStrongBinder());
        zzk.recycle();
        return zzb;
    }
}
