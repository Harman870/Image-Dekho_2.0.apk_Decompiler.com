package p4;

import android.os.Parcel;
import android.os.Parcelable;
import r3.g0;
import s3.b;

public final class l implements Parcelable.Creator<k> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        o3.b bVar = null;
        int i10 = 0;
        g0 g0Var = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.j(readInt, parcel);
            } else if (c10 == 2) {
                bVar = (o3.b) b.b(parcel, readInt, o3.b.CREATOR);
            } else if (c10 != 3) {
                b.n(readInt, parcel);
            } else {
                g0Var = (g0) b.b(parcel, readInt, g0.CREATOR);
            }
        }
        b.g(o10, parcel);
        return new k(i10, bVar, g0Var);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new k[i10];
    }
}
