package i6;

import android.os.Parcel;
import android.os.Parcelable;
import h6.b0;
import s3.b;

public final class d0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        h0 h0Var = null;
        a0 a0Var = null;
        b0 b0Var = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                h0Var = (h0) b.b(parcel, readInt, h0.CREATOR);
            } else if (c10 == 2) {
                a0Var = (a0) b.b(parcel, readInt, a0.CREATOR);
            } else if (c10 != 3) {
                b.n(readInt, parcel);
            } else {
                b0Var = (b0) b.b(parcel, readInt, b0.CREATOR);
            }
        }
        b.g(o10, parcel);
        return new c0(h0Var, a0Var, b0Var);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new c0[i10];
    }
}
