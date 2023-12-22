package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.gtm.zzau;
import com.google.android.gms.internal.gtm.zzaw;
import java.util.HashMap;
import java.util.Map;

public final class zzcm extends zzau implements zzco {
    public zzcm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.IMeasurementProxy");
    }

    public final Map zzb() {
        Parcel zzk = zzk(11, zza());
        HashMap zzb = zzaw.zzb(zzk);
        zzk.recycle();
        return zzb;
    }

    public final void zzc(String str, String str2, Bundle bundle, long j10) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaw.zzd(zza, bundle);
        zza.writeLong(j10);
        zzl(2, zza);
    }

    public final void zzd(zzci zzci) {
        Parcel zza = zza();
        zzaw.zze(zza, zzci);
        zzl(22, zza);
    }

    public final void zze(zzcl zzcl) {
        Parcel zza = zza();
        zzaw.zze(zza, zzcl);
        zzl(21, zza);
    }
}
