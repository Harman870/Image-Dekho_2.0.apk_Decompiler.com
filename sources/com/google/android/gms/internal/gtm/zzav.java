package com.google.android.gms.internal.gtm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zzav extends Binder implements IInterface {
    public zzav(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        return zza(i10, parcel, parcel2, i11);
    }

    public boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }
}
