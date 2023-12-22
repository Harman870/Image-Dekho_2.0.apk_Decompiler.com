package r3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import o3.d;
import s3.b;

public final class y0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        Bundle bundle = null;
        d dVar = null;
        int i10 = 0;
        d[] dVarArr = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                bundle = b.a(readInt, parcel);
            } else if (c10 == 2) {
                dVarArr = (d[]) b.e(parcel, readInt, d.CREATOR);
            } else if (c10 == 3) {
                i10 = b.j(readInt, parcel);
            } else if (c10 != 4) {
                b.n(readInt, parcel);
            } else {
                dVar = (d) b.b(parcel, readInt, d.CREATOR);
            }
        }
        b.g(o10, parcel);
        return new x0(bundle, dVarArr, i10, dVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new x0[i10];
    }
}
