package h6;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class y implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j10 = 0;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = b.c(readInt, parcel);
            } else if (c10 == 2) {
                str2 = b.c(readInt, parcel);
            } else if (c10 == 3) {
                j10 = b.k(readInt, parcel);
            } else if (c10 != 4) {
                b.n(readInt, parcel);
            } else {
                str3 = b.c(readInt, parcel);
            }
        }
        b.g(o10, parcel);
        return new r(j10, str, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new r[i10];
    }
}
