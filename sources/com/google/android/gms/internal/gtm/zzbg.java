package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import i3.n;
import java.util.HashMap;

public final class zzbg extends n {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private boolean zze;
    private boolean zzf;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("hitType", this.zza);
        hashMap.put("clientId", this.zzb);
        hashMap.put(DataKeys.USER_ID, this.zzc);
        hashMap.put("androidAdId", this.zzd);
        hashMap.put("AdTargetingEnabled", Boolean.valueOf(this.zze));
        hashMap.put("sessionControl", (Object) null);
        hashMap.put("nonInteraction", Boolean.valueOf(this.zzf));
        hashMap.put("sampleRate", Double.valueOf(0.0d));
        return n.zza(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzc(n nVar) {
        zzbg zzbg = (zzbg) nVar;
        if (!TextUtils.isEmpty(this.zza)) {
            zzbg.zza = this.zza;
        }
        if (!TextUtils.isEmpty(this.zzb)) {
            zzbg.zzb = this.zzb;
        }
        if (!TextUtils.isEmpty(this.zzc)) {
            zzbg.zzc = this.zzc;
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            zzbg.zzd = this.zzd;
        }
        if (this.zze) {
            zzbg.zze = true;
        }
        TextUtils.isEmpty((CharSequence) null);
        if (this.zzf) {
            zzbg.zzf = true;
        }
    }

    public final String zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zza;
    }

    public final String zzg() {
        return this.zzc;
    }

    public final void zzh(boolean z9) {
        this.zze = z9;
    }

    public final void zzi(String str) {
        this.zzd = str;
    }

    public final void zzj(String str) {
        this.zzb = str;
    }

    public final void zzk(String str) {
        this.zza = "data";
    }

    public final void zzl(boolean z9) {
        this.zzf = true;
    }

    public final void zzm(String str) {
        this.zzc = str;
    }

    public final boolean zzn() {
        return this.zze;
    }

    public final boolean zzo() {
        return this.zzf;
    }
}
