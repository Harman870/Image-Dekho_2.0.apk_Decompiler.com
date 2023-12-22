package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import javax.annotation.CheckForNull;

final class zztc extends zzsx {
    private final transient zzsw zza;
    private final transient zzst zzb;

    public zztc(zzsw zzsw, zzst zzst) {
        this.zza = zzsw;
        this.zzb = zzst;
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.get(obj) != null;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    public final int size() {
        return this.zza.size();
    }

    public final int zza(Object[] objArr, int i10) {
        return this.zzb.zza(objArr, 0);
    }

    public final zzti zzd() {
        return this.zzb.listIterator(0);
    }
}
