package i6;

import android.os.Parcel;
import android.os.Parcelable;
import h6.r;
import java.util.ArrayList;
import s3.b;

public final class o implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        ArrayList<r> arrayList = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                b.n(readInt, parcel);
            } else {
                arrayList = b.f(parcel, readInt, r.CREATOR);
            }
        }
        b.g(o10, parcel);
        return new n(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new n[i10];
    }
}
