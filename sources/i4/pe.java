package i4;

import android.os.Parcel;
import android.os.Parcelable;
import h6.q;
import s3.b;

public final class pe implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        q qVar = null;
        String str = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                qVar = (q) b.b(parcel, readInt, q.CREATOR);
            } else if (c10 != 2) {
                b.n(readInt, parcel);
            } else {
                str = b.c(readInt, parcel);
            }
        }
        b.g(o10, parcel);
        return new oe(qVar, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new oe[i10];
    }
}
