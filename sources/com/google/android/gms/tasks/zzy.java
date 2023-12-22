package com.google.android.gms.tasks;

import l4.a;

public final /* synthetic */ class zzy implements OnCompleteListener {
    public final /* synthetic */ a zza;
    public final /* synthetic */ TaskCompletionSource zzb;
    public final /* synthetic */ zzb zzc;

    public /* synthetic */ zzy(a aVar, TaskCompletionSource taskCompletionSource, zzb zzb2) {
        this.zza = aVar;
        this.zzb = taskCompletionSource;
        this.zzc = zzb2;
    }

    public final void onComplete(Task task) {
        a aVar = this.zza;
        TaskCompletionSource taskCompletionSource = this.zzb;
        zzb zzb2 = this.zzc;
        aVar.removeCallbacksAndMessages((Object) null);
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
        } else if (task.isCanceled()) {
            zzb2.zza();
        } else {
            Exception exception = task.getException();
            exception.getClass();
            taskCompletionSource.trySetException(exception);
        }
    }
}
