package j4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class h0 implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f8208a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8209b;

    public h0(IBinder iBinder, String str) {
        this.f8208a = iBinder;
        this.f8209b = str;
    }

    public final IBinder asBinder() {
        return this.f8208a;
    }

    public final Parcel b() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f8209b);
        return obtain;
    }

    public final Parcel c(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f8208a.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    public final void d(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f8208a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
