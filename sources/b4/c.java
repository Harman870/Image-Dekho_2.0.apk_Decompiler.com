package b4;

import android.os.IBinder;
import android.os.Parcel;

public final class c extends a implements e {
    public c(IBinder iBinder) {
        super(iBinder);
    }

    public final boolean a() {
        boolean z9;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel b10 = b(6, obtain);
        int i10 = b.f2264a;
        if (b10.readInt() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        b10.recycle();
        return z9;
    }

    public final String zzc() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel b10 = b(1, obtain);
        String readString = b10.readString();
        b10.recycle();
        return readString;
    }

    public final boolean zze() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        int i10 = b.f2264a;
        boolean z9 = true;
        obtain.writeInt(1);
        Parcel b10 = b(2, obtain);
        if (b10.readInt() == 0) {
            z9 = false;
        }
        b10.recycle();
        return z9;
    }
}
