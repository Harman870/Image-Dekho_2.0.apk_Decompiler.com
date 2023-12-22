package r3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class h0 implements Parcelable.Creator<g0> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        IBinder iBinder = null;
        o3.b bVar = null;
        int i10 = 0;
        boolean z9 = false;
        boolean z10 = false;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.j(readInt, parcel);
            } else if (c10 == 2) {
                iBinder = b.i(readInt, parcel);
            } else if (c10 == 3) {
                bVar = (o3.b) b.b(parcel, readInt, o3.b.CREATOR);
            } else if (c10 == 4) {
                z9 = b.h(readInt, parcel);
            } else if (c10 != 5) {
                b.n(readInt, parcel);
            } else {
                z10 = b.h(readInt, parcel);
            }
        }
        b.g(o10, parcel);
        return new g0(i10, iBinder, bVar, z9, z10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new g0[i10];
    }
}
