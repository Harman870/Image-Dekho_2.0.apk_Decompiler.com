package com.google.android.gms.internal.gtm;

import android.content.SharedPreferences;
import android.util.Pair;
import java.util.UUID;
import r3.o;

public final class zzfi {
    public final /* synthetic */ zzfj zza;
    private final String zzb;
    private final long zzc;

    public /* synthetic */ zzfi(zzfj zzfj, String str, long j10, zzfh zzfh) {
        this.zza = zzfj;
        o.e("monitoring");
        o.b(j10 > 0);
        this.zzb = "monitoring";
        this.zzc = j10;
    }

    private final long zzd() {
        return this.zza.zza.getLong(zzf(), 0);
    }

    private final String zze() {
        return this.zzb.concat(":count");
    }

    private final String zzf() {
        return this.zzb.concat(":start");
    }

    private final void zzg() {
        long currentTimeMillis = this.zza.zzC().currentTimeMillis();
        SharedPreferences.Editor edit = this.zza.zza.edit();
        edit.remove(zze());
        edit.remove(zzb());
        edit.putLong(zzf(), currentTimeMillis);
        edit.commit();
    }

    public final Pair zza() {
        long zzd = zzd();
        long abs = zzd == 0 ? 0 : Math.abs(zzd - this.zza.zzC().currentTimeMillis());
        long j10 = this.zzc;
        if (abs < j10) {
            return null;
        }
        if (abs > j10 + j10) {
            zzg();
            return null;
        }
        String string = this.zza.zza.getString(zzb(), (String) null);
        long j11 = this.zza.zza.getLong(zze(), 0);
        zzg();
        if (string == null || j11 <= 0) {
            return null;
        }
        return new Pair(string, Long.valueOf(j11));
    }

    public final String zzb() {
        return this.zzb.concat(":value");
    }

    public final void zzc(String str) {
        if (zzd() == 0) {
            zzg();
        }
        if (str == null) {
            str = "";
        }
        synchronized (this) {
            long j10 = this.zza.zza.getLong(zze(), 0);
            if (j10 <= 0) {
                SharedPreferences.Editor edit = this.zza.zza.edit();
                edit.putString(zzb(), str);
                edit.putLong(zze(), 1);
                edit.apply();
                return;
            }
            long j11 = j10 + 1;
            SharedPreferences.Editor edit2 = this.zza.zza.edit();
            if ((UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE) < Long.MAX_VALUE / j11) {
                edit2.putString(zzb(), str);
            }
            edit2.putLong(zze(), j11);
            edit2.apply();
        }
    }
}
