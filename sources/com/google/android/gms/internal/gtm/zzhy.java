package com.google.android.gms.internal.gtm;

import android.os.RemoteException;
import java.util.Map;

final class zzhy implements zznh {
    public final /* synthetic */ zzic zza;

    public /* synthetic */ zzhy(zzic zzic, zzhx zzhx) {
        this.zza = zzic;
    }

    public final Object zza(String str, Map map) {
        try {
            this.zza.zze.zzc(str, map);
            return null;
        } catch (RemoteException e10) {
            zzho.zza("Error calling customEvaluator proxy:".concat(String.valueOf(e10.getMessage())));
            return null;
        }
    }
}
