package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import javax.annotation.CheckForNull;

final class zztf extends zzsx {
    public static final zztf zza;
    private static final Object[] zzd;
    public final transient Object[] zzb;
    public final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zztf(objArr, 0, objArr, 0, 0);
    }

    public zztf(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.zzb = objArr;
        this.zze = i10;
        this.zzc = objArr2;
        this.zzf = i11;
        this.zzg = i12;
    }

    public final boolean contains(@CheckForNull Object obj) {
        Object[] objArr = this.zzc;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int zza2 = zzsp.zza(obj.hashCode());
        while (true) {
            int i10 = zza2 & this.zzf;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            zza2 = i10 + 1;
        }
    }

    public final int hashCode() {
        return this.zze;
    }

    public final /* synthetic */ Iterator iterator() {
        return zzg().listIterator(0);
    }

    public final int size() {
        return this.zzg;
    }

    public final int zza(Object[] objArr, int i10) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzg);
        return this.zzg;
    }

    public final int zzb() {
        return this.zzg;
    }

    public final int zzc() {
        return 0;
    }

    public final zzti zzd() {
        return zzg().listIterator(0);
    }

    public final Object[] zze() {
        return this.zzb;
    }

    public final zzst zzh() {
        return zzst.zzg(this.zzb, this.zzg);
    }

    public final boolean zzk() {
        return true;
    }
}
