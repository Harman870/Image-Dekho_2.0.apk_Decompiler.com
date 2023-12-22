package com.google.android.gms.internal.gtm;

import android.content.Context;

public final class zzjc {
    private final Context zza;

    public zzjc(Context context) {
        this.zza = context;
    }

    public final String[] zza() {
        return this.zza.getAssets().list("");
    }

    public final String[] zzb(String str) {
        return this.zza.getAssets().list("containers");
    }
}
