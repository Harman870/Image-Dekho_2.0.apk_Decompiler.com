package i4;

import android.os.Parcel;
import android.os.Parcelable;
import h6.c;
import s3.b;

public final class ne implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        c cVar = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                b.n(readInt, parcel);
            } else {
                cVar = (c) b.b(parcel, readInt, c.CREATOR);
            }
        }
        b.g(o10, parcel);
        return new me(cVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new me[i10];
    }
}
