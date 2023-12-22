package j4;

import android.os.Bundle;
import android.os.Parcel;

public abstract class w0 extends i0 implements x0 {
    public w0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public final boolean b(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        j0.b(parcel);
        ((q0) this).w((Bundle) j0.a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
