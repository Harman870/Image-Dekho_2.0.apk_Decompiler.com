package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.gtm.zzau;
import com.google.android.gms.internal.gtm.zzaw;

public final class zzcg extends zzau implements zzci {
    public zzcg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.IMeasurementEventListener");
    }

    public final void zze(String str, String str2, Bundle bundle, long j10) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaw.zzd(zza, bundle);
        zza.writeLong(j10);
        zzl(1, zza);
    }
}
