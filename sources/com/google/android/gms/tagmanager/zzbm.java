package com.google.android.gms.tagmanager;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.Map;

final class zzbm extends zzcn {
    public final /* synthetic */ AppMeasurement zza;

    public zzbm(AppMeasurement appMeasurement) {
        this.zza = appMeasurement;
    }

    public final Map zzb() {
        return this.zza.f2837a.n();
    }

    public final void zzc(String str, String str2, Bundle bundle, long j10) {
        this.zza.f2837a.i(str, str2, bundle, j10);
    }

    public final void zzd(zzci zzci) {
        AppMeasurement appMeasurement = this.zza;
        appMeasurement.f2837a.m(new zzbl(this, zzci));
    }

    public final void zze(zzcl zzcl) {
        AppMeasurement appMeasurement = this.zza;
        appMeasurement.f2837a.g(new zzbk(this, zzcl));
    }
}
