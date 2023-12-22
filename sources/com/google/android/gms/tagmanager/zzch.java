package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.gtm.zzav;
import com.google.android.gms.internal.gtm.zzaw;

public abstract class zzch extends zzav implements zzci {
    public zzch() {
        super("com.google.android.gms.tagmanager.IMeasurementEventListener");
    }

    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        long readLong = parcel.readLong();
        zzaw.zzc(parcel);
        zze(parcel.readString(), parcel.readString(), (Bundle) zzaw.zza(parcel, Bundle.CREATOR), readLong);
        parcel2.writeNoException();
        return true;
    }
}
