package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.RemoteException;
import n4.h5;

final class zzbl implements h5 {
    public final /* synthetic */ zzci zza;

    public zzbl(zzbm zzbm, zzci zzci) {
        this.zza = zzci;
    }

    public final void onEvent(String str, String str2, Bundle bundle, long j10) {
        try {
            this.zza.zze(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
