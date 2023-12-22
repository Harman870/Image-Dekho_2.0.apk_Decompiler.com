package r3;

import android.os.IBinder;
import android.os.Parcel;
import e4.a;
import z3.a;

public final class i1 extends a implements j0 {
    public i1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData", 1);
    }

    public final z3.a a() {
        Parcel b10 = b(1, c());
        z3.a E = a.C0177a.E(b10.readStrongBinder());
        b10.recycle();
        return E;
    }

    public final int zzc() {
        Parcel b10 = b(2, c());
        int readInt = b10.readInt();
        b10.recycle();
        return readInt;
    }
}
