package com.google.android.gms.tagmanager;

import android.os.Parcel;
import com.google.android.gms.internal.gtm.zzav;
import com.google.android.gms.internal.gtm.zzaw;
import java.util.HashMap;

public abstract class zzce extends zzav implements zzcf {
    public zzce() {
        super("com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
    }

    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            String readString = parcel.readString();
            HashMap zzb = zzaw.zzb(parcel);
            zzaw.zzc(parcel);
            zzc(readString, zzb);
            parcel2.writeNoException();
        } else if (i10 != 2) {
            return false;
        } else {
            String readString2 = parcel.readString();
            HashMap zzb2 = zzaw.zzb(parcel);
            zzaw.zzc(parcel);
            String zzb3 = zzb(readString2, zzb2);
            parcel2.writeNoException();
            parcel2.writeString(zzb3);
        }
        return true;
    }
}
