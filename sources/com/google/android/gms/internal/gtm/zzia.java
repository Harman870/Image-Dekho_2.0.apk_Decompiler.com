package com.google.android.gms.internal.gtm;

import android.os.RemoteException;
import java.util.Map;

final class zzia implements zznh {
    public final /* synthetic */ zzic zza;

    public /* synthetic */ zzia(zzic zzic, zzhz zzhz) {
        this.zza = zzic;
    }

    public final Object zza(String str, Map map) {
        try {
            return this.zza.zze.zzb(str, map);
        } catch (RemoteException e10) {
            zzho.zza("Error calling customEvaluator proxy:".concat(String.valueOf(e10.getMessage())));
            return null;
        }
    }
}
