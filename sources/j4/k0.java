package j4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class k0 extends h0 implements m0 {
    public k0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    public final Bundle z(Bundle bundle) {
        Parcel b10 = b();
        j0.c(b10, bundle);
        Parcel c10 = c(1, b10);
        Bundle bundle2 = (Bundle) j0.a(c10, Bundle.CREATOR);
        c10.recycle();
        return bundle2;
    }
}
