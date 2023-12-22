package o3;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class n implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        long j10 = -1;
        int i10 = 0;
        String str = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = b.c(readInt, parcel);
            } else if (c10 == 2) {
                i10 = b.j(readInt, parcel);
            } else if (c10 != 3) {
                b.n(readInt, parcel);
            } else {
                j10 = b.k(readInt, parcel);
            }
        }
        b.g(o10, parcel);
        return new d(j10, i10, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
