package o3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class d0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        boolean z9 = false;
        boolean z10 = false;
        IBinder iBinder = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = b.c(readInt, parcel);
            } else if (c10 == 2) {
                iBinder = b.i(readInt, parcel);
            } else if (c10 == 3) {
                z9 = b.h(readInt, parcel);
            } else if (c10 != 4) {
                b.n(readInt, parcel);
            } else {
                z10 = b.h(readInt, parcel);
            }
        }
        b.g(o10, parcel);
        return new c0(str, iBinder, z9, z10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new c0[i10];
    }
}
