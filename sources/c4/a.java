package c4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a extends Binder implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2442a;

    public a(String str, int i10) {
        this.f2442a = i10;
        if (i10 == 1) {
            attachInterface(this, str);
        } else if (i10 != 2) {
            attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
        } else {
            attachInterface(this, str);
        }
    }

    private void d(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }

    public final IBinder asBinder() {
        return this;
    }

    public boolean b(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }

    public boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (this.f2442a) {
            case 0:
                d(i10, parcel, parcel2, i11);
                throw null;
            default:
                return false;
        }
    }

    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (this.f2442a) {
            case 0:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return c(i10, parcel, parcel2, i11);
            case 1:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return b(i10, parcel, parcel2, i11);
            default:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return c(i10, parcel, parcel2, i11);
        }
    }
}
