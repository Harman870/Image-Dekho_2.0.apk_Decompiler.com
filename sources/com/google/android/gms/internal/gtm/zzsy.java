package com.google.android.gms.internal.gtm;

import java.util.NoSuchElementException;

final class zzsy extends zzti {
    public boolean zza;
    public final /* synthetic */ Object zzb;

    public zzsy(Object obj) {
        this.zzb = obj;
    }

    public final boolean hasNext() {
        return !this.zza;
    }

    public final Object next() {
        if (!this.zza) {
            this.zza = true;
            return this.zzb;
        }
        throw new NoSuchElementException();
    }
}
