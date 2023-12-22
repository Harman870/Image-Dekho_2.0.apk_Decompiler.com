package o3;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class b0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        boolean z9 = false;
        int i10 = 0;
        String str = null;
        int i11 = 0;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                z9 = b.h(readInt, parcel);
            } else if (c10 == 2) {
                str = b.c(readInt, parcel);
            } else if (c10 == 3) {
                i11 = b.j(readInt, parcel);
            } else if (c10 != 4) {
                b.n(readInt, parcel);
            } else {
                i10 = b.j(readInt, parcel);
            }
        }
        b.g(o10, parcel);
        return new a0(i11, i10, str, z9);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new a0[i10];
    }
}
