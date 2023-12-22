package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.provider.Settings;
import r3.o;

public final class zzol implements zzjw {
    private final Context zza;

    public zzol(Context context) {
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
        String string = Settings.Secure.getString(this.zza.getContentResolver(), "android_id");
        return string != null ? new zzrk(string) : zzrd.zze;
    }
}
