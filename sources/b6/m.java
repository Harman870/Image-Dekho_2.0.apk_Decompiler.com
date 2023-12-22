package b6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import z5.i;
import z5.j;

public final class m implements o, IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f2293a;

    public m(IBinder iBinder) {
        this.f2293a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f2293a;
    }

    public final void o(Bundle bundle, i iVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        int i10 = j.f2290a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(iVar);
        try {
            this.f2293a.transact(3, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void x(Bundle bundle, j jVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        int i10 = j.f2290a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(jVar);
        try {
            this.f2293a.transact(2, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
