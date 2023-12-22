package r3;

import android.os.IBinder;
import android.os.Parcel;

public final class l0 implements j {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f11613a;

    public l0(IBinder iBinder) {
        this.f11613a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f11613a;
    }

    public final void g(t0 t0Var, e eVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(t0Var);
            obtain.writeInt(1);
            a1.a(eVar, obtain, 0);
            this.f11613a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
