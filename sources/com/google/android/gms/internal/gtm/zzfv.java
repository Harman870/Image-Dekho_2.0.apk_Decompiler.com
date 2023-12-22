package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Locale;

public final class zzfv extends zzbu {
    public String zza;
    public String zzb;
    public boolean zzc;
    public int zzd;
    public boolean zze;
    public boolean zzf;

    public zzfv(zzbx zzbx) {
        super(zzbx);
    }

    public final String zza() {
        zzV();
        return this.zzb;
    }

    public final String zzb() {
        zzV();
        return this.zza;
    }

    public final boolean zzc() {
        zzV();
        return this.zzf;
    }

    public final void zzd() {
        ApplicationInfo applicationInfo;
        int i10;
        Context zzo = zzo();
        try {
            applicationInfo = zzo.getPackageManager().getApplicationInfo(zzo.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e10) {
            zzR("PackageManager doesn't know about the app package", e10);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            zzQ("Couldn't get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null && (i10 = bundle.getInt("com.google.android.gms.analytics.globalConfigResource")) > 0) {
            zzbx zzt = zzt();
            zzey zzey = (zzey) new zzcu(zzt, new zzex(zzt)).zza(i10);
            if (zzey != null) {
                zzN("Loading global XML config values");
                String str = zzey.zza;
                if (str != null) {
                    this.zzb = str;
                    zzF("XML config - app name", str);
                }
                String str2 = zzey.zzb;
                if (str2 != null) {
                    this.zza = str2;
                    zzF("XML config - app version", str2);
                }
                String str3 = zzey.zzc;
                boolean z9 = false;
                if (str3 != null) {
                    String lowerCase = str3.toLowerCase(Locale.US);
                    int i11 = "verbose".equals(lowerCase) ? 0 : "info".equals(lowerCase) ? 1 : "warning".equals(lowerCase) ? 2 : "error".equals(lowerCase) ? 3 : -1;
                    if (i11 >= 0) {
                        zzO("XML config - log level", Integer.valueOf(i11));
                    }
                }
                int i12 = zzey.zzd;
                if (i12 >= 0) {
                    this.zzd = i12;
                    this.zzc = true;
                    zzF("XML config - dispatch period (sec)", Integer.valueOf(i12));
                }
                int i13 = zzey.zze;
                if (i13 != -1) {
                    if (1 == i13) {
                        z9 = true;
                    }
                    this.zzf = z9;
                    this.zze = true;
                    zzF("XML config - dry run", Boolean.valueOf(z9));
                }
            }
        }
    }

    public final boolean zze() {
        zzV();
        return this.zze;
    }

    public final boolean zzf() {
        zzV();
        return false;
    }
}
