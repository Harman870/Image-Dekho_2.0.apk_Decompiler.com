package e4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6185a;

    /* renamed from: b  reason: collision with root package name */
    public final IBinder f6186b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6187c;

    public /* synthetic */ a(IBinder iBinder, String str, int i10) {
        this.f6185a = i10;
        this.f6186b = iBinder;
        this.f6187c = str;
    }

    public final IBinder asBinder() {
        switch (this.f6185a) {
            case 0:
                return this.f6186b;
            default:
                return this.f6186b;
        }
    }

    public final Parcel b(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f6186b.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f6187c);
        return obtain;
    }
}
