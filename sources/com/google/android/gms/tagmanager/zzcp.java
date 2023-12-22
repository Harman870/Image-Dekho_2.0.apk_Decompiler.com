package com.google.android.gms.tagmanager;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.gtm.zzau;
import com.google.android.gms.internal.gtm.zzaw;
import z3.a;

public final class zzcp extends zzau implements zzcr {
    public zzcp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.ITagManagerApi");
    }

    public final void initialize(a aVar, zzco zzco, zzcf zzcf) {
        Parcel zza = zza();
        zzaw.zze(zza, aVar);
        zzaw.zze(zza, zzco);
        zzaw.zze(zza, zzcf);
        zzl(1, zza);
    }

    public final void previewIntent(Intent intent, a aVar, a aVar2, zzco zzco, zzcf zzcf) {
        Parcel zza = zza();
        zzaw.zzd(zza, intent);
        zzaw.zze(zza, aVar);
        zzaw.zze(zza, aVar2);
        zzaw.zze(zza, zzco);
        zzaw.zze(zza, zzcf);
        zzl(3, zza);
    }
}
