package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.telephony.TelephonyManager;
import r3.o;

public final class zznt implements zzjw {
    private final Context zza;

    public zznt(Context context) {
        o.h(context);
        this.zza = context;
    }

    public final zzqz zzd(zzie zzie, zzqz... zzqzArr) {
        String networkOperatorName;
        boolean z9 = true;
        o.b(zzqzArr != null);
        if (zzqzArr.length != 0) {
            z9 = false;
        }
        o.b(z9);
        TelephonyManager telephonyManager = (TelephonyManager) this.zza.getSystemService("phone");
        zzrd zzrd = zzrd.zze;
        return (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null) ? zzrd : new zzrk(networkOperatorName);
    }
}
