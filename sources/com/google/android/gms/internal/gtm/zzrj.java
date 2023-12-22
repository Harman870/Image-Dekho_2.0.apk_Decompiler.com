package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzrj implements Iterator {
    public final /* synthetic */ zzrk zza;
    private int zzb = 0;

    public zzrj(zzrk zzrk) {
        this.zza = zzrk;
    }

    public final boolean hasNext() {
        return this.zzb < this.zza.zzc.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.zzb < this.zza.zzc.length()) {
            int i10 = this.zzb;
            this.zzb = i10 + 1;
            return new zzrb(Double.valueOf((double) i10));
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
