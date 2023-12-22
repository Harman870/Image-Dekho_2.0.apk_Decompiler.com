package j4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class v0 extends h0 implements x0 {
    public v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public final void w(Bundle bundle) {
        Parcel b10 = b();
        j0.c(b10, bundle);
        d(1, b10);
    }
}
