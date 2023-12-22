package i4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import s3.b;

public final class ug implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        ArrayList<rg> arrayList = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                b.n(readInt, parcel);
            } else {
                arrayList = b.f(parcel, readInt, rg.CREATOR);
            }
        }
        b.g(o10, parcel);
        return new tg(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new tg[i10];
    }
}
