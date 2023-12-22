package h6;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class w implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = b.c(readInt, parcel);
            } else if (c10 != 2) {
                b.n(readInt, parcel);
            } else {
                str2 = b.c(readInt, parcel);
            }
        }
        b.g(o10, parcel);
        return new n(str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new n[i10];
    }
}
