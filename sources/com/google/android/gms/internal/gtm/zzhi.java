package com.google.android.gms.internal.gtm;

import android.os.Parcel;

public abstract class zzhi extends zzav implements zzhj {
    public zzhi() {
        super("com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
    }

    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        boolean zzf = zzaw.zzf(parcel);
        String readString = parcel.readString();
        zzaw.zzc(parcel);
        zze(zzf, readString);
        return true;
    }
}
