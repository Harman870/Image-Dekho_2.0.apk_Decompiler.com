package com.google.android.gms.internal.gtm;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import i3.t;

public final class zzch extends zzbu {
    private final zzax zza = new zzax();

    public zzch(zzbx zzbx) {
        super(zzbx);
    }

    public final zzax zza() {
        zzV();
        return this.zza;
    }

    public final void zzd() {
        t zzq = zzq();
        if (zzq.f7165d == null) {
            synchronized (zzq) {
                if (zzq.f7165d == null) {
                    zzax zzax = new zzax();
                    PackageManager packageManager = zzq.f7162a.getPackageManager();
                    String packageName = zzq.f7162a.getPackageName();
                    zzax.zzi(packageName);
                    zzax.zzj(packageManager.getInstallerPackageName(packageName));
                    String str = null;
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(zzq.f7162a.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (!TextUtils.isEmpty(applicationLabel)) {
                                packageName = applicationLabel.toString();
                            }
                            str = packageInfo.versionName;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        Log.e("GAv4", "Error retrieving package info: appName set to " + packageName);
                    }
                    zzax.zzk(packageName);
                    zzax.zzl(str);
                    zzq.f7165d = zzax;
                }
            }
        }
        zzq.f7165d.zzc(this.zza);
        zzfv zzB = zzB();
        zzB.zzV();
        String str2 = zzB.zzb;
        if (str2 != null) {
            this.zza.zzk(str2);
        }
        zzB.zzV();
        String str3 = zzB.zza;
        if (str3 != null) {
            this.zza.zzl(str3);
        }
    }
}
