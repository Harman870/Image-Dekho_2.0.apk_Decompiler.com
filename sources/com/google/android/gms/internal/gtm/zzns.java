package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.PackageManager;
import r3.o;

public final class zzns implements zzjw {
    private final Context zza;

    public zzns(Context context) {
        o.h(context);
        this.zza = context;
    }

    public final zzqz zzd(zzie zzie, zzqz... zzqzArr) {
        boolean z9 = true;
        o.b(zzqzArr != null);
        if (zzqzArr.length != 0) {
            z9 = false;
        }
        o.b(z9);
        try {
            return new zzrk(this.zza.getPackageManager().getPackageInfo(this.zza.getPackageName(), 0).versionName);
        } catch (PackageManager.NameNotFoundException e10) {
            zzho.zza("Package name " + this.zza.getPackageName() + " not found. " + e10.toString());
            return zzrd.zze;
        }
    }
}
