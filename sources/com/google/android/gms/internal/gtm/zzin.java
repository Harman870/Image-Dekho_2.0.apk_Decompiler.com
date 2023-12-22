package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.IntentFilter;

final class zzin extends zzig {
    /* access modifiers changed from: private */
    public static final Object zza = new Object();
    private static zzin zzb;
    /* access modifiers changed from: private */
    public Context zzc;
    /* access modifiers changed from: private */
    public zzhg zzd;
    private volatile zzhd zze;
    private boolean zzf = true;
    private boolean zzg = false;
    /* access modifiers changed from: private */
    public boolean zzh = false;
    /* access modifiers changed from: private */
    public boolean zzi = true;
    private zzij zzj;
    private zzhp zzk;
    private boolean zzl = false;
    private final zzih zzm = new zzih(this);

    private zzin() {
    }

    public static zzin zzf() {
        if (zzb == null) {
            zzb = new zzin();
        }
        return zzb;
    }

    /* access modifiers changed from: private */
    public final boolean zzn() {
        return this.zzl || !this.zzi;
    }

    public final synchronized void zza() {
        if (!zzn()) {
            this.zzj.zzb();
        }
    }

    public final synchronized void zzb(boolean z9) {
        zzk(this.zzl, z9);
    }

    public final synchronized zzhg zze() {
        if (this.zzd == null) {
            if (this.zzc != null) {
                this.zzd = new zzhs(this.zzm, this.zzc);
            } else {
                throw new IllegalStateException("Cant get a store unless we have a context");
            }
        }
        if (this.zzj == null) {
            zzim zzim = new zzim(this, (zzil) null);
            this.zzj = zzim;
            zzim.zzc(1800000);
        }
        this.zzg = true;
        if (this.zzf) {
            zzi();
            this.zzf = false;
        }
        if (this.zzk == null) {
            zzhp zzhp = new zzhp(this);
            this.zzk = zzhp;
            Context context = this.zzc;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            context.registerReceiver(zzhp, intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("com.google.analytics.RADIO_POWERED");
            intentFilter2.addCategory(context.getPackageName());
            context.registerReceiver(zzhp, intentFilter2);
        }
        return this.zzd;
    }

    public final synchronized void zzi() {
        if (!this.zzg) {
            zzho.zzd("Dispatch call queued. Dispatch will run once initialization is complete.");
            this.zzf = true;
        } else if (!this.zzh) {
            this.zzh = true;
            this.zze.zza(new zzii(this));
        }
    }

    public final synchronized void zzj(Context context, zzhd zzhd) {
        if (this.zzc == null) {
            this.zzc = context.getApplicationContext();
            if (this.zze == null) {
                this.zze = zzhd;
            }
        }
    }

    public final synchronized void zzk(boolean z9, boolean z10) {
        boolean zzn = zzn();
        this.zzl = z9;
        this.zzi = z10;
        if (zzn() == zzn) {
            return;
        }
        if (zzn()) {
            this.zzj.zza();
            zzho.zzd("PowerSaveMode initiated.");
            return;
        }
        this.zzj.zzc(1800000);
        zzho.zzd("PowerSaveMode terminated.");
    }
}
