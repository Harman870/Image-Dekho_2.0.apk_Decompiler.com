package com.google.android.gms.tagmanager;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.gtm.zzav;
import com.google.android.gms.internal.gtm.zzaw;
import com.google.android.gms.internal.gtm.zzhm;
import z3.a;

public abstract class zzct extends zzav implements zzcu {
    public zzct() {
        super("com.google.android.gms.tagmanager.ITagManagerServiceProvider");
    }

    public static zzcu asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.ITagManagerServiceProvider");
        return queryLocalInterface instanceof zzcu ? (zzcu) queryLocalInterface : new zzcs(iBinder);
    }

    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzco zzco;
        if (i10 != 1) {
            return false;
        }
        a E = a.C0177a.E(parcel.readStrongBinder());
        IBinder readStrongBinder = parcel.readStrongBinder();
        zzcf zzcf = null;
        if (readStrongBinder == null) {
            zzco = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.tagmanager.IMeasurementProxy");
            zzco = queryLocalInterface instanceof zzco ? (zzco) queryLocalInterface : new zzcm(readStrongBinder);
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
            zzcf = queryLocalInterface2 instanceof zzcf ? (zzcf) queryLocalInterface2 : new zzcd(readStrongBinder2);
        }
        zzaw.zzc(parcel);
        zzhm service = getService(E, zzco, zzcf);
        parcel2.writeNoException();
        zzaw.zze(parcel2, service);
        return true;
    }
}
