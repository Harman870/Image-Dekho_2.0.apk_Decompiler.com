package com.google.android.gms.internal.gtm;

import androidx.fragment.app.w0;
import java.util.Iterator;
import javax.annotation.CheckForNull;

final class zzth extends zzsx {
    public final transient Object zza;

    public zzth(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.equals(obj);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzsy(this.zza);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        return w0.d("[", this.zza.toString(), "]");
    }

    public final int zza(Object[] objArr, int i10) {
        objArr[0] = this.zza;
        return 1;
    }

    public final zzti zzd() {
        return new zzsy(this.zza);
    }
}
