package p4;

import android.os.Parcel;
import android.os.Parcelable;
import r3.e0;
import s3.b;

public final class j implements Parcelable.Creator<i> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        int i10 = 0;
        e0 e0Var = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.j(readInt, parcel);
            } else if (c10 != 2) {
                b.n(readInt, parcel);
            } else {
                e0Var = (e0) b.b(parcel, readInt, e0.CREATOR);
            }
        }
        b.g(o10, parcel);
        return new i(i10, e0Var);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new i[i10];
    }
}
