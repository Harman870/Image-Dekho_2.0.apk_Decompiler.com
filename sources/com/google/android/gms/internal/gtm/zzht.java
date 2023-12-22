package com.google.android.gms.internal.gtm;

import android.content.DialogInterface;
import android.content.Intent;

final class zzht implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzhu zza;

    public zzht(zzhu zzhu) {
        this.zza = zzhu;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        String packageName = this.zza.zza.getPackageName();
        Intent launchIntentForPackage = this.zza.zza.getPackageManager().getLaunchIntentForPackage(packageName);
        String valueOf = String.valueOf(packageName);
        if (launchIntentForPackage != null) {
            zzho.zzc("Invoke the launch activity for package name: ".concat(valueOf));
            this.zza.zza.startActivity(launchIntentForPackage);
            return;
        }
        zzho.zze("No launch activity found for package name: ".concat(valueOf));
    }
}
