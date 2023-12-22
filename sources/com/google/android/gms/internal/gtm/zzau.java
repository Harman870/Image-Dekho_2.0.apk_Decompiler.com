package com.google.android.gms.internal.gtm;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zzau implements IInterface {
    private final IBinder zza;
    private final String zzb;

    public zzau(IBinder iBinder, String str) {
        this.zza = iBinder;
        this.zzb = str;
    }

    public final IBinder asBinder() {
        return this.zza;
    }

    public final Parcel zza() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zzb);
        return obtain;
    }

    public final Parcel zzk(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.zza.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    public final void zzl(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.zza.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final void zzm(int i10, Parcel parcel) {
        try {
            this.zza.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
