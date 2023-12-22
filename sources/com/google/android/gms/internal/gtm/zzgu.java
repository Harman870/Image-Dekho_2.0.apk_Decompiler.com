package com.google.android.gms.internal.gtm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Random;
import r3.o;

public final class zzgu {
    private final Context zza;
    private final Random zzb;
    private final String zzc;

    public zzgu(Context context, String str) {
        Random random = new Random();
        o.h(context);
        this.zza = context;
        o.h(str);
        this.zzc = str;
        this.zzb = random;
    }

    private final long zzg(long j10, long j11) {
        SharedPreferences zzh = zzh();
        long max = Math.max(0, zzh.getLong("FORBIDDEN_COUNT", 0));
        return (long) (this.zzb.nextFloat() * ((float) (j10 + ((long) ((((float) max) / ((float) ((max + Math.max(0, zzh.getLong("SUCCESSFUL_COUNT", 0))) + 1))) * ((float) (j11 - j10)))))));
    }

    private final SharedPreferences zzh() {
        return this.zza.getSharedPreferences("v5_gtmContainerRefreshPolicy_".concat(String.valueOf(this.zzc)), 0);
    }

    public final long zza() {
        if (Math.max(0, zzh().getLong("FORBIDDEN_COUNT", 0)) == 0) {
            return 0;
        }
        return zzg(10000, 600000) + 10000;
    }

    public final long zzb() {
        return zzg(7200000, 259200000) + 43200000;
    }

    public final long zzc() {
        return zzg(600000, 86400000) + 3600000;
    }

    @SuppressLint({"CommitPrefEdits"})
    public final void zzd() {
        SharedPreferences zzh = zzh();
        long j10 = zzh.getLong("FORBIDDEN_COUNT", 0);
        long j11 = zzh.getLong("SUCCESSFUL_COUNT", 0);
        SharedPreferences.Editor edit = zzh.edit();
        long min = j10 == 0 ? 3 : Math.min(10, j10 + 1);
        long max = Math.max(0, Math.min(j11, 10 - min));
        edit.putLong("FORBIDDEN_COUNT", min);
        edit.putLong("SUCCESSFUL_COUNT", max);
        edit.apply();
    }

    @SuppressLint({"CommitPrefEdits"})
    public final void zze() {
        SharedPreferences zzh = zzh();
        long j10 = zzh.getLong("SUCCESSFUL_COUNT", 0);
        long j11 = zzh.getLong("FORBIDDEN_COUNT", 0);
        long min = Math.min(10, j10 + 1);
        long max = Math.max(0, Math.min(j11, 10 - min));
        SharedPreferences.Editor edit = zzh.edit();
        edit.putLong("SUCCESSFUL_COUNT", min);
        edit.putLong("FORBIDDEN_COUNT", max);
        edit.apply();
    }

    public final boolean zzf() {
        return Math.max(0, zzh().getLong("FORBIDDEN_COUNT", 0)) > 0;
    }
}
