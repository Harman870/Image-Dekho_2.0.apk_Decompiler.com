package com.google.android.gms.internal.gtm;

public final class zzev {
    private final Object zzb;
    private final Object zzc;
    private final Object zzd = new Object();

    private zzev(Object obj, Object obj2, zzeu zzeu) {
        this.zzb = obj;
        this.zzc = obj2;
    }

    public static zzev zza(Object obj, Object obj2, zzeu zzeu) {
        return new zzev(obj, obj2, zzeu);
    }

    public final Object zzb() {
        synchronized (this.zzd) {
        }
        return this.zzb;
    }
}
