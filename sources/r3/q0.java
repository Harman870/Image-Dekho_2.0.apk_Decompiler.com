package r3;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class q0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        int i10 = 0;
        boolean z9 = false;
        boolean z10 = false;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.j(readInt, parcel);
            } else if (c10 == 2) {
                z9 = b.h(readInt, parcel);
            } else if (c10 == 3) {
                z10 = b.h(readInt, parcel);
            } else if (c10 == 4) {
                i11 = b.j(readInt, parcel);
            } else if (c10 != 5) {
                b.n(readInt, parcel);
            } else {
                i12 = b.j(readInt, parcel);
            }
        }
        b.g(o10, parcel);
        return new q(i10, z9, z10, i11, i12);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new q[i10];
    }
}
