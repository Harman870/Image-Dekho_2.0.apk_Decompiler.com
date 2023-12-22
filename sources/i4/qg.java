package i4;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class qg implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        tg tgVar = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                b.n(readInt, parcel);
            } else {
                tgVar = (tg) b.b(parcel, readInt, tg.CREATOR);
            }
        }
        b.g(o10, parcel);
        return new pg(tgVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new pg[i10];
    }
}
