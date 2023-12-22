package com.google.android.gms.internal.gtm;

import java.util.AbstractMap;

final class zzta extends zzst {
    public final /* synthetic */ zztb zza;

    public zzta(zztb zztb) {
        this.zza = zztb;
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzsl.zza(i10, this.zza.zzc, "index");
        zztb zztb = this.zza;
        int i11 = i10 + i10;
        Object obj = zztb.zzb[i11];
        obj.getClass();
        Object obj2 = zztb.zzb[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.zza.zzc;
    }
}
