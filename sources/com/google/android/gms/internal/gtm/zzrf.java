package com.google.android.gms.internal.gtm;

import java.util.Iterator;

final class zzrf implements Iterator {
    public final /* synthetic */ Iterator zza;
    public final /* synthetic */ Iterator zzb;

    public zzrf(zzrg zzrg, Iterator it, Iterator it2) {
        this.zza = it;
        this.zzb = it2;
    }

    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzb.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.zza.hasNext() ? ((zzre) this.zza).next() : (zzqz) this.zzb.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
