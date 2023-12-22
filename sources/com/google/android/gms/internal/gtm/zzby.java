package com.google.android.gms.internal.gtm;

import android.content.Context;
import r3.o;

public final class zzby {
    private final Context zza;
    private final Context zzb;

    public zzby(Context context) {
        o.h(context);
        Context applicationContext = context.getApplicationContext();
        o.i(applicationContext, "Application context can't be null");
        this.zza = applicationContext;
        this.zzb = applicationContext;
    }

    public final Context zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzb;
    }
}
