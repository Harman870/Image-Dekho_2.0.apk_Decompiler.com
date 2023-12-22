package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import i3.n;
import java.util.HashMap;

public final class zzax extends n {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("appName", this.zza);
        hashMap.put("appVersion", this.zzb);
        hashMap.put("appId", this.zzc);
        hashMap.put("appInstallerId", this.zzd);
        return n.zza(hashMap);
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzd;
    }

    public final String zzf() {
        return this.zza;
    }

    public final String zzg() {
        return this.zzb;
    }

    /* renamed from: zzh */
    public final void zzc(zzax zzax) {
        if (!TextUtils.isEmpty(this.zza)) {
            zzax.zza = this.zza;
        }
        if (!TextUtils.isEmpty(this.zzb)) {
            zzax.zzb = this.zzb;
        }
        if (!TextUtils.isEmpty(this.zzc)) {
            zzax.zzc = this.zzc;
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            zzax.zzd = this.zzd;
        }
    }

    public final void zzi(String str) {
        this.zzc = str;
    }

    public final void zzj(String str) {
        this.zzd = str;
    }

    public final void zzk(String str) {
        this.zza = str;
    }

    public final void zzl(String str) {
        this.zzb = str;
    }
}
