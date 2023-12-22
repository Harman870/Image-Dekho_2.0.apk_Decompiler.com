package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzre implements Iterator {
    public final /* synthetic */ zzrg zza;
    private int zzb = 0;

    public zzre(zzrg zzrg) {
        this.zza = zzrg;
    }

    public final boolean hasNext() {
        for (int i10 = this.zzb; i10 < this.zza.zzc.size(); i10++) {
            if (this.zza.zzc.get(i10) != null) {
                return true;
            }
        }
        return false;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: zza */
    public final zzqz next() {
        if (this.zzb < this.zza.zzc.size()) {
            for (int i10 = this.zzb; i10 < this.zza.zzc.size(); i10++) {
                if (this.zza.zzc.get(i10) != null) {
                    this.zzb = i10;
                    int i11 = this.zzb;
                    this.zzb = i11 + 1;
                    return new zzrb(Double.valueOf((double) i11));
                }
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }
}
