package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import v3.a;

public final class zzjq implements ServiceConnection {
    private final Context zza;
    private final a zzb;
    private volatile boolean zzc = false;
    private volatile boolean zzd = false;
    private zzhm zze;

    public zzjq(Context context, a aVar) {
        this.zza = context;
        this.zzb = aVar;
    }

    private static final void zzf(zzhj zzhj, String str) {
        try {
            zzhj.zze(false, str);
        } catch (RemoteException e10) {
            zzho.zzb("Error - local callback should not throw RemoteException", e10);
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzhm zzhm;
        synchronized (this) {
            if (iBinder == null) {
                zzhm = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.internal.ITagManagerService");
                zzhm = queryLocalInterface instanceof zzhm ? (zzhm) queryLocalInterface : new zzhk(iBinder);
            }
            this.zze = zzhm;
            this.zzc = true;
            this.zzd = false;
            notifyAll();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this) {
            this.zze = null;
            this.zzc = false;
            this.zzd = false;
        }
    }

    public final void zza() {
        if (zzd()) {
            try {
                this.zze.zze();
            } catch (RemoteException e10) {
                zzho.zzf("Error calling service to dispatch pending events", e10);
            }
        }
    }

    public final void zzb(String str, Bundle bundle, String str2, long j10, boolean z9) {
        if (zzd()) {
            try {
                this.zze.zzf(str, bundle, str2, j10, z9);
            } catch (RemoteException e10) {
                zzho.zzf("Error calling service to emit event", e10);
            }
        }
    }

    public final void zzc(String str, String str2, String str3, zzhj zzhj) {
        if (zzd()) {
            try {
                this.zze.zzh(str, str2, (String) null, zzhj);
            } catch (RemoteException e10) {
                zzho.zzf("Error calling service to load container", e10);
                zzf(zzhj, str);
            }
        } else {
            zzf(zzhj, str);
        }
    }

    public final boolean zzd() {
        if (this.zzc) {
            return true;
        }
        synchronized (this) {
            if (this.zzc) {
                return true;
            }
            if (!this.zzd) {
                Intent intent = new Intent("ignored");
                intent.setAction((String) null);
                intent.setClassName(this.zza.getPackageName(), "com.google.android.gms.tagmanager.TagManagerService");
                if (!this.zzb.a(this.zza, intent, this, 1)) {
                    return false;
                }
                this.zzd = true;
            }
            while (this.zzd) {
                try {
                    wait();
                    this.zzd = false;
                } catch (InterruptedException e10) {
                    zzho.zzf("Error connecting to TagManagerService", e10);
                    this.zzd = false;
                }
            }
            boolean z9 = this.zzc;
            return z9;
        }
    }

    public final boolean zze() {
        if (!zzd()) {
            return false;
        }
        try {
            this.zze.zzi();
            return true;
        } catch (RemoteException e10) {
            zzho.zzf("Error in resetting service", e10);
            return false;
        }
    }
}
