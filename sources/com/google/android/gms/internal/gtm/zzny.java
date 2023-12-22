package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.provider.Settings;
import r3.o;

public final class zzny implements zzjw {
    private final Context zza;

    public zzny(Context context) {
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
        if (string == null) {
            string = "";
        }
        return new zzrk(string);
    }
}
