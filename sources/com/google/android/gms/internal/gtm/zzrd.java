package com.google.android.gms.internal.gtm;

import r3.o;

public final class zzrd extends zzqz {
    public static final zzrd zzb = new zzrd("BREAK");
    public static final zzrd zzc = new zzrd("CONTINUE");
    public static final zzrd zzd = new zzrd("NULL");
    public static final zzrd zze = new zzrd("UNDEFINED");
    private final String zzf;
    private final boolean zzg;
    private final zzqz zzh;

    public zzrd(zzqz zzqz) {
        o.h(zzqz);
        this.zzf = "RETURN";
        this.zzg = true;
        this.zzh = zzqz;
    }

    private zzrd(String str) {
        this.zzf = str;
        this.zzg = false;
        this.zzh = null;
    }

    public final String toString() {
        return this.zzf;
    }

    public final /* synthetic */ Object zzc() {
        return this.zzh;
    }

    public final zzqz zzi() {
        return this.zzh;
    }

    public final boolean zzj() {
        return this.zzg;
    }
}
