package i4;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class xg implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        String str2 = null;
        Long l6 = null;
        String str3 = null;
        Long l10 = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                str = b.c(readInt, parcel);
            } else if (c10 == 3) {
                str2 = b.c(readInt, parcel);
            } else if (c10 == 4) {
                l6 = b.l(readInt, parcel);
            } else if (c10 == 5) {
                str3 = b.c(readInt, parcel);
            } else if (c10 != 6) {
                b.n(readInt, parcel);
            } else {
                l10 = b.l(readInt, parcel);
            }
        }
        b.g(o10, parcel);
        return new wg(str, str2, l6, str3, l10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new wg[i10];
    }
}
