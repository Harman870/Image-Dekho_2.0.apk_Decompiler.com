package com.google.android.gms.tasks;

import r3.o;

final class zzk implements Runnable {
    public final /* synthetic */ Task zza;
    public final /* synthetic */ zzl zzb;

    public zzk(zzl zzl, Task task) {
        this.zzb = zzl;
        this.zza = task;
    }

    public final void run() {
        synchronized (this.zzb.zzb) {
            zzl zzl = this.zzb;
            if (zzl.zzc != null) {
                OnFailureListener zza2 = zzl.zzc;
                Exception exception = this.zza.getException();
                o.h(exception);
                zza2.onFailure(exception);
            }
        }
    }
}
