package a7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class z implements Parcelable.Creator<y> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                b.n(readInt, parcel);
            } else {
                bundle = b.a(readInt, parcel);
            }
        }
        b.g(o10, parcel);
        return new y(bundle);
    }

    public final Object[] newArray(int i10) {
        return new y[i10];
    }
}
