package h6;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class d0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z9 = false;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = b.c(readInt, parcel);
            } else if (c10 == 2) {
                str2 = b.c(readInt, parcel);
            } else if (c10 == 3) {
                str3 = b.c(readInt, parcel);
            } else if (c10 == 4) {
                str4 = b.c(readInt, parcel);
            } else if (c10 != 5) {
                b.n(readInt, parcel);
            } else {
                z9 = b.h(readInt, parcel);
            }
        }
        b.g(o10, parcel);
        return new c(str, str2, str3, str4, z9);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
