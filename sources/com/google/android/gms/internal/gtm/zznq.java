package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.PackageManager;
import r3.o;

public final class zznq implements zzjw {
    private final Context zza;

    public zznq(Context context) {
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
            PackageManager packageManager = this.zza.getPackageManager();
            return new zzrk(packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.zza.getPackageName(), 0)).toString());
        } catch (PackageManager.NameNotFoundException unused) {
            return new zzrk("");
        }
    }
}
