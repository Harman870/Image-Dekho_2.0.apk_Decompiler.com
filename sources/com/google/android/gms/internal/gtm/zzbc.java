package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import i3.n;
import java.util.HashMap;

public final class zzbc extends n {
    public int zza;
    public int zzb;
    private String zzc;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("language", this.zzc);
        hashMap.put("screenColors", 0);
        hashMap.put("screenWidth", Integer.valueOf(this.zza));
        hashMap.put("screenHeight", Integer.valueOf(this.zzb));
        hashMap.put("viewportWidth", 0);
        hashMap.put("viewportHeight", 0);
        return n.zza(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzc(n nVar) {
        zzbc zzbc = (zzbc) nVar;
        int i10 = this.zza;
        if (i10 != 0) {
            zzbc.zza = i10;
        }
        int i11 = this.zzb;
        if (i11 != 0) {
            zzbc.zzb = i11;
        }
        if (!TextUtils.isEmpty(this.zzc)) {
            zzbc.zzc = this.zzc;
        }
    }

    public final String zzd() {
        return this.zzc;
    }

    public final void zze(String str) {
        this.zzc = str;
    }
}
