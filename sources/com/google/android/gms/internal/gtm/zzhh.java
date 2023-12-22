package com.google.android.gms.internal.gtm;

import android.os.IBinder;
import android.os.Parcel;

public final class zzhh extends zzau implements zzhj {
    public zzhh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
    }

    public final void zze(boolean z9, String str) {
        Parcel zza = zza();
        int i10 = zzaw.f2832a;
        zza.writeInt(z9 ? 1 : 0);
        zza.writeString(str);
        zzm(1, zza);
    }
}
