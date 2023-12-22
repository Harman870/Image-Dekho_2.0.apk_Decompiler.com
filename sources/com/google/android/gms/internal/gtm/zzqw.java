package com.google.android.gms.internal.gtm;

import java.util.Iterator;

final class zzqw implements Iterator {
    public final /* synthetic */ Iterator zza;

    public zzqw(zzqz zzqz, Iterator it) {
        this.zza = it;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return new zzrk((String) this.zza.next());
    }

    public final void remove() {
        this.zza.remove();
    }
}
