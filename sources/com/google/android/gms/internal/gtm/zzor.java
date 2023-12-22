package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import r3.o;

public final class zzor implements zzjw {
    private final Context zza;
    private final DisplayMetrics zzb = new DisplayMetrics();

    public zzor(Context context) {
        this.zza = context;
    }

    public final zzqz zzd(zzie zzie, zzqz... zzqzArr) {
        boolean z9 = true;
        o.b(zzqzArr != null);
        if (zzqzArr.length != 0) {
            z9 = false;
        }
        o.b(z9);
        ((WindowManager) this.zza.getSystemService("window")).getDefaultDisplay().getMetrics(this.zzb);
        return new zzrk(this.zzb.widthPixels + "x" + this.zzb.heightPixels);
    }
}
