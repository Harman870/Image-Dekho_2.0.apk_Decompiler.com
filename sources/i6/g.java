package i6;

import android.os.Parcel;
import android.os.Parcelable;
import h6.r;
import java.util.ArrayList;
import s3.b;

public final class g implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        String str2 = null;
        ArrayList<r> arrayList = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = b.c(readInt, parcel);
            } else if (c10 == 2) {
                str2 = b.c(readInt, parcel);
            } else if (c10 != 3) {
                b.n(readInt, parcel);
            } else {
                arrayList = b.f(parcel, readInt, r.CREATOR);
            }
        }
        b.g(o10, parcel);
        return new f(str, str2, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
