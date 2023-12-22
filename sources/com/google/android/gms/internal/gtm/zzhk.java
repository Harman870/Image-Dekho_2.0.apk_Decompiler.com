package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class zzhk extends zzau implements zzhm {
    public zzhk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.internal.ITagManagerService");
    }

    public final void zze() {
        zzl(102, zza());
    }

    public final void zzf(String str, Bundle bundle, String str2, long j10, boolean z9) {
        Parcel zza = zza();
        zza.writeString(str);
        zzaw.zzd(zza, bundle);
        zza.writeString(str2);
        zza.writeLong(j10);
        zza.writeInt(z9 ? 1 : 0);
        zzl(101, zza);
    }

    public final void zzh(String str, String str2, String str3, zzhj zzhj) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeString((String) null);
        zzaw.zze(zza, zzhj);
        zzl(2, zza);
    }

    public final void zzi() {
        zzl(3, zza());
    }
}
