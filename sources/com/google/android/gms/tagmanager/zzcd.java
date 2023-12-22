package com.google.android.gms.tagmanager;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.gtm.zzau;
import java.util.Map;

public final class zzcd extends zzau implements zzcf {
    public zzcd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
    }

    public final String zzb(String str, Map map) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeMap(map);
        Parcel zzk = zzk(2, zza);
        String readString = zzk.readString();
        zzk.recycle();
        return readString;
    }

    public final void zzc(String str, Map map) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeMap(map);
        zzl(1, zza);
    }
}
