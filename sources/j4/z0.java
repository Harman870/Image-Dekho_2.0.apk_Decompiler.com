package j4;

import android.os.Bundle;
import android.os.Parcel;

public abstract class z0 extends i0 implements a1 {
    public z0() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final boolean b(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            long readLong = parcel.readLong();
            j0.b(parcel);
            zze(parcel.readString(), parcel.readString(), (Bundle) j0.a(parcel, Bundle.CREATOR), readLong);
            parcel2.writeNoException();
        } else if (i10 != 2) {
            return false;
        } else {
            int a10 = a();
            parcel2.writeNoException();
            parcel2.writeInt(a10);
        }
        return true;
    }
}
