package com.google.android.gms.internal.gtm;

import android.content.SharedPreferences;
import android.text.TextUtils;
import i3.t;

public final class zzfj extends zzbu {
    /* access modifiers changed from: private */
    public SharedPreferences zza;
    private long zzb;
    private long zzc = -1;
    private final zzfi zzd;

    public zzfj(zzbx zzbx) {
        super(zzbx);
        zzw();
        this.zzd = new zzfi(this, "monitoring", ((Long) zzew.zzP.zzb()).longValue(), (zzfh) null);
    }

    public final long zza() {
        t.a();
        zzV();
        long j10 = this.zzb;
        if (j10 != 0) {
            return j10;
        }
        long j11 = this.zza.getLong("first_run", 0);
        if (j11 != 0) {
            this.zzb = j11;
            return j11;
        }
        long currentTimeMillis = zzC().currentTimeMillis();
        SharedPreferences.Editor edit = this.zza.edit();
        edit.putLong("first_run", currentTimeMillis);
        if (!edit.commit()) {
            zzQ("Failed to commit first run time");
        }
        this.zzb = currentTimeMillis;
        return currentTimeMillis;
    }

    public final long zzb() {
        t.a();
        zzV();
        long j10 = this.zzc;
        if (j10 != -1) {
            return j10;
        }
        long j11 = this.zza.getLong("last_dispatch", 0);
        this.zzc = j11;
        return j11;
    }

    public final void zzd() {
        this.zza = zzo().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public final zzfi zze() {
        return this.zzd;
    }

    public final zzfq zzf() {
        return new zzfq(zzC(), zza());
    }

    public final String zzg() {
        t.a();
        zzV();
        String string = this.zza.getString("installation_campaign", (String) null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    public final void zzi() {
        t.a();
        zzV();
        long currentTimeMillis = zzC().currentTimeMillis();
        SharedPreferences.Editor edit = this.zza.edit();
        edit.putLong("last_dispatch", currentTimeMillis);
        edit.apply();
        this.zzc = currentTimeMillis;
    }
}
