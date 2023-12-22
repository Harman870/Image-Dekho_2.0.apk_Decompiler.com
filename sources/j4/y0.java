package j4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class y0 extends h0 implements a1 {
    public y0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final int a() {
        Parcel c10 = c(2, b());
        int readInt = c10.readInt();
        c10.recycle();
        return readInt;
    }

    public final void zze(String str, String str2, Bundle bundle, long j10) {
        Parcel b10 = b();
        b10.writeString(str);
        b10.writeString(str2);
        j0.c(b10, bundle);
        b10.writeLong(j10);
        d(1, b10);
    }
}
