package h6;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class e0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                b.n(readInt, parcel);
            } else {
                str = b.c(readInt, parcel);
            }
        }
        b.g(o10, parcel);
        return new d(str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
