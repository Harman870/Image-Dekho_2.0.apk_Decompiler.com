package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.RemoteException;
import n4.g5;

final class zzbk implements g5 {
    public final /* synthetic */ zzcl zza;

    public zzbk(zzbm zzbm, zzcl zzcl) {
        this.zza = zzcl;
    }

    public final void interceptEvent(String str, String str2, Bundle bundle, long j10) {
        try {
            this.zza.zze(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
