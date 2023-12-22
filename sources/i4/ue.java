package i4;

import android.os.Parcel;
import android.os.Parcelable;
import h6.b0;
import java.util.ArrayList;
import s3.b;

public final class ue implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        ArrayList<a> arrayList = null;
        b0 b0Var = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = b.c(readInt, parcel);
            } else if (c10 == 2) {
                arrayList = b.f(parcel, readInt, a.CREATOR);
            } else if (c10 != 3) {
                b.n(readInt, parcel);
            } else {
                b0Var = (b0) b.b(parcel, readInt, b0.CREATOR);
            }
        }
        b.g(o10, parcel);
        return new te(str, arrayList, b0Var);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new te[i10];
    }
}
