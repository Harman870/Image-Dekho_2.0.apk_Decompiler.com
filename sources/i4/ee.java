package i4;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class ee implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        k kVar = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = b.c(readInt, parcel);
            } else if (c10 != 2) {
                b.n(readInt, parcel);
            } else {
                kVar = (k) b.b(parcel, readInt, k.CREATOR);
            }
        }
        b.g(o10, parcel);
        return new de(str, kVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new de[i10];
    }
}
