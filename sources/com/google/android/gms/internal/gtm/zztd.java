package com.google.android.gms.internal.gtm;

final class zztd extends zzst {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zztd(Object[] objArr, int i10, int i11) {
        this.zza = objArr;
        this.zzb = i10;
        this.zzc = i11;
    }

    public final Object get(int i10) {
        zzsl.zza(i10, this.zzc, "index");
        Object obj = this.zza[i10 + i10 + this.zzb];
        obj.getClass();
        return obj;
    }

    public final int size() {
        return this.zzc;
    }
}
