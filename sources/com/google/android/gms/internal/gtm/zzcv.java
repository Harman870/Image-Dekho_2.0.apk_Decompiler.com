package com.google.android.gms.internal.gtm;

import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import r3.o;
import w3.h;

public final class zzcv {
    private final zzbx zza;
    private volatile Boolean zzb;
    private String zzc;
    private Set zzd;

    public zzcv(zzbx zzbx) {
        o.h(zzbx);
        this.zza = zzbx;
    }

    public static final long zzc() {
        return ((Long) zzew.zzG.zzb()).longValue();
    }

    public static final long zzd() {
        return ((Long) zzew.zzm.zzb()).longValue();
    }

    public static final long zze() {
        return ((Long) zzew.zzj.zzb()).longValue();
    }

    public static final int zzf() {
        return ((Integer) zzew.zzy.zzb()).intValue();
    }

    public static final int zzg() {
        return ((Integer) zzew.zzp.zzb()).intValue();
    }

    public static final int zzh() {
        return ((Integer) zzew.zzo.zzb()).intValue();
    }

    public static final String zzi() {
        return (String) zzew.zzr.zzb();
    }

    public static final String zzj() {
        return (String) zzew.zzs.zzb();
    }

    public static final String zzk() {
        return (String) zzew.zzq.zzb();
    }

    public static final boolean zzl() {
        return ((Boolean) zzew.zzb.zzb()).booleanValue();
    }

    public final Set zza() {
        String str;
        String str2 = (String) zzew.zzB.zzb();
        if (this.zzd == null || (str = this.zzc) == null || !str.equals(str2)) {
            String[] split = TextUtils.split(str2, ",");
            HashSet hashSet = new HashSet();
            for (String parseInt : split) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(parseInt)));
                } catch (NumberFormatException unused) {
                }
            }
            this.zzc = str2;
            this.zzd = hashSet;
        }
        return this.zzd;
    }

    public final boolean zzb() {
        if (this.zzb == null) {
            synchronized (this) {
                if (this.zzb == null) {
                    ApplicationInfo applicationInfo = this.zza.zza().getApplicationInfo();
                    String a10 = h.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z9 = false;
                        if (str != null && str.equals(a10)) {
                            z9 = true;
                        }
                        this.zzb = Boolean.valueOf(z9);
                    }
                    if ((this.zzb == null || !this.zzb.booleanValue()) && "com.google.android.gms.analytics".equals(a10)) {
                        this.zzb = Boolean.TRUE;
                    }
                    if (this.zzb == null) {
                        this.zzb = Boolean.TRUE;
                        this.zza.zzm().zzI("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzb.booleanValue();
    }
}
