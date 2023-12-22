package i4;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class je implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        k kVar = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                b.n(readInt, parcel);
            } else {
                kVar = (k) b.b(parcel, readInt, k.CREATOR);
            }
        }
        b.g(o10, parcel);
        return new ie(kVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new ie[i10];
    }
}
