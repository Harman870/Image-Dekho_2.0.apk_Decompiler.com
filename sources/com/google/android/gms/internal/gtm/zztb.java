package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

final class zztb extends zzsx {
    private final transient zzsw zza;
    /* access modifiers changed from: private */
    public final transient Object[] zzb;
    /* access modifiers changed from: private */
    public final transient int zzc;

    public zztb(zzsw zzsw, Object[] objArr, int i10, int i11) {
        this.zza = zzsw;
        this.zzb = objArr;
        this.zzc = i11;
    }

    public final boolean contains(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.zza.get(key));
        }
    }

    public final /* synthetic */ Iterator iterator() {
        return zzg().listIterator(0);
    }

    public final int size() {
        return this.zzc;
    }

    public final int zza(Object[] objArr, int i10) {
        return zzg().zza(objArr, 0);
    }

    public final zzti zzd() {
        return zzg().listIterator(0);
    }

    public final zzst zzh() {
        return new zzta(this);
    }
}
