package b4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f2263a;

    public a(IBinder iBinder) {
        this.f2263a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f2263a;
    }

    public final Parcel b(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f2263a.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }
}
