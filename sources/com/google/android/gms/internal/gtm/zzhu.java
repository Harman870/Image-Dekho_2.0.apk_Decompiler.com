package com.google.android.gms.internal.gtm;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tagmanager.impl.R$string;

public final class zzhu {
    /* access modifiers changed from: private */
    public final Context zza;
    private final Context zzb;
    private final Intent zzc;
    private final zzjh zzd;

    public zzhu(Intent intent, Context context, Context context2, zzjh zzjh) {
        this.zza = context;
        this.zzb = context2;
        this.zzc = intent;
        this.zzd = zzjh;
    }

    public final void zzb() {
        try {
            this.zzd.zzn(this.zzc.getData());
            String string = this.zzb.getResources().getString(R$string.tagmanager_preview_dialog_title);
            String string2 = this.zzb.getResources().getString(R$string.tagmanager_preview_dialog_message);
            String string3 = this.zzb.getResources().getString(R$string.tagmanager_preview_dialog_button);
            AlertDialog create = new AlertDialog.Builder(this.zza).create();
            create.setTitle(string);
            create.setMessage(string2);
            create.setButton(-1, string3, new zzht(this));
            create.show();
        } catch (Exception e10) {
            zzho.zza("Calling preview threw an exception: ".concat(String.valueOf(e10.getMessage())));
        }
    }
}
